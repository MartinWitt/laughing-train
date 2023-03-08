# uber-graph-benchmark 
 
# Bad smells
I found 224 bad smells with 31 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 31 | false |
| ThrowablePrintStackTrace | 21 | false |
| SystemOutErr | 17 | false |
| SizeReplaceableByIsEmpty | 12 | true |
| ReturnNull | 12 | false |
| ObsoleteCollection | 8 | false |
| UnstableApiUsage | 8 | false |
| ZeroLengthArrayInitialization | 7 | false |
| NonSerializableFieldInSerializableClass | 7 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 6 | false |
| RedundantFieldInitialization | 6 | false |
| UnnecessaryBoxing | 6 | false |
| NonStaticFinalLogger | 5 | false |
| DataFlowIssue | 5 | false |
| UseOfPropertiesAsHashtable | 4 | false |
| NonExceptionNameEndsWithException | 4 | false |
| UnusedAssignment | 4 | false |
| UnnecessaryReturn | 3 | true |
| CodeBlock2Expr | 3 | true |
| EmptyMethod | 3 | false |
| CatchMayIgnoreException | 3 | false |
| ProtectedMemberInFinalClass | 3 | true |
| InnerClassMayBeStatic | 3 | true |
| BusyWait | 3 | false |
| StringEquality | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ConstantValue | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| Convert2MethodRef | 2 | false |
| RedundantCollectionOperation | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| UnnecessaryLocalVariable | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CommentedOutCode | 1 | false |
| ManualArrayCopy | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| InfiniteLoopStatement | 1 | false |
| IndexOfReplaceableByContains | 1 | false |
| IOResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| SamePackageImport | 1 | false |
| RedundantFileCreation | 1 | false |
| UseBulkOperation | 1 | false |
| NumericOverflow | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new RelationTypeDTO\[linkTypeDTOS.size()\]'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
                contextStack.pop();
            }
            schemaDTO.setRelations(linkTypeDTOS.toArray(new RelationTypeDTO[linkTypeDTOS.size()]));

            contextStack.pop();
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
            String username = properties.getProperty("cassandra.username", "");
            String password = properties.getProperty("cassandra.password", "");
            if (username != "" && password != "") {
                builder.withCredentials(username, password);
            }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
            String username = properties.getProperty("cassandra.username", "");
            String password = properties.getProperty("cassandra.password", "");
            if (username != "" && password != "") {
                builder.withCredentials(username, password);
            }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
        Object headId = graph.genVertexId(headLabel, headIndex);

        //System.out.println(String.format("gen %s(%d:%d) %s %s(%d:%d)",
        //    tailLabel, tailIndex, tailId,
        //    label,
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `core/src/main/java/com/uber/ugb/db/GremlinDB.java`
#### Snippet
```java
        params[2] = T.id;
        params[3] = id;
        for (int i = 0; i < keyValues.length; i++) {
            params[i + 4] = keyValues[i];
        }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
    public Set<E> getInferredTypes() {
        Set<E> inferredTypes = new HashSet<>();
        Stack<E> types = new Stack<E>();
        types.push((E) this);
        while (!types.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
    public Set<E> getInferredTypes() {
        Set<E> inferredTypes = new HashSet<>();
        Stack<E> types = new Stack<E>();
        types.push((E) this);
        while (!types.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            throws InvalidSchemaException, UpdateFailedException {

        Stack<StorageSchemaElement> startNodes = new Stack<>();
        for (StorageSchemaElement storageSchemaElement : elementsByQualifiedName.values()) {
            if (0 == storageSchemaElement.getDependents().size()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            throws InvalidSchemaException, UpdateFailedException {

        Stack<StorageSchemaElement> startNodes = new Stack<>();
        for (StorageSchemaElement storageSchemaElement : elementsByQualifiedName.values()) {
            if (0 == storageSchemaElement.getDependents().size()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java

    private void materializeAndValidateVocabulary() throws InvalidSchemaException {
        contextStack = new Stack<>();

        materializeSchemas();
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private final Map<String, SchemaDTO> schemaDTOs = new LinkedHashMap<>();
    private Map<String, Schema> schemasByName;
    private Stack<SchemaElement> contextStack;

    private boolean requireDescriptions;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java

    private <T> T getInferred(final RelationType relationType, final Function<RelationType, T> accessor) {
        Stack<RelationType> stack = new Stack<>();
        stack.push(relationType);
        while (!stack.isEmpty()) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java

    private <T> T getInferred(final RelationType relationType, final Function<RelationType, T> accessor) {
        Stack<RelationType> stack = new Stack<>();
        stack.push(relationType);
        while (!stack.isEmpty()) {
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `firstSchemas.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        Set<String> schemasRemoved = new HashSet<>();
        Set<String> schemasAdded = new HashSet<>();
        for (String key : firstSchemas.keySet()) {
            if (!secondSchemas.containsKey(key)) {
                schemasRemoved.add(key);
```

### KeySetIterationMayUseEntrySet
Iteration over `secondSchemas.keySet()` may be replaced with 'entrySet()' iteration
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
            }
        }
        for (String key : secondSchemas.keySet()) {
            if (!firstSchemas.containsKey(key)) {
                schemasAdded.add(key);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`this.edges.size() > 0` can be replaced with '!this.edges.isEmpty()'
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java

    public int getEdgeCount() {
        if (this.edges.size() > 0) {
            return countEdges(this.edges);
        }
```

### SizeReplaceableByIsEmpty
`this.edges.size() > 0` can be replaced with '!this.edges.isEmpty()'
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java

    public int getVertexCount() {
        if (this.edges.size() > 0) {
            return countVertices(this.edges);
        }
```

### SizeReplaceableByIsEmpty
`0 == types.size()` can be replaced with 'types.isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/Vocabulary.java`
#### Snippet
```java
    public EntityType getEntityType(final String localName) {
        Set<EntityType> types = entityTypesByLocalName.get(localName);
        if (null == types || 0 == types.size()) {
            throw new IllegalArgumentException("no entity type with label " + localName);
        } else if (types.size() > 1) {
```

### SizeReplaceableByIsEmpty
`0 == types.size()` can be replaced with 'types.isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/Vocabulary.java`
#### Snippet
```java
    public RelationType getRelationType(final String localName, final SchemaManager.TypeCategory fromCategory) {
        Set<RelationType> types = relationTypesByLocalName.get(localName);
        if (null == types || 0 == types.size()) {
            throw new IllegalArgumentException("no relation type with label " + localName);
        } else if (types.size() > 1) {
```

### SizeReplaceableByIsEmpty
`0 == getExtends().size()` can be replaced with 'getExtends().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/model/EntityType.java`
#### Snippet
```java
            throws InvalidSchemaException {

        if (null == getExtends() || 0 == getExtends().size()) {
            baseEntities.add(this);
        } else {
```

### SizeReplaceableByIsEmpty
`dataCenter.length() != 0` can be replaced with '!dataCenter.isEmpty()'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
                builder.withCredentials(username, password);
            }
            if (dataCenter.length() != 0) {
                builder.withLoadBalancingPolicy(
                    LatencyAwarePolicy.builder(
```

### SizeReplaceableByIsEmpty
`0 == storageSchemaElement.getDependents().size()` can be replaced with 'storageSchemaElement.getDependents().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
        Stack<StorageSchemaElement> startNodes = new Stack<>();
        for (StorageSchemaElement storageSchemaElement : elementsByQualifiedName.values()) {
            if (0 == storageSchemaElement.getDependents().size()) {
                startNodes.add(storageSchemaElement);
            }
```

### SizeReplaceableByIsEmpty
`0 == dep.getDependents().size()` can be replaced with 'dep.getDependents().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            for (StorageSchemaElement dep : deps) {
                dep.getDependents().remove(el);
                if (0 == dep.getDependents().size()) {
                    startNodes.add(dep);
                }
```

### SizeReplaceableByIsEmpty
`0 != el.getDependents().size()` can be replaced with '!el.getDependents().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
        // extra check for cycles; validation checks should prevent this
        for (StorageSchemaElement el : elementsByQualifiedName.values()) {
            if (0 != el.getDependents().size()) {
                throw new InvalidSchemaException("dependency cycle(s) detected at " + el.getSchemaElement());
            }
```

### SizeReplaceableByIsEmpty
`0 < field.trim().length()` can be replaced with '!field.trim().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    protected void checkRequiredAndNonempty(final String field, final String fieldName) throws InvalidSchemaException {
        checkRequiredField(field, fieldName);
        checkArgument(0 < field.trim().length(), fieldName + " may not be empty");
    }

```

### SizeReplaceableByIsEmpty
`0 == element.getDescription().length()` can be replaced with 'element.getDescription().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java

    private void checkDescription(final SchemaElement element) {
        if (null == element.getDescription() || 0 == element.getDescription().length()) {
            throw new InvalidSchemaException("missing description");
        }
```

### SizeReplaceableByIsEmpty
`0 < entityType.getExtends().size()` can be replaced with '!entityType.getExtends().isEmpty()'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
            throws InvalidSchemaException {
        if (!isCoreSchema(schema)) {
            checkArgument(null != entityType.getExtends() && 0 < entityType.getExtends().size(),
                    "non-core " + entityType + " must extend a basic entity type");
        }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
    public void cleanup() throws DBException {
        out.close();
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
            }
        }
        return;
    }

```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
                }
                rows.add(new PrefixQueriedRow(byteBuffer1.array(), byteBuffer2.array()));
                return;
            });

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `SchemaManager` has no concrete subclass
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
 * @param <D> the class of the database or storage schema management API
 */
public abstract class SchemaManager<D> implements Serializable {

    protected static Logger logger = LoggerFactory.getLogger(SchemaManager.class);
```

### AbstractClassNeverImplemented
Abstract class `StorageSchemaElement` has no concrete subclass
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
     * @param <T> the class of the storage schema element
     */
    public abstract class StorageSchemaElement<C extends Type, T> {
        protected TypeCategory typeCategory;
        protected String storageName;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Edge`
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
    }

    private int countVertices(List<Edge> edges) {
        Set set = new HashSet();
        for (Edge edge : edges) {
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
    }

    private int countEdges(List<Edge> edges) {
        Set set = new HashSet();
        for (Edge edge : edges) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/uber/ugb/model/BucketedEdgeDistribution.java`
#### Snippet
```java
        private final int size;

        RandomSubset(final IndexSet<T> base, final int size, final Random random) {
            this.base = base;
            this.permutation = new RandomPermutation(base.size(), random).getPermutation();
```

### BoundedWildcard
Can generalize to `? super E`
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
    }

    protected <T> T getField(final Function<E, T> accessor) {

        T value = accessor.apply((E) this);
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java

    private static <T, X extends Exception> boolean hasCycleInternal(
        T start, Set<T> visited, Set<T> work, FunctionWithException<T, Iterable<T>, X> getChildren) throws X {
        if (work.contains(start)) {
            return true;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java

    private static <T, X extends Exception> boolean hasCycleInternal(
        T start, Set<T> visited, Set<T> work, FunctionWithException<T, Iterable<T>, X> getChildren) throws X {
        if (work.contains(start)) {
            return true;
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java

    private static <T, X extends Exception> boolean hasCycleInternal(
        T start, Set<T> visited, Set<T> work, FunctionWithException<T, Iterable<T>, X> getChildren) throws X {
        if (work.contains(start)) {
            return true;
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java

    private static <T, X extends Exception> boolean hasCycleInternal(
        T start, Set<T> visited, Set<T> work, FunctionWithException<T, Iterable<T>, X> getChildren) throws X {
        if (work.contains(start)) {
            return true;
```

### BoundedWildcard
Can generalize to `? super Task`
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java

    public void traverseOneStep(Object id, QueriesSpec.Query.Step step, Set<Object> visitedVertexIds,
                                LinkedBlockingQueue<Task> tasks, Subgraph subgraph,
                                int stepId, boolean isLastStep) throws Exception {

```

### BoundedWildcard
Can generalize to `? extends IdempotentOperation`
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
    }

    private void executeWorkflow(final List<IdempotentOperation> workflow) throws UpdateFailedException {
        tryInTransaction(() -> {
            try {
```

### BoundedWildcard
Can generalize to `? super IdempotentOperation`
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
    }

    private void addTypesAndLinks(final List<IdempotentOperation> workflow)
            throws InvalidSchemaException, UpdateFailedException {
        List<StorageSchemaElement> sorted = sortElementsByDependencies();
```

### BoundedWildcard
Can generalize to `? super IdempotentOperation`
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java

    // TODO: mixed indexes, vertex-centric property indexes
    private void addIndexes(final List<IdempotentOperation> workflow)
            throws InvalidSchemaException, UpdateFailedException {
        for (Index idx : vocabulary.getIndexes()) {
```

### BoundedWildcard
Can generalize to `? super Schema`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private <T extends Type> T getType(final QualifiedName qn,
                                       final Schema refSchema,
                                       final Function<Schema, Map<String, T>> toTypes) {
        Schema schema = getSchemaForName(qn, refSchema);
        return toTypes.apply(schema).get(qn.getLocalName());
```

### BoundedWildcard
Can generalize to `? extends Map`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private <T extends Type> T getType(final QualifiedName qn,
                                       final Schema refSchema,
                                       final Function<Schema, Map<String, T>> toTypes) {
        Schema schema = getSchemaForName(qn, refSchema);
        return toTypes.apply(schema).get(qn.getLocalName());
```

### BoundedWildcard
Can generalize to `? super EntityType`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private <X extends Exception> void forAllEntityTypes(final ConsumerWithException<EntityType, X> consumer) throws X {
        forAllSchemas(schema -> {
            for (EntityType entityType : schema.getEntityTypes().values()) {
```

### BoundedWildcard
Can generalize to `? super RelationTypeDTO`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private void expandInlineLinks(final TypeDTO typeDTO, List<RelationTypeDTO> linkTypeDTOS)
            throws InvalidSchemaException {
        for (InlineRelationTypeDTO inlineDTO : typeDTO.getRelations()) {
```

### BoundedWildcard
Can generalize to `? extends SchemaDTO`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
     * Adds zero or more schemas to this builder
     */
    public void addSchemas(final Collection<SchemaDTO> schemaDTOs) {
        for (SchemaDTO schemaDTO : schemaDTOs) {
            addSchema(schemaDTO);
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private static <T> void checkUnique(T[] elements, Function<T, String> nameGetter) throws InvalidSchemaException {
        checkUnique(Arrays.asList(elements), nameGetter);
    }
```

### BoundedWildcard
Can generalize to `? super RelationType`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private <X extends Exception> void forAllRelationTypes(final ConsumerWithException<RelationType, X> consumer)
            throws X {
        forAllSchemas(schema -> {
```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private static <T> void checkUnique(Collection<T> elements, Function<T, String> nameGetter)
            throws InvalidSchemaException {
        Set<String> names = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super T`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private static <T> void checkUnique(Collection<T> elements, Function<T, String> nameGetter)
            throws InvalidSchemaException {
        Set<String> names = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super RelationType`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private <T> T getInferred(final RelationType relationType, final Function<RelationType, T> accessor) {
        Stack<RelationType> stack = new Stack<>();
        stack.push(relationType);
```

### BoundedWildcard
Can generalize to `? super Schema`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private <X extends Exception> void forAllSchemas(final ConsumerWithException<Schema, X> consumer) throws X {
        for (Schema schema : schemasByName.values()) {
            consumer.accept(schema);
```

### BoundedWildcard
Can generalize to `? super R`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        private <R> void addDiff(final Collection<R> firstSet,
                                 final Collection<R> secondSet,
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
```

### BoundedWildcard
Can generalize to `? extends SchemaChange`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        private <R> void addDiff(final Collection<R> firstSet,
                                 final Collection<R> secondSet,
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
```

### BoundedWildcard
Can generalize to `? super R`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                 final Collection<R> secondSet,
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
            SetDiff<R> diff = new SetDiff<>(firstSet, secondSet);
```

### BoundedWildcard
Can generalize to `? extends SchemaChange`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                 final Collection<R> secondSet,
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
            SetDiff<R> diff = new SetDiff<>(firstSet, secondSet);
```

### BoundedWildcard
Can generalize to `? super R`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
            SetDiff<R> diff = new SetDiff<>(firstSet, secondSet);

```

### BoundedWildcard
Can generalize to `? super R`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
                                 final Function<R, SchemaChange> addedConstructor,
                                 final Function<R, SchemaChange> removedConstructor,
                                 final BiConsumer<R, R> elementDiffFunction) {
            SetDiff<R> diff = new SetDiff<>(firstSet, secondSet);

```

### BoundedWildcard
Can generalize to `? extends T`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        }

        private static <T> Map<T, T> toSet(Collection<T> items) {
            Map<T, T> set = new HashMap<>();
            if (null != items) {
```

### BoundedWildcard
Can generalize to `? super SchemaChange`
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        private final List<SchemaChange> changes;

        SchemaDiffHelper(final Schema oldSchema, final Schema newSchema, final List<SchemaChange> changes) {
            this.oldSchema = oldSchema;
            this.newSchema = newSchema;
```

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
public abstract class AbstractSubgraphDB extends DB {

    protected static final ThreadLocal<ThreadPoolExecutor> TL_EXECUTOR_BUILDER = new ThreadLocal<ThreadPoolExecutor>() {
        @Override
        protected ThreadPoolExecutor initialValue() {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
    public static File createTempDirectory() throws IOException {
        File tmpFile = File.createTempFile("ugraph-tmp-", "-dir");
        tmpFile.delete();
        tmpFile.mkdirs();
        assertTrue(tmpFile.exists());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
        File tmpFile = File.createTempFile("ugraph-tmp-", "-dir");
        tmpFile.delete();
        tmpFile.mkdirs();
        assertTrue(tmpFile.exists());
        assertTrue(tmpFile.isDirectory());
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
10 \* 35 \* 24 \* 60 \* 60 \* 1000: integer multiplication implicitly cast to long
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

    @Override
```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `core/src/main/java/com/uber/ugb/util/RandomPermutationTest.java`
#### Snippet
```java
    public void testInitializationTime() {
        Mutable<Integer> size = new Mutable<>(1);
        while (true) { // exit by failing with OOME
            long time = timeToEvaluate(() -> new RandomPermutation(size.value));
            System.out.println("permutation of size " + size.value + " --> " + time + " ms to construct");
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
                        if (todo instanceof VertexWriteRequest) {
                            VertexWriteRequest request = (VertexWriteRequest) todo;
                            this.db.getMetrics().writeVertex.measure(() -> {
                                this.db.writeVertex(request.label, request.id, request.keyValues);
                            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
                        if (todo instanceof EdgeWriteRequest) {
                            EdgeWriteRequest request = (EdgeWriteRequest) todo;
                            this.db.getMetrics().writeEdge.measure(() -> {
                                this.db.writeEdge(request.edgeLabel,
                                    request.outVertexLabel, request.outVertexId,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java

    private void commit(final DB graph) {
        graph.getMetrics().batchCommit.measure(() -> {
            graph.commitBatch();
        });
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `vertexPartition` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
    // used in random permutations and degree distributions
    protected long randomSeed;
    private Map<QualifiedName, Long> vertexPartition;
    private long batchSize = 1000;
    private int batchCounter = 0;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `randomSeed` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
    private final GraphModel model;
    // used in random permutations and degree distributions
    protected long randomSeed;
    private Map<QualifiedName, Long> vertexPartition;
    private long batchSize = 1000;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `out` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
public class CsvOutputDB extends DB {

    private PrintStream out;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
public abstract class SchemaManager<D> implements Serializable {

    protected static Logger logger = LoggerFactory.getLogger(SchemaManager.class);

    private static final long serialVersionUID = 2830190107857616735L;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `requireDescriptions` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private Stack<SchemaElement> contextStack;

    private boolean requireDescriptions;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `contextStack` is accessed in both synchronized and unsynchronized contexts
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private final Map<String, SchemaDTO> schemaDTOs = new LinkedHashMap<>();
    private Map<String, Schema> schemasByName;
    private Stack<SchemaElement> contextStack;

    private boolean requireDescriptions;
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
            }
            if (properties.containsKey(s)) {
                answer.put(s, properties.getProperty(s));
            }
        });
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
        if (!hasFilterField.get() && filterField != null) {
            if (properties.containsKey(filterField)) {
                answer.put(filterField, properties.getProperty(filterField));
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
        if (keyValues != null) {
            for (int i = 0; i < keyValues.length; i += 2) {
                properties.put(keyValues[i], keyValues[i + 1]);
            }
        }
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java
        if (keyValues != null) {
            for (int i = 0; i < keyValues.length; i += 2) {
                properties.put(keyValues[i], keyValues[i + 1]);
            }
        }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/com/uber/ugb/schema/IdempotentOperation.java`
#### Snippet
```java
    }

    protected abstract void execute() throws SchemaManager.UpdateFailedException, InvalidSchemaException;

    protected abstract N getExisting();
```

### EmptyMethod
All implementations of this method are empty
in `core/src/main/java/com/uber/ugb/schema/IdempotentOperation.java`
#### Snippet
```java
    protected abstract N getExisting();

    protected abstract void checkExistingIsAsExpected(N existing)
            throws InvalidSchemaException, SchemaManager.InvalidUpdateException;

```

### EmptyMethod
The method is empty
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java
        }

        private <T> void ignorePair(final T first, final T second) {
        }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `core/src/main/java/com/uber/ugb/measurement/StreamingStandardDeviation.java`
#### Snippet
```java
    private long count = 0;
    private double average = 0.0;
    private double pwrSumAvg = 0.0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `core/src/main/java/com/uber/ugb/measurement/StreamingStandardDeviation.java`
#### Snippet
```java

    private long count = 0;
    private double average = 0.0;
    private double pwrSumAvg = 0.0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/uber/ugb/measurement/StreamingStandardDeviation.java`
#### Snippet
```java
    // http://obscuredclarity.blogspot.com/2012/08/running-average-and-running-standard.html

    private long count = 0;
    private double average = 0.0;
    private double pwrSumAvg = 0.0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/uber/ugb/model/distro/ConstantDegreeDistribution.java`
#### Snippet
```java
    public Sample createSample(final int size, final Random random) {
        return new Sample() {
            private int nextIndex = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/uber/ugb/model/generator/WeightedValueslGenerator.java`
#### Snippet
```java

    StatisticsSpec.PropertyValueWeight[] valueWeights;
    int totalWeights = 0;

    public WeightedValueslGenerator(StatisticsSpec.PropertyValueWeight[] valueWeights) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
    private Map<QualifiedName, Long> vertexPartition;
    private long batchSize = 1000;
    private int batchCounter = 0;

    /**
```

## RuleId[id=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `logger`
in `core/src/main/java/com/uber/ugb/util/ProgressReporter.java`
#### Snippet
```java
public class ProgressReporter {

    private static Logger logger = Logger.getLogger(ProgressReporter.class.getName());

    String prefix;
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
    public static final String READ_THREAD_COUNT_PROPERTY = "read.thread.count";
    public static final String READ_OPERATION_COUNT_PROPERTY = "read.operation.count";
    public static Logger logger = Logger.getLogger(Benchmark.class.getName());

    public static void main(String[] args) {
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `core/src/main/java/com/uber/ugb/model/Incidence.java`
#### Snippet
```java
    private static final long serialVersionUID = -2672233051122503355L;

    private static Logger logger = Logger.getLogger(Incidence.class.getName());

    private final QualifiedName vertexLabel;
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
public class GraphGenerator implements Serializable {

    private static Logger logger = Logger.getLogger(GraphGenerator.class.getName());
    private final GraphModel model;
    // used in random permutations and degree distributions
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
public class GraphScraper {

    private static Logger logger = Logger.getLogger(GraphScraper.class.getName());

    public GraphScraper() {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/TypeDTO.java`
#### Snippet
```java
    private String sameAs;
    private String[] extended = new String[]{};
    private InlineRelationTypeDTO[] relations = new InlineRelationTypeDTO[]{};

    public TypeDTO() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/TypeDTO.java`
#### Snippet
```java
    private boolean isAbstract;
    private String sameAs;
    private String[] extended = new String[]{};
    private InlineRelationTypeDTO[] relations = new InlineRelationTypeDTO[]{};

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/SchemaDTO.java`
#### Snippet
```java
    private String[] includes = new String[]{};
    private EntityTypeDTO[] entities = new EntityTypeDTO[]{};
    private RelationTypeDTO[] relations = new RelationTypeDTO[]{};
    private IndexDTO[] indexes = new IndexDTO[]{};

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/SchemaDTO.java`
#### Snippet
```java
    private String name;
    private String[] includes = new String[]{};
    private EntityTypeDTO[] entities = new EntityTypeDTO[]{};
    private RelationTypeDTO[] relations = new RelationTypeDTO[]{};
    private IndexDTO[] indexes = new IndexDTO[]{};
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/SchemaDTO.java`
#### Snippet
```java
    private EntityTypeDTO[] entities = new EntityTypeDTO[]{};
    private RelationTypeDTO[] relations = new RelationTypeDTO[]{};
    private IndexDTO[] indexes = new IndexDTO[]{};

    public SchemaDTO() {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/model/dto/SchemaDTO.java`
#### Snippet
```java

    private String name;
    private String[] includes = new String[]{};
    private EntityTypeDTO[] entities = new EntityTypeDTO[]{};
    private RelationTypeDTO[] relations = new RelationTypeDTO[]{};
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
            contextStack.pop();
        }
        typeDTO.setRelations(new InlineRelationTypeDTO[]{});
    }

```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
    }

    private interface RunnableWithException<E extends Exception> {
        void run() throws E;
    }
```

### NonExceptionNameEndsWithException
Non-exception class name `FunctionWithException` ends with 'Exception'
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
    }

    public interface FunctionWithException<D, R, X extends Throwable> {
        R apply(D d) throws X;
    }
```

### NonExceptionNameEndsWithException
Non-exception class name `RunnableWithException` ends with 'Exception'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
    protected abstract <C extends Type, T> StorageSchemaElement<C, T> createSchemaElement(C element);

    protected interface RunnableWithException<E extends Exception> {
        void run() throws E;
    }
```

### NonExceptionNameEndsWithException
Non-exception class name `ConsumerWithException` ends with 'Exception'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    private interface ConsumerWithException<T, X extends Exception> {
        void accept(T t) throws X;
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `valueObject` initializer `null` is redundant
in `core/src/main/java/com/uber/ugb/queries/Filter.java`
#### Snippet
```java

    public Object getValueObject() {
        Object valueObject = null;
        // support either single quoted string or integers
        if (this.value.startsWith("'") && this.value.endsWith("'")) {
```

### UnusedAssignment
Variable `i` initializer `0` is redundant
in `core/src/main/java/com/uber/ugb/model/Incidence.java`
#### Snippet
```java
        int[] degrees = new int[counts.size()];
        double[] weights = new double[counts.size()];
        int i = 0;
        for (i = 0; i < counts.size(); i++) {
            DegreeCount degreeCount = counts.get(i);
```

### UnusedAssignment
Variable `totalWeights` initializer `0` is redundant
in `core/src/main/java/com/uber/ugb/model/generator/WeightedValueslGenerator.java`
#### Snippet
```java

    StatisticsSpec.PropertyValueWeight[] valueWeights;
    int totalWeights = 0;

    public WeightedValueslGenerator(StatisticsSpec.PropertyValueWeight[] valueWeights) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                    try {
                        db.getMetrics().subgraph.measure(() -> {
                            QueryResult result = null;
                            if (queryText != null) {
                                result = db.executeQuery(queryText, subgraph.startVertexId);
```

## RuleId[id=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`snakeCase.indexOf("_") < 0` can be replaced with '!snakeCase.contains("_")'
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
     */
    public static String toLowerCamelCase(final String snakeCase) {
        if (snakeCase.indexOf("_") < 0 && Character.isLowerCase(snakeCase.charAt(0))) {
            return snakeCase;
        }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `!done99th` is always `true`
in `core/src/main/java/com/uber/ugb/measurement/LatencyHistogram.java`
#### Snippet
```java
                done95th = true;
            }
            if ((!done99th) && ((double) opcounter) / operationCount >= 0.99) {
                out.write(name, "99thPercentile(us)", i);
                done99th = true;
```

### ConstantValue
Value `done99th` is always 'false'
in `core/src/main/java/com/uber/ugb/measurement/LatencyHistogram.java`
#### Snippet
```java
                done95th = true;
            }
            if ((!done99th) && ((double) opcounter) / operationCount >= 0.99) {
                out.write(name, "99thPercentile(us)", i);
                done99th = true;
```

## RuleId[id=IOResource]
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `core/src/main/java/com/uber/ugb/model/GraphModel.java`
#### Snippet
```java
    private byte[] toByteArray() throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ObjectOutput out = new ObjectOutputStream(bos);
            out.writeObject(this);
            out.flush();
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Benchmark` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
import java.util.logging.Logger;

public class Benchmark {

    public static final String GRAPH_PARTITION_COUNT_PROPERTY = "graph.partition.count";
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaUtils` has only 'static' members, and lacks a 'private' constructor
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
 * Miscellaneous utilities for use with schemas and ingestion
 */
public final class SchemaUtils {
    /**
     * Creates a directory which will be deleted on exit
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getValueObject` may produce `NullPointerException`
in `core/src/main/java/com/uber/ugb/queries/QueriesSpec.java`
#### Snippet
```java
                        filterObect = parseFilter(filter);
                    }
                    Object value = filterObect.getValueObject();

                    String propertyValue = properties.getProperty(filterObect.field);
```

### DataFlowIssue
Method invocation `getLabel` may produce `NullPointerException`
in `core/src/main/java/com/uber/ugb/schema/model/EntityType.java`
#### Snippet
```java

        try {
            Vocabulary.BasicType.valueOf(baseType.getLabel());
            isDataType = true;
        } catch (Exception e) {
```

### DataFlowIssue
Dereference of `graghConceptDir.listFiles()` may produce `NullPointerException`
in `core/src/main/java/com/uber/ugb/GraphModelBuilder.java`
#### Snippet
```java
            throw new InvalidSchemaException("not a directory: " + graghConceptDir);
        }
        for (File file : graghConceptDir.listFiles()) {
            if (file.getName().endsWith(".yaml")) {
                addConcept(new FileInputStream(file));
```

### DataFlowIssue
Dereference of `edgeDistrbutionDir.listFiles()` may produce `NullPointerException`
in `core/src/main/java/com/uber/ugb/GraphModelBuilder.java`
#### Snippet
```java
            throw new InvalidSchemaException("not a directory: " + edgeDistrbutionDir);
        }
        for (File file : edgeDistrbutionDir.listFiles()) {
            String fileName = file.getName();
            if (fileName.endsWith(".csv")) {
```

### DataFlowIssue
Dereference of `yamlDir.listFiles()` may produce `NullPointerException`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
            throw new InvalidSchemaException("not a directory: " + yamlDir);
        }
        for (File file : yamlDir.listFiles()) {
            if (file.getName().endsWith(suffix)) {
                addSchema(file);
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/uber/ugb/storage/PrefixKeyValueStore.java`
#### Snippet
```java
            this.keySuffix = new byte[keySuffixLength];
            System.arraycopy(keySuffix, keySuffixOffset, this.keySuffix, 0, keySuffixLength);
            this.value = new byte[valueLength];;
            System.arraycopy(value, valueOffset, this.value, 0, valueLength);
        }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
    private void commit(final DB graph) {
        graph.getMetrics().batchCommit.measure(() -> {
            graph.commitBatch();
        });
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java

                return prevMetrics.merge(currentMetrics);
            }).reduce((m1, m2) -> m1.merge(m2));

        javaSparkContext.close();
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java

            for (T item : firstSet.keySet()) {
                if (!secondSet.keySet().contains(item)) {
                    onlyInFirst.add(item);
                }
```

### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `core/src/main/java/com/uber/ugb/schema/diff/SchemaDiff.java`
#### Snippet
```java

            for (T item : secondSet.keySet()) {
                if (!firstSet.keySet().contains(item)) {
                    onlyInSecond.add(item);
                }
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `asType()` during object construction
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            if (schemaElement instanceof EntityType) {
                typeCategory = TypeCategory.Entity;
                asType((EntityType) schemaElement);
            } else if (schemaElement instanceof RelationType) {
                asLink((RelationType) schemaElement);
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `asLink()` during object construction
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
                asType((EntityType) schemaElement);
            } else if (schemaElement instanceof RelationType) {
                asLink((RelationType) schemaElement);
                Type domain = ((RelationType) schemaElement).getFrom();
                Type range = ((RelationType) schemaElement).getTo();
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'engine' in a Serializable class
in `core/src/main/java/com/uber/ugb/db/GremlinDB.java`
#### Snippet
```java
public class GremlinDB extends DB {

    private final GremlinGroovyScriptEngine engine = new GremlinGroovyScriptEngine();
    private Graph graph;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `core/src/main/java/com/uber/ugb/schema/model/dto/EntityTypeDTO.java`
#### Snippet
```java
    private static final long serialVersionUID = -5286344557980177193L;

    private Object[] values;

    public EntityTypeDTO() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'nextVertexId' in a Serializable class
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java

    public static class Edge implements Serializable {
        public Object nextVertexId;
        public Properties edgeProperties;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `core/src/main/java/com/uber/ugb/schema/model/EntityType.java`
#### Snippet
```java
    private static final long serialVersionUID = 7960427126481962401L;

    private Object[] values;
    private boolean isDataType;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'weightedBuckets' in a Serializable class
in `core/src/main/java/com/uber/ugb/model/Incidence.java`
#### Snippet
```java
    private final double existenceProbability;
    private DegreeDistribution degreeDistribution;
    private BucketedEdgeDistribution.WeightedBuckets weightedBuckets;

    public Incidence(final QualifiedName vertexLabel,
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'valueWeights' in a Serializable class
in `core/src/main/java/com/uber/ugb/model/generator/WeightedValueslGenerator.java`
#### Snippet
```java
public class WeightedValueslGenerator extends Generator<String> {

    StatisticsSpec.PropertyValueWeight[] valueWeights;
    int totalWeights = 0;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'out' in a Serializable class
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
public class CsvOutputDB extends DB {

    private PrintStream out;

    @Override
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                try {
                    tasks.put(new Task(db.genVertexId(startVertexName, x), y.incrementAndGet()));
                } catch (InterruptedException e) {
                }
            });
```

### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                    try {
                        task = tasks.poll(100, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                    }
                    if (task == null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                continue;
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    protected void checkRequiredAndNonempty(final String field, final String fieldName) throws InvalidSchemaException {
        checkRequiredField(field, fieldName);
        checkArgument(0 < field.trim().length(), fieldName + " may not be empty");
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    protected void checkArgument(final boolean argument, final String failureMessage) throws InvalidSchemaException {
        if (!argument) {
            throw new InvalidSchemaException(failureMessage);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    }

    protected <T> void checkRequiredField(final T field, final String fieldName) throws InvalidSchemaException {
        if (null == field) {
            throw new InvalidSchemaException(fieldName + " is required");
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `EdgeWriteRequest` may be 'static'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    }

    class EdgeWriteRequest {
        QualifiedName edgeLabel;
        QualifiedName outVertexLabel;
```

### InnerClassMayBeStatic
Inner class `VertexWriteRequest` may be 'static'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    }

    class VertexWriteRequest {
        QualifiedName label;
        Object id;
```

### InnerClassMayBeStatic
Inner class `Task` may be 'static'
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
    }

    class Task {
        Object vid;
        long seqId;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map' may not contain keys of type 'String'
in `core/src/main/java/com/uber/ugb/model/PropertyModel.java`
#### Snippet
```java
                continue;
            }
            if (propertyModels.containsKey(relationType.getName().toString())){
                StatisticsSpec.PropertyValueWeight[] vw = propertyModels.get(relationType.getName().toString());
                properties.add(new SimpleProperty(relationType, new WeightedValueslGenerator(vw)));
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'String'
in `core/src/main/java/com/uber/ugb/model/PropertyModel.java`
#### Snippet
```java
            }
            if (propertyModels.containsKey(relationType.getName().toString())){
                StatisticsSpec.PropertyValueWeight[] vw = propertyModels.get(relationType.getName().toString());
                properties.add(new SimpleProperty(relationType, new WeightedValueslGenerator(vw)));
            }else{
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            Properties prop = collectProperties(workloadFile);

            int graphPartitionCount = Integer.valueOf(prop.getProperty(GRAPH_PARTITION_COUNT_PROPERTY, "16"));
            long operationCount = Long.valueOf(prop.getProperty(READ_OPERATION_COUNT_PROPERTY, "1"));
            int writeConcurrency = Integer.valueOf(prop.getProperty(WRITE_THREAD_COUNT_PROPERTY, "16"));
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

            int graphPartitionCount = Integer.valueOf(prop.getProperty(GRAPH_PARTITION_COUNT_PROPERTY, "16"));
            long operationCount = Long.valueOf(prop.getProperty(READ_OPERATION_COUNT_PROPERTY, "1"));
            int writeConcurrency = Integer.valueOf(prop.getProperty(WRITE_THREAD_COUNT_PROPERTY, "16"));
            int readConcurrency = Integer.valueOf(prop.getProperty(READ_THREAD_COUNT_PROPERTY, "16"));
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            int graphPartitionCount = Integer.valueOf(prop.getProperty(GRAPH_PARTITION_COUNT_PROPERTY, "16"));
            long operationCount = Long.valueOf(prop.getProperty(READ_OPERATION_COUNT_PROPERTY, "1"));
            int writeConcurrency = Integer.valueOf(prop.getProperty(WRITE_THREAD_COUNT_PROPERTY, "16"));
            int readConcurrency = Integer.valueOf(prop.getProperty(READ_THREAD_COUNT_PROPERTY, "16"));
            long totalVertices = Long.valueOf(prop.getProperty(WRITE_VERTEX_COUNT_PROPERTY, "0"));
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            long operationCount = Long.valueOf(prop.getProperty(READ_OPERATION_COUNT_PROPERTY, "1"));
            int writeConcurrency = Integer.valueOf(prop.getProperty(WRITE_THREAD_COUNT_PROPERTY, "16"));
            int readConcurrency = Integer.valueOf(prop.getProperty(READ_THREAD_COUNT_PROPERTY, "16"));
            long totalVertices = Long.valueOf(prop.getProperty(WRITE_VERTEX_COUNT_PROPERTY, "0"));
            int seed = Integer.valueOf(prop.getProperty(WRITE_SEED_PROPERTY, "12345"));
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            int writeConcurrency = Integer.valueOf(prop.getProperty(WRITE_THREAD_COUNT_PROPERTY, "16"));
            int readConcurrency = Integer.valueOf(prop.getProperty(READ_THREAD_COUNT_PROPERTY, "16"));
            long totalVertices = Long.valueOf(prop.getProperty(WRITE_VERTEX_COUNT_PROPERTY, "0"));
            int seed = Integer.valueOf(prop.getProperty(WRITE_SEED_PROPERTY, "12345"));

```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            int readConcurrency = Integer.valueOf(prop.getProperty(READ_THREAD_COUNT_PROPERTY, "16"));
            long totalVertices = Long.valueOf(prop.getProperty(WRITE_VERTEX_COUNT_PROPERTY, "0"));
            int seed = Integer.valueOf(prop.getProperty(WRITE_SEED_PROPERTY, "12345"));

            System.out.println(READ_OPERATION_COUNT_PROPERTY + "=" + operationCount);
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `out`
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
    @Override
    public Status writeVertex(QualifiedName label, Object id, Object... keyValues) {
        synchronized (out){
            out.print("v:");
            out.print(label);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `out`
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
                            QualifiedName inVertexLabel, Object inVertexId,
                            Object... keyValues) {
        synchronized (out){
            out.print("e:");
            out.print(edgeLabel);
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/schema/model/dto/TypeDTO.java`
#### Snippet
```java
        this.label = label;
        if (label.equals("device_app_source")) {
            System.out.println("break here");
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/util/RandomPermutationTest.java`
#### Snippet
```java
        while (true) { // exit by failing with OOME
            long time = timeToEvaluate(() -> new RandomPermutation(size.value));
            System.out.println("permutation of size " + size.value + " --> " + time + " ms to construct");
            size.value *= 10;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            boolean isSpark = line.hasOption("s");

            System.out.println("-db=" + dbname);
            System.out.println("-g=" + graphDir);
            System.out.println("-b=" + workloadFile);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

            System.out.println("-db=" + dbname);
            System.out.println("-g=" + graphDir);
            System.out.println("-b=" + workloadFile);
            if (hasRead) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            System.out.println("-db=" + dbname);
            System.out.println("-g=" + graphDir);
            System.out.println("-b=" + workloadFile);
            if (hasRead) {
                System.out.println("-r");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            System.out.println("-b=" + workloadFile);
            if (hasRead) {
                System.out.println("-r");
            }
            if (hasWrite) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            }
            if (hasWrite) {
                System.out.println("-w");
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            int seed = Integer.valueOf(prop.getProperty(WRITE_SEED_PROPERTY, "12345"));

            System.out.println(READ_OPERATION_COUNT_PROPERTY + "=" + operationCount);
            System.out.println(WRITE_THREAD_COUNT_PROPERTY + "=" + writeConcurrency);
            System.out.println(READ_THREAD_COUNT_PROPERTY + "=" + readConcurrency);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

            System.out.println(READ_OPERATION_COUNT_PROPERTY + "=" + operationCount);
            System.out.println(WRITE_THREAD_COUNT_PROPERTY + "=" + writeConcurrency);
            System.out.println(READ_THREAD_COUNT_PROPERTY + "=" + readConcurrency);
            System.out.println(WRITE_VERTEX_COUNT_PROPERTY + "=" + totalVertices);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            System.out.println(READ_OPERATION_COUNT_PROPERTY + "=" + operationCount);
            System.out.println(WRITE_THREAD_COUNT_PROPERTY + "=" + writeConcurrency);
            System.out.println(READ_THREAD_COUNT_PROPERTY + "=" + readConcurrency);
            System.out.println(WRITE_VERTEX_COUNT_PROPERTY + "=" + totalVertices);
            System.out.println(WRITE_SEED_PROPERTY + "=" + seed);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            System.out.println(WRITE_THREAD_COUNT_PROPERTY + "=" + writeConcurrency);
            System.out.println(READ_THREAD_COUNT_PROPERTY + "=" + readConcurrency);
            System.out.println(WRITE_VERTEX_COUNT_PROPERTY + "=" + totalVertices);
            System.out.println(WRITE_SEED_PROPERTY + "=" + seed);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            System.out.println(READ_THREAD_COUNT_PROPERTY + "=" + readConcurrency);
            System.out.println(WRITE_VERTEX_COUNT_PROPERTY + "=" + totalVertices);
            System.out.println(WRITE_SEED_PROPERTY + "=" + seed);

            // start generator
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
            } finally {

                metrics.printOut(System.out);

            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
        JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);

        System.out.println("start generating " + totalVertices + " vertices by partition size " + vertexPartitionSize);
        System.out.println("start generating " + totalEdges + " edges by partition size " + edgePartitionSize);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java

        System.out.println("start generating " + totalVertices + " vertices by partition size " + vertexPartitionSize);
        System.out.println("start generating " + totalEdges + " edges by partition size " + edgePartitionSize);

        JavaRDD<Metrics> genVertex = javaSparkContext.parallelize(parts)
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
        String outputFile = this.getProperties().getProperty("csv.output", null);
        if (outputFile == null) {
            out = System.out;
        } else {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                out = System.out;
            }
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/uber/ugb/queries/QueriesSpec.java`
#### Snippet
```java
                    return null;
                }
                String[] parts = filter.split("\\s+");
                if (parts.length != 3) {
                    return null;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/GremlinDB.java`
#### Snippet
```java
            return new QueryResult(vertexCount, edgeCount);
        } catch (ScriptException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
                keyValues));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Status.OK;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
            this.todos.put(new VertexWriteRequest(label, id, keyValues));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Status.OK;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
                            todo = todos.poll(500, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (todo == null) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("unknownDB:" + dbname, e);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
        } catch (Exception exp) {
            logger.info("Unexpected exception:" + exp.getMessage());
            exp.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

        } catch (IOException ex) {
            ex.printStackTrace();
            logger.info("Failed to read file:" + fileName);
            File currentDirectory = new File(new File(".").getAbsolutePath());
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.info("Failed to read property file:" + fileName);
                }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

            } catch (IOException e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

            } catch (IOException e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java
                conn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

            } catch (IOException e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

            } catch (IOException e) {
                e.printStackTrace();
            }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
                out = new PrintStream(new FileOutputStream(outputFile));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                out = System.out;
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                        readCounter.addAndGet(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                        hasException.set(true);
                        return;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
            tasks.put(new Task(subgraph.startVertexId, 0, null));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
                        processVertexToDo(task, query.steps[task.stepId], task.currentEdge);
                    } catch (Exception e) {
                        e.printStackTrace();
                        hasException.set(true);
                    } finally {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
                        traverseOneStep(task.id, step, visitedVertexIds, tasks, subgraph, task.stepId, isLastStep);
                    } catch (Exception e) {
                        e.printStackTrace();
                        hasException.set(true);
                    } finally {
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.uber.ugb.util.RandomPermutation;`
in `core/src/main/java/com/uber/ugb/util/RandomPermutationTest.java`
#### Snippet
```java
package com.uber.ugb.util;

import com.uber.ugb.util.RandomPermutation;
import org.junit.Ignore;
import org.junit.Test;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TypeDTO()` of an abstract class should not be declared 'public'
in `core/src/main/java/com/uber/ugb/schema/model/dto/TypeDTO.java`
#### Snippet
```java
    private InlineRelationTypeDTO[] relations = new InlineRelationTypeDTO[]{};

    public TypeDTO() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `TypeDTO()` of an abstract class should not be declared 'public'
in `core/src/main/java/com/uber/ugb/schema/model/dto/TypeDTO.java`
#### Snippet
```java
    }

    public TypeDTO(final String label) {
        this.label = label;
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
     */
    public QueryResult executeQuery(String query, Object startVertexId) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
            if (e.nextVertexId.equals(edge.nextVertexId)) {
                if (e.edgeProperties.equals(edgeProperties)) {
                    return null;
                } else {
                    e.edgeProperties = edge.edgeProperties;
```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/queries/QueriesSpec.java`
#### Snippet
```java
            public static Filter parseFilter(String filter) {
                if (Strings.isNullOrEmpty(filter)) {
                    return null;
                }
                String[] parts = filter.split("\\s+");
```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/queries/QueriesSpec.java`
#### Snippet
```java
                String[] parts = filter.split("\\s+");
                if (parts.length != 3) {
                    return null;
                }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/queries/QueriesSpec.java`
#### Snippet
```java
                    return new Filter(parts[0], Filter.Operator.LessThan, parts[2]);
                }
                return null;
            }

```

### ReturnNull
Return of `null`
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
            Row row = resultSet.one();
            if (row == null) {
                return null;
            }
            ByteBuffer byteBuffer = row.getBytes(0);
```

### ReturnNull
Return of `null`
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
            ByteBuffer byteBuffer = row.getBytes(0);
            if (byteBuffer == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
            throws InvalidSchemaException {
        if (null == name) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tailIndex` is redundant
in `core/src/main/java/com/uber/ugb/model/BucketedEdgeDistribution.java`
#### Snippet
```java
        int domainBucket = domainWeightedBuckets.locate(random);
        int tbd = random.nextInt(domainBucketWidth);
        long tailIndex = (long) domainSubset.get(domainBucket) * domainBucketWidth + tbd;
        return tailIndex;
    }
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java
                Result result = table.get(get);

                byte[] value = result.getValue(cf, props);

                return value;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
        while (runnableCounter.get() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
        while (readCounter.get() < operationCount && !hasException.get()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
            if (tasks.isEmpty()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

        Path path = Paths.get(queriesPath);
        InputStream yamlInput = new FileInputStream(new File(path.toString()));

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
        Set set = new HashSet();
        for (Edge edge : edges) {
            set.add(edge);
        }
        return set.size();
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genEdgeKeySuffix(Object outVertexId, Object inVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        if (isBackward) {
            out.write(conf.asByteArray(outVertexId));
```

### UnstableApiUsage
'newDataOutput()' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genEdgeKeySuffix(Object outVertexId, Object inVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        if (isBackward) {
            out.write(conf.asByteArray(outVertexId));
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genVertexKey(QualifiedName label, Object id) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.write(id.toString().getBytes());
        out.write(Separator);
```

### UnstableApiUsage
'newDataOutput()' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genVertexKey(QualifiedName label, Object id) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.write(id.toString().getBytes());
        out.write(Separator);
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genEdgeKeyPrefix(QualifiedName edgeLabel, Object startVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.write(startVertexId.toString().getBytes());
        out.write(Separator);
```

### UnstableApiUsage
'newDataOutput()' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    protected byte[] genEdgeKeyPrefix(QualifiedName edgeLabel, Object startVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.write(startVertexId.toString().getBytes());
        out.write(Separator);
```

### UnstableApiUsage
'com.google.common.io.ByteStreams' is marked unstable with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java
    protected byte[] genEdgeKeyPrefix(QualifiedName edgeLabel,
                                      Object outVertexId, Object inVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        if (isBackward) {
            out.write(inVertexId.toString().getBytes());
```

### UnstableApiUsage
'newDataOutput()' is declared in unstable class 'com.google.common.io.ByteStreams' marked with @Beta
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java
    protected byte[] genEdgeKeyPrefix(QualifiedName edgeLabel,
                                      Object outVertexId, Object inVertexId, boolean isBackward) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        if (isBackward) {
            out.write(inVertexId.toString().getBytes());
```

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

    @Override
```

