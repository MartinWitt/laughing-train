# flink-ml 
 
# Bad smells
I found 405 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 101 | false |
| UNCHECKED_WARNING | 80 | false |
| DuplicatedCode | 49 | false |
| ConstantValue | 28 | false |
| DataFlowIssue | 27 | false |
| JavadocLinkAsPlainText | 21 | false |
| NullableProblems | 18 | false |
| FieldMayBeFinal | 13 | false |
| ProtectedMemberInFinalClass | 12 | true |
| RedundantCast | 9 | false |
| OptionalGetWithoutIsPresent | 8 | false |
| UnnecessaryToStringCall | 4 | true |
| ArraysAsListWithZeroOrOneArgument | 4 | false |
| RefusedBequest | 3 | false |
| MismatchedJavadocCode | 3 | false |
| UnnecessarySemicolon | 2 | false |
| TypeParameterHidesVisibleType | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| SuspiciousToArrayCall | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| MismatchedArrayReadWrite | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| EmptyStatementBody | 1 | false |
| IOStreamConstructor | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| TrivialIf | 1 | false |
| RedundantStreamOptionalCall | 1 | false |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| SlowListContainsAll | 1 | false |
| UnnecessaryContinue | 1 | false |
| BusyWait | 1 | false |
| NumericOverflow | 1 | false |
## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `curAggregatedArrayChunk` are written to, but never read
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/AllReduceImpl.java`
#### Snippet
```java
                    throw new RuntimeException("The input double array must have same length.");
                }
                double[] curAggregatedArrayChunk = aggregatedArrayChunkByChunkId.get(chunkId).f1;
                for (int i = 0; i < curAggregatedArrayChunk.length; i++) {
                    curAggregatedArrayChunk[i] += arrayChunk[i];
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'WrapperOperatorFactory(StreamOperatorFactory, OperatorWrapper\>)' as a member of raw type 'org.apache.flink.iteration.operator.WrapperOperatorFactory'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/MultipleInputTransformationTranslator.java`
#### Snippet
```java
                new MultipleInputTransformation<>(
                        draftTransformation.getName(),
                        new WrapperOperatorFactory(
                                draftTransformation.getOperatorFactory(), operatorWrapper),
                        operatorWrapper.getWrappedTypeInfo(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.iteration.operator.OperatorWrapper' to 'org.apache.flink.iteration.operator.OperatorWrapper\>'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                replayedIndices,
                body,
                wrapper,
                true);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.iteration.operator.allround.AllRoundOperatorWrapper' to 'org.apache.flink.iteration.operator.OperatorWrapper\>'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                Collections.emptySet(),
                body,
                new AllRoundOperatorWrapper(),
                false);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
                Object udf = ((AbstractUdfStreamOperator<?, ?>) operator).getUserFunction();
                if (targetInterface.isAssignableFrom(udf.getClass())) {
                    action.accept((T) udf);
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
            DataCacheSnapshot dataCacheSnapshot = null;
            List<StatePartitionStreamProvider> rawStateInputs =
                    IteratorUtils.toList(context.getRawOperatorStateInputs().iterator());
            if (rawStateInputs.size() > 0) {
                checkState(
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.iteration.typeinfo.IterationRecordSerializer' to 'org.apache.flink.iteration.typeinfo.IterationRecordSerializer'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java

            IterationRecordSerializer<T> iterationRecordSerializer =
                    (IterationRecordSerializer)
                            config.getTypeSerializerOut(getClass().getClassLoader());
            typeSerializer = iterationRecordSerializer.getInnerSerializer();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class\>'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordTypeInfo.java`
#### Snippet
```java
    @Override
    public Class<IterationRecord<T>> getTypeClass() {
        return (Class) IterationRecord.class;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.flink.iteration.typeinfo.IterationRecordTypeInfo'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordTypeInfo.java`
#### Snippet
```java
        }

        IterationRecordTypeInfo<T> that = (IterationRecordTypeInfo<T>) o;
        return Objects.equals(innerTypeInfo, that.innerTypeInfo);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasPredictionCol' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasPredictionCol.java`
#### Snippet
```java
    default T setPredictionCol(String value) {
        set(PREDICTION_COL, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasMaxIter' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasMaxIter.java`
#### Snippet
```java
    default T setMaxIter(int value) {
        set(MAX_ITER, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasDistanceMeasure' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasDistanceMeasure.java`
#### Snippet
```java
    default T setDistanceMeasure(String value) {
        set(DISTANCE_MEASURE, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasFeaturesCol' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasFeaturesCol.java`
#### Snippet
```java
    default T setFeaturesCol(String value) {
        set(FEATURES_COL, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasMultiClass' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasMultiClass.java`
#### Snippet
```java
    default T setMultiClass(String value) {
        set(MULTI_CLASS, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasSeed' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasSeed.java`
#### Snippet
```java
    default T setSeed(long value) {
        set(SEED, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasNumFeatures' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasNumFeatures.java`
#### Snippet
```java
    default T setNumFeatures(int value) {
        set(NUM_FEATURES, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.common.param.HasHandleInvalid' to 'T'
in `flink-ml-servable-lib/src/main/java/org/apache/flink/ml/common/param/HasHandleInvalid.java`
#### Snippet
```java
    default T setHandleInvalid(String value) {
        set(HANDLE_INVALID, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                context.getOperatorStateStore()
                        .getListState(new ListStateDescriptor<>("rawStateEpoch", Integer.class));
        List<Integer> rawStateEpochs = IteratorUtils.toList(rawStateEpochState.get().iterator());

        // Notes that the list must be sorted.
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                        .getListState(
                                new ListStateDescriptor<>("pendingEpochs", IntSerializer.INSTANCE));
        List<Integer> pendingEpochs = IteratorUtils.toList(pendingEpochState.get().iterator());

        // Unfortunately, for the raw state we could not call get input stream unless the previous
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
                Object udf = ((AbstractUdfStreamOperator<?, ?>) operator).getUserFunction();
                if (targetInterface.isAssignableFrom(udf.getClass())) {
                    action.accept((T) udf);
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'java.util.Map'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ServableReadWriteUtils.java`
#### Snippet
```java
        Map<String, ?> jsonMap = loadMetadata(path, "");
        if (jsonMap.containsKey("paramMap")) {
            Map<String, Object> paramMap = (Map<String, Object>) jsonMap.get("paramMap");
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                Param<?> param = nameToParam.get(entry.getKey());
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.param.Param\>' to 'org.apache.flink.ml.param.Param'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/WithParams.java`
#### Snippet
```java
        Optional<Param<?>> result =
                getParamMap().keySet().stream().filter(param -> param.name.equals(name)).findAny();
        return (Param<V>) result.orElse(null);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/VectorParam.java`
#### Snippet
```java
    @Override
    public Vector jsonDecode(Object object) {
        Map<String, Object> vecValues = (Map) object;
        if (vecValues.size() == 1) {
            List<Double> list = (List<Double>) vecValues.get("values");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/VectorParam.java`
#### Snippet
```java
        Map<String, Object> vecValues = (Map) object;
        if (vecValues.size() == 1) {
            List<Double> list = (List<Double>) vecValues.get("values");
            double[] values = new double[list.size()];
            for (int i = 0; i < values.length; ++i) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/VectorParam.java`
#### Snippet
```java
            return new DenseVector(values);
        } else if (vecValues.size() == 3) {
            List<Double> valuesList = (List<Double>) vecValues.get("values");
            List<Integer> indicesList = (List<Integer>) vecValues.get("indices");
            int n = (int) vecValues.get("n");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/VectorParam.java`
#### Snippet
```java
        } else if (vecValues.size() == 3) {
            List<Double> valuesList = (List<Double>) vecValues.get("values");
            List<Integer> indicesList = (List<Integer>) vecValues.get("indices");
            int n = (int) vecValues.get("n");
            double[] values = new double[valuesList.size()];
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.iteration.operator.allround.AllRoundOperatorWrapper' to 'org.apache.flink.iteration.operator.OperatorWrapper\>'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                Collections.emptySet(),
                body,
                new AllRoundOperatorWrapper(),
                false);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.iteration.operator.OperatorWrapper' to 'org.apache.flink.iteration.operator.OperatorWrapper\>'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                replayedIndices,
                body,
                wrapper,
                true);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                context.getOperatorStateStore()
                        .getListState(new ListStateDescriptor<>("rawStateEpoch", Integer.class));
        List<Integer> rawStateEpochs = IteratorUtils.toList(rawStateEpochState.get().iterator());

        // Notes that the list must be sorted.
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                        .getListState(
                                new ListStateDescriptor<>("pendingEpochs", IntSerializer.INSTANCE));
        List<Integer> pendingEpochs = IteratorUtils.toList(pendingEpochState.get().iterator());

        // Unfortunately, for the raw state we could not call get input stream unless the previous
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
            } else if (dataType instanceof MapTypeInfo) {
                List<List<Object>> serializedMapKV = new ArrayList<>(2);
                Map<Object, Object> mapObj = (Map) obj;
                List<Object> keyBytesList = new ArrayList<>(mapObj.size());
                List<Object> valueBytesList = new ArrayList<>(mapObj.size());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class\>'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementTypeInfo.java`
#### Snippet
```java
    @Override
    public Class<CacheElement<T>> getTypeClass() {
        return (Class) CacheElement.class;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.flink.ml.common.broadcast.typeinfo.CacheElementTypeInfo'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementTypeInfo.java`
#### Snippet
```java
        }

        CacheElementTypeInfo<T> that = (CacheElementTypeInfo<T>) obj;
        return Objects.equals(recordTypeInfo, that.recordTypeInfo);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `flink-ml-core/src/main/java/org/apache/flink/ml/util/ReadWriteUtils.java`
#### Snippet
```java
    // of the value.
    private static <T> Object jsonEncodeHelper(Param<T> param, Object value) throws IOException {
        return param.jsonEncode((T) value);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\>'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
    public static GraphData fromMap(Map<String, Object> map) {
        List<GraphNode> nodes = new ArrayList<>();
        List<Map<String, Object>> nodeInfos = (List<Map<String, Object>>) map.get("nodes");
        for (Map<String, Object> nodeInfo : nodeInfos) {
            nodes.add(GraphNode.fromMap(nodeInfo));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        TableId[] estimatorInputIds = null;
        if (map.containsKey("estimatorInputIds")) {
            estimatorInputIds = TableId.fromList((List<Integer>) map.get("estimatorInputIds"));
        }
        TableId[] modelInputIds = TableId.fromList((List<Integer>) map.get("modelInputIds"));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
            estimatorInputIds = TableId.fromList((List<Integer>) map.get("estimatorInputIds"));
        }
        TableId[] modelInputIds = TableId.fromList((List<Integer>) map.get("modelInputIds"));
        TableId[] outputIds = TableId.fromList((List<Integer>) map.get("outputIds"));
        TableId[] inputModelDataIds = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        }
        TableId[] modelInputIds = TableId.fromList((List<Integer>) map.get("modelInputIds"));
        TableId[] outputIds = TableId.fromList((List<Integer>) map.get("outputIds"));
        TableId[] inputModelDataIds = null;
        if (map.containsKey("inputModelDataIds")) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        TableId[] inputModelDataIds = null;
        if (map.containsKey("inputModelDataIds")) {
            inputModelDataIds = TableId.fromList((List<Integer>) map.get("inputModelDataIds"));
        }
        TableId[] outputModelDataIds = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        TableId[] outputModelDataIds = null;
        if (map.containsKey("outputModelDataIds")) {
            outputModelDataIds = TableId.fromList((List<Integer>) map.get("outputModelDataIds"));
        }
        return new GraphData(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
        TableId[] estimatorInputIds = null;
        if (map.containsKey("estimatorInputIds")) {
            estimatorInputIds = TableId.fromList((List<Integer>) map.get("estimatorInputIds"));
        }
        TableId[] algoOpInputIds = TableId.fromList((List<Integer>) map.get("algoOpInputIds"));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
            estimatorInputIds = TableId.fromList((List<Integer>) map.get("estimatorInputIds"));
        }
        TableId[] algoOpInputIds = TableId.fromList((List<Integer>) map.get("algoOpInputIds"));
        TableId[] outputIds = TableId.fromList((List<Integer>) map.get("outputIds"));
        TableId[] inputModelDataIds = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
        }
        TableId[] algoOpInputIds = TableId.fromList((List<Integer>) map.get("algoOpInputIds"));
        TableId[] outputIds = TableId.fromList((List<Integer>) map.get("outputIds"));
        TableId[] inputModelDataIds = null;
        if (map.containsKey("inputModelDataIds")) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
        TableId[] inputModelDataIds = null;
        if (map.containsKey("inputModelDataIds")) {
            inputModelDataIds = TableId.fromList((List<Integer>) map.get("inputModelDataIds"));
        }
        TableId[] outputModelDataIds = null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
        TableId[] outputModelDataIds = null;
        if (map.containsKey("outputModelDataIds")) {
            outputModelDataIds = TableId.fromList((List<Integer>) map.get("outputModelDataIds"));
        }
        return new GraphNode(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
        @Override
        public void apply(GlobalWindow timeWindow, Iterable<T> iterable, Collector<T[]> collector) {
            List<T> points = IteratorUtils.toList(iterable.iterator());
            collector.collect(points.toArray((T[]) new Object[0]));
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'T\[\]'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
        public void apply(GlobalWindow timeWindow, Iterable<T> iterable, Collector<T[]> collector) {
            List<T> points = IteratorUtils.toList(iterable.iterator());
            collector.collect(points.toArray((T[]) new Object[0]));
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
        List<String> fieldNames = output.getResolvedSchema().getColumnNames();
        for (Row result :
                (List<Row>) IteratorUtils.toList(tEnv.toDataStream(output).executeAndCollect())) {
            Vector inputValue = result.getFieldAs(fieldNames.indexOf(lsh.getInputCol()));
            DenseVector[] outputValue = result.getFieldAs(fieldNames.indexOf(lsh.getOutputCol()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
        output = model.approxNearestNeighbors(dataA, key, 2).select($("id"), $("distCol"));
        for (Row result :
                (List<Row>) IteratorUtils.toList(tEnv.toDataStream(output).executeAndCollect())) {
            int idValue = result.getFieldAs(fieldNames.indexOf("id"));
            double distValue = result.getFieldAs(result.getArity() - 1);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List' to 'java.util.List'
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
        output = model.approxSimilarityJoin(dataA, dataB, .6, "id");
        for (Row result :
                (List<Row>) IteratorUtils.toList(tEnv.toDataStream(output).executeAndCollect())) {
            int idAValue = result.getFieldAs(0);
            int idBValue = result.getFieldAs(1);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.flink.ml.common.typeinfo.PriorityQueueTypeInfo'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueTypeInfo.java`
#### Snippet
```java
        }

        PriorityQueueTypeInfo<T> that = (PriorityQueueTypeInfo<T>) obj;
        return Objects.equals(comparator, that.comparator)
                && Objects.equals(elementTypeInfo, that.elementTypeInfo);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class\>'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueTypeInfo.java`
#### Snippet
```java
    @Override
    public Class<PriorityQueue<T>> getTypeClass() {
        return (Class) PriorityQueue.class;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/fvaluetest/FValueTest.java`
#### Snippet
```java
                                                collector) {
                                    List<Tuple4<Integer, Double, Long, Double>> rows =
                                            IteratorUtils.toList(iterable.iterator());
                                    int numOfFeatures = rows.size();

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java

            if (trainData == null) {
                trainData = IteratorUtils.toList(trainDataState.get().iterator());
            }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.feature.bucketizer.BucketizerParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/bucketizer/BucketizerParams.java`
#### Snippet
```java
    default T setSplitsArray(Double[][] value) {
        set(SPLITS_ARRAY, value);
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/hashingtf/HashingTF.java`
#### Snippet
```java
                inputList = Arrays.asList((Object[]) inputObj);
            } else if (inputObj instanceof Iterable) {
                inputList = (Iterable<Object>) inputObj;
            } else {
                throw new IllegalArgumentException(
```

### UNCHECKED_WARNING
Unchecked call to 'PriorityQueueTypeInfo(Comparator, TypeInformation)' as a member of raw type 'org.apache.flink.ml.common.typeinfo.PriorityQueueTypeInfo'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                        filteredData,
                        topKFunction,
                        new PriorityQueueTypeInfo(topKFunction.getComparator(), outputTypeInfo),
                        Types.LIST(outputTypeInfo));
        DataStream<Row> topKData =
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.PriorityQueue' to 'java.util.PriorityQueue'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        @Override
        public PriorityQueue<Row> merge(PriorityQueue<Row> a, PriorityQueue<Row> b) {
            PriorityQueue<Row> merged = new PriorityQueue<>(a);
            for (Row row : b) {
                add(row, merged);
```

### UNCHECKED_WARNING
Unchecked call to 'PriorityQueue(PriorityQueue)' as a member of raw type 'java.util.PriorityQueue'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        @Override
        public PriorityQueue<Row> merge(PriorityQueue<Row> a, PriorityQueue<Row> b) {
            PriorityQueue<Row> merged = new PriorityQueue<>(a);
            for (Row row : b) {
                add(row, merged);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        @Override
        public List<Row> getResult(PriorityQueue<Row> accumulator) {
            return new ArrayList<>(accumulator);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        @Override
        public List<Row> getResult(PriorityQueue<Row> accumulator) {
            return new ArrayList<>(accumulator);
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.feature.lsh.LSHModel' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        modelDataTable = inputs[0];
        return (T) this;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.HashSet'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java

            OperatorStateUtils.getUniqueElement(distinctLabelsState, "distinctLabelsState")
                    .ifPresent(x -> distinctLabels = new HashSet<>(x));
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]' to 'java.util.List\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexer.java`
#### Snippet
```java

        private List<Double>[] convertToListArray(HashSet<Double>[] array) {
            List<Double>[] results = new ArrayList[array.length];
            for (int i = 0; i < array.length; i++) {
                results[i] = new ArrayList<>(array[i]);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet\[\]' to 'java.util.HashSet\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexer.java`
#### Snippet
```java

        private HashSet<Double>[] convertToHashSetArray(List<Double>[] array) {
            HashSet<Double>[] results = new HashSet[array.length];
            for (int i = 0; i < array.length; i++) {
                results[i] = new HashSet<>(array[i]);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet\[\]' to 'java.util.HashSet\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexer.java`
#### Snippet
```java
                // First record.
                Vector vector = (Vector) element.getValue().getField(inputCol);
                doublesByColumn = new HashSet[vector.size()];
                for (int i = 0; i < doublesByColumn.length; i++) {
                    doublesByColumn[i] = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap\[\]' to 'java.util.Map\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stringindexer/StringIndexer.java`
#### Snippet
```java
        public CountStringOperator(String[] inputCols) {
            this.inputCols = inputCols;
            stringCntByColumn = new HashMap[inputCols.length];
            for (int i = 0; i < stringCntByColumn.length; i++) {
                stringCntByColumn[i] = new HashMap<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List\>\>'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/countvectorizer/CountVectorizer.java`
#### Snippet
```java

            List<Map.Entry<String, Tuple2<Long, Long>>> list =
                    new ArrayList<>(vocabAccumulator.f1.entrySet());
            list.sort((o1, o2) -> (o2.getValue().f1.compareTo(o1.getValue().f1)));
            List<String> vocabulary =
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.feature.elementwiseproduct.ElementwiseProductParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/elementwiseproduct/ElementwiseProductParams.java`
#### Snippet
```java
    default T setScalingVec(Vector value) {
        set(SCALING_VEC, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.clustering.kmeans.KMeansModelParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModelParams.java`
#### Snippet
```java
    default T setK(int value) {
        set(K, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.clustering.kmeans.KMeansParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansParams.java`
#### Snippet
```java
    default T setInitMode(String value) {
        set(INIT_MODE, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/univariatefeatureselector/UnivariateFeatureSelector.java`
#### Snippet
```java
                                            "pValuesAndIndices",
                                            Types.TUPLE(Types.DOUBLE, Types.INT)));
            pValuesAndIndices = IteratorUtils.toList(pValuesAndIndicesState.get().iterator());
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeans.java`
#### Snippet
```java

            List<DenseVector[]> pointsList =
                    IteratorUtils.toList(localBatchDataState.get().iterator());
            DenseVector[] points = pointsList.remove(0);
            localBatchDataState.update(pointsList);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.classification.linearsvc.LinearSVCModelParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVCModelParams.java`
#### Snippet
```java
    default T setThreshold(Double value) {
        set(THRESHOLD, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap\[\]\[\]' to 'java.util.Map\[\]\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayesModelData.java`
#### Snippet
```java
                        int featureSize = inputViewStreamWrapper.readInt();
                        int numLabels = inputViewStreamWrapper.readInt();
                        Map<Double, Double>[][] theta = new HashMap[numLabels][featureSize];
                        for (int i = 0; i < featureSize; i++) {
                            for (int j = 0; j < numLabels; j++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/agglomerativeclustering/AgglomerativeClustering.java`
#### Snippet
```java
                Iterable<Row> values,
                Collector<Row> output) {
            List<Row> inputList = IteratorUtils.toList(values.iterator());
            int numDataPoints = inputList.size();

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.ml.classification.logisticregression.OnlineLogisticRegressionModelParams' to 'T'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegressionModelParams.java`
#### Snippet
```java
    default T setModelVersionCol(String value) {
        set(MODEL_VERSION_COL, value);
        return (T) this;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegression.java`
#### Snippet
```java
            modelDataState.clear();

            List<Row[]> pointsList = IteratorUtils.toList(localBatchDataState.get().iterator());
            Row[] points = pointsList.remove(0);
            localBatchDataState.update(pointsList);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap\[\]' to 'java.util.Map\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java
                    Map<Double, Double>[] featureWeight =
                            featureWeightMap.computeIfAbsent(
                                    value.f0, x -> new HashMap[featureSize]);
                    numMap.put(value.f0, value.f3);
                    featureWeight[value.f1] = value.f2;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet\[\]' to 'java.util.HashSet\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java

            double[] numDocs = new double[featureSize];
            HashSet<Double>[] categoryNumbers = new HashSet[featureSize];
            for (int i = 0; i < featureSize; i++) {
                categoryNumbers[i] = new HashSet<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap\[\]\[\]' to 'java.util.Map\[\]\[\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java
            piLog = Math.log(piLog + numLabels * smoothing);

            Map<Double, Double>[][] theta = new HashMap[numLabels][featureSize];
            double[] piArray = new double[numLabels];
            double[] labels = new double[numLabels];
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `OneInputTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/OneInputTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.OneInputTransformation;

/** Draft translator for the {@link OneInputTransformation}. */
public class OneInputTransformationTranslator
        implements DraftTransformationTranslator<OneInputTransformation<?, ?>> {
```

### JavadocReference
Cannot resolve symbol `PartitionTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/PartitionTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.runtime.partitioner.StreamPartitioner;

/** Draft translator for the {@link PartitionTransformation}. */
public class PartitionTransformationTranslator
        implements DraftTransformationTranslator<PartitionTransformation<?>> {
```

### JavadocReference
Cannot resolve symbol `KeyedMultipleInputTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/KeyedMultipleInputTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.KeyedMultipleInputTransformation;

/** Draft translator for the {@link KeyedMultipleInputTransformation}. */
public class KeyedMultipleInputTransformationTranslator
        implements DraftTransformationTranslator<KeyedMultipleInputTransformation<?>> {
```

### JavadocReference
Cannot resolve symbol `SideOutputTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/SideOutputTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.util.OutputTag;

/** Draft translator for the {@link SideOutputTransformation}. */
public class SideOutputTransformationTranslator
        implements DraftTransformationTranslator<SideOutputTransformation<?>> {
```

### JavadocReference
Cannot resolve symbol `ReduceTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/ReduceTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.ReduceTransformation;

/** Draft translator for the {@link ReduceTransformation}. */
public class ReduceTransformationTranslator
        implements DraftTransformationTranslator<ReduceTransformation<?, ?>> {
```

### JavadocReference
Cannot resolve symbol `OutputTag`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationListener.java`
#### Snippet
```java
    interface Context {
        /**
         * Emits a record to the side output identified by the {@link OutputTag}.
         *
         * @param outputTag the {@code OutputTag} that identifies the side output to emit to.
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBody.java`
#### Snippet
```java
 * <ul>
 *   <li>Sources and Sinks.
 *   <li>{@link DataStream#assignTimestampsAndWatermarks(WatermarkStrategy)}.
 *   <li>{@link DataStream#iterate()}.
 * </ul>
```

### JavadocReference
Cannot resolve symbol `assignTimestampsAndWatermarks(WatermarkStrategy)`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBody.java`
#### Snippet
```java
 * <ul>
 *   <li>Sources and Sinks.
 *   <li>{@link DataStream#assignTimestampsAndWatermarks(WatermarkStrategy)}.
 *   <li>{@link DataStream#iterate()}.
 * </ul>
```

### JavadocReference
Cannot resolve symbol `WatermarkStrategy`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBody.java`
#### Snippet
```java
 * <ul>
 *   <li>Sources and Sinks.
 *   <li>{@link DataStream#assignTimestampsAndWatermarks(WatermarkStrategy)}.
 *   <li>{@link DataStream#iterate()}.
 * </ul>
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBody.java`
#### Snippet
```java
 *   <li>Sources and Sinks.
 *   <li>{@link DataStream#assignTimestampsAndWatermarks(WatermarkStrategy)}.
 *   <li>{@link DataStream#iterate()}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `iterate()`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBody.java`
#### Snippet
```java
 *   <li>Sources and Sinks.
 *   <li>{@link DataStream#assignTimestampsAndWatermarks(WatermarkStrategy)}.
 *   <li>{@link DataStream#iterate()}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/DataStreamList.java`
#### Snippet
```java
import java.util.List;

/** A utility class to maintain a list of {@link DataStream}, which might have different types. */
@Experimental
public class DataStreamList {
```

### JavadocReference
Cannot resolve symbol `StreamOperatorStateContext`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/proxy/state/ProxyStreamOperatorStateContext.java`
#### Snippet
```java
import java.util.OptionalLong;

/** Proxy {@link StreamOperatorStateContext} for the wrapped operator. */
public class ProxyStreamOperatorStateContext implements StreamOperatorStateContext {

```

### JavadocReference
Cannot resolve symbol `InternalTimeServiceManager`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/proxy/state/ProxyInternalTimeServiceManager.java`
#### Snippet
```java
import org.apache.flink.streaming.api.watermark.Watermark;

/** Proxy {@link InternalTimeServiceManager} for the wrapped operators. */
public class ProxyInternalTimeServiceManager<K> implements InternalTimeServiceManager<K> {

```

### JavadocReference
Cannot resolve symbol `StateSnapshotContext`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/proxy/state/ProxyStateSnapshotContext.java`
#### Snippet
```java
import org.apache.flink.runtime.state.StateSnapshotContext;

/** Proxy {@link StateSnapshotContext} for the wrapped operators. */
public class ProxyStateSnapshotContext implements StateSnapshotContext {

```

### JavadocReference
Cannot resolve symbol `KeyedStateBackend`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/proxy/state/ProxyKeyedStateBackend.java`
#### Snippet
```java
import java.util.stream.Stream;

/** Proxy {@link KeyedStateBackend} for the wrapped operators. */
public class ProxyKeyedStateBackend<K> implements CheckpointableKeyedStateBackend<K> {

```

### JavadocReference
Cannot resolve symbol `BroadcastStateTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/BroadcastStateTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.TwoInputTransformation;

/** Draft translator for the {@link BroadcastStateTransformation}. */
public class BroadcastStateTransformationTranslator
        implements DraftTransformationTranslator<BroadcastStateTransformation<?, ?, ?>> {
```

### JavadocReference
Cannot resolve symbol `TwoInputTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/TwoInputTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.TwoInputTransformation;

/** Draft translator for the {@link TwoInputTransformation}. */
public class TwoInputTransformationTranslator
        implements DraftTransformationTranslator<TwoInputTransformation<?, ?, ?>> {
```

### JavadocReference
Cannot resolve symbol `MultipleInputTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/MultipleInputTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.MultipleInputTransformation;

/** Draft translator for the {@link MultipleInputTransformation}. */
public class MultipleInputTransformationTranslator
        implements DraftTransformationTranslator<MultipleInputTransformation<?>> {
```

### JavadocReference
Cannot resolve symbol `UnionTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/UnionTransformationTranslator.java`
#### Snippet
```java
import java.util.stream.Collectors;

/** Draft translator for the {@link UnionTransformation}. */
public class UnionTransformationTranslator
        implements DraftTransformationTranslator<UnionTransformation<?>> {
```

### JavadocReference
Cannot resolve symbol `OperatorStateBackend`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/proxy/state/ProxyOperatorStateBackend.java`
#### Snippet
```java
import java.util.concurrent.RunnableFuture;

/** Proxy {@link OperatorStateBackend} for the wrapped Operator. */
public class ProxyOperatorStateBackend implements OperatorStateBackend {

```

### JavadocReference
Cannot resolve symbol `KeyedBroadcastStateTransformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/translator/KeyedBroadcastStateTransformationTranslator.java`
#### Snippet
```java
import org.apache.flink.streaming.api.transformations.TwoInputTransformation;

/** Draft translator for the {@link KeyedBroadcastStateTransformation}. */
public class KeyedBroadcastStateTransformationTranslator
        implements DraftTransformationTranslator<KeyedBroadcastStateTransformation<?, ?, ?, ?>> {
```

### JavadocReference
Cannot resolve symbol `FeedbackKey`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
    }

    /** Creates {@link FeedbackKey} from the {@code iterationId} and {@code feedbackIndex}. */
    public static <V> FeedbackKey<V> createFeedbackKey(IterationID iterationId, int feedbackIndex) {
        return new FeedbackKey<>(iterationId.toHexString(), feedbackIndex);
```

### JavadocReference
Cannot resolve symbol `MailboxExecutor`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java

    /**
     * A {@link MailboxExecutor} that provides support for method {@link #yield(long, TimeUnit)}.
     */
    private static class MailboxExecutorWithYieldTimeout implements MailboxExecutor {
```

### JavadocReference
Cannot resolve symbol `Collector`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
 *   <li>Ensures the exactly-once for processing elements.
 *   <li>Ensures the exactly-once for {@link IterationListener#onEpochWatermarkIncremented(int,
 *       IterationListener.Context, Collector)}.
 * </ul>
 *
```

### JavadocReference
Cannot resolve symbol `MultipleInputStreamOperator`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
    /**
     * Cached inputs for each epoch. This is to avoid repeat calls to the {@link
     * MultipleInputStreamOperator#getInputs()}, which might not returns the same inputs for each
     * call.
     */
```

### JavadocReference
Cannot resolve symbol `getInputs()`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
    /**
     * Cached inputs for each epoch. This is to avoid repeat calls to the {@link
     * MultipleInputStreamOperator#getInputs()}, which might not returns the same inputs for each
     * call.
     */
```

### JavadocReference
Cannot resolve symbol `Output`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/broadcast/BroadcastOutputFactory.java`
#### Snippet
```java
import java.util.List;

/** Factory that creates the corresponding {@link BroadcastOutput} from the {@link Output}. */
public class BroadcastOutputFactory {

```

### JavadocReference
Cannot resolve symbol `CoProcessFunction`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/functions/EpochAwareCoProcessFunction.java`
#### Snippet
```java

/**
 * A specialized {@link CoProcessFunction} that also provide the attach epoch with each record. It
 * is executed as all-round inside the iteration.
 */
```

### JavadocReference
Cannot resolve symbol `ProcessFunction`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/functions/EpochAwareAllRoundProcessFunction.java`
#### Snippet
```java

/**
 * A specialized {@link ProcessFunction} that also provide the attach epoch with each record. It is
 * executed as all-round inside the iteration.
 */
```

### JavadocReference
Cannot resolve symbol `ListState`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/ListStateWithCache.java`
#### Snippet
```java

/**
 * A {@link ListState} child class that records data and replays them when required.
 *
 * <p>This class basically stores data in file system, and provides the option to cache them in
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.dag.Transformation`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/ListStateWithCache.java`
#### Snippet
```java
 * memory. In order to use the memory caching option, users need to allocate certain managed memory
 * for the wrapper operator through {@link
 * org.apache.flink.api.dag.Transformation#declareManagedMemoryUseCaseAtOperatorScope}.
 *
 * <p>NOTE: Users need to explicitly invoke this class's {@link
```

### JavadocReference
Cannot resolve symbol `declareManagedMemoryUseCaseAtOperatorScope`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/ListStateWithCache.java`
#### Snippet
```java
 * memory. In order to use the memory caching option, users need to allocate certain managed memory
 * for the wrapper operator through {@link
 * org.apache.flink.api.dag.Transformation#declareManagedMemoryUseCaseAtOperatorScope}.
 *
 * <p>NOTE: Users need to explicitly invoke this class's {@link
```

### JavadocReference
Cannot resolve symbol `StateSnapshotContext`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/ListStateWithCache.java`
#### Snippet
```java
 *
 * <p>NOTE: Users need to explicitly invoke this class's {@link
 * #snapshotState(StateSnapshotContext)} method in order to store the recorded data in snapshot.
 */
public class ListStateWithCache<T> implements ListState<T> {
```

### JavadocReference
Cannot resolve symbol `FeedbackKey`
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
    }

    /** Creates {@link FeedbackKey} from the {@code iterationId} and {@code feedbackIndex}. */
    public static <V> FeedbackKey<V> createFeedbackKey(IterationID iterationId, int feedbackIndex) {
        return new FeedbackKey<>(iterationId.toHexString(), feedbackIndex);
```

### JavadocReference
Cannot resolve symbol `KeyedStateBackend`
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/proxy/state/ProxyKeyedStateBackend.java`
#### Snippet
```java
import java.util.stream.Stream;

/** Proxy {@link KeyedStateBackend} for the wrapped operators. */
public class ProxyKeyedStateBackend<K> implements CheckpointableKeyedStateBackend<K> {

```

### JavadocReference
Cannot resolve symbol `org.apache.flink.metrics.groups.OperatorMetricGroup`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/common/metrics/MLMetrics.java`
#### Snippet
```java
 *
 * <p>All metrics of Flink ML are registered under group "ml", which is a child group of {@link
 * org.apache.flink.metrics.groups.OperatorMetricGroup}. Metrics related to model data will be
 * registered in the group "ml.model".
 *
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorWithNormTypeInfoFactory.java`
#### Snippet
```java
import java.util.Map;

/** Used by {@link TypeExtractor} to create a {@link TypeInformation} for {@link VectorWithNorm}. */
public class VectorWithNormTypeInfoFactory extends TypeInfoFactory<VectorWithNorm> {
    @Override
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorWithNormTypeInfoFactory.java`
#### Snippet
```java
import java.util.Map;

/** Used by {@link TypeExtractor} to create a {@link TypeInformation} for {@link VectorWithNorm}. */
public class VectorWithNormTypeInfoFactory extends TypeInfoFactory<VectorWithNorm> {
    @Override
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseVectorTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * DenseVector}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseVectorTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * DenseVector}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorWithNormTypeInfo.java`
#### Snippet
```java
import org.apache.flink.ml.linalg.VectorWithNorm;

/** A {@link TypeInformation} for the {@link VectorWithNorm} type. */
public class VectorWithNormTypeInfo extends TypeInformation<VectorWithNorm> {
    @Override
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseMatrixTypeInfo.java`
#### Snippet
```java
import org.apache.flink.ml.linalg.DenseMatrix;

/** A {@link TypeInformation} for the {@link DenseMatrix} type. */
public class DenseMatrixTypeInfo extends TypeInformation<DenseMatrix> {
    private static final long serialVersionUID = 1L;
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/SparseVectorTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * SparseVector}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/SparseVectorTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * SparseVector}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorTypeInfoFactory.java`
#### Snippet
```java
import java.util.Map;

/** Used by {@link TypeExtractor} to create a {@link TypeInformation} for {@link Vector}. */
public class VectorTypeInfoFactory extends TypeInfoFactory<Vector> {

```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorTypeInfoFactory.java`
#### Snippet
```java
import java.util.Map;

/** Used by {@link TypeExtractor} to create a {@link TypeInformation} for {@link Vector}. */
public class VectorTypeInfoFactory extends TypeInfoFactory<Vector> {

```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseVectorTypeInfo.java`
#### Snippet
```java
import org.apache.flink.ml.linalg.DenseVector;

/** A {@link TypeInformation} for the {@link DenseVector} type. */
public class DenseVectorTypeInfo extends TypeInformation<DenseVector> {
    private static final long serialVersionUID = 1L;
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseMatrixTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * DenseMatrix}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseMatrixTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * DenseMatrix}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/VectorTypeInfo.java`
#### Snippet
```java
import org.apache.flink.ml.linalg.Vector;

/** A {@link TypeInformation} for the {@link Vector} type. */
public class VectorTypeInfo extends TypeInformation<Vector> {

```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/SparseVectorTypeInfo.java`
#### Snippet
```java
import org.apache.flink.ml.linalg.SparseVector;

/** A {@link TypeInformation} for the {@link SparseVector} type. */
public class SparseVectorTypeInfo extends TypeInformation<SparseVector> {
    public static final SparseVectorTypeInfo INSTANCE = new SparseVectorTypeInfo();
```

### JavadocReference
Cannot resolve symbol `Table`
in `flink-ml-core/src/main/java/org/apache/flink/ml/api/Model.java`
#### Snippet
```java

/**
 * A Model is typically generated by invoking {@link Estimator#fit(Table...)}. A Model is a
 * Transformer with the extra APIs to set and get model data.
 *
```

### JavadocReference
Cannot resolve symbol `StreamingRuntimeContext`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastStreamingRuntimeContext.java`
#### Snippet
```java

/**
 * An subclass of {@link StreamingRuntimeContext} that provides accessibility of broadcast
 * variables.
 */
```

### JavadocReference
Cannot resolve symbol `OneInputStreamOperator`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/OneInputBroadcastWrapperOperator.java`
#### Snippet
```java
import org.apache.flink.streaming.runtime.watermarkstatus.WatermarkStatus;

/** Wrapper for {@link OneInputStreamOperator}. */
public class OneInputBroadcastWrapperOperator<IN, OUT>
        extends AbstractBroadcastWrapperOperator<OUT, OneInputStreamOperator<IN, OUT>>
```

### JavadocReference
Cannot resolve symbol `TwoInputStreamOperator`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/TwoInputBroadcastWrapperOperator.java`
#### Snippet
```java
import org.apache.flink.streaming.runtime.watermarkstatus.WatermarkStatus;

/** Wrapper for {@link TwoInputStreamOperator}. */
public class TwoInputBroadcastWrapperOperator<IN1, IN2, OUT>
        extends AbstractBroadcastWrapperOperator<OUT, TwoInputStreamOperator<IN1, IN2, OUT>>
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.streaming.api.watermark.Watermark`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElement.java`
#### Snippet
```java
 * The wrapper class for possible cached elements used in {@link
 * org.apache.flink.ml.common.broadcast.operator.AbstractBroadcastWrapperOperator}. It could be
 * either {@link org.apache.flink.streaming.api.watermark.Watermark}, {@link
 * org.apache.flink.streaming.runtime.streamrecord.StreamRecord}, etc.
 *
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.streaming.runtime.streamrecord.StreamRecord`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElement.java`
#### Snippet
```java
 * org.apache.flink.ml.common.broadcast.operator.AbstractBroadcastWrapperOperator}. It could be
 * either {@link org.apache.flink.streaming.api.watermark.Watermark}, {@link
 * org.apache.flink.streaming.runtime.streamrecord.StreamRecord}, etc.
 *
 * @param <T> the record type.
```

### JavadocReference
Cannot resolve symbol `WindowAssigner`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/EndOfStreamWindows.java`
#### Snippet
```java

/**
 * A {@link WindowAssigner} that assigns all elements of a bounded input stream into one window
 * pane. The results are emitted once the input stream has ended.
 */
```

### JavadocReference
Cannot resolve symbol `SortingDataInput`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/FixedLengthByteKeyComparator.java`
#### Snippet
```java

/**
 * A comparator used in {@link SortingDataInput} which compares records keys and timestamps. It uses
 * binary format produced by the {@link KeyAndValueSerializer}.
 *
```

### JavadocReference
Cannot resolve symbol `SortingDataInput`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/KeyAndValueSerializer.java`
#### Snippet
```java

/**
 * A serializer used in {@link SortingDataInput} for serializing elements alongside their key and
 * timestamp. It serializes the record in a format known by the {@link FixedLengthByteKeyComparator}
 * and {@link VariableLengthByteKeyComparator}.
```

### JavadocReference
Cannot resolve symbol `SortingDataInput`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/VariableLengthByteKeyComparator.java`
#### Snippet
```java

/**
 * A comparator used in {@link SortingDataInput} which compares records keys and timestamps,. It
 * uses binary format produced by the {@link KeyAndValueSerializer}.
 *
```

### JavadocReference
Cannot resolve symbol `Table`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Pipeline.java`
#### Snippet
```java
     *
     * <ul>
     *   <li>If a stage is an Estimator, invoke {@link Estimator#fit(Table...)} with the input
     *       tables to generate a Model. And if there is Estimator after this stage, transform the
     *       input tables using the generated Model to get result tables, then pass the result
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.common.accumulators.Accumulator`
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
    /**
     * A stream sink that counts the number of all elements. The counting result is stored in an
     * {@link org.apache.flink.api.common.accumulators.Accumulator} specified by {@link
     * #COUNTER_NAME} and can be acquired by {@link
     * org.apache.flink.api.common.JobExecutionResult#getAccumulatorResult(String)}.
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.common.JobExecutionResult`
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
     * {@link org.apache.flink.api.common.accumulators.Accumulator} specified by {@link
     * #COUNTER_NAME} and can be acquired by {@link
     * org.apache.flink.api.common.JobExecutionResult#getAccumulatorResult(String)}.
     *
     * @param <T> The type of elements received by the sink.
```

### JavadocReference
Cannot resolve symbol `getAccumulatorResult(String)`
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
     * {@link org.apache.flink.api.common.accumulators.Accumulator} specified by {@link
     * #COUNTER_NAME} and can be acquired by {@link
     * org.apache.flink.api.common.JobExecutionResult#getAccumulatorResult(String)}.
     *
     * @param <T> The type of elements received by the sink.
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `createAccumulator()`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `merge(Object,
* Object)`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link ReduceFunction} on a bounded keyed data stream. The output stream contains
     * one stream record for each key.
     *
```

### JavadocReference
Cannot resolve symbol `ManagedMemoryUseCase`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    /**
     * Sets {Transformation#declareManagedMemoryUseCaseAtOperatorScope(ManagedMemoryUseCase, int)}
     * using the given bytes for {@link ManagedMemoryUseCase#OPERATOR}.
     *
     * <p>This method is in reference to Flink's ExecNodeUtil.setManagedMemoryWeight. The provided
```

### JavadocReference
Cannot resolve symbol `OPERATOR`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    /**
     * Sets {Transformation#declareManagedMemoryUseCaseAtOperatorScope(ManagedMemoryUseCase, int)}
     * using the given bytes for {@link ManagedMemoryUseCase#OPERATOR}.
     *
     * <p>This method is in reference to Flink's ExecNodeUtil.setManagedMemoryWeight. The provided
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link ReduceFunction} on the input bounded keyed data stream.
     *
     * <p>Note: this class is a copy of {@link
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.streaming.api.operators.BatchGroupedReduceOperator`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: this class is a copy of {@link
     * org.apache.flink.streaming.api.operators.BatchGroupedReduceOperator} in case of unexpected
     * changes of its implementation.
     */
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `createAccumulator()`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `merge(Object,
* Object)`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     *
     * <p>Note: If the parallelism of the input stream is N, this method would invoke {@link
     * AggregateFunction#createAccumulator()} N times and {@link AggregateFunction#merge(Object,
     * Object)} N - 1 times. Thus the initial accumulator should be neutral (e.g. empty list for
     * list concatenation or `0` for summation), otherwise the aggregation result would be affected
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    }

    /** A stream operator to apply {@link ReduceFunction} on the input bounded data stream. */
    private static class ReduceOperator<T> extends AbstractUdfStreamOperator<T, ReduceFunction<T>>
            implements OneInputStreamOperator<T, T>, BoundedOneInput {
```

### JavadocReference
Cannot resolve symbol `MapPartitionFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link MapPartitionFunction} on a bounded data stream.
     *
     * @param input The input data stream.
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
import java.util.Random;

/** Provides utility functions for {@link DataStream}. */
@Internal
public class DataStreamUtils {
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link AggregateFunction#add(IN, ACC)} on each partition of the
     * input bounded data stream.
     */
```

### JavadocReference
Cannot resolve symbol `add(IN, ACC)`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link AggregateFunction#add(IN, ACC)} on each partition of the
     * input bounded data stream.
     */
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link ReduceFunction} on a bounded data stream. The output stream contains at most
     * one stream record and its parallelism is one.
     *
```

### JavadocReference
Cannot resolve symbol `DataStream`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A CoGroup transformation combines the elements of two {@link DataStream DataStreams} into one
     * DataStream. It groups each DataStream individually on a key and gives groups of both
     * DataStreams with equal keys together into a {@link
```

### JavadocReference
Cannot resolve symbol `org.apache.flink.api.common.functions.CoGroupFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     * DataStream. It groups each DataStream individually on a key and gives groups of both
     * DataStreams with equal keys together into a {@link
     * org.apache.flink.api.common.functions.CoGroupFunction}. If a DataStream has a group with no
     * matching key in the other DataStream, the CoGroupFunction is called with an empty group for
     * the non-existing group.
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link ReduceFunction} on a bounded data stream. The output stream contains at most
     * one stream record and its parallelism is one.
     *
```

### JavadocReference
Cannot resolve symbol `MapPartitionFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link MapPartitionFunction} on a bounded data stream.
     *
     * @param input The input data stream.
```

### JavadocReference
Cannot resolve symbol `ReduceFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * Applies a {@link ReduceFunction} on a bounded keyed data stream. The output stream contains
     * one stream record for each key.
     *
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link AggregateFunction#merge(ACC, ACC)} and {@link
     * AggregateFunction#getResult(ACC)} on the input bounded data stream.
     */
```

### JavadocReference
Cannot resolve symbol `merge(ACC, ACC)`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link AggregateFunction#merge(ACC, ACC)} and {@link
     * AggregateFunction#getResult(ACC)} on the input bounded data stream.
     */
```

### JavadocReference
Cannot resolve symbol `AggregateFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    /**
     * A stream operator to apply {@link AggregateFunction#merge(ACC, ACC)} and {@link
     * AggregateFunction#getResult(ACC)} on the input bounded data stream.
     */
    private static class AggregateOperator<IN, ACC, OUT>
```

### JavadocReference
Cannot resolve symbol `getResult(ACC)`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    /**
     * A stream operator to apply {@link AggregateFunction#merge(ACC, ACC)} and {@link
     * AggregateFunction#getResult(ACC)} on the input bounded data stream.
     */
    private static class AggregateOperator<IN, ACC, OUT>
```

### JavadocReference
Cannot resolve symbol `MapPartitionFunction`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java

    /**
     * A stream operator to apply {@link MapPartitionFunction} on each partition of the input
     * bounded data stream.
     */
```

### JavadocReference
Cannot resolve symbol `ScalarFunction`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/Functions.java`
#### Snippet
```java

    /**
     * A {@link ScalarFunction} that converts a column of {@link Vector}s into a column of double
     * arrays.
     */
```

### JavadocReference
Cannot resolve symbol `ScalarFunction`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/Functions.java`
#### Snippet
```java

    /**
     * A {@link ScalarFunction} that converts a column of arrays of numeric type into a column of
     * {@link DenseVector} instances.
     */
```

### JavadocReference
Cannot resolve symbol `TypeExtractor`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/QuantileSummaryTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * QuantileSummary}.
 */
```

### JavadocReference
Cannot resolve symbol `TypeInformation`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/QuantileSummaryTypeInfoFactory.java`
#### Snippet
```java

/**
 * Used by {@link TypeExtractor} to create a {@link TypeInformation} for implementations of {@link
 * QuantileSummary}.
 */
```

### JavadocReference
Cannot resolve symbol `MapFunction`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/dct/DCT.java`
#### Snippet
```java

    /**
     * A {@link MapFunction} that contains the main logic to perform discrete cosine transformation.
     */
    private static class DCTFunction implements MapFunction<Row, Row> {
```

### JavadocReference
Cannot resolve symbol `Table`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModelData.java`
#### Snippet
```java
     * process.
     *
     * <p>KMeansModelData objects generated during {@link KMeans#fit(Table...)} also contains this
     * field, so that it can be used as the initial model data of the online training process.
     */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/servable/types/BasicType.java`
#### Snippet
```java
    DOUBLE,
    STRING,
    BYTE_STRING;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public enum StageType {
        ESTIMATOR,
        ALGO_OPERATOR;
    }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `translate` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/compile/DraftExecutionEnvironment.java`
#### Snippet
```java
                "Unsupported transformation: " + draftTransformation);
        Transformation<?> actualTransformation =
                transformationTranslator.translate(
                        draftTransformation, operatorWrapper, new TranslatorContext());
        actualEnv.addOperator(actualTransformation);
```

### DataFlowIssue
Method invocation `getInputs` will produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                            Transformation<?> inputTransformation = dataStream.getTransformation();
                            if (!(inputTransformation instanceof PhysicalTransformation)
                                    && inputTransformation.getInputs().size() > 1) {
                                // TODO: Support epoch watermark alignment for TailOperator.
                                throw new UnsupportedOperationException(
```

### DataFlowIssue
Condition `e.getCause() instanceof TaskMailbox.MailboxClosedException` is redundant and can be replaced with a null check
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
                                        () -> {}, "NoOp runnable to trigger yield timeout");
                            } catch (RejectedExecutionException e) {
                                if (!(e.getCause() instanceof TaskMailbox.MailboxClosedException)) {
                                    throw e;
                                }
```

### DataFlowIssue
Method invocation `getNumFeedbackRecordsEachRound` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/RegularHeadOperatorRecordProcessor.java`
#### Snippet
```java
        checkArgument(headOperatorState != null, "The initialized state should not be null");

        numFeedbackRecordsPerEpoch.putAll(headOperatorState.getNumFeedbackRecordsEachRound());
        latestRoundAligned = headOperatorState.getLatestRoundAligned();
        latestRoundGloballyAligned = headOperatorState.getLatestRoundGloballyAligned();
```

### DataFlowIssue
Method invocation `next` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheReader.java`
#### Snippet
```java
    public T next() {
        try {
            T record = currentSegmentReader.next();

            currentSegmentCount++;
```

### DataFlowIssue
Condition `e.getCause() instanceof MemoryAllocationException` is redundant and can be replaced with a null check
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentWriter.java`
#### Snippet
```java
            return true;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof MemoryAllocationException) {
                return false;
            }
```

### DataFlowIssue
Method invocation `returnAll` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
            }
            if (!segment.getCache().isEmpty()) {
                segmentPool.returnAll(segment.getCache());
            }
        }
```

### DataFlowIssue
Method invocation `addRecord` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    public void addRecord(T record) throws IOException {
        if (!currentSegmentWriter.addRecord(record)) {
            currentSegmentWriter.finish().ifPresent(finishedSegments::add);
            currentSegmentWriter = new FileSegmentWriter<>(serializer, pathGenerator.get());
```

### DataFlowIssue
Dereference of `numberOfChannels` may produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/progresstrack/OperatorEpochWatermarkTracker.java`
#### Snippet
```java
        this.progressTrackerListener = checkNotNull(progressTrackerListener);

        this.inputStatuses = new ArrayList<>(numberOfChannels.length);
        for (int numberOfChannel : numberOfChannels) {
            inputStatuses.add(new InputStatus(numberOfChannel));
```

### DataFlowIssue
Method invocation `getInputs` will produce `NullPointerException`
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                            Transformation<?> inputTransformation = dataStream.getTransformation();
                            if (!(inputTransformation instanceof PhysicalTransformation)
                                    && inputTransformation.getInputs().size() > 1) {
                                // TODO: Support epoch watermark alignment for TailOperator.
                                throw new UnsupportedOperationException(
```

### DataFlowIssue
Method invocation `createSerializer` will produce `NullPointerException`
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
            } else {
                // other typeinfos will use the corresponding serializer to serialize data.
                TypeSerializer serializer = dataType.createSerializer(null);
                ByteArrayOutputStreamWithPos baos = new ByteArrayOutputStreamWithPos();
                DataOutputViewStreamWrapper baosWrapper = new DataOutputViewStreamWrapper(baos);
```

### DataFlowIssue
Method invocation `save` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/util/ReadWriteUtils.java`
#### Snippet
```java
        for (GraphNode node : graphData.nodes) {
            String stagePath = FileUtils.getPathForPipelineStage(node.nodeId, maxNodeId + 1, path);
            node.stage.save(stagePath);
        }
    }
```

### DataFlowIssue
Method invocation `fit` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
                stage =
                        ((Estimator<?, ?>) stage)
                                .fit(executionHelper.getTables(node.estimatorInputIds));
            }
            // Invokes setModelData(...).
```

### DataFlowIssue
Argument `node.estimatorInputIds` might be null
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
                stage =
                        ((Estimator<?, ?>) stage)
                                .fit(executionHelper.getTables(node.estimatorInputIds));
            }
            // Invokes setModelData(...).
```

### DataFlowIssue
Method invocation `setModelData` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
            if (node.inputModelDataIds != null) {
                Table[] nodeInputModelData = executionHelper.getTables(node.inputModelDataIds);
                ((Model<?>) stage).setModelData(nodeInputModelData);
            }
            // Invokes transform(...).
```

### DataFlowIssue
Method invocation `transform` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
            Table[] nodeOutputs =
                    ((AlgoOperator<?>) stage)
                            .transform(executionHelper.getTables(node.algoOpInputIds));
            executionHelper.setTables(node.outputIds, nodeOutputs);
            // Invokes getModelData().
```

### DataFlowIssue
Dereference of `inputModelDataIds` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
        Preconditions.checkArgument(inputModelDataIds != null, "setModelData() is not supported");
        Preconditions.checkArgument(
                inputModelDataIds.length == inputTables.length,
                "number of provided tables %s does not match the expected number of tables %s",
                inputTables.length,
```

### DataFlowIssue
Argument `outputModelDataIds` might be null
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    public Table[] getModelData() {
        Preconditions.checkArgument(outputModelDataIds != null);
        return executionHelper.getTables(outputModelDataIds);
    }

```

### DataFlowIssue
Method invocation `fit` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
                stage =
                        ((Estimator<?, ?>) stage)
                                .fit(executionHelper.getTables(node.estimatorInputIds));
            }
            // Invokes setModelData(...).
```

### DataFlowIssue
Argument `node.estimatorInputIds` might be null
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
                stage =
                        ((Estimator<?, ?>) stage)
                                .fit(executionHelper.getTables(node.estimatorInputIds));
            }
            // Invokes setModelData(...).
```

### DataFlowIssue
Method invocation `setModelData` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
            if (node.inputModelDataIds != null) {
                Table[] nodeInputModelData = executionHelper.getTables(node.inputModelDataIds);
                ((Model<?>) stage).setModelData(nodeInputModelData);
            }
            // Invokes transform(...).
```

### DataFlowIssue
Method invocation `transform` may produce `NullPointerException`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
            Table[] nodeOutputs =
                    ((AlgoOperator<?>) stage)
                            .transform(executionHelper.getTables(node.algoOpInputIds));
            executionHelper.setTables(node.outputIds, nodeOutputs);
            // Invokes getModelData().
```

### DataFlowIssue
Array access `value[value.length - 1]` will produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java
                                    reducedUpdateAndWeightAndLoss -> {
                                        double[] value = (double[]) reducedUpdateAndWeightAndLoss;
                                        return value[value.length - 1] / value[value.length - 2];
                                    })
                            .flatMap(new TerminateOnMaxIterOrTol(params.maxIter, params.tol));
```

### DataFlowIssue
Argument `sum` might be null
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScaler.java`
#### Snippet
```java
                    squaredSum = new DenseVector(inputVec.size());
                }
                BLAS.axpy(1, inputVec, sum);
                BLAS.hDot(inputVec, inputVec);
                BLAS.axpy(1, inputVec, squaredSum);
```

### DataFlowIssue
Argument `squaredSum` might be null
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScaler.java`
#### Snippet
```java
                BLAS.axpy(1, inputVec, sum);
                BLAS.hDot(inputVec, inputVec);
                BLAS.axpy(1, inputVec, squaredSum);
                numElements++;
            }
```

### DataFlowIssue
Argument `in` might be null
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stopwordsremover/StopWordsRemoverUtils.java`
#### Snippet
```java
                                "org/apache/flink/ml/feature/stopwords/" + language + ".txt");

        return new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))
                .lines()
                .toArray(String[]::new);
```

### DataFlowIssue
Dereference of `currentFarthestNeighbor` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModel.java`
#### Snippet
```java
                } else {
                    Tuple2<Double, Double> currentFarthestNeighbor = nearestKNeighbors.peek();
                    if (currentFarthestNeighbor.f0 > distanceVector.get(i)) {
                        nearestKNeighbors.poll();
                        nearestKNeighbors.add(Tuple2.of(distanceVector.get(i), labelValues[i]));
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/HashingTFExample.java`
#### Snippet
```java
            System.out.printf(
                    "Input Value: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValue.stream().toArray()), outputValue);
        }
    }
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
        while (dataCacheReader.hasNext()) {
            // we first process the pending mail
            while (mailboxExecutor.tryYield()) {
                // Do nothing.
            }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    }

    private <T> void setKeyContextElement(StreamRecord<T> record, KeySelector<T, ?> selector)
            throws Exception {
        if (selector != null
```

### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    }

    private <T> void setKeyContextElement(StreamRecord<T> record, KeySelector<T, ?> selector)
            throws Exception {
        if (selector != null
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationRecord.java`
#### Snippet
```java

    @Override
    public IterationRecord<T> clone() {
        switch (type) {
            case RECORD:
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/DenseVector.java`
#### Snippet
```java

    @Override
    public DenseVector clone() {
        return new DenseVector(values.clone());
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/SparseVector.java`
#### Snippet
```java

    @Override
    public SparseVector clone() {
        return new SparseVector(n, indices.clone(), values.clone());
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
            Stage<?> stage = node.stage;
            // Invokes fit(...) if stageType == ESTIMATOR.
            if (node.stageType == StageType.ESTIMATOR) {
                stage =
                        ((Estimator<?, ?>) stage)
                                .fit(executionHelper.getTables(node.estimatorInputIds));
            }
            // Invokes setModelData(...).
            if (node.inputModelDataIds != null) {
                Table[] nodeInputModelData = executionHelper.getTables(node.inputModelDataIds);
                ((Model<?>) stage).setModelData(nodeInputModelData);
            }
            // Invokes transform(...).
            Table[] nodeOutputs =
                    ((AlgoOperator<?>) stage)
                            .transform(executionHelper.getTables(node.algoOpInputIds));
            executionHelper.setTables(node.outputIds, nodeOutputs);
            // Invokes getModelData().
            if (node.outputModelDataIds != null) {
                Table[] nodeOutputModelData = ((Model<?>) stage).getModelData();
                executionHelper.setTables(node.outputModelDataIds, nodeOutputModelData);
            }
```

### DuplicatedCode
Duplicated code
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        result.put("outputIds", TableId.toList(outputIds));
        if (inputModelDataIds != null) {
            result.put("inputModelDataIds", TableId.toList(inputModelDataIds));
        }
        if (outputModelDataIds != null) {
            result.put("outputModelDataIds", TableId.toList(outputModelDataIds));
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
        TableId[] outputIds = TableId.fromList((List<Integer>) map.get("outputIds"));
        TableId[] inputModelDataIds = null;
        if (map.containsKey("inputModelDataIds")) {
            inputModelDataIds = TableId.fromList((List<Integer>) map.get("inputModelDataIds"));
        }
        TableId[] outputModelDataIds = null;
        if (map.containsKey("outputModelDataIds")) {
            outputModelDataIds = TableId.fromList((List<Integer>) map.get("outputModelDataIds"));
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);

        // Generates input data.
        DataStream<Row> inputStream =
                env.fromElements(
                        Row.of(Vectors.dense(1, 2, 3, 4), 0., 1.),
                        Row.of(Vectors.dense(2, 2, 3, 4), 0., 2.),
                        Row.of(Vectors.dense(3, 2, 3, 4), 0., 3.),
                        Row.of(Vectors.dense(4, 2, 3, 4), 0., 4.),
                        Row.of(Vectors.dense(5, 2, 3, 4), 0., 5.),
                        Row.of(Vectors.dense(11, 2, 3, 4), 1., 1.),
                        Row.of(Vectors.dense(12, 2, 3, 4), 1., 2.),
                        Row.of(Vectors.dense(13, 2, 3, 4), 1., 3.),
                        Row.of(Vectors.dense(14, 2, 3, 4), 1., 4.),
                        Row.of(Vectors.dense(15, 2, 3, 4), 1., 5.));
        Table inputTable = tEnv.fromDataStream(inputStream).as("features", "label", "weight");
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java
        Table outputTable = linearSVCModel.transform(inputTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(linearSVC.getFeaturesCol());
            double expectedResult = (Double) row.getField(linearSVC.getLabelCol());
            double predictionResult = (Double) row.getField(linearSVC.getPredictionCol());
            DenseVector rawPredictionResult =
                    (DenseVector) row.getField(linearSVC.getRawPredictionCol());
            System.out.printf(
                    "Features: %-25s \tExpected Result: %s \tPrediction Result: %s \tRaw Prediction Result: %s\n",
                    features, expectedResult, predictionResult, rawPredictionResult);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BucketizerExample.java`
#### Snippet
```java
        Table outputTable = bucketizer.transform(inputTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();

            double[] inputValues = new double[bucketizer.getInputCols().length];
            double[] outputValues = new double[bucketizer.getInputCols().length];
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (double) row.getField(bucketizer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(bucketizer.getOutputCols()[i]);
            }

            System.out.printf(
                    "Input Values: %s\tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ElementwiseProductExample.java`
#### Snippet
```java
        Table outputTable = elementwiseProduct.transform(inputTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            Vector inputValue = (Vector) row.getField(elementwiseProduct.getInputCol());
            Vector outputValue = (Vector) row.getField(elementwiseProduct.getOutputCol());
            System.out.printf("Input Value: %s \tOutput Value: %s\n", inputValue, outputValue);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/FeatureHasherExample.java`
#### Snippet
```java
        Table outputTable = featureHash.transform(inputDataTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();

            Object[] inputValues = new Object[featureHash.getInputCols().length];
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = row.getField(featureHash.getInputCols()[i]);
            }
            Vector outputValue = (Vector) row.getField(featureHash.getOutputCol());

            System.out.printf(
                    "Input Values: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValues), outputValue);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IDFExample.java`
#### Snippet
```java
        Table outputTable = model.transform(inputTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            DenseVector inputValue = (DenseVector) row.getField(idf.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(idf.getOutputCol());
            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MaxAbsScalerExample.java`
#### Snippet
```java
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env);

        // Generates input training and prediction data.
        DataStream<Row> trainStream =
                env.fromElements(
                        Row.of(Vectors.dense(0.0, 3.0)),
                        Row.of(Vectors.dense(2.1, 0.0)),
                        Row.of(Vectors.dense(4.1, 5.1)),
                        Row.of(Vectors.dense(6.1, 8.1)),
                        Row.of(Vectors.dense(200, 400)));
        Table trainTable = tEnv.fromDataStream(trainStream).as("input");

        DataStream<Row> predictStream =
                env.fromElements(
                        Row.of(Vectors.dense(150.0, 90.0)),
                        Row.of(Vectors.dense(50.0, 40.0)),
                        Row.of(Vectors.dense(100.0, 50.0)));
        Table predictTable = tEnv.fromDataStream(predictStream).as("input");
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MaxAbsScalerExample.java`
#### Snippet
```java
        Table outputTable = maxAbsScalerModel.transform(predictTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            DenseVector inputValue = (DenseVector) row.getField(maxAbsScaler.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(maxAbsScaler.getOutputCol());
            System.out.printf("Input Value: %-15s\tOutput Value: %s\n", inputValue, outputValue);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RegexTokenizerExample.java`
#### Snippet
```java
        Table outputTable = regexTokenizer.transform(inputTable)[0];

        // Extracts and displays the results.
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();

            String inputValue = (String) row.getField(regexTokenizer.getInputCol());
            String[] outputValues = (String[]) row.getField(regexTokenizer.getOutputCol());

            System.out.printf(
                    "Input Value: %s \tOutput Values: %s\n",
                    inputValue, Arrays.toString(outputValues));
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        OperatorWrapper wrapper =
                config.getOperatorLifeCycle() == IterationConfig.OperatorLifeCycle.ALL_ROUND
                        ? new AllRoundOperatorWrapper<>()
                        : new PerRoundOperatorWrapper<>();

        List<DataStream<?>> allDatastreams = new ArrayList<>();
        allDatastreams.addAll(dataStreams.getReplayedDataStreams());
        allDatastreams.addAll(dataStreams.getNonReplayedStreams());

        Set<Integer> replayedIndices =
                IntStream.range(0, dataStreams.getReplayedDataStreams().size())
                        .boxed()
                        .collect(Collectors.toSet());

        return createIteration(
                initVariableStreams,
                new DataStreamList(allDatastreams),
                replayedIndices,
                body,
                wrapper,
                true);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
checkState(initVariableStreams.size() > 0, "There should be at least one variable stream");

        IterationID iterationId = new IterationID();

        List<TypeInformation<?>> initVariableTypeInfos = getTypeInfos(initVariableStreams);
        List<TypeInformation<?>> dataStreamTypeInfos = getTypeInfos(dataStreams);

        // Add heads and inputs
        int totalInitVariableParallelism =
                map(
                                initVariableStreams,
                                dataStream ->
                                        dataStream.getParallelism() > 0
                                                ? dataStream.getParallelism()
                                                : dataStream
                                                        .getExecutionEnvironment()
                                                        .getConfig()
                                                        .getParallelism())
                        .stream()
                        .mapToInt(i -> i)
                        .sum();
        DataStreamList initVariableInputs = addInputs(initVariableStreams);
        DataStreamList headStreams =
                addHeads(
                        initVariableStreams,
                        initVariableInputs,
                        iterationId,
                        totalInitVariableParallelism,
                        false,
                        0);

        DataStreamList dataStreamInputs = addInputs(dataStreams);
        if (replayedDataStreamIndices.size() > 0) {
            dataStreamInputs =
                    addReplayer(
                            headStreams.get(0),
                            dataStreams,
                            dataStreamInputs,
                            replayedDataStreamIndices);
        }

        // Creates the iteration body. We map the inputs of iteration body into the draft sources,
        // which serve as the start points to build the draft subgraph.
        StreamExecutionEnvironment env = initVariableStreams.get(0).getExecutionEnvironment();
        DraftExecutionEnvironment draftEnv =
                new DraftExecutionEnvironment(env, initialOperatorWrapper);
        DataStreamList draftHeadStreams =
                addDraftSources(headStreams, draftEnv, initVariableTypeInfos);
        DataStreamList draftDataStreamInputs =
                addDraftSources(dataStreamInputs, draftEnv, dataStreamTypeInfos);

        IterationBodyResult iterationBodyResult =
                body.process(draftHeadStreams, draftDataStreamInputs);
        ensuresTransformationAdded(iterationBodyResult.getFeedbackVariableStreams(), draftEnv);
        ensuresTransformationAdded(iterationBodyResult.getOutputStreams(), draftEnv);
        draftEnv.copyToActualEnvironment();

        // Adds tails and co-locate them with the heads.
        DataStreamList feedbackStreams =
                getActualDataStreams(iterationBodyResult.getFeedbackVariableStreams(), draftEnv);
        checkState(
                feedbackStreams.size() == initVariableStreams.size(),
                "The number of feedback streams "
                        + feedbackStreams.size()
                        + " does not match the initialized one "
                        + initVariableStreams.size());
        for (int i = 0; i < feedbackStreams.size(); ++i) {
            checkState(
                    feedbackStreams.get(i).getParallelism() == headStreams.get(i).getParallelism(),
                    String.format(
                            "The feedback stream %d have different parallelism %d with the initial stream, which is %d",
                            i,
                            feedbackStreams.get(i).getParallelism(),
                            headStreams.get(i).getParallelism()));
        }

        DataStreamList tails = addTails(feedbackStreams, iterationId, 0);
        for (int i = 0; i < headStreams.size(); ++i) {
            String coLocationGroupKey = "co-" + iterationId.toHexString() + "-" + i;
            headStreams.get(i).getTransformation().setCoLocationGroupKey(coLocationGroupKey);
            tails.get(i).getTransformation().setCoLocationGroupKey(coLocationGroupKey);
        }

        List<DataStream<?>> tailsAndCriteriaTails = new ArrayList<>(tails.getDataStreams());
        checkState(
                mayHaveCriteria || iterationBodyResult.getTerminationCriteria() == null,
                "The current iteration type does not support the termination criteria.");

        if (iterationBodyResult.getTerminationCriteria() != null) {
            DataStreamList criteriaTails =
                    addCriteriaStream(
                            iterationBodyResult.getTerminationCriteria(),
                            iterationId,
                            env,
                            draftEnv,
                            initVariableStreams,
                            headStreams,
                            totalInitVariableParallelism);
            tailsAndCriteriaTails.addAll(criteriaTails.getDataStreams());
        }

        DataStream<Integer> tailsUnion =
                unionAllTails(env, new DataStreamList(tailsAndCriteriaTails));

        return addOutputs(
                getActualDataStreams(iterationBodyResult.getOutputStreams(), draftEnv), tailsUnion);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        List<DataStream<?>> result = new ArrayList<>(dataStreamInputs.size());
        for (int i = 0; i < dataStreamInputs.size(); ++i) {
            if (!replayedDataStreamIndices.contains(i)) {
                result.add(dataStreamInputs.get(i));
                continue;
            }

            // Notes that the HeadOperator would broadcast the globally aligned events,
            // thus the operator does not require emit to the sideoutput specially.
            DataStream<?> replayedInput =
                    dataStreamInputs
                            .get(i)
                            .connect(
                                    ((SingleOutputStreamOperator<IterationRecord<?>>)
                                                    firstHeadStream)
                                            .getSideOutput(HeadOperator.ALIGN_NOTIFY_OUTPUT_TAG)
                                            .broadcast())
                            .transform(
                                    "Replayer-"
                                            + originalDataStreams
                                                    .get(i)
                                                    .getTransformation()
                                                    .getName(),
                                    dataStreamInputs.get(i).getType(),
                                    (TwoInputStreamOperator) new ReplayOperator<>())
                            .setParallelism(dataStreamInputs.get(i).getParallelism());
            result.add(replayedInput);
        }

        return new DataStreamList(result);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
DataStream<?> terminationCriteria = draftEnv.getActualStream(draftCriteriaStream.getId());
        // It should always has the IterationRecordTypeInfo
        checkState(
                terminationCriteria.getType().getClass().equals(IterationRecordTypeInfo.class),
                "The termination criteria should always return IterationRecord.");
        TypeInformation<?> innerType =
                ((IterationRecordTypeInfo<?>) terminationCriteria.getType()).getInnerTypeInfo();

        DataStream<?> emptyCriteriaSource =
                env.addSource(new DraftExecutionEnvironment.EmptySource())
                        .returns(innerType)
                        .name(terminationCriteria.getTransformation().getName())
                        .setParallelism(terminationCriteria.getParallelism());
        DataStreamList criteriaSources = DataStreamList.of(emptyCriteriaSource);
        DataStreamList criteriaInputs = addInputs(criteriaSources);
        DataStreamList criteriaHeaders =
                addHeads(
                        criteriaSources,
                        criteriaInputs,
                        iterationId,
                        totalInitVariableParallelism,
                        true,
                        initVariableStreams.size());

        // Merges the head and the actual criteria stream. This is required since if we have
        // no edges from the criteria head to the criteria tail, the tail might directly received
        // the MAX_EPOCH_WATERMARK without the synchronization of the head.
        DataStream<?> mergedHeadAndCriteria =
                mergeCriteriaHeadAndCriteriaStream(
                        env, criteriaHeaders.get(0), terminationCriteria, innerType);
        DataStreamList criteriaTails =
                addTails(
                        DataStreamList.of(mergedHeadAndCriteria),
                        iterationId,
                        initVariableStreams.size());

        String coLocationGroupKey = "co-" + iterationId.toHexString() + "-cri";
        criteriaHeaders.get(0).getTransformation().setCoLocationGroupKey(coLocationGroupKey);
        criteriaTails.get(0).getTransformation().setCoLocationGroupKey(coLocationGroupKey);

        // Now we notify all the head operators to count the criteria streams.
        setCriteriaParallelism(headStreams, terminationCriteria.getParallelism());
        setCriteriaParallelism(criteriaHeaders, terminationCriteria.getParallelism());

        return criteriaTails;
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        DraftExecutionEnvironment criteriaDraftEnv =
                new DraftExecutionEnvironment(env, new AllRoundOperatorWrapper<>());
        DataStream draftHeadStream = criteriaDraftEnv.addDraftSource(head, criteriaStreamType);
        DataStream draftTerminationCriteria =
                criteriaDraftEnv.addDraftSource(criteriaStream, criteriaStreamType);
        DataStream draftMergedStream =
                draftHeadStream
                        .connect(draftTerminationCriteria)
                        .process(new CriteriaMergeProcessor())
                        .returns(criteriaStreamType)
                        .setParallelism(
                                criteriaStream.getParallelism() > 0
                                        ? criteriaStream.getParallelism()
                                        : env.getConfig().getParallelism())
                        .name("criteria-merge");
        criteriaDraftEnv.copyToActualEnvironment();
        return criteriaDraftEnv.getActualStream(draftMergedStream.getId());
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        return new DataStreamList(
                map(
                        dataStreams,
                        (index, dataStream) -> {
                            Transformation<?> inputTransformation = dataStream.getTransformation();
                            if (!(inputTransformation instanceof PhysicalTransformation)
                                    && inputTransformation.getInputs().size() > 1) {
                                // TODO: Support epoch watermark alignment for TailOperator.
                                throw new UnsupportedOperationException(
                                        "Tail operator should have only one input. Please check whether operator \""
                                                + inputTransformation.getName()
                                                + "\" contains multiple inputs.");
                            }

                            return ((DataStream<IterationRecord<?>>) dataStream)
                                    .transform(
                                            "tail-" + dataStream.getTransformation().getName(),
                                            new IterationRecordTypeInfo(dataStream.getType()),
                                            new TailOperator(iterationId, startIndex + index))
                                    .setParallelism(dataStream.getParallelism());
                        }));
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        return new DataStreamList(
                map(
                        dataStreams,
                        (index, dataStream) -> {
                            IterationRecordTypeInfo<?> inputType =
                                    (IterationRecordTypeInfo<?>) dataStream.getType();
                            return dataStream
                                    .union(
                                            tailsUnion
                                                    .map(x -> x)
                                                    .name(
                                                            "tail-map-"
                                                                    + dataStream
                                                                            .getTransformation()
                                                                            .getName())
                                                    .returns(inputType)
                                                    .setParallelism(1))
                                    .transform(
                                            "output-" + dataStream.getTransformation().getName(),
                                            inputType.getInnerTypeInfo(),
                                            new OutputOperator())
                                    .setParallelism(dataStream.getParallelism());
                        }));
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
        List<R> results = new ArrayList<>(dataStreams.size());
        for (int i = 0; i < dataStreams.size(); ++i) {
            DataStream<?> dataStream = dataStreams.get(i);
            results.add(mapper.apply(i, dataStream));
        }

        return results;
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
        try {
            if (targetInterface.isAssignableFrom(operator.getClass())) {
                action.accept((T) operator);
            } else if (operator instanceof AbstractUdfStreamOperator<?, ?>) {
                Object udf = ((AbstractUdfStreamOperator<?, ?>) operator).getUserFunction();
                if (targetInterface.isAssignableFrom(udf.getClass())) {
                    action.accept((T) udf);
                }
            }
        } catch (Exception e) {
            ExceptionUtils.rethrow(e);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
StreamConfig wrappedConfig = new StreamConfig(config.getConfiguration().clone());
        for (int i = 0; i < wrappedConfig.getNumberOfNetworkInputs(); ++i) {
            KeySelector keySelector = config.getStatePartitioner(i, cl);
            if (keySelector != null) {
                checkState(
                        keySelector instanceof ProxyKeySelector,
                        "The state partitioner for the wrapper operator should always be ProxyKeySelector, but it is "
                                + keySelector);
                wrappedConfig.setStatePartitioner(
                        i, ((ProxyKeySelector) keySelector).getWrappedKeySelector());
            }
        }

        StreamConfig.InputConfig[] inputs = config.getInputs(cl);
        for (int i = 0; i < inputs.length; ++i) {
            if (inputs[i] instanceof NetworkInputConfig) {
                TypeSerializer<?> typeSerializerIn =
                        ((NetworkInputConfig) inputs[i]).getTypeSerializer();
                checkState(
                        typeSerializerIn instanceof IterationRecordSerializer,
                        "The serializer of input[%s] should be IterationRecordSerializer but it is %s.",
                        i,
                        typeSerializerIn);
                inputs[i] =
                        new NetworkInputConfig(
                                ((IterationRecordSerializer<?>) typeSerializerIn)
                                        .getInnerSerializer(),
                                i);
            }
        }
        wrappedConfig.setInputs(inputs);

        TypeSerializer<?> typeSerializerOut = config.getTypeSerializerOut(cl);
        checkState(
                typeSerializerOut instanceof IterationRecordSerializer,
                "The serializer of output should be IterationRecordSerializer but it is %s.",
                typeSerializerOut);
        wrappedConfig.setTypeSerializerOut(
                ((IterationRecordSerializer<?>) typeSerializerOut).getInnerSerializer());
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
        String pathStr = configuration.get(IterationOptions.DATA_CACHE_PATH);
        if (pathStr == null) {
            Random random = new Random();
            final String localSpillPath = localSpillPaths[random.nextInt(localSpillPaths.length)];
            pathStr = Paths.get(localSpillPath).toUri().toString();
        }
        return new Path(pathStr);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
        S wrappedOperator = wrappedOperators.get(round);
        if (wrappedOperator != null) {
            return wrappedOperator;
        }

        // We need to clone the operator factory to also support SimpleOperatorFactory.
        try {
            StreamOperatorFactory<T> clonedOperatorFactory =
                    InstantiationUtil.clone(
                            operatorFactory, containingTask.getUserCodeClassLoader());
            wrappedOperator =
                    (S)
                            StreamOperatorFactoryUtil.<T, S>createOperator(
                                            clonedOperatorFactory,
                                            (StreamTask) parameters.getContainingTask(),
                                            OperatorUtils.createWrappedOperatorConfig(
                                                    parameters.getStreamConfig(),
                                                    containingTask.getUserCodeClassLoader()),
                                            proxyOutput,
                                            parameters.getOperatorEventDispatcher())
                                    .f0;
            initializeStreamOperator(wrappedOperator, round, rawOperatorStates, count);
            wrappedOperators.put(round, wrappedOperator);
            return wrappedOperator;
        } catch (Exception e) {
            ExceptionUtils.rethrow(e);
        }

        return wrappedOperator;
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
        setIterationContextRound(epoch);
        OperatorUtils.processOperatorOrUdfIfSatisfy(
                operator,
                IterationListener.class,
                listener -> notifyEpochWatermarkIncrement(listener, epochWatermark));
        endInputAndEmitMaxWatermark(operator, epoch, epochWatermark);
        operator.finish();
        operator.close();
        setIterationContextRound(null);

        // Cleanup the states used by this operator.
        cleanupOperatorStates(epoch);

        if (stateHandler.getKeyedStateBackend() != null) {
            cleanupKeyedStates(epoch);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
        checkState(epochWatermark >= 0, "The epoch watermark should be non-negative.");
        if (epochWatermark > latestEpochWatermark) {
            latestEpochWatermark = epochWatermark;

            // Destroys all the operators with round < epoch watermark. Notes that
            // the onEpochWatermarkIncrement must be from 0 and increment by 1 each time, except
            // for the last round.
            try {
                if (epochWatermark < Integer.MAX_VALUE) {
                    S wrappedOperator = wrappedOperators.remove(epochWatermark);
                    if (wrappedOperator != null) {
                        closeStreamOperator(wrappedOperator, epochWatermark, epochWatermark);
                    }
                } else {
                    List<Integer> sortedEpochs = new ArrayList<>(wrappedOperators.keySet());
                    Collections.sort(sortedEpochs);
                    for (Integer epoch : sortedEpochs) {
                        closeStreamOperator(wrappedOperators.remove(epoch), epoch, epochWatermark);
                    }
                }
            } catch (Exception exception) {
                ExceptionUtils.rethrow(exception);
            }
        }

        super.onEpochWatermarkIncrement(epochWatermark);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
        final TypeSerializer<?> keySerializer =
                streamConfig.getStateKeySerializer(containingTask.getUserCodeClassLoader());

        streamOperatorStateContext =
                streamTaskStateManager.streamOperatorStateContext(
                        getOperatorID(),
                        getClass().getSimpleName(),
                        parameters.getProcessingTimeService(),
                        this,
                        keySerializer,
                        containingTask.getCancelables(),
                        metrics,
                        streamConfig.getManagedMemoryFractionOperatorUseCaseOfSlot(
                                ManagedMemoryUseCase.STATE_BACKEND,
                                containingTask
                                        .getEnvironment()
                                        .getTaskManagerInfo()
                                        .getConfiguration(),
                                containingTask.getUserCodeClassLoader()),
                        isUsingCustomRawKeyedState());

        stateHandler =
                new StreamOperatorStateHandler(
                        streamOperatorStateContext,
                        containingTask.getExecutionConfig(),
                        containingTask.getCancelables());
        stateHandler.initializeOperatorState(this);
        this.timeServiceManager = streamOperatorStateContext.internalTimerServiceManager();

        stateKeySelector1 =
                streamConfig.getStatePartitioner(0, containingTask.getUserCodeClassLoader());
        stateKeySelector2 =
                streamConfig.getStatePartitioner(1, containingTask.getUserCodeClassLoader());
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
parallelismState =
                context.getOperatorStateStore()
                        .getUnionListState(
                                new ListStateDescriptor<>("parallelism", IntSerializer.INSTANCE));
        OperatorStateUtils.getUniqueElement(parallelismState, "parallelism")
                .ifPresent(
                        oldParallelism ->
                                checkState(
                                        oldParallelism
                                                == containingTask
                                                        .getEnvironment()
                                                        .getTaskInfo()
                                                        .getNumberOfParallelSubtasks(),
                                        "The all-round wrapper operator is recovered with parallelism changed from "
                                                + oldParallelism
                                                + " to "
                                                + containingTask
                                                        .getEnvironment()
                                                        .getTaskInfo()
                                                        .getNumberOfParallelSubtasks()));

        latestEpochWatermarkState =
                context.getOperatorStateStore()
                        .getListState(
                                new ListStateDescriptor<>("latestEpoch", IntSerializer.INSTANCE));
        OperatorStateUtils.getUniqueElement(latestEpochWatermarkState, "latestEpoch")
                .ifPresent(
                        oldLatestEpochWatermark -> latestEpochWatermark = oldLatestEpochWatermark);

        // Notes that the list must be sorted.
        rawStateEpochState =
                context.getOperatorStateStore()
                        .getListState(new ListStateDescriptor<>("rawStateEpoch", Integer.class));
        List<Integer> rawStateEpochs = IteratorUtils.toList(rawStateEpochState.get().iterator());

        // Notes that the list must be sorted.
        pendingEpochState =
                context.getOperatorStateStore()
                        .getListState(
                                new ListStateDescriptor<>("pendingEpochs", IntSerializer.INSTANCE));
        List<Integer> pendingEpochs = IteratorUtils.toList(pendingEpochState.get().iterator());

        // Unfortunately, for the raw state we could not call get input stream unless the previous
        // records are consumed. We would have to do a "merge" of the two lists.
        Iterator<StatePartitionStreamProvider> rawStates =
                context.getRawOperatorStateInputs().iterator();

        int nextRawStateEntryIndex = 0;
        for (int epoch : pendingEpochs) {
            checkState(
                    nextRawStateEntryIndex == rawStateEpochs.size()
                            || rawStateEpochs.get(nextRawStateEntryIndex) >= epoch,
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
            while (nextRawStateEntryIndex < rawStateEpochs.size()
                    && rawStateEpochs.get(nextRawStateEntryIndex) == epoch) {
                numberOfStateEntries++;
                nextRawStateEntryIndex++;
            }

            // We first open these operators
            getWrappedOperator(epoch, rawStates, numberOfStateEntries);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
OperatorStateCheckpointOutputStream rawOperatorStateOutputStream =
                context.getRawOperatorStateOutput();
        List<Integer> operatorStateEpoch = new ArrayList<>();

        List<Integer> sortedEpochs = new ArrayList<>(wrappedOperators.keySet());
        Collections.sort(sortedEpochs);

        for (int epoch : sortedEpochs) {
            S wrappedOperator = wrappedOperators.get(epoch);
            if (StreamOperatorStateHandler.CheckpointedStreamOperator.class.isAssignableFrom(
                    wrappedOperator.getClass())) {
                ((StreamOperatorStateHandler.CheckpointedStreamOperator) wrappedOperator)
                        .snapshotState(new ProxyStateSnapshotContext(context));

                // Gets the count of the raw operator state.
                int numberOfPartitions = rawOperatorStateOutputStream.getNumberOfPartitions();
                while (operatorStateEpoch.size() < numberOfPartitions) {
                    operatorStateEpoch.add(epoch);
                }
            }
        }

        // Then snapshot our own states
        // Always clear the union list state before set value.
        parallelismState.clear();
        if (containingTask.getEnvironment().getTaskInfo().getIndexOfThisSubtask() == 0) {
            parallelismState.update(
                    Collections.singletonList(
                            containingTask
                                    .getEnvironment()
                                    .getTaskInfo()
                                    .getNumberOfParallelSubtasks()));
        }
        latestEpochWatermarkState.update(Collections.singletonList(latestEpochWatermark));

        // The list must be sorted
        rawStateEpochState.update(operatorStateEpoch);

        // The list must be sorted
        pendingEpochState.update(sortedEpochs);
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
try {
            Configuration taskManagerConfig =
                    containingTask.getEnvironment().getTaskManagerInfo().getConfiguration();
            int historySize = taskManagerConfig.getInteger(MetricOptions.LATENCY_HISTORY_SIZE);
            if (historySize <= 0) {
                LOG.warn(
                        "{} has been set to a value equal or below 0: {}. Using default.",
                        MetricOptions.LATENCY_HISTORY_SIZE,
                        historySize);
                historySize = MetricOptions.LATENCY_HISTORY_SIZE.defaultValue();
            }

            final String configuredGranularity =
                    taskManagerConfig.getString(MetricOptions.LATENCY_SOURCE_GRANULARITY);
            LatencyStats.Granularity granularity;
            try {
                granularity =
                        LatencyStats.Granularity.valueOf(
                                configuredGranularity.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException iae) {
                granularity = LatencyStats.Granularity.OPERATOR;
                LOG.warn(
                        "Configured value {} option for {} is invalid. Defaulting to {}.",
                        configuredGranularity,
                        MetricOptions.LATENCY_SOURCE_GRANULARITY.key(),
                        granularity);
            }
            MetricGroup jobMetricGroup = this.metrics.getJobMetricGroup();
            return new LatencyStats(
                    jobMetricGroup.addGroup("latency"),
                    historySize,
                    containingTask.getIndexInSubtaskGroup(),
                    getOperatorID(),
                    granularity);
        } catch (Exception e) {
            LOG.warn("An error occurred while instantiating latency metrics.", e);
            return new LatencyStats(
                    UnregisteredMetricGroups.createUnregisteredTaskManagerJobMetricGroup()
                            .addGroup("latency"),
                    1,
                    0,
                    new OperatorID(),
                    LatencyStats.Granularity.SINGLE);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
        String roundPrefix = getRoundStatePrefix(round);
        OperatorStateBackend operatorStateBackend = stateHandler.getOperatorStateBackend();

        if (operatorStateBackend instanceof DefaultOperatorStateBackend) {
            for (String fieldNames :
                    new String[] {
                        "registeredOperatorStates",
                        "registeredBroadcastStates",
                        "accessedStatesByName",
                        "accessedBroadcastStatesByName"
                    }) {
                Map<String, ?> field =
                        ReflectionUtils.getFieldValue(
                                operatorStateBackend,
                                DefaultOperatorStateBackend.class,
                                fieldNames);
                field.entrySet().removeIf(entry -> entry.getKey().startsWith(roundPrefix));
            }
        } else {
            LOG.warn("Unable to cleanup the operator state {}", operatorStateBackend);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
            RocksDB db =
                    ReflectionUtils.getFieldValue(
                            keyedStateBackend, RocksDBKeyedStateBackend.class, "db");
            HashMap<String, RocksDBKeyedStateBackend.RocksDbKvStateInfo> kvStateInformation =
                    ReflectionUtils.getFieldValue(
                            keyedStateBackend,
                            RocksDBKeyedStateBackend.class,
                            "kvStateInformation");
            kvStateInformation.entrySet().stream()
                    .filter(entry -> entry.getKey().startsWith(roundPrefix))
                    .forEach(
                            entry -> {
                                try {
                                    db.dropColumnFamily(entry.getValue().columnFamilyHandle);
                                } catch (Exception e) {
                                    LOG.error(
                                            "Failed to drop state {} for round {}",
                                            entry.getKey(),
                                            round);
                                }
                            });
            kvStateInformation.entrySet().removeIf(entry -> entry.getKey().startsWith(roundPrefix));
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/proxy/state/ProxyKeyedStateBackend.java`
#### Snippet
```java
switch (descriptor.getType()) {
            case VALUE:
                {
                    return (StateDescriptor<S, T>)
                            new ValueStateDescriptor<>(
                                    stateNamePrefix.prefix(descriptor.getName()),
                                    descriptor.getSerializer());
                }
            case LIST:
                {
                    ListStateDescriptor<T> listStateDescriptor =
                            (ListStateDescriptor<T>) descriptor;
                    return (StateDescriptor<S, T>)
                            new ListStateDescriptor<>(
                                    stateNamePrefix.prefix(listStateDescriptor.getName()),
                                    listStateDescriptor.getElementSerializer());
                }
            case REDUCING:
                {
                    ReducingStateDescriptor<T> reducingStateDescriptor =
                            (ReducingStateDescriptor<T>) descriptor;
                    return (StateDescriptor<S, T>)
                            new ReducingStateDescriptor<>(
                                    stateNamePrefix.prefix(reducingStateDescriptor.getName()),
                                    reducingStateDescriptor.getReduceFunction(),
                                    reducingStateDescriptor.getSerializer());
                }
            case AGGREGATING:
                {
                    AggregatingStateDescriptor<?, ?, T> aggregatingStateDescriptor =
                            (AggregatingStateDescriptor<?, ?, T>) descriptor;
                    return new AggregatingStateDescriptor(
                            stateNamePrefix.prefix(aggregatingStateDescriptor.getName()),
                            aggregatingStateDescriptor.getAggregateFunction(),
                            aggregatingStateDescriptor.getSerializer());
                }
            case MAP:
                {
                    MapStateDescriptor<?, Map<?, ?>> mapStateDescriptor =
                            (MapStateDescriptor<?, Map<?, ?>>) descriptor;
                    return new MapStateDescriptor(
                            stateNamePrefix.prefix(mapStateDescriptor.getName()),
                            mapStateDescriptor.getKeySerializer(),
                            mapStateDescriptor.getValueSerializer());
                }
            default:
                throw new UnsupportedOperationException("Unsupported state type");
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
        int indexOfThisSubtask = getRuntimeContext().getIndexOfThisSubtask();
        int attemptNum = getRuntimeContext().getAttemptNumber();
        FeedbackKey<StreamRecord<IterationRecord<?>>> feedbackKey =
                OperatorUtils.createFeedbackKey(iterationId, feedbackIndex);
        SubtaskFeedbackKey<StreamRecord<IterationRecord<?>>> key =
                feedbackKey.withSubTaskIndex(indexOfThisSubtask, attemptNum);
        FeedbackChannelBroker broker = FeedbackChannelBroker.get();
```

### DuplicatedCode
Duplicated code
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
        switch (element.getValue().getType()) {
            case RECORD:
                reusedInput.replace(element.getValue().getValue(), element.getTimestamp());
                setIterationContextRound(element.getValue().getEpoch());
                processor.accept(reusedInput);
                clearIterationContextRound();
                break;
            case EPOCH_WATERMARK:
                onEpochWatermarkEvent(inputIndex, element.getValue());
                break;
            default:
                throw new FlinkRuntimeException("Not supported iteration record type: " + element);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVC.java`
#### Snippet
```java
        DataStream<DenseVector> initModelData =
                DataStreamUtils.reduce(
                                trainData.map(x -> x.getFeatures().size()),
                                (ReduceFunction<Integer>)
                                        (t0, t1) -> {
                                            Preconditions.checkState(
                                                    t0.equals(t1),
                                                    "The training data should all have same dimensions.");
                                            return t0;
                                        })
                        .map(DenseVector::new);

        Optimizer optimizer =
                new SGD(
                        getMaxIter(),
                        getLearningRate(),
                        getGlobalBatchSize(),
                        getTol(),
                        getReg(),
                        getElasticNet());
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/bucketizer/Bucketizer.java`
#### Snippet
```java
        RowTypeInfo inputTypeInfo = TableUtils.getRowTypeInfo(inputs[0].getResolvedSchema());
        TypeInformation<?>[] outputTypes = new TypeInformation[outputCols.length];
        Arrays.fill(outputTypes, BasicTypeInfo.DOUBLE_TYPE_INFO);
        RowTypeInfo outputTypeInfo =
                new RowTypeInfo(
                        ArrayUtils.addAll(inputTypeInfo.getFieldTypes(), outputTypes),
                        ArrayUtils.addAll(inputTypeInfo.getFieldNames(), getOutputCols()));
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/elementwiseproduct/ElementwiseProduct.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) inputs[0]).getTableEnvironment();
        RowTypeInfo inputTypeInfo = TableUtils.getRowTypeInfo(inputs[0].getResolvedSchema());
        RowTypeInfo outputTypeInfo =
                new RowTypeInfo(
                        ArrayUtils.addAll(inputTypeInfo.getFieldTypes(), VectorTypeInfo.INSTANCE),
                        ArrayUtils.addAll(inputTypeInfo.getFieldNames(), getOutputCol()));
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/idf/IDF.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        final String inputCol = getInputCol();
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) inputs[0]).getTableEnvironment();

        DataStream<Vector> inputData =
                tEnv.toDataStream(inputs[0])
                        .map(
                                (MapFunction<Row, Vector>)
                                        value -> ((Vector) value.getField(inputCol)),
                                VectorTypeInfo.INSTANCE);
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
                double width = (max - min) / numBins;
                binEdges[columnId] = new double[numBins + 1];
                binEdges[columnId][0] = min;
                for (int edgeId = 1; edgeId < numBins + 1; edgeId++) {
                    binEdges[columnId][edgeId] = binEdges[columnId][edgeId - 1] + width;
                }
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScaler.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        final String inputCol = getInputCol();
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) inputs[0]).getTableEnvironment();
        DataStream<DenseVector> inputData =
                tEnv.toDataStream(inputs[0])
                        .map(
                                (MapFunction<Row, DenseVector>)
                                        value -> ((Vector) value.getField(inputCol)).toDense());
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/robustscaler/RobustScalerModel.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) inputs[0]).getTableEnvironment();
        DataStream<Row> inputStream = tEnv.toDataStream(inputs[0]);

        RowTypeInfo inputTypeInfo = TableUtils.getRowTypeInfo(inputs[0].getResolvedSchema());
        RowTypeInfo outputTypeInfo =
                new RowTypeInfo(
                        ArrayUtils.addAll(inputTypeInfo.getFieldTypes(), VectorTypeInfo.INSTANCE),
                        ArrayUtils.addAll(inputTypeInfo.getFieldNames(), getOutputCol()));
        final String broadcastModelKey = "broadcastModelKey";
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScaler.java`
#### Snippet
```java
                if (numElements == 0) {
                    sum = new DenseVector(inputVec.size());
                    squaredSum = new DenseVector(inputVec.size());
                }
                BLAS.axpy(1, inputVec, sum);
                BLAS.hDot(inputVec, inputVec);
                BLAS.axpy(1, inputVec, squaredSum);
                numElements++;
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScaler.java`
#### Snippet
```java
        BLAS.scal(1.0 / numElements, sum);
        double[] mean = sum.values;
        double[] std = squaredSum.values;
        if (numElements > 1) {
            for (int i = 0; i < mean.length; i++) {
                std[i] =
                        Math.sqrt(
                                (squaredSum.values[i] - numElements * mean[i] * mean[i])
                                        / (numElements - 1));
            }
        } else {
            Arrays.fill(std, 0.0);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScalerModel.java`
#### Snippet
```java
            mean = modelData.mean;
            DenseVector std = modelData.std;

            if (withStd) {
                scale = std;
                double[] scaleValues = scale.values;
                for (int i = 0; i < scaleValues.length; i++) {
                    scaleValues[i] = scaleValues[i] == 0 ? 0 : 1 / scaleValues[i];
                }
            }
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/StandardScaler.java`
#### Snippet
```java
            super.initializeState(context);
            sumState =
                    context.getOperatorStateStore()
                            .getListState(
                                    new ListStateDescriptor<>(
                                            "sumState", TypeInformation.of(DenseVector.class)));
            squaredSumState =
                    context.getOperatorStateStore()
                            .getListState(
                                    new ListStateDescriptor<>(
                                            "squaredSumState",
                                            TypeInformation.of(DenseVector.class)));
            numElementsState =
                    context.getOperatorStateStore()
                            .getListState(
                                    new ListStateDescriptor<>(
                                            "numElementsState", BasicTypeInfo.LONG_TYPE_INFO));

            sum = OperatorStateUtils.getUniqueElement(sumState, "sumState").orElse(null);
            squaredSum =
                    OperatorStateUtils.getUniqueElement(squaredSumState, "squaredSumState")
                            .orElse(null);
            numElements =
                    OperatorStateUtils.getUniqueElement(numElementsState, "numElementsState")
                            .orElse(0L);
```

### DuplicatedCode
Duplicated code
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stringindexer/IndexToStringModel.java`
#### Snippet
```java
        Preconditions.checkArgument(inputs.length == 1);
        String[] inputCols = getInputCols();
        String[] outputCols = getOutputCols();
        Preconditions.checkArgument(inputCols.length == outputCols.length);
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) modelDataTable).getTableEnvironment();

        RowTypeInfo inputTypeInfo = TableUtils.getRowTypeInfo(inputs[0].getResolvedSchema());
        TypeInformation<?>[] outputTypes = new TypeInformation[outputCols.length];
```

### DuplicatedCode
Duplicated code
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ParamUtils.java`
#### Snippet
```java
        T instance = InstantiationUtil.instantiate(clazz);

        Map<String, Param<?>> nameToParam = new HashMap<>();
        for (Param<?> param : ParamUtils.getPublicFinalParamFields(instance)) {
            nameToParam.put(param.name, param);
        }
```

### DuplicatedCode
Duplicated code
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ParamUtils.java`
#### Snippet
```java
        if (jsonMap.containsKey("paramMap")) {
            Map<String, Object> paramMap = (Map<String, Object>) jsonMap.get("paramMap");
            for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
                Param<?> param = nameToParam.get(entry.getKey());
                ParamUtils.setParam(instance, param, param.jsonDecode(entry.getValue()));
            }
        }

        return instance;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `flink-ml-core/src/main/java/org/apache/flink/ml/api/AlgoOperator.java`
#### Snippet
```java
     *
     * @param inputs a list of tables
     * @return a list of tables
     */
    Table[] transform(Table... inputs);
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `flink-ml-core/src/main/java/org/apache/flink/ml/api/Model.java`
#### Snippet
```java
     * model data changes.
     *
     * @return a list of tables
     */
    default Table[] getModelData() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/PipelineModel.java`
#### Snippet
```java
     *
     * @param inputs a list of tables
     * @return a list of tables
     */
    @Override
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
    public static Map<String, Map<String, Map<String, ?>>> parseJsonFile(String path)
            throws IOException {
        InputStream inputStream = new FileInputStream(path);
        Map<String, ?> jsonMap = ReadWriteUtils.OBJECT_MAPPER.readValue(inputStream, Map.class);
        Preconditions.checkArgument(
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java

        @Override
        protected TypeSerializer<?>[] getNestedSerializers(
                IterationRecordSerializer<T> iterationRecordSerializer) {
            return new TypeSerializer[] {iterationRecordSerializer.getInnerSerializer()};
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java

        @Override
        protected int getCurrentOuterSnapshotVersion() {
            return CURRENT_VERSION;
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java

        @Override
        protected IterationRecordSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] typeSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) typeSerializers[0];
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementSerializer.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        protected CacheElementSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] typeSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) typeSerializers[0];
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementSerializer.java`
#### Snippet
```java

        @Override
        protected int getCurrentOuterSnapshotVersion() {
            return CURRENT_VERSION;
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementSerializer.java`
#### Snippet
```java

        @Override
        protected TypeSerializer<?>[] getNestedSerializers(
                CacheElementSerializer<T> tIterationRecordSerializer) {
            return new TypeSerializer[] {tIterationRecordSerializer.recordSerializer};
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected void writeOuterSnapshot(DataOutputView out) throws IOException {
            final DataOutputViewStream stream = new DataOutputViewStream(out);
            InstantiationUtil.serializeObject(stream, comparator);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected void readOuterSnapshot(
                int readOuterSnapshotVersion, DataInputView in, ClassLoader userCodeClassLoader)
                throws IOException {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected OuterSchemaCompatibility resolveOuterSchemaCompatibility(
                PriorityQueueSerializer<T> newSerializer) {
            return (this.comparator.getClass() == newSerializer.comparator.getClass())
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected int getCurrentOuterSnapshotVersion() {
            return CURRENT_VERSION;
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected PriorityQueueSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] nestedSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) nestedSerializers[0];
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

        @Override
        protected TypeSerializer<?>[] getNestedSerializers(
                PriorityQueueSerializer<T> outerSerializer) {
            return new TypeSerializer[] {outerSerializer.elementSerializer};
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphExecutionHelper.java`
#### Snippet
```java
        for (GraphNode node : nodes) {
            List<TableId> inputs = new ArrayList<>();
            inputs.addAll(Arrays.asList(node.algoOpInputIds));
            if (node.estimatorInputIds != null) {
                inputs.addAll(Arrays.asList(node.estimatorInputIds));
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java
                                .limit(itemNums)
                                .map(tuple2 -> "" + tuple2.f0 + commaDelimiter + tuple2.f1)
                                .collect(Collectors.joining("" + semicolonDelimiter));
                output.collect(new StreamRecord<>(Row.of(mainItem, itemList)));
            }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`status == HeadOperator.HeadOperatorStatus.RUNNING
? false
: true` can be simplified to 'status!=HeadOperator.HeadOperatorStatus.RUNNING'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperatorCheckpointAligner.java`
#### Snippet
```java
                                new CheckpointAlignment(
                                        true,
                                        status == HeadOperator.HeadOperatorStatus.RUNNING
                                                ? false
                                                : true));
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
                    (round, wrappedOperator) -> {
                        operatorInputsByEpoch
                                .get(round)
                                .get(inputIndex)
                                .processWatermarkStatus(watermarkStatus);
```

### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
            processForEachWrappedOperator(
                    (round, wrappedOperator) -> {
                        operatorInputsByEpoch.get(round).get(inputIndex).processWatermark(mark);
                    });
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/IterationBodyResult.java`
#### Snippet
```java
     * with the feedback variable streams to determine when the iteration should terminate.
     */
    private final @Nullable DataStream<?> terminationCriteria;

    public IterationBodyResult(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
    private DataCacheWriter<T> dataCacheWriter;

    @Nullable private DataCacheReader<T> currentDataCacheReader;

    private int currentEpoch;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheReader.java`
#### Snippet
```java

    /** The current reader for next records. */
    @Nullable private SegmentReader<T> currentSegmentReader;

    /** The index of the segment that current reader reads from. */
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentReader.java`
#### Snippet
```java

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int readLen = 0;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    /** An optional pool that provide memory segments to hold cached records in memory. */
    @Nullable private final MemorySegmentPool segmentPool;

    /** The segments that contain previously added records. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    /** The current writer for new records. */
    @Nullable private SegmentWriter<T> currentSegmentWriter;

    public DataCacheWriter(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
     * segments from the beginning.
     */
    @Nullable private final Tuple2<Integer, Integer> readerPosition;

    /** The segments to be snapshot or recovered from. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
    public final TableId[] outputIds;
    public final @Nullable TableId[] inputModelDataIds;
    public final @Nullable TableId[] outputModelDataIds;

    public GraphData(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
    public final TableId[] modelInputIds;
    public final TableId[] outputIds;
    public final @Nullable TableId[] inputModelDataIds;
    public final @Nullable TableId[] outputModelDataIds;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
public class GraphData {
    public final List<GraphNode> nodes;
    public final @Nullable TableId[] estimatorInputIds;
    public final TableId[] modelInputIds;
    public final TableId[] outputIds;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

    public Graph(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public final TableId[] algoOpInputIds;
    public final TableId[] outputIds;
    public @Nullable TableId[] inputModelDataIds;
    public @Nullable TableId[] outputModelDataIds;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public @Nullable Stage<?> stage;
    public final StageType stageType;
    public final @Nullable TableId[] estimatorInputIds;
    public final TableId[] algoOpInputIds;
    public final TableId[] outputIds;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java

    public final int nodeId;
    public @Nullable Stage<?> stage;
    public final StageType stageType;
    public final @Nullable TableId[] estimatorInputIds;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public final TableId[] outputIds;
    public @Nullable TableId[] inputModelDataIds;
    public @Nullable TableId[] outputModelDataIds;

    public GraphNode(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] inputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/lossfunc/HingeLoss.java`
#### Snippet
```java
 * The loss function for hinge loss. See {@link LinearSVC} for example.
 *
 * <p>See https://en.wikipedia.org/wiki/Hinge_loss.
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/RegularizationUtils.java`
#### Snippet
```java
 * <p>elasticNet * reg * norm1(coefficient) + (1 - elasticNet) * (reg/2) * (norm2(coefficient))^2
 *
 * <p>See https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.ElasticNet.html.
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java
 * to the gradient at each step, to decrease the error of the model.
 *
 * <p>See https://en.wikipedia.org/wiki/Stochastic_gradient_descent.
 */
@Internal
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/dct/DCT.java`
#### Snippet
```java
 * The return vector is scaled such that the transform matrix is unitary (aka scaled DCT-II).
 *
 * <p>See https://en.wikipedia.org/wiki/Discrete_cosine_transform#DCT-II(DCT-II in Discrete cosine
 * transform).
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/idf/IDF.java`
#### Snippet
```java
 * IDFParams#getMinDocFreq()}.
 *
 * <p>See https://en.wikipedia.org/wiki/Tf%E2%80%93idf.
 */
public class IDF implements Estimator<IDF, IDFModel>, IDFParams<IDF> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java
 * Helper class to compute an approximate quantile summary. This implementation is based on the
 * algorithm proposed in the paper: "Space-efficient Online Computation of Quantile Summaries" by
 * Greenwald, Michael and Khanna, Sanjeev. (https://doi.org/10.1145/375663.375670)
 */
@TypeInfo(QuantileSummaryTypeInfoFactory.class)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/ngram/NGram.java`
#### Snippet
```java
 * `n`, no n-grams are returned.
 *
 * <p>See https://en.wikipedia.org/wiki/N-gram.
 */
public class NGram implements Transformer<NGram>, NGramParams<NGram> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/hashingtf/HashingTF.java`
#### Snippet
```java
 * HashingTFParams#BINARY} as true.
 *
 * <p>For the hashing trick, see https://en.wikipedia.org/wiki/Feature_hashing for details.
 */
public class HashingTF implements Transformer<HashingTF>, HashingTFParams<HashingTF> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScaler.java`
#### Snippet
```java
 * <p>For the case \(E_{max} == E_{min}\), \(Rescaled(value) = 0.5 * (max + min)\).
 *
 * <p>See https://en.wikipedia.org/wiki/Feature_scaling#Rescaling_(min-max_normalization).
 */
public class MinMaxScaler
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
 * </ul>
 *
 * <p>See: http://en.wikipedia.org/wiki/Chi-squared_test.
 */
public class ChiSqTest implements AlgoOperator<ChiSqTest>, ChiSqTestParams<ChiSqTest> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/featurehasher/FeatureHasher.java`
#### Snippet
```java
 *
 * <p>If multiple features are projected into the same column, the output values are accumulated.
 * For the hashing trick, see https://en.wikipedia.org/wiki/Feature_hashing for details.
 */
public class FeatureHasher
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoder.java`
#### Snippet
```java
 * OneHotEncoderParams}.
 *
 * <p>See https://en.wikipedia.org/wiki/One-hot.
 */
public class OneHotEncoder
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/polynomialexpansion/PolynomialExpansion.java`
#### Snippet
```java
 *
 * <p>For more information about the polynomial expansion, see
 * http://en.wikipedia.org/wiki/Polynomial_expansion.
 */
public class PolynomialExpansion
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeans.java`
#### Snippet
```java
 * An Estimator which implements the k-means clustering algorithm.
 *
 * <p>See https://en.wikipedia.org/wiki/K-means_clustering.
 */
public class KMeans implements Estimator<KMeans, KMeansModel>, KMeansParams<KMeans> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/regression/linearregression/LinearRegression.java`
#### Snippet
```java
 * An Estimator which implements the linear regression algorithm.
 *
 * <p>See https://en.wikipedia.org/wiki/Linear_regression.
 */
public class LinearRegression
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/Knn.java`
#### Snippet
```java
 * An Estimator which implements the KNN algorithm.
 *
 * <p>See: https://en.wikipedia.org/wiki/K-nearest_neighbors_algorithm.
 */
public class Knn implements Estimator<Knn, KnnModel>, KnnParams<Knn> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVC.java`
#### Snippet
```java
 * An Estimator which implements the linear support vector classification.
 *
 * <p>See https://en.wikipedia.org/wiki/Support-vector_machine#Linear_SVM.
 */
public class LinearSVC implements Estimator<LinearSVC, LinearSVCModel>, LinearSVCParams<LinearSVC> {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/agglomerativeclustering/AgglomerativeClustering.java`
#### Snippet
```java
 * each element depends only on the elements in the same mini-batch.
 *
 * <p>See https://en.wikipedia.org/wiki/Hierarchical_clustering.
 */
public class AgglomerativeClustering
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/LogisticRegression.java`
#### Snippet
```java
 * An Estimator which implements the logistic regression algorithm.
 *
 * <p>See https://en.wikipedia.org/wiki/Logistic_regression.
 */
public class LogisticRegression
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegression.java`
#### Snippet
```java
     * whole vector, which can get a better convergence.
     *
     * <p>See https://www.tensorflow.org/api_docs/python/tf/keras/optimizers/Ftrl
     *
     * <p>todo: makes ftrl to be a common optimizer and place it in org.apache.flink.ml.common.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java
 * An Estimator which implements the naive bayes classification algorithm.
 *
 * <p>See https://en.wikipedia.org/wiki/Naive_Bayes_classifier.
 */
public class NaiveBayes
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScaler.java`
#### Snippet
```java

        boolean isEventTimeBasedTraining = false;
        if (windows instanceof EventTimeTumblingWindows
                || windows instanceof EventTimeSessionWindows) {
            isEventTimeBasedTraining = true;
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'sequential()' call: the stream was created via 'stream()', so it's already sequential
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java
                String itemList =
                        itemAndScore.stream()
                                .sequential()
                                .limit(itemNums)
                                .map(tuple2 -> "" + tuple2.f0 + commaDelimiter + tuple2.f1)
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'DataInputStream' used without 'try'-with-resources statement
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            InputStream inputStream = inputs.get(0).getStream();
            DataInputStream dis =
                    new DataInputStream(new NonClosingInputStreamDecorator(inputStream));
            Preconditions.checkState(dis.readInt() == numInputs, "Number of input is wrong.");
            for (int i = 0; i < numInputs; i++) {
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'dataType instanceof PickledByteArrayTypeInfo' covered by subsequent condition 'dataType instanceof BasicTypeInfo'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                // Serialization of float type with pickler loses precision.
                return pickler.dumps(String.valueOf(obj));
            } else if (dataType instanceof PickledByteArrayTypeInfo
                    || dataType instanceof BasicTypeInfo) {
                return pickler.dumps(obj);
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/featurehasher/FeatureHasher.java`
#### Snippet
```java
        List<String> categoricalList = Arrays.asList(categoricalCols);
        List<String> inputList = Arrays.asList(inputCols);
        if (categoricalCols.length > 0 && !inputList.containsAll(categoricalList)) {
            throw new IllegalArgumentException("CategoricalCols must be included in inputCols!");
        }
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.apache.flink.ml.linalg.typeinfo.SparseVectorTypeInfo\[\]' expected, 'TypeInformation\[\]' found
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
                                Collections.nCopies(
                                                outputCols.length, SparseVectorTypeInfo.INSTANCE)
                                        .toArray(new TypeInformation[0])),
                        ArrayUtils.addAll(inputTypeInfo.getFieldNames(), outputCols));

```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stringindexer/StringIndexer.java`
#### Snippet
```java
                                        + ".");
                }
                stringArrays[i] = stringsAndCnts.stream().map(x -> x.f0).toArray(String[]::new);
            }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `dataStreams.get(...)` to `DataStream` is redundant
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/DataStreamList.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public <T> DataStream<T> get(int index) {
        return (DataStream<T>) dataStreams.get(index);
    }

```

### RedundantCast
Casting `record` to `StreamRecord` is redundant
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
        public void broadcastOutput(StreamRecord<IterationRecord<?>> record) {
            try {
                eventBroadcastOutput.broadcastEmit((StreamRecord) record);
            } catch (IOException e) {
                throw new FlinkRuntimeException("Failed to broadcast event", e);
```

### RedundantCast
Casting `typeSerializers[0]` to `TypeSerializer` is redundant
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java
        protected IterationRecordSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] typeSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) typeSerializers[0];
            return new IterationRecordSerializer<>(elementSerializer);
        }
```

### RedundantCast
Casting `typeSerializers[0]` to `TypeSerializer` is redundant
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementSerializer.java`
#### Snippet
```java
        protected CacheElementSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] typeSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) typeSerializers[0];
            return new CacheElementSerializer<>(elementSerializer);
        }
```

### RedundantCast
Casting `new Object[0]` to `T[]` is redundant
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
        public void apply(GlobalWindow timeWindow, Iterable<T> iterable, Collector<T[]> collector) {
            List<T> points = IteratorUtils.toList(iterable.iterator());
            collector.collect(points.toArray((T[]) new Object[0]));
        }
    }
```

### RedundantCast
Casting `nestedSerializers[0]` to `TypeSerializer` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java
        protected PriorityQueueSerializer<T> createOuterSerializerWithNestedSerializers(
                TypeSerializer<?>[] nestedSerializers) {
            TypeSerializer<T> elementSerializer = (TypeSerializer<T>) nestedSerializers[0];
            return new PriorityQueueSerializer<>(comparator, elementSerializer);
        }
```

### RedundantCast
Casting `inputList.get(...)` to `DataStream` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                        inputList -> {
                            //noinspection unchecked
                            DataStream<Row> data = (DataStream<Row>) inputList.get(0);
                            return data.flatMap(
                                    new FilterByBucketFunction(getInputCol(), getOutputCol(), key),
```

### RedundantCast
Casting `inputList.get(...)` to `DataStream` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                        inputList -> {
                            //noinspection unchecked
                            DataStream<Row> data = (DataStream<Row>) inputList.get(0);
                            return data.map(new PredictFunction(getInputCol()), outputTypeInfo);
                        });
```

### RedundantCast
Casting `inputList.get(...)` to `DataStream` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                        Collections.singletonMap(MODEL_DATA_BC_KEY, modelData),
                        inputList -> {
                            DataStream<Row> data = (DataStream<Row>) inputList.get(0);
                            return data.flatMap(
                                    new FilterByDistanceFunction(threshold),
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `headOperatorContext` may be 'final'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/TerminatingHeadOperatorRecordProcessor.java`
#### Snippet
```java
public class TerminatingHeadOperatorRecordProcessor implements HeadOperatorRecordProcessor {

    private Context headOperatorContext;

    public TerminatingHeadOperatorRecordProcessor(Context headOperatorContext) {
```

### FieldMayBeFinal
Field `latestRoundGloballyAligned` may be 'final'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/HeadOperatorState.java`
#### Snippet
```java
    private int latestRoundAligned;

    private int latestRoundGloballyAligned;

    public HeadOperatorState() {
```

### FieldMayBeFinal
Field `numFeedbackRecordsEachRound` may be 'final'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/HeadOperatorState.java`
#### Snippet
```java
            new HeadOperatorState(Collections.emptyMap(), 0, 0);

    private Map<Integer, Long> numFeedbackRecordsEachRound;

    private int latestRoundAligned;
```

### FieldMayBeFinal
Field `latestRoundAligned` may be 'final'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/HeadOperatorState.java`
#### Snippet
```java
    private Map<Integer, Long> numFeedbackRecordsEachRound;

    private int latestRoundAligned;

    private int latestRoundGloballyAligned;
```

### FieldMayBeFinal
Field `cacheList` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastContext.java`
#### Snippet
```java

        /** the cached list. */
        private List<?> cacheList;

        /** the mailboxExecutor of the consumer, used to avoid the possible stuck of consumer. */
```

### FieldMayBeFinal
Field `cacheReady` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastContext.java`
#### Snippet
```java

        /** whether this broadcast variable is ready to be consumed. */
        private boolean cacheReady;

        /** the cached list. */
```

### FieldMayBeFinal
Field `mailboxExecutor` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastContext.java`
#### Snippet
```java

        /** the mailboxExecutor of the consumer, used to avoid the possible stuck of consumer. */
        private MailboxExecutor mailboxExecutor;

        BroadcastItem(
```

### FieldMayBeFinal
Field `cacheStates` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/BroadcastVariableReceiverOperator.java`
#### Snippet
```java
    /** State storage of the broadcast inputs. */
    @SuppressWarnings("rawtypes")
    private ListState[] cacheStates;

    /** CacheReady state storage of the broadcast inputs. */
```

### FieldMayBeFinal
Field `cacheReadyStates` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/BroadcastVariableReceiverOperator.java`
#### Snippet
```java

    /** CacheReady state storage of the broadcast inputs. */
    private ListState<Boolean>[] cacheReadyStates;

    @SuppressWarnings({"rawtypes", "unchecked"})
```

### FieldMayBeFinal
Field `cachesReady` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/BroadcastVariableReceiverOperator.java`
#### Snippet
```java

    /** Whether each broadcast input has finished. */
    private boolean[] cachesReady;

    /** State storage of the broadcast inputs. */
```

### FieldMayBeFinal
Field `aggregatedArrayChunkByChunkId` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/AllReduceImpl.java`
#### Snippet
```java
         * (originalArrayLength, aggregatedArrayChunk).
         */
        private Map<Integer, Tuple2<Integer, double[]>> aggregatedArrayChunkByChunkId =
                new HashMap<>();

```

### FieldMayBeFinal
Field `transferBuffer` may be 'final'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/AllReduceImpl.java`
#### Snippet
```java
        private boolean hasReceivedOneRecord = false;

        private double[] transferBuffer = new double[CHUNK_SIZE];

        @Override
```

### FieldMayBeFinal
Field `headBuffer` may be 'final'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java

    /** A buffer of the latest samples seen so far. */
    private List<Double> headBuffer = new ArrayList<>();

    /** Whether the quantile summary has been compressed. */
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
                        binEdges[columnId][edgeId] = binEdges[columnId][edgeId - 1] + width;
                    }
                    continue;
                } else {
                    // Conducts KMeans here.
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `sbr` is redundant
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/SparseVector.java`
#### Snippet
```java
    @Override
    public String toString() {
        String sbr =
                "(" + n + ", " + Arrays.toString(indices) + ", " + Arrays.toString(values) + ")";
        return sbr;
```

### UnnecessaryLocalVariable
Local variable `outputTypeInfo` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
        TypeInformation<?> idColType = inputTypeInfo.getTypeAt(idCol);

        RowTypeInfo outputTypeInfo =
                new RowTypeInfo(
                        new TypeInformation[] {
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/util/PeriodicSourceFunction.java`
#### Snippet
```java
                sourceContext.collect(data);
            }
            Thread.sleep(interval);
            index = (index + 1) % this.data.size();
        }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/ReplayableDataStreamList.java`
#### Snippet
```java

    public static ReplayedDataStreamList replay(DataStream<?>... dataStreams) {
        return new ReplayedDataStreamList(Arrays.asList(dataStreams));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/ReplayableDataStreamList.java`
#### Snippet
```java
        public ReplayableDataStreamList andNotReplay(DataStream<?>... nonReplayedStreams) {
            return new ReplayableDataStreamList(
                    getReplayedDataStreams(), Arrays.asList(nonReplayedStreams));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/ReplayableDataStreamList.java`
#### Snippet
```java

    public static NonReplayedDataStreamList notReplay(DataStream<?>... dataStreams) {
        return new NonReplayedDataStreamList(Arrays.asList(dataStreams));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/DataStreamList.java`
#### Snippet
```java

    public static DataStreamList of(DataStream<?>... streams) {
        return new DataStreamList(Arrays.asList(streams));
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `streamPartitioner` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/PerRoundOperatorWrapper.java`
#### Snippet
```java
        }

        return new ProxyStreamPartitioner<>(streamPartitioner);
    }

```

### ConstantValue
Value `streamPartitioner` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/allround/AllRoundOperatorWrapper.java`
#### Snippet
```java
        }

        return new ProxyStreamPartitioner<>(streamPartitioner);
    }

```

### ConstantValue
Value `inputChannel` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
                }
            }
        } else if (inputChannel instanceof LocalInputChannel) {
            PipelinedSubpartitionView subpartitionView =
                    ReflectionUtils.getFieldValue(
```

### ConstantValue
Value `inputChannel` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
            }
        } else {
            LOG.warn("Unknown input channel type: " + inputChannel);
        }

```

### ConstantValue
Value `operatorEvent` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
                    .checkHoldingGloballyAlignedEvent((GloballyAlignedEvent) operatorEvent)
                    .ifPresent(this::processGloballyAlignedEvent);
        } else if (operatorEvent instanceof CoordinatorCheckpointEvent) {
            checkpointAligner.coordinatorNotify((CoordinatorCheckpointEvent) operatorEvent);
        } else {
```

### ConstantValue
Value `operatorEvent` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
            checkpointAligner.coordinatorNotify((CoordinatorCheckpointEvent) operatorEvent);
        } else {
            throw new FlinkRuntimeException("Unsupported operator event: " + operatorEvent);
        }
    }
```

### ConstantValue
Condition `!endOfPartitionReceived` is always `true`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
        boolean endOfPartitionReceived = false;
        long lastTriggerCheckpointId = 0;
        while (!endOfPartitionReceived && status != HeadOperatorStatus.TERMINATED) {
            mailboxExecutor.yield(200, TimeUnit.MILLISECONDS);

```

### ConstantValue
Value `event` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
                    }

                } else if (event instanceof EndOfPartitionEvent) {
                    endOfPartitionReceived = true;
                }
```

### ConstantValue
Condition `status != HeadOperatorStatus.TERMINATED` is always `false`
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java

        // By here we could step into the normal loop.
        while (status != HeadOperatorStatus.TERMINATED) {
            mailboxExecutor.yield();
        }
```

### ConstantValue
Value `event` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/coordinator/HeadOperatorCoordinator.java`
#### Snippet
```java
            sharedProgressAligner.reportSubtaskProgress(
                    context.getOperatorId(), subtask, (SubtaskAlignedEvent) event);
        } else if (event instanceof TerminatingOnInitializeEvent) {
            sharedProgressAligner.notifyGloballyTerminating();
        } else {
```

### ConstantValue
Value `event` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/coordinator/HeadOperatorCoordinator.java`
#### Snippet
```java
            sharedProgressAligner.notifyGloballyTerminating();
        } else {
            throw new UnsupportedOperationException("Not supported event: " + event);
        }
    }
```

### ConstantValue
Value `operatorStateBackend` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
            }
        } else {
            LOG.warn("Unable to cleanup the operator state {}", operatorStateBackend);
        }
    }
```

### ConstantValue
Value `operatorEvent` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/coordinator/HeadOperatorCoordinator.java`
#### Snippet
```java
            sharedProgressAligner.reportSubtaskProgress(
                    context.getOperatorId(), subtaskIndex, (SubtaskAlignedEvent) operatorEvent);
        } else if (operatorEvent instanceof TerminatingOnInitializeEvent) {
            sharedProgressAligner.notifyGloballyTerminating();
        } else {
```

### ConstantValue
Value `operatorEvent` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/coordinator/HeadOperatorCoordinator.java`
#### Snippet
```java
            sharedProgressAligner.notifyGloballyTerminating();
        } else {
            throw new UnsupportedOperationException("Not supported event: " + operatorEvent);
        }
    }
```

### ConstantValue
Value `value` is always 'null'
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/WithParams.java`
#### Snippet
```java
        V value = (V) paramMap.get(param);

        if (value == null && !param.validator.validate(value)) {
            throw new IllegalArgumentException(
                    "Parameter " + param.name + "'s value should not be null");
```

### ConstantValue
Value `operatorStateBackend` is always 'null'
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
            }
        } else {
            LOG.warn("Unable to cleanup the operator state {}", operatorStateBackend);
        }
    }
```

### ConstantValue
Condition `dataType instanceof RowTypeInfo || dataType instanceof TupleTypeInfo` is always `false`
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                    return pickler.dumps(((Time) obj).toLocalTime().toNanoOfDay() / 1000);
                }
            } else if (dataType instanceof RowTypeInfo || dataType instanceof TupleTypeInfo) {
                TypeInformation<?>[] fieldTypes = ((TupleTypeInfoBase<?>) dataType).getFieldTypes();
                int arity =
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                    return pickler.dumps(((Time) obj).toLocalTime().toNanoOfDay() / 1000);
                }
            } else if (dataType instanceof RowTypeInfo || dataType instanceof TupleTypeInfo) {
                TypeInformation<?>[] fieldTypes = ((TupleTypeInfoBase<?>) dataType).getFieldTypes();
                int arity =
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                    return pickler.dumps(((Time) obj).toLocalTime().toNanoOfDay() / 1000);
                }
            } else if (dataType instanceof RowTypeInfo || dataType instanceof TupleTypeInfo) {
                TypeInformation<?>[] fieldTypes = ((TupleTypeInfoBase<?>) dataType).getFieldTypes();
                int arity =
```

### ConstantValue
Condition `dataType instanceof BasicArrayTypeInfo || dataType instanceof PrimitiveArrayType...` is always `false`
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                }
                return fieldBytes;
            } else if (dataType instanceof BasicArrayTypeInfo
                    || dataType instanceof PrimitiveArrayTypeInfo
                    || dataType instanceof ObjectArrayTypeInfo) {
                Object[] objects;
                TypeInformation<?> elementType;
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                }
                return fieldBytes;
            } else if (dataType instanceof BasicArrayTypeInfo
                    || dataType instanceof PrimitiveArrayTypeInfo
                    || dataType instanceof ObjectArrayTypeInfo) {
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                return fieldBytes;
            } else if (dataType instanceof BasicArrayTypeInfo
                    || dataType instanceof PrimitiveArrayTypeInfo
                    || dataType instanceof ObjectArrayTypeInfo) {
                Object[] objects;
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
            } else if (dataType instanceof BasicArrayTypeInfo
                    || dataType instanceof PrimitiveArrayTypeInfo
                    || dataType instanceof ObjectArrayTypeInfo) {
                Object[] objects;
                TypeInformation<?> elementType;
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                }
                return pickler.dumps(serializedElements);
            } else if (dataType instanceof MapTypeInfo) {
                List<List<Object>> serializedMapKV = new ArrayList<>(2);
                Map<Object, Object> mapObj = (Map) obj;
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                serializedMapKV.add(valueBytesList);
                return pickler.dumps(serializedMapKV);
            } else if (dataType instanceof ListTypeInfo) {
                List objects = (List) obj;
                List<Object> serializedElements = new ArrayList<>(objects.size());
```

### ConstantValue
Value `dataType` is always 'null'
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
                return pickler.dumps(String.valueOf(obj));
            } else if (dataType instanceof PickledByteArrayTypeInfo
                    || dataType instanceof BasicTypeInfo) {
                return pickler.dumps(obj);
            } else {
```

### ConstantValue
Result of `inputId - 1` is always '0'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/TwoInputBroadcastWrapperOperator.java`
#### Snippet
```java
        if (inputId == 1) {
            endInputX(
                    inputId - 1,
                    wrappedOperator::processElement1,
                    wrappedOperator::processWatermark1,
```

### ConstantValue
Condition `e instanceof TableException` is always `true`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/sqltransformer/SQLTransformer.java`
#### Snippet
```java
            return true;
        } catch (Exception e) {
            if (e instanceof TableException
                    && e.getMessage() != null
                    && e.getMessage().matches(INSERT_ONLY_EXCEPTION_PATTERN)) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                .stream()
                .reduce(DataStream::union)
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
                writer.addRecord(reader.next());
            }
            segment.setFsSize(writer.finish().get().getFsSize());
        }
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
            }
            if (cacheSuccess) {
                segment.setCache(writer.finish().get().getCache());
            }
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/flink-ml-iteration-1.15/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                .stream()
                .reduce(DataStream::union)
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
                        sampleSizeCount.values().stream().reduce(Double::sum);
                Preconditions.checkArgument(sampleSizeOpt.isPresent());
                sampleSize = sampleSizeOpt.get();
            }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/imputer/Imputer.java`
#### Snippet
```java
        @Override
        public ImputerModelData getResult(Map<String, Tuple2<Double, Long>> map) {
            long numRows = map.entrySet().stream().findFirst().get().getValue().f1;
            Preconditions.checkState(
                    numRows > 0, "The training set is empty or does not contains valid data.");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeans.java`
#### Snippet
```java

            KMeansModelData modelData =
                    OperatorStateUtils.getUniqueElement(modelDataState, "modelData").get();
            DenseVector[] centroids = modelData.centroids;
            VectorWithNorm[] centroidsWithNorm = new VectorWithNorm[modelData.centroids.length];
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegression.java`
#### Snippet
```java
            }
            DenseVector modelData =
                    OperatorStateUtils.getUniqueElement(modelDataState, "modelData").get();
            modelDataState.clear();

```

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `flink-ml-iteration/flink-ml-iteration-common/src/main/java/org/apache/flink/iteration/operator/headprocessor/TerminatingHeadOperatorRecordProcessor.java`
#### Snippet
```java
    public boolean processFeedbackElement(StreamRecord<IterationRecord<?>> record) {
        if (record.getValue().getType() == IterationRecord.Type.EPOCH_WATERMARK) {
            return record.getValue().getEpoch() == Integer.MAX_VALUE + 1;
        }

```

