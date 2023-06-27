# incubator-hugegraph 
 
# Bad smells
I found 1412 bad smells with 63 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AutoCloseableResource | 328 | false |
| DataFlowIssue | 207 | false |
| DuplicatedCode | 185 | false |
| ConstantValue | 124 | false |
| FieldMayBeFinal | 102 | false |
| UnusedAssignment | 48 | false |
| ProtectedMemberInFinalClass | 28 | true |
| UnstableApiUsage | 27 | false |
| UnnecessaryLocalVariable | 19 | true |
| FinalStaticMethod | 16 | false |
| ConditionCoveredByFurtherCondition | 16 | false |
| JavadocLinkAsPlainText | 14 | false |
| UNUSED_IMPORT | 14 | false |
| CommentedOutCode | 13 | false |
| NullableProblems | 13 | false |
| StringBufferReplaceableByString | 11 | false |
| IgnoreResultOfCall | 11 | false |
| TrivialIf | 11 | false |
| FieldCanBeLocal | 10 | false |
| AccessStaticViaInstance | 10 | false |
| DuplicateExpressions | 9 | false |
| SwitchStatementWithConfusingDeclaration | 9 | false |
| EmptyStatementBody | 8 | false |
| OverwrittenKey | 8 | false |
| PointlessArithmeticExpression | 7 | false |
| NonFinalFieldInEnum | 7 | false |
| InnerClassMayBeStatic | 7 | true |
| DuplicateBranchesInSwitch | 6 | false |
| IntegerMultiplicationImplicitCastToLong | 6 | false |
| SlowListContainsAll | 6 | false |
| PointlessBitwiseExpression | 6 | false |
| UNCHECKED_WARNING | 6 | false |
| JavadocReference | 6 | false |
| SuspiciousMethodCalls | 6 | false |
| RedundantCast | 6 | false |
| ArraysAsListWithZeroOrOneArgument | 6 | false |
| ThrowFromFinallyBlock | 5 | false |
| JavadocDeclaration | 5 | false |
| WrapperTypeMayBePrimitive | 4 | false |
| EmptyTryBlock | 4 | false |
| StringEquality | 3 | false |
| EqualsBetweenInconvertibleTypes | 3 | false |
| NonAtomicOperationOnVolatileField | 3 | false |
| BusyWait | 3 | false |
| RedundantFileCreation | 3 | false |
| BigDecimalMethodWithoutRoundingCalled | 3 | false |
| SuspiciousSystemArraycopy | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| Deprecation | 2 | false |
| RedundantTypeArguments | 2 | false |
| RedundantMethodOverride | 2 | false |
| ListRemoveInLoop | 2 | false |
| UnnecessarySemicolon | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| DanglingJavadoc | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| CloneDeclaresCloneNotSupported | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| UnpredictableBigDecimalConstructorCall | 2 | false |
| ArrayHashCode | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| EqualsWithItself | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| UnnecessaryModifier | 1 | true |
| ConditionalBreakInInfiniteLoop | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
| RefusedBequest | 1 | false |
| UnnecessaryReturn | 1 | true |
| NegativeIntConstantInLongContext | 1 | false |
| MalformedFormatString | 1 | false |
| RedundantStringFormatCall | 1 | false |
| PointlessNullCheck | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| RedundantLengthCheck | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| ThreadWithDefaultRunMethod | 1 | false |
| UnnecessaryContinue | 1 | false |
| PointlessBooleanExpression | 1 | true |
| AssignmentToCatchBlockParameter | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Object\[kvList.size()\]'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugePrimaryKeyStrategy.java`
#### Snippet
```java

                if (kvList.size() > 0) {
                    curAddStep.configure(kvList.toArray(new Object[kvList.size()]));
                }

```

## RuleId[id=EqualsWithItself]
### EqualsWithItself
`compareTo()` called on itself
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/id/IdTest.java`
#### Snippet
```java
        });
        Assert.assertThrows(UnsupportedOperationException.class, () -> {
            id.compareTo(id);
        });
        Assert.assertThrows(UnsupportedOperationException.class, () -> {
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
            }
            long maxKey = this.maxKey();
            Double each = maxKey / count;

            List<Shard> splits = new ArrayList<>((int) count);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseMetrics.java`
#### Snippet
```java
        long fileSizeBytes = 0L;
        for (RegionMetrics region : regions) {
            Double tempValue = region.getStoreFileSize().get(Size.Unit.BYTE);
            fileSizeBytes += tempValue.longValue();
        }
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
                TableName tableName = TableName.valueOf(this.namespace, table);
                for (RegionMetrics m : admin.getRegionMetrics(rs, tableName)) {
                    Double storeFileSize = m.getStoreFileSize().get(Size.Unit.BYTE);
                    total += storeFileSize.longValue();

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
                    total += storeFileSize.longValue();

                    Double memStoreFileSize = m.getMemStoreSize().get(Size.Unit.BYTE);
                    total += memStoreFileSize.longValue();
                }
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/SchemaLabel.java`
#### Snippet
```java

    public boolean undefined() {
        return this.name() == UNDEF;
    }

```

### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
            // Escape empty String to INDEX_SYM_EMPTY (char `\u0002`)
            value = INDEX_SYM_EMPTY;
        } else if (value == INDEX_VALUE_EMPTY) {
            value = "";
        } else if (value == INDEX_VALUE_NULL) {
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
        } else if (value == INDEX_VALUE_EMPTY) {
            value = "";
        } else if (value == INDEX_VALUE_NULL) {
            value = INDEX_SYM_NULL;
        } else {
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `EMPTY` are read, but never written to
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
        public static final String END = "";

        private static final byte[] EMPTY = new byte[0];
        public static final byte[] START_BYTES = new byte[]{0x0};
        public static final byte[] END_BYTES = new byte[]{-1, -1, -1, -1,
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloLoadInfo.java`
#### Snippet
```java
        private String name;

        private State(int code, String name) {
            assert code >= 0 && code < 256;
            this.code = (byte) code;
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SubGraphTraverser.java`
#### Snippet
```java
                                            sourceInRing);
        PathSet paths = new PathSet();
        while (true) {
            paths.addAll(traverser.forward(dir));
            if (--depth <= 0 || traverser.reachLimit() ||
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`TestTask.UNIT * 1` can be replaced with 'TestTask.UNIT'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/TaskExample.java`
#### Snippet
```java
        Thread.sleep(TestTask.UNIT * 33);
        task.cancel(true);
        Thread.sleep(TestTask.UNIT * 1);
        scheduler.save(task);

```

### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        });

        long splitSize = 1 * 1024 * 1024;
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            graph.metadata(HugeType.VERTEX, "splits", splitSize, "invalid-arg");
```

### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        List<Vertex> vertices = new LinkedList<>();

        long splitSize = 1 * 1024 * 1024;
        List<Shard> splits = graph.metadata(HugeType.VERTEX, "splits",
                                            splitSize);
```

### PointlessArithmeticExpression
`1 * 1024 * 1024` can be replaced with '1024 \* 1024'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        init10Vertices();

        long splitSize = 1 * 1024 * 1024 - 1;
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            graph.metadata(HugeType.VERTEX, "splits", splitSize);
```

### PointlessArithmeticExpression
`1L * 1024L * 1024L` can be replaced with '1024L \* 1024L'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Set<Edge> edges = new HashSet<>();

        long splitSize = 1L * 1024L * 1024L;
        List<Shard> splits = graph.metadata(HugeType.EDGE_OUT, "splits",
                                            splitSize);
```

### PointlessArithmeticExpression
`1000 * 1000 * 1L` can be replaced with '1000 \* 1000'
in `hugegraph-core/src/main/java/org/apache/hugegraph/config/CoreOptions.java`
#### Snippet
```java
                    "The max cache size(items) of edge cache.",
                    rangeInt(0L, Long.MAX_VALUE),
                    (1000 * 1000 * 1L)
            );

```

### PointlessArithmeticExpression
`1 * MB` can be replaced with 'MB'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/AbstractCache.java`
#### Snippet
```java

    public static final int MB = 1024 * 1024;
    public static final int DEFAULT_SIZE = 1 * MB;
    public static final int MAX_INIT_CAP = 100 * MB;

```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
    public void testFile() {
        // read file
        try (FileInputStream fis = new FileInputStream(new File(""))) {
            // pass
        } catch (IOException ignored) {
```

### EmptyTryBlock
Empty `try` block
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
        // read file
        String pom = System.getProperty("user.dir") + "/a.groovy";
        try (FileInputStream fis = new FileInputStream(new File(pom))) {
            // pass
        } catch (IOException ignored) {
```

### EmptyTryBlock
Empty `try` block
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java

        // write file
        try (FileOutputStream fos = new FileOutputStream(new File(""))) {
            // pass
        } catch (IOException ignored) {
```

### EmptyTryBlock
Empty `try` block
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
         * then throw exception because checkLink failed
         */
        try (ServerSocket serverSocket = new ServerSocket(8200)) {
            // pass
        } catch (IOException ignored) {
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`value` is not of an array type
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/CopyUtil.java`
#### Snippet
```java
        int len = Array.getLength(value);
        Object array = Array.newInstance(valueType.getComponentType(), len);
        System.arraycopy(value, 0, array, 0, len);
        return array;
    }
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/CopyUtil.java`
#### Snippet
```java
        int len = Array.getLength(value);
        Object array = Array.newInstance(valueType.getComponentType(), len);
        System.arraycopy(value, 0, array, 0, len);
        return array;
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/Consumers.java`
#### Snippet
```java
        }
        assert this.ending;
        while (this.consume()) {
        }

```

### EmptyStatementBody
`while` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/Consumers.java`
#### Snippet
```java
        }
        assert this.ending;
        while (this.consume()){
            // ignore
        }
```

### EmptyStatementBody
`else` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
                }
                this.notifyCache(Cache.ACTION_INVALID, type, ids);
            } else {
                // Ignore other types due to not cached them
            }
```

### EmptyStatementBody
`while` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/compress/ParallelCompressStrategy.java`
#### Snippet
```java
             ZipArchiveInputStream zis = new ZipArchiveInputStream(cis)) {
            // checksum is calculated in the process
            while (zis.getNextZipEntry() != null) {
                // TODO: any better way to do the check?
            }
```

### EmptyStatementBody
`if` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TextSerializer.java`
#### Snippet
```java
        }
        // Parse system property
        else if (type.equals(writeType(HugeType.SYS_PROPERTY))) {
            // pass
        }
```

### EmptyStatementBody
`if` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        }
        // Parse system property
        else if (type == HugeType.SYS_PROPERTY.code()) {
            // pass
        }
```

### EmptyStatementBody
`if` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        if (type.isIndex()) {
            if (this.enablePartition) {
                if (type.isStringIndex()) {
                    // TODO: add string index partition
                }
```

### EmptyStatementBody
`if` statement has empty body
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                    // TODO: add string index partition
                }
                if (type.isNumericIndex()) {
                    // TODO: add numeric index partition
                }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `hugegraph-postgresql/src/main/java/org/apache/hugegraph/backend/store/postgresql/PostgresqlTable.java`
#### Snippet
```java
        protected String escapeAndWrapString(String value) {
            if (value.equals("\u0000")) {
                return "\'\'";
            }
            return PostgresqlSessions.escapeAndWrapString(value);
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `hugegraph-postgresql/src/main/java/org/apache/hugegraph/backend/store/postgresql/PostgresqlTable.java`
#### Snippet
```java
        protected String escapeAndWrapString(String value) {
            if (value.equals("\u0000")) {
                return "\'\'";
            }
            return PostgresqlSessions.escapeAndWrapString(value);
```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/comm/TriangleCountAlgorithm.java`
#### Snippet
```java

        protected static <V> Set<V> newOrderedSet() {
            return new TreeSet<>();
        }
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTable.java`
#### Snippet
```java
             * "cassandra no viable alternative at input 'like'..."
             */
            // case LIKE:
            //    return QueryBuilder.like(key, value);
            case NEQ:
```

### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-scylladb/src/main/java/org/apache/hugegraph/backend/store/scylladb/ScyllaDBMetrics.java`
#### Snippet
```java
        appendCounterMetrics(metrics, probe, this.keyspace(), this.tables(),
                             "PendingFlushes");
        //appendCounterMetrics(metrics, probe, this.keyspace(), this.tables(),
        //                     "KeyCacheHitRate");
        appendCounterMetrics(metrics, probe, this.keyspace(), this.tables(),
```

### CommentedOutCode
Commented out code (4 lines)
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                    assertMapContains(host, "bloom_filter_false_ratio");

                    //assertMapContains(host, "write_latency_hugegraph");
                    //assertMapContains(host, "read_latency_hugegraph");
                    //assertMapContains(host, "write_latency_*");
```

### CommentedOutCode
Commented out code (7 lines)
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java

        // TODO: enable after fixed rocksdb issue #8239
        /*
        session.deleteRange(TABLE, new byte[]{1, -3}, new byte[]{1, 3});
        Assert.assertThrows(BackendException.class, () -> {
```

### CommentedOutCode
Commented out code (7 lines)
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/Example1.java`
#### Snippet
```java
              .onV("author").search().by("lived").create();

        // schemaManager.getVertexLabel("author").index("byName").secondary().by("name").add();
        // schemaManager.getVertexLabel("recipe").index("byRecipe").materialized().by("name").add();
        // schemaManager.getVertexLabel("meal").index("byMeal").materialized().by("name").add();
```

### CommentedOutCode
Commented out code (7 lines)
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        // FIXME: expect to throw error here

        //        Assert.assertThrows(IllegalArgumentException.class, () -> {
        //            graph.traversal().V().has("pagerank", 0.1D).toList();
        //        }, e -> {
```

### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/comm/LouvainTraverser.java`
#### Snippet
```java
        Iterator<Vertex> vertices = this.sourceVertices(pass);

        // shuffle
        //r = r.order().by(shuffle);

```

### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        // TODO: Seems Cassandra Bug if contains null value #862
        //edges = graph.traversal().E().hasValue(3).toList();
        //Assert.assertEquals(3, edges.size());
    }
```

### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
        public static final String SERVER = "~task_server";

        //public static final String PARENT = hide("parent");
        //public static final String CHILDREN = hide("children");

```

### CommentedOutCode
Commented out code (2 lines)
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                 * but the backend driver should ensure `offset` accurately.
                 */
                // TraversalHelper.copyLabels(step, newStep, false);
                // traversal.removeStep(step);
                if (extractOnlyLimit) {
```

### CommentedOutCode
Commented out code (3 lines)
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
            for (ServerName rs : admin.getRegionServers()) {
                // NOTE: we can use getLoad() before hbase 2.0
                //ServerLoad load = admin.getClusterStatus().getLoad(rs);
                //total += load.getStorefileSizeMB() * Bytes.MB;
                //total += load.getMemStoreSizeMB() * Bytes.MB;
```

### CommentedOutCode
Commented out code (5 lines)
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/gremlin/GremlinAPI.java`
#### Snippet
```java
                         String request) {
        /* The following code is reserved for forwarding request */
        // context.getRequestDispatcher(location).forward(request, response);
        // return Response.seeOther(UriBuilder.fromUri(location).build())
        // .build();
```

### CommentedOutCode
Commented out code (3 lines)
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeFactoryAuthProxy.java`
#### Snippet
```java

        // Don't shield them because need to access by auth RPC
        //registerPrivateActions(HugeUser.class);
        //registerPrivateActions(RolePermission.class);
        //registerPrivateActions(HugeResource.class);
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java

        @Override
        public TraversalStrategies clone() {
            // CHECKSTYLE:OFF
            return this.strategies.clone();
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                    break;
                case '\n':
                    needsEscape = true;
                    break;
                case '\r':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                    break;
                case '\r':
                    needsEscape = true;
                    break;
                case '\u001a':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                    break;
                case '\u001a':
                    needsEscape = true;
                    break;
                case '\'':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                    break;
                case '\'':
                    needsEscape = true;
                    break;
                case '\\':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                    break;
                case '\\':
                    needsEscape = true;
                    break;
                default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
                break;
            case "UniformList":
                schema.propertyKey(key).valueList().ifNotExist().create();
                break;
            case "MixedList":
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `name` in enum 'State'
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloLoadInfo.java`
#### Snippet
```java

        private byte code;
        private String name;

        private State(int code, String name) {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'State'
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloLoadInfo.java`
#### Snippet
```java
        CANCELLED(5, "CANCELLED");

        private byte code;
        private String name;

```

### NonFinalFieldInEnum
Non-final field `name` in enum 'HugePermission'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugePermission.java`
#### Snippet
```java

    private byte code;
    private String name;

    static {
```

### NonFinalFieldInEnum
Non-final field `code` in enum 'HugePermission'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugePermission.java`
#### Snippet
```java
    ANY(0x7f, "any");

    private byte code;
    private String name;

```

### NonFinalFieldInEnum
Non-final field `name` in enum 'TaskStatus'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskStatus.java`
#### Snippet
```java

    private byte status;
    private String name;

    static {
```

### NonFinalFieldInEnum
Non-final field `status` in enum 'TaskStatus'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskStatus.java`
#### Snippet
```java
           TaskStatus.SUCCESS, TaskStatus.CANCELLED, TaskStatus.FAILED);

    private byte status;
    private String name;

```

### NonFinalFieldInEnum
Non-final field `name` in enum 'HugeType'
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/HugeType.java`
#### Snippet
```java

    private byte type = 0;
    private String name;

    private static final Map<String, HugeType> ALL_NAME = new HashMap<>();
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, sourceDir)`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/CompressUtilTest.java`
#### Snippet
```java
        String output = "output";
        try {
            prepareFiles(Paths.get(rootDir, sourceDir).toString());

            Checksum checksum = new CRC64();
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, sourceDir).toString()`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/CompressUtilTest.java`
#### Snippet
```java
        String output = "output";
        try {
            prepareFiles(Paths.get(rootDir, sourceDir).toString());

            Checksum checksum = new CRC64();
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, sourceDir)`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/CompressUtilTest.java`
#### Snippet
```java

            Checksum checksum = new CRC64();
            CompressUtil.compressZip(Paths.get(rootDir, sourceDir).toString(),
                                     zipFile, checksum);

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(rootDir, sourceDir).toString()`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/CompressUtilTest.java`
#### Snippet
```java

            Checksum checksum = new CRC64();
            CompressUtil.compressZip(Paths.get(rootDir, sourceDir).toString(),
                                     zipFile, checksum);

```

### DuplicateExpressions
Multiple occurrences of `Paths.get(inputDir)`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/CompressUtil.java`
#### Snippet
```java
    public static void compressZip(String inputDir, String outputFile,
                                   Checksum checksum) throws IOException {
        String rootDir = Paths.get(inputDir).toAbsolutePath().getParent().toString();
        String sourceDir = Paths.get(inputDir).getFileName().toString();
        compressZip(rootDir, sourceDir, outputFile, checksum);
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(inputDir)`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/CompressUtil.java`
#### Snippet
```java
                                   Checksum checksum) throws IOException {
        String rootDir = Paths.get(inputDir).toAbsolutePath().getParent().toString();
        String sourceDir = Paths.get(inputDir).getFileName().toString();
        compressZip(rootDir, sourceDir, outputFile, checksum);
    }
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(snapshotDir)`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/StoreSnapshotFile.java`
#### Snippet
```java
            String snapshotDir = entry.getKey();
            String diskTableKey = entry.getValue();
            String snapshotDirTar = Paths.get(snapshotDir).getFileName().toString() + TAR;
            String outputFile = Paths.get(writerPath, snapshotDirTar).toString();
            Checksum checksum = new CRC64();
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(snapshotDir)`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/StoreSnapshotFile.java`
#### Snippet
```java
                LOG.info("Prepare to compress dir '{}' to '{}'", snapshotDir, outputFile);
                long begin = System.currentTimeMillis();
                String rootDir = Paths.get(snapshotDir).toAbsolutePath().getParent().toString();
                String sourceDir = Paths.get(snapshotDir).getFileName().toString();
                CompressStrategyManager.getDefault()
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(snapshotDir)`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/StoreSnapshotFile.java`
#### Snippet
```java
                long begin = System.currentTimeMillis();
                String rootDir = Paths.get(snapshotDir).toAbsolutePath().getParent().toString();
                String sourceDir = Paths.get(snapshotDir).getFileName().toString();
                CompressStrategyManager.getDefault()
                                       .compressZip(rootDir, sourceDir, outputFile, checksum);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlUtil.java`
#### Snippet
```java
                return value;
            }
            StringBuilder buf = new StringBuilder(length + 2);
            buf.append('\'').append(value).append('\'');
            return buf.toString();
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/ResourceObject.java`
#### Snippet
```java
                       operatedStr.length() + 36;

        StringBuilder sb = new StringBuilder(capacity);
        return sb.append("Resource{graph=").append(this.graph)
                 .append(",type=").append(typeStr)
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/SchemaDefine.java`
#### Snippet
```java
            String label = Hidden.unHide(this.label());
            String name = this.name();
            StringBuilder sb = new StringBuilder(label.length() +
                                                 name.length() + 2);
            sb.append(label).append("(").append(name).append(")");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/SchemaDefine.java`
#### Snippet
```java
        public String idString() {
            String label = Hidden.unHide(this.label());
            StringBuilder sb = new StringBuilder(label.length() +
                                                 this.source().length() +
                                                 this.target().length() + 4);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/rank/PageRankAlgorithm.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("left:").append(this.left)
              .append(", right: ").append(this.right);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/Blob.java`
#### Snippet
```java
    public String toString() {
        String hex = Bytes.toHex(this.bytes);
        StringBuilder sb = new StringBuilder(6 + hex.length());
        sb.append("Blob{").append(hex).append("}");
        return sb.toString();
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendStore.java`
#### Snippet
```java

    default String olapTableName(Id id) {
        StringBuilder builder = new StringBuilder(5 + 4);
        builder.append(this.store())
               .append("_")
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendStore.java`
#### Snippet
```java

    default String olapTableName(HugeType type) {
        StringBuilder builder = new StringBuilder(7);
        builder.append(this.store())
               .append("_")
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/Condition.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.key()).append(' ');
            sb.append(this.relation.string()).append(' ');
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/Condition.java`
#### Snippet
```java
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.left).append(' ');
            sb.append(this.type().name()).append(' ');
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/cypher/CypherClient.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("CypherClient{");
        builder.append("userName='").append(userName).append('\'')
               .append(", token='").append(token).append('\'').append('}');
```

## RuleId[id=Deprecation]
### Deprecation
'write(java.io.File, java.lang.CharSequence, boolean)' is deprecated
in `hugegraph-dist/src/main/java/org/apache/hugegraph/cmd/ConfDumper.java`
#### Snippet
```java
        sb.append(EOL);
        // Write to output file
        FileUtils.write(output, sb.toString(), true);
    }
}
```

### Deprecation
'readFileToString(java.io.File)' is deprecated
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloFile.java`
#### Snippet
```java
    public String readAsString() {
        try {
            return FileUtils.readFileToString(this);
        } catch (IOException e) {
            throw new BackendException(e);
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendEntryIterator.java`
#### Snippet
```java
        @Override
        public void close() throws Exception {
            return;
        }
    }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java
    }

    protected static final CassandraBackendEntry castBackendEntry(BackendEntry entry) {
        assert entry instanceof CassandraBackendEntry : entry.getClass();
        if (!(entry instanceof CassandraBackendEntry)) {
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTable.java`
#### Snippet
```java
    }

    public static final String formatKey(HugeKeys key) {
        return key.name();
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTable.java`
#### Snippet
```java
    }

    public static final HugeKeys parseKey(String name) {
        return HugeKeys.valueOf(name.toUpperCase());
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTable.java`
#### Snippet
```java
    }

    public static final Clause formatEQ(HugeKeys key, Object value) {
        return QueryBuilder.eq(formatKey(key), value);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/BaseUnitTest.java`
#### Snippet
```java
    }

    protected static final void waitTillNext(long seconds) {
        TimeUtil.tillNextMillis(TimeUtil.timeGen() + seconds * 1000);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/BaseUnitTest.java`
#### Snippet
```java
    }

    protected static final void runWithThreads(int threads, Runnable task) {
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        List<Future<?>> futures = new ArrayList<>();
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/BackendException.java`
#### Snippet
```java
    }

    public static final void check(boolean expression, String message, Object... args)
                                   throws BackendException {
        if (!expression) {
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/AbstractCache.java`
#### Snippet
```java
    protected abstract Iterator<CacheNode<K, V>> nodes();

    protected static final long now() {
        return System.currentTimeMillis();
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendEntryIterator.java`
#### Snippet
```java
    }

    public static final void checkInterrupted() {
        if (Thread.interrupted()) {
            throw new BackendException("Interrupted, maybe it is timed out",
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
    }

    public static final String joinTableName(String prefix, String table) {
        return prefix + "_" + table.toLowerCase();
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftException.java`
#### Snippet
```java
    }

    public static final void check(boolean expression,
                                   String message, Object... args)
                                   throws RaftException {
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
    }

    public static final Id getIdValue(Object idValue) {
        return HugeElement.getIdValue(idValue);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeEdge.java`
#### Snippet
```java
    }

    public static final EdgeId getIdValue(Object idValue,
                                          boolean returnNullIfError) {
        Id id = getIdValue(idValue);
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
    }

    public static final Id getIdValue(HugeType type, Object idValue) {
        assert type.isGraph();
        Id id = getIdValue(idValue);
```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
     */
    @Watched(prefix = "element")
    public static final ElementKeys classifyKeys(Object... keyValues) {
        ElementKeys elemKeys = new ElementKeys();

```

### FinalStaticMethod
'static' method declared `final`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java

    @Watched(prefix = "element")
    public static final Object getLabelValue(Object... keyValues) {
        Object labelValue = null;
        for (int i = 0; i < keyValues.length; i = i + 2) {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
                if (il.indexType().isSearch()) {
                    Id field = il.indexField();
                    String cond = deletion.<String>getPropertyValue(field);
                    String actual = element.<String>getPropertyValue(field);
                    if (this.tx.matchSearchIndexWords(actual, cond)) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
                    Id field = il.indexField();
                    String cond = deletion.<String>getPropertyValue(field);
                    String actual = element.<String>getPropertyValue(field);
                    if (this.tx.matchSearchIndexWords(actual, cond)) {
                        /*
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/Blob.java`
#### Snippet
```java

    @Override
    public int compareTo(Blob other) {
        E.checkNotNull(other, "other blob");
        return Bytes.compare(this.bytes, other.bytes);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java

        @Override
        public int compareTo(Id o) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java

        @Override
        public int compareTo(Id other) {
            int cmp = compareType(this, other);
            if (cmp != 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java

        @Override
        public int compareTo(Id other) {
            E.checkNotNull(other, "compare id");
            int cmp = compareType(this, other);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java

        @Override
        public int compareTo(Id other) {
            int cmp = compareType(this, other);
            if (cmp != 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendEntry.java`
#### Snippet
```java

        @Override
        public int compareTo(BackendColumn other) {
            if (other == null) {
                return 1;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java

    @Override
    public void write(byte[] val, int offset, int length) {
        require(BYTE_LEN * length);
        this.buffer.put(val, offset, length);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java

        @Override
        public boolean retainAll(Collection<?> c) {
            return this.paths.retainAll(c);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java

        @Override
        public boolean containsAll(Collection<?> c) {
            return this.paths.containsAll(c);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java

        @Override
        public <T> T[] toArray(T[] a) {
            return this.paths.toArray(a);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java

        @Override
        public boolean addAll(Collection<? extends Path> c) {
            return this.paths.addAll(c);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java

        @Override
        public boolean removeAll(Collection<?> c) {
            return this.paths.removeAll(c);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java

        @Override
        public void execute(Runnable command) {
            super.execute(new ContextTask(command));
        }
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
        assert (label & 0x0fffffff) == label;
        assert target < 2L * Integer.MAX_VALUE : target;
        long value = target & 0xffffffff;
        long dir = direction == Directions.OUT ?
                   0x00000000L : 0x80000000L;
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'Id' and 'ByteBuffer'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/id/IdTest.java`
#### Snippet
```java
        Assert.assertTrue(id.equals(IdGenerator.of(object)));
        Assert.assertFalse(id.equals(IdGenerator.of(object2)));
        Assert.assertFalse(id.equals(object));

        Assert.assertThrows(UnsupportedOperationException.class, () -> {
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'HugeVertex' and 'Vertex'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
        public boolean equalsEdge(Edge edge) {
            if (!edge.label().equals(this.label) ||
                !((HugeEdge) edge).sourceVertex().equals(this.outVertex) ||
                !((HugeEdge) edge).targetVertex().equals(this.inVertex)) {
                return false;
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'HugeVertex' and 'Vertex'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
            if (!edge.label().equals(this.label) ||
                !((HugeEdge) edge).sourceVertex().equals(this.outVertex) ||
                !((HugeEdge) edge).targetVertex().equals(this.inVertex)) {
                return false;
            }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdbsst/RocksDBSstSessions.java`
#### Snippet
```java
         * Merge a record to an existing key to a table
         * For more details about merge-operator:
         *  https://github.com/facebook/rocksdb/wiki/merge-operator
         */
        @Override
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStdSessions.java`
#### Snippet
```java
         * Merge a record to an existing key to a table
         * For more details about merge-operator:
         *  https://github.com/facebook/rocksdb/wiki/merge-operator
         */
        @Override
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/StructureBasicSuite.java`
#### Snippet
```java
 * Standard structure test suite for tinkerpop graph
 *
 * @author Stephen Mallette (http://stephen.genoprime.com)
 */
public class StructureBasicSuite extends AbstractGremlinSuite {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/ProcessBasicSuite.java`
#### Snippet
```java
 * Standard process test suite for tinkerpop graph
 *
 * @author Stephen Mallette (http://stephen.genoprime.com)
 */
public class ProcessBasicSuite extends AbstractGremlinSuite {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/IKAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/yyn0210/IKAnalyzer
 */
public class IKAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/SmartCNAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://lucene.apache.org/core/8_11_2/analyzers-smartcn/index.html
 */
public class SmartCNAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/JcsegAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/lionsoul2014/jcseg
 */
public class JcsegAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/HanLPAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/hankcs/HanLP/wiki
 */
public class HanLPAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/AnsjAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/NLPchina/ansj_seg/wiki
 */
public class AnsjAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/JiebaAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/huaban/jieba-analysis
 */
public class JiebaAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/analyzer/MMSeg4JAnalyzer.java`
#### Snippet
```java

/**
 * Reference from https://github.com/chenlb/mmseg4j-core
 */
public class MMSeg4JAnalyzer implements Analyzer {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeScriptTraversal.java`
#### Snippet
```java
 * the remote end where the traversal will ultimately be processed.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public final class HugeScriptTraversal<S, E> extends DefaultTraversal<S, E> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/AdamicAdarAPI.java`
#### Snippet
```java
 * AdamicAdar is one of the prediction algorithms in graph, you can get more
 * info and definition in:
 * https://en.wikipedia.org/wiki/Adamic/Adar_index
 */
@Path("graphs/{graph}/traversers/adamicadar")
```

### JavadocLinkAsPlainText
Link specified as plain text
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/ResourceAllocationAPI.java`
#### Snippet
```java
 * ResourceAllocation is one of the prediction algorithms in graph, you can get
 * more info and definition in:
 * https://arxiv.org/pdf/0901.0553.pdf
 */
@Path("graphs/{graph}/traversers/resourceallocation")
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/SchemaApiTest.java`
#### Snippet
```java
public class SchemaApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema";

    @Test
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-core/src/main/java/org/apache/hugegraph/io/HugeGraphSONModule.java`
#### Snippet
```java
    private static final String TYPE_NAMESPACE = "hugegraph";

    private static boolean OPTIMIZE_SERIALIZE = true;

    @SuppressWarnings("rawtypes")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/FixedTimerWindowRateLimiter.java`
#### Snippet
```java
public class FixedTimerWindowRateLimiter implements RateLimiter {

    private final Timer timer;
    private final LongAdder count;
    private final int limit;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseStore.java`
#### Snippet
```java

    public static class HbaseGraphStore extends HbaseStore {
        private boolean enablePartition;
        public HbaseGraphStore(HugeConfig config, BackendStoreProvider provider,
                               String namespace, String store) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java
            private final String name;
            @JsonProperty("type")
            private final String type;
            @JsonProperty("default_value")
            private final String defaultValue;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java
        private final String method;
        @JsonProperty("parameters")
        private final List<ParamInfo> parameters;

        public APIProfile(String url, String method,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java

        @JsonProperty("url")
        private final String url;
        @JsonProperty("method")
        private final String method;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java
            private final String type;
            @JsonProperty("default_value")
            private final String defaultValue;

            public ParamInfo(String name, String type) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java

            @JsonProperty("name")
            private final String name;
            @JsonProperty("type")
            private final String type;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/ProfileAPI.java`
#### Snippet
```java
        private final String url;
        @JsonProperty("method")
        private final String method;
        @JsonProperty("parameters")
        private final List<ParamInfo> parameters;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Comparable.compareTo()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/id/IdTest.java`
#### Snippet
```java
        });
        Assert.assertThrows(UnsupportedOperationException.class, () -> {
            id.compareTo(id);
        });
        Assert.assertThrows(UnsupportedOperationException.class, () -> {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java

        // delete file
        new File("").delete();
        result = runGremlinJob("new File(\"\").delete()");
        assertError(result, "Not allowed to delete file via Gremlin");
```

### IgnoreResultOfCall
Result of `File.getAbsolutePath()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java

        // get absolute path
        new File("").getAbsolutePath();
        result = runGremlinJob("new File(\"\").getAbsolutePath()");
        assertError(result, "Not allowed to access " +
```

### IgnoreResultOfCall
Result of `System.getProperties()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
    @Test
    public void testProperties() {
        System.getProperties();
        String result = runGremlinJob("System.getProperties()");
        assertError(result,
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.LABEL, author);
            query.query((Id) vertex.id());
            graph.vertices(query).hasNext();
        }, e -> {
            Assert.assertContains("Not supported querying by id and conditions",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.LABEL, author);
            query.eq(HugeKeys.NAME, "n1");
            graph.vertices(query).hasNext();
        }, e -> {
            Assert.assertContains("Not supported querying vertices by",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.NAME, "n2");
            query.query(Condition.eq(IdGenerator.of("fake"), "n3"));
            graph.vertices(query).hasNext();
        }, e -> {
            Assert.assertContains("Can't do index query with [",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.LABEL, know);
            query.query(id);
            graph.edges(query).hasNext();
        }, e -> {
            Assert.assertContains("Not supported querying by id and conditions",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.LABEL, know);
            query.eq(HugeKeys.NAME, "n1");
            graph.edges(query).hasNext();
        }, e -> {
            Assert.assertContains("Not supported querying edges by",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
            query.eq(HugeKeys.NAME, "n2");
            query.query(Condition.eq(IdGenerator.of("fake"), "n3"));
            graph.edges(query).hasNext();
        }, e -> {
            Assert.assertContains("Can't do index query with [",
```

### IgnoreResultOfCall
Result of `Iterator.hasNext()` is ignored
in `hugegraph-api/src/main/java/org/apache/hugegraph/serializer/JsonSerializer.java`
#### Snippet
```java
                                 boolean paging) {
        // Early throw if needed
        iter.hasNext();

        // Serialize Iterator
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.hugegraph.backend.store.scylladb.ScyllaDBTablesWithMV.Edge.LABEL' accessed via instance reference
in `hugegraph-scylladb/src/main/java/org/apache/hugegraph/backend/store/scylladb/ScyllaDBTablesWithMV.java`
#### Snippet
```java
                         "  PRIMARY KEY(%s, %s)",
                         mvLabel2Edge, this.table(),
                         this.LABEL, this.prkeysNn,
                         this.LABEL, this.prKeys);
            session.execute(cql);
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.backend.store.scylladb.ScyllaDBTablesWithMV.Edge.LABEL' accessed via instance reference
in `hugegraph-scylladb/src/main/java/org/apache/hugegraph/backend/store/scylladb/ScyllaDBTablesWithMV.java`
#### Snippet
```java
                         mvLabel2Edge, this.table(),
                         this.LABEL, this.prkeysNn,
                         this.LABEL, this.prKeys);
            session.execute(cql);
        }
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
    @Test
    public void testReloadAndQueryWithProperty() throws Exception {
        HugeGraph graph = this.graph();
        SchemaManager schema = graph.schema();

```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
    @Test
    public void testReloadFromFileAndQuery() throws Exception {
        HugeGraph graph = this.graph();

        // insert vertices and edges
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java

        Query query = GraphTransaction.constructEdgesQuery(source, dir, labels);
        return this.graph().edges(query);
    }
}
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
    @Test
    public void testReloadAndQueryWithMultiEdges() throws Exception {
        HugeGraph graph = this.graph();

        // insert vertices and edges
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        }

        HugeGraph graph = this.graph();
        Whitebox.setInternalState(graph, "ramtable", this.ramtable);
    }
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
    @Test
    public void testReloadAndQueryWithBigVertex() throws Exception {
        HugeGraph graph = this.graph();

        // only enable this test when ram > 20G
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
    @Test
    public void testReloadAndQuery() throws Exception {
        HugeGraph graph = this.graph();

        // insert vertices and edges
```

### AccessStaticViaInstance
Static member 'org.apache.hugegraph.core.RamTableTest.graph()' accessed via instance reference
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        super.setup();

        HugeGraph graph = this.graph();

        Assume.assumeTrue("Ramtable is not supported by backend",
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
        @SuppressWarnings("unused")
        private void dump(String table, Scan scan) throws IOException {
            LOG.info(String.format(">>>> scan table {} with {}", table, scan));
            RowIterator iterator = this.scan(table, scan);
            while (iterator.hasNext()) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `eliminate()` is identical to its super method
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBTables.java`
#### Snippet
```java

        @Override
        public void eliminate(RocksDBSessions.Session session, BackendEntry entry) {
            assert entry.columns().size() == 1;
            super.delete(session, entry);
```

### RedundantMethodOverride
Method `buildUpdateIfAbsentParams()` is identical to its super method
in `hugegraph-postgresql/src/main/java/org/apache/hugegraph/backend/store/postgresql/PostgresqlTable.java`
#### Snippet
```java

    @Override
    protected List<?> buildUpdateIfAbsentParams(MysqlBackendEntry.Row entry) {
        return this.buildColumnsParams(entry);
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
threadCount \* times \* multiple: integer multiplication implicitly cast to long
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExampleBase.java`
#### Snippet
```java
                               throws Exception {
        // Total vertices/edges
        long n = threadCount * times * multiple;
        long vertices = (PERSON_NUM + SOFTWARE_NUM) * n;
        long edges = EDGE_NUM * n;
```

### IntegerMultiplicationImplicitCastToLong
(PERSON_NUM + SOFTWARE_NUM) \* threadCount \* times: integer multiplication implicitly cast to long
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExampleBase.java`
#### Snippet
```java
        }, threadCount);

        final long size = (PERSON_NUM + SOFTWARE_NUM) * threadCount * times;
        LOG.info("Query rate with threads: {} vedges/s, " +
                 "query total vedges {}, cost time: {}ms",
```

### IntegerMultiplicationImplicitCastToLong
(PERSON_NUM + SOFTWARE_NUM) \* threadCount \* times: integer multiplication implicitly cast to long
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExampleBase.java`
#### Snippet
```java
        }, threadCount);

        final long size = (PERSON_NUM + SOFTWARE_NUM) * threadCount * times;
        LOG.info("Query rate with threads: {} vertices/s, " +
                 "query total vertices {}, cost time: {}ms",
```

### IntegerMultiplicationImplicitCastToLong
index \<\< SHIFT: integer shift implicitly cast to long
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
        private IntMap segmentAt(int index) {
            // volatile get this.maps[index]
            long offset = (index << SHIFT) + BASE_OFFSET;
            IntMap map = (IntMap) UNSAFE.getObjectVolatile(this.maps, offset);
            return map;
```

### IntegerMultiplicationImplicitCastToLong
index \<\< SHIFT: integer shift implicitly cast to long
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntSet.java`
#### Snippet
```java
        private IntSet segmentAt(int index) {
            // volatile get this.sets[index]
            long offset = (index << SHIFT) + BASE_OFFSET;
            IntSet set = (IntSet) UNSAFE.getObjectVolatile(this.sets, offset);
            return set;
```

### IntegerMultiplicationImplicitCastToLong
this.readUInt8() \<\< 16: integer shift implicitly cast to long
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
                break;
            case 2:
                value |= this.readUInt8() << 16 | this.readUInt16();
                break;
            case 3:
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/ResultSetWrapper.java`
#### Snippet
```java
                }
            } catch (SQLException e) {
                throw new BackendException("Failed to close Statement", e);
            }
        }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/AbstractAlgorithm.java`
#### Snippet
```java
                    traversal.close();
                } catch (Exception e) {
                    throw new HugeException("Can't close traversal", e);
                }
            }
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
                    consumers.await();
                } catch (Throwable e) {
                    throw Consumers.wrapException(e);
                } finally {
                    CloseableIterator.closeIterator(vertices);
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/OltpTraverser.java`
#### Snippet
```java
                consumers.await();
            } catch (Throwable e) {
                throw Consumers.wrapException(e);
            } finally {
                executors.returnExecutor(consumers.executor());
```

### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `hugegraph-api/src/main/java/org/apache/hugegraph/serializer/JsonSerializer.java`
#### Snippet
```java
                CloseableIterator.closeIterator(iter);
            } catch (Exception e) {
                throw new HugeException("Failed to close for %s", e, label);
            }
        }
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java
             * (except for unique index)
             */
            if (this.indexType.isUnique() && oldFields.containsAll(newFields) ||
                !this.indexType.isUnique() &&
                CollectionUtil.prefixOf(oldFields, newFields)) {
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java
                    List<String> pks = this.graph()
                                           .mapPkId2Name(vl.primaryKeys());
                    E.checkArgument(!this.indexFields.containsAll(pks),
                                    "No need to build index on properties " +
                                    "%s, because they contains all primary " +
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java

        List<String> properties = this.graph().mapPkId2Name(propertyIds);
        E.checkArgument(properties.containsAll(fields),
                        "Not all index fields '%s' are contained in " +
                        "schema properties '%s'", fields, properties);
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                // Check whether primaryKey exists
                List<Id> primaryKeys = vertexLabel.primaryKeys();
                E.checkArgument(keys.containsAll(primaryKeys),
                                "The primary keys: %s of vertex label '%s' " +
                                "must be set when using '%s' id strategy",
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
        // Is queryKeys the prefix of indexFields?
        List<Id> subFields = indexFields.subList(0, queryKeys.size());
        return subFields.containsAll(queryKeys);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinaryBackendEntry.java`
#### Snippet
```java
            return false;
        }
        return this.columns.containsAll(other.columns);
    }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.type.Nameable;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/SchemaDefine.java`
#### Snippet
```java
import org.apache.hugegraph.schema.VertexLabel;
import org.apache.hugegraph.type.HugeType;
import org.apache.hugegraph.type.Nameable;
import org.apache.hugegraph.type.define.Cardinality;
import org.apache.hugegraph.type.define.DataType;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.JsonUtil;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
import org.apache.hugegraph.type.define.SerialEnum;
import org.apache.hugegraph.type.define.WriteType;
import org.apache.hugegraph.util.JsonUtil;
import org.apache.hugegraph.util.StringEncoding;

```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.StringEncoding;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
import org.apache.hugegraph.type.define.WriteType;
import org.apache.hugegraph.util.JsonUtil;
import org.apache.hugegraph.util.StringEncoding;

public class BinarySerializer extends AbstractSerializer {
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.Blob;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
import org.apache.hugegraph.util.*;
import org.apache.hugegraph.backend.serializer.BinaryBackendEntry.BinaryId;
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.KryoUtil;
import org.apache.hugegraph.util.StringEncoding;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.KryoUtil;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
import org.apache.hugegraph.backend.serializer.BinaryBackendEntry.BinaryId;
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.KryoUtil;
import org.apache.hugegraph.util.StringEncoding;

```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.StringEncoding;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.KryoUtil;
import org.apache.hugegraph.util.StringEncoding;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.type.define.Action;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBStore.java`
#### Snippet
```java
import org.apache.hugegraph.backend.serializer.TextBackendEntry;
import org.apache.hugegraph.type.HugeType;
import org.apache.hugegraph.type.define.Action;
import org.slf4j.Logger;

```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.Blob;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.JsonUtil;
import org.apache.hugegraph.util.StringEncoding;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.JsonUtil;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
import org.apache.tinkerpop.gremlin.structure.VertexProperty;
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.JsonUtil;
import org.apache.hugegraph.util.StringEncoding;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.StringEncoding;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
import org.apache.hugegraph.util.Blob;
import org.apache.hugegraph.util.JsonUtil;
import org.apache.hugegraph.util.StringEncoding;
import org.slf4j.Logger;

```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.Consumers;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
import org.apache.hugegraph.type.define.NodeRole;
import org.apache.hugegraph.util.*;
import org.apache.hugegraph.util.Consumers;
import org.apache.hugegraph.util.LockUtil;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.util.LockUtil;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
import org.apache.hugegraph.util.*;
import org.apache.hugegraph.util.Consumers;
import org.apache.hugegraph.util.LockUtil;
import org.slf4j.Logger;

```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/StringEncoding.java`
#### Snippet
```java
package org.apache.hugegraph.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
```

### UNUSED_IMPORT
Unused import `import org.apache.hugegraph.exception.ConnectionException;`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/MultiGraphsTest.java`
#### Snippet
```java
import org.apache.hugegraph.backend.store.rocksdb.RocksDBOptions;
import org.apache.hugegraph.config.CoreOptions;
import org.apache.hugegraph.exception.ConnectionException;
import org.apache.hugegraph.exception.ExistedException;
import org.apache.hugegraph.schema.EdgeLabel;
```

## RuleId[id=ListRemoveInLoop]
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraEntryIterator.java`
#### Snippet
```java
        CassandraBackendEntry e = (CassandraBackendEntry) entry;
        E.checkState(e.subRows().size() > skip, "Invalid entry to skip");
        for (long i = 0; i < skip; i++) {
            e.subRows().remove(0);
        }
```

### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlEntryIterator.java`
#### Snippet
```java
        MysqlBackendEntry e = (MysqlBackendEntry) entry;
        E.checkState(e.subRows().size() > skip, "Invalid entry to skip");
        for (long i = 0; i < skip; i++) {
            e.subRows().remove(0);
        }
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`-1L ^ (-1L << SEQUENCE_BIT)` can be replaced with '\~(-1L \<\< SEQUENCE_BIT)'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/SnowflakeIdGenerator.java`
#### Snippet
```java

        private static final long SEQUENCE_BIT = 12L;
        private static final long SEQUENCE_MASK = -1L ^ (-1L << SEQUENCE_BIT);

        private static final long WORKER_SHIFT = SEQUENCE_BIT;
```

### PointlessBitwiseExpression
`-1L ^ (-1L << WORKER_BIT)` can be replaced with '\~(-1L \<\< WORKER_BIT)'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/SnowflakeIdGenerator.java`
#### Snippet
```java

        private static final long WORKER_BIT = 5L;
        private static final long MAX_WORKER_ID = -1L ^ (-1L << WORKER_BIT);

        private static final long DC_BIT = 5L;
```

### PointlessBitwiseExpression
`-1L ^ (-1L << DC_BIT)` can be replaced with '\~(-1L \<\< DC_BIT)'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/SnowflakeIdGenerator.java`
#### Snippet
```java

        private static final long DC_BIT = 5L;
        private static final long MAX_DC_ID = -1L ^ (-1L << DC_BIT);

        private static final long SEQUENCE_BIT = 12L;
```

### PointlessBitwiseExpression
`target & 0xffffffff` can be replaced with 'target'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
        assert (label & 0x0fffffff) == label;
        assert target < 2L * Integer.MAX_VALUE : target;
        long value = target & 0xffffffff;
        long dir = direction == Directions.OUT ?
                   0x00000000L : 0x80000000L;
```

### PointlessBitwiseExpression
`(-1) & 0xffffffffL` can be replaced with '0xffffffffL'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
    public static final int UINT8_MAX = ((byte) -1) & 0xff;
    public static final int UINT16_MAX = ((short) -1) & 0xffff;
    public static final long UINT32_MAX = (-1) & 0xffffffffL;

    // NOTE: +1 to let code 0 represent length 1
```

### PointlessBitwiseExpression
`0x00 | positive | high3bits` can be replaced with 'positive \| high3bits'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
        if (~0x7ffL <= val && val <= 0x7ffL) {
            int high3bits = (int) (val >> 8) & 0x07;
            this.writeUInt8(0x00 | positive | high3bits);
            this.writeUInt8((byte) val);
        } else if (~0x7ffffL <= val && val <= 0x7ffffL) {
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/ProjectApiTest.java`
#### Snippet
```java
    @Test
    public void testCreate() {
        String project = String.format("{\"project_name\": \"test_project\"," +
                                       "\"project_description\": " +
                                       "\"this is a good project\"}");
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `hugegraph-postgresql/src/main/java/org/apache/hugegraph/backend/store/postgresql/PostgresqlSerializer.java`
#### Snippet
```java
        } else {
            Object value = index.fieldValues();
            if (value != null && "\u0000".equals(value)) {
                value = Strings.EMPTY;
            }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `count` initializer `0` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/BaseCoreTest.java`
#### Snippet
```java
        graph.tx().rollback();

        int count = 0;

        // Clear edge
```

### UnusedAssignment
Variable `sessions` initializer `null` is redundant
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
                                   String walPath, List<String> tableNames) {
        LOG.info("Opening RocksDB with data path: {}", dataPath);
        RocksDBSessions sessions = null;
        try {
            sessions = this.openSessionPool(config, dataPath,
```

### UnusedAssignment
Variable `counter` initializer `0L` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBCountersTest.java`
#### Snippet
```java
        final int MAX_TIMES = 1000;
        // Do get-increase-get-compare operation
        long counter = 0L;
        long expect = -1L;
        synchronized (this) {
```

### UnusedAssignment
The value `r.nextInt(n)` assigned to `value` is never used
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
                session.delete(TABLE, getBytes(old));

                value = r.nextInt(n); // TODO: aggregate
                value =  i + 1;
                comms.put(i, value);
```

### UnusedAssignment
Variable `vertices` initializer `null` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        init5Persons();

        List<Vertex> vertices = null;

        String[] dates = new String[]{
```

### UnusedAssignment
Variable `vertices` initializer `null` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        init5Persons();

        List<Vertex> vertices = null;

        String[] dates = new String[]{
```

### UnusedAssignment
Variable `vertex` initializer `graph.addVertex(T.label, "author", "id", 1, "name", "Tom")` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
    public void testAddVertexPropertyExisted() {
        HugeGraph graph = graph();
        Vertex vertex = graph.addVertex(T.label, "author", "id", 1,
                                        "name", "Tom");
        this.mayCommitTx();

```

### UnusedAssignment
Variable `vertex` initializer `graph.addVertex(T.label, "review", "id", 1, "contribution", ...` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
    public void testAddVertexWithPropertySet() {
        HugeGraph graph = graph();
        Vertex vertex = graph.addVertex(T.label, "review", "id", 1,
                                        "contribution", "+1",
                                        "contribution", "+2",
                                        "contribution", "+2");
        this.mayCommitTx();

```

### UnusedAssignment
The value `graph.addVertex(T.label, "review", "id", 2,
"contribution",
ImmutableSet.of("+1", "+1", "+2"))` assigned to `vertex` is never used
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
                            vertex.value("contribution"));

        vertex = graph.addVertex(T.label, "review", "id", 2,
                                 "contribution",
                                 ImmutableSet.of("+1", "+1", "+2"));
```

### UnusedAssignment
Variable `vertex` initializer `graph.addVertex(T.label, "person", "name", "Tom", "city", "H...` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
    public void testAddVertexPropertyExistedWithIndex() {
        HugeGraph graph = graph();
        Vertex vertex = graph.addVertex(T.label, "person", "name", "Tom",
                                        "city", "Hongkong", "age", 3);
        this.mayCommitTx();

```

### UnusedAssignment
Variable `vertices` initializer `null` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        GraphTraversalSource g = graph.traversal();
        List<Vertex> vertices = null;

        String[] dates = new String[]{
```

### UnusedAssignment
Variable `vertex` initializer `graph.addVertex(T.label, "review", "id", 1, "comment", "look...` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        HugeGraph graph = graph();

        Vertex vertex = graph.addVertex(T.label, "review", "id", 1,
                                        "comment", "looks good!",
                                        "comment", "LGTM!");
        this.mayCommitTx();

```

### UnusedAssignment
The value `graph.addVertex(T.label, "review", "id", 2,
"comment",
ImmutableList.of("looks good 2!", "LGTM!"))` assigned to `vertex` is never used
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals("LGTM!", props.get(1));

        vertex = graph.addVertex(T.label, "review", "id", 2,
                                 "comment",
                                 ImmutableList.of("looks good 2!", "LGTM!"));
```

### UnusedAssignment
The value `graph.addVertex(T.label, "review", "id", 3,
"comment",
new String[]{"looks good 3!", "LGTM!"})` assigned to `vertex` is never used
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals("LGTM!", props.get(1));

        vertex = graph.addVertex(T.label, "review", "id", 3,
                                 "comment",
                                 new String[]{"looks good 3!", "LGTM!"});
```

### UnusedAssignment
Variable `vertices` initializer `null` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        init5Persons();

        List<Vertex> vertices = null;

        Date[] dates = new Date[]{
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/Frequency.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/Frequency.java`
#### Snippet
```java
    MULTIPLE(2, "multiple");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/IdStrategy.java`
#### Snippet
```java
    CUSTOMIZE_UUID(5, "customize_uuid");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/IdStrategy.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/WriteType.java`
#### Snippet
```java
    OLAP_RANGE(4, "olap_range");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/WriteType.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/IndexType.java`
#### Snippet
```java
    UNIQUE(5, "unique");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/IndexType.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/HugeKeys.java`
#### Snippet
```java
    /* HugeKeys define */
    private byte code = 0;
    private String name = null;

    HugeKeys(int code, String name) {
```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/HugeKeys.java`
#### Snippet
```java

    /* HugeKeys define */
    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `type` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/HugeType.java`
#### Snippet
```java
    MAX_TYPE(255, "~");

    private byte type = 0;
    private String name;

```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/SchemaStatus.java`
#### Snippet
```java
    INVALID(6, "invalid");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/SchemaStatus.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `name` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/Directions.java`
#### Snippet
```java

    private byte code = 0;
    private String name = null;

    static {
```

### UnusedAssignment
Variable `code` initializer `0` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/define/Directions.java`
#### Snippet
```java
    IN(2, "in");

    private byte code = 0;
    private String name = null;

```

### UnusedAssignment
Variable `task` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
    public void syncWait() {
        // This method is just called by tests
        HugeTask<?> task = null;
        try {
            task = this.scheduler().waitUntilTaskCompleted(this.id());
```

### UnusedAssignment
Variable `nodeHandler` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ConfigUtil.java`
#### Snippet
```java

            ImmutableNode root = null;
            NodeHandler<ImmutableNode> nodeHandler = null;
            for (HierarchicalConfiguration<ImmutableNode> node : nodes) {
                NodeModel<ImmutableNode> nodeModel = node.getNodeModel();
```

### UnusedAssignment
The value `nodeHandler.getRootNode()` assigned to `root` is never used
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ConfigUtil.java`
#### Snippet
```java
                E.checkArgument(nodeModel != null &&
                    (nodeHandler = nodeModel.getNodeHandler()) != null &&
                    (root = nodeHandler.getRootNode()) != null,
                    "Node '%s' must contain root", node);
            }
```

### UnusedAssignment
Variable `iter` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntIterator.java`
#### Snippet
```java
        public boolean hasNext() {
            if (this.currentIter == null || !this.currentIter.hasNext()) {
                IntIterator iter = null;
                do {
                    if (this.currentIndex >= this.iters.size()) {
```

### UnusedAssignment
Variable `cache` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CachedBackendStore.java`
#### Snippet
```java

    private BackendStore store = null;
    private Cache<Id, Object> cache = null;

    public CachedBackendStore(BackendStore store) {
```

### UnusedAssignment
Variable `store` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CachedBackendStore.java`
#### Snippet
```java
public class CachedBackendStore implements BackendStore {

    private BackendStore store = null;
    private Cache<Id, Object> cache = null;

```

### UnusedAssignment
The value `null` assigned to `removed` is never used
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/RamCache.java`
#### Snippet
```java
             * may access the node (will do remove() -> enqueue())
             */
            removed = null;
        }
    }
```

### UnusedAssignment
Variable `instance` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendProviderFactory.java`
#### Snippet
```java

        assert BackendStoreProvider.class.isAssignableFrom(clazz);
        BackendStoreProvider instance = null;
        try {
            instance = clazz.newInstance();
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendProviderFactory.java`
#### Snippet
```java
    public static void register(String name, String classPath) {
        ClassLoader classLoader = BackendProviderFactory.class.getClassLoader();
        Class<?> clazz = null;
        try {
            clazz = classLoader.loadClass(classPath);
```

### UnusedAssignment
The value `null` assigned to `this.verticesLow` is never used
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java

    private void reset() {
        this.verticesLow = null;
        this.verticesHigh = null;
        this.edges = null;
```

### UnusedAssignment
The value `null` assigned to `this.verticesHigh` is never used
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
    private void reset() {
        this.verticesLow = null;
        this.verticesHigh = null;
        this.edges = null;
        this.verticesLow = new IntIntMap(this.verticesCapacityHalf);
```

### UnusedAssignment
The value `null` assigned to `this.edges` is never used
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
        this.verticesLow = null;
        this.verticesHigh = null;
        this.edges = null;
        this.verticesLow = new IntIntMap(this.verticesCapacityHalf);
        this.verticesHigh = new IntIntMap(this.verticesCapacityHalf);
```

### UnusedAssignment
Variable `targetFinishOneStep` initializer `false` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/TemplatePathsTraverser.java`
#### Snippet
```java

        protected boolean sourceFinishOneStep = false;
        protected boolean targetFinishOneStep = false;

        public Traverser(HugeTraverser traverser, TraverseStrategy strategy,
```

### UnusedAssignment
Variable `sourceFinishOneStep` initializer `false` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/TemplatePathsTraverser.java`
#### Snippet
```java
        protected int targetIndex;

        protected boolean sourceFinishOneStep = false;
        protected boolean targetFinishOneStep = false;

```

### UnusedAssignment
Variable `maxTimes` initializer `1` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/steps/RepeatEdgeStep.java`
#### Snippet
```java
public class RepeatEdgeStep extends EdgeStep {

    private int maxTimes = 1;

    public RepeatEdgeStep(HugeGraph g, Directions direction) {
```

### UnusedAssignment
Variable `output` initializer `null` is redundant
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/CompressInterceptor.java`
#### Snippet
```java

        // Replace output stream with new compression stream
        OutputStream output = null;
        if (encoding.equalsIgnoreCase(GZIP)) {
            output = new GZIPOutputStream(context.getOutputStream(), buffer);
```

### UnusedAssignment
The value changed at `appendIndex++` is never used
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/VertexAPI.java`
#### Snippet
```java
                newProps[appendIndex++] = T.id;
                // Keep value++ to avoid code trap
                newProps[appendIndex++] = this.id;
            }
            return newProps;
```

### UnusedAssignment
Variable `userPass` initializer `null` is redundant
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/WsAndHttpBasicAuthHandler.java`
#### Snippet
```java
                    return;
                }
                byte[] userPass = null;
                try {
                    final String encoded = header.substring(basic.length());
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `merged != null` is always `true`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraEntryIterator.java`
#### Snippet
```java
            } else if (merged == this.current) {
                // The next entry belongs to the current entry
                assert merged != null;
            } else {
                // New entry
```

### ConstantValue
Value `this.partitioner` is always 'null'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraShard.java`
#### Snippet
```java
    private boolean isPartitionerOpp() {
        return this.partitioner instanceof OrderPreservingPartitioner ||
               this.partitioner instanceof ByteOrderedPartitioner;
    }

```

### ConstantValue
Condition `this.sessions != null` is always `true`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java
        }

        assert this.sessions != null;
        if (!this.sessions.closed()) {
            // TODO: maybe we should throw an exception here instead of ignore
```

### ConstantValue
Condition `!(entry instanceof CassandraBackendEntry)` is always `false`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java
    protected static final CassandraBackendEntry castBackendEntry(BackendEntry entry) {
        assert entry instanceof CassandraBackendEntry : entry.getClass();
        if (!(entry instanceof CassandraBackendEntry)) {
            throw new BackendException("Cassandra store only supports CassandraBackendEntry");
        }
```

### ConstantValue
Condition `retries-- > 0` is always `true`
in `hugegraph-dist/src/main/java/org/apache/hugegraph/cmd/InitStore.java`
#### Snippet
```java
            }
            break;
        } while (retries-- > 0);
    }
}
```

### ConstantValue
Condition `END.equals(position)` is always `false` when reached
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBTable.java`
#### Snippet
```java
        @Override
        public byte[] position(String position) {
            if (START.equals(position) || END.equals(position)) {
                return null;
            }
```

### ConstantValue
Value `this.matched` is always 'false'
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStdSessions.java`
#### Snippet
```java
            if (!this.matched) {
                // Maybe closed
                return this.matched;
            }

```

### ConstantValue
Value `gender` is always 'true'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
    public void testTypeBoolean() {
        boolean gender = true;
        Assert.assertEquals(gender, property("bool", gender));

        gender = false;
```

### ConstantValue
Value `gender` is always 'true'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
    public void testTypeBoolean() {
        boolean gender = true;
        Assert.assertEquals(gender, property("bool", gender));

        gender = false;
```

### ConstantValue
Value `gender` is always 'false'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java

        gender = false;
        Assert.assertEquals(gender, property("bool", gender));

        List<Boolean> list = ImmutableList.of(true, false, true, false);
```

### ConstantValue
Value `gender` is always 'false'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java

        gender = false;
        Assert.assertEquals(gender, property("bool", gender));

        List<Boolean> list = ImmutableList.of(true, false, true, false);
```

### ConstantValue
Result of `names.size()` is always '0'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/RowLockTest.java`
#### Snippet
```java
        Set<String> names = new HashSet<>(THREADS_NUM);

        Assert.assertEquals(0, names.size());

        runWithThreads(THREADS_NUM, () -> {
```

### ConstantValue
Result of `names.size()` is always '0'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/RowLockTest.java`
#### Snippet
```java
        }

        Assert.assertEquals(0, names.size());

        runWithThreads(THREADS_NUM, () -> {
```

### ConstantValue
Condition `merged != null` is always `true`
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlEntryIterator.java`
#### Snippet
```java
                } else if (merged == this.current) {
                    // Does the next entry belongs to the current entry
                    assert merged != null;
                } else {
                    // New entry
```

### ConstantValue
Value `loadGraphWith` is always 'null'
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java
                              final String testName) {
        if (loadGraphWith == null) {
            super.loadGraphData(graph, loadGraphWith, testClass, testName);
            return;
        }
```

### ConstantValue
Condition `this.loadedGraph == null` is always `true` when reached
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
        }

        if (needRedefineSchema && this.loadedGraph == null) {
            this.clearSchema();
            this.tx().commit();
```

### ConstantValue
Condition `"person".equals(defaultVL)` is always `true`
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
            this.tx().commit();
            if (!this.autoPerson &&
                "person".equals(defaultVL) &&
                idStrategy == IdStrategy.AUTOMATIC) {
                this.autoPerson = true;
```

### ConstantValue
Condition `idStrategy == IdStrategy.AUTOMATIC` is always `true`
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
            if (!this.autoPerson &&
                "person".equals(defaultVL) &&
                idStrategy == IdStrategy.AUTOMATIC) {
                this.autoPerson = true;
            }
```

### ConstantValue
Condition `idStrategy == IdStrategy.CUSTOMIZE_STRING` is always `false`
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
            }

            this.isLastIdCustomized = idStrategy == IdStrategy.CUSTOMIZE_STRING;
        }

```

### ConstantValue
Value `value` is always 'true'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Object value = true;
        byte[] bytes = genBytes("01");
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

```

### ConstantValue
Value `value` is always 'true'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes("01");
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        value = false;
```

### ConstantValue
Value `value` is always 'false'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes = genBytes("00");
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

```

### ConstantValue
Value `value` is always 'false'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.BYTE);
```

### ConstantValue
Condition `rootCause instanceof InterruptedIOException` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeException.java`
#### Snippet
```java
        return rootCause instanceof InterruptedException ||
               rootCause instanceof TraversalInterruptedException ||
               rootCause instanceof InterruptedIOException;
    }
}
```

### ConstantValue
Value `rootCause` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeException.java`
#### Snippet
```java
        return rootCause instanceof InterruptedException ||
               rootCause instanceof TraversalInterruptedException ||
               rootCause instanceof InterruptedIOException;
    }
}
```

### ConstantValue
Value `config` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeFactory.java`
#### Snippet
```java
    public static synchronized HugeGraph open(Configuration config) {
        HugeConfig conf = config instanceof HugeConfig ?
                          (HugeConfig) config : new HugeConfig(config);
        return open(conf);
    }
```

### ConstantValue
Result of `iter.hasNext()` is always 'true'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/Example1.java`
#### Snippet
```java
            Iterator<Vertex> iter = graph.vertices(q);
            assert iter.hasNext();
            LOG.info(">>>> queryVertices(age): {}", iter.hasNext());
            while (iter.hasNext()) {
                LOG.info(">>>> queryVertices(age): {}", iter.next());
```

### ConstantValue
Result of `edges2.hasNext()` is always 'true'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/Example1.java`
#### Snippet
```java
        Iterator<Edge> edges2 = graph.edges(q);
        assert edges2.hasNext();
        LOG.info(">>>> queryEdges(id-condition): {}", edges2.hasNext());
        while (edges2.hasNext()) {
            LOG.info(">>>> queryEdges(id-condition): {}", edges2.next());
```

### ConstantValue
Result of `edges3.hasNext()` is always 'true'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/Example1.java`
#### Snippet
```java
            Iterator<Edge> edges3 = graph.edges(q);
            assert edges3.hasNext();
            LOG.info(">>>> queryEdges(contribution): {}", edges3.hasNext());
            while (edges3.hasNext()) {
                LOG.info(">>>> queryEdges(contribution): {}", edges3.next());
```

### ConstantValue
Condition `topN != NO_LIMIT` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/cent/AbstractCentAlgorithm.java`
#### Snippet
```java
                t = t.order(Scope.local).by(Column.values, Order.desc);
                if (topN > 0L) {
                    assert topN != NO_LIMIT;
                    t = t.limit(Scope.local, topN);
                }
```

### ConstantValue
Condition `vertex != source` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/comm/TriangleCountAlgorithm.java`
#### Snippet
```java

                if (vertex != null) {
                    assert vertex != source;
                    /*
                     * Find graph mode like this:
```

### ConstantValue
Condition `this != NONE` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/ResourceType.java`
#### Snippet
```java
        switch (required) {
            case NONE:
                return this != NONE;
            default:
                break;
```

### ConstantValue
Value `allExist` is always 'true'
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/comm/LouvainTraverser.java`
#### Snippet
```java
        boolean allExist = actual.floatValue() == expected.floatValue();
        assert allExist : actual + "!=" + expected;
        return allExist;
    }

```

### ConstantValue
Result of `i * TX_BATCH` is always '0'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        for (int i = 0; i < txCap / TX_BATCH; i++) {
            for (int j = 0; j < TX_BATCH; j++) {
                int time = i * TX_BATCH + j;
                guido.addEdge("write", java1, "time", "time-" + time);
            }
```

### ConstantValue
Value `cancelled` is always 'false'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
        boolean cancelled = super.cancel(mayInterruptIfRunning);
        if (!cancelled) {
            return cancelled;
        }

```

### ConstantValue
Condition `debugTest` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
         */
        boolean debugTest = false;
        if (debugTest && !task.success()) {
            throw new HugeException("Task '%s' is failed with error: %s",
                                    task.id(), task.result());
```

### ConstantValue
Condition `debugTest && !task.success()` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
         */
        boolean debugTest = false;
        if (debugTest && !task.success()) {
            throw new HugeException("Task '%s' is failed with error: %s",
                                    task.id(), task.result());
```

### ConstantValue
Condition `callable != null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
        E.checkArgument(id.number(), "Invalid task id type, it must be number");

        assert callable != null;
        this.callable = callable;
        this.type = null;
```

### ConstantValue
Condition `oldV != NULL_VALUE` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
                    return false;
                }
                assert oldV != NULL_VALUE;
                if (UNSAFE.compareAndSwapInt(this.values, offset, oldV, newV)) {
                    this.size.decrementAndGet();
```

### ConstantValue
Condition `value == NULL_VALUE` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
        public boolean put(int key, int value) {
            assert value != NULL_VALUE : "put value can't be " + NULL_VALUE;
            if (value == NULL_VALUE) {
                return false;
            }
```

### ConstantValue
Condition `oldV == NULL_VALUE` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            }
            if (UNSAFE.compareAndSwapInt(this.values, offset, oldV, newV)) {
                assert oldV == NULL_VALUE;
                this.size.incrementAndGet();
                this.indexBlocksSet.add(key >>> this.indexBlockSizeShift);
```

### ConstantValue
Condition `idParts.length == 5` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/EdgeId.java`
#### Snippet
```java
                                  sortValues, otherVertexId);
            } else {
                assert idParts.length == 5;
                Id ownerVertexId = IdUtil.readString(idParts[0]);
                HugeType direction = HugeType.fromString(idParts[1]);
```

### ConstantValue
Condition `remaining == Query.NO_LIMIT` is always `false` when reached
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/QueryList.java`
#### Snippet
```java
                assert ((BatchIdHolder) holder).hasNext();
                long remaining = bindQuery.remaining();
                assert remaining >= 0L || remaining == Query.NO_LIMIT;
                if (remaining > this.batchSize || remaining == Query.NO_LIMIT) {
                    /*
```

### ConstantValue
Value `success` is always 'true'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/OffheapCache.java`
#### Snippet
```java
        }
        assert success;
        return success;
    }

```

### ConstantValue
Condition `prev == node.prev` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/RamCache.java`
#### Snippet
```java
                    node.next.prev = node.prev;

                    assert prev == node.prev : prev.key() + "!=" + node.prev;

                    // Clear the links of `node`
```

### ConstantValue
Condition `this.head.next == this.rear` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/RamCache.java`
#### Snippet
```java
            this.rear.next = this.empty;

            assert this.head.next == this.rear;
            assert this.rear.prev == this.head;
        }
```

### ConstantValue
Condition `this.rear.prev == this.head` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/RamCache.java`
#### Snippet
```java

            assert this.head.next == this.rear;
            assert this.rear.prev == this.head;
        }

```

### ConstantValue
Condition `this.rear.prev == last` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/RamCache.java`
#### Snippet
```java
                    // Build the link between `node` and the `rear`
                    node.next = this.rear;
                    assert this.rear.prev == last : this.rear.prev;
                    this.rear.prev = node;

```

### ConstantValue
Condition `limit == NO_LIMIT` is always `false` when reached
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/Query.java`
#### Snippet
```java

    public void limit(long limit) {
        E.checkArgument(limit >= 0L || limit == NO_LIMIT,
                        "Invalid limit %s", limit);
        this.limit = limit;
```

### ConstantValue
Condition `this.limit() <= Query.NO_LIMIT` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/Query.java`
#### Snippet
```java
        } else {
            // Keep the origin limit
            assert this.limit() <= Query.NO_LIMIT;
        }
        return this.limit;
```

### ConstantValue
Condition `sessionCount > 0` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendSessionPool.java`
#### Snippet
```java
        }

        assert sessionCount > 0 : sessionCount;
        BackendSession session = this.threadLocalSession.get();
        if (session == null) {
```

### ConstantValue
Condition `this.startKey.length == this.endKey.length` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
                    endChanged = true;
                } else {
                    assert this.startKey.length == this.endKey.length;
                    length = this.startKey.length;
                    start = this.startKey;
```

### ConstantValue
Condition `count > 1` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
                }

                assert count > 1;
                byte[] each = align(new BigInteger(1, subtract(end, start))
                                        .divide(BigInteger.valueOf(count))
```

### ConstantValue
Condition `!checkMustExist` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                              "Vertex '%s' does not exist", id);
                } else if (adjacentVertex) {
                    assert !checkMustExist;
                    // Return undefined if adjacentVertex but !checkMustExist
                    vertex = HugeVertex.undefined(this.graph(), id);
```

### ConstantValue
Condition `vertex == null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                } else {
                    // Return null
                    assert vertex == null;
                }
            }
```

### ConstantValue
Condition `edgeLabels.length == 0` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                                     Arrays.asList(edgeLabels)));
        } else {
            assert edgeLabels.length == 0;
        }

```

### ConstantValue
Condition `!fallback` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
            } else if (!isIndexQuery || !isConditionQuery) {
                // It's a sysprop-query, let parent tx do it
                assert !fallback;
                result = super.queryNumber(q);
            } else {
```

### ConstantValue
Condition `query instanceof ConditionQuery` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                                "The %s operator on index is not supported now",
                                aggregate.func().string());
                assert query instanceof ConditionQuery;
                OptimizedType optimized = ((ConditionQuery) query).optimized();
                if (this.optimizeAggrByIndex && optimized == OptimizedType.INDEX) {
```

### ConstantValue
Condition `!fallback` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                    result = q.idsSize();
                } else {
                    assert !fallback;
                    fallback = true;
                    result = null;
```

### ConstantValue
Condition `result == null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
            // Can't be optimized, then do fallback
            if (fallback) {
                assert result == null;
                assert q.resultType().isVertex() || q.resultType().isEdge();
                // Reset aggregate to fallback and scan
```

### ConstantValue
Condition `dedupEdge` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
         */
        boolean dedupEdge = false;
        if (dedupEdge) {
            Set<Id> returnedEdges = new HashSet<>();
            results = new FilterIterator<>(results, edge -> {
```

### ConstantValue
Condition `start != NULL` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
        }
        int end = this.vertexAdjPosition(owner + 1);
        assert start != NULL;
        if (end < NULL) {
            // The next vertex does not exist edges
```

### ConstantValue
Condition `concurrent` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
        // switch concurrent loading here
        boolean concurrent = true;
        if (concurrent) {
            try (LoadTraverser traverser = new LoadTraverser()) {
                traverser.load(vertices);
```

### ConstantValue
Condition `otherV >= 0L` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
            long value = RamTable.this.edges.get(this.current++);
            long otherV = value >>> 32;
            assert otherV >= 0L : otherV;
            Directions actualDir = (value & 0x80000000L) == 0L ?
                                   Directions.OUT : Directions.IN;
```

### ConstantValue
Condition `label >= 0` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/ram/RamTable.java`
#### Snippet
```java
                                   Directions.OUT : Directions.IN;
            int label = (int) value & 0x7fffffff;
            assert label >= 0;

            if (this.dir != actualDir && this.dir != Directions.BOTH) {
```

### ConstantValue
Condition `this.context != null` is always `true` when reached
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStoreProvider.java`
#### Snippet
```java
    @Override
    public boolean initialized() {
        return this.provider.initialized() && this.context != null;
    }

```

### ConstantValue
Condition `this.context == null` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStoreProvider.java`
#### Snippet
```java

    private RaftContext context() {
        if (this.context == null) {
            E.checkState(false, "Please ensure init raft context");
        }
```

### ConstantValue
Condition `this.context != null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStoreProvider.java`
#### Snippet
```java
    public void close() {
        this.provider.close();
        if (this.context != null) {
            this.context.close();
        }
```

### ConstantValue
Condition `entries instanceof Metadatable` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
                return new PageIds(ids, PageState.EMPTY);
            }
            E.checkState(entries instanceof Metadatable,
                         "The entries must be Metadatable when query " +
                         "in paging, but got '%s'",
```

### ConstantValue
Condition `ids.size() < this.indexIntersectThresh` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
                query.optimized(OptimizedType.INDEX_FILTER);
            } else if (filtering) {
                assert ids.size() < this.indexIntersectThresh;
                resultHolder = holder;
                this.storeSelectedIndexField(indexLabel, query);
```

### ConstantValue
Condition `this.current != null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinaryEntryIterator.java`
#### Snippet
```java
            } else if (merged == this.current) {
                // The next entry belongs to the current entry
                assert this.current != null;
                if (this.sizeOf(this.current) >= INLINE_BATCH_SIZE) {
                    break;
```

### ConstantValue
Condition `count > limit` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java

            // Drop edges that are over-fetched
            assert count > limit;
            assert last != null;
            int head = (int) (limit + last.columnsSize() - count);
```

### ConstantValue
Condition `count > offset` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java

            // Collect edges that are over-skipped
            assert count > offset;
            assert last != null;
            int remaining = (int) (count - offset);
```

### ConstantValue
Condition `leading != 0x80` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
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
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
        int value = leading & 0x7f;
        if (leading >= 0) {
            assert (leading & 0x80) == 0;
            return value;
        }
```

### ConstantValue
Condition `leading != 0x80` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
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
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
        long value = leading & 0x7fL;
        if (leading >= 0) {
            assert (leading & 0x80) == 0;
            return value;
        }
```

### ConstantValue
Condition `queryEdge` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepByBatch.java`
#### Snippet
```java
            this.iterator = (Iterator<E>) this.vertices(traversers);
        } else {
            assert queryEdge;
            this.iterator = (Iterator<E>) this.edges(traversers);
        }
```

### ConstantValue
Condition `this.id == null` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
            name = parts[1];
        } else {
            assert this.id == null;
            List<Object> propValues = this.primaryValues();
            E.checkState(!propValues.isEmpty(),
```

### ConstantValue
Condition `prop instanceof VertexProperty` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
                    continue;
                }
                assert prop instanceof VertexProperty;
                props.add((VertexProperty<V>) prop);
            }
```

### ConstantValue
Value `id` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
        }

        HugeEdge edge = new HugeEdge(this, id, edgeLabel, vertex);

        // Set properties
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
        do {
            if (!(step instanceof CountGlobalStep ||
                  step instanceof GraphStep ||
                  step instanceof IdentityStep ||
                  step instanceof NoOpBarrierStep ||
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
            if (!(step instanceof CountGlobalStep ||
                  step instanceof GraphStep ||
                  step instanceof IdentityStep ||
                  step instanceof NoOpBarrierStep ||
                  step instanceof CollectingBarrierStep) ||
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
                  step instanceof GraphStep ||
                  step instanceof IdentityStep ||
                  step instanceof NoOpBarrierStep ||
                  step instanceof CollectingBarrierStep) ||
                 (step instanceof TraversalParent &&
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
                  step instanceof IdentityStep ||
                  step instanceof NoOpBarrierStep ||
                  step instanceof CollectingBarrierStep) ||
                 (step instanceof TraversalParent &&
                  TraversalHelper.anyStepRecursively(s -> {
```

### ConstantValue
Value `s` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
                  TraversalHelper.anyStepRecursively(s -> {
                      return s instanceof SideEffectStep ||
                             s instanceof AggregateGlobalStep ||
                             s instanceof AggregateLocalStep;
                  }, (TraversalParent) step))) {
```

### ConstantValue
Value `s` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
                      return s instanceof SideEffectStep ||
                             s instanceof AggregateGlobalStep ||
                             s instanceof AggregateLocalStep;
                  }, (TraversalParent) step))) {
                return;
```

### ConstantValue
Condition `graphStep == null` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
        } while (step != null);

        if (graphStep == null) {
            return;
        }
```

### ConstantValue
Condition `queryEdge` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStep.java`
#### Snippet
```java
            this.iterator = (Iterator<E>) this.vertices(traverser);
        } else {
            assert queryEdge;
            this.iterator = (Iterator<E>) this.edges(traverser);
        }
```

### ConstantValue
Value `keyMinEq` is always 'true'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            increaseOne(max.asBytes());
        }
        return new IdRangeQuery(query, start, keyMinEq, max, keyMaxEq);
    }

```

### ConstantValue
Value `keyMaxEq` is always 'false'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            increaseOne(max.asBytes());
        }
        return new IdRangeQuery(query, start, keyMinEq, max, keyMaxEq);
    }

```

### ConstantValue
Condition `!(key instanceof T)` is always `true` when reached
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
            Object val = keyValues[i + 1];

            if (!(key instanceof String) && !(key instanceof T)) {
                throw Element.Exceptions.providedKeyValuesMustHaveALegalKeyOnEvenIndices();
            }
```

### ConstantValue
Condition `idValue instanceof Element` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
            // Id itself
            return (Id) idValue;
        } else if (idValue instanceof Element) {
            // Element
            return (Id) ((Element) idValue).id();
```

### ConstantValue
Condition `sameLayerTransfer` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/NeighborRankTraverser.java`
#### Snippet
```java

            Ranks newLayerRanks;
            if (sameLayerTransfer) {
                // First contribute to last layer, then pass to the new layer
                this.contributeLastLayer(sameLayerIncrRanks, lastLayerRanks);
```

### ConstantValue
Condition `vertices.size() == otherVertices.size()` is always `true`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SubGraphTraverser.java`
#### Snippet
```java
                return false;
            }
            assert vertices.size() == otherVertices.size();
            for (int i = 0, size = vertices.size(); i < size; i++) {
                int j = size - i - 1;
```

### ConstantValue
Condition `propertiesStep != null && step instanceof ReducingBarrierStep` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                    propertiesStep = propStep;
                }
            } else if (propertiesStep != null &&
                       step instanceof ReducingBarrierStep) {
                Aggregate.AggregateFunc aggregateFunc;
                if (step instanceof CountGlobalStep) {
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                }
            } else if (propertiesStep != null &&
                       step instanceof ReducingBarrierStep) {
                Aggregate.AggregateFunc aggregateFunc;
                if (step instanceof CountGlobalStep) {
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
        } while (step instanceof FilterStep ||
                 step instanceof PropertiesStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } while (step instanceof FilterStep ||
                 step instanceof PropertiesStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                 step instanceof PropertiesStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }

```

### ConstantValue
Condition `bp instanceof Condition.RelationType` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } else if (bp instanceof Compare) {
            condition = convCompare2Relation(graph, type, has);
        } else if (bp instanceof Condition.RelationType) {
            condition = convRelationType2Relation(graph, type, has);
        } else if (bp instanceof Contains) {
```

### ConstantValue
Value `bp` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } else if (bp instanceof Compare) {
            condition = convCompare2Relation(graph, type, has);
        } else if (bp instanceof Condition.RelationType) {
            condition = convRelationType2Relation(graph, type, has);
        } else if (bp instanceof Contains) {
```

### ConstantValue
Condition `bp instanceof Contains` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } else if (bp instanceof Condition.RelationType) {
            condition = convRelationType2Relation(graph, type, has);
        } else if (bp instanceof Contains) {
            condition = convIn2Relation(graph, type, has);
        } else if (p instanceof AndP) {
```

### ConstantValue
Value `bp` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } else if (bp instanceof Condition.RelationType) {
            condition = convRelationType2Relation(graph, type, has);
        } else if (bp instanceof Contains) {
            condition = convIn2Relation(graph, type, has);
        } else if (p instanceof AndP) {
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
        } while (step instanceof CountGlobalStep ||
                 step instanceof FilterStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } while (step instanceof CountGlobalStep ||
                 step instanceof FilterStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                 step instanceof FilterStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }

```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
        } while (step instanceof RangeGlobalStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        } while (step instanceof RangeGlobalStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
    }

```

### ConstantValue
Condition `parentGraph.filter(g -> !(g instanceof EmptyGraph)).isPresent()` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                                                                      .asAdmin()
                                                                      .getGraph();
            if (parentGraph.filter(g -> !(g instanceof EmptyGraph)).isPresent()) {
                traversal.setGraph(parentGraph.get());
            }
```

### ConstantValue
Condition `!(g instanceof EmptyGraph)` is always `false`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                                                                      .asAdmin()
                                                                      .getGraph();
            if (parentGraph.filter(g -> !(g instanceof EmptyGraph)).isPresent()) {
                traversal.setGraph(parentGraph.get());
            }
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
            step = step.getNextStep();
        } while (step instanceof HasStep || step instanceof NoOpBarrierStep);
    }

```

### ConstantValue
Value `p` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                collectPredicates(results, ((ConnectiveP) p).getPredicates());
            } else {
                results.add((P<Object>) p);
            }
        }
```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                traversal.removeStep(step);
            }
        } while (step instanceof HasStep || step instanceof NoOpBarrierStep);
    }

```

### ConstantValue
Value `step` is always 'null'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            step = step.getNextStep();
        } while (step instanceof OrderGlobalStep ||
                 step instanceof IdentityStep);
    }

```

### ConstantValue
Condition `END.equals(position)` is always `false` when reached
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        @Override
        public byte[] position(String position) {
            if (START.equals(position) || END.equals(position)) {
                return null;
            }
```

### ConstantValue
Condition `this.sessions != null` is always `true`
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseStore.java`
#### Snippet
```java
        }

        assert this.sessions != null;
        if (!this.sessions.closed()) {
            LOG.debug("Store {} has been opened before", this.store);
```

### ConstantValue
Result of `map.size()` is always '0'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/VertexAPI.java`
#### Snippet
```java
        Map<Id, JsonVertex> map = new HashMap<>(req.jsonVertices.size());

        return this.commit(config, g, map.size(), () -> {
            /*
             * 1.Put all newVertices' properties into map (combine first)
```

### ConstantValue
Result of `map.size()` is always '0'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/EdgeAPI.java`
#### Snippet
```java
                    req.checkVertex ? EdgeAPI::getVertex : EdgeAPI::newVertex;

        return this.commit(config, g, map.size(), () -> {
            // 1.Put all newEdges' properties into map (combine first)
            req.jsonEdges.forEach(newEdge -> {
```

### ConstantValue
Condition `request.limit != Query.NO_LIMIT` is always `true`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/KoutAPI.java`
#### Snippet
```java

        long size = results.size();
        if (request.limit != Query.NO_LIMIT && size > request.limit) {
            size = request.limit;
        }
```

### ConstantValue
Condition `request.limit != Query.NO_LIMIT` is always `true`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/KneighborAPI.java`
#### Snippet
```java

        long size = results.size();
        if (request.limit != Query.NO_LIMIT && size > request.limit) {
            size = request.limit;
        }
```

### ConstantValue
Condition `this.requireAuthentication() && !(graph instanceof HugeGraphAuthProxy)` is always `false`
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java
                 name, graphConfPath);

        if (this.requireAuthentication() &&
            !(graph instanceof HugeGraphAuthProxy)) {
            LOG.warn("You may need to support access control for '{}' with {}",
                     graphConfPath, HugeFactoryAuthProxy.GRAPH_FACTORY);
```

### ConstantValue
Condition `!(graph instanceof HugeGraphAuthProxy)` is always `false` when reached
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java

        if (this.requireAuthentication() &&
            !(graph instanceof HugeGraphAuthProxy)) {
            LOG.warn("You may need to support access control for '{}' with {}",
                     graphConfPath, HugeFactoryAuthProxy.GRAPH_FACTORY);
```

### ConstantValue
Condition `iter instanceof GraphTraversal` is always `true`
in `hugegraph-api/src/main/java/org/apache/hugegraph/serializer/JsonSerializer.java`
#### Snippet
```java
            if (paging) {
                String page;
                if (iter instanceof GraphTraversal<?, ?>) {
                    page = TraversalUtil.page((GraphTraversal<?, ?>) iter);
                } else if (iter instanceof Metadatable) {
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `id`
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
            List<Object> kvs = new ArrayList<>(Arrays.asList(keyValues));
            kvs.add(T.id);
            kvs.add(String.valueOf(id++));
            keyValues = kvs.toArray();
        }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `retries`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java

    public void retry() {
        ++this.retries;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `state`
in `hugegraph-core/src/main/java/org/apache/hugegraph/masterelection/StandardRoleElectionStateMachine.java`
#### Snippet
```java
            try {
                RoleState pre = this.state;
                this.state = state.transform(context);
                LOG.trace("server {} epoch {} role state change {} to {}",
                          context.node(), context.epoch(), pre.getClass().getSimpleName(),
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with '!stream.findAny().isPresent()'
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
                    // Delete empty snapshot parent directory
                    Path parentPath = Paths.get(snapshotPath).toAbsolutePath().getParent();
                    if (Files.list(parentPath).count() == 0) {
                        FileUtils.deleteDirectory(parentPath.toFile());
                    }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'reduce(T, T)' as a member of raw type 'org.apache.hugegraph.task.EphemeralJobQueue.Reduce'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/EphemeralJobQueue.java`
#### Snippet
```java
                Object obj = job.call();
                if (job instanceof Reduce) {
                    result = ((Reduce) job).reduce(result, obj);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
                                     .toList();
        Assert.assertEquals(3, vertices.size());
        Assert.assertEquals(2, new HashSet<>(vertices).size());
        Assert.assertTrue(vertices.contains(james));
        Assert.assertTrue(vertices.contains(jeff));
```

### UNCHECKED_WARNING
Unchecked call to 'HashSet(Collection)' as a member of raw type 'java.util.HashSet'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
                        .toList();
        Assert.assertEquals(4, vertices.size());
        Assert.assertEquals(2, new HashSet<>(vertices).size());
        Assert.assertTrue(vertices.contains(james));
        Assert.assertTrue(vertices.contains(louise));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        return new BatchMapperIterator<>(this.batchSize, edges, batchEdges -> {
            List<Id> vertexIds = new ArrayList<>(batchEdges.size());
            for (Edge edge : batchEdges) {
                vertexIds.add(((HugeEdge) edge).otherVertex().id());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/cypher/CypherModel.java`
#### Snippet
```java
    private static class Result {
        public List<Object> data;
        public Map<String, Object> meta = Collections.EMPTY_MAP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/cypher/CypherModel.java`
#### Snippet
```java
        public String message = "";
        public int code;
        public Map<String, Object> attributes = Collections.EMPTY_MAP;
    }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloFile.java`
#### Snippet
```java
            }
            String[] fileNames = tableDir.list();
            if (fileNames == null || fileNames.length == 0) {
                continue;
            }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `StringSerializer`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/StringEncoding.java`
#### Snippet
```java
    private static final Base64.Decoder BASE64_DECODER = Base64.getDecoder();

    /** Similar to {@link StringSerializer} */
    public static int writeAsciiString(byte[] array, int offset, String value) {
        E.checkArgument(CharMatcher.ascii().matchesAllOf(value),
```

### JavadocReference
Cannot resolve symbol `Traversal`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeScriptTraversal.java`
#### Snippet
```java
/**
 * ScriptTraversal encapsulates a {@link ScriptEngine} and a script which is
 * compiled into a {@link Traversal} at {@link Admin#applyStrategies()}.
 *
 * This is useful for serializing traversals as the compilation can happen on
```

### JavadocReference
Cannot resolve symbol `Admin`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeScriptTraversal.java`
#### Snippet
```java
/**
 * ScriptTraversal encapsulates a {@link ScriptEngine} and a script which is
 * compiled into a {@link Traversal} at {@link Admin#applyStrategies()}.
 *
 * This is useful for serializing traversals as the compilation can happen on
```

### JavadocReference
Cannot resolve symbol `applyStrategies()`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeScriptTraversal.java`
#### Snippet
```java
/**
 * ScriptTraversal encapsulates a {@link ScriptEngine} and a script which is
 * compiled into a {@link Traversal} at {@link Admin#applyStrategies()}.
 *
 * This is useful for serializing traversals as the compilation can happen on
```

### JavadocReference
Cannot resolve symbol `OpProcessor`
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherOpProcessor.java`
#### Snippet
```java
 * </p>
 *
 * {@link OpProcessor} implementation for processing Cypher {@link RequestMessage}s:
 * <pre>
 * {
```

### JavadocReference
Cannot resolve symbol `RequestMessage`
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherOpProcessor.java`
#### Snippet
```java
 * </p>
 *
 * {@link OpProcessor} implementation for processing Cypher {@link RequestMessage}s:
 * <pre>
 * {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/Consumers.java`
#### Snippet
```java
                this.queue.put(v);
            } catch (InterruptedException e) {
                LOG.warn("Interrupted", e);;
            }
        }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/Condition.java`
#### Snippet
```java
        RELATION,
        AND,
        OR;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `column` may produce `NullPointerException`
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTables.java`
#### Snippet
```java
            long maxSize = BackendEntryIterator.INLINE_BATCH_SIZE;
            if (current != null && current.subRows().size() < maxSize) {
                Object nextVertexId = next.column(HugeKeys.OWNER_VERTEX);
                if (current.id().equals(IdGenerator.of(nextVertexId))) {
                    current.subRow(next.row());
```

### DataFlowIssue
Argument `next` might be null
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTables.java`
#### Snippet
```java
            }

            return this.wrapByVertex(next);
        }

```

### DataFlowIssue
Method invocation `column` may produce `NullPointerException`
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
            if (current != null && current.subRows().size() < maxSize) {
                Id nextVertexId = IdGenerator.of(
                                  next.<String>column(HugeKeys.OWNER_VERTEX));
                if (current.id().equals(nextVertexId)) {
                    current.subRow(next.row());
```

### DataFlowIssue
Argument `next` might be null
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
            }

            return this.wrapByVertex(next);
        }

```

### DataFlowIssue
Method invocation `row` may produce `NullPointerException`
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
                String nextId = this.entryId(next);
                if (currentId.equals(nextId)) {
                    current.subRow(next.row());
                    return current;
                }
```

### DataFlowIssue
Method invocation `asBytes` may produce `NullPointerException`
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBTables.java`
#### Snippet
```java

            E.checkArgumentNotNull(min, "Range index begin key is missing");
            byte[] begin = min.asBytes();
            if (!minEq) {
                BinarySerializer.increaseOne(begin);
```

### DataFlowIssue
Method invocation `asBytes` may produce `NullPointerException`
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBTables.java`
#### Snippet
```java
            if (max == null) {
                E.checkArgumentNotNull(prefix, "Range index prefix is missing");
                return session.scan(this.table(), begin, prefix.asBytes(),
                                    RocksDBSessions.Session.SCAN_PREFIX_END);
            } else {
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java

        Assert.assertTrue(value instanceof Map);
        Map<?, ?> graph = (Map<?, ?>) value;
        assertMapContains(graph, "backend");
        assertMapContains(graph, "nodes");
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
        assertMapContains(graph, "backend");
        assertMapContains(graph, "nodes");
        String backend = (String) graph.get("backend");
        int nodes = (Integer) graph.get("nodes");
        switch (backend) {
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                                      key, value),
                                      value instanceof Map);
                    host = (Map<?, ?>) value;
                    assertMapContains(host, "mem_max");
                    assertMapContains(host, "mem_committed");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                                      key, value),
                                      value instanceof Map);
                    host = (Map<?, ?>) value;
                    assertMapContains(host, "mem_max");
                    assertMapContains(host, "mem_committed");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                                      key, value),
                                      value instanceof Map);
                    Map<?, ?> regionServer = (Map<?, ?>) value;
                    assertMapContains(regionServer, "mem_max");
                    assertMapContains(regionServer, "mem_used");
```

### DataFlowIssue
Method invocation `epoch` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RoleElectionStateMachineTest.java`
#### Snippet
```java
                    }

                    Assert.assertEquals(value.epoch(), copy.epoch());
                    if (Objects.equals(value.node(), copy.node()) &&
                        value.clock() <= copy.clock()) {
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/Utils.java`
#### Snippet
```java
        try {
            confPath = Utils.class.getClassLoader()
                            .getResource(confPath).getPath();
        } catch (Exception ignored) {
            // ignored Exception
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/Utils.java`
#### Snippet
```java
    public static PropertiesConfiguration getConf() {
        String confFile = Utils.class.getClassLoader()
                                     .getResource(CONF_PATH).getPath();
        File file = new File(confFile);
        E.checkArgument(file.exists() && file.isFile() && file.canRead(),
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java
                        "Can't find tests filter '%s' in resource directory",
                        filter);
        File file = new File(blackList.getPath());
        E.checkArgument(
                file.exists() && file.isFile() && file.canRead(),
```

### DataFlowIssue
The call to 'assumeTrue' always fails, according to its method contracts
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
    @Test
    public void testMergeWithStringList() throws RocksDBException {
        Assume.assumeTrue("Not support string append now", false);

        this.rocks.session().put(TABLE, getBytes("person:1gphoneno"), getBytes("12306"));
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/WhereBuilder.java`
#### Snippet
```java
                        "The clauses can't be empty");

        int size = clauses.size();
        int i = 0;
        for (StringBuilder clause : clauses) {
```

### DataFlowIssue
Method invocation `column` may produce `NullPointerException`
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            if (current != null && current.subRows().size() < maxSize) {
                Id nextVertexId = IdGenerator.of(
                                  next.<String>column(HugeKeys.OWNER_VERTEX));
                if (current.id().equals(nextVertexId)) {
                    current.subRow(next.row());
```

### DataFlowIssue
Argument `next` might be null
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            }

            return this.wrapByVertex(next);
        }

```

### DataFlowIssue
Condition `rootCause instanceof TraversalInterruptedException` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeException.java`
#### Snippet
```java
        Throwable rootCause = HugeException.rootCause(e);
        return rootCause instanceof InterruptedException ||
               rootCause instanceof TraversalInterruptedException ||
               rootCause instanceof InterruptedIOException;
    }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/ExampleUtil.java`
#### Snippet
```java
        try {
            String path = ExampleUtil.class.getClassLoader()
                                     .getResource(conf).getPath();
            File file = new File(path);
            if (file.exists() && file.isFile()) {
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/GremlinJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid gremlin value '%s'", value);
        String gremlin = (String) value;

        value = map.get("bindings");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/GremlinJob.java`
#### Snippet
```java
                        "Invalid bindings value '%s'", value);
        @SuppressWarnings("unchecked")
        Map<String, Object> bindings = (Map<String, Object>) value;

        value = map.get("language");
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/GremlinJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid language value '%s'", value);
        String language = (String) value;

        value = map.get("aliases");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/GremlinJob.java`
#### Snippet
```java
                        "Invalid aliases value '%s'", value);
        @SuppressWarnings("unchecked")
        Map<String, String> aliases = (Map<String, String>) value;

        bindings.put(TASK_BIND_NAME, new GremlinJobProxy());
```

### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/GremlinJob.java`
#### Snippet
```java
        Map<String, String> aliases = (Map<String, String>) value;

        bindings.put(TASK_BIND_NAME, new GremlinJobProxy());

        HugeScriptTraversal<?, ?> traversal = new HugeScriptTraversal<>(
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/AlgorithmJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid algorithm name '%s'", value);
        String name = (String) value;

        value = map.get("parameters");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/AlgorithmJob.java`
#### Snippet
```java
                        "Invalid algorithm parameters '%s'", value);
        @SuppressWarnings("unchecked")
        Map<String, Object> parameters = (Map<String, Object>) value;

        AlgorithmPool pool = AlgorithmPool.instance();
```

### DataFlowIssue
Method invocation `call` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/AlgorithmJob.java`
#### Snippet
```java
        E.checkArgument(algorithm != null,
                        "There is no algorithm named '%s'", name);
        return algorithm.call(this, parameters);
    }
}
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/ComputerJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid computer name '%s'", value);
        String name = (String) value;

        value = map.get("parameters");
```

### DataFlowIssue
Casting `value` to `Map` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/ComputerJob.java`
#### Snippet
```java
                        "Invalid computer parameters '%s'", value);
        @SuppressWarnings("unchecked")
        Map<String, Object> parameters = (Map<String, Object>) value;

        ComputerPool pool = ComputerPool.instance();
```

### DataFlowIssue
Method invocation `call` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/ComputerJob.java`
#### Snippet
```java
        E.checkArgument(computer != null,
                        "There is no computer method named '%s'", name);
        return computer.call(this, parameters);
    }
}
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertTrue(vertex.property("lived").isPresent());
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("lived").isPresent());
        Assert.assertEquals("Tomcat", vertex.property("name").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
                    Assert.assertContains("0x00", e.getCause().getMessage());
                } else {
                    Assert.assertContains("0x00", e.getMessage());
                }
            });
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = vertex("review", "id", 1);
        Assert.assertEquals(ImmutableList.of("looks good!", "LGTM!"),
                            vertex.value("comment"));
        List<Object> props = vertex.value("comment");
        Assert.assertEquals(2, props.size());
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = vertex("review", "id", 2);
        Assert.assertEquals(ImmutableList.of("looks good 2!", "LGTM!"),
                            vertex.value("comment"));
        props = vertex.value("comment");
        Assert.assertEquals(2, props.size());
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = vertex("review", "id", 3);
        Assert.assertEquals(ImmutableList.of("looks good 3!", "LGTM!"),
                            vertex.value("comment"));
        props = vertex.value("comment");
        Assert.assertEquals(2, props.size());
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        this.mayCommitTx();
        Vertex vertex = vertex("person", "name", "marko");
        Assert.assertTrue(vertex.property("age").isPresent());
        Assert.assertEquals(18, vertex.value("age"));
        Assert.assertTrue(vertex.property("city").isPresent());
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        this.mayCommitTx();
        vertex = vertex("person", "name", "marko");
        Assert.assertFalse(vertex.property("age").isPresent());
        Assert.assertTrue(vertex.property("city").isPresent());
        Assert.assertEquals("Wuhan", vertex.value("city"));
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        this.mayCommitTx();
        vertex = vertex("person", "name", "marko");
        Assert.assertTrue(vertex.property("age").isPresent());
        Assert.assertEquals(19, vertex.value("age"));
        Assert.assertTrue(vertex.property("city").isPresent());
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("lived").isPresent());
    }

```

### DataFlowIssue
Method invocation `label` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        // remove vertex without label index
        Vertex vertex = vertex("author2", "id", 1);
        graph.removeVertex(vertex.label(), vertex.id());
        this.mayCommitTx();

```

### DataFlowIssue
Method invocation `label` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        // remove vertex with label index
        vertex = vertex("author", "id", 2);
        graph.removeVertex(vertex.label(), vertex.id());
        this.mayCommitTx();

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        Vertex vertex = vertex("author", "id", 1);
        Assert.assertTrue(vertex.property("lived").isPresent());
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("person", "name", "Tom");
        Assert.assertEquals(3, vertex.property("age").value());

        vertex.property("age", 4);
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(4, vertex.property("age").value());
        vertex = vertex("person", "name", "Tom");
        Assert.assertEquals(4, vertex.property("age").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("lived").isPresent());
        Assert.assertEquals("Tomcat", vertex.property("name").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        Vertex vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("lived").isPresent());
    }

```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        Vertex vertex = vertex("author", "id", 1);
        vertex.remove();
        this.mayCommitTx();

```

### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        Vertex vertex = vertex("author", "id", 1);
        vertex.remove();
        this.mayCommitTx();

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Tom", vertex.property("name").value());

        vertex.property("name", "Tom2");
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Tom2", vertex.property("name").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("lived").isPresent());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            // Update primary key property
            vertex.property("id", 2);
        });
    }
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        this.commitTx();
        Vertex vertex = vertex("person", "name", "marko");
        Assert.assertEquals("Beijing", vertex.value("city"));
        Assert.assertEquals(Utils.date("1992-11-17 12:00:00.000"),
                            vertex.value("birth"));
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals("Beijing", vertex.value("city"));
        vertex = vertex("person", "name", "marko");
        Assert.assertEquals(26, (int) vertex.value("age"));
        Assert.assertEquals(Utils.date("1992-11-17 12:00:00.000"),
                            vertex.value("birth"));
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        this.commitTx();
        vertex = vertex("person", "name", "marko");
        Assert.assertEquals("Beijing", vertex.value("city"));
        Assert.assertEquals(26, (int) vertex.value("age"));
        Assert.assertEquals(Utils.date("1993-11-17 12:00:00.000"),
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Tom2", vertex.property("name").value());
        Assert.assertEquals(10, vertex.property("age").value());
        Assert.assertEquals("USA", vertex.property("lived").value());
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals("Tomcat", vertex.property("name").value());
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = vertex("review", "id", 1);
        Assert.assertEquals(ImmutableSet.of("+1", "+2"),
                            vertex.value("contribution"));

        vertex = graph.addVertex(T.label, "review", "id", 2,
```

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = vertex("review", "id", 2);
        Assert.assertEquals(ImmutableSet.of("+1", "+2"),
                            vertex.value("contribution"));
    }

```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertTrue(vertex.property("lived").isPresent());
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertFalse(vertex.property("age").isPresent());
        Assert.assertFalse(vertex.property("lived").isPresent());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertTrue(vertex.property("lived").isPresent());
        Assert.assertEquals("Shanghai", vertex.property("lived").value());
    }
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        // Remove "lived" property
        Vertex vertex = vertex("author", "id", 1);
        Assert.assertTrue(vertex.property("name").isPresent());
        Assert.assertTrue(vertex.property("lived").isPresent());
        vertex.property("lived").remove();
```

### DataFlowIssue
Method invocation `property` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        vertex = vertex("author", "id", 1);
        Assert.assertEquals(10, vertex.property("age").value());
        Assert.assertTrue(vertex.property("name").isPresent());
        Assert.assertFalse(vertex.property("lived").isPresent());
```

### DataFlowIssue
Method invocation `getNodeName` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/computer/AbstractComputer.java`
#### Snippet
```java
                           (root = nodeHandler.getRootNode()) != null,
                           "Node '%s' must contain root", node);
            results.put(root.getNodeName(), root.getValue());
        }

```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/SubgraphStatAlgorithm.java`
#### Snippet
```java
        E.checkArgument(subgraph instanceof String,
                        "Invalid parameter '%s', expect a String, but got %s",
                        KEY_SUBGRAPH, subgraph.getClass().getSimpleName());
        return (String) subgraph;
    }
```

### DataFlowIssue
Casting `subgraph` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/SubgraphStatAlgorithm.java`
#### Snippet
```java
                        "Invalid parameter '%s', expect a String, but got %s",
                        KEY_SUBGRAPH, subgraph.getClass().getSimpleName());
        return (String) subgraph;
    }

```

### DataFlowIssue
Casting `json` to `RolePermission` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/RolePermission.java`
#### Snippet
```java
            E.checkArgument(json instanceof RolePermission,
                            "Invalid role value: %s", json);
            role = (RolePermission) json;
        }
        return role;
```

### DataFlowIssue
Method invocation `updateTime` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/ServerInfoManager.java`
#### Snippet
```java
                                             this.selfServerRole);
        }
        serverInfo.updateTime(DateUtil.now());
        this.save(serverInfo);
    }
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        // BOTH
        List<Vertex> vertices = graph.traversal().V(jeff.id())
                                     .both("friend").toList();
        Assert.assertEquals(2, vertices.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        // NOTE: the has() just filter by vertex props
        List<Vertex> vertices = graph.traversal().V(java3.id())
                                     .in("look").has("age", P.gt(22))
                                     .toList();
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex java3 = vertex("book", "name", "java-3");

        List<Vertex> vertices = graph.traversal().V(java3.id())
                                     .in("look").toList();
        Assert.assertEquals(4, vertices.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex louise = vertex("person", "name", "Louise");

        List<Edge> edges = graph.traversal().V(louise.id()).outE("look")
                                .has("time", "2017-5-1").has("score", 3)
                                .toList();
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        Vertex java = vertex("language", "name", "java");
        List<Edge> edges = graph.traversal().V(java.id()).inE().toList();

        Assert.assertEquals(1, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex java3 = vertex("book", "name", "java-3");

        List<Edge> edges = graph.traversal().V(java3.id())
                                .inE().has("score", 3).toList();
        Assert.assertEquals(3, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex james = vertex("author", "id", 1);
        List<Edge> edges = ImmutableList.copyOf(
                           graph.adjacentEdges((Id) james.id()));
        Assert.assertEquals(6, edges.size());

```

### DataFlowIssue
Method invocation `getVertices` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        List<Vertex> vertices = ImmutableList.copyOf(
                                james.getVertices(Directions.BOTH));
        Assert.assertEquals(6, vertices.size());

```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
                    Assert.assertContains("0x00", e.getCause().getMessage());
                } else {
                    Assert.assertContains("0x00", e.getMessage());
                }
            });
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex louise = vertex("person", "name", "Louise");

        List<Edge> edges = graph.traversal().V(louise.id()).outE("look")
                                .has("time", "2017-5-1").toList();
        Assert.assertEquals(2, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        // BOTH
        List<Vertex> vertices = graph.traversal().V(jeff.id())
                                     .bothE("friend").as("e").otherV()
                                     .toList();
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        Vertex james = vertex("author", "id", 1);
        List<Vertex> vertices = graph.traversal().V(james.id()).out().toList();

        Assert.assertEquals(4, vertices.size());
```

### DataFlowIssue
Method invocation `addEdge` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex sean = vertex("person", "name", "Sean");

        louise.addEdge("transfer", sean, "id", 1, "amount", 500.00F,
                       "timestamp", edge.value("timestamp"),
                       "message", "Happy birthday!");
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        // Query BOTH edges of a vertex
        List<Edge> edges = graph.traversal().V(james.id()).bothE().toList();
        Assert.assertEquals(6, edges.size());

```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java

        Vertex guido = vertex("author", "id", 2);
        List<Edge> edges = graph.traversal().V(guido.id()).inE().toList();

        Assert.assertEquals(0, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        // Query IN edges of a vertex
        Vertex james = vertex("author", "id", 1);
        List<Edge> edges = graph.traversal().V(james.id()).inE().toList();

        Assert.assertEquals(2, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex louise = vertex("person", "name", "Louise");

        Assert.assertEquals(4, graph.traversal().V(louise.id())
                                    .out("look").count().next().longValue());
        List<Vertex> vertices = graph.traversal().V(louise.id())
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex java3 = vertex("book", "name", "java-3");

        List<Edge> edges = graph.traversal().V(java3.id()).inE().toList();
        Assert.assertEquals(5, edges.size());

```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        // Query OUT edges of a vertex
        Vertex james = vertex("author", "id", 1);
        List<Edge> edges = graph.traversal().V(james.id()).outE().toList();

        Assert.assertEquals(4, edges.size());
```

### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeCoreTest.java`
#### Snippet
```java
        Vertex java3 = vertex("book", "name", "java-3");

        List<Edge> edges = graph.traversal().V(java3.id())
                                .inE("look").toList();
        Assert.assertEquals(4, edges.size());
```

### DataFlowIssue
Casting `value` to `Boolean` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ParameterUtil.java`
#### Snippet
```java
                        "Expect boolean value for parameter '%s': '%s'",
                        key, value);
        return ((Boolean) value);
    }
}
```

### DataFlowIssue
Casting `value` to `Number` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ParameterUtil.java`
#### Snippet
```java
                        "Expect int value for parameter '%s': '%s'",
                        key, value);
        return ((Number) value).intValue();
    }

```

### DataFlowIssue
Casting `value` to `Number` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ParameterUtil.java`
#### Snippet
```java
                        "Expect long value for parameter '%s': '%s'",
                        key, value);
        return ((Number) value).longValue();
    }

```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ParameterUtil.java`
#### Snippet
```java
                        "Expect string value for parameter '%s': '%s'",
                        key, value);
        return (String) value;
    }

```

### DataFlowIssue
Casting `value` to `Number` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ParameterUtil.java`
#### Snippet
```java
                        "Expect double value for parameter '%s': '%s'",
                        key, value);
        return ((Number) value).doubleValue();
    }

```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/StringEncoding.java`
#### Snippet
```java
        E.checkArgument(value != null, "The UUID can't be null");
        try {
            if (value.contains("-") && value.length() == 36) {
                return UUID.fromString(value);
            }
```

### DataFlowIssue
Dereference of `confFiles` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/ConfigUtil.java`
#### Snippet
```java
        E.checkNotNull(confFiles, "graph configuration files");
        Map<String, String> graphConfs = InsertionOrderUtil.newMap();
        for (File confFile : confFiles) {
            // NOTE: use file name as graph name
            String name = StringUtils.substringBefore(confFile.getName(),
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/CompressUtil.java`
#### Snippet
```java
        File[] files = new File(dir).listFiles();
        E.checkNotNull(files, "files");
        for (File file : files) {
            String child = Paths.get(sourceDir, file.getName()).toString();
            if (file.isDirectory()) {
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/PropertyKey.java`
#### Snippet
```java
                return LongEncoding.encodeNumber(validValue);
            } else {
                return validValue.toString();
            }
        }
```

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/Id.java`
#### Snippet
```java
            E.checkArgument(id != null && id.length() > 0,
                            "Invalid id '%s'", id);
            switch (id.charAt(0)) {
                case 'L':
                    return IdType.LONG;
```

### DataFlowIssue
Condition `iterator instanceof Metadatable` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageInfo.java`
#### Snippet
```java

    public static PageState pageState(Iterator<?> iterator) {
        E.checkState(iterator instanceof Metadatable,
                     "Invalid paging iterator: %s", iterator.getClass());
        Object page = ((Metadatable) iterator).metadata(PAGE);
```

### DataFlowIssue
Casting `page` to `PageState` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageInfo.java`
#### Snippet
```java
        E.checkState(page instanceof PageState,
                     "Invalid PageState '%s'", page);
        return (PageState) page;
    }

```

### DataFlowIssue
Condition `iterator instanceof Metadatable` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageInfo.java`
#### Snippet
```java

    public static String pageInfo(Iterator<?> iterator) {
        E.checkState(iterator instanceof Metadatable,
                     "Invalid paging iterator: %s", iterator.getClass());
        Object page = ((Metadatable) iterator).metadata(PAGE);
```

### DataFlowIssue
Method invocation `aggregateType` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java
                            "'%s' for '%s': '%s'", field,
                            this.baseType.readableName(), this.baseValue);
            E.checkArgument(pkey.aggregateType().isIndexable(),
                            "The aggregate type %s is not indexable",
                            pkey.aggregateType());
```

### DataFlowIssue
Condition `this.entries instanceof Metadatable` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/IdHolder.java`
#### Snippet
```java
        @Override
        public Object metadata(String meta, Object... args) {
            E.checkState(this.entries instanceof Metadatable,
                         "Invalid iterator for Metadatable: %s",
                         this.entries.getClass());
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/QueryList.java`
#### Snippet
```java
        E.checkNotNull(query, "query");
        assert offset >= visited;
        return query.iterator(offset - visited, pageInfo.page(), pageSize);
    }

```

### DataFlowIssue
Method invocation `enableMetrics` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CacheManager.java`
#### Snippet
```java
        E.checkArgument(cache != null,
                        "Not found cache named '%s'", name);
        return cache.enableMetrics(enabled);
    }

```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/SchemaTransaction.java`
#### Snippet
```java
                               SchemaJob callable, Set<Id> dependencies) {
        E.checkArgument(schema != null, "Schema can't be null");
        String name = SchemaJob.formatTaskName(schema.type(),
                                               schema.id(),
                                               schema.name());
```

### DataFlowIssue
Casting `id` to `Id` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CachedGraphTransaction.java`
#### Snippet
```java
                                            "Expect instance of Id in array, " +
                                            "but got '%s'", id.getClass());
                            this.verticesCache.invalidate((Id) id);
                        }
                    } else {
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/AbstractBackendStoreProvider.java`
#### Snippet
```java
        LOG.debug("Graph '{}' open StoreProvider", this.graph);
        E.checkArgument(graph != null, "The graph name can't be null");
        E.checkArgument(!graph.isEmpty(), "The graph name can't be empty");

        this.graph = graph;
```

### DataFlowIssue
Casting `valueObject` to `List` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQueryFlatten.java`
#### Snippet
```java
                        "Expect list value for IN condition: %s", relation);
        @SuppressWarnings("unchecked")
        List<Object> values = (List<Object>) valueObject;
        E.checkArgument(values.size() <= Query.QUERY_BATCH,
                        "Too many conditions(%s) each query", values.size());
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQueryFlatten.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        List<Object> values = (List<Object>) valueObject;
        E.checkArgument(values.size() <= Query.QUERY_BATCH,
                        "Too many conditions(%s) each query", values.size());

```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftAddPeerJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid endpoint value '%s'", value);
        String endpoint = (String) value;
        return this.graph().raftGroupManager().addPeer(endpoint);
    }
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftRemovePeerJob.java`
#### Snippet
```java
        E.checkArgument(value instanceof String,
                        "Invalid endpoint value '%s'", value);
        String endpoint = (String) value;
        return this.graph().raftGroupManager().removePeer(endpoint);
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftGroupManagerImpl.java`
#### Snippet
```java
        E.checkState(leaderId != null,
                     "There is no leader for raft group '%s'", this.group);
        return leaderId.toString();
    }

```

### DataFlowIssue
Method invocation `fresh` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        // Add property in memory for new created edge
        if (edge.fresh()) {
            // The owner will do property update
            edge.setProperty(prop);
```

### DataFlowIssue
Method invocation `hasProperty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        // Maybe have ever been removed (compatible with tinkerpop)
        if (!vertex.hasProperty(propKey.id())) {
            // PropertyTest shouldAllowRemovalFromVertexWhenAlreadyRemoved()
            return;
```

### DataFlowIssue
Method invocation `hasProperty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        // Maybe have ever been removed
        if (!edge.hasProperty(propKey.id())) {
            return;
        }
```

### DataFlowIssue
Method invocation `fresh` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        // Add property in memory for new created vertex
        if (vertex.fresh()) {
            // The owner will do property update
            vertex.setProperty(prop);
```

### DataFlowIssue
Method invocation `waitFinished` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStoreProvider.java`
#### Snippet
```java
        E.checkState(future != null, "The snapshot future can't be null");
        try {
            future.waitFinished();
            LOG.debug("Graph '{}' has writed snapshot", this.graph());
        } catch (Throwable e) {
```

### DataFlowIssue
Method invocation `originStore` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
        E.checkState(raftStore != null,
                     "The raft store of type %s shouldn't be null", storeType);
        return raftStore.originStore();
    }

```

### DataFlowIssue
Method invocation `resultType` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
            @SuppressWarnings({ "unchecked", "rawtypes" })
            Collection<Query> queries = (Collection) this.values();
            return new JointQuery(this.rootQuery().resultType(),
                                  this.parentQuery, queries);
        }
```

### DataFlowIssue
Method invocation `indexFields` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
        // Collect property values of index fields
        List<Object> allPropValues = new ArrayList<>();
        int fieldsNum = indexLabel.indexFields().size();
        int firstNullField = fieldsNum;
        for (Id fieldId : indexLabel.indexFields()) {
```

### DataFlowIssue
Casting `query` to `ConditionQuery` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTable.java`
#### Snippet
```java
        // Query by condition(s)
        if (query.conditionsSize() > 0) {
            ConditionQuery condQuery = (ConditionQuery) query;
            if (condQuery.containsScanRelation()) {
                return this.queryByRange(condQuery);
```

### DataFlowIssue
Dereference of `iterators` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/MergeIterator.java`
#### Snippet
```java
        this.headElements = new ArrayList<>();

        for (Iterator<R> iterator : iterators) {
            if (iterator.hasNext()) {
                this.iterators.add(iterator);
```

### DataFlowIssue
Argument `indexLabel` might be null
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java
                return;
            }
            Id indexLabelId = IdGenerator.of(Long.parseLong(indexLabel));
            Id min = HugeIndex.formatIndexId(entry.type(), indexLabelId, 0L);
            indexLabelId = IdGenerator.of(indexLabelId.asLong() + 1L);
```

### DataFlowIssue
Casting `query` to `ConditionQuery` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java
            List<Condition.Relation> relations = new ArrayList<>();
            Id indexLabelId = null;
            for (Condition.Relation r : ((ConditionQuery) query).relations()) {
                if (r.key().equals(HugeKeys.INDEX_LABEL_ID)) {
                    indexLabelId = (Id) r.value();
```

### DataFlowIssue
Argument `indexLabel` might be null
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java
                Entry<Id, BackendEntry> e = iter.next();
                // Delete if prefix with index label
                if (e.getKey().asString().startsWith(indexLabel)) {
                    iter.remove();
                }
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java
            if (keyMin == null) {
                // Field value < keyMax
                keyMin = NumericUtil.minValueOf(keyMax.getClass());
            }
            Id min = HugeIndex.formatIndexId(type, indexLabelId, keyMin);
```

### DataFlowIssue
Casting `fieldValues` to `Number` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java
                             "Field value of range index must be number:" +
                             " %s", fieldValues.getClass().getSimpleName());
                byte[] bytes = number2bytes((Number) fieldValues);
                buffer.write(bytes);
            }
```

### DataFlowIssue
Method invocation `validValueOrThrow` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeProperty.java`
#### Snippet
```java
        this.owner = owner;
        this.pkey = pkey;
        this.value = pkey.validValueOrThrow(value);
    }

```

### DataFlowIssue
Condition `results instanceof Metadatable` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/QueryHolder.java`
#### Snippet
```java
    default Object metadata(String meta, Object... args) {
        Iterator<?> results = this.lastTimeResults();
        if (results instanceof Metadatable) {
            return ((Metadatable) results).metadata(meta, args);
        }
```

### DataFlowIssue
Method invocation `schemaLabel` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
        }
        E.checkState(vertex != null, "Vertex '%s' does not exist", this.id);
        if (vertex.schemaLabel().undefined() ||
            !vertex.schemaLabel().equals(this.schemaLabel())) {
            // Update vertex label of dangling edge to undefined
```

### DataFlowIssue
Condition `prop instanceof VertexProperty` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
        if (keys.length == 0) {
            for (HugeProperty<?> prop : this.getProperties()) {
                assert prop instanceof VertexProperty;
                props.add((VertexProperty<V>) prop);
            }
```

### DataFlowIssue
Method invocation `serialValue` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java
                         "The value of primary key '%s' can't be null",
                         this.graph().propertyKey(pk).name());
            Object propValue = property.serialValue(encodeNumber);
            if (Strings.EMPTY.equals(propValue)) {
                propValue = ConditionQuery.INDEX_VALUE_EMPTY;
```

### DataFlowIssue
Dereference of `column` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            E.checkState(column != null, "Not found key '%s' from entry %s",
                         key, this.entry);
            E.checkNotNull(column.value, "column.value");
            return column.value;
        }
```

### DataFlowIssue
Condition `AddVertexStartStep.class.isInstance(step)` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugePrimaryKeyStrategy.java`
#### Snippet
```java
            Step step = stepList.get(i);

            if (i == 0 && AddVertexStartStep.class.isInstance(step)) {
                curAddStep = (Mutating) step;
                continue;
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                            "Please specify at least one condition");
            // Set keyMin to min value
            keyMin = NumericUtil.minValueOf(keyMax.getClass());
            keyMinEq = true;
        }
```

### DataFlowIssue
Condition `AddVertexStep.class.isInstance((step))` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugePrimaryKeyStrategy.java`
#### Snippet
```java
                curAddStep = (Mutating) step;
                continue;
            } else if (curAddStep == null && AddVertexStep.class.isInstance((step))) {
                curAddStep = (Mutating) step;
                continue;
```

### DataFlowIssue
Casting `id` to `BinaryId` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            E.checkState(id instanceof BinaryId,
                         "Expect a BinaryId for BackendEntry with edge id");
            return new BinaryBackendEntry(type, (BinaryId) id);
        }

```

### DataFlowIssue
Condition `AddPropertyStep.class.isInstance(step)` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugePrimaryKeyStrategy.java`
#### Snippet
```java
            if (curAddStep == null) continue;

            if (!AddPropertyStep.class.isInstance(step)) {
                curAddStep = null;
                continue;
```

### DataFlowIssue
Argument `edge` might be null
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeEdge.java`
#### Snippet
```java
        }
        E.checkState(edge != null, "Edge '%s' does not exist", this.id);
        this.copyProperties((HugeEdge) edge);
        this.updateToDefaultValueIfNone();
        return true;
```

### DataFlowIssue
Method invocation `serialValue` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeEdge.java`
#### Snippet
```java
            E.checkState(property != null,
                         "The value of sort key '%s' can't be null", sk);
            Object propValue = property.serialValue(true);
            if (Strings.EMPTY.equals(propValue)) {
                propValue = ConditionQuery.INDEX_VALUE_EMPTY;
```

### DataFlowIssue
Method invocation `getParent` will produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
        }

        TraversalParent parent = traversal.getParent();
        return containsTree(parent.asStep().getTraversal());
    }
```

### DataFlowIssue
Method invocation `getParent` will produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
        }

        TraversalParent parent = traversal.getParent();
        return containsPath(parent.asStep().getTraversal());
    }
```

### DataFlowIssue
Casting `id` to `IdGenerator.LongId` may produce `ClassCastException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
        E.checkArgument(id instanceof IdGenerator.LongId,
                        "Can't get number from %s(%s)", id, id.getClass());
        return ((IdGenerator.LongId) id).intValue();
    }

```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CountTraverser.java`
#### Snippet
```java
        }

        int stepNum = steps.size();
        EdgeStep firstStep = steps.get(0);
        if (stepNum == 1) {
```

### DataFlowIssue
Method invocation `values` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizedCrosspointsTraverser.java`
#### Snippet
```java
            }
            assert stepNum == 0;
            for (List<Node> nodes : newVertices.values()) {
                for (Node n : nodes) {
                    paths.add(new Path(n.path()));
```

### DataFlowIssue
Unboxing of `oldRank` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/PersonalRankTraverser.java`
#### Snippet
```java
                    continue;
                }
                double incrRank = oldRank * this.alpha / degree;

                // Collect all neighbors increment
```

### DataFlowIssue
Method invocation `values` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizePathsTraverser.java`
#### Snippet
```java
        }
        List<Path> paths = newList();
        for (List<Node> nodes : newVertices.values()) {
            for (Node n : nodes) {
                if (sorted) {
```

### DataFlowIssue
Method invocation `metadata` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        E.checkState(holder != null,
                     "Invalid paging traversal: %s", traversal.getClass());
        Object page = holder.metadata(PageInfo.PAGE);
        if (page == null) {
            return null;
```

### DataFlowIssue
Condition `bp instanceof Compare` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                                                                   HasContainer has) {
        BiPredicate<?, ?> bp = has.getPredicate().getBiPredicate();
        assert bp instanceof Compare;

        String key = has.getKey();
```

### DataFlowIssue
Method invocation `getBiPredicate` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        P<?> p = has.getPredicate();
        E.checkArgument(p != null, "The predicate of has(%s) is null", has);
        BiPredicate<?, ?> bp = p.getBiPredicate();
        Condition condition;
        if (keyForContainsKeyOrValue(has.getKey())) {
```

### DataFlowIssue
Condition `bp instanceof Compare` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        if (keyForContainsKeyOrValue(has.getKey())) {
            condition = convContains2Relation(graph, has);
        } else if (bp instanceof Compare) {
            condition = convCompare2Relation(graph, type, has);
        } else if (bp instanceof Condition.RelationType) {
```

### DataFlowIssue
Condition `bp instanceof Contains` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                                            HasContainer has) {
        BiPredicate<?, ?> bp = has.getPredicate().getBiPredicate();
        assert bp instanceof Contains;
        Collection<?> values = (Collection<?>) has.getValue();

```

### DataFlowIssue
Condition `bp instanceof Compare` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        assert type.isGraph();
        BiPredicate<?, ?> bp = has.getPredicate().getBiPredicate();
        assert bp instanceof Compare;

        return isSysProp(has.getKey()) ?
```

### DataFlowIssue
Condition `bp instanceof Compare` is redundant and can be replaced with a null check
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                                                                  HasContainer has) {
        BiPredicate<?, ?> bp = has.getPredicate().getBiPredicate();
        assert bp instanceof Compare;

        HugeKeys key = token2HugeKey(has.getKey());
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/variables/HugeVariables.java`
#### Snippet
```java
            throw Graph.Variables.Exceptions.variableKeyCanNotBeNull();
        }
        if (key.isEmpty()) {
            throw Graph.Variables.Exceptions.variableKeyCanNotBeEmpty();
        }
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/variables/HugeVariables.java`
#### Snippet
```java
            throw Graph.Variables.Exceptions.variableKeyCanNotBeNull();
        }
        if (key.isEmpty()) {
            throw Graph.Variables.Exceptions.variableKeyCanNotBeEmpty();
        }
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `hugegraph-core/src/main/java/org/apache/hugegraph/variables/HugeVariables.java`
#### Snippet
```java
            throw Graph.Variables.Exceptions.variableKeyCanNotBeNull();
        }
        if (key.isEmpty()) {
            throw Graph.Variables.Exceptions.variableKeyCanNotBeEmpty();
        }
```

### DataFlowIssue
Argument `computer` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/job/ComputerAPI.java`
#### Snippet
```java

        HugeGraph g = graph(manager, graph);
        Map<String, Object> input = ImmutableMap.of("computer", computer,
                                                    "parameters", parameters);
        JobBuilder<Object> builder = JobBuilder.of(g);
```

### DataFlowIssue
Method invocation `checkCreate` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/API.java`
#### Snippet
```java
            E.checkArgument(body != null,
                            "The batch body can't contain null record");
            body.checkCreate(true);
        }
    }
```

### DataFlowIssue
Argument `algorithm` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/job/AlgorithmAPI.java`
#### Snippet
```java

        HugeGraph g = graph(manager, graph);
        Map<String, Object> input = ImmutableMap.of("algorithm", algorithm,
                                                    "parameters", parameters);
        JobBuilder<Object> builder = JobBuilder.of(g);
```

### DataFlowIssue
Method invocation `getAddress` may produce `NullPointerException`
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseMetrics.java`
#### Snippet
```java
            results.put(CLUSTER_ID, clusterMetrics.getClusterId());
            results.put("master_name",
                        clusterMetrics.getMasterName().getAddress().toString());
            results.put("average_load", clusterMetrics.getAverageLoad());
            results.put("hbase_version", clusterMetrics.getHBaseVersion());
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/GroupAPI.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid group id: " + id);
        }
        group = jsonGroup.build(group);
        manager.authManager().updateGroup(group);
        return manager.serializer(g).writeAuthElement(group);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/UserAPI.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid user id: " + id);
        }
        user = jsonUser.build(user);
        manager.authManager().updateUser(user);
        return manager.serializer(g).writeAuthElement(user);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/TargetAPI.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid target id: " + id);
        }
        target = jsonTarget.build(target);
        manager.authManager().updateTarget(target);
        return manager.serializer(g).writeAuthElement(target);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/BelongAPI.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid belong id: " + id);
        }
        belong = jsonBelong.build(belong);
        manager.authManager().updateBelong(belong);
        return manager.serializer(g).writeAuthElement(belong);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/AccessAPI.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid access id: " + id);
        }
        access = jsonAccess.build(access);
        manager.authManager().updateAccess(access);
        return manager.serializer(g).writeAuthElement(access);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/ProjectAPI.java`
#### Snippet
```java
        }
        if (ProjectAPI.isAddGraph(action)) {
            project = jsonProject.buildAddGraph(project);
        } else if (ProjectAPI.isRemoveGraph(action)) {
            project = jsonProject.buildRemoveGraph(project);
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/ProjectAPI.java`
#### Snippet
```java
            project = jsonProject.buildAddGraph(project);
        } else if (ProjectAPI.isRemoveGraph(action)) {
            project = jsonProject.buildRemoveGraph(project);
        } else {
            E.checkArgument(StringUtils.isEmpty(action),
```

### DataFlowIssue
Variable is already assigned to this value
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/ProjectAPI.java`
#### Snippet
```java
                            ProjectAPI.ACTION_REMOVE_GRAPH,
                            action);
            project = jsonProject.buildUpdateDescription(project);
        }
        authManager.updateProject(project);
```

### DataFlowIssue
Dereference of `newElement` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/BatchAPI.java`
#### Snippet
```java
            UpdateStrategy updateStrategy = kv.getValue();
            if (oldElement.properties.get(key) != null &&
                newElement.properties.get(key) != null) {
                Object value = updateStrategy.checkAndUpdateProperty(
                               oldElement.properties.get(key),
```

### DataFlowIssue
Dereference of `newElement` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/BatchAPI.java`
#### Snippet
```java
                newElement.properties.put(key, value);
            } else if (oldElement.properties.get(key) != null &&
                       newElement.properties.get(key) == null) {
                // If new property is null & old is present, use old property
                newElement.properties.put(key, oldElement.properties.get(key));
```

### DataFlowIssue
Dereference of `newElement` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/BatchAPI.java`
#### Snippet
```java
            UpdateStrategy updateStrategy = kv.getValue();
            if (oldElement.property(key).isPresent() &&
                newElement.properties.get(key) != null) {
                Object value = updateStrategy.checkAndUpdateProperty(
                               oldElement.property(key).value(),
```

### DataFlowIssue
Dereference of `newElement` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/BatchAPI.java`
#### Snippet
```java
                newElement.properties.put(key, value);
            } else if (oldElement.property(key).isPresent() &&
                       newElement.properties.get(key) == null) {
                // If new property is null & old is present, use old property
                newElement.properties.put(key, oldElement.value(key));
```

### DataFlowIssue
Method invocation `getService` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/RedirectFilter.java`
#### Snippet
```java
        ServiceHandle<GraphManager> handle = this.managerProvider.getHandle();
        E.checkState(handle != null, "Context GraphManager is absent");
        GraphManager manager = handle.getService();
        E.checkState(manager != null, "Context GraphManager is absent");

```

### DataFlowIssue
Method invocation `globalMasterInfo` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/RedirectFilter.java`
#### Snippet
```java
        }

        GlobalMasterInfo globalMasterInfo = manager.globalMasterInfo();
        if (globalMasterInfo == null || !globalMasterInfo.isFeatureSupport()) {
            return;
```

### DataFlowIssue
Condition `exception instanceof MultiException` is redundant and can be replaced with a null check
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/ExceptionFilter.java`
#### Snippet
```java
        @Override
        public Response toResponse(Throwable exception) {
            if (exception instanceof MultiException &&
                ((MultiException) exception).getErrors().size() == 1) {
                exception = ((MultiException) exception).getErrors().get(0);
```

### DataFlowIssue
Method invocation `requireAuthentication` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/AuthenticationFilter.java`
#### Snippet
```java
        E.checkState(manager != null, "Context GraphManager is absent");

        if (!manager.requireAuthentication()) {
            // Return anonymous user with admin role if disable authentication
            return User.ANONYMOUS;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/AuthenticationFilter.java`
#### Snippet
```java
            E.checkState(params != null && params.size() == 1,
                         "There is no matched path parameter: '%s'", key);
            return params.get(0);
        }

```

### DataFlowIssue
Method invocation `backend` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
            HugeGraph g = manager.graph(graph);
            Map<String, Object> metrics = InsertionOrderUtil.newMap();
            metrics.put(BackendMetrics.BACKEND, g.backend());
            try {
                metrics.putAll(g.metadata(null, "metrics"));
```

### DataFlowIssue
Dereference of `value` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/variables/VariablesAPI.java`
#### Snippet
```java

        HugeGraph g = graph(manager, graph);
        commit(g, () -> g.variables().set(key, value.data));
        return ImmutableMap.of(key, value.data);
    }
```

### DataFlowIssue
Dereference of `value` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/variables/VariablesAPI.java`
#### Snippet
```java
        HugeGraph g = graph(manager, graph);
        commit(g, () -> g.variables().set(key, value.data));
        return ImmutableMap.of(key, value.data);
    }

```

### DataFlowIssue
Argument `readMode` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/GraphsAPI.java`
#### Snippet
```java
        HugeGraph g = graph(manager, name);
        g.readMode(readMode);
        return ImmutableMap.of("graph_read_mode", readMode);
    }

```

### DataFlowIssue
Argument `mode` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/profile/GraphsAPI.java`
#### Snippet
```java
        HugeGraph g = graph(manager, name);
        g.mode(mode);
        return ImmutableMap.of("mode", mode);
    }

```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/VerticesAPI.java`
#### Snippet
```java
                        "The ids parameter can't be null or empty");

        Object[] ids = new Id[stringIds.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = VertexAPI.checkAndParseVertexId(stringIds.get(i));
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/EdgesAPI.java`
#### Snippet
```java
                        "The ids parameter can't be null or empty");

        Object[] ids = new Id[stringIds.size()];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = HugeEdge.getIdValue(stringIds.get(i), false);
```

### DataFlowIssue
Argument `sources` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/FusiformSimilarityAPI.java`
#### Snippet
```java
                                    new FusiformSimilarityTraverser(g);
        SimilarsMap result = traverser.fusiformSimilarity(
                             sources, request.direction, request.label,
                             request.minNeighbors, request.alpha,
                             request.minSimilars, request.top,
```

### DataFlowIssue
Method invocation `serviceProxy` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/rpc/RpcClientProviderWithAuth.java`
#### Snippet
```java
                        "RpcClient is not enabled, please config option '%s'",
                        ServerOptions.AUTH_REMOTE_URL.name());
        return this.authConsumerConfig.serviceProxy(AuthManager.class);
    }
}
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeAuthenticator.java`
#### Snippet
```java
        E.checkState(config != null,
                     "Must provide a 'config' in the 'authentication'");
        String path = (String) config.get("tokens");
        E.checkState(path != null,
                     "Credentials configuration missing key 'tokens'");
```

### DataFlowIssue
Argument `graph` might be null
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java
                        name);

        this.dropGraph(graph);

        // Let gremlin server and rest server context remove graph
```

### DataFlowIssue
Method invocation `waitReady` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java
        for (String graphName : this.graphs.keySet()) {
            HugeGraph graph = this.graph(graphName);
            graph.waitReady(remotingRpcServer);
        }
    }
```

### DataFlowIssue
Method invocation `cloneConfig` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java
                        "The graph '%s' has existed", newName);

        HugeConfig cloneConfig = cloneGraph.cloneConfig(newName);
        if (StringUtils.isNotEmpty(configText)) {
            PropertiesConfiguration propConfig = ConfigUtil.buildConfig(
```

### DataFlowIssue
Condition `ex instanceof TraversalInterruptedException` is redundant and can be replaced with a null check
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherOpProcessor.java`
#### Snippet
```java

    private String getErrorMessage(RequestMessage msg, Exception ex) {
        if (ex instanceof InterruptedException || ex instanceof TraversalInterruptedException) {
            return String.format("A timeout occurred during traversal evaluation of [%s] " +
                                 "- consider increasing the limit given to scriptEvaluationTimeout",
```

### DataFlowIssue
Method invocation `getMessage` will produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherOpProcessor.java`
#### Snippet
```java
                                 msg);
        } else {
            return ex.getMessage();
        }
    }
```

### DataFlowIssue
Method invocation `user` may produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
                     "Missing authentication context " +
                     "when verifying resource permission");
        String username = context.user().username();
        Object role = context.user().role();
        ResourceObject<V> ro = fetcher.get();
```

### DataFlowIssue
Method invocation `getBytecode` will produce `NullPointerException`
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
            } else {
                GroovyTranslator translator = GroovyTranslator.of("g");
                Script script1 = translator.translate(traversal.getBytecode());
                if (script1 != null) {
                    script = script1.getScript();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `hugegraph-scylladb/src/main/java/org/apache/hugegraph/backend/store/scylladb/ScyllaDBTablesWithMV.java`
#### Snippet
```java
        private final String prKeys = this.keys.stream()
                                      .collect(Collectors.joining(","));
        private final String prkeysNn = this.keys.stream().collect(
                             Collectors.joining(" IS NOT NULL AND "));

```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `hugegraph-scylladb/src/main/java/org/apache/hugegraph/backend/store/scylladb/ScyllaDBTablesWithMV.java`
#### Snippet
```java
                                          .collect(Collectors.toList());
        private final String prKeys = this.keys.stream()
                                      .collect(Collectors.joining(","));
        private final String prkeysNn = this.keys.stream().collect(
                             Collectors.joining(" IS NOT NULL AND "));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
`new String()` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java

    // Note: here we use "new String" to distinguish normal string code
    public static final String INDEX_VALUE_NULL = new String("<null>");
    public static final String INDEX_VALUE_EMPTY = new String("<empty>");

```

### StringOperationCanBeSimplified
`new String()` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
    // Note: here we use "new String" to distinguish normal string code
    public static final String INDEX_VALUE_NULL = new String("<null>");
    public static final String INDEX_VALUE_EMPTY = new String("<empty>");

    public static final Set<String> IGNORE_SYM_SET;
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'updateSchema' with specified argument types
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/schema/SchemaJob.java`
#### Snippet
```java
        try {
            Method method = SchemaTransaction.class
                            .getDeclaredMethod("updateSchema",
                                               SchemaElement.class);
            method.setAccessible(true);
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TextBackendEntry.java`
#### Snippet
```java

    public boolean containsValue(String value) {
        return this.columns.values().contains(value);
    }

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/ResourceType.java`
#### Snippet
```java
        }

        switch (required) {
            case NONE:
                return this != NONE;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugeBelong.java`
#### Snippet
```java
            return true;
        }
        switch (key) {
            case P.DESCRIPTION:
                this.description = (String) value;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/EdgeAPI.java`
#### Snippet
```java
        for (Map.Entry<String, Object> prop : props.entrySet()) {
            Object value = prop.getValue();
            if (!keepStartP && value instanceof String &&
                ((String) value).startsWith(TraversalUtil.P_CALL)) {
                prop.setValue(TraversalUtil.parsePredicate((String) value));
            }
        }

        for (Map.Entry<String, Object> entry : props.entrySet()) {
            traversal = traversal.has(entry.getKey(), entry.getValue());
        }

        if (page == null) {
            traversal = traversal.range(offset, offset + limit);
        } else {
            traversal = traversal.has(QueryHolder.SYSPROP_PAGE, page)
                                 .limit(limit);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/schema/EdgeLabelAPI.java`
#### Snippet
```java
            if (this.nullableKeys != null) {
                builder.nullableKeys(this.nullableKeys);
            }
            if (this.enableLabelIndex != null) {
                builder.enableLabelIndex(this.enableLabelIndex);
            }
            if (this.userdata != null) {
                builder.userdata(this.userdata);
            }
            if (this.checkExist != null) {
                builder.checkExist(this.checkExist);
            }
            if (this.ttl != 0) {
                builder.ttl(this.ttl);
            }
            if (this.ttlStartTime != null) {
                E.checkArgument(this.ttl > 0,
                                "Only set ttlStartTime when ttl is " +
                                "positive,  but got ttl: %s", this.ttl);
                builder.ttlStartTime(this.ttlStartTime);
            }
            return builder;
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/AllShortestPathsAPI.java`
#### Snippet
```java
        Id sourceId = VertexAPI.checkAndParseVertexId(source);
        Id targetId = VertexAPI.checkAndParseVertexId(target);
        Directions dir = Directions.convert(EdgeAPI.parseDirection(direction));

        HugeGraph g = graph(manager, graph);

        ShortestPathTraverser traverser = new ShortestPathTraverser(g);
        List<String> edgeLabels = edgeLabel == null ? ImmutableList.of() :
                                  ImmutableList.of(edgeLabel);
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/CustomizedPathsAPI.java`
#### Snippet
```java
        if (!request.withVertex) {
            return manager.serializer(g).writePaths("paths", paths, false);
        }

        Set<Id> ids = new HashSet<>();
        for (HugeTraverser.Path p : paths) {
            ids.addAll(p.vertices());
        }
        Iterator<Vertex> iter = QueryResults.emptyIterator();
        if (!ids.isEmpty()) {
            iter = g.vertices(ids.toArray());
        }
        return manager.serializer(g).writePaths("paths", paths, false, iter);
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/traversers/KneighborAPI.java`
#### Snippet
```java
        long size = results.size();
        if (request.limit != Query.NO_LIMIT && size > request.limit) {
            size = request.limit;
        }
        List<Id> neighbors = request.countOnly ?
                             ImmutableList.of() : results.ids(request.limit);

        HugeTraverser.PathSet paths = new HugeTraverser.PathSet();
        if (request.withPath) {
            paths.addAll(results.paths(request.limit));
        }
        Iterator<Vertex> iter = QueryResults.emptyIterator();
        if (request.withVertex && !request.countOnly) {
            Set<Id> ids = new HashSet<>(neighbors);
            if (request.withPath) {
                for (HugeTraverser.Path p : paths) {
                    ids.addAll(p.vertices());
                }
            }
            if (!ids.isEmpty()) {
                iter = g.vertices(ids.toArray());
            }
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/metrics/MetricsModule.java`
#### Snippet
```java
            json.writeNumberField("mean_rate", meter.getMeanRate() *
                                               this.rateFactor);
            json.writeNumberField("m15_rate", meter.getFifteenMinuteRate() *
                                              this.rateFactor);
            json.writeNumberField("m5_rate", meter.getFiveMinuteRate() *
                                             this.rateFactor);
            json.writeNumberField("m1_rate", meter.getOneMinuteRate() *
                                             this.rateFactor);
            json.writeStringField("rate_unit", this.rateUnit);
            json.writeEndObject();
```

### DuplicatedCode
Duplicated code
in `hugegraph-api/src/main/java/org/apache/hugegraph/metrics/SystemMetrics.java`
#### Snippet
```java
        metrics.put("committed", memoryUsage.getCommitted() / MB);
        metrics.put("init", memoryUsage.getInit() / MB);
        metrics.put("used", memoryUsage.getUsed() / MB);
        metrics.put("max", memoryUsage.getMax() / MB);
        return metrics;
```

### DuplicatedCode
Duplicated code
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraEntryIterator.java`
#### Snippet
```java
            BackendEntry merged = this.merger.apply(this.current, row);
            if (this.current == null) {
                // The first time to read
                this.current = merged;
            } else if (merged == this.current) {
                // The next entry belongs to the current entry
                assert merged != null;
            } else {
                // New entry
                assert this.next == null;
                this.next = merged;
                break;
            }
```

### DuplicatedCode
Duplicated code
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraMetrics.java`
#### Snippet
```java
        appendCacheMetrics(metrics, probe, "KeyCache", "Size");
        appendCacheMetrics(metrics, probe, "KeyCache", "Entries");
        appendCacheMetrics(metrics, probe, "RowCache", "Size");
        appendCacheMetrics(metrics, probe, "RowCache", "Entries");
        appendCacheMetrics(metrics, probe, "CounterCache", "Size");
        appendCacheMetrics(metrics, probe, "CounterCache", "Entries");

        // Compaction Metrics
        appendCompactionMetrics(metrics, probe, "CompletedTasks");
        appendCompactionMetrics(metrics, probe, "PendingTasks");
```

### DuplicatedCode
Duplicated code
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTable.java`
#### Snippet
```java
        if (query.idsSize() == 0) {
            return ImmutableList.of(select);
        }

        List<HugeKeys> nameParts = this.idColumnName();

        List<List<Object>> ids = new ArrayList<>(query.idsSize());
        for (Id id : query.ids()) {
            List<Object> idParts = this.idColumnValue(id);
            if (nameParts.size() != idParts.size()) {
                throw new NotFoundException(
                          "Unsupported ID format: '%s' (should contain %s)",
                          id, nameParts);
            }
            ids.add(idParts);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTables.java`
#### Snippet
```java
            List<Object> idParts = this.idColumnValue(entry.id());
            if (idParts.size() > 1 || entry.columns().size() > 0) {
                super.delete(session, entry);
                return;
            }

            // The only element is labeled
            this.deleteEdgesByLabel(session, entry.id());
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/EntityManager.java`
#### Snippet
```java
        query.eq(HugeKeys.LABEL, vl.id());
        for (Map.Entry<String, Object> entry : conditions.entrySet()) {
            PropertyKey pkey = this.graph().propertyKey(entry.getKey());
            query.query(Condition.eq(pkey.id(), entry.getValue()));
        }
        query.showHidden(true);
        if (limit != NO_LIMIT) {
            query.limit(limit);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/RelationshipManager.java`
#### Snippet
```java
        for (Map.Entry<String, Object> entry : conditions.entrySet()) {
            PropertyKey pk = this.graph().propertyKey(entry.getKey());
            query.query(Condition.eq(pk.id(), entry.getValue()));
        }
        query.showHidden(true);
        if (limit != NO_LIMIT) {
            query.limit(limit);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/LocalCounter.java`
#### Snippet
```java
        AtomicLong counter = this.counters.get(type);
        if (counter == null) {
            counter = new AtomicLong(0);
            AtomicLong previous = this.counters.putIfAbsent(type, counter);
            if (previous != null) {
                counter = previous;
            }
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
        this.checkFlattened();
        List<Condition> conditions = new ArrayList<>();
        for (Condition condition : this.conditions) {
            Relation relation = (Relation) condition;
            if (relation.key().equals(key)) {
                conditions.add(relation);
            }
        }
        return conditions;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            writeIds(HugeKeys.NULLABLE_KEYS, schema.nullableKeys());
            writeIds(HugeKeys.INDEX_LABELS, schema.indexLabels());
            writeBool(HugeKeys.ENABLE_LABEL_INDEX, schema.enableLabelIndex());
            writeEnum(HugeKeys.STATUS, schema.status());
            writeLong(HugeKeys.TTL, schema.ttl());
            writeId(HugeKeys.TTL_START_TIME, schema.ttlStartTime());
            writeUserdata(schema);
            return this.entry;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            vertexLabel.nullableKeys(readIds(HugeKeys.NULLABLE_KEYS));
            vertexLabel.addIndexLabels(readIds(HugeKeys.INDEX_LABELS));
            vertexLabel.enableLabelIndex(readBool(HugeKeys.ENABLE_LABEL_INDEX));
            vertexLabel.status(readEnum(HugeKeys.STATUS, SchemaStatus.class));
            vertexLabel.ttl(readLong(HugeKeys.TTL));
            vertexLabel.ttlStartTime(readId(HugeKeys.TTL_START_TIME));
            readUserdata(vertexLabel);
            return vertexLabel;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TableSerializer.java`
#### Snippet
```java
        EdgeId id = edge.idWithDirection();
        TableBackendEntry.Row row = new TableBackendEntry.Row(edge.type(), id);
        if (edge.hasTtl()) {
            row.ttl(edge.ttl());
            row.column(HugeKeys.EXPIRED_TIME, edge.expiredTime());
        }
        // Id: ownerVertex + direction + edge-label + sortValues + otherVertex
        row.column(HugeKeys.OWNER_VERTEX, this.writeId(id.ownerVertexId()));
        row.column(HugeKeys.DIRECTION, id.directionCode());
        row.column(HugeKeys.LABEL, id.edgeLabelId().asLong());
        row.column(HugeKeys.SORT_VALUES, id.sortValues());
        row.column(HugeKeys.OTHER_VERTEX, this.writeId(id.otherVertexId()));
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TableSerializer.java`
#### Snippet
```java
        entry.column(HugeKeys.NULLABLE_KEYS,
                     this.toLongSet(vertexLabel.nullableKeys()));
        entry.column(HugeKeys.INDEX_LABELS,
                     this.toLongSet(vertexLabel.indexLabels()));
        this.writeEnableLabelIndex(vertexLabel, entry);
        this.writeUserdata(vertexLabel, entry);
        entry.column(HugeKeys.STATUS, vertexLabel.status().code());
        entry.column(HugeKeys.TTL, vertexLabel.ttl());
        entry.column(HugeKeys.TTL_START_TIME,
                     vertexLabel.ttlStartTime().asLong());
        return entry;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TableSerializer.java`
#### Snippet
```java
        vertexLabel.nullableKeys(this.toIdArray(nullableKeys));
        vertexLabel.addIndexLabels(this.toIdArray(indexLabels));
        vertexLabel.status(status);
        vertexLabel.ttl(ttl.longValue());
        vertexLabel.ttlStartTime(this.toId(ttlStartTime));
        this.readEnableLabelIndex(vertexLabel, entry);
        this.readUserdata(vertexLabel, entry);
        return vertexLabel;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TextBackendEntry.java`
#### Snippet
```java
        TextBackendEntry clone;
        try {
            clone = (TextBackendEntry) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new BackendException(e);
        }
        clone.resetColumns();

        // Copy the last count columns
        Iterator<Entry<String, String>> it = this.columns.entrySet().iterator();
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TextSerializer.java`
#### Snippet
```java
        entry.column(HugeKeys.NULLABLE_KEYS,
                     writeIds(vertexLabel.nullableKeys()));
        entry.column(HugeKeys.INDEX_LABELS,
                     writeIds(vertexLabel.indexLabels()));
        entry.column(HugeKeys.ENABLE_LABEL_INDEX,
                     JsonUtil.toJson(vertexLabel.enableLabelIndex()));
        writeUserdata(vertexLabel, entry);
        entry.column(HugeKeys.STATUS,
                     JsonUtil.toJson(vertexLabel.status()));
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/TextSerializer.java`
#### Snippet
```java
        String userdataStr = entry.column(HugeKeys.USER_DATA);
        @SuppressWarnings("unchecked")
        Map<String, Object> userdata = JsonUtil.fromJson(userdataStr,
                                                         Map.class);
        for (Map.Entry<String, Object> e : userdata.entrySet()) {
            schema.userdata(e.getKey(), e.getValue());
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendMutation.java`
#### Snippet
```java
                    if (originAction == Action.INSERT ||
                        originAction == Action.DELETE) {
                        throw incompatibleActionException(action, originAction);
                    } else {
                        Id subId = entry.subId();
                        Id originSubId = originItem.entry().subId();
                        assert subId != null;
                        if (subId == originSubId || subId.equals(originSubId)) {
                            iter.remove();
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
            long size = this.estimateDataSize(session);
            if (size <= 0) {
                size = this.estimateNumKeys(session) * ESTIMATE_BYTES_PER_KV;
            }

            double count = Math.ceil(size / (double) splitSize);
            if (count <= 0) {
                count = 1;
            }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/memory/InMemoryDBTables.java`
#### Snippet
```java
            BackendEntry value = this.getEntryById(start, entries);
            if (value == null) {
                return Collections.emptyMap();
            }

            Map<Id, BackendEntry> rs = InsertionOrderUtil.newMap();

            // TODO: Compatible with BackendEntry
            TextBackendEntry entry = (TextBackendEntry) value;
            // Prefix edges in the vertex
            String startColumn = columnOfEdge(start);
            String prefixColumn = columnOfEdge(prefix);
            BackendEntry edges = new TextBackendEntry(HugeType.VERTEX,
                                                      entry.id());
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftAddPeerJob.java`
#### Snippet
```java
        String input = this.task().input();
        E.checkArgumentNotNull(input, "The input can't be null");
        @SuppressWarnings("unchecked")
        Map<String, Object> map = JsonUtil.fromJson(input, Map.class);

        Object value = map.get("endpoint");
        E.checkArgument(value instanceof String,
                        "Invalid endpoint value '%s'", value);
        String endpoint = (String) value;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/io/GraphSONSchemaSerializer.java`
#### Snippet
```java
        HugeGraph graph = vertexLabel.graph();
        assert graph != null;

        Map<HugeKeys, Object> map = new LinkedHashMap<>();
        map.put(HugeKeys.ID, vertexLabel.id().asLong());
        map.put(HugeKeys.NAME, vertexLabel.name());
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/io/GraphSONSchemaSerializer.java`
#### Snippet
```java
        map.put(HugeKeys.NULLABLE_KEYS,
                graph.mapPkId2Name(vertexLabel.nullableKeys()));
        map.put(HugeKeys.INDEX_LABELS,
                graph.mapIlId2Name(vertexLabel.indexLabels()));
        map.put(HugeKeys.PROPERTIES,
                graph.mapPkId2Name(vertexLabel.properties()));
        map.put(HugeKeys.STATUS, vertexLabel.status());
        map.put(HugeKeys.TTL, vertexLabel.ttl());
        String ttlStartTimeName = vertexLabel.ttlStartTimeName();
        if (ttlStartTimeName != null) {
            map.put(HugeKeys.TTL_START_TIME, ttlStartTimeName);
        }
        map.put(HugeKeys.ENABLE_LABEL_INDEX, vertexLabel.enableLabelIndex());
        map.put(HugeKeys.USER_DATA, vertexLabel.userdata());
        return map;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/AbstractAlgorithm.java`
#### Snippet
```java
        if (direction.equals(Directions.BOTH.toString())) {
            return Directions.BOTH;
        } else if (direction.equals(Directions.OUT.toString())) {
            return Directions.OUT;
        } else if (direction.equals(Directions.IN.toString())) {
            return Directions.IN;
        } else {
            throw new IllegalArgumentException(String.format(
                      "The value of direction must be in [OUT, IN, BOTH], " +
                      "but got '%s'", direction));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/Consumers.java`
#### Snippet
```java
        this.ending = false;
        this.exception = null;
        if (this.executor == null) {
            return;
        }
        LOG.info("Starting {} workers[{}] with queue size {}...",
                 this.workers, name, this.queueSize);
        for (int i = 0; i < this.workers; i++) {
            this.executor.submit(new ContextCallable<>(this::runAndDone));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/CountEdgeAlgorithm.java`
#### Snippet
```java
                String label = edge.label();
                MutableLong count = counts.get(label);
                if (count != null) {
                    count.increment();
                } else {
                    counts.put(label, new MutableLong(1L));
                }
                total++;
                this.updateProgress(total);
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/cent/BetweennessCentralityAlgorithm.java`
#### Snippet
```java
            assert depth > 0;
            assert degree > 0L || degree == NO_LIMIT;
            assert topN >= 0L || topN == NO_LIMIT;

            GraphTraversal<Vertex, Vertex> t = constructSource(sourceLabel,
                                                               sourceSample,
                                                               sourceCLabel);
            t = constructPath(t, direction, label, degree, sample,
                              sourceLabel, sourceCLabel);
            t = t.emit().until(__.loops().is(P.gte(depth)));
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/cent/ClosenessCentralityAlgorithmV2.java`
#### Snippet
```java
            assert depth > 0;
            assert degree > 0L || degree == NO_LIMIT;
            assert topN >= 0L || topN == NO_LIMIT;

            Id edgeLabelId = null;
            if (label != null) {
                edgeLabelId = this.graph().edgeLabel(label).id();
            }

            // TODO: sample the startVertices
            Iterator<Vertex> startVertices = this.vertices(sourceLabel,
                                                           sourceCLabel,
                                                           Query.NO_LIMIT);
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/comm/AbstractCommAlgorithm.java`
#### Snippet
```java
        if (!parameters.containsKey(KEY_STABLE_TIMES)) {
            return (int) DEFAULT_STABLE_TIMES;
        }
        int times = ParameterUtil.parameterInt(parameters, KEY_STABLE_TIMES);
        HugeTraverser.checkPositiveOrNoLimit(times, KEY_STABLE_TIMES);
        E.checkArgument(times <= MAX_TIMES,
                        "The maximum number of stable iterations is %s, " +
                        "but got %s", MAX_TIMES, times);
        return times;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
        Set<Id> existedProperties = existedEdgeLabel.properties();
        if (this.properties.size() != existedProperties.size()) {
            return false;
        }
        for (String key : this.properties) {
            PropertyKey propertyKey = graph.propertyKey(key);
            if (!existedProperties.contains(propertyKey.id())) {
                return false;
            }
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
        Set<Id> existedNullableKeys = existedEdgeLabel.nullableKeys();
        if (this.nullableKeys.size() != existedNullableKeys.size()) {
            return false;
        }
        for (String nullableKeyName : this.nullableKeys) {
            PropertyKey nullableKey = graph.propertyKey(nullableKeyName);
            if (!existedNullableKeys.contains(nullableKey.id())) {
                return false;
            }
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
        this.checkProperties(Action.APPEND);
        this.checkNullableKeys(Action.APPEND);
        Userdata.check(this.userdata, Action.APPEND);

        for (String key : this.properties) {
            PropertyKey propertyKey = this.graph().propertyKey(key);
            edgeLabel.property(propertyKey.id());
        }
        for (String key : this.nullableKeys) {
            PropertyKey propertyKey = this.graph().propertyKey(key);
            edgeLabel.nullableKey(propertyKey.id());
        }
        edgeLabel.userdata(this.userdata);
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
        switch (action) {
            case INSERT:
            case APPEND:
                for (Map.Entry<String, Object> e : this.userdata.entrySet()) {
                    if (e.getValue() == null) {
                        throw new NotAllowException(
                                  "Not allowed pass null userdata value when " +
                                  "create or append edge label");
                    }
                }
                break;
            case ELIMINATE:
            case DELETE:
                // pass
                break;
            default:
                throw new AssertionError(String.format(
                          "Unknown schema action '%s'", action));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeEdge.java`
#### Snippet
```java
                Id pkeyId;
                try {
                    pkeyId = this.graph().propertyKey(key).id();
                } catch (IllegalArgumentException ignored) {
                    continue;
                }
                HugeProperty<?> prop = this.getProperty(pkeyId);
                if (prop == null) {
                    // Not found
                    continue;
                }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CollectionPathsTraverser.java`
#### Snippet
```java
        checkCapacity(capacity);
        checkLimit(limit);

        List<Id> sourceList = newList();
        while (sources.hasNext()) {
            sourceList.add(((HugeVertex) sources.next()).id());
        }
        int sourceSize = sourceList.size();
        E.checkState(sourceSize >= 1 && sourceSize <= MAX_VERTICES,
                     "The number of source vertices must in [1, %s], " +
                     "but got: %s", MAX_VERTICES, sourceList.size());
        List<Id> targetList = newList();
        while (targets.hasNext()) {
            targetList.add(((HugeVertex) targets.next()).id());
        }
        int targetSize = targetList.size();
        E.checkState(targetSize >= 1 && targetSize <= MAX_VERTICES,
                     "The number of target vertices must in [1, %s], " +
                     "but got: %s", MAX_VERTICES, sourceList.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CollectionPathsTraverser.java`
#### Snippet
```java
                        List<Id> path = source.joinPath(target);
                        if (!path.isEmpty()) {
                            Path newPath = new Path(targetV, path);
                            newPath.reverse();
                            this.paths.add(newPath);
                            if (this.reachLimit()) {
                                return;
                            }
                        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/PathsTraverser.java`
#### Snippet
```java
            while (this.record.hasNextKey()) {
                Id vid = this.record.nextKey();
                if (vid.equals(targetV)) {
                    continue;
                }

                edges = edgesOfVertex(vid, direction, this.label, this.degree);

                while (edges.hasNext()) {
                    HugeEdge edge = (HugeEdge) edges.next();
                    Id target = edge.id().otherVertexId();

                    PathSet results = this.record.findPath(target, null,
                                                           true, false);
                    for (Path path : results) {
                        this.paths.add(path);
                        if (this.reachLimit()) {
                            return;
                        }
                    }
                }
            }
            this.record.finishOneLayer();
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/ShortestPathTraverser.java`
#### Snippet
```java
        E.checkNotNull(sourceV, "source vertex id");
        E.checkNotNull(targetV, "target vertex id");
        this.checkVertexExist(sourceV, "source vertex");
        this.checkVertexExist(targetV, "target vertex");
        E.checkNotNull(dir, "direction");
        checkPositive(depth, "max depth");
        checkDegree(degree);
        checkCapacity(capacity);
        checkSkipDegree(skipDegree, degree, capacity);
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStep.java`
#### Snippet
```java
        boolean queryVertex = this.returnsVertex();
        boolean queryEdge = this.returnsEdge();
        assert queryVertex || queryEdge;
        if (queryVertex) {
            this.iterator = (Iterator<E>) this.vertices(traverser);
        } else {
            assert queryEdge;
            this.iterator = (Iterator<E>) this.edges(traverser);
        }
        return this.iterator;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        switch ((Compare) bp) {
            case eq:
                return Condition.eq(key, value);
            case gt:
                return Condition.gt(key, value);
            case gte:
                return Condition.gte(key, value);
            case lt:
                return Condition.lt(key, value);
            case lte:
                return Condition.lte(key, value);
            case neq:
                return Condition.neq(key, value);
            default:
                throw newUnsupportedPredicate(has.getPredicate());
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
        Pattern pattern = Pattern.compile("^P\\.([a-z]+)\\(([\\S ]*)\\)$");
        Matcher matcher = pattern.matcher(predicate);
        if (!matcher.find()) {
            throw new HugeException("Invalid predicate: %s", predicate);
        }

        String method = matcher.group(1);
        String value = matcher.group(2);
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/LockUtil.java`
#### Snippet
```java
        LockManager.instance().create(join(graph, INDEX_LABEL_DELETE));
        LockManager.instance().create(join(graph, EDGE_LABEL_DELETE));
        LockManager.instance().create(join(graph, VERTEX_LABEL_DELETE));
        LockManager.instance().create(join(graph, INDEX_LABEL_REBUILD));
        LockManager.instance().create(join(graph, INDEX_LABEL_ADD_UPDATE));
        LockManager.instance().create(join(graph, EDGE_LABEL_ADD_UPDATE));
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/LockUtil.java`
#### Snippet
```java
        LockManager.instance().destroy(join(graph, INDEX_LABEL_DELETE));
        LockManager.instance().destroy(join(graph, EDGE_LABEL_DELETE));
        LockManager.instance().destroy(join(graph, VERTEX_LABEL_DELETE));
        LockManager.instance().destroy(join(graph, INDEX_LABEL_REBUILD));
        LockManager.instance().destroy(join(graph, INDEX_LABEL_ADD_UPDATE));
        LockManager.instance().destroy(join(graph, EDGE_LABEL_ADD_UPDATE));
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/LockUtil.java`
#### Snippet
```java
            List<Id> newLocks = new ArrayList<>(locks.size());
            Set<Id> locked = locksOfGroup(group);
            for (Id lock : locks) {
                if (!locked.contains(lock)) {
                    newLocks.add(lock);
                }
            }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/CollectionFactory.java`
#### Snippet
```java
        switch (type) {
            case EC:
                return new FastList<>(initialCapacity);
            case JCF:
                return new ArrayList<>(initialCapacity);
            case FU:
                return new ObjectArrayList<>(initialCapacity);
            default:
                throw new AssertionError(
                          "Unsupported collection type: " + type);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/CollectionFactory.java`
#### Snippet
```java
        switch (type) {
            case EC:
                return new UnifiedSet<>(initialCapacity);
            case JCF:
                return new HashSet<>(initialCapacity);
            case FU:
                return new ObjectOpenHashSet<>(initialCapacity);
            default:
                throw new AssertionError(
                          "Unsupported collection type: " + type);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/CollectionFactory.java`
#### Snippet
```java
        switch (type) {
            case EC:
                return new UnifiedMap<>(initialCapacity);
            case JCF:
                return new HashMap<>(initialCapacity);
            case FU:
                return new Object2ObjectOpenHashMap<>(initialCapacity);
            default:
                throw new AssertionError(
                          "Unsupported collection type: " + type);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            this.unsignedSize = capacity;
            this.capacity = this.unsignedSize * 2L;
            this.segmentSize = IntSet.segmentSize(this.capacity, segments);
            this.segmentShift = Integer.numberOfTrailingZeros(this.segmentSize);
            /*
             * The mask is lower bits of each segment size, like
             * segmentSize=4096 (0x1000), segmentMask=4095 (0xfff),
             * NOTE: `-1 >>> 0` or `-1 >>> 32` is -1.
             */
            this.segmentMask = this.segmentShift == 0 ?
                               0 : -1 >>> (32 - this.segmentShift);
            this.creator = creator;
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntSet.java`
#### Snippet
```java
            while (true) {
                long oldV = UNSAFE.getLongVolatile(this.bits, offset);
                long newV = oldV | bitmask;
                if (newV == oldV) {
                    return false;
                }
                // this.bits[index] |= bitmask;
                if (UNSAFE.compareAndSwapLong(this.bits, offset, oldV, newV)) {
                    this.size.incrementAndGet();
                    return true;
                }
            }
```

### DuplicatedCode
Duplicated code
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntSet.java`
#### Snippet
```java
            while (true) {
                long oldV = UNSAFE.getLongVolatile(this.bits, offset);
                long newV = oldV & ~bitmask;
                if (newV == oldV) {
                    return false;
                }
                // this.bits[index] &= ~bitmask
                if (UNSAFE.compareAndSwapLong(this.bits, offset, oldV, newV)) {
                    this.size.decrementAndGet();
                    return true;
                }
            }
```

### DuplicatedCode
Duplicated code
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/Example3.java`
#### Snippet
```java
        Vertex a = graph.addVertex(T.label, "person", T.id, "A", "name", "A");
        Vertex b = graph.addVertex(T.label, "person", T.id, "B", "name", "B");
        Vertex c = graph.addVertex(T.label, "person", T.id, "C", "name", "C");
```

### DuplicatedCode
Duplicated code
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/GraphOfTheMoviesExample.java`
#### Snippet
```java
        keanu.addEdge("ACTED_IN", theMatrix, "roles", "Neo");
        carrie.addEdge("ACTED_IN", theMatrix, "roles", "Trinity");
        laurence.addEdge("ACTED_IN", theMatrix, "roles", "Morpheus");
        hugo.addEdge("ACTED_IN", theMatrix, "roles", "agent Smith");
        lillyW.addEdge("DIRECTED", theMatrix, "score", 10);
        lanaW.addEdge("DIRECTED", theMatrix, "score", 10);
        joelS.addEdge("PRODUCED", theMatrix, "score", 10);
```

### DuplicatedCode
Duplicated code
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExample1.java`
#### Snippet
```java
            LOG.debug("========== random knows & created edges ==========");
            for (int i = 0; i < EDGE_NUM / 2 * multiple; i++) {
                Random random = new Random();

                // Add edge: person --knows-> person
                Object p1 = personIds.get(random.nextInt(PERSON_NUM));
                Object p2 = personIds.get(random.nextInt(PERSON_NUM));
                graph.getVertex(p1).addEdge("knows", graph.getVertex(p2));

                // Add edge: person --created-> software
                Object p3 = personIds.get(random.nextInt(PERSON_NUM));
                Object s1 = softwareIds.get(random.nextInt(SOFTWARE_NUM));
                graph.getVertex(p3).addEdge("created", graph.getVertex(s1));
            }

            try {
                graph.tx().commit();
            } catch (BackendException e) {
                if (e.getCause() instanceof NoHostAvailableException) {
                    LOG.warn("Failed to commit tx: {}", e.getMessage());
                } else {
                    throw e;
                }
            }

            this.vertices.addAll(personIds);
            this.vertices.addAll(softwareIds);

            personIds.clear();
            softwareIds.clear();
```

### DuplicatedCode
Duplicated code
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseStore.java`
#### Snippet
```java
        switch (item.action()) {
            case INSERT:
                table.insert(session, entry);
                break;
            case DELETE:
                table.delete(session, entry);
                break;
            case APPEND:
                table.append(session, entry);
                break;
            case ELIMINATE:
                table.eliminate(session, entry);
                break;
            case UPDATE_IF_PRESENT:
                table.updateIfPresent(session, entry);
                break;
            case UPDATE_IF_ABSENT:
                table.updateIfAbsent(session, entry);
                break;
            default:
                throw new AssertionError(String.format(
                          "Unsupported mutate action: %s", item.action()));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        if (query.empty()) {
            return this.queryAll(session, query);
        }

        // Query by prefix
        if (query instanceof IdPrefixQuery) {
            IdPrefixQuery pq = (IdPrefixQuery) query;
            return this.queryByPrefix(session, pq);
        }

        // Query by range
        if (query instanceof IdRangeQuery) {
            IdRangeQuery rq = (IdRangeQuery) query;
            return this.queryByRange(session, rq);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        if (query.containsScanRelation()) {
            E.checkArgument(query.relations().size() == 1,
                            "Invalid scan with multi conditions: %s", query);
            Relation scan = query.relations().iterator().next();
            Shard shard = (Shard) scan.value();
            return this.queryByRange(session, shard, query.page());
        }
        throw new NotSupportException("query: %s", query);
```

### DuplicatedCode
Duplicated code
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        byte[] start = this.shardSplitter.position(shard.start());
        byte[] end = this.shardSplitter.position(shard.end());
        if (page != null && !page.isEmpty()) {
            byte[] position = PageState.fromString(page).position();
            E.checkArgument(start == null ||
                            Bytes.compare(position, start) >= 0,
                            "Invalid page out of lower bound");
            start = position;
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTable.java`
#### Snippet
```java
        int i = 0;
        int size = entry.columns().size();
        for (HugeKeys key : entry.columns().keySet()) {
            insert.append(formatKey(key));
            if (++i != size) {
                insert.append(", ");
            }
        }
        insert.append(") VALUES (");
        // Fill with '?' as a placeholder
        for (i = 0; i < size; i++) {
            insert.append("?");
            if (i != size - 1) {
                insert.append(", ");
            }
        }
        insert.append(")");
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            this.define.column(HugeKeys.PROPERTIES, SMALL_JSON);
            this.define.column(HugeKeys.NULLABLE_KEYS, SMALL_JSON);
            this.define.column(HugeKeys.INDEX_LABELS, SMALL_JSON);
            this.define.column(HugeKeys.ENABLE_LABEL_INDEX, BOOLEAN);
            this.define.column(HugeKeys.USER_DATA, LARGE_JSON);
            this.define.column(HugeKeys.STATUS, TINYINT);
            this.define.column(HugeKeys.TTL, INT);
            this.define.column(HugeKeys.TTL_START_TIME, DATATYPE_PK);
            this.define.keys(HugeKeys.ID);
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            MysqlBackendEntry current = (MysqlBackendEntry) e1;
            MysqlBackendEntry next = (MysqlBackendEntry) e2;

            E.checkState(current == null || current.type().isVertex(),
                         "The current entry must be null or VERTEX");
            E.checkState(next != null && next.type().isEdge(),
                         "The next entry must be EDGE");

            long maxSize = BackendEntryIterator.INLINE_BATCH_SIZE;
            if (current != null && current.subRows().size() < maxSize) {
                Id nextVertexId = IdGenerator.of(
                                  next.<String>column(HugeKeys.OWNER_VERTEX));
                if (current.id().equals(nextVertexId)) {
                    current.subRow(next.row());
                    return current;
                }
            }

            return this.wrapByVertex(next);
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            assert edge.type().isEdge();
            String ownerVertex = edge.column(HugeKeys.OWNER_VERTEX);
            E.checkState(ownerVertex != null, "Invalid backend entry");
            Id vertexId = IdGenerator.of(ownerVertex);
            MysqlBackendEntry vertex = new MysqlBackendEntry(HugeType.VERTEX,
                                                             vertexId);

            vertex.column(HugeKeys.ID, ownerVertex);
            vertex.column(HugeKeys.PROPERTIES, "");

            vertex.subRow(edge.row());
            return vertex;
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            super(joinTableName(store, table));

            this.define = new TableDefine(typesMapping);
            this.define.column(HugeKeys.INDEX_LABEL_ID, DATATYPE_IL);
            this.define.column(HugeKeys.FIELD_VALUES, NUMERIC);
            this.define.column(HugeKeys.ELEMENT_IDS, SMALL_TEXT);
            this.define.column(HugeKeys.EXPIRED_TIME, BIGINT);
            this.define.keys(HugeKeys.INDEX_LABEL_ID,
                             HugeKeys.FIELD_VALUES,
                             HugeKeys.ELEMENT_IDS);
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
            super(store, table);

            this.define = new TableDefine(typesMapping);
            this.define.column(HugeKeys.INDEX_LABEL_ID, DATATYPE_IL);
            this.define.column(HugeKeys.FIELD_VALUES, INT);
            this.define.column(HugeKeys.ELEMENT_IDS, SMALL_TEXT);
            this.define.column(HugeKeys.EXPIRED_TIME, BIGINT);
            this.define.keys(HugeKeys.INDEX_LABEL_ID,
                             HugeKeys.FIELD_VALUES,
                             HugeKeys.ELEMENT_IDS);
```

### DuplicatedCode
Duplicated code
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/WhereBuilder.java`
#### Snippet
```java
        for (int i = 0, n = values.size(); i < n; i++) {
            this.builder.append(wrapStringIfNeeded(values.get(i)));
            if (i != n - 1) {
                this.builder.append(", ");
            }
        }
        this.builder.append(")");
        return this;
```

### DuplicatedCode
Duplicated code
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
            this.define.column(HugeKeys.PROPERTIES, VARCHAR, DEFAULT_EMPTY);
            this.define.column(HugeKeys.NULLABLE_KEYS, VARCHAR, DEFAULT_EMPTY);
            this.define.column(HugeKeys.INDEX_LABELS, VARCHAR, DEFAULT_EMPTY);
            this.define.column(HugeKeys.ENABLE_LABEL_INDEX, TINYINT, NOT_NULL);
            this.define.column(HugeKeys.USER_DATA, VARCHAR, DEFAULT_EMPTY);
            this.define.column(HugeKeys.STATUS, TINYINT, NOT_NULL);
            this.define.column(HugeKeys.TTL, INT, NOT_NULL);
            this.define.column(HugeKeys.TTL_START_TIME, INT);
            // Unique keys/hash keys
            this.define.keys(HugeKeys.ID);
```

### DuplicatedCode
Duplicated code
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
            super(joinTableName(store, table));

            this.define = new TableDefine();
            this.define.column(HugeKeys.INDEX_LABEL_ID, INT, NOT_NULL);
            this.define.column(HugeKeys.FIELD_VALUES, DECIMAL, NOT_NULL);
            this.define.column(HugeKeys.ELEMENT_IDS, VARCHAR, NOT_NULL);
            // Unique keys/hash keys
            this.define.keys(HugeKeys.INDEX_LABEL_ID,
                             HugeKeys.FIELD_VALUES,
                             HugeKeys.ELEMENT_IDS);
```

### DuplicatedCode
Duplicated code
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBMetrics.java`
#### Snippet
```java
        this.appendMetricsNumber(metrics, NUM_KEYS);
        this.appendMetricsNumber(metrics, NUM_KEYS_MEM_TABLE);
        this.appendMetricsNumber(metrics, NUM_KEYS_IMM_MEM_TABLE);
        this.appendMetricsNumber(metrics, NUM_DELETES_MEM_TABLE);
        this.appendMetricsNumber(metrics, NUM_DELETES_IMM_MEM_TABLE);
        this.appendMetricsNumber(metrics, RUNNING_FLUSHS);
        this.appendMetricsNumber(metrics, MEM_TABLE_FLUSH_PENDINF);
```

### DuplicatedCode
Duplicated code
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
            super(provider, database, store);

            registerTableManager(HugeType.VERTEX,
                                 new RocksDBTables.Vertex(database));

            registerTableManager(HugeType.EDGE_OUT,
                                 RocksDBTables.Edge.out(database));
            registerTableManager(HugeType.EDGE_IN,
                                 RocksDBTables.Edge.in(database));

            registerTableManager(HugeType.SECONDARY_INDEX,
                                 new RocksDBTables.SecondaryIndex(database));
            registerTableManager(HugeType.VERTEX_LABEL_INDEX,
                                 new RocksDBTables.VertexLabelIndex(database));
            registerTableManager(HugeType.EDGE_LABEL_INDEX,
                                 new RocksDBTables.EdgeLabelIndex(database));
            registerTableManager(HugeType.RANGE_INT_INDEX,
                                 new RocksDBTables.RangeIntIndex(database));
            registerTableManager(HugeType.RANGE_FLOAT_INDEX,
                                 new RocksDBTables.RangeFloatIndex(database));
            registerTableManager(HugeType.RANGE_LONG_INDEX,
                                 new RocksDBTables.RangeLongIndex(database));
            registerTableManager(HugeType.RANGE_DOUBLE_INDEX,
                                 new RocksDBTables.RangeDoubleIndex(database));
            registerTableManager(HugeType.SEARCH_INDEX,
                                 new RocksDBTables.SearchIndex(database));
            registerTableManager(HugeType.SHARD_INDEX,
                                 new RocksDBTables.ShardIndex(database));
            registerTableManager(HugeType.UNIQUE_INDEX,
                                 new RocksDBTables.UniqueIndex(database));
```

### DuplicatedCode
Duplicated code
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
            String name = this.olapTableName(id);
            RocksDBTable table = this.table(name);
            RocksDBSessions db = this.db(HugeType.OLAP);
            if (!db.existsTable(table.table())) {
                throw new HugeException("Not exist table '%s''", name);
            }
            this.dropTable(db, table.table());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
            String path = URL_PREFIX + urlSuffix;
            String type = urlSuffix.substring(urlSuffix.lastIndexOf('/') + 1);
            Response r = client.get(path);
            String content = assertResponseStatus(200, r);
            @SuppressWarnings("rawtypes")
            List<Map> list = readList(content, type, Map.class);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/EdgeApiTest.java`
#### Snippet
```java
        String outVId = getVertexId("person", "name", "peter");
        String inVId = getVertexId("software", "name", "lop");

        String edge = String.format("{" +
                "\"label\": \"created\"," +
                "\"outVLabel\": \"person\"," +
                "\"inVLabel\": \"software\"," +
                "\"outV\": \"%s\"," +
                "\"inV\": \"%s\"," +
                "\"properties\":{" +
                "\"date\": \"20170324\"," +
                "\"weight\": 0.5}" +
                "}", outVId, inVId);
        Response r = client().post(path, edge);
        assertResponseStatus(201, r);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/EdgeApiTest.java`
#### Snippet
```java
        String outVId = getVertexId("person", "name", "peter");
        String inVId = getVertexId("software", "name", "lop");

        String edge = String.format("{" +
                "\"label\": \"created\"," +
                "\"outVLabel\": \"person\"," +
                "\"inVLabel\": \"software\"," +
                "\"outV\": \"%s\"," +
                "\"inV\": \"%s\"," +
                "\"properties\":{" +
                "\"date\": \"20170324\"," +
                "\"weight\": 0.5}" +
                "}", outVId, inVId);
        Response r = client().post(path, edge);
        String content = assertResponseStatus(201, r);

        String id = parseId(content);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                    String key = (String) e.getKey();
                    value = e.getValue();
                    Assert.assertTrue(String.format(
                                      "Expect map value for key %s but got %s",
                                      key, value),
                                      value instanceof Map);
                    host = (Map<?, ?>) value;
                    assertMapContains(host, "mem_max");
                    assertMapContains(host, "mem_committed");
                    assertMapContains(host, "mem_used");
                    assertMapContains(host, "mem_used_readable");
                    assertMapContains(host, "mem_unit");

                    assertMapContains(host, "disk_usage");
                    assertMapContains(host, "disk_usage_readable");
                    assertMapContains(host, "disk_usage_details");
                    assertMapContains(host, "disk_unit");

                    assertMapContains(host, "uptime");
                    assertMapContains(host, "uptime_readable");
                    assertMapContains(host, "time_unit");

                    assertMapContains(host, "estimated_partition_count");
                    assertMapContains(host, "dropped_mutations");
                    assertMapContains(host, "pending_flushes");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                    assertMapContains(host, "key_cache_size");
                    assertMapContains(host, "key_cache_entries");
                    assertMapContains(host, "row_cache_size");
                    assertMapContains(host, "row_cache_entries");
                    assertMapContains(host, "counter_cache_size");
                    assertMapContains(host, "counter_cache_entries");

                    assertMapContains(host, "compaction_completed_tasks");
                    assertMapContains(host, "compaction_pending_tasks");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                    assertMapContains(host, "live_nodes");
                    assertMapContains(host, "joining_nodes");
                    assertMapContains(host, "moving_nodes");
                    assertMapContains(host, "leaving_nodes");
                    assertMapContains(host, "unreachable_nodes");

                    assertMapContains(host, "keyspaces");
                    assertMapContains(host, "num_tables");
                    assertMapContains(host, "exception_count");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/traversers/AdamicAdarAPITest.java`
#### Snippet
```java
        Map<String, String> name2Ids = listAllVertexName2Ids();

        String markoId = name2Ids.get("marko");
        String joshId = name2Ids.get("josh");
        Response r = client().get(PATH, ImmutableMap.of("vertex",
                                                        id2Json(markoId),
                                                        "other",
                                                        id2Json(joshId)));
        String content = assertResponseStatus(200, r);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        HugeGraph graph = graph();
        AuthManager authManager = graph.authManager();

        Id id = authManager.createUser(makeUser("tom", "pass1"));

        HugeUser user = authManager.getUser(id);
        Assert.assertEquals("tom", user.name());
        Assert.assertEquals("pass1", user.password());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        HugeGraph graph = graph();
        AuthManager authManager = graph.authManager();

        Id user = authManager.createUser(makeUser("tom", "pass1"));
        Id group1 = authManager.createGroup(makeGroup("group1"));
        Id group2 = authManager.createGroup(makeGroup("group2"));

        Id id1 = authManager.createBelong(makeBelong(user, group1));
        Id id2 = authManager.createBelong(makeBelong(user, group2));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        Assert.assertEquals(2, belongs.size());
        Assert.assertEquals(user, belongs.get(0).source());
        Assert.assertEquals(user, belongs.get(1).source());
        Assert.assertEquals(group1, belongs.get(0).target());
        Assert.assertEquals(group2, belongs.get(1).target());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        Id id = authManager.createAccess(makeAccess(group, target,
                                                    HugePermission.READ));

        HugeAccess access = authManager.getAccess(id);
        Assert.assertEquals(group, access.source());
        Assert.assertEquals(target, access.target());
        Assert.assertEquals(HugePermission.READ, access.permission());
        Assert.assertEquals(access.create(), access.update());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        expected.putAll(ImmutableMap.of("id", access.id(),
                                        "group", group1,
                                        "target", target1,
                                        "access_permission",
                                        HugePermission.READ,
                                        "access_creator", "admin"));
        expected.putAll(ImmutableMap.of("access_create", access.create(),
                                        "access_update", access.update()));
        Assert.assertEquals(expected, access.asMap());

        access = authManager.getAccess(id2);
        Assert.assertEquals(group1, access.source());
        Assert.assertEquals(target1, access.target());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        expected.putAll(ImmutableMap.of("access_create", access.create(),
                                        "access_update", access.update()));
        Assert.assertEquals(expected, access.asMap());

        access = authManager.getAccess(id3);
        Assert.assertEquals(group1, access.source());
        Assert.assertEquals(target2, access.target());
        Assert.assertEquals(HugePermission.READ, access.permission());
        Assert.assertEquals(access.create(), access.update());

        expected = new HashMap<>();
        expected.putAll(ImmutableMap.of("id", access.id(),
                                        "group", group1,
                                        "target", target2,
                                        "access_permission",
                                        HugePermission.READ,
                                        "access_creator", "admin"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/AuthTest.java`
#### Snippet
```java
        HugeGraph graph = graph();
        AuthManager authManager = graph.authManager();

        Id group = authManager.createGroup(makeGroup("group1"));
        Id target1 = authManager.createTarget(makeTarget("graph1", "url1"));
        Id target2 = authManager.createTarget(makeTarget("graph2", "url2"));

        Id id1 = authManager.createAccess(makeAccess(group, target1,
                                                     HugePermission.READ));
        Id id2 = authManager.createAccess(makeAccess(group, target2,
                                                     HugePermission.READ));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/BaseCoreTest.java`
#### Snippet
```java
        schema.getIndexLabels().forEach(elem -> {
            schema.indexLabel(elem.name()).remove();
        });

        schema.getEdgeLabels().forEach(elem -> {
            schema.edgeLabel(elem.name()).remove();
        });

        schema.getVertexLabels().forEach(elem -> {
            schema.vertexLabel(elem.name()).remove();
        });

        schema.getPropertyKeys().forEach(elem -> {
            schema.propertyKey(elem.name()).remove();
        });
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();
        schema.vertexLabel("person")
              .properties("name", "age", "city")
              .primaryKeys("name")
              .create();
        schema.vertexLabel("book").properties("id", "name")
              .primaryKeys("id").create();
        EdgeLabel look = schema.edgeLabel("look").multiTimes()
                               .properties("time")
                               .link("person", "book")
                               .sortKeys("time")
                               .create();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        Assert.assertNotNull(look);
        Assert.assertEquals("look", look.name());
        assertVLEqual("person", look.sourceLabel());
        assertVLEqual("book", look.targetLabel());
        Assert.assertEquals(2, look.properties().size());
        assertContainsPk(look.properties(), "time", "weight");
        Assert.assertEquals(1, look.nullableKeys().size());
        assertContainsPk(look.nullableKeys(), "weight");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();
        schema.vertexLabel("person")
              .properties("name", "age", "city")
              .primaryKeys("name")
              .create();
        schema.vertexLabel("author").properties("id", "name")
              .primaryKeys("id").create();
        schema.vertexLabel("book").properties("id", "name")
              .primaryKeys("id").create();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        Vertex marko = graph().addVertex(T.label, "person", "name", "marko",
                                         "age", 22);
        Vertex java = graph().addVertex(T.label, "book",
                                        "name", "java in action");
        Vertex hadoop = graph().addVertex(T.label, "book",
                                          "name", "hadoop mapreduce");

        marko.addEdge("write", java, "time", "2016-12-12", "weight", 0.3);
        marko.addEdge("write", hadoop, "time", "2014-2-28", "weight", 0.5);
        graph().tx().commit();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        Vertex hadoop = graph().addVertex(T.label, "book",
                                          "name", "hadoop mapreduce");

        marko.addEdge("write", java, "time", "2016-12-12",
                      "weight", 0.3);
        marko.addEdge("write", hadoop, "time", "2014-2-28",
                      "weight", 0.5);
        graph().tx().commit();

        List<Edge> edges = graph().traversal().E().hasLabel("write").toList();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        assertVLEqual("person", read.sourceLabel());
        assertVLEqual("book", read.targetLabel());
        Assert.assertEquals(2, read.properties().size());
        assertContainsPk(read.properties(), "date", "weight");
        Assert.assertEquals(0, read.sortKeys().size());
        Assert.assertEquals(Frequency.SINGLE, read.frequency());
        Assert.assertEquals(86400L, read.ttl());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        Vertex baby = graph().addVertex(T.label, "person", "name", "Baby",
                                        "age", 3, "city", "Beijing");
        Vertex java = graph().addVertex(T.label, "book", "id", 123456,
                                        "name", "Java in action");

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            // Absent 'time'
            baby.addEdge("look", java, "weight", 0.5);
        });
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();

        schema.vertexLabel("person")
              .properties("name", "age", "city")
              .primaryKeys("name")
              .nullableKeys("city")
              .create();

        schema.vertexLabel("book")
              .properties("name")
              .primaryKeys("name")
              .create();

        schema.edgeLabel("write").link("person", "book")
              .properties("time", "weight")
              .create();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/EdgeLabelCoreTest.java`
#### Snippet
```java
        Assume.assumeFalse("Support query by label",
                           storeFeatures().supportsQueryByLabel());

        initDataWithoutLabelIndex();

        // Not support query by label
        Assert.assertThrows(NoIndexException.class, () -> {
            graph().traversal().E().hasLabel("read").toList();
        }, e -> {
            Assert.assertTrue(
                   e.getMessage().startsWith("Don't accept query by label") &&
                   e.getMessage().endsWith("label index is disabled"));
        });

        // Query by property index is ok
        List<Edge> edges = graph().traversal().E()
                                  .has("date", P.lt("2019-12-30 13:00:00"))
                                  .toList();
        Assert.assertEquals(20, edges.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(HugeType.VERTEX_LABEL, personByName.baseType());
        Assert.assertEquals(HugeType.VERTEX_LABEL, personByCity.baseType());
        Assert.assertEquals(HugeType.VERTEX_LABEL, personByAge.baseType());
        Assert.assertEquals(HugeType.VERTEX_LABEL, personByBorn.baseType());
        Assert.assertEquals(HugeType.VERTEX_LABEL, personByFans.baseType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();
        schema.vertexLabel("author").properties("id", "name")
              .primaryKeys("id").create();
        schema.vertexLabel("book").properties("name")
              .primaryKeys("name").create();
        schema.edgeLabel("authored").singleTime().link("author", "book")
              .properties("contribution").create();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        HugeGraph graph = graph();
        SchemaManager schema = graph.schema();
        schema.vertexLabel("person").properties("name", "age", "city")
              .primaryKeys("name").create();
        graph.addVertex(T.label, "person", "name", "Baby",
                        "city", "Hongkong", "age", 3);
        graph.tx().commit();

        schema.indexLabel("personByCity").onV("person").secondary()
              .by("city").create();
        schema.indexLabel("personByAge").onV("person").range()
              .by("age").create();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            schema.indexLabel("personByAgeSecondary").onV("person").secondary()
                  .by("age").create();
        });

        List<Vertex> vertices;
        vertices = graph.traversal().V().has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
        vertices = graph.traversal().V().has("city", "Hongkong").toList();
        Assert.assertEquals(1, vertices.size());

        vertices = graph().traversal().V().has("city", "Hongkong")
                          .has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        schema.getIndexLabel("personByAge");

        vertices = graph.traversal().V().has("city", "Hongkong").toList();
        Assert.assertEquals(1, vertices.size());
        vertices = graph.traversal().V().has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
        vertices = graph.traversal().V().has("city", "Hongkong")
                        .has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        vertices = graph.traversal().V().has("city", "Hongkong").toList();
        Assert.assertEquals(1, vertices.size());
        vertices = graph.traversal().V().has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
        vertices = graph.traversal().V().has("city", "Hongkong")
                        .has("age", 3).toList();
        Assert.assertEquals(1, vertices.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        Assume.assumeTrue("Not support range condition query",
                          storeFeatures().supportsQueryWithRangeCondition());
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();
        schema.vertexLabel("person").properties("name", "age", "city")
              .primaryKeys("name").create();
        schema.indexLabel("personByCity").onV("person").secondary()
              .by("city").create();
        schema.indexLabel("personByAge").onV("person").range()
              .by("age").create();
        VertexLabel person = schema.getVertexLabel("person");

        Assert.assertEquals(2, person.indexLabels().size());
        assertContainsIl(person.indexLabels(), "personByCity", "personByAge");

        graph().addVertex(T.label, "person", "name", "Baby",
                          "city", "Hongkong", "age", 3);
        graph().tx().commit();

        Vertex vertex = graph().traversal().V().hasLabel("person")
                        .has("city", "Hongkong").next();
        Assert.assertNotNull(vertex);
        vertex = graph().traversal().V().hasLabel("person")
                 .has("age", P.inside(2, 4)).next();
        Assert.assertNotNull(vertex);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        Assume.assumeFalse("Support query by label",
                           storeFeatures().supportsQueryByLabel());

        initDataWithoutLabelIndex();

        // Not support query by label
        Assert.assertThrows(NoIndexException.class, () -> {
            graph().traversal().V().hasLabel("reader").toList();
        }, e -> {
            Assert.assertTrue(
                   e.getMessage().startsWith("Don't accept query by label") &&
                   e.getMessage().endsWith("label index is disabled"));
        });

        // Query by property index is ok
        List<Vertex> vertices = graph().traversal().V()
                                       .has("city", "Shanghai").toList();
        Assert.assertEquals(10, vertices.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/IndexLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();
        schema.vertexLabel("person")
              .properties("id", "name", "age", "city")
              .primaryKeys("id")
              .create();

        IndexLabel personByName = schema.indexLabel("personByName")
                                        .onV("person").secondary().by("name")
                                        .userdata("min", 0)
                                        .userdata("max", 100)
                                        .create();
        Assert.assertEquals(3, personByName.userdata().size());
        Assert.assertEquals(0, personByName.userdata().get("min"));
        Assert.assertEquals(100, personByName.userdata().get("max"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/MultiGraphsTest.java`
#### Snippet
```java
        for (PropertyKey copied : g2.schema().getPropertyKeys()) {
            PropertyKey origin = g1.schema().getPropertyKey(copied.name());
            Assert.assertTrue(origin.hasSameContent(copied));
        }
        for (VertexLabel copied : schema.getVertexLabels()) {
            VertexLabel origin = g1.schema().getVertexLabel(copied.name());
            Assert.assertTrue(origin.hasSameContent(copied));
        }
        for (EdgeLabel copied : schema.getEdgeLabels()) {
            EdgeLabel origin = g1.schema().getEdgeLabel(copied.name());
            Assert.assertTrue(origin.hasSameContent(copied));

        }
        for (IndexLabel copied : schema.getIndexLabels()) {
            IndexLabel origin = g1.schema().getIndexLabel(copied.name());
            Assert.assertTrue(origin.hasSameContent(copied));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        Assume.assumeTrue("Not support olap properties",
                          storeFeatures().supportsOlapProperties());

        SchemaManager schema = graph().schema();
        PropertyKey olap = schema.propertyKey("olap")
                                 .asText().valueSingle()
                                 .writeType(WriteType.OLAP_COMMON)
                                 .ifNotExist().create();

        Assert.assertEquals("olap", olap.name());
        Assert.assertEquals(DataType.TEXT, olap.dataType());
        Assert.assertEquals(Cardinality.SINGLE, olap.cardinality());
        Assert.assertEquals(WriteType.OLAP_COMMON, olap.writeType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        Assert.assertEquals("olap", olap.name());
        Assert.assertEquals(DataType.TEXT, olap.dataType());
        Assert.assertEquals(Cardinality.SINGLE, olap.cardinality());
        Assert.assertEquals(WriteType.OLAP_COMMON, olap.writeType());

        PropertyKey pagerank = schema.propertyKey("pagerank")
                                     .asDouble().valueSingle()
                                     .writeType(WriteType.OLAP_RANGE)
                                     .ifNotExist().create();

        Assert.assertEquals("pagerank", pagerank.name());
        Assert.assertEquals(DataType.DOUBLE, pagerank.dataType());
        Assert.assertEquals(Cardinality.SINGLE, pagerank.cardinality());
        Assert.assertEquals(WriteType.OLAP_RANGE, pagerank.writeType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        PropertyKey pagerank = schema.propertyKey("pagerank")
                                     .asDouble().valueSingle()
                                     .writeType(WriteType.OLAP_RANGE)
                                     .ifNotExist().create();

        Assert.assertEquals("pagerank", pagerank.name());
        Assert.assertEquals(DataType.DOUBLE, pagerank.dataType());
        Assert.assertEquals(Cardinality.SINGLE, pagerank.cardinality());
        Assert.assertEquals(WriteType.OLAP_RANGE, pagerank.writeType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        Assert.assertEquals("pagerank", pagerank.name());
        Assert.assertEquals(DataType.DOUBLE, pagerank.dataType());
        Assert.assertEquals(Cardinality.SINGLE, pagerank.cardinality());
        Assert.assertEquals(WriteType.OLAP_RANGE, pagerank.writeType());

        PropertyKey wcc = schema.propertyKey("wcc")
                                .asText().valueSingle()
                                .writeType(WriteType.OLAP_SECONDARY)
                                .ifNotExist().create();

        Assert.assertEquals("wcc", wcc.name());
        Assert.assertEquals(DataType.TEXT, wcc.dataType());
        Assert.assertEquals(Cardinality.SINGLE, wcc.cardinality());
        Assert.assertEquals(WriteType.OLAP_SECONDARY, wcc.writeType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        PropertyKey wcc = schema.propertyKey("wcc")
                                .asText().valueSingle()
                                .writeType(WriteType.OLAP_SECONDARY)
                                .ifNotExist().create();

        Assert.assertEquals("wcc", wcc.name());
        Assert.assertEquals(DataType.TEXT, wcc.dataType());
        Assert.assertEquals(Cardinality.SINGLE, wcc.cardinality());
        Assert.assertEquals(WriteType.OLAP_SECONDARY, wcc.writeType());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyKeyCoreTest.java`
#### Snippet
```java
        SchemaManager schema = graph().schema();

        PropertyKey age = schema.propertyKey("age")
                                .userdata("min", 0)
                                .userdata("max", 100)
                                .create();
        Assert.assertEquals(3, age.userdata().size());
        Assert.assertEquals(0, age.userdata().get("min"));
        Assert.assertEquals(100, age.userdata().get("max"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
HugeGraph graph = this.graph();

        // insert vertices and edges
        for (int i = 0; i < 100; i++) {
            Vertex v1 = graph.addVertex(T.label, "vl1", T.id, i);
            Vertex v2 = graph.addVertex(T.label, "vl1", T.id, i + 100);
            v1.addEdge("el1", v2);
        }
        graph.tx().commit();

        for (int i = 1000; i < 1100; i++) {
            Vertex v1 = graph.addVertex(T.label, "vl2", T.id, i);
            Vertex v2 = graph.addVertex(T.label, "vl2", T.id, i + 100);
            v1.addEdge("el2", v2);
        }
        graph.tx().commit();

        // reload ramtable
        Whitebox.invoke(graph.getClass(), "reloadRamtable", graph);

        // query edges
        for (int i = 0; i < 100; i++) {
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el1", edge.label());

            Assert.assertFalse(edges.hasNext());
        }
        for (int i = 1000; i < 1100; i++) {
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el2", edge.label());

            Assert.assertFalse(edges.hasNext());
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        for (int i = 0; i < 100; i++) {
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el1", edge.label());

            Assert.assertFalse(edges.hasNext());
        }
        for (int i = 1000; i < 1100; i++) {
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el2", edge.label());

            Assert.assertFalse(edges.hasNext());
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el1", edge.label());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el2", edge.label());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Assert.assertEquals("el1", edge.label());

            Assert.assertTrue(edges.hasNext());
            edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 200, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el1", edge.label());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(i),
                                                      Directions.BOTH, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 100, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Assert.assertEquals("el2", edge.label());

            Assert.assertTrue(edges.hasNext());
            edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 200, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el2", edge.label());

            Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            Assert.assertTrue(edges.hasNext());
            edge = (HugeEdge) edges.next();
            Assert.assertEquals(i + 200, edge.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge.direction());
            Assert.assertEquals("el2", edge.label());

            Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
            long source = i + big1;
            Iterator<Edge> edges = this.edgesOfVertex(IdGenerator.of(source),
                                                      Directions.OUT, null);
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge = (HugeEdge) edges.next();
            Assert.assertEquals(source,
                                edge.id().ownerVertexId().asLong());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(3L, vertex.id().asObject());
        Assert.assertEquals("C", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(4L, vertex.id().asObject());
        Assert.assertEquals("D", vertex.value("name"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.OUT, edge.id().direction());
        Assert.assertEquals("bc", edge.value("name"));
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.OUT, edge.id().direction());
        Assert.assertEquals("bd", edge.value("name"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(4L, vertex.id().asObject());
        Assert.assertEquals("D", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(5L, vertex.id().asObject());
        Assert.assertEquals("E", vertex.value("name"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.OUT, edge.id().direction());
        Assert.assertEquals("cd", edge.value("name"));
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.OUT, edge.id().direction());
        Assert.assertEquals("ce", edge.value("name"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(5L, vertex.id().asObject());
        Assert.assertEquals("E", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(2L, vertex.id().asObject());
        Assert.assertEquals("B", vertex.value("name"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(2L, vertex.id().asObject());
        Assert.assertEquals("B", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(3L, vertex.id().asObject());
        Assert.assertEquals("C", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(6L, vertex.id().asObject());
        Assert.assertEquals("F", vertex.value("name"));
        Assert.assertFalse(vertices.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(3L, vertex.id().asObject());
        Assert.assertEquals("C", vertex.value("name"));
        Assert.assertTrue(vertices.hasNext());
        vertex = (HugeVertex) vertices.next();
        Assert.assertEquals(6L, vertex.id().asObject());
        Assert.assertEquals("F", vertex.value("name"));
        Assert.assertFalse(vertices.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.IN, edge.id().direction());
        Assert.assertEquals("bd", edge.value("name"));
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.IN, edge.id().direction());
        Assert.assertEquals("cd", edge.value("name"));
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.IN, edge.id().direction());
        Assert.assertEquals("fd", edge.value("name"));
        Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RamTableTest.java`
#### Snippet
```java
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.IN, edge.id().direction());
        Assert.assertEquals("ce", edge.value("name"));
        Assert.assertTrue(edges.hasNext());
        edge = (HugeEdge) edges.next();
        Assert.assertEquals(Directions.IN, edge.id().direction());
        Assert.assertEquals("de", edge.value("name"));
        Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/RestoreCoreTest.java`
#### Snippet
```java
        HugeGraph graph = graph();
        graph.schema().propertyKey("name").create();
        graph.schema().propertyKey("city").create();
        graph.schema().vertexLabel("person").properties("name", "city")
             .primaryKeys("name").create();
        graph.mode(GraphMode.RESTORING);
        graph.schema().indexLabel("personByCity")
             .onV("person").by("city").secondary().id(100L)
             .create();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/TaskCoreTest.java`
#### Snippet
```java
        task = scheduler.task(task.id());
        scheduler.cancel(task);

        task = scheduler.task(task.id());
        Assert.assertEquals(TaskStatus.CANCELLING, task.status());

        task = scheduler.waitUntilTaskCompleted(task.id(), 10);
        Assert.assertEquals(TaskStatus.CANCELLED, task.status());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexLabelCoreTest.java`
#### Snippet
```java
        Assert.assertNotNull(person);
        Assert.assertEquals("person", person.name());
        Assert.assertEquals(3, person.properties().size());
        assertContainsPk(person.properties(), "name", "age", "city");
        Assert.assertEquals(1, person.primaryKeys().size());
        assertContainsPk(person.primaryKeys(), "name");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexLabelCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(4, person.properties().size());
        assertContainsPk(person.properties(), "name", "age", "city", "born");
        Assert.assertEquals(0, person.primaryKeys().size());
        Assert.assertEquals(IdStrategy.AUTOMATIC, person.idStrategy());
        Assert.assertEquals(86400L, person.ttl());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexLabelCoreTest.java`
#### Snippet
```java
        super.initPropertyKeys();
        SchemaManager schema = graph().schema();

        VertexLabel player = schema.vertexLabel("player")
                                   .properties("name")
                                   .userdata("super_vl", "person")
                                   .create();
        Assert.assertEquals(2, player.userdata().size());
        Assert.assertEquals("person", player.userdata().get("super_vl"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/ProcessBasicSuite.java`
#### Snippet
```java
        Statement wrappedStatement = new Statement() {
            @Override
            public void evaluate() throws Throwable {
                statement.evaluate();
                GraphProvider gp = GraphManager.setGraphProvider(null);
                ((TestGraphProvider) gp).clear();
                GraphManager.setGraphProvider(gp);
            }
        };
        return super.withAfterClasses(wrappedStatement);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
                schema.vertexLabel(defaultVL)
                      .properties("__id", "oid", "name", "state", "status",
                                  "some", "that", "any", "this", "lang", "b",
                                  "communityIndex", "test", "testing", "acl",
                                  "favoriteColor", "aKey", "age", "boolean",
                                  "float", "double", "string", "integer",
                                  "long", "myId", "location", "x", "y", "s",
                                  "n", "d", "f", "i", "l", "p", "k", "to-change",
                                  "to-remove", "to-keep", "old", "new",
                                  "gremlin.partitionGraphStrategy.partition",
                                  "color", "blah")
                      .nullableKeys("__id", "oid", "name", "state", "status",
                                    "some", "that", "any", "this", "lang", "b",
                                    "communityIndex", "test", "testing", "acl",
                                    "favoriteColor", "aKey", "age", "boolean",
                                    "float", "double", "string", "integer",
                                    "long", "myId", "location", "x", "y", "s",
                                    "n", "d", "f", "i", "l", "p", "k", "to-change",
                                    "to-remove", "to-keep", "old", "new",
                                    "gremlin.partitionGraphStrategy.partition",
                                    "color", "blah")
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/FakeObjects.java`
#### Snippet
```java
PropertyKey name = this.newPropertyKey(IdGenerator.of(1), "name");
        PropertyKey age = this.newPropertyKey(IdGenerator.of(2), "age",
                                              DataType.INT,
                                              Cardinality.SINGLE);
        PropertyKey city = this.newPropertyKey(IdGenerator.of(3), "city");
        PropertyKey date = this.newPropertyKey(IdGenerator.of(4), "date",
                                               DataType.DATE);
        PropertyKey weight = this.newPropertyKey(IdGenerator.of(5),
                                                 "weight", DataType.DOUBLE);

        VertexLabel vl = this.newVertexLabel(IdGenerator.of(1), "person",
                                             IdStrategy.CUSTOMIZE_NUMBER,
                                             name.id(), age.id(), city.id());

        EdgeLabel el = this.newEdgeLabel(IdGenerator.of(1), "knows",
                                         Frequency.SINGLE,  vl.id(), vl.id(),
                                         date.id(), weight.id());

        HugeVertex source = new HugeVertex(this.graph(),
                                           IdGenerator.of(sourceVertexId), vl);
        source.addProperty(name, "tom");
        source.addProperty(age, 18);
        source.addProperty(city, "Beijing");

        HugeVertex target = new HugeVertex(this.graph(),
                                           IdGenerator.of(targetVertexId), vl);
        target.addProperty(name, "cat");
        target.addProperty(age, 20);
        target.addProperty(city, "Shanghai");

        Id id = EdgeId.parse("L123456>1>>L987654");
        HugeEdge edge = new HugeEdge(this.graph(), id, el);

        Whitebox.setInternalState(edge, "sourceVertex", source);
        Whitebox.setInternalState(edge, "targetVertex", target);
        edge.assignId();
        edge.addProperty(date, new Date());
        edge.addProperty(weight, 0.75);

        return edge;
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CacheManagerTest.java`
#### Snippet
```java
        CacheManager manager = CacheManager.instance();

        Mockito.when(this.mockCaches.containsKey(name)).thenReturn(false);
        @SuppressWarnings("rawtypes")
        final Cache[] cache = new Cache[1];
        Mockito.when(this.mockCaches.putIfAbsent(Mockito.anyString(),
                                                 Mockito.any()))
               .thenAnswer(i -> cache[0] = (Cache<?, ?>) i.getArguments()[1]);
        Mockito.when(this.mockCaches.get(name)).thenAnswer(i -> cache[0]);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CacheTest.java`
#### Snippet
```java
        Assert.assertEquals(false, cache.enableMetrics(true));

        Assert.assertEquals(0L, cache.hits());
        Assert.assertEquals(0L, cache.miss());

        Id id = IdGenerator.of("1");
        cache.update(id, "value-1");
        Assert.assertEquals(0L, cache.hits());
        Assert.assertEquals(0L, cache.miss());

        cache.get(IdGenerator.of("not-exist"));
        Assert.assertEquals(0L, cache.hits());
        Assert.assertEquals(1L, cache.miss());

        cache.get(IdGenerator.of("1"));
        Assert.assertEquals(1L, cache.hits());
        Assert.assertEquals(1L, cache.miss());

        cache.get(IdGenerator.of("not-exist"));
        Assert.assertEquals(1L, cache.hits());
        Assert.assertEquals(2L, cache.miss());

        cache.get(IdGenerator.of("1"));
        Assert.assertEquals(2L, cache.hits());
        Assert.assertEquals(2L, cache.miss());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CacheTest.java`
#### Snippet
```java
        Cache<Id, Object> cache = newCache(10);

        Id id1 = IdGenerator.of("1");
        cache.update(id1, "value-1");
        Id id2 = IdGenerator.of("2");
        cache.update(id2, "value-2");
        Id id3 = IdGenerator.of("3");
        cache.update(id3, "value-3");
        Assert.assertEquals(3, cache.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedGraphTransactionTest.java`
#### Snippet
```java
        CachedGraphTransaction cache = this.cache();

        cache.addVertex(this.newVertex(IdGenerator.of(1)));
        cache.addVertex(this.newVertex(IdGenerator.of(2)));
        cache.commit();

        Assert.assertTrue(cache.queryVertices(IdGenerator.of(1)).hasNext());
        Assert.assertTrue(cache.queryVertices(IdGenerator.of(2)).hasNext());
        Assert.assertEquals(2L,
                            Whitebox.invoke(cache, "verticesCache", "size"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedGraphTransactionTest.java`
#### Snippet
```java
        CachedGraphTransaction cache = this.cache();
        HugeVertex v1 = this.newVertex(IdGenerator.of(1));
        HugeVertex v2 = this.newVertex(IdGenerator.of(2));
        HugeVertex v3 = this.newVertex(IdGenerator.of(3));

        cache.addVertex(v1);
        cache.addVertex(v2);
        cache.commit();
        HugeEdge edge = this.newEdge(v1, v2);
        cache.addEdge(edge);
        cache.commit();
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(1)).hasNext());
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(2)).hasNext());

        Assert.assertEquals(2L,
                            Whitebox.invoke(cache, "edgesCache", "size"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedGraphTransactionTest.java`
#### Snippet
```java
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(1)).hasNext());
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(2)).hasNext());
        Assert.assertEquals(2L,
                            Whitebox.invoke(cache, "edgesCache", "size"));

        cache.removeVertex(v1);
        cache.commit();

        Assert.assertEquals(0L,
                            Whitebox.invoke(cache, "edgesCache", "size"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedGraphTransactionTest.java`
#### Snippet
```java
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(1)).hasNext());
        Assert.assertTrue(cache.queryEdgesByVertex(IdGenerator.of(2)).hasNext());
        Assert.assertEquals(2L,
                            Whitebox.invoke(cache, "edgesCache", "size"));

        cache.addVertexProperty(new HugeVertexProperty<>(v1,
                                                         cache.graph().schema()
                                                              .getPropertyKey("name"),
                                                         "test-name"));
        cache.commit();

        Assert.assertEquals(0L,
                            Whitebox.invoke(cache, "edgesCache", "size"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedSchemaTransactionTest.java`
#### Snippet
```java
        CachedSchemaTransaction cache = this.cache();

        FakeObjects objects = new FakeObjects("unit-test");
        cache.addPropertyKey(objects.newPropertyKey(IdGenerator.of(1),
                                                    "fake-pk-1"));
        cache.addPropertyKey(objects.newPropertyKey(IdGenerator.of(2),
                                                    "fake-pk-2"));

        Assert.assertEquals(2L, Whitebox.invoke(cache, "idCache", "size"));
        Assert.assertEquals(2L, Whitebox.invoke(cache, "nameCache", "size"));

        Assert.assertEquals("fake-pk-1",
                            cache.getPropertyKey(IdGenerator.of(1)).name());
        Assert.assertEquals(IdGenerator.of(1),
                            cache.getPropertyKey("fake-pk-1").id());

        Assert.assertEquals("fake-pk-2",
                            cache.getPropertyKey(IdGenerator.of(2)).name());
        Assert.assertEquals(IdGenerator.of(2),
                            cache.getPropertyKey("fake-pk-2").id());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/CachedSchemaTransactionTest.java`
#### Snippet
```java
        Assert.assertEquals("fake-pk-1",
                            cache.getPropertyKey(IdGenerator.of(1)).name());
        Assert.assertEquals(IdGenerator.of(1),
                            cache.getPropertyKey("fake-pk-1").id());

        Assert.assertEquals("fake-pk-2",
                            cache.getPropertyKey(IdGenerator.of(2)).name());
        Assert.assertEquals(IdGenerator.of(2),
                            cache.getPropertyKey("fake-pk-2").id());

        Assert.assertEquals(2L, Whitebox.invoke(cache, "idCache", "size"));
        Assert.assertEquals(2L, Whitebox.invoke(cache, "nameCache", "size"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/RamTableTest.java`
#### Snippet
```java
        HugeGraph graph = this.graph();
        int el1 = (int) graph.edgeLabel("el1").id().asLong();
        int el2 = (int) graph.edgeLabel("el2").id().asLong();

        RamTable table = new RamTable(graph, VERTEX_SIZE, EDGE_SIZE);
        long oldSize = table.edgesSize();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/RamTableTest.java`
#### Snippet
```java
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge1 = edges.next();
            Assert.assertEquals(i, edge1.id().ownerVertexId().asLong());
            Assert.assertEquals(i, edge1.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge1.direction());
            Assert.assertEquals("el1", edge1.label());

            Assert.assertTrue(edges.hasNext());
            HugeEdge edge2 = edges.next();
            Assert.assertEquals(i, edge2.id().ownerVertexId().asLong());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/RamTableTest.java`
#### Snippet
```java
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge1 = edges.next();
            Assert.assertEquals(i, edge1.id().ownerVertexId().asLong());
            Assert.assertEquals(i + 1L, edge1.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.IN, edge1.direction());
            Assert.assertEquals("el2", edge1.label());

            Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/RamTableTest.java`
#### Snippet
```java
            HugeEdge edge3 = edges.next();
            Assert.assertEquals(i, edge3.id().ownerVertexId().asLong());
            Assert.assertEquals(i + 1L, edge3.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.IN, edge3.direction());
            Assert.assertEquals("el2", edge3.label());

            Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/cache/RamTableTest.java`
#### Snippet
```java
            Assert.assertTrue(edges.hasNext());
            HugeEdge edge1 = edges.next();
            Assert.assertEquals(i, edge1.id().ownerVertexId().asLong());
            Assert.assertEquals(i, edge1.id().otherVertexId().asLong());
            Assert.assertEquals(Directions.OUT, edge1.direction());
            Assert.assertEquals("el1", edge1.label());

            Assert.assertFalse(edges.hasNext());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionQueryFlattenTest.java`
#### Snippet
```java
        Condition c1 = Condition.eq(IdGenerator.of("c1"), "1");
        Condition c2 = Condition.eq(IdGenerator.of("c2"), "2");
        Condition c3 = Condition.eq(IdGenerator.of("c3"), "3");
        Condition c4 = Condition.eq(IdGenerator.of("c4"), "4");

        ConditionQuery query = new ConditionQuery(HugeType.VERTEX);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionQueryFlattenTest.java`
#### Snippet
```java
        List<ConditionQuery> queries =
                             ConditionQueryFlatten.flatten(query);
        Assert.assertEquals(1, queries.size());
        List<Collection<Condition>> expect;
        expect = ImmutableList.of(ImmutableList.of(c1, c2, c3, c4));
        List<Collection<Condition>> actual = new ArrayList<>();
        for (ConditionQuery q : queries) {
            actual.add(q.conditions());
        }
        Assert.assertEquals(expect, actual);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionQueryFlattenTest.java`
#### Snippet
```java
        expect = ImmutableList.of(ImmutableList.of(c1, c2, c3, c4));
        List<Collection<Condition>> actual = new ArrayList<>();
        for (ConditionQuery q : queries) {
            actual.add(q.conditions());
        }
        Assert.assertEquals(expect, actual);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionQueryFlattenTest.java`
#### Snippet
```java
        List<ConditionQuery> queries = ConditionQueryFlatten.flatten(query);
        Assert.assertEquals(4, queries.size());
        List<Collection<Condition>> expect;
        expect = ImmutableList.of(ImmutableList.of(c1, c3),
                                  ImmutableList.of(c1, c4),
                                  ImmutableList.of(c2, c3),
                                  ImmutableList.of(c2, c4));
        List<Collection<Condition>> actual = new ArrayList<>();
        for (ConditionQuery q : queries) {
            actual.add(q.conditions());
        }
        Assert.assertEquals(expect, actual);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionQueryFlattenTest.java`
#### Snippet
```java
        expect = ImmutableList.of(ImmutableList.of(c1, c3),
                                  ImmutableList.of(c1, c4),
                                  ImmutableList.of(c2, c3),
                                  ImmutableList.of(c2, c4));
        List<Collection<Condition>> actual = new ArrayList<>();
        for (ConditionQuery q : queries) {
            actual.add(q.conditions());
        }
        Assert.assertEquals(expect, actual);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionTest.java`
#### Snippet
```java
        Assert.assertTrue(c1.isFlattened());
        Assert.assertFalse(c1.isLogic());
        Assert.assertTrue(c1.test("123"));
        Assert.assertFalse(c1.test("1234"));
        Assert.assertFalse(c1.test(123));
        Assert.assertFalse(c1.test(new Date(123)));
        Assert.assertFalse(c1.test((Object) null));

        Relation r1 = (Relation) c1;
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java
        LockUtil.Locks locks = Whitebox.getInternalState(this.locksTable,
                                                         "locks");
        Map<String, Set<Id>> table = Whitebox.getInternalState(this.locksTable,
                                                               "table");

        Assert.assertEquals(1, table.size());
        Assert.assertTrue(table.containsKey("group"));
        Set<Id> ids = table.get("group");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java
        Assert.assertEquals(4, ids.size());
        Set<Id> expect = ImmutableSet.of(id1, id2, id3, id4);
        Assert.assertEquals(expect, ids);
        ids = table.get("group1");
        Assert.assertEquals(2, ids.size());
        expect = ImmutableSet.of(id1, id2);
        Assert.assertEquals(expect, ids);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java
        Id id1 = IdGenerator.of(1);
        Id id2 = IdGenerator.of(2);
        Id id3 = IdGenerator.of(3);
        Id id4 = IdGenerator.of(4);
        this.locksTable.lockReads("group", id1);
        this.locksTable.lockReads("group", id2);
        this.locksTable.lockReads("group", id3);
        this.locksTable.lockReads("group", id4);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java
            Assert.assertEquals(1, ids.size());
            Set<Id> expect = ImmutableSet.of(id);
            Assert.assertEquals(expect, ids);

            List<Lock> lockList = Whitebox.getInternalState(locks, "lockList");
            Assert.assertEquals(1, lockList.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java
            LockUtil.Locks locks = Whitebox.getInternalState(locksTable,
                                                             "locks");
            Map<String, Set<Id>> table = Whitebox.getInternalState(locksTable,
                                                                   "table");

            Assert.assertEquals(1, table.size());
            Assert.assertTrue(table.containsKey("group"));
            Set<Id> ids = table.get("group");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/id/IdUtilTest.java`
#### Snippet
```java
        int size = string.length() / 2;
        byte[] bytes = new byte[size];
        for (int i = 0; i < size; i++) {
            String b = string.substring(i * 2, i * 2 + 2);
            bytes[i] = Integer.valueOf(b, 16).byteValue();
        }
        return bytes;
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionsTest.java`
#### Snippet
```java
        this.rocks.session().put(TABLE, getBytes("person:1gname"), getBytes("James"));
        this.rocks.session().put(TABLE2, getBytes("person:1gname"), getBytes("James2"));
        this.commit();

        String value = getString(this.rocks.session().get(TABLE, getBytes("person:1gname")));
        Assert.assertEquals("James", value);

        String value2 = getString(this.rocks.session().get(TABLE2, getBytes("person:1gname")));
        Assert.assertEquals("James2", value2);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        this.rocks.session().put(TABLE2, getBytes("person:1gname"), getBytes("James2"));
        this.commit();

        String value = getString(this.rocks.session().get(TABLE, getBytes("person:1gname")));
        Assert.assertEquals("James", value);

        String value2 = getString(this.rocks.session().get(TABLE2, getBytes("person:1gname")));
        Assert.assertEquals("James2", value2);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        put("person:1gname", "James");
        put("person:1gage", "19");
        put("person:1gcity", "Beijing");

        put("person:2gname", "Lisa");
        put("person:2gage", "20");
        put("person:2gcity", "Beijing");

        put("person:3gname", "Hebe");
        put("person:3gage", "21");
        put("person:3gcity", "Taipei");
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Session session = this.rocks.session();

        byte[] key11 = new byte[]{1, 1};
        byte[] value11 = getBytes("value-1-1");
        session.put(TABLE, key11, value11);

        byte[] key12 = new byte[]{1, 2};
        byte[] value12 = getBytes("value-1-2");
        session.put(TABLE, key12, value12);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        put("person:1gname", "James");
        put("person:1gage", "19");
        put("person:1gcity", "Beijing");

        Assert.assertEquals("James", get("person:1gname"));
        Assert.assertEquals("19", get("person:1gage"));
        Assert.assertEquals("Beijing", get("person:1gcity"));

        this.rocks.session().delete(TABLE, getBytes("person:1gage"));
        this.commit();

        Assert.assertEquals("James", get("person:1gname"));
        Assert.assertEquals(null, get("person:1gage"));
        Assert.assertEquals("Beijing", get("person:1gcity"));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BinaryScatterSerializerTest.java`
#### Snippet
```java
        HugeEdge edge = new FakeObjects().newEdge(123, 456);

        BackendEntry entry1 = ser.writeVertex(edge.sourceVertex());
        HugeVertex vertex1 = ser.readVertex(edge.graph(), entry1);
        Assert.assertEquals(edge.sourceVertex(), vertex1);
        assertCollectionEquals(edge.sourceVertex().getProperties(),
                               vertex1.getProperties());

        BackendEntry entry2 = ser.writeVertex(edge.targetVertex());
        HugeVertex vertex2 = ser.readVertex(edge.graph(), entry2);
        Assert.assertEquals(edge.targetVertex(), vertex2);
        assertCollectionEquals(edge.targetVertex().getProperties(),
                               vertex2.getProperties());

        Whitebox.setInternalState(vertex2, "removed", true);
        Assert.assertTrue(vertex2.removed());
        BackendEntry entry3 = ser.writeVertex(vertex2);
        Assert.assertEquals(0, entry3.columnsSize());

        Assert.assertNull(ser.readVertex(edge.graph(), null));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BinarySerializerTest.java`
#### Snippet
```java
        BackendEntry entry1 = ser.writeVertex(edge.sourceVertex());
        HugeVertex vertex1 = ser.readVertex(edge.graph(), entry1);
        Assert.assertEquals(edge.sourceVertex(), vertex1);
        assertCollectionEquals(edge.sourceVertex().getProperties(),
                               vertex1.getProperties());

        BackendEntry entry2 = ser.writeVertex(edge.targetVertex());
        HugeVertex vertex2 = ser.readVertex(edge.graph(), entry2);
        Assert.assertEquals(edge.targetVertex(), vertex2);
        assertCollectionEquals(edge.targetVertex().getProperties(),
                               vertex2.getProperties());

        Whitebox.setInternalState(vertex2, "removed", true);
        Assert.assertTrue(vertex2.removed());
        BackendEntry entry3 = ser.writeVertex(vertex2);
        Assert.assertEquals(0, entry3.columnsSize());

        Assert.assertNull(ser.readVertex(edge.graph(), null));
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/StoreSerializerTest.java`
#### Snippet
```java
        BinaryBackendEntry entry = new BinaryBackendEntry(HugeType.VERTEX,
                                                          new byte[]{1, 2});
        entry.column(new byte[]{1}, new byte[]{1});
        entry.column(new byte[]{2}, new byte[]{2});
        entry.column(new byte[]{127}, new byte[]{127});
        BackendMutation origin = new BackendMutation();
        origin.add(entry, Action.INSERT);
        byte[] bytes = StoreSerializer.writeMutation(origin);
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/JsonUtilTest.java`
#### Snippet
```java
        FakeObjects fakeObject = new FakeObjects();
        PropertyKey name = fakeObject.newPropertyKey(IdGenerator.of(1), "name");
        PropertyKey age = fakeObject.newPropertyKey(IdGenerator.of(2), "age",
                                                     DataType.INT,
                                                     Cardinality.SINGLE);
        PropertyKey city = fakeObject.newPropertyKey(IdGenerator.of(3), "city");

        VertexLabel vl = fakeObject.newVertexLabel(IdGenerator.of(1), "person",
                                                   IdStrategy.CUSTOMIZE_NUMBER,
                                                   name.id(), age.id(),
                                                   city.id());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/JsonUtilTest.java`
#### Snippet
```java
        FakeObjects fakeObject = new FakeObjects();
        PropertyKey name = fakeObject.newPropertyKey(IdGenerator.of(1), "name");
        PropertyKey age = fakeObject.newPropertyKey(IdGenerator.of(2), "age",
                                                    DataType.INT,
                                                    Cardinality.SINGLE);
        PropertyKey city = fakeObject.newPropertyKey(IdGenerator.of(3), "city");
        PropertyKey date = fakeObject.newPropertyKey(IdGenerator.of(4), "date",
                                                     DataType.DATE);
        PropertyKey weight = fakeObject.newPropertyKey(IdGenerator.of(5),
                                                       "weight",
                                                       DataType.DOUBLE);

        VertexLabel vl = fakeObject.newVertexLabel(IdGenerator.of(1), "person",
                                                   IdStrategy.CUSTOMIZE_NUMBER,
                                                   name.id(), age.id(),
                                                   city.id());

        EdgeLabel el = fakeObject.newEdgeLabel(IdGenerator.of(1), "knows",
                                               Frequency.SINGLE,
                                               vl.id(), vl.id(),
                                               date.id(), weight.id());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/RateLimiterTest.java`
#### Snippet
```java
        LongAdder count = Whitebox.getInternalState(limiter, "count");
        Assert.assertEquals(0, count.intValue());

        for (int i = 0; i < rateLimit; i++) {
            Assert.assertTrue(limiter.tryAcquire());
        }

        count = Whitebox.getInternalState(limiter, "count");
        Assert.assertEquals(rateLimit, count.intValue());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IdSetTest.java`
#### Snippet
```java
            Assert.assertEquals(uuids.size(), idSet.size());

            LongHashSet numberIds = Whitebox.getInternalState(idSet,
                                                              "numberIds");
            Assert.assertTrue(numberIds.isEmpty());
            Set<Id> nonNumberIds = Whitebox.getInternalState(idSet,
                                                             "nonNumberIds");
            Assert.assertEquals(uuids.size(), nonNumberIds.size());

            uuids.clear();
            idSet.clear();
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IdSetTest.java`
#### Snippet
```java
            idSet = new IdSet(type);
            for (int i = 1; i < SIZE; i++) {
                long number = random.nextLong();
                numbers.add(number);
                idSet.add(IdGenerator.of(number));
            }
            for (int i = 0; i < SIZE; i++) {
                UUID uuid = UUID.randomUUID();
                uuids.add(uuid);
                idSet.add(IdGenerator.of(uuid));
            }
            for (int i = 0; i < SIZE; i++) {
                String string = RandomStringUtils.randomAlphanumeric(10);
                strings.add(string);
                idSet.add(IdGenerator.of(string));
            }
            Assert.assertEquals(numbers.size() + uuids.size() + strings.size(),
                                idSet.size());

            LongHashSet numberIds = Whitebox.getInternalState(idSet,
                                                              "numberIds");
            Assert.assertEquals(numbers.size(), numberIds.size());
            Set<Id> nonNumberIds = Whitebox.getInternalState(idSet,
                                                             "nonNumberIds");
            Assert.assertEquals(uuids.size() + strings.size(),
                                nonNumberIds.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IdSetTest.java`
#### Snippet
```java
            Assert.assertEquals(numbers.size() + uuids.size() + strings.size(),
                                idSet.size());

            LongHashSet numberIds = Whitebox.getInternalState(idSet,
                                                              "numberIds");
            Assert.assertEquals(numbers.size(), numberIds.size());
            Set<Id> nonNumberIds = Whitebox.getInternalState(idSet,
                                                             "nonNumberIds");
            Assert.assertEquals(uuids.size() + strings.size(),
                                nonNumberIds.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/Int2IntsMapTest.java`
#### Snippet
```java
        Int2IntsMap map = new Int2IntsMap();

        Random random = new Random();
        for (int i = 0; i < VALUE_NUMBER; i++) {
            map.add(Math.abs(random.nextInt()) % KEY_NUMBER, i);
        }

        Set<Integer> all = new HashSet<>();
        for (int i = 0; i < KEY_NUMBER; i++) {
            int[] values = map.getValues(i);
            for (int j : values) {
                all.add(j);
            }
        }
        Assert.assertEquals(VALUE_NUMBER, all.size());
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IntMapTest.java`
#### Snippet
```java
        Assert.assertEquals(jucMap.size(), map.size());
        for (int k = 0; k < EACH_COUNT; k++) {
            if (jucMap.containsKey(k)) {
                Assert.assertTrue("expect " + k, map.containsKey(k));
                Assert.assertEquals((int) jucMap.get(k), map.get(k));
            } else {
                Assert.assertFalse("unexpect " + k, map.containsKey(k));
            }
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IntMapTest.java`
#### Snippet
```java
        runWithThreads(THREADS_NUM, () -> {
            for (int i = 0; i < BATCH_COUNT; i++) {
                for (int k = 0; k < EACH_COUNT; k++) {
                    map.containsKey(k);
                    map.put(k, k);
                }
                map.get(i);
            }
        });

        Assert.assertEquals(EACH_COUNT, map.size());
        for (int k = 0; k < EACH_COUNT; k++) {
            Assert.assertTrue("expect " + k, map.containsKey(k));
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IntMapTest.java`
#### Snippet
```java
        int segments = 400;
        int segmentSize = Integer.MAX_VALUE / segments;
        int step = 50;
        IntMap map = fixedBySegments(Integer.MAX_VALUE, segments);
        for (int k = 0; k < segments; k += step) {
            map.put(segmentSize * k, k);
        }
```

### DuplicatedCode
Duplicated code
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/ObjectIntMappingTest.java`
#### Snippet
```java
        Iterator<Integer> codeIter = codes.iterator();
        while (strIter.hasNext() && codeIter.hasNext()) {
            Assert.assertEquals(IdGenerator.of(strIter.next()),
                                mapping.code2Object(codeIter.next()));
        }

        Assert.assertFalse(strIter.hasNext());
        Assert.assertFalse(codeIter.hasNext());
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/ExampleUtil.java`
#### Snippet
```java
                conf = path;
            }
        } catch (Exception ignored) {
            LOG.warn("loadGraph warn {} ",ignored);
        }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugeGroup.java`
#### Snippet
```java
        }

        protected String[] initProperties() {
            List<String> props = new ArrayList<>();

```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
    private static final ThreadLocal<String> CONTEXTS = new ThreadLocal<>();

    protected static void setContext(String context) {
        CONTEXTS.set(context);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
    public static final String TASK_SCHEDULER = "task-scheduler-%d";

    protected static final long SCHEDULE_PERIOD = 1000L; // unit ms

    private static final int THREADS = 4;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
    }

    protected static void resetContext() {
        CONTEXTS.remove();
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
    }

    protected void notifyNewTask(HugeTask<?> task) {
        Queue<Runnable> queue = ((ThreadPoolExecutor) this.schedulerExecutor)
                                                          .getQueue();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeServerInfo.java`
#### Snippet
```java
        public static final String SERVER = P.SERVER;

        protected final HugeGraphParams graph;

        public Schema(HugeGraphParams graph) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/LevelCache.java`
#### Snippet
```java
    }

    protected AbstractCache<Id, Object> last() {
        final int length = this.caches.length;
        E.checkState(length > 0,
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/QueryList.java`
#### Snippet
```java
    }

    protected PageResults<R> fetchNext(PageInfo pageInfo, long pageSize) {
        FlattenQuery<R> query = null;
        int offset = pageInfo.offset();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/QueryList.java`
#### Snippet
```java
    }

    protected Query parent() {
        return this.parent;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
    }

    protected Node node() {
        assert this.node != null;
        return this.node;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
    }

    protected LeaderInfo waitLeaderElected(int timeout) {
        String group = this.context.group();
        LeaderInfo leaderInfo = this.leaderInfo.get();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
    }

    protected RaftContext context() {
        return this.context;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
    }

    protected void waitRaftLogSynced(int timeout) {
        String group = this.context.group();
        LOG.info("Waiting for raft group '{}' log synced", group);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected RaftBackendStore[] stores() {
        return this.stores;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected RpcServer rpcServer() {
        return this.raftRpcServer;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected void clearCache() {
        // Just choose two representatives used to represent schema and graph
        this.notifyCache(Cache.ACTION_CLEAR, HugeType.VERTEX_LABEL, null);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected void notifyCache(String action, HugeType type, List<Id> ids) {
        EventHub eventHub;
        if (type.isGraph()) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected void updateCacheIfNeeded(BackendMutation mutation,
                                       boolean forwarded) {
        // Update cache only when graph run in general mode
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftContext.java`
#### Snippet
```java
    }

    protected RpcForwarder rpcForwarder() {
        return this.rpcForwarder;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStep.java`
#### Snippet
```java

    @Override
    protected Admin<Long> processNextStart() throws NoSuchElementException {
        if (this.done) {
            throw FastNoSuchElementException.instance();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeGraphStep.java`
#### Snippet
```java
    }

    protected long count() {
        if (this.ids == null) {
            return 0L;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
     * @return the traversal or its parents contain at least one Tree step
     */
    protected static boolean containsTree(Traversal.Admin<?, ?> traversal) {
        boolean hasTree = TraversalHelper.getStepsOfClass(
                          TreeStep.class, traversal).size() > 0;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
     * @return the traversal or its parents contain at least one Path step
     */
    protected static boolean containsPath(Traversal.Admin<?, ?> traversal) {
        boolean hasPath = TraversalHelper.getStepsOfClass(
                          PathStep.class, traversal).size() > 0;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
    }

    protected static void logUser(User user, String path) {
        LOG.info("User '{}' login from client [{}] with path '{}'",
                 user.username(), user.client(), path);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
    private static final ThreadLocal<Context> CONTEXTS = new InheritableThreadLocal<>();

    protected static Context setContext(Context context) {
        Context old = CONTEXTS.get();
        CONTEXTS.set(context);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
    }

    protected static Context getContext() {
        // Return task context first
        String taskContext = TaskManager.getContext();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
    }

    protected static String getContextString() {
        Context context = getContext();
        if (context == null) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
    }

    protected static void resetContext() {
        CONTEXTS.remove();
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTable.java`
#### Snippet
```java
        Aggregate aggregate = query.aggregate();
        if (aggregate != null) {
            select.append(aggregate.toString());
        } else {
            select.append("*");
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `IdSerializer` may be 'static'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/OffheapCache.java`
#### Snippet
```java
    }

    private class IdSerializer implements CacheSerializer<Id> {

        @Override
```

### InnerClassMayBeStatic
Inner class `HugeDataTypeFeatures` may be 'static'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeFeatures.java`
#### Snippet
```java
    }

    public class HugeDataTypeFeatures implements DataTypeFeatures {

        @Override
```

### InnerClassMayBeStatic
Inner class `HugeElementFeatures` may be 'static'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeFeatures.java`
#### Snippet
```java
    }

    public class HugeElementFeatures implements ElementFeatures {

        @Override
```

### InnerClassMayBeStatic
Inner class `NearestTraverser` may be 'static'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CollectionPathsTraverser.java`
#### Snippet
```java
    }

    private class NearestTraverser extends Traverser {

        public NearestTraverser(HugeTraverser traverser,
```

### InnerClassMayBeStatic
Inner class `WorkLoadFactory` may be 'static'
in `hugegraph-api/src/main/java/org/apache/hugegraph/server/ApplicationConfig.java`
#### Snippet
```java
    }

    private class WorkLoadFactory extends AbstractBinder implements Factory<WorkLoad> {

        private final WorkLoad load;
```

### InnerClassMayBeStatic
Inner class `ConfFactory` may be 'static'
in `hugegraph-api/src/main/java/org/apache/hugegraph/server/ApplicationConfig.java`
#### Snippet
```java
    }

    private class ConfFactory extends AbstractBinder implements Factory<HugeConfig> {

        private final HugeConfig conf;
```

### InnerClassMayBeStatic
Inner class `GraphManagerFactory` may be 'static'
in `hugegraph-api/src/main/java/org/apache/hugegraph/server/ApplicationConfig.java`
#### Snippet
```java
    }

    private class GraphManagerFactory extends AbstractBinder implements Factory<GraphManager> {

        private GraphManager manager = null;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/SplicingIdGenerator.java`
#### Snippet
```java
    public static final String ID_SPLITOR_STR = String.valueOf(ID_SPLITOR);

    /****************************** id generate ******************************/

    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherPlugin.java`
#### Snippet
```java
 */

/**
 * Description of the modifications:
 * <p>
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/IdSetTest.java`
#### Snippet
```java
                } else if (id instanceof IdGenerator.UuidId) {
                    Assert.assertTrue(id.uuid() &&
                                      uuids.contains(id.asObject()));
                } else {
                    Assert.assertTrue(id instanceof IdGenerator.StringId);
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
                                            "Tom Cat", "Lisa");
        for (Object name : vertices) {
            Assert.assertTrue(names.contains(name));
        }
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
            }
            Relation relation = (Relation) condition;
            if (keys.contains(relation.key())) {
                int keyCount = keyCounts.getOrDefault(relation.key(), 0);
                if (++keyCount > 1) {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.getOrDefault()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/query/ConditionQuery.java`
#### Snippet
```java
            Relation relation = (Relation) condition;
            if (keys.contains(relation.key())) {
                int keyCount = keyCounts.getOrDefault(relation.key(), 0);
                if (++keyCount > 1) {
                    return true;
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        return new MapperIterator<>(ids.iterator(), id -> {
            Edge edge = edges.get(id);
            return edge;
        });
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        return new MapperIterator<>(ids.iterator(), id -> {
            HugeVertex vertex = vertices.get(id);
            if (vertex == null) {
                if (checkMustExist) {
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `servers` declared in one 'switch' branch and used in another
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                Assert.assertEquals("local", clusterId);

                Map<?, ?> servers = assertMapContains(graph, "servers");
                Assert.assertEquals(1, servers.size());
                Map.Entry<?, ?> server = servers.entrySet().iterator().next();
```

### SwitchStatementWithConfusingDeclaration
Local variable `host` declared in one 'switch' branch and used in another
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
                Assert.assertEquals("local", server.getKey());

                Map<?, ?> host = (Map<?, ?>) server.getValue();
                assertMapContains(host, "mem_used");
                assertMapContains(host, "mem_used_readable");
```

### SwitchStatementWithConfusingDeclaration
Local variable `label` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/schema/IndexLabelRebuildJob.java`
#### Snippet
```java
            case INDEX_LABEL:
                IndexLabel indexLabel = (IndexLabel) schema;
                SchemaLabel label;
                if (indexLabel.baseType() == HugeType.VERTEX_LABEL) {
                    label = this.graph().vertexLabel(indexLabel.baseValue());
```

### SwitchStatementWithConfusingDeclaration
Local variable `value` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
                E.checkState(nnPropValues.size() == 1,
                             "Expect only one property in range index");
                Object value = NumericUtil.convertToNumber(nnPropValues.get(0));
                this.updateIndex(indexLabel, value, element.id(),
                                 expiredTime, removed);
```

### SwitchStatementWithConfusingDeclaration
Local variable `bytes` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
            case UUID:
                // UUID Id
                byte[] bytes = id.asBytes();
                assert bytes.length == Id.UUID_LENGTH;
                this.writeUInt8(0x7f); // 0b01111111 means UUID
```

### SwitchStatementWithConfusingDeclaration
Local variable `params` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                return P.gte(predicateNumber(value));
            case "between":
                Number[] params = predicateNumbers(value, 2);
                return P.between(params[0], params[1]);
            case "inside":
```

### SwitchStatementWithConfusingDeclaration
Local variable `params` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                return Condition.gte(pk.id(), validValue);
            case "between":
                Number[] params = predicateNumbers(value, 2);
                Object v1 = validPropertyValue(params[0], pk);
                Object v2 = validPropertyValue(params[1], pk);
```

### SwitchStatementWithConfusingDeclaration
Local variable `v1` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            case "between":
                Number[] params = predicateNumbers(value, 2);
                Object v1 = validPropertyValue(params[0], pk);
                Object v2 = validPropertyValue(params[1], pk);
                return Condition.and(Condition.gte(pk.id(), v1),
```

### SwitchStatementWithConfusingDeclaration
Local variable `v2` declared in one 'switch' branch and used in another
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                Number[] params = predicateNumbers(value, 2);
                Object v1 = validPropertyValue(params[0], pk);
                Object v2 = validPropertyValue(params[1], pk);
                return Condition.and(Condition.gte(pk.id(), v1),
                                     Condition.lt(pk.id(), v2));
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeServerInfo.java`
#### Snippet
```java
            return false;
        }
        if (this.updateTime.getTime() + EXPIRED_INTERVAL < now ||
            this.load() + task.load() > this.maxLoad) {
            return false;
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
        String result = JsonUtil.toJson(v);
        checkPropertySize(result, P.RESULT);
        if (!this.result(TaskStatus.SUCCESS, result)) {
            assert this.completed();
        }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeTask.java`
#### Snippet
```java
                     this.id(), e);
            // Update status to FAILED if exception occurred(not interrupted)
            if (this.result(TaskStatus.FAILED, e.toString())) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/PropertyKeyBuilder.java`
#### Snippet
```java
        }

        if (this.writeType != propertyKey.writeType()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
                return null;
            }
            if (query.idsSize() == 1) {
                assert vertex.getEdges().size() == 1;
            }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
        // Not select current item, continue to select C(m-1, n)
        result.remove(index);
        if (cmn(all, m - 1, n, current, result, callback)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/security/HugeSecurityManager.java`
#### Snippet
```java

    private static boolean readGroovyInCurrentDir(String file) {
        if (file != null && (USER_DIR != null && file.startsWith(USER_DIR) ||
            USER_DIR_IDE != null && file.startsWith(USER_DIR_IDE)) &&
            (file.endsWith(".class") || file.endsWith(".groovy"))) {
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                                                       Object fieldValues) {
        if (value != null && value.length > 0 && fieldValues != null) {
            if (!StringEncoding.decode(value).equals(fieldValues)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/PathTraverser.java`
#### Snippet
```java
        HugeTraverser.checkCapacity(this.capacity, this.accessedNodes(),
                                    "template paths");
        if (this.limit == NO_LIMIT || this.pathCount() < this.limit) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SubGraphTraverser.java`
#### Snippet
```java
            checkCapacity(this.capacity, this.accessedVertices.size(),
                          this.rings ? "rings" : "rays");
            if (this.limit == NO_LIMIT || this.pathCount < this.limit) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeAuthenticator.java`
#### Snippet
```java

    default boolean verifyRole(RolePermission role) {
        if (role == ROLE_NONE || role == null) {
            return false;
        } else {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdbsst/RocksDBSstSessions.java`
#### Snippet
```java
        public Integer commit() {
            int count = this.batch.size();
            if (count <= 0) {
                return 0;
            }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStdSessions.java`
#### Snippet
```java

        private void seek() {
            if (this.keyBegin == null || this.keyBegin.length <= 0) {
                // Seek to the first if no `keyBegin`
                this.iter.seekToFirst();
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/WsAndHttpBasicAuthHandler.java`
#### Snippet
```java
                }
                String authorization = new String(userPass,
                                                  Charset.forName("UTF-8"));
                String[] split = authorization.split(":");
                if (split.length != 2) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Cluster' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraSessionPool.java`
#### Snippet
```java
            this.opened = true;
            assert this.session == null;
            this.session = cluster().connect(keyspace());
        }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraSerializer.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    protected <T> T readProperty(PropertyKey pkey, Object value) {
        BytesBuffer buffer = BytesBuffer.wrap((ByteBuffer) value);
        return (T) buffer.readProperty(pkey);
    }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraSerializer.java`
#### Snippet
```java
    @Override
    protected Object writeProperty(PropertyKey propertyKey, Object value) {
        BytesBuffer buffer = BytesBuffer.allocate(BytesBuffer.BUF_PROPERTY);
        if (propertyKey == null) {
            /*
```

### AutoCloseableResource
'Cluster' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java

    protected boolean existsTable(String table) {
        KeyspaceMetadata keyspace = this.cluster().getMetadata().getKeyspace(this.keyspace);
        return keyspace != null && keyspace.getTable(table) != null;
    }
```

### AutoCloseableResource
'Cluster' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java
        LOG.debug("Drop keyspace: {}", stmt);

        Session session = this.cluster().connect();
        try {
            session.execute(stmt);
```

### AutoCloseableResource
'Cluster' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java
        // Create keyspace with non-keyspace-session
        LOG.debug("Create keyspace: {}", stmt);
        Session session = this.cluster().connect();
        try {
            session.execute(stmt);
```

### AutoCloseableResource
'Cluster' used without 'try'-with-resources statement
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraStore.java`
#### Snippet
```java

    protected boolean existsKeyspace() {
        return this.cluster().getMetadata().getKeyspace(this.keyspace) != null;
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/LoginApiTest.java`
#### Snippet
```java
    @After
    public void teardown() {
        this.deleteUser(this.userId4Test);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/LoginApiTest.java`
#### Snippet
```java
    @Before
    public void setup() {
        Response r = this.createUser("test", "test");
        Map<String, Object> user = r.readEntity(
                                     new GenericType<Map<String, Object>>(){});
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/UserApiTest.java`
#### Snippet
```java
                continue;
            }
            this.client().delete(PATH, (String) user.get("id"));
        }
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/GremlinApiTest.java`
#### Snippet
```java
                "\"language\":\"gremlin-groovy\"," +
                "\"aliases\":{\"g\":\"__g_hugegraph\"}}";
        Response r = client().post(path, body);
        String content = r.readEntity(String.class);
        Assert.assertTrue(content, r.getStatus() == 200);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
        String path = URL_PREFIX + SCHEMA_ELS;

        createAndAssert(path, "{\n" +
                "\"name\": \"created\",\n" +
                "\"source_label\": \"person\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"nullable_keys\":[]\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"name\": \"knows\",\n" +
                "\"source_label\": \"person\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
        String path = URL_PREFIX + GRAPH_VERTEX;

        createAndAssert(path, "{\n" +
                "\"label\": \"person\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"label\": \"person\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"label\": \"person\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"label\": \"person\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"label\": \"software\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}\n" +
                "}");
        createAndAssert(path, "{\n" +
                "\"label\": \"software\",\n" +
                "\"type\": \"vertex\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
        Map<String, Object> param = ImmutableMap.of("token", token,
                                                    "confirm_message", message);
        client.delete("graphs/" + GRAPH + "/clear", param);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
        String path = URL_PREFIX + SCHEMA_PKS;

        createAndAssert(path, "{\n" +
                "\"name\": \"name\",\n" +
                "\"data_type\": \"TEXT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"age\",\n" +
                "\"data_type\": \"INT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"city\",\n" +
                "\"data_type\": \"TEXT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"lang\",\n" +
                "\"data_type\": \"TEXT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"date\",\n" +
                "\"data_type\": \"TEXT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"price\",\n" +
                "\"data_type\": \"INT\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "\"properties\":[]\n" +
                "}", 202);
        createAndAssert(path, "{\n" +
                "\"name\": \"weight\",\n" +
                "\"data_type\": \"DOUBLE\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                                   .collect(Collectors.toList());
            ids.forEach(id -> {
                client.delete(path, (String) id);
            });
        };
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
        String path = URL_PREFIX + SCHEMA_VLS;

        createAndAssert(path, "{\n" +
                "\"primary_keys\":[\"name\"],\n" +
                "\"id_strategy\": \"PRIMARY_KEY\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                "}");

        createAndAssert(path, "{\n" +
                "\"primary_keys\":[\"name\"],\n" +
                "\"id_strategy\": \"PRIMARY_KEY\",\n" +
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
                                    joshId, vadasId, markoId, rippleId,
                                    peterId, rippleId);
        createAndAssert(path, body);
    }

```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
                    // Delete empty snapshot parent directory
                    Path parentPath = Paths.get(snapshotPath).toAbsolutePath().getParent();
                    if (Files.list(parentPath).count() == 0) {
                        FileUtils.deleteDirectory(parentPath.toFile());
                    }
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
            for (int i = 0; i < n; i++) {
                String key = String.format("index:%3d", i);
                Iterator<BackendColumn> iter = session.scan(TABLE, getBytes(key));
                while (iter.hasNext()) {
                    iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
        Session session = this.rocks.session();
        for (int i = 0; i < TIMES; i++) {
            Iterator<BackendColumn> iter = session.scan(TABLE, getBytes("non-exist"));
            while (iter.hasNext()) {
                iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
        Session session = this.rocks.session();
        for (int i = 0; i < TIMES; i++) {
            Iterator<BackendColumn> iter = session.scan(TABLE, getBytes("person:1"));
            while (iter.hasNext()) {
                iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
        Session session = this.rocks.session();
        for (int i = 0; i < TIMES; i++) {
            Iterator<BackendColumn> iter = session.scan(TABLE, getBytes("exist"));
            while (iter.hasNext()) {
                iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Map<String, String> results = new HashMap<>();
        Session session = this.rocks.session();
        Iterator<BackendColumn> iter = session.scan(TABLE,
                                                    getBytes("person:1"),
                                                    getBytes("person:3"));
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Iterator<BackendColumn> iter;

        iter = session.scan(TABLE, new byte[]{1, -1}, new byte[]{1, 3});
        Assert.assertFalse(iter.hasNext());

```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Assert.assertFalse(iter.hasNext());

        iter = session.scan(TABLE, new byte[]{1, 1}, new byte[]{1, -1});
        Map<ByteBuffer, byte[]> results = new HashMap<>();
        while (iter.hasNext()) {
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Map<String, String> results = new HashMap<>();
        Session session = this.rocks.session();
        Iterator<BackendColumn> iter = session.scan(TABLE, getBytes("person:1"));
        while (iter.hasNext()) {
            BackendColumn col = iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java

        Map<ByteBuffer, byte[]> results = new HashMap<>();
        Iterator<BackendColumn> iter = session.scan(TABLE,
                                                    new byte[]{1, 0},
                                                    new byte[]{2, 3});
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
        Map<String, String> results = new HashMap<>();
        Session session = this.rocks.session();
        Iterator<BackendColumn> iter = session.scan(TABLE);
        while (iter.hasNext()) {
            BackendColumn col = iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java

        results = new HashMap<>();
        iter = session.scan(TABLE);
        while (iter.hasNext()) {
            BackendColumn col = iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java

        results = new HashMap<>();
        iter = session.scan(TABLE);
        while (iter.hasNext()) {
            BackendColumn col = iter.next();
```

### AutoCloseableResource
'BackendColumnIterator' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java

        results = new HashMap<>();
        iter = session.scan(TABLE);
        while (iter.hasNext()) {
            BackendColumn col = iter.next();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testProperty() {
        BytesBuffer buf = BytesBuffer.allocate(0);
        PropertyKey pkey = genPkey(DataType.BOOLEAN);
        Object value = true;
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes("01");
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        value = false;
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.BYTE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.INT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.INT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.LONG);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.DOUBLE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.DATE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.TEXT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.BLOB);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(Blob.wrap((byte[]) value),
                            BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.UUID);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertArrayEquals((int[]) value, (int[])
                                 BytesBuffer.wrap(bytes).readProperty(pkey));
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testPropertyWithSet() {
        BytesBuffer buf = BytesBuffer.allocate(0);
        PropertyKey pkey = genSetPkey(DataType.BOOLEAN);
        Object value = ImmutableSet.of(true, false);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes("020100");
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.BYTE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.BYTE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.INT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.LONG);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.DOUBLE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.DATE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.TEXT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.BLOB);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Set<?> set = (Set<?>) BytesBuffer.wrap(bytes).readProperty(pkey);
        Iterator<?> iterator = set.iterator();
        Assert.assertEquals(Blob.wrap(genBytes("001199aabbcc")),
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genSetPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        set = (Set<?>) BytesBuffer.wrap(bytes).readProperty(pkey);
        iterator = set.iterator();
        Assert.assertArrayEquals(new int[]{1, 3}, (int[]) iterator.next());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Id id = IdGenerator.of(0);
        byte[] bytes = genBytes("0800");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-1);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-1);
        bytes = genBytes("07ff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-127);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-127);
        bytes = genBytes("0781");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-128);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-128);
        bytes = genBytes("0780");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-129);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-129);
        bytes = genBytes("077f");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-255);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-255);
        bytes = genBytes("0701");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-256);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-256);
        bytes = genBytes("0700");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(-1573);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(-1573);
        bytes = genBytes("01db");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ff);
        bytes = genBytes("0000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 3 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ff - 1);
        bytes = genBytes("17f7ff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffff);
        bytes = genBytes("100000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 4 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffff - 1);
        bytes = genBytes("27f7ffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffffff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffff);
        bytes = genBytes("20000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 5 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffff - 1);
        bytes = genBytes("37f7ffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffL);
        bytes = genBytes("3000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 6 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffL - 1L);
        bytes = genBytes("47f7ffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffL);
        bytes = genBytes("400000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 7 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffL - 1L);
        bytes = genBytes("57f7ffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffffL);
        bytes = genBytes("50000000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 8 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffffL - 1L);
        bytes = genBytes("67f7ffffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(~0x7ffffffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffffffL);
        bytes = genBytes("6000000000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 9 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(~0x7ffffffffffffffL - 1L);
        bytes = genBytes("70f7ffffffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // others
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Short.MIN_VALUE);
        bytes = genBytes("178000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Short.MIN_VALUE - 1);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Short.MIN_VALUE - 1);
        bytes = genBytes("177fff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Integer.MIN_VALUE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Integer.MIN_VALUE);
        bytes = genBytes("3780000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Integer.MIN_VALUE - 1L);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Integer.MIN_VALUE - 1L);
        bytes = genBytes("377fffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Long.MIN_VALUE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Long.MIN_VALUE);
        bytes = genBytes("708000000000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes(128);
        bytes[0] = (byte) 0xfe;
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(genString(128));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes = genBytes(129);
        bytes[0] = (byte) 0xff;
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            BytesBuffer.allocate(0).writeId(IdGenerator.of(genString(129)));
        }, e -> {
            Assert.assertContains("Id max length is 128, but got 129",
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        });
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            BytesBuffer.allocate(0).writeId(IdGenerator.of(genString(130)));
        }, e -> {
            Assert.assertContains("Id max length is 128, but got 130",
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testWrap() {
        BytesBuffer buf4 = BytesBuffer.wrap(new byte[]{1, 2, 3, 4});
        Assert.assertArrayEquals(new byte[]{1, 2, 3, 4}, buf4.array());
        Assert.assertArrayEquals(new byte[]{1, 2, 3, 4}, buf4.read(4));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Id id = IdGenerator.of(0);
        byte[] bytes = genBytes("0800");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(1);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(1);
        bytes = genBytes("0801");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(127);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(127);
        bytes = genBytes("087f");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(128);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(128);
        bytes = genBytes("0880");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(255);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(255);
        bytes = genBytes("08ff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(256);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(256);
        bytes = genBytes("0900");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(1573);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(1573);
        bytes = genBytes("0e25");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ff);
        bytes = genBytes("0fff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 3 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ff + 1);
        bytes = genBytes("180800");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffff);
        bytes = genBytes("1fffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 4 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffff + 1);
        bytes = genBytes("28080000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffffff);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffff);
        bytes = genBytes("2fffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 5 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffff + 1);
        bytes = genBytes("3808000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffL);
        bytes = genBytes("3fffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 6 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffL + 1L);
        bytes = genBytes("480800000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffL);
        bytes = genBytes("4fffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 7 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffL + 1L);
        bytes = genBytes("58080000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffffL);
        bytes = genBytes("5fffffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 8 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffffL + 1L);
        bytes = genBytes("6808000000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(0x7ffffffffffffffL);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffffffL);
        bytes = genBytes("6fffffffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // 9 bytes
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(0x7ffffffffffffffL + 1L);
        bytes = genBytes("780800000000000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        // others
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Short.MAX_VALUE);
        bytes = genBytes("187fff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Short.MAX_VALUE + 1);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Short.MAX_VALUE + 1);
        bytes = genBytes("188000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Integer.MAX_VALUE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Integer.MAX_VALUE);
        bytes = genBytes("387fffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Integer.MAX_VALUE + 1L);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Integer.MAX_VALUE + 1L);
        bytes = genBytes("3880000000");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of(Long.MAX_VALUE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = IdGenerator.of(Long.MAX_VALUE);
        bytes = genBytes("787fffffffffffffff");
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(2)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes("7f835e1153928149578691cf79258e90eb");

        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(17)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(17)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = new UuidId(UUID.randomUUID());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        id = new UuidId(UUID.randomUUID());
        bytes = BytesBuffer.allocate(0).writeId(id).bytes();
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
    }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        id = new UuidId(UUID.randomUUID());
        bytes = BytesBuffer.allocate(0).writeId(id).bytes();
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes[0] = (byte) 0x80;
        bytes[1] = (byte) 0x7f;
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));

        id = IdGenerator.of(genString(32512));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes[0] = (byte) 0xfe;
        bytes[1] = (byte) 0xff;
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));

        id = IdGenerator.of(genString(32768));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes[0] = (byte) 0xff;
        bytes[1] = (byte) 0xff;
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(0)
                                                   .writeId(id, true).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId(true));

        Assert.assertThrows(IllegalArgumentException.class, () -> {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            BytesBuffer.allocate(0).writeId(IdGenerator.of(genString(32769)),
                                            true);
        }, e -> {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testPropertyWithList() {
        BytesBuffer buf = BytesBuffer.allocate(0);
        PropertyKey pkey = genListPkey(DataType.BOOLEAN);
        Object value = ImmutableList.of(true, false);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = genBytes("020100");
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.BYTE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.BYTE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.INT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.FLOAT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.LONG);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.DOUBLE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.DATE);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.TEXT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.BLOB);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        List<?> list = (List<?>) BytesBuffer.wrap(bytes).readProperty(pkey);
        Assert.assertEquals(Blob.wrap(genBytes("001199aabbcc")), list.get(0));
        Assert.assertEquals(Blob.wrap(genBytes("5566")), list.get(1));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        Assert.assertEquals(value, BytesBuffer.wrap(bytes).readProperty(pkey));

        pkey = genListPkey(DataType.OBJECT);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf.forReadWritten();
        Assert.assertArrayEquals(bytes, buf.writeProperty(pkey, value).bytes());
        list = (List<?>) BytesBuffer.wrap(bytes).readProperty(pkey);
        Assert.assertArrayEquals(new int[]{1, 3}, (int[]) list.get(0));
        Assert.assertArrayEquals(new int[]{2, 5}, (int[]) list.get(1));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    public void testVarInt() {
        Assert.assertArrayEquals(new byte[]{0},
                                 BytesBuffer.allocate(5).writeVInt(0).bytes());
        Assert.assertArrayEquals(new byte[]{1},
                                 BytesBuffer.allocate(5).writeVInt(1).bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVInt(0).bytes());
        Assert.assertArrayEquals(new byte[]{1},
                                 BytesBuffer.allocate(5).writeVInt(1).bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x7f},
                                 BytesBuffer.allocate(5)
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVInt(1).bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x7f},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(127)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(128)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0x7f},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(16383)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, (byte) 0x80, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(16384)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, (byte) 0x80, 1},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(16385)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        Assert.assertArrayEquals(new byte[]{-113, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5).writeVInt(-1).bytes());
        Assert.assertArrayEquals(new byte[]{-121, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5)
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVInt(-1).bytes());
        Assert.assertArrayEquals(new byte[]{-121, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(Integer.MAX_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{-120, -128, -128, -128, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVInt(Integer.MIN_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            BytesBuffer buf = BytesBuffer.allocate(5).writeVInt(i);
            Assert.assertEquals(i, buf.forReadWritten().readVInt());
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Random random = new Random();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE;) {
            BytesBuffer buf = BytesBuffer.allocate(5).writeVInt(i);
            Assert.assertEquals(i, buf.forReadWritten().readVInt());

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        byte[] bytes = new byte[]{(byte) 0x82, 97, 98, 99};

        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(4)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(4)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());

        id = IdGenerator.of("abcd");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        bytes = new byte[]{(byte) 0x83, 97, 98, 99, 100};

        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(5)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(bytes, BytesBuffer.allocate(5)
                                                   .writeId(id).bytes());
        Assert.assertEquals(id, BytesBuffer.wrap(bytes).readId());
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testAllocate() {
        Assert.assertEquals(0, BytesBuffer.allocate(0).array().length);
        Assert.assertEquals(0, BytesBuffer.allocate(0).bytes().length);

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    public void testAllocate() {
        Assert.assertEquals(0, BytesBuffer.allocate(0).array().length);
        Assert.assertEquals(0, BytesBuffer.allocate(0).bytes().length);

        Assert.assertEquals(4, BytesBuffer.allocate(4).array().length);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertEquals(0, BytesBuffer.allocate(0).bytes().length);

        Assert.assertEquals(4, BytesBuffer.allocate(4).array().length);
        Assert.assertEquals(0, BytesBuffer.allocate(4).bytes().length);

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        Assert.assertEquals(4, BytesBuffer.allocate(4).array().length);
        Assert.assertEquals(0, BytesBuffer.allocate(4).bytes().length);

        BytesBuffer buf4 = BytesBuffer.allocate(4);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertEquals(0, BytesBuffer.allocate(4).bytes().length);

        BytesBuffer buf4 = BytesBuffer.allocate(4);
        buf4.write(new byte[4]);
        Assert.assertArrayEquals(new byte[]{0, 0, 0, 0},
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf4.bytes());

        BytesBuffer buf2 = BytesBuffer.allocate(2);
        buf2.write(new byte[4]);
        Assert.assertArrayEquals(new byte[]{0, 0, 0, 0},
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf2.bytes());

        BytesBuffer buf0 = BytesBuffer.allocate(0);
        buf0.write(new byte[4]);
        Assert.assertArrayEquals(new byte[]{0, 0, 0, 0},
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    public void testVarLong() {
        Assert.assertArrayEquals(new byte[]{0},
                                 BytesBuffer.allocate(5).writeVLong(0).bytes());
        Assert.assertArrayEquals(new byte[]{1},
                                 BytesBuffer.allocate(5).writeVLong(1).bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVLong(0).bytes());
        Assert.assertArrayEquals(new byte[]{1},
                                 BytesBuffer.allocate(5).writeVLong(1).bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x7f},
                                 BytesBuffer.allocate(5)
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVLong(1).bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x7f},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(127)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(128)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0x7f},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(16383)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, (byte) 0x80, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(16384)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                            .bytes());
        Assert.assertArrayEquals(new byte[]{(byte) 0x81, (byte) 0x80, 1},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(16385)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(new byte[]{-127, -1, -1, -1, -1,
                                            -1, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5).writeVLong(-1).bytes());
        Assert.assertArrayEquals(new byte[]{-121, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5)
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 BytesBuffer.allocate(5).writeVLong(-1).bytes());
        Assert.assertArrayEquals(new byte[]{-121, -1, -1, -1, 127},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(Integer.MAX_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(new byte[]{-127, -1, -1, -1, -1,
                                            -8, -128, -128, -128, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(Integer.MIN_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(new byte[]{-1, -1, -1, -1, -1,
                                            -1, -1, -1, 127},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(Long.MAX_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Assert.assertArrayEquals(new byte[]{-127, -128, -128, -128, -128,
                                            -128, -128, -128, -128, 0},
                                 BytesBuffer.allocate(5)
                                            .writeVLong(Long.MIN_VALUE)
                                            .bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        for (long i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            BytesBuffer buf = BytesBuffer.allocate(10).writeVLong(i);
            Assert.assertEquals(i, buf.forReadWritten().readVLong());
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        Random random = new Random();
        for (long i = Long.MIN_VALUE; i < Long.MAX_VALUE;) {
            BytesBuffer buf = BytesBuffer.allocate(10).writeVLong(i);
            Assert.assertEquals(i, buf.forReadWritten().readVLong());

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
    @Test
    public void testString() {
        BytesBuffer buf = BytesBuffer.allocate(0);
        buf.writeStringRaw("any");
        byte[] bytes = genBytes("616e79");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        bytes = genBytes("61626364");
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes,
                                 buf.writeStringToRemaining("abcd").bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf.writeStringToRemaining("abcd").bytes());
        Assert.assertEquals("abcd",
                            BytesBuffer.wrap(bytes).readStringFromRemaining());

        bytes = genBytes("0461626364");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        bytes = genBytes("0461626364");
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes, buf.writeString("abcd").bytes());
        Assert.assertEquals("abcd", BytesBuffer.wrap(bytes).readString());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes, buf.writeString("abcd").bytes());
        Assert.assertEquals("abcd", BytesBuffer.wrap(bytes).readString());

        bytes = genBytes("6162636400");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        bytes = genBytes("6162636400");
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes,
                                 buf.writeStringWithEnding("abcd").bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf.writeStringWithEnding("abcd").bytes());
        Assert.assertEquals("abcd",
                            BytesBuffer.wrap(bytes).readStringWithEnding());

        bytes = genBytes("61620100");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        bytes = genBytes("61620100");
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes,
                                 buf.writeStringWithEnding("ab\u0001").bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf.writeStringWithEnding("ab\u0001").bytes());
        Assert.assertEquals("ab\u0001",
                            BytesBuffer.wrap(bytes).readStringWithEnding());

        bytes = genBytes("61627f00");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        bytes = genBytes("61627f00");
        buf = BytesBuffer.allocate(0);
        Assert.assertArrayEquals(bytes,
                                 buf.writeStringWithEnding("ab\u007f").bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
                                 buf.writeStringWithEnding("ab\u007f").bytes());
        Assert.assertEquals("ab\u007f",
                            BytesBuffer.wrap(bytes).readStringWithEnding());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            BytesBuffer.allocate(0).writeStringWithEnding("ab\u0000");
        }, e -> {
            Assert.assertContains("Can't contains byte '0x00' in string",
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        });

        buf = BytesBuffer.allocate(0);
        buf.writeStringWithEnding("ab\uffff");
        buf.forReadWritten();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/StringEncoding.java`
#### Snippet
```java

    public static byte[] compress(String value, float bufferRatio) {
        BytesBuffer buf = LZ4Util.compress(encode(value), BLOCK_SIZE, bufferRatio);
        return buf.bytes();
    }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/StringEncoding.java`
#### Snippet
```java

    public static String decompress(byte[] value, float bufferRatio) {
        BytesBuffer buf = LZ4Util.decompress(value, BLOCK_SIZE, bufferRatio);
        return decode(buf.array(), 0, buf.position());
    }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdUtil.java`
#### Snippet
```java

    public static Id readBinString(Object id) {
        BytesBuffer buffer = BytesBuffer.wrap((ByteBuffer) id);
        return buffer.readId();
    }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdUtil.java`
#### Snippet
```java
    public static Object writeBinString(Id id) {
        int len = id.edge() ? BytesBuffer.BUF_EDGE_ID : id.length() + 1;
        BytesBuffer buffer = BytesBuffer.allocate(len).writeId(id);
        buffer.forReadWritten();
        return buffer.asByteBuffer();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java
        private static UUID fromBytes(byte[] bytes) {
            E.checkArgument(bytes != null, "The UUID can't be null");
            BytesBuffer buffer = BytesBuffer.wrap(bytes);
            long high = buffer.readLong();
            long low = buffer.readLong();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/id/IdGenerator.java`
#### Snippet
```java
        @Override
        public byte[] asBytes() {
            BytesBuffer buffer = BytesBuffer.allocate(16);
            buffer.writeLong(this.uuid.getMostSignificantBits());
            buffer.writeLong(this.uuid.getLeastSignificantBits());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageInfo.java`
#### Snippet
```java
        byte[] pageState = PageState.toBytes(this.page);
        int length = 2 + BytesBuffer.INT_LEN + pageState.length;
        BytesBuffer buffer = BytesBuffer.allocate(length);
        buffer.writeInt(this.offset);
        buffer.writeBytes(pageState);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageInfo.java`
#### Snippet
```java
        }
        try {
            BytesBuffer buffer = BytesBuffer.wrap(bytes);
            int offset = buffer.readInt();
            byte[] pageState = buffer.readBytes();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageState.java`
#### Snippet
```java
        }
        try {
            BytesBuffer buffer = BytesBuffer.wrap(bytes);
            return new PageState(buffer.readBytes(), buffer.readInt(),
                                 buffer.readInt());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/page/PageState.java`
#### Snippet
```java
        assert this.position.length > 0;
        int length = 2 + this.position.length + 2 * BytesBuffer.INT_LEN;
        BytesBuffer buffer = BytesBuffer.allocate(length);
        buffer.writeBytes(this.position);
        buffer.writeInt(this.offset);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/OffheapCache.java`
#### Snippet
```java
        @Override
        public Id deserialize(ByteBuffer input) {
            return BytesBuffer.wrap(input).readId(true);
        }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/OffheapCache.java`
#### Snippet
```java
        public int serializedSize(Id id) {
            // NOTE: return size must be == actual bytes to write
            return BytesBuffer.allocate(id.length() + 2)
                              .writeId(id, true).position();
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/OffheapCache.java`
#### Snippet
```java
        @Override
        public void serialize(Id id, ByteBuffer output) {
            BytesBuffer.wrap(output).writeId(id, true);
        }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/StoreSerializer.java`
#### Snippet
```java

    public static byte[] writeMutation(BackendMutation mutation) {
        BytesBuffer buffer = BytesBuffer.allocate(MUTATION_SIZE);
        // write mutation size
        buffer.writeVInt(mutation.size());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/StoreStateMachine.java`
#### Snippet
```java
        // Leader just take the command out from the closure
        StoreCommand command = closure.command();
        BytesBuffer buffer = BytesBuffer.wrap(command.data());
        // The first two bytes are StoreType and StoreAction
        StoreType type = StoreType.valueOf(buffer.read());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
        Task task = new Task();
        // Compress data, note compress() will return a BytesBuffer
        ByteBuffer buffer = LZ4Util.compress(command.data(),
                                             RaftContext.BLOCK_SIZE)
                                   .forReadWritten()
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinaryScatterSerializer.java`
#### Snippet
```java
        VertexLabel vertexLabel = VertexLabel.NONE;
        if (vl != null) {
            Id labelId = BytesBuffer.wrap(vl.value).readId();
            vertexLabel = graph.vertexLabelOrNone(labelId);
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinaryBackendEntry.java`
#### Snippet
```java

    public BinaryBackendEntry(HugeType type, byte[] bytes, boolean enablePartition) {
        this(type, BytesBuffer.wrap(bytes).parseId(type, enablePartition));
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinaryBackendEntry.java`
#### Snippet
```java

    public BinaryBackendEntry(HugeType type, byte[] bytes) {
        this(type, BytesBuffer.wrap(bytes).parseId(type, false));
    }

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java
            assert type.isRangeIndex();
            int length = type.isRange4Index() ? 4 : 8;
            BytesBuffer buffer = BytesBuffer.allocate(4 + length);
            buffer.writeInt(SchemaElement.schemaId(indexLabelId));
            if (fieldValues != null) {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java
            final int labelLength = 4;
            E.checkState(id.length > labelLength, "Invalid range index id");
            BytesBuffer buffer = BytesBuffer.wrap(id);
            Id label = IdGenerator.of(buffer.readInt());
            indexLabel = IndexLabel.label(graph, label);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java

    protected void parseColumn(BackendColumn col, HugeVertex vertex) {
        BytesBuffer buffer = BytesBuffer.wrap(col.name);
        Id id = this.keyWithIdPrefix ? buffer.readId() : vertex.id();
        E.checkState(buffer.remaining() > 0, "Missing column type");
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        private byte[] writeId(Id id) {
            int size = 1 + id.length();
            BytesBuffer buffer = BytesBuffer.allocate(size);
            buffer.writeId(id);
            return buffer.bytes();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                continue;
            }
            BytesBuffer buffer = BytesBuffer.wrap(col.name);
            if (this.indexWithIdPrefix) {
                buffer.readIndexId(index.type());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        col.name = this.formatSyspropName(elem.id(), HugeKeys.LABEL);
        Id label = elem.schemaLabel().id();
        BytesBuffer buffer = BytesBuffer.allocate(label.length() + 1);
        col.value = buffer.writeId(label).bytes();
        return col;
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        start.writeId(label);

        BytesBuffer end = BytesBuffer.allocate(BytesBuffer.BUF_EDGE_ID);
        end.copyFrom(start);

```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            id = new BinaryId(buffer.bytes(), id);
        } else {
            BytesBuffer buffer = BytesBuffer.allocate(1 + id.length());
            id = new BinaryId(buffer.writeId(id).bytes(), id);
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
    public BackendEntry writeOlapVertex(HugeVertex vertex) {
        BinaryBackendEntry entry = newBackendEntry(HugeType.OLAP, vertex.id());
        BytesBuffer buffer = BytesBuffer.allocate(8 + 16);

        Collection<HugeProperty<?>> properties = vertex.getProperties();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            Id id = this.entry.id().origin();
            int size = 1 + id.length() + 1;
            BytesBuffer buffer = BytesBuffer.allocate(size);
            buffer.writeId(id);
            buffer.write(key.code());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java

    protected BackendColumn formatProperty(HugeProperty<?> prop) {
        BytesBuffer buffer = BytesBuffer.allocate(BytesBuffer.BUF_PROPERTY);
        buffer.writeProperty(prop.propertyKey(), prop.value());
        return BackendColumn.of(this.formatPropertyName(prop), buffer.bytes());
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java

        private Id readId(byte[] value) {
            BytesBuffer buffer = BytesBuffer.wrap(value);
            return buffer.readId();
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            bytes = Arrays.copyOfRange(bytes, parsedEntry.id().length(), bytes.length);
        }
        BytesBuffer buffer = BytesBuffer.allocate(BytesBuffer.BUF_EDGE_ID);
        buffer.write(parsedEntry.id().asBytes());
        buffer.write(bytes);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        buffer.write(bytes);
        parsedEntry = new BinaryBackendEntry(originEntry.type(), new BinaryId(buffer.bytes(),
                                             BytesBuffer.wrap(buffer.bytes()).readEdgeId()));

        for (BackendColumn col : originEntry.columns()) {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        if (!this.indexWithIdPrefix) {
            int idLen = 1 + elemId.length();
            buffer = BytesBuffer.allocate(idLen);
        } else {
            Id indexId = index.id();
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            }
            int idLen = 1 + elemId.length() + 1 + indexId.length();
            buffer = BytesBuffer.allocate(idLen);
            // Write index-id
            buffer.writeIndexId(indexId, type);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        int idLen = this.keyWithIdPrefix ? 1 + id.length() : 0;
        Id pkeyId = prop.propertyKey().id();
        BytesBuffer buffer = BytesBuffer.allocate(idLen + 2 + pkeyId.length());
        if (this.keyWithIdPrefix) {
            buffer.writeId(id);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        private long readLong(HugeKeys key) {
            byte[] value = column(key);
            BytesBuffer buffer = BytesBuffer.wrap(value);
            return buffer.readVLong();
        }
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                size += (1 + id.length());
            }
            BytesBuffer buffer = BytesBuffer.allocate(size);
            buffer.writeUInt16(ids.size());
            for (Id id : ids) {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            edgeId = EdgeId.parse(id.asString());
        }
        BytesBuffer buffer = BytesBuffer.allocate(BytesBuffer.BUF_EDGE_ID);
        if (this.enablePartition) {
            buffer.writeShort(getPartition(HugeType.EDGE, edgeId.ownerVertexId()));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        if (index.type().isStringIndex()) {
            byte[] idBytes = IdGenerator.of(id.asString()).asBytes();
            BytesBuffer buffer = BytesBuffer.allocate(idBytes.length);
            buffer.write(idBytes);
            entry.column(buffer.bytes(), null);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        } else {
            assert index.type().isRangeIndex();
            BytesBuffer buffer = BytesBuffer.allocate(4);
            buffer.writeInt((int) id.asLong());
            entry.column(buffer.bytes(), null);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java

        private Id[] readIds(byte[] value) {
            BytesBuffer buffer = BytesBuffer.wrap(value);
            int size = buffer.readUInt16();
            Id[] ids = new Id[size];
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
            id = HugeIndex.formatIndexHashId(type, indexLabel, fieldValues);
        }
        BytesBuffer buffer = BytesBuffer.allocate(1 + id.length());
        byte[] idBytes = buffer.writeIndexId(id, type, withEnding).bytes();
        return new BinaryId(idBytes, id);
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
                }
            }
            BytesBuffer buffer = BytesBuffer.allocate(1 + id.length());
            byte[] idBytes = buffer.writeIndexId(id, type).bytes();
            return new BinaryBackendEntry(type, new BinaryId(idBytes, id));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
        }

        BytesBuffer buffer = BytesBuffer.allocate(1 + id.length());
        byte[] idBytes = buffer.writeId(id).bytes();
        return new BinaryBackendEntry(type, new BinaryId(idBytes, id));
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
    protected byte[] formatSyspropName(BinaryId id, HugeKeys col) {
        int idLen = this.keyWithIdPrefix ? id.length() : 0;
        BytesBuffer buffer = BytesBuffer.allocate(idLen + 1 + 1);
        byte sysprop = HugeType.SYS_PROPERTY.code();
        if (this.keyWithIdPrefix) {
```

### AutoCloseableResource
'BytesBuffer' used without 'try'-with-resources statement
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BinarySerializer.java`
#### Snippet
```java
    protected byte[] formatSyspropName(Id id, HugeKeys col) {
        int idLen = this.keyWithIdPrefix ? 1 + id.length() : 0;
        BytesBuffer buffer = BytesBuffer.allocate(idLen + 1 + 1);
        byte sysprop = HugeType.SYS_PROPERTY.code();
        if (this.keyWithIdPrefix) {
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseMetrics.java`
#### Snippet
```java
    private Map<String, Object> clusterInfo() {
        Map<String, Object> results = InsertionOrderUtil.newMap();
        try (Admin admin = this.hbase.hbase().getAdmin()) {
            // Cluster info
            ClusterMetrics clusterMetrics = admin.getClusterMetrics();
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseMetrics.java`
#### Snippet
```java
        }

        try (Admin admin = this.hbase.hbase().getAdmin()) {
            ClusterMetrics clusterMetrics = admin.getClusterMetrics();
            Map<ServerName, ServerMetrics> metrics =
```

### AutoCloseableResource
'RowIterator' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTables.java`
#### Snippet
```java
                session.commit();
                // Prefix query index label related indexes
                HbaseSessions.RowIterator iter = session.scan(this.table(), column.name);
                while (iter.hasNext()) {
                    session.delete(this.table(), CF, iter.next().getRow());
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
            Map<String, Range> regionRanges = InsertionOrderUtil.newMap();
            TableName tableName = TableName.valueOf(namespace, table);
            try (Admin admin = session.hbase().getAdmin()) {
                for (RegionInfo regionInfo : admin.getRegions(tableName)) {
                    byte[] start = regionInfo.getStartKey();
```

### AutoCloseableResource
'Connection' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
                                                       String table) {
            Map<String, Double> regionSizes = new HashMap<>();
            try (Admin admin = session.hbase().getAdmin()) {
                TableName tableName = TableName.valueOf(namespace, table);
                for (ServerName serverName : admin.getRegionServers()) {
```

### AutoCloseableResource
'RowIterator' used without 'try'-with-resources statement
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
        private void dump(String table, Scan scan) throws IOException {
            LOG.info(String.format(">>>> scan table {} with {}", table, scan));
            RowIterator iterator = this.scan(table, scan);
            while (iterator.hasNext()) {
                Result row = iterator.next();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/gremlin/GremlinAPI.java`
#### Snippet
```java
        // .build();
        String auth = headers.getHeaderString(HttpHeaders.AUTHORIZATION);
        Response response = this.client().doPostRequest(auth, request);
        GREMLIN_INPUT_HISTOGRAM.update(request.length());
        GREMLIN_OUTPUT_HISTOGRAM.update(response.getLength());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/gremlin/GremlinAPI.java`
#### Snippet
```java
        String query = uriInfo.getRequestUri().getRawQuery();
        MultivaluedMap<String, String> params = uriInfo.getQueryParameters();
        Response response = this.client().doGetRequest(auth, params);
        GREMLIN_INPUT_HISTOGRAM.update(query.length());
        GREMLIN_OUTPUT_HISTOGRAM.update(response.getLength());
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String meters() {
        ServerReporter reporter = ServerReporter.instance();
        return JsonUtil.toJson(reporter.meters());
    }
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String timers() {
        ServerReporter reporter = ServerReporter.instance();
        return JsonUtil.toJson(reporter.timers());
    }
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String all() {
        ServerReporter reporter = ServerReporter.instance();
        Map<String, Map<String, ? extends Metric>> result = new LinkedHashMap<>();
        result.put("gauges", reporter.gauges());
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String counters() {
        ServerReporter reporter = ServerReporter.instance();
        return JsonUtil.toJson(reporter.counters());
    }
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String gauges() {
        ServerReporter reporter = ServerReporter.instance();
        return JsonUtil.toJson(reporter.gauges());
    }
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    @RolesAllowed({"admin", "$owner= $action=metrics_read"})
    public String histograms() {
        ServerReporter reporter = ServerReporter.instance();
        return JsonUtil.toJson(reporter.histograms());
    }
```

### AutoCloseableResource
'ServerReporter' used without 'try'-with-resources statement
in `hugegraph-api/src/main/java/org/apache/hugegraph/core/GraphManager.java`
#### Snippet
```java
        final MetricManager metric = MetricManager.INSTANCE;
        // Force to add server reporter
        ServerReporter reporter = ServerReporter.instance(metric.getRegistry());
        reporter.start(60L, TimeUnit.SECONDS);

```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'START.equals(...)' covered by subsequent condition 'END.equals(...)'
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBTable.java`
#### Snippet
```java
        @Override
        public byte[] position(String position) {
            if (START.equals(position) || END.equals(position)) {
                return null;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'value != null' covered by subsequent condition '"\\u0000".equals(...)'
in `hugegraph-postgresql/src/main/java/org/apache/hugegraph/backend/store/postgresql/PostgresqlSerializer.java`
#### Snippet
```java
        } else {
            Object value = index.fieldValues();
            if (value != null && "\u0000".equals(value)) {
                value = Strings.EMPTY;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'rootCause instanceof InterruptedException' covered by subsequent condition 'rootCause instanceof TraversalInterruptedException'
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeException.java`
#### Snippet
```java
    public static boolean isInterrupted(Throwable e) {
        Throwable rootCause = HugeException.rootCause(e);
        return rootCause instanceof InterruptedException ||
               rootCause instanceof TraversalInterruptedException ||
               rootCause instanceof InterruptedIOException;
```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof CountGlobalStep' covered by subsequent condition 'step instanceof GraphStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
        Step<?, ?> step = originStep;
        do {
            if (!(step instanceof CountGlobalStep ||
                  step instanceof GraphStep ||
                  step instanceof IdentityStep ||
```

### ConditionCoveredByFurtherCondition
Condition 's instanceof SideEffectStep' covered by subsequent condition 's instanceof AggregateGlobalStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeCountStepStrategy.java`
#### Snippet
```java
                 (step instanceof TraversalParent &&
                  TraversalHelper.anyStepRecursively(s -> {
                      return s instanceof SideEffectStep ||
                             s instanceof AggregateGlobalStep ||
                             s instanceof AggregateLocalStep;
```

### ConditionCoveredByFurtherCondition
Condition '!(key instanceof String)' covered by subsequent condition '!(key instanceof T)'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeElement.java`
#### Snippet
```java
            Object val = keyValues[i + 1];

            if (!(key instanceof String) && !(key instanceof T)) {
                throw Element.Exceptions.providedKeyValuesMustHaveALegalKeyOnEvenIndices();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'limit == Query.NO_LIMIT' covered by subsequent condition 'limit \> 0L'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/records/KneighborRecords.java`
#### Snippet
```java
        for (int i = 1; i < records.size(); i++) {
            IntIterator iterator = records.get(i).keys();
            while ((limit == Query.NO_LIMIT || limit > 0L) && iterator.hasNext()) {
                paths.add(this.linkPath(i, iterator.next()));
                limit--;
```

### ConditionCoveredByFurtherCondition
Condition 'limit == Query.NO_LIMIT' covered by subsequent condition 'limit \> 0L'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/records/KneighborRecords.java`
#### Snippet
```java
        for (int i = 1; i < records.size(); i++) {
            IntIterator iterator = records.get(i).keys();
            while ((limit == Query.NO_LIMIT || limit > 0L) && iterator.hasNext()) {
                ids.add(this.id(iterator.next()));
                limit--;
```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof FilterStep' covered by subsequent condition 'step instanceof PropertiesStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                }
            }
        } while (step instanceof FilterStep ||
                 step instanceof PropertiesStep ||
                 step instanceof IdentityStep ||
```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof CountGlobalStep' covered by subsequent condition 'step instanceof FilterStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                holder.setCount();
            }
        } while (step instanceof CountGlobalStep ||
                 step instanceof FilterStep ||
                 step instanceof IdentityStep ||
```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof RangeGlobalStep' covered by subsequent condition 'step instanceof IdentityStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                }
            }
        } while (step instanceof RangeGlobalStep ||
                 step instanceof IdentityStep ||
                 step instanceof NoOpBarrierStep);
```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof HasStep' covered by subsequent condition 'step instanceof NoOpBarrierStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
            step = step.getNextStep();
        } while (step instanceof HasStep || step instanceof NoOpBarrierStep);
    }

```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof HasStep' covered by subsequent condition 'step instanceof NoOpBarrierStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                traversal.removeStep(step);
            }
        } while (step instanceof HasStep || step instanceof NoOpBarrierStep);
    }

```

### ConditionCoveredByFurtherCondition
Condition 'step instanceof OrderGlobalStep' covered by subsequent condition 'step instanceof IdentityStep'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
            }
            step = step.getNextStep();
        } while (step instanceof OrderGlobalStep ||
                 step instanceof IdentityStep);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'START.equals(...)' covered by subsequent condition 'END.equals(...)'
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        @Override
        public byte[] position(String position) {
            if (START.equals(position) || END.equals(position)) {
                return null;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'ex instanceof InterruptedException' covered by subsequent condition 'ex instanceof TraversalInterruptedException'
in `hugegraph-api/src/main/java/org/apache/hugegraph/opencypher/CypherOpProcessor.java`
#### Snippet
```java

    private String getErrorMessage(RequestMessage msg, Exception ex) {
        if (ex instanceof InterruptedException || ex instanceof TraversalInterruptedException) {
            return String.format("A timeout occurred during traversal evaluation of [%s] " +
                                 "- consider increasing the limit given to scriptEvaluationTimeout",
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.Number\[\]' found
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                      "Invalid value '%s', expect a list of number", value);
        }
        return values.toArray(new Number[0]);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExample4.java`
#### Snippet
```java
     * @param args 3 arguments, 1st should be 1, meaning single thread,
     *             product of 2nd and 3rd is total number of "person" vertices
     * @throws InterruptedException
     */
    public static void main(String[] args) throws Exception {
```

### JavadocDeclaration
`@param index` tag description is missing
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/system/JobCounters.java`
#### Snippet
```java
        /**
         * Try to add edge in collection waiting to be deleted
         * @param index
         * @return true if we should create a new delete job, false otherwise
         */
```

### JavadocDeclaration
`@param element` tag description is missing
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/system/JobCounters.java`
#### Snippet
```java
        /**
         * Try to add element in collection waiting to be deleted
         * @param element
         * @return true if we should create a new delete job, false otherwise
         */
```

### JavadocDeclaration
`@param traversal` tag description is missing
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
    /**
     * Does a Traversal contain any Tree step
     * @param traversal
     * @return the traversal or its parents contain at least one Tree step
     */
```

### JavadocDeclaration
`@param traversal` tag description is missing
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/HugeVertexStepStrategy.java`
#### Snippet
```java
    /**
     * Does a Traversal contain any Path step
     * @param traversal
     * @return the traversal or its parents contain at least one Path step
     */
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `idParts` to `Object[]` is redundant
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloTables.java`
#### Snippet
```java
                if (idParts.length == 1) {
                    // Delete edge by label
                    return Arrays.asList((Object[]) idParts);
                }
                id = IdUtil.readString(id.asString());
```

### RedundantCast
Casting `idParts` to `Object[]` is redundant
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlTables.java`
#### Snippet
```java
                if (idParts.length == 1) {
                    // Delete edge by label
                    return Arrays.asList((Object[]) idParts);
                }
                id = IdUtil.readString(id.asString());
```

### RedundantCast
Casting `query.condition(...)` to `Id` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java
        }

        Id label = (Id) query.condition(HugeKeys.LABEL);

        // Optimize vertex query
```

### RedundantCast
Casting `this.buffer` to `Buffer` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/serializer/BytesBuffer.java`
#### Snippet
```java
                        MAX_BUFFER_CAPACITY);
        ByteBuffer newBuffer = ByteBuffer.allocate(newCapacity);
        ((Buffer) this.buffer).flip();
        newBuffer.put(this.buffer);
        this.buffer = newBuffer;
```

### RedundantCast
Casting `p` to `P` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java
                collectPredicates(results, ((ConnectiveP) p).getPredicates());
            } else {
                results.add((P<Object>) p);
            }
        }
```

### RedundantCast
Casting `origin` to `TraversalStrategy` is redundant
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java
        public TraversalStrategyProxy(TraversalStrategy<?> origin) {
            @SuppressWarnings({ "rawtypes", "unchecked" })
            TraversalStrategy<T> strategy = (TraversalStrategy) origin;
            this.origin = strategy;
        }
```

## RuleId[id=ThreadWithDefaultRunMethod]
### ThreadWithDefaultRunMethod
Instantiating a `Thread` with default 'run()' method
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
    public void testThread() {
        // access thread group
        new Thread();
        String result = runGremlinJob("new Thread()");
        assertError(result, "Not allowed to access thread group via Gremlin");
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `batch` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraSessionPool.java`
#### Snippet
```java

        private com.datastax.driver.core.Session session;
        private BatchStatement batch;

        public Session() {
```

### FieldMayBeFinal
Field `partitioner` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraShard.java`
#### Snippet
```java
    private String table;

    private IPartitioner partitioner;

    public CassandraShard(CassandraSessionPool.Session session,
```

### FieldMayBeFinal
Field `session` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraShard.java`
#### Snippet
```java
    private static final int MIN_SHARD_SIZE = (int) Bytes.MB;

    private CassandraSessionPool.Session session;
    private String keyspace;
    private String table;
```

### FieldMayBeFinal
Field `table` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraShard.java`
#### Snippet
```java
    private CassandraSessionPool.Session session;
    private String keyspace;
    private String table;

    private IPartitioner partitioner;
```

### FieldMayBeFinal
Field `keyspace` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraShard.java`
#### Snippet
```java

    private CassandraSessionPool.Session session;
    private String keyspace;
    private String table;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloLoadInfo.java`
#### Snippet
```java

        private byte code;
        private String name;

        private State(int code, String name) {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `hugegraph-palo/src/main/java/org/apache/hugegraph/backend/store/palo/PaloLoadInfo.java`
#### Snippet
```java
        CANCELLED(5, "CANCELLED");

        private byte code;
        private String name;

```

### FieldMayBeFinal
Field `pkId` may be 'final'
in `hugegraph-cassandra/src/main/java/org/apache/hugegraph/backend/store/cassandra/CassandraTables.java`
#### Snippet
```java
        public static final String TABLE = HugeType.OLAP.string();

        private Id pkId;

        public Olap(String store, Id id) {
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/PropertyKeyApiTest.java`
#### Snippet
```java
public class PropertyKeyApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema/propertykeys/";

    @Test
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/EdgeApiTest.java`
#### Snippet
```java
public class EdgeApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/graph/edges/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/EdgeLabelApiTest.java`
#### Snippet
```java
public class EdgeLabelApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema/edgelabels/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/VertexLabelApiTest.java`
#### Snippet
```java
public class VertexLabelApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema/vertexlabels/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/SchemaApiTest.java`
#### Snippet
```java
public class SchemaApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema";

    @Test
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/VertexApiTest.java`
#### Snippet
```java
public class VertexApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/graph/vertices/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/IndexLabelApiTest.java`
#### Snippet
```java
public class IndexLabelApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/schema/indexlabels/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/MetricsApiTest.java`
#### Snippet
```java
public class MetricsApiTest extends BaseApiTest {

    private static String path = "/metrics";

    @Test
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/TaskApiTest.java`
#### Snippet
```java
public class TaskApiTest extends BaseApiTest {

    private static String path = "/graphs/hugegraph/tasks/";

    @Before
```

### FieldMayBeFinal
Field `path` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/GremlinApiTest.java`
#### Snippet
```java
public class GremlinApiTest extends BaseApiTest {

    private static String path = "/gremlin";

    @Test
```

### FieldMayBeFinal
Field `client` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java
    public static class RestClient {

        private Client client;
        private WebTarget target;

```

### FieldMayBeFinal
Field `target` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/BaseApiTest.java`
#### Snippet
```java

        private Client client;
        private WebTarget target;

        public RestClient(String url) {
```

### FieldMayBeFinal
Field `GROUP` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/RowLockTest.java`
#### Snippet
```java

    private static String GRAPH = "graph";
    private static String GROUP = "row_lock";

    private static final int THREADS_NUM = 8;
```

### FieldMayBeFinal
Field `GRAPH` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/RowLockTest.java`
#### Snippet
```java
public class RowLockTest extends BaseUnitTest {

    private static String GRAPH = "graph";
    private static String GROUP = "row_lock";

```

### FieldMayBeFinal
Field `pageWithSpace` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/PageStateTest.java`
#### Snippet
```java
                                          "opcAKpklipAAQAAAAAAAAAAQ==";

    private String pageWithSpace = "AAAAADsyABwAEAqI546LS6WW57unBgAEAAAAAP" +
                                   "B//// 8H////4alhxAZS8va6opcAKpklipAAQA" +
                                   "AAAAAAAAAQ==";
```

### FieldMayBeFinal
Field `pageWith3Base64Chars` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/PageStateTest.java`
#### Snippet
```java
public class PageStateTest {

    private String pageWith3Base64Chars = "AAAAADsyABwAEAqI546LS6WW57unBgA" +
                                          "EAAAAAPB////+8H////4alhxAZS8va6" +
                                          "opcAKpklipAAQAAAAAAAAAAQ==";
```

### FieldMayBeFinal
Field `GRAPH` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/LocksTableTest.java`
#### Snippet
```java

    private LockUtil.LocksTable locksTable;
    private static String GRAPH = "graph";

    @BeforeClass
```

### FieldMayBeFinal
Field `sm` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java

    private static HugeGraph graph;
    private static HugeSecurityManager sm = new HugeSecurityManager();

    @BeforeClass
```

### FieldMayBeFinal
Field `mapping` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/util/collection/ObjectIntMappingTest.java`
#### Snippet
```java

    private static final int OBJECT_NUMBER = 1000000;
    private static ObjectIntMapping<Id> mapping =
                                        ObjectIntMappingFactory.newObjectIntMapping();

```

### FieldMayBeFinal
Field `values` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
        private Vertex outVertex;
        private Vertex inVertex;
        private Map<String, Object> values;

        public FakeEdge(String label, Vertex outVertex, Vertex inVertex,
```

### FieldMayBeFinal
Field `outVertex` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java

        private String label;
        private Vertex outVertex;
        private Vertex inVertex;
        private Map<String, Object> values;
```

### FieldMayBeFinal
Field `label` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
    public static class FakeVertex {

        private String label;
        private Map<String, Object> values;

```

### FieldMayBeFinal
Field `inVertex` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
        private String label;
        private Vertex outVertex;
        private Vertex inVertex;
        private Map<String, Object> values;

```

### FieldMayBeFinal
Field `values` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java

        private String label;
        private Map<String, Object> values;

        public FakeVertex(Object... keyValues) {
```

### FieldMayBeFinal
Field `label` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/testutil/FakeObjects.java`
#### Snippet
```java
    public static class FakeEdge {

        private String label;
        private Vertex outVertex;
        private Vertex inVertex;
```

### FieldMayBeFinal
Field `blackMethods` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java
                         RateLimiter.create(1.0 / 300);

    private Map<String, String> blackMethods = new HashMap<>();
    private Map<String, TestGraph> graphs = new HashMap<>();
    private final String suite;
```

### FieldMayBeFinal
Field `graphs` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java

    private Map<String, String> blackMethods = new HashMap<>();
    private Map<String, TestGraph> graphs = new HashMap<>();
    private final String suite;

```

### FieldMayBeFinal
Field `database` may be 'final'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlSessions.java`
#### Snippet
```java

    private HugeConfig config;
    private String database;
    private volatile boolean opened;

```

### FieldMayBeFinal
Field `config` may be 'final'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/MysqlSessions.java`
#### Snippet
```java
    private static final int DROP_DB_TIMEOUT = 10000;

    private HugeConfig config;
    private String database;
    private volatile boolean opened;
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `hugegraph-mysql/src/main/java/org/apache/hugegraph/backend/store/mysql/WhereBuilder.java`
#### Snippet
```java
public class WhereBuilder {

    private StringBuilder builder;

    public WhereBuilder() {
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExampleBase.java`
#### Snippet
```java
    protected static class GraphManager {
        private HugeGraph hugegraph;
        private Cache<Id, Object> cache = CacheManager.instance()
                                                      .cache("perf-test");

```

### FieldMayBeFinal
Field `hugegraph` may be 'final'
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/PerfExampleBase.java`
#### Snippet
```java

    protected static class GraphManager {
        private HugeGraph hugegraph;
        private Cache<Id, Object> cache = CacheManager.instance()
                                                      .cache("perf-test");
```

### FieldMayBeFinal
Field `graph` may be 'final'
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraph.java`
#### Snippet
```java
    private static volatile int id = 666;

    private HugeGraph graph;
    private String loadedGraph = null;
    private boolean initedBackend = false;
```

### FieldMayBeFinal
Field `schemaSerializer` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/io/HugeGryoModule.java`
#### Snippet
```java
public class HugeGryoModule {

    private static GraphSONSchemaSerializer schemaSerializer =
                   new GraphSONSchemaSerializer();

```

### FieldMayBeFinal
Field `OPTIMIZE_SERIALIZE` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/io/HugeGraphSONModule.java`
#### Snippet
```java
    private static final String TYPE_NAMESPACE = "hugegraph";

    private static boolean OPTIMIZE_SERIALIZE = true;

    @SuppressWarnings("rawtypes")
```

### FieldMayBeFinal
Field `elements` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/system/DeleteExpiredElementJob.java`
#### Snippet
```java
    private static final String JOB_TYPE = "delete_expired_element";

    private Set<HugeElement> elements;

    public DeleteExpiredElementJob(Set<HugeElement> elements) {
```

### FieldMayBeFinal
Field `globalStresses` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/job/algorithm/cent/StressCentralityAlgorithmV2.java`
#### Snippet
```java
    private static class Traverser extends BfsTraverser<StressNode> {

        private Map<Id, MutableLong> globalStresses;

        private Traverser(UserJob<Object> job) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugePermission.java`
#### Snippet
```java

    private byte code;
    private String name;

    static {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/auth/HugePermission.java`
#### Snippet
```java
    ANY(0x7f, "any");

    private byte code;
    private String name;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskStatus.java`
#### Snippet
```java

    private byte status;
    private String name;

    static {
```

### FieldMayBeFinal
Field `status` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskStatus.java`
#### Snippet
```java
           TaskStatus.SUCCESS, TaskStatus.CANCELLED, TaskStatus.FAILED);

    private byte status;
    private String name;

```

### FieldMayBeFinal
Field `id` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/HugeServerInfo.java`
#### Snippet
```java
                              TaskManager.SCHEDULE_PERIOD * 10;

    private Id id;
    private NodeRole role;
    private int maxLoad;
```

### FieldMayBeFinal
Field `queueWeakReference` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/EphemeralJobQueue.java`
#### Snippet
```java
        private static final long MAX_CONSUME_COUNT = 2 * PAGE_SIZE;

        private WeakReference<EphemeralJobQueue> queueWeakReference;

        public BatchEphemeralJob(EphemeralJobQueue queue) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/type/HugeType.java`
#### Snippet
```java

    private byte type = 0;
    private String name;

    private static final Map<String, HugeType> ALL_NAME = new HashMap<>();
```

### FieldMayBeFinal
Field `table` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/LockUtil.java`
#### Snippet
```java
    public static class LocksTable {

        private Map<String, Set<Id>> table;
        private Locks locks;

```

### FieldMayBeFinal
Field `locks` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/LockUtil.java`
#### Snippet
```java

        private Map<String, Set<Id>> table;
        private Locks locks;

        public LocksTable(String graph) {
```

### FieldMayBeFinal
Field `primaryKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/VertexLabel.java`
#### Snippet
```java

    private IdStrategy idStrategy;
    private List<Id> primaryKeys;

    public VertexLabel(final HugeGraph graph, Id id, String name) {
```

### FieldMayBeFinal
Field `indexFields` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/IndexLabel.java`
#### Snippet
```java
    private Id baseValue;
    private IndexType indexType;
    private List<Id> indexFields;

    public IndexLabel(final HugeGraph graph, Id id, String name) {
```

### FieldMayBeFinal
Field `sortKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/EdgeLabel.java`
#### Snippet
```java
    private Id targetLabel = NONE_ID;
    private Frequency frequency;
    private List<Id> sortKeys;

    public EdgeLabel(final HugeGraph graph, Id id, String name) {
```

### FieldMayBeFinal
Field `task` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/SchemaElement.java`
#### Snippet
```java

        private SchemaElement schemaElement;
        private Id task;

        public TaskWithSchema(SchemaElement schemaElement, Id task) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/PropertyKeyBuilder.java`
#### Snippet
```java

    private Id id;
    private String name;
    private DataType dataType;
    private Cardinality cardinality;
```

### FieldMayBeFinal
Field `userdata` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/PropertyKeyBuilder.java`
#### Snippet
```java
    private WriteType writeType;
    private boolean checkExist;
    private Userdata userdata;

    public PropertyKeyBuilder(SchemaTransaction transaction,
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/VertexLabelBuilder.java`
#### Snippet
```java
    private String name;
    private IdStrategy idStrategy;
    private Set<String> properties;
    private List<String> primaryKeys;
    private Set<String> nullableKeys;
```

### FieldMayBeFinal
Field `nullableKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/VertexLabelBuilder.java`
#### Snippet
```java
    private Set<String> properties;
    private List<String> primaryKeys;
    private Set<String> nullableKeys;
    private long ttl;
    private String ttlStartTime;
```

### FieldMayBeFinal
Field `primaryKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/VertexLabelBuilder.java`
#### Snippet
```java
    private IdStrategy idStrategy;
    private Set<String> properties;
    private List<String> primaryKeys;
    private Set<String> nullableKeys;
    private long ttl;
```

### FieldMayBeFinal
Field `userdata` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/VertexLabelBuilder.java`
#### Snippet
```java
    private String ttlStartTime;
    private Boolean enableLabelIndex;
    private Userdata userdata;
    private boolean checkExist;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/VertexLabelBuilder.java`
#### Snippet
```java

    private Id id;
    private String name;
    private IdStrategy idStrategy;
    private Set<String> properties;
```

### FieldMayBeFinal
Field `nullableKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
    private Set<String> properties;
    private List<String> sortKeys;
    private Set<String> nullableKeys;
    private long ttl;
    private String ttlStartTime;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java

    private Id id;
    private String name;
    private String sourceLabel;
    private String targetLabel;
```

### FieldMayBeFinal
Field `userdata` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
    private String ttlStartTime;
    private Boolean enableLabelIndex;
    private Userdata userdata;
    private boolean checkExist;

```

### FieldMayBeFinal
Field `sortKeys` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
    private Frequency frequency;
    private Set<String> properties;
    private List<String> sortKeys;
    private Set<String> nullableKeys;
    private long ttl;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/EdgeLabelBuilder.java`
#### Snippet
```java
    private String targetLabel;
    private Frequency frequency;
    private Set<String> properties;
    private List<String> sortKeys;
    private Set<String> nullableKeys;
```

### FieldMayBeFinal
Field `userdata` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java
    private IndexType indexType;
    private List<String> indexFields;
    private Userdata userdata;
    private boolean checkExist;
    private boolean rebuild;
```

### FieldMayBeFinal
Field `indexFields` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java
    private String baseValue;
    private IndexType indexType;
    private List<String> indexFields;
    private Userdata userdata;
    private boolean checkExist;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/schema/builder/IndexLabelBuilder.java`
#### Snippet
```java

    private Id id;
    private String name;
    private HugeType baseType;
    private String baseValue;
```

### FieldMayBeFinal
Field `hashCode` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CachedBackendStore.java`
#### Snippet
```java

        private String query;
        private int hashCode;

        public QueryId(Query q) {
```

### FieldMayBeFinal
Field `query` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/cache/CachedBackendStore.java`
#### Snippet
```java
    static class QueryId implements Id {

        private String query;
        private int hashCode;

```

### FieldMayBeFinal
Field `providers` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendProviderFactory.java`
#### Snippet
```java
    private static final Logger LOG = Log.logger(BackendProviderFactory.class);

    private static Map<String, Class<? extends BackendStoreProvider>> providers;

    static {
```

### FieldMayBeFinal
Field `startKey` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java
        public static class Range {

            private byte[] startKey;
            private byte[] endKey;

```

### FieldMayBeFinal
Field `endKey` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendTable.java`
#### Snippet
```java

            private byte[] startKey;
            private byte[] endKey;

            public Range(byte[] startKey, byte[] endKey) {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStore.java`
#### Snippet
```java
    protected static final class IncrCounter {

        private HugeType type;
        private long increment;

```

### FieldMayBeFinal
Field `increment` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftBackendStore.java`
#### Snippet
```java

        private HugeType type;
        private long increment;

        public IncrCounter(HugeType type, long increment) {
```

### FieldMayBeFinal
Field `leftIndexes` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
        private final HugeElement element;
        private GraphIndexTransaction tx;
        private Set<ConditionQuery.LeftIndex> leftIndexes;

        private RemoveLeftIndexJob(ConditionQuery query, HugeElement element) {
```

### FieldMayBeFinal
Field `schemaLabel` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java
    private static class MatchedIndex {

        private SchemaLabel schemaLabel;
        private Set<IndexLabel> indexLabels;

```

### FieldMayBeFinal
Field `indexLabels` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java

        private SchemaLabel schemaLabel;
        private Set<IndexLabel> indexLabels;

        public MatchedIndex(SchemaLabel schemaLabel,
```

### FieldMayBeFinal
Field `expiredTime` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java

        private Id id;
        private long expiredTime;

        public IdWithExpiredTime(Id id, long expiredTime) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java
    public static class IdWithExpiredTime {

        private Id id;
        private long expiredTime;

```

### FieldMayBeFinal
Field `indexLabel` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeIndex.java`
#### Snippet
```java
    private final HugeGraph graph;
    private Object fieldValues;
    private IndexLabel indexLabel;
    private Set<IdWithExpiredTime> elementIds;

```

### FieldMayBeFinal
Field `findingNodes` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SingleSourceShortestPathTraverser.java`
#### Snippet
```java
    private class Traverser {

        private WeightedPaths findingNodes = new WeightedPaths();
        private WeightedPaths foundNodes = new WeightedPaths();
        private Set<NodeWithWeight> sources;
```

### FieldMayBeFinal
Field `size` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SingleSourceShortestPathTraverser.java`
#### Snippet
```java
        private final long capacity;
        private final long limit;
        private long size;
        private boolean done = false;

```

### FieldMayBeFinal
Field `source` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SingleSourceShortestPathTraverser.java`
#### Snippet
```java
        private WeightedPaths foundNodes = new WeightedPaths();
        private Set<NodeWithWeight> sources;
        private Id source;
        private final Directions direction;
        private final Id label;
```

### FieldMayBeFinal
Field `foundNodes` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SingleSourceShortestPathTraverser.java`
#### Snippet
```java

        private WeightedPaths findingNodes = new WeightedPaths();
        private WeightedPaths foundNodes = new WeightedPaths();
        private Set<NodeWithWeight> sources;
        private Id source;
```

### FieldMayBeFinal
Field `paths` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizedCrosspointsTraverser.java`
#### Snippet
```java

        private Set<Id> crosspoints;
        private List<Path> paths;

        public CrosspointsPaths(Set<Id> crosspoints, List<Path> paths) {
```

### FieldMayBeFinal
Field `crosspoints` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizedCrosspointsTraverser.java`
#### Snippet
```java
        );

        private Set<Id> crosspoints;
        private List<Path> paths;

```

### FieldMayBeFinal
Field `steps` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizedCrosspointsTraverser.java`
#### Snippet
```java
    public static class PathPattern {

        private List<Step> steps;

        public PathPattern() {
```

### FieldMayBeFinal
Field `graph` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/HugeTraverser.java`
#### Snippet
```java
    protected static final Logger LOG = Log.logger(HugeTraverser.class);

    private HugeGraph graph;

    private static CollectionFactory collectionFactory;
```

### FieldMayBeFinal
Field `accessedVertices` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/SubGraphTraverser.java`
#### Snippet
```java
        private final Id source;
        private MultivaluedMap<Id, Node> sources = newMultivalueMap();
        private Set<Id> accessedVertices = newIdSet();

        private final Id label;
```

### FieldMayBeFinal
Field `weights` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizePathsTraverser.java`
#### Snippet
```java
    public static class WeightPath extends Path {

        private List<Double> weights;
        private double totalWeight;

```

### FieldMayBeFinal
Field `weight` may be 'final'
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/algorithm/CustomizePathsTraverser.java`
#### Snippet
```java
    public static class WeightNode extends Node {

        private double weight;

        public WeightNode(Id id, Node parent, double weight) {
```

### FieldMayBeFinal
Field `enablePartition` may be 'final'
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseFeatures.java`
#### Snippet
```java
public class HbaseFeatures implements BackendFeatures {

    private boolean enablePartition;

    public HbaseFeatures(boolean enablePartition) {
```

### FieldMayBeFinal
Field `enablePartition` may be 'final'
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseStore.java`
#### Snippet
```java

    public static class HbaseGraphStore extends HbaseStore {
        private boolean enablePartition;
        public HbaseGraphStore(HugeConfig config, BackendStoreProvider provider,
                               String namespace, String store) {
```

### FieldMayBeFinal
Field `systemMetrics` may be 'final'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/metrics/MetricsAPI.java`
#### Snippet
```java
    private static final Logger LOG = Log.logger(MetricsAPI.class);

    private SystemMetrics systemMetrics;

    static {
```

### FieldMayBeFinal
Field `roles` may be 'final'
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeAuthenticator.java`
#### Snippet
```java

        @JsonProperty("roles") // graph -> action -> resource
        private Map<String, Map<HugePermission, Object>> roles;

        public RolePerm() {
```

### FieldMayBeFinal
Field `INSTANCE` may be 'final'
in `hugegraph-api/src/main/java/org/apache/hugegraph/serializer/JsonSerializer.java`
#### Snippet
```java
    private static final int LBUF_SIZE = 1024;

    private static JsonSerializer INSTANCE = new JsonSerializer();

    private JsonSerializer() {
```

## RuleId[id=CloneDeclaresCloneNotSupported]
### CloneDeclaresCloneNotSupported
`clone()` does not declare 'CloneNotSupportedException'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeVertex.java`
#### Snippet
```java

    @Override
    protected HugeVertex clone() {
        try {
            return (HugeVertex) super.clone();
```

### CloneDeclaresCloneNotSupported
`clone()` does not declare 'CloneNotSupportedException'
in `hugegraph-core/src/main/java/org/apache/hugegraph/structure/HugeEdge.java`
#### Snippet
```java

    @Override
    protected HugeEdge clone() {
        try {
            return (HugeEdge) super.clone();
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseStore.java`
#### Snippet
```java

            } catch (TableExistsException ignored) {
                continue;
            } catch (IOException e) {
                throw new BackendException(
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `scheduler`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
                StandardTaskScheduler scheduler = (StandardTaskScheduler) entry;
                // Maybe other thread close&remove scheduler at the same time
                synchronized (scheduler) {
                    this.scheduleOrExecuteJobForGraph(scheduler);
                }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `scheduler`
in `hugegraph-core/src/main/java/org/apache/hugegraph/task/TaskManager.java`
#### Snippet
```java
             * after 'graph.close()'.
             */
            synchronized (scheduler) {
                if (scheduler.close()) {
                    this.schedulers.remove(graph);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `keyFrom` is redundant
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStdSessions.java`
#### Snippet
```java
        @Override
        public void deletePrefix(String table, byte[] key) {
            byte[] keyFrom = key;
            byte[] keyTo = Arrays.copyOf(keyFrom, keyFrom.length);
            BinarySerializer.increaseOne(keyTo);
```

### UnnecessaryLocalVariable
Local variable `respBody` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/api/ProjectApiTest.java`
#### Snippet
```java
                                .request()
                                .get();
        String respBody = assertResponseStatus(200, resp);
        return respBody;
    }
```

### UnnecessaryLocalVariable
Local variable `any9` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/id/IdTest.java`
#### Snippet
```java
        Assert.assertEquals(id7, id8);

        Object any9 = id1;
        Id id9 = IdGenerator.of(any9);
        Assert.assertEquals(any9, id9);
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBPerfTest.java`
#### Snippet
```java
        int n = 1000;
        for (int i = 0; i < n; i++) {
            int value = i;
            comms.put(i, value);
            String key = String.format("index:%3d:%d", i, value);
```

### UnnecessaryLocalVariable
Local variable `threads` is redundant
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/ThreadRangePerfTest.java`
#### Snippet
```java
        String[] newargs = new String[4];
        for (int i = minThread; i <= maxThread; i += threadStep) {
            int threads = i;
            newargs[0] = String.valueOf(threads);
            newargs[1] = String.valueOf(times);
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            }
            long offset = this.offset(key);
            int value = UNSAFE.getIntVolatile(this.values, offset);
            return value;
        }
```

### UnnecessaryLocalVariable
Local variable `map` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            // volatile get this.maps[index]
            long offset = (index << SHIFT) + BASE_OFFSET;
            IntMap map = (IntMap) UNSAFE.getObjectVolatile(this.maps, offset);
            return map;
        }
```

### UnnecessaryLocalVariable
Local variable `newV` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            long offset = this.offset(key);
            int oldV = UNSAFE.getIntVolatile(this.values, offset);
            int newV = value;
            if (newV == oldV) {
                return true;
```

### UnnecessaryLocalVariable
Local variable `newV` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java

            int oldV = UNSAFE.getIntVolatile(this.values, offset);
            int newV = value;
            if (newV == oldV || oldV != NULL_VALUE) {
                return false;
```

### UnnecessaryLocalVariable
Local variable `index` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntMap.java`
#### Snippet
```java
            }
            // int key to int offset
            long index = key;
            // int offset to byte offset
            long offset = index << MUL4;
```

### UnnecessaryLocalVariable
Local variable `bitmask` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntSet.java`
#### Snippet
```java
        private static long bitmaskOfKey(long key) {
            long bitIndex = key & MOD64;
            long bitmask = 1L << bitIndex;
            return bitmask;
        }
```

### UnnecessaryLocalVariable
Local variable `set` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/util/collection/IntSet.java`
#### Snippet
```java
            // volatile get this.sets[index]
            long offset = (index << SHIFT) + BASE_OFFSET;
            IntSet set = (IntSet) UNSAFE.getObjectVolatile(this.sets, offset);
            return set;
        }
```

### UnnecessaryLocalVariable
Local variable `edge` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphTransaction.java`
#### Snippet
```java

        return new MapperIterator<>(ids.iterator(), id -> {
            Edge edge = edges.get(id);
            return edge;
        });
```

### UnnecessaryLocalVariable
Local variable `indexQueries` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/GraphIndexTransaction.java`
#### Snippet
```java

        public static IndexQueries of(ConditionQuery parentQuery) {
            IndexQueries indexQueries = new IndexQueries(parentQuery);
            return indexQueries;
        }
```

### UnnecessaryLocalVariable
Local variable `holder` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/traversal/optimize/TraversalUtil.java`
#### Snippet
```java

    public static void convHasStep(HugeGraph graph, HasStep<?> step) {
        HasContainerHolder holder = step;
        for (HasContainer has : holder.getHasContainers()) {
            convPredicateValue(graph, has);
```

### UnnecessaryLocalVariable
Local variable `tmp` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/masterelection/GlobalMasterInfo.java`
#### Snippet
```java
    public final void nodeInfo(boolean isMaster, String url) {
        // final can avoid instruction rearrangement, visibility can be ignored
        final NodeInfo tmp = new NodeInfo(isMaster, url);
        this.nodeInfo = tmp;
    }
```

### UnnecessaryLocalVariable
Local variable `vertices` is redundant
in `hugegraph-core/src/main/java/org/apache/hugegraph/variables/HugeVariables.java`
#### Snippet
```java
        GraphTransaction tx = this.params.graphTransaction();
        Query query = this.createVariableQuery(null);
        Iterator<Vertex> vertices = tx.queryVertices(query);
        return vertices;
    }
```

### UnnecessaryLocalVariable
Local variable `hbaseSession` is redundant
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseTable.java`
#### Snippet
```java
        }

        HbaseSessions.HbaseSession<HbaseSessions.RowIterator> hbaseSession = session;
        return this.newEntryIterator(query, this.query(hbaseSession, query));
    }
```

### UnnecessaryLocalVariable
Local variable `project` is redundant
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/auth/ProjectAPI.java`
#### Snippet
```java

        public HugeProject build() {
            HugeProject project = new HugeProject(this.name, this.description);
            return project;
        }
```

## RuleId[id=UnpredictableBigDecimalConstructorCall]
### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(0.0d, dvalue, 0.0d);

        value = new BigDecimal(-Double.MIN_VALUE).divide(two);
        dvalue = graph.addVertex(T.label, "number", "double", value)
                      .value("double");
```

### UnpredictableBigDecimalConstructorCall
Unpredictable `new BigDecimal()` call
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
                                 .movePointRight(308)
                                 .doubleValue(); // 1.797693134862315E308
        final double min15 = new BigDecimal(1.234567890987654321d)
                                 .setScale(15, BigDecimal.ROUND_DOWN)
                                 .movePointLeft(307)
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendEntry.java`
#### Snippet
```java

        public int hashCode() {
            return this.name.hashCode() ^
                   this.value.hashCode();
        }
```

### ArrayHashCode
`hashCode()` called on array should probably be 'Arrays.hashCode()'
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/BackendEntry.java`
#### Snippet
```java
        public int hashCode() {
            return this.name.hashCode() ^
                   this.value.hashCode();
        }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/OpenedRocksDB.java`
#### Snippet
```java
            for (long i = 1; this.refs.get() > 1; i++) {
                try {
                    Thread.sleep(unit);
                } catch (InterruptedException ignored) {
                    // 30s rest api timeout may cause InterruptedException
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `hugegraph-example/src/main/java/org/apache/hugegraph/example/TaskExample.java`
#### Snippet
```java
                this.task().progress(i);
                this.graph().taskScheduler().save(this.task());
                Thread.sleep(UNIT);
            }
            return 18;
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/store/raft/RaftNode.java`
#### Snippet
```java
            });
            try {
                Thread.sleep(RaftContext.POLL_INTERVAL);
            } catch (InterruptedException e) {
                throw new BackendException("Interrupted while waiting for " +
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
    public void testFile() {
        // read file
        try (FileInputStream fis = new FileInputStream(new File(""))) {
            // pass
        } catch (IOException ignored) {
```

### RedundantFileCreation
`new File` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java
        // read file
        String pom = System.getProperty("user.dir") + "/a.groovy";
        try (FileInputStream fis = new FileInputStream(new File(pom))) {
            // pass
        } catch (IOException ignored) {
```

### RedundantFileCreation
`new File` is redundant
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/SecurityManagerTest.java`
#### Snippet
```java

        // write file
        try (FileOutputStream fos = new FileOutputStream(new File(""))) {
            // pass
        } catch (IOException ignored) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
        } catch (RocksDBException e) {
            throw new BackendException("Failed to drop tables %s for '%s'",
                                       e, Arrays.asList(tables), this.store);
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
        } catch (RocksDBException e) {
            throw new BackendException("Failed to create tables %s for '%s'",
                                       e, Arrays.asList(tables), this.store);
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/TaskCoreTest.java`
#### Snippet
```java

        Assert.assertEquals("test-task", scheduler.task(id).name());
        Assert.assertEquals("test-task", scheduler.tasks(Arrays.asList(id))
                                                  .next().name());

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
            key = "set_" + key;
            Edge edge = vertex1.addEdge("transfer", vertex2, "id", 3,
                                        key, Arrays.asList(values));
            graph.tx().commit();

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
            key = "list_" + key;
            Edge edge = vertex1.addEdge("transfer", vertex2, "id", 2,
                                        key, Arrays.asList(values));
            graph.tx().commit();

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/rocksdb/RocksDBSessionTest.java`
#### Snippet
```java
    public void testPutAndMultiGet() throws RocksDBException {
        BackendColumnIterator values = this.rocks.session().get(TABLE,
                                       Arrays.asList(getBytes("person:1gname")));
        Assert.assertFalse(values.hasNext());

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`req.createIfNotExist == true` can be simplified to 'req.createIfNotExist'
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/graph/EdgeAPI.java`
#### Snippet
```java
                            !req.updateStrategies.isEmpty(),
                            "Parameter 'update_strategies' can't be empty");
            E.checkArgument(req.createIfNotExist == true,
                            "Parameter 'create_if_not_exist' " +
                            "dose not support false now");
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/AuthenticationFilter.java`
#### Snippet
```java

            @Override
            public boolean equals(Object obj) {
                return Authorizer.this.user.equals(obj);
            }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `hugegraph-api/src/main/java/org/apache/hugegraph/auth/HugeGraphAuthProxy.java`
#### Snippet
```java

        @Override
        public boolean equals(Object obj) {
            return this.origin.equals(obj);
        }
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            property("double", value));
        value = BigDecimal.valueOf(Double.MIN_VALUE).divide(two);
        Assert.assertEquals(0.0, property("double", value));
        Assert.assertEquals(Double.NEGATIVE_INFINITY,
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java

        BigDecimal two = new BigDecimal(2);
        BigDecimal value = new BigDecimal(Double.MIN_VALUE).divide(two);
        double dvalue = graph.addVertex(T.label, "number", "double", value)
                             .value("double");
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(0.0d, dvalue, 0.0d);

        value = new BigDecimal(-Double.MIN_VALUE).divide(two);
        dvalue = graph.addVertex(T.label, "number", "double", value)
                      .value("double");
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'tryAcquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java

        // Used for travis ci output log
        if (LOG_RATE_LIMITER.tryAcquire(1)) {
            LOG.info("Open graph '{}' for test '{}'", graphName, testMethod);
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java
            VertexPropertyFeatures.FEATURE_STRING_IDS);

    private static final RateLimiter LOG_RATE_LIMITER =
                         RateLimiter.create(1.0 / 300);

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java

    private static final RateLimiter LOG_RATE_LIMITER =
                         RateLimiter.create(1.0 / 300);

    private Map<String, String> blackMethods = new HashMap<>();
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-test/src/main/java/org/apache/hugegraph/tinkerpop/TestGraphProvider.java`
#### Snippet
```java

    private static final RateLimiter LOG_RATE_LIMITER =
                         RateLimiter.create(1.0 / 300);

    private Map<String, String> blackMethods = new HashMap<>();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeGraphParams.java`
#### Snippet
```java
    Analyzer analyzer();

    RateLimiter writeRateLimiter();

    RateLimiter readRateLimiter();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/HugeGraphParams.java`
#### Snippet
```java
    RateLimiter writeRateLimiter();

    RateLimiter readRateLimiter();

    RamTable ramtable();
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java
    private final LocalCounter localCounter;
    private final RateLimiter writeRateLimiter;
    private final RateLimiter readRateLimiter;
    private final TaskManager taskManager;
    private AuthManager authManager;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java

    private final LocalCounter localCounter;
    private final RateLimiter writeRateLimiter;
    private final RateLimiter readRateLimiter;
    private final TaskManager taskManager;
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java

        @Override
        public RateLimiter writeRateLimiter() {
            return StandardHugeGraph.this.writeRateLimiter;
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java
        final int writeLimit = config.get(CoreOptions.RATE_LIMIT_WRITE);
        this.writeRateLimiter = writeLimit > 0 ?
                                RateLimiter.create(writeLimit) : null;
        final int readLimit = config.get(CoreOptions.RATE_LIMIT_READ);
        this.readRateLimiter = readLimit > 0 ?
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java
        final int writeLimit = config.get(CoreOptions.RATE_LIMIT_WRITE);
        this.writeRateLimiter = writeLimit > 0 ?
                                RateLimiter.create(writeLimit) : null;
        final int readLimit = config.get(CoreOptions.RATE_LIMIT_READ);
        this.readRateLimiter = readLimit > 0 ?
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java
        final int readLimit = config.get(CoreOptions.RATE_LIMIT_READ);
        this.readRateLimiter = readLimit > 0 ?
                               RateLimiter.create(readLimit) : null;

        boolean ramtableEnable = config.get(CoreOptions.QUERY_RAMTABLE_ENABLE);
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java
        final int readLimit = config.get(CoreOptions.RATE_LIMIT_READ);
        this.readRateLimiter = readLimit > 0 ?
                               RateLimiter.create(readLimit) : null;

        boolean ramtableEnable = config.get(CoreOptions.QUERY_RAMTABLE_ENABLE);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/StandardHugeGraph.java`
#### Snippet
```java

        @Override
        public RateLimiter readRateLimiter() {
            return StandardHugeGraph.this.readRateLimiter;
        }
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/plugin/HugeGraphGremlinPlugin.java`
#### Snippet
```java
        INSTANCE = new HugeGraphGremlinPlugin();

        Iterator<ClassPath.ClassInfo> classInfos;
        try {
            classInfos = ReflectionUtil.classes(PACKAGE);
```

### UnstableApiUsage
'com.google.common.reflect.ClassPath.ClassInfo' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/plugin/HugeGraphGremlinPlugin.java`
#### Snippet
```java
        INSTANCE = new HugeGraphGremlinPlugin();

        Iterator<ClassPath.ClassInfo> classInfos;
        try {
            classInfos = ReflectionUtil.classes(PACKAGE);
```

### UnstableApiUsage
'load()' is declared in unstable class 'com.google.common.reflect.ClassPath.ClassInfo' marked with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/plugin/HugeGraphGremlinPlugin.java`
#### Snippet
```java
        @SuppressWarnings("rawtypes")
        Set<Class> classes = new HashSet<>();
        classInfos.forEachRemaining(classInfo -> classes.add(classInfo.load()));
        // Add entrance class: graph = HugeFactory.open("hugegraph.properties")
        classes.add(HugeFactory.class);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/AbstractTransaction.java`
#### Snippet
```java

        // Do rate limit if needed
        RateLimiter rateLimiter = this.graph.readRateLimiter();
        if (rateLimiter != null && query.resultType().isGraph()) {
            double time = rateLimiter.acquire(1);
```

### UnstableApiUsage
'acquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/AbstractTransaction.java`
#### Snippet
```java
        RateLimiter rateLimiter = this.graph.readRateLimiter();
        if (rateLimiter != null && query.resultType().isGraph()) {
            double time = rateLimiter.acquire(1);
            if (time > 0) {
                LOG.debug("Waited for {}s to query", time);
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/AbstractTransaction.java`
#### Snippet
```java

        // Do rate limit if needed
        RateLimiter rateLimiter = this.graph.writeRateLimiter();
        if (rateLimiter != null) {
            int size = this.mutationSize();
```

### UnstableApiUsage
'acquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-core/src/main/java/org/apache/hugegraph/backend/tx/AbstractTransaction.java`
#### Snippet
```java
        if (rateLimiter != null) {
            int size = this.mutationSize();
            double time = size > 0 ? rateLimiter.acquire(size) : 0.0;
            if (time > 0) {
                LOG.debug("Waited for {}s to mutate {} item(s)", time, size);
```

### UnstableApiUsage
'tryAcquire(int)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/LoadDetectFilter.java`
#### Snippet
```java

    private static void gcIfNeeded() {
        if (GC_RATE_LIMITER.tryAcquire(1)) {
            System.gc();
        }
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/LoadDetectFilter.java`
#### Snippet
```java

    // Call gc every 30+ seconds if memory is low and request frequently
    private static final RateLimiter GC_RATE_LIMITER =
                         RateLimiter.create(1.0 / 30);

```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/LoadDetectFilter.java`
#### Snippet
```java
    // Call gc every 30+ seconds if memory is low and request frequently
    private static final RateLimiter GC_RATE_LIMITER =
                         RateLimiter.create(1.0 / 30);

    @Context
```

### UnstableApiUsage
'create(double)' is declared in unstable class 'com.google.common.util.concurrent.RateLimiter' marked with @Beta
in `hugegraph-api/src/main/java/org/apache/hugegraph/api/filter/LoadDetectFilter.java`
#### Snippet
```java
    // Call gc every 30+ seconds if memory is low and request frequently
    private static final RateLimiter GC_RATE_LIMITER =
                         RateLimiter.create(1.0 / 30);

    @Context
```

### UnstableApiUsage
'com.google.common.util.concurrent.Futures' is marked unstable with @Beta
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
            } catch (TableNotEnabledException ignored) {
                // Ignore if it's disabled
                return Futures.immediateFuture(null);
            }
        }
```

### UnstableApiUsage
'immediateFuture(@org.checkerframework.checker.nullness.qual.Nullable V)' is declared in unstable class 'com.google.common.util.concurrent.Futures' marked with @Beta
in `hugegraph-hbase/src/main/java/org/apache/hugegraph/backend/store/hbase/HbaseSessions.java`
#### Snippet
```java
            } catch (TableNotEnabledException ignored) {
                // Ignore if it's disabled
                return Futures.immediateFuture(null);
            }
        }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'c1' to 'Relation'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionTest.java`
#### Snippet
```java
        Assert.assertFalse(c1.test((Object) null));

        Relation r1 = (Relation) c1;
        Assert.assertEquals(HugeKeys.ID, r1.key());
        Assert.assertEquals("123", r1.value());
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'c1' to 'Relation'
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/core/ConditionTest.java`
#### Snippet
```java
        Assert.assertFalse(c1.test((Object) null));

        Relation r1 = (Relation) c1;
        Assert.assertEquals(IdGenerator.of("1"), r1.key());
        Assert.assertEquals("123", r1.value());
```

## RuleId[id=AssignmentToCatchBlockParameter]
### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `e`
in `hugegraph-rocksdb/src/main/java/org/apache/hugegraph/backend/store/rocksdb/RocksDBStore.java`
#### Snippet
```java
                                                    walPath, none);
                } catch (RocksDBException e1) {
                    e = e1;
                }
                if (sessions == null && !existsOtherKeyspace) {
```

## RuleId[id=OverwrittenKey]
### OverwrittenKey
Duplicate Map key
in `hugegraph-dist/src/main/java/org/apache/hugegraph/cmd/InitStore.java`
#### Snippet
```java
        EXCEPTIONS.put("NoHostAvailableException",
                       "All host(s) tried for query failed");
        EXCEPTIONS.put("InvalidQueryException", "does not exist");
        EXCEPTIONS.put("InvalidQueryException", "unconfigured table");
    }
```

### OverwrittenKey
Duplicate Map key
in `hugegraph-dist/src/main/java/org/apache/hugegraph/cmd/InitStore.java`
#### Snippet
```java
                       "All host(s) tried for query failed");
        EXCEPTIONS.put("InvalidQueryException", "does not exist");
        EXCEPTIONS.put("InvalidQueryException", "unconfigured table");
    }

```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(list, propertyList("blob", img1, img2, img2, img3));

        Set<Blob> set = ImmutableSet.of(img1, img2, img2, img3);
        Assert.assertEquals(3, set.size());
        Assert.assertEquals(set, propertySet("blob", img1, img2, img2, img3));
```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/PropertyCoreTest.java`
#### Snippet
```java
        Assert.assertEquals(list, propertyList("blob", img1, img2, img2, img3));

        Set<Blob> set = ImmutableSet.of(img1, img2, img2, img3);
        Assert.assertEquals(3, set.size());
        Assert.assertEquals(set, propertySet("blob", img1, img2, img2, img3));
```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        pkey = genSetPkey(DataType.UUID);
        UUID uuid = UUID.fromString("3cfcafc8-7906-4ab7-a207-4ded056f58de");
        value = ImmutableSet.of(uuid, uuid);
        bytes = genBytes("013cfcafc879064ab7a2074ded056f58de");
        buf.forReadWritten();
```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/unit/serializer/BytesBufferTest.java`
#### Snippet
```java
        pkey = genSetPkey(DataType.UUID);
        UUID uuid = UUID.fromString("3cfcafc8-7906-4ab7-a207-4ded056f58de");
        value = ImmutableSet.of(uuid, uuid);
        bytes = genBytes("013cfcafc879064ab7a2074ded056f58de");
        buf.forReadWritten();
```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = graph.addVertex(T.label, "review", "id", 2,
                                 "contribution",
                                 ImmutableSet.of("+1", "+1", "+2"));
        this.mayCommitTx();

```

### OverwrittenKey
Duplicate Set element
in `hugegraph-test/src/main/java/org/apache/hugegraph/core/VertexCoreTest.java`
#### Snippet
```java
        vertex = graph.addVertex(T.label, "review", "id", 2,
                                 "contribution",
                                 ImmutableSet.of("+1", "+1", "+2"));
        this.mayCommitTx();

```

