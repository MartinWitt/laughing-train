# incubator-hugegraph-toolchain 
 
# Bad smells
I found 557 bad smells with 123 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 50 | false |
| CodeBlock2Expr | 49 | true |
| SystemOutErr | 44 | false |
| ReturnNull | 42 | false |
| UtilityClassWithoutPrivateConstructor | 39 | true |
| AssignmentToMethodParameter | 34 | false |
| RedundantFieldInitialization | 31 | false |
| NonProtectedConstructorInAbstractClass | 20 | true |
| DataFlowIssue | 15 | false |
| NonSerializableFieldInSerializableClass | 14 | false |
| ZeroLengthArrayInitialization | 12 | false |
| NestedAssignment | 11 | false |
| MismatchedCollectionQueryUpdate | 10 | false |
| ConstantValue | 9 | false |
| SwitchStatementWithConfusingDeclaration | 9 | false |
| FinalStaticMethod | 8 | false |
| MissortedModifiers | 8 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| IgnoreResultOfCall | 7 | false |
| UnnecessarySuperQualifier | 7 | false |
| NonFinalFieldOfException | 7 | false |
| SizeReplaceableByIsEmpty | 6 | true |
| UnnecessaryFullyQualifiedName | 6 | false |
| UnnecessaryModifier | 5 | true |
| SlowListContainsAll | 5 | false |
| OptionalGetWithoutIsPresent | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| CaughtExceptionImmediatelyRethrown | 5 | false |
| UnstableApiUsage | 5 | false |
| StringEquality | 4 | false |
| UnusedAssignment | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| MethodOverloadsParentMethod | 4 | false |
| PointlessArithmeticExpression | 3 | false |
| HtmlWrongAttributeValue | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| CastCanBeRemovedNarrowingVariableType | 3 | false |
| CommentedOutCode | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| RedundantMethodOverride | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| UseOfPropertiesAsHashtable | 2 | false |
| EmptyMethod | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| RedundantStringFormatCall | 2 | false |
| SynchronizeOnThis | 2 | false |
| DoubleBraceInitialization | 2 | false |
| FieldMayBeStatic | 2 | false |
| Convert2MethodRef | 2 | false |
| SamePackageImport | 2 | false |
| BusyWait | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| StaticCallOnSubclass | 1 | false |
| AssignmentToStaticFieldFromInstanceMethod | 1 | false |
| ConstantMathCall | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UNUSED_IMPORT | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| IOResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| AssignmentToLambdaParameter | 1 | false |
## RuleId[ruleID=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/ComputeSign.java`
#### Snippet
```java

        File file = new File(tradeValueFile);
        Long fileLen = file.length();
        byte[] fileBytes = new byte[fileLen.intValue()];
        try (FileInputStream in = new FileInputStream(file)) {
```

## RuleId[ruleID=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/HBaseSerializer.java`
#### Snippet
```java
    public byte[] getKeyBytes(GraphElement e) {
        byte[] array = null;
        if(e.type() == "vertex" && e.id() != null){
            BytesBuffer buffer = BytesBuffer.allocate(2 + 1 + e.id().toString().length());
            buffer.writeShort(getPartition(HugeType.VERTEX,  IdGenerator.of(e.id())));
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/HBaseSerializer.java`
#### Snippet
```java
            buffer.writeId(IdGenerator.of(e.id()));
            array = buffer.bytes();
        }else if ( e.type() == "edge" ){
            BytesBuffer buffer = BytesBuffer.allocate(BytesBuffer.BUF_EDGE_ID);
            Edge edge = (Edge)e;
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/HBaseSerializer.java`
#### Snippet
```java
    public byte[] getValueBytes(GraphElement e) {
        byte[] array = null;
        if(e.type() == "vertex"){
            int propsCount = e.properties().size() ; //vertex.sizeOfProperties();
            BytesBuffer buffer = BytesBuffer.allocate(8 + 16 * propsCount);
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/HBaseSerializer.java`
#### Snippet
```java
            }
            array = buffer.bytes();
        } else if ( e.type() == "edge" ){
            int propsCount =  e.properties().size();
            BytesBuffer buffer = BytesBuffer.allocate(4 + 16 * propsCount);
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/Formatter.java`
#### Snippet
```java
    public String dump(JsonGraph.JsonVertex vertex) throws Exception;

    public static final String PACKAGE = Formatter.class.getPackage().getName();

    public static Formatter loadFormatter(String formatter) {
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/Formatter.java`
#### Snippet
```java
    public String dump(JsonGraph.JsonVertex vertex) throws Exception;

    public static final String PACKAGE = Formatter.class.getPackage().getName();

    public static Formatter loadFormatter(String formatter) {
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/Formatter.java`
#### Snippet
```java
    public String dump(JsonGraph.JsonVertex vertex) throws Exception;

    public static final String PACKAGE = Formatter.class.getPackage().getName();

    public static Formatter loadFormatter(String formatter) {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/Formatter.java`
#### Snippet
```java

    // Serialize a vertex(with edge and property) to string
    public String dump(JsonGraph.JsonVertex vertex) throws Exception;

    public static final String PACKAGE = Formatter.class.getPackage().getName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/Formatter.java`
#### Snippet
```java
    public static final String PACKAGE = Formatter.class.getPackage().getName();

    public static Formatter loadFormatter(String formatter) {
        String classPath = String.format("%s.%s", PACKAGE, formatter);
        ClassLoader loader = Formatter.class.getClassLoader();
```

## RuleId[ruleID=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * Bytes.GB` can be replaced with 'Bytes.GB'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
    public static final byte STRING_ENDING_BYTE_FF = (byte) 0xff;
    public static final int STRING_LEN_MAX = UINT16_MAX;
    public static final long BLOB_LEN_MAX = 1 * Bytes.GB;

    // The value must be in range [8, ID_LEN_MAX]
```

### PointlessArithmeticExpression
`1 * Bytes.GB` can be replaced with 'Bytes.GB'
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/options/HubbleOptions.java`
#### Snippet
```java
                    "The single file size(MB) limit.",
                    positiveInt(),
                    1 * Bytes.GB
            );

```

### PointlessArithmeticExpression
`1 * 1000` can be replaced with '1000'
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/LoadTaskService.java`
#### Snippet
```java
     */
    @Async
    @Scheduled(fixedDelay = 1 * 1000)
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void updateLoadTaskProgress() {
```

## RuleId[ruleID=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `encode()` declared in class 'org.apache.hugegraph.rest.AbstractRestClient' but referenced via subclass 'org.apache.hugegraph.client.RestClient'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/UserAPI.java`
#### Snippet
```java

    public UserRole getUserRole(Object id) {
        String idEncoded = RestClient.encode(formatEntityId(id));
        String path = String.join("/", this.path(), idEncoded, "role");
        RestResult result = this.client.get(path);
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (10 lines)
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/SplicingIdGenerator.java`
#### Snippet
```java
     * Generate a string id of HugeVertex from Vertex name
     */
//    public Id generate(HugeVertex vertex) {
//        /*
//         * Hash for row-key which will be evenly distributed.
```

### CommentedOutCode
Commented out code (3 lines)
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
    }

    //public boolean isBlob() {
    //    return this == DataType.BLOB;
    //}
```

## RuleId[ruleID=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `client` from instance context
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
        int vertexLogicPartitions = 8;
        // If connect failed will throw an exception.
        client = HugeClient.builder("http://localhost:8081", "hugegraph").build();

        SchemaManager schema = client.schema();
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `rangeMap.keySet()` may be replaced with 'entrySet()' iteration
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/util/SinkToHBase.java`
#### Snippet
```java
                    }
                    String keyString = Bytes.toString(immutableBytesWritableKey.get());
                    for (List<String> range : rangeMap.keySet()) {
                        if (keyString.compareToIgnoreCase(range.get(0)) >= 0 &&
                            ((keyString.compareToIgnoreCase(range.get(1)) < 0) ||
```

### KeySetIterationMayUseEntrySet
Iteration over `failureFiles.keySet()` may be replaced with 'entrySet()' iteration
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/LoadMapping.java`
#### Snippet
```java
        }
        Map<String, FailureFile> failureFiles = this.groupFailureFiles(pathDir);
        for (String inputId : failureFiles.keySet()) {
            InputStruct struct = this.struct(inputId);
            String charset = struct.input().charset();
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`id.length() > 0` can be replaced with '!id.isEmpty()'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/Id.java`
#### Snippet
```java

        public static IdType valueOfPrefix(String id) {
            E.checkArgument(id != null && id.length() > 0,
                            "Invalid id '%s'", id);
            switch (id.charAt(0)) {
```

### SizeReplaceableByIsEmpty
`graphElements.size() > 0` can be replaced with '!graphElements.isEmpty()'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
            for (Map.Entry<ElementBuilder, List<String>> builder : this.builders.entrySet()) {
                List<String> graphElements = builder.getValue();
                if (graphElements.size() > 0) {
                    flush(builder.getKey(), graphElements);
                }
```

### SizeReplaceableByIsEmpty
`graphElements.size() > 0` can be replaced with '!graphElements.isEmpty()'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
            List<GraphElement> graphElements = builderMap.getValue();
            if (graphElements.size() >= elementMapping.batchSize() ||
                (!p.hasNext() && graphElements.size() > 0)) {
                flush(builderMap, context.client().graph(), this.loadOptions.checkVertex);
            }
```

### SizeReplaceableByIsEmpty
`struct.edges().size() > 0` can be replaced with '!struct.edges().isEmpty()'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/HBaseDirectLoader.java`
#### Snippet
```java

    public Integer getTablePartitions() {
        return struct.edges().size() > 0 ?
               loadOptions.edgePartitions : loadOptions.vertexPartitions;
    }
```

### SizeReplaceableByIsEmpty
`struct.edges().size() > 0` can be replaced with '!struct.edges().isEmpty()'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/HBaseDirectLoader.java`
#### Snippet
```java

        String tableName = null;
        if (struct.edges().size() > 0) {
            tableName = this.loadOptions.edgeTablename;

```

### SizeReplaceableByIsEmpty
`struct.vertices().size() > 0` can be replaced with '!struct.vertices().isEmpty()'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/HBaseDirectLoader.java`
#### Snippet
```java
            tableName = this.loadOptions.edgeTablename;

        } else if (struct.vertices().size() > 0) {
            tableName = this.loadOptions.vertexTablename;

```

## RuleId[ruleID=ConstantMathCall]
### ConstantMathCall
Constant call to `ceil()` can be simplified
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/ComputeSign.java`
#### Snippet
```java

        final int cacheSize = 1000;
        final int capacity = (int) Math.ceil(cacheSize / 0.75f) + 1;
        entPlain2Id = new LinkedHashMap<String, String>(capacity, 0.75f, true) {
            @Override
```

## RuleId[ruleID=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/PageUtil.java`
#### Snippet
```java
    public static <T> IPage<T> page(List<T> entities, int pageNo, int pageSize) {
        // Regard page no < 1 as 1
        int current = pageNo > 1 ? pageNo : 1;
        int pages;
        List<T> records;
```

## RuleId[ruleID=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id.IdType idType(Id id) {
        if (id instanceof LongId) {
            return Id.IdType.LONG;
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(long id) {
        return new LongId(id);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(String id, boolean uuid) {
        return uuid ? new UuidId(id) : new StringId(id);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(byte[] bytes, Id.IdType type) {
        switch (type) {
            case LONG:
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id ofStoredString(String id, Id.IdType type) {
        switch (type) {
            case LONG:
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static String asStoredString(Id id) {
        switch (id.type()) {
            case LONG:
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(UUID id) {
        return new UuidId(id);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    public static final Id ZERO = IdGenerator.of(0L);

    public final static Id of(String id) {
        return new StringId(id);
    }
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends HugeResource`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Target.java`
#### Snippet
```java
    }

    public void resources(List<HugeResource> resources) {
        this.resources = resources;
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/graph/GraphIterator.java`
#### Snippet
```java

    public GraphIterator(final GraphManager graphManager, final int sizePerPage,
                         final Function<String, Pageable<T>> pageFetcher) {
        E.checkNotNull(graphManager, "Graph manager");
        E.checkNotNull(pageFetcher, "Page fetcher");
```

### BoundedWildcard
Can generalize to `? extends Pageable`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/graph/GraphIterator.java`
#### Snippet
```java

    public GraphIterator(final GraphManager graphManager, final int sizePerPage,
                         final Function<String, Pageable<T>> pageFetcher) {
        E.checkNotNull(graphManager, "Graph manager");
        E.checkNotNull(pageFetcher, "Page fetcher");
```

### BoundedWildcard
Can generalize to `? extends Vertex`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/graph/Graph.java`
#### Snippet
```java
    }

    private void mergeEdges2Vertices(List<Vertex> vertices,
                                     List<Edge> edges) {
        this.hugeVerticesMap = new HashMap<>(vertices.size());
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/graph/Graph.java`
#### Snippet
```java

    private void mergeEdges2Vertices(List<Vertex> vertices,
                                     List<Edge> edges) {
        this.hugeVerticesMap = new HashMap<>(vertices.size());
        for (Vertex v : vertices) {
```

### BoundedWildcard
Can generalize to `? extends Vertex`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
     * TODO: use a batch and send them together
     * */
    void writeDirectly(List<Vertex> vertices, List<Edge> edges) {
        for (Vertex vertex : vertices) {
            byte[] rowkey = HBaseSer.getKeyBytes(vertex);
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
     * TODO: use a batch and send them together
     * */
    void writeDirectly(List<Vertex> vertices, List<Edge> edges) {
        for (Vertex vertex : vertices) {
            byte[] rowkey = HBaseSer.getKeyBytes(vertex);
```

### BoundedWildcard
Can generalize to `? extends SchemaConflict`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/schema/ConflictDetail.java`
#### Snippet
```java

    private <T extends SchemaEntity> boolean anyConflict(
                                             List<SchemaConflict<T>> conflicts,
                                             Collection<String> names) {
        if (CollectionUtils.isEmpty(names)) {
```

### BoundedWildcard
Can generalize to `? extends PropertyKeyEntity`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java
    }

    public void checkConflict(List<PropertyKeyEntity> entities,
                              ConflictDetail detail, int connId,
                              boolean compareEachOther) {
```

### BoundedWildcard
Can generalize to `? extends PropertyIndex`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
    }

    public void checkConflict(List<PropertyIndex> entities,
                              ConflictDetail detail, int connId,
                              boolean compareEachOther) {
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinQueryService.java`
#### Snippet
```java

    private Map<Object, Vertex> verticesOfEdge(TypedResult result,
                                               Map<String, Edge> edges,
                                               HugeClient client) {
        int batchSize = this.config.get(HubbleOptions.GREMLIN_BATCH_QUERY_IDS);
```

### BoundedWildcard
Can generalize to `? extends VertexLabelEntity`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
    }

    public void checkConflict(List<VertexLabelEntity> entities,
                              ConflictDetail detail, int connId,
                              boolean compareEachOther) {
```

### BoundedWildcard
Can generalize to `? extends PropertyIndex`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    }

    public static List<IndexLabel> convertIndexLabels(List<PropertyIndex> entities,
                                                      HugeClient client,
                                                      boolean isVertex,
```

### BoundedWildcard
Can generalize to `? super HugeClient`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static List<Long> removeBatch(
           List<String> names, HugeClient client,
           BiFunction<HugeClient, String, Long> func, SchemaType type) {
        List<Long> tasks = new ArrayList<>();
        if (CollectionUtils.isEmpty(names)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static List<Long> removeBatch(
           List<String> names, HugeClient client,
           BiFunction<HugeClient, String, Long> func, SchemaType type) {
        List<Long> tasks = new ArrayList<>();
        if (CollectionUtils.isEmpty(names)) {
```

### BoundedWildcard
Can generalize to `? extends SchemaConflict`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static <T extends SchemaEntity>
           ConflictStatus compareWithOthers(int currentIdx,
                                            List<SchemaConflict<T>> conflicts) {
        SchemaConflict<T> current = conflicts.get(currentIdx);
        T currentEntity = current.getEntity();
```

### BoundedWildcard
Can generalize to `? extends IndexLabel`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static List<PropertyIndex> collectPropertyIndexes(
                                      SchemaLabel schemaLabel,
                                      List<IndexLabel> indexLabels) {
        List<PropertyIndex> propertyIndexes = new ArrayList<>();
        if (indexLabels == null) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java

    public static <T extends SchemaElement> List<Long> addBatch(
           List<T> schemas, HugeClient client,
           BiFunction<HugeClient, T, Long> func, SchemaType type) {
        List<Long> tasks = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super HugeClient`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static <T extends SchemaElement> List<Long> addBatch(
           List<T> schemas, HugeClient client,
           BiFunction<HugeClient, T, Long> func, SchemaType type) {
        List<Long> tasks = new ArrayList<>();
        if (CollectionUtils.isEmpty(schemas)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static <T extends SchemaElement> List<Long> addBatch(
           List<T> schemas, HugeClient client,
           BiFunction<HugeClient, T, Long> func, SchemaType type) {
        List<Long> tasks = new ArrayList<>();
        if (CollectionUtils.isEmpty(schemas)) {
```

### BoundedWildcard
Can generalize to `? super HugeClient`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java

    public static void removeBatch(List<String> names, HugeClient client,
                                   BiConsumer<HugeClient, String> func,
                                   SchemaType type) {
        if (CollectionUtils.isEmpty(names)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java

    public static void removeBatch(List<String> names, HugeClient client,
                                   BiConsumer<HugeClient, String> func,
                                   SchemaType type) {
        if (CollectionUtils.isEmpty(names)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java

    public static <T extends SchemaElement> void addBatch(
           List<T> schemas, HugeClient client,
           BiConsumer<HugeClient, T> func, SchemaType type) {
        if (CollectionUtils.isEmpty(schemas)) {
```

### BoundedWildcard
Can generalize to `? super HugeClient`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static <T extends SchemaElement> void addBatch(
           List<T> schemas, HugeClient client,
           BiConsumer<HugeClient, T> func, SchemaType type) {
        if (CollectionUtils.isEmpty(schemas)) {
            return;
```

### BoundedWildcard
Can generalize to `? super T`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static <T extends SchemaElement> void addBatch(
           List<T> schemas, HugeClient client,
           BiConsumer<HugeClient, T> func, SchemaType type) {
        if (CollectionUtils.isEmpty(schemas)) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Record`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/task/InsertTask.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    protected void updateBatch(List<Record> batch, boolean checkVertex) {
        HugeClient client = this.context.client();
        List<GraphElement> elements = new ArrayList<>(batch.size());
```

### BoundedWildcard
Can generalize to `? extends Record`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/task/InsertTask.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    protected void insertBatch(List<Record> batch, boolean checkVertex) {
        HugeClient client = this.context.client();
        List<GraphElement> elements = new ArrayList<>(batch.size());
```

### BoundedWildcard
Can generalize to `? super Integer`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java

    public <T extends SchemaEntity> IPage<T> listInPage(
                                             Function<Integer, List<T>> fetcher,
                                             int connId, String content,
                                             String nameOrder,
```

### BoundedWildcard
Can generalize to `? extends List`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java

    public <T extends SchemaEntity> IPage<T> listInPage(
                                             Function<Integer, List<T>> fetcher,
                                             int connId, String content,
                                             String nameOrder,
```

### BoundedWildcard
Can generalize to `? extends PropertyKeyEntity`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java
    }

    private PropertyKeyEntity findPropertyKey(List<PropertyKeyEntity> entities,
                                              String name) {
        for (PropertyKeyEntity entity : entities) {
```

### BoundedWildcard
Can generalize to `? extends Property`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java
     */
    public static void checkProperties(PropertyKeyService service,
                                       Set<Property> properties,
                                       boolean mustNullable, int connId) {
        if (properties == null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java
    }

    private void fillProperties(Map<String, String> properties,
                                SchemaLabelEntity entity,
                                List<PropertyKeyEntity> propertyKeys) {
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/schema/SchemaController.java`
#### Snippet
```java
    }

    private void fillProperties(Map<String, String> properties,
                                SchemaLabelEntity entity,
                                List<PropertyKeyEntity> propertyKeys) {
```

### BoundedWildcard
Can generalize to `? extends InputStruct`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/HugeGraphLoader.java`
#### Snippet
```java
    }

    private SplitInputStructs splitStructs(List<InputStruct> structs) {
        SplitInputStructs split = new SplitInputStructs();
        for (InputStruct struct : structs) {
```

### BoundedWildcard
Can generalize to `? extends InputStruct`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/HugeGraphLoader.java`
#### Snippet
```java
    }

    private void loadStructs(List<InputStruct> structs) {
        // Load input structs one by one
        for (InputStruct struct : structs) {
```

### BoundedWildcard
Can generalize to `? extends List`>
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/task/ParseTaskBuilder.java`
#### Snippet
```java

        public ParseTask(ElementMapping mapping,
                         Supplier<List<List<Record>>> supplier) {
            this.mapping = mapping;
            this.supplier = supplier;
```

### BoundedWildcard
Can generalize to `? extends Readable`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/OrcFileLineFetcher.java`
#### Snippet
```java

    @Override
    public String[] readHeader(List<Readable> readables) {
        Readable readable = readables.get(0);
        this.openReader(readable);
```

### BoundedWildcard
Can generalize to `? extends Readable`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/ParquetFileLineFetcher.java`
#### Snippet
```java

    @Override
    public String[] readHeader(List<Readable> readables) {
        Readable readable = readables.get(0);
        this.openReader(readables.get(0));
```

### BoundedWildcard
Can generalize to `? extends Readable`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileLineFetcher.java`
#### Snippet
```java
     */
    @Override
    public String[] readHeader(List<Readable> readables) {
        String[] header = null;
        for (Readable readable : readables) {
```

### BoundedWildcard
Can generalize to `? extends ElementBuilder`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
    }

    private void parse(Row row, Map.Entry<ElementBuilder, List<GraphElement>> builderMap,
                       InputStruct struct) {
        ElementBuilder builder = builderMap.getKey();
```

### BoundedWildcard
Can generalize to `? extends List`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
    }

    private void parse(Row row, Map.Entry<ElementBuilder, List<GraphElement>> builderMap,
                       InputStruct struct) {
        ElementBuilder builder = builderMap.getKey();
```

### BoundedWildcard
Can generalize to `? extends ElementBuilder`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
    }

    private void flush(Map.Entry<ElementBuilder, List<GraphElement>> builderMap,
                       GraphManager g, boolean isCheckVertex) {
        ElementBuilder builder = builderMap.getKey();
```

### BoundedWildcard
Can generalize to `? extends List`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
    }

    private void flush(Map.Entry<ElementBuilder, List<GraphElement>> builderMap,
                       GraphManager g, boolean isCheckVertex) {
        ElementBuilder builder = builderMap.getKey();
```

### BoundedWildcard
Can generalize to `? extends ElementBuilder`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/HBaseDirectLoader.java`
#### Snippet
```java

    List<Tuple2<ImmutableBytesWritable, KeyValue>> buildAndSer(HBaseSerializer serializer, Row row,
                                                               List<ElementBuilder> builders) {
        List<GraphElement> elementsElement;
        List<Tuple2<ImmutableBytesWritable, KeyValue>> result = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends JsonGraph.JsonVertex`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/DumpGraphManager.java`
#### Snippet
```java
    }

    private void dump(String file, Collection<JsonGraph.JsonVertex> vertices) {
        try (OutputStream os = this.outputStream(file, false);
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
```

### BoundedWildcard
Can generalize to `? extends Edge`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/RestoreManager.java`
#### Snippet
```java
    }

    private void updateVertexIdInEdge(List<Edge> edges) {
        for (Edge edge : edges) {
            edge.sourceId(this.updateVid(edge.sourceLabel(), edge.sourceId()));
```

### BoundedWildcard
Can generalize to `? extends AuthManager`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
    }

    private void doBackup(List<AuthManager> authManagers) {
        E.checkState(CollectionUtils.isNotEmpty(authManagers),
                     "Backup data is empty, please check the type");
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupRestoreBaseManager.java`
#### Snippet
```java

    protected void read(String file, HugeType type,
                        BiConsumer<String, String> consumer) {
        InputStream is = this.inputStream(file);
        try (InputStreamReader isr = new InputStreamReader(is, API.CHARSET);
```

### BoundedWildcard
Can generalize to `? extends AuthManager`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
    }

    private void doRestore(List<AuthManager> authManagers) {
        E.checkState(CollectionUtils.isNotEmpty(authManagers),
                     "Restore data is empty, please check the type");
```

### BoundedWildcard
Can generalize to `? super String`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupRestoreBaseManager.java`
#### Snippet
```java

    protected void read(String file, HugeType type,
                        BiConsumer<String, String> consumer) {
        InputStream is = this.inputStream(file);
        try (InputStreamReader isr = new InputStreamReader(is, API.CHARSET);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `IdGenerator` has no concrete subclass
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
import org.apache.hugegraph.util.NumericUtil;

public abstract class IdGenerator {

    public static final Id ZERO = IdGenerator.of(0L);
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id.IdType idType(Id id) {
        if (id instanceof LongId) {
            return Id.IdType.LONG;
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(long id) {
        return new LongId(id);
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(String id, boolean uuid) {
        return uuid ? new UuidId(id) : new StringId(id);
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(byte[] bytes, Id.IdType type) {
        switch (type) {
            case LONG:
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id ofStoredString(String id, Id.IdType type) {
        switch (type) {
            case LONG:
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static String asStoredString(Id id) {
        switch (id.type()) {
            case LONG:
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    }

    public final static Id of(UUID id) {
        return new UuidId(id);
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/IdGenerator.java`
#### Snippet
```java
    public static final Id ZERO = IdGenerator.of(0L);

    public final static Id of(String id) {
        return new StringId(id);
    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Result.getObject()` is ignored
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/HugeClientUtil.java`
#### Snippet
```java
        try {
            ResultSet rs = client.gremlin().gremlin("g.V().limit(1)").execute();
            rs.iterator().forEachRemaining(Result::getObject);
        } catch (ServerException e) {
            if (Constant.STATUS_UNAUTHORIZED == e.status()) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/FileMappingService.java`
#### Snippet
```java
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (destFile.exists()) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/FileMappingService.java`
#### Snippet
```java
        }
        if (destFile.exists()) {
            destFile.delete();
        }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailWriter.java`
#### Snippet
```java
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
                return;
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailWriter.java`
#### Snippet
```java
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
                return;
            } catch (IOException e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
        if (this.file.length() == 0) {
            LOG.debug("The file {} is empty, delete it", this.file);
            this.file.delete();
        } else {
            this.removeDupLines();
```

### IgnoreResultOfCall
Result of `FileInputStream.read()` is ignored
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/ComputeSign.java`
#### Snippet
```java
        byte[] fileBytes = new byte[fileLen.intValue()];
        try (FileInputStream in = new FileInputStream(file)) {
            in.read(fileBytes);
        }

```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `check()` only delegates to its super method
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/VertexStructV1.java`
#### Snippet
```java

    @Override
    public void check() throws IllegalArgumentException {
        super.check();
    }
```

### RedundantMethodOverride
Method `check()` only delegates to its super method
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/VertexMapping.java`
#### Snippet
```java

    @Override
    public void check() throws IllegalArgumentException {
        super.check();
    }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `RestClient` is the same as one of its superclass' names
in `hugegraph-client/src/main/java/org/apache/hugegraph/client/RestClient.java`
#### Snippet
```java
import jakarta.ws.rs.core.Response;

public class RestClient extends AbstractRestClient {

    private static final int SECOND = 1000;
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
this.readUInt8() \<\< 16: integer shift implicitly cast to long
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
                break;
            case 2:
                value |= this.readUInt8() << 16 | this.readUInt16();
                break;
            case 3:
```

### IntegerMultiplicationImplicitCastToLong
c \* primes.get(i \& 0xFF): integer multiplication implicitly cast to long
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/SignFS64.java`
#### Snippet
```java
            int c = textBytes[i];
            c = c >= 0 ? c : 256 + c;
            sign += c * primes.get(i & 0xFF);
        }
        return sign & 0xFFFFFFFFL;
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
        } else {
            // Select all
            if (nameOrderAsc != null) {
                // order by name
                assert timeOrderAsc == null;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
        @Override
        public String toString() {
            return super.getMessage();
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java

    public synchronized HugeClient getOrCreate(Integer id) {
        HugeClient client = super.get(id);
        if (client != null) {
            return client;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java

    public void put(GraphConnection connection, HugeClient client) {
        super.put(connection.getId(), client);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java

    public void remove(GraphConnection connection) {
        HugeClient client = super.remove(connection.getId());
        if (client == null) {
            return;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileLineFetcher.java`
#### Snippet
```java

    private void resetStatus() {
        super.resetOffset();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
        if (hdfsConf == null || hdfsConf.isEmpty()) {
            // Local FS directory
            super.directory = LocalDirectory.constructDir(dir, AUTH_BACKUP_RESTORE);
        } else {
            // HDFS directory
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
        } else {
            // HDFS directory
            super.directory = HdfsDirectory.constructDir(dir, AUTH_BACKUP_RESTORE,
                                                         hdfsConf);
        }
```

## RuleId[ruleID=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileMappingController.java`
#### Snippet
```java
        FileSetting fileSetting = fileMapping.getFileSetting();
        List<String> columnNames = fileSetting.getColumnNames();
        Ex.check(columnNames.containsAll(vertexMapping.getIdFields()),
                 "load.file-mapping.vertex.id-fields-should-in-column-names",
                 vertexMapping.getIdFields(), columnNames);
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileMappingController.java`
#### Snippet
```java
        if (elementMapping.getFieldMappings() != null) {
            Set<String> keys = elementMapping.fieldMappingToMap().keySet();
            Ex.check(columnNames.containsAll(keys),
                     "load.file-mapping.field.keys-should-in-column-names");
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileMappingController.java`
#### Snippet
```java
        if (elementMapping.getValueMappings() != null) {
            Set<String> keys = elementMapping.valueMappingToMap().keySet();
            Ex.check(columnNames.containsAll(keys),
                     "load.file-mapping.value.keys-should-in-column-names");
        }
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileMappingController.java`
#### Snippet
```java
        FileSetting fileSetting = fileMapping.getFileSetting();
        List<String> columnNames = fileSetting.getColumnNames();
        Ex.check(columnNames.containsAll(edgeMapping.getSourceFields()),
                 "load.file-mapping.edge.source-fields-should-in-column-names",
                 edgeMapping.getSourceFields(), columnNames);
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileMappingController.java`
#### Snippet
```java
                 "load.file-mapping.edge.source-fields-should-in-column-names",
                 edgeMapping.getSourceFields(), columnNames);
        Ex.check(columnNames.containsAll(edgeMapping.getTargetFields()),
                 "load.file-mapping.edge.target-fields-should-in-column-names",
                 edgeMapping.getTargetFields(), columnNames);
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/LocalFileReader.java`
#### Snippet
```java

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
        E.checkArgument((properties.length & 0x01) == 0,
                        "The number of properties must be even");
        for (int i = 0; i < properties.length; i = i + 2) {
            if (!properties[i].equals(T.ID) &&
                !properties[i].equals(T.LABEL)) {
```

### ReplaceAssignmentWithOperatorAssignment
`i = i + 2` could be simplified to 'i += 2'
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
                        "The number of parameters must be even");
        Object value = null;
        for (int i = 0; i < keyValues.length; i = i + 2) {
            if (keyValues[i].equals(key)) {
                value = keyValues[i + 1];
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/LZ4Util.java`
#### Snippet
```java
        byte[] buffer = new byte[blockSize];
        try {
            while ((count = lzInput.read(buffer)) != -1) {
                buf.write(buffer, 0, count);
            }
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/FileMappingService.java`
#### Snippet
```java
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!pattern.matcher(line).matches()) {
                    break;
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileReader.java`
#### Snippet
```java
        Line line;
        try {
            while ((line = this.fetcher.fetch()) == null) {
                // The current file is read at the end, ready to read next one
                this.fetcher.closeReader();
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
            Set<Integer> wroteLines = new HashSet<>();
            HashFunction hashFunc = Hashing.murmur3_32();
            for (String tipsLine, dataLine; (tipsLine = reader.readLine()) != null &&
                                            (dataLine = reader.readLine()) != null; ) {
                /*
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
            HashFunction hashFunc = Hashing.murmur3_32();
            for (String tipsLine, dataLine; (tipsLine = reader.readLine()) != null &&
                                            (dataLine = reader.readLine()) != null; ) {
                /*
                 * Hash data line to remove duplicate lines
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/RetryManager.java`
#### Snippet
```java
    public void awaitTasks() {
        Future<?> future;
        while ((future = this.futures.poll()) != null) {
            try {
                future.get();
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
            this.edgeCounter.getAndAdd(count);
            Printer.printInBackward(this.edgeCounter.get());
        } while ((page = edges.page()) != null);
    }

```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
            this.vertexCounter.getAndAdd(count);
            Printer.printInBackward(this.vertexCounter.get());
        } while ((page = vertices.page()) != null);
    }

```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
             BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                shards.addAll(this.readList("shards", Shard.class, line));
            }
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
             BufferedReader reader = new BufferedReader(isr)) {
             String line;
             while ((line = reader.readLine()) != null) {
                 resultList.add(line);
             }
```

### NestedAssignment
Result of assignment expression used
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupRestoreBaseManager.java`
#### Snippet
```java
             BufferedReader reader = new BufferedReader(isr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                consumer.accept(type.string(), line);
            }
```

## RuleId[ruleID=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/TraverserManager.java`
#### Snippet
```java
    public Iterator<Edge> iteratorEdges(Shard shard, int sizePerPage) {
        return new GraphIterator<>(this.graphManager, sizePerPage, (page) -> {
            return this.edges(shard, page, sizePerPage);
        });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/TraverserManager.java`
#### Snippet
```java
    public Iterator<Vertex> iteratorVertices(Shard shard, int sizePerPage) {
        return new GraphIterator<>(this.graphManager, sizePerPage, (page) -> {
            return this.vertices(shard, page, sizePerPage);
        });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/GremlinUtil.java`
#### Snippet
```java
        for (String rawLine : rawLines) {
            boolean ignored = IGNORED_PATTERNS.stream().anyMatch(pattern -> {
                return pattern.matcher(rawLine).find();
            });
            if (ignored) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/config/TomcatServletConfig.java`
#### Snippet
```java
        }
        factory.setPort(this.config.get(HubbleOptions.SERVER_PORT));
        factory.addContextCustomizers(context -> {
            context.setCookieProcessor(new LegacyCookieProcessor());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
                // order by name
                assert timeOrderAsc == null;
                query.eq("conn_id", connId).and(wrapper -> {
                    wrapper.like("name", value).or().like("content", value);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
                // order by time
                assert nameOrderAsc == null;
                query.eq("conn_id", connId).and(wrapper -> {
                    wrapper.like("name", value).or().like("content", value);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/LoadTaskService.java`
#### Snippet
```java
        // list error data file
        File[] errorFiles = failureDataDir.listFiles((dir, name) -> {
            return name.endsWith("error");
        });
        if (errorFiles == null) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java
    public void removeBatch(List<PropertyKey> propertyKeys, HugeClient client) {
        List<String> names = collectNames(propertyKeys);
        BiConsumer<HugeClient, String> consumer = (hugeClient, name) -> {
            hugeClient.schema().removePropertyKey(name);
        };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java
        }
        List<PropertyKeyEntity> results = new ArrayList<>(propertyKeys.size());
        propertyKeys.forEach(propertyKey -> {
            results.add(convert(propertyKey));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java

    public void addBatch(List<PropertyKey> propertyKeys, HugeClient client) {
        BiConsumer<HugeClient, PropertyKey> consumer = (hugeClient, pk) -> {
            hugeClient.schema().addPropertyKey(pk);
        };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java
        Set<String> properties = new HashSet<>();
        if (entity.getAppendProperties() != null) {
            entity.getAppendProperties().forEach(p -> {
                properties.add(p.getName());
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java

    public void addBatch(List<EdgeLabel> edgeLabels, HugeClient client) {
        BiConsumer<HugeClient, EdgeLabel> consumer = (hugeClient, el) -> {
            hugeClient.schema().addEdgeLabel(el);
        };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java

        List<EdgeLabelEntity> results = new ArrayList<>(edgeLabels.size());
        edgeLabels.forEach(edgeLabel -> {
            results.add(convert(edgeLabel, indexLabels));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java
        List<String> names = collectNames(edgeLabels);
        BiFunction<HugeClient, String, Long> func = (hugeClient, name) -> {
            return hugeClient.schema().removeEdgeLabelAsync(name);
        };
        removeBatch(names, client, func, SchemaType.EDGE_LABEL);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
    public List<Long> addBatch(List<IndexLabel> indexLabels, HugeClient client) {
        BiFunction<HugeClient, IndexLabel, Long> func = (hugeClient, il) -> {
            return hugeClient.schema().addIndexLabelAsync(il);
        };
        return addBatch(indexLabels, client, func,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
        }
        List<PropertyIndex> results = new ArrayList<>(indexLabels.size());
        indexLabels.forEach(indexLabel -> {
            results.add(convert(indexLabel));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
    public List<Long> removeBatch(List<String> indexLabels, HugeClient client) {
        BiFunction<HugeClient, String, Long> func = (hugeClient, name) -> {
            return hugeClient.schema().removeIndexLabelAsync(name);
        };
        return removeBatch(indexLabels, client, func, SchemaType.PROPERTY_INDEX);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinQueryService.java`
#### Snippet
```java
                // result
                List<Object> results = new ArrayList<>(data.size());
                data.forEach(object -> {
                    results.add(ImmutableMap.of("result", object));
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
        Set<String> properties = new HashSet<>();
        if (entity.getAppendProperties() != null) {
            entity.getAppendProperties().forEach(p -> {
                properties.add(p.getName());
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java

        List<VertexLabelEntity> results = new ArrayList<>(vertexLabels.size());
        vertexLabels.forEach(vertexLabel -> {
            results.add(join(vertexLabel, indexLabels));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java

    public void addBatch(List<VertexLabel> vertexLabels, HugeClient client) {
        BiConsumer<HugeClient, VertexLabel> consumer = (hugeClient, vl) -> {
            hugeClient.schema().addVertexLabel(vl);
        };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
        List<String> names = collectNames(vertexLabels);
        BiFunction<HugeClient, String, Long> func = (hugeClient, name) -> {
            return hugeClient.schema().removeVertexLabelAsync(name);
        };
        removeBatch(names, client, func, SchemaType.VERTEX_LABEL);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
                                            int sizePerPage) {
        return new GraphIterator<>(this, sizePerPage, (page) -> {
            return this.vertexAPI.list(label, properties, 0, page, sizePerPage);
        });
    }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
                                       int sizePerPage) {
        return new GraphIterator<>(this, sizePerPage, (page) -> {
            return this.edgeAPI.list(null, null, label, properties,
                                     0, page, sizePerPage);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
                                       int sizePerPage) {
        return new GraphIterator<>(this, sizePerPage, (page) -> {
            return this.edgeAPI.list(vertexId, direction, label, properties,
                                     0, page, sizePerPage);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/DataTypeUtil.java`
#### Snippet
```java
                                     InsertionOrderUtil.newList() :
                                     InsertionOrderUtil.newSet();
        valueColl.forEach(value -> {
            results.add(parseSingleValue(key, value, dataType, source));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                ds.foreachPartition((Iterator<Row> p) -> {
                    LoadContext context = initPartition(this.loadOptions, struct);
                    p.forEachRemaining((Row row) -> {
                        loadRow(struct, row, p, context);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java
                        "fields at the same time, at least one of them " +
                        "must be empty", selectedFields, ignoredFields);
        this.mappingFields.values().forEach(value -> {
            E.checkArgument(value != null,
                            "The value in field_mapping can't be null");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java
                            "The value in field_mapping can't be null");
        });
        this.mappingValues.values().forEach(m -> {
            m.values().forEach(value -> {
                E.checkArgument(value != null,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java
        });
        this.mappingValues.values().forEach(m -> {
            m.values().forEach(value -> {
                E.checkArgument(value != null,
                                "The value in value_mapping can't be null");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
    public void updateAll() {
        this.propertyKeys.clear();
        client.schema().getPropertyKeys().forEach(pk -> {
            this.propertyKeys.put(pk.name(), pk);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
        });
        this.vertexLabels.clear();
        client.schema().getVertexLabels().forEach(vl -> {
            this.vertexLabels.put(vl.name(), vl);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
        });
        this.edgeLabels.clear();
        client.schema().getEdgeLabels().forEach(el -> {
            this.edgeLabels.put(el.name(), el);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
        this.vertexLabels = new HashMap<>();
        this.edgeLabels = new HashMap<>();
        propertyKeyList.forEach(pk -> {
            this.propertyKeys.put(pk.name(), pk);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
            this.propertyKeys.put(pk.name(), pk);
        });
        vertexLabelList.forEach(vl -> {
            this.vertexLabels.put(vl.name(), vl);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/SchemaCache.java`
#### Snippet
```java
            this.vertexLabels.put(vl.name(), vl);
        });
        edgeLabelList.forEach(el -> {
            this.edgeLabels.put(el.name(), el);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/progress/LoadProgress.java`
#### Snippet
```java

        File[] subFiles = dirFile.listFiles((d, name) -> {
            return name.startsWith(Constants.LOAD_PROGRESS);
        });
        if (subFiles == null || subFiles.length == 0) {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
            List<Object> rawIdValues = splitField(fieldName, fieldValue);
            this.idValues = rawIdValues.stream().map(rawIdValue -> {
                return mappingValue(fieldName, rawIdValue);
            }).collect(Collectors.toList());
        }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
                                                          fieldValue);
                    this.pkValues = rawPkValues.stream().map(rawPkValue -> {
                        return mappingValue(fieldName, rawPkValue);
                    }).collect(Collectors.toList());
                    handledPk = true;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
                                                          fieldValue);
                    this.idValues = rawIdValues.stream().map(rawIdValue -> {
                        return mappingValue(fieldName, rawIdValue);
                    }).collect(Collectors.toList());
                } else {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
            List<Object> rawPkValues = splitField(fieldName, fieldValue);
            this.pkValues = rawPkValues.stream().map(rawPkValue -> {
                return mappingValue(fieldName, rawPkValue);
            }).collect(Collectors.toList());
        }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/ElementMapping.java`
#### Snippet
```java
                        "fields at the same time, at least one of them " +
                        "must be empty", selectedFields, ignoredFields);
        this.mappingFields.values().forEach(value -> {
            E.checkArgument(value != null,
                            "The value in field_mapping can't be null");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/ElementMapping.java`
#### Snippet
```java
                            "The value in field_mapping can't be null");
        });
        this.mappingValues.values().forEach(m -> {
            m.values().forEach(value -> {
                E.checkArgument(value != null,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/ElementMapping.java`
#### Snippet
```java
        });
        this.mappingValues.values().forEach(m -> {
            m.values().forEach(value -> {
                E.checkArgument(value != null,
                                "The value in value_mapping can't be null");
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
                restoreAccess.group(idsMap.get(restoreAccess.group().toString()));
                retry(() -> {
                     return client.authManager().createAccess(restoreAccess);
                }, "restore accesses of authority");
                count++;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
                restoreUser.password(initPassword);
                User user = retry(() -> {
                    return client.authManager().createUser(restoreUser);
                }, "restore users of authority");
                idsMap.put(restoreUser.id().toString(), user.id().toString());
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
                Target restoreTarget = entry.getValue();
                Target target = retry(() -> {
                    return client.authManager().createTarget(restoreTarget);
                }, "restore targets of authority");
                idsMap.put(restoreTarget.id().toString(),
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
                restoreBelong.group(idsMap.get(restoreBelong.group().toString()));
                retry(() -> {
                     return client.authManager().createBelong(restoreBelong);
                }, "restore belongs of authority");
                count++;
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
                Group restoreGroup = entry.getValue();
                Group group = retry(() -> {
                    return client.authManager().createGroup(restoreGroup);
                }, "restore groups of authority");
                idsMap.put(restoreGroup.id().toString(), group.id().toString());
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `roles` are queried, but never updated
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/User.java`
#### Snippet
```java

        @JsonProperty("roles")
        private Map<String, Map<HugePermission, List<HugeResource>>> roles;

        public Map<String, Map<HugePermission, List<HugeResource>>> roles() {
```

### MismatchedCollectionQueryUpdate
Contents of collection `versions` are queried, but never updated
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/version/Versions.java`
#### Snippet
```java

    @JsonProperty
    private Map<String, String> versions;

    public String get(String name) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/ExecuteHistoryService.java`
#### Snippet
```java
    private ExecuteHistoryMapper mapper;
    @Autowired
    private HugeClientPoolService poolService;

    private HugeClient getClient(int connId) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/graph/GraphService.java`
#### Snippet
```java

    @Autowired
    private HugeClientPoolService poolService;
    @Autowired
    private PropertyKeyService pkService;
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/license/LicenseService.java`
#### Snippet
```java
    private GraphConnectionService connService;
    @Autowired
    private HugeClientPoolService poolService;
    @Autowired
    private MessageSourceHandler messageHandler;
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/algorithm/OltpAlgoService.java`
#### Snippet
```java

    @Autowired
    private HugeClientPoolService poolService;
    @Autowired
    private ExecuteHistoryService historyService;
```

### MismatchedCollectionQueryUpdate
Contents of collection `edges` are updated, but never queried
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/algorithm/OltpAlgoService.java`
#### Snippet
```java
    private GraphView buildPathGraphView(Path result) {
        Map<Object, Vertex> vertices = new HashMap<>();
        Map<String, Edge> edges = new HashMap<>();

        List<Object> elements = result.objects();
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/algorithm/AsyncTaskService.java`
#### Snippet
```java

    @Autowired
    private HugeClientPoolService poolService;

    private HugeClient getClient(int connId) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinQueryService.java`
#### Snippet
```java
    private HugeConfig config;
    @Autowired
    private HugeClientPoolService poolService;
    @Autowired
    private VertexLabelService vlService;
```

### MismatchedCollectionQueryUpdate
Contents of collection `poolService` are queried, but never updated
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    private HugeConfig config;
    @Autowired
    private HugeClientPoolService poolService;

    public HugeConfig config() {
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `service` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/TaskCache.java`
#### Snippet
```java

    private Map<TaskAPI, Map<Long, Task>> taskTable;
    private ScheduledExecutorService service;

    private static final TaskCache INSTANCE = new TaskCache();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `taskTable` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/TaskCache.java`
#### Snippet
```java
    private static final Task FAKE_TASK = new Task();

    private Map<TaskAPI, Map<Long, Task>> taskTable;
    private ScheduledExecutorService service;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `service` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileUploadController.java`
#### Snippet
```java
    private HugeConfig config;
    @Autowired
    private FileMappingService service;
    @Autowired
    private JobManagerService jobService;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jobService` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileUploadController.java`
#### Snippet
```java
    private FileMappingService service;
    @Autowired
    private JobManagerService jobService;

    @GetMapping("token")
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduler` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
    private static final long serialVersionUID = -4514164348993670086L;
    private LoadContext loadContext;
    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile boolean closed = false;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `builders` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
    private final LoadOptions loadOptions;
    private final InputStruct struct;
    private Map<ElementBuilder, List<String>> builders;

    public HugeGraphOutputFormat(InputStruct struct, String[] args) {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `loadContext` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
    private static final Logger LOG = Log.logger(HugeGraphOutputFormat.class);
    private static final long serialVersionUID = -4514164348993670086L;
    private LoadContext loadContext;
    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scheduledFuture` is accessed in both synchronized and unsynchronized contexts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
    private LoadContext loadContext;
    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile boolean closed = false;

```

## RuleId[ruleID=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                String password = jdbcSource.password();
                Properties properties = new Properties();
                properties.put("user", username);
                properties.put("password", password);
                ds = reader.jdbc(url, table, properties);
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                Properties properties = new Properties();
                properties.put("user", username);
                properties.put("password", password);
                ds = reader.jdbc(url, table, properties);
                break;
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Method only calls its super
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/VertexMapping.java`
#### Snippet
```java

    @Override
    public void check() throws IllegalArgumentException {
        super.check();
    }
```

### EmptyMethod
Method only calls its super
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/VertexStructV1.java`
#### Snippet
```java

    @Override
    public void check() throws IllegalArgumentException {
        super.check();
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/client/RestClient.java`
#### Snippet
```java
    private static final int SECOND = 1000;

    private Version apiVersion = null;

    static {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java


    private int status = 0;
    private String exception;
    private String message;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/gremlin/ResultSet.java`
#### Snippet
```java
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private GraphManager graphManager = null;

    @JsonProperty
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/gremlin/ResultSet.java`
#### Snippet
```java
        return new Iterator<Result>() {

            private int index = 0;

            @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/traverser/PathsRequest.java`
#### Snippet
```java
    public int limit = Traverser.DEFAULT_LIMIT;
    @JsonProperty("with_vertex")
    public boolean withVertex = false;

    public static Builder builder() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/traverser/PathsRequest.java`
#### Snippet
```java
    public int depth;
    @JsonProperty("nearest")
    public boolean nearest = false;
    @JsonProperty("capacity")
    public long capacity = Traverser.DEFAULT_CAPACITY;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/HugeType.java`
#### Snippet
```java
    MAX_TYPE(255, "~");

    private byte type = 0;
    private String name;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/load/LoadParameter.java`
#### Snippet
```java
    @MergeProperty
    @JsonProperty("check_vertex")
    private boolean checkVertex = false;

    @MergeProperty
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/flink/HugeGraphOutputFormat.java`
#### Snippet
```java
    private transient ScheduledExecutorService scheduler;
    private transient ScheduledFuture<?> scheduledFuture;
    private transient volatile boolean closed = false;

    private final LoadOptions loadOptions;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--test-mode"}, arity = 1,
               description = "Whether the hugegraph-loader work in test mode")
    public boolean testMode = false;

    @Parameter(names = {"--help"}, help = true,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--clear-all-data"}, arity = 1,
               description = "Whether to clear all old data before loading")
    public boolean clearAllData = false;

    @Parameter(names = {"--clear-timeout"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--token"}, arity = 1,
               description = "The token of graph for authentication")
    public String token = null;

    @Parameter(names = {"--clear-all-data"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--username"}, arity = 1,
               description = "The username of graph for authentication")
    public String username = null;

    @Parameter(names = {"--protocol"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--check-vertex"}, arity = 1,
               description = "Check vertices exists while inserting edges")
    public boolean checkVertex = false;

    @Parameter(names = {"--max-read-errors"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--dry-run"}, arity = 1,
               description = "Dry run means that only parse but doesn't load")
    public boolean dryRun = false;

    @Parameter(names = {"--print-progress"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
                             "mode, only full load is supported, any read " +
                             "or parsing errors will cause load task stop")
    public boolean failureMode = false;

    @Parameter(names = {"--batch-insert-threads"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
    @Parameter(names = {"--incremental-mode"}, arity = 1,
               description = "Load data from the breakpoint of last time")
    public boolean incrementalMode = false;

    @Parameter(names = {"--failure-mode"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
               description = "The password of client truststore file used " +
                             "when https protocol is enabled")
    public String trustStoreToken = null;

    @Parameter(names = {"--token"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadOptions.java`
#### Snippet
```java
               description = "The path of client truststore file used " +
                             "when https protocol is enabled")
    public String trustStoreFile = null;

    @Parameter(names = {"--trust-store-password"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/RetryManager.java`
#### Snippet
```java
    private ExecutorService pool;
    private final Queue<Future<?>> futures = new ConcurrentLinkedQueue<>();
    private int retry = 0;

    public RetryManager(ToolClient.ConnectionInfo info, String type) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/constant/AuthRestoreConflictStrategy.java`
#### Snippet
```java

    private int code;
    private String name = null;

    AuthRestoreConflictStrategy(int code, String name) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/RestoreManager.java`
#### Snippet
```java
    private boolean clean;

    private Map<String, Long> primaryKeyVLs = null;

    public RestoreManager(ToolClient.ConnectionInfo info) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/RestoreManager.java`
#### Snippet
```java
public class RestoreManager extends BackupRestoreBaseManager {

    private GraphMode mode = null;
    private boolean clean;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                   description = "Whether to keep the local directory of " +
                                 "graph data after restored")
        public boolean keepData = false;

        public long splitSize() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                   description = "Whether the hugegraph-tools work " +
                                 "to throw an exception")
        public boolean throwMode = false;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                                 "cancel all uncompleted tasks firstly, " +
                                 "and delete all completed tasks")
        private boolean force = false;

        public boolean force() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
        @Parameter(names = {"--all-properties"}, arity = 1,
                   description = "All properties to be backup flag")
        public boolean allProperties = false;

        @Parameter(names = {"--properties"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                   validateWith = TaskStatusValidator.class,
                   description = "Status of task")
        public String status = null;
    }

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                   description = "Download url prefix path of " +
                                 "HugeGraph-Server and HugeGraph-Studio")
        public String url = null;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
                   description = "Whether to remove the directory of " +
                                 "graph data after restored")
        public boolean clean = false;

        @ParametersDelegate
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupRestoreBaseManager.java`
#### Snippet
```java
    protected AtomicLong edgeCounter = new AtomicLong(0);

    private long startTime = 0L;
    protected static KeyLock locks = new KeyLock();
    private String logDir;
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(-1) & 0xffffffffL` can be replaced with '0xffffffffL'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
    public static final int UINT8_MAX = ((byte) -1) & 0xff;
    public static final int UINT16_MAX = ((short) -1) & 0xffff;
    public static final long UINT32_MAX = (-1) & 0xffffffffL;

    // NOTE: +1 to let code 0 represent length 1
```

### PointlessBitwiseExpression
`0x00 | positive | high3bits` can be replaced with 'positive \| high3bits'
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
        if (~0x7ffL <= val && val <= 0x7ffL) {
            int high3bits = (int) (val >> 8) & 0x07;
            this.writeUInt8(0x00 | positive | high3bits);
            this.writeUInt8((byte) val);
        } else if (~0x7ffffL <= val && val <= 0x7ffffL) {
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `hugegraph-hubble/hubble-fe/public/index.html`
#### Snippet
```java
    <meta name="theme-color" content="#000000" />
    <meta
      http-equiv="Cache-Control"
      content="no-cache, no-store, must-revaliadte"
    />
```

### HtmlWrongAttributeValue
Wrong attribute value
in `hugegraph-hubble/hubble-fe/public/index.html`
#### Snippet
```java
      content="no-cache, no-store, must-revaliadte"
    />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <link rel="manifest" href="%PUBLIC_URL%/manifest.json" />
```

### HtmlWrongAttributeValue
Wrong attribute value
in `hugegraph-hubble/hubble-fe/public/index.html`
#### Snippet
```java
    />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <link rel="manifest" href="%PUBLIC_URL%/manifest.json" />
    <title>HugeGraph</title>
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ServerCause` does not end with 'Exception'
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
     * The stack trace of server exception
     */
    private static class ServerCause extends RuntimeException {

        private static final long serialVersionUID = 8755660573085501031L;
```

## RuleId[ruleID=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `hugegraph-tools/src/main/java/org/apache/hugegraph/util/ToolUtil.java`
#### Snippet
```java

    public static String commandsCategory(JCommander jCommander) {
        StringBuffer sb = new StringBuffer();
        sb.append("================================================");
        sb.append("\n");
```

## RuleId[ruleID=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void print(String content, Object ... objects) {
        System.out.println(String.format(content, objects));
    }

```

### RedundantStringFormatCall
Redundant call to `format()`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printInBackward(long count) {
        System.out.print(String.format("%d%s", count, backward(count)));
    }

```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/load/LoadTaskService.java`
#### Snippet
```java
        Ex.check(setting.getColumnNames() != null,
                 "Must do file setting firstly");
        source.header(setting.getColumnNames().toArray(new String[]{}));
        // NOTE: format and delimiter must be CSV and "," temporarily
        source.format(FileFormat.valueOf(setting.getFormat()));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return new String[]{};
        }
        return collection.toArray(new String[]{});
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/SchemaService.java`
#### Snippet
```java
            return new String[]{};
        }
        return collection.toArray(new String[]{});
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/parser/JsonLineParser.java`
#### Snippet
```java

    private static String[] names(Map<String, Object> keyValues) {
        return keyValues.keySet().toArray(new String[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/OrcFileLineFetcher.java`
#### Snippet
```java
        return fields.stream().map(StructField::getFieldName)
                     .collect(Collectors.toList())
                     .toArray(new String[]{});
    }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/line/Line.java`
#### Snippet
```java
            }
        }
        this.names = retainedNames.toArray(new String[]{});
        this.values = retainedValues.toArray(new Object[]{});
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/line/Line.java`
#### Snippet
```java
        }
        this.names = retainedNames.toArray(new String[]{});
        this.values = retainedValues.toArray(new Object[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/source/AbstractSource.java`
#### Snippet
```java

    public void header(List<String> header) {
        this.header = header.toArray(new String[]{});
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/jdbc/RowFetcher.java`
#### Snippet
```java
                columns.add(result.getString("COLUMN_NAME"));
            }
            this.columns = columns.toArray(new String[]{});
        } catch (SQLException e) {
            this.close();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/jdbc/RowFetcher.java`
#### Snippet
```java
            columns.add(metaData.getColumnName(i));
        }
        this.columns = columns.toArray(new String[]{});
        return this.columns;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/jdbc/RowFetcher.java`
#### Snippet
```java
                columns.add(result.getString("COLUMN_NAME"));
            }
            this.primaryKeys = columns.toArray(new String[]{});
        } catch (SQLException e) {
            this.close();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/LoadMapping.java`
#### Snippet
```java
                }
                List<String> header = JsonUtil.convertList(json, String.class);
                source.header(header.toArray(new String[]{}));
            }
            // Set failure data path
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `ids` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/NotAllCreatedException.java`
#### Snippet
```java
    private static final long serialVersionUID = -8795820552805040556L;

    private Collection<?> ids;

    public NotAllCreatedException(String message, Collection<?> ids,
```

### NonFinalFieldOfException
Non-final field `cause` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
    private String exception;
    private String message;
    private String cause;
    private Object trace;

```

### NonFinalFieldOfException
Non-final field `message` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
    private int status = 0;
    private String exception;
    private String message;
    private String cause;
    private Object trace;
```

### NonFinalFieldOfException
Non-final field `status` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java


    private int status = 0;
    private String exception;
    private String message;
```

### NonFinalFieldOfException
Non-final field `trace` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
    private String message;
    private String cause;
    private Object trace;

    public static ServerException fromResponse(Response response) {
```

### NonFinalFieldOfException
Non-final field `exception` of exception class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java

    private int status = 0;
    private String exception;
    private String message;
    private String cause;
```

### NonFinalFieldOfException
Non-final field `status` of exception class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/exception/ExternalException.java`
#### Snippet
```java
public class ExternalException extends ParameterizedException {

    private int status;

    public ExternalException(String message, Object... args) {
```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/SplicingIdGenerator.java`
#### Snippet
```java
    public static SplicingIdGenerator instance() {
        if (instance == null) {
            synchronized (SplicingIdGenerator.class) {
                if (instance == null) {
                    instance = new SplicingIdGenerator();
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/SplicingIdGenerator.java`
#### Snippet
```java
    public static SplicingIdGenerator instance() {
        if (instance == null) {
            synchronized (SplicingIdGenerator.class) {
                if (instance == null) {
                    instance = new SplicingIdGenerator();
```

## RuleId[ruleID=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
                                                 .property("date", "2017-03-24");

        List<Vertex> vertices = new ArrayList<Vertex>() {{
            add(peter);
            add(lop);
```

### DoubleBraceInitialization
Double brace initialization
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java


        List<Edge> edges = new ArrayList<Edge>() {{
            add(peterCreateLop);
        }};
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'List' type conflicts with preceding 'instanceof Collection' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/DataTypeUtil.java`
#### Snippet
```java
                        "The value to be split can't be null");
        if (rawColumnValue instanceof Collection) {
            return (List<Object>) rawColumnValue;
        }
        // TODO: Seems a bit violent
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `strArgs`, unclear if a varargs or non-varargs call is desired
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/handler/ExceptionAdvisor.java`
#### Snippet
```java
        }
        try {
            message = this.messageSourceHandler.getMessage(message, strArgs);
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `c` initializer `0` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/StringEncoding.java`
#### Snippet
```java
    public static String readAsciiString(byte[] array, int offset) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        do {
            c = 0xFF & array[offset++];
```

### UnusedAssignment
Variable `type` initializer `0` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/HugeType.java`
#### Snippet
```java
    MAX_TYPE(255, "~");

    private byte type = 0;
    private String name;

```

### UnusedAssignment
The value `this.poolService.getOrCreate(conn.getId())` assigned to `client` is never used
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/license/LicenseService.java`
#### Snippet
```java
        HugeClient client;
        try {
            client = this.poolService.getOrCreate(conn.getId());
        } catch (Exception e) {
            String msg = this.getMessage("graph-connection.client.unavailable",
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-tools/src/main/java/org/apache/hugegraph/constant/AuthRestoreConflictStrategy.java`
#### Snippet
```java

    private int code;
    private String name = null;

    AuthRestoreConflictStrategy(int code, String name) {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/util/SinkToHBase.java`
#### Snippet
```java
            int numPartitions, String tableName) throws IOException {
        Optional<Connection> optionalConnection = getConnection();
        TableDescriptor descriptor = optionalConnection.get()
                                                       .getTable(TableName.valueOf(tableName))
                                                       .getDescriptor();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/util/SinkToHBase.java`
#### Snippet
```java
        Connection conn = null;
        try {
            conn = ConnectionFactory.createConnection(baseConf.get());
        } catch (IOException e) {
            LOG.error("get hbase connection failed", e);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/util/SinkToHBase.java`
#### Snippet
```java

        private Map<List<String>, Integer> getRangeMap(String tableName) throws IOException {
            Connection conn = getConnection().get();
            HRegionLocator locator =
                    (HRegionLocator) conn.getRegionLocator(TableName.valueOf(tableName));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/util/SinkToHBase.java`
#### Snippet
```java

    public void loadHfiles(String path, String tableName) throws Exception {
        Connection conn = getConnection().get();
        Table table = conn.getTable(TableName.valueOf(tableName));
        Configuration conf = conn.getConfiguration();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/HBaseDirectLoader.java`
#### Snippet
```java
            JavaPairRDD<ImmutableBytesWritable, KeyValue> repartitionedRdd =
                    buildAndSerRdd.repartitionAndSortWithinPartitions(partitioner);
            Configuration conf = sinkToHBase.getHBaseConfiguration().get();
            Job job = Job.getInstance(conf);
            HFileOutputFormat2.configureIncrementalLoadMap(job, tableDescriptor);
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `leading != 0x80` is always `true`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
    public long readVLong() {
        byte leading = this.read();
        E.checkArgument(leading != 0x80,
                        "Unexpected varlong with leading byte '0x%s'",
                        Bytes.toHex(leading));
```

### ConstantValue
Condition `(leading & 0x80) == 0` is always `true`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
        long value = leading & 0x7fL;
        if (leading >= 0) {
            assert (leading & 0x80) == 0;
            return value;
        }
```

### ConstantValue
Condition `leading != 0x80` is always `true`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
    public int readVInt() {
        byte leading = this.read();
        E.checkArgument(leading != 0x80,
                        "Unexpected varint with leading byte '0x%s'",
                        Bytes.toHex(leading));
```

### ConstantValue
Condition `(leading & 0x80) == 0` is always `true`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
        int value = leading & 0x7f;
        if (leading >= 0) {
            assert (leading & 0x80) == 0;
            return value;
        }
```

### ConstantValue
Condition `nameOrderAsc == null` is always `true`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
            } else if (timeOrderAsc != null) {
                // order by time
                assert nameOrderAsc == null;
                query.eq("conn_id", connId).and(wrapper -> {
                    wrapper.like("name", value).or().like("content", value);
```

### ConstantValue
Condition `nameOrderAsc == null` is always `true`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
            } else {
                // order by relativity
                assert nameOrderAsc == null && timeOrderAsc == null;
                return this.mapper.selectByContentInPage(page, connId, content);
            }
```

### ConstantValue
Condition `nameOrderAsc == null && timeOrderAsc == null` is always `true`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
            } else {
                // order by relativity
                assert nameOrderAsc == null && timeOrderAsc == null;
                return this.mapper.selectByContentInPage(page, connId, content);
            }
```

### ConstantValue
Condition `timeOrderAsc == null` is always `true` when reached
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/query/GremlinCollectionService.java`
#### Snippet
```java
            } else {
                // order by relativity
                assert nameOrderAsc == null && timeOrderAsc == null;
                return this.mapper.selectByContentInPage(page, connId, content);
            }
```

### ConstantValue
Condition `names.length == values.length` is always `false`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/line/Line.java`
#### Snippet
```java
        E.checkArgumentNotNull(values, "The values can't be null");
        if (names.length != values.length) {
            E.checkArgument(names.length == values.length,
                            "The length of names %s should be same as values %s",
                            Arrays.toString(names), Arrays.toString(values));
```

## RuleId[ruleID=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `hugegraph-tools/src/main/java/org/apache/hugegraph/util/ToolUtil.java`
#### Snippet
```java
    public static void printExceptionStackIfNeeded(Throwable e) {
        System.out.println("Type y(yes) to print exception stack[default n]?");
        Scanner scan = new Scanner(System.in);
        String inputInfomation = scan.nextLine();

```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `lowScore` may be 'static'
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
                groupedIndexes.sort(new Comparator<PropertyIndex>() {
                    final int highScore = 2;
                    final int lowScore = 1;
                    @Override
                    public int compare(PropertyIndex o1, PropertyIndex o2) {
```

### FieldMayBeStatic
Field `highScore` may be 'static'
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
                List<PropertyIndex> groupedIndexes = entry.getValue();
                groupedIndexes.sort(new Comparator<PropertyIndex>() {
                    final int highScore = 2;
                    final int lowScore = 1;
                    @Override
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SplicingIdGenerator` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/SplicingIdGenerator.java`
#### Snippet
```java
 * Copied from HugeGraph(<a href="https://github.com/hugegraph/hugegraph">...</a>)
 */
public class SplicingIdGenerator {

    private static volatile SplicingIdGenerator instance;
```

### UtilityClassWithoutPrivateConstructor
Class `CommonUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/CommonUtil.java`
#### Snippet
```java
import java.util.Map;

public final class CommonUtil {

    public static void checkMapClass(Object object, Class<?> kClass,
```

### UtilityClassWithoutPrivateConstructor
Class `IdUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/IdUtil.java`
#### Snippet
```java
 * Copied from HugeGraph(<a href="https://github.com/hugegraph/hugegraph">...</a>)
 */
public final class IdUtil {

    public static String escape(char splitor, char escape, String... values) {
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/util/JsonUtil.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();
```

### UtilityClassWithoutPrivateConstructor
Class `BatchExample` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
import org.apache.hugegraph.driver.SchemaManager;

public class BatchExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `SingleExample` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
import org.apache.hugegraph.driver.SchemaManager;

public class SingleExample {

    public static void main(String[] args) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `ClientVersion` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/version/ClientVersion.java`
#### Snippet
```java
import org.apache.hugegraph.util.VersionUtil.Version;

public class ClientVersion {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `P` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/Task.java`
#### Snippet
```java
    }

    public static final class P {

        public static final String ID = "id";
```

### UtilityClassWithoutPrivateConstructor
Class `MovieExample` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/MovieExample.java`
#### Snippet
```java
import org.apache.hugegraph.driver.SchemaManager;

public class MovieExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `T` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/constant/T.java`
#### Snippet
```java
package org.apache.hugegraph.structure.constant;

public class T {

    public static final String ID = "id";
```

### UtilityClassWithoutPrivateConstructor
Class `Traverser` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/constant/Traverser.java`
#### Snippet
```java
package org.apache.hugegraph.structure.constant;

public class Traverser {

    public static final long DEFAULT_CAPACITY = 10_000_000L;
```

### UtilityClassWithoutPrivateConstructor
Class `SplicingIdGenerator` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/SplicingIdGenerator.java`
#### Snippet
```java
 * This class is used for merge / parse id in primaryKey mode, simplify from server
 **/
public class SplicingIdGenerator {

    private static volatile SplicingIdGenerator instance;
```

### UtilityClassWithoutPrivateConstructor
Class `StringEncoding` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/StringEncoding.java`
#### Snippet
```java
 * Used for encode / decode string values, simplify from server
 */
public final class StringEncoding {

    private static final MessageDigest DIGEST;
```

### UtilityClassWithoutPrivateConstructor
Class `LZ4Util` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/LZ4Util.java`
#### Snippet
```java
import java.io.IOException;

public class LZ4Util {

    protected static final float DEFAULT_BUFFER_RATIO = 1.5f;
```

### UtilityClassWithoutPrivateConstructor
Class `Ex` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/Ex.java`
#### Snippet
```java
import org.apache.hugegraph.exception.InternalException;

public final class Ex {

    public static void check(boolean expression, String message,
```

### UtilityClassWithoutPrivateConstructor
Class `SQLUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/SQLUtil.java`
#### Snippet
```java
import org.apache.hugegraph.common.Constant;

public final class SQLUtil {

    public static String escapeLike(String text) {
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/FileUtil.java`
#### Snippet
```java
import org.apache.hugegraph.exception.InternalException;

public final class FileUtil {

    public static int countLines(String path) {
```

### UtilityClassWithoutPrivateConstructor
Class `HugeClientUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/HugeClientUtil.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;

public final class HugeClientUtil {

    private static final String DEFAULT_PROTOCOL = "http";
```

### UtilityClassWithoutPrivateConstructor
Class `EntityUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/EntityUtil.java`
#### Snippet
```java
import org.apache.hugegraph.exception.InternalException;

public final class EntityUtil {

    @SuppressWarnings("unchecked")
```

### UtilityClassWithoutPrivateConstructor
Class `Constant` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/common/Constant.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;

public final class Constant {

    public static final Charset CHARSET = UTF_8;
```

### UtilityClassWithoutPrivateConstructor
Class `HubbleUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/HubbleUtil.java`
#### Snippet
```java
import org.apache.commons.collections.CollectionUtils;

public final class HubbleUtil {

    public static final Pattern HOST_PATTERN = Pattern.compile(
```

### UtilityClassWithoutPrivateConstructor
Class `PageUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/PageUtil.java`
#### Snippet
```java
import com.google.common.collect.Lists;

public final class PageUtil {

    public static <T> IPage<T> page(List<T> entities, int pageNo, int pageSize) {
```

### UtilityClassWithoutPrivateConstructor
Class `GremlinUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/GremlinUtil.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;

public final class GremlinUtil {

    private static final Set<String> LIMIT_SUFFIXES = ImmutableSet.of(
```

### UtilityClassWithoutPrivateConstructor
Class `HubbleVersion` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/version/HubbleVersion.java`
#### Snippet
```java
import org.apache.hugegraph.util.VersionUtil.Version;

public final class HubbleVersion {

    static {
```

### UtilityClassWithoutPrivateConstructor
Class `MappingConverter` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/MappingConverter.java`
#### Snippet
```java
import org.apache.hugegraph.util.Log;

public final class MappingConverter {

    private static final Logger LOG = Log.logger(MappingConverter.class);
```

### UtilityClassWithoutPrivateConstructor
Class `LoadUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/LoadUtil.java`
#### Snippet
```java
import com.beust.jcommander.JCommander;

public final class LoadUtil {

    public static String getStructDirPrefix(LoadOptions options) {
```

### UtilityClassWithoutPrivateConstructor
Class `MappingUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/MappingUtil.java`
#### Snippet
```java

@SuppressWarnings("deprecation")
public final class MappingUtil {

    private static final Set<String> ACCEPTABLE_VERSIONS = ImmutableSet.of(
```

### UtilityClassWithoutPrivateConstructor
Class `ParquetUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/ParquetUtil.java`
#### Snippet
```java
import org.apache.hugegraph.loader.exception.LoadException;

public class ParquetUtil {

    public static Object convertObject(Group group, int fieldIndex) {
```

### UtilityClassWithoutPrivateConstructor
Class `HugeClientHolder` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/HugeClientHolder.java`
#### Snippet
```java
import org.apache.hugegraph.util.E;

public final class HugeClientHolder {

    public static HugeClient create(LoadOptions options) {
```

### UtilityClassWithoutPrivateConstructor
Class `DataTypeUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/DataTypeUtil.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;

public final class DataTypeUtil {

    private static final Set<String> ACCEPTABLE_TRUE = ImmutableSet.of(
```

### UtilityClassWithoutPrivateConstructor
Class `Printer` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
import org.apache.hugegraph.util.TimeUtil;

public final class Printer {

    private static final Logger LOG = Log.logger(Printer.class);
```

### UtilityClassWithoutPrivateConstructor
Class `DateUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/DateUtil.java`
#### Snippet
```java
import org.apache.hugegraph.loader.constant.Constants;

public final class DateUtil {

    private static final Map<String, SafeDateFormat> DATE_FORMATS = new ConcurrentHashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/JsonUtil.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.module.SimpleModule;

public final class JsonUtil {

    private static final Logger LOG = Log.logger(JsonUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `JDBCUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/jdbc/JDBCUtil.java`
#### Snippet
```java
import org.postgresql.core.Utils;

public final class JDBCUtil {

    public static String escapeMysql(String value) {
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/constant/Constants.java`
#### Snippet
```java
import com.google.common.base.Charsets;

public final class Constants {

    public static final int EXIT_CODE_NORM = 0;
```

### UtilityClassWithoutPrivateConstructor
Class `Printer` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
import java.util.Set;

public class Printer {

    public static void print(String content) {
```

### UtilityClassWithoutPrivateConstructor
Class `ToolUtil` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-tools/src/main/java/org/apache/hugegraph/util/ToolUtil.java`
#### Snippet
```java
import com.beust.jcommander.JCommander;

public final class ToolUtil {

    public static void printOrThrow(Throwable e, boolean throwMode) {
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-tools/src/main/java/org/apache/hugegraph/constant/Constants.java`
#### Snippet
```java
package org.apache.hugegraph.constant;

public final class Constants {

    public static final int EXIT_CODE_ERROR = -1;
```

### UtilityClassWithoutPrivateConstructor
Class `SignFS64` has only 'static' members, and lacks a 'private' constructor
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/SignFS64.java`
#### Snippet
```java
import java.util.List;

public class SignFS64 {

    static List<Integer> _MOD_PRIME_LIST_1 =
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/load/FileUploadResult.java`
#### Snippet
```java
        FAILURE,

        SUSPEND;
    }
}
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/config/HubbleConfig.java`
#### Snippet
```java
        try {
            String path = HubbleConfig.class.getClassLoader()
                                            .getResource(conf).getPath();
            File file = new File(path);
            if (file.exists() && file.isFile()) {
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
                    "Invalid UTF8 bytes: " + value;
            if (Bytes.contains(bytes, STRING_ENDING_BYTE)) {
                E.checkArgument(false,
                                "Can't contains byte '0x00' in string: '%s'",
                                value);
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
            if (Bytes.contains(bytes, STRING_ENDING_BYTE)) {
                // Not allow STRING_ENDING_BYTE exist in string index id
                E.checkArgument(false,
                                "The %s type index id can't contains " +
                                "byte '0x%s', but got: 0x%s", type,
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
        T value = (T) TABLE.get(clazz, code);
        if (value == null) {
            E.checkArgument(false, "Can't construct %s from code %s",
                            clazz.getSimpleName(), code);
        }
```

### DataFlowIssue
Argument `name` might be null
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/GraphConnectionController.java`
#### Snippet
```java
        String name = newEntity.getName();
        this.checkParamsNotEmpty("name", name, creating);
        Ex.check(name != null, () -> Constant.COMMON_NAME_PATTERN.matcher(name)
                                                                 .matches(),
                 "graph-connection.name.unmatch-regex");
```

### DataFlowIssue
Argument `graph` might be null
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/GraphConnectionController.java`
#### Snippet
```java
        String graph = newEntity.getGraph();
        this.checkParamsNotEmpty("graph", graph, creating);
        Ex.check(graph != null, () -> GRAPH_PATTERN.matcher(graph).matches(),
                 "graph-connection.graph.unmatch-regex");

```

### DataFlowIssue
Argument `host` might be null
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/GraphConnectionController.java`
#### Snippet
```java
        String host = newEntity.getHost();
        this.checkParamsNotEmpty("host", host, creating);
        Ex.check(host != null, () -> HubbleUtil.HOST_PATTERN.matcher(host)
                                                            .matches(),
                 "graph-connection.host.unmatch-regex");
```

### DataFlowIssue
Unboxing of `port` may produce `NullPointerException`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/GraphConnectionController.java`
#### Snippet
```java
        Ex.check(creating, () -> port != null,
                 "common.param.cannot-be-null", "port");
        Ex.check(port != null, () -> 0 < port && port <= 65535,
                 "graph-connection.port.must-be-in-range", "[1, 65535]", port);

```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/query/GremlinCollectionController.java`
#### Snippet
```java
        } else {
            Ex.check(oldEntity != null,
                     () -> oldEntity.getId().equals(newEntity.getId()),
                     "gremlin-collection.exist.name", name);
        }
```

### DataFlowIssue
Argument `name` might be null
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/query/GremlinCollectionController.java`
#### Snippet
```java
        String name = newEntity.getName();
        this.checkParamsNotEmpty("name", name, creating);
        Ex.check(name != null, () -> Constant.COMMON_NAME_PATTERN.matcher(name)
                                                                 .matches(),
                 "gremlin-collection.name.unmatch-regex");
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/line/Line.java`
#### Snippet
```java
        E.checkArgumentNotNull(values, "The values can't be null");
        if (names.length != values.length) {
            E.checkArgument(names.length == values.length,
                            "The length of names %s should be same as values %s",
                            Arrays.toString(names), Arrays.toString(values));
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
            Collection<String> missed = CollectionUtils.subtract(requiredKeys,
                                                                 keys);
            E.checkArgument(false, "All non-null property keys %s of '%s' " +
                            "must be set, but missed keys %s",
                            requiredKeys, this.schemaLabel().name(), missed);
```

### DataFlowIssue
The call to 'checkState' always fails, according to its method contracts
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/LocalDirectory.java`
#### Snippet
```java
                             "failed: '%s'", file.getAbsolutePath());
            } else {
                E.checkState(false, "The directory does not exist: '%s'",
                             file.getAbsolutePath());
            }
```

### DataFlowIssue
The call to 'checkState' always fails, according to its method contracts
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/HdfsDirectory.java`
#### Snippet
```java
                                 "failed: '%s'", path.toString());
                } else {
                    E.checkState(false,
                                 "The directory does not exist: '%s'",
                                 path.toString());
```

### DataFlowIssue
Dereference of `logDir.listFiles()` may produce `NullPointerException`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
                        "The log directory '%s' not exists or is file",
                        logDir);
        for (File file : logDir.listFiles()) {
            if (file.getName().endsWith(SHARDS_SUFFIX)) {
                try {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'VertexStructV1' is still used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/VertexStructV1.java`
#### Snippet
```java

@Deprecated
public class VertexStructV1 extends ElementStructV1 {

    // Be null when id strategy is primary key
```

### DeprecatedIsStillUsed
Deprecated member 'EdgeStructV1' is still used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/EdgeStructV1.java`
#### Snippet
```java

@Deprecated
public class EdgeStructV1 extends ElementStructV1 {

    @JsonProperty("source")
```

### DeprecatedIsStillUsed
Deprecated member 'ElementStructV1' is still used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java

@Deprecated
public abstract class ElementStructV1 implements Unique<String>, Checkable {

    @JsonProperty("label")
```

### DeprecatedIsStillUsed
Deprecated member 'GraphStructV1' is still used
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/GraphStructV1.java`
#### Snippet
```java
 */
@Deprecated
public class GraphStructV1 implements Checkable {

    private static final Logger LOG = Log.logger(GraphStructV1.class);
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `remove()` overloads a compatible method of a superclass, when overriding might have been intended
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java
    }

    public void remove(GraphConnection connection) {
        HugeClient client = super.remove(connection.getId());
        if (client == null) {
```

### MethodOverloadsParentMethod
Method `init()` overloads a compatible method of a superclass, when overriding might have been intended
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/DumpGraphManager.java`
#### Snippet
```java
    }

    public void init(SubCommands.DumpGraph dump) {
        assert dump.retry() > 0;
        this.retry(dump.retry());
```

### MethodOverloadsParentMethod
Method `init()` overloads a compatible method of a superclass, when overriding might have been intended
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
    }

    public void init(SubCommands.Backup backup) {
        super.init(backup);
        this.removeShardsFilesIfExists();
```

### MethodOverloadsParentMethod
Method `init()` overloads a compatible method of a superclass, when overriding might have been intended
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/RestoreManager.java`
#### Snippet
```java
    }

    public void init(SubCommands.Restore restore) {
        super.init(restore);
        this.ensureDirectoryExist(false);
```

## RuleId[ruleID=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        vertices = graph.addVertices(vertices);
        vertices.forEach(vertex -> System.out.println(vertex));

        edges = graph.addEdges(edges, false);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        edges = graph.addEdges(edges, false);
        edges.forEach(edge -> System.out.println(edge));

        hugeClient.close();
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'trace' in a Serializable class
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
    private String message;
    private String cause;
    private Object trace;

    public static ServerException fromResponse(Response response) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'sslService' in a Serializable class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java
    private GraphConnectionService connService;
    @Autowired
    private SettingSSLService sslService;

    @PreDestroy
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'connService' in a Serializable class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java
    private HugeConfig config;
    @Autowired
    private GraphConnectionService connService;
    @Autowired
    private SettingSSLService sslService;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'config' in a Serializable class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/HugeClientPoolService.java`
#### Snippet
```java

    @Autowired
    private HugeConfig config;
    @Autowired
    private GraphConnectionService connService;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'args' in a Serializable class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/exception/IllegalGremlinException.java`
#### Snippet
```java
public class IllegalGremlinException extends RuntimeException {

    private final Object[] args;

    public IllegalGremlinException(String message, Object... args) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'args' in a Serializable class
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/exception/ParameterizedException.java`
#### Snippet
```java
public class ParameterizedException extends RuntimeException {

    private final Object[] args;

    public ParameterizedException(String message, Object... args) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'listFormat' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/source/AbstractSource.java`
#### Snippet
```java
    private String charset;
    @JsonProperty("list_format")
    private ListFormat listFormat;

    public AbstractSource() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'kerberosConfig' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/source/hdfs/HDFSSource.java`
#### Snippet
```java
    private String hdfsSitePath;
    @JsonProperty("kerberos_config")
    private KerberosConfig kerberosConfig;

    @Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schemaCache' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/ComputerLoadOptions.java`
#### Snippet
```java
public class ComputerLoadOptions extends LoadOptions {

    private final SchemaCache schemaCache;

    public ComputerLoadOptions(SchemaCache schemaCache) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'oldProgress' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadContext.java`
#### Snippet
```java
    private final LoadSummary summary;
    // The old progress just used to read
    private final LoadProgress oldProgress;
    private final LoadProgress newProgress;
    // Each input mapping corresponds to a FailLogger
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'summary' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadContext.java`
#### Snippet
```java
    private volatile boolean noError;
    private final LoadOptions options;
    private final LoadSummary summary;
    // The old progress just used to read
    private final LoadProgress oldProgress;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'schemaCache' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadContext.java`
#### Snippet
```java

    private final HugeClient client;
    private final SchemaCache schemaCache;

    public LoadContext(LoadOptions options) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'client' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadContext.java`
#### Snippet
```java
    private final Map<String, FailLogger> loggers;

    private final HugeClient client;
    private final SchemaCache schemaCache;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'newProgress' in a Serializable class
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/executor/LoadContext.java`
#### Snippet
```java
    // The old progress just used to read
    private final LoadProgress oldProgress;
    private final LoadProgress newProgress;
    // Each input mapping corresponds to a FailLogger
    private final Map<String, FailLogger> loggers;
```

## RuleId[ruleID=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getCause()` overrides synchronized method
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java

    @Override
    public Throwable getCause() {
        if (this.cause() == null || this.cause().isEmpty()) {
            return null;
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `jobType()` during object construction
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/job/JobAPI.java`
#### Snippet
```java
    public JobAPI(RestClient client, String graph) {
        super(client);
        this.path(String.format(PATH, graph, this.type(), this.jobType()));
    }

```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `bytes` declared in one 'switch' branch and used in another
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
            case UUID:
                // UUID Id
                byte[] bytes = id.asBytes();
                assert bytes.length == Id.UUID_LENGTH;
                this.writeUInt8(0x7f); // 0b01111111 means UUID
```

### SwitchStatementWithConfusingDeclaration
Local variable `backup` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
                }
                Printer.print("Graph '%s' start backup!", this.graph());
                SubCommands.Backup backup = this.subCommand(subCmd);
                BackupManager backupManager = manager(BackupManager.class);

```

### SwitchStatementWithConfusingDeclaration
Local variable `backupManager` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
                Printer.print("Graph '%s' start backup!", this.graph());
                SubCommands.Backup backup = this.subCommand(subCmd);
                BackupManager backupManager = manager(BackupManager.class);

                backupManager.init(backup);
```

### SwitchStatementWithConfusingDeclaration
Local variable `graphsManager` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
                break;
            case "restore":
                GraphsManager graphsManager = manager(GraphsManager.class);
                GraphMode mode = graphsManager.mode(this.graph());
                E.checkState(mode.maintaining(),
```

### SwitchStatementWithConfusingDeclaration
Local variable `mode` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
            case "restore":
                GraphsManager graphsManager = manager(GraphsManager.class);
                GraphMode mode = graphsManager.mode(this.graph());
                E.checkState(mode.maintaining(),
                             "Invalid mode '%s' of graph '%s' for restore " +
```

### SwitchStatementWithConfusingDeclaration
Local variable `restore` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
                Printer.print("Graph '%s' start restore in mode '%s'!",
                              this.graph(), mode);
                SubCommands.Restore restore = this.subCommand(subCmd);
                RestoreManager restoreManager = manager(RestoreManager.class);

```

### SwitchStatementWithConfusingDeclaration
Local variable `restoreManager` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
                              this.graph(), mode);
                SubCommands.Restore restore = this.subCommand(subCmd);
                RestoreManager restoreManager = manager(RestoreManager.class);

                restoreManager.init(restore);
```

### SwitchStatementWithConfusingDeclaration
Local variable `gremlinManager` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
            case "gremlin-execute":
                SubCommands.Gremlin gremlin = this.subCommand(subCmd);
                GremlinManager gremlinManager = manager(GremlinManager.class);
                Printer.print("Run gremlin script");
                ResultSet result = gremlinManager.execute(gremlin.script(),
```

### SwitchStatementWithConfusingDeclaration
Local variable `tasksManager` declared in one 'switch' branch and used in another
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/HugeGraphCommand.java`
#### Snippet
```java
            case "task-list":
                SubCommands.TaskList taskList = this.subCommand(subCmd);
                TasksManager tasksManager = manager(TasksManager.class);
                List<Task> tasks = tasksManager.list(taskList.status(),
                                                     taskList.limit());
```

## RuleId[ruleID=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `this.service`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/load/FileUploadController.java`
#### Snippet
```java
                return result;
            }
            synchronized (this.service) {
                // Verify the existence of fragmented files
                FileMapping mapping = this.service.get(connId, jobId, fileName);
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/options/HubbleOptions.java`
#### Snippet
```java
                            return false;
                        }
                        return !input.contains(-1) || input.size() <= 1;
                    },
                    -1
```

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        // get schema object by name
        System.out.println(schema.getPropertyKey("name"));
        System.out.println(schema.getVertexLabel("person"));
        System.out.println(schema.getEdgeLabel("knows"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        // get schema object by name
        System.out.println(schema.getPropertyKey("name"));
        System.out.println(schema.getVertexLabel("person"));
        System.out.println(schema.getEdgeLabel("knows"));
        System.out.println(schema.getIndexLabel("createdByDate"));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        System.out.println(schema.getPropertyKey("name"));
        System.out.println(schema.getVertexLabel("person"));
        System.out.println(schema.getEdgeLabel("knows"));
        System.out.println(schema.getIndexLabel("createdByDate"));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        System.out.println(schema.getVertexLabel("person"));
        System.out.println(schema.getEdgeLabel("knows"));
        System.out.println(schema.getIndexLabel("createdByDate"));

        // list all schema objects
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        // list all schema objects
        System.out.println(schema.getPropertyKeys());
        System.out.println(schema.getVertexLabels());
        System.out.println(schema.getEdgeLabels());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        // list all schema objects
        System.out.println(schema.getPropertyKeys());
        System.out.println(schema.getVertexLabels());
        System.out.println(schema.getEdgeLabels());
        System.out.println(schema.getIndexLabels());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        System.out.println(schema.getPropertyKeys());
        System.out.println(schema.getVertexLabels());
        System.out.println(schema.getEdgeLabels());
        System.out.println(schema.getIndexLabels());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java
        System.out.println(schema.getVertexLabels());
        System.out.println(schema.getEdgeLabels());
        System.out.println(schema.getIndexLabels());

        GraphManager graph = hugeClient.graph();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        vertices = graph.addVertices(vertices);
        vertices.forEach(vertex -> System.out.println(vertex));

        edges = graph.addEdges(edges, false);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/BatchExample.java`
#### Snippet
```java

        edges = graph.addEdges(edges, false);
        edges.forEach(edge -> System.out.println(edge));

        hugeClient.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java

        GremlinManager gremlin = hugeClient.gremlin();
        System.out.println("==== Path ====");
        ResultSet resultSet = gremlin.gremlin("g.V().outE().path()").execute();
        Iterator<Result> results = resultSet.iterator();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
        Iterator<Result> results = resultSet.iterator();
        results.forEachRemaining(result -> {
            System.out.println(result.getObject().getClass());
            Object object = result.getObject();
            if (object instanceof Vertex) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
            Object object = result.getObject();
            if (object instanceof Vertex) {
                System.out.println(((Vertex) object).id());
            } else if (object instanceof Edge) {
                System.out.println(((Edge) object).id());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
                System.out.println(((Vertex) object).id());
            } else if (object instanceof Edge) {
                System.out.println(((Edge) object).id());
            } else if (object instanceof Path) {
                List<Object> elements = ((Path) object).objects();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
                List<Object> elements = ((Path) object).objects();
                elements.forEach(element -> {
                    System.out.println(element.getClass());
                    System.out.println(element);
                });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
                elements.forEach(element -> {
                    System.out.println(element.getClass());
                    System.out.println(element);
                });
            } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/example/SingleExample.java`
#### Snippet
```java
                });
            } else {
                System.out.println(object);
            }
        });
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
    void writeByServer(GraphManager graph, List<Vertex> vertices, List<Edge> edges) {
        vertices = graph.addVertices(vertices);
        vertices.forEach(System.out::println);

        edges = graph.addEdges(edges, false);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java

        edges = graph.addEdges(edges, false);
        edges.forEach(System.out::println);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
            return;
        }
        System.out.printf(">> HugeGraphLoader worked in %s%n",
                          options.workModeString());
        if (options.incrementalMode) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        if (options.incrementalMode) {
            LoadProgress progress = context.oldProgress();
            System.out.printf("vertices/edges loaded last time: %s/%s%n",
                              progress.vertexLoaded(), progress.edgeLoaded());
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
                              progress.vertexLoaded(), progress.edgeLoaded());
        }
        System.out.print("vertices/edges loaded this time : ");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        LOG.error(formatMsg);
        // Print an empty line
        System.err.println();
        System.err.println(formatMsg);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        // Print an empty line
        System.err.println();
        System.err.println(formatMsg);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        int vLength = String.valueOf(vertexLoaded).length();
        int eLength = String.valueOf(edgeLoaded).length();
        System.out.print(vertexLoaded + SLASH + edgeLoaded +
                         backward(vLength + 1 + eLength));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
    private static void printAndLog(String message) {
        LOG.info(message);
        System.out.println(message);
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        LOG.error(formatMsg, e);
        // Print an empty line
        System.err.println();
        System.err.println(formatMsg);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        // Print an empty line
        System.err.println();
        System.err.println(formatMsg);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/Printer.java`
#### Snippet
```java
        long vertexLoaded = summary.vertexLoaded();
        long edgeLoaded = summary.edgeLoaded();
        System.out.println(vertexLoaded + SLASH + edgeLoaded);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printList(String name, List<?> list) {
        System.out.println(name + ": [");
        for (Object object : list) {
            System.out.println("\t" + object + ",");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
        System.out.println(name + ": [");
        for (Object object : list) {
            System.out.println("\t" + object + ",");
        }
        System.out.println("]");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
            System.out.println("\t" + object + ",");
        }
        System.out.println("]");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void print(String content, Object ... objects) {
        System.out.println(String.format(content, objects));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void print(String content) {
        System.out.println(content);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printInBackward(String message) {
        System.out.print(message);
        printInBackward(0L);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printMap(String name, Map<?, ?> map) {
        System.out.println(name + ": {");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " +
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
        System.out.println(name + ": {");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " +
                               entry.getValue() + ",");
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
                               entry.getValue() + ",");
        }
        System.out.println("}");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printInBackward(long count) {
        System.out.print(String.format("%d%s", count, backward(count)));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printSet(String name, Set<?> set) {
        System.out.println(name + ": (");
        for (Object object : set) {
            System.out.println("\t" + object + ",");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
        System.out.println(name + ": (");
        for (Object object : set) {
            System.out.println("\t" + object + ",");
        }
        System.out.println(")");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java
            System.out.println("\t" + object + ",");
        }
        System.out.println(")");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Printer.java`
#### Snippet
```java

    public static void printKV(String key, Object value) {
        System.out.println(key + ": " + value);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/util/ToolUtil.java`
#### Snippet
```java

    public static void printExceptionStackIfNeeded(Throwable e) {
        System.out.println("Type y(yes) to print exception stack[default n]?");
        Scanner scan = new Scanner(System.in);
        String inputInfomation = scan.nextLine();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/GremlinUtil.java`
#### Snippet
```java
            if (text.contains("(STR)")) {
                // single quote
                pattern = compile(regex.replaceAll("STR", "'[\\\\s\\\\S]+'"));
                patterns.add(pattern);
                // double quotes
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/GremlinUtil.java`
#### Snippet
```java
                patterns.add(pattern);
                // double quotes
                pattern = compile(regex.replaceAll("STR", "\"[\\\\s\\\\S]+\""));
                patterns.add(pattern);
            } else if (text.contains("(NUM)")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/GremlinUtil.java`
#### Snippet
```java
                patterns.add(pattern);
            } else if (text.contains("(NUM)")) {
                pattern = compile(regex.replaceAll("NUM", "[\\\\d]+"));
                patterns.add(pattern);
            } else if (text.contains("()")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java
        if (key.endsWith(Constants.FAILURE)) {
            // Delete suffix "-failure" from uniqueKey
            return key.replace(Constants.MINUS_STR + Constants.FAILURE,
                               Constants.EMPTY_STR);
        } else {
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `hugegraph-tools/src/main/java/org/apache/hugegraph/formatter/kgdumper/ComputeSign.java`
#### Snippet
```java
        }

        String[] entSpa = entPlain.split("__");
        if (entSpa.length != 3) {
            return seqNum;
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hbase.io` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
        try {
            conf.registerKryoClasses(new Class[]{
                    org.apache.hadoop.hbase.io.ImmutableBytesWritable.class,
                    org.apache.hadoop.hbase.KeyValue.class,
                    org.apache.spark.sql.types.StructType.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.hbase` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
            conf.registerKryoClasses(new Class[]{
                    org.apache.hadoop.hbase.io.ImmutableBytesWritable.class,
                    org.apache.hadoop.hbase.KeyValue.class,
                    org.apache.spark.sql.types.StructType.class,
                    StructField[].class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.sql.types` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                    org.apache.hadoop.hbase.io.ImmutableBytesWritable.class,
                    org.apache.hadoop.hbase.KeyValue.class,
                    org.apache.spark.sql.types.StructType.class,
                    StructField[].class,
                    StructField.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.sql.types` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                    StructField[].class,
                    StructField.class,
                    org.apache.spark.sql.types.LongType$.class,
                    org.apache.spark.sql.types.Metadata.class,
                    org.apache.spark.sql.types.StringType$.class,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.sql.types` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                    StructField.class,
                    org.apache.spark.sql.types.LongType$.class,
                    org.apache.spark.sql.types.Metadata.class,
                    org.apache.spark.sql.types.StringType$.class,
                    Class.forName(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.sql.types` is unnecessary, and can be replaced with an import
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/spark/HugeGraphSparkLoader.java`
#### Snippet
```java
                    org.apache.spark.sql.types.LongType$.class,
                    org.apache.spark.sql.types.Metadata.class,
                    org.apache.spark.sql.types.StringType$.class,
                    Class.forName(
                            "org.apache.spark.internal.io.FileCommitProtocol$TaskCommitMessage"),
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
            flag = put(type, rowkey, values);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/RetryManager.java`
#### Snippet
```java
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `hugegraph-tools/src/main/java/org/apache/hugegraph/util/ToolUtil.java`
#### Snippet
```java
        if (inputInfomation.equalsIgnoreCase(Constants.INPUT_YES) ||
            inputInfomation.equalsIgnoreCase(Constants.INPUT_Y)) {
            e.printStackTrace();
        }
    }
```

## RuleId[ruleID=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import org.apache.hugegraph.util.TimeUtil;`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/util/SerializeUtil.java`
#### Snippet
```java
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.hugegraph.util.TimeUtil;

public final class SerializeUtil {
```

### SamePackageImport
Unnecessary import from the same package `import org.apache.hugegraph.license.MachineInfo;`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/license/ServerInfo.java`
#### Snippet
```java
package org.apache.hugegraph.license;

import org.apache.hugegraph.license.MachineInfo;

public final class ServerInfo {
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SchemaElementAPI()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/schema/SchemaElementAPI.java`
#### Snippet
```java
    private static final String PATH = "graphs/%s/schema/%s";

    public SchemaElementAPI(RestClient client, String graph) {
        super(client);
        this.path(PATH, graph, this.type());
```

### NonProtectedConstructorInAbstractClass
Constructor `JobAPI()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/job/JobAPI.java`
#### Snippet
```java
    private static final String PATH = "graphs/%s/%s/%s";

    public JobAPI(RestClient client, String graph) {
        super(client);
        this.path(String.format(PATH, graph, this.type(), this.jobType()));
```

### NonProtectedConstructorInAbstractClass
Constructor `AuthAPI()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/AuthAPI.java`
#### Snippet
```java
    private static final String PATH = "graphs/%s/auth/%s";

    public AuthAPI(RestClient client, String graph) {
        super(client);
        this.path(PATH, graph, this.type());
```

### NonProtectedConstructorInAbstractClass
Constructor `API()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/API.java`
#### Snippet
```java
    private String path;

    public API(RestClient client) {
        E.checkNotNull(client, "client");
        this.client = client;
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphAPI()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/graph/GraphAPI.java`
#### Snippet
```java
    private final String batchPath;

    public GraphAPI(RestClient client, String graph) {
        super(client);
        this.path(PATH, graph, this.type());
```

### NonProtectedConstructorInAbstractClass
Constructor `GraphElement()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/GraphElement.java`
#### Snippet
```java
    protected Map<String, Object> properties;

    public GraphElement() {
        this.properties = new ConcurrentHashMap<>();
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SchemaElement()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/SchemaElement.java`
#### Snippet
```java
    protected String status;

    public SchemaElement(String name) {
        this.name = name;
        this.properties = new ConcurrentSkipListSet<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `Pageable()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/graph/Pageable.java`
#### Snippet
```java

    @JsonCreator
    public Pageable(@JsonProperty("page") String page) {
        this.page = page;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SchemaLabel()` of an abstract class should not be declared 'public'
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/schema/SchemaLabel.java`
#### Snippet
```java
    protected List<String> indexLabels;

    public SchemaLabel(String name) {
        super(name);
        this.nullableKeys = new ConcurrentSkipListSet<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `InsertTask()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/task/InsertTask.java`
#### Snippet
```java
    protected final List<Record> batch;

    public InsertTask(LoadContext context, InputStruct struct,
                      ElementMapping mapping, List<Record> batch) {
        assert batch != null;
```

### NonProtectedConstructorInAbstractClass
Constructor `DirectLoader()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/direct/loader/DirectLoader.java`
#### Snippet
```java
    InputStruct struct;

    public DirectLoader(LoadOptions loadOptions,
                        InputStruct struct) {
        this.loadOptions = loadOptions;
```

### NonProtectedConstructorInAbstractClass
Constructor `FileReader()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileReader.java`
#### Snippet
```java
    private Line nextLine;

    public FileReader(FileSource source) {
        this.source = source;
        this.readables = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `LineFetcher()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/line/LineFetcher.java`
#### Snippet
```java
    private long offset;

    public LineFetcher(InputSource source) {
        E.checkNotNull(source, "source");
        this.source = source;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSource()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/source/AbstractSource.java`
#### Snippet
```java
    private ListFormat listFormat;

    public AbstractSource() {
        this.header = null;
        this.charset = Constants.CHARSET.name();
```

### NonProtectedConstructorInAbstractClass
Constructor `ElementStructV1()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/struct/ElementStructV1.java`
#### Snippet
```java
    private transient String uniqueKey;

    public ElementStructV1() {
        this.skip = false;
        this.mappingFields = new HashMap<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `InputItemProgress()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/progress/InputItemProgress.java`
#### Snippet
```java

    @JsonCreator
    public InputItemProgress(@JsonProperty("offset") long offset) {
        this.offset = offset;
        this.confirmOffset = offset;
```

### NonProtectedConstructorInAbstractClass
Constructor `ElementBuilder()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
    private final ByteBuffer buffer;

    public ElementBuilder(LoadContext context, InputStruct struct) {
        this.struct = struct;
        this.schema = context.schemaCache();
```

### NonProtectedConstructorInAbstractClass
Constructor `VertexKVPairs()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
        public Map<String, Object> properties;

        public VertexKVPairs(VertexLabel vertexLabel) {
            this.vertexLabel = vertexLabel;
            this.properties = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `Directory()` of an abstract class should not be declared 'public'
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/Directory.java`
#### Snippet
```java
    private final String directory;

    public Directory(String directory) {
        E.checkArgument(directory != null && !directory.isEmpty(),
                        "Directory can't be null or empty");
```

### NonProtectedConstructorInAbstractClass
Constructor `ElementMapping()` of an abstract class should not be declared 'public'
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/mapping/ElementMapping.java`
#### Snippet
```java
    private long batchSize;

    public ElementMapping() {
        this.skip = false;
        this.mappingFields = new HashMap<>();
```

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/DumpGraphManager.java`
#### Snippet
```java
                this.submit(() -> dump(table, this.graph.table(table).values()));
            }
        } catch (Throwable e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java
        try {
            this.doBackup(types);
        } catch (Throwable e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/RestoreManager.java`
#### Snippet
```java
        try {
            this.doRestore(types);
        } catch (Throwable e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
        try {
            this.doRestore(this.addAuthManagers(sortedHugeTypes));
        } catch (Throwable e) {
            throw e;
        } finally {
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/AuthBackupRestoreManager.java`
#### Snippet
```java
        try {
            this.doBackup(this.addAuthManagers(types));
        } catch (Throwable e) {
            throw e;
        } finally {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `id`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/AuthAPI.java`
#### Snippet
```java
            return null;
        } else if (id instanceof AuthElement) {
            id = ((AuthElement) id).id();
        }
        return String.valueOf(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/AuthAPI.java`
#### Snippet
```java
            return null;
        } else if (id instanceof AuthElement) {
            id = ((AuthElement) id).id();
        }
        return String.valueOf(id);
```

### AssignmentToMethodParameter
Assignment to method parameter `id`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/graph/GraphAPI.java`
#### Snippet
```java
        boolean uuid = id instanceof UUID;
        if (uuid) {
            id = id.toString();
        }
        E.checkArgument(id instanceof String || id instanceof Number,
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/variables/VariablesAPI.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public Map<String, Object> set(String key, Object value) {
        value = ImmutableMap.of("data", value);
        RestResult result = this.client.put(this.path(), key, value);
        return result.readObject(Map.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `timeout`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/HugeClientBuilder.java`
#### Snippet
```java
    public HugeClientBuilder configTimeout(int timeout) {
        if (timeout == 0) {
            timeout = DEFAULT_TIMEOUT;
        }
        this.timeout = timeout;
```

### AssignmentToMethodParameter
Assignment to method parameter `username`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/HugeClientBuilder.java`
#### Snippet
```java
    public HugeClientBuilder configUser(String username, String password) {
        if (username == null) {
            username = "";
        }
        if (password == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `password`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/HugeClientBuilder.java`
#### Snippet
```java
        }
        if (password == null) {
            password = "";
        }
        this.username = username;
```

### AssignmentToMethodParameter
Assignment to method parameter `maxConns`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/HugeClientBuilder.java`
#### Snippet
```java
    public HugeClientBuilder configPool(int maxConns, int maxConnsPerRoute) {
        if (maxConns == 0) {
            maxConns = DEFAULT_MAX_CONNS;
        }
        if (maxConnsPerRoute == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `maxConnsPerRoute`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/HugeClientBuilder.java`
#### Snippet
```java
        }
        if (maxConnsPerRoute == 0) {
            maxConnsPerRoute = DEFAULT_MAX_CONNS_PER_ROUTE;
        }
        this.maxConns = maxConns;
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Access.java`
#### Snippet
```java
    public void group(Object group) {
        if (group instanceof Group) {
            group = ((Group) group).id();
        }
        this.group = group;
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Access.java`
#### Snippet
```java
    public void target(Object target) {
        if (target instanceof Target) {
            target = ((Target) target).id();
        }
        this.target = target;
```

### AssignmentToMethodParameter
Assignment to method parameter `user`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Belong.java`
#### Snippet
```java
    public void user(Object user) {
        if (user instanceof User) {
            user = ((User) user).id();
        }
        this.user = user;
```

### AssignmentToMethodParameter
Assignment to method parameter `group`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Belong.java`
#### Snippet
```java
    public void group(Object group) {
        if (group instanceof Group) {
            group = ((Group) group).id();
        }
        this.group = group;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/StringEncoding.java`
#### Snippet
```java
        int c = 0;
        do {
            c = 0xFF & array[offset++];
            if (c != 0x80) {
                sb.append((char) (c & 0x7F));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/StringEncoding.java`
#### Snippet
```java
        int len = value.length();
        if (len == 0) {
            array[offset++] = (byte) 0x80;
            return offset;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/StringEncoding.java`
#### Snippet
```java
                b |= 0x80; // End marker
            }
            array[offset++] = b;
        } while (i < len);

```

### AssignmentToMethodParameter
Assignment to method parameter `vertices`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java

    void writeByServer(GraphManager graph, List<Vertex> vertices, List<Edge> edges) {
        vertices = graph.addVertices(vertices);
        vertices.forEach(System.out::println);

```

### AssignmentToMethodParameter
Assignment to method parameter `edges`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
        vertices.forEach(System.out::println);

        edges = graph.addEdges(edges, false);
        edges.forEach(System.out::println);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/handler/ExceptionAdvisor.java`
#### Snippet
```java
        }
        try {
            message = this.messageSourceHandler.getMessage(message, strArgs);
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
```

### AssignmentToMethodParameter
Assignment to method parameter `status`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/algorithm/AsyncTaskService.java`
#### Snippet
```java
        HugeClient client = this.getClient(connId);
        if (status.isEmpty()) {
            status = null;
        }
        List<Task> tasks = client.task().list(status);
```

### AssignmentToMethodParameter
Assignment to method parameter `vertexId`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/graph/GraphController.java`
#### Snippet
```java
                               @PathVariable("id") String vertexId,
                               @RequestBody VertexEntity entity) {
        vertexId = UriUtils.decode(vertexId, Constant.CHARSET);
        this.checkParamsValid(connId, entity, false);
        this.checkIdSameAsBody(vertexId, entity);
```

### AssignmentToMethodParameter
Assignment to method parameter `edgeId`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/controller/graph/GraphController.java`
#### Snippet
```java
                           @PathVariable("id") String edgeId,
                           @RequestBody EdgeEntity entity) {
        edgeId = UriUtils.decode(edgeId, Constant.CHARSET);
        this.checkParamsValid(connId, entity, false);
        this.checkIdSameAsBody(edgeId, entity);
```

### AssignmentToMethodParameter
Assignment to method parameter `vertex`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java

    public Vertex appendVertexProperty(Vertex vertex) {
        vertex = this.vertexAPI.append(vertex);
        this.attachManager(vertex);
        return vertex;
```

### AssignmentToMethodParameter
Assignment to method parameter `edge`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java
            throw new InvalidOperationException("Not allowed to custom id for edge: '%s'", edge);
        }
        edge = this.edgeAPI.create(edge);
        this.attachManager(edge);
        return edge;
```

### AssignmentToMethodParameter
Assignment to method parameter `edge`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java

    public Edge eliminateEdgeProperty(Edge edge) {
        edge = this.edgeAPI.eliminate(edge);
        this.attachManager(edge);
        return edge;
```

### AssignmentToMethodParameter
Assignment to method parameter `edge`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java

    public Edge appendEdgeProperty(Edge edge) {
        edge = this.edgeAPI.append(edge);
        this.attachManager(edge);
        return edge;
```

### AssignmentToMethodParameter
Assignment to method parameter `vertex`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java

    public Vertex addVertex(Vertex vertex) {
        vertex = this.vertexAPI.create(vertex);
        this.attachManager(vertex);
        return vertex;
```

### AssignmentToMethodParameter
Assignment to method parameter `vertex`
in `hugegraph-client/src/main/java/org/apache/hugegraph/driver/GraphManager.java`
#### Snippet
```java

    public Vertex eliminateVertexProperty(Vertex vertex) {
        vertex = this.vertexAPI.eliminate(vertex);
        this.attachManager(vertex);
        return vertex;
```

### AssignmentToMethodParameter
Assignment to method parameter `retryCount`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/task/BatchInsertTask.java`
#### Snippet
```java
        }

        if (++retryCount > options.retryTimes) {
            LOG.error("Batch insert has been retried more than {} times",
                      options.retryTimes);
```

### AssignmentToMethodParameter
Assignment to method parameter `rawValue`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/DataTypeUtil.java`
#### Snippet
```java
                        "end with '%s', but got '%s'",
                        key, startSymbol, endSymbol, rawValue);
        rawValue = rawValue.substring(startSymbol.length(),
                                      rawValue.length() - endSymbol.length());
        String elemDelimiter = listFormat.elemDelimiter();
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/builder/ElementBuilder.java`
#### Snippet
```java
                               boolean needConvert) {
        if (needConvert) {
            value = this.convertPropertyValue(key, value);
        }
        element.property(key, value);
```

### AssignmentToMethodParameter
Assignment to method parameter `directory`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/LocalDirectory.java`
#### Snippet
```java
    public static LocalDirectory constructDir(String directory, String graph) {
        if (directory == null || directory.isEmpty()) {
            directory = "./" + graph;
        }
        return new LocalDirectory(directory);
```

### AssignmentToMethodParameter
Assignment to method parameter `directory`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/HdfsDirectory.java`
#### Snippet
```java
        if (directory == null || directory.isEmpty()) {
            if (hdfsFs.endsWith("/")) {
                directory = hdfsFs + graph;
            } else {
                directory = hdfsFs + "/" + graph;
```

### AssignmentToMethodParameter
Assignment to method parameter `directory`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/base/HdfsDirectory.java`
#### Snippet
```java
                directory = hdfsFs + graph;
            } else {
                directory = hdfsFs + "/" + graph;
            }
        }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/AuthAPI.java`
#### Snippet
```java
    public static String formatRelationId(Object id) {
        if (id == null) {
            return null;
        } else if (id instanceof AuthElement) {
            id = ((AuthElement) id).id();
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/auth/AuthAPI.java`
#### Snippet
```java
    public static String formatEntityId(Object id) {
        if (id == null) {
            return null;
        } else if (id instanceof AuthElement) {
            id = ((AuthElement) id).id();
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/graph/GraphAPI.java`
#### Snippet
```java
    public static String formatProperties(Map<String, Object> properties) {
        if (properties == null) {
            return null;
        }
        String json = JsonUtil.toJson(properties);
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/graph/GraphAPI.java`
#### Snippet
```java
        } else {
            if (id == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/task/TaskAPI.java`
#### Snippet
```java
    public Task waitUntilTaskSuccess(long taskId, long seconds) {
        if (taskId == 0) {
            return null;
        }
        long passes = seconds * 1000 / QUERY_INTERVAL;
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/exception/ServerException.java`
#### Snippet
```java
    public Throwable getCause() {
        if (this.cause() == null || this.cause().isEmpty()) {
            return null;
        }
        return new ServerCause(this.cause());
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Target.java`
#### Snippet
```java
    public HugeResource resource() {
        if (this.resources == null || this.resources.size() != 1) {
            return null;
        }
        return this.resources.get(0);
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/auth/Target.java`
#### Snippet
```java
    public List<HugeResource> resources() {
        if (this.resources == null) {
            return null;
        }
        return Collections.unmodifiableList(this.resources);
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/gremlin/ResultSet.java`
#### Snippet
```java
    public Result get(int index) {
        if (index >= this.data.size()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/structure/gremlin/ResultSet.java`
#### Snippet
```java
        Object object = this.data().get(index);
        if (object == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
    public <V> UUID valueToUUID(V value) {
        if (!this.isUUID()) {
            return null;
        }
        if (value instanceof UUID) {
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
            return StringEncoding.uuid((String) value);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
    public <V> Number valueToNumber(V value) {
        if (!(this.isNumber() && value instanceof Number)) {
            return null;
        }
        if (this.clazz.isInstance(value)) {
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
    public <V> Date valueToDate(V value) {
        if (!this.isDate()) {
            return null;
        }
        if (value instanceof Date) {
```

### ReturnNull
Return of `null`
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/struct/DataType.java`
#### Snippet
```java
            return DateUtil.parse((String) value);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/load/FileMapping.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/load/FileMapping.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/handler/MessageSourceHandler.java`
#### Snippet
```java
        Cookie cookie = WebUtils.getCookie(this.request, Constant.COOKIE_USER);
        if (cookie == null || cookie.getValue() == null) {
            return null;
        }
        String username = cookie.getValue();
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/license/LicenseService.java`
#### Snippet
```java
        public String getMessage() {
            if (this.enabled) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java
    public static PropertyKeyEntity convert(PropertyKey propertyKey) {
        if (propertyKey == null) {
            return null;
        }
        return PropertyKeyEntity.builder()
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyKeyService.java`
#### Snippet
```java
                                      HugeClient client) {
        if (entity == null) {
            return null;
        }
        return client.schema()
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java
                                     HugeClient client) {
        if (entity == null) {
            return null;
        }
        Set<String> properties = new HashSet<>();
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java
                                     HugeClient client) {
        if (entity == null) {
            return null;
        }
        Frequency frequency = entity.isLinkMultiTimes() ? Frequency.MULTIPLE :
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/EdgeLabelService.java`
#### Snippet
```java
                                           List<IndexLabel> indexLabels) {
        if (edgeLabel == null) {
            return null;
        }
        Set<Property> properties = collectProperties(edgeLabel);
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
        } catch (ServerException e) {
            if (e.status() == Constant.STATUS_NOT_FOUND) {
                return null;
            }
            throw e;
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/PropertyIndexService.java`
#### Snippet
```java
    public static IndexLabel convert(PropertyIndex entity, HugeClient client) {
        if (entity == null) {
            return null;
        }
        boolean isVertex = entity.getOwnerType().isVertexLabel();
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
                                       HugeClient client) {
        if (entity == null) {
            return null;
        }
        Set<String> properties = new HashSet<>();
```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
                                       HugeClient client) {
        if (entity == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/service/schema/VertexLabelService.java`
#### Snippet
```java
                                          List<IndexLabel> indexLabels) {
        if (vertexLabel == null) {
            return null;
        }
        Set<Property> properties = collectProperties(vertexLabel);
```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/ParquetUtil.java`
#### Snippet
```java
        // Field is no value
        if (group.getFieldRepetitionCount(fieldName) == 0) {
            return null;
        }
        Object object;
```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileReader.java`
#### Snippet
```java
    private Line readNextLine() throws IOException {
        if (!this.fetcher.ready() && !this.openNextReadable()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileReader.java`
#### Snippet
```java
                if (!this.openNextReadable()) {
                    // There is no readable file
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/OrcFileLineFetcher.java`
#### Snippet
```java
        // Read next line from current file
        if (!this.recordReader.hasNext()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/ParquetFileLineFetcher.java`
#### Snippet
```java
        // Read next row group
        if (needFetchNext && !this.fetchNextPage()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/file/FileLineFetcher.java`
#### Snippet
```java
            String rawLine = this.reader.readLine();
            if (rawLine == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/reader/jdbc/RowFetcher.java`
#### Snippet
```java
    public List<Line> nextBatch() throws SQLException {
        if (this.fullyFetched) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/progress/InputProgress.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/progress/InputProgress.java`
#### Snippet
```java
            return this.loadingItem;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/constant/AuthRestoreConflictStrategy.java`
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
in `hugegraph-tools/src/main/java/org/apache/hugegraph/manager/BackupManager.java`
#### Snippet
```java

    private String initPage() {
        return BACKENDS_NO_PAGING.contains(this.backend) ? null : PAGE_NONE;
    }

```

### ReturnNull
Return of `null`
in `hugegraph-tools/src/main/java/org/apache/hugegraph/cmd/SubCommands.java`
#### Snippet
```java
        public String status() {
            if (this.status.status == null) {
                return null;
            }
            return this.status.status.toUpperCase();
```

## RuleId[ruleID=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `inputStruct`
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/util/MappingUtil.java`
#### Snippet
```java
                fileSourceInputStructs.compute(key, (k, inputStruct) -> {
                    if (inputStruct == null) {
                        inputStruct = new InputStruct(null, null);
                        inputStruct.input(source);
                    }
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `flag` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/reuse/BytesDemo.java`
#### Snippet
```java
    boolean sendRpcToRocksDB(byte[] rowkey, byte[] values) {
        // here we call the rpc
        boolean flag = false;
        //flag = put(rowkey, values);
        return flag;
```

### UnnecessaryLocalVariable
Local variable `bytes` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
        int length = this.readVInt();
        assert length >= 0;
        byte[] bytes = this.read(length);
        return bytes;
    }
```

### UnnecessaryLocalVariable
Local variable `bytes` is redundant
in `hugegraph-client/src/main/java/org/apache/hugegraph/serializer/direct/util/BytesBuffer.java`
#### Snippet
```java
        int length = this.readVInt();
        assert length >= 0;
        byte[] bytes = this.read(length);
        return bytes;
    }
```

## RuleId[ruleID=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/task/TaskAPI.java`
#### Snippet
```java
                    // Query every half second from cache to decrease waiting
                    // time because restful query is executed per second
                    Thread.sleep(QUERY_INTERVAL);
                } catch (InterruptedException e) {
                    // Ignore
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `hugegraph-hubble/hubble-be/src/main/java/org/apache/hugegraph/entity/load/LoadTask.java`
#### Snippet
```java
        while (!this.finished) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
                // pass
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.hash.HashFunction' is marked unstable with @Beta
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
             BufferedWriter writer = new BufferedWriter(ow)) {
            Set<Integer> wroteLines = new HashSet<>();
            HashFunction hashFunc = Hashing.murmur3_32();
            for (String tipsLine, dataLine; (tipsLine = reader.readLine()) != null &&
                                            (dataLine = reader.readLine()) != null; ) {
```

### UnstableApiUsage
'com.google.common.hash.Hashing' is marked unstable with @Beta
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
             BufferedWriter writer = new BufferedWriter(ow)) {
            Set<Integer> wroteLines = new HashSet<>();
            HashFunction hashFunc = Hashing.murmur3_32();
            for (String tipsLine, dataLine; (tipsLine = reader.readLine()) != null &&
                                            (dataLine = reader.readLine()) != null; ) {
```

### UnstableApiUsage
'murmur3_32()' is declared in unstable class 'com.google.common.hash.Hashing' marked with @Beta
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
             BufferedWriter writer = new BufferedWriter(ow)) {
            Set<Integer> wroteLines = new HashSet<>();
            HashFunction hashFunc = Hashing.murmur3_32();
            for (String tipsLine, dataLine; (tipsLine = reader.readLine()) != null &&
                                            (dataLine = reader.readLine()) != null; ) {
```

### UnstableApiUsage
'hashString(java.lang.CharSequence, java.nio.charset.Charset)' is declared in unstable interface 'com.google.common.hash.HashFunction' marked with @Beta
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
                 * Misjudgment may occur, but the probability is extremely low
                 */
                int hash = hashFunc.hashString(dataLine, charset).asInt();
                if (!wroteLines.contains(hash)) {
                    writer.write(tipsLine);
```

### UnstableApiUsage
'asInt()' is declared in unstable class 'com.google.common.hash.HashCode' marked with @Beta
in `hugegraph-loader/src/main/java/org/apache/hugegraph/loader/failure/FailLogger.java`
#### Snippet
```java
                 * Misjudgment may occur, but the probability is extremely low
                 */
                int hash = hashFunc.hashString(dataLine, charset).asInt();
                if (!wroteLines.contains(hash)) {
                    writer.write(tipsLine);
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'map' to 'Map\>'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
            CommonUtil.checkMapClass(mapValue, String.class, Object.class);
        }
        return (Map<String, Map<String, Object>>) map;
    }

```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'map' to 'Map\>'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
            CommonUtil.checkMapClass(mapValue, String.class, Object.class);
        }
        return (Map<String, Map<String, Object>>) map;
    }
}
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'map' to 'Map\>'
in `hugegraph-client/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
            CommonUtil.checkMapClass(mapValue, String.class, Object.class);
        }
        return (Map<String, Map<String, Object>>) map;
    }

```

