# uber-graph-benchmark 
 
# Bad smells
I found 138 bad smells with 12 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 36 | false |
| UNCHECKED_WARNING | 20 | false |
| FieldCanBeLocal | 8 | false |
| UnstableApiUsage | 8 | false |
| IOStreamConstructor | 6 | false |
| JavadocDeclaration | 6 | false |
| DataFlowIssue | 5 | false |
| UnusedAssignment | 4 | false |
| DuplicatedCode | 3 | false |
| CatchMayIgnoreException | 3 | false |
| ProtectedMemberInFinalClass | 3 | true |
| UnnecessaryReturn | 3 | true |
| SuspiciousMethodCalls | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| BusyWait | 3 | false |
| StringEquality | 2 | false |
| RedundantCollectionOperation | 2 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessarySemicolon | 1 | false |
| CommentedOutCode | 1 | false |
| ManualArrayCopy | 1 | false |
| AutoCloseableResource | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| InfiniteLoopStatement | 1 | false |
| RedundantCast | 1 | false |
| RedundantFileCreation | 1 | false |
| ConstantValue | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
        Set set = new HashSet();
        for (Edge edge : edges) {
            set.add(edge);
        }
        return set.size();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
        Set set = new HashSet();
        for (Edge edge : edges) {
            set.add(edge.knownVertexId);
            set.add(edge.nextVertexId);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
        for (Edge edge : edges) {
            set.add(edge.knownVertexId);
            set.add(edge.nextVertexId);
        }
        return set.size();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ArrayBlockingQueue' to 'java.util.concurrent.ArrayBlockingQueue'
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
                       long operationCount, int concurrency) {

        ArrayBlockingQueue<Task> tasks = new ArrayBlockingQueue(concurrency * 16);
        AtomicLong readCounter = new AtomicLong();
        AtomicBoolean hasException = new AtomicBoolean();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `core/src/main/java/com/uber/ugb/schema/Vocabulary.java`
#### Snippet
```java
     */
    public <T extends Type> Set<RelationType> getConcreteRelationTypesFrom(final T domainType) {
        Set<T> inferredTypes = domainType.getInferredTypes();
        Set<RelationType> typesFrom = new HashSet<>();
        for (RelationType relationType : getRelationTypes().values()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.ugb.schema.model.Type' to 'E'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
    protected <T> T getField(final Function<E, T> accessor) {

        T value = accessor.apply((E) this);

        if (null == value) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
            if (null != extended) {
                for (E parent : extended) {
                    T parentValue = (T) parent.getField(accessor);
                    if (null != parentValue) {
                        if (null != value) {
```

### UNCHECKED_WARNING
Unchecked call to 'getField(Function)' as a member of raw type 'com.uber.ugb.schema.model.Type'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
            if (null != extended) {
                for (E parent : extended) {
                    T parentValue = (T) parent.getField(accessor);
                    if (null != parentValue) {
                        if (null != value) {
```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.ugb.schema.model.Type' to 'E'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
        Set<E> inferredTypes = new HashSet<>();
        Stack<E> types = new Stack<E>();
        types.push((E) this);
        while (!types.isEmpty()) {
            E type = types.pop();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
            E type = types.pop();
            inferredTypes.add(type);
            for (E ext : (List<E>) type.getExtends()) {
                types.push(ext);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            File file = new File(baseDirectory, path);
            try (InputStream is = new FileInputStream(file)) {
                return (T) new Yaml(new Constructor(resourceClass)).load(is);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement' to 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
        switch (storageSchemaElement.getTypeCategory()) {
            case Entity:
                return addEntityType(storageSchemaElement);
            case Relation:
                return addRelationType(storageSchemaElement);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement' to 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
                return addEntityType(storageSchemaElement);
            case Relation:
                return addRelationType(storageSchemaElement);
            default:
                throw new IllegalStateException();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'el' has raw type, so result of getDependencies is erased
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            StorageSchemaElement el = startNodes.pop();
            sorted.add(el);
            List<StorageSchemaElement> deps = el.getDependencies();
            for (StorageSchemaElement dep : deps) {
                dep.getDependents().remove(el);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            logger.info("loading resource:" + path);
            try (InputStream is = SchemaManager.class.getResourceAsStream(path)) {
                return (T) new Yaml(new Constructor(resourceClass)).load(is);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement' to 'com.uber.ugb.schema.SchemaManager.StorageSchemaElement'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            throws InvalidSchemaException {

        StorageSchemaElement<E, T> storageSchemaElement = getSchemaElement(element);
        if (null == storageSchemaElement && !element.getAbstract()) {
            storageSchemaElement = createSchemaElement(element);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java

    protected byte[] appendToAdjacencyList(byte[] existingList, Object vertexId, Properties edgeProperties) {
        List<Edge> adjancencyList = existingList == null ? new ArrayList<>() : (List<Edge>) conf.asObject(existingList);
        Edge edge = new Edge();
        edge.nextVertexId = vertexId;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
            return new ArrayList<>();
        }
        return (List<Edge>) conf.asObject(edgeListBytes);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(E)' as a member of raw type 'java.util.concurrent.ArrayBlockingQueue'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
        try {
            this.todoCounter.incrementAndGet();
            this.todos.put(new VertexWriteRequest(label, id, keyValues));
        } catch (InterruptedException e) {
            e.printStackTrace();
```

### UNCHECKED_WARNING
Unchecked call to 'put(E)' as a member of raw type 'java.util.concurrent.ArrayBlockingQueue'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
        try {
            this.todoCounter.incrementAndGet();
            this.todos.put(new EdgeWriteRequest(
                edgeLabel,
                outVertexLabel, outVertexId,
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
            long partitionedStart = Math.max(counter, start);
            long partitionedStop = Math.min(counter + nVertices, stop);
            counter += nVertices;
            if (partitionedStart >= partitionedStop) {
                continue;
            }
            logger.info("generating [" + partitionedStart + ", " + partitionedStop + ") " + nVertices + " " + label);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/uber/ugb/GraphModelBuilder.java`
#### Snippet
```java
        Map<QualifiedName, StatisticsSpec.PropertyValueWeight[]> customPropertyModels = new HashMap<>();
        for (StatisticsSpec.PropertyValues propertyValues : statisticsSpec.properties) {
            customPropertyModels.put(new QualifiedName(propertyValues.type), propertyValues.propertyValueWeights);
        }

        LinkedHashMap<QualifiedName, PropertyModel> vertexPropertyStats = new LinkedHashMap<>();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/uber/ugb/db/CsvOutputDB.java`
#### Snippet
```java
            out.print(label);
            out.print(",");
            out.print(id);
            for (int i = 0; i < keyValues.length - 1; i += 2) {
                out.print(",");
                out.print(keyValues[i + 1]);
            }
            out.println();
```

## RuleId[id=CatchMayIgnoreException]
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

## RuleId[id=ProtectedMemberInFinalClass]
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

    protected <T> void checkRequiredField(final T field, final String fieldName) throws InvalidSchemaException {
        if (null == field) {
            throw new InvalidSchemaException(fieldName + " is required");
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/src/main/java/com/uber/ugb/GraphModelBuilder.java`
#### Snippet
```java
        for (File file : graghConceptDir.listFiles()) {
            if (file.getName().endsWith(".yaml")) {
                addConcept(new FileInputStream(file));
            } else if (file.isDirectory()) {
                addConceptDirectory(file);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/src/main/java/com/uber/ugb/GraphModelBuilder.java`
#### Snippet
```java

    public void setStatistics(File statisticsFile) throws FileNotFoundException {
        this.statisticsInputStream = new FileInputStream(statisticsFile);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/src/main/java/com/uber/ugb/schema/SchemaManager.java`
#### Snippet
```java
            logger.info("loading file:" + path);
            File file = new File(baseDirectory, path);
            try (InputStream is = new FileInputStream(file)) {
                return (T) new Yaml(new Constructor(resourceClass)).load(is);
            }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java

        Path path = Paths.get(queriesPath);
        InputStream yamlInput = new FileInputStream(new File(path.toString()));

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/com/uber/ugb/Benchmark.java`
#### Snippet
```java
        try {

            input = new FileInputStream(fileName);

            // load a properties file
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    public SchemaDTO addSchema(final File yamlFile) throws IOException, InvalidSchemaException {
        if (yamlFile.exists() && !yamlFile.isDirectory() && yamlFile.canRead()) {
            try (InputStream input = new FileInputStream(yamlFile)) {
                return addSchema(input);
            } catch (InvalidSchemaException e) {
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java
    private void checkTypeNamesUnique(final SchemaDTO schemaDTO) throws InvalidSchemaException {
        Set<TypeDTO> allTypes = new HashSet<>();
        allTypes.addAll(Arrays.asList(schemaDTO.getEntities()));
        checkUnique(allTypes, TypeDTO::getLabel);
        allTypes.clear();
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `core/src/main/java/com/uber/ugb/schema/SchemaBuilder.java`
#### Snippet
```java

            List<RelationTypeDTO> linkTypeDTOS = new ArrayList<>();
            linkTypeDTOS.addAll(Arrays.asList(schemaDTO.getRelations()));
            for (EntityTypeDTO entityTypeDTO : schemaDTO.getEntities()) {
                contextStack.push(entityTypeDTO);
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/uber/ugb/schema/Vocabulary.java`
#### Snippet
```java
            }
            Type from = relationType.getFromInferred();
            if (inferredTypes.contains(from)) {
                typesFrom.add(relationType);
            }
```

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

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `EdgeWriteRequest` may be 'static'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    }

    class EdgeWriteRequest {
        QualifiedName edgeLabel;
        QualifiedName outVertexLabel;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/PhoneNumberGenerator.java`
#### Snippet
```java
public class PhoneNumberGenerator extends Generator<String> {

    private static String text = "0123456789";

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java
public class UnixTimeMsGenerator extends Generator<Long> {

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/EmailGenerator.java`
#### Snippet
```java
public class EmailGenerator extends Generator<String> {

    private static String randomText = "abcdefghijklmnopqrstuvwxyz";
    private static String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "inbox.com", "icloud.com", "mail.com"};

```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/UniformLongGenerator.java`
#### Snippet
```java
public class UniformLongGenerator extends Generator<Long> {

    private final long lowerBound, upperBound, range;

    public UniformLongGenerator(long lowerBound, long upperBound) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/model/generator/StringGenerator.java`
#### Snippet
```java
public class StringGenerator extends Generator<String> {

    private static String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    int minLength;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
        private Cluster cluster;
        private Session session;
        private String dataCenter;
        private String keyspace;
        private String vertexTableName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static String Separator = ":";
    private static String REVERSE_SUFFIX = "_r";

    static {
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `core/src/main/java/com/uber/ugb/schema/SchemaUtils.java`
#### Snippet
```java
     */
    public static void copyDirectory(final Path src, final Path dest) throws IOException {
        Files.walk(src).forEach(s -> {
            try {
                Path d = dest.resolve(src.relativize(s));
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `findTotalWeight()` to `float` is redundant
in `core/src/main/java/com/uber/ugb/model/Partitioner.java`
#### Snippet
```java
        Map<QualifiedName, Long> partition = new LinkedHashMap<>();
        long remaining = total;
        float totalWeight = (float) findTotalWeight();
        for (Map.Entry<QualifiedName, Float> e : weightByLabel.entrySet()) {
            QualifiedName label = e.getKey();
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param value` tag description is missing
in `core/src/main/java/com/uber/ugb/measurement/StreamingStandardDeviation.java`
#### Snippet
```java
     * Incoming new values used to calculate the running statistics
     *
     * @param value
     */
    public void put(double value) {
```

### JavadocDeclaration
`@param edge` tag description is missing
in `core/src/main/java/com/uber/ugb/db/Subgraph.java`
#### Snippet
```java
     * addEdge adds one found edge in the subgraph
     *
     * @param edge
     */
    public void addEdge(Edge edge) {
```

### JavadocDeclaration
`@param latencyNs` tag description is missing
in `core/src/main/java/com/uber/ugb/measurement/LatencyHistogram.java`
#### Snippet
```java
     * measure collects latency in nano seconds
     *
     * @param latencyNs
     */
    public void measure(long latencyNs) {
```

### JavadocDeclaration
`@param label` tag description is missing
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
     * genVertexId customizable way to generate a vertex id
     *
     * @param label
     * @param id
     * @return
```

### JavadocDeclaration
`@param id` tag description is missing
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
     *
     * @param label
     * @param id
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `core/src/main/java/com/uber/ugb/db/DB.java`
#### Snippet
```java
     * @param label
     * @param id
     * @return
     */
    public Object genVertexId(QualifiedName label, long id) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `text` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/PhoneNumberGenerator.java`
#### Snippet
```java
public class PhoneNumberGenerator extends Generator<String> {

    private static String text = "0123456789";

    @Override
```

### FieldMayBeFinal
Field `tenYears` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

    @Override
```

### FieldMayBeFinal
Field `base` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/UnixTimeMsGenerator.java`
#### Snippet
```java
public class UnixTimeMsGenerator extends Generator<Long> {

    private long base = 1537310687576L;
    private long tenYears = 10 * 35 * 24 * 60 * 60 * 1000;

```

### FieldMayBeFinal
Field `totalLatencyNs` may be 'final'
in `core/src/main/java/com/uber/ugb/measurement/LatencyHistogram.java`
#### Snippet
```java
    private long overflowCount;
    private AtomicLong operations;
    private AtomicLong totalLatencyNs;
    private long minNs;
    private long maxNs;
```

### FieldMayBeFinal
Field `operations` may be 'final'
in `core/src/main/java/com/uber/ugb/measurement/LatencyHistogram.java`
#### Snippet
```java
    private final String name;
    private long overflowCount;
    private AtomicLong operations;
    private AtomicLong totalLatencyNs;
    private long minNs;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `core/src/main/java/com/uber/ugb/util/ProgressReporter.java`
#### Snippet
```java
public class ProgressReporter {

    private static Logger logger = Logger.getLogger(ProgressReporter.class.getName());

    String prefix;
```

### FieldMayBeFinal
Field `weightByLabel` may be 'final'
in `core/src/main/java/com/uber/ugb/model/Partitioner.java`
#### Snippet
```java

    // order-preserving for the sake of serialization
    private Map<QualifiedName, Float> weightByLabel = new LinkedHashMap<>();

    public void put(final QualifiedName label, final float weight) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `core/src/main/java/com/uber/ugb/GraphScraper.java`
#### Snippet
```java
public class GraphScraper {

    private static Logger logger = Logger.getLogger(GraphScraper.class.getName());

    public GraphScraper() {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `core/src/main/java/com/uber/ugb/model/Incidence.java`
#### Snippet
```java
    private static final long serialVersionUID = -2672233051122503355L;

    private static Logger logger = Logger.getLogger(Incidence.class.getName());

    private final QualifiedName vertexLabel;
```

### FieldMayBeFinal
Field `REVERSE_SUFFIX` may be 'final'
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java
    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static byte Separator = 0x01;
    private static byte REVERSE_SUFFIX = 'r';

    static {
```

### FieldMayBeFinal
Field `Separator` may be 'final'
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java

    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static byte Separator = 0x01;
    private static byte REVERSE_SUFFIX = 'r';

```

### FieldMayBeFinal
Field `conf` may be 'final'
in `core/src/main/java/com/uber/ugb/db/PrefixKeyValueDB.java`
#### Snippet
```java
public class PrefixKeyValueDB extends AbstractSubgraphDB {

    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static byte Separator = 0x01;
    private static byte REVERSE_SUFFIX = 'r';
```

### FieldMayBeFinal
Field `randomText` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/EmailGenerator.java`
#### Snippet
```java
public class EmailGenerator extends Generator<String> {

    private static String randomText = "abcdefghijklmnopqrstuvwxyz";
    private static String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "inbox.com", "icloud.com", "mail.com"};

```

### FieldMayBeFinal
Field `domains` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/EmailGenerator.java`
#### Snippet
```java

    private static String randomText = "abcdefghijklmnopqrstuvwxyz";
    private static String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "inbox.com", "icloud.com", "mail.com"};

    @Override
```

### FieldMayBeFinal
Field `belongsTo` may be 'final'
in `core/src/main/java/com/uber/ugb/schema/model/Type.java`
#### Snippet
```java
    private List<E> extended;

    private Schema belongsTo;

    protected Type(final Schema belongsTo, final String label) {
```

### FieldMayBeFinal
Field `text` may be 'final'
in `core/src/main/java/com/uber/ugb/model/generator/StringGenerator.java`
#### Snippet
```java
public class StringGenerator extends Generator<String> {

    private static String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    int minLength;
```

### FieldMayBeFinal
Field `consistencyLevel` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java

    private static Logger logger = LoggerFactory.getLogger(CassandraDB.class);
    private static ConsistencyLevel consistencyLevel = ConsistencyLevel.LOCAL_ONE;

    transient CassandraStore cassandraStore;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
public class CassandraDB extends PrefixKeyValueDB {

    private static Logger logger = LoggerFactory.getLogger(CassandraDB.class);
    private static ConsistencyLevel consistencyLevel = ConsistencyLevel.LOCAL_ONE;

```

### FieldMayBeFinal
Field `edgeTableName` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
        private String keyspace;
        private String vertexTableName;
        private String edgeTableName;

        public CassandraStore(Properties properties) {
```

### FieldMayBeFinal
Field `vertexTableName` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
        private String dataCenter;
        private String keyspace;
        private String vertexTableName;
        private String edgeTableName;

```

### FieldMayBeFinal
Field `keyspace` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
        private Session session;
        private String dataCenter;
        private String keyspace;
        private String vertexTableName;
        private String edgeTableName;
```

### FieldMayBeFinal
Field `dataCenter` may be 'final'
in `cassandra/src/main/java/com/uber/ugb/db/cassandra/CassandraDB.java`
#### Snippet
```java
        private Cluster cluster;
        private Session session;
        private String dataCenter;
        private String keyspace;
        private String vertexTableName;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `core/src/main/java/com/uber/ugb/GraphGenerator.java`
#### Snippet
```java
public class GraphGenerator implements Serializable {

    private static Logger logger = Logger.getLogger(GraphGenerator.class.getName());
    private final GraphModel model;
    // used in random permutations and degree distributions
```

### FieldMayBeFinal
Field `REVERSE_SUFFIX` may be 'final'
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static String Separator = ":";
    private static String REVERSE_SUFFIX = "_r";

    static {
```

### FieldMayBeFinal
Field `Separator` may be 'final'
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java

    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static String Separator = ":";
    private static String REVERSE_SUFFIX = "_r";

```

### FieldMayBeFinal
Field `conf` may be 'final'
in `core/src/main/java/com/uber/ugb/db/KeyValueDB.java`
#### Snippet
```java
public class KeyValueDB extends AbstractSubgraphDB {

    private static FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
    private static String Separator = ":";
    private static String REVERSE_SUFFIX = "_r";
```

### FieldMayBeFinal
Field `isClosing` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    private AtomicLong todoCounter;
    private AtomicLong runnableCounter;
    private AtomicBoolean isClosing;
    private ExecutorService executorService;

```

### FieldMayBeFinal
Field `executorService` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    private AtomicLong runnableCounter;
    private AtomicBoolean isClosing;
    private ExecutorService executorService;

    public ParallelWriteDBWrapper(DB db, int concurrency) {
```

### FieldMayBeFinal
Field `runnableCounter` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    private ArrayBlockingQueue todos;
    private AtomicLong todoCounter;
    private AtomicLong runnableCounter;
    private AtomicBoolean isClosing;
    private ExecutorService executorService;
```

### FieldMayBeFinal
Field `db` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
public class ParallelWriteDBWrapper extends DB {

    private DB db;
    private int concurrency;
    private ArrayBlockingQueue todos;
```

### FieldMayBeFinal
Field `todoCounter` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    private int concurrency;
    private ArrayBlockingQueue todos;
    private AtomicLong todoCounter;
    private AtomicLong runnableCounter;
    private AtomicBoolean isClosing;
```

### FieldMayBeFinal
Field `concurrency` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java

    private DB db;
    private int concurrency;
    private ArrayBlockingQueue todos;
    private AtomicLong todoCounter;
```

### FieldMayBeFinal
Field `todos` may be 'final'
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
    private DB db;
    private int concurrency;
    private ArrayBlockingQueue todos;
    private AtomicLong todoCounter;
    private AtomicLong runnableCounter;
```

### FieldMayBeFinal
Field `cf` may be 'final'
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java
    public static class HBaseStore implements PrefixKeyValueStore {

        private static byte[] cf = "cf1".getBytes();
        private static byte[] props = "p".getBytes();

```

### FieldMayBeFinal
Field `props` may be 'final'
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java

        private static byte[] cf = "cf1".getBytes();
        private static byte[] props = "p".getBytes();

        Configuration config = HBaseConfiguration.create();
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `hbase/src/main/java/com/uber/ugb/db/hbase/HBaseDB.java`
#### Snippet
```java
public class HBaseDB extends PrefixKeyValueDB {

    private static Logger logger = LoggerFactory.getLogger(HBaseDB.class);

    transient HBaseStore hBaseStore;
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
in `core/src/main/java/com/uber/ugb/db/AbstractSubgraphDB.java`
#### Snippet
```java
            if (tasks.isEmpty()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
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
in `core/src/main/java/com/uber/ugb/db/ParallelWriteDBWrapper.java`
#### Snippet
```java
        while (runnableCounter.get() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
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

