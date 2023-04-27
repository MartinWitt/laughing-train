# commons-jelly 
 
# Bad smells
I found 1134 bad smells with 122 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 158 | false |
| RedundantFieldInitialization | 108 | false |
| ReturnNull | 104 | false |
| UnusedAssignment | 103 | false |
| DuplicateThrows | 69 | false |
| UNUSED_IMPORT | 59 | false |
| UnnecessaryModifier | 45 | true |
| ConstantValue | 37 | false |
| SizeReplaceableByIsEmpty | 30 | true |
| PublicFieldAccessedInSynchronizedContext | 29 | false |
| UnnecessaryBoxing | 25 | false |
| CommentedOutCode | 24 | false |
| ObsoleteCollection | 24 | false |
| DataFlowIssue | 24 | false |
| SystemOutErr | 22 | false |
| AssignmentToMethodParameter | 22 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 17 | false |
| NonProtectedConstructorInAbstractClass | 16 | true |
| StringEqualsEmptyString | 13 | false |
| ThrowablePrintStackTrace | 12 | false |
| ConditionCoveredByFurtherCondition | 11 | false |
| UnnecessaryUnboxing | 10 | false |
| NestedAssignment | 8 | false |
| ZeroLengthArrayInitialization | 8 | false |
| SynchronizeOnThis | 8 | false |
| CatchMayIgnoreException | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| NonFinalFieldOfException | 7 | false |
| UnnecessarySemicolon | 6 | false |
| Anonymous2MethodRef | 6 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 6 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| ObjectNotify | 4 | false |
| MissortedModifiers | 4 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| InstanceofCatchParameter | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| MissingDeprecatedAnnotation | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| RedundantArrayCreation | 3 | true |
| StringOperationCanBeSimplified | 3 | false |
| NonSerializableFieldInSerializableClass | 3 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 3 | false |
| Convert2Lambda | 3 | false |
| WhileCanBeForeach | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| BooleanConstructor | 2 | false |
| AnonymousHasLambdaAlternative | 2 | false |
| DuplicateCondition | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| TextLabelInSwitchStatement | 2 | false |
| IOResource | 2 | false |
| RedundantOperationOnEmptyContainer | 2 | false |
| MethodOverloadsParentMethod | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| UnnecessaryInitCause | 2 | false |
| CovariantEquals | 2 | false |
| WaitNotInLoop | 2 | false |
| PointlessBooleanExpression | 2 | true |
| EmptyStatementBody | 1 | false |
| UnnecessaryReturn | 1 | true |
| AbstractClassNeverImplemented | 1 | false |
| IgnoreResultOfCall | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| ClassInitializerMayBeStatic | 1 | false |
| EmptyMethod | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| BusyWait | 1 | false |
| AssignmentToCatchBlockParameter | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[paramTypes.size()\]'
in `core/src/main/java/org/apache/commons/jelly/tags/core/NewTag.java`
#### Snippet
```java
            } else {
                Object[] values = paramValues.toArray();
                Class[] types = (Class[])(paramTypes.toArray(new Class[paramTypes.size()]));
                object = ConstructorUtils.invokeConstructor(theClass,values,types);
                paramTypes.clear();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[paramTypes.size()\]'
in `core/src/main/java/org/apache/commons/jelly/tags/core/InvokeTag.java`
#### Snippet
```java

        Object[] values = paramValues.toArray();
        Class[] types = (Class[])(paramTypes.toArray(new Class[paramTypes.size()]));

        Object result = null;
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Class\[paramTypes.size()\]'
in `core/src/main/java/org/apache/commons/jelly/tags/core/InvokeStaticTag.java`
#### Snippet
```java

            Object[] values = paramValues.toArray();
            Class[] types = (Class[])(paramTypes.toArray(new Class[paramTypes.size()]));
            Method method = loadClass().getMethod( methodName, types );
            Object result = method.invoke( null, values );
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new DynaProperty\[propList.size()\]'
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynaclassTag.java`
#### Snippet
```java
        // Convert the list of properties into array
        props =
            (DynaProperty[]) propList.toArray(
                new DynaProperty[propList.size()]);

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Script.java`
#### Snippet
```java
     * representation of the script to be used.
     */
    public Script compile() throws JellyException;

    /** Evaluates the body of a tag */
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Script.java`
#### Snippet
```java

    /** Evaluates the body of a tag */
    public void run(JellyContext context, XMLOutput output) throws JellyTagException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * @return the body of the tag
     */
    public Script getBody();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * A helper method to invoke this tags body
     */
    public void invokeBody(XMLOutput output) throws JellyTagException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Sets the body of the tag
     */
    public void setBody(Script body);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * @param tagLibrary
     */
    public void setTagLib(TagLibrary tagLibrary);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Sets the parent of this tag
     */
    public void setParent(Tag parent);
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * @return
     */
    public TagLibrary getTagLib();
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Evaluates this tag after all the tags properties have been initialized.
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * @return the parent of this tag
     */
    public Tag getParent();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Gets the context in which the tag will be run
     */
    public JellyContext getContext();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Sets the context in which the tag will be run
     */
    public void setContext(JellyContext context) throws JellyTagException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/DynaTag.java`
#### Snippet
```java
    /** Sets an attribute value of this tag before the tag is invoked
     */
    public void setAttribute(String name, Object value) throws JellyTagException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/DynaTag.java`
#### Snippet
```java
     * be evaluated and just passed in as the attribute value.
     */
    public Class getAttributeType(String name) throws JellyTagException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/NamespaceAwareTag.java`
#### Snippet
```java
     * prefixes and the values are the namespace URIs
     */
    public void setNamespaceContext(Map prefixToUriMap);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/impl/TagFactory.java`
#### Snippet
```java
     * Creates a Tag for the given local name and the SAX attributes
     */
    public Tag createTag(String name, Attributes attributes) throws JellyException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/impl/CollectionTag.java`
#### Snippet
```java
     * @throws JellyTagException Thrown when the recevier cannot add the item.
     */
    public void addItem(Object value) throws JellyTagException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/impl/TagLibraryResolver.java`
#### Snippet
```java
     * so that the namespace URI should be treated as just vanilla XML.
     */
    public TagLibrary resolveTagLibrary(String uri);
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/impl/BeanSource.java`
#### Snippet
```java
     * @return the bean to which this tag is associated
     */
    public Object getBean() throws JellyTagException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTagParent.java`
#### Snippet
```java
  */
public interface ArgTagParent {
    public void addArgument(Class type, Object value);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathSource.java`
#### Snippet
```java
public interface XPathSource {

    public Object getXPathSource();

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * coercing the result to be an Iterator.
     */
    public Iterator evaluateAsIterator(JellyContext context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * coercing the result to be a boolean.
     */
    public boolean evaluateAsBoolean(JellyContext context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * coercing the result to be a String.
     */
    public String evaluateAsString(JellyContext context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * @return the textual representation of this expression
     */
    public String getExpressionText();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * actual underlying value object.
     */
    public Object evaluateRecurse(JellyContext context);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/Expression.java`
#### Snippet
```java
     * and returns the result
     */
    public Object evaluate(JellyContext context);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `core/src/main/java/org/apache/commons/jelly/expression/ExpressionFactory.java`
#### Snippet
```java
     */

    public Expression createExpression(String text) throws JellyException;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ContainerTag.java`
#### Snippet
```java
     * If the constraints are null they are ignored
     */
    public void addChild(Component component, Object constraints) throws JellyTagException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/TaskSource.java`
#### Snippet
```java
     * @return the Ant object which may be an Ant Task or nested element
     */
    public Object getTaskObject() throws JellyTagException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/TaskSource.java`
#### Snippet
```java
     * Allows nested tags to set a property on the task object of this tag
     */
    public void setTaskProperty(String name, Object value) throws JellyTagException;
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @throws Exception if the script raises some kind of exception while processing
     */
    public Map runScript( String url, Map params ) throws Exception;

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @throws Exception if the script raises some kind of exception while processing
     */
    public Map runScript( String url, Map params, OutputStream out ) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @throws Exception if the script raises some kind of exception while processing
     */
    public Map runNamedScript( String name, Map params, XMLOutput output ) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @throws Exception if the script raises some kind of exception while processing
     */
    public Map runNamedScript( String name, Map params ) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @throws Exception if the script raises some kind of exception while processing
     */
    public Map runNamedScript( String name, Map params, OutputStream out ) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
     * @return All of the variables from the JellyContext
     */
    public Map runScript( String url, Map params, XMLOutput output ) throws Exception;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/SQLExecutionTag.java`
#### Snippet
```java
     * @param value PreparedStatement parameter value
     */
    public void addSQLParameter(Object value);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/Result.java`
#### Snippet
```java
     * @return the number of rows in the result
     */
    public int getRowCount();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/Result.java`
#### Snippet
```java
     * row setting
     */
    public boolean isLimitedByMaxRows();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/Result.java`
#### Snippet
```java
     * @return the column names as an array of <code>String</code> objects
     */
    public String[] getColumnNames();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/Result.java`
#### Snippet
```java
     * @return the result rows as an array of <code>SortedMap</code> objects
     */
    public SortedMap[] getRows();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/Result.java`
#### Snippet
```java
     * @return the result rows as an array of <code>Object[]</code> objects
     */
    public Object[][] getRowsByIndex();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/ConsumerTag.java`
#### Snippet
```java
     * Sets the JMS messageListener used to consume JMS messages
     */
    public void setMessageListener(MessageListener messageListener);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/ConnectionContext.java`
#### Snippet
```java
public interface ConnectionContext {

    public Messenger getConnection() throws JellyTagException, JMSException;
}

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/JellyBeanTag.java`
#### Snippet
```java
                emptyParamTypes);

        if ( invokeMethod == null ) {
        }
        return invokeMethod;
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ForEachTag.java`
#### Snippet
```java

            Iterator iter = nodes.iterator();
            while (iter.hasNext()) {
                iterationValue = iter.next();
                if (var != null) {
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                = (CompositeExpression) expression;
            Iterator iter = compositeExpression.getExpressions().iterator();
            while (iter.hasNext()) {
                addExpressionScript( newBlock, (Expression) iter.next() );
            }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `jellyProperties` from instance context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
    protected synchronized Properties getJellyProperties() {
        if (jellyProperties == null) {
            jellyProperties = new Properties();

            InputStream in = null;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `factory` from instance context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            try {
                if (factory == null) {
                    factory = SAXParserFactory.newInstance();
                }
                factory.setNamespaceAware(true);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `_logSink` from instance context
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JettyHttpServerTag.java`
#### Snippet
```java
        // setup a log for Jetty with a default filename
        try {
            _logSink = new OutputStreamLogSink(DEFAULT_LOG_FILE);
            //_logSink.start();
            Log.instance().add(_logSink);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `threadNumber` from instance context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java
            thread.setName(name);
        } else {
            thread.setName("Jelly Thread #" + (threadNumber++));
        }

```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `ch`
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @throws SAXException The application may raise an exception.
     */
    public void comment(char ch[], int start, int length) throws SAXException {
        if (lexicalHandler != null) {
            lexicalHandler.comment(ch, start, length);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `buffer`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * @throws SAXException if a parsing error is to be reported
     */
    public void ignorableWhitespace(char buffer[], int start, int len)
        throws SAXException {
        ; // No processing required
```

### CStyleArrayDeclaration
C-style array declaration of parameter `buffer`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * @throws SAXException if a parsing error is to be reported
     */
    public void characters(char buffer[], int start, int length)
        throws SAXException {
        textBuffer.append(buffer, start, length);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `core/src/main/java/org/apache/commons/jelly/impl/ScriptBlock.java`
#### Snippet
```java
    /** Evaluates the body of a tag */
    public void run(JellyContext context, XMLOutput output) throws JellyTagException {
/*
        for (int i = 0, size = scripts.length; i < size; i++) {
            Script script = scripts[i];
```

### CommentedOutCode
Commented out code (15 lines)
in `core/src/main/java/org/apache/commons/jelly/impl/DefaultTagLibraryResolver.java`
#### Snippet
```java
        log.info( "Looking up service name: " + name );

/*
        ClassLoaders loaders = ClassLoaders.getAppLoaders(TagLibrary.class, getClass(), false);

```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/ojb/src/main/java/org/apache/commons/jelly/tags/ojb/OjbTagLibrary.java`
#### Snippet
```java
        registerTag("broker", BrokerTag.class);
        registerTag("store", StoreTag.class);
        //registerTag("delete", DeleteTag.class);
        //registerTag("query", QueryTag.class);
        //registerTag("transaction", TransactionTag.class);
```

### CommentedOutCode
Commented out code (8 lines)
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    public Expression createExpression(String text) throws JellyException {
/*

        org.apache.commons.jexl.Expression expr =
```

### CommentedOutCode
Commented out code (6 lines)
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                                attributeName,
                                attributeValue);
//                        Expression expression =
//                            taglib.createExpression(
//                                getExpressionFactory(),
```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                String attributeValue = list.getValue(i);
                Expression expression = createExpression(script, null, attributeValue);
//                Expression expression = CompositeExpression.parse(
//                        attributeValue, getExpressionFactory()
//                    );
```

### CommentedOutCode
Commented out code (14 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * variable, or null if it is not defined.
     */
//    public static Object get(JellyContext jc, String name, int scope) {
//        switch (scope) {
//            case JellyContext.PAGE_SCOPE:
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * variable, or null if it is not defined.
     */
//    public static Object get(ServletRequest request, String name) {
//        return request.getAttribute(name + REQUEST_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * variable, or null if it is not defined.
     */
//    public static Object get(HttpSession session, String name) {
//        return session.getAttribute(name + SESSION_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * variable, or null if it is not defined.
     */
//    public static Object get(ServletContext context, String name) {
//        return context.getAttribute(name + APPLICATION_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (19 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param scope Scope in which the configuration variable is to be set
     */
//    public static void set(JellyContext jc, String name, Object value,
//    int scope) {
//        switch (scope) {
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param value Configuration variable value
     */
//    public static void set(ServletRequest request, String name, Object value) {
//        request.setAttribute(name + REQUEST_SCOPE_SUFFIX, value);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param value Configuration variable value
     */
//    public static void set(HttpSession session, String name, Object value) {
//        session.setAttribute(name + SESSION_SCOPE_SUFFIX, value);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param value Configuration variable value
     */
//    public static void set(ServletContext context, String name, Object value) {
//        context.setAttribute(name + APPLICATION_SCOPE_SUFFIX, value);
//    }
```

### CommentedOutCode
Commented out code (18 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * removed
     */
//    public static void remove(JellyContext jc, String name, int scope) {
//        switch (scope) {
//            case JellyContext.PAGE_SCOPE:
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param name Configuration variable name
     */
//    public static void remove(ServletRequest request, String name) {
//        request.removeAttribute(name + REQUEST_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param name Configuration variable name
     */
//    public static void remove(HttpSession session, String name) {
//        session.removeAttribute(name + SESSION_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * @param name Configuration variable name
     */
//    public static void remove(ServletContext context, String name) {
//        context.removeAttribute(name + APPLICATION_SCOPE_SUFFIX);
//    }
```

### CommentedOutCode
Commented out code (20 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
     * setting identified by <tt>name</tt>, or null if it is not defined.
     */
//    public static Object find(JellyContext jc, String name) {
//        Object ret = jc.getVariable(name, JellyContext.PAGE_SCOPE);
//        if (ret == null) {
```

### CommentedOutCode
Commented out code (2 lines)
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/MessageTag.java`
#### Snippet
```java
            if (locCtxt.getLocale() != null) {
                // TODO
                // SetLocaleSupport.setResponseLocale(pageContext,
                // locCtxt.getLocale());
            }
```

### CommentedOutCode
Commented out code (2 lines)
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerFieldEditorTag("fontFieldEditor", FontFieldEditor.class);
        registerFieldEditorTag("integerFieldEditor", IntegerFieldEditor.class);
        //registerFieldEditorTag("radioGroupFieldEditor", RadioGroupFieldEditor.class);
        //registerFieldEditorTag("stringButtonFieldEditor", StringButtonFieldEditor.class);
        registerFieldEditorTag("stringFieldEditor", StringFieldEditor.class);
```

### CommentedOutCode
Commented out code (13 lines)
in `jelly-tags/beanshell/src/main/java/org/apache/commons/jelly/tags/beanshell/JellyInterpreter.java`
#### Snippet
```java
    }

/*

    // the following code doesn't work - it seems that
```

### CommentedOutCode
Commented out code (8 lines)
in `jelly-tags/beanshell/src/main/java/org/apache/commons/jelly/tags/beanshell/BeanShellExpressionFactory.java`
#### Snippet
```java
        interpreter.setJellyContext(context);
        return interpreter;
/*
        JellyInterpreter interpreter
            = (JellyInterpreter) context.getVariable( "org.apache.commons.jelly.beanshell.JellyInterpreter" );
```

### CommentedOutCode
Commented out code (17 lines)
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/AssertValidTag.java`
#### Snippet
```java


/*
    public AssertValidTag() {
        setErrorHandler(
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTagLibrary.java`
#### Snippet
```java

    /** Synchronized map of tag names to invoke methods */
    private Map invokeMethods = new Hashtable();

    public BeanTagLibrary() {
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTagLibrary.java`
#### Snippet
```java

    /** Synchronized map of tag names to bean classes */
    private Map beanTypes = new Hashtable();

    /** Synchronized map of tag names to invoke methods */
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
                if (tagNamespacesMap != null && !tagNamespacesMap.isEmpty()) {
                    // create a new child context
                    Hashtable newContext = new Hashtable(namespaceContext.size()+1);
                    newContext.putAll(namespaceContext);
                    newContext.putAll(tagNamespacesMap);
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
                if (tagNamespacesMap != null && !tagNamespacesMap.isEmpty()) {
                    // create a new child context
                    Hashtable newContext = new Hashtable(namespaceContext.size()+1);
                    newContext.putAll(namespaceContext);
                    newContext.putAll(tagNamespacesMap);
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
                namespaceContext = tagNamespacesMap;
                if (namespaceContext == null) {
                    namespaceContext = new Hashtable();
                }
            }
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java

    /** The attribute expressions that are created */
    protected Map attributes = new Hashtable();

    /** the optional namespaces Map of prefix to URI of this single Tag */
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
        // lets check that this is a thread-safe map
        if ( ! (tagNamespacesMap instanceof Hashtable) ) {
            tagNamespacesMap = new Hashtable( tagNamespacesMap );
        }
        this.tagNamespacesMap = tagNamespacesMap;
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java
    protected Map createUriMap(Map namespaceContext) {
        // now lets clone the Map but ignoring default or null prefixes
        Map uris = new Hashtable(namespaceContext.size());
        for (Iterator iter = namespaceContext.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iter.next();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
     *  @return A <code>Hashtable</code> of all properties.
     */
    Hashtable getProperties();

    /** Retrieve a <code>Hashtable</code> of all user properties.
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
     *  @return A <code>Hashtable</code> of all user properties.
     */
    Hashtable getUserProperties();
    
    /** Copy all of the user properties to the other <code>Project</code>.
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/JellyPropsHandler.java`
#### Snippet
```java
     *  @return A <code>Hashtable</code> of all properties.
     */
    public Hashtable getProperties() {
        Hashtable h = new Hashtable();
        for (Iterator i = this.context.getVariableNames(); i.hasNext(); ) {
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/JellyPropsHandler.java`
#### Snippet
```java
     */
    public Hashtable getProperties() {
        Hashtable h = new Hashtable();
        for (Iterator i = this.context.getVariableNames(); i.hasNext(); ) {
            String name = (String) i.next();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/JellyPropsHandler.java`
#### Snippet
```java
     */
    public Hashtable getProperties() {
        Hashtable h = new Hashtable();
        for (Iterator i = this.context.getVariableNames(); i.hasNext(); ) {
            String name = (String) i.next();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     */
    public void copyInheritedProperties(Project other) {
        Hashtable inheritedProps = this.getInheritedProperties();
        
        Enumeration e = inheritedProps.keys();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     * @see PropsHandler#getUserProperties()
     */
    public Hashtable getUserProperties() {
        return new Hashtable(this.userProperties);
    }
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     */
    public Hashtable getUserProperties() {
        return new Hashtable(this.userProperties);
    }
    
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
    }
    
    public Hashtable getInheritedProperties() {
        return new Hashtable(this.inheritedProperties);
    }
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
    
    public Hashtable getInheritedProperties() {
        return new Hashtable(this.inheritedProperties);
    }
    
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     */
    public void copyUserProperties(Project other) {
        Hashtable userProps = this.getUserProperties();
        Hashtable inheritedProps = this.getInheritedProperties();
        
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
    public void copyUserProperties(Project other) {
        Hashtable userProps = this.getUserProperties();
        Hashtable inheritedProps = this.getInheritedProperties();
        
        Enumeration e = userProps.keys();
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     * @see PropsHandler#getProperties()
     */
    public Hashtable getProperties() {
        return new Hashtable(this.properties);
    }
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
     */
    public Hashtable getProperties() {
        return new Hashtable(this.properties);
    }

```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java

    /** Tag libraries found so far */
    private Map taglibs = new Hashtable();

    /** synchronized access to the variables in scope */
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java

    /** synchronized access to the variables in scope */
    private Map variables = new Hashtable();

    /** The parent context */
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
        cmdLineOptions.addOption("awt", false, "Wether to run in the AWT thread.");
        cmdLineOptions.addOption("swing", false, "Synonym of \"-awt\".");
        List builtinOptionNames = Arrays.asList(new String[]{
            "-o","-script","-h","--help","-v","--version","-awt","-swing"});
        
        // -D options will be added to the system properties
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            // Project argument.
            try {
                ctor = type.getConstructor(new Class[0]);
                noArg = true;
            }
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            catch (NoSuchMethodException nse) {
                try {
                    ctor = type.getConstructor(new Class[] { Project.class });
                    noArg = false;
                } catch (NoSuchMethodException nsme) {
```

## RuleId[id=ObjectNotify]
### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/NotifyTag.java`
#### Snippet
```java
            mutex.notifyAll();
        } else {
            mutex.notify();
        }
    }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                    }
                } catch (InterruptedException ex) {
                    notify();
                    throw ex;
                }
```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
    public synchronized void release() {
        inuse_ = false;
        notify();
    }

```

### ObjectNotify
`notify` should probably be replaced with 'notifyAll()'
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                inuse_ = true;
            } catch (InterruptedException ex) {
                notify();
                throw ex;
            }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
                                                    switch ( c ) {
                                                        case('\\'):
                                                            ++cur;
                                                            expr.append(c);
                                                            break;
                                                        case('"'):
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
                                                    switch ( c ) {
                                                        case('\\'):
                                                            ++cur;
                                                            expr.append(c);
                                                            break;
                                                        case('\''):
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`l.size() == 0` can be replaced with 'l.isEmpty()'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
                if(value instanceof List) {
                    List l = (List) value;
                    if (l.size() == 0)
                        value=null;
                    else
```

### SizeReplaceableByIsEmpty
`tagName.length() > 0` can be replaced with '!tagName.isEmpty()'
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTag.java`
#### Snippet
```java
        this.invokeMethod = invokeMethod;

        if (tagName.length() > 0) {
            addMethodName = "add"
                + tagName.substring(0,1).toUpperCase()
```

### SizeReplaceableByIsEmpty
`tagName.length() > 0` can be replaced with '!tagName.isEmpty()'
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanPropertyTag.java`
#### Snippet
```java
        super(Object.class, tagName);

        if (tagName.length() > 0) {
            createMethodName = "create"
                + tagName.substring(0,1).toUpperCase()
```

### SizeReplaceableByIsEmpty
`text.length() == 0` can be replaced with 'text.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/impl/ScriptBlock.java`
#### Snippet
```java
                String text = textScript.getText();
                text = text.trim();
                if ( text.length() == 0 ) {
                    list.remove(i);
                }
```

### SizeReplaceableByIsEmpty
`prefix.length()>0` can be replaced with '!prefix.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/impl/StaticTag.java`
#### Snippet
```java
        if(value==null)
            return;
        if(prefix!=null && prefix.length()>0)
            attributes.addAttribute(nsURI,name,prefix+":"+name,"CDATA",value.toString());
        else
```

### SizeReplaceableByIsEmpty
`expat.prefix.length() > 0` can be replaced with '!expat.prefix.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/impl/StaticTagScript.java`
#### Snippet
```java
                }

                if( expat.prefix != null && expat.prefix.length() > 0 && tag instanceof StaticTag )
                {
                    ((StaticTag) dynaTag).setAttribute(name,expat.prefix, expat.nsURI,value);
```

### SizeReplaceableByIsEmpty
`paramTypes.size() == 0` can be replaced with 'paramTypes.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/tags/core/NewTag.java`
#### Snippet
```java
            Class theClass = getClassLoader().loadClass( className );
            Object object = null;
            if(paramTypes.size() == 0) {
                object = theClass.newInstance();
            } else {
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/tags/core/SetTag.java`
#### Snippet
```java
        if (value instanceof String) {
            String s = (String) value;
            return s.length() == 0;
        }
        return false;
```

### SizeReplaceableByIsEmpty
`why.trim().length() > 0` can be replaced with '!why.trim().isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/servlet/JellyServlet.java`
#### Snippet
```java
        html.append("<pre>");
        String why = cause.getMessage();
        if (why != null && why.trim().length() > 0) {
            html.append(why);
            html.append("<br>");
```

### SizeReplaceableByIsEmpty
`prefix.length() != 0` can be replaced with '!prefix.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java
            Map.Entry entry = (Map.Entry) iter.next();
            String prefix = (String) entry.getKey();
            if (prefix != null && prefix.length() != 0) {
                uris.put(prefix, entry.getValue());
            }
```

### SizeReplaceableByIsEmpty
`componentName.length() == 0` can be replaced with 'componentName.isEmpty()'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
		Component comp = getComponent();
        String componentName = (comp!=null) ? comp.getName() : null;
        if (comp!=null && (componentName == null || componentName.length() == 0))
            componentName = getComponent().toString();
        return "ComponentTag with bean " + componentName;
```

### SizeReplaceableByIsEmpty
`attributeName.length() == 0` can be replaced with 'attributeName.isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                        // Fix for JELLY-184 where the xmlns attributes have a blank name and cause
                        //	an exception later on
                        if (attributeName.length() == 0)
                        	continue;
                        String attributeValue = list.getValue(i);
```

### SizeReplaceableByIsEmpty
`filesets.size() > 0` can be replaced with '!filesets.isEmpty()'
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/FileScanner.java`
#### Snippet
```java

    public boolean hasFiles() {
        return filesets.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`guarantee.length()==0` can be replaced with 'guarantee.isEmpty()'
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/SecurityHandlerTag.java`
#### Snippet
```java
            data=data.get("transport-guarantee");
            String guarantee = data.toString(false,true).toUpperCase();
            if (guarantee==null || guarantee.length()==0 ||
                "NONE".equals(guarantee))
                scBase.setDataConstraint(SecurityConstraint.DC_NONE);
```

### SizeReplaceableByIsEmpty
`getParameters().size() > 0` can be replaced with '!getParameters().isEmpty()'
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
     */
    protected void setParameters(HttpMethod method) throws MalformedURLException {
        if (getParameters().size() > 0) {
            NameValuePair[] parameters = (NameValuePair[]) getParameters().
                toArray(new NameValuePair[0]);
```

### SizeReplaceableByIsEmpty
`bodyContent.length() > 0` can be replaced with '!bodyContent.isEmpty()'
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ParamTag.java`
#### Snippet
```java
            if (bodyContent != null) {
                bodyContent = bodyContent.trim();
                if (bodyContent.length() > 0) {
                    paramValue = bodyContent;
                }
```

### SizeReplaceableByIsEmpty
`sqlStatement.trim().length() == 0` can be replaced with 'sqlStatement.trim().isEmpty()'
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/UpdateTag.java`
#### Snippet
```java
            sqlStatement = getBodyText();
        }
        if (sqlStatement == null || sqlStatement.trim().length() == 0) {
            throw new JellyTagException(Resources.getMessage("SQL_NO_STATEMENT"));
        }
```

### SizeReplaceableByIsEmpty
`parameters.size() > 0` can be replaced with '!parameters.isEmpty()'
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SqlTagSupport.java`
#### Snippet
```java
     */
    protected boolean hasParameters() {
        return parameters != null && parameters.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`sqlStatement.trim().length() == 0` can be replaced with 'sqlStatement.trim().isEmpty()'
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/QueryTag.java`
#### Snippet
```java
                sqlStatement = getBodyText();
            }
            if (sqlStatement == null || sqlStatement.trim().length() == 0) {
                throw new JellyTagException(Resources.getMessage("SQL_NO_STATEMENT"));
            }
```

### SizeReplaceableByIsEmpty
`text.length() > 0` can be replaced with '!text.isEmpty()'
in `jelly-tags/jsl/src/main/java/org/apache/commons/jelly/tags/jsl/JellyStylesheet.java`
#### Snippet
```java
                public void run(Node node) throws Exception {
                    String text = node.getStringValue();
                    if ( text != null && text.length() > 0 ) {
                        getOutput().write( text );
                    }
```

### SizeReplaceableByIsEmpty
`language.length() == 0` can be replaced with 'language.isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
        }

        if ((language == null) || (language.length() == 0)) {
            throw new IllegalArgumentException("Missing language");
        }
```

### SizeReplaceableByIsEmpty
`country.length() > 0` can be replaced with '!country.isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
            else
                ret = new Locale(language, "");
        } else if (country.length() > 0) {
            if (variant != null)
                ret = new Locale(language, country, variant);
```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileExistsTag.java`
#### Snippet
```java
    {
        String message = getBodyText();
        if (message == null || message.length() == 0)
        {
            message = "File does not exist.";
```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileNotFoundTag.java`
#### Snippet
```java
    {
        String message = getBodyText();
        if (message == null || message.length() == 0)
        {
            message = "File exists.";
```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileContainsTag.java`
#### Snippet
```java
        }
        String message = getBodyText();
        if (message == null || message.length() == 0)
        {
            message = "File does not contain '" + match + "'";
```

### SizeReplaceableByIsEmpty
`message.length() == 0` can be replaced with 'message.isEmpty()'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertTagSupport.java`
#### Snippet
```java
     */
    protected void fail(String message, String detail) throws JellyAssertionFailedError {
        if (message == null || message.length() == 0) {
            fail(detail);
        }
```

### SizeReplaceableByIsEmpty
`getText().length() == 0` can be replaced with 'getText().isEmpty()'
in `jelly-tags/regexp/src/main/java/org/apache/commons/jelly/tags/regexp/RegexpTag.java`
#### Snippet
```java
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        // Check required properties
        if (getText() == null || getText().length() == 0)
            throw new MissingAttributeException("text must be provided");

```

### SizeReplaceableByIsEmpty
`var.length() == 0` can be replaced with 'var.isEmpty()'
in `jelly-tags/regexp/src/main/java/org/apache/commons/jelly/tags/regexp/RegexpTag.java`
#### Snippet
```java
            throw new MissingAttributeException("expr must be provided");

        if (var == null || var.length() == 0)
            throw new MissingAttributeException("var must be provided");

```

### SizeReplaceableByIsEmpty
`publicID.length() > 0` can be replaced with '!publicID.isEmpty()'
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/ValidateTag.java`
#### Snippet
```java

        String publicID = e.getPublicId();
        if ( publicID != null && publicID.length() > 0 ) {
            attributes.addAttribute( uri, "publicID", "publicID", type, publicID );
        }
```

### SizeReplaceableByIsEmpty
`systemID.length() > 0` can be replaced with '!systemID.isEmpty()'
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/ValidateTag.java`
#### Snippet
```java
        }
        String systemID = e.getSystemId();
        if ( systemID != null && systemID.length() > 0 ) {
            attributes.addAttribute( uri, "systemID", "systemID", type, systemID );
        }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `jelly-tags/velocity/src/main/java/org/apache/commons/jelly/tags/velocity/VelocityTagSupport.java`
#### Snippet
```java
    private String keyName( String basedir )
    {
        return new StringBuilder()
            .append( VELOCITY_ENGINE_VAR_NAME )
            .append( '.' )
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ActionTag.java`
#### Snippet
```java
            return text;
        }
        StringBuilder buffer = new StringBuilder(text.length());
        buffer.append( Character.toUpperCase( ch ) );
        buffer.append( text.substring(1) );
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java
        }

        return;
    }

```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
      */
    public void setAsString(boolean asString) {
        this.asString = new Boolean(asString);
    }

```

### BooleanConstructor
Boolean constructor call
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        */
    public void setSingle(boolean single) {
        this.single = new Boolean(single);
    }
    
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TriggerTag` has no concrete subclass
in `jelly-tags/quartz/src/main/java/org/apache/commons/jelly/tags/quartz/TriggerTag.java`
#### Snippet
```java
 *  @author <a href="mailto:bob@eng.werken.com">bob mcwhirter</a>
 */
public abstract class TriggerTag extends QuartzTagSupport
{
    // ------------------------------------------------------------
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract public`
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/AbstractMethodHandlerTag.java`
#### Snippet
```java

    /** Override this to return the name of the http method handled by this tag */
    abstract public String getMethodHandled();

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/AbstractMethodHandlerTag.java`
#### Snippet
```java
 * @author  rtl
 */
abstract public class AbstractMethodHandlerTag extends TagSupport {

    /** Override this to return the name of the http method handled by this tag */
```

### MissortedModifiers
Missorted modifiers `final private`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/LocalizationContext.java`
#### Snippet
```java

    // the localization context's resource bundle
    final private ResourceBundle bundle;

    // the localization context's locale
```

### MissortedModifiers
Missorted modifiers `final private`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/LocalizationContext.java`
#### Snippet
```java

    // the localization context's locale
    final private Locale locale;

    /**
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `jelly-tags/quartz/src/main/java/org/apache/commons/jelly/tags/quartz/QuartzTagSupport.java`
#### Snippet
```java

            Runtime.getRuntime().addShutdownHook(
                new Thread() {
                    public void run()
                    {
```

### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java

            // now lets wait for all threads to close
            Runtime.getRuntime().addShutdownHook(new Thread() {
                    public void run() {
                        try {
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `type.equals("Long")`
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/PropertyTag.java`
#### Snippet
```java
                propClass = Short.TYPE;
            }
            else if (type.equals("Long")) {
                propClass = Long.TYPE;
            }
```

### DuplicateCondition
Duplicate condition `type.equals("Long")`
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/PropertyTag.java`
#### Snippet
```java
                propClass = Double.TYPE;
            }
            else if (type.equals("Long")) {
                propClass = Long.TYPE;
            }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java
            if ( ! generated.getParentFile().exists() )
            {
                generated.getParentFile().mkdirs();
            }

```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.commons.jelly.tags.fmt.BundleTag.getLocalizationContext(org.apache.commons.jelly.JellyContext, java.lang.String)' accessed via instance reference
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
        }

        this.locCtxt = this.getLocalizationContext(context, ebasename);
        invokeBody(output);
    }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    private int determineReturnType() {
        int resultType;
        if (single != null && single.booleanValue()) { // first node
            if (asString != null && asString.booleanValue()) {
                resultType = RETURN_FIRST_AS_STRING;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        int resultType;
        if (single != null && single.booleanValue()) { // first node
            if (asString != null && asString.booleanValue()) {
                resultType = RETURN_FIRST_AS_STRING;
            } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
            }
        } else { // all nodes
            if (asString != null && asString.booleanValue()) {
                if (delim != null) {
                    resultType = RETURN_DELIMITED_STRING_LIST;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        Object value = null;
        try {
            if( single != null && single.booleanValue() == true ) {
                value = select.selectSingleNode(xpathContext);
            } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        // handle single
        if (single!=null) {
            if (single.booleanValue() == true) {
                if(value instanceof List) {
                    List l = (List) value;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        
        // now convert the result(s) to string if need
        if(asString != null && asString.booleanValue()) {
            if(value instanceof Node) {
                value = ((Node) value).getStringValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
        }

        return this.shouldTrim.booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `core/src/main/java/org/apache/commons/jelly/expression/ExpressionSupport.java`
#### Snippet
```java
        if ( value instanceof Boolean ) {
            Boolean b = (Boolean) value;
            return b.booleanValue();
        }
        else if ( value instanceof String ) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
            Field f = getClass().getField(field);
            Integer rv = (Integer) f.get(this);
            return rv.intValue();
        } catch (SecurityException e) {
            LOG.debug(e);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/QueryTag.java`
#### Snippet
```java
            if (obj != null) {
                if (obj instanceof Integer) {
                    maxRows = ((Integer) obj).intValue();
                }
                else if (obj instanceof String) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `core/src/main/java/org/apache/commons/jelly/tags/core/MuteTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output) throws JellyTagException {
        super.invokeBody(new MuteXMLOutput());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SqlTagSupport.java`
#### Snippet
```java

    public SqlTagSupport() {
		super.setEscapeText(false);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.JellyTagException;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `core/src/main/java/org/apache/commons/jelly/expression/ExpressionSupport.java`
#### Snippet
```java

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.lang.StringUtils;

```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.expression.ExpressionSupport;

```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.expression.Expression;
import org.apache.commons.jelly.expression.ExpressionSupport;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.expression.Expression;
import org.apache.commons.jelly.expression.ExpressionSupport;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyException;`
in `core/src/main/java/org/apache/commons/jelly/impl/Embedded.java`
#### Snippet
```java
import org.apache.commons.jelly.Jelly;
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.Script;
import org.apache.commons.jelly.TagLibrary;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.net.URL;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.net.URL;
import java.net.MalformedURLException;
```

### UNUSED_IMPORT
Unused import `import java.net.URL;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Iterator;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;
```

### UNUSED_IMPORT
Unused import `import java.net.MalformedURLException;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import java.util.Iterator;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import java.net.URL;
import java.net.MalformedURLException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import java.net.MalformedURLException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

```

### UNUSED_IMPORT
Unused import `import org.apache.avalon.framework.configuration.Configurable;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java

// Avalon
import org.apache.avalon.framework.configuration.Configurable;
import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.ConfigurationException;
```

### UNUSED_IMPORT
Unused import `import org.apache.avalon.framework.configuration.Configuration;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
// Avalon
import org.apache.avalon.framework.configuration.Configurable;
import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.ConfigurationException;

```

### UNUSED_IMPORT
Unused import `import org.apache.avalon.framework.configuration.ConfigurationException;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import org.apache.avalon.framework.configuration.Configurable;
import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.ConfigurationException;

// Jelly
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.Jelly;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java

// Jelly
import org.apache.commons.jelly.Jelly;
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyContext;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
// Jelly
import org.apache.commons.jelly.Jelly;
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.Script;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyException;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import org.apache.commons.jelly.Jelly;
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.Script;
import org.apache.commons.jelly.XMLOutput;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.Script;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyService.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.Script;
import org.apache.commons.jelly.XMLOutput;

```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.net.URL;
import java.net.MalformedURLException;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStream;`
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java
import java.net.MalformedURLException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.expression.ExpressionFactory;`
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFTagLibrary.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.Tag;
import org.apache.commons.jelly.expression.ExpressionFactory;
import org.apache.commons.jelly.impl.TagFactory;
import org.apache.commons.jelly.tags.core.CoreTagLibrary;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/DefineTagSupport.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.define;

import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.impl.DynamicTagLibrary;
```

### UNUSED_IMPORT
Unused import `import java.util.Enumeration;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.expression.Expression;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyContext;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.fmt;

import org.apache.commons.jelly.JellyContext;


```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.Tag;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.XMLOutput;
import org.apache.commons.jelly.Tag;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.expression.Expression;
```

### UNUSED_IMPORT
Unused import `import java.util.Locale;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetBundleTag.java`
#### Snippet
```java
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.expression.Expression;
import java.util.Locale;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.Tag;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetTimeZoneTag.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.XMLOutput;
import org.apache.commons.jelly.Tag;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.expression.Expression;
```

### UNUSED_IMPORT
Unused import `import java.util.Enumeration;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/TimeZoneTag.java`
#### Snippet
```java
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.expression.Expression;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
```

### UNUSED_IMPORT
Unused import `import java.util.Locale;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/TimeZoneTag.java`
#### Snippet
```java
import org.apache.commons.jelly.expression.Expression;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
```

### UNUSED_IMPORT
Unused import `import java.util.ResourceBundle;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/TimeZoneTag.java`
#### Snippet
```java
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.TimeZone;
```

### UNUSED_IMPORT
Unused import `import java.util.MissingResourceException;`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/TimeZoneTag.java`
#### Snippet
```java
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.util.TimeZone;

```

### UNUSED_IMPORT
Unused import `import org.apache.commons.httpclient.NameValuePair;`
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/MultipartPostTag.java`
#### Snippet
```java

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.MultipartPostMethod;
import org.apache.commons.httpclient.methods.multipart.Part;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.httpclient.methods.multipart.StringPart;`
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/MultipartPostTag.java`
#### Snippet
```java
import org.apache.commons.httpclient.methods.MultipartPostMethod;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;

/**
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/GeneratorTag.java`
#### Snippet
```java

import java.io.File;
import java.io.IOException;

import org.apache.commons.jelly.TagSupport;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.SchemaReader;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/GeneratorTag.java`
#### Snippet
```java

import org.apache.ws.jaxme.generator.Generator;
import org.apache.ws.jaxme.generator.SchemaReader;
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
import org.apache.ws.jaxme.generator.sg.SchemaSG;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.js.JavaSourceFactory;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/GeneratorTag.java`
#### Snippet
```java
import org.apache.ws.jaxme.generator.sg.SchemaSG;
import org.apache.ws.jaxme.generator.impl.GeneratorImpl;
import org.apache.ws.jaxme.js.JavaSourceFactory;

/** 
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/MarshallTag.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.jaxme;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/MarshallTag.java`
#### Snippet
```java

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

```

### UNUSED_IMPORT
Unused import `import java.io.StringWriter;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/MarshallTag.java`
#### Snippet
```java
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
```

### UNUSED_IMPORT
Unused import `import org.xml.sax.SAXException;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/MarshallTag.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyTagException;

import org.xml.sax.SAXException;

/** 
```

### UNUSED_IMPORT
Unused import `import java.io.File;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.jaxme;

import java.io.File;
import java.io.IOException;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java

import java.io.File;
import java.io.IOException;

import javax.xml.bind.UnmarshallerHandler;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.Generator;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
import org.apache.commons.jelly.JellyTagException;

import org.apache.ws.jaxme.generator.Generator;
import org.apache.ws.jaxme.generator.SchemaReader;
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.SchemaReader;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java

import org.apache.ws.jaxme.generator.Generator;
import org.apache.ws.jaxme.generator.SchemaReader;
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
import org.apache.ws.jaxme.generator.sg.SchemaSG;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
import org.apache.ws.jaxme.generator.Generator;
import org.apache.ws.jaxme.generator.SchemaReader;
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
import org.apache.ws.jaxme.generator.sg.SchemaSG;
import org.apache.ws.jaxme.generator.impl.GeneratorImpl;
```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.sg.SchemaSG;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
import org.apache.ws.jaxme.generator.SchemaReader;
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
import org.apache.ws.jaxme.generator.sg.SchemaSG;
import org.apache.ws.jaxme.generator.impl.GeneratorImpl;

```

### UNUSED_IMPORT
Unused import `import org.apache.ws.jaxme.generator.impl.GeneratorImpl;`
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
import org.apache.ws.jaxme.generator.sg.impl.JAXBSchemaReader;
import org.apache.ws.jaxme.generator.sg.SchemaSG;
import org.apache.ws.jaxme.generator.impl.GeneratorImpl;

import org.xml.sax.SAXException;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileContainsTag.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.expression.Expression;`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileExistsTag.java`
#### Snippet
```java
import org.apache.commons.jelly.MissingAttributeException;
import org.apache.commons.jelly.XMLOutput;
import org.apache.commons.jelly.expression.Expression;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.expression.Expression;`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileNotFoundTag.java`
#### Snippet
```java
import org.apache.commons.jelly.MissingAttributeException;
import org.apache.commons.jelly.XMLOutput;
import org.apache.commons.jelly.expression.Expression;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.TagLibrary;`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JUnitTagLibrary.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.junit;

import org.apache.commons.jelly.TagLibrary;

import org.apache.commons.jelly.JellyException;
```

### UNUSED_IMPORT
Unused import `import org.jaxen.JaxenException;`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JUnitTagLibrary.java`
#### Snippet
```java
import org.apache.commons.logging.LogFactory;

import org.jaxen.JaxenException;

/** Describes the Taglib. This class could be generated by XDoclet
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyTagException;`
in `jelly-tags/log/src/main/java/org/apache/commons/jelly/tags/log/LogTagSupport.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.log;

import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.logging.Log;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.tags.swt.converters.ColorConverter;`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/FontTag.java`
#### Snippet
```java
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.XMLOutput;
import org.apache.commons.jelly.tags.swt.converters.ColorConverter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyException;`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ElementTag.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.xml;

import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.TagSupport;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.jelly.JellyContext;`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.JellyException;
import org.apache.commons.jelly.JellyTagException;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `jelly-tags/xmlunit/src/main/java/org/apache/commons/jelly/tags/xmlunit/AssertDocumentsEqualTag.java`
#### Snippet
```java
package org.apache.commons.jelly.tags.xmlunit;

import java.io.IOException;

import org.apache.commons.jelly.JellyTagException;
```

### UNUSED_IMPORT
Unused import `import org.xml.sax.SAXException;`
in `jelly-tags/xmlunit/src/main/java/org/apache/commons/jelly/tags/xmlunit/AssertDocumentsEqualTag.java`
#### Snippet
```java
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

/**
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`result = result | recognizeOption(tok)` could be simplified to 'result \|= recognizeOption(tok)'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java
            while (stok.hasMoreTokens()) {
                String tok = stok.nextToken();
                result = result | recognizeOption(tok);
            }
            return new Integer(result);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
            while ( (r=in.read()) >= 0 ) {
                w.write((char) r);
            }
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java
        int len;

        while ((len = isr.read(buffer, 0, 1024)) != -1)
          sb.append(buffer, 0, len);

```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/SecurityHandlerTag.java`
#### Snippet
```java

            if (SecurityConstraint.__FORM_AUTH.equals(m))
                authenticator=_formAuthenticator=new FormAuthenticator();
            else if (SecurityConstraint.__BASIC_AUTH.equals(m))
                authenticator=new BasicAuthenticator();
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
        int index = -1;

        if (((index = locale.indexOf(HYPHEN)) > -1)
        || ((index = locale.indexOf(UNDERSCORE)) > -1)) {
            language = locale.substring(0, index);
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java

        if (((index = locale.indexOf(HYPHEN)) > -1)
        || ((index = locale.indexOf(UNDERSCORE)) > -1)) {
            language = locale.substring(0, index);
            country = locale.substring(index+1);
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java

        // Use locale from default I18N localization context, unless it is null
        if ((locCtxt = BundleTag.getLocalizationContext(jc)) != null) {
            if (locCtxt.getLocale() != null) {
                if (format) {
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java

            String line;
            while ((line = in.readLine()) != null) {
                line = line.trim();
                int extendsIndex = line.indexOf(" extends ");
```

### NestedAssignment
Result of assignment expression used
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileContainsTag.java`
#### Snippet
```java
                    String line;
                    boolean found = false;
                    while ((line = br.readLine()) != null)
                    {
                        if (line.indexOf(match) != -1)
```

## RuleId[id=ClassInitializerMayBeStatic]
### ClassInitializerMayBeStatic
Class initializer may be 'static'
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JettyHttpServerTag.java`
#### Snippet
```java

    // static initialisation
    {
        // setup a log for Jetty with a default filename
        try {
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `in` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/StringInputStream.java`
#### Snippet
```java
{
    /** Source string, stored as a StringReader */
    private StringReader in;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cause` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
    
    /** the underlying cause of the exception */
    private Throwable cause;

    /** the Jelly file which caused the problem */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `tagNamespacesMap` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java

    /** the optional namespaces Map of prefix to URI of this single Tag */
    private Map tagNamespacesMap;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `parent` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java

    /** the parent TagScript */
    private TagScript parent;

    /** the SAX attributes */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `lineNumber` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
    private String fileName;
    private int columnNumber;
    private int lineNumber;

    public ScriptTag(BSFEngine engine, BSFManager manager) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `fileName` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
    private BSFManager manager;
    private String elementName;
    private String fileName;
    private int columnNumber;
    private int lineNumber;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `columnNumber` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
    private String elementName;
    private String fileName;
    private int columnNumber;
    private int lineNumber;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `engine` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
    private static final Log log = LogFactory.getLog(ScriptTag.class.getName() + ".evaluating");

    private BSFEngine engine;
    private BSFManager manager;
    private String elementName;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `text` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFExpression.java`
#### Snippet
```java

    /** The expression */
    private String text;

    /** The BSF Engine to evaluate expressions */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `allowDtdToCallExternalEntities` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java

    /** Do we allow our doctype definitions to call out to external entities? */
    private boolean allowDtdToCallExternalEntities = false;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `defaultNamespaceURI` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * class
     */
    private String defaultNamespaceURI = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `validating` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * Do we want to use a validating parser?
     */
    protected boolean validating = false;

    /** Flag to indicate if this object has been configured */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `parser` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The SAXParser we will use to parse the input stream.
     */
    protected SAXParser parser = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `log` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The Log to which logging calls will be made.
     */
    private Log log = LogFactory.getLog(XMLParser.class);

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `propsHandler` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/GrantProject.java`
#### Snippet
```java

    /** Properties delegate. */
    private PropsHandler propsHandler;

    // ------------------------------------------------------------
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cause` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java

    /** the underlying cause of the exception */
    private Throwable cause;

    /** the Jelly file which caused the problem */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `status` is accessed in both synchronized and unsynchronized contexts
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java
    public static final int KILLED = 5;

    private int status = NONE;

    /** On a status change to FAILURE an exception can be set */
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
        while (e.hasMoreElements()) {
            Object name = e.nextElement();
            String value = systemProps.get(name).toString();
            this.setPropertyIfUndefinedByUser(name.toString(), value);
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.putAll()` on properties object
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java
    public void doTag(XMLOutput xmlOutput) throws JellyTagException {
        Properties props = new Properties();
        props.putAll(context.getVariables());

        // if a server was set then configure the system property
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java
        if (server != null) {
            Object serverInput = this.server.evaluate(context);
            props.put("mail.smtp.host", serverInput.toString());
        }
        else {
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java
        }
        else {
            if (props.get("mail.smtp.host") == null) {
                throw new JellyTagException("no smtp server configured");
            }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/PutTag.java`
#### Snippet
```java
     *
     */
    protected void setParameters() {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SortTag.java`
#### Snippet
```java

    /** The list to sort */
    private List list = null;

    /** Xpath comparator for sorting */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SortTag.java`
#### Snippet
```java

    /** Xpath comparator for sorting */
    private XPathComparator xpCmp = null;

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ForEachTag.java`
#### Snippet
```java

    /** Xpath comparator for sorting */
    private XPathComparator xpCmp = null;

    /** If specified then the current item iterated through will be defined
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    private XPathComparator xpCmp = null;

    private Boolean single = null;
    
    private Boolean asString = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    private Boolean single = null;
    
    private Boolean asString = null;
    
    private String delimiter = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    private String delimiter = null;

    private String delim = null;

    public SetTag() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java

    /** Xpath comparator for sorting */
    private XPathComparator xpCmp = null;

    private Boolean single = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    private Boolean asString = null;
    
    private String delimiter = null;

    private String delim = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeRawTag.java`
#### Snippet
```java

    private String var;
    private String endpoint = null;
    private String soapAction;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java

    private String var;
    private String endpoint = null;
    private String namespace = null;
    private String method = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
    private String var;
    private String endpoint = null;
    private String namespace = null;
    private String method = null;
    private String username;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
    private String endpoint = null;
    private String namespace = null;
    private String method = null;
    private String username;
    private String password;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
    
    /** Whether we have loaded the properties yet */
    private boolean loadedProperties = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
     * whether or not to validate the Jelly script
     */
    private boolean validateXML = false;
        
    public Jelly() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
     * whether to override the default namespace
     */
    private String defaultNamespaceURI = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/impl/DefaultTagLibraryResolver.java`
#### Snippet
```java
     * for instantiating new objects?  Default is <code>false</code>.
     */
    private boolean useContextClassLoader = false;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/ThreadTag.java`
#### Snippet
```java
public class ThreadTag extends TagSupport  {
    /** Thread Name */
    private String name = null;
    /** the destination of output */
    private XMLOutput xmlOutput;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/impl/Embedded.java`
#### Snippet
```java
    Exception m_scriptCompilationException;
    /** boolean value indicating whether the script has been successfully compiled or NOT */
    boolean m_scriptCompiled = false;
    /** ErrorMsg*/
    private String m_errorMsg;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/UseBeanTag.java`
#### Snippet
```java
     * @see #setIgnoreUnknownProperties(boolean)
     */
    private boolean ignoreUnknownProperties = false;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
    
    /** the url of the script when parsed */
    private URL scriptURL = null;
    
    /** A synchronized WeakHashMap from the current Thread (key) to a Tag object (value).
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/CaseTag.java`
#### Snippet
```java
    // Attributes
    //-------------------------------------------------------------------------
    private Expression valueExpression = null;
    private boolean fallThru = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/CaseTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    private Expression valueExpression = null;
    private boolean fallThru = false;

}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/DefaultTag.java`
#### Snippet
```java
    // Attributes
    //-------------------------------------------------------------------------
    private boolean fallThru = false;

}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/FileTag.java`
#### Snippet
```java
    private String var;
    private String name;
    private boolean omitXmlDeclaration = false;
    private String outputMode = "xml";
    private boolean prettyPrint;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/FileTag.java`
#### Snippet
```java
 */
public class FileTag extends TagSupport {
    private boolean doAppend = false;
    private String var;
    private String name;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/BaseClassLoaderTag.java`
#### Snippet
```java
     * for instantiating new objects?  Default is <code>false</code>.
     */
    protected boolean useContextClassLoader = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/BaseClassLoaderTag.java`
#### Snippet
```java
     * <code>useContextClassLoader</code> variable.
     */
    protected ClassLoader classLoader = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    private boolean defaultEncountered = false;
    private Expression on = null;
    private Object value = null;

}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    private boolean someCaseMatched = false;
    private boolean fallingThru = false;
    private boolean defaultEncountered = false;
    private Expression on = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    private boolean someCaseMatched = false;
    private boolean fallingThru = false;
    private boolean defaultEncountered = false;
    private Expression on = null;
    private Object value = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    // Attributes
    //-------------------------------------------------------------------------
    private boolean someCaseMatched = false;
    private boolean fallingThru = false;
    private boolean defaultEncountered = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    private boolean fallingThru = false;
    private boolean defaultEncountered = false;
    private Expression on = null;
    private Object value = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/util/NestedRuntimeException.java`
#### Snippet
```java
     * this exception to be thrown.
     */
    private Throwable cause = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/test/BaseJellyTest.java`
#### Snippet
```java

    private Jelly jelly = null;
    private JellyContext context = null;
    private XMLOutput xmlOutput = null;
    private StringWriter strOutput;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/test/BaseJellyTest.java`
#### Snippet
```java
    private Jelly jelly = null;
    private JellyContext context = null;
    private XMLOutput xmlOutput = null;
    private StringWriter strOutput;
}
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/test/BaseJellyTest.java`
#### Snippet
```java
    }

    private Jelly jelly = null;
    private JellyContext context = null;
    private XMLOutput xmlOutput = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
public class DefaultNamespaceFilter extends XMLFilterImpl {

    protected String uriDefault = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java

    /** The xpath to use to extract value from nodes to compare */
    private XPath xpath = null;

    /** Sort descending or ascending */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java

    /** Sort descending or ascending */
    private boolean descending = false;

    public XPathComparator() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
    protected static CommandLineParser _instance = new CommandLineParser();
    
    private Options cmdLineOptions = null;

    public static CommandLineParser getInstance() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
    private class ExpressionSupportLocal extends ExpressionSupport {

        protected Expression jexlExpression = null;
        protected String text = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java

        protected Expression jexlExpression = null;
        protected String text = null;

        public ExpressionSupportLocal(Expression jexlExpression, String text) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/CardLayoutTag.java`
#### Snippet
```java
public class CardLayoutTag extends LayoutTagSupport {
    private int hgap;
    private boolean hgapSet = false;
    private int vgap;
    private boolean vgapSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/CardLayoutTag.java`
#### Snippet
```java
    private boolean hgapSet = false;
    private int vgap;
    private boolean vgapSet = false;

    protected LayoutManager createLayoutManager() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/TdTag.java`
#### Snippet
```java
    private int rowspan = 1;
    private boolean colfill = false;
    private boolean rowfill = false;

    public TdTag() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/TdTag.java`
#### Snippet
```java
    private int colspan = 1;
    private int rowspan = 1;
    private boolean colfill = false;
    private boolean rowfill = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ConstraintTag.java`
#### Snippet
```java
    protected Factory factory;
    protected String var = null;
    protected Object bean = null;

        public static class HereFactory extends BeanFactory implements TagFactory {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ConstraintTag.java`
#### Snippet
```java

    protected Factory factory;
    protected String var = null;
    protected Object bean = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EtchedBorderTag.java`
#### Snippet
```java

    private int     etchType  = -1;
    private Color   highlight = null;
    private Color   shadow    = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EtchedBorderTag.java`
#### Snippet
```java
    private int     etchType  = -1;
    private Color   highlight = null;
    private Color   shadow    = null;

    // Tag interface
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
	private String tagName = null;
	
	private XMLOutput currentOutput = null;
	
	/** Puts this tag into the context under the given name
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
	
    
	private String tagName = null;
	
	private XMLOutput currentOutput = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean weightxSet = false;
    private boolean weightySet = false;
    private boolean ipadxSet = false;
    private boolean ipadySet = false;
    private boolean anchorSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java

    private boolean gridxSet = false;
    private boolean gridySet = false;
    private boolean gridwidthSet = false;
    private boolean gridheightSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean ipadxSet = false;
    private boolean ipadySet = false;
    private boolean anchorSet = false;
    private boolean fillSet = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean ipadySet = false;
    private boolean anchorSet = false;
    private boolean fillSet = false;

    /** Logging output */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean gridxSet = false;
    private boolean gridySet = false;
    private boolean gridwidthSet = false;
    private boolean gridheightSet = false;
    private boolean weightxSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean gridwidthSet = false;
    private boolean gridheightSet = false;
    private boolean weightxSet = false;
    private boolean weightySet = false;
    private boolean ipadxSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean gridySet = false;
    private boolean gridwidthSet = false;
    private boolean gridheightSet = false;
    private boolean weightxSet = false;
    private boolean weightySet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean gridheightSet = false;
    private boolean weightxSet = false;
    private boolean weightySet = false;
    private boolean ipadxSet = false;
    private boolean ipadySet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
    private boolean weightySet = false;
    private boolean ipadxSet = false;
    private boolean ipadySet = false;
    private boolean anchorSet = false;
    private boolean fillSet = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/impl/GridBagConstraintBean.java`
#### Snippet
```java
public class GridBagConstraintBean extends GridBagConstraints {

    private boolean gridxSet = false;
    private boolean gridySet = false;
    private boolean gridwidthSet = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The SAXParserFactory that is created the first time we need it.
     */
    protected static SAXParserFactory factory = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java

    /** Do we allow our doctype definitions to call out to external entities? */
    private boolean allowDtdToCallExternalEntities = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * for instantiating new objects?  Default is <code>false</code>.
     */
    protected boolean useContextClassLoader = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * warnings, errors, or fatal errors occur.
     */
    protected ErrorHandler errorHandler = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The XMLReader used to parse digester rules.
     */
    protected XMLReader reader = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * class
     */
    private String defaultNamespaceURI = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * Do we want to use a validating parser?
     */
    protected boolean validating = false;

    /** Flag to indicate if this object has been configured */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The SAXParser we will use to parse the input stream.
     */
    protected SAXParser parser = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * <code>useContextClassLoader</code> variable.
     */
    protected ClassLoader classLoader = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     * The Locator associated with our parser.
     */
    protected Locator locator = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/FileIterator.java`
#### Snippet
```java

    /** Return only directories? */
    private boolean iterateDirectories = false;

    public FileIterator(Project project,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/FileIterator.java`
#### Snippet
```java

    /** Have we set a next object? */
    private boolean nextObjectSet = false;

    /** Return only directories? */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java
public class JellyServiceImpl implements JellyService, Configurable {

    private boolean m_configured = false;
    private Map m_scripts = new HashMap();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java

    /** whether or not to follow redirects */
    private boolean _followRedirects = false;
    /** list of parameters as name value pairs */
    private List _parameters;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/SessionTag.java`
#### Snippet
```java
    private String _userAgent;
    /** strict compliance */
    private boolean _strictMode = false;

    /** http client used to store state and execute requests */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** whether we should encode the XML body as text */
    private boolean encodeXML = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** mail subject */
    private Expression subject      = null;

    /** mail message */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** who to send to */
    private Expression to           = null;

    /** who to cc */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** smtp server */
    private Expression server       = null;

    /** who to send the message as */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** who to send the message as */
    private Expression from         = null;

    /** who to send to */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** mail message */
    private Expression message      = null;

    /** file attachment */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** file attachment */
    private File attachment     = null;

    /** whether we should encode the XML body as text */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java

    /** who to cc */
    private Expression cc           = null;

    /** mail subject */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/OperationTag.java`
#### Snippet
```java
    private String name;
    private Object arguments;
    private List argList = null;
    private String[] parameters;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
     * for instantiating new objects?  Default is <code>false</code>.
     */
    protected boolean useContextClassLoader = false;

    /** The root URL context (where scripts are located from) */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java

    /** Should we cache Tag instances, per thread, to reduce object construction overhead? */
    private boolean cacheTags = false;
    
    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/SleepTag.java`
#### Snippet
```java
public class SleepTag extends TagSupport {
    /** How long to sleep for */
    private long howLong = 0;

    /** Put the thread to sleep */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/UseMutexTag.java`
#### Snippet
```java
public abstract class UseMutexTag extends TagSupport {
    /** The mutex to use in some way. */
    private Object mutex = null;

    /** Calls useMutex after checking to make sure that <i>setMutex</i> was called */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/UseThreadTag.java`
#### Snippet
```java
public abstract class UseThreadTag extends TagSupport {
    /** The thread to use in some way. */
    private Thread thread = null;
    /** Threads can be grouped and acted on as a set */
    private List threadGroup = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/UseThreadTag.java`
#### Snippet
```java
    private Thread thread = null;
    /** Threads can be grouped and acted on as a set */
    private List threadGroup = null;
    /** If true doTag will search for a parent thread to use if setThread was not called */
    private boolean searchForParent = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java

    /** On a status change to FAILURE an exception can be set */
    private Exception exception = null;

    public RunnableStatus() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/WaitForTag.java`
#### Snippet
```java
public class WaitForTag extends TagSupport {
    private int status = RunnableStatus.NONE;
    private JellyThread thread = null;
    private List group = null;
    private long onlyWait = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/WaitForTag.java`
#### Snippet
```java
    private int status = RunnableStatus.NONE;
    private JellyThread thread = null;
    private List group = null;
    private long onlyWait = -1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/MutexTag.java`
#### Snippet
```java
public class MutexTag extends TagSupport {
    /** The variable name of the mutex */
    private String var = null;

    /** Create and set the mutex */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/NotifyTag.java`
#### Snippet
```java
public class NotifyTag extends UseMutexTag {
    /** True means mutex.notifyAll() will be called */
    private boolean notifyAll = false;

    /** Perform the notify */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/GroupTag.java`
#### Snippet
```java
public class GroupTag extends TagSupport {
    /** Variable to place the thread group into */
    private String var = null;
    /** The thread list */
    private List threads = new ArrayList();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java

    /** The lock status **/
    protected boolean inuse_ = false;

    public void acquire() throws InterruptedException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/JellyThread.java`
#### Snippet
```java
    private Mutex runningMutex = new Mutex();
    /** The Runnable target */
    private Runnable target = null;

    /** Tracks the status of this thread */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java
    private int priority = Thread.NORM_PRIORITY;
    /** Set if the thread should be a daemon or not */
    private boolean daemon = false;
    /** the destination of output */
    private XMLOutput xmlOutput;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java
    private boolean closeOutput;
    /** Should a new context be created */
    private boolean newContext = false;
    /** Keep a reference to the thread */
    private JellyThread thread = new JellyThread();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java

    /** Variable to place the thread into */
    private String var = null;
    /** Thread Name */
    private String name = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java

    /** The current thread number. Used for default thread naming */
    private static int threadNumber = 0;

    /** Variable to place the thread into */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java
    private String var = null;
    /** Thread Name */
    private String name = null;
    /** Thread priority, defaults to Thread.NORM_PRIORITY */
    private int priority = Thread.NORM_PRIORITY;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jelly-tags/xmlunit/src/main/java/org/apache/commons/jelly/tags/xmlunit/AssertDocumentsEqualTag.java`
#### Snippet
```java
     * <code>false</code> whitespace differences are detected.
     */
    private boolean ignoreWhitespace = false;

    public void doTag(XMLOutput output) throws JellyTagException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynaclassTag.java`
#### Snippet
```java
    private ArrayList propList = new ArrayList();
    private DynaProperty[] props = null;
    private DynaClass dynaClass = null;

    private String name;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynaclassTag.java`
#### Snippet
```java

    private ArrayList propList = new ArrayList();
    private DynaProperty[] props = null;
    private DynaClass dynaClass = null;

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Tag`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceWidgetTag.java`
#### Snippet
```java
 * @author <a href="mailto:ckl@dacelo.nl">Christiaan ten Klooster</a>
 */
public class JFaceWidgetTag extends WidgetTag implements Tag {

    /**
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-27-08-32-35.517.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java
	            return null;
        	} else {
        		if (e instanceof RuntimeException)
        			throw (RuntimeException)e;
        		if (e instanceof IllegalStateException)
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java
        		if (e instanceof RuntimeException)
        			throw (RuntimeException)e;
        		if (e instanceof IllegalStateException)
        			throw (IllegalStateException )e;
            	throw (IllegalStateException)new IllegalStateException (e.getMessage()).initCause(e);
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `t`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertThrowsTag.java`
#### Snippet
```java
        }
        catch (Throwable t) {
            if (t instanceof JellyException) {
                // unwrap Jelly exceptions which wrap other exceptions
                JellyException je = (JellyException) t;
```

### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java

                    // wrap the exception with a RuntimeException
                    if (e instanceof RuntimeException) {
                        throw (RuntimeException) e;
                    }
```

## RuleId[id=TextLabelInSwitchStatement]
### TextLabelInSwitchStatement
Text label `DOUBLE_QUOTE:` in 'switch' statement
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
                                              ++cur;

                                              DOUBLE_QUOTE:
                                                while(cur<len) {
                                                    c = text.charAt(cur);
```

### TextLabelInSwitchStatement
Text label `SINGLE_QUOTE:` in 'switch' statement
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
                                                ++cur;

                                              SINGLE_QUOTE:
                                                while(cur<len) {
                                                    c = text.charAt(cur);
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
        if (getParameters().size() > 0) {
            NameValuePair[] parameters = (NameValuePair[]) getParameters().
                toArray(new NameValuePair[0]);
            method.setQueryString(parameters);
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            // Project argument.
            try {
                ctor = type.getConstructor(new Class[0]);
                noArg = true;
            }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java

            if (noArg) {
                dataType = createDataType(ctor, new Object[0], name, "no-arg constructor");
            }
            else {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ResultImpl.java`
#### Snippet
```java

        //should just be able to return SortedMap[] object
        return (SortedMap []) rowMap.toArray(new SortedMap[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ResultImpl.java`
#### Snippet
```java

        //should just be able to return Object[][] object
        return (Object [][])rowByIndex.toArray(new Object[0][0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultImpl.java`
#### Snippet
```java

        //should just be able to return Object[][] object
        return (Object [][])rowByIndex.toArray(new Object[0][0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultImpl.java`
#### Snippet
```java

        //should just be able to return SortedMap[] object
        return (SortedMap []) rowMap.toArray(new SortedMap[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/OperationTag.java`
#### Snippet
```java
        }
        else {
            return new Object[0];
        }
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        }
        // Create and return a new parser
        synchronized (this) {
            try {
                if (factory == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
    public boolean attempt(long msecs) throws InterruptedException {
        if (Thread.interrupted()) throw new InterruptedException();
        synchronized (this) {
            if (!inuse_) {
                inuse_ = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                try {
                    for (; ;) {
                        wait(waitTime);
                        if (!inuse_) {
                            inuse_ = true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                    }
                } catch (InterruptedException ex) {
                    notify();
                    throw ex;
                }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
    public synchronized void release() {
        inuse_ = false;
        notify();
    }

```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
    public void acquire() throws InterruptedException {
        if (Thread.interrupted()) throw new InterruptedException();
        synchronized (this) {
            try {
                while (inuse_) wait();
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
        synchronized (this) {
            try {
                while (inuse_) wait();
                inuse_ = true;
            } catch (InterruptedException ex) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                inuse_ = true;
            } catch (InterruptedException ex) {
                notify();
                throw ex;
            }
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `missingAttribute` of exception class
in `core/src/main/java/org/apache/commons/jelly/MissingAttributeException.java`
#### Snippet
```java
public class MissingAttributeException extends JellyTagException {

    private String missingAttribute;
    
    // ### we may wish to implement a localized message for this error
```

### NonFinalFieldOfException
Non-final field `cause` of exception class
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
    
    /** the underlying cause of the exception */
    private Throwable cause;

    /** the Jelly file which caused the problem */
```

### NonFinalFieldOfException
Non-final field `elementName` of exception class
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java

    /** the tag name which caused the problem */
    private String elementName;

    /** the line number in the script of the error */
```

### NonFinalFieldOfException
Non-final field `fileName` of exception class
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java

    /** the Jelly file which caused the problem */
    private String fileName;

    /** the tag name which caused the problem */
```

### NonFinalFieldOfException
Non-final field `lineNumber` of exception class
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java

    /** the line number in the script of the error */
    private int lineNumber = -1;
    
    /** the column number in the script of the error */
```

### NonFinalFieldOfException
Non-final field `columnNumber` of exception class
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
    
    /** the column number in the script of the error */
    private int columnNumber = -1;
    
    public JellyException() {
```

### NonFinalFieldOfException
Non-final field `cause` of exception class
in `core/src/main/java/org/apache/commons/jelly/util/NestedRuntimeException.java`
#### Snippet
```java
     * this exception to be thrown.
     */
    private Throwable cause = null;

    /**
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ExprTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        Object xpathContext = getXPathContext();

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/IfTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (select == null) {
            throw new MissingAttributeException( "select" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SortTag.java`
#### Snippet
```java
    private XPathComparator xpCmp = null;

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (xpCmp == null) {
            throw new MissingAttributeException( "xpCmp" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/CopyOfTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        Object xpathContext = getXPathContext();

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ParseTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (getVar() == null) {
            throw new MissingAttributeException("The var attribute cannot be null");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/DoctypeTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (name == null) {
            throw new MissingAttributeException( "name" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ReplaceNamespaceTag.java`
#### Snippet
```java
    //  Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        final String fromURI = (fromNamespace != null) ? fromNamespace : "";
        final String toURI = (toNamespace != null) ? toNamespace : "";
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException( "var" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
     * @throws MissingAttributeException Thrown when required attributes are missing
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {

        if (null == this.getXslt()) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeRawTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException
    {
        if (endpoint == null)
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (endpoint == null) {
            throw new MissingAttributeException("endpoint");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/Tag.java`
#### Snippet
```java
     * Evaluates this tag after all the tags properties have been initialized.
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException;

    /**
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeandefTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        invokeBody(output);

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/IfTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (test != null) {
            if (test.evaluateAsBoolean(context)) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/RemoveTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (var != null) {
            context.removeVariable( var.evaluateAsString(context) );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/NewTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        ArgTag parentArg = null;
        if ( var == null ) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/InvokeTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( null == methodName) {
            throw new MissingAttributeException( "method" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/CaseTag.java`
#### Snippet
```java
    }

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if(null == this.valueExpression) {
            throw new MissingAttributeException("value");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/IncludeTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {

        if (uri == null && file == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/BreakTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws BreakException, JellyTagException {
        boolean broken = false;
        if (test == null || test.evaluateAsBoolean(context)) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/WhileTag.java`
#### Snippet
```java
     * @throws RuntimeException for anything else
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (test != null) {
            try {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/ParseTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {

        String text = getText();
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/SetPropertiesTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        Map attributes = getAttributes();
        Object bean = attributes.remove( "object" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/SwitchTag.java`
#### Snippet
```java
    }

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        this.defaultEncountered = false;
        this.someCaseMatched = false;
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java

    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {

        if (log.isDebugEnabled()) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/TitledBorderTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( title == null) {
            throw new MissingAttributeException("title");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EmptyBorderTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( left == -1) {
            throw new MissingAttributeException("left");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EtchedBorderTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if( highlight != null && shadow == null ) {
            throw new MissingAttributeException("shadow must be supplied when highlight is supplied");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        String text = getBodyText();

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/FileScannerTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        fileScanner.setProject(AntTagLibrary.getProject(context));

```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java
                       HttpRequest request,
                       HttpResponse response)
        throws HttpException, IOException
    {
        Tag handlerTag = (Tag) _tagMap.get(request.getMethod().toLowerCase());
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/SetPropertyTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (name == null) {
            throw new MissingAttributeException("name");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/FileTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        boolean available = false;

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/TokenizeTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------

    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( this.var == null )
        {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/LoadTextTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException("var");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/ReplaceTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        // check required properties
        if (oldChar != null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ResultSetTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException( "var" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jsl/src/main/java/org/apache/commons/jelly/tags/jsl/StyleTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        Stylesheet stylesheet = getStylesheet();
        if (stylesheet == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/MapEntryTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( name == null ) {
            throw new MissingAttributeException("name");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/PropertyTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( name == null ) {
            throw new MissingAttributeException("name");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/RegisterTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (name == null) {
            throw new MissingAttributeException("name");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/OperationTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (name == null) {
            throw new MissingAttributeException("name");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/ServerTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {

        // force the creation of a Server
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/OnEventTag.java`
#### Snippet
```java
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException("var");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/MarshallTag.java`
#### Snippet
```java
    }
    
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (packages == null) {
            throw new MissingAttributeException( "packages" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/UnmarshallTag.java`
#### Snippet
```java
    }
    
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (packages == null) {
            throw new MissingAttributeException( "packages" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/GeneratorTag.java`
#### Snippet
```java
    }
    
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
    
        if (schemaUrl == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/MenuManagerTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {

        Map attributes = getAttributes();
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/SelectionChangedListenerTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException("var");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java
     * then run all the current targets
     */
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException
    {
        if ( this.outputDir == null )
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/DoubleClickListenerTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {
        if (var == null) {
            throw new MissingAttributeException("var");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ContributionItemTag.java`
#### Snippet
```java
      */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {

        super.doTag(output);
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ActionTag.java`
#### Snippet
```java
      */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {

        Map attributes = getAttributes();
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/window/ApplicationWindowTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output)
        throws MissingAttributeException, JellyTagException {
        Map attributes = getAttributes();
        Object parent = attributes.remove("parent");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/preference/FieldEditorTag.java`
#### Snippet
```java
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        PreferencePageTag tag = (PreferencePageTag) findAncestorWithClass(PreferencePageTag.class);
        if (tag == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if (test == null && xpath == null) {
            throw new MissingAttributeException( "test" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/InvokeTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( script == null ) {
            throw new MissingAttributeException("script");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/RunTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        Test test = getTest();
        if ( test == null ) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/DynaBeanTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        invokeBody(output);

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/ClassLoaderTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( getVar() == null ) {
            throw new MissingAttributeException( "var" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/BeanTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        invokeBody(output);

```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/regexp/src/main/java/org/apache/commons/jelly/tags/regexp/RegexpTag.java`
#### Snippet
```java
    }

    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
        // Check required properties
        if (getText() == null || getText().length() == 0)
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/IntrospectorTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {

        if ( var == null ) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/ParseTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( var == null ) {
            throw new MissingAttributeException( "var" );
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynabeanTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {

        if (dynaClass == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/PropertyTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag (XMLOutput output) throws MissingAttributeException, JellyTagException {

        // Check that this tag is used inside the body of
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynaclassTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {

        if (name == null) {
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/VerifierTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( var == null ) {
            throw new MissingAttributeException("var");
```

### DuplicateThrows
There is a more general exception, 'org.apache.commons.jelly.JellyTagException', in the throws list already.
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/ValidateTag.java`
#### Snippet
```java
    // Tag interface
    //-------------------------------------------------------------------------
    public void doTag(final XMLOutput output) throws MissingAttributeException, JellyTagException {
        if ( verifier == null ) {
            throw new MissingAttributeException("verifier");
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'WizardDialogImpl' type conflicts with preceding 'instanceof WizardDialog' check
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/wizard/WizardDialogTag.java`
#### Snippet
```java
        Object bean = getBean();
        if (bean instanceof WizardDialog) {
            return (WizardDialogImpl) bean;
        }
        return null;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `document` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ParseTag.java`
#### Snippet
```java

    protected Document getXmlDocument(XMLOutput output) throws JellyTagException {
        Document document = null;
        Object xmlObj = this.getXml();

```

### UnusedAssignment
Variable `nodes` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ForEachTag.java`
#### Snippet
```java
    public void doTag(XMLOutput output) throws JellyTagException {
        if (select != null) {
            List nodes = null;
            try {
                nodes = select.selectNodes( getXPathContext() );
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java

        Object xpathContext = getXPathContext();
        Object value = null;
        try {
            if( single != null && single.booleanValue() == true ) {
```

### UnusedAssignment
Variable `l` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
            } else { // single == false
                if(! (value instanceof List) ) {
                    List l = null;
                    if (value==null) {
                        l = new ArrayList(0);
```

### UnusedAssignment
Variable `xmlInputSource` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
     */
    protected InputSource getInputSourceFromObj(Object sourceObj ) {
        InputSource xmlInputSource = null;
        if (sourceObj instanceof Document) {
            SAXSource saxSource = new DocumentSource((Document) sourceObj);
```

### UnusedAssignment
Variable `xmlReader` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
     */
    protected XMLReader createXMLReader() throws SAXException {
        XMLReader xmlReader = null;
        Object xmlReaderSourceObj = this.getXml();
        // if no xml source specified then get from body
```

### UnusedAssignment
Variable `tag` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
                if (script instanceof TagScript) {

                    Tag tag = null;
                    try {
                        tag = ((TagScript) script).getTag(getContext());
```

### UnusedAssignment
Variable `xmlInputSource` initializer `null` is redundant
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
     */
    protected InputSource getXMLInputSource() {
        InputSource xmlInputSource = null;
        Object xmlInputSourceObj = this.getXml();
        // if no xml source specified then get from tag body
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeRawTag.java`
#### Snippet
```java
        String request = getBodyText();

        String answer = null;
        try
        {
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
        }

        Object answer = null;
        try {
            Call call = (Call) service.createCall();
```

### UnusedAssignment
Variable `theClass` initializer `null` is redundant
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeandefTag.java`
#### Snippet
```java
        }

        Class theClass = null;
        try {
            theClass = ClassLoaderUtils.loadClass(className, classLoader, getContext().getUseContextClassLoader(), getClass());
```

### UnusedAssignment
Variable `script` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        }
        
        Script script = null;
        try {
            parser.setDefaultNamespaceURI(this.defaultNamespaceURI);
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
     */
    protected void loadJellyProperties() {
        InputStream is = null;
    
        String userDir = System.getProperty("user.home");
```

### UnusedAssignment
The value `qname` assigned to `localName` is never used
in `core/src/main/java/org/apache/commons/jelly/impl/StaticTag.java`
#### Snippet
```java
        // FIXME This just doesn't seem right or work...
        if (qname == null || !qname.endsWith(localName)) {
            localName = qname;
        }
    }
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java

                    Class type = dynaTag.getAttributeType(name);
                    Object value = null;
                    if (type != null && type.isAssignableFrom(Expression.class) && !type.isAssignableFrom(Object.class)) {
                        value = expression;
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
                    Class type = property.getType();

                    Object value = null;
                    if (type.isAssignableFrom(Expression.class) && !type.isAssignableFrom(Object.class)) {
                        value = expression;
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/NewTag.java`
#### Snippet
```java
        try {
            Class theClass = getClassLoader().loadClass( className );
            Object object = null;
            if(paramTypes.size() == 0) {
                object = theClass.newInstance();
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/FileTag.java`
#### Snippet
```java
    protected XMLOutput createXMLOutput(Writer writer) {

        OutputFormat format = null;
        if (prettyPrint) {
            format = OutputFormat.createPrettyPrint();
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/SetTag.java`
#### Snippet
```java
        }

        Object answer = null;
        if ( value != null ) {
            answer = value.evaluate(context);
```

### UnusedAssignment
Variable `cause` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/util/NestedRuntimeException.java`
#### Snippet
```java
     * this exception to be thrown.
     */
    private Throwable cause = null;

    /**
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/CatchTag.java`
#### Snippet
```java
            return true;
        }
        Class clazz = null;
        for ( int i = 0; i < exceptionArray.length; i ++ ) {
            clazz = exceptionArray[i];
```

### UnusedAssignment
Variable `uriDefault` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
public class DefaultNamespaceFilter extends XMLFilterImpl {

    protected String uriDefault = null;

    /**
```

### UnusedAssignment
The value `""` assigned to `value` is never used
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java
            List list = (List) value;
            if (list.isEmpty()) {
                value = "";
            }
            value = list.get(0);
```

### UnusedAssignment
Variable `klass` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
        invokeBody(output);

        Class klass = null;
        if("boolean".equals(typeString)) {
            klass = Boolean.TYPE;
```

### UnusedAssignment
Variable `cmdLine` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
     */
    public void invokeCommandLineJelly(String[] args) throws JellyException {
        CommandLine cmdLine = null;
        try {
            cmdLine = parseCommandLineOptions(args);
```

### UnusedAssignment
Variable `scriptFile` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java

        // get the -script option. If there isn't one then use args[0]
        String scriptFile = null;
        if (cmdLine.hasOption("script")) {
            scriptFile = cmdLine.getOptionValue("script");
```

### UnusedAssignment
Variable `jexlExpression` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
    private class ExpressionSupportLocal extends ExpressionSupport {

        protected Expression jexlExpression = null;
        protected String text = null;

```

### UnusedAssignment
Variable `text` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java

        protected Expression jexlExpression = null;
        protected String text = null;

        public ExpressionSupportLocal(Expression jexlExpression, String text) {
```

### UnusedAssignment
Variable `jexlExpression` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
*/

        Expression jexlExpression = null;
        try {
            // this method really does throw Exception
```

### UnusedAssignment
Variable `c` initializer `0` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java

        int cur = 0;
        char c = 0;

        StringBuilder chars = new StringBuilder();
```

### UnusedAssignment
The value `text.charAt( cur )` assigned to `c` is never used
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
                        if ( text.charAt( cur + 1 ) == '{' ) {
                        ++cur;
                        c = text.charAt( cur );

                                if ( chars.length() > 0 ) {
```

### UnusedAssignment
Variable `colorValue` initializer `0` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/ColorConverter.java`
#### Snippet
```java
                    throw new IllegalArgumentException(usageText);
                }
                int colorValue = 0;
                try {
                    colorValue = Integer.parseInt(s.substring(1), 16);
```

### UnusedAssignment
Variable `iterateDirectories` initializer `false` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/FileIterator.java`
#### Snippet
```java

    /** Return only directories? */
    private boolean iterateDirectories = false;

    public FileIterator(Project project,
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/SecurityHandlerTag.java`
#### Snippet
```java
        XmlParser xmlParser = new XmlParser(false);

        XmlParser.Node node = null;
        try {
            node = xmlParser.parse(inputSource);
```

### UnusedAssignment
Variable `currNode` initializer `null` is redundant
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/SecurityHandlerTag.java`
#### Snippet
```java

        Iterator iter=node.iterator();
        XmlParser.Node currNode = null;
        while (iter.hasNext())
        {
```

### UnusedAssignment
Variable `is` initializer `null` is redundant
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/PropertiesTag.java`
#### Snippet
```java
            throw new JellyTagException("This tag must define a 'file' or 'uri' attribute");
        }
        InputStream is = null;
        if (file != null) {
            File f = new File(file);
```

### UnusedAssignment
Variable `script` initializer `null` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/task/JellyTask.java`
#### Snippet
```java
        XMLParser parser = new XMLParser();

        Script script = null;
        try {
            parser.setContext(getJellyContext());
```

### UnusedAssignment
Variable `in` initializer `null` is redundant
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/LoadTextTag.java`
#### Snippet
```java
        }
        
        InputStream in = null;
        if (file != null) {
            if (! file.exists()) {
```

### UnusedAssignment
Variable `reader` initializer `null` is redundant
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/LoadTextTag.java`
#### Snippet
```java
        }

        Reader reader = null;
        if (encoding != null) {
            try {
```

### UnusedAssignment
Variable `text` initializer `null` is redundant
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/LoadTextTag.java`
#### Snippet
```java
        }

        String text = null;

        try {
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/ReplaceTag.java`
#### Snippet
```java

        // get either the value or the body of the tag
        Object answer = null;
        if ( value != null ) {
            answer = value.evaluateAsString(context);
```

### UnusedAssignment
Variable `httpMethod` initializer `null` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/BodyTag.java`
#### Snippet
```java
            HttpTagSupport.class);

        HttpMethod httpMethod = null;
        try {
            httpMethod = httpTag.getHttpMethod();
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java
                String scriptName = config.getChild( "url" ).getValue();
                // Try to load the script via file, then by URL, then by classloader
                URL url = null;
                File file = new File( scriptName );
                if( file.exists() ) {
```

### UnusedAssignment
The value `new URL( url )` assigned to `actualUrl` is never used
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java
        URL actualUrl = null;
        try {
           actualUrl = new URL( url );
        }
        catch ( MalformedURLException x ) {
```

### UnusedAssignment
Variable `header` initializer `null` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
        urlMethod.setFollowRedirects(isFollowRedirects());
        // add request headers
        NameValuePair header = null;
        for (int index = 0; index < getRequestHeaders().size(); index++) {
            header = (NameValuePair) getRequestHeaders().get(index);
```

### UnusedAssignment
Variable `urlMethod` initializer `null` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
        // track request execution
        long start = System.currentTimeMillis();
        HttpMethod urlMethod = null;
        try {
            urlMethod = getConfiguredHttpMethod();
```

### UnusedAssignment
Variable `client` initializer `null` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
    private HttpClient getHttpClient() {
        SessionTag session = getSessionTag();
        HttpClient client = null;
        if (session != null) {
            client = session.getHttpClient();
```

### UnusedAssignment
Variable `messageBody` initializer `null` is redundant
in `jelly-tags/email/src/main/java/org/apache/commons/jelly/tags/email/EmailTag.java`
#### Snippet
```java
        }

        String messageBody = null;
        if (this.message != null) {
            messageBody = this.message.evaluate(context).toString();
```

### UnusedAssignment
Variable `o` initializer `null` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
        }

        Object o = null;
        try {
            o = taskType.newInstance();
```

### UnusedAssignment
Variable `task` initializer `null` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
        }

        Task task = null;
        if ( o instanceof Task ) {
            task = (Task) o;
```

### UnusedAssignment
The value `true` assigned to `finished` is never used
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/TransactionTag.java`
#### Snippet
```java
        try {
            invokeBody(output);
            finished = true;
        }
        catch (Exception e) {
```

### UnusedAssignment
Variable `ds` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SetDataSourceTag.java`
#### Snippet
```java

    public void doTag(XMLOutput output) throws JellyTagException {
        DataSource ds = null;

        if (dataSource != null) {
```

### UnusedAssignment
Variable `dataSource` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceUtil.java`
#### Snippet
```java
    static DataSource getDataSource(Object rawDataSource, JellyContext pc)
        throws JellyTagException {
        DataSource dataSource = null;

        if (rawDataSource == null) {
```

### UnusedAssignment
Variable `sqlStatement` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/UpdateTag.java`
#### Snippet
```java
         * otherwise use the body as the statement.
         */
        String sqlStatement = null;
        if (sql != null) {
            sqlStatement = sql;
```

### UnusedAssignment
Variable `result` initializer `0` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/UpdateTag.java`
#### Snippet
```java

        Statement statement = null;
        int result = 0;
        try {
            if ( hasParameters() ) {
```

### UnusedAssignment
Variable `conn` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SqlTagSupport.java`
#### Snippet
```java
    protected Connection getConnection() throws JellyTagException, SQLException {
        // Fix: Add all other mechanisms
        Connection conn = null;
        isPartOfTransaction = false;

```

### UnusedAssignment
Variable `conn` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceWrapper.java`
#### Snippet
```java
     */
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        if (userName != null) {
            if (log.isDebugEnabled()) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/QueryTag.java`
#### Snippet
```java
        }

        Result result = null;
        String sqlStatement = null;

```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `jelly-tags/html/src/main/java/org/apache/commons/jelly/tags/html/ParseTag.java`
#### Snippet
```java
            throw new IllegalArgumentException("The var attribute cannot be null");
        }
        Document document = null;
        if (html == null) {
            String text = getText();
```

### UnusedAssignment
Variable `destination` initializer `null` is redundant
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/SubscribeTag.java`
#### Snippet
```java


        Destination destination = null;
        try {
            destination = getDestination();
```

### UnusedAssignment
Variable `destination` initializer `null` is redundant
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/DestinationTag.java`
#### Snippet
```java
        }

        Destination destination = null;
        try {
            Messenger messenger = messengerTag.getConnection();
```

### UnusedAssignment
Variable `message` initializer `null` is redundant
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/ReceiveTag.java`
#### Snippet
```java
        invokeBody(output);

        Message message = null;
        try {
            Destination destination = getDestination();
```

### UnusedAssignment
Variable `timeZone` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetTimeZoneTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output) throws JellyTagException {
        TimeZone timeZone = null;

        Object valueInput = null;
```

### UnusedAssignment
Variable `parent` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/ParamTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output) throws JellyTagException {
        MessageTag parent = null;
        Tag t = findAncestorWithClass(this, MessageTag.class);
        if (t != null) {
```

### UnusedAssignment
Variable `valueInput` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/ParamTag.java`
#### Snippet
```java
        }

        Object valueInput = null;
        if (this.value != null) {
            valueInput = this.value.evaluate(context);
```

### UnusedAssignment
Variable `locCtxt` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
     */
    public static LocalizationContext getLocalizationContext(JellyContext jc) {
        LocalizationContext locCtxt = null;

        Object obj = jc.getVariable(Config.FMT_LOCALIZATION_CONTEXT);
```

### UnusedAssignment
Variable `bundle` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
    String basename) {
        LocalizationContext locCtxt = null;
        ResourceBundle bundle = null;

        if ((basename == null) || basename.equals("")) {
```

### UnusedAssignment
Variable `keyInput` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/MessageTag.java`
#### Snippet
```java
    public void doTag(XMLOutput output) throws JellyTagException {

        Object keyInput = null;
        if (this.key != null) {
            keyInput = this.key.evaluate(context);
```

### UnusedAssignment
Variable `formatted` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
            DateFormat.getAvailableLocales());

        String formatted = null;
        if (locale != null) {
            DateFormat formatter = createFormatter(locale);
```

### UnusedAssignment
Variable `tz` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java

            // Set time zone
            TimeZone tz = null;
            if ((etimeZone instanceof String)
            && ((String) etimeZone).equals("")) {
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java

    private DateFormat createFormatter(Locale loc) throws JellyTagException {
        DateFormat formatter = null;

        if ((etype == null) || DATE.equalsIgnoreCase(etype)) {
```

### UnusedAssignment
Variable `image` initializer `null` is redundant
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/ImageTag.java`
#### Snippet
```java
        }

        Image image = null;

        if (getSrc() != null) {
```

### UnusedAssignment
Variable `ret` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
    public static Locale parseLocale(String locale, String variant) {

        Locale ret = null;
        String language = locale;
        String country = null;
```

### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
        String language = locale;
        String country = null;
        int index = -1;

        if (((index = locale.indexOf(HYPHEN)) > -1)
```

### UnusedAssignment
Variable `locale` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
     */
    public void doTag(XMLOutput output) throws JellyTagException {
        Locale locale = null;

        Object valueInput = null;
```

### UnusedAssignment
Variable `locCtxt` initializer `null` is redundant
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
    Locale[] avail) {

        LocalizationContext locCtxt = null;

        // Get formatting locale from enclosing <fmt:bundle>
```

### UnusedAssignment
Variable `point` initializer `null` is redundant
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
     */
    protected void setSize(Control control, Object size) {
        Point point = null;
        if (size != null) {
            if (size instanceof Point) {
```

### UnusedAssignment
Variable `rgb` initializer `null` is redundant
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
        Color color = null;
        if (colorValue != null) {
            RGB rgb = null;
            if (color instanceof Color) {
                color = (Color) colorValue;
```

### UnusedAssignment
Variable `colorValue` initializer `0` is redundant
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/ColorConverter.java`
#### Snippet
```java
            throw new IllegalArgumentException(usageText);
        }
        int colorValue = 0;
        try {
            colorValue = Integer.parseInt(value.substring(1), 16);
```

### UnusedAssignment
Variable `window` initializer `null` is redundant
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceLayoutDataTag.java`
#### Snippet
```java
    protected void processBean(String var, Object bean) throws JellyTagException {
        Widget parent = getParentWidget();
        Window window = null;
        if (parent == null) {
            window = getParentWindow();
```

### UnusedAssignment
Variable `genFile` initializer `null` is redundant
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java
        }

        File genFile = null;

        if ( "".equals( packageName ) )
```

### UnusedAssignment
Variable `eachGrammar` initializer `null` is redundant
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java

        Iterator grammarIter = this.grammars.iterator();
        String eachGrammar = null;

        String sourceDir = (String) getContext().getVariable( "maven.antlr.src.dir" );
```

### UnusedAssignment
Variable `grammar` initializer `null` is redundant
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java

        String sourceDir = (String) getContext().getVariable( "maven.antlr.src.dir" );
        File grammar = null;

        while ( grammarIter.hasNext() )
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
     */
    public JellyContext runScript(String uri, XMLOutput output) throws JellyException {
        URL url = null;
        try {
            url = getResource(uri);
```

### UnusedAssignment
Variable `newJellyContextURL` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        Script script = compileScript(source);

        URL newJellyContextURL = null;
        try {
            newJellyContextURL = getJellyContextURL(source);
```

### UnusedAssignment
Variable `script` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        parser.setContext(this);

        Script script = null;
        try {
            script = parser.parse(source);
```

### UnusedAssignment
Variable `script` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
            throw new JellyException("Could not find Jelly script: " + uri);
        }
        Script script = null;
        try {
            script = parser.parse(in);
```

### UnusedAssignment
Variable `script` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        parser.setContext(this);

        Script script = null;
        try {
            script = parser.parse(url.toString());
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
    public JellyContext runScript(String uri, XMLOutput output,
                          boolean export, boolean inherit) throws JellyException {
        URL url = null;
        try {
            url = getResource(uri);
```

### UnusedAssignment
Variable `throwableClass` initializer `null` is redundant
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertThrowsTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws JellyTagException {
        Class throwableClass = null;
        try {
             throwableClass = getThrowableClass();
```

### UnusedAssignment
Variable `throwableClass` initializer `null` is redundant
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertThrowsTag.java`
#### Snippet
```java
        }

        Class throwableClass = null;
        try {
            throwableClass = getClassLoader().loadClass(expected);
```

### UnusedAssignment
Variable `newClassLoader` initializer `null` is redundant
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/ClassLoaderTag.java`
#### Snippet
```java
        }

        URLClassLoader newClassLoader = null;

        try {
```

### UnusedAssignment
Variable `theClass` initializer `null` is redundant
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/BeanTag.java`
#### Snippet
```java
        }

        Class theClass = null;
        try {
            ClassLoader classLoader = getClassLoader();
```

### UnusedAssignment
Variable `theClass` initializer `null` is redundant
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/IntrospectorTag.java`
#### Snippet
```java
        else {
            // lets try load the class of this name
            Class theClass = null;
            try {
                theClass = Thread.currentThread().getContextClassLoader().loadClass( name );
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/IntrospectorTag.java`
#### Snippet
```java
            }

            Object object = null;
            try {
                object = theClass.newInstance();
```

### UnusedAssignment
Variable `theClass` initializer `null` is redundant
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/ParseTag.java`
#### Snippet
```java
        reader.setXMLIntrospector(getIntrospector());

        Class theClass = null;
        try {
            theClass = getClassLoader().loadClass( rootClass );
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/ParseTag.java`
#### Snippet
```java
        }

        Object value = null;
        if ( uri != null ) {
            invokeBody(output);
```

### UnusedAssignment
Variable `delta` initializer `null` is redundant
in `jelly-tags/xmlunit/src/main/java/org/apache/commons/jelly/tags/xmlunit/AssertDocumentsEqualTag.java`
#### Snippet
```java
            XMLUnit.setIgnoreWhitespace(ignoreWhitespace);

            Diff delta = null;
            try {
                delta = new Diff(
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/SetTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    public void doTag(XMLOutput output) throws JellyTagException {
        Object answer = null;
        if ( value != null ) {
            answer = value.evaluate(context);
```

### UnusedAssignment
Variable `in` initializer `null` is redundant
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/VerifierTag.java`
#### Snippet
```java
        }

        InputStream in = null;
        if ( uri != null ) {
            in = context.getResourceAsStream( uri );
```

### UnusedAssignment
Variable `verifier` initializer `null` is redundant
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/VerifierTag.java`
#### Snippet
```java
        }

        Verifier verifier = null;
        try {
            Schema schema = null;
```

### UnusedAssignment
Variable `schema` initializer `null` is redundant
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/VerifierTag.java`
#### Snippet
```java
        Verifier verifier = null;
        try {
            Schema schema = null;
            if (systemId != null) {
                schema = getFactory().compileSchema(in, systemId);
```

### UnusedAssignment
Variable `valid` initializer `false` is redundant
in `jelly-tags/validate/src/main/java/org/apache/commons/jelly/tags/validate/ValidateTag.java`
#### Snippet
```java
            throw new MissingAttributeException("verifier");
        }
        boolean valid = false;

        // evaluate the body using the current Verifier
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`line.indexOf(match) != -1` can be replaced with 'line.contains(match)'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertFileContainsTag.java`
#### Snippet
```java
                    while ((line = br.readLine()) != null)
                    {
                        if (line.indexOf(match) != -1)
                        {
                            found = true;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `l.size() == 0` is always `false`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
                if(value instanceof List) {
                    List l = (List) value;
                    if (l.size() == 0)
                        value=null;
                    else
```

### ConstantValue
Condition `e instanceof IllegalStateException` is always `false`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java
        		if (e instanceof RuntimeException)
        			throw (RuntimeException)e;
        		if (e instanceof IllegalStateException)
        			throw (IllegalStateException )e;
            	throw (IllegalStateException)new IllegalStateException (e.getMessage()).initCause(e);
```

### ConstantValue
Condition `!firstTime` is always `false`
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                        // set first time up for the next iteration.
                        if (firstTime) {
                            firstTime = !firstTime;
                        }
                    }
```

### ConstantValue
Value `firstTime` is always 'true'
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                        // set first time up for the next iteration.
                        if (firstTime) {
                            firstTime = !firstTime;
                        }
                    }
```

### ConstantValue
Condition `etchType != EtchedBorder.LOWERED || etchType != EtchedBorder.RAISED` is always `true`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EtchedBorderTag.java`
#### Snippet
```java
            throw new MissingAttributeException("highlight must be supplied when shadow is supplied");
        }
        if( etchType != EtchedBorder.LOWERED || etchType != EtchedBorder.RAISED ) {
            if( log.isDebugEnabled() ) log.debug( "etchType set to [" + etchType + "], which is invalid. Resetting to -1" );
        }
```

### ConstantValue
Condition `etchType != EtchedBorder.RAISED` is always `true` when reached
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/EtchedBorderTag.java`
#### Snippet
```java
            throw new MissingAttributeException("highlight must be supplied when shadow is supplied");
        }
        if( etchType != EtchedBorder.LOWERED || etchType != EtchedBorder.RAISED ) {
            if( log.isDebugEnabled() ) log.debug( "etchType set to [" + etchType + "], which is invalid. Resetting to -1" );
        }
```

### ConstantValue
Value `answer` is always 'null'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
        Object answer = null;
        if (rowIndex < 0 || rowIndex >= rows.size()) {
            return answer;
        }
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
```

### ConstantValue
Value `answer` is always 'null'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
        }
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
            return answer;
        }
        Object row = rows.get(rowIndex);;
```

### ConstantValue
Value `answer` is always 'null'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
        ExpressionTableColumn column = (ExpressionTableColumn) columnModel.getColumn(columnIndex);
        if (row == null || column == null) {
            return answer;
        }
        return column.evaluateValue(this, row, rowIndex, columnIndex);
```

### ConstantValue
Value `answer` is always 'null'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
        String answer = null;
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
            return answer;
        }
        Object value = columnModel.getColumn(columnIndex).getHeaderValue();
```

### ConstantValue
Value `answer` is always 'null'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
            return value.toString();
        }
        return answer;
    }

```

### ConstantValue
Condition `f == null` is always `false`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/ColorConverter.java`
#### Snippet
```java
                    // could it be this is already somewhere: get the value of  a static final by string
                    Field f = SystemColor.class.getField(s);
                    if (f == null
                        || !Modifier.isStatic(f.getModifiers())
                        || !Modifier.isFinal(f.getModifiers())
```

### ConstantValue
Condition `guarantee==null` is always `false`
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/SecurityHandlerTag.java`
#### Snippet
```java
            data=data.get("transport-guarantee");
            String guarantee = data.toString(false,true).toUpperCase();
            if (guarantee==null || guarantee.length()==0 ||
                "NONE".equals(guarantee))
                scBase.setDataConstraint(SecurityConstraint.DC_NONE);
```

### ConstantValue
Condition `is != null` is always `true`
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/PropertiesTag.java`
#### Snippet
```java
        }
        finally {
            if (is != null) {
                try {
                    is.close();
```

### ConstantValue
Condition `project == null` is always `false`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
    public Project getAntProject() {
        Project project = AntTagLibrary.getProject(context);
        if (project == null) {
            throw new NullPointerException("No Ant Project object is available");
        }
```

### ConstantValue
Condition `++aryCount > 4` is always `false`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceUtil.java`
#### Snippet
```java
                    paramString[aryCount] = params.substring(begin, index);
                    begin = index + 1;
                    if (++aryCount > 4) {
                        throw new JellyTagException(Resources.getMessage("JDBC_PARAM_COUNT"));
                    }
```

### ConstantValue
Condition `tag != null` is always `true` when reached
in `jelly-tags/jsl/src/main/java/org/apache/commons/jelly/tags/jsl/TemplateTag.java`
#### Snippet
```java

        Rule rule = createRule(tag, output);
        if ( rule != null && tag != null) {
            rule.setMode( mode );
            tag.addTemplate( rule );
```

### ConstantValue
Value `bean` is always 'null'
in `jelly-tags/jmx/src/main/java/org/apache/commons/jelly/tags/jmx/OperationTag.java`
#### Snippet
```java
        }
        catch (Exception e) {
            throw new JellyTagException("Failed to register bean: " + bean, e);
        }
        finally {
```

### ConstantValue
Condition `field == null` is always `false`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtHelper.java`
#### Snippet
```java
        try {
            Field field = constantClass.getField(text);
            if (field == null) {
                log.warn( "Unknown style code: " + text +" will be ignored");
                return 0;
```

### ConstantValue
Condition `language == null` is always `false`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
        }

        if ((language == null) || (language.length() == 0)) {
            throw new IllegalArgumentException("Missing language");
        }
```

### ConstantValue
Condition `!drawableParent` is always `false` when reached
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/GCTag.java`
#### Snippet
```java
        final boolean drawableParent = drawable instanceof Drawable;

        if (nullDrawable || !drawableParent) {
            throw new JellyTagException(
                "This tag must specify a Drawable attribute (ie. Image or Control)"
```

### ConstantValue
Value `drawableParent` is always 'true'
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/GCTag.java`
#### Snippet
```java
        final boolean drawableParent = drawable instanceof Drawable;

        if (nullDrawable || !drawableParent) {
            throw new JellyTagException(
                "This tag must specify a Drawable attribute (ie. Image or Control)"
```

### ConstantValue
Condition `constructor != null` is always `true`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java
            try {
                Constructor constructor = theClass.getConstructor(types);
                if (constructor != null) {
                    Object[] values = { new Integer(style)};
                    return constructor.newInstance(values);
```

### ConstantValue
Condition `field != null` is always `true`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java
                    // lets first see if there's a field available
                    Field field = theClass.getField(name);
                    if (field != null) {
                        if (value instanceof String) {
                            value = ConvertUtils.convert((String) value, field.getType());
```

### ConstantValue
Condition `color instanceof Color` is always `false`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
        if (colorValue != null) {
            RGB rgb = null;
            if (color instanceof Color) {
                color = (Color) colorValue;
            } else {
```

### ConstantValue
Value `color` is always 'null'
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
        if (colorValue != null) {
            RGB rgb = null;
            if (color instanceof Color) {
                color = (Color) colorValue;
            } else {
```

### ConstantValue
Condition `constructor != null` is always `true`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
                Class[] types = { int.class };
                Constructor constructor = theClass.getConstructor(types);
                if (constructor != null) {
                    Object[] arguments = { new Integer(style)};
                    return constructor.newInstance(arguments);
```

### ConstantValue
Condition `constructors != null` is always `true`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
                // lets try to find the constructor with 2 arguments with the 2nd argument being an int
                Constructor[] constructors = theClass.getConstructors();
                if (constructors != null) {
                    for (int i = 0, size = constructors.length; i < size; i++) {
                        Constructor constructor = constructors[i];
```

### ConstantValue
Condition `constructor != null` is always `true`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/preference/FieldEditorTag.java`
#### Snippet
```java
            Class[] types = { String.class, String.class, Composite.class };
            Constructor constructor = theClass.getConstructor(types);
            if (constructor != null) {
                Object[] arguments = { name, labelText, parentComposite };
                return constructor.newInstance(arguments);
```

### ConstantValue
Value `url` is always 'null'
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java

        if (url == null) {
            throw new JellyException("Could not find Jelly script: " + url);
        }
        return runScript(url, output, JellyContext.DEFAULT_EXPORT,
```

### ConstantValue
Condition `value == null` is always `true`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        if (definedHere) return value;

        if ( value == null && isInherit() ) {
            JellyContext parentContext = getParent();
            if (parentContext != null) {
```

### ConstantValue
Condition `answer == null` is always `true`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        if (definedHere) return answer;

        if ( answer == null && parent != null ) {
            answer = parent.findVariable(name);
        }
```

### ConstantValue
Value `rootURL` is always 'null'
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
     */
    public JellyContext() {
        this.currentURL = rootURL;
        init();
    }
```

### ConstantValue
Value `url` is always 'null'
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java

        if (url == null) {
            throw new JellyException("Could not find Jelly script: " + url);
        }

```

### ConstantValue
Condition `object == null` is always `false`
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/IntrospectorTag.java`
#### Snippet
```java
                return (NameMapper) object;
            }
            if ( object == null ) {
                throw new ConversionException( "No NameMapper created for type: " + name );
            }
```

### ConstantValue
Condition `type.equals("Long")` is always `false`
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/PropertyTag.java`
#### Snippet
```java
                propClass = Double.TYPE;
            }
            else if (type.equals("Long")) {
                propClass = Long.TYPE;
            }
```

### ConstantValue
Condition `props == null` is always `false`
in `jelly-tags/dynabean/src/main/java/org/apache/commons/jelly/tags/dynabean/DynaclassTag.java`
#### Snippet
```java
                new DynaProperty[propList.size()]);

        if (props == null) {
            throw new JellyTagException("No properties list");
        }
```

## RuleId[id=IOResource]
### IOResource
'ByteArrayISO8859Writer' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/ResponseBodyTag.java`
#### Snippet
```java
        }

        ByteArrayISO8859Writer writer = new ByteArrayISO8859Writer(1500);
        try {
             writer.write(getBodyText());
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java
        InputStream is = request.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[1024];
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `core/src/main/java/org/apache/commons/jelly/expression/ExpressionSupport.java`
#### Snippet
```java
public abstract class ExpressionSupport implements Expression {

    protected static final Iterator EMPTY_ITERATOR = Collections.EMPTY_LIST.iterator();

    // inherit javadoc from interface
```

### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `core/src/main/java/org/apache/commons/jelly/expression/CompositeExpression.java`
#### Snippet
```java
        String value = evaluateAsString(context);
        if ( value == null ) {
            return Collections.EMPTY_LIST.iterator();
        }
        else {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Resources` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/commons/jelly/tags/Resources.java`
#### Snippet
```java
 * @author Shawn Bayern
 */
public class Resources {

    //*********************************************************************
```

### UtilityClassWithoutPrivateConstructor
Class `ClassLoaderUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/org/apache/commons/jelly/util/ClassLoaderUtils.java`
#### Snippet
```java
 * A class to centralize the class loader management code.
 */
public class ClassLoaderUtils {

    /** log for debug etc output */
```

### UtilityClassWithoutPrivateConstructor
Class `DataSourceUtil` has only 'static' members, and lacks a 'private' constructor
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceUtil.java`
#### Snippet
```java
 * @author Justyna Horwat
 */
public class DataSourceUtil {

    private static final String ESCAPE = "\\";
```

### UtilityClassWithoutPrivateConstructor
Class `ResultSupport` has only 'static' members, and lacks a 'private' constructor
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultSupport.java`
#### Snippet
```java
 * @author Justyna Horwat
 */
public class ResultSupport {


```

### UtilityClassWithoutPrivateConstructor
Class `Config` has only 'static' members, and lacks a 'private' constructor
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/Config.java`
#### Snippet
```java
 * @version 1.1
 */
public class Config {

    /*
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
            return answer;
        }
        Object row = rows.get(rowIndex);;
        ExpressionTableColumn column = (ExpressionTableColumn) columnModel.getColumn(columnIndex);
        if (row == null || column == null) {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
            return tableColumns;
        }
    };


```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
    public void processingInstruction(String target, String data)
        throws SAXException {
        ; // No processing is required
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
    public void ignorableWhitespace(char buffer[], int start, int len)
        throws SAXException {
        ; // No processing required
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     */
    public void skippedEntity(String name) throws SAXException {
        ; // No processing required
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/PropertiesTag.java`
#### Snippet
```java
                    is.close();
                } catch (IOException ioe) {
                    ;
                }   
            }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `Jelly.class.getResourceAsStream(name)` might be null
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        try {
            java.io.StringWriter w = new java.io.StringWriter();
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
            while ( (r=in.read()) >= 0 ) {
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
            ex.printStackTrace();
            try {
                in.close();
            } catch (Exception e) {
            }
```

### DataFlowIssue
Method invocation `setValue` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jelly/tags/core/NewTag.java`
#### Snippet
```java
                context.setVariable(var, object);
            } else {
                parentArg.setValue(object);
            }
        }
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Set entrySet() {
        return null;
    }

```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Collection values() {
        return null;
    }
}
```

### DataFlowIssue
`null` is returned by the method declared as @NotNull
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Set keySet() {
        return null;
    }

```

### DataFlowIssue
Method invocation `setCount` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    if (statusVar != null) {
                        count++;
                        status.setCount(count);
                        status.setCurrent(value);
                        status.setFirst(firstTime);
```

### DataFlowIssue
Method invocation `setLast` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java

                    if (statusVar != null) {
                        status.setLast(finished || !iter.hasNext() || index > end);
                    }
                    invokeBody(output);
```

### DataFlowIssue
Argument `p` might be null
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
                                Point.class);
                    }
                    component.setLocation(p);
                    addIgnoreProperty("location");
                }
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                finally {
                    try {
                        in.close();
                    }
                    catch (Exception e) {
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/AvailableTag.java`
#### Snippet
```java
                InputStream is = url.openStream();
                available = (is != null);
                is.close();
            } catch (MalformedURLException e) {
                throw new JellyTagException(e);
```

### DataFlowIssue
Variable is already assigned to this value
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ParamTag.java`
#### Snippet
```java
        Object paramValue = value;
        if (value != null) {
            paramValue = value;
        }
        else {
```

### DataFlowIssue
Variable is already assigned to this value
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
                try {
                    ctor = type.getConstructor(new Class[] { Project.class });
                    noArg = false;
                } catch (NoSuchMethodException nsme) {
                    log.info("datatype '" + name
```

### DataFlowIssue
Argument `ctor` might be null
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            }
            else {
                dataType = createDataType(ctor, new Object[] { getAntProject() }, name, "an Ant project");
            }
            if (dataType != null && dataType instanceof DataType) {
```

### DataFlowIssue
Method invocation `getConnection` may produce `NullPointerException`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/TransactionTag.java`
#### Snippet
```java

        try {
            conn = dataSource.getConnection();
            origIsolation = conn.getTransactionIsolation();
            if (origIsolation == Connection.TRANSACTION_NONE) {
```

### DataFlowIssue
Method invocation `getConnection` may produce `NullPointerException`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SqlTagSupport.java`
#### Snippet
```java
            DataSource dataSource = DataSourceUtil.getDataSource(rawDataSource, context);
            try {
                conn = dataSource.getConnection();
            }
            catch (Exception ex) {
```

### DataFlowIssue
Variable is already assigned to this value
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
        if (style != null) {
            if (DEFAULT.equalsIgnoreCase(style)) {
                ret = DateFormat.DEFAULT;
            } else if (SHORT.equalsIgnoreCase(style)) {
                ret = DateFormat.SHORT;
```

### DataFlowIssue
Variable is already assigned to this value
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
                ret = DateFormat.SHORT;
            } else if (MEDIUM.equalsIgnoreCase(style)) {
                ret = DateFormat.MEDIUM;
            } else if (LONG.equalsIgnoreCase(style)) {
                ret = DateFormat.LONG;
```

### DataFlowIssue
Argument `epattern` might be null
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
            if (pattern != null) {
                try {
                    ((SimpleDateFormat) formatter).applyPattern(epattern);
                } catch (ClassCastException cce) {
                    formatter = new SimpleDateFormat(epattern, locale);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
        } else {
            // no formatting locale available, use Date.toString()
            formatted = date.toString();
        }

```

### DataFlowIssue
Condition `drawable instanceof Drawable` is redundant and can be replaced with a null check
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/GCTag.java`
#### Snippet
```java

        final boolean nullDrawable = drawable == null;
        final boolean drawableParent = drawable instanceof Drawable;

        if (nullDrawable || !drawableParent) {
```

### DataFlowIssue
Method invocation `getDisplay` may produce `NullPointerException`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceImageTag.java`
#### Snippet
```java
        }

        Image image = new Image(parent.getDisplay(), getSrc());
        if (window != null) {
            setWindowImage(window, image);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertEqualsTag.java`
#### Snippet
```java
            return;
        }
        if (actualValue != null && expectedValue.equals(actualValue)) {
            return;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
     */
    public JellyContext() {
        this.currentURL = rootURL;
        init();
    }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
                if (arg.startsWith("-") && arg.length() > 1) {
                    if (!(builtinOptionNames.contains(arg))) {
                        cmdLineOptions.addOption(arg.substring(1, arg.length()), true, "dynamic option");
                    }
                }
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
            System.err.println("Jelly " + Jelly.getJellyVersion());
            System.err.println(" compiled: " + Jelly.getJellyBuildDate());
            System.err.println("");
            System.exit(1);
        }
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java

    protected int recognizeOption(String value) {
        value = value.toString().toLowerCase();

        if ("log".equals(value) || "log_option".equals(value)) {
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `equals()` overloads a compatible method of a superclass, when overriding might have been intended
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java
    }

    public synchronized boolean equals(RunnableStatus status) {
        return status.get() == this.status;
    }
```

### MethodOverloadsParentMethod
Method `equals()` overloads a compatible method of a superclass, when overriding might have been intended
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java
    }

    public synchronized boolean equals(int status) {
        return this.status == status;
    }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'suppressExpressionExceptions' is still used
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
	 * @deprecated after v1.1, exceptions will never be suppressed
     */
    private boolean suppressExpressionExceptions;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'isSuppressExpressionExceptions' is still used
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
	 * @deprecated after v1.1, exceptions will never be suppressed
	 */
	public boolean isSuppressExpressionExceptions() {
		return suppressExpressionExceptions;
	}
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'context' in a Serializable class
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableModel.java`
#### Snippet
```java
public class ExpressionTableModel extends AbstractTableModel {

    private JellyContext context;
    private List rows = new ArrayList();
    private MyTableColumnModel columnModel = new MyTableColumnModel();
```

### NonSerializableFieldInSerializableClass
Non-serializable field '_xmlOutput' in a Serializable class
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java

    /** The place where to output the results of the tag body */
    private XMLOutput _xmlOutput;

    /** Creates a new instance of JellyResourceHttpHandler */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'context' in a Serializable class
in `jelly-tags/beanshell/src/main/java/org/apache/commons/jelly/tags/beanshell/JellyInterpreter.java`
#### Snippet
```java
    private static final Log log = LogFactory.getLog( JellyInterpreter.class );

    private JellyContext context;

    public JellyInterpreter() {
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
    }
    
    public Throwable getCause() {
        return cause;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `core/src/main/java/org/apache/commons/jelly/util/NestedRuntimeException.java`
#### Snippet
```java
    }

    public Throwable getCause() {
        return cause;
    }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java
    }

    public Throwable getCause() {
        return cause;
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
            try {
                in.close();
            } catch (Exception e) {
            }
            throw new IllegalStateException("Resource \"" + name + "\" not found.");
```

### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/org/apache/commons/jelly/tags/core/FileTag.java`
#### Snippet
```java
        }
        finally {
            try { newOutput.close(); } catch (IOException e) {}
        }
    }
```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/task/AntJellyContext.java`
#### Snippet
```java
            try {
                answerString = answer.toString();
            } catch (Exception ex) {
            }
            if (answerString == null && answer != null)
```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/util/src/main/java/org/apache/commons/jelly/tags/util/PropertiesTag.java`
#### Snippet
```java
                try {
                    is.close();
                } catch (IOException ioe) {
                    ;
                }   
```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
        try {
            r = o.toString();
        } catch (Exception ex) {}
        if(r == null)
            r = "(object of class " + o.getClass() + ")";
```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
                }
            }
        } catch (MissingResourceException mre) {
        }

```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/JellyThread.java`
#### Snippet
```java
                runningMutex.acquire();
                break;
            } catch (InterruptedException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/JellyThread.java`
#### Snippet
```java
                    throw new TimeoutException("max wait time exceeded");
                }
            } catch (InterruptedException e) {
            }
        }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ElementTag.java`
#### Snippet
```java
             * before any content is output.
             */
            protected void initialize() throws SAXException {
                if (!outputAttributes) {
                    super.startElement(namespace, localName, name, attributes);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                    return converter.convert(klass,value);
                } catch (ConversionException e) {
                    throw new JellyTagException("Can't convert " + value + " to " + klass + " (" + e.toString() + ")",e);
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/org/apache/commons/jelly/servlet/JellyServlet.java`
#### Snippet
```java
        cause.printStackTrace(new PrintWriter(sw));

        html.append(sw.toString());
        html.append("</pre>");
        html.append("</body>");
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `TagBodyInputSource` may be 'static'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
      *
      */
    private class TagBodyInputSource extends InputSource {

        /**
```

### InnerClassMayBeStatic
Inner class `ExpressionSupportLocal` may be 'static'
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpressionFactory.java`
#### Snippet
```java
    }

    private class ExpressionSupportLocal extends ExpressionSupport {

        protected Expression jexlExpression = null;
```

### InnerClassMayBeStatic
Inner class `MyStringPart` may be 'static'
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/PartTag.java`
#### Snippet
```java
     * Extend StringPart so that I can specify the content type (ex: text/plain)
     */
    private class MyStringPart extends StringPart {
      String _contentType;
      public MyStringPart(String name, String value, String contentType) {
```

### InnerClassMayBeStatic
Inner class `WizardDialogImpl` may be 'static'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/wizard/WizardDialogTag.java`
#### Snippet
```java
     * Provide a public method getWizard
     */
    class WizardDialogImpl extends WizardDialog {
        public WizardDialogImpl(Shell parentShell, IWizard newWizard) {
            super(parentShell, newWizard);
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
        // (and so create a BSFManager for a context)
        synchronized (getRegistry()) {
            getRegistry().setJellyContext(context);

            try {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
            try {
                // XXXX: hack - there must be a better way!!!
                for ( Iterator iter = context.getVariableNames(); iter.hasNext(); ) {
                    String name = (String) iter.next();
                    Object value = context.getVariable( name );
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `context` accessed in synchronized context
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/ScriptTag.java`
#### Snippet
```java
                for ( Iterator iter = context.getVariableNames(); iter.hasNext(); ) {
                    String name = (String) iter.next();
                    Object value = context.getVariable( name );
                    manager.declareBean( name, value, value.getClass() );
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     */
    public synchronized XMLReader getXMLReader() throws SAXException {
        if (reader == null) {
            reader = getParser().getXMLReader();
            if (!allowDtdToCallExternalEntities) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
    public synchronized XMLReader getXMLReader() throws SAXException {
        if (reader == null) {
            reader = getParser().getXMLReader();
            if (!allowDtdToCallExternalEntities) {
                reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            reader = getParser().getXMLReader();
            if (!allowDtdToCallExternalEntities) {
                reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
                reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            if (!allowDtdToCallExternalEntities) {
                reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
                reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                reader.setFeature("http://xml.org/sax/features/external-general-entities", false);
                reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            }
            if (this.defaultNamespaceURI != null) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            }
            if (this.defaultNamespaceURI != null) {
                reader = new DefaultNamespaceFilter(this.defaultNamespaceURI,reader);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            }
            if (this.defaultNamespaceURI != null) {
                reader = new DefaultNamespaceFilter(this.defaultNamespaceURI,reader);
            }
        }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        }
        //set up the parse
        reader.setContentHandler(this);
        reader.setDTDHandler(this);
        //reader.setEntityResolver(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        //set up the parse
        reader.setContentHandler(this);
        reader.setDTDHandler(this);
        //reader.setEntityResolver(this);
        reader.setErrorHandler(this);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        reader.setDTDHandler(this);
        //reader.setEntityResolver(this);
        reader.setErrorHandler(this);

        return reader;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `reader` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        reader.setErrorHandler(this);

        return reader;
    }

```

### PublicFieldAccessedInSynchronizedContext
Non-private field `factory` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        synchronized (this) {
            try {
                if (factory == null) {
                    factory = SAXParserFactory.newInstance();
                }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `factory` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            try {
                if (factory == null) {
                    factory = SAXParserFactory.newInstance();
                }
                factory.setNamespaceAware(true);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `factory` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                    factory = SAXParserFactory.newInstance();
                }
                factory.setNamespaceAware(true);
                factory.setValidating(validating);
                parser = factory.newSAXParser();
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `factory` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                }
                factory.setNamespaceAware(true);
                factory.setValidating(validating);
                parser = factory.newSAXParser();
                return (parser);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `validating` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                }
                factory.setNamespaceAware(true);
                factory.setValidating(validating);
                parser = factory.newSAXParser();
                return (parser);
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `parser` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                factory.setNamespaceAware(true);
                factory.setValidating(validating);
                parser = factory.newSAXParser();
                return (parser);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `factory` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                factory.setNamespaceAware(true);
                factory.setValidating(validating);
                parser = factory.newSAXParser();
                return (parser);
            }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `parser` accessed in synchronized context
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                factory.setValidating(validating);
                parser = factory.newSAXParser();
                return (parser);
            }
            catch (Exception e) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
        if (Thread.interrupted()) throw new InterruptedException();
        synchronized (this) {
            if (!inuse_) {
                inuse_ = true;
                return true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
        synchronized (this) {
            if (!inuse_) {
                inuse_ = true;
                return true;
            } else if (msecs <= 0)
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                    for (; ;) {
                        wait(waitTime);
                        if (!inuse_) {
                            inuse_ = true;
                            return true;
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
                        wait(waitTime);
                        if (!inuse_) {
                            inuse_ = true;
                            return true;
                        } else {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java

    public synchronized void release() {
        inuse_ = false;
        notify();
    }
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
        synchronized (this) {
            try {
                while (inuse_) wait();
                inuse_ = true;
            } catch (InterruptedException ex) {
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `inuse_` accessed in synchronized context
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/Mutex.java`
#### Snippet
```java
            try {
                while (inuse_) wait();
                inuse_ = true;
            } catch (InterruptedException ex) {
                notify();
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
            call.setOperationName(new QName(namespace, method));

            if ( username != null && !username.equals("") ) {
                call.setUsername( username );
                call.setPassword( password );
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java

        private boolean isRootNodeDefaultNs(String prefix, String uri) {
            return ("".equals(prefix) && "".equals(uri) && nsStack.size() == 1);
        }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java

        private boolean isRootNodeDefaultNs(String prefix, String uri) {
            return ("".equals(prefix) && "".equals(uri) && nsStack.size() == 1);
        }

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
    throws SAXException {

        if (uri.equals("")) {
            super.startElement(this.uriDefault,localName,qName,atts);
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
    public void endElement(String namespaceURI, String localName, String qName)
    throws SAXException {
        if (namespaceURI.equals("")) {
            super.endElement(this.uriDefault,localName,qName);
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
    throws SAXException {

        if (uri.equals("")) {
            super.startPrefixMapping(prefix,this.uriDefault);
        } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/interaction/src/main/java/org/apache/commons/jelly/tags/interaction/AskTag.java`
#### Snippet
```java
                input = input.trim();

                if (defaultInput != null && input.trim().equals("")) {
                    input = defaultInput;
                }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/TimeZoneTag.java`
#### Snippet
```java
        }
        else if (valueInput instanceof String) {
            if (((String) valueInput).trim().equals("")) {
                timeZone = TimeZone.getTimeZone("GMT");
            } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetTimeZoneTag.java`
#### Snippet
```java
        }
        else if (valueInput instanceof String) {
            if (((String) valueInput).trim().equals("")) {
                timeZone = TimeZone.getTimeZone("GMT");
            } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
        ResourceBundle bundle = null;

        if ((basename == null) || basename.equals("")) {
            return new LocalizationContext();
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java
            TimeZone tz = null;
            if ((etimeZone instanceof String)
            && ((String) etimeZone).equals("")) {
                etimeZone = null;
            }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/SetLocaleTag.java`
#### Snippet
```java
            locale = Locale.getDefault();
        } else if (valueInput instanceof String) {
            if (((String) valueInput).trim().equals("")) {
                locale = Locale.getDefault();
            } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java
        File genFile = null;

        if ( "".equals( packageName ) )
        {
            genFile = new File( getOutputDir(),
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java
        		if (e instanceof IllegalStateException)
        			throw (IllegalStateException )e;
            	throw (IllegalStateException)new IllegalStateException (e.getMessage()).initCause(e);
        	}
        }
```

### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java
                log.error("Error constructing xpath", e);
            else
            	throw (IllegalStateException)new IllegalStateException (e.getMessage()).initCause(e);
        }

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
      */
    public void setAsString(boolean asString) {
        this.asString = new Boolean(asString);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        */
    public void setSingle(boolean single) {
        this.single = new Boolean(single);
    }
    
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Integer(((Number)value).intValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Short(((Number)value).shortValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Double(((Number)value).doubleValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Float(((Number)value).floatValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Byte(((Number)value).byteValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
                public Object convert(Class klass, Object value) {
                    if(value instanceof Number) {
                        return new Long(((Number)value).longValue());
                    } else {
                        return inner.convert(klass,value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                {
                    // set up statii as required by JSTL
                    Integer statusBegin = (begin == 0) ? null : new Integer(begin);
                    Integer statusEnd = (end == Integer.MAX_VALUE) ? null : new Integer(end);
                    Integer statusStep = (step == 1) ? null : new Integer(step);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    // set up statii as required by JSTL
                    Integer statusBegin = (begin == 0) ? null : new Integer(begin);
                    Integer statusEnd = (end == Integer.MAX_VALUE) ? null : new Integer(end);
                    Integer statusStep = (step == 1) ? null : new Integer(step);
                    status = new LoopStatus(statusBegin, statusEnd, statusStep);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    Integer statusBegin = (begin == 0) ? null : new Integer(begin);
                    Integer statusEnd = (end == Integer.MAX_VALUE) ? null : new Integer(end);
                    Integer statusStep = (step == 1) ? null : new Integer(step);
                    status = new LoopStatus(statusBegin, statusEnd, statusStep);
                    context.setVariable(statusVar, status);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    }
                    if (indexVar != null) {
                        context.setVariable(indexVar, new Integer(index));
                    }
                    // set the status var up
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    {
                        // set up statii as required by JSTL
                        Integer statusBegin = new Integer(begin);
                        Integer statusEnd = new Integer(end);
                        Integer statusStep = new Integer(step);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                        // set up statii as required by JSTL
                        Integer statusBegin = new Integer(begin);
                        Integer statusEnd = new Integer(end);
                        Integer statusStep = new Integer(step);
                        status = new LoopStatus(statusBegin, statusEnd, statusStep);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                        Integer statusBegin = new Integer(begin);
                        Integer statusEnd = new Integer(end);
                        Integer statusStep = new Integer(step);
                        status = new LoopStatus(statusBegin, statusEnd, statusStep);
                        context.setVariable(statusVar, status);
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/main/java/org/apache/commons/jelly/tags/core/ForEachTag.java`
#### Snippet
```java
                    for (index = begin; index <= end; index += step ) {

                        Object value = new Integer(index);
                        if (varName != null) {
                            context.setVariable(varName, value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableColumn.java`
#### Snippet
```java
        context.setVariable("columns", model.getColumnList());
        context.setVariable("row", row);
        context.setVariable("rowIndex", new Integer(rowIndex));
        context.setVariable("columnIndex", new Integer(columnIndex));

```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableColumn.java`
#### Snippet
```java
        context.setVariable("row", row);
        context.setVariable("rowIndex", new Integer(rowIndex));
        context.setVariable("columnIndex", new Integer(columnIndex));

        // now lets invoke the expression
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java
                result = result | recognizeOption(tok);
            }
            return new Integer(result);
        }
        return null;
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/UpdateTag.java`
#### Snippet
```java
            }
            if (var != null) {
                context.setVariable(var, new Integer(result));
            }

```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java
            && value instanceof String) {
            int style = SwtHelper.parseStyle(SWT.class, (String) value);
            return new Integer(style);
        }
        return super.convertValue(bean, name, value);
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java
                Constructor constructor = theClass.getConstructor(types);
                if (constructor != null) {
                    Object[] values = { new Integer(style)};
                    return constructor.newInstance(values);
                }
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java
                int style =
                    SwtHelper.parseStyle(bean.getClass(), (String) value);
                return new Integer(style);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
                Constructor constructor = theClass.getConstructor(types);
                if (constructor != null) {
                    Object[] arguments = { new Integer(style)};
                    return constructor.newInstance(arguments);
                }
```

### UnnecessaryBoxing
Unnecessary boxing
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
                        if (types.length == 2 && types[1].isAssignableFrom(int.class)) {
                            if (types[0].isAssignableFrom(parent.getClass())) {
                                Object[] arguments = { parent, new Integer(style)};
                                return constructor.newInstance(arguments);
                            }
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `registry`
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFExpression.java`
#### Snippet
```java
        // maybe we could create an expression from a context
        // (and so create a BSFManager for a context)
        synchronized (registry) {
            registry.setJellyContext(context);

```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java

        try {
            if (args.length <= 0) {
                System.out.println("Usage: jelly [scriptFile] [-script scriptFile -o outputFile -Dsysprop=syspropval]");
                return;
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        try {
            java.io.StringWriter w = new java.io.StringWriter();
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
            while ( (r=in.read()) >= 0 ) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
        super.printStackTrace();
        if (cause != null) {
            System.out.println("Root cause");
            cause.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        try {
            if (args.length <= 0) {
                System.out.println("Usage: jelly [scriptFile] [-script scriptFile -o outputFile -Dsysprop=syspropval]");
                return;
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/tags/core/ThreadTag.java`
#### Snippet
```java
            // lets default to system.out
            try {
                xmlOutput = XMLOutput.createXMLOutput( System.out );
            } catch (UnsupportedEncodingException e) {
                throw new JellyTagException(e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/impl/Embedded.java`
#### Snippet
```java
    /** Output(default System.out) */
    private XMLOutput m_output =
        XMLOutput.createXMLOutput(new OutputStreamWriter(System.out));
    /** Exception thrown during compilation of script*/
    Exception m_scriptCompilationException;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
                int ePos = arg.indexOf("=");
                if(ePos==-1 || ePos==0 || ePos==arg.length()-1)
                    System.err.println("Invalid system property: \"" + arg + "\".");
                sysProps.setProperty(arg.substring(0,ePos), arg.substring(ePos+1));
            } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
        }
        if (cmdLine.hasOption("v")) {
            System.err.println("Jelly " + Jelly.getJellyVersion());
            System.err.println(" compiled: " + Jelly.getJellyBuildDate());
            System.err.println("");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
        if (cmdLine.hasOption("v")) {
            System.err.println("Jelly " + Jelly.getJellyVersion());
            System.err.println(" compiled: " + Jelly.getJellyBuildDate());
            System.err.println("");
            System.exit(1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
            System.err.println("Jelly " + Jelly.getJellyVersion());
            System.err.println(" compiled: " + Jelly.getJellyBuildDate());
            System.err.println("");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
            final XMLOutput output = cmdLine.hasOption("o") ?
                    XMLOutput.createXMLOutput(new FileWriter(cmdLine.getOptionValue("o"))) :
                    XMLOutput.createXMLOutput(System.out);

            Jelly jelly = new Jelly();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/task/JellyTask.java`
#### Snippet
```java
    public XMLOutput getXMLOutput() throws IOException {
        if (xmlOutput == null) {
            xmlOutput = XMLOutput.createXMLOutput( System.out );
        }
        return xmlOutput;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java

        logger.setMessageOutputLevel( org.apache.tools.ant.Project.MSG_INFO );
        logger.setOutputPrintStream( System.out );
        logger.setErrorPrintStream( System.err);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
        logger.setMessageOutputLevel( org.apache.tools.ant.Project.MSG_INFO );
        logger.setOutputPrintStream( System.out );
        logger.setErrorPrintStream( System.err);

        project.addBuildListener( logger );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
                // XXX: should we call execute() or perform()?
                // according to org.apache.tools.ant.Main, redirect stdout and stderr
                PrintStream initialOut = System.out;
                PrintStream initialErr = System.err;
                PrintStream newOut = new PrintStream(new DemuxOutputStream(project, false));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
                // according to org.apache.tools.ant.Main, redirect stdout and stderr
                PrintStream initialOut = System.out;
                PrintStream initialErr = System.err;
                PrintStream newOut = new PrintStream(new DemuxOutputStream(project, false));
                PrintStream newErr = new PrintStream(new DemuxOutputStream(project, true));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/interaction/src/main/java/org/apache/commons/jelly/tags/interaction/AskTag.java`
#### Snippet
```java
        if (question != null) {
            if (defaultInput != null) {
                System.out.println(question + " [" + defaultInput + "]");
            } else {
                System.out.println(question);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/interaction/src/main/java/org/apache/commons/jelly/tags/interaction/AskTag.java`
#### Snippet
```java
                System.out.println(question + " [" + defaultInput + "]");
            } else {
                System.out.println(question);
            }
            // The prompt should be just before the user's input,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/PointConverter.java`
#### Snippet
```java
        }

        System.out.println("Converting value: " + value + " into: " + answer);

        return answer;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/ColorConverter.java`
#### Snippet
```java
        }

        System.out.println("Converting value: " + value + " into: " + answer);

        return answer;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/jaxme/src/main/java/org/apache/commons/jelly/tags/jaxme/GeneratorTag.java`
#### Snippet
```java
        generator.setTargetDirectory(getTargetDirectory());
        
        System.out.println("Target: " + getTargetDirectory());
        
        try
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java
        super.printStackTrace();
        if (cause != null) {
            System.out.println("Root cause");
            cause.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyTestSuite.java`
#### Snippet
```java
    public static TestSuite createTestSuite(URL script) throws Exception {
        JellyContext context = new JellyContext(script);
        XMLOutput output = XMLOutput.createXMLOutput(System.out);
        context = context.runScript(script, output);
        TestSuite answer = (TestSuite) context.getVariable("org.apache.commons.jelly.junit.suite");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java
            // lets default to system.out
            try {
                xmlOutput = XMLOutput.createXMLOutput(System.out);
            }
            catch (UnsupportedEncodingException e) {
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
     *  SAXException if the reader cannot be instantiated
     */
    public XMLReader getReader() {
        try {
            return (getXMLReader());
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
	 * @deprecated after v1.1, exceptions will never be suppressed
     */
    private boolean suppressExpressionExceptions;

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
	 * @deprecated after v1.1, exceptions will never be suppressed
	 */
	public void setSuppressExpressionExceptions(boolean suppressExpressionExceptions) {
		this.suppressExpressionExceptions = suppressExpressionExceptions;
	}
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
	 * @deprecated after v1.1, exceptions will never be suppressed
	 */
	public boolean isSuppressExpressionExceptions() {
		return suppressExpressionExceptions;
	}
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'parentGbc != null' covered by subsequent condition 'parentGbc instanceof GridBagConstraintBean'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/GbcTag.java`
#### Snippet
```java
                        parentGbcTag.getConstraints();

                    if (parentGbc != null
                        && parentGbc instanceof GridBagConstraintBean) {
                        gbc.setBasedOn((GridBagConstraintBean) parentGbc);
```

### ConditionCoveredByFurtherCondition
Condition 'dataType != null' covered by subsequent condition 'dataType instanceof DataType'
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
                dataType = createDataType(ctor, new Object[] { getAntProject() }, name, "an Ant project");
            }
            if (dataType != null && dataType instanceof DataType) {
                ((DataType)dataType).setProject( getAntProject() );
            }
```

### ConditionCoveredByFurtherCondition
Condition 'tmp != null' covered by subsequent condition 'tmp instanceof Locale'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
        Locale pref = null; {
            Object tmp = jellyContext.getVariable(Config.FMT_LOCALE);
            if (tmp != null && tmp instanceof Locale) {
                pref = (Locale) tmp;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'tmp != null' covered by subsequent condition 'tmp instanceof Locale'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
            {
                Object tmp = jellyContext.getVariable(Config.FMT_FALLBACK_LOCALE);
                if (tmp != null && tmp instanceof Locale) {
                    pref = (Locale) tmp;
                }
```

### ConditionCoveredByFurtherCondition
Condition 'bundleInput != null' covered by subsequent condition 'bundleInput instanceof LocalizationContext'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/MessageTag.java`
#### Snippet
```java
            bundleInput = this.bundle.evaluate(context);
        }
        if (bundleInput != null && bundleInput instanceof LocalizationContext) {
            locCtxt = (LocalizationContext) bundleInput;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'valueInput != null' covered by subsequent condition 'valueInput instanceof Date'
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/FormatDateTag.java`
#### Snippet
```java

        Date date = null;
        if (valueInput != null && valueInput instanceof Date) {
            date = (Date) valueInput;
        }
```

### ConditionCoveredByFurtherCondition
Condition 'window != null' covered by subsequent condition 'window instanceof ApplicationWindowImpl'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceLayoutDataTag.java`
#### Snippet
```java
        if (parent == null) {
            window = getParentWindow();
            if (window != null && window instanceof ApplicationWindowImpl) {
                parent = ((ApplicationWindowImpl) window).getContents();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'window != null' covered by subsequent condition 'window instanceof ApplicationWindowImpl'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceLayoutTag.java`
#### Snippet
```java
        if (parent == null) { // perhaps parent is a Window
            Window window = getParentWindow();
            if (window != null && window instanceof ApplicationWindowImpl) {
                parent = ((ApplicationWindowImpl) window).getContents();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'window != null' covered by subsequent condition 'window instanceof ApplicationWindowImpl'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceImageTag.java`
#### Snippet
```java
        if (parent == null) {
            window = getParentWindow();
            if (window != null && window instanceof ApplicationWindowImpl) {
                parent = ((ApplicationWindowImpl) window).getContents();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'bean != null' covered by subsequent condition 'bean instanceof ContributionItem'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ContributionItemTag.java`
#### Snippet
```java

        Object bean = getBean();
        if (bean != null && bean instanceof ContributionItem) {
            IContributionManager cm = getParentContributionManager();
            if (cm != null) {
```

### ConditionCoveredByFurtherCondition
Condition 'window != null' covered by subsequent condition 'window instanceof ApplicationWindowImpl'
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceWidgetTag.java`
#### Snippet
```java
            if (tag != null) {
                Window window = tag.getWindow();
                if (window != null && window instanceof ApplicationWindowImpl) {
                    return ((ApplicationWindowImpl) window).getContents();
                }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.dom4j` is unnecessary and can be removed
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
    /** If set to true will only take the first element matching.
        It then guarantees that the result is of type
        {@link org.dom4j.Node} thereby making sure that, for example,
        when an element is selected, one can directly call such methods
        as setAttribute.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.dom4j` is unnecessary and can be removed
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java

/** A tag which defines a variable from an XPath expression.
  * This function creates a variable of type {@link List} or {@link org.dom4j.Node}
  * (for example {@link org.dom4j.Element} or {@link org.dom4j.Attribute}).
  * Thus, the variable created from xml:set can be
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
            // @todo Jelly should have native support for URL and QName
            // directly on properties
            call.setTargetEndpointAddress(new java.net.URL(endpoint));
            call.setOperationName(new QName(namespace, method));

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanPropertyTag.java`
#### Snippet
```java
                Class[] args = method.getParameterTypes();
                if (method.getName().equals(addMethodName)
                      && java.lang.Void.TYPE.equals(method.getReturnType())
                      && args.length == 1
                      && !java.lang.String.class.equals(args[0])
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanPropertyTag.java`
#### Snippet
```java
                      && java.lang.Void.TYPE.equals(method.getReturnType())
                      && args.length == 1
                      && !java.lang.String.class.equals(args[0])
                      && !args[0].isArray()
                      && !args[0].isPrimitive())
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
    
    private static String readBuildTimestampResource(String name) {
        java.io.Reader in = null;
        try {
            java.io.StringWriter w = new java.io.StringWriter();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        java.io.Reader in = null;
        try {
            java.io.StringWriter w = new java.io.StringWriter();
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        java.io.Reader in = null;
        try {
            java.io.StringWriter w = new java.io.StringWriter();
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
        try {
            java.io.StringWriter w = new java.io.StringWriter();
            in = new java.io.InputStreamReader(Jelly.class.getResourceAsStream(name),"utf-8");
            int r;
            while ( (r=in.read()) >= 0 ) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #ignorableWhitespace
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *            wrapping another exception.
     * @see #ignorableWhitespace
     * @see org.xml.sax.Locator
     */
    public void characters(char[] ch, int start, int length) throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @param prefix The prefix that was being mapped.
     *  This is the empty string when a default mapping scope ends.
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     * @see #startPrefixMapping
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *        it is the external DTD subset, it will be the string
     *        "[dtd]".
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *
     * <p>The contents of the CDATA section will be reported through
     * the regular {@link org.xml.sax.ContentHandler#characters
     * characters} event; this event is intended only to report
     * the boundary.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @param locator An object that can return the location of
     *                any SAX document event.
     * @see org.xml.sax.Locator
     */
    public void setDocumentLocator(Locator locator) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *  which has no prefix.
     * @param uri The Namespace URI the prefix is mapped to.
     * @throws org.xml.sax.SAXException The client may throw
     *            an exception during processing.
     * @see #endPrefixMapping
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * setDocumentLocator}).</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #endDocument
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @param start The start position in the array.
     * @param length The number of characters to read from the array.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #characters
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *        there are no attributes, it shall be an empty
     *        Attributes object.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #endElement
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *            wrapping another exception.
     * @see #endElement
     * @see org.xml.sax.Attributes
     */
    public void startElement(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *
     * <p>Note that skipped entities will be reported through the
     * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity}
     * event, which is part of the ContentHandler interface.</p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * @param qName The qualified XML 1.0 name (with prefix), or the
     *        empty string if qualified names are not available.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * the start/endDocument events from ContentHandler and
     * before the first
     * {@link org.xml.sax.ContentHandler#startElement startElement}
     * event.</p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     *        none was supplied.  The data does not include any
     *        whitespace separating it from the target.
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
     * input.</p>
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see #startDocument
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/tags/core/UseBeanTag.java`
#### Snippet
```java
 * A tag which instantiates an instance of the given class
 * and then sets the properties on the bean.
 * The class can be specified via a {@link java.lang.Class} instance or
 * a String which will be used to load the class using either the current
 * thread's context class loader or the class loader used to load this
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/tags/core/ImportTag.java`
#### Snippet
```java
                context.runScript(uri, output, true, isInherit() );
            } else {
                context.runScript(new java.io.File(file), output, true,
                  isInherit());
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg0
     * @param arg1
     * @throws org.xml.sax.SAXException
     */
    public void startPrefixMapping(String arg0, String arg1)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg1
     * @param arg2
     * @throws org.xml.sax.SAXException
     */
    public void ignorableWhitespace(char[] arg0, int arg1, int arg2)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg1
     * @param arg2
     * @throws org.xml.sax.SAXException
     */
    public void characters(char[] arg0, int arg1, int arg2)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg2
     * @param arg3
     * @throws org.xml.sax.SAXException
     */
    public void startElement(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg0
     * @param arg1
     * @throws org.xml.sax.SAXException
     */
    public void processingInstruction(String arg0, String arg1)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
    /**
     * @param arg0
     * @throws org.xml.sax.SAXException
     */
    public void endPrefixMapping(String arg0) throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java

    /**
     * @throws org.xml.sax.SAXException
     */
    public void endDocument() throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java

    /**
     * @throws org.xml.sax.SAXException
     */
    public void startDocument() throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
     * @param arg1
     * @param arg2
     * @throws org.xml.sax.SAXException
     */
    public void endElement(String arg0, String arg1, String arg2)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/util/SafeContentHandler.java`
#### Snippet
```java
    /**
     * @param arg0
     * @throws org.xml.sax.SAXException
     */
    public void skippedEntity(String arg0) throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
     * @throws SAXException
     */
    public void startElement(java.lang.String uri,
                             java.lang.String localName,
                             java.lang.String qName,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
     */
    public void startElement(java.lang.String uri,
                             java.lang.String localName,
                             java.lang.String qName,
                             Attributes atts)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
    public void startElement(java.lang.String uri,
                             java.lang.String localName,
                             java.lang.String qName,
                             Attributes atts)
    throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
     * @throws SAXException
     */
    public void startPrefixMapping(java.lang.String prefix,
                                   java.lang.String uri)
    throws SAXException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/org/apache/commons/jelly/parser/DefaultNamespaceFilter.java`
#### Snippet
```java
     */
    public void startPrefixMapping(java.lang.String prefix,
                                   java.lang.String uri)
    throws SAXException {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.cli` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java

        // parse the command line
        Parser parser = new org.apache.commons.cli.GnuParser();
        return parser.parse(cmdLineOptions, filterArgs);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing` is unnecessary, and can be replaced with an import
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
            context.setVariable("commandLine", cmdLine);
            if (runInSwingThread) {
                javax.swing.SwingUtilities.invokeAndWait(new Runnable() { public void run() {
                    try {
                        script.run(context, output);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java

    /**Creates a new buttonGroup.
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(Class theClass, Map attributes,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java

    /**Creates a new buttonGroup.
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(Class theClass, Map attributes,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java

    /**Creates a new buttonGroup.
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(Class theClass, Map attributes,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.swing` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java
     * pass through to the parent component tag.
     * @throws JellyTagException
     * @see org.apache.commons.jelly.tags.swing.ContainerTag#addChild(java.awt.Component, java.lang.Object)
     */
    public void addChild(Component component, Object constraints) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java
     * pass through to the parent component tag.
     * @throws JellyTagException
     * @see org.apache.commons.jelly.tags.swing.ContainerTag#addChild(java.awt.Component, java.lang.Object)
     */
    public void addChild(Component component, Object constraints) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ButtonGroupTag.java`
#### Snippet
```java
     * pass through to the parent component tag.
     * @throws JellyTagException
     * @see org.apache.commons.jelly.tags.swing.ContainerTag#addChild(java.awt.Component, java.lang.Object)
     */
    public void addChild(Component component, Object constraints) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
     * tag runs. This prevents us from keeping references to heavy Swing objects
     * around for longer than they are needed.
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(XMLOutput output) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.beanutils` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java

    /** Part of the Converter interface.
     * @see org.apache.commons.beanutils.Converter#convert(java.lang.Class, java.lang.Object)
     */
    public Object convert(Class type, Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java

    /** Part of the Converter interface.
     * @see org.apache.commons.beanutils.Converter#convert(java.lang.Class, java.lang.Object)
     */
    public Object convert(Class type, Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java

    /** Part of the Converter interface.
     * @see org.apache.commons.beanutils.Converter#convert(java.lang.Class, java.lang.Object)
     */
    public Object convert(Class type, Object value) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java
        ConvertUtils.register(
            new DebugGraphicsConverter(),
            java.lang.Integer.class);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/SwingTagLibrary.java`
#### Snippet
```java
        ConvertUtils.register( new DimensionConverter(), Dimension.class );
        ConvertUtils.register( new PointConverter(), Point.class );
        ConvertUtils.register( new ColorConverter(), java.awt.Color.class );
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  for a<code>GrantProject</code>.
 *
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setNewProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setUserProperty
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setNewProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setInheritedProperty
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setNewProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setInheritedProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperty
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setNewProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setInheritedProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperty
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setInheritedProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setInheritedProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyUserProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperty
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyInheritedProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyInheritedProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setSystemProperties
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#getUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyInheritedProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setSystemProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setJavaVersionProperty
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyUserProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyInheritedProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setSystemProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setJavaVersionProperty
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/PropsHandler.java`
#### Snippet
```java
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#copyInheritedProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setSystemProperties
 *  @see org.apache.commons.jelly.tags.ant.GrantProject#setJavaVersionProperty
 *
 *  @author <a href="mailto:bob@eng.werken.com">Bob McWhirter</a>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
import java.util.Properties;

/** Implements the basic {@link org.apache.commons.jelly.tags.ant.PropsHandler} functionality
 *  against an existing map.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.tools.ant` is unnecessary and can be removed
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
        BuildLogger logger = new NoBannerLogger();

        logger.setMessageOutputLevel( org.apache.tools.ant.Project.MSG_INFO );
        logger.setOutputPrintStream( System.out );
        logger.setErrorPrintStream( System.err);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

     /**
     * @see org.apache.commons.jelly.avalon.JellyService#runNamedScript(String, Map, OutputStream)
     */
    public Map runNamedScript( String name, Map params, OutputStream out ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

     /**
     * @see org.apache.commons.jelly.avalon.JellyService#runScript(String, Map)
     */
    public Map runScript( String url, Map params ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.avalon.JellyService#runNamedScript(String, Map, XMLOutput)
     */
    public Map runNamedScript( String name, Map params, XMLOutput output ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.avalon.JellyService#runNamedScript(String, Map)
     */
    public Map runNamedScript( String name, Map params ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

     /**
     * @see org.apache.commons.jelly.avalon.JellyService#runScript(String, Map, OutputStream)
     */
    public Map runScript( String url, Map params, OutputStream out ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.avalon` is unnecessary and can be removed
in `jelly-tags/avalon/src/main/java/org/apache/commons/jelly/avalon/JellyServiceImpl.java`
#### Snippet
```java

     /**
     * @see org.apache.commons.jelly.avalon.JellyService#runScript(String, Map, XMLOutput)
     */
    public Map runScript( String url, Map params, XMLOutput output ) throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java

        if ((type == null) || (type.equalsIgnoreCase(TIMESTAMP_TYPE))) {
            if (!(value instanceof java.sql.Timestamp)) {
                value = new java.sql.Timestamp(value.getTime());
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java
        if ((type == null) || (type.equalsIgnoreCase(TIMESTAMP_TYPE))) {
            if (!(value instanceof java.sql.Timestamp)) {
                value = new java.sql.Timestamp(value.getTime());
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java
        }
        else if (type.equalsIgnoreCase(TIME_TYPE)) {
            if (!(value instanceof java.sql.Time)) {
                value = new java.sql.Time(value.getTime());
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary, and can be replaced with an import
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java
        else if (type.equalsIgnoreCase(TIME_TYPE)) {
            if (!(value instanceof java.sql.Time)) {
                value = new java.sql.Time(value.getTime());
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java
        }
        else if (type.equalsIgnoreCase(DATE_TYPE)) {
            if (!(value instanceof java.sql.Date)) {
                value = new java.sql.Date(value.getTime());
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.sql` is unnecessary and can be removed
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DateParamTag.java`
#### Snippet
```java
        else if (type.equalsIgnoreCase(DATE_TYPE)) {
            if (!(value instanceof java.sql.Date)) {
                value = new java.sql.Date(value.getTime());
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/ColorTag.java`
#### Snippet
```java
     * @param output {@link XMLOutput} reference
     * @throws JellyTagException if an error occurs
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(final XMLOutput output) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/ImageTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(XMLOutput output) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/OnEventTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(XMLOutput output) throws MissingAttributeException, JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.swt.widgets` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/OnEventTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    /**
     * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
     */
    public void handleEvent(Event event) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.swt.widgets` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/OnEventTag.java`
#### Snippet
```java
    //-------------------------------------------------------------------------
    /**
     * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
     */
    public void handleEvent(Event event) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.swt` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/FontTag.java`
#### Snippet
```java
     * @param output {@link XMLOutput} reference
     * @throws JellyTagException if an error occurs
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(final XMLOutput output) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/GCTag.java`
#### Snippet
```java
     * @param output {@link XMLOutput} reference
     * @throws JellyTagException if an error occurs
     * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
     */
    public void doTag(final XMLOutput output) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#newInstance(java.lang.Class, java.util.Map, org.apache.commons.jelly.XMLOutput)
     */
    protected Object newInstance(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.swt` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutDataTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.LayoutTagSupport#convertValue(java.lang.Object, java.lang.String, java.lang.Object)
     */
    protected Object convertValue(Object bean, String name, Object value)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.swt` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/MenuTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.WidgetTag#createWidget(java.lang.Class, org.eclipse.swt.widgets.Widget, int)
     */
    protected Object createWidget(Class theClass, Widget parent, int style)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/MenuTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.WidgetTag#createWidget(java.lang.Class, org.eclipse.swt.widgets.Widget, int)
     */
    protected Object createWidget(Class theClass, Widget parent, int style)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.eclipse.swt.widgets` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/MenuTag.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.swt.WidgetTag#createWidget(java.lang.Class, org.eclipse.swt.widgets.Widget, int)
     */
    protected Object createWidget(Class theClass, Widget parent, int style)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.tags.core` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#setBeanProperties(java.lang.Object, java.util.Map)
     */
    protected void setBeanProperties(Object bean, Map attributes) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#setBeanProperties(java.lang.Object, java.util.Map)
     */
    protected void setBeanProperties(Object bean, Map attributes) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java

    /**
     * @see org.apache.commons.jelly.tags.core.UseBeanTag#setBeanProperties(java.lang.Object, java.util.Map)
     */
    protected void setBeanProperties(Object bean, Map attributes) throws JellyTagException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/ColorConverter.java`
#### Snippet
```java
        try {
            colorValue = Integer.parseInt(value.substring(1), 16);
            java.awt.Color swingColor = new java.awt.Color(colorValue);
            return new RGB(
                swingColor.getRed(),
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/ColorConverter.java`
#### Snippet
```java
        try {
            colorValue = Integer.parseInt(value.substring(1), 16);
            java.awt.Color swingColor = new java.awt.Color(colorValue);
            return new RGB(
                swingColor.getRed(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
              new TagFactory() {
                  /**
                   * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                   */
                  public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
              new TagFactory() {
                  /**
                   * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                   */
                  public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
              new TagFactory() {
                  /**
                   * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                   */
                  public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtTagLibrary.java`
#### Snippet
```java
            new TagFactory() {
                /**
                 * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
                 */
                public Tag createTag(String name, Attributes attributes)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ContributionItemTag.java`
#### Snippet
```java

    /**
      * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
      */
    public void doTag(XMLOutput output)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ActionTag.java`
#### Snippet
```java

    /**
      * @see org.apache.commons.jelly.Tag#doTag(org.apache.commons.jelly.XMLOutput)
      */
    public void doTag(XMLOutput output)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.jelly.impl` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceTagLibrary.java`
#### Snippet
```java
        registerTagFactory(name, new TagFactory() {
            /**
             * @see org.apache.commons.jelly.impl.TagFactory#createTag(java.lang.String, org.xml.sax.Attributes)
             */
            public Tag createTag(String name, Attributes attributes) throws JellyException {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jelly-tags/quartz/src/main/java/org/apache/commons/jelly/tags/quartz/QuartzTagSupport.java`
#### Snippet
```java
                        catch (SchedulerException e)
                        {
                            e.printStackTrace();
                        }
                    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jelly-tags/quartz/src/main/java/org/apache/commons/jelly/tags/quartz/JellyJob.java`
#### Snippet
```java
        catch (Exception e)
        {
            e.printStackTrace();
            throw new JobExecutionException( e,
                                             false );
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java

    public void printStackTrace() {
        super.printStackTrace();
        if (cause != null) {
            System.out.println("Root cause");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
        if (cause != null) {
            System.out.println("Root cause");
            cause.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java

            if (cause == null) {
                e.printStackTrace();
            } else {
                cause.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
                e.printStackTrace();
            } else {
                cause.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/Jelly.java`
#### Snippet
```java
            return w.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                in.close();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/NestedRuntimeException.java`
#### Snippet
```java

    public void printStackTrace() {
        cause.printStackTrace();
    }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
                        script.run(context, output);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            } } ); } else {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        log.warn("Underlying exception: " + e);
        if (e != null) {
            e.printStackTrace();
        }
        if (locator != null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java

    public void printStackTrace() {
        super.printStackTrace();
        if (cause != null) {
            System.out.println("Root cause");
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java
        if (cause != null) {
            System.out.println("Root cause");
            cause.printStackTrace();
        }
    }
```

## RuleId[id=CovariantEquals]
### CovariantEquals
`equals()` should take 'Object' as its argument
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java
    }

    public synchronized boolean equals(RunnableStatus status) {
        return status.get() == this.status;
    }
```

### CovariantEquals
`equals()` should take 'Object' as its argument
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/RunnableStatus.java`
#### Snippet
```java
    }

    public synchronized boolean equals(int status) {
        return this.status == status;
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ParseTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ParseTagSupport.java`
#### Snippet
```java
    private SAXReader saxReader;

    public ParseTagSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `LogTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/log/src/main/java/org/apache/commons/jelly/tags/log/LogTagSupport.java`
#### Snippet
```java
    private boolean encode;

    public LogTagSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `DynaBeanTagSupport()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/DynaBeanTagSupport.java`
#### Snippet
```java
    }
    
    public DynaBeanTagSupport(DynaBean dynaBean) {
        this.dynaBean = dynaBean;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DynaBeanTagSupport()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/DynaBeanTagSupport.java`
#### Snippet
```java
    private DynaBean dynaBean;

    public DynaBeanTagSupport() {
    }
    
```

### NonProtectedConstructorInAbstractClass
Constructor `TagLibrary()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
	 * Default Constructor
	 */
    public TagLibrary() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `TagLibrary()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
	 * @param allowUnknownTags whether unknown tags are allowed or an exception is raised
	 */
	public TagLibrary(boolean allowUnknownTags) {
		super();
		this.allowUnknownTags = allowUnknownTags;
```

### NonProtectedConstructorInAbstractClass
Constructor `TagSupport()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
    }

    public TagSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `TagSupport()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
    }

    public TagSupport(boolean shouldTrim) {
        setTrim( shouldTrim );
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseJellyTest()` of an abstract class should not be declared 'public'
in `core/src/main/java/org/apache/commons/jelly/test/BaseJellyTest.java`
#### Snippet
```java
public abstract class BaseJellyTest extends TestCase {

    public BaseJellyTest(String name) {
        super(name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BorderTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/BorderTagSupport.java`
#### Snippet
```java
    private String var;

    public BorderTagSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `LayoutTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/LayoutTagSupport.java`
#### Snippet
```java
    private String var;

    public LayoutTagSupport() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `HttpTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
     * Creates a new instance of HttpTag
     */
    public HttpTagSupport() {
        setParameters(new ArrayList());
        setRequestHeaders(new ArrayList());
```

### NonProtectedConstructorInAbstractClass
Constructor `SqlTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/SqlTagSupport.java`
#### Snippet
```java
    // Constructor and initialization

    public SqlTagSupport() {
		super.setEscapeText(false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `MessageOperationTag()` of an abstract class should not be declared 'public'
in `jelly-tags/jms/src/main/java/org/apache/commons/jelly/tags/jms/MessageOperationTag.java`
#### Snippet
```java
    private String subject;

    public MessageOperationTag() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `LayoutTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java
    private String var;

    public LayoutTagSupport(Class layoutClass) {
        super(layoutClass);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AssertTagSupport()` of an abstract class should not be declared 'public'
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertTagSupport.java`
#### Snippet
```java
    private static String DEFAULT_MESSAGE = "assertion failed";
    
    public AssertTagSupport() {
    }

```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new TagFactory() can be replaced with method reference
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTagLibrary.java`
#### Snippet
```java
    protected TagFactory createTagFactory(String name, Attributes attributes) throws JellyException {

        return new TagFactory() {
            public Tag createTag(String name, Attributes attributes) throws JellyException {
                return createBeanTag(name, attributes);
```

### Anonymous2MethodRef
Anonymous new TagFactory() can be replaced with method reference
in `core/src/main/java/org/apache/commons/jelly/impl/DynamicTagLibrary.java`
#### Snippet
```java

        return new TagScript(
            new TagFactory() {
                public Tag createTag(String name, Attributes attributes) throws JellyException {
                    return DynamicTagLibrary.this.createTag(name, attributes);
```

### Anonymous2MethodRef
Anonymous new Factory() can be replaced with method reference
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/SwingTagLibrary.java`
#### Snippet
```java
        registerFactory(
            "hbox",
            new Factory() {
                public Object newInstance() {
                    return Box.createHorizontalBox();
```

### Anonymous2MethodRef
Anonymous new Factory() can be replaced with method reference
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/SwingTagLibrary.java`
#### Snippet
```java
        registerFactory(
            "vbox",
            new Factory() {
                public Object newInstance() {
                    return Box.createVerticalBox();
```

### Anonymous2MethodRef
Anonymous new TagFactory() can be replaced with method reference
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFTagLibrary.java`
#### Snippet
```java
        registerTagFactory(
            "script",
            new TagFactory() {
                public Tag createTag(String name, Attributes attributes)
                    throws JellyException {
```

### Anonymous2MethodRef
Anonymous new TagFactory() can be replaced with method reference
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
        if ( answer == null ) {
            answer = new TagScript(
                new TagFactory() {
                    public Tag createTag(String name, Attributes attributes) throws JellyException {
                        return AntTagLibrary.this.createTag(name, attributes);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `core/src/main/java/org/apache/commons/jelly/tags/core/ThreadTag.java`
#### Snippet
```java

        Thread thread = new Thread(
            new Runnable() {
                public void run() {
                    try {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `core/src/main/java/org/apache/commons/jelly/util/CommandLineParser.java`
#### Snippet
```java
            context.setVariable("commandLine", cmdLine);
            if (runInSwingThread) {
                javax.swing.SwingUtilities.invokeAndWait(new Runnable() { public void run() {
                    try {
                        script.run(context, output);
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/ThreadTag.java`
#### Snippet
```java

        // set the target to run
        thread.setTarget(new Runnable() {
            public void run() {
                try {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `source`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/ParseTagSupport.java`
#### Snippet
```java
            if (source instanceof String) {
                String uri = (String) source;
                source = context.getResource(uri);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `style`
in `jelly-tags/memory/src/main/java/org/apache/commons/jelly/tags/memory/FreeMemoryTag.java`
#### Snippet
```java
    public void setStyle(String style) {
        if (style == null) {
            style = "mb";
        }
        this.style = style.toLowerCase();
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
                }
            }
            from = from.getParent();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
                return from;
            }
            from = from.getParent();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `localName`
in `core/src/main/java/org/apache/commons/jelly/impl/StaticTag.java`
#### Snippet
```java
        // FIXME This just doesn't seem right or work...
        if (qname == null || !qname.endsWith(localName)) {
            localName = qname;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java

            if (prefix == null) {
                prefix = "";
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java

            if (prefix == null) {
                prefix = "";
            }
            if (uri == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `uri`
in `core/src/main/java/org/apache/commons/jelly/XMLOutput.java`
#### Snippet
```java
            }
            if (uri == null) {
                uri = "";
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `tagNamespacesMap`
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
        // lets check that this is a thread-safe map
        if ( ! (tagNamespacesMap instanceof Hashtable) ) {
            tagNamespacesMap = new Hashtable( tagNamespacesMap );
        }
        this.tagNamespacesMap = tagNamespacesMap;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
        }
        if(name.indexOf(':')==-1)
            name = prefix + ':' + name;
        attributes.put(name, new ExpressionAttribute(name,prefix,nsURI,expression));
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java
            List list = (List) value;
            if (list.isEmpty()) {
                value = "";
            }
            value = list.get(0);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java
                value = "";
            }
            value = list.get(0);
            if (value == null) {
                value = "";
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathComparator.java`
#### Snippet
```java
            value = list.get(0);
            if (value == null) {
                value = "";
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `from`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/GbcTag.java`
#### Snippet
```java
                return from;
            }
            from = from.getParent();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/PointConverter.java`
#### Snippet
```java

    protected int parseNumber(String text) {
        text = text.trim();
        return Integer.parseInt(text);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DimensionConverter.java`
#### Snippet
```java

    protected int parseNumber(String text) {
        text = text.trim();
        return Integer.parseInt(text);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java

    protected int recognizeOption(String value) {
        value = value.toString().toLowerCase();

        if ("log".equals(value) || "log_option".equals(value)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `namespaceURI`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            // add check to ensure namespace URI is "" for no namespace
            if ( namespaceURI == null ) {
                namespaceURI = "";
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `rawDataSource`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceUtil.java`
#### Snippet
```java

        if (rawDataSource == null) {
            rawDataSource = pc.getVariable("org.apache.commons.jelly.sql.DataSource");
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/SwtHelper.java`
#### Snippet
```java
        if (text != null) {
            if (toUpperCase) {
                text = text.toUpperCase();
            }
            StringTokenizer items = new StringTokenizer(text, ",");
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/PointConverter.java`
#### Snippet
```java

    protected int parseNumber(String text) {
        text = text.trim();
        return Integer.parseInt(text.trim());
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/converters/ColorConverter.java`
#### Snippet
```java

    protected int parseNumber(String text) {
        text = text.trim();
        return Integer.parseInt(text.trim());
    }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
        
    public void printStackTrace(PrintStream s) {
        synchronized (s) {
            super.printStackTrace(s);
            if  (cause != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `core/src/main/java/org/apache/commons/jelly/JellyException.java`
#### Snippet
```java
    // #### overload the printStackTrace methods...
    public void printStackTrace(PrintWriter s) { 
        synchronized (s) {
            super.printStackTrace(s);
            if  (cause != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `body`
in `core/src/main/java/org/apache/commons/jelly/util/TagUtils.java`
#### Snippet
```java
     */
    public static void trimScript(Script body) {
        synchronized(body) {
            if ( body instanceof CompositeTextScriptBlock ) {
                CompositeTextScriptBlock block = (CompositeTextScriptBlock) body;
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java

    public void printStackTrace(PrintStream s) {
        synchronized (s) {
            super.printStackTrace(s);
            if  (cause != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/JellyAssertionFailedError.java`
#### Snippet
```java
    // #### overload the printStackTrace methods...
    public void printStackTrace(PrintWriter s) {
        synchronized (s) {
            super.printStackTrace(s);
            if  (cause != null) {
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `mutex`
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/SynchronizeTag.java`
#### Snippet
```java
    /** Synchronize on the mutex */
    protected void useMutex(Object mutex, XMLOutput output) throws JellyTagException {
        synchronized (mutex) {
            invokeBody(output);
        }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/IfTag.java`
#### Snippet
```java
            return tag.getXPathContext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
            return ((Node) value).getStringValue();
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
            List l = (List) value;
            if (l.isEmpty())
                return null;
            else
                return l.get(0);
```

### ReturnNull
Return of `null`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
            } else {
                // do nothing
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/TransformTag.java`
#### Snippet
```java
                // pass if we don't have a systemId
                if (null == href)
                    return null;

                // @todo
```

### ReturnNull
Return of `null`
in `jelly-tags/velocity/src/main/java/org/apache/commons/jelly/tags/velocity/JellyContextAdapter.java`
#### Snippet
```java
        if ( key == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/velocity/src/main/java/org/apache/commons/jelly/tags/velocity/JellyContextAdapter.java`
#### Snippet
```java
        if ( key == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/velocity/src/main/java/org/apache/commons/jelly/tags/velocity/JellyContextAdapter.java`
#### Snippet
```java
        if ( key == null || value == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/soap/src/main/java/org/apache/commons/jelly/tags/soap/InvokeTag.java`
#### Snippet
```java
    protected Object[] getParamArray() {
        if (params == null) {
            return null;
        }
        if (params instanceof Object[]) {
```

### ReturnNull
Return of `null`
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeandefTag.java`
#### Snippet
```java
            return MethodUtils.getAccessibleMethod(theClass, methodName, EMPTY_ARGUMENT_TYPES);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTag.java`
#### Snippet
```java
            return tag.getBean();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanTag.java`
#### Snippet
```java
    protected Method findAddMethod(Class beanClass, Class valueClass) {
        if (addMethodName == null) {
            return null;
        }
        Class[] argTypes = { valueClass };
```

### ReturnNull
Return of `null`
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanPropertyTag.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/bean/src/main/java/org/apache/commons/jelly/tags/bean/BeanPropertyTag.java`
#### Snippet
```java
    protected Method findCreateMethod(Class theClass) {
        if (createMethodName == null) {
            return null;
        }
        return MethodUtils.getAccessibleMethod(
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
    /** Allows derived tag libraries to use their own factory */
    public ExpressionFactory getExpressionFactory() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
            return new TagScript( (TagFactory) value );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
            return factory.createTag(name, attributes);
        }
    	return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagLibrary.java`
#### Snippet
```java
                        return new File( text );
                    }
                    return null;
                }
            },
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
            from = from.getParent();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/TagSupport.java`
#### Snippet
```java
            from = from.getParent();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/DynamicTagLibrary.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/DynamicTagLibrary.java`
#### Snippet
```java
    public Script getDynamicTag(String name) {
        Object result = templates.get(name);
        return (result instanceof Script) ? (Script) result : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/DefaultTagLibraryResolver.java`
#### Snippet
```java
                e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/DefaultTagLibraryResolver.java`
#### Snippet
```java
            log.error("Could not find the class: " + className + " when trying to resolve URI: " + uri, e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/DefaultTagLibraryResolver.java`
#### Snippet
```java
        }
        log.info( "Could not find any services for name: " + name );
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/impl/TagScript.java`
#### Snippet
```java
            return tagFactory.createTag(localName, getSaxAttributes());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/xpath/XPathTagSupport.java`
#### Snippet
```java
            return tag.getXPathSource();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/tags/core/ArgTag.java`
#### Snippet
```java
    private static Object convert(Class klass, Object value) throws JellyTagException {
        if(null == value) {
            return null;
        } else if(!klass.isInstance(value)) {
            Converter converter = (Converter)(converterMap.get(klass));
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/ExpressionSupport.java`
#### Snippet
```java
            return value.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Set entrySet() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Object remove(Object key) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Collection values() {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java
        	if (context.isSuppressExpressionExceptions()) {
	            log.warn("Caught exception evaluating: " + expression + ". Reason: " + e, e);
	            return null;
        	} else {
        		if (e instanceof RuntimeException)
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/jexl/JexlExpression.java`
#### Snippet
```java

    public Set keySet() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/GbcTag.java`
#### Snippet
```java
    throws MissingAttributeException, ClassNotFoundException {
        if (classObject == null) {
            return null;
        }
        else {
```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/GbcTag.java`
#### Snippet
```java
            from = from.getParent();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ActionTag.java`
#### Snippet
```java
    protected Class convertToClass(Object classObject) throws MissingAttributeException, ClassNotFoundException {
        if (classObject == null) {
            return null;
        }
        else {
```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/model/ExpressionTableColumn.java`
#### Snippet
```java
    public Object evaluateValue(ExpressionTableModel model, Object row, int rowIndex, int columnIndex) {
        if (value == null) {
            return null;
        }
        // lets put the values in the context
```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/PointConverter.java`
#### Snippet
```java
            return new Point( x, y );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DimensionConverter.java`
#### Snippet
```java
            return new Dimension( width, height );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
    protected Class convertToClass(Object classObject) throws MissingAttributeException, ClassNotFoundException {
        if (classObject == null) {
            return null;
        }
        else {
```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java
            return (Component) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/ComponentTag.java`
#### Snippet
```java

    protected Object getConstraint() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/DebugGraphicsConverter.java`
#### Snippet
```java
            return new Integer(result);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swing/src/main/java/org/apache/commons/jelly/tags/swing/converters/ColorConverter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFExpression.java`
#### Snippet
```java
            catch (Exception e) {
                log.warn( "Caught exception evaluating: " + text + ". Reason: " + e, e );
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        ArrayStack stack = (ArrayStack) namespaces.get(prefix);
        if (stack == null) {
            return (null);
        }
        try {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        }
        catch (EmptyStackException e) {
            return (null);
        }
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
    protected String getCurrentURI() {
        URL url = this.getContext().getCurrentURL();
        return (url != null) ? url.toString() : null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
                return script;
            }
            return null;
        }
        catch (Exception e) {
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
        catch (SAXException e) {
            log.error("Cannot get XMLReader", e);
            return (null);
        }
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/parser/XMLParser.java`
#### Snippet
```java
            catch (Exception e) {
                log.error("XMLParser.getParser: ", e);
                return (null);
            }
        }
```

### ReturnNull
Return of `null`
in `jelly-tags/jetty/src/main/java/org/apache/commons/jelly/tags/jetty/JellyResourceHttpHandler.java`
#### Snippet
```java
          return sb.toString();
        else
          return null;

    }
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/JellyPropsHandler.java`
#### Snippet
```java
    public String getProperty(String name) {
        if (name == null) {
            return null;
        }
        Object value = this.context.getVariable(name);
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/JellyPropsHandler.java`
#### Snippet
```java
        Object value = this.context.getVariable(name);
        if (value == null) {
            return null;
        }
        else {
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
    public String getUserProperty(String key) {
        if (key == null) {
            return null;
        }
        return (String) this.userProperties.get(key);
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/DefaultPropsHandler.java`
#### Snippet
```java
    public String getProperty(String key) {
        if (key == null) {
            return null;
        }
        return (String) this.properties.get(key);
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
            );
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
                        return new Reference( text );
                    }
                    return null;
                }
            },
```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTagLibrary.java`
#### Snippet
```java
                        return attr;
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            log.error("datatype '" + name + "' couldn't be created with " + argDescription, ite);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java

        if (taskType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
            tag = tag.getParent();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/DataSourceUtil.java`
#### Snippet
```java

        if (rawDataSource == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultSupport.java`
#### Snippet
```java
            return new ResultImpl(resultSet, -1, -1);
        } catch (SQLException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultSupport.java`
#### Snippet
```java
            return new ResultImpl(resultSet, -1, maxRows);
        } catch (SQLException ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ResultImpl.java`
#### Snippet
```java
    public SortedMap[] getRows() {
        if (rowMap == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/org/apache/commons/jelly/tags/sql/ResultImpl.java`
#### Snippet
```java
    public Object[][] getRowsByIndex() {
        if (rowByIndex == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultImpl.java`
#### Snippet
```java
    public Object[][] getRowsByIndex() {
        if (rowByIndex == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/sql/src/main/java/javax/servlet/jsp/jstl/sql/ResultImpl.java`
#### Snippet
```java
    public SortedMap[] getRows() {
        if (rowMap == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/jsl/src/main/java/org/apache/commons/jelly/tags/jsl/StylesheetTag.java`
#### Snippet
```java
            return jellyStyle.getOutput();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/fmt/src/main/java/org/apache/commons/jelly/tags/fmt/BundleTag.java`
#### Snippet
```java
        Object obj = jc.getVariable(Config.FMT_LOCALIZATION_CONTEXT);
        if (obj == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/ColorTag.java`
#### Snippet
```java
            return tag.getWidget();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/ImageTag.java`
#### Snippet
```java
            return tag.getWidget();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/OnEventTag.java`
#### Snippet
```java
            return tag.getWidget();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTag.java`
#### Snippet
```java
            return (Layout) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/FontTag.java`
#### Snippet
```java
            return tag.getWidget();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/LayoutTagSupport.java`
#### Snippet
```java
            return tag.getWidget();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/WidgetTag.java`
#### Snippet
```java
            return (Widget) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceLayoutDataTag.java`
#### Snippet
```java
            return tag.getWindow();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceLayoutTag.java`
#### Snippet
```java
            return tag.getWindow();
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/JFaceImageTag.java`
#### Snippet
```java
            return tag.getWindow();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/MenuManagerTag.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/SelectionChangedListenerTag.java`
#### Snippet
```java
            return tag.getViewer();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/antlr/src/main/java/org/apache/commons/jelly/tags/antlr/AntlrTag.java`
#### Snippet
```java
        }
        if (generatedFileName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/DoubleClickListenerTag.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ContributionItemTag.java`
#### Snippet
```java
            return tag.getMenuManager();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ActionTag.java`
#### Snippet
```java
            return tag.getMenuManager();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ViewerTag.java`
#### Snippet
```java
            return (Viewer) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/window/ApplicationWindowTag.java`
#### Snippet
```java
            return (Window) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/wizard/WizardPageTag.java`
#### Snippet
```java
            return (WizardPageImpl) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/preference/PreferenceDialogTag.java`
#### Snippet
```java
            return (PreferenceDialog) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/wizard/WizardDialogTag.java`
#### Snippet
```java
            return (WizardDialogImpl) bean;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
            return new URL(text);
        } else {
            return null;
        }
        
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
                    e);
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
            return scope.getVariable(name);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
            log.debug("security exception accessing system properties", e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
            return getParent();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertThrowsTag.java`
#### Snippet
```java
        if (!Throwable.class.isAssignableFrom(throwableClass)) {
            log.warn( "The class: " + expected + " is not an Exception class.");
            return null;
        }
        return throwableClass;
```

### ReturnNull
Return of `null`
in `jelly-tags/define/src/main/java/org/apache/commons/jelly/tags/define/BeanTag.java`
#### Snippet
```java
     */
    protected Method getInvokeMethod( Class theClass ) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `jelly-tags/betwixt/src/main/java/org/apache/commons/jelly/tags/betwixt/IntrospectorTag.java`
#### Snippet
```java
                    }
                    else if ( value == null ) {
                        return null;
                    }
                    else {
```

### ReturnNull
Return of `null`
in `jelly-tags/beanshell/src/main/java/org/apache/commons/jelly/tags/beanshell/BeanShellExpression.java`
#### Snippet
```java
        catch (Exception e) {
            log.warn( "Caught exception evaluating: " + text + ". Reason: " + e, e );
            return null;
        }
    }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `value` is redundant
in `core/src/main/java/org/apache/commons/jelly/expression/xpath/XPathExpression.java`
#### Snippet
```java
        String localName) {

        Object value = context.getVariable(localName);

        //log.debug( "Looking up XPath variable of name: " + localName + " value is: " + value );
```

### UnnecessaryLocalVariable
Local variable `answer` is redundant
in `jelly-tags/bsf/src/main/java/org/apache/commons/jelly/tags/bsf/BSFExpressionFactory.java`
#### Snippet
```java
    /** Factory method */
    protected BSFManager createBSFManager() {
        BSFManager answer = new BSFManager();
        return answer;
    }
```

### UnnecessaryLocalVariable
Local variable `sessionTag` is redundant
in `jelly-tags/http/src/main/java/org/apache/commons/jelly/tags/http/HttpTagSupport.java`
#### Snippet
```java
     */
    private SessionTag getSessionTag() {
        SessionTag sessionTag = (SessionTag) findAncestorWithClass(
            SessionTag.class);
        return sessionTag;
```

### UnnecessaryLocalVariable
Local variable `datatype` is redundant
in `jelly-tags/ant/src/main/java/org/apache/commons/jelly/tags/ant/AntTag.java`
#### Snippet
```java
    private Object createDataType(Constructor ctor, Object[] args, String name, String argDescription) {
        try {
            Object datatype = ctor.newInstance(args);
            return datatype;
        } catch (InstantiationException ie) {
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `jelly-tags/jsl/src/main/java/org/apache/commons/jelly/tags/jsl/XPathPatternExpression.java`
#### Snippet
```java
        String localName) {

        Object value = context.getVariable(localName);

        //log.info( "Looking up XPath variable of name: " + localName + " value is: " + value );
```

### UnnecessaryLocalVariable
Local variable `dialog` is redundant
in `jelly-tags/swt/src/main/java/org/apache/commons/jelly/tags/swt/DialogTag.java`
#### Snippet
```java
        }

        Dialog dialog = (Dialog) createWidget(theClass, parent, style);

        return dialog;
```

### UnnecessaryLocalVariable
Local variable `viewer` is redundant
in `jelly-tags/jface/src/main/java/org/apache/commons/jelly/tags/jface/ViewerTag.java`
#### Snippet
```java
        // now lets call the constructor with the parent
        Widget parent = getParentWidget();
        Viewer viewer = (Viewer) createWidget(theClass, parent, style);

        return viewer;
```

### UnnecessaryLocalVariable
Local variable `parser` is redundant
in `core/src/main/java/org/apache/commons/jelly/JellyContext.java`
#### Snippet
```java
     */
    protected XMLParser getXMLParser() {
        XMLParser parser = createXMLParser();
        return parser;
    }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `jelly-tags/quartz/src/main/java/org/apache/commons/jelly/tags/quartz/WaitForSchedulerTag.java`
#### Snippet
```java
                try
                {
                    Thread.sleep( 500 );
                }
                catch (InterruptedException e)
```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/WaitTag.java`
#### Snippet
```java
        try {
            if (timeout > 0) {
                mutex.wait(timeout);
            } else {
                mutex.wait();
```

### WaitNotInLoop
Call to `wait()` is not in loop
in `jelly-tags/threads/src/main/java/org/apache/commons/jelly/tags/threads/WaitTag.java`
#### Snippet
```java
                mutex.wait(timeout);
            } else {
                mutex.wait();
            }
        }
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`single.booleanValue() == true` can be simplified to 'single.booleanValue()'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        Object value = null;
        try {
            if( single != null && single.booleanValue() == true ) {
                value = select.selectSingleNode(xpathContext);
            } else {
```

### PointlessBooleanExpression
`single.booleanValue() == true` can be simplified to 'single.booleanValue()'
in `jelly-tags/xml/src/main/java/org/apache/commons/jelly/tags/xml/SetTag.java`
#### Snippet
```java
        // handle single
        if (single!=null) {
            if (single.booleanValue() == true) {
                if(value instanceof List) {
                    List l = (List) value;
```

## RuleId[id=AssignmentToCatchBlockParameter]
### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `t`
in `jelly-tags/junit/src/main/java/org/apache/commons/jelly/tags/junit/AssertThrowsTag.java`
#### Snippet
```java
                JellyException je = (JellyException) t;
                if (je.getCause() != null) {
                    t = je.getCause();
                }
            }
```

