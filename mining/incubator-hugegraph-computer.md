# incubator-hugegraph-computer 
 
# Bad smells
I found 353 bad smells with 3 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicatedCode | 64 | false |
| AutoCloseableResource | 39 | false |
| DataFlowIssue | 28 | false |
| NullableProblems | 27 | false |
| IgnoreResultOfCall | 26 | false |
| FieldMayBeFinal | 23 | false |
| ConstantValue | 23 | false |
| UnstableApiUsage | 20 | false |
| RedundantMethodOverride | 12 | false |
| EqualsWithItself | 9 | false |
| EqualsBetweenInconvertibleTypes | 9 | false |
| JavadocDeclaration | 8 | false |
| Deprecation | 7 | false |
| FieldCanBeLocal | 7 | false |
| ShiftOutOfRange | 4 | false |
| JavadocReference | 3 | false |
| FunctionalExpressionCanBeFolded | 3 | false |
| UnusedAssignment | 3 | false |
| UnnecessarySemicolon | 2 | false |
| NonFinalFieldInEnum | 2 | false |
| FinalPrivateMethod | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| IntegerMultiplicationImplicitCastToLong | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| CachedNumberConstructorCall | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| UnnecessaryModifier | 1 | true |
| MismatchedArrayReadWrite | 1 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| EmptyStatementBody | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantArrayCreation | 1 | true |
| SwitchStatementWithTooFewBranches | 1 | false |
| RedundantCollectionOperation | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| SuspiciousMethodCalls | 1 | false |
| TrivialIf | 1 | false |
| AccessStaticViaInstance | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| JUnitMalformedDeclaration | 1 | false |
| RedundantCast | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| BusyWait | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`compareTo()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesIdTest.java`
#### Snippet
```java
        Assert.assertTrue(utf8Id3.compareTo(utf8Id2) > 0);
        Assert.assertTrue(utf8Id2.compareTo(utf8Id3) < 0);
        Assert.assertEquals(0, utf8Id2.compareTo(utf8Id2));
        Assert.assertTrue(utf8Id2.compareTo(utf8Id4) < 0);
        Assert.assertTrue(utf8Id4.compareTo(utf8Id2) > 0);
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/BooleanValueTest.java`
#### Snippet
```java
    public void testEquals() {
        BooleanValue value1 = new BooleanValue();
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value1.equals(new BooleanValue(false)));
        Assert.assertFalse(value1.equals(new BooleanValue(true)));
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/LongValueTest.java`
#### Snippet
```java
    public void testEquals() {
        LongValue value1 = new LongValue();
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value1.equals(new LongValue(0L)));
        Assert.assertFalse(value1.equals(new LongValue(1L)));
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/NullValueTest.java`
#### Snippet
```java
        NullValue value1 = NullValue.get();

        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value1.equals(NullValue.get()));

```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValueTest.java`
#### Snippet
```java
    public void testEquals() {
        IntValue intValue1 = new IntValue();
        Assert.assertTrue(intValue1.equals(intValue1));
        Assert.assertTrue(intValue1.equals(new IntValue(0)));
        Assert.assertFalse(intValue1.equals(new IntValue(1)));
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/DoubleValueTest.java`
#### Snippet
```java
    public void testEquals() {
        DoubleValue value1 = new DoubleValue();
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value1.equals(new DoubleValue(0d)));
        Assert.assertFalse(value1.equals(new DoubleValue(1)));
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/FloatValueTest.java`
#### Snippet
```java
    public void testEquals() {
        FloatValue value1 = new FloatValue(0f);
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value1.equals(new FloatValue(0f)));
        Assert.assertFalse(value1.equals(new FloatValue(1)));
```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        value2.add(new FloatValue(202f));

        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value2.equals(value2));

```

### EqualsWithItself
`equals()` called on itself
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java

        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value2.equals(value2));

        Assert.assertTrue(value1.equals(value1.copy()));
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/JobObserver.java`
#### Snippet
```java
     * This observer will notified by every superstep.
     */
    public void onJobStateChanged(JobState state);
}

```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `requiredOptions` are read, but never written to
in `computer-test/src/main/java/org/apache/hugegraph/computer/suite/unit/UnitTestBase.java`
#### Snippet
```java
    public static synchronized Config updateWithRequiredOptions(
                                      Object... options) {
        Object[] requiredOptions = new Object[] {
        };
        Object[] allOptions = new Object[requiredOptions.length +
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sort/flusher/CombineSubKvOuterSortFlusher.java`
#### Snippet
```java
        KvEntry currentKv = sorter.currentKv();

        while (true) {
            currentKv.key().write(this.output);
            long position = this.output.position();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ConfigOption`
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/config/DriverConfigOption.java`
#### Snippet
```java

/**
 * The class is subclass of {@link ConfigOption} it without default value
 */
public class DriverConfigOption<T> extends ConfigOption<T> {
```

### JavadocReference
Cannot resolve symbol `StringSerializer`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/util/StringEncoding.java`
#### Snippet
```java
    private static final Base64.Decoder BASE64_DECODER = Base64.getDecoder();

    /** Similar to {@link StringSerializer} */
    public static int writeAsciiString(byte[] array, int offset, String value) {
        E.checkArgument(CharMatcher.ascii().matchesAllOf(value),
```

### JavadocReference
Cannot resolve symbol `ConfigOption`
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/config/Null.java`
#### Snippet
```java
 * The config does not allow the default value null, so this is used as the
 * default class value when class option can be null.
 * {@link Config#createObject(ConfigOption)} will return null, if the value
 * is ${@code Null.class}".
 */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/combiner/PointerCombinerTest.java`
#### Snippet
```java
                                        Constants.SMALL_BUF_SIZE);
             BytesOutput bytesOutput2 = IOFactory.createBytesOutput(
                                        Constants.SMALL_BUF_SIZE);) {
            DoubleValue value1 = new DoubleValue(1.0D);
            DoubleValue value2 = new DoubleValue(2.0D);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OutputFormat.java`
#### Snippet
```java
    CSV,

    JSON;
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getData` may produce `NullPointerException`
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/controller/ComputerJobDeployer.java`
#### Snippet
```java
                this.mountConfigMapOrSecret(volumeMounts, key,
                                            configMapPaths.get(key),
                                            configMap.getData());
            }
        }
```

### DataFlowIssue
Method invocation `getData` may produce `NullPointerException`
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/controller/ComputerJobDeployer.java`
#### Snippet
```java
                this.mountConfigMapOrSecret(volumeMounts, key,
                                            secretPaths.get(key),
                                            secret.getData());
            }
        }
```

### DataFlowIssue
The call to 'convertToMap' always fails, according to its method contracts
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/util/ComputerContextUtilTest.java`
#### Snippet
```java

        Assert.assertThrows(ComputerException.class, () -> {
            ComputerContextUtil.convertToMap((Properties) null);
        });

```

### DataFlowIssue
Variable is already assigned to this value
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/ValueFileTest.java`
#### Snippet
```java
                position = 3L;
                assertSeek(fileLength, input, position);
                position = 3L;
                assertSeek(fileLength, input, position);
                position = 68L;
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `computer-test/src/main/java/org/apache/hugegraph/computer/dist/HugeGraphComputerTest.java`
#### Snippet
```java
        Throwable[] exceptions = new Throwable[2];
        String masterConfPath = HugeGraphComputerTest.class.getResource(
                                "/computer.properties").getPath();
        String work1ConfPath = HugeGraphComputerTest.class.getResource(
                               "/computer.properties").getPath();
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `computer-test/src/main/java/org/apache/hugegraph/computer/dist/HugeGraphComputerTest.java`
#### Snippet
```java
                                "/computer.properties").getPath();
        String work1ConfPath = HugeGraphComputerTest.class.getResource(
                               "/computer.properties").getPath();
        pool.submit(() -> {
            try {
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `computer-test/src/main/java/org/apache/hugegraph/computer/dist/HugeGraphComputerTest.java`
#### Snippet
```java
    public void testServiceWithError() {
        String work1ConfPath = HugeGraphComputerTest.class.getResource(
                               "/computer.properties").getPath();
        Assert.assertThrows(IllegalArgumentException.class,
                            () -> {
```

### DataFlowIssue
Casting `value` to `String` may produce `ClassCastException`
in `computer-test/src/main/java/org/apache/hugegraph/computer/suite/unit/UnitTestBase.java`
#### Snippet
```java
            E.checkArgument(value instanceof String,
                            "The option value must be String class");
            map.put(((TypedOption<?, ?>) key).name(), (String) value);
        }
        if (!map.keySet().contains(
```

### DataFlowIssue
Argument `bashStream` might be null
in `computer-k8s/src/main/java/org/apache/hugegraph/computer/k8s/driver/KubernetesDriver.java`
#### Snippet
```java
                bashStream = new FileInputStream(this.bashPath);
            }
            String bashAsStr = IOHelpers.readFully(bashStream);

            StringBuilder builder = new StringBuilder();
```

### DataFlowIssue
Argument `key` might be null
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                        "The value can't be null.");
        try {
            this.kv.put(ByteSequence.from(key, ENCODING),
                        ByteSequence.from(value))
                   .get();
```

### DataFlowIssue
Argument `value` might be null
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        try {
            this.kv.put(ByteSequence.from(key, ENCODING),
                        ByteSequence.from(value))
                   .get();
        } catch (InterruptedException e) {
```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/util/StringEncoding.java`
#### Snippet
```java
        E.checkArgument(value != null, "The UUID can't be null");
        try {
            if (value.contains("-") && value.length() == 36) {
                return UUID.fromString(value);
            }
```

### DataFlowIssue
Method invocation `getMostSignificantBits` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
    public static BytesId of(UUID value) {
        E.checkArgument(value != null, "The value can't be null");
        long high = value.getMostSignificantBits();
        long low = value.getLeastSignificantBits();
        BytesOutput output = IOFactory.createBytesOutput(16);
```

### DataFlowIssue
Argument `value` might be null
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
    public static BytesId of(String value) {
        E.checkArgument(value != null, "The value can't be null");
        return new BytesId(IdType.UTF8, CoderUtil.encode(value));
    }

```

### DataFlowIssue
Argument `entry` might be null
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/builder/HgkvFileBuilderImpl.java`
#### Snippet
```java

        this.blockAddEntry(entry);
        this.changeMetaAfterAdd(entry);
    }

```

### DataFlowIssue
Method invocation `active` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
        watcher.start();
        // Step 3: Iteration computation of all supersteps.
        for (; superstepStat.active(); superstep++) {
            LOG.info("{} MasterService superstep {} started",
                     this, superstep);
```

### DataFlowIssue
Method invocation `valueType` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
                            "registerAggregator(String name,ValueType type," +
                            "Class<C> combiner)", name);
            this.registerAggregator(name, defaultValue.valueType(),
                                    combinerClass, defaultValue);
        }
```

### DataFlowIssue
Method invocation `newInstance` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
            Aggregator<V> aggr;
            try {
                aggr = aggregatorClass.newInstance();
            } catch (Exception e) {
                throw new ComputerException("Can't new instance from class: %s",
```

### DataFlowIssue
Method invocation `active` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/worker/WorkerService.java`
#### Snippet
```java
         * superstep.
         */
        while (superstepStat.active()) {
            WorkerContext context = new SuperstepContext(superstep,
                                                         superstepStat);
```

### DataFlowIssue
Method invocation `copy` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/aggregator/RegisterAggregators.java`
#### Snippet
```java
                        "Can't get unregistered aggregator with name '%s'",
                        name);
        return aggregator.copy();
    }

```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/aggregator/RegisterAggregators.java`
#### Snippet
```java
        E.checkArgument(name != null,
                        "The registered aggregator name can't be null");
        E.checkArgument(!name.isEmpty(),
                        "The registered aggregator name can't be empty");
        E.checkArgument(aggregator != null,
```

### DataFlowIssue
Argument `message` might be null
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/community/wcc/Wcc.java`
#### Snippet
```java
        Id message = Combiner.combineAll(context.combiner(), messages);
        Id value = vertex.value();
        if (value.compareTo(message) > 0) {
            vertex.value(message);
            context.sendMessageToAllEdges(vertex, message);
```

### DataFlowIssue
Argument `message` might be null
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/community/kcore/Kcore.java`
#### Snippet
```java
            assert superstep > 2;
            Id message = Combiner.combineAll(context.combiner(), messages);
            if (value.core().compareTo(message) > 0) {
                value.core(message);
                context.sendMessageToAllEdges(vertex, message);
```

### DataFlowIssue
Casting `value` to `BetweennessMessage` may produce `ClassCastException`
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/betweenness/BetweennessMessage.java`
#### Snippet
```java
                        "The BetweennessMessage can't compare with class '%s'",
                        value.getClass());
        BetweennessMessage other = (BetweennessMessage) value;
        E.checkArgument(this.sequence.size() != 0, "Sequence can't be empty");
        E.checkArgument(other.sequence.size() != 0, "Sequence can't be empty");
```

### DataFlowIssue
Method invocation `valueType` may produce `NullPointerException`
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/MapValue.java`
#### Snippet
```java
                        this.valueType().string());
        if (this.elemType != ValueType.UNKNOWN) {
            E.checkArgument(this.elemType == value.valueType(),
                            "Invalid value '%s' with type %s, " +
                            "expect element with type %s",
```

### DataFlowIssue
Method invocation `valueType` may produce `NullPointerException`
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/MapValue.java`
#### Snippet
```java
                            this.elemType.string());
        } else {
            this.elemType = value.valueType();
        }
        this.map.put(id, value);
```

### DataFlowIssue
Method invocation `valueType` may produce `NullPointerException`
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValue.java`
#### Snippet
```java
                        "Can't add null to %s", this.valueType().string());
        if (this.elemType != ValueType.UNKNOWN) {
            E.checkArgument(this.elemType == value.valueType(),
                            "Invalid value '%s' with type %s, " +
                            "expect element with type %s",
```

### DataFlowIssue
Method invocation `valueType` may produce `NullPointerException`
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValue.java`
#### Snippet
```java
                            this.elemType.string());
        } else {
            this.elemType = value.valueType();
        }
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/util/Consumers.java`
#### Snippet
```java
        }
        assert this.ending;
        while (this.consume()) {

        }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'FailMessage' is still used
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/message/FailMessage.java`
#### Snippet
```java

@Deprecated
public class FailMessage extends AbstractMessage implements ResponseMessage {

    private final int errorCode;
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/util/ComputerContextUtilTest.java`
#### Snippet
```java

        Assert.assertThrows(ComputerException.class, () -> {
            ComputerContextUtil.convertToMap(new String[0]);
        });

```

## RuleId[id=ShiftOutOfRange]
### ShiftOutOfRange
Shift operation `>>>` by overly large constant value 56
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/SuperstepStat.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return (Long.hashCode(this.vertexCount) >>> 56) ^
               (Long.hashCode(this.edgeCount) >>> 48) ^
               (Long.hashCode(this.messageCount) >>> 40) ^
```

### ShiftOutOfRange
Shift operation `>>>` by overly large constant value 48
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/SuperstepStat.java`
#### Snippet
```java
    public int hashCode() {
        return (Long.hashCode(this.vertexCount) >>> 56) ^
               (Long.hashCode(this.edgeCount) >>> 48) ^
               (Long.hashCode(this.messageCount) >>> 40) ^
               (Long.hashCode(this.edgeCount) >>> 32) ^
```

### ShiftOutOfRange
Shift operation `>>>` by overly large constant value 40
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/SuperstepStat.java`
#### Snippet
```java
        return (Long.hashCode(this.vertexCount) >>> 56) ^
               (Long.hashCode(this.edgeCount) >>> 48) ^
               (Long.hashCode(this.messageCount) >>> 40) ^
               (Long.hashCode(this.edgeCount) >>> 32) ^
               (Long.hashCode(this.finishedVertexCount) >>> 24) ^
```

### ShiftOutOfRange
Shift operation `>>>` by overly large constant value 32
in `computer-driver/src/main/java/org/apache/hugegraph/computer/driver/SuperstepStat.java`
#### Snippet
```java
               (Long.hashCode(this.edgeCount) >>> 48) ^
               (Long.hashCode(this.messageCount) >>> 40) ^
               (Long.hashCode(this.edgeCount) >>> 32) ^
               (Long.hashCode(this.finishedVertexCount) >>> 24) ^
               (Long.hashCode(this.messageCount) >>> 16) ^
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvFileImpl.java`
#### Snippet
```java
            // Read footerLength
            int footerLength = input.readFixedInt();
            switch (version) {
                case "1.0":
                    this.readFooterV1d0(input, file.length() - footerLength);
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `code` in enum 'BspEvent'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/BspEvent.java`
#### Snippet
```java
    BSP_WORKER_CLOSE_DONE(14, "/worker/close_done");

    private byte code;
    private String key;

```

### NonFinalFieldInEnum
Non-final field `key` in enum 'BspEvent'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/BspEvent.java`
#### Snippet
```java

    private byte code;
    private String key;

    BspEvent(int code, String key) {
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `computer-test/src/main/java/org/apache/hugegraph/computer/suite/unit/UnitTestBase.java`
#### Snippet
```java
            map.put(((TypedOption<?, ?>) key).name(), (String) value);
        }
        if (!map.keySet().contains(
                          ComputerOptions.ALGORITHM_PARAMS_CLASS.name())) {
            map.put(ComputerOptions.ALGORITHM_PARAMS_CLASS.name(),
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/OperatorEntrypoint.java`
#### Snippet
```java

    @SafeVarargs
    private final void registerController(
                       AbstractController<?> controller,
                       Class<? extends HasMetadata>... ownsClass) {
```

### FinalPrivateMethod
'private' method declared `final`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/BufferedStreamOutput.java`
#### Snippet
```java
    }

    private final int bufferAvailable() {
        return this.bufferCapacity - (int) super.position();
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/combiner/MergeNewPropertiesCombiner.java`
#### Snippet
```java
        E.checkArgumentNotNull(v1, "The combine parameter v1 can't be null");
        E.checkArgumentNotNull(v2, "The combine parameter v2 can't be null");
        E.checkArgumentNotNull(result,
                               "The combine parameter result can't be null");
        E.checkArgument(v1 != result && v2 != result,
                        "The combine parameter result " +
                        "can't same with v1 or v2");

        result.clear();

        Map<String, Value> v1Map = v1.get();
        for (Map.Entry<String, Value> entry : v1Map.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        Map<String, Value> v2Map = v2.get();
        for (Map.Entry<String, Value> entry : v2Map.entrySet()) {
             result.putIfAbsent(entry.getKey(), entry.getValue());
        }
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/SuperstepStat.java`
#### Snippet
```java
        this.vertexCount = in.readLong();
        this.edgeCount = in.readLong();
        this.finishedVertexCount = in.readLong();
        this.messageSendCount = in.readLong();
        this.messageSendBytes = in.readLong();
        this.messageRecvCount = in.readLong();
        this.messageRecvBytes = in.readLong();
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/SuperstepStat.java`
#### Snippet
```java
        out.writeLong(this.vertexCount);
        out.writeLong(this.edgeCount);
        out.writeLong(this.finishedVertexCount);
        out.writeLong(this.messageSendCount);
        out.writeLong(this.messageSendBytes);
        out.writeLong(this.messageRecvCount);
        out.writeLong(this.messageRecvBytes);
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/input/hg/HugeInputSplitFetcher.java`
#### Snippet
```java
        E.checkArgument(shards.size() <= maxSplits,
                        "Too many shards due to too small splitSize");
        List<InputSplit> splits = new ArrayList<>();
        for (Shard shard : shards) {
            InputSplit split = new InputSplit(shard.start(), shard.end());
            splits.add(split);
        }
        return splits;
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/AbstractBufferedFileOutput.java`
#### Snippet
```java
        E.checkArgument(size <= this.bufferCapacity,
                        "The parameter size must be <= %s",
                        this.bufferCapacity);
        if (size <= this.bufferAvailable()) {
            return;
        }
        this.flushBuffer();
        /*
         * The buffer capacity must be >= 8, write primitive data like int,
         * long, float, double can be write to buffer after flush buffer.
         * Only write bytes may exceed the limit, and write bytes using
         * write(byte[] b) is overrode in this class. In conclusion, the
         * required size can be supplied after flushBuffer.
         */
        if (size > this.bufferAvailable()) {
            throw new IOException(String.format(
                    "Write %s bytes to position %s overflows buffer %s",
                    size, this.position(), this.bufferCapacity));
        }
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/CsvStructGraphOutput.java`
#### Snippet
```java
        this.writeArrayStart();
        int size = edges.size();
        int i = 0;
        for (Edge edge : edges) {
            this.writeEdge(edge);
            if (++i < size) {
                this.writeSplitter();
            }
        }
        this.writeArrayEnd();
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/netty/codec/FrameDecoder.java`
#### Snippet
```java
        int magicNumber = msg.readShort();
        if (magicNumber != AbstractMessage.MAGIC_NUMBER) {
            LOG.warn("Network stream corrupted: received incorrect " +
                     "magic number: {}, remote address: {}",
                     magicNumber, TransportUtil.remoteAddress(ctx.channel()));
            msg.release();
            return null;
        }
        int version = msg.readByte();
        if (version != AbstractMessage.PROTOCOL_VERSION) {
            LOG.warn("Network stream corrupted: received incorrect " +
                     "protocol version: {}, remote address: {}",
                     version, TransportUtil.remoteAddress(ctx.channel()));
            msg.release();
            return null;
        }
        // TODO: improve it use shared memory
        return msg;
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sort/flusher/CombineSubKvInnerSortFlusher.java`
#### Snippet
```java
            KvEntry current = null;
            if (subKvIter.hasNext()) {
                current = subKvIter.next();
                if (lastSubKv.compareTo(current) == 0) {
                    lastSubValue = this.combiner.combine(lastSubValue,
                                                         current.value());
                    continue;
                }
            }

            lastSubKv.key().write(this.output);
            lastSubValue.write(this.output);
            writtenCount++;
```

### DuplicatedCode
Duplicated code
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sort/flusher/CombineSubKvInnerSortFlusher.java`
#### Snippet
```java
                if (current == null) {
                    break;
                }

                // Used for next loop
                kvEntry.key().write(this.output);
                position = this.output.position();
                // Write value length placeholder
                this.output.writeFixedInt(0);
                // Write subKv count placeholder
                this.output.writeFixedInt(0);
                writtenCount = 0;
```

### DuplicatedCode
Duplicated code
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/common/AbstractController.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        SharedIndexInformer<R> informer = (SharedIndexInformer<R>)
                                          this.informerMap.get(rClass);
        List<R> rs = informer.getIndexer()
                             .byIndex(Cache.NAMESPACE_INDEX, namespace);
        if (CollectionUtils.isEmpty(rs)) {
            return rs;
        }
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/AlgorithmTestBase.java`
#### Snippet
```java
                params.put(ComputerOptions.BSP_REGISTER_TIMEOUT.name(),
                           "100000");
                params.put(ComputerOptions.BSP_LOG_INTERVAL.name(),
                           "30000");
                params.put(ComputerOptions.BSP_MAX_SUPER_STEP.name(),
                           "10");
                params.put(ComputerOptions.ALGORITHM_PARAMS_CLASS.name(),
                           algorithmParams);
                if (options != null) {
                    for (int i = 0; i < options.length; i += 2) {
                        params.put(options[i], options[i + 1]);
                    }
                }
                Config config = ComputerContextUtil.initContext(params);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/betweenness/BetweennessCentralityTest.java`
#### Snippet
```java
        v0.addEdge("link", v1);
        v0.addEdge("link", v2);

        v1.addEdge("link", v0);
        v1.addEdge("link", v2);
        v1.addEdge("link", v5);

        v2.addEdge("link", v0);
        v2.addEdge("link", v1);
        v2.addEdge("link", v3);
        v2.addEdge("link", v4);

        v3.addEdge("link", v2);
        v3.addEdge("link", v4);
        v3.addEdge("link", v5);

        v4.addEdge("link", v2);
        v4.addEdge("link", v3);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/closeness/ClosenessCentralityTest.java`
#### Snippet
```java
        GraphManager graph = client.graph();
        Vertex vA = graph.addVertex(T.LABEL, "user", T.ID, "A");
        Vertex vB = graph.addVertex(T.LABEL, "user", T.ID, "B");
        Vertex vC = graph.addVertex(T.LABEL, "user", T.ID, "C");
        Vertex vD = graph.addVertex(T.LABEL, "user", T.ID, "D");
        Vertex vE = graph.addVertex(T.LABEL, "user", T.ID, "E");
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/community/cc/ClusteringCoefficientTest.java`
#### Snippet
```java
        clearAll();

        SchemaManager schema = client().schema();
        schema.propertyKey(PROPERTY_KEY)
              .asInt()
              .ifNotExist()
              .create();
        schema.vertexLabel(VERTX_LABEL)
              .properties(PROPERTY_KEY)
              .useCustomizeStringId()
              .ifNotExist()
              .create();
        schema.edgeLabel(EDGE_LABEL)
              .sourceLabel(VERTX_LABEL)
              .targetLabel(VERTX_LABEL)
              .properties(PROPERTY_KEY)
              .ifNotExist()
              .create();

        GraphManager graph = client().graph();
        Vertex vA = graph.addVertex(T.LABEL, VERTX_LABEL, T.ID, "tc_A",
                                    PROPERTY_KEY, 1);
        Vertex vB = graph.addVertex(T.LABEL, VERTX_LABEL, T.ID, "tc_B",
                                    PROPERTY_KEY, 1);
        Vertex vC = graph.addVertex(T.LABEL, VERTX_LABEL, T.ID, "tc_C",
                                    PROPERTY_KEY, 1);
        Vertex vD = graph.addVertex(T.LABEL, VERTX_LABEL, T.ID, "tc_D",
                                    PROPERTY_KEY, 1);
        Vertex vE = graph.addVertex(T.LABEL, VERTX_LABEL, T.ID, "tc_E",
                                    PROPERTY_KEY, 1);

        vA.addEdge(EDGE_LABEL, vB, PROPERTY_KEY, 1);
        vA.addEdge(EDGE_LABEL, vC, PROPERTY_KEY, 1);
        vB.addEdge(EDGE_LABEL, vC, PROPERTY_KEY, 1);
        vC.addEdge(EDGE_LABEL, vD, PROPERTY_KEY, 1);
        vD.addEdge(EDGE_LABEL, vA, PROPERTY_KEY, 1);
        vD.addEdge(EDGE_LABEL, vE, PROPERTY_KEY, 1);
        vE.addEdge(EDGE_LABEL, vD, PROPERTY_KEY, 1);
        vE.addEdge(EDGE_LABEL, vC, PROPERTY_KEY, 1);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/combiner/DoubleValueSumCombinerTest.java`
#### Snippet
```java
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            combiner.combine(null, value2, value2);
        }, e -> {
            Assert.assertEquals("The combine parameter v1 can't be null",
                                e.getMessage());
        });

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            combiner.combine(value1, null, value2);
        }, e -> {
            Assert.assertEquals("The combine parameter v2 can't be null",
                                e.getMessage());
        });
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/combiner/MergeNewPropertiesCombinerTest.java`
#### Snippet
```java
        Properties properties1 = graphFactory().createProperties();
        properties1.put("name", BytesId.of("marko"));
        properties1.put("city", BytesId.of("Beijing"));

        Properties properties2 = graphFactory().createProperties();
        properties2.put("name", BytesId.of("josh"));
        properties2.put("age", BytesId.of("18"));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/combiner/PointerCombinerTest.java`
#### Snippet
```java
            value1.write(bytesOutput1);
            value2.write(bytesOutput2);

            Pointer pointer1 = new InlinePointer(bytesOutput1.buffer(),
                                                 bytesOutput1.position());

            Pointer pointer2 = new InlinePointer(bytesOutput2.buffer(),
                                                 bytesOutput2.position());

            Pointer pointer = combiner.combine(pointer1, pointer2);

            BytesInput input = IOFactory.createBytesInput(pointer.bytes());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/compute/ComputeManagerTest.java`
#### Snippet
```java
        this.managers = new Managers();
        FileManager fileManager = new FileManager();
        this.managers.add(fileManager);
        SortManager sortManager = new SendSortManager(context());
        this.managers.add(sortManager);

        MessageSendManager sendManager = new MessageSendManager(
                                         context(), sortManager,
                                         new MockMessageSender());
        this.managers.add(sendManager);
        MessageRecvManager receiveManager = new MessageRecvManager(context(),
                                                                   fileManager,
                                                                   sortManager);
        this.managers.add(receiveManager);
        this.managers.initAll(this.config);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/compute/ComputeManagerTest.java`
#### Snippet
```java
        BytesOutput bytesOutput = IOFactory.createBytesOutput(
                                  Constants.SMALL_BUF_SIZE);
        EntryOutput entryOutput = new EntryOutputImpl(bytesOutput);
        GraphComputeOutput output = new StreamGraphOutput(context(),
                                                          entryOutput);
        Whitebox.setInternalState(output, "frequency", freq);
        output.writeEdges(vertex);
        return bytesOutput.toByteArray();
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/DefaultEdgeTest.java`
#### Snippet
```java
        DefaultEdge edge = new DefaultEdge(graphFactory());
        edge.label("knows");
        edge.name("2021-06-01");
        edge.targetId(BytesId.of(1L));
        Properties properties = new DefaultProperties(graphFactory());
        properties.put("p1", new LongValue(1L));
        properties.put("p2", new DoubleValue(2.0D));
        edge.properties(properties);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/SuperstepStatTest.java`
#### Snippet
```java
        SuperstepStat stat = new SuperstepStat();
        PartitionStat partitionStat = new PartitionStat(1, 4L, 3L, 2L);
        partitionStat.mergeSendMessageStat(new MessageStat(5L, 6L));
        partitionStat.mergeRecvMessageStat(new MessageStat(7L, 8L));
        stat.increase(partitionStat);
        stat.increase(partitionStat);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/partition/HashPartitionerTest.java`
#### Snippet
```java
        Partitioner partitioner = config.createObject(
                                  ComputerOptions.WORKER_PARTITIONER);
        partitioner.init(config);
        Id vertexId1 = BytesId.of(1L);
        Id vertexId2 = BytesId.of(2L);
        Id vertexId3 = BytesId.of(-1L);
        Id vertexId4 = BytesId.of(-100L);
        Id vertexId5 = BytesId.of(Long.MIN_VALUE);
        Id vertexId6 = BytesId.of(Long.MAX_VALUE);

        int partition1 = partitioner.partitionId(vertexId1);
        int partition2 = partitioner.partitionId(vertexId2);
        int partition3 = partitioner.partitionId(vertexId3);
        int partition4 = partitioner.partitionId(vertexId4);
        int partition5 = partitioner.partitionId(vertexId5);
        int partition6 = partitioner.partitionId(vertexId6);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/partition/HashPartitionerTest.java`
#### Snippet
```java
        int workerId1 = partitioner.workerId(partition1);
        int workerId2 = partitioner.workerId(partition2);
        int workerId3 = partitioner.workerId(partition3);
        int workerId4 = partitioner.workerId(partition4);
        int workerId5 = partitioner.workerId(partition5);
        int workerId6 = partitioner.workerId(partition6);
        Assert.assertEquals(1, workerId1);
        Assert.assertEquals(1, workerId2);
        Assert.assertEquals(1, workerId3);
        Assert.assertEquals(1, workerId4);
        Assert.assertEquals(1, workerId5);
        Assert.assertEquals(1, workerId6);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/DoubleValueTest.java`
#### Snippet
```java
        Assert.assertEquals(0, value1.intValue());
        Assert.assertEquals(0L, value1.longValue());
        Assert.assertEquals(0.0f, value1.floatValue(), 0.0f);
        Assert.assertEquals(0.0d, value1.doubleValue(), 0.0d);

        Assert.assertEquals(1234, value2.intValue());
        Assert.assertEquals(1234L, value2.longValue());
        Assert.assertEquals(1234.56f, value2.floatValue(), 0.0f);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/DoubleValueTest.java`
#### Snippet
```java
        Assert.assertEquals(0, value1.compareTo(value2));
        Assert.assertLt(0, value1.compareTo(value3));
        Assert.assertGt(0, value3.compareTo(value1));

        Assert.assertGt(0, value1.compareTo(NullValue.get()));
        Assert.assertGt(0, value1.compareTo(new IntValue(123)));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IdListListTest.java`
#### Snippet
```java
        Id longId1 = BytesId.of(100L);
        Id longId2 = BytesId.of(200L);
        IdList listValue = new IdList();
        listValue.add(longId1);
        listValue.add(longId2);

        IdListList oldValue = new IdListList();
        oldValue.add(listValue);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IdValueTest.java`
#### Snippet
```java
        Assert.assertGt(0, value1.compareTo(NullValue.get()));
        Assert.assertGt(0, value1.compareTo(new BooleanValue()));
        Assert.assertGt(0, value1.compareTo(new IntValue(123)));
        Assert.assertGt(0, value1.compareTo(new FloatValue(123)));
        Assert.assertGt(0, value1.compareTo(new DoubleValue(123)));
        Assert.assertGt(0, value1.compareTo(new StringValue("123")));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValueTest.java`
#### Snippet
```java
        Assert.assertEquals(0, intValue1.intValue());
        Assert.assertEquals(0L, intValue1.longValue());
        Assert.assertEquals(0.0f, intValue1.floatValue(), 0.0f);
        Assert.assertEquals(0.0d, intValue1.doubleValue(), 0.0d);

        Assert.assertEquals(123456, intValue2.intValue());
        Assert.assertEquals(123456L, intValue2.longValue());
        Assert.assertEquals(123456f, intValue2.floatValue(), 0.0f);
        Assert.assertEquals(123456d, intValue2.doubleValue(), 0.0d);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValueTest.java`
#### Snippet
```java
        Assert.assertEquals(0, intValue1.compareTo(intValue2));
        Assert.assertLt(0, intValue1.compareTo(intValue3));
        Assert.assertGt(0, intValue3.compareTo(intValue1));

        Assert.assertGt(0, intValue1.compareTo(NullValue.get()));
        Assert.assertGt(0, intValue1.compareTo(new BooleanValue()));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        ListValue<IntValue> value1 = new ListValue<>(ValueType.INT);
        ListValue<FloatValue> value2 = new ListValue<>(ValueType.FLOAT);

        Assert.assertEquals(0, value1.size());
        value1.add(new IntValue(101));
        value1.add(new IntValue(102));
        value1.add(new IntValue(103));
        Assert.assertEquals(3, value1.size());

        Assert.assertEquals(0, value2.size());
        value2.add(new FloatValue(201f));
        value2.add(new FloatValue(202f));
        Assert.assertEquals(2, value2.size());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        ListValue<IntValue> value1 = new ListValue<>(ValueType.INT);
        ListValue<FloatValue> value2 = new ListValue<>(ValueType.FLOAT);

        Assert.assertEquals(ImmutableList.of(), value1.values());
        Assert.assertEquals(ImmutableList.of(), value2.values());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        ListValue<IntValue> value1 = new ListValue<>(ValueType.INT);
        ListValue<FloatValue> value2 = new ListValue<>(ValueType.FLOAT);

        value1.add(new IntValue(101));
        value1.add(new IntValue(102));
        value1.add(new IntValue(103));

        value2.add(new FloatValue(201f));
        value2.add(new FloatValue(202f));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/StringValueTest.java`
#### Snippet
```java
        Assert.assertGt(0, value3.compareTo(value1));

        Assert.assertGt(0, value1.compareTo(NullValue.get()));
        Assert.assertGt(0, value1.compareTo(new BooleanValue()));
        Assert.assertGt(0, value1.compareTo(new IntValue(123)));
        Assert.assertGt(0, value1.compareTo(new FloatValue(123)));
        Assert.assertGt(0, value1.compareTo(new DoubleValue(123)));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/input/FileInputSplitTest.java`
#### Snippet
```java
        Assert.assertEquals(split1, split1);
        Assert.assertEquals(split1, split2);

        Assert.assertNotEquals(split1, null);
        Assert.assertNotEquals(split1, new Object());

        Assert.assertEquals(InputSplit.END_SPLIT, InputSplit.END_SPLIT);
        Assert.assertNotEquals(InputSplit.END_SPLIT, split1);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/CsvStructGraphOutputTest.java`
#### Snippet
```java
        ComputerContext context = context();
        GraphFactory factory = context.graphFactory();

        Id longId = BytesId.of(100L);
        IdList idList = new IdList();
        idList.add(BytesId.of(998L));
        idList.add(BytesId.of(999L));
        Vertex vertex = factory.createVertex(longId, idList);
        vertex.addEdge(factory.createEdge("knows", BytesId.of(200)));
        vertex.addEdge(factory.createEdge("watch", "1111", BytesId.of(300)));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/CsvStructGraphOutputTest.java`
#### Snippet
```java
        ComputerContext context = context();
        GraphFactory factory = context.graphFactory();

        Id longId = BytesId.of(100L);
        IdListList idListList = new IdListList();
        IdList idList1 = new IdList();
        idList1.add(BytesId.of(66L));
        IdList idList2 = new IdList();
        idList2.add(BytesId.of(998L));
        idList2.add(BytesId.of(999L));
        idListList.add(idList1);
        idListList.add(idList2);

        Vertex vertex = factory.createVertex(longId, idListList);
        vertex.properties().put("boolean", new BooleanValue(true));
        vertex.properties().put("byte", new IntValue(127));
        vertex.properties().put("short", new IntValue(16383));
        vertex.properties().put("int", new IntValue(1000000));
        vertex.properties().put("long", new LongValue(10000000000L));
        vertex.properties().put("float", new FloatValue(0.1F));
        vertex.properties().put("double", new DoubleValue(-0.01D));
        vertex.properties().put("idvalue", longId);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/StreamGraphOutputInputTest.java`
#### Snippet
```java
        ComputerContext context = ComputerContext.instance();
        GraphFactory graphFactory = context.graphFactory();

        Id longId = BytesId.of(100L);
        LongValue longValue = new LongValue(999L);
        Vertex vertex = graphFactory().createVertex(longId, longValue);
        vertex.addEdge(graphFactory.createEdge(BytesId.of(2L)));
        vertex.addEdge(graphFactory.createEdge("knows", BytesId.of(3L)));
        vertex.addEdge(graphFactory.createEdge("watch", BytesId.of(3L)));
        vertex.addEdge(graphFactory.createEdge("watch", "1111",
                                               BytesId.of(4L)));
        vertex.addEdge(graphFactory.createEdge("watch", "2222",
                                               BytesId.of(4L)));

        byte[] bytes;
        try (BytesOutput bao = IOFactory.createBytesOutput(
                               Constants.SMALL_BUF_SIZE)) {
            StreamGraphOutput output = newStreamGraphOutput(bao);
            output.writeEdges(vertex);
            bytes = bao.toByteArray();
            bytes = reweaveBytes(bytes);
        }
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/netty/HeartbeatHandlerTest.java`
#### Snippet
```java
        HeartbeatHandler beatHandler = new HeartbeatHandler();
        HeartbeatHandler mockHeartbeatHandler = Mockito.spy(beatHandler);
        Mockito.doAnswer(invocationOnMock -> {
            invocationOnMock.callRealMethod();
            Channel channel = invocationOnMock.getArgument(0);
            channel.pipeline().replace("heartbeatHandler", "heartbeatHandler",
                                       mockHeartbeatHandler);
            return null;
        }).when(clientProtocol).initializeClientPipeline(Mockito.any());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/netty/NettyClientFactoryTest.java`
#### Snippet
```java
        TransportConf conf = TransportConf.wrapConfig(config);
        NettyClientFactory clientFactory = new NettyClientFactory(conf);
        clientFactory.init();
        ConnectionId connectionId = ConnectionId.parseConnectionId(
                                    "127.0.0.1", 8086);
        this.client = clientFactory.createClient(connectionId, clientHandler);
        Assert.assertTrue(this.client.active());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/MessageRecvBuffersTest.java`
#### Snippet
```java
        Assert.assertThrows(ComputerException.class, () -> {
            buffers.waitSorted();
        }, e -> {
            Assert.assertContains("Buffers have not been sorted in 100 ms",
                                  e.getMessage());
        });

        addMockBufferToBuffers(buffers, size);
        Assert.assertTrue(buffers.full());

        List<RandomAccessInput> list = buffers.buffers();
        Assert.assertEquals(11, list.size());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/edge/EdgeMessageRecvPartitionTest.java`
#### Snippet
```java
        FileUtils.deleteQuietly(new File("data_dir1"));
        FileUtils.deleteQuietly(new File("data_dir2"));
        this.fileManager = new FileManager();
        this.fileManager.init(this.config);
        this.sortManager = new RecvSortManager(context());
        this.sortManager.init(this.config);
        SuperstepFileGenerator fileGenerator = new SuperstepFileGenerator(
                                               this.fileManager,
                                               Constants.INPUT_SUPERSTEP);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/edge/EdgeMessageRecvPartitionTest.java`
#### Snippet
```java
        for (long i = 0L; i < 10L; i++) {
            Vertex vertex = graphFactory().createVertex();
            vertex.id(BytesId.of(i));
            Edges edges = graphFactory().createEdges(2);
            for (long j = i + 1; j < i + 3; j++) {
                Edge edge = graphFactory().createEdge();
                edge.targetId(BytesId.of(j));
                Properties properties = graphFactory().createProperties();
                properties.put("p1", new LongValue(i));
                edge.properties(properties);
                edges.add(edge);
            }
            vertex.edges(edges);
            ReceiverUtil.consumeBuffer(writeEdges(vertex), consumer);
        }
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/edge/EdgeMessageRecvPartitionTest.java`
#### Snippet
```java
                Assert.assertTrue(subKvIt.hasNext());
                KvEntry subKv = subKvIt.next();
                Id targetId = ReceiverUtil.readId(subKv.key());
                Assert.assertEquals(BytesId.of(j), targetId);

                Properties properties = graphFactory().createProperties();
                ReceiverUtil.readValue(subKv.value(), properties);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/message/ComputeMessageRecvPartitionTest.java`
#### Snippet
```java
        FileUtils.deleteQuietly(new File("data_dir1"));
        FileUtils.deleteQuietly(new File("data_dir2"));
        FileManager fileManager = new FileManager();
        fileManager.init(config);
        SortManager sortManager = new RecvSortManager(context());
        sortManager.init(config);
        SuperstepFileGenerator fileGenerator = new SuperstepFileGenerator(
                                               fileManager, 0);
        ComputeMessageRecvPartition partition = new ComputeMessageRecvPartition(
                                                context(), fileGenerator,
                                                sortManager);
        Assert.assertEquals("msg", partition.type());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/vertex/VertexMessageRecvPartitionTest.java`
#### Snippet
```java
        FileUtils.deleteQuietly(new File("data_dir1"));
        FileUtils.deleteQuietly(new File("data_dir2"));
        this.fileManager = new FileManager();
        this.fileManager.init(this.config);
        SuperstepFileGenerator fileGenerator = new SuperstepFileGenerator(
                               this.fileManager,
                               Constants.INPUT_SUPERSTEP);
        this.partition = new VertexMessageRecvPartition(context(),
                                                        fileGenerator,
                                                        this.sortManager);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/MultiQueueTest.java`
#### Snippet
```java
        MultiQueue queue = new MultiQueue(2);
        Throwable[] exceptions = new Throwable[3];

        CountDownLatch[] latches = new CountDownLatch[3];
        for (int i = 0; i < latches.length; i++) {
            latches[i] = new CountDownLatch(1);
        }

        Thread thread1 = new Thread(() -> {
            try {
                latches[0].await();
                queue.put(0, new QueuedMessage(1, MessageType.VERTEX, null));
                latches[1].await();
                queue.put(0, new QueuedMessage(3, MessageType.VERTEX, null));
                latches[2].await();
                queue.put(0, new QueuedMessage(5, MessageType.VERTEX, null));
            } catch (Throwable e) {
                exceptions[0] = e;
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                latches[0].await();
                queue.put(1, new QueuedMessage(2, MessageType.VERTEX, null));
                latches[1].await();
                queue.put(1, new QueuedMessage(4, MessageType.VERTEX, null));
                latches[2].await();
                queue.put(1, new QueuedMessage(6, MessageType.VERTEX, null));
            } catch (Throwable e) {
                exceptions[1] = e;
            }
        });
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/MultiQueueTest.java`
#### Snippet
```java
                Assert.assertTrue(ImmutableSet.of(3, 4).contains(
                                  queue.take().partitionId()));
                Assert.assertTrue(ImmutableSet.of(3, 4).contains(
                                  queue.take().partitionId()));

                latches[2].countDown();
                Assert.assertTrue(ImmutableSet.of(5, 6).contains(
                                  queue.take().partitionId()));
                Assert.assertTrue(ImmutableSet.of(5, 6).contains(
                                  queue.take().partitionId()));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

        vertex = graphFactory.createVertex(BytesId.of(1L),
                                           new DoubleValue(0.5d));
        Properties properties = graphFactory.createProperties();
        properties.put("name", BytesId.of("marko"));
        properties.put("age", new IntValue(18));
        properties.put("city", new ListValue<>(ValueType.ID,
                                               ImmutableList.of(BytesId.of("wuhan"),
                                                BytesId.of("xian"))));
        vertex.properties(properties);
        buffer.writeVertex(vertex);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);

        vertex = graphFactory.createVertex(BytesId.of(1L),
                                           new DoubleValue(0.5d));
        vertex.addEdge(graphFactory.createEdge(BytesId.of(2L)));
        vertex.addEdge(graphFactory.createEdge("knows", BytesId.of(3L)));
        vertex.addEdge(graphFactory.createEdge("watch", "1111",
                                               BytesId.of(4L)));
        buffer.writeEdges(vertex);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
        vertex = graphFactory.createVertex(BytesId.of(1L),
                                           new DoubleValue(0.5d));
        vertex.addEdge(graphFactory.createEdge(BytesId.of(2L)));
        vertex.addEdge(graphFactory.createEdge("knows", BytesId.of(3L)));
        vertex.addEdge(graphFactory.createEdge("watch", "1111",
                                               BytesId.of(4L)));
        buffers.writeEdges(vertex);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        buffer.writeMessage(BytesId.of(1L), new DoubleValue(0.85D));
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

        buffer.writeMessage(BytesId.of(2L), new DoubleValue(0.15D));
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
        GraphFactory graphFactory = context().graphFactory();

        WriteBuffers buffers = new WriteBuffers(context(), 50, 100);
        Vertex vertex = graphFactory.createVertex(BytesId.of(1L),
                                                  new DoubleValue(0.5d));
        vertex.addEdge(graphFactory.createEdge(BytesId.of(2L)));
        vertex.addEdge(graphFactory.createEdge("knows", BytesId.of(3L)));
        vertex.addEdge(graphFactory.createEdge("watch", "1111",
                                               BytesId.of(4L)));
        buffers.writeEdges(vertex);
        // Reached threshold, the position is 76
        Assert.assertTrue(buffers.reachThreshold());
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/EntriesUtilTest.java`
#### Snippet
```java
            Assert.assertEquals(BytesId.of(10),
                                StoreTestUtil.idFromPointer(iter.next().key()));
            Assert.assertEquals(BytesId.of(10),
                                StoreTestUtil.idFromPointer(iter.next().key()));
            Assert.assertEquals(BytesId.of(20),
                                StoreTestUtil.idFromPointer(iter.next().key()));
            Assert.assertEquals(BytesId.of(40),
                                StoreTestUtil.idFromPointer(iter.next().key()));
            Assert.assertEquals(BytesId.of(50),
                                StoreTestUtil.idFromPointer(iter.next().key()));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/EntryOutputTest.java`
#### Snippet
```java
        KvEntry kvEntry2 = iter.next();
        Id key2 = StoreTestUtil.idFromPointer(kvEntry2.key());
        Assert.assertEquals(BytesId.of(1), key2);
        EntryIterator kvEntry2SubKvs = EntriesUtil.subKvIterFromEntry(kvEntry2);
        SorterTestUtil.assertKvEntry(kvEntry2SubKvs.next(),
                                     BytesId.of(2), BytesId.of(2));
        SorterTestUtil.assertKvEntry(kvEntry2SubKvs.next(),
                                     BytesId.of(6), BytesId.of(1));

        iter.close();
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
            Assert.assertEquals(version, dir.version());
            Assert.assertEquals(5, dir.numEntries());
            int maxKey = StoreTestUtil.byteArrayToInt(dir.max());
            Assert.assertEquals(6, maxKey);
            int minKey = StoreTestUtil.byteArrayToInt(dir.min());
            Assert.assertEquals(2, minKey);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
        try (EntryIterator iterator = reader.iterator()) {
            int i = 0;
            while (iterator.hasNext()) {
                KvEntry entry = iterator.next();
                int key = StoreTestUtil.byteArrayToInt(entry.key().bytes());
                Assert.assertEquals(data.get(i).intValue(), key);
                i += 2;
            }
            Assert.assertThrows(NoSuchElementException.class, iterator::next);
        }
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/worker/MockComputation.java`
#### Snippet
```java
        Assert.assertEquals(new IntValue(5), context.aggregatedValue(
                            MockMasterComputation.AGGR_INT_SUM));
        Assert.assertEquals(new IntValue(8), context.aggregatedValue(
                            MockMasterComputation.AGGR_INT_MAX));

        Assert.assertEquals(new LongValue(5L), context.aggregatedValue(
                            MockMasterComputation.AGGR_LONG_SUM));
        Assert.assertEquals(new LongValue(8L), context.aggregatedValue(
                            MockMasterComputation.AGGR_LONG_MAX));

        Assert.assertEquals(new FloatValue(10.4f), context.aggregatedValue(
                            MockMasterComputation.AGGR_FLOAT_SUM));
        Assert.assertEquals(new FloatValue(-10.0f), context.aggregatedValue(
                            MockMasterComputation.AGGR_FLOAT_MIN));

        Assert.assertEquals(new DoubleValue(10.4), context.aggregatedValue(
                            MockMasterComputation.AGGR_DOUBLE_SUM));
        Assert.assertEquals(new DoubleValue(-10.0), context.aggregatedValue(
                            MockMasterComputation.AGGR_DOUBLE_MIN));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/worker/MockMasterComputation2.java`
#### Snippet
```java
        Assert.assertEquals(new IntValue(10), context.aggregatedValue(
                AGGR_INT_SUM));
        Assert.assertEquals(new IntValue(8), context.aggregatedValue(
                AGGR_INT_MAX));

        Assert.assertEquals(new LongValue(10L), context.aggregatedValue(
                AGGR_LONG_SUM));
        Assert.assertEquals(new LongValue(8L), context.aggregatedValue(
                AGGR_LONG_MAX));

        Assert.assertEquals(new FloatValue(20.8f), context.aggregatedValue(
                AGGR_FLOAT_SUM));
        Assert.assertEquals(new FloatValue(-10.0f), context.aggregatedValue(
                AGGR_FLOAT_MIN));

        Assert.assertEquals(new DoubleValue(20.8), context.aggregatedValue(
                AGGR_DOUBLE_SUM));
        Assert.assertEquals(new DoubleValue(-10.0), context.aggregatedValue(
                AGGR_DOUBLE_MIN));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        Map<String, String> params = new HashMap<>();
        params.put(KubeSpecOptions.WORKER_INSTANCES.name(), "1");
        params.put(ComputerOptions.TRANSPORT_SERVER_PORT.name(), "0");
        params.put(ComputerOptions.RPC_SERVER_PORT_NAME, "0");
        String jobId = this.driver.submitJob(ALGORITHM_NAME, params);

        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
        jobState.jobStatus(JobStatus.INITIALIZING);
        Mockito.verify(jobObserver, Mockito.timeout(15000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
        jobState.jobStatus(JobStatus.INITIALIZING);
        Mockito.verify(jobObserver, Mockito.timeout(15000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState));

        DefaultJobState jobState2 = new DefaultJobState();
        jobState2.jobStatus(JobStatus.SUCCEEDED);
        Mockito.verify(jobObserver, Mockito.timeout(15000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState2));

        future.cancel(true);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        Object defaultSpec = Whitebox.invoke(KubernetesDriver.class,
                                             "defaultSpec",
                                             this.driver);
        Whitebox.setInternalState(this.driver, "defaultSpec", defaultSpec);

        Map<String, String> params = new HashMap<>();
        params.put(KubeSpecOptions.WORKER_INSTANCES.name(), "1");
        String jobId = this.driver.submitJob(ALGORITHM_NAME, params);

        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
        jobState.jobStatus(JobStatus.INITIALIZING);
        Mockito.verify(jobObserver, Mockito.timeout(15000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState));
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        String jobId = this.driver.submitJob(ALGORITHM_NAME, params);

        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
        jobState.jobStatus(JobStatus.FAILED);
        Mockito.verify(jobObserver, Mockito.timeout(30000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState));

        String diagnostics = this.driver.diagnostics(jobId, params);
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        super.updateOptions(KubeSpecOptions.MASTER_ARGS.name(),
                            Lists.newArrayList("pwd && sleep 60"));
        super.updateOptions(KubeSpecOptions.WORKER_ARGS.name(),
                            Lists.newArrayList("pwd && sleep 60"));
        Object defaultSpec = Whitebox.invoke(KubernetesDriver.class,
                                             "defaultSpec",
                                             this.driver);
        Whitebox.setInternalState(this.driver, "defaultSpec", defaultSpec);

        Map<String, String> params = new HashMap<>();
        params.put(KubeSpecOptions.WORKER_INSTANCES.name(), "1");
        String jobId = this.driver.submitJob(ALGORITHM_NAME, params);

        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
```

### DuplicatedCode
Duplicated code
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/MiniKubeTest.java`
#### Snippet
```java
        String jobId = this.driver.submitJob(ALGORITHM_NAME, params);

        JobObserver jobObserver = Mockito.mock(JobObserver.class);

        CompletableFuture<Void> future = this.driver.waitJobAsync(jobId, params,
                                                                  jobObserver);

        DefaultJobState jobState = new DefaultJobState();
        jobState.jobStatus(JobStatus.INITIALIZING);
        Mockito.verify(jobObserver, Mockito.timeout(150000L).atLeast(1))
               .onJobStateChanged(Mockito.eq(jobState));

        DefaultJobState jobState2 = new DefaultJobState();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/common/ContainerInfo.java`
#### Snippet
```java

    public String uniqueName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hostname)
          .append(":")
```

## RuleId[id=Deprecation]
### Deprecation
'Long(long)' is deprecated
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesIdTest.java`
#### Snippet
```java
        Assert.assertEquals(2, longId2.length());

        Assert.assertEquals(new Long(123L), longId1.asObject());
        Assert.assertEquals(123L, longId1.asObject());

```

### Deprecation
'Long(long)' is deprecated
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesIdTest.java`
#### Snippet
```java
        Assert.assertEquals(123L, longId1.asObject());

        Assert.assertEquals(new Long(-100L), longId5.asObject());
        Assert.assertEquals(-100L, longId5.asObject());

```

### Deprecation
'newInstance()' is deprecated
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
            Aggregator<V> aggr;
            try {
                aggr = aggregatorClass.newInstance();
            } catch (Exception e) {
                throw new ComputerException("Can't new instance from class: %s",
```

### Deprecation
'org.apache.hugegraph.computer.core.network.message.FailMessage' is deprecated
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/netty/AbstractNettyHandler.java`
#### Snippet
```java
    protected void processFailMessage(ChannelHandlerContext ctx,
                                      Channel channel,
                                      FailMessage failMessage) {
        int errorCode = failMessage.errorCode();

```

### Deprecation
'org.apache.hugegraph.computer.core.network.message.FailMessage' is deprecated
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/netty/AbstractNettyHandler.java`
#### Snippet
```java
                break;
            case FAIL:
                this.processFailMessage(ctx, channel, (FailMessage) msg);
                break;
            case ACK:
```

### Deprecation
'newInstance()' is deprecated
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/aggregator/DefaultAggregator.java`
#### Snippet
```java
    public void repair(ComputerContext context) {
        try {
            this.combiner = this.combinerClass.newInstance();
        } catch (Exception e) {
            throw new ComputerException("Can't new instance from class: %s",
```

### Deprecation
'newInstance()' is deprecated
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/config/DefaultConfig.java`
#### Snippet
```java
        try {
            @SuppressWarnings("unchecked")
            T instance = (T) clazz.newInstance();
            return instance;
        } catch (Exception e) {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/MockMessageHandler.java`
#### Snippet
```java
    @Override
    public String genOutputPath(MessageType messageType, int partition) {
        return "./" + UUID.randomUUID().toString();
    }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set\>' may not contain objects of type 'TypedOption'
in `computer-k8s/src/main/java/org/apache/hugegraph/computer/k8s/driver/KubernetesDriver.java`
#### Snippet
```java
            if (value != null) {
                String specKey = KubeUtil.covertSpecKey(typeOption.name());
                if (KubeSpecOptions.MAP_TYPE_CONFIGS.contains(typeOption)) {
                    if (!Objects.equals(String.valueOf(value), "[]")) {
                        value = this.conf.getMap((ConfigListOption<String>) typeOption);
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `srao` declared in one 'switch' branch and used in another
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/IOFactory.java`
#### Snippet
```java
                return new StreamGraphOutput(context, entryOutput);
            case CSV:
                StructRandomAccessOutput srao;
                srao = new StructRandomAccessOutput(out);
                return new CsvStructGraphOutput(context, srao);
```

### SwitchStatementWithConfusingDeclaration
Local variable `input` declared in one 'switch' branch and used in another
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
        switch (this.idType) {
            case LONG:
                BytesInput input = IOFactory.createBytesInput(this.bytes, 0,
                                                              this.length);
                try {
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
#### Snippet
```java

    @Override
    public void readFully(byte[] b) throws IOException {
        this.in.readFully(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
#### Snippet
```java

    @Override
    public void readFully(byte[] b, int off, int len) throws IOException {
        this.in.readFully(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesOutput.java`
#### Snippet
```java

    @Override
    public void writeChars(String s) throws IOException {
        this.out.writeChars(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesOutput.java`
#### Snippet
```java

    @Override
    public void writeUTF(String s) throws IOException {
        this.writeString(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesOutput.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
        this.out.write(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesOutput.java`
#### Snippet
```java

    @Override
    public void writeBytes(String s) throws IOException {
        this.out.writeBytes(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesOutput.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.out.write(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutput.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
        this.writeString(StringEncoding.encodeBase64(b));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutput.java`
#### Snippet
```java

    @Override
    public void writeChars(String s) throws IOException {
        this.writeString(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutput.java`
#### Snippet
```java

    @Override
    public void writeBytes(String s) throws IOException {
        this.writeString(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutput.java`
#### Snippet
```java

    @Override
    public void writeUTF(String s) throws IOException {
        this.writeString(s);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutput.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        byte[] dest = new byte[len];
        System.arraycopy(b, off, dest, 0, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/UnsafeBytesOutput.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.require(len);
        System.arraycopy(b, off, this.buffer, this.position, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/UnsafeBytesOutput.java`
#### Snippet
```java

    @Override
    public void writeUTF(String s) throws IOException {
        byte[] bytes = CoderUtil.encode(s);
        if (bytes.length > 65535) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/UnsafeBytesInput.java`
#### Snippet
```java

    @Override
    public void readFully(byte[] b) throws IOException {
        this.readFully(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/UnsafeBytesInput.java`
#### Snippet
```java

    @Override
    public void readFully(byte[] b, int off, int len) throws IOException {
        this.require(len);
        System.arraycopy(this.buffer, this.position, b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/StringValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/IdSet.java`
#### Snippet
```java

    @Override
    public int compareTo(Value o) {
        throw new UnsupportedOperationException("compareTo");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/DoubleValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/NullValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/FloatValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/BooleanValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/Value.java`
#### Snippet
```java

        @Override
        default int compareTo(Value other) {
            throw new UnsupportedOperationException("compareTo");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/LongValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/MapValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        throw new UnsupportedOperationException("MapValue.compareTo()");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValue.java`
#### Snippet
```java

    @Override
    public int compareTo(Value obj) {
        E.checkArgumentNotNull(obj, "The compare argument can't be null");
        int typeDiff = this.valueType().compareTo(obj.valueType());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/common/WorkQueue.java`
#### Snippet
```java
 *
 * This has been taken from official client:
 * https://github.com/kubernetes-client/java/blob/master/extended/src/main/java
 * /io/kubernetes/client/extended/workqueue/DefaultWorkQueue.java
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/common/WorkQueue.java`
#### Snippet
```java
 *
 * Which has been ported from official go client:
 * https://github.com/kubernetes/client-go/blob/master/util/workqueue/queue.go
 */
public class WorkQueue<T> {
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'BooleanValue' and 'IntValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/BooleanValueTest.java`
#### Snippet
```java
        Assert.assertFalse(value1.equals(new BooleanValue(true)));

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'LongValue' and 'FloatValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/LongValueTest.java`
#### Snippet
```java
        Assert.assertTrue(value1.equals(new LongValue(0L)));
        Assert.assertFalse(value1.equals(new LongValue(1L)));
        Assert.assertFalse(value1.equals(new FloatValue(1f)));
        Assert.assertFalse(value1.equals(null));
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'StringValue' and 'DoubleValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/StringValueTest.java`
#### Snippet
```java

        DoubleValue value3 = new DoubleValue(1.1);
        Assert.assertFalse(value1.equals(value3));
    }

```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'NullValue' and 'IntValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/NullValueTest.java`
#### Snippet
```java
        Assert.assertTrue(value1.equals(NullValue.get()));

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'IntValue' and 'FloatValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValueTest.java`
#### Snippet
```java
        Assert.assertTrue(intValue1.equals(new IntValue(0)));
        Assert.assertFalse(intValue1.equals(new IntValue(1)));
        Assert.assertFalse(intValue1.equals(new FloatValue(1f)));
        Assert.assertFalse(intValue1.equals(null));
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'FloatValue' and 'IntValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/FloatValueTest.java`
#### Snippet
```java
        Assert.assertFalse(value1.equals(new FloatValue(1.0f)));

        Assert.assertFalse(value1.equals(new IntValue(0)));
        Assert.assertFalse(value1.equals(null));
    }
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'ListValue' and 'ListValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        Assert.assertTrue(value2.equals(value2.copy()));

        Assert.assertFalse(value1.equals(value2));
        Assert.assertFalse(value2.equals(value1));

```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'ListValue' and 'ListValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java

        Assert.assertFalse(value1.equals(value2));
        Assert.assertFalse(value2.equals(value1));

        Assert.assertFalse(value1.equals(new IntValue(1)));
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'ListValue' and 'IntValue'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java
        Assert.assertFalse(value2.equals(value1));

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java

    private static String ENDPOINTS = "http://localhost:2579";
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
    private static String KEY1 = "/key1";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
public class EtcdClientTest {

    private static String ENDPOINTS = "http://localhost:2579";
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/input/loader/LoaderFileInputSplitFetcher.java`
#### Snippet
```java
public class LoaderFileInputSplitFetcher implements InputSplitFetcher {

    private final Config config;
    private final List<InputStruct> vertexInputStructs;
    private final List<InputStruct> edgeInputStructs;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
    private volatile Bsp4Master bsp4Master;
    private ContainerInfo masterInfo;
    private List<ContainerInfo> workers;
    private int maxSuperStep;
    private MasterComputation masterComputation;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/input/MessageInput.java`
#### Snippet
```java
public class MessageInput<T extends Value> {

    private final Config config;
    private final PeekableIterator<KvEntry> messages;
    private final T value;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/worker/WorkerService.java`
#### Snippet
```java
    private Combiner<Value> combiner;

    private ContainerInfo masterInfo;

    private volatile ShutdownHook shutdownHook;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/allocator/DefaultAllocator.java`
#### Snippet
```java
public final class DefaultAllocator implements Allocator {

    private final GraphFactory factory;
    private final Recycler<RecyclerReference<Vertex>> vertexRecycler;
    private final Recycler<RecyclerReference<Edge>> edgeRecycler;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/pagerank/PageRank4Master.java`
#### Snippet
```java
        LOG.info("PageRank running status: {}", sb);
        double l1Diff = l1NormDifference.value();
        if (context.superstep() > 1 && l1Diff <= this.l1DiffThreshold) {
            return false;
        } else {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-k8s-operator/src/main/java/org/apache/hugegraph/computer/k8s/operator/common/AbstractController.java`
#### Snippet
```java
                           .get(OperatorOptions.CLOSE_RECONCILER_TIMEOUT);
        try {
            this.executor.awaitTermination(timeout, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
```

### IgnoreResultOfCall
Result of `FilterInputStream.skip()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/BufferedStreamTest.java`
#### Snippet
```java
                                       new FileInputStream(file))) {
                Assert.assertEquals(-128, dis.readByte());
                dis.skip(1);
                for (int i = -126; i <= 127; i++) {
                    Assert.assertEquals(i, dis.readByte());
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        byte[] bytes1 = this.client.get(KEY1, 1000L, 500L);
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
        Assert.assertArrayEquals(VALUE1, bytes1);
        Assert.assertThrows(ComputerException.class, () -> {
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        });
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
        long deleteCount = this.client.delete(KEY1);
        Assert.assertEquals(1L, deleteCount);
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        byte[] bytes1 = this.client.get(KEY1, 1000L, 500L);
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
        Assert.assertArrayEquals(VALUE1, bytes1);
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
                                                            1000L, 200L);
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
        Assert.assertEquals(2, valueList1.size());
        Assert.assertArrayEquals(VALUE1, valueList1.get(0));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/BitFileTest.java`
#### Snippet
```java
    private static File createTempDir() {
        File dir = new File(UUID.randomUUID().toString());
        dir.mkdirs();
        return dir;
    }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/FileManagerTest.java`
#### Snippet
```java
    public void testInitWithFile() throws IOException {
        File file = new File("exist");
        file.createNewFile();
        Config config = UnitTestBase.updateWithRequiredOptions(
            ComputerOptions.JOB_ID, "local_001",
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/FileManagerTest.java`
#### Snippet
```java
            Assert.assertContains("Can't create dir ", e.getMessage());
        });
        file.delete();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
        // Path isn't directory
        File file = new File(StoreTestUtil.availablePathById("1"));
        file.getParentFile().mkdirs();
        file.createNewFile();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
        File file = new File(StoreTestUtil.availablePathById("1"));
        file.getParentFile().mkdirs();
        file.createNewFile();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            HgkvDirImpl.open(file.getPath());
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/ValueFileTest.java`
#### Snippet
```java
    private static File createTempDir() {
        File dir = new File(UUID.randomUUID().toString());
        dir.mkdirs();
        return dir;
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sort/sorting/SortManager.java`
#### Snippet
```java
        this.sortExecutor.shutdown();
        try {
            this.sortExecutor.awaitTermination(Constants.SHUTDOWN_TIMEOUT,
                                               TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvFileImpl.java`
#### Snippet
```java
                        "file already exists: '%s'", file.getPath());
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvFileImpl.java`
#### Snippet
```java
            file.getParentFile().mkdirs();
        }
        file.createNewFile();

        return new HgkvFileImpl(path);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvDirImpl.java`
#### Snippet
```java
                        "Can't create HgkvDir because the " +
                        "directory already exists: '%s'", file.getPath());
        file.mkdirs();
        return new HgkvDirImpl(path);
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
            this.preStatusInput.close();
            this.preValueInput.close();
            this.preStatusFile.delete();
            this.preValueFile.delete();
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
            this.preValueInput.close();
            this.preStatusFile.delete();
            this.preValueFile.delete();
        }
        this.curStatusOutput.close();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
        assert this.preStatusFile == this.curStatusFile;
        assert this.preValueFile == this.curValueFile;
        this.preStatusFile.delete();
        this.preValueFile.delete();

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
        assert this.preValueFile == this.curValueFile;
        this.preStatusFile.delete();
        this.preValueFile.delete();

        this.vertexFile.delete();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
        this.preValueFile.delete();

        this.vertexFile.delete();
        this.edgeFile.delete();
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java

        this.vertexFile.delete();
        this.edgeFile.delete();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java

    private static void createFile(File file) throws IOException {
        file.getParentFile().mkdirs();
        E.checkArgument(file.createNewFile(), "Already exists file: %s", file);
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/receiver/MessageRecvPartitions.java`
#### Snippet
```java
        P partition = this.partition(partitionId);
        String path = partition.genOutputPath();
        new File(path).getParentFile().mkdirs();
        return path;
    }
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/TaskManager.java`
#### Snippet
```java
        try {
            this.batchService.shutdown();
            this.batchService.awaitTermination(timeout, TimeUnit.SECONDS);
            LOG.info("The batch-mode tasks service executor shutdown");
        } catch (InterruptedException e) {
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/TaskManager.java`
#### Snippet
```java
        try {
            this.singleService.shutdown();
            this.singleService.awaitTermination(timeout, TimeUnit.SECONDS);
            LOG.info("The single-mode tasks service executor shutdown");
        } catch (InterruptedException e) {
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/ReceiverUtil.java`
#### Snippet
```java

        entryOutput.writeEntry(out -> {
            id.write(out);
        }, message);
        return bytesOutput.toByteArray();
```

### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/edge/EdgeMessageRecvPartitionTest.java`
#### Snippet
```java
        Id id = vertex.id();
        KvEntryWriter subKvWriter = entryOutput.writeEntry(out -> {
            id.write(out);
        });
        for (Edge edge : vertex.edges()) {
```

### FunctionalExpressionCanBeFolded
Lambda can be replaced with call qualifier
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/receiver/edge/EdgeMessageRecvPartitionTest.java`
#### Snippet
```java
            Id targetId = edge.targetId();
            subKvWriter.writeSubKv(out -> {
                targetId.write(out);
            }, out -> {
                edge.properties().write(out);
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.hugegraph.computer.dist.HugeGraphComputerTest.existError(java.lang.Throwable\[\])' accessed via instance reference
in `computer-test/src/main/java/org/apache/hugegraph/computer/dist/HugeGraphComputerTest.java`
#### Snippet
```java

        Assert.assertFalse(Arrays.asList(exceptions).toString(),
                           this.existError(exceptions));
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `readFully()` is identical to its super method
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/AbstractBufferedFileInput.java`
#### Snippet
```java

    @Override
    public void readFully(byte[] b) throws IOException {
        this.readFully(b, 0, b.length);
    }
```

### RedundantMethodOverride
Method `init()` is identical to its super method
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sort/sorting/SortManager.java`
#### Snippet
```java

    @Override
    public void init(Config config) {
        // pass
    }
```

### RedundantMethodOverride
Method `min()` is identical to its super method
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvDirImpl.java`
#### Snippet
```java

    @Override
    public byte[] min() {
        return this.min;
    }
```

### RedundantMethodOverride
Method `max()` is identical to its super method
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/hgkvfile/HgkvDirImpl.java`
#### Snippet
```java

    @Override
    public byte[] max() {
        return this.max;
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sender/MessageSendManager.java`
#### Snippet
```java

    @Override
    public void close(Config config) {
        // pass
    }
```

### RedundantMethodOverride
Method `category()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/community/cc/ClusteringCoefficient.java`
#### Snippet
```java

    @Override
    public String category() {
        return "community";
    }
```

### RedundantMethodOverride
Method `beforeSuperstep()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/degree/DegreeCentrality.java`
#### Snippet
```java

    @Override
    public void beforeSuperstep(WorkerContext context) {
        // pass
    }
```

### RedundantMethodOverride
Method `afterSuperstep()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/degree/DegreeCentrality.java`
#### Snippet
```java

    @Override
    public void afterSuperstep(WorkerContext context) {
        // pass
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/degree/DegreeCentrality.java`
#### Snippet
```java

    @Override
    public void close(Config config) {
        // pass
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/pagerank/PageRank.java`
#### Snippet
```java

    @Override
    public void close(Config config) {
        // pass
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/closeness/ClosenessCentrality.java`
#### Snippet
```java

    @Override
    public void close(Config config) {
        // pass
    }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/betweenness/BetweennessCentrality.java`
#### Snippet
```java

    @Override
    public void close(Config config) {
        // pass
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
i \* 4: integer multiplication implicitly cast to long
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/BufferedFileTest.java`
#### Snippet
```java
                }
                for (int i = size; i >= 0; i--) {
                    output.seek(i * 4);
                    output.writeInt(size - i);
                }
```

### IntegerMultiplicationImplicitCastToLong
this.config.get(ComputerOptions.TRANSPORT_SYNC_REQUEST_TIMEOUT) \* this.config.get(Com...: integer multiplication implicitly cast to long
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/TransportConf.java`
#### Snippet
```java
                       ComputerOptions.TRANSPORT_FINISH_SESSION_TIMEOUT);
        return timeout > 0 ? timeout :
               this.config.get(ComputerOptions.TRANSPORT_SYNC_REQUEST_TIMEOUT) *
               this.config.get(ComputerOptions.TRANSPORT_MAX_PENDING_REQUESTS);
    }

```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileInputStream' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/k8s/KubernetesDriverTest.java`
#### Snippet
```java
        downloadFileByUrl(url, path);

        InputStream inputStream = new FileInputStream(path);
        Assert.assertThrows(ComputerDriverException.class, () -> {
            this.driver.uploadAlgorithmJar("PageRank", inputStream);
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/StreamGraphOutputInputTest.java`
#### Snippet
```java

    private static byte[] reweaveBytes(byte[] oldBytes) throws IOException {
        BytesOutput bytesOutput = IOFactory.createBytesOutput(oldBytes.length);
        BytesInput bytesInput = IOFactory.createBytesInput(oldBytes);

```

### AutoCloseableResource
'BytesInput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/StreamGraphOutputInputTest.java`
#### Snippet
```java
    private static byte[] reweaveBytes(byte[] oldBytes) throws IOException {
        BytesOutput bytesOutput = IOFactory.createBytesOutput(oldBytes.length);
        BytesInput bytesInput = IOFactory.createBytesInput(oldBytes);

        // key length
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/io/StructRandomAccessOutputTest.java`
#### Snippet
```java

    private static UnsafeBytesInput inputByString(String s) throws IOException {
        BytesOutput output = IOFactory.createBytesOutput(
                             Constants.SMALL_BUF_SIZE);
        output.writeBytes(s);
```

### AutoCloseableResource
'BytesInput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/SorterTestUtil.java`
#### Snippet
```java
                                             throws IOException {
        byte[] buffer = output.buffer();
        BytesInput input = IOFactory.createBytesInput(buffer);
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            input.readInt();
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/sorter/SortLargeDataTest.java`
#### Snippet
```java
        long entrySize = 0L;
        for (String file : files) {
            HgkvDir dir = HgkvDirImpl.open(file);
            entrySize += dir.numEntries();
        }
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/sorter/SortLargeDataTest.java`
#### Snippet
```java
        int mergeTotal = 0;
        for (String output : outputs) {
            mergeTotal += HgkvDirImpl.open(output).numEntries();
        }
        Assert.assertEquals(total, mergeTotal);
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/sorter/SorterTest.java`
#### Snippet
```java

        // Assert file properties
        HgkvDir dir = HgkvDirImpl.open(outputFile);
        Assert.assertEquals(5, dir.numEntries());
        Assert.assertEquals(8, dir.numSubEntries());
```

### AutoCloseableResource
'HgkvFile' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvFileTest.java`
#### Snippet
```java
        File tempFile = new File(StoreTestUtil.availablePathById("2"));
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            HgkvFileImpl.open(tempFile);
        }, e -> {
            Assert.assertContains("file does not exists", e.getMessage());
```

### AutoCloseableResource
'HgkvFile' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvFileTest.java`
#### Snippet
```java
        File file = StoreTestUtil.mapToHgkvFile(CONFIG, data, filePath);
        // Open file
        HgkvFile hgkvFile = HgkvFileImpl.open(file.getPath());
        // Assert magic
        Assert.assertEquals(HgkvFileImpl.MAGIC, hgkvFile.magic());
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java

            // Open the file and determine the footer is as expected
            HgkvDir dir = HgkvDirImpl.open(path);
            Assert.assertEquals(HgkvFileImpl.MAGIC, dir.magic());
            String version = HgkvDirImpl.MAJOR_VERSION + "." +
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
        file.createNewFile();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            HgkvDirImpl.open(file.getPath());
        }, e -> {
            Assert.assertContains("because it's not a directory",
```

### AutoCloseableResource
'HgkvDir' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/HgkvDirTest.java`
#### Snippet
```java
        // Open not exists file
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            HgkvDirImpl.open(file.getPath());
        }, e -> {
            Assert.assertContains("because it does not exists",
```

### AutoCloseableResource
'BytesInput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/StoreTestUtil.java`
#### Snippet
```java

    public static int byteArrayToInt(byte[] bytes) throws IOException {
        return IOFactory.createBytesInput(bytes).readInt();
    }

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/StoreTestUtil.java`
#### Snippet
```java

    public static byte[] intToByteArray(int data) throws IOException {
        BytesOutput output = IOFactory.createBytesOutput(
                             Constants.SMALL_BUF_SIZE);
        output.writeInt(data);
```

### AutoCloseableResource
'ValueFileOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/ValueFileTest.java`
#### Snippet
```java
            }
            Assert.assertThrows(IllegalArgumentException.class, () -> {
                new ValueFileOutput(CONFIG, dir, 1);
            }, e -> {
                Assert.assertContains("bufferCapacity must be >= 8",
```

### AutoCloseableResource
'ValueFileInput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/store/ValueFileTest.java`
#### Snippet
```java
            }
            Assert.assertThrows(IllegalArgumentException.class, () -> {
                new ValueFileInput(CONFIG, dir, 1);
            }, e -> {
                Assert.assertContains("The parameter bufferSize must be >= 8",
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java

        buffer.writeMessage(BytesId.of(1L), new DoubleValue(0.85D));
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java

        buffer.writeMessage(BytesId.of(2L), new DoubleValue(0.15D));
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);
    }
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
                                                  new DoubleValue(0.5d));
        buffer.writeVertex(vertex);
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        vertex.properties(properties);
        buffer.writeVertex(vertex);
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
                                               BytesId.of(4L)));
        buffer.writeEdges(vertex);
        long position3 = buffer.output().position();
        Assert.assertGt(position2, position3);
    }
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        buffer = new WriteBuffer(ComputerContext.instance(), 100, 110);
        buffer.writeEdges(vertex);
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        buffer = new WriteBuffer(ComputerContext.instance(), 100, 110);
        buffer.writeEdges(vertex);
        long position2 = buffer.output().position();
        Assert.assertGte(position1, position2);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBufferTest.java`
#### Snippet
```java
        buffer = new WriteBuffer(ComputerContext.instance(), 100, 110);
        buffer.writeEdges(vertex);
        long position3 = buffer.output().position();
        Assert.assertGte(position2, position3);
    }
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java

        buffers.writeMessage(BytesId.of(1L), new DoubleValue(0.85D));
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java

        buffers.writeMessage(BytesId.of(2L), new DoubleValue(0.15D));
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);
    }
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/compute/input/ResuablePointerTest.java`
#### Snippet
```java
    @Test
    public void testReadWrite() throws IOException {
        BytesOutput output1 = IOFactory.createBytesOutput(100);
        long position = output1.position();
        output1.writeFixedInt(0);
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
        WriteBuffer buffer = Whitebox.getInternalState(buffers,
                                                       "writingBuffer");
        long position1 = buffer.output().position();
        Assert.assertGt(0L, position1);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
        buffers.writeVertex(vertex);
        buffer = Whitebox.getInternalState(buffers, "writingBuffer");
        long position2 = buffer.output().position();
        Assert.assertGt(position1, position2);

```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
        buffers.writeEdges(vertex);
        buffer = Whitebox.getInternalState(buffers, "writingBuffer");
        long position3 = buffer.output().position();
        Assert.assertGt(position2, position3);
    }
```

### AutoCloseableResource
'MockWorkerService' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/worker/WorkerServiceTest.java`
#### Snippet
```java
            MockComputation.class.getName()
        );
        WorkerService workerService = new MockWorkerService();
        Assert.assertThrows(ComputerException.class, () -> {
            workerService.init(config);
```

### AutoCloseableResource
'RecyclerReference' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/allocator/DefaultAllocatorTest.java`
#### Snippet
```java
                                    new RecyclerReference[maxCapacity * 3];
        for (int i = 0; i < references.length; i++) {
            references[i] = allocator.newVertex();
        }

```

### AutoCloseableResource
'RecyclerReference' used without 'try'-with-resources statement
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/allocator/DefaultAllocatorTest.java`
#### Snippet
```java
                throws InterruptedException {
        Allocator allocator = context().allocator();
        RecyclerReference<Vertex> reference1 = allocator.newVertex();

        Thread thread1 = new Thread(() -> allocator.freeVertex(reference1));
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
        long high = value.getMostSignificantBits();
        long low = value.getLeastSignificantBits();
        BytesOutput output = IOFactory.createBytesOutput(16);
        try {
            output.writeLong(high);
```

### AutoCloseableResource
'BytesInput' used without 'try'-with-resources statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
        switch (this.idType) {
            case LONG:
                BytesInput input = IOFactory.createBytesInput(this.bytes, 0,
                                                              this.length);
                try {
```

### AutoCloseableResource
'BytesInput' used without 'try'-with-resources statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java
                return CoderUtil.decode(this.bytes, 0, this.length);
            case UUID:
                input = IOFactory.createBytesInput(this.bytes, 0, this.length);
                try {
                    long high = input.readLong();
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesId.java`
#### Snippet
```java

    public static BytesId of(long value) {
        BytesOutput output = IOFactory.createBytesOutput(9);
        try {
            output.writeLong(value);
```

### AutoCloseableResource
'BytesOutput' used without 'try'-with-resources statement
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffers.java`
#### Snippet
```java

    public synchronized RandomAccessInput wrapForRead() {
        BytesOutput output = this.sortingBuffer.output();
        return IOFactory.createBytesInput(output.buffer(),
                                          (int) output.position());
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj == INSTANCE' covered by subsequent condition 'obj instanceof NullValue'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/graph/value/NullValue.java`
#### Snippet
```java
    @Override
    public boolean equals(Object obj) {
        return obj == INSTANCE || obj instanceof NullValue;
    }

```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Test class `InputsSortingTest` is not constructable because it should have exactly one 'public' no-arg constructor
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/sorting/InputsSortingTest.java`
#### Snippet
```java
import org.junit.Test;

public class InputsSortingTest {
    
    private final SortingMode mode;
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `bytes[count - 1]` to `int` is redundant
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/util/CoderUtil.java`
#### Snippet
```java
                                  "Malformed input: partial character at end");
                    }
                    char2 = (int) bytes[count - 1];
                    if ((char2 & 0xC0) != 0x80) {
                        throw new ComputerException(
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/seqfile/BitsFileWriter.java`
#### Snippet
```java
     * Use 1 long store 64 booleans, write from low to high.
     * @param value boolean data
     * @throws IOException
     */
    void writeBoolean(boolean value) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/file/seqfile/BitsFileWriter.java`
#### Snippet
```java
     * This method will write the buffer to the file, but the part of written
     * not enough 64 times will not be written to the file.
     * @throws IOException
     */
    void flush() throws IOException;
```

### JavadocDeclaration
`@param channel` tag description is missing
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/buffer/FileRegionBuffer.java`
#### Snippet
```java
    /**
     * Use zero-copy transform from socket channel to file
     * @param channel
     * @param targetPath
     * @return channelFuture
```

### JavadocDeclaration
`@param targetPath` tag description is missing
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/network/buffer/FileRegionBuffer.java`
#### Snippet
```java
     * Use zero-copy transform from socket channel to file
     * @param channel
     * @param targetPath
     * @return channelFuture
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/io/RandomAccessInput.java`
#### Snippet
```java
    /**
     * @return The total bytes size unread.
     * @throws IOException
     */
    long available() throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/io/RandomAccessInput.java`
#### Snippet
```java
    /**
     * @return Read the byte array of size length from the current position
     * @throws IOException
     */
    default byte[] readBytes(int size) throws IOException {
```

### JavadocDeclaration
Duplicate @return tag
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/combiner/Combiner.java`
#### Snippet
```java
    /**
     * @return The name of the combiner.
     * @return class name by default.
     */
    default String name() {
```

### JavadocDeclaration
`@param params` tag description is missing
in `computer-api/src/main/java/org/apache/hugegraph/computer/algorithm/AlgorithmParams.java`
#### Snippet
```java
    /**
     * set algorithm's specific configuration
     * @param params
     */
    void setAlgorithmParameters(Map<String, String> params);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `executorService` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdBspTest.java`
#### Snippet
```java
    private ContainerInfo masterInfo;
    private ContainerInfo workerInfo;
    private ExecutorService executorService = Executors.newFixedThreadPool(2);
    private int maxSuperStep;

```

### FieldMayBeFinal
Field `KEY2` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String KEY_PREFIX = "/key";
    private static String KEY1 = "/key1";
    private static String KEY2 = "/key2";
    private static String NO_SUCH_KEY = "/no-such-key";
    private static byte[] VALUE1 = "value1".getBytes(StandardCharsets.UTF_8);
```

### FieldMayBeFinal
Field `VALUE1` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String KEY2 = "/key2";
    private static String NO_SUCH_KEY = "/no-such-key";
    private static byte[] VALUE1 = "value1".getBytes(StandardCharsets.UTF_8);
    private static byte[] VALUE2 = "value2".getBytes(StandardCharsets.UTF_8);

```

### FieldMayBeFinal
Field `KEY_PREFIX` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String ENDPOINTS = "http://localhost:2579";
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
    private static String KEY1 = "/key1";
    private static String KEY2 = "/key2";
```

### FieldMayBeFinal
Field `VALUE2` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String NO_SUCH_KEY = "/no-such-key";
    private static byte[] VALUE1 = "value1".getBytes(StandardCharsets.UTF_8);
    private static byte[] VALUE2 = "value2".getBytes(StandardCharsets.UTF_8);

    private EtcdClient client;
```

### FieldMayBeFinal
Field `KEY1` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
    private static String KEY1 = "/key1";
    private static String KEY2 = "/key2";
    private static String NO_SUCH_KEY = "/no-such-key";
```

### FieldMayBeFinal
Field `NAMESPACE` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java

    private static String ENDPOINTS = "http://localhost:2579";
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
    private static String KEY1 = "/key1";
```

### FieldMayBeFinal
Field `NO_SUCH_KEY` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    private static String KEY1 = "/key1";
    private static String KEY2 = "/key2";
    private static String NO_SUCH_KEY = "/no-such-key";
    private static byte[] VALUE1 = "value1".getBytes(StandardCharsets.UTF_8);
    private static byte[] VALUE2 = "value2".getBytes(StandardCharsets.UTF_8);
```

### FieldMayBeFinal
Field `ENDPOINTS` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
public class EtcdClientTest {

    private static String ENDPOINTS = "http://localhost:2579";
    private static String NAMESPACE = "test_job_0001";
    private static String KEY_PREFIX = "/key";
```

### FieldMayBeFinal
Field `connectionId` may be 'final'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/MockTransportClient.java`
#### Snippet
```java
public class MockTransportClient implements TransportClient {

    private ConnectionId connectionId;

    public MockTransportClient() {
```

### FieldMayBeFinal
Field `code` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/BspEvent.java`
#### Snippet
```java
    BSP_WORKER_CLOSE_DONE(14, "/worker/close_done");

    private byte code;
    private String key;

```

### FieldMayBeFinal
Field `key` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/BspEvent.java`
#### Snippet
```java

    private byte code;
    private String key;

    BspEvent(int code, String key) {
```

### FieldMayBeFinal
Field `sequence` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/FileManager.java`
#### Snippet
```java

    private List<String> dirs;
    private AtomicInteger sequence;

    public FileManager() {
```

### FieldMayBeFinal
Field `dirs` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/store/FileManager.java`
#### Snippet
```java
    public static final String NAME = "data_dir";

    private List<String> dirs;
    private AtomicInteger sequence;

```

### FieldMayBeFinal
Field `shutdownHook` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/master/MasterService.java`
#### Snippet
```java
    private MasterComputation masterComputation;

    private volatile ShutdownHook shutdownHook;
    private volatile Thread serviceThread;

```

### FieldMayBeFinal
Field `vidPointer` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/input/MessageInput.java`
#### Snippet
```java
        // It indicates whether the value can be returned to client.
        private boolean valueValid;
        private ReusablePointer vidPointer;

        private MessageIterator(ReusablePointer vidPointer) {
```

### FieldMayBeFinal
Field `shutdownHook` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/worker/WorkerService.java`
#### Snippet
```java
    private ContainerInfo masterInfo;

    private volatile ShutdownHook shutdownHook;
    private volatile Thread serviceThread;

```

### FieldMayBeFinal
Field `handle` may be 'final'
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/allocator/RecycleHandler.java`
#### Snippet
```java
       implements RecyclerReference.Handle<RecyclerReference<T>> {

    private Recycler.Handle<RecyclerReference<T>> handle;

    public RecycleHandler(Recycler.Handle<RecyclerReference<T>> handle) {
```

### FieldMayBeFinal
Field `summary` may be 'final'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/InsertTask.java`
#### Snippet
```java
    private HugeClient client;
    protected final List<Vertex> batch;
    private LoadSummary summary;

    public InsertTask(Config config, HugeClient client,
```

### FieldMayBeFinal
Field `client` may be 'final'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/InsertTask.java`
#### Snippet
```java

    protected Config config;
    private HugeClient client;
    protected final List<Vertex> batch;
    private LoadSummary summary;
```

### FieldMayBeFinal
Field `config` may be 'final'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/TaskManager.java`
#### Snippet
```java

    private HugeClient client;
    private Config config;

    private final Semaphore batchSemaphore;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/TaskManager.java`
#### Snippet
```java
    public static final String SINGLE_WORKER = "single-worker-%d";

    private HugeClient client;
    private Config config;

```

### FieldMayBeFinal
Field `loadSummary` may be 'final'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/output/hg/task/TaskManager.java`
#### Snippet
```java
    private final ExecutorService singleService;

    private LoadSummary loadSummary;

    public TaskManager(Config config) {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `entries` are queried, but never updated
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sort/sorter/FlusherTest.java`
#### Snippet
```java
                             Constants.SMALL_BUF_SIZE);
        InnerSortFlusher flusher = new KvInnerSortFlusher(output);
        List<KvEntry> entries = new ArrayList<>();

        Assert.assertThrows(IllegalArgumentException.class, () -> {
```

### MismatchedCollectionQueryUpdate
Contents of collection `workers` are updated, but never queried
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/worker/WorkerService.java`
#### Snippet
```java
    private final ComputerContext context;
    private final Managers managers;
    private final Map<Integer, ContainerInfo> workers;

    private volatile boolean inited;
```

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesIdTest.java`
#### Snippet
```java
        Assert.assertEquals(2, longId2.length());

        Assert.assertEquals(new Long(123L), longId1.asObject());
        Assert.assertEquals(123L, longId1.asObject());

```

### CachedNumberConstructorCall
Number constructor call with primitive argument
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/id/BytesIdTest.java`
#### Snippet
```java
        Assert.assertEquals(123L, longId1.asObject());

        Assert.assertEquals(new Long(-100L), longId5.asObject());
        Assert.assertEquals(-100L, longId5.asObject());

```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(char3 & 0x3F) << 0` can be replaced with '(char3 \& 0x3F)'
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/util/CoderUtil.java`
#### Snippet
```java
                    chars[charIndex++] = (char) (((c & 0x0F) << 12) |
                                                 ((char2 & 0x3F) << 6) |
                                                 ((char3 & 0x3F) << 0));
                    break;
                default:
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `aggr`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/aggregator/MasterAggrManager.java`
#### Snippet
```java
                                                          V value) {
            Aggregator<V> aggr = this.getAggregator(name);
            synchronized (aggr) {
                aggr.aggregateValue(value);
            }
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `aggr`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/aggregator/WorkerAggrManager.java`
#### Snippet
```java
                                                             this.service());
        // May be executed in parallel by multiple threads in a worker
        synchronized (aggr) {
            aggr.aggregateValue(value);
        }
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/sender/WriteBuffersTest.java`
#### Snippet
```java
            while (counter.get() < 2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Assert.fail(e.getMessage());
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/worker/FilterComputation.java`
#### Snippet
```java
    default void compute0(ComputationContext context, Vertex vertex) {
        M result = this.initialValue(context, vertex);
        this.compute(context, vertex, Arrays.asList(result).iterator());
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `computer-api/src/main/java/org/apache/hugegraph/computer/core/worker/ReduceComputation.java`
#### Snippet
```java
    default void compute0(ComputationContext context, Vertex vertex) {
        M result = this.initialValue(context, vertex);
        this.compute(context, vertex, Arrays.asList(result).iterator());
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `workerService` initializer `null` is redundant
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/AlgorithmTestBase.java`
#### Snippet
```java
        Set<WorkerService> workerServices = Sets.newConcurrentHashSet();
        pool.submit(() -> {
            WorkerService workerService = null;
            try {
                Map<String, String> params = new HashMap<>();
```

### UnusedAssignment
Variable `masterService` initializer `null` is redundant
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/AlgorithmTestBase.java`
#### Snippet
```java

        pool.submit(() -> {
            MasterService masterService = null;
            try {
                Map<String, String> params = new HashMap<>();
```

### UnusedAssignment
Variable `mergeFileNum` initializer `this.mergeFileNum` is redundant
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/receiver/MessageRecvPartition.java`
#### Snippet
```java
         *  after add Sorter#iterator() of subkv
         */
        int mergeFileNum = this.mergeFileNum;
        mergeFileNum = 1;
        List<String> newOutputs = this.genOutputFileNames(mergeFileNum);
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/BooleanValueTest.java`
#### Snippet
```java

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/LongValueTest.java`
#### Snippet
```java
        Assert.assertFalse(value1.equals(new LongValue(1L)));
        Assert.assertFalse(value1.equals(new FloatValue(1f)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/NullValueTest.java`
#### Snippet
```java

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `intValue1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/IntValueTest.java`
#### Snippet
```java
        Assert.assertFalse(intValue1.equals(new IntValue(1)));
        Assert.assertFalse(intValue1.equals(new FloatValue(1f)));
        Assert.assertFalse(intValue1.equals(null));
    }

```

### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/DoubleValueTest.java`
#### Snippet
```java
        Assert.assertFalse(value1.equals(new DoubleValue(1)));
        Assert.assertFalse(value1.equals(new DoubleValue(1.0d)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/FloatValueTest.java`
#### Snippet
```java

        Assert.assertFalse(value1.equals(new IntValue(0)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `value1.equals(null)` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/graph/value/ListValueTest.java`
#### Snippet
```java

        Assert.assertFalse(value1.equals(new IntValue(1)));
        Assert.assertFalse(value1.equals(null));
    }

```

### ConstantValue
Result of `messages.hasNext()` is always 'true'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/compute/MockComputation.java`
#### Snippet
```java
        IdListList value = vertex.value();
        while (messages.hasNext()) {
            Assert.assertTrue(messages.hasNext());
            value.add(messages.next().copy());
        }
```

### ConstantValue
Result of `messages.hasNext()` is always 'false'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/compute/MockComputation.java`
#### Snippet
```java
            value.add(messages.next().copy());
        }
        Assert.assertFalse(messages.hasNext());
        if (RANDOM.nextInt() % 10 == 0) {
            vertex.inactivate();
```

### ConstantValue
Value `type` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/worker/MockMasterComputation.java`
#### Snippet
```java
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            ValueType type = null;
            context.registerAggregator(AGGR_INT_UNSTABLE, type,
                                       IntValueSumCombiner.class);
        }, e -> {
```

### ConstantValue
Value `value` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/worker/MockMasterComputation.java`
#### Snippet
```java
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            IntValue value = null;
            context.registerAggregator(AGGR_INT_UNSTABLE, value,
                                       IntValueSumCombiner.class);
        }, e -> {
```

### ConstantValue
Result of `TransportUtil.remoteConnectionId(channel)` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
    public void testRemoteConnectionIDWithNull() {
        Channel channel = null;
        ConnectionId connectionId = TransportUtil.remoteConnectionId(channel);
        Assert.assertNull(connectionId);

```

### ConstantValue
Value `channel` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
    public void testRemoteConnectionIDWithNull() {
        Channel channel = null;
        ConnectionId connectionId = TransportUtil.remoteConnectionId(channel);
        Assert.assertNull(connectionId);

```

### ConstantValue
Value `connectionId` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
        Channel channel = null;
        ConnectionId connectionId = TransportUtil.remoteConnectionId(channel);
        Assert.assertNull(connectionId);

        Channel channel2 = new EmbeddedChannel();
```

### ConstantValue
Result of `TransportUtil.remoteAddress(channel)` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
    public void testRemoteAddressWithNull() {
        Channel channel = null;
        String address = TransportUtil.remoteAddress(channel);
        Assert.assertNull(address);

```

### ConstantValue
Value `channel` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
    public void testRemoteAddressWithNull() {
        Channel channel = null;
        String address = TransportUtil.remoteAddress(channel);
        Assert.assertNull(address);

```

### ConstantValue
Value `address` is always 'null'
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/network/TransportUtilTest.java`
#### Snippet
```java
        Channel channel = null;
        String address = TransportUtil.remoteAddress(channel);
        Assert.assertNull(address);

        Channel channel2 = new EmbeddedChannel();
```

### ConstantValue
Condition `leading != 0x80` is always `true`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
#### Snippet
```java
    private long readVLong() throws IOException {
        byte leading = this.readByte();
        E.checkArgument(leading != 0x80,
                        "Unexpected varlong with leading byte '0x%s'",
                        Bytes.toHex(leading));
```

### ConstantValue
Condition `(leading & 0x80) == 0` is always `true`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
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
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
#### Snippet
```java
    private int readVInt() throws IOException {
        byte leading = this.readByte();
        E.checkArgument(leading != 0x80,
                        "Unexpected varint with leading byte '0x%s'",
                        Bytes.toHex(leading));
```

### ConstantValue
Condition `(leading & 0x80) == 0` is always `true`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/io/OptimizedBytesInput.java`
#### Snippet
```java
        int value = leading & 0x7f;
        if (leading >= 0) {
            assert (leading & 0x80) == 0;
            return value;
        }
```

### ConstantValue
Condition `matched == 0` is always `true`
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/compute/FileGraphPartition.java`
#### Snippet
```java
                continue;
            }
            assert matched == 0;
            edgeOut.writeFixedInt(vidBytes.length);
            edgeOut.write(vidBytes);
```

### ConstantValue
Condition `superstep > 2` is always `true`
in `computer-algorithm/src/main/java/org/apache/hugegraph/computer/algorithm/community/kcore/Kcore.java`
#### Snippet
```java
        } else {
            // Do wcc
            assert superstep > 2;
            Id message = Combiner.combineAll(context.combiner(), messages);
            if (value.core().compareTo(message) > 0) {
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
    public void testGetWithRevision()
                throws ExecutionException, InterruptedException {
        KV kv = this.client.getKv();
        ByteSequence key1Seq = ByteSequence.from(KEY1, StandardCharsets.UTF_8);
        ByteSequence value1Seq = ByteSequence.from(VALUE1);
```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        ByteSequence value1Seq = ByteSequence.from(VALUE1);
        ByteSequence value2Seq = ByteSequence.from(VALUE2);
        PutResponse putResponse1 = kv.put(key1Seq, value1Seq).get();
        long revision1 = putResponse1.getHeader().getRevision();
        PutResponse putResponse2 = kv.put(key1Seq, value2Seq).get();
```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        PutResponse putResponse1 = kv.put(key1Seq, value1Seq).get();
        long revision1 = putResponse1.getHeader().getRevision();
        PutResponse putResponse2 = kv.put(key1Seq, value2Seq).get();
        long revision2 = putResponse2.getHeader().getRevision();
        long deleteCount1 = kv.delete(ByteSequence.from(KEY1,
```

### UnstableApiUsage
'delete(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        PutResponse putResponse2 = kv.put(key1Seq, value2Seq).get();
        long revision2 = putResponse2.getHeader().getRevision();
        long deleteCount1 = kv.delete(ByteSequence.from(KEY1,
                                                        StandardCharsets.UTF_8))
                              .get().getDeleted();
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        GetOption getOption1 = GetOption.newBuilder().withRevision(revision1)
                                        .build();
        GetResponse getResponse1 = kv.get(key1Seq, getOption1).get();
        Assert.assertEquals(value1Seq,
                            getResponse1.getKvs().get(0).getValue());
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClientTest.java`
#### Snippet
```java
        GetOption getOption2 = GetOption.newBuilder().withRevision(revision2)
                                        .build();
        GetResponse getResponse2 = kv.get(key1Seq, getOption2).get();
        Assert.assertEquals(value2Seq,
                            getResponse2.getKvs().get(0).getValue());
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `computer-test/src/main/java/org/apache/hugegraph/computer/algorithm/centrality/degree/DegreeCentralityTest.java`
#### Snippet
```java
            } else {
                Iterator<Edge> edges = vertex.edges().iterator();
                double totalValue = Streams.stream(edges).map(
                        (edge) -> {
                            DoubleValue weightValue = edge.property(this.weight);
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        try {
            ByteSequence keySeq = ByteSequence.from(key, ENCODING);
            GetResponse response = this.kv.get(keySeq).get();
            if (response.getCount() > 0) {
                List<KeyValue> kvs = response.getKvs();
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        ByteSequence keySeq = ByteSequence.from(key, ENCODING);
        try {
            DeleteResponse response = this.client.getKVClient().delete(keySeq)
                                                 .get();
            return response.getDeleted();
```

### UnstableApiUsage
'delete(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        ByteSequence keySeq = ByteSequence.from(key, ENCODING);
        try {
            DeleteResponse response = this.client.getKVClient().delete(keySeq)
                                                 .get();
            return response.getDeleted();
```

### UnstableApiUsage
'put(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                        "The value can't be null.");
        try {
            this.kv.put(ByteSequence.from(key, ENCODING),
                        ByteSequence.from(value))
                   .get();
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                                           .withSortOrder(SortOrder.ASCEND)
                                           .build();
            GetResponse response = this.kv.get(prefixSeq, getOption).get();
            if (response.getCount() == count) {
                return getResponseValues(response);
```

### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java

    @VisibleForTesting
    protected KV getKv() {
        return this.kv;
    }
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                                       .build();
        try {
            GetResponse response = this.kv.get(prefixSeq, getOption).get();
            if (response.getCount() == count) {
                return getResponseValues(response);
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        ByteSequence keySeq = ByteSequence.from(key, ENCODING);
        try {
            GetResponse response = this.kv.get(keySeq).get();
            if (response.getCount() > 0) {
                List<KeyValue> kvs = response.getKvs();
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                                                .withPrefix(prefixSeq).build();
        try {
            DeleteResponse response = this.client.getKVClient()
                                                 .delete(prefixSeq,
                                                         deleteOption)
```

### UnstableApiUsage
'delete(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.DeleteOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
        try {
            DeleteResponse response = this.client.getKVClient()
                                                 .delete(prefixSeq,
                                                         deleteOption)
                                                 .get();
```

### UnstableApiUsage
'getKVClient()' is unstable because its signature references unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                            .namespace(namespaceSeq).build();
        this.watch = this.client.getWatchClient();
        this.kv = this.client.getKVClient();
    }

```

### UnstableApiUsage
'io.etcd.jetcd.KV' is marked unstable with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
    private final Client client;
    private final Watch watch;
    private final KV kv;

    public EtcdClient(String endpoints, String namespace) {
```

### UnstableApiUsage
'get(io.etcd.jetcd.ByteSequence, io.etcd.jetcd.options.GetOption)' is declared in unstable interface 'io.etcd.jetcd.KV' marked with @Beta
in `computer-core/src/main/java/org/apache/hugegraph/computer/core/bsp/EtcdClient.java`
#### Snippet
```java
                                           .withSortOrder(SortOrder.ASCEND)
                                           .build();
            GetResponse response = this.kv.get(prefixSeq, getOption).get();
            if (response.getCount() > 0) {
                return getResponseValues(response);
```

