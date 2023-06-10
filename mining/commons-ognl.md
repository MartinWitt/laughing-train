# commons-ognl 
 
# Bad smells
I found 159 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 36 | false |
| JavadocDeclaration | 15 | false |
| CommentedOutCode | 14 | false |
| UNCHECKED_WARNING | 12 | false |
| UnusedAssignment | 10 | false |
| SuspiciousSystemArraycopy | 8 | false |
| RedundantTypeArguments | 8 | false |
| DuplicateCondition | 8 | false |
| JavadocReference | 5 | false |
| StringOperationCanBeSimplified | 5 | false |
| DanglingJavadoc | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| SuspiciousMethodCalls | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| TrivialStringConcatenation | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| TrivialIf | 2 | false |
| OverwrittenKey | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| RedundantLengthCheck | 1 | false |
| ClassGetClass | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| CStyleArrayDeclaration | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| DuplicatedCode | 1 | false |
| MismatchedJavadocCode | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| IfStatementWithIdenticalBranches | 1 | false |
| RedundantCast | 1 | false |
| PointlessNullCheck | 1 | false |
| StringConcatenationInLoops | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/ognl/ASTSelect.java`
#### Snippet
```java
            if ( OgnlOps.booleanValue( expr.getValue( context, next ) ) )
            {
                answer.add( next );
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.ognl.internal.Entry\[\]' to 'org.apache.commons.ognl.internal.Entry,V\>\[\]'
in `src/main/java/org/apache/commons/ognl/internal/ClassCacheImpl.java`
#### Snippet
```java
    private static final int TABLE_SIZE_MASK = TABLE_SIZE - 1;

    private final Entry<Class<?>, V>[] table = new Entry[TABLE_SIZE];

    private ClassCacheInspector classInspector;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/ognl/ASTSelectFirst.java`
#### Snippet
```java
            if ( OgnlOps.booleanValue( expr.getValue( context, next ) ) )
            {
                answer.add( next );
                break;
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/ognl/ASTSelectLast.java`
#### Snippet
```java
            {
                answer.clear();
                answer.add( next );
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/ognl/ASTProject.java`
#### Snippet
```java
        {

            answer.add( expr.getValue( context, e.nextElement() ) );
        }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
        for ( int i = 0; i < jjtGetNumChildren(); ++i )
        {
            answer.add( children[i].getValue( context, source ) );
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                        if ( ( v1 instanceof Comparable ) && v1.getClass().isAssignableFrom( v2.getClass() ) )
                        {
                            result = ( (Comparable) v1 ).compareTo( v2 );
                            break;
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/org/apache/commons/ognl/ASTMap.java`
#### Snippet
```java
            Node k = kv.getKey(), v = kv.getValue();

            answer.put( k.getValue( context, source ), ( v == null ) ? null : v.getValue( context, source ) );
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/org/apache/commons/ognl/ASTCtor.java`
#### Snippet
```java
                        {

                            String literal = OgnlRuntime.getNumericLiteral( types[i] );
                            if ( literal != null )
                            {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/org/apache/commons/ognl/ASTCtor.java`
#### Snippet
```java
                        {
                            Array.set( result, i,
                                       converter.convertValue( context, null, null, null, o, componentClass ) );
                        }
                    }
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            if ( clazz.isEnum() )
            {
                return Enum.valueOf( (Class<? extends Enum>) clazz, fieldName );
            }
            Field field = clazz.getField( fieldName );
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            if ( clazz.isEnum() )
            {
                return Enum.valueOf( (Class<? extends Enum>) clazz, fieldName );
            }
            Field field = clazz.getField( fieldName );
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ClassPool`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

    /**
     * Gets either a new or existing {@link ClassPool} for use in compiling javassist classes. A new class path object
     * is inserted in to the returned {@link ClassPool} using the passed in <code>loader</code> instance if a new pool
     * needs to be created.
```

### JavadocReference
Cannot resolve symbol `ClassPool`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
    /**
     * Gets either a new or existing {@link ClassPool} for use in compiling javassist classes. A new class path object
     * is inserted in to the returned {@link ClassPool} using the passed in <code>loader</code> instance if a new pool
     * needs to be created.
     *
```

### JavadocReference
Cannot resolve symbol `ClassPool`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
     * @param loader The {@link ClassLoader} instance to use - as returned by
     *            {@link #getClassLoader(org.apache.commons.ognl.OgnlContext)}.
     * @return The existing or new {@link ClassPool} instance.
     */
    protected ClassPool getClassPool( OgnlContext context, EnhancedClassLoader loader )
```

### JavadocReference
Cannot resolve symbol `javassist.NotFoundException`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
     * @param searchClass The class to load.
     * @return The javassist class equivalent.
     * @throws javassist.NotFoundException When the class definition can't be found.
     */
    protected CtClass getCtClass( Class<?> searchClass )
```

### JavadocReference
Symbol `ognl.enhance.OgnlExpressionCompiler` is inaccessible from here
in `src/main/java/org/apache/commons/ognl/NodeType.java`
#### Snippet
```java

/**
 * Used by some of the {@link ognl.enhance.OgnlExpressionCompiler} logic to determine the object type of {@link Node}s
 * during expression evaluation.
 */
```

## RuleId[id=SuspiciousSystemArraycopy]
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
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
                    }

                    // System.out.println("astadd child class: " + _children[i].getClass().getName() +
                    // " and return expr: " + expr);

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
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
            return (Boolean) value;
        }
        // if ( c == String.class )
        // return ((String)value).length() > 0;

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
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                    }

                    // System.out.println("Astchain i: " + i + " currentobj : " + context.getCurrentObject() +
                    // " and root: " + context.getRoot());
                    if ( !(child instanceof ASTVarRef) && !constructor && !(
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
                int len = Array.getLength( target );

                switch ( ( (DynamicSubscript) name ).getFlag() )
                {
                    case DynamicSubscript.ALL:
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/ognl/BooleanExpression.java`
#### Snippet
```java
            Object value = getValueBody( context, target );

            if ( value != null && Boolean.class.isAssignableFrom( value.getClass() ) )
            {
                getterClass = Boolean.TYPE;
            }
            else if ( value != null )
            {
                getterClass = value.getClass();
            }
            else
            {
                getterClass = Boolean.TYPE;
            }
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

## RuleId[id=TrivialStringConcatenation]
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

## RuleId[id=UnnecessaryToStringCall]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/OgnlCache.java`
#### Snippet
```java

    private final ClassCache<List<Constructor<?>>> constructorCache =
        cacheFactory.createClassCache(key -> Arrays.<Constructor<?>>asList( key.getConstructors() ));

    private final Cache<DeclaredMethodCacheEntry, Map<String, List<Method>>> _methodCache =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( tree, createDefaultContext( root ), root, resultType );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( tree, context, root, null );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( expression, context, root, null );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( tree, root, null );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( parseExpression( expression ), root, resultType );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( parseExpression( expression ), context, root, resultType );
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
        throws OgnlException
    {
        return Ognl.<T> getValue( expression, root, null );
    }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'ConcurrentHashMap.contains()'
in `src/main/java/org/apache/commons/ognl/internal/ConcurrentHashMapCache.java`
#### Snippet
```java
    public boolean contains( K key )
    {
        return this.cache.contains( key );
    }
}
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java

        // FIXME: complexity is O(n)
        if ( RESERVED_KEYS.contains( key ) )
        {
            if ( CONTEXT_CONTEXT_KEY.equals( key ) || TRACE_EVALUATIONS_CONTEXT_KEY.equals( key )
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java

        // FIXME: complexity is O(n)
        if ( RESERVED_KEYS.contains( key ) )
        {
            if ( THIS_CONTEXT_KEY.equals( key ) )
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/ognl/internal/package-info.java`
#### Snippet
```java
 */

/**
 * Internal stuff only, users don't need to take this package in consideration.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/ognl/package-info.java`
#### Snippet
```java
 */

/**
 * OGNL stands for Object-Graph Navigation Language; it is an expression language
 * for getting and setting properties of Java objects. You use the same expression
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
            catch ( Exception ignored )
            {
                /** ignore */
            }
        }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
        catch ( NoSuchMethodException e )
        {
            /** ignore */
        }
    }
```

## RuleId[id=DuplicateCondition]
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/ognl/enhance/LocalReferenceImpl.java`
#### Snippet
```java
            return false;
        }
        if ( type != null ? !type.equals( that.type ) : that.type != null )
        {
            return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/ognl/ObjectIndexedPropertyDescriptor.java`
#### Snippet
```java
        }

        if (propertyType != null ? !propertyType.equals(that.propertyType) : that.propertyType != null)
        {
            return false;
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param propertyName a property name.
     * @return the PropertyDescriptor for the given targetClass and propertyName.
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @return the PropertyDescriptor for the given targetClass and propertyName.
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
    public static PropertyDescriptor getPropertyDescriptor( Class<?> targetClass, String propertyName )
```

### JavadocDeclaration
`@param targetClass` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java

    /**
     * @param targetClass
     * @param propertyName
     * @param findSets
```

### JavadocDeclaration
`@param propertyName` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    /**
     * @param targetClass
     * @param propertyName
     * @param findSets
     * @return Returns the list of (g)setter of a class for a given property name
```

### JavadocDeclaration
`@param findSets` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param targetClass
     * @param propertyName
     * @param findSets
     * @return Returns the list of (g)setter of a class for a given property name
     * @
```

### JavadocDeclaration
`@param method` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    /**
     * Permission will be named "invoke.<declaring-class>.<method-name>".
     * @param method
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * Permission will be named "invoke.<declaring-class>.<method-name>".
     * @param method
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param method
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Permission getPermission( Method method )
```

### JavadocDeclaration
`@param targetClass` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java

    /**
     * @param targetClass
     * @param staticMethods if true (false) returns only the (non-)static methods
     * @return Returns the map of methods for a given class
```

### JavadocDeclaration
`@param constructor` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    /**
     * Returns the parameter types of the given method.
     * @param constructor
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * Returns the parameter types of the given method.
     * @param constructor
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param constructor
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Class<?>[] getParameterTypes( Constructor<?> constructor )
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param name        Name of property
     * @return PropertyDescriptor of the named property or null if the class has no property with the given name
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @return PropertyDescriptor of the named property or null if the class has no property with the given name
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
    public static PropertyDescriptor getPropertyDescriptorFromArray( Class<?> targetClass, String name )
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param method    The method to find types for.
     * @return Array of parameter types for the given method.
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Class<?>[] findParameterTypes( Class<?> type, Method method )
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `ch` to `int` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                {

                    String hc = Integer.toString( (int) ch, 16 );
                    int hcl = hc.length();

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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isMethodAccessible()' call
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            Method method = getAppropriateMethod( context, source, target, propertyName, methods, args, actualArgs );

            if ( ( method == null ) || !isMethodAccessible( context, source, method, propertyName ) )
            {
                StringBuilder buffer = new StringBuilder();
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                        if ( context.get( ExpressionCompiler.PRE_CAST ) != null )
                        {
                            lastExpression = context.remove( ExpressionCompiler.PRE_CAST ) + lastExpression;
                        }
                    }
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
Variable `ret` initializer `""` is redundant
in `src/main/java/org/apache/commons/ognl/ASTInstanceof.java`
#### Snippet
```java
        {

            String ret = "";

            if (children[0] instanceof ASTConst)
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
Variable `allowPackageProtectedAccess` initializer `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    private boolean allowProtectedAccess = false;

    private boolean allowPackageProtectedAccess = false;

    /*
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
Value `result` is always 'true'
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
            }
        }
        return result;
    }

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

