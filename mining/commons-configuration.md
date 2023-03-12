# commons-configuration 
 
# Bad smells
I found 348 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 112 | false |
| UnnecessaryFullyQualifiedName | 65 | false |
| BoundedWildcard | 51 | false |
| UnnecessaryUnboxing | 19 | false |
| UnnecessaryBoxing | 11 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 9 | false |
| AssignmentToMethodParameter | 7 | false |
| RedundantSuppression | 5 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| RegExpDuplicateCharacterInClass | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| SynchronizeOnThis | 4 | false |
| DataFlowIssue | 3 | false |
| ObsoleteCollection | 3 | false |
| ClassNameSameAsAncestorName | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| RedundantOperationOnEmptyContainer | 2 | false |
| Convert2MethodRef | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| RedundantCollectionOperation | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| NestedAssignment | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| UnnecessaryContinue | 2 | false |
| UnusedAssignment | 2 | false |
| Finalize | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessaryStringEscape | 1 | true |
| StringOperationCanBeSimplified | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| MismatchedJavadocCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| CollectionContainsUrl | 1 | false |
| IgnoreResultOfCall | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| JavaReflectionInvocation | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| CopyConstructorMissesField | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new BuilderParameters\[params.size()\]'
in `src/main/java/org/apache/commons/configuration2/builder/combined/BaseConfigurationBuilderProvider.java`
#### Snippet
```java
    protected void configureBuilder(final BasicConfigurationBuilder<? extends Configuration> builder, final ConfigurationDeclaration decl,
        final Collection<BuilderParameters> params) throws Exception {
        builder.configure(params.toArray(new BuilderParameters[params.size()]));
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[keys.size()\]'
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertySource.java`
#### Snippet
```java
            keys.add(keysIterator.next());
        }
        return keys.toArray(new String[keys.size()]);
    }

```

## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/configuration2/tree/TrackedNodeModel.java`
#### Snippet
```java
     */
    @Override
    protected void finalize() throws Throwable {
        if (isReleaseTrackedNodeOnFinalize()) {
            close();
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `new ArrayList`() is always empty
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NameNotFoundException e) {
            // expected exception, no need to log it
            return new ArrayList<String>().iterator();
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
```

### RedundantOperationOnEmptyContainer
Collection `new ArrayList`() is always empty
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
            return new ArrayList<String>().iterator();
        }
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/configuration2/io/FileUtils.java`
#### Snippet
```java
 * See CONFIGURATION-521 for a discussion.
 */
class FileUtils {
    /**
     * The UTF-8 character set, used to decode octets in URLs.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
                        unicode.setLength(0);
                        inUnicode = false;
                        hadSlash = false;
                    } catch (final NumberFormatException nfe) {
                        throw new ConfigurationRuntimeException("Unable to parse unicode value: " + unicode, nfe);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/configuration2/tree/DefaultConfigurationKey.java`
#### Snippet
```java
                }
            } catch (final NumberFormatException nfe) {
                result = false;
            }

```

### DataFlowIssue
Argument `array` might be null
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                } else if ("array".equals(qName)) {
                    final ArrayNodeBuilder array = (ArrayNodeBuilder) pop();
                    peekNE().addList(array);
                }

```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
     * {@code java.util.Properties} escapes these characters when writing out a properties file.
     */
    private static final String UNESCAPE_CHARACTERS = ":#=!\\\'\"";

    /**
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
     */
    private <T> String generateKeyForAdd(final T root, final String key, final NodeHandler<T> handler) {
        int pos = key.lastIndexOf(PATH_DELIMITER, key.length());

        while (pos >= 0) {
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `staticCatalog` from instance context
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java

                if (getUseStaticCatalog()) {
                    staticCatalog = catalog;
                }
            }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/configuration2/DynamicCombinedConfiguration.java`
#### Snippet
```java
    @Override
    public void clearErrorListeners() {
        configs.values().forEach(cc -> cc.clearErrorListeners());
        super.clearErrorListeners();
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/configuration2/tree/NodeTracker.java`
#### Snippet
```java
        }
        return new NodeTracker(trackedNodes.entrySet().stream()
            .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().isDetached() ? e.getValue() : e.getValue().detach(null))));
    }

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/configuration2/event/Event.java`
#### Snippet
```java
     */
    protected void appendPropertyRepresentation(final StringBuilder buf, final String property, final Object value) {
        buf.append(String.format(FMT_PROPERTY, property, String.valueOf(value)));
    }
}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
        } catch (final ConversionException cex) {
            // improve error message
            throw new ConversionException(String.format("Key '%s' cannot be converted to class %s. Value is: '%s'.", key, cls.getName(), String.valueOf(value)),
                cex.getCause());
        }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
        public DefinedKeysVisitor() {
            keyList = new LinkedHashSet<>();
            parentKeys = new Stack<>();
        }

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java

        /** A stack with the keys of the already processed nodes. */
        private final Stack<String> parentKeys;

        /**
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java

            // This is safe because the catalog manager returns a vector of strings.
            final Vector<String> catalogs = catalogManager.getCatalogFiles();
            if (catalogs != null) {
                for (int count = 0; count < catalogs.size(); count++) {
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `cloneNodeModel()` during object construction
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
            copy.cloneInterpolator(this);
            copy.setSynchronizer(ConfigurationUtils.cloneSynchronizer(getSynchronizer()));
            copy.model = cloneNodeModel();

            return copy;
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NameNotFoundException e) {
            // expected exception, no need to log it
            return new ArrayList<String>().iterator();
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
```

### RedundantCollectionOperation
`iterator` can be replaced with 'Collections.emptyIterator()'
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, null, null, e);
            return new ArrayList<String>().iterator();
        }
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'attributeResult' in a Serializable class
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationAttributePointer.java`
#### Snippet
```java

    /** Stores information about the represented attribute. */
    private final QueryResult<T> attributeResult;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'data' in a Serializable class
in `src/main/java/org/apache/commons/configuration2/reloading/ReloadingEvent.java`
#### Snippet
```java

    /** Stores additional data about this event. */
    private final Object data;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'propertyValue' in a Serializable class
in `src/main/java/org/apache/commons/configuration2/event/ConfigurationEvent.java`
#### Snippet
```java

    /** Stores the property value. */
    private final Object propertyValue;

    /** Stores the before update flag. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'propertyValue' in a Serializable class
in `src/main/java/org/apache/commons/configuration2/event/ConfigurationErrorEvent.java`
#### Snippet
```java

    /** Stores the property value. */
    private final Object propertyValue;

    /** Stores the exception that caused this event. */
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
         * Gets the list with all defined keys.
         *
         * @return the list with the defined keys
         */
        public Set<String> getKeyList() {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\S&&[^\\\\missingValue]]` can be simplified to '\\S\&\&\[\^\\\\missingValue\]'
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Map `registeredEntities` may contain URL objects
in `src/main/java/org/apache/commons/configuration2/resolver/DefaultEntityResolver.java`
#### Snippet
```java
public class DefaultEntityResolver implements EntityResolver, EntityRegistry {
    /** Stores a map with the registered public IDs. */
    private final Map<String, URL> registeredEntities = new HashMap<>();

    /**
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
            final String keyExisting = key.substring(0, pos);
            if (!query(root, keyExisting, handler).isEmpty()) {
                final StringBuilder buf = new StringBuilder(key.length() + 1);
                buf.append(keyExisting).append(SPACE);
                buf.append(key.substring(pos + 1));
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
            final String statement;
            if (nameCol && configurationNameColumn != null) {
                final StringBuilder buf = new StringBuilder(sql);
                buf.append(" AND ").append(configurationNameColumn).append("=?");
                statement = buf.toString();
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `b | rc.checkForReloading(null)`
in `src/main/java/org/apache/commons/configuration2/reloading/CombinedReloadingController.java`
#### Snippet
```java
        @Override
        public boolean isReloadingRequired() {
            return owner.getSubControllers().stream().reduce(false, (b, rc) -> b | rc.checkForReloading(null), (t, u) -> t | u);
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `t | u`
in `src/main/java/org/apache/commons/configuration2/reloading/CombinedReloadingController.java`
#### Snippet
```java
        @Override
        public boolean isReloadingRequired() {
            return owner.getSubControllers().stream().reduce(false, (b, rc) -> b | rc.checkForReloading(null), (t, u) -> t | u);
        }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/tree/TreeUtils.java`
#### Snippet
```java
        result.getAttributes().forEach((k, v) -> buffer.append(' ').append(k).append("='").append(v).append("'"));
        buffer.append(">");
        stream.print(buffer.toString());
        if (result.getValue() != null) {
            stream.print(result.getValue());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
        } else if (value instanceof Number) {
            if (value instanceof Double || value instanceof Float || value instanceof BigDecimal) {
                out.println(padding + "<real>" + value.toString() + "</real>");
            } else {
                out.println(padding + "<integer>" + value.toString() + "</integer>");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                out.println(padding + "<real>" + value.toString() + "</real>");
            } else {
                out.println(padding + "<integer>" + value.toString() + "</integer>");
            }
        } else if (value instanceof Boolean) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            return content.getInputStream();
        } catch (final FileSystemException fse) {
            final String msg = "Unable to access " + url.toString();
            throw new ConfigurationException(msg, fse);
        }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationNodeIteratorAttribute.java`
#### Snippet
```java
     * @param name the name of the current attribute
     */
    private void addAttributeData(final ConfigurationNodePointer<T> parent, final List<String> result, final String name) {
        if (parent.getNodeHandler().getAttributeValue(parent.getConfigurationNode(), name) != null) {
            result.add(name);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationNodeIteratorChildren.java`
#### Snippet
```java
     * @return the start node's index
     */
    private int findStartIndex(final List<T> children, final T startNode) {
        int index = 0;
        for (final T child : children) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/tree/DefaultExpressionEngine.java`
#### Snippet
```java
     * @param handler the node handler
     */
    private <T> void processSubNodes(final DefaultConfigurationKey.KeyIterator keyPart, final List<T> subNodes, final Collection<QueryResult<T>> nodes,
        final NodeHandler<T> handler) {
        if (keyPart.hasIndex()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
     */
    @Override
    public <T> List<QueryResult<T>> query(final T root, final String key, final NodeHandler<T> handler) {
        if (StringUtils.isEmpty(key)) {
            final QueryResult<T> result = createResult(root);
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/XPathExpressionEngine.java`
#### Snippet
```java
     * @param <T> the type of the nodes involved
     */
    <T> NodeAddData<T> createNodeAddData(final String path, final QueryResult<T> parentNodeResult) {
        if (parentNodeResult.isAttributeResult()) {
            invalidPath(path, " cannot add properties to an attribute.");
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/builder/combined/ReloadingMultiFileConfigurationBuilder.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the result class is <b>null</b>
     */
    public ReloadingMultiFileConfigurationBuilder(final Class<T> resCls, final Map<String, Object> params, final boolean allowFailOnInit) {
        super(resCls, params, allowFailOnInit);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/builder/combined/ReloadingMultiFileConfigurationBuilder.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the result class is <b>null</b>
     */
    public ReloadingMultiFileConfigurationBuilder(final Class<T> resCls, final Map<String, Object> params) {
        super(resCls, params);
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/builder/combined/ReloadingMultiFileConfigurationBuilder.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the result class is <b>null</b>
     */
    public ReloadingMultiFileConfigurationBuilder(final Class<T> resCls) {
        super(resCls);
    }
```

### BoundedWildcard
Can generalize to `? extends BuilderParameters`
in `src/main/java/org/apache/commons/configuration2/builder/combined/BaseConfigurationBuilderProvider.java`
#### Snippet
```java
     * @param params the collection with (uninitialized) parameter objects
     */
    protected void inheritParentBuilderProperties(final ConfigurationDeclaration decl, final Collection<BuilderParameters> params) {
        params.forEach(p -> decl.getConfigurationBuilder().initChildBuilderParameters(p));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/event/BaseEventSource.java`
#### Snippet
```java
     *         currently registered listeners; it cannot be manipulated)
     */
    public <T extends Event> Collection<EventListener<? super T>> getEventListeners(final EventType<T> eventType) {
        final List<EventListener<? super T>> result = new LinkedList<>();
        eventListeners.getEventListeners(eventType).forEach(result::add);
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/XMLListReference.java`
#### Snippet
```java
     * @param elem the current XML element
     */
    public static void assignListReference(final Map<ImmutableNode, Object> refs, final ImmutableNode node, final Element elem) {
        if (refs != null) {
            refs.put(node, new XMLListReference(elem));
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/HierarchicalConfigurationXMLReader.java`
#### Snippet
```java
         * @return an object with all attributes of this node
         */
        protected Attributes fetchAttributes(final T node, final NodeHandler<T> handler) {
            final AttributesImpl attrs = new AttributesImpl();

```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/HierarchicalConfigurationXMLReader.java`
#### Snippet
```java
         * @return the name for this node
         */
        private String nodeName(final T node, final NodeHandler<T> handler) {
            final String nodeName = handler.nodeName(node);
            return nodeName == null ? getRootName() : nodeName;
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/builder/fluent/Configurations.java`
#### Snippet
```java
     * @since 2.6
     */
    private <T extends FileBasedConfiguration> FileBasedConfigurationBuilder<T> createFileBasedBuilder(final Class<T> configClass) {
        return new FileBasedConfigurationBuilder<>(configClass);
    }
```

### BoundedWildcard
Can generalize to `? extends ConfigurationBuilderProvider`
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedBuilderParametersImpl.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the map with providers is <b>null</b> or contains <b>null</b> entries
     */
    public CombinedBuilderParametersImpl registerMissingProviders(final Map<String, ConfigurationBuilderProvider> providers) {
        if (providers == null) {
            throw new IllegalArgumentException("Map with providers must not be null!");
```

### BoundedWildcard
Can generalize to `? super ReloadingController`
in `src/main/java/org/apache/commons/configuration2/builder/combined/ReloadingCombinedConfigurationBuilder.java`
#### Snippet
```java
     * @param builder the builder object to be checked
     */
    public static void obtainReloadingController(final Collection<ReloadingController> subControllers, final Object builder) {
        if (builder instanceof ReloadingControllerSupport) {
            subControllers.add(((ReloadingControllerSupport) builder).getReloadingController());
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/HierarchicalConfigurationConverter.java`
#### Snippet
```java
     */
    protected String openElements(final DefaultConfigurationKey keyLast, final DefaultConfigurationKey keyAct, final Configuration config,
        final Set<String> keySet) {
        final DefaultConfigurationKey.KeyIterator it = keyLast.differenceKey(keyAct).iterator();
        final DefaultConfigurationKey k = keyLast.commonKey(keyAct);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
     * @throws NamingException If JNDI has an issue.
     */
    private void recursiveGetKeys(final Set<String> keys, final Context context, final String prefix, final Set<Context> processedCtx) throws NamingException {
        processedCtx.add(context);
        NamingEnumeration<NameClassPair> elements = null;
```

### BoundedWildcard
Can generalize to `? super Context`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
     * @throws NamingException If JNDI has an issue.
     */
    private void recursiveGetKeys(final Set<String> keys, final Context context, final String prefix, final Set<Context> processedCtx) throws NamingException {
        processedCtx.add(context);
        NamingEnumeration<NameClassPair> elements = null;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the map is <b>null</b>
     */
    public static void put(final FileLocator locator, final Map<String, Object> map) {
        if (map == null) {
            throw new IllegalArgumentException("Map must not be null!");
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/BaseHierarchicalConfiguration.java`
#### Snippet
```java
         * @return a flag whether an attribute value was changed by interpolation
         */
        private boolean interpolateAttributes(final ImmutableNode node, final NodeHandler<ImmutableNode> handler,
            final Map<String, Object> interpolatedAttributes) {
            boolean attributeChanged = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/BaseHierarchicalConfiguration.java`
#### Snippet
```java
         */
        private boolean interpolateAttributes(final ImmutableNode node, final NodeHandler<ImmutableNode> handler,
            final Map<String, Object> interpolatedAttributes) {
            boolean attributeChanged = false;
            for (final String attr : handler.getAttributes(node)) {
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/BaseHierarchicalConfiguration.java`
#### Snippet
```java
         * @return a flag whether this is a leaf node
         */
        private boolean isLeafNode(final ImmutableNode node, final NodeHandler<ImmutableNode> handler) {
            return handler.getChildren(node).isEmpty();
        }
```

### BoundedWildcard
Can generalize to `? extends NodeSelector`
in `src/main/java/org/apache/commons/configuration2/BaseHierarchicalConfiguration.java`
#### Snippet
```java
     */
    private List<HierarchicalConfiguration<ImmutableNode>> createConnectedSubConfigurations(final InMemoryNodeModelSupport parentModelSupport,
        final Collection<NodeSelector> selectors) {
        return selectors.stream().map(sel -> createSubConfigurationForTrackedNode(sel, parentModelSupport)).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/beanutils/XMLBeanDeclaration.java`
#### Snippet
```java
         * @return the wrapped nodes
         */
        List<NodeData<T>> wrapInNodeData(final List<T> nodes) {
            return nodes.stream().map(n -> new NodeData<>(n, nodeHandler)).collect(Collectors.toList());
        }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/XMLConfiguration.java`
#### Snippet
```java
     *         flag for this node under the key {@value #ATTR_SPACE}
     */
    private Map<String, String> constructHierarchy(final ImmutableNode.Builder node, final MutableObject<String> refValue, final Element element,
        final Map<ImmutableNode, Object> elemRefs, final boolean trim, final int level) {
        final boolean trimFlag = shouldTrim(element, trim);
```

### BoundedWildcard
Can generalize to `? extends BuilderParameters`
in `src/main/java/org/apache/commons/configuration2/builder/combined/FileExtensionConfigurationBuilderProvider.java`
#### Snippet
```java
     * @return the file name or <b>null</b> if unspecified
     */
    private static String fetchCurrentFileName(final Collection<BuilderParameters> params) {
        for (final BuilderParameters p : params) {
            if (p instanceof FileBasedBuilderParametersImpl) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/tree/QueryResult.java`
#### Snippet
```java
     * @throws IllegalStateException if this is not an attribute result
     */
    public Object getAttributeValue(final NodeHandler<T> handler) {
        if (!isAttributeResult()) {
            throw new IllegalStateException("This is not an attribute result! " + "Attribute value cannot be fetched.");
```

### BoundedWildcard
Can generalize to `? super URL`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
     * @throws ConfigurationException if loading fails
     */
    private void loadIncludeFile(final String fileName, final boolean optional, final Deque<URL> seenStack) throws ConfigurationException {
        if (locator == null) {
            throw new ConfigurationException(
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/AbstractYAMLBasedConfiguration.java`
#### Snippet
```java
     * @param value the value
     */
    private static void addEntry(final Map<String, Object> map, final String key, final Object value) {
        final Object oldValue = map.get(key);
        if (oldValue == null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
         * @param handler the {@code NodeHandler}
         */
        public void handleAttributeKeys(final String parentKey, final T node, final NodeHandler<T> handler) {
            handler.getAttributes(node).forEach(attr -> keyList.add(getExpressionEngine().attributeKey(parentKey, attr)));
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
         */
        @Override
        public void visitBeforeChildren(final T node, final NodeHandler<T> handler) {
            defined = handler.getValue(node) != null || !handler.getAttributes(node).isEmpty();
        }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java
     */
    @Override
    public String nodeKey(final T node, final Map<T, String> cache, final NodeHandler<T> handler) {
        final List<T> paths = new LinkedList<>();
        T currentNode = node;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
         * @param map map to add to
         */
        private static void addLookup(final DefaultLookups lookup, final Map<String, Lookup> map) {
            map.put(lookup.getPrefix(), lookup.getLookup());
        }
```

### BoundedWildcard
Can generalize to `? super Lookup`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
         * @param map map to add to
         */
        private static void addLookup(final DefaultLookups lookup, final Map<String, Lookup> map) {
            map.put(lookup.getPrefix(), lookup.getLookup());
        }
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/convert/DefaultConversionHandler.java`
#### Snippet
```java
     * @throws ConversionException if a conversion cannot be performed
     */
    private <T> void convertToCollection(final Object src, final Class<T> elemClass, final ConfigurationInterpolator ci, final Collection<T> dest) {
        extractValues(ci.interpolate(src)).forEach(o -> dest.add(convert(o, elemClass, ci)));
    }
```

### BoundedWildcard
Can generalize to `? super T`
in `src/main/java/org/apache/commons/configuration2/convert/DefaultConversionHandler.java`
#### Snippet
```java
     * @throws ConversionException if a conversion cannot be performed
     */
    private <T> void convertToCollection(final Object src, final Class<T> elemClass, final ConfigurationInterpolator ci, final Collection<T> dest) {
        extractValues(ci.interpolate(src)).forEach(o -> dest.add(convert(o, elemClass, ci)));
    }
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/java/org/apache/commons/configuration2/XMLDocumentHelper.java`
#### Snippet
```java
     * @param mapping the mapping to be filled
     */
    private static void createElementMappingForNodes(final Node n1, final Node n2, final Map<Node, Node> mapping) {
        mapping.put(n1, n2);
        final NodeList childNodes1 = n1.getChildNodes();
```

### BoundedWildcard
Can generalize to `? super Node`
in `src/main/java/org/apache/commons/configuration2/XMLDocumentHelper.java`
#### Snippet
```java
     * @param mapping the mapping to be filled
     */
    private static void createElementMappingForNodes(final Node n1, final Node n2, final Map<Node, Node> mapping) {
        mapping.put(n1, n2);
        final NodeList childNodes1 = n1.getChildNodes();
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/configuration2/INIConfiguration.java`
#### Snippet
```java
     * @throws IOException if an I/O error occurs.
     */
    private void createNodeBuilders(final BufferedReader in, final ImmutableNode.Builder rootBuilder, final Map<String, ImmutableNode.Builder> sectionBuilders)
        throws IOException {
        ImmutableNode.Builder sectionBuilder = rootBuilder;
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/tree/NodeSelector.java`
#### Snippet
```java
     */
    private void getFilteredResults(final ImmutableNode root, final NodeKeyResolver<ImmutableNode> resolver, final NodeHandler<ImmutableNode> handler,
        final String key, final List<ImmutableNode> nodes) {
        final List<QueryResult<ImmutableNode>> results = resolver.resolveKey(root, key, handler);
        results.forEach(result -> {
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
     * Append a node to the writer, indented according to a specific level.
     */
    private void printNode(final PrintWriter out, final int indentLevel, final ImmutableNode node, final NodeHandler<ImmutableNode> handler) {
        final String padding = StringUtils.repeat(" ", indentLevel * INDENT_SIZE);

```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
     * @throws ConversionException if the conversion cannot be performed
     */
    private <T> T getAndConvertProperty(final Class<T> cls, final String key, final T defaultValue) {
        final Object value = getProperty(key);
        try {
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
     * @return the initialized target collection
     */
    private static <T> Collection<T> handleDefaultCollection(final Collection<T> target, final Collection<T> defaultValue) {
        if (defaultValue == null) {
            return null;
```

### BoundedWildcard
Can generalize to `? extends ConfigurationDeclaration`
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java
         */
        public List<ConfigurationBuilder<? extends Configuration>> createAndAddConfigurations(final CombinedConfiguration ccResult,
            final List<ConfigurationDeclaration> srcDecl, final List<ConfigurationBuilder<? extends Configuration>> builders) throws ConfigurationException {
            final boolean createBuilders = builders.isEmpty();
            final List<ConfigurationBuilder<? extends Configuration>> newBuilders;
```

### BoundedWildcard
Can generalize to `? extends TrackedNodeData`
in `src/main/java/org/apache/commons/configuration2/tree/NodeTracker.java`
#### Snippet
```java
     * @return the new {@code TrackedNodeData} object to be used for this tracked node
     */
    private static TrackedNodeData detachedTrackedNodeData(final NodeSelector txTarget, final Map.Entry<NodeSelector, TrackedNodeData> e) {
        final ImmutableNode newNode = e.getKey().equals(txTarget) ? createEmptyTrackedNode(e.getValue()) : null;
        return e.getValue().detach(newNode);
```

### BoundedWildcard
Can generalize to `? extends NodeSelector`
in `src/main/java/org/apache/commons/configuration2/tree/NodeTracker.java`
#### Snippet
```java
     * @return the updated instance
     */
    public NodeTracker trackNodes(final Collection<NodeSelector> selectors, final Collection<ImmutableNode> nodes) {
        final Map<NodeSelector, TrackedNodeData> newState = new HashMap<>(trackedNodes);
        final Iterator<ImmutableNode> itNodes = nodes.iterator();
```

### BoundedWildcard
Can generalize to `? super NodeSelector`
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     */
    private static TreeData updateDataWithNewTrackedNode(final TreeData current, final ImmutableNode node, final NodeKeyResolver<ImmutableNode> resolver,
        final MutableObject<NodeSelector> refSelector) {
        final NodeSelector selector = new NodeSelector(resolver.nodeKey(node, new HashMap<>(), current));
        refSelector.setValue(selector);
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     * @param root the root node of the current tree
     */
    static void updateParentMapping(final Map<ImmutableNode, ImmutableNode> parents, final ImmutableNode root) {
        NodeTreeWalker.INSTANCE.walkBFS(root, new ConfigurationNodeVisitorAdapter<ImmutableNode>() {
            @Override
```

### BoundedWildcard
Can generalize to `? super ImmutableNode`
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     * @param root the root node of the current tree
     */
    static void updateParentMapping(final Map<ImmutableNode, ImmutableNode> parents, final ImmutableNode root) {
        NodeTreeWalker.INSTANCE.walkBFS(root, new ConfigurationNodeVisitorAdapter<ImmutableNode>() {
            @Override
```

### BoundedWildcard
Can generalize to `? super Collection`
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
     * @return the updated {@code TreeData} object
     */
    private static TreeData createSelectorsForTrackedNodes(final Mutable<Collection<NodeSelector>> refSelectors, final List<ImmutableNode> nodes,
            final TreeData current, final NodeKeyResolver<ImmutableNode> resolver) {
        final List<NodeSelector> selectors = new ArrayList<>(nodes.size());
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
    public void load(final PropertiesConfiguration config, final Reader reader) throws ConfigurationException {
        loadCounter.incrementAndGet();
        @SuppressWarnings("resource") // createPropertiesReader wraps the reader.
        final PropertiesConfiguration.PropertiesReader pReader = config.getIOFactory().createPropertiesReader(reader);

        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
    public void save(final PropertiesConfiguration config, final Writer writer) throws ConfigurationException {
        try {
            @SuppressWarnings("resource") // createPropertiesReader wraps the writer.
            final PropertiesConfiguration.PropertiesWriter pWriter = config.getIOFactory().createPropertiesWriter(writer, config.getListDelimiterHandler());
            pWriter.setGlobalSeparator(getGlobalSeparator());
            if (getLineSeparator() != null) {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    // conversion is safe because we know that the class is an Enum class
    private static Object convertToEnum(final Class<?> enumClass, final Object value) {
        return toEnum(value, enumClass.asSubclass(Enum.class));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
    @SuppressWarnings("resource") // InputSource wraps an InputStream.
    @Override
    public InputSource resolveEntity(final String publicId, final String systemId) throws SAXException {
        String resolved = getResolver().getResolvedEntity(publicId, systemId);

```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/configuration2/resolver/DefaultEntityResolver.java`
#### Snippet
```java
    @SuppressWarnings("resource") // The stream is managed by the InputSource returned by this method.
    @Override
    public InputSource resolveEntity(final String publicId, final String systemId) throws SAXException {
        // Has this system identifier been registered?
        URL entityURL = null;
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/builder/DatabaseBuilderParametersImpl.java`
#### Snippet
```java
    @Override
    public DatabaseBuilderParametersImpl setAutoCommit(final boolean f) {
        storeProperty(PROP_AUTO_COMMIT, Boolean.valueOf(f));
        return this;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
            protected Integer performOperation() throws SQLException {
                try (ResultSet rs = openResultSet(String.format(SQL_IS_EMPTY, table), true)) {
                    return rs.next() ? Integer.valueOf(rs.getInt(1)) : null;
                }
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/builder/PropertiesBuilderParametersImpl.java`
#### Snippet
```java
    @Override
    public PropertiesBuilderParametersImpl setIncludesAllowed(final boolean f) {
        storeProperty(PROP_INCLUDES_ALLOWED, Boolean.valueOf(f));
        return this;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
            return (Double) n;
        }
        return Double.valueOf(n.doubleValue());
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
        final String strValue = String.valueOf(value);
        if (strValue.length() == 1) {
            return Character.valueOf(strValue.charAt(0));
        }
        throw new ConversionException(String.format("The value '%s' cannot be converted to a Character object!", strValue));
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
            return (Float) n;
        }
        return Float.valueOf(n.floatValue());
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/builder/BasicBuilderParameters.java`
#### Snippet
```java
    @Override
    public BasicBuilderParameters setThrowExceptionOnMissing(final boolean b) {
        return setProperty(PROP_THROW_EXCEPTION_ON_MISSING, Boolean.valueOf(b));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/tree/ModelTransaction.java`
#### Snippet
```java
     */
    Operations fetchOperations(final ImmutableNode target, final int level) {
        final Integer nodeLevel = Integer.valueOf(level == LEVEL_UNKNOWN ? level(target) : level);
        final Map<ImmutableNode, Operations> levelOperations = operations.computeIfAbsent(nodeLevel, k -> new HashMap<>());
        Operations ops = levelOperations.get(target);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/builder/XMLBuilderParametersImpl.java`
#### Snippet
```java
    @Override
    public XMLBuilderParametersImpl setValidating(final boolean f) {
        storeProperty(PROP_VALIDATING, Boolean.valueOf(f));
        return this;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/builder/XMLBuilderParametersImpl.java`
#### Snippet
```java
    @Override
    public XMLBuilderParametersImpl setSchemaValidation(final boolean f) {
        storeProperty(PROP_SCHEMA_VALIDATION, Boolean.valueOf(f));
        return this;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public int getInt(final String key, final int defaultValue) {
        return getInteger(key, Integer.valueOf(defaultValue)).intValue();
    }

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.available()` is ignored
in `src/main/java/org/apache/commons/configuration2/io/DefaultFileSystem.java`
#### Snippet
```java
            try (InputStream in = url.openStream()) {
                // nothing
                in.available();
            }
            return url;
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/builder/combined/ConfigurationDeclaration.java`
#### Snippet
```java
            value = this.getConfiguration().getBoolean(CombinedConfigurationBuilder.ATTR_OPTIONAL, Boolean.FALSE);
        }
        return value.booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/builder/combined/MultiFileConfigurationBuilder.java`
#### Snippet
```java
        String fileName;
        final Boolean reentrant = inInterpolation.get();
        if (reentrant != null && reentrant.booleanValue()) {
            fileName = multiParams.getFilePattern();
        } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java

        final Integer count = op.execute();
        return count == null || count.intValue() == 0;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java

        final Boolean result = op.execute();
        return result != null && result.booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
            }
        } else if (value instanceof Boolean) {
            if (((Boolean) value).booleanValue()) {
                out.println(padding + "<true/>");
            } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public double getDouble(final String key) {
        final Double d = convert(Double.class, key, null, true);
        return checkNonNullValue(key, d).doubleValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public float getFloat(final String key) {
        final Float f = convert(Float.class, key, null, true);
        return checkNonNullValue(key, f).floatValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public double getDouble(final String key, final double defaultValue) {
        return getDouble(key, Double.valueOf(defaultValue)).doubleValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public boolean getBoolean(final String key) {
        final Boolean b = convert(Boolean.class, key, null, true);
        return checkNonNullValue(key, b).booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public int getInt(final String key, final int defaultValue) {
        return getInteger(key, Integer.valueOf(defaultValue)).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public byte getByte(final String key) {
        final Byte b = convert(Byte.class, key, null, true);
        return checkNonNullValue(key, b).byteValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public long getLong(final String key) {
        final Long l = convert(Long.class, key, null, true);
        return checkNonNullValue(key, l).longValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public float getFloat(final String key, final float defaultValue) {
        return getFloat(key, Float.valueOf(defaultValue)).floatValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public long getLong(final String key, final long defaultValue) {
        return getLong(key, Long.valueOf(defaultValue)).longValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public short getShort(final String key) {
        final Short s = convert(Short.class, key, null, true);
        return checkNonNullValue(key, s).shortValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    public int getInt(final String key) {
        final Integer i = convert(Integer.class, key, null, true);
        return checkNonNullValue(key, i).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public boolean getBoolean(final String key, final boolean defaultValue) {
        return getBoolean(key, Boolean.valueOf(defaultValue)).booleanValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public short getShort(final String key, final short defaultValue) {
        return getShort(key, Short.valueOf(defaultValue)).shortValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    @Override
    public byte getByte(final String key, final byte defaultValue) {
        return getByte(key, Byte.valueOf(defaultValue)).byteValue();
    }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Entry` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/configuration2/ConfigurationMap.java`
#### Snippet
```java
         * A Map entry in the ConfigurationMap.
         */
        private final class Entry implements Map.Entry<Object, Object> {
            /** The key of the map entry. */
            private final Object key;
```

### ClassNameSameAsAncestorName
Class name `CatalogManager` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
     * Extends the CatalogManager to make the FileSystem and base directory accessible.
     */
    public static class CatalogManager extends org.apache.xml.resolver.CatalogManager {
        /** The static catalog used by this manager. */
        private static org.apache.xml.resolver.Catalog staticCatalog;
```

### ClassNameSameAsAncestorName
Class name `Catalog` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
     * Overrides the Catalog implementation to use the underlying FileSystem.
     */
    public static class Catalog extends org.apache.xml.resolver.Catalog {
        /** The FileSystem */
        private FileSystem fs;
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character 's' inside character class
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

### RegExpDuplicateCharacterInClass
Duplicate character 'i' inside character class
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

### RegExpDuplicateCharacterInClass
Duplicate character 's' inside character class
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

### RegExpDuplicateCharacterInClass
Duplicate character 'i' inside character class
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
        /** The regular expression to parse the key and the value of a property. */
        private static final Pattern PROPERTY_PATTERN = Pattern
            .compile("(([\\S&&[^\\\\" + new String(SEPARATORS) + "]]|\\\\.)*)(\\s*(\\s+|[" + new String(SEPARATORS) + "])\\s*)?(.*)");

        /** Constant for the index of the group for the key. */
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java

            try {
                for (final String lookupName : str.split("[\\s,]+")) {
                    if (!lookupName.isEmpty()) {
                        addLookup(DefaultLookups.valueOf(lookupName.toUpperCase()), lookupMap);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/configuration2/INIConfiguration.java`
#### Snippet
```java

        if (quoted) {
            return '"' + value.replace("\"", "\\\"") + '"';
        }
        return value;
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
        if (s.indexOf(' ') != -1 || s.indexOf('\t') != -1 || s.indexOf('\r') != -1 || s.indexOf('\n') != -1 || s.indexOf('"') != -1 || s.indexOf('(') != -1
            || s.indexOf(')') != -1 || s.indexOf('{') != -1 || s.indexOf('}') != -1 || s.indexOf('=') != -1 || s.indexOf(',') != -1 || s.indexOf(';') != -1) {
            s = s.replace("\"", "\\\"");
            s = "\"" + s + "\"";
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/io/FileUtils.java`
#### Snippet
```java
    /**
     * Decodes the specified URL as per RFC 3986, i.e. transforms percent-encoded octets to characters by decoding with the
     * UTF-8 character set. This function is primarily intended for usage with {@link java.net.URL} which unfortunately does
     * not enforce proper URLs. As such, this method will leniently accept invalid characters or malformed percent-encoded
     * octets and simply pass them literally through to the result string. Except for rare edge cases, this will make
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.tree` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/CombinedConfiguration.java`
#### Snippet
```java
 * methods. After that the configurations can be accessed either by name (if one was provided when the configuration was
 * added) or by index. For the whole set of managed configurations a logical node structure is constructed. For this
 * purpose a {@link org.apache.commons.configuration2.tree.NodeCombiner NodeCombiner} object can be set. This makes it
 * possible to specify different algorithms for the combination process.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.tree` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/CombinedConfiguration.java`
#### Snippet
```java
     * Creates a new instance of {@code CombinedConfiguration} that uses a union combiner.
     *
     * @see org.apache.commons.configuration2.tree.UnionCombiner
     */
    public CombinedConfiguration() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.xml.sax` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/resolver/DefaultEntityResolver.java`
#### Snippet
```java
     * @param systemId the system identifier of the entity being referenced
     * @return an input source for the specified entity
     * @throws org.xml.sax.SAXException if a parsing exception occurs
     */
    @SuppressWarnings("resource") // The stream is managed by the InputSource returned by this method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ConfigurationMap.java`
#### Snippet
```java
     *
     * @return a set with the contained entries
     * @see java.util.Map#entrySet()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ConfigurationMap.java`
#### Snippet
```java
     * @param value the value
     * @return the old value of this key or <b>null</b> if it is new
     * @see java.util.Map#put(Object, Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ConfigurationMap.java`
#### Snippet
```java
/**
 * <p>
 * The {@code ConfigurationMap} wraps a configuration-collection {@link org.apache.commons.configuration2.Configuration}
 * instance to provide a {@code Map} interface.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ConfigurationMap.java`
#### Snippet
```java
     * @param key the key
     * @return the value of this key
     * @see java.util.Map#get(Object)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/beanutils/ConfigurationDynaClass.java`
#### Snippet
```java
/**
 * The {@code ConfigurationDynaClass} dynamically determines properties for a {@code ConfigurationDynaBean} from a
 * wrapped configuration-collection {@link org.apache.commons.configuration2.Configuration} instance.
 *
 * @since 1.0-rc1
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java
 * </p>
 *
 * @see java.util.Properties
 * @see org.springframework.core.io.support.PropertiesLoaderSupport
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.springframework.beans.factory` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java

    /**
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/beanutils/ConfigurationDynaBean.java`
#### Snippet
```java
/**
 * The {@code ConfigurationDynaBean} dynamically reads and writes configurations properties from a wrapped
 * configuration-collection {@link org.apache.commons.configuration2.Configuration} instance. It also implements a
 * {@link java.util.Map} interface so that it can be used in JSP 2.0 Expression Language expressions.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/beanutils/ConfigurationDynaBean.java`
#### Snippet
```java
 * <p>
 * The {@code ConfigurationDynaBean} maps nested and mapped properties to the appropriate {@code Configuration} subset
 * using the {@link org.apache.commons.configuration2.Configuration#subset} method. Similarly, indexed properties
 * reference lists of configuration properties using the
 * {@link org.apache.commons.configuration2.Configuration#getList(String)} method. Setting an indexed property is
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/beanutils/ConfigurationDynaBean.java`
#### Snippet
```java
 * using the {@link org.apache.commons.configuration2.Configuration#subset} method. Similarly, indexed properties
 * reference lists of configuration properties using the
 * {@link org.apache.commons.configuration2.Configuration#getList(String)} method. Setting an indexed property is
 * supported, too.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated properties if key is found.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         String/List.
     * @throws IllegalArgumentException if one of the tokens is malformed (does not contain an equals sign).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated int if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Integer.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param target the target collection (may be <b>null</b>)
     * @return the collection to which data was added
     * @throws org.apache.commons.configuration2.ex.ConversionException if the conversion is not possible
     * @since 2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated short if key is found and has valid format, default value otherwise.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Short.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated short.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Short.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated boolean.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Boolean.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated long if key is found and has valid format, default value otherwise.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Long.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated float if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Float.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated list if the key is found.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not
     *         compatible with a list of the specified class.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated double.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Double.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated enum if key is found and has valid format, default value otherwise.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Enum.
     * @since 2.8.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated Duration if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Duration.
     * @since 2.8.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated byte if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Byte.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated string if key is found and has valid format, default value otherwise.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         String.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated long.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Long.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated int.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Integer.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated float.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Float.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated double.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Double.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated string array if key is found.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         String/List of Strings.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated boolean if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Boolean.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated double if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Double.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue the default value (may be <b>null</b>)
     * @return the collection to which data was added
     * @throws org.apache.commons.configuration2.ex.ConversionException if the conversion is not possible
     * @since 2.0
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated float.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Float.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated string.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         String.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated long.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Long.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated byte.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Byte.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated short.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Short.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key the key of the value
     * @return the value of the requested type for the key
     * @throws java.util.NoSuchElementException if the key doesn't map to an existing object and
     *         {@code throwExceptionOnMissing=true}
     * @throws org.apache.commons.configuration2.ex.ConversionException if the value is not compatible with the requested
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @throws java.util.NoSuchElementException if the key doesn't map to an existing object and
     *         {@code throwExceptionOnMissing=true}
     * @throws org.apache.commons.configuration2.ex.ConversionException if the value is not compatible with the requested
     *         type
     * @since 2.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated boolean.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Boolean.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated array if the key is found, and the value compatible with the type specified.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not
     *         compatible with an array of the specified class.
     * @throws IllegalArgumentException if the default value is not an array of the specified type
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated array if the key is found, and the value compatible with the type specified.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not
     *         compatible with a list of the specified class.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated Duration if key is found and has valid format, default value otherwise.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Duration.
     * @since 2.8.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param defaultValue The default value.
     * @return The associated int.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Integer.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated List of strings.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         List.
     * @see #getList(Class, String, List)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated List.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not
     *         compatible with a list of the specified class.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated List.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         List.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @param key The configuration key.
     * @return The associated byte.
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         Byte.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return The associated enum.
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException is thrown if the key maps to an object that is not a
     *         String.
     * @since 2.8.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.ex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/ImmutableConfiguration.java`
#### Snippet
```java
     * @return the value of the requested type for the key
     *
     * @throws org.apache.commons.configuration2.ex.ConversionException if the value is not compatible with the requested
     *         type
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.reloading` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/reloading/ManagedReloadingDetector.java`
#### Snippet
```java
     * from outside (through an exposed MBean) on behalf of an administrator.
     *
     * @see org.apache.commons.configuration2.reloading.ManagedReloadingDetectorMBean#refresh()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.configuration2.beanutils` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java
 * tags representing the different supported configuration classes. If such a tag is found, a corresponding
 * {@code ConfigurationBuilder} class is instantiated and initialized using the classes of the {@code beanutils} package
 * (namely {@link org.apache.commons.configuration2.beanutils.XMLBeanDeclaration XMLBeanDeclaration} will be used to
 * extract the configuration's initialization parameters, which allows for complex initialization scenarios).
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * Decorator providing additional getters for any Configuration. This extended Configuration supports more types:
 * <ul>
 * <li>{@link java.net.URL}</li>
 * <li>{@link java.util.Locale}</li>
 * <li>{@link java.util.Date}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * <ul>
 * <li>{@link java.net.URL}</li>
 * <li>{@link java.util.Locale}</li>
 * <li>{@link java.util.Date}</li>
 * <li>{@link java.util.Calendar}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * <li>{@link java.net.URL}</li>
 * <li>{@link java.util.Locale}</li>
 * <li>{@link java.util.Date}</li>
 * <li>{@link java.util.Calendar}</li>
 * <li>{@link java.awt.Color}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * <li>{@link java.util.Locale}</li>
 * <li>{@link java.util.Date}</li>
 * <li>{@link java.util.Calendar}</li>
 * <li>{@link java.awt.Color}</li>
 * <li>{@link java.net.InetAddress}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * <li>{@link java.util.Date}</li>
 * <li>{@link java.util.Calendar}</li>
 * <li>{@link java.awt.Color}</li>
 * <li>{@link java.net.InetAddress}</li>
 * <li>{@code javax.mail.internet.InternetAddress} (requires Javamail in the classpath)</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
 * <li>{@code javax.mail.internet.InternetAddress} (requires Javamail in the classpath)</li>
 * <li>{@code jakarta.mail.internet.InternetAddress} (requires Javamail 2.+ in the classpath)</li>
 * <li>{@link java.lang.Enum} (Java 5 enumeration types)</li>
 * </ul>
 *
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
                    catalog.loadSystemCatalogs();
                } catch (final Exception ex) {
                    ex.printStackTrace();
                }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            return parent != null ? parent.getURI() : null;
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            return getManager().resolveName(base, name.getBaseName()).getURI();
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            return resolveURI(path).getBaseName();
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
         */
        protected ResultSet openResultSet(final String sql, final boolean nameCol, final Object... params) throws SQLException {
            return resultSet = initStatement(sql, nameCol, params).executeQuery();
        }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java
                resObj = result;
                if (resObj == null) {
                    result = resObj = createResult();
                    created = true;
                }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `NodeCombiner()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/configuration2/tree/NodeCombiner.java`
#### Snippet
```java
     * Creates a new instance of {@code NodeCombiner}.
     */
    public NodeCombiner() {
        listNodes = new HashSet<>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractConfiguration()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
     * Creates a new instance of {@code AbstractConfiguration}.
     */
    public AbstractConfiguration() {
        interpolator = new AtomicReference<>();
        initLogger(null);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `childParameters` are queried, but never updated
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedBuilderParametersImpl.java`
#### Snippet
```java

    /** A list with default parameters for child configuration sources. */
    private final Collection<BuilderParameters> childParameters;

    /** The manager for default handlers. */
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `autoSaveListener` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/FileBasedConfigurationBuilder.java`
#### Snippet
```java

    /** A specialized listener for the auto save mechanism. */
    private AutoSaveListener autoSaveListener;

    /** A flag whether the builder's parameters were reset. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `resetParameters` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/FileBasedConfigurationBuilder.java`
#### Snippet
```java

    /** A flag whether the builder's parameters were reset. */
    private boolean resetParameters;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentFileHandler` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/FileBasedConfigurationBuilder.java`
#### Snippet
```java

    /** Stores the FileHandler associated with the current configuration. */
    private FileHandler currentFileHandler;

    /** A specialized listener for the auto save mechanism. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `reloadingController` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/combined/ReloadingCombinedConfigurationBuilder.java`
#### Snippet
```java
public class ReloadingCombinedConfigurationBuilder extends CombinedConfigurationBuilder implements ReloadingControllerSupport {
    /** The reloading controller used by this builder. */
    private ReloadingController reloadingController;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `definitionConfiguration` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java

    /** Stores temporarily the configuration with the builder definitions. */
    private HierarchicalConfiguration<?> definitionConfiguration;

    /** The object with data about configuration sources. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `sourceData` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java

    /** The object with data about configuration sources. */
    private ConfigurationSourceData sourceData;

    /** Stores the current parameters object. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentParameters` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java

    /** Stores the current parameters object. */
    private CombinedBuilderParametersImpl currentParameters;

    /** The current XML parameters object. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `currentXMLParameters` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java

    /** The current XML parameters object. */
    private XMLBuilderParametersImpl currentXMLParameters;

    /** The configuration that is currently constructed. */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `parameters` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java

    /** The map with current initialization parameters. */
    private Map<String, Object> parameters;

    /** The current bean declaration. */
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'java.lang.String'
in `src/main/java/org/apache/commons/configuration2/convert/PropertyConverter.java`
#### Snippet
```java
        try {
            final Constructor<?> ctor = Class.forName(targetClassName).getConstructor(String.class);
            return ctor.newInstance(value);
        } catch (final Exception e) {
            throw new ConversionException("The value " + value + " can't be converted to an InternetAddress", e);
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
                final String pkey = token.substring(0, equalSign).trim();
                final String pvalue = token.substring(equalSign + 1).trim();
                props.put(pkey, pvalue);
            } else if (tokens.length == 1 && StringUtils.isEmpty(key)) {
                // Semantically equivalent to an empty Properties
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `key`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
            return false;
        }
        key = key.replace('.', '/');
        try {
            // throws a NamingException if JNDI doesn't contain the key.
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java

        try {
            key = key.replace('.', '/');
            return getBaseContext().lookup(key);
        } catch (final NameNotFoundException | NotContextException nctxex) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `src/main/java/org/apache/commons/configuration2/io/FileHandler.java`
#### Snippet
```java
    private static String normalizeFileURL(String fileName) {
        if (fileName != null && fileName.startsWith(FILE_SCHEME) && !fileName.startsWith(FILE_SCHEME_SLASH)) {
            fileName = FILE_SCHEME_SLASH + fileName.substring(FILE_SCHEME.length());
        }
        return fileName;
```

### AssignmentToMethodParameter
Assignment to method parameter `lookup`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
    public static Lookup nullSafeLookup(Lookup lookup) {
        if (lookup == null) {
            lookup = DummyLookup.INSTANCE;
        }
        return lookup;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/configuration2/web/BaseWebConfiguration.java`
#### Snippet
```java
        if (value instanceof String) {
            final Collection<String> values = getListDelimiterHandler().split((String) value, true);
            value = values.size() > 1 ? values : values.iterator().next();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
        if (s.indexOf(' ') != -1 || s.indexOf('\t') != -1 || s.indexOf('\r') != -1 || s.indexOf('\n') != -1 || s.indexOf('"') != -1 || s.indexOf('(') != -1
            || s.indexOf(')') != -1 || s.indexOf('{') != -1 || s.indexOf('}') != -1 || s.indexOf('=') != -1 || s.indexOf(',') != -1 || s.indexOf(';') != -1) {
            s = s.replace("\"", "\\\"");
            s = "\"" + s + "\"";
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
            || s.indexOf(')') != -1 || s.indexOf('{') != -1 || s.indexOf('}') != -1 || s.indexOf('=') != -1 || s.indexOf(',') != -1 || s.indexOf(';') != -1) {
            s = s.replace("\"", "\\\"");
            s = "\"" + s + "\"";
        }

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
                    }
                    // try again!
                    continue;
                } finally {
                    try {
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
                } catch (final Exception ex) {
                    // Ignore an incorrect property.
                    continue;
                }
            }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-12-02-13-49.621.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationNodeIteratorBase.java`
#### Snippet
```java
    public NodePointer getNodePointer() {
        if (getPosition() < 1 && !setPosition(1)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileUtils.java`
#### Snippet
```java
    public static File toFile(final URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        String fileName = url.getFile().replace('/', File.separatorChar);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/DefaultFileSystem.java`
#### Snippet
```java
            return FileLocatorUtils.getFileName(url);
        } catch (final Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/DefaultFileSystem.java`
#### Snippet
```java
            return FileLocatorUtils.getBasePath(url);
        } catch (final Exception e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/DefaultFileSystem.java`
#### Snippet
```java
                getLogger().debug("Could not locate file " + fileName + " at " + basePath + ": " + e.getMessage());
            }
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/reloading/FileHandlerReloadingDetector.java`
#### Snippet
```java
                return FileLocatorUtils.fileFromURL(new URL(path.substring(0, path.indexOf('!'))));
            } catch (final MalformedURLException mex) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/ClasspathLocationStrategy.java`
#### Snippet
```java
    @Override
    public URL locate(final FileSystem fileSystem, final FileLocator locator) {
        return StringUtils.isEmpty(locator.getFileName()) ? null : FileLocatorUtils.locateFromClasspath(locator.getFileName());
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/BasePathLocationStrategy.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/OverrideCombiner.java`
#### Snippet
```java
            return HANDLER.getChildren(node2, child.getNodeName()).get(0);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/AbsoluteNameLocationStrategy.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/NodeCombiner.java`
#### Snippet
```java
            @Override
            public ImmutableNode getParent(final ImmutableNode node) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/NodeCombiner.java`
#### Snippet
```java
            @Override
            public ImmutableNode getRootNode() {
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/CombinedConfiguration.java`
#### Snippet
```java
        private Collection<String> parseAt(final String at) {
            if (StringUtils.isEmpty(at)) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/CombinedConfiguration.java`
#### Snippet
```java
        final Set<Configuration> sources = getSources(key);
        if (sources.isEmpty()) {
            return null;
        }
        final Iterator<Configuration> iterator = sources.iterator();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/reloading/VFSFileHandlerReloadingDetector.java`
#### Snippet
```java
    protected FileObject getFileObject() {
        if (!getFileHandler().isLocationDefined()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationXMLReader.java`
#### Snippet
```java
    @Override
    public Object getProperty(final String name) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationXMLReader.java`
#### Snippet
```java
    @Override
    public DTDHandler getDTDHandler() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationXMLReader.java`
#### Snippet
```java
    @Override
    public ErrorHandler getErrorHandler() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationXMLReader.java`
#### Snippet
```java
    @Override
    public EntityResolver getEntityResolver() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/FileBasedConfigurationBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/ConfigurationDeclaration.java`
#### Snippet
```java
    @Override
    public String getBeanClassName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/resolver/DefaultEntityResolver.java`
#### Snippet
```java
        }
        // default processing behavior
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/HomeDirectoryLocationStrategy.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
    protected Object getPropertyInternal(String key) {
        if (clearedProperties.contains(key)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NameNotFoundException | NotContextException nctxex) {
            // expected exception, no need to log it
            return null;
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, key, null, e);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        } catch (final NamingException e) {
            fireError(ConfigurationErrorEvent.READ, ConfigurationErrorEvent.READ, key, null, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/JNDIConfiguration.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java
    public static URL locate(final FileLocator locator) {
        if (locator == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java
    static String getFileName(final URL url) {
        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java

        if (path.endsWith("/") || StringUtils.isEmpty(path)) {
            return null;
        }
        return path.substring(path.lastIndexOf("/") + 1);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java
            return uri.toURL();
        } catch (final MalformedURLException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java
    static String getBasePath(final URL url) {
        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileLocatorUtils.java`
#### Snippet
```java

        final URL url = locate(locator);
        return url != null ? createFullyInitializedLocatorFromURL(locator, url) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationNodePointerFactory.java`
#### Snippet
```java
            return new ConfigurationNodePointer<>(wrapper.getNode(), locale, wrapper.getNodeHandler());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/xpath/ConfigurationNodePointerFactory.java`
#### Snippet
```java
            return new ConfigurationNodePointer<>((ConfigurationNodePointer<Object>) parent, wrapper.getNode(), wrapper.getNodeHandler());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConstantLookup.java`
#### Snippet
```java
    public Object lookup(final String var) {
        if (var == null) {
            return null;
        }
        return CACHE.computeIfAbsent(var, k -> {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/beanutils/ConfigurationDynaClass.java`
#### Snippet
```java
        final Object value = configuration.getProperty(name);
        if (value == null) {
            return null;
        }
        Class<?> type = value.getClass();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/beanutils/XMLBeanDeclaration.java`
#### Snippet
```java
    private String getAttribute(final NodeData<?> nodeData, final String attribute) {
        final Object value = nodeData.getAttribute(attribute);
        return value == null ? null : String.valueOf(interpolate(value));
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/XMLConfiguration.java`
#### Snippet
```java
    public Document getDocument() {
        final XMLDocumentHelper docHelper = getDocumentHelper();
        return docHelper != null ? docHelper.getDocument() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/FileExtensionConfigurationBuilderProvider.java`
#### Snippet
```java
    private static String extractExtension(final String fileName) {
        if (fileName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/FileExtensionConfigurationBuilderProvider.java`
#### Snippet
```java

        final int pos = fileName.lastIndexOf(EXT_SEPARATOR);
        return pos < 0 ? null : fileName.substring(pos + 1);
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/FileExtensionConfigurationBuilderProvider.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/spring/ConfigurationPropertiesFactoryBean.java`
#### Snippet
```java
     */
    private static <T> T[] defensiveCopy(final T[] src) {
        return src != null ? src.clone() : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/UnionCombiner.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileHandler.java`
#### Snippet
```java
    private static File createFile(final FileLocator loc) {
        if (loc.getFileName() == null && loc.getSourceURL() == null) {
            return null;
        }
        if (loc.getSourceURL() != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/FileHandler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ExprLookup.java`
#### Snippet
```java

        public Variable getVariable() {
            return !isEmpty() ? get(size() - 1) : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/DummyLookup.java`
#### Snippet
```java
    @Override
    public Object lookup(final String variable) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
            protected Integer performOperation() throws SQLException {
                try (ResultSet rs = openResultSet(String.format(SQL_IS_EMPTY, table), true)) {
                    return rs.next() ? Integer.valueOf(rs.getInt(1)) : null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DatabaseConfiguration.java`
#### Snippet
```java
                    return results.size() > 1 ? results : results.get(0);
                }
                return null;
            }
        };
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
    protected static String unescapeJava(final String str, final boolean jupCompatible) {
        if (str == null) {
            return null;
        }
        final int sz = str.length();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
                        break;
                    }
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfiguration.java`
#### Snippet
```java
                if (line == null) {
                    // EOF
                    return null;
                }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/convert/LegacyListDelimiterHandler.java`
#### Snippet
```java
    @Override
    protected String escapeString(final String s) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/convert/LegacyListDelimiterHandler.java`
#### Snippet
```java
            return buf.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java

        if (results.isEmpty()) {
            return null;
        }
        final NodeHandler<T> handler = getModel().getNodeHandler();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractHierarchicalConfiguration.java`
#### Snippet
```java

        if (list.size() < 1) {
            return null;
        }
        return list.size() == 1 ? list.get(0) : list;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
            return it.hasNext()
                    ? it.next()
                    : null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
            return value != null
                ? stringConverter.apply(value)
                : null;
        });
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
    public Object resolve(final String var) {
        if (var == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
            return getParentInterpolator().resolve(var);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/interpol/ConfigurationInterpolator.java`
#### Snippet
```java
                    return Array.getLength(obj) > 0
                            ? Array.get(obj, 0)
                            : null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationUtils.java`
#### Snippet
```java
    public static HierarchicalConfiguration<?> convertToHierarchical(final Configuration conf, final ExpressionEngine engine) {
        if (conf == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/ConfigurationUtils.java`
#### Snippet
```java
    public static Configuration cloneConfiguration(final Configuration config) throws ConfigurationRuntimeException {
        if (config == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/convert/DefaultConversionHandler.java`
#### Snippet
```java
    public Object toArray(final Object src, final Class<?> elemClass, final ConfigurationInterpolator ci) {
        if (src == null) {
            return null;
        }
        if (isEmptyElement(src)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/convert/DefaultConversionHandler.java`
#### Snippet
```java
    protected <T> T convertValue(final Object src, final Class<T> targetCls, final ConfigurationInterpolator ci) {
        if (src == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/convert/DefaultConversionHandler.java`
#### Snippet
```java
    protected Object extractConversionValue(final Object container, final Class<?> targetCls, final ConfigurationInterpolator ci) {
        final Collection<?> values = extractValues(container, 1);
        return values.isEmpty() ? null : ci.interpolate(values.iterator().next());
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
    private String extractComment(final List<String> commentLines, final int from, final int to) {
        if (to < from) {
            return null;
        }
        final StringBuilder buf = new StringBuilder(commentLines.get(from));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
     */
    private static String constructCanonicalComment(final String comment, final boolean commentChar) {
        return comment == null ? null : trimComment(comment, commentChar);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/DefaultConfigurationKey.java`
#### Snippet
```java
            } catch (final CloneNotSupportedException cex) {
                // should not happen
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/beanutils/BeanHelper.java`
#### Snippet
```java
            final PropertyDescriptor desc = BEAN_UTILS_BEAN.getPropertyUtils().getPropertyDescriptor(bean, propName);
            if (desc == null) {
                return null;
            }
            return desc.getPropertyType();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/beanutils/BeanHelper.java`
#### Snippet
```java
            return desc.getPropertyType();
        } catch (final Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/BasicBuilderParameters.java`
#### Snippet
```java
        final Map<?, ?> prefixes = fetchParameter(params, PROP_PREFIX_LOOKUPS, Map.class);
        if (prefixes == null) {
            return null;
        }
        prefixes.forEach((k, v) -> {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/BasicBuilderParameters.java`
#### Snippet
```java
        final Object value = params.get(key);
        if (value == null) {
            return null;
        }
        if (!expClass.isInstance(value)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/BasicBuilderParameters.java`
#### Snippet
```java
        final Collection<?> col = fetchParameter(params, PROP_DEFAULT_LOOKUPS, Collection.class);
        if (col == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/TreeData.java`
#### Snippet
```java
    public ImmutableNode getParent(final ImmutableNode node) {
        if (node == getRootNode()) {
            return null;
        }
        final ImmutableNode org = handleReplacements(node, inverseReplacementMapping);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/web/ServletRequestConfiguration.java`
#### Snippet
```java

        if (values == null || values.length == 0) {
            return null;
        }
        if (values.length == 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/NodeSelector.java`
#### Snippet
```java
        }

        return nodes.size() == 1 ? nodes.get(0) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/MultiWrapDynaClass.java`
#### Snippet
```java
    @Override
    public String getName() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/plist/PropertyListConfiguration.java`
#### Snippet
```java
    String quoteString(String s) {
        if (s == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                return stack.remove(stack.size() - 1);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/plist/XMLPropertyListConfiguration.java`
#### Snippet
```java
                return stack.get(stack.size() - 1);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/CombinedLocationStrategy.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/beanutils/DefaultBeanFactory.java`
#### Snippet
```java
    @Override
    public Class<?> getDefaultBeanClass() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java

        final String value = getString(key);
        return value != null ? decoder.decode(value) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    private static <T> Collection<T> handleDefaultCollection(final Collection<T> target, final Collection<T> defaultValue) {
        if (defaultValue == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
    protected String interpolate(final String base) {
        final Object result = interpolate((Object) base);
        return result == null ? null : result.toString();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/AbstractConfiguration.java`
#### Snippet
```java
        final List<T> result = new ArrayList<>();
        if (getCollection(cls, key, result, defaultValue) == null) {
            return null;
        }
        return result;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/MergeCombiner.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
        try {
            final FileName parent = resolveURI(path).getParent();
            return parent != null ? parent.getURI() : null;
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
    private FileSystemOptions getOptions(final String scheme) {
        if (scheme == null) {
            return null;
        }
        final FileSystemOptions opts = new FileSystemOptions();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            builder = getManager().getFileSystemConfigBuilder(scheme);
        } catch (final Exception ex) {
            return null;
        }
        final FileOptionsProvider provider = getFileOptionsProvider();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            final Map<String, Object> map = provider.getOptions();
            if (map == null) {
                return null;
            }
            int count = 0;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            }
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java

            if (!file.exists()) {
                return null;
            }
            final FileName path = file.getName();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
            return new URL(null, path.getURI(), handler);
        } catch (final FileSystemException | MalformedURLException fse) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/io/VFSFileSystem.java`
#### Snippet
```java
        } catch (final FileSystemException fse) {
            fse.printStackTrace();
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java
    private Map<String, ? extends Lookup> fetchPrefixLookups() {
        final CombinedConfiguration cc = getConfigurationUnderConstruction();
        return cc != null ? cc.getInterpolator().getLookups() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java
            return (FileSystem) fetchBeanHelper().createBean(decl);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java
            @Override
            public Object getBeanFactoryParameter() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java
            @Override
            public String getBeanFactoryName() {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java

            final DefaultConversionHandler orgHandler = getOriginalConversionHandler();
            return orgHandler != null ? orgHandler.getDateFormat() : null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
    private DefaultConversionHandler getOriginalConversionHandler() {
        final ConversionHandler handler = super.getConversionHandler();
        return (DefaultConversionHandler) (handler instanceof DefaultConversionHandler ? handler : null);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
            throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/DataConfiguration.java`
#### Snippet
```java
            throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/NodeTracker.java`
#### Snippet
```java
         */
        public TrackedNodeData observerRemoved() {
            return observerCount <= 1 ? null : new TrackedNodeData(node, observerCount - 1, getDetachedModel());
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/configuration2/tree/InMemoryNodeModel.java`
#### Snippet
```java
            return node.getNodeName();
        }
        return null;
    }

```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/configuration2/reloading/ReloadingController.java`
#### Snippet
```java
    public boolean checkForReloading(final Object data) {
        boolean sendEvent = false;
        synchronized (this) {
            if (isInReloadingState()) {
                return true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/configuration2/builder/combined/CombinedConfigurationBuilder.java`
#### Snippet
```java
    private void addDefinitionBuilderChangeListener(final ConfigurationBuilder<? extends HierarchicalConfiguration<?>> defBuilder) {
        defBuilder.addEventListener(ConfigurationBuilderEvent.RESET, event -> {
            synchronized (this) {
                reset();
                definitionBuilder = defBuilder;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java
        boolean created = false;
        if (resObj == null) {
            synchronized (this) {
                resObj = result;
                if (resObj == null) {
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/configuration2/builder/BasicConfigurationBuilder.java`
#### Snippet
```java
    public void resetResult() {
        final T oldResult;
        synchronized (this) {
            oldResult = result;
            result = null;
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'globalSeparator', 'lineSeparator' and 'forceSingleLine'
in `src/main/java/org/apache/commons/configuration2/PropertiesConfigurationLayout.java`
#### Snippet
```java
     * @param c the layout object to be copied
     */
    public PropertiesConfigurationLayout(final PropertiesConfigurationLayout c) {
        loadCounter = new AtomicInteger();
        layoutData = new LinkedHashMap<>();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `modifiedKey` initializer `null` is redundant
in `src/main/java/org/apache/commons/configuration2/SubsetConfiguration.java`
#### Snippet
```java
            throw new IllegalArgumentException("The parent key '" + key + "' is not in the subset.");
        }
        String modifiedKey = null;
        if (key.length() == prefix.length()) {
            modifiedKey = "";
```

### UnusedAssignment
The value `null` assigned to `inputStream` is never used
in `src/main/java/org/apache/commons/configuration2/resolver/CatalogResolver.java`
#### Snippet
```java
                    } catch (final IOException ioe) {
                        // Ignore the exception.
                        inputStream = null;
                    }
                }
```

