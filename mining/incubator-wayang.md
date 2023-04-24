# incubator-wayang 
 
# Bad smells
I found 1405 bad smells with 143 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 168 | false |
| SystemOutErr | 150 | false |
| ReturnNull | 96 | false |
| UNUSED_IMPORT | 66 | false |
| EnhancedSwitchMigration | 65 | false |
| RedundantFieldInitialization | 51 | false |
| UtilityClassWithoutPrivateConstructor | 51 | true |
| UnnecessaryFullyQualifiedName | 39 | false |
| CommentedOutCode | 37 | false |
| NonProtectedConstructorInAbstractClass | 35 | true |
| AssignmentToMethodParameter | 29 | false |
| RedundantSuppression | 28 | false |
| UnusedAssignment | 27 | false |
| DataFlowIssue | 27 | false |
| Convert2MethodRef | 26 | false |
| ThrowablePrintStackTrace | 26 | false |
| MissortedModifiers | 22 | false |
| NestedAssignment | 20 | false |
| UnnecessaryLocalVariable | 19 | true |
| SizeReplaceableByIsEmpty | 15 | true |
| NonShortCircuitBoolean | 15 | false |
| SimplifyStreamApiCallChains | 13 | false |
| ConstantValue | 13 | false |
| PatternVariableCanBeUsed | 13 | false |
| ReplaceAssignmentWithOperatorAssignment | 11 | false |
| ClassCanBeRecord | 11 | false |
| UnnecessaryQualifierForThis | 10 | false |
| StaticCallOnSubclass | 10 | false |
| SimplifyOptionalCallChains | 10 | false |
| MissingSerialAnnotation | 10 | false |
| UnnecessaryBoxing | 10 | false |
| Convert2Lambda | 10 | false |
| ClassNameSameAsAncestorName | 9 | false |
| CharsetObjectCanBeUsed | 9 | false |
| CodeBlock2Expr | 9 | true |
| ZeroLengthArrayInitialization | 9 | false |
| OptionalGetWithoutIsPresent | 9 | false |
| RedundantImplements | 8 | false |
| NonSerializableFieldInSerializableClass | 8 | false |
| LongLiteralsEndingWithLowercaseL | 7 | false |
| DuplicateBranchesInSwitch | 7 | false |
| IgnoreResultOfCall | 6 | false |
| AccessStaticViaInstance | 6 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| AssignmentToLambdaParameter | 6 | false |
| WrapperTypeMayBePrimitive | 5 | false |
| UnnecessarySemicolon | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| UseBulkOperation | 5 | false |
| IOResource | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| MissingDeprecatedAnnotation | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| FinalStaticMethod | 4 | false |
| ExplicitArrayFilling | 4 | false |
| OptionalAssignedToNull | 4 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 4 | false |
| EmptyMethod | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| InnerClassMayBeStatic | 4 | true |
| AssignmentToStaticFieldFromInstanceMethod | 3 | false |
| NullableProblems | 3 | false |
| RegExpDuplicateCharacterInClass | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| RedundantStringFormatCall | 3 | false |
| TypeParameterExtendsObject | 3 | false |
| OptionalIsPresent | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| StringEqualsEmptyString | 3 | false |
| Anonymous2MethodRef | 3 | false |
| CopyConstructorMissesField | 3 | false |
| PointlessArithmeticExpression | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| FinalPrivateMethod | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| RedundantMethodOverride | 2 | false |
| ListRemoveInLoop | 2 | false |
| StringRepeatCanBeUsed | 2 | false |
| GroovyUnnecessaryReturn | 2 | false |
| AssignmentUsedAsCondition | 2 | false |
| ManualArrayToCollectionCopy | 2 | false |
| OptionalContainsCollection | 2 | false |
| BusyWait | 2 | false |
| PointlessBooleanExpression | 2 | true |
| EmptyTryBlock | 2 | false |
| TextBlockMigration | 2 | false |
| ThrowablePrintedToSystemOut | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| ComparatorCombinators | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| CatchMayIgnoreException | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| MagicConstant | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| Java8ListReplaceAll | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CallToStringConcatCanBeReplacedByOperator | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| ArrayHashCode | 1 | false |
| CastToIncompatibleInterface | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| FunctionalExpressionCanBeFolded | 1 | false |
| MalformedFormatString | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| InfiniteRecursion | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| Java8MapForEach | 1 | false |
| ParameterCanBeLocal | 1 | false |
| Java9CollectionFactory | 1 | false |
| Java8MapApi | 1 | false |
| ThreadStartInConstruction | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CardinalityEstimate\[inCards.size()\]'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/SimpleEstimationContext.java`
#### Snippet
```java

                    return new SimpleEstimationContext(
                            inCards.toArray(new CardinalityEstimate[inCards.size()]),
                            outCards.toArray(new CardinalityEstimate[outCards.size()]),
                            doubleProperties,
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new CardinalityEstimate\[outCards.size()\]'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/SimpleEstimationContext.java`
#### Snippet
```java
                    return new SimpleEstimationContext(
                            inCards.toArray(new CardinalityEstimate[inCards.size()]),
                            outCards.toArray(new CardinalityEstimate[outCards.size()]),
                            doubleProperties,
                            numExecutions
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[additionalProperties.size()\]'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
                numInputs,
                numOutputs,
                additionalProperties.toArray(new String[additionalProperties.size()])
        );
        final JuelUtils.JuelFunction<Long> juelFunction = new JuelUtils.JuelFunction<>(juel, Long.class, parameterClasses);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Long\[neighbors.size()\]'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java
                neighbors.add(n.f1);
            }
            out.collect(new Tuple2<Long, Long[]>(id, neighbors.toArray(new Long[neighbors.size()])));
        }
    }
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java


        Integer sampleSize = (Integer) this.getSampleSize(operatorContext);
        Long datasetSize = this.isDataSetSizeKnown() ? this.getDatasetSize() :
                ((CollectionChannel.Instance) inputs[0]).provideCollection().size();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java

        Integer sampleSize = (Integer) this.getSampleSize(operatorContext);
        Long datasetSize = this.isDataSetSizeKnown() ? this.getDatasetSize() :
                ((CollectionChannel.Instance) inputs[0]).provideCollection().size();

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        for (Channel channel : task.getOutputChannels()) {
            ArrayList<HashMap<String, Object>> perOutputThatList = new ArrayList<>();
            Integer thisOutIndex = channel.getProducerSlot()==null ? 0 : channel.getProducerSlot().getIndex();
            jsonConnectsTo.put(thisOutIndex.toString(), perOutputThatList);

```

### WrapperTypeMayBePrimitive
Type may be primitive
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
    public void updateProgress(HashMap<String, Integer> partialProgress) throws IOException {
        HashMap<String, Object> progressBar = new HashMap<>();
        Integer overall = 0;
        for (String operatorName : partialProgress.keySet()) {
            this.progress.put(operatorName, partialProgress.get(operatorName));
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCountOperator.java`
#### Snippet
```java
        DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];

        final Long count;
        try {

```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `argumentTypeClasses` are written to, but never read
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java

            // Index the arguments.
            Class<?>[] argumentTypeClasses = new Class[arguments.size()];
            int argIndex = 0;
            for (Map.Entry<String, Class<?>> argumentEntry : arguments.entrySet()) {
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            calendar.set(
                    Integer.parseInt(dateString.substring(0, 4)),
                    Integer.parseInt(dateString.substring(5, 7)) - 1,
                    Integer.parseInt(dateString.substring(8, 10))
            );
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * MiB` can be replaced with 'MiB'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java
                final int KiB = 1024;
                final int MiB = 1024 * KiB;
                try (LimitedInputStream lis = new LimitedInputStream(fileSystem.get().open(TextFileSource.this.inputUrl), 1 * MiB)) {
                    final BufferedReader bufferedReader = new BufferedReader(
                            new InputStreamReader(lis, TextFileSource.this.encoding)
```

### PointlessArithmeticExpression
`1 * 1024` can be replaced with '1024'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessReceiver.java`
#### Snippet
```java
        try{
            //TODO use config buffer size
            int BUFFER_SIZE = 1 * 1024;

            DataInputStream stream = new DataInputStream(new BufferedInputStream(socket.getInputStream(), BUFFER_SIZE));
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `kv`
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImprovedImpl.java`
#### Snippet
```java
                    continue;
                }
                String kv[] = pointStr[i].split(":", 2);
                point[Integer.parseInt(kv[0])-1] = Double.parseDouble(kv[1]);
            }
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FINAL_SUM` from instance context
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
        @Override
        public void postApplication() {
            FINAL_SUM = this.<LongWritable>getAggregatedValue(SUM_AGG).get();
            FINAL_MAX = this.<DoubleWritable>getAggregatedValue(MAX_AGG).get();
            FINAL_MIN = this.<DoubleWritable>getAggregatedValue(MIN_AGG).get();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FINAL_MAX` from instance context
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
        public void postApplication() {
            FINAL_SUM = this.<LongWritable>getAggregatedValue(SUM_AGG).get();
            FINAL_MAX = this.<DoubleWritable>getAggregatedValue(MAX_AGG).get();
            FINAL_MIN = this.<DoubleWritable>getAggregatedValue(MIN_AGG).get();

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `FINAL_MIN` from instance context
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
            FINAL_SUM = this.<LongWritable>getAggregatedValue(SUM_AGG).get();
            FINAL_MAX = this.<DoubleWritable>getAggregatedValue(MAX_AGG).get();
            FINAL_MIN = this.<DoubleWritable>getAggregatedValue(MIN_AGG).get();

            LOG.info("aggregatedNumVertices=" + FINAL_SUM);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (32 lines)
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
        private OptionalDouble estimateBytesPerLine() {
            //TODO validate if the implementation apply for the case
//            final Optional<FileSystem> fileSystem = FileSystems.getFileSystem(ObjectFileSource.this.inputUrl);
//            if (fileSystem.isPresent()) {
//
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
  @Override public RelNode toRel(RelOptTable.ToRelContext context,
                                 RelOptTable relOptTable) {
    /*return new JdbcTableScan(context.getCluster(), context.getTableHints(), relOptTable, this,
        jdbcSchema.convention);*/
    return LogicalTableScan.create(context.getCluster(), relOptTable, context.getTableHints());
```

### CommentedOutCode
Commented out code (4 lines)
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
        if (result.scale() > scale) {
            //TODO: enable logging
            /*LOGGER.warn(
                    "Decimal value {} exceeds declared scale ({}). Performing rounding to keep the "
                            + "first {} fractional digits.",
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
    }

    /*public JavaCSVTableSource(DataSetType<T> type) {
        this(null, type);
    }*/
```

### CommentedOutCode
Commented out code (24 lines)
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/channels/StreamChannel.java`
#### Snippet
```java
    }

//    public Channel exchangeWith(ChannelDescriptor descriptor) {
//        // Todo: Hacky.
//        final ExecutionTask producer = this.getProducer();
```

### CommentedOutCode
Commented out code (20 lines)
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/channels/StreamChannel.java`
#### Snippet
```java
    }

//    public static class Initializer implements JavaChannelInitializer {
//
//        @Override
```

### CommentedOutCode
Commented out code (7 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Slot.java`
#### Snippet
```java
    @Deprecated
    public void setCardinalityEstimate(CardinalityEstimate cardinalityEstimate) {
//        boolean isUpdate = this.cardinalityEstimate == null || !this.cardinalityEstimate.equals(cardinalityEstimate);
//        if (isUpdate) {
//            LoggerFactory.getLogger(this.getClass())
```

### CommentedOutCode
Commented out code (20 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Slot.java`
#### Snippet
```java
        return new CardinalityEstimate(42, 42, 0.42);
    }
//
//    /**
//     * Set the mark of this instance. Used to communicate changes in the {@link CardinalityEstimate}.
```

### CommentedOutCode
Commented out code (4 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ActualOperator.java`
#### Snippet
```java
    }

//    @Override
//    default <Payload, Return> Return accept(BottomUpPlanVisitor<Payload, Return> visitor, InputSlot<?> inputSlot, Payload payload) {
//        return visitor.visit(this, inputSlot, payload);
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
  public static void main(String... args) throws IOException {
    S3FileSystem s3 = new S3FileSystem();
    //String url = "s3://blossom-benchmark/HIGGS.csv";
   // String url = "s3://blossom-benchmark/README.md";
    String url = "s3://blossom-benchmark/lulu/lolo/lala";
```

### CommentedOutCode
Commented out code (5 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    System.out.println(s3.preFoldersExits(s3.getS3Pair(url)));

   // System.out.println(s3.getFileSize(url));
//    InputStream content = s3.open(url);
//    new BufferedReader(new InputStreamReader(content)).lines().forEach(System.out::println);
```

### CommentedOutCode
Commented out code (57 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/StageAssignmentTraversal.java`
#### Snippet
```java
    }

//    private static class ExecutionStageAdapter implements InterimStage {
//
//        private final ExecutionStage executionStage;
```

### CommentedOutCode
Commented out code (5 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/StageAssignmentTraversal.java`
#### Snippet
```java
//                    if (outputChannel.isInterStageCapable()) continue;
                    // TODO: We cannot "exchange" Channels so easily any more.
//                    if (!task.getOperator().getPlatform().getChannelManager()
//                            .exchangeWithInterstageCapable(outputChannel)) {
//                        StageAssignmentTraversal.logger.warn("Could not exchange {} with an interstage-capable channel.",
```

### CommentedOutCode
Commented out code (22 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/CardinalityRepository.java`
#### Snippet
```java
        this.logger.info("Storing cardinalities at {}.", this.repositoryPath);

//        executionState.getCardinalityMeasurements().forEach(
//                channelInstance -> {
//                    for (Slot<?> correspondingSlot : channelInstance.getChannel().getCorrespondingSlots()) {
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimators.java`
#### Snippet
```java
        DynamicLoadEstimator cpuEstimator =
                DynamicLoadEstimator.createFor(configKey, "cpu", spec.get("cpu").textValue(), optimizationSpace);
//        DynamicLoadEstimator ramEstimator =
//                DynamicLoadEstimator.createFor(configKey, "ram", spec.getString("ram"), optimizationSpace);
        DynamicLoadEstimator diskEstimator = !spec.has("disk") ?
```

### CommentedOutCode
Commented out code (507 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimators.java`
#### Snippet
```java


//    /**
//     * Let this class try to find a suitable {@link DynamicLoadProfileEstimator} for the given {@link ExecutionOperator}.
//     *
```

### CommentedOutCode
Commented out code (4 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
            case "name":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> operatorContext.getOperator().getName())
//                        .filter(Objects::nonNull)
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
            case "operator":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> operatorContext.getOperator().getClass().getSimpleName())
//                        .anyMatch(name -> matchSubstring(name, commandLine[2]));
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
            case "platform":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> ((ExecutionOperator) operatorContext.getOperator()).getPlatform())
//                        .anyMatch(platform -> matchSubstring(platform.getName(), commandLine[2]));
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
                this.fitnessFunction = individual -> individual.calculateAbsoluteFitness(this);
                break;
//            case "subject":
//                this.fitnessFunction = individual -> individual.calcluateSubjectbasedFitness(this);
//                break;
```

### CommentedOutCode
Commented out code (35 lines)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
            }

//            // Now find all InputSlots that are fed by the OutputSlot and whose Operators have not yet been executed.
//            Collection<InputSlot<?>> consumerInputs = this.findWayangPlanInputSlotFor(producerOutput);
//
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java

            // Calculate the weight.
//            double weight = Math.log(partialExecution.getMeasuredExecutionTime() + 2d) / Math.log(2);
//            double weight = Math.sqrt(Math.max(timeEstimate, partialExecution.getMeasuredExecutionTime())) + 1;
            double weight = geneticOptimizer.calculateObservationBasedWeight(partialExecution);
```

### CommentedOutCode
Commented out code (60 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java
    }

//    /**
//     * Calculate the fitness as the arithmetic mean the individual fitnesses of the estimation subjects.
//     */
```

### CommentedOutCode
Commented out code (47 lines)
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
                results = profile(OperatorProfilers.createSparkLocalCallbackSinkProfiler(), allCardinalities);
                break;
//            case "word-count-split": {
//                final Supplier<String> randomStringSupplier = DataGenerators.createRandomStringSupplier(2, 10, new Random(42));
//                results = profile(
```

### CommentedOutCode
Commented out code (5 lines)
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
        point[0] = Double.parseDouble(pointStr[0]);
        for (int i = 1; i < pointStr.length; i++) {
/*            if (pointStr[i].equals("")) {
                continue;
            }
```

### CommentedOutCode
Commented out code (8 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java

        //get this from the user (SOMEHOW)
        /*ArrayList<String> attSymbols = new ArrayList<String>();
        attSymbols.add("<");//prim
        attSymbols.add(">");//ref
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
                     int[] b, Comparator<Tuple2<Data<Type0, Type1>, Input>> c) {
        ArrayList<Tuple2<Data<Type0, Type1>, Input>> aux = new ArrayList<Tuple2<Data<Type0, Type1>, Input>>();//new Tuple2<Data<Type0,Type1>,Input>[a.length];//(Data[]) a.clone();
        //System.arraycopy(a, 0, aux, 0, a.size());
        //Collections.copy(a,aux);
        aux.addAll(a);
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
            Tuple2<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> arg0)
            throws Exception {
        // ArrayList<Tuple2<Long, Long>> output = new ArrayList<Tuple2<Long,
        // Long>>(1);

```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
                }
            } else if (i < lst1.length) {
                // result.add(lst1[i++]);
                // i++;
                System.arraycopy(lst1, i, result, k, (lst1.length - i));
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
                return result;
            } else {
                // result.add(lst2[j++]);
                // j++;
                System.arraycopy(lst2, j, result, k, (lst2.length - j));
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
                }
            } else if (i < lst1.size()) {
                // result.add(lst1[i++]);
                // i++;
                //System.arraycopy(lst1, i, result, k, (lst1.size() - i));
```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
                return result;
            } else {
                // result.add(lst2[j++]);
                // j++;
                //System.arraycopy(lst2, j, result, k, (lst2.size() - j));
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
    public ArrayList<Tuple2<Input, Input>> call(ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst1a,
                                                ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst1b) {
        // ArrayList<Tuple2<Long, Long>> output = new ArrayList<Tuple2<Long,
        // Long>>(1);

```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            }
            ArrayList<Tuple2<Data<Type0, Type1>, Input>> list2 = new ArrayList<Tuple2<Data<Type0, Type1>, Input>>();//Tuple2<Data<Type0,Type1>,Record>[list1.length];
            //System.arraycopy(list1, 0, list2, 0, list1.size());
            //Collections.copy(list1,list2);
            list2.addAll(list1);
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java

        if(this.iteration_generate <= expanded){
            //final ExecutionLineageNode executionLineageNode = new ExecutionLineageNode(operatorContext);
            //executionLineageNode.addAtomicExecutionFromOperatorContext();

```

### CommentedOutCode
Commented out code (3 lines)
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTextFileSink.java`
#### Snippet
```java

        inputDataset.writeAsText(this.textFileUrl);
//        final TextOutputFormat.TextFormatter<Type> fileOutputFormat = flinkExecutor.getCompiler().compileOutput(this.formattingDescriptor);
//
//        inputDataset.writeAsFormattedText(this.textFileUrl, fileOutputFormat);
```

### CommentedOutCode
Commented out code (5 lines)
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java

        long size = Long.MAX_VALUE;
      /*  try {
            size = dataSetInput.count();
        } catch (Exception e) {
```

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/ReservoirSampler.java`
#### Snippet
```java
    public List<T> sample(Collection<T> set, Battle<T> battle, double selectionProbability) {
        // Clear the reservoir.
        for (int i = 0; i < this.reservoir.size(); i++) {
            this.reservoir.set(i, null);
        }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `partialProgress.keySet()` may be replaced with 'entrySet()' iteration
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
        HashMap<String, Object> progressBar = new HashMap<>();
        Integer overall = 0;
        for (String operatorName : partialProgress.keySet()) {
            this.progress.put(operatorName, partialProgress.get(operatorName));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `this.progress.keySet()` may be replaced with 'values()' iteration
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
        }

        for (String operatorName: this.progress.keySet()) {
            overall = overall + this.progress.get(operatorName);
        }
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `PageRankOperator` on 'this' is unnecessary in this context
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/PageRankOperator.java`
#### Snippet
```java
                    assert inputEstimates.length == 1;
                    return new CardinalityEstimate(
                            calculateNumVertices(inputEstimates[0].getLowerEstimate(), PageRankOperator.this.graphDensity.getUpperEstimate()),
                            calculateNumVertices(inputEstimates[0].getUpperEstimate(), PageRankOperator.this.graphDensity.getLowerEstimate()),
                            inputEstimates[0].getCorrectnessProbability() * PageRankOperator.this.graphDensity.getCorrectnessProbability()
```

### UnnecessaryQualifierForThis
Qualifier `PageRankOperator` on 'this' is unnecessary in this context
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/PageRankOperator.java`
#### Snippet
```java
                    return new CardinalityEstimate(
                            calculateNumVertices(inputEstimates[0].getLowerEstimate(), PageRankOperator.this.graphDensity.getUpperEstimate()),
                            calculateNumVertices(inputEstimates[0].getUpperEstimate(), PageRankOperator.this.graphDensity.getLowerEstimate()),
                            inputEstimates[0].getCorrectnessProbability() * PageRankOperator.this.graphDensity.getCorrectnessProbability()
                    );
```

### UnnecessaryQualifierForThis
Qualifier `PageRankOperator` on 'this' is unnecessary in this context
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/PageRankOperator.java`
#### Snippet
```java
                            calculateNumVertices(inputEstimates[0].getLowerEstimate(), PageRankOperator.this.graphDensity.getUpperEstimate()),
                            calculateNumVertices(inputEstimates[0].getUpperEstimate(), PageRankOperator.this.graphDensity.getLowerEstimate()),
                            inputEstimates[0].getCorrectnessProbability() * PageRankOperator.this.graphDensity.getCorrectnessProbability()
                    );
                });
```

### UnnecessaryQualifierForThis
Qualifier `CrossPlatformExecutor` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
                t.join();
            } catch (InterruptedException e) {
                CrossPlatformExecutor.this.logger.error("Thread Interrupted!", e);
            }
        }
```

### UnnecessaryQualifierForThis
Qualifier `CrossPlatformExecutor` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
        // Clear the list of created threads
        parallelExecutionThreads.clear();
        CrossPlatformExecutor.this.logger.info("Parallel execution ended!");
    }

```

### UnnecessaryQualifierForThis
Qualifier `CrossPlatformExecutor` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
        // Get the number of executed stages in current runToBreakpoint
        final long finishTime = System.currentTimeMillis();
        CrossPlatformExecutor.this.logger.info("Executed {} stages in {}.",
                numExecutedStages, Formats.formatDuration(finishTime - startTime, true));

```

### UnnecessaryQualifierForThis
Qualifier `CrossPlatformExecutor` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java

        // Have the execution done.
        CrossPlatformExecutor.this.logger.info("Having {} execute {}:\n{}", executor, stage, stage.getPlanAsString("> "));
        long startTime = System.currentTimeMillis();
        executor.execute(stage, optimizationContext, this);
```

### UnnecessaryQualifierForThis
Qualifier `CrossPlatformExecutor` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
        executor.execute(stage, optimizationContext, this);
        long finishTime = System.currentTimeMillis();
        CrossPlatformExecutor.this.logger.info("Executed {} in {}.", stage, Formats.formatDuration(finishTime - startTime, true));

        // Remember that we have executed the stage.
```

### UnnecessaryQualifierForThis
Qualifier `ExecutionTaskFlowCompiler` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
        }
        OperatorAlternative.Alternative alternative =
                ExecutionTaskFlowCompiler.this.planImplementation.getChosenAlternative((OperatorAlternative) owner);
        if (alternative == null) {
            ExecutionTaskFlowCompiler.this.logger.warn(
```

### UnnecessaryQualifierForThis
Qualifier `ExecutionTaskFlowCompiler` on 'this' is unnecessary in this context
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
                ExecutionTaskFlowCompiler.this.planImplementation.getChosenAlternative((OperatorAlternative) owner);
        if (alternative == null) {
            ExecutionTaskFlowCompiler.this.logger.warn(
                    "Deciding upon output channels before having settled all follow-up alternatives.");
            return Stream.empty();
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java
     * Set up a queue of initial {@link Activator}s for an estimation pass.
     */
    private final Queue<ActivatorType> initializeActivatorQueue() {
        // Set up the initial Activators.
        Queue<ActivatorType> activatorQueue = new LinkedList<>(this.getInitialActivators());
```

### FinalPrivateMethod
'private' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimate.java`
#### Snippet
```java
     * Avoids buffer overflows while adding two positive {@code long}s.
     */
    private static final long addSafe(long a, long b) {
        assert a >= 0 && b >= 0;
        long sum = a + b;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
        switch (fieldType.getSqlTypeName()) {
            case BOOLEAN:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Boolean.parseBoolean(string);
            case TINYINT:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Byte.parseByte(string);
            case SMALLINT:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Short.parseShort(string);
            case INTEGER:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Integer.parseInt(string);
            case BIGINT:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Long.parseLong(string);
            case FLOAT:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Float.parseFloat(string);
            case DOUBLE:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return Double.parseDouble(string);
            case DECIMAL:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                return parseDecimal(fieldType.getPrecision(), fieldType.getScale(), string);
            case DATE:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                }
            case TIME:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                }
            case TIMESTAMP:
                if (string.length() == 0) {
                    return null;
                }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/instrumentation/StopWatch.java`
#### Snippet
```java
    this.rounds.values().forEach(round -> this.append(round, indent, 0, bullet, firstColumnWidth, sb));
    // Trim trailing newline.
    if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
      sb.setLength(sb.length() - 1);
    }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        this.getPlanAsString(sb, indent);
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') sb.setLength(sb.length() - 1);
        return sb.toString();
    }
```

### SizeReplaceableByIsEmpty
`this.progress.size()>0` can be replaced with '!this.progress.isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
        }

        if (this.progress.size()>0)
            overall = overall/this.progress.size();

```

### SizeReplaceableByIsEmpty
`inputOperators.size() == 0` can be replaced with 'inputOperators.isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                    });

            if (inputOperators.size() == 0) {
                // If there is no input operator, only the cost of the current operator is returned
                probalisticCost.add(this.optimizationContext.getOperatorContext(operator).getCostEstimate());
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
    }

    public static final Operator slotlessOperator() {
        return new OperatorBase(0, 0, false) {
            @Override
```

### FinalStaticMethod
'static' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanPattern.java`
#### Snippet
```java
     * @return the new instance
     */
    public static final SubplanPattern fromOperatorPatterns(OperatorPattern inputOperatorPattern,
                                                            OperatorPattern outputOperatorPattern) {
        return new SubplanPattern(inputOperatorPattern, outputOperatorPattern);
```

### FinalStaticMethod
'static' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanPattern.java`
#### Snippet
```java
     * @return the new instance
     */
    public static final SubplanPattern createSingleton(OperatorPattern operatorPattern) {
        return fromOperatorPatterns(operatorPattern, operatorPattern);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimate.java`
#### Snippet
```java
     * Avoids buffer overflows while adding two positive {@code long}s.
     */
    private static final long addSafe(long a, long b) {
        assert a >= 0 && b >= 0;
        long sum = a + b;
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
  final DataSource dataSource;
  final @Nullable String catalog;
  final @Nullable String schema;
  public final SqlDialect dialect;
  final JdbcConvention convention;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
  public final SqlDialect dialect;
  final JdbcConvention convention;
  private @Nullable ImmutableMap<String, JdbcTable> tableMap;
  private final boolean snapshot;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
public class JdbcSchema implements Schema {
  final DataSource dataSource;
  final @Nullable String catalog;
  final @Nullable String schema;
  public final SqlDialect dialect;
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Redundant initialization of a newly created array
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }
```

### ExplicitArrayFilling
Redundant initialization of a newly created array
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }
```

### ExplicitArrayFilling
Redundant initialization of a newly created array
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }
```

### ExplicitArrayFilling
Redundant initialization of a newly created array
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'WayangJsonObj' and 'NullNode'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializable.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        public T deserialize(WayangJsonObj json, Class<? extends T> cls) {
            if (json == null || json.equals(WayangJsonObj.NULL)) return null;
            try {
                final Method fromJsonMethod = cls.getMethod("fromJson", WayangJsonObj.class);
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'WayangJsonObj' and 'NullNode'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static <T> T deserialize(WayangJsonObj wayangJsonObj, JsonSerializer<T> serializer, Class<? extends T> cls) {
        if (wayangJsonObj == null || wayangJsonObj.equals(WayangJsonObj.NULL)) return null;
        return serializer.deserialize(wayangJsonObj, cls);
    }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/JDBCStorage.java`
#### Snippet
```java
    @Override
    public void save(Collection<Experiment> experiments) throws IOException {
        this.file.getAbsoluteFile().getParentFile().mkdirs();
        try (FileOutputStream fos = new FileOutputStream(this.file, false)) {
            this.save(experiments, fos);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/JDBCStorage.java`
#### Snippet
```java
    @Override
    public void append(Collection<Experiment> experiments) throws IOException {
        this.file.getAbsoluteFile().getParentFile().mkdirs();
        try (FileOutputStream fos = new FileOutputStream(this.file, true)) {
            this.save(experiments, fos);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/FileStorage.java`
#### Snippet
```java
    @Override
    public void save(Collection<Experiment> experiments) throws IOException {
        this.file.getAbsoluteFile().getParentFile().mkdirs();
        try (FileOutputStream fos = new FileOutputStream(this.file, false)) {
            this.save(experiments, fos);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/FileStorage.java`
#### Snippet
```java
    @Override
    public void append(Collection<Experiment> experiments) throws IOException {
        this.file.getAbsoluteFile().getParentFile().mkdirs();
        try (FileOutputStream fos = new FileOutputStream(this.file, true)) {
            this.save(experiments, fos);
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
            file = toFile(url);
            if (forceCreateParentDirs && file.getParentFile()!=null)
                file.getParentFile().mkdirs();
            return new FileOutputStream(file, false);
        } catch (URISyntaxException e) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
        } catch (IOException e) {
            if (file != null) {
                file.delete();
            }
            throw e;
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java

    public void logTimeEstimates() {
        if (!this.logger.isDebugEnabled()) return;

        this.logger.debug(">>> Regular operators");
```

### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
        if (!this.logger.isDebugEnabled()) return;

        this.logger.debug(">>> Regular operators");
        for (ExecutionOperator operator : this.operators) {
            this.logger.debug("Estimated execution time of {}: {}",
```

### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
        this.logger.debug(">>> Regular operators");
        for (ExecutionOperator operator : this.operators) {
            this.logger.debug("Estimated execution time of {}: {}",
                    operator, this.optimizationContext.getOperatorContext(operator).getTimeEstimate()
            );
```

### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            );
        }
        this.logger.debug(">>> Glue operators");
        for (Junction junction : junctions.values()) {
            for (ExecutionTask task : junction.getConversionTasks()) {
```

### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            for (ExecutionTask task : junction.getConversionTasks()) {
                final ExecutionOperator operator = task.getOperator();
                this.logger.debug("Estimated execution time of {}: {}",
                        operator, this.optimizationContext.getOperatorContext(operator).getTimeEstimate()
                );
```

### AccessStaticViaInstance
Static member 'org.apache.wayang.core.optimizer.enumeration.PlanImplementation.logger' accessed via instance reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            }
        }
        this.logger.debug(">>> Loops");
        for (LoopImplementation loopImplementation : this.loopImplementations.values()) {
            for (LoopImplementation.IterationImplementation iterationImplementation : loopImplementation.getIterationImplementations()) {
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
                // Unboxing Byte values. (Byte[] to byte[])
                for(Byte b: ((Byte[]) obj))
                    bytes[j++] = b.byteValue();

                dataOut.writeInt(length);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getOperator()` is identical to its super method
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/UnaryOperatorProfiler.java`
#### Snippet
```java

    @Override
    public JavaExecutionOperator getOperator() {
        return this.operator;
    }
```

### RedundantMethodOverride
Method `getOperator()` is identical to its super method
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/BinaryOperatorProfiler.java`
#### Snippet
```java

    @Override
    public JavaExecutionOperator getOperator() {
        return this.operator;
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `CardinalityEstimator` is the same as one of its superclass' names
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java
     * Custom {@link org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator} for {@link FlatMapOperator}s.
     */
    protected class CardinalityEstimator implements org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator {

        public final CardinalityEstimate FALLBACK_ESTIMATE = new CardinalityEstimate(1000L, 100000000L, 0.7);
```

### ClassNameSameAsAncestorName
Class name `CardinalityEstimator` is the same as one of its superclass' names
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
     * Custom {@link org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator} for {@link FlatMapOperator}s.
     */
    protected class CardinalityEstimator implements org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator {

        public final CardinalityEstimate FALLBACK_ESTIMATE = new CardinalityEstimate(1000L, 100000000L, 0.7);
```

### ClassNameSameAsAncestorName
Class name `CardinalityEstimator` is the same as one of its superclass' names
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/FilterOperator.java`
#### Snippet
```java
     * Custom {@link org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator} for {@link FilterOperator}s.
     */
    private class CardinalityEstimator implements org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator {

        /**
```

### ClassNameSameAsAncestorName
Class name `CardinalityEstimator` is the same as one of its superclass' names
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/FlatMapOperator.java`
#### Snippet
```java
     * Custom {@link org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator} for {@link FlatMapOperator}s.
     */
    private class CardinalityEstimator implements org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator {

        /**
```

### ClassNameSameAsAncestorName
Class name `CardinalityEstimator` is the same as one of its superclass' names
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/MapPartitionsOperator.java`
#### Snippet
```java
     * Custom {@link org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator} for {@link FlatMapOperator}s.
     */
    private class CardinalityEstimator implements org.apache.wayang.core.optimizer.cardinality.CardinalityEstimator {

        /**
```

### ClassNameSameAsAncestorName
Class name `Iterator` is the same as one of its superclass' names
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
    }

    private static class Iterator<T> implements java.util.Iterator<List<T>> {

        private final CrossProductIterable<T> crossProductIterable;
```

### ClassNameSameAsAncestorName
Class name `Activation` is the same as one of its superclass' names
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
     * Propagates a {@link Channel} to its consumers.
     */
    public static class Activation extends AbstractTopologicalTraversal.Activation<Activator> {

        private final int inputIndex;
```

### ClassNameSameAsAncestorName
Class name `Activator` is the same as one of its superclass' names
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
     * Takes care of creating {@link ExecutionTask}s and {@link Channel}s.
     */
    public class Activator extends AbstractTopologicalTraversal.Activator<Activation> {

        private final Activation[] activations;
```

### ClassNameSameAsAncestorName
Class name `Comparator` is the same as one of its superclass' names
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
     * Created by khayyzy on 5/28/16.
     */
    public static class Comparator<Type0 extends Comparable<Type0>, Type1 extends Comparable<Type1>>
            implements Serializable, java.util.Comparator<Data<Type0, Type1>> {

```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
block \* in: integer multiplication implicitly cast to long
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/addUniqueID.java`
#### Snippet
```java
        ArrayList<Tuple2<Long, Input>> outList = new ArrayList<Tuple2<Long, Input>>(300000);

        long tupleLocalID = (block * in) + start;
        // System.out.println("tupleLocalID = "+tupleLocalID);
        while (arg0.hasNext()) {
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
            // Look for Spark-like directory structure.
            if (children.stream().anyMatch(child -> child.endsWith("_SUCCESS"))) {
                return children.stream().filter(child -> child.matches(".*/part-[m|r|M|R|-]{0,2}\\d+")).collect(Collectors.toList());
            } else {
                throw new WayangException("Could not identify directory structure: " + children);
```

### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
            // Look for Spark-like directory structure.
            if (children.stream().anyMatch(child -> child.endsWith("_SUCCESS"))) {
                return children.stream().filter(child -> child.matches(".*/part-[m|r|M|R|-]{0,2}\\d+")).collect(Collectors.toList());
            } else {
                throw new WayangException("Could not identify directory structure: " + children);
```

### RegExpDuplicateCharacterInClass
Duplicate character '\|' inside character class
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
            // Look for Spark-like directory structure.
            if (children.stream().anyMatch(child -> child.endsWith("_SUCCESS"))) {
                return children.stream().filter(child -> child.matches(".*/part-[m|r|M|R|-]{0,2}\\d+")).collect(Collectors.toList());
            } else {
                throw new WayangException("Could not identify directory structure: " + children);
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
    public Return process(Operator operator, OutputSlot<?> fromOutputSlot, Payload payload) {
        final Optional<Return> returnOptional = this.prepareVisit(operator, fromOutputSlot, payload);
        if (returnOptional != null) {
            return returnOptional.orElse(null);
        }
```

### OptionalAssignedToNull
Null is used for 'Optional' type in return statement
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
            return Optional.ofNullable(this.process(occupant.getOwner(), occupant, payload));
        } else {
            return null;
        }
    }
```

### OptionalAssignedToNull
Optional value is compared with null
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     */
    public Optional<Set<Platform>> getTargetPlatforms() {
        if (this.targetPlatforms == null) {
            this.targetPlatforms = this.operatorMatches.values().stream()
                    .map(OperatorMatch::getOperator)
```

### OptionalAssignedToNull
Null is used for 'Optional' type in declaration
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * <i>Lazily initialized.</i> {@link Platform} restrictions coming from the matched {@link Operator}s.
     */
    private Optional<Set<Platform>> targetPlatforms = null;

    /**
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessReceiver.java`
#### Snippet
```java
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
/*TODO cannot be always string, include definition for every operator
*  like: map(udf, inputtype, outputtype)*/
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.jdbc.JavaTypeFactoryImpl;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
package org.apache.wayang.api.sql.calcite.converter;

import org.apache.calcite.jdbc.JavaTypeFactoryImpl;
import org.apache.calcite.rel.core.Filter;
import org.apache.calcite.rex.*;
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.sql.SqlOperator;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
import org.apache.calcite.rex.*;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlOperator;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.wayang.api.sql.calcite.rel.WayangFilter;
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.sql.type.SqlTypeName;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlOperator;
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.wayang.api.sql.calcite.rel.WayangFilter;
import org.apache.wayang.api.sql.calcite.utils.PrintUtils;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.api.sql.calcite.utils.PrintUtils;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
import org.apache.calcite.sql.type.SqlTypeName;
import org.apache.wayang.api.sql.calcite.rel.WayangFilter;
import org.apache.wayang.api.sql.calcite.utils.PrintUtils;
import org.apache.wayang.basic.data.Record;
import org.apache.wayang.basic.operators.FilterOperator;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class WayangFilterVisitor extends WayangRelNodeVisitor<WayangFilter> {
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.rel.type.RelDataType;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java

import org.apache.calcite.rel.core.Project;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.calcite.rex.RexInputRef;
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.rel.type.RelDataTypeField;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java
import org.apache.calcite.rel.core.Project;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeField;
import org.apache.calcite.rex.RexInputRef;
import org.apache.calcite.rex.RexNode;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TableSource;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
import org.apache.wayang.api.sql.sources.fs.JavaCSVTableSource;
import org.apache.wayang.basic.data.Record;
import org.apache.wayang.basic.operators.TableSource;
import org.apache.wayang.basic.operators.TextFileSource;
import org.apache.wayang.core.plan.wayangplan.Operator;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSource;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
import org.apache.wayang.basic.data.Record;
import org.apache.wayang.basic.operators.TableSource;
import org.apache.wayang.basic.operators.TextFileSource;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.types.DataSetType;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.postgres.Postgres;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.postgres.Postgres;
import org.apache.wayang.postgres.operators.PostgresTableSource;
import org.apache.wayang.postgres.platform.PostgresPlatform;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.postgres.operators.PostgresTableSource;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.postgres.Postgres;
import org.apache.wayang.postgres.operators.PostgresTableSource;
import org.apache.wayang.postgres.platform.PostgresPlatform;

```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.postgres.platform.PostgresPlatform;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
import org.apache.wayang.postgres.Postgres;
import org.apache.wayang.postgres.operators.PostgresTableSource;
import org.apache.wayang.postgres.platform.PostgresPlatform;

import java.util.ArrayList;
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.adapter.jdbc.JdbcTableScan;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
import org.apache.calcite.adapter.java.JavaTypeFactory;
//import org.apache.calcite.adapter.jdbc.JdbcSchema;
import org.apache.calcite.adapter.jdbc.JdbcTableScan;
import org.apache.calcite.avatica.ColumnMetaData;
import org.apache.calcite.jdbc.CalciteConnection;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.api.sql.calcite.rules.WayangRules;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/optimizer/WayangProgram.java`
#### Snippet
```java
import org.apache.calcite.tools.Programs;
import org.apache.calcite.tools.RuleSet;
import org.apache.wayang.api.sql.calcite.rules.WayangRules;

import java.util.List;
```

### UNUSED_IMPORT
Unused import `import org.apache.calcite.rel.hint.RelHint;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rel/WayangProject.java`
#### Snippet
```java
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.core.Project;
import org.apache.calcite.rel.hint.RelHint;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rex.RexNode;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.LocalCallbackSink;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/context/SqlContext.java`
#### Snippet
```java
import org.apache.wayang.api.sql.calcite.utils.PrintUtils;
import org.apache.wayang.basic.data.Record;
import org.apache.wayang.basic.operators.LocalCallbackSink;
import org.apache.wayang.core.api.Configuration;
import org.apache.wayang.core.api.WayangContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.api.configuration.KeyValueProvider;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/context/SqlContext.java`
#### Snippet
```java
import org.apache.wayang.core.api.Configuration;
import org.apache.wayang.core.api.WayangContext;
import org.apache.wayang.core.api.configuration.KeyValueProvider;
import org.apache.wayang.core.api.configuration.MapBasedKeyValueProvider;
import org.apache.wayang.core.plan.wayangplan.WayangPlan;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.api.configuration.MapBasedKeyValueProvider;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/context/SqlContext.java`
#### Snippet
```java
import org.apache.wayang.core.api.WayangContext;
import org.apache.wayang.core.api.configuration.KeyValueProvider;
import org.apache.wayang.core.api.configuration.MapBasedKeyValueProvider;
import org.apache.wayang.core.plan.wayangplan.WayangPlan;
import org.apache.wayang.java.Java;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.spark.platform.SparkPlatform;`
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
import org.apache.wayang.java.platform.JavaPlatform;
import org.apache.wayang.spark.Spark;
import org.apache.wayang.spark.platform.SparkPlatform;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.spark.platform.SparkPlatform;`
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
import org.apache.wayang.java.platform.JavaPlatform;
import org.apache.wayang.spark.Spark;
import org.apache.wayang.spark.platform.SparkPlatform;

import java.io.IOException;
```

### UNUSED_IMPORT
Unused import `import java.util.Objects;`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSink.java`
#### Snippet
```java
package org.apache.wayang.basic.operators;

import java.util.Objects;
import org.apache.wayang.core.function.TransformationDescriptor;
import org.apache.wayang.core.optimizer.costs.DefaultLoadEstimator;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.function.TransformationDescriptor;`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSink.java`
#### Snippet
```java

import java.util.Objects;
import org.apache.wayang.core.function.TransformationDescriptor;
import org.apache.wayang.core.optimizer.costs.DefaultLoadEstimator;
import org.apache.wayang.core.optimizer.costs.NestableLoadProfileEstimator;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.optimizer.costs.DefaultLoadEstimator;`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSink.java`
#### Snippet
```java
import java.util.Objects;
import org.apache.wayang.core.function.TransformationDescriptor;
import org.apache.wayang.core.optimizer.costs.DefaultLoadEstimator;
import org.apache.wayang.core.optimizer.costs.NestableLoadProfileEstimator;
import org.apache.wayang.core.plan.wayangplan.UnarySink;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.optimizer.costs.NestableLoadProfileEstimator;`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSink.java`
#### Snippet
```java
import org.apache.wayang.core.function.TransformationDescriptor;
import org.apache.wayang.core.optimizer.costs.DefaultLoadEstimator;
import org.apache.wayang.core.optimizer.costs.NestableLoadProfileEstimator;
import org.apache.wayang.core.plan.wayangplan.UnarySink;
import org.apache.wayang.core.types.DataSetType;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.Collectors;`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSource;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import java.util.Collections;
import org.apache.wayang.basic.operators.ObjectFileSource;
import org.apache.wayang.basic.operators.TextFileSource;
import org.apache.wayang.core.mapping.Mapping;
import org.apache.wayang.core.mapping.OperatorPattern;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.flink.operators.FlinkTextFileSource;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.flink.operators.FlinkObjectFileSource;
import org.apache.wayang.flink.operators.FlinkTextFileSource;
import org.apache.wayang.flink.platform.FlinkPlatform;

```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySink;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSink.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySink;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySource;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSource.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySource;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.flink.api.java.io.TextOutputFormat;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTextFileSink.java`
#### Snippet
```java

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.io.TextOutputFormat;
import org.apache.wayang.basic.operators.TextFileSink;
import org.apache.wayang.core.api.Configuration;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
```

### UNUSED_IMPORT
Unused import `import java.util.Stack;`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.Operator;`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/mappings/PageRankMapping.java`
#### Snippet
```java
import org.apache.wayang.basic.operators.PageRankOperator;
import org.apache.wayang.core.mapping.*;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.Subplan;
import org.apache.wayang.giraph.operators.GiraphPageRankOperator;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.Subplan;`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/mappings/PageRankMapping.java`
#### Snippet
```java
import org.apache.wayang.core.mapping.*;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.Subplan;
import org.apache.wayang.giraph.operators.GiraphPageRankOperator;
import org.apache.wayang.giraph.platform.GiraphPlatform;
```

### UNUSED_IMPORT
Unused import `import org.apache.giraph.conf.GiraphConfiguration;`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/platform/GiraphPlatform.java`
#### Snippet
```java
package org.apache.wayang.giraph.platform;

import org.apache.giraph.conf.GiraphConfiguration;
import org.apache.wayang.core.api.Configuration;
import org.apache.wayang.core.optimizer.costs.LoadProfileToTimeConverter;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSink;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSinkMapping.java`
#### Snippet
```java
import java.util.Collections;
import org.apache.wayang.basic.operators.ObjectFileSink;
import org.apache.wayang.basic.operators.TextFileSink;
import org.apache.wayang.core.mapping.Mapping;
import org.apache.wayang.core.mapping.OperatorPattern;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.java.operators.JavaTextFileSink;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSinkMapping.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.java.operators.JavaObjectFileSink;
import org.apache.wayang.java.operators.JavaTextFileSink;
import org.apache.wayang.java.platform.JavaPlatform;

```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSource;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import java.util.Collections;
import org.apache.wayang.basic.operators.ObjectFileSource;
import org.apache.wayang.basic.operators.TextFileSource;
import org.apache.wayang.core.mapping.Mapping;
import org.apache.wayang.core.mapping.OperatorPattern;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.java.operators.JavaTextFileSource;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.java.operators.JavaObjectFileSource;
import org.apache.wayang.java.operators.JavaTextFileSource;
import org.apache.wayang.java.platform.JavaPlatform;

```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSink;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
import org.apache.wayang.basic.channels.FileChannel;
import org.apache.wayang.basic.operators.ObjectFileSink;
import org.apache.wayang.basic.operators.TextFileSink;
import org.apache.wayang.core.api.exception.WayangException;
import org.apache.wayang.core.optimizer.OptimizationContext;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySink;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySink;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySource;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySource;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.commons.io.IOUtils;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
package org.apache.wayang.java.operators;

import org.apache.commons.io.IOUtils;
import org.apache.wayang.basic.channels.FileChannel;
import org.apache.wayang.basic.data.Record;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.util.fs.FileSystem;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.core.util.Tuple;
import org.apache.wayang.core.util.fs.FileSystem;
import org.apache.wayang.core.util.fs.FileSystems;
import org.apache.wayang.core.util.fs.FileUtils;
```

### UNUSED_IMPORT
Unused import `import java.io.BufferedReader;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import org.apache.wayang.java.platform.JavaPlatform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
```

### UNUSED_IMPORT
Unused import `import java.io.InputStreamReader;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Collection;
```

### UNUSED_IMPORT
Unused import `import java.io.UncheckedIOException;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.Collections;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
```

### UNUSED_IMPORT
Unused import `import java.util.Spliterators;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Stream;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.StreamSupport;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
```

### UNUSED_IMPORT
Unused import `import java.util.Spliterators;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
```

### UNUSED_IMPORT
Unused import `import java.util.stream.StreamSupport;`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
```

### UNUSED_IMPORT
Unused import `import org.apache.spark.util.AccumulatorV2;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/RddChannel.java`
#### Snippet
```java
package org.apache.wayang.spark.channels;

import org.apache.spark.util.AccumulatorV2;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.util.LongAccumulator;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.java.operators.JavaObjectFileSink;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSinkMapping.java`
#### Snippet
```java
import org.apache.wayang.core.mapping.SubplanPattern;
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.java.operators.JavaObjectFileSink;
import org.apache.wayang.java.platform.JavaPlatform;
import org.apache.wayang.spark.operators.SparkObjectFileSink;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.java.platform.JavaPlatform;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSinkMapping.java`
#### Snippet
```java
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.java.operators.JavaObjectFileSink;
import org.apache.wayang.java.platform.JavaPlatform;
import org.apache.wayang.spark.operators.SparkObjectFileSink;
import org.apache.wayang.spark.platform.SparkPlatform;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.CollectionSource;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import java.util.Collection;
import java.util.Collections;
import org.apache.wayang.basic.operators.CollectionSource;
import org.apache.wayang.basic.operators.ObjectFileSource;
import org.apache.wayang.basic.operators.TextFileSource;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.basic.operators.TextFileSource;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import org.apache.wayang.basic.operators.CollectionSource;
import org.apache.wayang.basic.operators.ObjectFileSource;
import org.apache.wayang.basic.operators.TextFileSource;
import org.apache.wayang.core.mapping.Mapping;
import org.apache.wayang.core.mapping.OperatorPattern;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.spark.operators.SparkCollectionSource;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import org.apache.wayang.core.mapping.SubplanPattern;
import org.apache.wayang.core.types.DataSetType;
import org.apache.wayang.spark.operators.SparkCollectionSource;
import org.apache.wayang.spark.operators.SparkObjectFileSource;
import org.apache.wayang.spark.operators.SparkTextFileSource;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.spark.operators.SparkTextFileSource;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
import org.apache.wayang.spark.operators.SparkCollectionSource;
import org.apache.wayang.spark.operators.SparkObjectFileSource;
import org.apache.wayang.spark.operators.SparkTextFileSource;
import org.apache.wayang.spark.platform.SparkPlatform;

```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySink;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkObjectFileSink.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySink;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.core.plan.wayangplan.UnarySource;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkObjectFileSource.java`
#### Snippet
```java
import org.apache.wayang.core.plan.wayangplan.ExecutionOperator;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.plan.wayangplan.UnarySource;
import org.apache.wayang.core.platform.ChannelDescriptor;
import org.apache.wayang.core.platform.ChannelInstance;
```

### UNUSED_IMPORT
Unused import `import org.apache.logging.log4j.Logger;`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/SourceProfiler.java`
#### Snippet
```java
import org.apache.wayang.java.operators.JavaExecutionOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;
```

## RuleId[id=ListRemoveInLoop]
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
        }
        nextGeneration.sort(Individual.fitnessComparator);
        for (int i = this.populationSize + this.eliteSize - 1; i >= this.populationSize; i--) {
            nextGeneration.remove(i);
        }
```

### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/TournamentSampler.java`
#### Snippet
```java
            // Trim the array.
            int newSize = (arena.size() + 1) / 2;
            for (int i = arena.size() - 1; i >= newSize; i--) {
                arena.remove(i);
            }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`this.bits[longPos] = this.bits[longPos] | (1L << offset)` could be simplified to 'this.bits\[longPos\] \|= (1L \<\< offset)'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Bitmask.java`
#### Snippet
```java
        final int longPos = getLongPos(index);
        final int offset = getOffset(index);
        this.bits[longPos] = this.bits[longPos] | (1L << offset);
        if (this.cardinalityCache != -1) this.cardinalityCache++;
        return true;
```

### ReplaceAssignmentWithOperatorAssignment
`overall = overall + this.progress.get(operatorName)` could be simplified to 'overall += this.progress.get(operatorName)'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java

        for (String operatorName: this.progress.keySet()) {
            overall = overall + this.progress.get(operatorName);
        }

```

### ReplaceAssignmentWithOperatorAssignment
`overall = overall/this.progress.size()` could be simplified to 'overall /= this.progress.size()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java

        if (this.progress.size()>0)
            overall = overall/this.progress.size();

        final FileSystem progressFile = FileSystems.getFileSystem(progressUrl).get();
```

### ReplaceAssignmentWithOperatorAssignment
`tupleLocalID = tupleLocalID + 1` could be simplified to 'tupleLocalID += 1'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/addUniqueID.java`
#### Snippet
```java

            outList.add(new Tuple2<Long, Input>(tupleLocalID, t));
            tupleLocalID = tupleLocalID + 1;
        }
        return outList.iterator();
```

### ReplaceAssignmentWithOperatorAssignment
`bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1)` could be simplified to 'bitIndex\[bIndex\] += 1'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java

            bitArray.set(permutationArray[k]);
            bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1);
            max = Math.max(max, bIndex + 1);

```

### ReplaceAssignmentWithOperatorAssignment
`bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1)` could be simplified to 'bitIndex\[bIndex\] += 1'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java

            bitArray.set(permutationArray[k]);
            bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1);
            max = Math.max(max, bIndex + 1);

```

### ReplaceAssignmentWithOperatorAssignment
`bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1)` could be simplified to 'bitIndex\[bIndex\] += 1'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java

            bitArray.set(permutationArray[k]);
            bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1);
            max = Math.max(max, bIndex + 1);

```

### ReplaceAssignmentWithOperatorAssignment
`bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1)` could be simplified to 'bitIndex\[bIndex\] += 1'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java

            bitArray.set(permutationArray[k]);
            bitIndex[bIndex] = (short) (bitIndex[bIndex] + 1);
            max = Math.max(max, bIndex + 1);

```

### ReplaceAssignmentWithOperatorAssignment
`len = len & 0x7f` could be simplified to 'len \&= 0x7f'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
            int shift = 7;
            int curr;
            len = len & 0x7f;
            while ((curr = dataInputView.readUnsignedByte()) >= HIGH_BIT) {
                len |= (curr & 0x7f) << shift;
```

### ReplaceAssignmentWithOperatorAssignment
`this.iterationCounter = this.iterationCounter - (real_iteration * expanded)` could be simplified to 'this.iterationCounter -= (real_iteration \* expanded)'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
                        if(this.iteration_expanded++ == expanded){
                            real_iteration = (this.getNumIterations() - (this.getNumIterations() % expanded)) / expanded;
                            this.iterationCounter = this.iterationCounter - (real_iteration * expanded);
                            DataSet<Type> input_iteration = ((DataSetChannel.Instance) inputs[ITERATION_INPUT_INDEX]).provideDataSet();
                            DataSetChannel.Instance output_final = ((DataSetChannel.Instance) outputs[FINAL_OUTPUT_INDEX]);
```

### ReplaceAssignmentWithOperatorAssignment
`sampleSize = sampleSize - result.size()` could be simplified to 'sampleSize -= result.size()'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
                miscalculated = true;
                tupleID = 0;
                sampleSize = sampleSize - result.size();
            }
        } while (miscalculated);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java
                    char[] cbuf = new char[1024];
                    int numReadChars, numLineFeeds = 0;
                    while ((numReadChars = bufferedReader.read(cbuf)) != -1) {
                        for (int i = 0; i < numReadChars; i++) {
                            if (cbuf[i] == '\n') {
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
        Gson gson = context.getGson();
        String line;
        while ((line = reader.readLine()) != null) {
            Experiment experiment = gson.fromJson(line, Experiment.class);
            experiments.add(experiment);
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
                .orElseThrow(() -> new WayangException("Could not find an execution plan."));
        this.logger.info("Picked {} as best plan.", bestPlanImplementation);
        return this.planImplementation = bestPlanImplementation;
    }

```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
            Queue<ExecutionStage> stagedStages = new LinkedList<>(executionPlan.getStartingStages());
            ExecutionStage nextStage;
            while ((nextStage = stagedStages.poll()) != null) {
                sb.append(nextStage).append(":\n");
                nextStage.getPlanAsString(sb, "* ");
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/InputSlot.java`
#### Snippet
```java
        for (int i = 0; i < this.getOwner().getNumInputs(); i++) {
            if (this.getOwner().getInput(i) == this) {
                return this.index = i;
            }
        }
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java
            // Initialize the JUEL conext.
            this.expressionFactory = new de.odysseus.el.ExpressionFactoryImpl();
            this.initializeContext(this.context = new SimpleContext());

            // Index the arguments.
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
                    // If the Iterator has made a full pass, replace it with a new one.
                    boolean isFullPass;
                    if (isFullPass = !partialIterator.hasNext()) {
                        assert i < this.partialIterators.size() - 1;
                        partialIterator = this.crossProductIterable.iterables.get(i).iterator();
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
            final Operator operator = operatorMatch.getOperator();
            String operatorName;
            if ((operatorName = operator.getName()) != null) {
                this.setNameTo(operatorName, replacementSubplan);
            }
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PushExecutorTemplate.java`
#### Snippet
```java
        protected void doExecute() {
            TaskActivator readyActivator;
            while ((readyActivator = this.readyActivators.poll()) != null) {
                // Execute the ExecutionTask.
                final ExecutionTask task = readyActivator.getTask();
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityPusher.java`
#### Snippet
```java

            // ...or if there are unmarked output estimates...
            if (hasUnmarkedOutputEstimates = !opCtx.isOutputMarked(outputIndex)) break;
        }

```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/StageAssignmentTraversal.java`
#### Snippet
```java
        // Expand the connected component.
        ExecutionTask task;
        while ((task = stagedTasks.poll()) != null) {
            connectedComponent.add(task);
            for (Channel channel : task.getInputChannels()) {
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
                throw new WayangException("Could not initialize cardinality repository.");
            }
            return this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
        } catch (WayangException e) {
            throw e;
```

### NestedAssignment
Result of assignment expression used
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimators.java`
#### Snippet
```java
        if (loadProfileEstimator instanceof DynamicLoadProfileEstimator) {
            mainEstimator = (DynamicLoadProfileEstimator) loadProfileEstimator;
        } else if (templateKey != null && (template = configuration.getStringProperty(templateKey, null)) != null) {
            mainEstimator = createFromTemplate(loadProfileEstimator.getConfigurationKey(), template, optimizationSpace);
        } else {
```

### NestedAssignment
Result of assignment expression used
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        String input;
        BufferedReader commandLine = new BufferedReader(new InputStreamReader(System.in));
        while ((input = commandLine.readLine()) != null) {
            final String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
                // Try to enumerate branches.
                EnumerationActivator enumerationActivator;
                if ((enumerationActivator = this.activatedEnumerations.poll()) != null) {
                    if (this.isTopLevel()) {
                        this.logger.debug("Execute {}.", enumerationActivator);
```

### NestedAssignment
Result of assignment expression used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java

            ConcatenationActivator concatenationActivator;
            while ((concatenationActivator = this.activatedConcatenations.poll()) != null) {
                if (this.isTopLevel()) {
                    this.logger.debug("Execute {} (open inputs: {}).",
```

### NestedAssignment
Result of assignment expression used
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java
     */
    public double updateFitness(ToDoubleFunction<Individual> fitnessFunction) {
        return this.fitness = fitnessFunction.applyAsDouble(this);
    }

```

### NestedAssignment
Result of assignment expression used
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        try (final InputStream inputStream = this.fs.open(this.testFileURl)) {
            long b;
            while ((b = inputStream.read(mb)) != -1) readBytes += b;
        } catch (IOException e) {
            System.err.println("Profile reading failed.");
```

### NestedAssignment
Result of assignment expression used
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
            int curr;
            len = len & 0x7f;
            while ((curr = dataInputView.readUnsignedByte()) >= HIGH_BIT) {
                len |= (curr & 0x7f) << shift;
                shift += 7;
```

### NestedAssignment
Result of assignment expression used
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                int tid = rand.nextInt(partitionSize); // sample item inside the partition
                ArrayList<Integer> list;
                if ((list = map.get(pid)) == null) { //first time in partition pid
                    list = new ArrayList<>();
                    list.add(tid);
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `collector` are updated, but never queried
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/OperatorProfilers.java`
#### Snippet
```java

    public static <T> SinkProfiler createCollectingJavaLocalCallbackSinkProfiler() {
        Collection<T> collector = new LinkedList<>();
        return new SinkProfiler(
                () -> new JavaLocalCallbackSink<>(collector::add, DataSetType.createDefault(Integer.class)),
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `tableMap` is accessed in both synchronized and unsynchronized contexts
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
  public final SqlDialect dialect;
  final JdbcConvention convention;
  private @Nullable ImmutableMap<String, JdbcTable> tableMap;
  private final boolean snapshot;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `logger` is accessed in both synchronized and unsynchronized contexts
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * Logger.
     */
    private Logger logger = LogManager.getLogger(this.getClass());

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `timeMeasurement` is accessed in both synchronized and unsynchronized contexts
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * Keeps track of the execution time.
     */
    private TimeMeasurement timeMeasurement;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `resultReference` is accessed in both synchronized and unsynchronized contexts
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * it is {@code null}.
     */
    private AtomicReference<PlanEnumeration> resultReference;

    /**
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ExecutionOperator.java`
#### Snippet
```java
            return loadProfileEstimatorConfigurationKey
                    .substring(0, loadProfileEstimatorConfigurationKey.length() - 5)
                    .concat(".limit");
        }
        return null;
```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/instrumentation/StopWatch.java`
#### Snippet
```java
  private void append(TimeMeasurement round, String indent, int numIndents, String bullet, int firstColumnWidth, StringBuilder sb) {
    int originalLength = sb.length();
    for (int i = 0; i < numIndents; i++) {
      sb.append(indent);
    }
```

### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
      result.append(Long.toHexString(hi8));
      String loString = Long.toHexString(lo8);
      for(int i=loString.length(); i < 16; ++i) {
        result.append('0');
      }
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'ArrayList' type conflicts with preceding 'instanceof Collection' check
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
                if(tmp instanceof Collection) {
                    this.nextElements = null;
                    this.nextElements_cole = (ArrayList) tmp;
                }else if(tmp instanceof Object[]){
                    this.nextElements = (Object[]) tmp;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `numExpectedIterations` initializer `0` is redundant
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
    protected final PredicateDescriptor<Collection<ConvergenceType>> criterionDescriptor;

    private Integer numExpectedIterations = 0;

    private State state;
```

### UnusedAssignment
Variable `numExpectedIterations` initializer `0` is redundant
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    protected final PredicateDescriptor<Collection<ConvergenceType>> criterionDescriptor;

    private Integer numExpectedIterations = 0;

    private State state;
```

### UnusedAssignment
Variable `resourceUtilization` initializer `1d` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfile.java`
#### Snippet
```java
     * The resource utilization of this load profile.
     */
    private double resourceUtilization = 1d;

    /**
```

### UnusedAssignment
Variable `eos` initializer `false` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java

    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;
```

### UnusedAssignment
Variable `stream` initializer `null` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;

    public ReaderIterator(DataInputStream stream) {
```

### UnusedAssignment
Variable `nextObj` initializer `null` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
public class ReaderIterator <Output> implements Iterator<Output> {

    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
```

### UnusedAssignment
Variable `platformOverheads` initializer `new HashMap<>()` is redundant
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
     * Maintains variables that quantify the overhead for initializing a {@link Platform}.
     */
    Map<Platform, Variable> platformOverheads = new HashMap<>();

    /**
```

### UnusedAssignment
Variable `dff` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
        public int compare(Data o1, Data o2) {
            // first level of sorting
            int dff = 0;
            if (asc1) {
                dff = o1.compareTo(o2);
```

### UnusedAssignment
Variable `dff2` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
            // second level of sorting
            if (dff == 0) {
                int dff2 = 0;
                if (asc2) {
                    dff2 = o1.compareRank(o2);
```

### UnusedAssignment
Variable `dff` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/DataComparator.java`
#### Snippet
```java
        Data<Type0, Type1> o1 = o1p._1();
        Data<Type0, Type1> o2 = o2p._1();
        int dff = 0;
        if (asc1) {
            dff = o1.compareTo(o2);
```

### UnusedAssignment
Variable `dff2` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/DataComparator.java`
#### Snippet
```java
        // second level of sorting
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareRank(o2);
```

### UnusedAssignment
Variable `dff` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/revDataComparator.java`
#### Snippet
```java
        Data<Type0, Type1> o1 = o1d._1();
        Data<Type0, Type1> o2 = o2d._1();
        int dff = 0;
        if (asc1) {
            dff = o1.compareRank(o2);
```

### UnusedAssignment
Variable `dff2` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/revDataComparator.java`
#### Snippet
```java
        }
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareTo(o2);
```

### UnusedAssignment
Variable `listOfListObject` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java

        final JavaRDD<Input> rdd0 = rinput.provideRdd();
        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
```

### UnusedAssignment
Variable `r1RowIDS` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        final JavaRDD<Input> rdd0 = rinput.provideRdd();
        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;
```

### UnusedAssignment
Variable `r2RowIDS` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;

```

### UnusedAssignment
Variable `outRDD` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;

        //get this from the user (SOMEHOW)
```

### UnusedAssignment
Variable `tmpOut1` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        r2RowIDS = r1RowIDS;

        JavaPairRDD<Long, Long> tmpOut1 = null;

        tmpOut1 = listOfListObject.flatMapToPair(new BitSetJoin<Type0, Type1>(list1ASC,
```

### UnusedAssignment
Variable `dff` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java

    public int compare(Data o1, Data o2) {
        int dff = 0;
        if (asc1) {
            dff = o1.compareRank(o2);
```

### UnusedAssignment
Variable `dff2` initializer `0` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
        }
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareTo(o2);
```

### UnusedAssignment
Variable `out` initializer `null` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
    public byte[] convertToByte(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        byte[] result = null;
        try {
```

### UnusedAssignment
Variable `listOfListObject` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        final JavaRDD<Input> rdd1 = rinput1.provideRdd();

        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
```

### UnusedAssignment
Variable `r1RowIDS` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java

        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;
```

### UnusedAssignment
Variable `r2RowIDS` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;

```

### UnusedAssignment
Variable `outRDD` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;

        //get this from the user (SOMEHOW)
```

### UnusedAssignment
Variable `tmpOut1` initializer `null` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        //}

        JavaPairRDD<Long, Long> tmpOut1 = null;

        tmpOut1 = listOfListObject.flatMapToPair(new BitSetJoin<Type0, Type1>(list1ASC,
```

### UnusedAssignment
Variable `iteration_generate` initializer `0` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    private int iterationCounter = 0;

    private int iteration_generate = 0;

    private int iteration_expanded = 0;
```

## RuleId[id=GroovyUnnecessaryReturn]
### GroovyUnnecessaryReturn
return is unnecessary as the last statement in a method with no return value
in `src/main/script/prerequisiteCheck.groovy`
#### Snippet
```java
        if (!result) {
            allConditionsMet = false
            return
        }
    }
```

### GroovyUnnecessaryReturn
return is unnecessary as the last statement in a method with no return value
in `src/main/script/prerequisiteCheck.groovy`
#### Snippet
```java
        if (!result) {
            allConditionsMet = false
            return
        }
    }
```

## RuleId[id=AssignmentUsedAsCondition]
### AssignmentUsedAsCondition
Assignment `isFullPass = !partialIterator.hasNext()` used as condition
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
                    // If the Iterator has made a full pass, replace it with a new one.
                    boolean isFullPass;
                    if (isFullPass = !partialIterator.hasNext()) {
                        assert i < this.partialIterators.size() - 1;
                        partialIterator = this.crossProductIterable.iterables.get(i).iterator();
```

### AssignmentUsedAsCondition
Assignment `hasUnmarkedOutputEstimates = !opCtx.isOutputMarked(outputIndex)` used as condition
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityPusher.java`
#### Snippet
```java

            // ...or if there are unmarked output estimates...
            if (hasUnmarkedOutputEstimates = !opCtx.isOutputMarked(outputIndex)) break;
        }

```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java
    public Canonicalizer(T... objs) {
        this(objs.length);
        for (T obj : objs) {
            this.add(obj);
        }
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
    public static <T> Set<T> asSet(T... values) {
        Set<T> set = new HashSet<>(values.length);
        for (T value : values) {
            set.add(value);
        }
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/SampleOperator.java`
#### Snippet
```java
         * Reservoir sampling.
         */
        RESERVOIR;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
import org.apache.wayang.core.api.exception.WayangException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;

import java.io.InputStream;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
import org.apache.wayang.core.util.Formats;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;

import java.util.ArrayList;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimatorManager.java`
#### Snippet
```java
import org.apache.wayang.core.platform.Junction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;

import java.util.Collections;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapOperator.java`
#### Snippet
```java
                    );

            fex.setRichFunction(richFunction);;

            dataSetOutput = dataSetInput
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
        } else if (operatorContext.getInputCardinality(0).getGeometricMeanEstimate() <= operatorContext.getInputCardinality(1).getGeometricMeanEstimate()) {
            // Fallback: Materialize one side.
            final Collection<InputType0> collection = (Collection<InputType0>) ((JavaChannelInstance) inputs[0]).provideStream().collect(Collectors.toList());
            final Stream<InputType1> stream = ((JavaChannelInstance) inputs[1]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java

        } else {
            final Collection<InputType1> collection = (Collection<InputType1>) ((JavaChannelInstance) inputs[1]).provideStream().collect(Collectors.toList());
            final Stream<InputType0> stream = ((JavaChannelInstance) inputs[0]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
```

### SimplifyStreamApiCallChains
'Stream.allMatch(x -\> !(...))' can be replaced with 'noneMatch()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionPlan.java`
#### Snippet
```java

        boolean isAllChannelsOriginal = allChannels.stream()
                .allMatch(channel -> !channel.isCopy());
        if (!isAllChannelsOriginal) {
            this.logger.error("There are channels that are copies.");
```

### SimplifyStreamApiCallChains
Can be replaced with 'boxed'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangArrays.java`
#### Snippet
```java
     */
    public static List<Long> asList(long... values) {
        return Arrays.stream(values).mapToObj(Long::valueOf).collect(Collectors.toList());
    }

```

### SimplifyStreamApiCallChains
Can be replaced with 'boxed'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangArrays.java`
#### Snippet
```java
     */
    public static List<Integer> asList(int... values) {
        return Arrays.stream(values).mapToObj(Integer::valueOf).collect(Collectors.toList());
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
    map.entrySet()
        .stream()
        .forEach(
          entry -> {
            insertType(entry.getValue()).accept(entry.getKey(), entry.getValue());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
        List<Type> genericSupertypes = Stream.concat(
                Stream.of(subclass.getGenericSuperclass()), Stream.of(subclass.getGenericInterfaces())
        ).collect(Collectors.toList());

        for (Type supertype : genericSupertypes) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
        double correctnessProb = spec.getDouble("p");
        List<String> operatorProperties = spec.has("import") ?
                StreamSupport.stream(spec.optionalWayangJsonArray("import").spliterator(), false).map(Objects::toString).collect(Collectors.toList()) :
                Collections.emptyList();

```

### SimplifyStreamApiCallChains
Can be replaced with 'min()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/AggregatingCardinalityEstimator.java`
#### Snippet
```java
                .sorted((estimate1, estimate2) ->
                        Double.compare(estimate2.getCorrectnessProbability(), estimate1.getCorrectnessProbability()))
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
```

### SimplifyStreamApiCallChains
'Stream.allMatch(x -\> !(...))' can be replaced with 'noneMatch()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     */
    public boolean deemsComprehensive(PlanEnumeration enumeration) {
        return enumeration.getServingOutputSlots().stream().allMatch(
                outputService -> !deemsRelevant(outputService.getField1())
        ) && enumeration.getRequestedInputSlots().stream().allMatch(
```

### SimplifyStreamApiCallChains
'Stream.allMatch(x -\> !(...))' can be replaced with 'noneMatch()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
        return enumeration.getServingOutputSlots().stream().allMatch(
                outputService -> !deemsRelevant(outputService.getField1())
        ) && enumeration.getRequestedInputSlots().stream().allMatch(
                input -> !deemsRelevant(input)
        );
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIESelfJoinOperator.java`
#### Snippet
```java
        } else {
            // Fallback: Materialize one side.
            final Collection<Input> collection = ((JavaChannelInstance) inputs[0]).<Input>provideStream().collect(Collectors.toList());
            stream0 = collection.stream();
        }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIEJoinOperator.java`
#### Snippet
```java
        } else {
            // Fallback: Materialize one side.
            final Collection<Input> collection = ((JavaChannelInstance) inputs[0]).<Input>provideStream().collect(Collectors.toList());
            stream0 = collection.stream();
            stream1 = ((JavaChannelInstance) inputs[1]).provideStream();
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/types/BasicDataUnitType.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public <T> DataUnitType<T> unchecked() {
        return (DataUnitType<T>) this;
    }
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `Set`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * @return the intersection of all {@link Platform} restrictions in the matched {@link Operator}s
     */
    public Optional<Set<Platform>> getTargetPlatforms() {
        if (this.targetPlatforms == null) {
            this.targetPlatforms = this.operatorMatches.values().stream()
```

### OptionalContainsCollection
'Optional' contains collection `Set`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * <i>Lazily initialized.</i> {@link Platform} restrictions coming from the matched {@link Operator}s.
     */
    private Optional<Set<Platform>> targetPlatforms = null;

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
                return (T) Float.valueOf(line);
            } else if (typeClass == String.class) {
                return (T) String.valueOf(line);
            } else throw new WayangException(String.format("Cannot parse TSV file line %s", line));
        } else if (typeClass == Record.class) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
        for (int i = 1; i <= numActiveStages; ++i) {
            // TODO: Better pass the stage to the thread rather than letting the thread retrieve the stage itself (to avoid concurrency issues).
            Thread thread = new Thread(new ParallelExecutionThread(isBreakpointsDisabled, "T" + String.valueOf(i), this));
            // Start thread execution
            thread.start();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java

            StageActivator stageActivator;
            this.crossPlatformExecutor.logger.info("Thread " + String.valueOf(this.threadId) + " started");
            // Loop until there is no activated stage or only one thread running
            do {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
                        // TODO: Better use Java's ForkJoinPool to reduce thread creation overhead and control concurrency.
                        // Create parallel stage execution thread
                        Thread thread = new Thread(new ParallelExecutionThread(this.thread_isBreakpointDisabled, "T" + String.valueOf(i) + "@" + this.threadId, this.crossPlatformExecutor));
                        thread.start();
                        synchronized (this.crossPlatformExecutor) {
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java
                        this.dataQuantum = dataQuantum;
                        Tuple2 tuple2 = (Tuple2) dataQuantum;
                        return String.valueOf(tuple2.field0) + '\t' + String.valueOf(tuple2.field1);                    }
                }).setParallelism(flinkExecutor.getNumDefaultPartitions());

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTsvFileSink.java`
#### Snippet
```java
                    @SuppressWarnings("unchecked")
                    Tuple2<Object, Object> tuple2 = (Tuple2<Object, Object>) dataQuantum;
                    return String.valueOf(tuple2.field0) + '\t' + String.valueOf(tuple2.field1);
                });
        this.name(serializedRdd);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public Record apply(Record input) {
            Object[] projectedFields = new Object[this.fieldIndices.length];
            for (int i = 0; i < this.fieldIndices.length; i++) {
```

### RedundantSuppression
Redundant suppression
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ChannelInitializer.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    default ChannelInitializer unchecked() {
        return this;
    }
```

### RedundantSuppression
Redundant suppression
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> deserializeAllAsList(WayangJsonArray wayangJsonArray, JsonSerializer<T> serializer) {
        List<T> result = new ArrayList<>(wayangJsonArray.length());
        for (Object jsonElement : wayangJsonArray) {
```

### RedundantSuppression
Redundant suppression
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> deserializeAllAsList(WayangJsonArray wayangJsonArray, JsonSerializer<T> serializer, Class<T> cls) {
        List<T> result = new ArrayList<>(wayangJsonArray.length());
        for (Object jsonElement : wayangJsonArray) {
```

### RedundantSuppression
Redundant suppression
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java

        @SuppressWarnings("unchecked")
        public T apply(Map<String, Object> values) {
            return this.apply(values, false);
        }
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <Type> Collection<Type> getBroadcast(String name) {
        return this.richFunction.getRuntimeContext().getBroadcastVariable(name);
    }
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/CoGroupMapping.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class CoGroupMapping implements Mapping {

    @Override
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/JoinMapping.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class JoinMapping implements Mapping{
    @Override
    public Collection<PlanTransformation> getTransformations() {
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCollectionSource.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCollectionSource.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDoWhileOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaFilterOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLoopOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
        public T next() {
            Validate.isTrue(this.hasNext());
            @SuppressWarnings("unchecked")
            final T result;
            if(this.nextElements_cole != null){
                result = (T) this.nextElements_cole.get(this.nextIndex);
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRepeatOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaReservoirSampleOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/mapping/ProjectionMapping.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class ProjectionMapping implements Mapping {

    @Override
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/BroadcastChannel.java`
#### Snippet
```java

        @SuppressWarnings("unchecked")
        public Broadcast<?> provideBroadcast() {
            assert this.broadcast != null : String.format("Broadcast for %s not initialized.", this.getChannel());
            return this.broadcast;
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkDoWhileOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLoopOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRepeatOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> evaluate(
            ChannelInstance[] inputs,
            ChannelInstance[] outputs,
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/mapping/FilterMapping.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class FilterMapping implements Mapping {

    @Override
```

### RedundantSuppression
Redundant suppression
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/mapping/ProjectionMapping.java`
#### Snippet
```java
 */
@SuppressWarnings("unchecked")
public class ProjectionMapping implements Mapping {

    @Override
```

### RedundantSuppression
Redundant suppression
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/addUniqueID.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public Iterator<Tuple2<Long, Input>> call(Integer in, Iterator<Input> arg0)
            throws Exception {

```

### RedundantSuppression
Redundant suppression
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/filterUnwantedBlocks.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public Boolean call(
            Tuple2<Tuple5<Long, Type0, Type0, Type1, Type1>, Tuple5<Long, Type0, Type0, Type1, Type1>> in)
            throws Exception {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'targetPlatforms'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * <i>Lazily initialized.</i> {@link Platform} restrictions coming from the matched {@link Operator}s.
     */
    private Optional<Set<Platform>> targetPlatforms = null;

    /**
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'measuredCardinality'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AbstractChannelInstance.java`
#### Snippet
```java
public abstract class AbstractChannelInstance extends ExecutionResourceTemplate implements ChannelInstance {

    private OptionalLong measuredCardinality = OptionalLong.empty();

    private boolean wasProduced = false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'mainEstimatorOpt'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
     * @param configuration      provides the UDF {@link LoadProfileEstimator}
     */
    public static void nestUdfEstimator(Optional<LoadProfileEstimator> mainEstimatorOpt,
                                        FunctionDescriptor functionDescriptor,
                                        Configuration configuration) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
     */
    private static Iterator<String> createLineIterator(FileSystem fileSystem, String path) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(fileSystem.open(path), "UTF-8"));
        return new Iterator<String>() {

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSink.java`
#### Snippet
```java
        try (final BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        fileSystem.create(path), "UTF-8"
                )
        )) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
    public Collection<Experiment> load(InputStream inputStream) throws IOException {
        try {
            return load(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpectedly, UTF-8 is not supported.");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
    public void save(Collection<Experiment> experiments, OutputStream outputStream) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            this.save(experiments, writer);
        } catch (UnsupportedEncodingException e) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileUtils.java`
#### Snippet
```java
     */
    private static Iterator<String> createLineIterator(FileSystem fileSystem, String path) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(fileSystem.open(path), "UTF-8"));
        return new Iterator<String>() {

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
                throw new WayangException("Could not initialize cardinality repository.");
            }
            return this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
        } catch (WayangException e) {
            throw e;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
        this.writer = null;
        final PartialExecution.Serializer serializer = new PartialExecution.Serializer(this.configuration);
        return Files.lines(Paths.get(this.repositoryPath), Charset.forName("UTF-8"))
                .map(line -> {
                    try {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/CardinalityRepository.java`
#### Snippet
```java
                throw new WayangException("Could not initialize cardinality repository.");
            }
            this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
        }
        return this.writer;
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkTextFileSourceProfiler.java`
#### Snippet
```java
                new OutputStreamWriter(
                        fileSystem.create(this.fileUrl),
                        "UTF-8"
                )
        )) {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
        relTree.explain(relWriter);

        System.out.println(sw.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
        operators.forEach(o -> sw.append(o.toString()));

        System.out.println(sw.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java

    public static void printRecord(Record record) {
        System.out.println(record.toString());
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
            Util.enumVal(TableType.OTHER, tableTypeName2);
        if (tableType == TableType.OTHER  && tableTypeName2 != null) {
          System.out.println("Unknown table type: " + tableTypeName2);
        }
        final JdbcTable table =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
            return (T) new Record(objects);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        throw new IllegalStateException(String.format("Error while parsing CSV file %s at line %s", sourcePath, s));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LocalCallbackSink.java`
#### Snippet
```java

    public static <T> LocalCallbackSink<T> createStdoutSink(Class<T> typeClass) {
        return new LocalCallbackSink<>((ConsumerDescriptor.SerializableConsumer<T>)System.out::println, typeClass);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LocalCallbackSink.java`
#### Snippet
```java

    public static <T> LocalCallbackSink<T> createStdoutSink(DataSetType<T> type) {
        return new LocalCallbackSink<>((ConsumerDescriptor.SerializableConsumer<T>)System.out::println, type);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LocalCallbackSink.java`
#### Snippet
```java
     */
    public LocalCallbackSink(Class<T> typeClass ){
        this((FunctionDescriptor.SerializableConsumer<T>)System.out::println, typeClass);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
            StreamChunker streamChunker = new StreamChunker(10, (chunk, size) -> {
                if (chunk.length != size) {
                    System.out.println("heer");
                    System.out.println(chunk.length);
                    System.out.println(size);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
                if (chunk.length != size) {
                    System.out.println("heer");
                    System.out.println(chunk.length);
                    System.out.println(size);
                    chunk = Arrays.copyOfRange(chunk, 0, size);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
                    System.out.println("heer");
                    System.out.println(chunk.length);
                    System.out.println(size);
                    chunk = Arrays.copyOfRange(chunk, 0, size);
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
   // String url = "s3://blossom-benchmark/README.md";
    String url = "s3://blossom-benchmark/lulu/lolo/lala";
    System.out.println(url);
    System.out.println(s3.getS3Pair(url).getBucket());
    System.out.println(s3.getS3Pair(url).getKey());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    String url = "s3://blossom-benchmark/lulu/lolo/lala";
    System.out.println(url);
    System.out.println(s3.getS3Pair(url).getBucket());
    System.out.println(s3.getS3Pair(url).getKey());
    System.out.println(s3.preFoldersExits(s3.getS3Pair(url)));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    System.out.println(url);
    System.out.println(s3.getS3Pair(url).getBucket());
    System.out.println(s3.getS3Pair(url).getKey());
    System.out.println(s3.preFoldersExits(s3.getS3Pair(url)));

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    System.out.println(s3.getS3Pair(url).getBucket());
    System.out.println(s3.getS3Pair(url).getKey());
    System.out.println(s3.preFoldersExits(s3.getS3Pair(url)));

   // System.out.println(s3.getFileSize(url));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessReceiver.java`
#### Snippet
```java

    public void print(){
        iterator.forEachRemaining(x -> System.out.println(x.toString()));

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
        //write(serializedUDF.toByteArray(), dataOut);
        writeBytes(serializedUDF.toByteArray(), dataOut);
        System.out.println("UDF written");

    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
             */
            else if (obj instanceof Byte[] || obj instanceof byte[]) {
                System.out.println("Writing Bytes");
                writeBytes(obj, dataOut);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
        throws IOException {

        System.out.println("iterator being send");
        int buffer = 0;
        for (Iterator<Input> it = iter; it.hasNext(); ) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
            this.socket.close();
            this.serverSocket.close();
            System.out.println("Everything closed");
        } catch (IOException e) {
            e.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java

            } catch (Exception e) {
                System.out.println(e);
                throw new WayangException("Python worker failed to connect back.", e);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
            }
        } catch (Exception e){
            System.out.println(e);
            throw new WayangException("Python worker failed");
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
    private void modifyFilters(String[] commandLine) {
        if (commandLine.length == 1) {
            System.out.println("filter <name|platform|operator> <regex>");
            System.out.println("filter clear");
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        if (commandLine.length == 1) {
            System.out.println("filter <name|platform|operator> <regex>");
            System.out.println("filter clear");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                return;
            case "name":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> operatorContext.getOperator().getName())
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            case "operator":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> operatorContext.getOperator().getClass().getSimpleName())
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            case "platform":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> ((ExecutionOperator) operatorContext.getOperator()).getPlatform())
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            default:
                System.out.println("Unknown filter type.");
                return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java

    private void print(PartialExecution pe) {
        System.out.printf("Partial execution with %d execution groups:\n", pe.getAtomicExecutionGroups().size());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(pe.getMeasuredExecutionTime(), true));
        System.out.printf("> Estimated execution time: %s\n", pe.getOverallTimeEstimate(this.configuration));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
    private void print(PartialExecution pe) {
        System.out.printf("Partial execution with %d execution groups:\n", pe.getAtomicExecutionGroups().size());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(pe.getMeasuredExecutionTime(), true));
        System.out.printf("> Estimated execution time: %s\n", pe.getOverallTimeEstimate(this.configuration));
        System.out.printf("> Delta: %s\n", pe.getOverallTimeEstimate(this.configuration).plus(-pe.getMeasuredExecutionTime()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        System.out.printf("Partial execution with %d execution groups:\n", pe.getAtomicExecutionGroups().size());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(pe.getMeasuredExecutionTime(), true));
        System.out.printf("> Estimated execution time: %s\n", pe.getOverallTimeEstimate(this.configuration));
        System.out.printf("> Delta: %s\n", pe.getOverallTimeEstimate(this.configuration).plus(-pe.getMeasuredExecutionTime()));
        for (AtomicExecutionGroup atomicExecutionGroup : pe.getAtomicExecutionGroups()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(pe.getMeasuredExecutionTime(), true));
        System.out.printf("> Estimated execution time: %s\n", pe.getOverallTimeEstimate(this.configuration));
        System.out.printf("> Delta: %s\n", pe.getOverallTimeEstimate(this.configuration).plus(-pe.getMeasuredExecutionTime()));
        for (AtomicExecutionGroup atomicExecutionGroup : pe.getAtomicExecutionGroups()) {
            System.out.printf("--> %s: %s\n", atomicExecutionGroup, atomicExecutionGroup.estimateExecutionTime());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        System.out.printf("> Delta: %s\n", pe.getOverallTimeEstimate(this.configuration).plus(-pe.getMeasuredExecutionTime()));
        for (AtomicExecutionGroup atomicExecutionGroup : pe.getAtomicExecutionGroups()) {
            System.out.printf("--> %s: %s\n", atomicExecutionGroup, atomicExecutionGroup.estimateExecutionTime());
        }
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
            System.out.printf("--> %s: %s\n", atomicExecutionGroup, atomicExecutionGroup.estimateExecutionTime());
        }
        System.out.println();
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                    return;
                default:
                    System.out.println("Unknown command.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
    private void modifySorting(String[] commandLine) {
        if (commandLine.length == 1) {
            System.out.println("sort <est|run|delta> [asc|desc]");
            System.out.println("sort clear");
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        if (commandLine.length == 1) {
            System.out.println("sort <est|run|delta> [asc|desc]");
            System.out.println("sort clear");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            default:
                System.out.println("Unknown filter type.");
                return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                .map(PartialExecution::getMeasuredExecutionTime)
                .reduce(0L, (a, b) -> a + b);
        System.out.printf("Found %d partial executions.\n", this.createPartialExecutionStream().count());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(overallMeasuredTime, true));
        System.out.printf("> Estimated execution time: %s\n", overallTimeEstimate);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                .reduce(0L, (a, b) -> a + b);
        System.out.printf("Found %d partial executions.\n", this.createPartialExecutionStream().count());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(overallMeasuredTime, true));
        System.out.printf("> Estimated execution time: %s\n", overallTimeEstimate);
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        System.out.printf("Found %d partial executions.\n", this.createPartialExecutionStream().count());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(overallMeasuredTime, true));
        System.out.printf("> Estimated execution time: %s\n", overallTimeEstimate);
        System.out.println();
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(overallMeasuredTime, true));
        System.out.printf("> Estimated execution time: %s\n", overallTimeEstimate);
        System.out.println();
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/util/ProfilingUtils.java`
#### Snippet
```java
    public static void sleep(long millis) {
        try {
            System.out.printf("Sleeping for %s.\n", Formats.formatDuration(millis));
            Thread.sleep(millis);
        } catch (InterruptedException e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
     */
    private static SparkOperatorProfiler.Result profile(SparkOperatorProfiler opProfiler, long... cardinalities) {
        System.out.printf("Profiling %s with %s data quanta.\n", opProfiler, WayangArrays.asList(cardinalities));
        final StopWatch stopWatch = createStopWatch();
        SparkOperatorProfiler.Result result = null;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java

        try {
            System.out.println("Prepare...");
            final TimeMeasurement preparation = stopWatch.start("Preparation");
            SparkPlatform.getInstance().warmUp(new Configuration());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
            preparation.stop();

            System.out.println("Execute...");
            final TimeMeasurement execution = stopWatch.start("Execution");
            result = opProfiler.run();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
            execution.stop();
        } finally {
            System.out.println("Clean up...");
            final TimeMeasurement cleanUp = stopWatch.start("Clean up");
            opProfiler.cleanUp();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
            cleanUp.stop();

            System.out.println("Measurement:");
            if (result != null) System.out.println(result);
            System.out.println(stopWatch.toPrettyString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java

            System.out.println("Measurement:");
            if (result != null) System.out.println(result);
            System.out.println(stopWatch.toPrettyString());
            System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
            System.out.println("Measurement:");
            if (result != null) System.out.println(result);
            System.out.println(stopWatch.toPrettyString());
            System.out.println();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
            if (result != null) System.out.println(result);
            System.out.println(stopWatch.toPrettyString());
            System.out.println();
        }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.printf("Usage: java %s <operator to profile> [<cardinality n>[,<cardinality n>]*]+ \n", Main.class);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
//            }
            default:
                System.out.println("Unknown operator: " + operator);
                return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
        }

        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java

        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
    public String profile(int sizeInMB) {
        long writeNanos = this.profileWriting(sizeInMB);
        System.out.println("Sleeping for 10 sec...");
        ProfilingUtils.sleep(10000);
        long readNanos = this.profileReading(sizeInMB);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java

        // Write the requested amount of MB and measure.
        System.out.printf("Start reading %d MB... ", sizeInMB);
        long startReadTime = System.nanoTime();
        long readBytes = 0; // for sanity checking
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
            while ((b = inputStream.read(mb)) != -1) readBytes += b;
        } catch (IOException e) {
            System.err.println("Profile reading failed.");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        }
        long endReadTime = System.nanoTime();
        System.out.println("done.");
        long expectedBytes = sizeInMB * 1024L * 1024L;
        if (expectedBytes != readBytes) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        long expectedBytes = sizeInMB * 1024L * 1024L;
        if (expectedBytes != readBytes) {
            System.out.printf("Warning: Expected %d bytes, but found %d.\n", expectedBytes, readBytes);
            sizeInMB = (int) readBytes / 1024 / 1024;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        }

        System.out.printf("Reading %d MB from %s completed in %s.\n",
                sizeInMB, this.testFileURl, Formats.formatDuration((endReadTime - startReadTime) / 1000 / 1000, true)
        );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java

        // Write the requested amount of MB and measure.
        System.out.printf("Start writing %d MB... ", sizeInMB);
        long startWriteTime = System.nanoTime();
        int writtenInMB = 0;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            System.err.println("Profile writing failed.");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        }
        long endWriteTime = System.nanoTime();
        System.out.printf("done.");

        System.out.printf("Writing %d MB to %s completed in %s.\n",
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        System.out.printf("done.");

        System.out.printf("Writing %d MB to %s completed in %s.\n",
                sizeInMB, this.testFileURl, Formats.formatDuration((endWriteTime - startWriteTime) / 1000 / 1000, true)
        );
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.printf(
                    "Usage: java ... %s <URL to profile> <MB to use>[,<MB to use>]*\n",
                    DiskProfiler.class
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        }

        System.out.println();
        System.out.println("size_in_mb,write_nanos,read_nanos");
        measurementCsvRows.forEach(System.out::println);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java

        System.out.println();
        System.out.println("size_in_mb,write_nanos,read_nanos");
        measurementCsvRows.forEach(System.out::println);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        System.out.println();
        System.out.println("size_in_mb,write_nanos,read_nanos");
        measurementCsvRows.forEach(System.out::println);
    }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
    public boolean test(Collection<Tuple2<Double, Double>> collection) {
        Tuple2<Double, Double> input = WayangCollections.getSingle(collection);
        System.out.println("Running iteration: " + current_iteration);
        return (input.field0 < accuracy * Math.max(input.field1, 1.0) || current_iteration > max_iterations);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
                                                   int cardinality0,
                                                   int cardinality1) {
        System.out.println("Running garbage collector...");
        for (int i = 0; i < GC_RUNS; i++) {
            System.gc();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        ProfilingUtils.sleep(1000);

        System.out.printf("Profiling %s with %dx%d data quanta.\n", binaryOperatorProfiler.getOperator(), cardinality0, cardinality1);
        final StopWatch stopWatch = createStopWatch();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        final StopWatch stopWatch = createStopWatch();

        System.out.println("Prepare...");
        final TimeMeasurement preparation = stopWatch.start("Preparation");
        binaryOperatorProfiler.prepare(cardinality0, cardinality1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = binaryOperatorProfiler.run();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.printf("Usage: java %s <operator to profile> <cardinality>[,<cardinality>]\n", Profiler.class);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
            }
            default:
                System.out.println("Unknown operator: " + operator);
                return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        }

        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println();
        System.out.println(WayangCollections.getAny(results).getCsvHeader());
        results.forEach(result -> System.out.println(result.toCsvString()));
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

    private static OperatorProfiler.Result profile(SinkProfiler sinkProfiler, int cardinality) {
        System.out.println("Running garbage collector...");
        for (int i = 0; i < GC_RUNS; i++) {
            System.gc();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        ProfilingUtils.sleep(1000);

        System.out.printf("Profiling %s with %d data quanta.\n", sinkProfiler, cardinality);
        final StopWatch stopWatch = createStopWatch();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        final StopWatch stopWatch = createStopWatch();

        System.out.println("Prepare...");
        final TimeMeasurement preparation = stopWatch.start("Preparation");
        sinkProfiler.prepare(cardinality);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = sinkProfiler.run();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

    private static OperatorProfiler.Result profile(UnaryOperatorProfiler unaryOperatorProfiler, int cardinality) {
        System.out.println("Running garbage collector...");
        for (int i = 0; i < GC_RUNS; i++) {
            System.gc();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        ProfilingUtils.sleep(1000);

        System.out.printf("Profiling %s with %d data quanta.\n", unaryOperatorProfiler, cardinality);
        final StopWatch stopWatch = createStopWatch();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        final StopWatch stopWatch = createStopWatch();

        System.out.println("Prepare...");
        final TimeMeasurement preparation = stopWatch.start("Preparation");
        unaryOperatorProfiler.prepare(cardinality);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = unaryOperatorProfiler.run();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

    private static OperatorProfiler.Result profile(SourceProfiler sourceProfiler, int cardinality) {
        System.out.println("Running garbage collector...");
        for (int i = 0; i < GC_RUNS; i++) {
            System.gc();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        ProfilingUtils.sleep(1000);

        System.out.printf("Profiling %s with %d data quanta.\n", sourceProfiler, cardinality);
        final StopWatch stopWatch = createStopWatch();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        final StopWatch stopWatch = createStopWatch();

        System.out.println("Prepare...");
        final TimeMeasurement preparation = stopWatch.start("Preparation");
        sourceProfiler.prepare(cardinality);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = sourceProfiler.run();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java
    }
    long after = System.currentTimeMillis();
    System.out.println(
      String.format(
        "the platform %s took %f s",
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.print("Usage: <platform1>[,<platform2>]* <query number> <query parameters>*");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
                break;
            default:
                System.err.println("Unsupported query number.");
                System.exit(2);
                return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
                    break;
                default:
                    System.err.format("Unknown platform: \"%s\"\n", platform);
                    System.exit(3);
                    return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
    public void run() {
        if (this.optimizationSpace.getNumDimensions() == 0) {
            System.out.println("There is nothing to optimize - all estimators are specified in the configuration.");
            System.exit(0);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                final Set<String> templateKeys = this.getLoadProfileEstimatorTemplateKeys(representative);
                if (group.size() < 2) {
                    System.out.printf("Few measurement points for %s\n", templateKeys);
                }
                if (representative.getAtomicExecutionGroups().size() > 3) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                }
                if (representative.getAtomicExecutionGroups().size() > 3) {
                    System.out.printf("Many subjects for %s\n", templateKeys);
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                long maxExecTime = group.stream().mapToLong(PartialExecution::getMeasuredExecutionTime).max().getAsLong();
                if (maxExecTime - minExecTime < 1000) {
                    System.out.printf("Narrow training data for %s\n", templateKeys);
                    continue;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                // Check if we actually have a good model.
                if (partialExecutionDeviations.isEmpty()) {
                    System.out.printf("All %d executions are explained well by the current model.\n", this.partialExecutions.size());
                    break;
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

                // Remove the worst PartialExecutions.
                System.out.printf("The current model is not explaining well %d of %d measured executions.\n",
                        partialExecutionDeviations.size(),
                        this.partialExecutions.size()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                            partialExecution, this.platformOverheads, this.configuration
                    );
                    System.out.printf("Removing %s... (estimated %s, deviation %,.2f)\n",
                            format(partialExecution), Formats.formatDuration(Math.round(timeEstimate)), deviation
                    );
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

        if (optimizer.getActivatedGenes().isEmpty()) {
            System.out.println("There is an optimization task without optimizable genes. It will be skipped");
            return new Tuple<>(currentGeneration, individuals);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

        int updateFrequency = (int) this.configuration.getLongProperty("wayang.profiler.ga.intermediateupdate", 10000);
        System.out.printf("Optimizing %d variables on %d partial executions (e.g., %s).\n",
                optimizer.getActivatedGenes().cardinality(),
                optimizer.getData().size(),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            // Print status.
            if (i % maxStableGenerations == 0) {
                System.out.printf(
                        "Fittest individual of generation %,d (%,d): %,.4f\n",
                        i,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

            if (updateFrequency > 0 && i > 0 && i % updateFrequency == 0) {
                System.out.println("Intermediate update:");
                this.printResults(optimizer, individuals.get(0));
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        }

        System.out.printf(
                "Final fittest individual of generation %,d (%,d): %,.4f\n",
                i,
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
    private void printResults(GeneticOptimizer optimizer, Individual individual) {
        // Print the training data vs. the estimates.
        System.out.println();
        System.out.printf("=== Stats for fittest individual (fitness=%,.4f)\n", individual.getFitness());
        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        // Print the training data vs. the estimates.
        System.out.println();
        System.out.printf("=== Stats for fittest individual (fitness=%,.4f)\n", individual.getFitness());
        System.out.println();
        System.out.println("Training data vs. measured");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        System.out.println();
        System.out.printf("=== Stats for fittest individual (fitness=%,.4f)\n", individual.getFitness());
        System.out.println();
        System.out.println("Training data vs. measured");
        System.out.println("==========================");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        System.out.printf("=== Stats for fittest individual (fitness=%,.4f)\n", individual.getFitness());
        System.out.println();
        System.out.println("Training data vs. measured");
        System.out.println("==========================");
        List<PartialExecution> data = new ArrayList<>(optimizer.getData());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        System.out.println();
        System.out.println("Training data vs. measured");
        System.out.println("==========================");
        List<PartialExecution> data = new ArrayList<>(optimizer.getData());
        data.sort((e1, e2) -> Long.compare(e2.getMeasuredExecutionTime(), e1.getMeasuredExecutionTime()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        for (PartialExecution partialExecution : data) {
            final double timeEstimate = individual.estimateTime(partialExecution, this.platformOverheads, this.configuration);
            System.out.printf("Actual %13s | Estimated: %72s | %3d execution groups | %s\n",
                    Formats.formatDuration(partialExecution.getMeasuredExecutionTime()),
                    Formats.formatDuration(Math.round(timeEstimate)),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        }

        System.out.println();
        System.out.println("Configuration file");
        System.out.println("==================");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

        System.out.println();
        System.out.println("Configuration file");
        System.out.println("==================");
        this.printLearnedConfiguration(optimizer, individual, System.out);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        System.out.println();
        System.out.println("Configuration file");
        System.out.println("==================");
        this.printLearnedConfiguration(optimizer, individual, System.out);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        System.out.println("Configuration file");
        System.out.println("==================");
        this.printLearnedConfiguration(optimizer, individual, System.out);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> !this.checkEstimatorTemplates(partialExecution));
            int newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions with no template-based estimators.\n", lastSize - newSize);
            lastSize = newSize;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> !this.checkSpread(partialExecution, maxCardinalitySpread));
            newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions with a too large cardinality spread (> %.2f).\n", lastSize - newSize, minCardinalityConfidence);
            lastSize = newSize;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> !this.checkNonEmptyCardinalities(partialExecution));
            newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions with zero cardinalities.\n", lastSize - newSize);
            lastSize = newSize;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> !this.checkConfidence(partialExecution, minCardinalityConfidence));
            newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions with a too low cardinality confidence (< %.2f).\n", lastSize - newSize, minCardinalityConfidence);
            lastSize = newSize;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> partialExecution.getMeasuredExecutionTime() < minExecutionTime);
            newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions with a too short runtime (< %,d ms).\n", lastSize - newSize, minExecutionTime);
            lastSize = newSize;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            this.partialExecutions.removeIf(partialExecution -> new Random().nextDouble() > samplingFactor);
            newSize = this.partialExecutions.size();
            System.out.printf("Removed %d executions due to sampling.\n", lastSize - newSize);
        } catch (Exception e) {
            throw new WayangException("Could not evaluate execution log.", e);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        double binningStretch = this.configuration.getDoubleProperty("wayang.profiler.ga.binning", 1.1d);
        if (binningStretch > 1d) {
            System.out.print("Applying binning... ");
            int numOriginalPartialExecutions = this.partialExecutions.size();
            this.partialExecutions.clear();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                this.partialExecutions.addAll(reducedGroup);
            }
            System.out.printf(
                    "reduced the number of partial executions from %d to %d.\n",
                    numOriginalPartialExecutions, this.partialExecutions.size()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        }

        System.out.printf(
                "Loaded %d execution records with %d template-based estimators types and %d platform overheads.\n",
                this.partialExecutions.size(), estimators.keySet().size(), this.platformOverheads.size()
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
        try {
            if (args.length == 0) {
                System.err.print("Usage: <platform1>[,<platform2>]* <input file URL>");
                System.exit(1);
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
                        break;
                    default:
                        System.err.format("Unknown platform: \"%s\"\n", platform);
                        System.exit(3);
                        return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java

            collector.sort((t1, t2) -> Integer.compare(t2.field1, t1.field1));
            System.out.printf("Found %d words:\n", collector.size());
            collector.forEach(wc -> System.out.printf("%dx %s\n", wc.field1, wc.field0));
        } catch (Exception e) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
            collector.sort((t1, t2) -> Integer.compare(t2.field1, t1.field1));
            System.out.printf("Found %d words:\n", collector.size());
            collector.forEach(wc -> System.out.printf("%dx %s\n", wc.field1, wc.field0));
        } catch (Exception e) {
            System.err.println("App failed.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
            collector.forEach(wc -> System.out.printf("%dx %s\n", wc.field1, wc.field0));
        } catch (Exception e) {
            System.err.println("App failed.");
            e.printStackTrace();
            System.exit(4);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
            @Override
            public void mapPartition(Iterable<I> iterable, Collector<O> collector) throws Exception {
                System.out.println(collector.getClass());
                Iterable<O> out = function.apply(iterable);
                for(O element: out){
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java
        org.apache.hadoop.conf.Configuration hadoopconf = sparkContext.hadoopConfiguration();
        for (String property: OPTIONAL_HADOOP_PROPERTIES){
            System.out.println(property);
            configuration.getOptionalStringProperty(property).ifPresent(
                value -> hadoopconf.set(property, value)
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
    protected String getSimpleClassName() {
        String className = this.getClass().getSimpleName();
        return className.replaceAll("Operator", "");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
            // Look for Spark-like directory structure.
            if (children.stream().anyMatch(child -> child.endsWith("_SUCCESS"))) {
                return children.stream().filter(child -> child.matches(".*/part-[m|r|M|R|-]{0,2}\\d+")).collect(Collectors.toList());
            } else {
                throw new WayangException("Could not identify directory structure: " + children);
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        BufferedReader commandLine = new BufferedReader(new InputStreamReader(System.in));
        while ((input = commandLine.readLine()) != null) {
            final String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "print":
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/data/DataGenerators.java`
#### Snippet
```java
public class DataGenerators {

    private static final String[] CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".split("");

    public static Generator<String> createReservoirBasedStringSupplier(List<String> stringReservoir,
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
        // for each line (input) output an iterator of the words
        FlatMapOperator<String, String> flatMapOperator = new FlatMapOperator<>(
                new FlatMapDescriptor<>(line -> Arrays.asList(line.split("\\W+")),
                        String.class,
                        String.class,
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `JdbcFilterOperator()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcFilterOperator.java`
#### Snippet
```java
    }

    public JdbcFilterOperator(FilterOperator<Record> that) {
        super(that);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcFilterOperator()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcFilterOperator.java`
#### Snippet
```java
public abstract class JdbcFilterOperator extends FilterOperator<Record> implements JdbcExecutionOperator {

    public JdbcFilterOperator(PredicateDescriptor<Record> predicateDescriptor) {
        super(predicateDescriptor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcTableSource()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcTableSource.java`
#### Snippet
```java
     * @see TableSource#TableSource(String, String...)
     */
    public JdbcTableSource(String tableName, String... columnNames) {
        super(tableName, columnNames);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcTableSource()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcTableSource.java`
#### Snippet
```java
     * @param that that should be copied
     */
    public JdbcTableSource(JdbcTableSource that) {
        super(that);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcProjectionOperator()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcProjectionOperator.java`
#### Snippet
```java
        implements JdbcExecutionOperator {

    public JdbcProjectionOperator(String... fieldNames) {
        super(
                new ProjectionDescriptor<>(Record.class, Record.class, fieldNames),
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcProjectionOperator()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcProjectionOperator.java`
#### Snippet
```java
     * @param that that should be copied
     */
    public JdbcProjectionOperator(MapOperator<Record, Record> that) {
        super(that);
        if (!(that.getFunctionDescriptor() instanceof ProjectionDescriptor)) {
```

### NonProtectedConstructorInAbstractClass
Constructor `JdbcProjectionOperator()` of an abstract class should not be declared 'public'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcProjectionOperator.java`
#### Snippet
```java
    }

    public JdbcProjectionOperator(ProjectionDescriptor<Record, Record> functionDescriptor) {
        super(functionDescriptor);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Measurement()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/Measurement.java`
#### Snippet
```java
    }

    public Measurement(String id) {
        this.id = id;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Storage()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     * @param uri Object or URI where experiments are persisted
     */
    public Storage(URI uri){
        this.storageFile = uri;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CollectionProvider()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/CollectionProvider.java`
#### Snippet
```java
    }

    public CollectionProvider(Configuration configuration, CollectionProvider parent) {
        this.configuration = configuration;
        this.parent = parent;
```

### NonProtectedConstructorInAbstractClass
Constructor `CollectionProvider()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/CollectionProvider.java`
#### Snippet
```java
    protected final Configuration configuration;

    public CollectionProvider(Configuration configuration) {
        this(configuration, null);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `UnarySink()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/UnarySink.java`
#### Snippet
```java
     * @see OperatorBase#OperatorBase(OperatorBase)
     */
    public UnarySink(UnarySink<T> that) {
        super(that);
        this.inputSlots[0] = new InputSlot<>("in", this, that.getType());
```

### NonProtectedConstructorInAbstractClass
Constructor `UnarySink()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/UnarySink.java`
#### Snippet
```java
     * Creates a new instance that does not support broadcast {@link InputSlot}s.
     */
    public UnarySink(DataSetType<T> type) {
        this(type, false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `UnarySink()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/UnarySink.java`
#### Snippet
```java
     * Creates a new instance.
     */
    public UnarySink(DataSetType<T> type, boolean isSupportingBroadcastInputs) {
        super(1, 0, isSupportingBroadcastInputs);
        this.inputSlots[0] = new InputSlot<>("in", this, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `BinaryToUnaryOperator()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/BinaryToUnaryOperator.java`
#### Snippet
```java
     * Creates a new instance.
     */
    public BinaryToUnaryOperator(DataSetType<InputType0> inputType0,
                                 DataSetType<InputType1> inputType1,
                                 DataSetType<OutputType> outputType,
```

### NonProtectedConstructorInAbstractClass
Constructor `UnarySource()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/UnarySource.java`
#### Snippet
```java
     * Creates a new instance.
     */
    public UnarySource(DataSetType<T> type, boolean isSupportingBroadcastInputs) {
        super(0, 1, isSupportingBroadcastInputs);
        this.outputSlots[0] = new OutputSlot<>("out", this, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `UnarySource()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/UnarySource.java`
#### Snippet
```java
     * Creates a new instance that does not support broadcast {@link InputSlot}s.
     */
    public UnarySource(DataSetType<T> type) {
        this(type, false);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OperatorBase()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
    private String name;

    public OperatorBase(InputSlot<?>[] inputSlots, OutputSlot<?>[] outputSlots, boolean isSupportingBroadcastInputs) {
        this.container = null;
        this.isSupportingBroadcastInputs = isSupportingBroadcastInputs;
```

### NonProtectedConstructorInAbstractClass
Constructor `OperatorBase()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
    }

    public OperatorBase(int numInputSlots, int numOutputSlots, boolean isSupportingBroadcastInputs) {
        this(new InputSlot[numInputSlots], new OutputSlot[numOutputSlots], isSupportingBroadcastInputs);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `FunctionDescriptor()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/FunctionDescriptor.java`
#### Snippet
```java
    private LoadProfileEstimator loadProfileEstimator;

    public FunctionDescriptor(LoadProfileEstimator loadProfileEstimator) {
        this.setLoadProfileEstimator(loadProfileEstimator);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PushExecutorTemplate()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PushExecutorTemplate.java`
#### Snippet
```java
    protected final Job job;

    public PushExecutorTemplate(Job job) {
        super(job == null ? null : job.getCrossPlatformExecutor());
        this.job = job;
```

### NonProtectedConstructorInAbstractClass
Constructor `AggregationDescriptor()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/AggregationDescriptor.java`
#### Snippet
```java
    }

    public AggregationDescriptor(Class<InputType> inputTypeClass, Class<OutputType> outputTypeClass) {
        this(inputTypeClass, outputTypeClass, new NestableLoadProfileEstimator(
                LoadEstimator.createFallback(1, 1),
```

### NonProtectedConstructorInAbstractClass
Constructor `AggregationDescriptor()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/AggregationDescriptor.java`
#### Snippet
```java
    // TODO: What about aggregation functions?

    public AggregationDescriptor(DataUnitGroupType<InputType> inputType, BasicDataUnitType<OutputType> outputType) {
        this(inputType, outputType, new NestableLoadProfileEstimator(
                LoadEstimator.createFallback(1, 1),
```

### NonProtectedConstructorInAbstractClass
Constructor `AggregationDescriptor()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/AggregationDescriptor.java`
#### Snippet
```java
    }

    public AggregationDescriptor(DataUnitGroupType<InputType> inputType, BasicDataUnitType<OutputType> outputType,
                                 LoadProfileEstimator loadProfileEstimator) {
        super(loadProfileEstimator);
```

### NonProtectedConstructorInAbstractClass
Constructor `AggregationDescriptor()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/AggregationDescriptor.java`
#### Snippet
```java
    }

    public AggregationDescriptor(Class<InputType> inputTypeClass,
                                 Class<OutputType> outputTypeClass,
                                 LoadProfileEstimator loadProfileEstimator) {
```

### NonProtectedConstructorInAbstractClass
Constructor `OptimizationContext()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
     * Create a new, plain instance.
     */
    public OptimizationContext(Job job) {
        this(
                job,
```

### NonProtectedConstructorInAbstractClass
Constructor `OptimizationContext()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
     * @param operator the single {@link Operator} of this instance
     */
    public OptimizationContext(Job job, Operator operator) {
        this(
                job,
```

### NonProtectedConstructorInAbstractClass
Constructor `ChannelConversion()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversion.java`
#### Snippet
```java
    private final ChannelDescriptor targetChannelDescriptor;

    public ChannelConversion(ChannelDescriptor sourceChannelDescriptor, ChannelDescriptor targetChannelDescriptor) {
        this.sourceChannelDescriptor = sourceChannelDescriptor;
        this.targetChannelDescriptor = targetChannelDescriptor;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAlternativeCardinalityPusher()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/AbstractAlternativeCardinalityPusher.java`
#### Snippet
```java
     * @see CardinalityPusher#CardinalityPusher(int[], int[])
     */
    public AbstractAlternativeCardinalityPusher(int[] relevantInputIndices, int[] relevantOutputIndices) {
        super(relevantInputIndices, relevantOutputIndices);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAlternativeCardinalityPusher()` of an abstract class should not be declared 'public'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/AbstractAlternativeCardinalityPusher.java`
#### Snippet
```java
     * @see CardinalityPusher#CardinalityPusher(Operator)
     */
    public AbstractAlternativeCardinalityPusher(Operator operator) {
        super(operator);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ReservoirSampler()` of an abstract class should not be declared 'public'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/ReservoirSampler.java`
#### Snippet
```java
    private final Random random = new Random();

    public ReservoirSampler(int sampleSize) {
        this.reservoir = new ArrayList<>(sampleSize);
        for (int i = 0; i < sampleSize; i++) {
```

### NonProtectedConstructorInAbstractClass
Constructor `SourceProfiler()` of an abstract class should not be declared 'public'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/SourceProfiler.java`
#### Snippet
```java
    private JavaChannelInstance outputChannelInstance;

    public SourceProfiler(Supplier<JavaExecutionOperator> operatorGenerator, Supplier<?>... dataQuantumGenerators) {
        super(operatorGenerator, dataQuantumGenerators);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `OperatorProfiler()` of an abstract class should not be declared 'public'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/OperatorProfiler.java`
#### Snippet
```java
    private List<Long> inputCardinalities;

    public OperatorProfiler(Supplier<JavaExecutionOperator> operatorGenerator,
                            Supplier<?>... dataQuantumGenerators) {
        this.operatorGenerator = operatorGenerator;
```

### NonProtectedConstructorInAbstractClass
Constructor `SparkSourceProfiler()` of an abstract class should not be declared 'public'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkSourceProfiler.java`
#### Snippet
```java
public abstract class SparkSourceProfiler extends SparkOperatorProfiler {

    public SparkSourceProfiler(Supplier<SparkExecutionOperator> operatorGenerator,
                               Configuration configuration,
                               Supplier<?> dataQuantumGenerator) {
```

### NonProtectedConstructorInAbstractClass
Constructor `SparkOperatorProfiler()` of an abstract class should not be declared 'public'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java
    protected List<Long> inputCardinalities;

    public SparkOperatorProfiler(Supplier<SparkExecutionOperator> operatorGenerator,
                                 Configuration configuration,
                                 Supplier<?>... dataQuantumGenerators) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `path`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/operators/GiraphPageRankOperator.java`
#### Snippet
```java
    public void setPathOut(String path, Configuration configuration){
        if(path == null && configuration != null) {
            path = configuration.getStringProperty("wayang.giraph.hdfs.tempdir");
        }
        this.path_out = path;
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rel/WayangTableScan.java`
#### Snippet
```java
        if(fields==null) {
            int size = table.getRowType().getFieldCount();
            fields = new int[size];
            for (int i = 0; i < size; i++) {
                fields[i] = i;
```

### AssignmentToMethodParameter
Assignment to method parameter `typeString`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
      if (close >= 0) {
        String rest = typeString.substring(open + 1, close);
        typeString = typeString.substring(0, open);
        int comma = rest.indexOf(",");
        if (comma >= 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
        if (millis < 0) return "-" + formatDuration(-millis);
        long ms = millis % 1000;
        millis /= 1000;
        long s = millis % 60;
        millis /= 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
        millis /= 1000;
        long s = millis % 60;
        millis /= 60;
        long m = millis % 60;
        millis /= 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
        millis /= 60;
        long m = millis % 60;
        millis /= 60;
        long h = millis % 60;
        return String.format("%d:%02d:%02d.%03d", h, m, s, ms);
```

### AssignmentToMethodParameter
Assignment to method parameter `operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
    public static List<Operator> collectParents(Operator operator, boolean includeSelf) {
        List<Operator> result = new LinkedList<>();
        if (!includeSelf) operator = operator.getParent();
        while (operator != null) {
            result.add(operator);
```

### AssignmentToMethodParameter
Assignment to method parameter `operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
        while (operator != null) {
            result.add(operator);
            operator = operator.getParent();
        }
        Collections.reverse(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
                result.add(container);
            }
            operator = operator.getParent();
        }
        Collections.reverse(result);
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
        if (millis < 0) return "-" + formatDuration(-millis);
        long ms = millis % 1000;
        millis /= 1000;
        long s = millis % 60;
        millis /= 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
        millis /= 1000;
        long s = millis % 60;
        millis /= 60;
        long m = millis % 60;
        millis /= 60;
```

### AssignmentToMethodParameter
Assignment to method parameter `millis`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
        millis /= 60;
        long m = millis % 60;
        millis /= 60;
        long h = millis % 60;
        return String.format("%d:%02d:%02d.%03d", h, m, s, ms);
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder(10);
        if (val < 0) sb.append("-");
        val = Math.abs(val);
        if (val >= 1000000000L) {
            sb.append(val / 1000000000L).append("G");
```

### AssignmentToMethodParameter
Assignment to method parameter `statement`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
     */
    public static <T> T evaluate(String statement) throws IllegalArgumentException {
        statement = statement.trim();
        Matcher matcher = defaultConstructorPattern.matcher(statement);
        if (matcher.matches()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/lineage/LazyExecutionLineageNode.java`
#### Snippet
```java
            for (Iterator<LazyExecutionLineageNode> i = this.predecessors.iterator(); i.hasNext(); ) {
                LazyExecutionLineageNode predecessor = i.next();
                accumulator = predecessor.traverse(accumulator, aggregator, isMark);
                if (predecessor.isExecuted) {
                    i.remove();
```

### AssignmentToMethodParameter
Assignment to method parameter `accumulator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/lineage/LazyExecutionLineageNode.java`
#### Snippet
```java
                }
            }
            accumulator = this.accept(accumulator, aggregator);
            if (isMark) this.markAsExecuted();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `platformExecution`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/StageAssignmentTraversal.java`
#### Snippet
```java
        if (platformExecution == null) {
            Platform platform = task.getOperator().getPlatform();
            platformExecution = new PlatformExecution(platform);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `score1`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
    public static double getSelectionProbability(double score1, double score2, double minScore) {
        if (score1 == score2) return 0.5d;
        score1 -= minScore;
        score2 -= minScore;
        return score1 / (score1 + score2);
```

### AssignmentToMethodParameter
Assignment to method parameter `score2`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
        if (score1 == score2) return 0.5d;
        score1 -= minScore;
        score2 -= minScore;
        return score1 / (score1 + score2);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `maturity`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java

    private void updateMaturity(int index, double maturity) {
        maturity = 1d;
        this.maturity[index] = maturity;
        if (Double.isNaN(this.minMaturity) || this.minMaturity > maturity) {
```

### AssignmentToMethodParameter
Assignment to method parameter `mutationProb`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java

        // Make at least one mutation more likely.
        if (mutationProb > 0d) mutationProb = Math.max(mutationProb, 1 / activatedGenes.cardinality());

        final double smoothing = 1d;
```

### AssignmentToMethodParameter
Assignment to method parameter `someOutput`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            final OperatorAlternative operatorAlternative = (OperatorAlternative) owner;
            final OperatorAlternative.Alternative alternative = this.settledAlternatives.get(operatorAlternative);
            someOutput = alternative == null ? null : alternative.traceOutput(someOutput);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `sizeInMB`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        if (expectedBytes != readBytes) {
            System.out.printf("Warning: Expected %d bytes, but found %d.\n", expectedBytes, readBytes);
            sizeInMB = (int) readBytes / 1024 / 1024;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `currentGeneration`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        double checkpointedFitness = Double.NEGATIVE_INFINITY;
        int i;
        for (i = 0; i < maxGenerations; i++, currentGeneration++) {
            // Print status.
            if (i % maxStableGenerations == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `individuals`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
            }

            individuals = optimizer.evolve(individuals);

            if (updateFrequency > 0 && i > 0 && i % updateFrequency == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        int destLow = low;
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `high`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, bDst, bSrc, low, mid, -off, c);
```

### AssignmentToMethodParameter
Assignment to method parameter `low`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
        int destLow = low;
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `high`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, bDst, bSrc, low, mid, -off, c);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `executor`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java

                // synchronize(this.crossplateform) can be used here to avoid error when we have two stages running same operators even on the same platform but still with different executors
                synchronized (executor) {
                    executor.execute(stage, optimizationContext, this.crossPlatformExecutor);
                    long finishTime = System.currentTimeMillis();
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/data/Record.java`
#### Snippet
```java
    public String getString(int index) {
        Object field = this.values[index];
        return field == null ? null : field.toString();
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/execution/JdbcExecutor.java`
#### Snippet
```java
        return consumer.getStage() == stage && consumer.getOperator() instanceof JdbcExecutionOperator ?
                consumer :
                null;
    }

```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java


        return null;
    }
}
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java
                fields[i] = ((RexInputRef) exp).getIndex();
            } else {
                return null; // not a simple projection
            }
        }
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case BOOLEAN:
                if (string.length() == 0) {
                    return null;
                }
                return Boolean.parseBoolean(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case TINYINT:
                if (string.length() == 0) {
                    return null;
                }
                return Byte.parseByte(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case SMALLINT:
                if (string.length() == 0) {
                    return null;
                }
                return Short.parseShort(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case INTEGER:
                if (string.length() == 0) {
                    return null;
                }
                return Integer.parseInt(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case BIGINT:
                if (string.length() == 0) {
                    return null;
                }
                return Long.parseLong(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case FLOAT:
                if (string.length() == 0) {
                    return null;
                }
                return Float.parseFloat(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case DOUBLE:
                if (string.length() == 0) {
                    return null;
                }
                return Double.parseDouble(string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case DECIMAL:
                if (string.length() == 0) {
                    return null;
                }
                return parseDecimal(fieldType.getPrecision(), fieldType.getScale(), string);
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case DATE:
                if (string.length() == 0) {
                    return null;
                }
                try {
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                    return (int) (date.getTime() / DateTimeUtils.MILLIS_PER_DAY);
                } catch (ParseException e) {
                    return null;
                }
            case TIME:
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case TIME:
                if (string.length() == 0) {
                    return null;
                }
                try {
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                    return (int) date.getTime();
                } catch (ParseException e) {
                    return null;
                }
            case TIMESTAMP:
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            case TIMESTAMP:
                if (string.length() == 0) {
                    return null;
                }
                try {
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
                    return date.getTime();
                } catch (ParseException e) {
                    return null;
                }
            case VARCHAR:
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ExecutionOperator.java`
#### Snippet
```java
                    .concat(".limit");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ExecutionOperator.java`
#### Snippet
```java
     */
    default String getLoadProfileEstimatorConfigurationKey() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/LoopIsolator.java`
#### Snippet
```java
     */
    public static LoopSubplan isolate(Operator allegedLoopHead) {
        if (!allegedLoopHead.isLoopHead()) return null;
        LoopHeadOperator loopHead = (LoopHeadOperator) allegedLoopHead;

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operator.java`
#### Snippet
```java
    default CompositeOperator getParent() {
        final OperatorContainer container = this.getContainer();
        return container == null ? null : container.toOperator();
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operator.java`
#### Snippet
```java
        final CompositeOperator parent = this.getParent();
        if (parent == null) {
            return null;
        } else if (parent.isLoopSubplan()) {
            return (LoopSubplan) parent;
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operator.java`
#### Snippet
```java
        // Try to exit through the parent.
        final OperatorContainer container = this.getContainer();
        return container != null ? container.traceInput(input) : null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
            return Optional.ofNullable(this.process(occupant.getOwner(), occupant, payload));
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionTask.java`
#### Snippet
```java
                return inputIndex < this.getOperator().getNumInputs() ?
                        this.getOperator().getInput(inputIndex) :
                        null;
            }
        }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionTask.java`
#### Snippet
```java
                return outputIndex < this.getOperator().getNumOutputs() ?
                        this.getOperator().getOutput(outputIndex) :
                        null;
            }
        }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializer.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    default T deserialize(WayangJsonObj json) {
        if (JsonSerializables.isJsonNull(json)) return null;
        try {
            final Class<?> classTag = JsonSerializables.getClassTag(json);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
                .map(sibling -> {
                    final OutputSlot<?> output = sibling.getProducerSlot();
                    if (output == null) return null;
                    final OptimizationContext.OperatorContext operatorCtx =
                            optimizationContext.getOperatorContext(output.getOwner());
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
                    final OptimizationContext.OperatorContext operatorCtx =
                            optimizationContext.getOperatorContext(output.getOwner());
                    if (operatorCtx == null) return null;
                    return operatorCtx.getOutputCardinality(output.getIndex());
                }).filter(Objects::nonNull)
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
            return this.producer.getOperator();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializable.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        public T deserialize(WayangJsonObj json, Class<? extends T> cls) {
            if (json == null || json.equals(WayangJsonObj.NULL)) return null;
            try {
                final Method fromJsonMethod = cls.getMethod("fromJson", WayangJsonObj.class);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializable.java`
#### Snippet
```java
        @Override
        public WayangJsonObj serialize(T serializable) {
            if (serializable == null) return null;
            return serializable.toJson();
        }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
            if (readPos == writePos) {
                if (this.isWriteFinished) {
                    return null;
                } else {
                    // If cannot read, wait to try again.
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
        @Override
        public Operator deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if (JsonNull.INSTANCE.equals(json)) return null;
            throw new UnsupportedOperationException("Deserializing operators is not yet supported.");
        }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
    @Override
    public <Payload, Return> Return accept(TopDownPlanVisitor<Payload, Return> visitor, OutputSlot<?> outputSlot, Payload payload) {
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
                                        requestee.getConfiguration().getOptionalStringProperty("wayang.core.optimizer.instrumentation");
                                if (!optInstrumentationtStrategyClass.isPresent()) {
                                    return null;
                                }
                                return instantiateDefault(optInstrumentationtStrategyClass.get());
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java

        logger.info("Using blank configuration.");
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static <T> T deserialize(WayangJsonObj wayangJsonObj, JsonSerializer<T> serializer) {
        if (isJsonNull(wayangJsonObj)) return null;
        return serializer.deserialize(wayangJsonObj);
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static WayangJsonArray serializeAll(Collection<?> collection, boolean isPolymorph) {
        if (isJsonNull(collection)) return null;
        WayangJsonArray wayangJsonArray = new WayangJsonArray();
        for (Object obj : collection) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static Object serialize(Object obj, boolean isPolymorph) {
        if (obj == null) return null;
        if (isJsonCompatible(obj)) {
            return obj;
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static Class<?> getClassTag(WayangJsonObj wayangJsonObj) throws ClassNotFoundException {
        if (isJsonNull(wayangJsonObj) || !wayangJsonObj.has("_class")) return null;
        final String className = wayangJsonObj.getString("_class");
        return Class.forName(className);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static <T> T deserialize(WayangJsonObj wayangJsonObj, JsonSerializer<T> serializer, Class<? extends T> cls) {
        if (wayangJsonObj == null || wayangJsonObj.equals(WayangJsonObj.NULL)) return null;
        return serializer.deserialize(wayangJsonObj, cls);
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static <T> WayangJsonArray serializeAll(Collection<T> collection, boolean isPolymorph, JsonSerializer<T> serializer) {
        if (collection == null) return null;
        WayangJsonArray wayangJsonArray = new WayangJsonArray();
        for (T serializable : collection) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(WayangJsonObj wayangJsonObj, Class<? extends T> cls) {
        if (isJsonNull(wayangJsonObj)) return null;
        return deserialize(wayangJsonObj, (JsonSerializer<T>) JsonSerializable.uncheckedSerializer(), cls);
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> List<T> deserializeAllAsList(WayangJsonArray wayangJsonArray) {
        if (isJsonNull(wayangJsonArray)) return null;
        List<T> result = new ArrayList<>(wayangJsonArray.length());
        for (Object jsonElement : wayangJsonArray) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(WayangJsonObj wayangJsonObj) {
        if (isJsonNull(wayangJsonObj)) return null;
        return deserialize(wayangJsonObj, JsonSerializable.uncheckedSerializer());
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    public static Object deserialize(Object json) {
        if (isJsonNull(json)) return null;
        else if (isUnconvertedInstance(json)) return json;
        else if (json instanceof WayangJsonObj) return deserialize((WayangJsonObj) json);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
        } catch (IOException e) {
            logger.warn("Could not determine local temp directory.", e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
            return new WayangJsonObj((ObjectNode) v);
          }else if(v instanceof NullNode) {
            return null;
          } else if(v instanceof TextNode){
            return ((TextNode)v).asText();
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
      return this.getJSONObject(key);
    }catch (WayangException ex){
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
    JsonNode value = this.getNode().get(key);
    if(value == null){
      return null;
    }
    if(!value.isObject()) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
      return this.getJSONArray(key);
    }catch (WayangException ex){
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
    JsonNode value = this.getNode().get(key);
    if(value == null){
      return null;
    }
    if(!value.isArray()) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
    public static <T> T getSingleOrNull(Collection<T> collection) {
        Validate.isTrue(collection.size() <= 1, "Expected 0 or 1 elements, found %d.", collection.size());
        return collection.isEmpty() ? null : getAny(collection);
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/OperatorPattern.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public OperatorMatch match(Operator operator) {
        if (operator == null) return null;

        // Only match by the class so far.
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/OperatorPattern.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            return parameterizedType.getActualTypeArguments()[index];
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            logger.error(String.format("Could not determine JAR file declaring %s.", cls), e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/Junction.java`
#### Snippet
```java

        // Fill with nulls.
        this.targetChannels = WayangCollections.map(this.targetInputs, input -> null);

        // Get hold of an OptimizationContext.
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/Junction.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CardinalityBreakpoint.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ExecutorTemplate.java`
#### Snippet
```java
            long executionDuration) {

        if (executionLineageNodes.isEmpty()) return null;

        final PartialExecution partialExecution = PartialExecution.createFromMeasurement(
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
                return this.currentIteration.getChannelInstance(channel);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
    private static ExecutionStageLoop getExecutionStageLoop(Channel channel) {
        final ExecutionStage producerStage = channel.getProducer().getStage();
        if (producerStage.getLoop() == null) return null;
        final OutputSlot<?> output = channel.getProducer().getOutputSlotFor(channel);
        if (output != null
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
                && output.getOwner().isLoopHead()
                && ((LoopHeadOperator) output.getOwner()).getFinalLoopOutputs().contains(output)) {
            return null;
        }
        return producerStage.getLoop();
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/AggregateOptimizationContext.java`
#### Snippet
```java
    public LoopContext getNestedLoopContext(LoopSubplan loopSubplan) {
        assert this.optimizationContexts.stream().allMatch(opCtx -> opCtx.getNestedLoopContext(loopSubplan) == null);
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimator.java`
#### Snippet
```java
    default String getTemplateKey() {
        final String configKey = this.getConfigurationKey();
        return configKey == null ? null : configKey + ".template";
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/ConstantLoadProfileEstimator.java`
#### Snippet
```java
    @Override
    public String getConfigurationKey() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
     */
    public OptimizationContext getParent() {
        return this.hostLoopContext == null ? null : this.hostLoopContext.getOptimizationContext();
    }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
        public LoadProfileEstimator getLoadProfileEstimator() {
            if (!(this.operator instanceof ExecutionOperator)) {
                return null;
            }
            return this.getOptimizationContext().getConfiguration()
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
        } else {
            logger.warn("Could not find an estimator specification associated with '{}'.", configuration);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/LoopImplementation.java`
#### Snippet
```java
                return allImpls.get(successorIndex);
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
            maxSettledIndices += ithTree.settledDestinationIndices.cardinality();
            if (maxSettledIndices > combinationSettledIndices.cardinality()) {
                return null;
            }
            employedChannelDescriptors.addAll(ithTree.employedChannelDescriptors);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
            maxVisitedChannelDescriptors += ithTree.employedChannelDescriptors.size() - 1; // NB: -1 for the root
            if (maxVisitedChannelDescriptors > employedChannelDescriptors.size()) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
        private Set<ChannelDescriptor> getSuccessorChannelDescriptors(ChannelDescriptor descriptor) {
            final Channel channel = this.existingChannels.get(descriptor);
            if (channel == null || this.openChannelDescriptors.contains(descriptor)) return null;

            Set<ChannelDescriptor> result = new HashSet<>();
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlow.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlow.java`
#### Snippet
```java
            return new ExecutionTaskFlow(executionTaskFlowCompiler.getTerminalTasks());
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
            } else if (length == END_OF_DATA_SECTION) {
                this.eos = true;
                return null;
            }
        } catch (EOFException e){
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
        } catch (EOFException e){
            this.eos = true;
            return null;
        } catch (IOException e) {
            //e.printStackTrace();
```

### ReturnNull
Return of `null`
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
            throw new RuntimeException(e);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimators.java`
#### Snippet
```java
     */
    public static DynamicLoadEstimator wrap(LoadEstimator loadEstimator) {
        if (loadEstimator == null) return null;
        return new DynamicLoadEstimator(null, null, Collections.emptySet()) {
            @Override
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
    private LoopImplementation.IterationImplementation findIterationImplementation(OutputSlot<?> output) {
        PlanImplementation planImplementation = this.planImplementation;
        if (this.planImplementation.getJunction(output) != null) return null;
        LoopImplementation.IterationImplementation iterationImplementation = null;

```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
                if (operatorEnumeration == null || operatorEnumeration.getPlanImplementations().isEmpty()) {
                    this.logger.warn("No implementations enumerated for {}.", operator);
                    return null;
                }
            } else if (operator.isLoopSubplan()) {
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
            if (!isEnumeratable) {
                this.logger.trace("Cannot enumerate branch with {}.", currentOperator);
                return null;
            }
            branch.add(currentOperator);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            // NB: Join semantics at this point weaved in.
            if (concatenation.isSettledAlternativesContradicting(targetPlan)) {
                return null;
            }
            concatenation.operators.addAll(targetPlan.operators);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            final OperatorAlternative operatorAlternative = (OperatorAlternative) owner;
            final OperatorAlternative.Alternative alternative = this.settledAlternatives.get(operatorAlternative);
            if (alternative == null) return null;
            @SuppressWarnings("unchecked")
            final Collection<InputSlot<?>> innerInputs = (Collection<InputSlot<?>>) (Collection) alternative.followInput(someInput);
```

### ReturnNull
Return of `null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            final LoopSubplan loopSubplan = (LoopSubplan) owner;
            final LoopImplementation loopImplementation = this.getLoopImplementations().get(loopSubplan);
            if (loopImplementation == null) return null;

            // Enter the LoopSubplan.
```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/DummyMap.java`
#### Snippet
```java
    @Override
    public OutputType map(InputType inputType) throws Exception {
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkExecutionOperator.java`
#### Snippet
```java

    default <Type> Collection<Type> getBroadCastFunction(String name){
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapOperator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapPartitionsOperator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
        if (sampleSize >= datasetSize) { //return all and return
            ((CollectionChannel.Instance) outputs[0]).accept(inputRdd.collect());
            return null;
        }
        long seed = this.getSeed(operatorContext);
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCoGroupOperator.java`
#### Snippet
```java
                groups0.compute(keyExtractor0.apply(dataQuantum0),
                        (key, value) -> {
                            value = value == null ? new LinkedList<>() : value;
                            value.add(dataQuantum0);
                            return value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCoGroupOperator.java`
#### Snippet
```java
                groups1.compute(keyExtractor1.apply(dataQuantum1),
                        (key, value) -> {
                            value = value == null ? new LinkedList<>() : value;
                            value.add(dataQuantum1);
                            return value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `chunk`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
                    System.out.println(chunk.length);
                    System.out.println(size);
                    chunk = Arrays.copyOfRange(chunk, 0, size);
                }
                try {
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaJoinOperator.java`
#### Snippet
```java
                    probeTable.compute(keyExtractor0.apply(dataQuantum0),
                            (key, value) -> {
                                value = value == null ? new LinkedList<>() : value;
                                value.add(dataQuantum0);
                                return value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `value`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaJoinOperator.java`
#### Snippet
```java
                    probeTable.compute(keyExtractor1.apply(dataQuantum1),
                            (key, value) -> {
                                value = value == null ? new LinkedList<>() : value;
                                value.add(dataQuantum1);
                                return value;
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `values`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
        map.compute(key, (k, values) -> {
            if (values == null) {
                values = new LinkedList<>();
            }
            values.add(value);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `calciteSchema` is redundant
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/schema/SchemaUtils.java`
#### Snippet
```java
            CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
            final SchemaPlus schemaPlus = calciteConnection.getRootSchema();
            CalciteSchema calciteSchema = CalciteSchema.from(schemaPlus);
            return calciteSchema;
    }
```

### UnnecessaryLocalVariable
Local variable `run` is redundant
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/optimizer/WayangProgram.java`
#### Snippet
```java

        Program hep = Programs.of(builder.build(), false, null);
        RelNode run = hep.run(relOptPlanner, relNode, relTraitSet, list, list1);

        return run;
```

### UnnecessaryLocalVariable
Local variable `executionPlan` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java

        // Get initial execution plan.
        ExecutionPlan executionPlan = this.createInitialExecutionPlan();
        return executionPlan;
    }
```

### UnnecessaryLocalVariable
Local variable `partialExecution` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ExecutorTemplate.java`
#### Snippet
```java
        if (executionLineageNodes.isEmpty()) return null;

        final PartialExecution partialExecution = PartialExecution.createFromMeasurement(
                executionDuration, executionLineageNodes, this.getConfiguration()
        );
```

### UnnecessaryLocalVariable
Local variable `it` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
                stream.readFully(obj);
                String s = new String(obj, StandardCharsets.UTF_8);
                Output it = (Output) s;
                return it;
            } else if (length == END_OF_DATA_SECTION) {
```

### UnnecessaryLocalVariable
Local variable `output` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/function/PythonFunctionWrapper.java`
#### Snippet
```java
                                                                  input
    );
    Iterable<Output> output = manager.execute();
    return output;
  }
```

### UnnecessaryLocalVariable
Local variable `it` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
        System.out.println("iterator being send");
        int buffer = 0;
        for (Iterator<Input> it = iter; it.hasNext(); ) {
            Input elem = it.next();
            //System.out.println(elem.toString());
```

### UnnecessaryLocalVariable
Local variable `g1` is redundant
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
    @Override
    public double[] apply(double[] o, double[] o2) {
        double[] g1 = o;
        double[] g2 = o2;

```

### UnnecessaryLocalVariable
Local variable `g2` is redundant
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
    public double[] apply(double[] o, double[] o2) {
        double[] g1 = o;
        double[] g2 = o2;

        if (g2 == null) //samples came from one partition only
```

### UnnecessaryLocalVariable
Local variable `it` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        int partCount = rdd0.mapPartitions(
                input -> {
                    Iterator<Input> it = input;
                    ArrayList<Integer> out = new ArrayList<Integer>(1);
                    int i = 0;
```

### UnnecessaryLocalVariable
Local variable `jjj` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        if (c.compare(src.get(mid - 1)._1(), src.get(mid)._1()) <= 0) {
            //System.arraycopy(src, low, dest, destLow, length);
            int jjj = destLow;
            for (int iii = low; iii < length; iii++) {
                dest.set(jjj, src.get(iii));
```

### UnnecessaryLocalVariable
Local variable `jjj` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
                // j++;
                //System.arraycopy(lst2, j, result, k, (lst2.size() - j));
                int jjj = k;
                for (int iii = j; iii < (lst2.size() - j); iii++) {
                    result.add(lst2.get(iii));
```

### UnnecessaryLocalVariable
Local variable `wilResult` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
                    list2ASC, list2ASCSec, equalReverse));

            ArrayList<Tuple2<Input, Input>> wilResult = getViolationsSelf(lst1a,
                    permutationArray);
            return wilResult;
```

### UnnecessaryLocalVariable
Local variable `wilResult` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
                    list2ASC, list2ASCSec, equalReverse));

            ArrayList<Tuple2<Input, Input>> wilResult = getViolationsNonSelf(
                    list1, permutationArray);

```

### UnnecessaryLocalVariable
Local variable `it` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        // count larger partition size in rdd1 & rdd2
        int partCount = rdd0.mapPartitions(input -> {
                    Iterator<Input> it = input;
                    ArrayList<Integer> out = new ArrayList<Integer>(1);
                    int i = 0;
```

### UnnecessaryLocalVariable
Local variable `it` is redundant
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java

        int partCount2 = rdd1.mapPartitions(input -> {
                    Iterator<Input> it = input;
                    ArrayList<Integer> out = new ArrayList<Integer>(1);
                    int i = 0;
```

### UnnecessaryLocalVariable
Local variable `tuple2` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java
                    public String map(Type dataQuantum) throws Exception {
                        this.dataQuantum = dataQuantum;
                        Tuple2 tuple2 = (Tuple2) dataQuantum;
                        return String.valueOf(tuple2.field0) + '\t' + String.valueOf(tuple2.field1);                    }
                }).setParallelism(flinkExecutor.getNumDefaultPartitions());
```

### UnnecessaryLocalVariable
Local variable `pagesInput` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java

        // get input data
        DataSet<Long> pagesInput = pages;
        DataSet<Tuple2<Long, Long>> linksInput = dataSetInputReal;

```

### UnnecessaryLocalVariable
Local variable `linksInput` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java
        // get input data
        DataSet<Long> pagesInput = pages;
        DataSet<Tuple2<Long, Long>> linksInput = dataSetInputReal;

        // assign initial rank to pages
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/types/RecordType.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fieldNames);
    }

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
                if (SLEEP_MILLIS > 0) {
                    try {
                        Thread.sleep(SLEEP_MILLIS);
                    } catch (InterruptedException ignored) {
                    }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
                    if (SLEEP_MILLIS > 0) {
                        try {
                            Thread.sleep(SLEEP_MILLIS);
                        } catch (InterruptedException ignored) {
                        }
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`equalReverse == true` can be simplified to 'equalReverse'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java

        int max = 0;
        int offset = (equalReverse == true ? 0 : 1);

        for (int k = 0; k < permutationArray.length; k++) {
```

### PointlessBooleanExpression
`equalReverse == true` can be simplified to 'equalReverse'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java

        int max = 0;
        int offset = (equalReverse == true ? 0 : 1);

        for (int k = 0; k < permutationArray.length; k++) {
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java
        this(objs.length);
        for (T obj : objs) {
            this.add(obj);
        }
    }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
        Set<T> set = new HashSet<>(values.length);
        for (T value : values) {
            set.add(value);
        }
        return set;
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopSubplanCardinalityPusher.java`
#### Snippet
```java
        for (OutputSlot<?> outputSlot : loopHead.getLoopBodyOutputs()) {
            for (InputSlot<?> inputSlot : outputSlot.getOccupiedSlots()) {
                bodyInputSlots.add(inputSlot);
            }
        }
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            int jj = 0;
            for (int ii = 0; ii < lst1.size(); ii++) {
                result.add(lst1.get(ii));
            }
            int jjj = lst1.size();
```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            int jjj = lst1.size();
            for (int iii = 0; iii < lst2.size(); iii++) {
                result.add(lst2.get(iii));
            }
            //System.arraycopy(lst2, 0, result, lst1.size(), lst2.size());
```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
    public static void touch(File file) {
        ensureDir(file.getParentFile());
        try (FileOutputStream fos = new FileOutputStream(file)) {
        } catch (IOException e) {
            throw new WayangException(String.format("Could not create %s.", file), e);
```

### EmptyTryBlock
Empty `try` block
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
                this.logger.info("{} was not executed eagerly as requested.", task);
            }else {
                try {
                    //TODO validate the execute in different contexts
                    //this.fee.execute();
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
                                Class<Output> outputTypeClass,
                                String... fieldNames) {
        this(BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass),
                fieldNames);
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
                                String... fieldNames) {
        this(BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass),
                fieldNames);
    }
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LocalCallbackSink.java`
#### Snippet
```java
     */
    public LocalCallbackSink(ConsumerDescriptor.SerializableConsumer<T> consumerDescriptor, Class<T> typeClass) {
        super(DataSetType.createDefault(BasicDataUnitType.createBasic(typeClass)), true);
        this.callbackDescriptor = consumerDescriptor;
        this.callback = consumerDescriptor;
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/ConsumerDescriptor.java`
#### Snippet
```java
                              ProbabilisticDoubleInterval selectivity,
                              LoadProfileEstimator loadProfileEstimator) {
        this(javaImplementation, BasicDataUnitType.createBasic(inputTypeClass), selectivity, loadProfileEstimator);
    }

```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/PredicateDescriptor.java`
#### Snippet
```java
                               ProbabilisticDoubleInterval selectivity,
                               LoadProfileEstimator loadProfileEstimator) {
        this(javaImplementation, BasicDataUnitType.createBasic(inputTypeClass), selectivity, loadProfileEstimator);
    }

```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/TransformationDescriptor.java`
#### Snippet
```java
                                    LoadProfileEstimator loadProfileEstimator) {
        this(javaImplementation,
                BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass),
                loadProfileEstimator);
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/TransformationDescriptor.java`
#### Snippet
```java
        this(javaImplementation,
                BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass),
                loadProfileEstimator);
    }
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/TransformationDescriptor.java`
#### Snippet
```java
                                    Class<Output> outputTypeClass) {
        this(javaImplementation,
                BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass));
    }
```

### StaticCallOnSubclass
Static method `createBasic()` declared in class 'org.apache.wayang.core.types.DataUnitType' but referenced via subclass 'org.apache.wayang.core.types.BasicDataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/TransformationDescriptor.java`
#### Snippet
```java
        this(javaImplementation,
                BasicDataUnitType.createBasic(inputTypeClass),
                BasicDataUnitType.createBasic(outputTypeClass));
    }

```

### StaticCallOnSubclass
Static method `getInstance()` declared in class 'java.util.Calendar' but referenced via subclass 'java.util.GregorianCalendar'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java

        public static int parseDate(String dateString) {
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.set(
                    Integer.parseInt(dateString.substring(0, 4)),
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    // divide the left into 4 32 bit chunks
    long[] left = new long[4];
    left[0] = lo8 & 0xffffffffl;
    left[1] = lo8 >>> 32;
    left[2] = hi8 & 0xffffffffl;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xffffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    left[0] = lo8 & 0xffffffffl;
    left[1] = lo8 >>> 32;
    left[2] = hi8 & 0xffffffffl;
    left[3] = hi8 >>> 32;
    // divide the right into 5 31 bit chunks
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x7fffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    // divide the right into 5 31 bit chunks
    long[] right = new long[5];
    right[0] = b.lo8 & 0x7fffffffl;
    right[1] = (b.lo8 >>> 31) & 0x7fffffffl;
    right[2] = (b.lo8 >>> 62) + ((b.hi8 & 0x1fffffffl) << 2);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x7fffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    long[] right = new long[5];
    right[0] = b.lo8 & 0x7fffffffl;
    right[1] = (b.lo8 >>> 31) & 0x7fffffffl;
    right[2] = (b.lo8 >>> 62) + ((b.hi8 & 0x1fffffffl) << 2);
    right[3] = (b.hi8 >>> 29) & 0x7fffffffl;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x1fffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    right[0] = b.lo8 & 0x7fffffffl;
    right[1] = (b.lo8 >>> 31) & 0x7fffffffl;
    right[2] = (b.lo8 >>> 62) + ((b.hi8 & 0x1fffffffl) << 2);
    right[3] = (b.hi8 >>> 29) & 0x7fffffffl;
    right[4] = (b.hi8 >>> 60);
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x7fffffffl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    right[1] = (b.lo8 >>> 31) & 0x7fffffffl;
    right[2] = (b.lo8 >>> 62) + ((b.hi8 & 0x1fffffffl) << 2);
    right[3] = (b.hi8 >>> 29) & 0x7fffffffl;
    right[4] = (b.hi8 >>> 60);
    // clear the cur value
```

### LongLiteralsEndingWithLowercaseL
'long' literal `0xfl` ends with lowercase 'l'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    hi8 = 0;
    lo8 = 0;
    final long lastDigit = 0xfl << 60;
    for (int i = 0; i < s.length(); ++i) {
      int digit = getHexDigit(s.charAt(i));
```

## RuleId[id=CastToIncompatibleInterface]
### CastToIncompatibleInterface
Cast to incompatible interface `SerializableConsumer`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/ConsumerDescriptor.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public SerializableConsumer<Object> unchecked() {
        return (SerializableConsumer<Object>) this;
    }

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            case "operator":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> operatorContext.getOperator().getClass().getSimpleName())
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            case "platform":
                System.out.println("Not supported.");
//                predicate = pe -> pe.getOperatorContexts().stream()
//                        .map(operatorContext -> ((ExecutionOperator) operatorContext.getOperator()).getPlatform())
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
        switch (name){
            case "batch_forced":
                mode = ExecutionMode.BATCH_FORCED;
                break;
            case "batch":
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
                    break;
                case RESERVOIR:
                    dataSetOutput = DataSetUtils.sampleWithSize(dataSetInput, true, sampleSize, seed);
                    break;
                default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDoWhileOperator.java`
#### Snippet
```java
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            case CONVERGENCE_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            default:
                throw new IllegalStateException(String.format("%s has no %d-th input.", this, index));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
            case INITIAL_CONVERGENCE_INPUT_INDEX:
            case ITERATION_CONVERGENCE_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            default:
                throw new IllegalStateException(String.format("%s has no %d-th input.", this, index));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
            case INITIAL_CONVERGENCE_INPUT_INDEX:
            case ITERATION_CONVERGENCE_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            default:
                throw new IllegalStateException(String.format("%s has no %d-th input.", this, index));
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimator.java`
#### Snippet
```java
     */
    public String toJsonConfig(Individual individual) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.configKey).append(" = {\\\n");
        sb.append(" \"type\":\"mathex\",\\\n");
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
            default:
                System.out.println("Unknown filter type.");
                return;
        }
//        this.filters.add(predicate);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `result &= predicate.test(iterator.next())`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Iterators.java`
#### Snippet
```java
        boolean result = true;
        while (iterator.hasNext()) {
            result &= predicate.test(iterator.next());
            if (!result && isAbortEarly) {
                return false;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.hasEmptyIterator |= !iterator.hasNext()`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
                final java.util.Iterator<T> iterator = iterable.iterator();
                this.partialIterators.add(iterator);
                this.hasEmptyIterator |= !iterator.hasNext();
                this.vals.add(null);
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isAnySpecified |= specifiedArg != argument`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/CompiledFunction.java`
#### Snippet
```java
            for (Expression argument : this.arguments) {
                final Expression specifiedArg = argument.specify(context);
                isAnySpecified |= specifiedArg != argument;
                specifiedArgs.add(specifiedArg);
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isAllChecksPassed &= this.checkFlatAlternatives()`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
    public boolean checkAllCriteria() {
        boolean isAllChecksPassed = this.checkProperSubplans();
        isAllChecksPassed &= this.checkFlatAlternatives();

        return isAllChecksPassed;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isComplete &= this.getBase().isTimeEstimatesComplete()`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/DefaultOptimizationContext.java`
#### Snippet
```java

        if (this.getBase() != null) {
            isComplete &= this.getBase().isTimeEstimatesComplete();
        }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isComplete &= iterationContext.isTimeEstimatesComplete()`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/DefaultOptimizationContext.java`
#### Snippet
```java
        for (LoopContext loopContext : this.loopContexts.values()) {
            for (OptimizationContext iterationContext : loopContext.getIterationContexts()) {
                isComplete &= iterationContext.isTimeEstimatesComplete();
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `aggregate[i] |= delta[i]`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
            assert aggregate.length == delta.length;
            for (int i = 0; i < aggregate.length; i++) {
                aggregate[i] |= delta[i];
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.inputCardinalityMarkers[inputIndex] |= !Objects.equals(this.inputCardinalities[inputIndex], car...`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
         */
        public void setInputCardinality(int inputIndex, CardinalityEstimate cardinality) {
            this.inputCardinalityMarkers[inputIndex] |= !Objects.equals(this.inputCardinalities[inputIndex], cardinality);
            if (OptimizationContext.this.logger.isDebugEnabled() && this.inputCardinalityMarkers[inputIndex]) {
                OptimizationContext.this.logger.debug(
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `this.outputCardinalityMarkers[outputIndex] |= !Objects.equals(this.outputCardinalities[outputIndex],...`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
         */
        public void setOutputCardinality(int outputIndex, CardinalityEstimate cardinality) {
            this.outputCardinalityMarkers[outputIndex] |= !Objects.equals(this.outputCardinalities[outputIndex], cardinality);
            if (OptimizationContext.this.logger.isDebugEnabled() && this.outputCardinalityMarkers[outputIndex]) {
                OptimizationContext.this.logger.debug(
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isUpdated |= activator.process(optimizationContext, configuration, activators)`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
                assert !activators.isEmpty() : String.format("No source activators. (input activations: %s)", this.inputActivations);
                final Activator activator = activators.poll();
                isUpdated |= activator.process(optimizationContext, configuration, activators);
            } while (!activators.isEmpty());
        } finally {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isStateChanged |= this.isActivated[inputIndex]`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
            boolean isStateChanged = false;
            for (int inputIndex = 0; inputIndex < this.isActivated.length; inputIndex++) {
                isStateChanged |= this.isActivated[inputIndex];
                this.isActivated[inputIndex] = false;
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isWithNull |= resolvedInputs == null`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                    throw new IllegalStateException(String.format("Disallowed that %s is required by two different alternatives.", someInput));
                }
                isWithNull |= resolvedInputs == null;
                if (result == null) {
                    result = resolvedInputs;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `(hibit0 & hibit1) != 0 | ((hibit0 ^ hibit1) != 0 && reshibit == 0)`
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
    sumLo = lo8 + b.lo8;
    reshibit = (sumLo & 0x8000000000000000L);
    if ((hibit0 & hibit1) != 0 | ((hibit0 ^ hibit1) != 0 && reshibit == 0))
      sumHi++;  /* add carry bit */
    hi8 = sumHi;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `count >= start_id & count < end_id`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
        while (iterator.hasNext()) {
            element = iterator.next();
            if (count >= start_id & count < end_id)
                list.add(element);
            count++;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `index >= start_id & index < end_id`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
        while (iterator.hasNext()) {
            element = iterator.next();
            if (index >= start_id & index < end_id)
                list.add(element);
            index++;
```

## RuleId[id=TextBlockMigration]
### TextBlockMigration
Concatenation can be replaced with text block
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/schema/SchemaUtils.java`
#### Snippet
```java
        info.put("model",
                "inline:"
                        + "{\n"
                        + "  version: '1.0',\n"
                        + "  defaultSchema: 'tpch',\n"
```

### TextBlockMigration
Concatenation can be replaced with text block
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/schema/SchemaUtils.java`
#### Snippet
```java
        info.put("model",
                "inline:"
                        + "{\n"
                        + "  version: '1.0',\n"
                        + "  defaultSchema: 'tpch',\n"
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `TopDownPlanVisitor` has no concrete subclass
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
 * Visitor (as in the Visitor Pattern) for {@link WayangPlan}s.
 */
public abstract class TopDownPlanVisitor<Payload, Return> {

    public Return process(Operator operator, OutputSlot<?> fromOutputSlot, Payload payload) {
```

### AbstractClassNeverImplemented
Abstract class `AggregationDescriptor` has no concrete subclass
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/AggregationDescriptor.java`
#### Snippet
```java
 * This descriptor pertains to functions that take multiple data units and aggregate them into a single data unit.
 */
public abstract class AggregationDescriptor<InputType, OutputType> extends FunctionDescriptor {

    private final DataUnitGroupType<InputType> inputType;
```

### AbstractClassNeverImplemented
Abstract class `ReservoirSampler` has no concrete subclass
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/ReservoirSampler.java`
#### Snippet
```java
 * Utility to do reservoir sampling with competitions over shared space.
 */
public abstract class ReservoirSampler<T> implements Sampler<T> {

    private final ArrayList<T> reservoir;
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DistinctOperator.java`
#### Snippet
```java
     * @param typeClass type of the dataunit elements
     */
    public DistinctOperator(Class<Type> typeClass) {
        this(DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CountOperator.java`
#### Snippet
```java
     * @param typeClass type of the stream elements
     */
    public CountOperator(Class<Type> typeClass) {
        this(DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java
    protected final Collection<T> collection;

    public CollectionSource(Collection<T> collection, Class<T> typeClass) {
        this(collection, DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java
     * Creates a new instance without any data quanta.
     */
    public static <T> CollectionSource<T> singleton(T value, Class<T> typeClass) {
        final CollectionSource<T> instance = new CollectionSource<>(Collections.singleton(value), typeClass);
        instance.setName("{" + value + "}");
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/UnionAllOperator.java`
#### Snippet
```java
     * @param typeClass the type of the datasets to be coalesced
     */
    public UnionAllOperator(Class<Type> typeClass) {
        this(DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/IntersectOperator.java`
#### Snippet
```java
public class IntersectOperator<Type> extends BinaryToUnaryOperator<Type, Type, Type> {

    public IntersectOperator(Class<Type> typeClass) {
        this(DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends InputType0`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CartesianOperator.java`
#### Snippet
```java
        extends BinaryToUnaryOperator<InputType0, InputType1, Tuple2<InputType0, InputType1>> {

    public CartesianOperator(Class<InputType0> inputType0Class, Class<InputType1> inputType1Class) {
        super(DataSetType.createDefault(inputType0Class),
                DataSetType.createDefault(inputType1Class),
```

### BoundedWildcard
Can generalize to `? extends InputType1`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CartesianOperator.java`
#### Snippet
```java
        extends BinaryToUnaryOperator<InputType0, InputType1, Tuple2<InputType0, InputType1>> {

    public CartesianOperator(Class<InputType0> inputType0Class, Class<InputType1> inputType1Class) {
        super(DataSetType.createDefault(inputType0Class),
                DataSetType.createDefault(inputType1Class),
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/GlobalMaterializedGroupOperator.java`
#### Snippet
```java
     * @param typeClass the class of data quanta being grouped
     */
    public GlobalMaterializedGroupOperator(Class<Type> typeClass) {
        this(DataSetType.createDefault(typeClass), DataSetType.createGrouped(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/RepeatOperator.java`
#### Snippet
```java
     * @param typeClass     of the "circulated" dataset
     */
    public RepeatOperator(Integer numIterations, Class<Type> typeClass) {
        this(numIterations, DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends InputType`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ZipWithIdOperator.java`
#### Snippet
```java
     * Creates a new instance.
     */
    public ZipWithIdOperator(Class<InputType> inputTypeClass) {
        this(DataSetType.createDefault(inputTypeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends SqlDialectFactory`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java

    private static SqlDialect dialect(
        Pair<SqlDialectFactory, DataSource> key) {
      SqlDialectFactory dialectFactory = key.left;
      DataSource dataSource = key.right;
```

### BoundedWildcard
Can generalize to `? extends DataSource`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java

    private static SqlDialect dialect(
        Pair<SqlDialectFactory, DataSource> key) {
      SqlDialectFactory dialectFactory = key.left;
      DataSource dataSource = key.right;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
   * that will yield successive rows from that result set. */
  static Function1<ResultSet, Function0<@Nullable Object[]>> rowBuilderFactory(
      final List<Pair<ColumnMetaData.Rep, Integer>> list) {
    ColumnMetaData.Rep[] reps =
        Pair.left(list).toArray(new ColumnMetaData.Rep[0]);
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
   * internal format (e.g. DATE represented as int). */
  static Function1<ResultSet, Function0<@Nullable Object[]>> rowBuilderFactory2(
      final List<Pair<ColumnMetaData.Rep, Integer>> list) {
    ColumnMetaData.Rep[] reps =
        Pair.left(list).toArray(new ColumnMetaData.Rep[0]);
```

### BoundedWildcard
Can generalize to `? extends RexNode`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java
    }

    private static int[] getProjectFields(List<RexNode> projects) {
        final int[] fields = new int[projects.size()];
        for (int i = 0; i < projects.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends RelDataType`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
    // private final ImmutableIntList fields;

    public JavaCSVTableSource(String sourcePath, DataSetType type, List<RelDataType> fieldTypes) {
        super(type);
        this.sourcePath = sourcePath;
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LocalCallbackSink.java`
#### Snippet
```java
     * @param typeClass     type of the incoming elements
     */
    public LocalCallbackSink(Consumer<T> callback, Class<T> typeClass) {
        this(callback, DataSetType.createDefault(typeClass));
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaReservoirSampleOperator.java`
#### Snippet
```java
    }

    private static <T> List<T> reservoirSample(Random rand, Iterator<T> items, long m) {
        ArrayList<T> res = new ArrayList<T>(Math.toIntExact(m));
        int count = 0;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
        private long numPushedObjects = 0L;

        public StreamChunker(int chunkSize, BiConsumer<Object[], Integer> action) {
            this.action = action;
            this.chunk = new Object[chunkSize];
```

### BoundedWildcard
Can generalize to `? extends InputType`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
    }

    public DoWhileOperator(Class<InputType> inputTypeClass,
                           Class<ConvergenceType> convergenceTypeClass,
                           PredicateDescriptor.SerializablePredicate<Collection<ConvergenceType>> criterionPredicate,
```

### BoundedWildcard
Can generalize to `? extends ConvergenceType`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java

    public DoWhileOperator(Class<InputType> inputTypeClass,
                           Class<ConvergenceType> convergenceTypeClass,
                           PredicateDescriptor.SerializablePredicate<Collection<ConvergenceType>> criterionPredicate,
                           Integer numExpectedIterations) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaIntersectOperator.java`
#### Snippet
```java
     * @return the probing table
     */
    private Set<Type> createProbingTable(Stream<Type> stream) {
        return stream.collect(Collectors.toSet());
    }
```

### BoundedWildcard
Can generalize to `? super Long`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
     * @param correction element to add the array in the case of the key exist
     */
    private <T> void adjustOrPutValue(Map<Long, T> map, Long key, T default_value, T correction, BiFunction<T, T, T> update){
        if(map.containsKey(key)){
            T value = map.get(key);
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
     * @param correction element to add the array in the case of the key exist
     */
    private <T> void adjustOrPutValue(Map<Long, T> map, Long key, T default_value, T correction, BiFunction<T, T, T> update){
        if(map.containsKey(key)){
            T value = map.get(key);
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
     * @param correction element to add the array in the case of the key exist
     */
    private <T> void adjustOrPutValue(Map<Long, T> map, Long key, T default_value, T correction, BiFunction<T, T, T> update){
        if(map.containsKey(key)){
            T value = map.get(key);
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
     * @param correction element to add the array in the case of the key exist
     */
    private <T> void adjustOrPutValue(Map<Long, T> map, Long key, T default_value, T correction, BiFunction<T, T, T> update){
        if(map.containsKey(key)){
            T value = map.get(key);
```

### BoundedWildcard
Can generalize to `? extends Tuple2`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
     */
    //TODO: change for efficient map
    private Map<Long, Float> pageRank(Collection<Tuple2<Long, Long>> edgeDataSet) {
        // Get the degress of all vertices and make sure we collect *all* vertices.
        //TODO: change for efficient map
```

### BoundedWildcard
Can generalize to `? extends InputType`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    }

    public LoopOperator(Class<InputType> inputTypeClass, Class<ConvergenceType> convergenceTypeClass,
                        PredicateDescriptor.SerializablePredicate<Collection<ConvergenceType>> criterionPredicate,
                        Integer numExpectedIterations) {
```

### BoundedWildcard
Can generalize to `? extends ConvergenceType`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    }

    public LoopOperator(Class<InputType> inputTypeClass, Class<ConvergenceType> convergenceTypeClass,
                        PredicateDescriptor.SerializablePredicate<Collection<ConvergenceType>> criterionPredicate,
                        Integer numExpectedIterations) {
```

### BoundedWildcard
Can generalize to `? extends TimeMeasurement`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/instrumentation/StopWatch.java`
#### Snippet
```java
  }

  private int determineFirstColumnWidth(Collection<TimeMeasurement> rounds, int indentWidth, int numIndents, int bulletWidth) {
    return rounds.stream()
        .map(round -> this.determineFirstColumnWidth(round, indentWidth, numIndents, bulletWidth))
```

### BoundedWildcard
Can generalize to `? extends Experiment`
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     * @param writer the {@link Writer}
     */
    public void save(Collection<Experiment> experiments, Writer writer) throws IOException {
        try {
            Gson gson = context.getGson();
```

### BoundedWildcard
Can generalize to `? extends Value`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/ExplicitCollectionProvider.java`
#### Snippet
```java
    }

    public void addAllToWhitelist(Collection<Value> values) {
        values.forEach(this::addToWhitelist);
    }
```

### BoundedWildcard
Can generalize to `? extends Value`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/ExplicitCollectionProvider.java`
#### Snippet
```java
    }

    public void addAllToBlacklist(Collection<Value> values) {
        values.forEach(this::addToBlacklist);
    }
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalCollectionProvider.java`
#### Snippet
```java
    private final Function<Configuration, Collection<Value>> providerFunction;

    public FunctionalCollectionProvider(Function<Configuration, Collection<Value>> providerFunction, Configuration configuration) {
        super(configuration);
        this.providerFunction = providerFunction;
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalCollectionProvider.java`
#### Snippet
```java
    private final Function<Configuration, Collection<Value>> providerFunction;

    public FunctionalCollectionProvider(Function<Configuration, Collection<Value>> providerFunction, Configuration configuration) {
        super(configuration);
        this.providerFunction = providerFunction;
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalCollectionProvider.java`
#### Snippet
```java
    }

    public FunctionalCollectionProvider(Function<Configuration, Collection<Value>> providerFunction,
                                        Configuration configuration,
                                        CollectionProvider parent) {
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalCollectionProvider.java`
#### Snippet
```java
    }

    public FunctionalCollectionProvider(Function<Configuration, Collection<Value>> providerFunction,
                                        Configuration configuration,
                                        CollectionProvider parent) {
```

### BoundedWildcard
Can generalize to `? extends Operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanMetrics.java`
#### Snippet
```java
     * @return the number of {@link ExecutionOperator} combinations among the {@code operators}
     */
    private long collectFrom(Collection<Operator> operators) {
        long numCombinations = 1L;
        for (Operator operator : operators) {
```

### BoundedWildcard
Can generalize to `? super ValueProvider`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalValueProvider.java`
#### Snippet
```java
    }

    public FunctionalValueProvider(Function<ValueProvider<Value>, Value> valueFunction, Configuration configuration, ValueProvider<Value> parent) {
        super(configuration, parent);
        this.valueFunction = valueFunction;
```

### BoundedWildcard
Can generalize to `? extends Value`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalValueProvider.java`
#### Snippet
```java
    }

    public FunctionalValueProvider(Function<ValueProvider<Value>, Value> valueFunction, Configuration configuration, ValueProvider<Value> parent) {
        super(configuration, parent);
        this.valueFunction = valueFunction;
```

### BoundedWildcard
Can generalize to `? extends OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OutputSlot.java`
#### Snippet
```java
     * Copy the {@link OutputSlot}s to a given {@link Operator}.
     */
    public static void mock(List<OutputSlot<?>> outputs, Operator mock) {
        if (outputs.size() != mock.getNumOutputs()) {
            throw new IllegalArgumentException("Cannot mock inputs: Mismatching number of inputs.");
```

### BoundedWildcard
Can generalize to `? extends PlanImplementation`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java


    private PlanImplementation pickBestExecutionPlan(Collection<PlanImplementation> executionPlans,
                                                     ExecutionPlan existingPlan,
                                                     Set<Channel> openChannels,
```

### BoundedWildcard
Can generalize to `? extends PlanTransformation`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/WayangPlan.java`
#### Snippet
```java
     * @return the number of applied transformations
     */
    private int applyAndCountTransformations(Collection<PlanTransformation> transformations, int epoch) {
        return transformations.stream()
                .mapToInt(transformation -> transformation.transform(this, epoch))
```

### BoundedWildcard
Can generalize to `? extends InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/InputSlot.java`
#### Snippet
```java
     * Copy the {@link InputSlot}s to a given {@link Operator}.
     */
    public static void mock(List<InputSlot<?>> inputSlots, Operator mock, boolean isKeepBroadcastStatus) {
        if (inputSlots.size() != mock.getNumInputs()) {
            throw new IllegalArgumentException("Cannot mock inputs: Mismatching number of inputs.");
```

### BoundedWildcard
Can generalize to `? super Activator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java
         * @param activatorQueue accepts newly activated {@link CardinalityEstimator}s
         */
        protected void process(Queue<Activator<TActivation>> activatorQueue) {
            assert this.isActivationComplete() : String.format("Cannot process %s: activation not complete.", this);
            Collection<TActivation> successorActivations = this.doWork();
```

### BoundedWildcard
Can generalize to `? super Key`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalKeyValueProvider.java`
#### Snippet
```java
    private FunctionalKeyValueProvider(KeyValueProvider<Key, Value> parent,
                                      Configuration configuration,
                                      BiFunction<Key, KeyValueProvider<Key, Value>, Value> providerFunction) {
        super(parent, configuration);
        this.providerFunction = providerFunction;
```

### BoundedWildcard
Can generalize to `? super KeyValueProvider`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalKeyValueProvider.java`
#### Snippet
```java
    private FunctionalKeyValueProvider(KeyValueProvider<Key, Value> parent,
                                      Configuration configuration,
                                      BiFunction<Key, KeyValueProvider<Key, Value>, Value> providerFunction) {
        super(parent, configuration);
        this.providerFunction = providerFunction;
```

### BoundedWildcard
Can generalize to `? extends Value`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalKeyValueProvider.java`
#### Snippet
```java
    private FunctionalKeyValueProvider(KeyValueProvider<Key, Value> parent,
                                      Configuration configuration,
                                      BiFunction<Key, KeyValueProvider<Key, Value>, Value> providerFunction) {
        super(parent, configuration);
        this.providerFunction = providerFunction;
```

### BoundedWildcard
Can generalize to `? super Key`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalKeyValueProvider.java`
#### Snippet
```java
    }

    private static <Key, Value> BiFunction<Key, KeyValueProvider<Key, Value>, Value> uncur(Function<Key, Value> function) {
        return (key, provider) -> function.apply(key);
    }
```

### BoundedWildcard
Can generalize to `? extends Value`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/FunctionalKeyValueProvider.java`
#### Snippet
```java
    }

    private static <Key, Value> BiFunction<Key, KeyValueProvider<Key, Value>, Value> uncur(Function<Key, Value> function) {
        return (key, provider) -> function.apply(key);
    }
```

### BoundedWildcard
Can generalize to `? extends InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
     * @return whether it is worth wrapping
     */
    public static boolean canWrap(List<InputSlot<?>> inputs, List<OutputSlot<?>> outputs) {
        // Play safe: we only propose not to wrap if we cover all Slots of an Operator.
        Operator operator = null;
```

### BoundedWildcard
Can generalize to `? extends OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
     * @return whether it is worth wrapping
     */
    public static boolean canWrap(List<InputSlot<?>> inputs, List<OutputSlot<?>> outputs) {
        // Play safe: we only propose not to wrap if we cover all Slots of an Operator.
        Operator operator = null;
```

### BoundedWildcard
Can generalize to `? extends InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
     * @param container that should wrap the subplan
     */
    public static void wrap(List<InputSlot<?>> inputs, List<OutputSlot<?>> outputs, OperatorContainer container) {
        final SlotMapping slotMapping = container.getSlotMapping();
        final Operator containerOperator = container.toOperator();
```

### BoundedWildcard
Can generalize to `? extends OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
     * @param container that should wrap the subplan
     */
    public static void wrap(List<InputSlot<?>> inputs, List<OutputSlot<?>> outputs, OperatorContainer container) {
        final SlotMapping slotMapping = container.getSlotMapping();
        final Operator containerOperator = container.toOperator();
```

### BoundedWildcard
Can generalize to `? super CompositeOperator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
     * Criterion when to consider an entered {@link CompositeOperator} as normal {@link Operator} as well.
     */
    public PlanTraversal consideringEnteredOperatorsIf(Predicate<CompositeOperator> compositeRelevanceCondition) {
        this.compositeRelevanceCondition = compositeRelevanceCondition;
        return this;
```

### BoundedWildcard
Can generalize to `? super OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
    }

    public PlanTraversal followingOutputsIf(Predicate<OutputSlot<?>> outputFollowPredicate) {
        this.outputFollowPredicate = outputFollowPredicate;
        return this;
```

### BoundedWildcard
Can generalize to `? super Operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
     * @return previously traversed operators matching the predicated
     */
    public Collection<Operator> getTraversedNodesWith(Predicate<Operator> operatorPredicate) {
        return this.visitedRelevantOperators.stream().filter(operatorPredicate).collect(Collectors.toList());
    }
```

### BoundedWildcard
Can generalize to `? extends OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
     * Override to control the traversal behavior.
     */
    protected void followOutputs(Stream<OutputSlot<?>> outputSlots) {
        outputSlots
                .filter(this.outputFollowPredicate)
```

### BoundedWildcard
Can generalize to `? super OperatorContainer`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
     * Criterion to control when to visit the {@link Operator}s contained in {@link CompositeOperator}s.
     */
    public PlanTraversal enteringContainersIf(Predicate<OperatorContainer> containerEnterCondition) {
        this.containerEnterCondition = containerEnterCondition;
        return this;
```

### BoundedWildcard
Can generalize to `? super InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
    }

    public PlanTraversal followingInputsIf(Predicate<InputSlot<?>> inputFollowPredicate) {
        this.inputFollowPredicate = inputFollowPredicate;
        return this;
```

### BoundedWildcard
Can generalize to `? super InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
    }

    public PlanTraversal followingInputsDownstreamIf(Predicate<InputSlot<?>> inputFollowPredicate) {
        this.inputFollowDownstreamPredicate = inputFollowPredicate;
        return this;
```

### BoundedWildcard
Can generalize to `? super Channel`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
     * Detaches this instance from all its {@link #siblings}.
     */
    public void removeSiblingsWhere(Predicate<Channel> condition) {
        // Detach with siblings.
        List<Channel> removedSiblings = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Iterators.java`
#### Snippet
```java
     * @return whether all tests returned {@code true}
     */
    public static <T> boolean allMatch(Iterator<T> iterator, Predicate<T> predicate, boolean isAbortEarly) {
        boolean result = true;
        while (iterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Iterators.java`
#### Snippet
```java
     * @return whether all tests returned {@code true}
     */
    public static <T> boolean allMatch(Iterator<T> iterator, Predicate<T> predicate, boolean isAbortEarly) {
        boolean result = true;
        while (iterator.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangArrays.java`
#### Snippet
```java
    }

    public static <T> boolean anyMatch(T[] array, Predicate<T> predicate) {
        for (T t : array) {
            if (predicate.test(t)) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> deserializeAllAsList(WayangJsonArray wayangJsonArray, JsonSerializer<T> serializer, Class<T> cls) {
        List<T> result = new ArrayList<>(wayangJsonArray.length());
        for (Object jsonElement : wayangJsonArray) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     * @return the serialization result
     */
    public static <T> WayangJsonArray serializeAll(Collection<T> collection, boolean isPolymorph, JsonSerializer<T> serializer) {
        if (collection == null) return null;
        WayangJsonArray wayangJsonArray = new WayangJsonArray();
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     * @return the serialization result
     */
    public static <T> WayangJsonArray serializeAll(Collection<T> collection, boolean isPolymorph, JsonSerializer<T> serializer) {
        if (collection == null) return null;
        WayangJsonArray wayangJsonArray = new WayangJsonArray();
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> deserializeAllAsList(WayangJsonArray wayangJsonArray, JsonSerializer<T> serializer) {
        List<T> result = new ArrayList<>(wayangJsonArray.length());
        for (Object jsonElement : wayangJsonArray) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/NamedFunction.java`
#### Snippet
```java
    final List<Expression> arguments;

    public NamedFunction(String name, List<Expression> arguments) {
        this.name = name;
        this.arguments = arguments;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/CompiledFunction.java`
#### Snippet
```java
    final List<Expression> arguments;

    public CompiledFunction(String name, ToDoubleFunction<double[]> implementation, List<Expression> arguments) {
        this.name = name;
        this.implementation = implementation;
```

### BoundedWildcard
Can generalize to `? extends S`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, Function<S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        for (S element : list) {
```

### BoundedWildcard
Can generalize to `? super S`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, Function<S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        for (S element : list) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, Function<S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        for (S element : list) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Provides the given {@code collection} as {@link Set}, thereby checking if it is already a {@link Set}.
     */
    public static <T> Set<T> asSet(Collection<T> collection) {
        if (collection instanceof Set<?>) {
            return (Set<T>) collection;
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Provides the given {@code collection} as {@link List}, thereby checking if it is already a {@link List}.
     */
    public static <T> List<T> asList(Collection<T> collection) {
        if (collection instanceof List<?>) {
            return (List<T>) collection;
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * @param collector   collects power list members
     */
    private static <T> void createPowerListAux(List<T> base, int startIndex, int maxElements, List<List<T>> collector) {
        if (startIndex >= base.size()) {
            collector.add(Collections.emptyList());
```

### BoundedWildcard
Can generalize to `? extends S`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, BiFunction<Integer, S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        int i = 0;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, BiFunction<Integer, S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        int i = 0;
```

### BoundedWildcard
Can generalize to `? super S`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, BiFunction<Integer, S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        int i = 0;
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Return a new {@link List} with mapped values.
     */
    public static <S, T> List<T> map(List<S> list, BiFunction<Integer, S, T> mapFunction) {
        List<T> result = new ArrayList<>(list.size());
        int i = 0;
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
     * Provides the given {@code iterable} as {@link Set}, thereby checking if it is already a {@link Set}.
     */
    public static <T> Set<T> asSet(Iterable<T> iterable) {
        if (iterable instanceof Set<?>) {
            return (Set<T>) iterable;
```

### BoundedWildcard
Can generalize to `? super MatchedOperator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
         * @param replacementFactory factory for the replacement {@link Operator}s
         */
        public OfSingleOperators(BiFunction<MatchedOperator, Integer, Operator> replacementFactory) {
            this.replacementFactory = replacementFactory;
        }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
         * @param replacementFactory factory for the replacement {@link Operator}s
         */
        public OfSingleOperators(BiFunction<MatchedOperator, Integer, Operator> replacementFactory) {
            this.replacementFactory = replacementFactory;
        }
```

### BoundedWildcard
Can generalize to `? extends Operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
         * @param replacementFactory factory for the replacement {@link Operator}s
         */
        public OfSingleOperators(BiFunction<MatchedOperator, Integer, Operator> replacementFactory) {
            this.replacementFactory = replacementFactory;
        }
```

### BoundedWildcard
Can generalize to `? extends Tuple`, Supplier>
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
     * @return the first match's {@link Supplier} value or {@code null} if no match was found
     */
    private static Object getDefaultParameter(Class<?> parameterClass, List<Tuple<Class<?>, Supplier<?>>> defaultParameterSuppliers) {
        for (Tuple<Class<?>, Supplier<?>> defaultParameterSupplier : defaultParameterSuppliers) {
            if (parameterClass.isAssignableFrom(defaultParameterSupplier.getField0())) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionStage`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/FixBreakpoint.java`
#### Snippet
```java
    }

    public FixBreakpoint breakBefore(Collection<ExecutionStage> stages) {
        for (ExecutionStage stage : stages) {
            if (this.stagesToSuspend.add(stage)) {
```

### BoundedWildcard
Can generalize to `? extends ChannelInstance`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ExecutorTemplate.java`
#### Snippet
```java
     * @param producedChannelInstances the {@link ChannelInstance}s
     */
    protected void registerMeasuredCardinalities(Collection<ChannelInstance> producedChannelInstances) {
        for (ChannelInstance producedChannelInstance : producedChannelInstances) {
            if (!producedChannelInstance.wasProduced()) {
```

### BoundedWildcard
Can generalize to `? extends ChannelInstance`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PushExecutorTemplate.java`
#### Snippet
```java
        }

        private void activateSuccessorTasks(ExecutionTask task, Collection<ChannelInstance> outputChannelInstances) {
            for (ChannelInstance outputChannelInstance : outputChannelInstances) {
                if (outputChannelInstance == null) continue; // Partial results possible (cf. LoopHeadOperator).
```

### BoundedWildcard
Can generalize to `? extends OptimizationContext`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
    private StageActivator getOrCreateActivator(
            ExecutionStage stage,
            final Supplier<OptimizationContext> optimizationContextSupplier
    ) {
        return this.pendingStageActivators.computeIfAbsent(stage, s -> new StageActivator(s, optimizationContextSupplier.get()));
```

### BoundedWildcard
Can generalize to `? extends Channel`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
         * @return whether there are {@link ChannelInstance}s for all {@link Channel}s available
         */
        private boolean updateChannelInstances(Collection<Channel> channels, boolean isFeedback) {
            boolean isAllChannelsAvailable = true;
            for (Channel channel : channels) {
```

### BoundedWildcard
Can generalize to `? super LoadProfile`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileToTimeConverter.java`
#### Snippet
```java

            private TimeEstimate sumWithSubprofiles(LoadProfile profile,
                                                    Function<LoadProfile, LoadEstimate> property,
                                                    LoadToTimeConverter converter) {
                final LoadEstimate topLevelPropertyValue = property.apply(profile);
```

### BoundedWildcard
Can generalize to `? extends LoadEstimate`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileToTimeConverter.java`
#### Snippet
```java

            private TimeEstimate sumWithSubprofiles(LoadProfile profile,
                                                    Function<LoadProfile, LoadEstimate> property,
                                                    LoadToTimeConverter converter) {
                final LoadEstimate topLevelPropertyValue = property.apply(profile);
```

### BoundedWildcard
Can generalize to `? extends LoadProfileEstimator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
     * @param configuration      provides the UDF {@link LoadProfileEstimator}
     */
    public static void nestUdfEstimator(Optional<LoadProfileEstimator> mainEstimatorOpt,
                                        FunctionDescriptor functionDescriptor,
                                        Configuration configuration) {
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/DefaultCardinalityEstimator.java`
#### Snippet
```java
                                       int numInputs,
                                       boolean isAllowMoreInputs,
                                       ToLongBiFunction<long[], Configuration> singlePointEstimator) {
        this.certaintyProb = certaintyProb;
        this.numInputs = numInputs;
```

### BoundedWildcard
Can generalize to `? super OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/DefaultCardinalityPusher.java`
#### Snippet
```java
    private CardinalityEstimator[] initializeCardinalityEstimators(
            Operator operator,
            KeyValueProvider<OutputSlot<?>, CardinalityEstimator> estimationProvider) {

        final CardinalityEstimator[] cardinalityEstimators = new CardinalityEstimator[operator.getNumOutputs()];
```

### BoundedWildcard
Can generalize to `? extends CardinalityEstimator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/DefaultCardinalityPusher.java`
#### Snippet
```java
    private CardinalityEstimator[] initializeCardinalityEstimators(
            Operator operator,
            KeyValueProvider<OutputSlot<?>, CardinalityEstimator> estimationProvider) {

        final CardinalityEstimator[] cardinalityEstimators = new CardinalityEstimator[operator.getNumOutputs()];
```

### BoundedWildcard
Can generalize to `? extends InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopHeadAlternativeCardinalityPusher.java`
#### Snippet
```java
    public LoopHeadAlternativeCardinalityPusher(
            final LoopHeadAlternative loopHeadAlternative,
            Collection<InputSlot<?>> relevantInputSlots,
            Collection<OutputSlot<?>> relevantOutputSlots,
            BiFunction<OperatorAlternative.Alternative, Configuration, CardinalityPusher> pusherRetriever,
```

### BoundedWildcard
Can generalize to `? extends OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopHeadAlternativeCardinalityPusher.java`
#### Snippet
```java
            final LoopHeadAlternative loopHeadAlternative,
            Collection<InputSlot<?>> relevantInputSlots,
            Collection<OutputSlot<?>> relevantOutputSlots,
            BiFunction<OperatorAlternative.Alternative, Configuration, CardinalityPusher> pusherRetriever,
            final Configuration configuration
```

### BoundedWildcard
Can generalize to `? super OperatorAlternative.Alternative`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopHeadAlternativeCardinalityPusher.java`
#### Snippet
```java
            Collection<InputSlot<?>> relevantInputSlots,
            Collection<OutputSlot<?>> relevantOutputSlots,
            BiFunction<OperatorAlternative.Alternative, Configuration, CardinalityPusher> pusherRetriever,
            final Configuration configuration
    ) {
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopHeadAlternativeCardinalityPusher.java`
#### Snippet
```java
            Collection<InputSlot<?>> relevantInputSlots,
            Collection<OutputSlot<?>> relevantOutputSlots,
            BiFunction<OperatorAlternative.Alternative, Configuration, CardinalityPusher> pusherRetriever,
            final Configuration configuration
    ) {
```

### BoundedWildcard
Can generalize to `? extends CardinalityPusher`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/LoopHeadAlternativeCardinalityPusher.java`
#### Snippet
```java
            Collection<InputSlot<?>> relevantInputSlots,
            Collection<OutputSlot<?>> relevantOutputSlots,
            BiFunction<OperatorAlternative.Alternative, Configuration, CardinalityPusher> pusherRetriever,
            final Configuration configuration
    ) {
```

### BoundedWildcard
Can generalize to `? extends CardinalityEstimationTraversal`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/OperatorAlternativeCardinalityPusher.java`
#### Snippet
```java
     * Trigger the {@link CardinalityEstimationTraversal} for the given {@code traversal}.
     */
    private void pushThroughPath(Tuple<OperatorAlternative.Alternative, CardinalityEstimationTraversal> traversal,
                                 Configuration configuration,
                                 OptimizationContext optimizationCtx) {
```

### BoundedWildcard
Can generalize to `? extends ExecutionOperator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/DefaultChannelConversion.java`
#### Snippet
```java
            ChannelDescriptor sourceChannelDescriptor,
            ChannelDescriptor targetChannelDescriptor,
            Supplier<ExecutionOperator> executionOperatorFactory,
            String name) {
        this(
```

### BoundedWildcard
Can generalize to `? super Channel`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/DefaultChannelConversion.java`
#### Snippet
```java
            ChannelDescriptor sourceChannelDescriptor,
            ChannelDescriptor targetChannelDescriptor,
            BiFunction<Channel, Configuration, ExecutionOperator> executionOperatorFactory,
            String name) {
        super(sourceChannelDescriptor, targetChannelDescriptor);
```

### BoundedWildcard
Can generalize to `? super Configuration`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/DefaultChannelConversion.java`
#### Snippet
```java
            ChannelDescriptor sourceChannelDescriptor,
            ChannelDescriptor targetChannelDescriptor,
            BiFunction<Channel, Configuration, ExecutionOperator> executionOperatorFactory,
            String name) {
        super(sourceChannelDescriptor, targetChannelDescriptor);
```

### BoundedWildcard
Can generalize to `? extends ExecutionOperator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/DefaultChannelConversion.java`
#### Snippet
```java
            ChannelDescriptor sourceChannelDescriptor,
            ChannelDescriptor targetChannelDescriptor,
            BiFunction<Channel, Configuration, ExecutionOperator> executionOperatorFactory,
            String name) {
        super(sourceChannelDescriptor, targetChannelDescriptor);
```

### BoundedWildcard
Can generalize to `? extends OptimizationContext`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/DefaultChannelConversion.java`
#### Snippet
```java
     */
    private void setCardinalityAndTimeEstimates(Channel sourceChannel,
                                                Collection<OptimizationContext> optimizationContexts,
                                                CardinalityEstimate optCardinality,
                                                ExecutionTask task) {
```

### BoundedWildcard
Can generalize to `? super PartialExecution`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
     * @param partialExecutionJsonSerializer serializes {@link PartialExecution}s
     */
    private void store(PartialExecution partialExecution, JsonSerializer<PartialExecution> partialExecutionJsonSerializer)
            throws IOException {
        this.write(JsonSerializables.serialize(partialExecution, false, partialExecutionJsonSerializer));
```

### BoundedWildcard
Can generalize to `? extends PartialExecution`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
     * @param partialExecutions that should be stored
     */
    public void storeAll(Iterable<PartialExecution> partialExecutions) throws IOException {
        final PartialExecution.Serializer serializer = new PartialExecution.Serializer(this.configuration);
        for (PartialExecution partialExecution : partialExecutions) {
```

### BoundedWildcard
Can generalize to `? extends Activation`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
     * @param sourceActivators {@link Activator}s of source {@link CardinalityEstimator}
     */
    private CardinalityEstimationTraversal(final Collection<Activation> inputActivations,
                                           Collection<? extends Activator> sourceActivators) {
        this.inputActivations = inputActivations;
```

### BoundedWildcard
Can generalize to `? extends Activation`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
         * {@code activatorQueue}.
         */
        private void processDependentActivations(Collection<Activation> activations, Queue<Activator> activatorQueue) {
            // Otherwise, we update/activate the dependent estimators.
            activations.forEach(activation -> activation.fire(activatorQueue));
```

### BoundedWildcard
Can generalize to `? extends Activator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
    }

    private void resetAll(Stream<Activator> activatorStream) {
        activatorStream
                .filter(Activator::reset)
```

### BoundedWildcard
Can generalize to `? super Activator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
        }

        public void fire(Queue<Activator> activatorQueue) {
            assert !this.activator.isActivated[this.inputIndex]
                    : String.format("%s is already activated at input %d.", this.activator.operator, this.inputIndex);
```

### BoundedWildcard
Can generalize to `? extends ExecutionTask`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlow.java`
#### Snippet
```java
    }

    private void collectAllTasksAux(Stream<ExecutionTask> currentTasks, Set<ExecutionTask> collector) {
        currentTasks.forEach(task -> this.collectAllTasksAux(task, collector));
    }
```

### BoundedWildcard
Can generalize to `? extends Individual`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
     * @param individuals the {@link Individual}s
     */
    public void updateFitness(List<Individual> individuals) {
        individuals.forEach(this::updateFitnessOf);
        individuals.sort(Individual.fitnessComparator);
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/ReservoirSampler.java`
#### Snippet
```java

    @Override
    public List<T> sample(Collection<T> set, Battle<T> battle, double selectionProbability) {
        // Clear the reservoir.
        for (int i = 0; i < this.reservoir.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Operator`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * @return a {@link PlanEnumeration} for the given {@code branch}
     */
    private PlanEnumeration enumerateBranch(List<Operator> branch, OptimizationContext optimizationContext) {
        PlanEnumeration branchEnumeration = null;
        Operator lastOperator = null;
```

### BoundedWildcard
Can generalize to `? extends Channel`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
                          OptimizationContext optimizationContext,
                          ExecutionPlan baseplan,
                          Set<Channel> openChannels) {

        this(wayangPlan.collectReachableTopLevelSources(),
```

### BoundedWildcard
Can generalize to `? super Individual`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java
     * @return the new fitness
     */
    public double updateFitness(ToDoubleFunction<Individual> fitnessFunction) {
        return this.fitness = fitnessFunction.applyAsDouble(this);
    }
```

### BoundedWildcard
Can generalize to `? extends Variable`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java

    double estimateTime(PartialExecution partialExecution,
                        Map<Platform, Variable> platformOverheads,
                        Configuration configuration) {
        final DoubleStream operatorEstimates = partialExecution.getAtomicExecutionGroups().stream()
```

### BoundedWildcard
Can generalize to `? extends T`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/TournamentSampler.java`
#### Snippet
```java

    @Override
    public List<T> sample(Collection<T> set, Battle<T> battle, double selectionProbability) {
        ArrayList<T> arena = new ArrayList<>(set.size());
        arena.addAll(set);
```

### BoundedWildcard
Can generalize to `? super InputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
     */
    static PlanEnumeration createFor(Operator inputOperator,
                                     Predicate<InputSlot<?>> inputSlotPredicate,
                                     Operator outputOperator,
                                     Predicate<OutputSlot<?>> outputSlotPredicate) {
```

### BoundedWildcard
Can generalize to `? super OutputSlot`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                                     Predicate<InputSlot<?>> inputSlotPredicate,
                                     Operator outputOperator,
                                     Predicate<OutputSlot<?>> outputSlotPredicate) {

        final PlanEnumeration instance = new PlanEnumeration();
```

### BoundedWildcard
Can generalize to `? super Individual`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadEstimator.java`
#### Snippet
```java
     */
    public DynamicLoadEstimator(SinglePointEstimator singlePointEstimator,
                                Function<Individual, String> specificationBuilder,
                                Collection<Variable> employedVariables) {
        super(CardinalityEstimate.EMPTY_ESTIMATE);
```

### BoundedWildcard
Can generalize to `? extends List`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
     */
    private static List<SparkOperatorProfiler.Result> profile(SparkOperatorProfiler opProfiler,
                                                              List<List<Long>> allCardinalities) {

        return StreamSupport.stream(WayangCollections.streamedCrossProduct(allCardinalities).spliterator(), false)
```

### BoundedWildcard
Can generalize to `? extends PlanImplementation`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * @return the concatenated instance or {@code null} if the inputs are contradicting each other
     */
    PlanImplementation concatenate(List<PlanImplementation> targetPlans,
                                   Junction junction,
                                   PlanImplementation outputPlanImplementation,
```

### BoundedWildcard
Can generalize to `? extends PartialExecution`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
     * @return the binned {@link PartialExecution}s
     */
    private Collection<PartialExecution> binByExecutionTime(Collection<PartialExecution> partialExecutions, double densityFactor) {
        Map<Integer, PartialExecution> resultBins = new HashMap<>();
        for (PartialExecution partialExecution : partialExecutions) {
```

### BoundedWildcard
Can generalize to `? extends PartialExecution`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
     * @return the grouping of the {@link #partialExecutions}
     */
    private Map<Set<String>, List<PartialExecution>> groupPartialExecutions(Collection<PartialExecution> partialExecutions) {
        Map<Set<String>, List<PartialExecution>> groups = new HashMap<>();
        for (PartialExecution partialExecution : partialExecutions) {
```

### BoundedWildcard
Can generalize to `? extends Type1`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
    }

    public int compareRank(Data<Type0, Type1> d) {
        return rank.compareTo(d.getRank());
    }
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/extractData.java`
#### Snippet
```java
    Function<Input, TypeXRef> getXRef;

    public extractData(Function<Input, TypeXPivot> getXPivot, Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? extends TypeXPivot`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/extractData.java`
#### Snippet
```java
    Function<Input, TypeXRef> getXRef;

    public extractData(Function<Input, TypeXPivot> getXPivot, Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/extractData.java`
#### Snippet
```java
    Function<Input, TypeXRef> getXRef;

    public extractData(Function<Input, TypeXPivot> getXPivot, Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? extends TypeXRef`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/extractData.java`
#### Snippet
```java
    Function<Input, TypeXRef> getXRef;

    public extractData(Function<Input, TypeXPivot> getXPivot, Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? extends TypeXPivot`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? extends TypeXRef`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### BoundedWildcard
Can generalize to `? extends TypeXPivot`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### BoundedWildcard
Can generalize to `? super Input`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### BoundedWildcard
Can generalize to `? extends TypeXRef`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### BoundedWildcard
Can generalize to `? extends Tuple2`, Input>
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
    }

    private ArrayList<Tuple2<Input, Input>> getViolationsSelf(ArrayList<Tuple2<Data<Type0, Type1>, Input>> cond1,
                                                              int[] permutationArray) {
        ArrayList<Tuple2<Input, Input>> violation = new ArrayList<Tuple2<Input, Input>>(
```

### BoundedWildcard
Can generalize to `? extends Tuple2`, Input>
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
    }

    public ArrayList<Tuple2<Data<Type0, Type1>, Input>> merge(ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst1,
                                                              ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst2,
                                                              boolean asc1, boolean asc2) {
```

### BoundedWildcard
Can generalize to `? extends Tuple2`, Input>
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java

    public ArrayList<Tuple2<Data<Type0, Type1>, Input>> merge(ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst1,
                                                              ArrayList<Tuple2<Data<Type0, Type1>, Input>> lst2,
                                                              boolean asc1, boolean asc2) {
        int totalSize = lst1.size() + lst2.size(); // every element in the set
```

### BoundedWildcard
Can generalize to `? extends Tuple2`, Input>
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
    }

    private ArrayList<Tuple2<Input, Input>> getViolationsNonSelf(ArrayList<Tuple2<Data<Type0, Type1>, Input>> cond1,
                                                                 int[] permutationArray) {
        ArrayList<Tuple2<Input, Input>> violation = new ArrayList<Tuple2<Input, Input>>(
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/OutputFormatConsumer.java`
#### Snippet
```java
    private ConsumerDescriptor.SerializableConsumer<T> tConsumer;

    public OutputFormatConsumer(ConsumerDescriptor.SerializableConsumer<T> consumer) {
        this.tConsumer = consumer;
    }
```

### BoundedWildcard
Can generalize to `? super Collection`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java
    private FunctionDescriptor.SerializablePredicate<Collection<T>> predicate;

    public WayangConvergenceCriterion(FunctionDescriptor.SerializablePredicate<Collection<T>> predicate){
        this.predicate = predicate;
        this.doWhile = false;
```

### BoundedWildcard
Can generalize to `? super I`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java


    public <I, O> RichFlatMapFunction<I, O> compile(FunctionDescriptor.ExtendedSerializableFunction<I, Iterable<O>> flatMapDescriptor, FlinkExecutionContext exe) {

        return new RichFlatMapFunction<I, O>() {
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java


    public <I, O> RichFlatMapFunction<I, O> compile(FunctionDescriptor.ExtendedSerializableFunction<I, Iterable<O>> flatMapDescriptor, FlinkExecutionContext exe) {

        return new RichFlatMapFunction<I, O>() {
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
    }

    public <T> FilterFunction<T> compile(PredicateDescriptor.SerializablePredicate<T> predicateDescriptor) {
        return t -> predicateDescriptor.test(t);
    }
```

### BoundedWildcard
Can generalize to `? super I`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
     * @return a compiled function
     */
    public <I, O> FlatMapFunction<I, O> compile(FunctionDescriptor.SerializableFunction<I, Iterable<O>> flatMapDescriptor) {
        return (t, collector) -> flatMapDescriptor.apply(t).forEach(collector::collect);
    }
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
     * @return a compiled function
     */
    public <I, O> FlatMapFunction<I, O> compile(FunctionDescriptor.SerializableFunction<I, Iterable<O>> flatMapDescriptor) {
        return (t, collector) -> flatMapDescriptor.apply(t).forEach(collector::collect);
    }
```

### BoundedWildcard
Can generalize to `? super InputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/PredicateAdapter.java`
#### Snippet
```java
    private Predicate<InputType> predicate;

    public PredicateAdapter(Predicate<InputType> predicate) {
        this.predicate = predicate;
    }
```

### BoundedWildcard
Can generalize to `? super Type`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java
    private boolean isFirstRun = true;

    public ExtendedPredicateAdapater(PredicateDescriptor.ExtendedSerializablePredicate<Type> extendedFunction,
                                     SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
```

### BoundedWildcard
Can generalize to `? super InputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapFunctionAdapter.java`
#### Snippet
```java
    private java.util.function.Function<InputType, OutputType> function;

    public MapFunctionAdapter(java.util.function.Function<InputType, OutputType> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? extends OutputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapFunctionAdapter.java`
#### Snippet
```java
    private java.util.function.Function<InputType, OutputType> function;

    public MapFunctionAdapter(java.util.function.Function<InputType, OutputType> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? super Iterable`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapPartitionsFunctionAdapter.java`
#### Snippet
```java

    public ExtendedMapPartitionsFunctionAdapter(
            FunctionDescriptor.ExtendedSerializableFunction<Iterable<InputType>, Iterable<OutputType>> extendedFunction,
            SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapPartitionsFunctionAdapter.java`
#### Snippet
```java

    public ExtendedMapPartitionsFunctionAdapter(
            FunctionDescriptor.ExtendedSerializableFunction<Iterable<InputType>, Iterable<OutputType>> extendedFunction,
            SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
```

### BoundedWildcard
Can generalize to `? super InputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java
    private java.util.function.Function<InputType, Iterable<OutputType>> function;

    public FlatMapFunctionAdapter(java.util.function.Function<InputType, Iterable<OutputType>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java
    private java.util.function.Function<InputType, Iterable<OutputType>> function;

    public FlatMapFunctionAdapter(java.util.function.Function<InputType, Iterable<OutputType>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? super Iterable`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapPartitionsFunctionAdapter.java`
#### Snippet
```java
    private final Function<Iterable<InputType>, Iterable<OutputType>> function;

    public MapPartitionsFunctionAdapter(Function<Iterable<InputType>, Iterable<OutputType>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? extends Iterable`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapPartitionsFunctionAdapter.java`
#### Snippet
```java
    private final Function<Iterable<InputType>, Iterable<OutputType>> function;

    public MapPartitionsFunctionAdapter(Function<Iterable<InputType>, Iterable<OutputType>> function) {
        this.function = function;
    }
```

### BoundedWildcard
Can generalize to `? super InputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapFunctionAdapter.java`
#### Snippet
```java
    private boolean isFirstRun = true;

    public ExtendedMapFunctionAdapter(FunctionDescriptor.ExtendedSerializableFunction<InputType, OutputType> extendedFunction,
                                      SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
```

### BoundedWildcard
Can generalize to `? extends OutputType`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapFunctionAdapter.java`
#### Snippet
```java
    private boolean isFirstRun = true;

    public ExtendedMapFunctionAdapter(FunctionDescriptor.ExtendedSerializableFunction<InputType, OutputType> extendedFunction,
                                      SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
```

### BoundedWildcard
Can generalize to `? super T`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
        private final java.util.function.Function<T, K> impl;

        public KeyExtractor(java.util.function.Function<T, K> impl) {
            this.impl = impl;
        }
```

### BoundedWildcard
Can generalize to `? extends K`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
        private final java.util.function.Function<T, K> impl;

        public KeyExtractor(java.util.function.Function<T, K> impl) {
            this.impl = impl;
        }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Giraph.java`
#### Snippet
```java
 */
public class Giraph {
    private final static GiraphPlugin PLUGIN = new GiraphPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/Java.java`
#### Snippet
```java
    private final static JavaBasicPlugin PLUGIN = new JavaBasicPlugin();

    private final static JavaGraphPlugin GRAPH_PLUGIN = new JavaGraphPlugin();

    private final static JavaChannelConversionPlugin CONVERSION_PLUGIN = new JavaChannelConversionPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/Java.java`
#### Snippet
```java
public class Java {

    private final static JavaBasicPlugin PLUGIN = new JavaBasicPlugin();

    private final static JavaGraphPlugin GRAPH_PLUGIN = new JavaGraphPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/Java.java`
#### Snippet
```java
    private final static JavaGraphPlugin GRAPH_PLUGIN = new JavaGraphPlugin();

    private final static JavaChannelConversionPlugin CONVERSION_PLUGIN = new JavaChannelConversionPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/GraphChi.java`
#### Snippet
```java
public class GraphChi {

    private final static GraphChiPlugin PLUGIN = new GraphChiPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/Sqlite3.java`
#### Snippet
```java
    private final static Sqlite3Plugin PLUGIN = new Sqlite3Plugin();

    private final static Sqlite3ConversionPlugin CONVERSION_PLUGIN = new Sqlite3ConversionPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/Sqlite3.java`
#### Snippet
```java
public class Sqlite3 {

    private final static Sqlite3Plugin PLUGIN = new Sqlite3Plugin();

    private final static Sqlite3ConversionPlugin CONVERSION_PLUGIN = new Sqlite3ConversionPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/Postgres.java`
#### Snippet
```java
public class Postgres {

    private final static PostgresPlugin PLUGIN = new PostgresPlugin();

    private final static PostgresConversionsPlugin CONVERSIONS_PLUGIN = new PostgresConversionsPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/Postgres.java`
#### Snippet
```java
    private final static PostgresPlugin PLUGIN = new PostgresPlugin();

    private final static PostgresConversionsPlugin CONVERSIONS_PLUGIN = new PostgresConversionsPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `abstract public`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Slot.java`
#### Snippet
```java
 * Abstract class for inputs and outputs to operators.
 */
abstract public class Slot<T> {

    /**
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java
     * of its dependent {@link CardinalityEstimator}s.
     */
    public static abstract class Activator<TActivation extends Activation<? extends Activator<TActivation>>> {

        protected final Operator operator;
```

### MissortedModifiers
Missorted modifiers `final private`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanPattern.java`
#### Snippet
```java
         * Operators that have been considered to match against this pattern's sink.
         */
        final private Set<Operator> visitedOutputOperators = new HashSet<>();

        /**
```

### MissortedModifiers
Missorted modifiers `final private`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanPattern.java`
#### Snippet
```java
         * Collects all the matches.
         */
        final private List<SubplanMatch> matches = new LinkedList<>();

        /**
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ExecutionResourceTemplate.java`
#### Snippet
```java
     * @throws Throwable in case anything goes wrong
     */
    abstract protected void doDispose() throws Throwable;

}
```

### MissortedModifiers
Missorted modifiers `abstract protected`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/sampling/ReservoirSampler.java`
#### Snippet
```java
    }

    abstract protected T letCompete(T candidate1, T candidate2, Random random);

}
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/Flink.java`
#### Snippet
```java
    private final static FlinkBasicPlugin PLUGIN = new FlinkBasicPlugin();

    private final static FlinkGraphPlugin GRAPH_PLUGIN = new FlinkGraphPlugin();

    private final static FlinkConversionPlugin CONVERSION_PLUGIN = new FlinkConversionPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/Flink.java`
#### Snippet
```java
    private final static FlinkGraphPlugin GRAPH_PLUGIN = new FlinkGraphPlugin();

    private final static FlinkConversionPlugin CONVERSION_PLUGIN = new FlinkConversionPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/Flink.java`
#### Snippet
```java
public class Flink {

    private final static FlinkBasicPlugin PLUGIN = new FlinkBasicPlugin();

    private final static FlinkGraphPlugin GRAPH_PLUGIN = new FlinkGraphPlugin();
```

### MissortedModifiers
Missorted modifiers `transient final`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
    private transient FlinkExecutionOperator operator;

    private transient final ChannelInstance[] inputs;

    private transient int iterationNumber;
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/Spark.java`
#### Snippet
```java
    private final static SparkBasicPlugin PLUGIN = new SparkBasicPlugin();

    private final static SparkGraphPlugin GRAPH_PLUGIN = new SparkGraphPlugin();

    private final static SparkConversionPlugin CONVERSION_PLUGIN = new SparkConversionPlugin();
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/Spark.java`
#### Snippet
```java
    private final static SparkGraphPlugin GRAPH_PLUGIN = new SparkGraphPlugin();

    private final static SparkConversionPlugin CONVERSION_PLUGIN = new SparkConversionPlugin();

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/Spark.java`
#### Snippet
```java
public class Spark {

    private final static SparkBasicPlugin PLUGIN = new SparkBasicPlugin();

    private final static SparkGraphPlugin GRAPH_PLUGIN = new SparkGraphPlugin();
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java

            } catch (Exception e) {
                System.out.println(e);
                throw new WayangException("Python worker failed to connect back.", e);
            }
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.out.println()' call
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
            }
        } catch (Exception e){
            System.out.println(e);
            throw new WayangException("Python worker failed");
        }
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
  @SuppressWarnings("methodref.receiver.bound.invalid")
  private final Supplier<RelProtoDataType> protoRowTypeSupplier =
      Suppliers.memoize(this::supplyProto)::get;
  public final JdbcSchema jdbcSchema;
  public final String jdbcCatalogName;
```

## RuleId[id=RedundantStreamOptionalCall]
### RedundantStreamOptionalCall
Redundant 'filter()' call: predicate is always 'true'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
                } else {
                    return loopImplementation.getIterationImplementations().stream()
                            .filter(iterImpl -> true)
                            .collect(Collectors.toList());
                }
```

### RedundantStreamOptionalCall
Redundant 'distinct()' call: elements will be distinct anyway when collected to a Set
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
        final Set<OutputSlot> outputSlots = this.getPlanEnumeration().servingOutputSlots.stream()
                .map(Tuple::getField0)
                .distinct()
                .collect(Collectors.toSet());
        final Set<InputSlot<?>> inputSlots = this.getPlanEnumeration().requestedInputSlots;
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 1)
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/NestableLoadProfileEstimator.java`
#### Snippet
```java
            );
        } catch (Exception e) {
             throw new WayangException(String.format("Failed estimating on %s.", this, context), e);
        }
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
                this.writeInfo();
            }
            super.flush();
            super.close();
        }
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java
            // First, inspect the size of the file and its line sizes.
            OptionalLong fileSize = FileSystems.getFileSize(TextFileSource.this.inputUrl);
            if (!fileSize.isPresent()) {
                TextFileSource.this.logger.warn("Could not determine size of {}... deliver fallback estimate.",
                        TextFileSource.this.inputUrl);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java

            OptionalDouble bytesPerLine = this.estimateBytesPerLine();
            if (!bytesPerLine.isPresent()) {
                TextFileSource.this.logger.warn("Could not determine average line size of {}... deliver fallback estimate.",
                        TextFileSource.this.inputUrl);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
            // First, inspect the size of the file and its line sizes.
            OptionalLong fileSize = FileSystems.getFileSize(ObjectFileSource.this.inputUrl);
            if (!fileSize.isPresent()) {
                ObjectFileSource.this.logger.warn("Could not determine size of {}... deliver fallback estimate.",
                        ObjectFileSource.this.inputUrl);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java

            OptionalDouble bytesPerLine = this.estimateBytesPerLine();
            if (!bytesPerLine.isPresent()) {
                ObjectFileSource.this.logger.warn("Could not determine average line size of {}... deliver fallback estimate.",
                        ObjectFileSource.this.inputUrl);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
    public long getLongProperty(String key) {
        final OptionalLong optionalLongProperty = this.getOptionalLongProperty(key);
        if (!optionalLongProperty.isPresent()) {
            throw new WayangException(String.format("No value for \"%s\".", key));
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
                                Optional<String> optInstrumentationtStrategyClass =
                                        requestee.getConfiguration().getOptionalStringProperty("wayang.core.optimizer.instrumentation");
                                if (!optInstrumentationtStrategyClass.isPresent()) {
                                    return null;
                                }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
    public void load(String configurationUrl) {
        final Optional<FileSystem> fileSystem = FileSystems.getFileSystem(configurationUrl);
        if (!fileSystem.isPresent()) {
            throw new WayangException(String.format("Could not access %s.", configurationUrl));
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
        final Optional<FileSystem> fsOptional = getFileSystem(ostensibleInputFile);

        if (!fsOptional.isPresent()) {
            LogManager.getLogger(FileSystems.class).warn("Could not inspect input file {}.", ostensibleInputFile);
            return Collections.singleton(ostensibleInputFile);
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java

        // Short-cut: The matched operators do not require specific platforms.
        if (!match.getTargetPlatforms().isPresent()) {
            return true;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ExecutorTemplate.java`
#### Snippet
```java
        // Check if a cardinality was measured in the first place.
        final OptionalLong optionalCardinality = channelInstance.getMeasuredCardinality();
        if (!optionalCardinality.isPresent()) {
            if (channelInstance.getChannel().isMarkedForInstrumentation()) {
                this.logger.warn(
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
        //TODO: change for efficient map
        HashMap<Long, Float> initialRanks = new HashMap<>();
        degrees.forEach( (k, v) -> {
            initialRanks.putIfAbsent(k, initialRank);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java
            //TODO: change for efficient map
            HashMap<Long, Float> newRanks = new HashMap<Long, Float>(currentRanks.size());
            degrees.forEach( (k, v) -> {
                newRanks.putIfAbsent(k, dampingRank);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
        .stream()
        .forEach(
          entry -> {
            insertType(entry.getValue()).accept(entry.getKey(), entry.getValue());
          }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plugin/DynamicPlugin.java`
#### Snippet
```java

                // Properties.
                DynamicPlugin.<Map<String, Object>>ifPresent(values.get("properties"), Map.class, properties -> {
                    properties.forEach(plugin::addProperty);
                });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            // Get input operators associated with input junctions
            inputJunction
                    .forEach((Junction j) -> {
                        inputOperators.add(j.getSourceOperator());
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/SampleMapping.java`
#### Snippet
```java
        return new ReplacementSubplanFactory.OfSingleOperators<SampleOperator>(
                (matchedOperator, epoch) -> {
                    return new FlinkSampleOperator<>(matchedOperator);
                }
        );
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
            public void mapPartition(Iterable<I> iterable, Collector<O> collector) throws Exception {
                function.apply(iterable).forEach(
                        element -> {
                            collector.collect(element);
                        }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCartesianOperator.java`
#### Snippet
```java
        final DataSet<Tuple2<InputType0, InputType1>> datasetOutput = dataSetInput0.cross(dataSetInput1).with(
                (dataInput0, dataInput1) -> {
                    return new Tuple2<>(dataInput0, dataInput1);
                }
        ).returns(ReflectionUtils.specify(Tuple2.class));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
                case ANY:
                    Random rand = new Random(seed);
                    dataSetOutput = dataSetInput.filter(a -> {return rand.nextBoolean();}).first(sampleSize);
                    break;
                case BERNOULLI:
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/PythonAPI.java`
#### Snippet
```java
public class PythonAPI {

    public void empty(){

    }
```

### EmptyMethod
The method is empty
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Slot.java`
#### Snippet
```java
     */
    @Deprecated
    public void setCardinalityEstimate(CardinalityEstimate cardinalityEstimate) {
//        boolean isUpdate = this.cardinalityEstimate == null || !this.cardinalityEstimate.equals(cardinalityEstimate);
//        if (isUpdate) {
```

### EmptyMethod
The method is empty
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
        return new BlockInfo();
    }
    protected void complementBlockInfo(BlockInfo blockInfo) {}
}

```

### EmptyMethod
The method is empty
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/platform/GiraphPlatform.java`
#### Snippet
```java
     * Initializes this instance.
     */
    private void initialize() {

    }
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `src/main/script/prerequisiteCheck.groovy`
#### Snippet
```java
allConditionsMet = true

baseDirectory = project.model.pomFile.parent

/*
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/channels/SqlQueryChannel.java`
#### Snippet
```java
    public class Instance extends AbstractChannelInstance {

        private String sqlQuery = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/platform/JdbcPlatformTemplate.java`
#### Snippet
```java
    }

    private Connection connection = null;

    protected JdbcPlatformTemplate(String platformName, String configName) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/platform/JavaPlatform.java`
#### Snippet
```java
    private static final String DEFAULT_CONFIG_FILE = "wayang-java-defaults.properties";

    private static JavaPlatform instance = null;

    public static JavaPlatform getInstance() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/channels/StreamChannel.java`
#### Snippet
```java
        // detect, when the cardinality is 0 because the #stream has not been fully executed for whatever reason).
        // However, this would require to call Stream#close() on all methods.
        private long cardinality = 0;

        public Instance(Executor executor, OptimizationContext.OperatorContext producerOperatorContext, int producerOutputIndex) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java

            ((StreamChannel.Instance) outputs[0]).accept(((JavaChannelInstance) inputs[0]).<Type>provideStream().filter(new Predicate<Type>() {
                        int streamIndex = 0;
                        int sampleIndex = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java
            ((StreamChannel.Instance) outputs[0]).accept(((JavaChannelInstance) inputs[0]).<Type>provideStream().filter(new Predicate<Type>() {
                        int streamIndex = 0;
                        int sampleIndex = 0;

                @Override
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
        private int nextIndex;

        private long numPushedObjects = 0L;

        public StreamChunker(int chunkSize, BiConsumer<Object[], Integer> action) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/platform/Sqlite3Platform.java`
#### Snippet
```java
    private static final String CONFIG_NAME = "sqlite3";

    private static Sqlite3Platform instance = null;

    public static Sqlite3Platform getInstance() {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
     * The measured time in milliseconds.
     */
    private long millis = 0L;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/platform/PostgresPlatform.java`
#### Snippet
```java
    private static final String CONFIG_NAME = "postgres";

    private static PostgresPlatform instance = null;

    public static PostgresPlatform getInstance() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
    private final Map<Slot<?>, Slot<?>> upstreamMapping = new HashMap<>();

    private Map<Slot<?>, Collection> downstreamMapping = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/WayangPlan.java`
#### Snippet
```java
    private boolean isLoopsIsolated = false;

    private boolean isPruned = false;


```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/WayangPlan.java`
#### Snippet
```java
    private final Collection<Operator> sinks = new LinkedList<>();

    private boolean isLoopsIsolated = false;

    private boolean isPruned = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
    private Predicate<CompositeOperator> compositeRelevanceCondition = compositeOperator -> false;

    private Callback traversalCallback = null;

    private Predicate<OutputSlot<?>> outputFollowPredicate = outputSlot -> true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
     * Flag whether this instance should be instrumented to detect its actual cardinality.
     */
    private boolean isMarkedForInstrumentation = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
     * Whether new writes can occur.
     */
    private boolean isWriteFinished = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
    private final Iterator<T> iterator = new Iterator<T>() {

        private boolean isInitialized = false;

        private T next;
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/LimitedInputStream.java`
#### Snippet
```java
    private final InputStream wrappedInputStream;

    private long numReadBytes = 0L;

    private final long maxReadBytes;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/AbstractReferenceCountable.java`
#### Snippet
```java
     * @see #disposeIfUnreferenced()
     */
    private boolean isDisposed = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/AbstractReferenceCountable.java`
#### Snippet
```java
     * Maintains the number of references on this object.
     */
    private int numReferences = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
     * Tells whether this instance is auxiliary, i.e., it support some non-auxiliary operators.
     */
    private boolean isAuxiliary = false;

    private int epoch = FIRST_EPOCH;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/HadoopFileSystem.java`
#### Snippet
```java
     * Tells whether the necessary setup for this {@link FileSystem} has been performed.
     */
    private boolean isInitialized = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * <i>Lazily initialized.</i> {@link Platform} restrictions coming from the matched {@link Operator}s.
     */
    private Optional<Set<Platform>> targetPlatforms = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
    private final SubplanPattern pattern;

    private boolean isReplacing = false;

    private final ReplacementSubplanFactory replacementFactory;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/Junction.java`
#### Snippet
```java
    private final Collection<ExecutionTask> conversionTasks = new LinkedList<>();

    private TimeEstimate timeEstimateCache = null;

    public Junction(OutputSlot<?> sourceOutput, List<InputSlot<?>> targetInputs, List<OptimizationContext> optimizationContexts) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AbstractChannelInstance.java`
#### Snippet
```java
    private OptionalLong measuredCardinality = OptionalLong.empty();

    private boolean wasProduced = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/lineage/LazyExecutionLineageNode.java`
#### Snippet
```java
    private final Collection<ChannelInstance> pinnedDownChannelInstances = new LinkedList<>();

    private boolean isExecuted = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0d` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
         * The sum of the costs of all {@link TreeEdge}s of this instance.
         */
        private double costs = 0d;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
         * Caches the result of {@link #getJunction()}.
         */
        private Junction result = null;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java

    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;

    public ReaderIterator(DataInputStream stream) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
public class ReaderIterator <Output> implements Iterator<Output> {

    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
```

### RedundantFieldInitialization
Field initialization to `0d` is redundant
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Variable.java`
#### Snippet
```java
    private final int index;

    private double minValue = 0d, maxValue = Double.POSITIVE_INFINITY;

    public Variable(int index, String id) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/OptimizationSpace.java`
#### Snippet
```java
    private final List<Variable> variableVector = new ArrayList<>();

    private int numDimensions = 0;
    
    public Variable getOrCreateVariable(String id) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
        private final PlanEnumeration[] activationCollector;

        protected boolean wasExecuted = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
        private final OutputSlot<?> outputSlot;

        protected boolean wasExecuted = false;

        /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * The parallel cost estimate . This will store both calculated squashed cost and cost that will be used to select the best enumerated plan!
     */
    private Tuple<List<ProbabilisticDoubleInterval>, List<Double>> parallelCostEstimateCache = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java

    double stepSize = 1;
    double regulizer = 0;

    public WeightsUpdate() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
     * does not hold a counted reference, so it might be disposed.
     */
    private FlinkContextReference flinkContextReference = null;

    private Logger logger = LogManager.getLogger(this.getClass());
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
    public static final String INITIALIZATION_MS_CONFIG_KEY = "wayang.flink.init.ms";

    private static FlinkPlatform instance = null;

    private static final String[] REQUIRED_FLINK_PROPERTIES = {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    private int iterationCounter = 0;

    private int iteration_generate = 0;

    private int iteration_expanded = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    private int iteration_generate = 0;

    private int iteration_expanded = 0;

    int real_iteration;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
     * Keeps track of the current iteration number.
     */
    private int iterationCounter = 0;

    private int iteration_generate = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java
    public static final String INITIALIZATION_MS_CONFIG_KEY = "wayang.spark.init.ms";

    private static SparkPlatform instance = null;

    private static final String[] REQUIRED_SPARK_PROPERTIES = {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkExecutor.java`
#### Snippet
```java
     * Counts the number of issued Spark actions.
     */
    private int numActions = 0;

    public SparkExecutor(SparkPlatform platform, Job job) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
    private Random rand;

    private int partitionID = 0;
    private int tupleID = 0;
    private int nb_partitions = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
    private int partitionID = 0;
    private int tupleID = 0;
    private int nb_partitions = 0;
    private List<Integer> partitions;
    private JavaRDD<Type> shuffledRDD;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java

    private int partitionID = 0;
    private int tupleID = 0;
    private int nb_partitions = 0;
    private List<Integer> partitions;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
    private int nb_partitions = 0;

    private int partitionSize = 0;

    private boolean first = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
    private Random rand;

    private int nb_partitions = 0;

    private int partitionSize = 0;
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ElementaryOperator`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java
 * This source takes as input a Java {@link java.util.Collection}.
 */
public class CollectionSource<T> extends UnarySource<T> implements ElementaryOperator {

    protected final Collection<T> collection;
```

### RedundantImplements
Redundant interface declaration `AutoCloseable`
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
    }

    private static class SequenceFileIterator<T> implements Iterator<T>, AutoCloseable, Closeable {

        private SequenceFile.Reader sequenceFileReader;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/OutputFormatConsumer.java`
#### Snippet
```java
 * Wrapper for {@Link OutputFormat}
 */
public class OutputFormatConsumer<T> implements OutputFormat<T>, Serializable {

    private ConsumerDescriptor.SerializableConsumer<T> tConsumer;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/KeySelectorDistinct.java`
#### Snippet
```java
 * Wrapper for {@Link KeySelector}
 */
public class KeySelectorDistinct<T> implements KeySelector<T, String>, Serializable {

    public String getKey(T value){
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/KeySelectorFunction.java`
#### Snippet
```java
 * Wrapper for {@Link KeySelector}
 */
public class KeySelectorFunction<T, K> implements KeySelector<T, K>, ResultTypeQueryable<K>, Serializable {

    public Function<T, K> impl;
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java
 */
public class WayangConvergenceCriterion<T>
        implements ConvergenceCriterion<WayangListValue>, Serializable {

    private boolean doWhile;
```

### RedundantImplements
Redundant interface declaration `InitializeOnMaster`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
 * Wrapper for {@link FileOutputFormat}
 */
public class WayangFileOutputFormat<IT> extends FileOutputFormat<IT> implements InitializeOnMaster, CleanupWhenUnsuccessful {

    private static final long serialVersionUID = 1L;
```

### RedundantImplements
Redundant interface declaration `CleanupWhenUnsuccessful`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
 * Wrapper for {@link FileOutputFormat}
 */
public class WayangFileOutputFormat<IT> extends FileOutputFormat<IT> implements InitializeOnMaster, CleanupWhenUnsuccessful {

    private static final long serialVersionUID = 1L;
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/ValueProvider.java`
#### Snippet
```java
        }

        throw new NotAvailableException(String.format("Could not provide value."));
    }

```

### RedundantStringFormatCall
Redundant call to `printf()`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        }
        long endWriteTime = System.nanoTime();
        System.out.printf("done.");

        System.out.printf("Writing %d MB to %s completed in %s.\n",
```

### RedundantStringFormatCall
Redundant call to `format()`
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java
    long after = System.currentTimeMillis();
    System.out.println(
      String.format(
        "the platform %s took %f s",
        platform,
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
      final List<Pair<ColumnMetaData.Rep, Integer>> list) {
    ColumnMetaData.Rep[] reps =
        Pair.left(list).toArray(new ColumnMetaData.Rep[0]);
    int[] types = Ints.toArray(Pair.right(list));
    return resultSet -> new ObjectArrayRowBuilder1(resultSet, reps, types);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
      final List<Pair<ColumnMetaData.Rep, Integer>> list) {
    ColumnMetaData.Rep[] reps =
        Pair.left(list).toArray(new ColumnMetaData.Rep[0]);
    int[] types = Ints.toArray(Pair.right(list));
    return resultSet -> new ObjectArrayRowBuilder2(resultSet, reps, types);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java
            }

            return new Record(projectedRecord.toArray(new Object[0]));
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/DefaultCardinalityEstimator.java`
#### Snippet
```java

        if (this.numInputs == 0) {
            final long estimate = this.singlePointEstimator.applyAsLong(new long[0], optimizationContext.getConfiguration());
            return new CardinalityEstimate(estimate, estimate, this.certaintyProb);
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/SinkProfiler.java`
#### Snippet
```java
        this.evaluate(
                new JavaChannelInstance[]{this.inputChannelInstance},
                new JavaChannelInstance[]{}
        );
        return 0L;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/SourceProfiler.java`
#### Snippet
```java
    protected long executeOperator() {
        this.evaluate(
                new JavaChannelInstance[]{},
                new JavaChannelInstance[]{this.outputChannelInstance}
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SinkProfiler.java`
#### Snippet
```java
                this.operator,
                new ChannelInstance[]{inputChannelInstance},
                new ChannelInstance[]{}
        );

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkSourceProfiler.java`
#### Snippet
```java
        this.evaluate(
                this.operator,
                new ChannelInstance[]{},
                new ChannelInstance[]{outputChannelInstance}
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
        }

        return jars.toArray(new String[0]);
    }
}
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `removeAll()` recurses infinitely, and can only end by throwing an exception
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.removeAll(c);
    }
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Type parameter `C` explicitly extends 'java.lang.Object'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
  }

  @Override public <C extends Object> @Nullable C unwrap(Class<C> aClass) {
    if (aClass.isInstance(jdbcSchema.getDataSource())) {
      return aClass.cast(jdbcSchema.getDataSource());
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkCollectionSourceProfiler.java`
#### Snippet
```java
    private final ArrayList<Object> collection;

    public <T extends Object> SparkCollectionSourceProfiler(Configuration configuration,
                                             Supplier<T> dataQuantumGenerator,
                                             DataSetType<T> outputType) {
```

### TypeParameterExtendsObject
Type parameter `T` explicitly extends 'java.lang.Object'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkCollectionSourceProfiler.java`
#### Snippet
```java
    }

    private <T extends Object> SparkCollectionSourceProfiler(ArrayList<T> collection,
                                                             Configuration configuration,
                                                             Supplier<T> dataQuantumGenerator,
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `this.owner == null` is always `false`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Slot.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.format("%s@%s", this.name, this.owner == null ? "no owner" : this.owner.toString());
    }

```

### ConstantValue
Condition `output2 != null` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
            if ((output1 == null && output2 != null) ||
                    (output1 != null && output2 == null) ||
                    (output1 != null && output2 != null && !output1.getType().equals(output2.getType()))) {
                throw new IllegalArgumentException("Operators differ in output " + i + ".");
            }
```

### ConstantValue
Condition `input2 != null` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
            if ((input1 == null && input2 != null) ||
                    (input1 != null && input2 == null) ||
                    (input1 != null && input2 != null && !input1.getType().equals(input2.getType()))) {
                throw new IllegalArgumentException("Operators differ in input " + i + ".");
            }
```

### ConstantValue
Value `fromOutputSlot` is always 'null'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
    public Return visit(Subplan subplan, OutputSlot<?> fromOutputSlot, Payload payload) {
        if (fromOutputSlot == null) {
            return subplan.getSink().accept(this, fromOutputSlot, payload);
        } else {
            final OutputSlot<Object> innerOutputSlot = subplan.traceOutput(fromOutputSlot).unchecked();
```

### ConstantValue
Condition `isFetchNext` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java

                    // If the Iterator had made a full pass or this is the very first iteration.
                    if (isFetchNext) {
                        isFetchNext = isFullPass || this.vals.get(i) == null;
                        this.vals.set(i, partialIterator.next());
```

### ConstantValue
Condition `this.numInputs == UNSPECIFIED_NUM_SLOTS` is always `false` when reached
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/DefaultLoadEstimator.java`
#### Snippet
```java
        final CardinalityEstimate[] inputEstimates = context.getInputCardinalities();
        final CardinalityEstimate[] outputEstimates = context.getOutputCardinalities();
        Validate.isTrue(inputEstimates.length >= this.numInputs || this.numInputs == UNSPECIFIED_NUM_SLOTS,
                "Received %d input estimates, require %d.", inputEstimates.length, this.numInputs);
        Validate.isTrue(outputEstimates.length == this.numOutputs || this.numOutputs == UNSPECIFIED_NUM_SLOTS,
```

### ConstantValue
Condition `this.numInputs == UNSPECIFIED_NUM_SLOTS` is always `false` when reached
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/IntervalLoadEstimator.java`
#### Snippet
```java
        final CardinalityEstimate[] inputEstimates = context.getInputCardinalities();
        final CardinalityEstimate[] outputEstimates = context.getOutputCardinalities();
        Validate.isTrue(inputEstimates.length >= this.numInputs || this.numInputs == UNSPECIFIED_NUM_SLOTS,
                "Received %d input estimates, require %d.", inputEstimates.length, this.numInputs);
        Validate.isTrue(outputEstimates.length == this.numOutputs || this.numOutputs == UNSPECIFIED_NUM_SLOTS,
```

### ConstantValue
Condition `lowerEstimate == -1` is always `false`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/IntervalLoadEstimator.java`
#### Snippet
```java
                        outputEstimateCombinations[outputEstimateId]
                ), 0);
                if (lowerEstimate == -1 || estimate < lowerEstimate) {
                    lowerEstimate = estimate;
                }
```

### ConstantValue
Condition `upperEstimate == -1` is always `false`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/IntervalLoadEstimator.java`
#### Snippet
```java
                    lowerEstimate = estimate;
                }
                if (upperEstimate == -1 || estimate > upperEstimate) {
                    upperEstimate = estimate;
                }
```

### ConstantValue
Condition `servedInput != null` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java

            // Update the ConcatenationActivator for this OutputSlot.
            if (servedInput != null) {
                final ConcatenationActivator concatenationActivator = this.getOrCreateConcatenationActivator(output, optimizationCtx);
                concatenationActivator.updateBaseEnumeration(processedEnumeration);
```

### ConstantValue
Condition `execOpOutputsWithContext != null` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
            final Tuple<OutputSlot<?>, PlanImplementation> execOpOutputWithCtx =
                    WayangCollections.getSingleOrNull(execOpOutputsWithContext);
            assert execOpOutputsWithContext != null && !execOpOutputsWithContext.isEmpty()
                    : String.format("No outputs found for %s.", output);

```

### ConstantValue
Condition `execOpOutputsWithContext != null` is always `true`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                final Tuple<OutputSlot<?>, PlanImplementation> execOpOutputWithCtx =
                        WayangCollections.getSingleOrNull(execOpOutputsWithContext);
                assert execOpOutputsWithContext != null : String.format("No outputs found for %s.", output);
                execOutput = execOpOutputWithCtx.field0;
                execOutputPlanImplementation = execOpOutputWithCtx.field1;
```

### ConstantValue
Condition `this.getSampleSize(operatorContext) >= size` is always `false`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
        long seed = this.getSeed(operatorContext);

        if(this.getSampleSize(operatorContext) >= size){
            dataSetOutput = dataSetInput;
        }else {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/execution/JdbcExecutor.java`
#### Snippet
```java
    private void saveResult(FileChannel.Instance outputFileChannelInstance, ResultSet rs) throws IOException, SQLException {
        // Output results.
        final FileSystem outFs = FileSystems.getFileSystem(outputFileChannelInstance.getSinglePath()).get();
        try (final OutputStreamWriter writer = new OutputStreamWriter(outFs.create(outputFileChannelInstance.getSinglePath()))) {
            while (rs.next()) {
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java

    public double getDoubleProperty(String key) {
        return this.getOptionalDoubleProperty(key).getAsDouble();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java

    public boolean getBooleanProperty(String key) {
        return this.getOptionalBooleanProperty(key).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
    protected void copyNames(SubplanMatch subplanMatch, Operator replacementSubplan) {
        if (subplanMatch.getOperatorMatches().size() == 1) {
            final OperatorMatch operatorMatch = subplanMatch.getOperatorMatches().values().stream().findAny().get();
            final Operator operator = operatorMatch.getOperator();
            String operatorName;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
        this.progressUrl = path + "/progress.json";

        final FileSystem execplanFile = FileSystems.getFileSystem(exPlanUrl).get();
        try (final OutputStreamWriter writer = new OutputStreamWriter(execplanFile.create(exPlanUrl, true))) {
            HashMap<String, Object> jsonPlanMap = new HashMap<>();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
            overall = overall/this.progress.size();

        final FileSystem progressFile = FileSystems.getFileSystem(progressUrl).get();
        try (final OutputStreamWriter writer = new OutputStreamWriter(progressFile.create(progressUrl, true))) {
            progressBar.put("overall", overall);
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimatorManager.java`
#### Snippet
```java

        // Obtain cardinality measurement.
        final long cardinality = channelInstance.getMeasuredCardinality().getAsLong();

        // Try to inject into the WayangPlan Operator output.
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
                }

                long minExecTime = group.stream().mapToLong(PartialExecution::getMeasuredExecutionTime).min().getAsLong();
                long maxExecTime = group.stream().mapToLong(PartialExecution::getMeasuredExecutionTime).max().getAsLong();
                if (maxExecTime - minExecTime < 1000) {
```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java

                long minExecTime = group.stream().mapToLong(PartialExecution::getMeasuredExecutionTime).min().getAsLong();
                long maxExecTime = group.stream().mapToLong(PartialExecution::getMeasuredExecutionTime).max().getAsLong();
                if (maxExecTime - minExecTime < 1000) {
                    System.out.printf("Narrow training data for %s\n", templateKeys);
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `initDefaultsFromConfiguration()` tries to override a static method of a superclass
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
     * @param configuration The configuration to load defaults from
     */
    public static void initDefaultsFromConfiguration(Configuration configuration) {

        DEFAULT_WRITE_MODE = FileSystem.WriteMode.OVERWRITE ;
```

## RuleId[id=IOResource]
### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
                    return;
                }
                Object tmp = new ObjectInputStream(new ByteArrayInputStream(this.bytesWritable.getBytes())).readObject();
                if(tmp instanceof Collection) {
                    this.nextElements = null;
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java
                try {
                    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    final ObjectOutputStream oos = new ObjectOutputStream(bos);
                    oos.writeObject(chunk);
                    BytesWritable bytesWritable = new BytesWritable(bos.toByteArray());
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/KeySelectorDistinct.java`
#### Snippet
```java
        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ObjectOutputStream objStream = new ObjectOutputStream(b);
            objStream.writeObject(value);
            return Base64.getEncoder().encodeToString(b.toByteArray());
```

### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
        try{
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ObjectOutputStream objStream = new ObjectOutputStream(b);
            objStream.writeObject(record);
            BytesWritable bytesWritable = new BytesWritable(b.toByteArray());
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSource.java`
#### Snippet
```java
                            @Override
                            public void flatMap(org.apache.flink.api.java.tuple.Tuple2<NullWritable, BytesWritable> value, Collector<Tuple2> out) throws Exception {
                                Object tmp = new ObjectInputStream(new ByteArrayInputStream(value.f1.getBytes())).readObject();
                                for(Object element: (Iterable)tmp){
                                    out.collect((Tuple2) element);
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
    public OptionalDouble getOptionalDoubleProperty(String key) {
        final Optional<String> optionalDouble = this.properties.optionallyProvideFor(key);
        if (optionalDouble.isPresent()) {
            return OptionalDouble.of(Double.valueOf(optionalDouble.get()));
        } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
                                Optional<String> optInstrumentationtStrategyClass =
                                        requestee.getConfiguration().getOptionalStringProperty("wayang.core.optimizer.instrumentation");
                                if (!optInstrumentationtStrategyClass.isPresent()) {
                                    return null;
                                }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
    public OptionalLong getOptionalLongProperty(String key) {
        final Optional<String> longValue = this.properties.optionallyProvideFor(key);
        if (longValue.isPresent()) {
            return OptionalLong.of(Long.valueOf(longValue.get()));
        } else {
```

## RuleId[id=Java8MapForEach]
### Java8MapForEach
Can be replaced with 'Map.forEach()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Counter.java`
#### Snippet
```java

    private void addAll(Map<T, Integer> counts) {
        counts.entrySet().forEach(count -> this.add(count.getKey(), count.getValue()));
    }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/channels/ChannelConversions.java`
#### Snippet
```java
 * {@link ChannelConversion}s for the {@link GiraphPlatform}.
 */
public class ChannelConversions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Giraph` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Giraph.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Giraph {
    private final static GiraphPlugin PLUGIN = new GiraphPlugin();

```

### UtilityClassWithoutPrivateConstructor
Class `PageRankParameters` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java
 * Parameters for Basic PageRank implementation.
 */
public class PageRankParameters {

    public enum PageRankEnum{
```

### UtilityClassWithoutPrivateConstructor
Class `WayangBasics` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/WayangBasics.java`
#### Snippet
```java
 * Register for plugins in the module.
 */
public class WayangBasics {

    private static final WayangBasic DEFAULT_PLUGIN = new WayangBasic();
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/mapping/Mappings.java`
#### Snippet
```java
 * Register for the components provided in the basic plugin.
 */
public class Mappings {

    public static Collection<Mapping> BASIC_MAPPINGS = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/mappings/Mappings.java`
#### Snippet
```java
 * Register for {@link Mapping}s for this platform.
 */
public class Mappings {

    public static final Collection<Mapping> ALL = Collections.singletonList(
```

### UtilityClassWithoutPrivateConstructor
Class `PrintUtils` has only 'static' members, and lacks a 'private' constructor
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
import java.util.Collection;

public class PrintUtils {

    public static void print(String header, WayangPlan plan) {
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaUtils` has only 'static' members, and lacks a 'private' constructor
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/schema/SchemaUtils.java`
#### Snippet
```java
 * TODO: Automatically create calcite schema based on user provided configurations of table sources
 */
public class SchemaUtils {

    private static Properties getPostgresProperties() {
```

### UtilityClassWithoutPrivateConstructor
Class `CsvRowConverter` has only 'static' members, and lacks a 'private' constructor
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
 *
 */
public class CsvRowConverter {


```

### UtilityClassWithoutPrivateConstructor
Class `Java` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/Java.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Java {

    private final static JavaBasicPlugin PLUGIN = new JavaBasicPlugin();
```

### UtilityClassWithoutPrivateConstructor
Class `ConfigProperties` has only 'static' members, and lacks a 'private' constructor
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/optimizer/Optimizer.java`
#### Snippet
```java


    public static class ConfigProperties {

        public static Properties getDefaults() {
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/Mappings.java`
#### Snippet
```java
 * Register for {@link Mapping}s for this platform.
 */
public class Mappings {

    public static Collection<Mapping> BASIC_MAPPINGS = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/channels/ChannelConversions.java`
#### Snippet
```java
 * {@link ChannelConversion}s for the {@link JavaPlatform}.
 */
public class ChannelConversions {

    public static final ChannelConversion STREAM_TO_COLLECTION = new DefaultChannelConversion(
```

### UtilityClassWithoutPrivateConstructor
Class `GraphChi` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/GraphChi.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class GraphChi {

    private final static GraphChiPlugin PLUGIN = new GraphChiPlugin();
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/channels/ChannelConversions.java`
#### Snippet
```java
 * {@link ChannelConversion}s for the {@link GraphChiPlatform}.
 */
public class ChannelConversions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/mappings/Mappings.java`
#### Snippet
```java
 * Register for {@link Mapping}s for this platform.
 */
public class Mappings {

    public static final Collection<Mapping> ALL = Collections.singletonList(
```

### UtilityClassWithoutPrivateConstructor
Class `Sqlite3` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/Sqlite3.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Sqlite3 {

    private final static Sqlite3Plugin PLUGIN = new Sqlite3Plugin();
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/channels/ChannelConversions.java`
#### Snippet
```java
 * Register for the {@link ChannelConversion}s supported for this platform.
 */
public class ChannelConversions {

    public static final ChannelConversion SQL_TO_STREAM_CONVERSION = new DefaultChannelConversion(
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/mapping/Mappings.java`
#### Snippet
```java
 * Register for the {@link Mapping}s supported for this platform.
 */
public class Mappings {

    public static final Collection<Mapping> ALL = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `Postgres` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/Postgres.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Postgres {

    private final static PostgresPlugin PLUGIN = new PostgresPlugin();
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/mapping/Mappings.java`
#### Snippet
```java
 * Register for the {@link Mapping}s supported for this platform.
 */
public class Mappings {

    public static final Collection<Mapping> ALL = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/channels/ChannelConversions.java`
#### Snippet
```java
 * Register for the {@link ChannelConversion}s supported for this platform.
 */
public class ChannelConversions {

    public static final ChannelConversion SQL_TO_STREAM_CONVERSION = new DefaultChannelConversion(
```

### UtilityClassWithoutPrivateConstructor
Class `Operators` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operators.java`
#### Snippet
```java
 * Utility class for {@link Operator}s.
 */
public class Operators {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorContainers` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
 * Utilities to deal with {@link OperatorContainer}s.
 */
public class OperatorContainers {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Iterators` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Iterators.java`
#### Snippet
```java
 * Utilities for the work with {@link Iterator}s.
 */
public class Iterators {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Formats` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
 * Formats different general purpose objects.
 */
public class Formats {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Actions` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Actions.java`
#### Snippet
```java
 * Utilities to perform actions.
 */
public class Actions {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileUtils.java`
#### Snippet
```java
import java.util.stream.StreamSupport;

public class FileUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `JsonSerializables` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JsonSerializables.java`
#### Snippet
```java
 * Utility to deal with {@link JsonSerializable}s.
 */
public class JsonSerializables {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
 * Utilities for reflection code.
 */
public class ReflectionUtils {

    private static final Logger logger = LogManager.getLogger(ReflectionUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `OptimizationUtils` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationUtils.java`
#### Snippet
```java
 * Utility methods for the optimization process.
 */
public class OptimizationUtils {

//    private static final Logger logger = LoggerFactory.getLogger(OptimizationUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ProfileDBs` has only 'static' members, and lacks a 'private' constructor
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ProfileDBs.java`
#### Snippet
```java
 * Utilities to work with {@link ProfileDB}s.
 */
public class ProfileDBs {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `DynamicLoadProfileEstimators` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadProfileEstimators.java`
#### Snippet
```java
 * Utility to create {@link DynamicLoadProfileEstimator}s.
 */
public class DynamicLoadProfileEstimators {

    private static final Logger logger = LogManager.getLogger(DynamicLoadProfileEstimators.class);
```

### UtilityClassWithoutPrivateConstructor
Class `DataGenerators` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/data/DataGenerators.java`
#### Snippet
```java
 * Utility to create common data generators.
 */
public class DataGenerators {

    private static final String[] CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".split("");
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
 * Starts a profiling run of Spark.
 */
public class Main {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `Profiler` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
 * Utility to support finding reasonable {@link LoadProfileEstimator}s for {@link JavaExecutionOperator}s.
 */
public class Profiler {

    private static final int GC_RUNS = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `Random16` has only 'static' members, and lacks a 'private' constructor
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Random16.java`
#### Snippet
```java
 * code copied from <a href="https://github.com/apache/hadoop/blob/trunk/hadoop-mapreduce-project/hadoop-mapreduce-examples/src/main/java/org/apache/hadoop/examples/terasort/Random16.java">Terasort Example</a>
 */
class Random16 {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
 * Main class for the TPC-H app based on Apache Wayang (incubating).
 */
public class Main {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/Mappings.java`
#### Snippet
```java
 * {@link Mapping}s for the {@link IEJoinOperator}.
 */
public class Mappings {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `IEJoin` has only 'static' members, and lacks a 'private' constructor
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/IEJoin.java`
#### Snippet
```java
 * Provides {@link Plugin}s that enable usage of the {@link IEJoinOperator} and the {@link IESelfJoinOperator}.
 */
public class IEJoin {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
 * Example Apache Wayang (incubating) App that does a word count -- the Hello World of Map/Reduce-like systems.
 */
public class Main {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `IEJoinMasterOperator` has only 'static' members, and lacks a 'private' constructor
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
 * This operator decides the correct sorting orders for IEJoin
 */
public class IEJoinMasterOperator {
    public static Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean> getSortOrders(JoinCondition cond0, JoinCondition cond1) {
        boolean list1ASC = false;
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorProfilers` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/OperatorProfilers.java`
#### Snippet
```java
 * Utilities to create {@link OperatorProfiler} instances.
 */
public class OperatorProfilers {

    public static JavaTextFileSourceProfiler createJavaTextFileSourceProfiler() {
```

### UtilityClassWithoutPrivateConstructor
Class `myMergeSort` has only 'static' members, and lacks a 'private' constructor
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
 * Created by khayyzy on 5/28/16.
 */
public class myMergeSort<Type0 extends Comparable<Type0>, Type1 extends Comparable<Type1>> {
    private static final int INSERTIONSORT_THRESHOLD = 7;

```

### UtilityClassWithoutPrivateConstructor
Class `Flink` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/Flink.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Flink {

    private final static FlinkBasicPlugin PLUGIN = new FlinkBasicPlugin();
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/Mappings.java`
#### Snippet
```java
 * Register for {@link Mapping}s for this platform.
 */
public class Mappings {

    public static Collection<Mapping> BASIC_MAPPINGS = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/channels/ChannelConversions.java`
#### Snippet
```java
 * {@link ChannelConversion}s used by the {@link FlinkPlatform}.
 */
public class ChannelConversions {

        public static final ChannelConversion COLLECTION_TO_DATASET = new DefaultChannelConversion(
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorProfilers` has only 'static' members, and lacks a 'private' constructor
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/OperatorProfilers.java`
#### Snippet
```java
 * Utilities to create {@link SparkOperatorProfiler} instances.
 */
public class OperatorProfilers {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Spark` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/Spark.java`
#### Snippet
```java
 * Register for relevant components of this module.
 */
public class Spark {

    private final static SparkBasicPlugin PLUGIN = new SparkBasicPlugin();
```

### UtilityClassWithoutPrivateConstructor
Class `Mappings` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/Mappings.java`
#### Snippet
```java
 * Register for {@link Mapping}s for this platform.
 */
public class Mappings {

    public static Collection<Mapping> BASIC_MAPPINGS = Arrays.asList(
```

### UtilityClassWithoutPrivateConstructor
Class `ChannelConversions` has only 'static' members, and lacks a 'private' constructor
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/ChannelConversions.java`
#### Snippet
```java
 * {@link ChannelConversion}s used by the {@link JavaPlatform}.
 */
public class ChannelConversions {

    public static final ChannelConversion UNCACHED_RDD_TO_CACHED_RDD = new DefaultChannelConversion(
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Unboxing of `stack_iteration.peek()` may produce `NullPointerException`
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java
        switch (name){
            case ITERATION:
                return stack_iteration.peek();
            default:
                throw new WayangException("Parameter for PageRank not exist");
```

### DataFlowIssue
Method invocation `at` may produce `NullPointerException`
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/mapping/PageRankMapping.java`
#### Snippet
```java

        final LoopSubplan loopSubplan = LoopIsolator.isolate(loopHead);
        loopSubplan.at(epoch);

        return Subplan.wrap(
```

### DataFlowIssue
Method invocation `getConnection` may produce `NullPointerException`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
      Connection connection = null;
      try {
        connection = dataSource.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        SqlDialect dialect = dialectFactory.create(metaData);
```

### DataFlowIssue
Method invocation `create` may produce `NullPointerException`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
        connection = dataSource.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        SqlDialect dialect = dialectFactory.create(metaData);
        connection.close();
        connection = null;
```

### DataFlowIssue
Argument `rexLiteral.getValueAs(o.getClass())` might be null
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java

        private boolean isLessThan(Object o, RexLiteral rexLiteral) {
            return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) < 0;
        }

```

### DataFlowIssue
Argument `rexLiteral.getValueAs(o.getClass())` might be null
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        private boolean isGreaterThan(Object o, RexLiteral rexLiteral) {
//            return rexLiteral.getValue().compareTo(o)< 0;
            return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) > 0;

        }
```

### DataFlowIssue
Argument `rexLiteral.getValueAs(o.getClass())` might be null
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        private boolean isEqualTo(Object o, RexLiteral rexLiteral) {
            try {
                return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) == 0;
            } catch (Exception e) {
                throw new IllegalStateException("Predicate not supported yet");
```

### DataFlowIssue
Method invocation `getNumInputs` may produce `NullPointerException`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorContainers.java`
#### Snippet
```java
            else if (operator != output.getOwner()) return false;
        }
        return inputs.size() == operator.getNumInputs() && outputs.size() == operator.getNumOutputs();
    }

```

### DataFlowIssue
Method invocation `getOwner` may produce `NullPointerException`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Subplan.java`
#### Snippet
```java
                resolvedSlot == null || resolvedSlot.getOwner().getParent() == this,
                "Traced to %s to %s whose owner %s is contained in %s instead of %s.",
                subplanOutputSlot, resolvedSlot, resolvedSlot.getOwner(), resolvedSlot.getOwner().getContainer(), this
        );
        return resolvedSlot;
```

### DataFlowIssue
Argument `file.listFiles()` might be null
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java

    private boolean delete(File file) {
        boolean canDelete = !file.isDirectory() || Arrays.stream(file.listFiles()).allMatch(this::delete);
        return canDelete && file.delete();

```

### DataFlowIssue
Method invocation `getOwner` may produce `NullPointerException`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimatorManager.java`
#### Snippet
```java
        int outputIndex = wayangPlanOutput == null ? 0 : wayangPlanOutput.getIndex();
        OptimizationContext optimizationContext = channelInstance.getProducerOperatorContext().getOptimizationContext();
        final OptimizationContext.OperatorContext wayangPlanOperatorCtx = optimizationContext.getOperatorContext(wayangPlanOutput.getOwner());
        if (wayangPlanOperatorCtx != null) {
            this.injectMeasuredCardinality(cardinality, wayangPlanOperatorCtx, outputIndex);
```

### DataFlowIssue
Method invocation `getField0` may produce `NullPointerException`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java

            basePlanGroups.putSingle(
                    execOpOutputWithCtx.getField0(),
                    new Tuple<>(basePlanImplementation, execOpOutputWithCtx.getField1())
            );
```

### DataFlowIssue
Argument `value` might be null
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
        // This one will be altered, so make an instance copy.
        final LoopImplementation loopImplCopy =
                this.loopImplementations.compute(visitedLoop, (key, value) -> new LoopImplementation(value));

        // Find the original counterpart to loopImplCopy.
```

### DataFlowIssue
Dereference of `execOpOutputWithCtx` may produce `NullPointerException`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                        WayangCollections.getSingleOrNull(execOpOutputsWithContext);
                assert execOpOutputsWithContext != null : String.format("No outputs found for %s.", output);
                execOutput = execOpOutputWithCtx.field0;
                execOutputPlanImplementation = execOpOutputWithCtx.field1;
            }
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
        } else if (cond0 == JoinCondition.LessThanEqual) {//attSymbols.get(0) == "<=") {
            list1ASC = true;
            list2ASCSec = false;
        } else if (cond0 == JoinCondition.GreaterThan) {//attSymbols.get(0) == ">") {
            list1ASC = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
            list2ASCSec = false;
        } else if (cond0 == JoinCondition.GreaterThan) {//attSymbols.get(0) == ">") {
            list1ASC = false;
            list2ASCSec = false;
        } else if (cond0 == JoinCondition.GreaterThanEqual) {//(attSymbols.get(0) == ">=") {
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
        } else if (cond0 == JoinCondition.GreaterThan) {//attSymbols.get(0) == ">") {
            list1ASC = false;
            list2ASCSec = false;
        } else if (cond0 == JoinCondition.GreaterThanEqual) {//(attSymbols.get(0) == ">=") {
            list1ASC = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
            list2ASCSec = false;
        } else if (cond0 == JoinCondition.GreaterThanEqual) {//(attSymbols.get(0) == ">=") {
            list1ASC = false;
            list2ASCSec = true;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
        } else if (cond1 == JoinCondition.GreaterThanEqual) {//attSymbols.get(1) == ">=") {
            list2ASC = true;
            list1ASCSec = false;
        } else if (cond1 == JoinCondition.LessThan) {//attSymbols.get(1) == "<") {
            list2ASC = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
            list1ASCSec = false;
        } else if (cond1 == JoinCondition.LessThan) {//attSymbols.get(1) == "<") {
            list2ASC = false;
            list1ASCSec = false;
        } else if (cond1 == JoinCondition.LessThanEqual) {//attSymbols.get(1) == "<=") {
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
        } else if (cond1 == JoinCondition.LessThan) {//attSymbols.get(1) == "<") {
            list2ASC = false;
            list1ASCSec = false;
        } else if (cond1 == JoinCondition.LessThanEqual) {//attSymbols.get(1) == "<=") {
            list2ASC = false;
```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinMasterOperator.java`
#### Snippet
```java
            list1ASCSec = false;
        } else if (cond1 == JoinCondition.LessThanEqual) {//attSymbols.get(1) == "<=") {
            list2ASC = false;
            list1ASCSec = true;
        }
```

### DataFlowIssue
Method invocation `getConfiguration` may produce `NullPointerException`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
        }
        this.flinkEnviroment = flinkEnviroment;
        loadConfiguration( crossPlatformExecutor.getConfiguration(), parallelism );
    }

```

### DataFlowIssue
Dereference of `names` may produce `NullPointerException`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
                    .flatMap(richFunction)
                    .returns(this.functionDescriptor.getOutputType().getTypeClass())
                    .withBroadcastSet(names.field1, names.field0);

        }else {
```

### DataFlowIssue
Dereference of `names` may produce `NullPointerException`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapOperator.java`
#### Snippet
```java
                    .returns(this.getOutputType().getDataUnitType().getTypeClass())
                    .name(this.getName())
                    .withBroadcastSet(names.field1, names.field0)
            ;

```

### DataFlowIssue
Array index is out of bounds
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCollectionSource.java`
#### Snippet
```java
            collection = this.collection;
        } else {
            collection = ((CollectionChannel.Instance)inputs[0]).provideCollection();
        }

```

### DataFlowIssue
Dereference of `names` may produce `NullPointerException`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapPartitionsOperator.java`
#### Snippet
```java
            dataSetOutput = dataSetInput
                    .mapPartition(richFunction)
                    .withBroadcastSet(names.field1, names.field0)
                    .returns(class_output);

```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
            implements Serializable, java.util.Comparator<Data<Type0, Type1>> {

        private static final long serialVersionUID = 1L;

        boolean asc1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
     *
     */
    private static final long serialVersionUID = 2808795863775557984L;
    long rowID;
    Type0 value;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/DataComparator.java`
#### Snippet
```java
        implements Serializable, Comparator<Tuple2<Data<Type0, Type1>, Input>> {

    private static final long serialVersionUID = 1L;

    boolean asc1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/revDataComparator.java`
#### Snippet
```java
        implements Serializable, Comparator<Tuple2<Data<Type0, Type1>, Input>> {

    private static final long serialVersionUID = 1L;

    boolean asc1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/List2AttributesObjectSkinny.java`
#### Snippet
```java
     *
     */
    private static final long serialVersionUID = -7917020106773932879L;

    Data<Type0, Type1>[] list1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
public class revDataComparator implements Serializable, Comparator<Data> {

    private static final long serialVersionUID = 1L;

    boolean asc1;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
     *
     */
    private static final long serialVersionUID = 3834945091845558509L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
     *
     */
    private static final long serialVersionUID = 2953731260972596253L;

    boolean list1ASC;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
     *
     */
    private static final long serialVersionUID = 6703700898776377115L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
public class WayangFileOutputFormat<IT> extends FileOutputFormat<IT> implements InitializeOnMaster, CleanupWhenUnsuccessful {

    private static final long serialVersionUID = 1L;

    // --------------------------------------------------------------------------------------------
```

## RuleId[id=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java
    }

    private void updateMaturity(int index, double maturity) {
        maturity = 1d;
        this.maturity[index] = maturity;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'createGroupedReduce' is still used
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ReduceOperator.java`
#### Snippet
```java
     * @deprecated This method is just a hack that is necessary because of the ambiguous nature of this operator.
     */
    public static <Type> ReduceOperator<Type> createGroupedReduce(
            ReduceDescriptor<Type> reduceDescriptor,
            DataSetType<? extends Iterable<Type>> inputType,
```

### DeprecatedIsStillUsed
Deprecated member 'addSink' is still used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/WayangPlan.java`
#### Snippet
```java
     */
    @Deprecated
    public void addSink(Operator sink) {
        if (this.isLoopsIsolated || this.isPruned) {
            throw new IllegalStateException("Too late to add more sinks.");
```

### DeprecatedIsStillUsed
Deprecated member 'replace' is still used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
     * @deprecated use {@link #introduceAlternative(WayangPlan, SubplanMatch, Operator)}
     */
    private void replace(WayangPlan plan, SubplanMatch match, Operator replacement) {
        // Disconnect the original input operator and insert the replacement input operator.
        final Operator originalInputOperator = match.getInputMatch().getOperator();
```

### DeprecatedIsStillUsed
Deprecated member 'setLoadEstimators' is still used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/FunctionDescriptor.java`
#### Snippet
```java
     * @deprecated Use {@link #setLoadProfileEstimator(LoadProfileEstimator)} instead.
     */
    public void setLoadEstimators(LoadEstimator cpuEstimator, LoadEstimator ramEstimator) {
        this.setLoadProfileEstimator(new NestableLoadProfileEstimator(
                cpuEstimator,
```

### DeprecatedIsStillUsed
Deprecated member 'ExecutionTaskFlow' is still used
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlow.java`
#### Snippet
```java

    @Deprecated
    public ExecutionTaskFlow(Collection<ExecutionTask> sinkTasks, Set<Channel> inputChannels) {
        assert !sinkTasks.isEmpty() : "Cannot build plan without sinks.";
        this.sinkTasks = sinkTasks;
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
        long effectiveExecutionMillis = partialExecutions.stream()
                .map(PartialExecution::getMeasuredExecutionTime)
                .reduce(0L, (a, b) -> a + b);
        long measuredExecutionMillis = this.executionRound.getMillis();
        this.logger.info(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
                .flatMap(partialExecution -> partialExecution.getInvolvedPlatforms().stream())
                .map(platform -> this.configuration.getTimeToCostConverterProvider().provideFor(platform).getFixCosts())
                .reduce(0d, (a, b) -> a + b);
        double effectiveLowerCosts = fixCosts + partialExecutions.stream()
                .map(PartialExecution::getMeasuredLowerCost)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
        double effectiveLowerCosts = fixCosts + partialExecutions.stream()
                .map(PartialExecution::getMeasuredLowerCost)
                .reduce(0d, (a, b) -> a + b);
        double effectiveUpperCosts = fixCosts + partialExecutions.stream()
                .map(PartialExecution::getMeasuredUpperCost)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
        double effectiveUpperCosts = fixCosts + partialExecutions.stream()
                .map(PartialExecution::getMeasuredUpperCost)
                .reduce(0d, (a, b) -> a + b);
        this.logger.info("Accumulated costs: {} .. {}",
                String.format("%,.2f", effectiveLowerCosts),
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
                .filter(this.inputFollowPredicate)
                .map(InputSlot::getOccupant)
                .filter(outputSlot -> outputSlot != null)
                .forEach(outputSlot -> this.traverse(outputSlot.getOwner(), null, outputSlot));
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
                .map(outputSlot -> ((OutputSlot<Object>) outputSlot).getOccupiedSlots())
                .flatMap(Collection::stream)
                .filter(inputSlot -> inputSlot != null)
                .filter(this.inputFollowDownstreamPredicate)
                .forEach(inputSlot -> this.traverse(inputSlot.getOwner(), inputSlot, null));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    ObjectListing listing = this.getS3Client().listObjects(pair.getBucket(), pair.getKey());
    return listing.getObjectSummaries().stream()
        .map(obj -> obj.getKey())
        .collect(Collectors.toList());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PartialExecution.java`
#### Snippet
```java
                .sum();
        final TimeEstimate executionTime = this.atomicExecutionGroups.stream()
                .map(group -> group.estimateExecutionTime())
                .reduce(TimeEstimate.ZERO, TimeEstimate::plus);
        return executionTime.plus(platformInitializationTime);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        final long overallMeasuredTime = this.createPartialExecutionStream()
                .map(PartialExecution::getMeasuredExecutionTime)
                .reduce(0L, (a, b) -> a + b);
        System.out.printf("Found %d partial executions.\n", this.createPartialExecutionStream().count());
        System.out.printf("> Measured execution time: %s\n", Formats.formatDuration(overallMeasuredTime, true));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            final long platformInitializationTime = this.getUtilizedPlatforms().stream()
                    .map(platform -> this.optimizationContext.getConfiguration().getPlatformStartUpTimeProvider().provideFor(platform))
                    .reduce(0L, (a, b) -> a + b);
            timeEstimate = timeEstimate.plus(platformInitializationTime);
        }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
                    return out.iterator();
                }
                , true).reduce((input1, input2) -> Math.max(input1, input2));

        // Get unique ID for rdd1 & rdd2
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java
        // get partition ID for each List2AttributesObjectSkinny object
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD1Indexd = listObjectDataRDD1
                .keyBy(input -> input.getPartitionID());

        // get information on each List2AttributesObjectSkinny object
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIESelfJoinOperator.java`
#### Snippet
```java

        // Get row IDs in RDDs to be joined later
        r1RowIDS = inputRDD1UID.keyBy(in -> in._1());
        r2RowIDS = r1RowIDS;

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java
                .stream()
                .map(
                    wayangValue -> wayangValue.get()
                ).collect(
                    Collectors.toList()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
                    return out.iterator();
                }
                , true).reduce((input1, input2) -> Math.max(input1, input2));

        int partCount2 = rdd1.mapPartitions(input -> {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
                    return out.iterator();
                }
                , true).reduce((input1, input2) -> Math.max(input1, input2));

        // count starting point for rdd2
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        // get partition ID for each List2AttributesObjectSkinny object
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD1Indexd = listObjectDataRDD1
                .keyBy(in -> in.getPartitionID());
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD2Indexd = listObjectDataRDD2
                .keyBy(in -> in.getPartitionID());
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
                .keyBy(in -> in.getPartitionID());
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD2Indexd = listObjectDataRDD2
                .keyBy(in -> in.getPartitionID());

        // get information on each List2AttributesObjectSkinny object
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java

        // Get row IDs in RDDs to be joined later
        r1RowIDS = inputRDD1UID.keyBy(in -> in._1());
        r2RowIDS = inputRDD2UID.keyBy(in -> in._1());
        //}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        // Get row IDs in RDDs to be joined later
        r1RowIDS = inputRDD1UID.keyBy(in -> in._1());
        r2RowIDS = inputRDD2UID.keyBy(in -> in._1());
        //}

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
                ReflectionUtils::getDeclaringJar
        ).filter(
                element -> element != null
        ).forEach(jars::add);

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
            this.logger.warn("Non-local FlinkContext but not UDF JARs have been declared.");
        } else {
            udfJarPaths.stream().filter(a -> a != null).forEach(jars::add);
        }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
                function.apply(iterable).forEach(
                        element -> {
                            collector.collect(element);
                        }
                );
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java

    public <T> FilterFunction<T> compile(PredicateDescriptor.SerializablePredicate<T> predicateDescriptor) {
        return t -> predicateDescriptor.test(t);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
        // This is a dummy method but shows the intention of having something compilable in the descriptors.
        Function<I, O> function = descriptor.getJavaImplementation();
        return (MapFunction<I, O>) i -> function.apply(i);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCartesianOperator.java`
#### Snippet
```java
        final DataSet<Tuple2<InputType0, InputType1>> datasetOutput = dataSetInput0.cross(dataSetInput1).with(
                (dataInput0, dataInput1) -> {
                    return new Tuple2<>(dataInput0, dataInput1);
                }
        ).returns(ReflectionUtils.specify(Tuple2.class));
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java
        List<List<T>> powerList = new ArrayList<>();
        createPowerListAux(baseList, 0, maxElements, powerList);
        powerList.sort((a, b) -> Integer.compare(a.size(), b.size()));
        return powerList;
    }
```

### ComparatorCombinators
Can be replaced with 'Comparator.comparingLong'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
                break;
            case "run":
                this.sortCriterion = (a, b) -> Long.compare(a.getMeasuredExecutionTime(), b.getMeasuredExecutionTime());
                break;
            case "abs":
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'rexInputRef' can be replaced with pattern variable
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java

            if(leftOperand instanceof RexInputRef && rightOperand instanceof RexLiteral) {
                RexInputRef rexInputRef = (RexInputRef)leftOperand;
                int index = rexInputRef.getIndex();
                Object field = record.getField(index);
```

### PatternVariableCanBeUsed
Variable 'rexLiteral' can be replaced with pattern variable
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
                int index = rexInputRef.getIndex();
                Object field = record.getField(index);
                RexLiteral rexLiteral = (RexLiteral) rightOperand;
                switch (kind) {
                    case GREATER_THAN:
```

### PatternVariableCanBeUsed
Variable 'extendedFunction' can be replaced with pattern variable
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/execution/JavaExecutor.java`
#### Snippet
```java
                                    OptimizationContext.OperatorContext operatorContext) {
        if (function instanceof ExtendedFunction) {
            ExtendedFunction extendedFunction = (ExtendedFunction) function;
            int iterationNumber = operatorContext.getOptimizationContext().getIterationNumber();
            extendedFunction.open(new JavaExecutionContext(operator, inputs, iterationNumber));
```

### PatternVariableCanBeUsed
Variable 'operatorContext' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
                        continue;
                    }
                    OptimizationContext.OperatorContext operatorContext =
                            (OptimizationContext.OperatorContext) atomicExecutionGroup.getEstimationContext();

```

### PatternVariableCanBeUsed
Variable 'operatorBase' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
            // Minor: Propagate names to subplans.
        } else if (targetOperator instanceof ActualOperator && targetOperator instanceof OperatorBase) {
            final OperatorBase operatorBase = (OperatorBase) targetOperator;
            if (operatorBase.getName() == null) {
                operatorBase.setName(operatorName);
```

### PatternVariableCanBeUsed
Variable 'parameterizedType' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
    public static Type getWrapperClass(Type type, int index) {
        if (type != null && (type instanceof ParameterizedType)) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return parameterizedType.getActualTypeArguments()[index];
        }
```

### PatternVariableCanBeUsed
Variable 'cls' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            if (supertype instanceof Class<?>) {
                // If the supertype is a Class, there are no type parameters to worry about.
                Class<?> cls = (Class<?>) supertype;
                if (!superclass.isAssignableFrom(cls)) continue;
                return getTypeParameters(cls, superclass);
```

### PatternVariableCanBeUsed
Variable 'parameterizedType' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            } else if (supertype instanceof ParameterizedType) {
                // Handle type parameters.
                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                final Type rawType = parameterizedType.getRawType();
                if (!(rawType instanceof Class<?>)) continue;
```

### PatternVariableCanBeUsed
Variable 'cls' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
                final Type rawType = parameterizedType.getRawType();
                if (!(rawType instanceof Class<?>)) continue;
                Class<?> cls = (Class<?>) rawType;
                if (!superclass.isAssignableFrom(cls)) continue;
                final Map<String, Type> localTypeArguments = getTypeArguments(parameterizedType);
```

### PatternVariableCanBeUsed
Variable 'alternative' can be replaced with pattern variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
                OperatorContainer container = operator.getContainer();
                if (container instanceof OperatorAlternative.Alternative) {
                    OperatorAlternative.Alternative alternative = (OperatorAlternative.Alternative) container;
                    OperatorAlternative operatorAlternative = alternative.getOperatorAlternative();
                    isPresettled = this.presettledAlternatives.get(operatorAlternative) == alternative;
```

### PatternVariableCanBeUsed
Variable 'dynamicContext' can be replaced with pattern variable
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/DynamicLoadEstimator.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid estimation context.");
        }
        final DynamicEstimationContext dynamicContext = (DynamicEstimationContext) context;
        final CardinalityEstimate[] inputEstimates = context.getInputCardinalities();
        final CardinalityEstimate[] outputEstimates = context.getOutputCardinalities();
```

### PatternVariableCanBeUsed
Variable 'other' can be replaced with pattern variable
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
  public boolean equals(Object o) {
    if (o instanceof Unsigned16) {
      Unsigned16 other = (Unsigned16) o;
      return other.hi8 == hi8 && other.lo8 == lo8;
    }
```

### PatternVariableCanBeUsed
Variable 'dynamicLoadProfileEstimator' can be replaced with pattern variable
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        for (LoadProfileEstimator estimator : estimators.values()) {
            if (estimator instanceof DynamicLoadProfileEstimator) {
                final DynamicLoadProfileEstimator dynamicLoadProfileEstimator = (DynamicLoadProfileEstimator) estimator;
                if (!optimizedVariables.containsAll(dynamicLoadProfileEstimator.getEmployedVariables())) continue;
                out.println(dynamicLoadProfileEstimator.toJsonConfig(individual));
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `configureDefaults()` during object construction
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/Platform.java`
#### Snippet
```java
        this.name = name;
        this.configName = configName;
        this.configureDefaults(Configuration.getDefaultConfiguration());
    }

```

### AbstractMethodCallInConstructor
Call to 'abstract' method `addOneTimeOperator()` during object construction
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationContext.java`
#### Snippet
```java
                initializePruningStrategies(job.getConfiguration())
        );
        this.addOneTimeOperator(operator);
    }

```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'values' in a Serializable class
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/data/Record.java`
#### Snippet
```java
public class Record implements Serializable, Copyable<Record> {

    private Object[] values;

    public Record(Object... values) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'field' in a Serializable class
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
        private final String fieldName;

        private Field field;

        private PojoImplementation(String fieldName) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'writer' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
    private FileOutputFormat.OutputDirectoryMode outputDirectoryMode;

    SequenceFile.Writer writer;
    // --------------------------------------------------------------------------------------------

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'previous' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    private IterativeDataSet<Type> iterativeDataSet;

    private DataSetChannel.Instance previous;


```

### NonSerializableFieldInSerializableClass
Non-serializable field 'iterativeDataSet' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    }

    private IterativeDataSet<Type> iterativeDataSet;

    private DataSetChannel.Instance previous;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'iterativeDataSet' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
    }

    private IterativeDataSet<Type> iterativeDataSet;

    @Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'iterativeDataSet' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDoWhileOperator.java`
#### Snippet
```java
        implements FlinkExecutionOperator {

    private IterativeDataSet iterativeDataSet;
    /**
     * Creates a new instance.
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'iterativeDataSet' in a Serializable class
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
        implements FlinkExecutionOperator  {

    private IterativeDataSet iterativeDataSet;

    /**
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/NamedFunction.java`
#### Snippet
```java
                        .collect(Collectors.toList());
                return new CompiledFunction(this.name, implementation, specifiedArgs);
            } catch (EvaluationException e) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
            dataOut.writeInt(bytes.length);
            dataOut.write(bytes);
        } catch (SocketException e){

        } catch (IOException e) {
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static int getParameter(PageRankEnum name){
        switch (name){
            case ITERATION:
                return stack_iteration.peek();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static void setParameter(PageRankEnum name, Integer value){
        switch (name){
            case ITERATION:
                stack_iteration.add(value);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static boolean hasElement(PageRankEnum name){
        switch (name){
            case ITERATION:
                return !stack_iteration.isEmpty();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/PageRankOperator.java`
#### Snippet
```java
    @Override
    public Optional<CardinalityEstimator> createCardinalityEstimator(int outputIndex, Configuration configuration) {
        switch (outputIndex) {
            case 0:
                return Optional.of((optimizationContext, inputEstimates) -> {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/RepeatOperator.java`
#### Snippet
```java
    public Collection<OutputSlot<?>> getForwards(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/RepeatOperator.java`
#### Snippet
```java
    @Override
    public Optional<CardinalityEstimator> createCardinalityEstimator(int outputIndex, Configuration configuration) {
        switch (outputIndex) {
            case ITERATION_OUTPUT_INDEX:
            case FINAL_OUTPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/RepeatOperator.java`
#### Snippet
```java
    public boolean isReading(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
      // getTimestamp(int, Calendar) with a UTC calendar should prevent this,
      // but does not. So we shift explicitly.
      switch (types[i]) {
      case Types.TIMESTAMP:
        final Timestamp timestamp = resultSet.getTimestamp(i + 1);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java

    @Override protected @Nullable Object value(int i) throws SQLException {
      switch (types[i]) {
      case Types.TIMESTAMP:
        final Timestamp timestamp = resultSet.getTimestamp(i + 1);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
                Object field = record.getField(index);
                RexLiteral rexLiteral = (RexLiteral) rightOperand;
                switch (kind) {
                    case GREATER_THAN:
                        return isGreaterThan(field, rexLiteral);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
      final int precision;
      final int scale;
      switch (SqlType.valueOf(dataType)) {
      case TIMESTAMP:
      case TIME:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
    final SqlTypeName sqlTypeName =
        Util.first(SqlTypeName.getNameForJdbcType(dataType), SqlTypeName.ANY);
    switch (sqlTypeName) {
    case ARRAY:
      RelDataType component = null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
            return string;
        }
        switch (fieldType.getSqlTypeName()) {
            case BOOLEAN:
                if (string.length() == 0) {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/SampleMapping.java`
#### Snippet
```java
        return new ReplacementSubplanFactory.OfSingleOperators<SampleOperator>(
                (matchedOperator, epoch) -> {
                    switch (matchedOperator.getSampleMethod()) {
                        case ANY:
                        case RANDOM:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
    @Override
    public Optional<CardinalityEstimator> createCardinalityEstimator(int outputIndex, Configuration configuration) {
        switch (outputIndex) {
            case ITERATION_OUTPUT_INDEX:
            case FINAL_OUTPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
    public Collection<OutputSlot<?>> getForwards(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
    public boolean isReading(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case CONVERGENCE_INPUT_INDEX:
            case INITIAL_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRepeatOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRepeatOperator.java`
#### Snippet
```java

        final JavaChannelInstance input;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    public Collection<OutputSlot<?>> getForwards(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_CONVERGENCE_INPUT_INDEX:
            case ITERATION_CONVERGENCE_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    public boolean isReading(InputSlot<?> input) {
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_CONVERGENCE_INPUT_INDEX:
            case ITERATION_CONVERGENCE_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    @Override
    public Optional<CardinalityEstimator> createCardinalityEstimator(int outputIndex, Configuration configuration) {
        switch (outputIndex) {
            case ITERATION_CONVERGENCE_OUTPUT_INDEX:
                return Optional.of(new SwitchForwardCardinalityEstimator(
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDoWhileOperator.java`
#### Snippet
```java
        final Collection<ConvergenceType> convergenceCollection;
        final JavaChannelInstance input;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDoWhileOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLoopOperator.java`
#### Snippet
```java
        final Collection<ConvergenceType> convergenceCollection;
        final JavaChannelInstance input;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedOutputChannels(int index) {
        assert index <= this.getNumOutputs() || (index == 0 && this.getNumOutputs() == 0);
        switch (index) {
            case ITERATION_OUTPUT_INDEX:
            case FINAL_OUTPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
     */
    private void handleConfigurationFileEntry(String key, String value) {
        switch (key) {
            case "wayang.core.optimizer.cost.squash":
                if (!(this.costSquasherProvider instanceof ConstantValueProvider)) {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/UnaryOperation.java`
#### Snippet
```java
    @Override
    public double evaluate(Context context) {
        switch (this.operator) {
            case '+':
                return this.operand.evaluate(context);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/BinaryOperation.java`
#### Snippet
```java
    @Override
    public double evaluate(Context context) {
        switch (this.operator) {
            case '+':
                return this.operand0.evaluate(context) + this.operand1.evaluate(context);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
            if (this.stage.isLoopHead()) {
                LoopHeadOperator loopOperator = (LoopHeadOperator) this.stage.getLoopHeadTask().getOperator();
                switch (loopOperator.getState()) {
                    case NOT_STARTED:
                        isLoopChannelsReady = this.updateChannelInstances(this.initializationInboundChannels, false);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        }
        Predicate<PartialExecution> predicate;
        switch (commandLine[1]) {
            case "clear":
                this.filters.clear();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        while ((input = commandLine.readLine()) != null) {
            final String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "print":
                    this.printPartialExecutions(tokens);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/LogEvaluator.java`
#### Snippet
```java
        }
        final Comparator<TimeEstimate> timeEstimateComparator = ProbabilisticIntervalEstimate.expectationValueComparator();
        switch (commandLine[1]) {
            case "clear":
                this.sortCriterion = null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
        this.mutationAlterationRatio = this.configuration.getDoubleProperty("wayang.profiler.ga.mutation.alteration", 0.5d);
        this.mutationResetRatio = this.configuration.getDoubleProperty("wayang.profiler.ga.mutation.reset", 0.01d);
        switch (this.configuration.getStringProperty("wayang.profiler.ga.fitness.type", "relative")) {
            case "relative":
                this.fitnessFunction = individual -> individual.calculateRelativeFitness(this);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
        );
        ToDoubleFunction<ConcatenationActivator> concatenationPriorityFunction;
        switch (priorityFunctionName) {
            case "slots":
                concatenationPriorityFunction = ConcatenationActivator::countNumOfOpenSlots;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/Main.java`
#### Snippet
```java
        List<SparkOperatorProfiler.Result> results;

        switch (operator) {
            case "textsource":
                results = profile(OperatorProfilers.createSparkTextFileSourceProfiler(), allCardinalities);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/BinaryOperatorProfiler.java`
#### Snippet
```java
    @Override
    protected void prepareInput(int inputIndex, long inputCardinality) {
        switch (inputIndex) {
            case 0:
                this.inputRdd0 = this.prepareInputRdd(inputCardinality, inputIndex);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        List<OperatorProfiler.Result> results;

        switch (operator) {
            case "textsource":
                results = profile(OperatorProfilers.createJavaTextFileSourceProfiler(), cardinalities);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java

    long pre = System.currentTimeMillis();
    switch (platform){
      case "so":
        Runtime.getRuntime().exec(
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java
     */
    protected <T> JavaRDD<T> prepareInputRdd(long cardinality, int inputIndex) {
        switch (this.dataQuantumGeneratorLocation) {
            case "worker":
                return this.prepareInputRddInWorker(cardinality, inputIndex);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java

        WayangPlan wayangPlan;
        switch (Integer.parseInt(args[1])) {
            case 1:
                wayangPlan = createQ1(args[2], Integer.parseInt(args[3]));
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
        WayangContext wayangContext = new WayangContext();
        for (String platform : args[0].split(",")) {
            switch (platform) {
                case "java":
                    wayangContext.register(Java.basicPlugin());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
            WayangContext wayangContext = new WayangContext();
            for (String platform : args[0].split(",")) {
                switch (platform) {
                    case "java":
                        wayangContext.register(Java.basicPlugin());
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
    private ExecutionMode getExecutionMode(String name){
        ExecutionMode mode;
        switch (name){
            case "batch_forced":
                mode = ExecutionMode.BATCH_FORCED;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
        Configuration conf = job.getConfiguration();
        if(this.flinkContextReference == null)
            switch (conf.getStringProperty("wayang.flink.mode.run")) {
            case "local":
                this.flinkContextReference = new FlinkContextReference(
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java

            DataSet<Type> input;
            switch (this.getState()) {
                case NOT_STARTED:
                    assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
            try {
                int real_iteration;
                switch (this.getState()) {
                    case NOT_STARTED:
                        DataSet<Type> input_initial = ((DataSetChannel.Instance) inputs[INITIAL_INPUT_INDEX]).provideDataSet();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
        try {

            switch (this.getState()) {
                case NOT_STARTED:
                    DataSet<Type> input_initial = ((DataSetChannel.Instance) inputs[INITIAL_INPUT_INDEX]).provideDataSet();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
        }else {
            double faction = (size / sampleSize) + 0.01d;
            switch (this.getSampleMethod()) {
                case RANDOM:
                    dataSetOutput = DataSetUtils.sampleWithSize(dataSetInput, true, sampleSize, seed);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/SampleMapping.java`
#### Snippet
```java
        return new ReplacementSubplanFactory.OfSingleOperators<SampleOperator>(
                (matchedOperator, epoch) -> {
                    switch (matchedOperator.getSampleMethod()) {
                        case RANDOM:
                            return new SparkRandomPartitionSampleOperator<>(matchedOperator);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDoWhileOperator.java`
#### Snippet
```java
        assert outputs.length == this.getNumOutputs();

        switch (this.getState()) {
            case NOT_STARTED:
                DataSet<InputType> input_initial = ((DataSetChannel.Instance) inputs[INITIAL_INPUT_INDEX]).provideDataSet();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDoWhileOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedOutputChannels(int index) {
        assert index <= this.getNumOutputs() || (index == 0 && this.getNumOutputs() == 0);
        switch (index) {
            case ITERATION_OUTPUT_INDEX:
            case FINAL_OUTPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
        assert outputs.length == this.getNumOutputs();

        switch (this.getState()) {
            case NOT_STARTED:
                DataSet<InputType> input_initial = ((DataSetChannel.Instance) inputs[INITIAL_INPUT_INDEX]).provideDataSet();
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRepeatOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRepeatOperator.java`
#### Snippet
```java

        RddChannel.Instance iterationInput;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLoopOperator.java`
#### Snippet
```java
        final Collection<ConvergenceType> convergenceCollection;
        final RddChannel.Instance input;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLoopOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedOutputChannels(int index) {
        assert index <= this.getNumOutputs() || (index == 0 && this.getNumOutputs() == 0);
        switch (index) {
            case ITERATION_OUTPUT_INDEX:
            case FINAL_OUTPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkDoWhileOperator.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkDoWhileOperator.java`
#### Snippet
```java
                sparkExecutor.getCompiler().compile(this.criterionDescriptor, this, operatorContext, inputs);
        boolean endloop = false;
        switch (this.getState()) {
            case NOT_STARTED:
                assert inputs[INITIAL_INPUT_INDEX] != null;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
            if (q >= high || p < mid && c.compare((Tuple2<Data<Type0, Type1>, Input>) src.get(p), (Tuple2<Data<Type0, Type1>, Input>) src.get(q)) <= 0) {
                bDst[i] = bSrc[p];
                dest.set(i, src.get(p++));
            } else {
                bDst[i] = bSrc[q];
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `q`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
            } else {
                bDst[i] = bSrc[q];
                dest.set(i, src.get(q++));
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
            if (q >= high || p < mid && c.compare(src[p], src[q]) <= 0) {
                bDst[i] = bSrc[p];
                dest[i] = src[p++];
            } else {
                bDst[i] = bSrc[q];
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `q`
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
            } else {
                bDst[i] = bSrc[q];
                dest[i] = src[q++];
            }
        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/execution/JdbcExecutor.java`
#### Snippet
```java

            } else {
                throw new WayangException(String.format("Unsupported JDBC execution task %s", nextTask.toString()));
            }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
        relTree.explain(relWriter);

        System.out.println(sw.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
        operators.forEach(o -> sw.append(o.toString()));

        System.out.println(sw.toString());
    }

```

## RuleId[id=Java9CollectionFactory]
### Java9CollectionFactory
Can be replaced with 'List.of()' call
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
    public ProjectionDescriptor(BasicDataUnitType<Input> inputType, BasicDataUnitType<Output> outputType, String... fieldNames) {
        this(createPojoJavaImplementation(fieldNames, inputType),
                Collections.unmodifiableList(Arrays.asList(fieldNames)),
                inputType,
                outputType);
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `MapFunctionImpl` may be 'static'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java


    private class MapFunctionImpl implements
            FunctionDescriptor.SerializableFunction<Record, Record> {

```

### InnerClassMayBeStatic
Inner class `EvaluateFilterCondition` may be 'static'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java


    private class EvaluateFilterCondition extends RexVisitorImpl<Boolean> {

        final Record record;
```

### InnerClassMayBeStatic
Inner class `S3Pair` may be 'static'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
  }

  class S3Pair{

    private final String bucket;
```

### InnerClassMayBeStatic
Inner class `TaskActivator` may be 'static'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PushExecutorTemplate.java`
#### Snippet
```java
     * allows for execution of the {@link ExecutionTask}.
     */
    private class TaskActivator {

        private final ExecutionTask task;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
    if (schema == null && jdbc41OrAbove) {
      schema = connection.getSchema();
      if ("".equals(schema)) {
        schema = null; // PostgreSQL returns useless "" sometimes
      }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
            URL url = new URL(urlAsString);
            return url.getProtocol().equals("file") &&
                    (url.getHost().equals("") || url.getHost().equals("localhost"));
        } catch (MalformedURLException e) {
            logger.error(String.format("Illegal URL: \"%s\"", urlAsString), e);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImprovedImpl.java`
#### Snippet
```java
            point[0] = Double.parseDouble(pointStr[0]);
            for (int i = 1; i < pointStr.length; i++) {
                if (pointStr[i].equals("")) {
                    continue;
                }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
        final Optional<String> optionalDouble = this.properties.optionallyProvideFor(key);
        if (optionalDouble.isPresent()) {
            return OptionalDouble.of(Double.valueOf(optionalDouble.get()));
        } else {
            return OptionalDouble.empty();
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
        final Optional<String> longValue = this.properties.optionallyProvideFor(key);
        if (longValue.isPresent()) {
            return OptionalLong.of(Long.valueOf(longValue.get()));
        } else {
            return OptionalLong.empty();
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            int startPos = 0;
            int endPos = line.indexOf(';', startPos);
            tuple.L_ORDERKEY = Long.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_PARTKEY = Long.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Long.parseLong()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_SUPPKEY = Long.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_LINENUMBER = Integer.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_QUANTITY = Double.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_EXTENDEDPRICE = Double.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_DISCOUNT = Double.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = line.indexOf(';', startPos);
            tuple.L_TAX = Double.valueOf(line.substring(startPos + 1, endPos - 1));

            startPos = endPos + 1;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'type != null' covered by subsequent condition 'type instanceof ParameterizedType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java

    public static Type getWrapperClass(Type type, int index) {
        if (type != null && (type instanceof ParameterizedType)) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return parameterizedType.getActualTypeArguments()[index];
```

### ConditionCoveredByFurtherCondition
Condition 'mainEstimator == null' covered by subsequent condition '!(mainEstimator instanceof NestableLoadProfileEstimator)'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
                                        Configuration configuration) {
        final LoadProfileEstimator mainEstimator = mainEstimatorOpt.orElse(null);
        if (mainEstimator == null || !(mainEstimator instanceof NestableLoadProfileEstimator)) return;
        final LoadProfileEstimator subestimator = configuration
                .getFunctionLoadProfileEstimatorProvider()
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ReduceOperator.java`
#### Snippet
```java
     * @deprecated This method is just a hack that is necessary because of the ambiguous nature of this operator.
     */
    public static <Type> ReduceOperator<Type> createGroupedReduce(
            ReduceDescriptor<Type> reduceDescriptor,
            DataSetType<? extends Iterable<Type>> inputType,
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ExecutionOperator.java`
#### Snippet
```java
     * @deprecated Use {@link #getLoadProfileEstimatorConfigurationKeys()}
     */
    default String getLoadProfileEstimatorConfigurationKey() {
        return null;
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ChannelInitializer.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    default ChannelInitializer unchecked() {
        return this;
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
     * @deprecated use {@link #introduceAlternative(WayangPlan, SubplanMatch, Operator)}
     */
    private void replace(WayangPlan plan, SubplanMatch match, Operator replacement) {
        // Disconnect the original input operator and insert the replacement input operator.
        final Operator originalInputOperator = match.getInputMatch().getOperator();
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/FunctionDescriptor.java`
#### Snippet
```java
     * @deprecated Use {@link #setLoadProfileEstimator(LoadProfileEstimator)} instead.
     */
    public void setLoadEstimators(LoadEstimator cpuEstimator, LoadEstimator ramEstimator) {
        this.setLoadProfileEstimator(new NestableLoadProfileEstimator(
                cpuEstimator,
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.core.util.fs` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/operators/GiraphPageRankOperator.java`
#### Snippet
```java

    private Stream<Tuple2<Long, Float>> createStream(String path) {
        return org.apache.wayang.core.util.fs.FileUtils.streamLines(path).map(line -> {
            String[] part = line.split("\t");
            return new Tuple2<>(Long.parseLong(part[0]), Float.parseFloat(part[1]));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java

/**
 * This source takes as input a Java {@link java.util.Collection}.
 */
public class CollectionSource<T> extends UnarySource<T> implements ElementaryOperator {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.basic.operators` is unnecessary and can be removed
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/TextFileSourceMapping.java`
#### Snippet
```java
    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new org.apache.wayang.basic.operators.TextFileSource((String) null), false
        );
        return SubplanPattern.createSingleton(operatorPattern);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.sqlite` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-sqlite3/src/main/java/org/apache/wayang/sqlite3/platform/Sqlite3Platform.java`
#### Snippet
```java
    @Override
    public String getJdbcDriverClassName() {
        return org.sqlite.JDBC.class.getName();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.basic.operators` is unnecessary and can be removed
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaMapOperator.java`
#### Snippet
```java

/**
 * Java implementation of the {@link org.apache.wayang.basic.operators.MapOperator}.
 */
public class JavaMapOperator<InputType, OutputType>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.postgresql` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-postgres/src/main/java/org/apache/wayang/postgres/platform/PostgresPlatform.java`
#### Snippet
```java
    @Override
    public String getJdbcDriverClassName() {
        return org.postgresql.Driver.class.getName();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `de.odysseus.el` is unnecessary and can be removed
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java
        public JuelFunction(String juelExpression, Class<T> resultClass, Map<String, Class<?>> arguments) {
            // Initialize the JUEL conext.
            this.expressionFactory = new de.odysseus.el.ExpressionFactoryImpl();
            this.initializeContext(this.context = new SimpleContext());

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/WayangCollections.java`
#### Snippet
```java

/**
 * Utilities to operate {@link java.util.Collection}s.
 */
public class WayangCollections {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.core.api` is unnecessary and can be removed
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AtomicExecution.java`
#### Snippet
```java

    /**
     * This {@link JsonSerializer} stores the given instances via their {@link org.apache.wayang.core.api.Configuration}
     * key, if any, or else by the {@link LoadProfile} that they estimate.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.core.optimizer` is unnecessary and can be removed
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/ChannelInstance.java`
#### Snippet
```java
    /**
     * Provides a {@link ChannelLineageNode} that keeps around (at least) all non-executed predecessor
     * {@link ChannelInstance}s and {@link org.apache.wayang.core.optimizer.OptimizationContext.OperatorContext}s.
     *
     * @return the {@link ChannelLineageNode}
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/ConsumerDescriptor.java`
#### Snippet
```java
     * Get the selectivity of this instance.
     *
     * @return an {@link java.util.Optional} with the selectivity or an empty one if no selectivity was specified
     */
    public Optional<ProbabilisticDoubleInterval> getSelectivity() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
                for (int j = i; j > low && c.compare((Tuple2<Data<Type0, Type1>, Input>) dest.get(j - 1), (Tuple2<Data<Type0, Type1>, Input>) dest.get(j)) > 0; j--) {
                    //swap(dest, j, j - 1);
                    java.util.Collections.swap(dest, j, j - 1);
                    swapp(bDst, j, j - 1);
                }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java

    private void swap(ArrayList<Tuple2<Data<Type0, Type1>, Input>> x, int a, int b) {
        java.util.Collections.swap(x, a, b);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary and can be removed
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
     */
    private static final long serialVersionUID = 3834945091845558509L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary and can be removed
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    private static final long serialVersionUID = 3834945091845558509L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary and can be removed
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary and can be removed
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/extractData.java`
#### Snippet
```java
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    public extractData(org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.getXPivot = getXPivot;
        this.getXRef = getXRef;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    Integer ex2;

    public build2ListObject(boolean list1ASC, boolean list1ASCSec, org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot, org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef) {
        this.list1ASC = list1ASC;
        this.list1ASCSec = list1ASCSec;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
    private static final long serialVersionUID = 6703700898776377115L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

    boolean list1ASC;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.spark.api.java.function` is unnecessary, and can be replaced with an import
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/build2ListObject.java`
#### Snippet
```java
     */
    private static final long serialVersionUID = 6703700898776377115L;
    org.apache.spark.api.java.function.Function<Input, TypeXPivot> getXPivot;
    org.apache.spark.api.java.function.Function<Input, TypeXRef> getXRef;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/BinaryOperatorAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link java.util.function.BinaryOperator} as a {@link Function2}.
 */
public class BinaryOperatorAdapter<Type> implements Function2<Type, Type, Type> {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java
    private java.util.function.Function<InputType, Iterable<OutputType>> function;

    public FlatMapFunctionAdapter(java.util.function.Function<InputType, Iterable<OutputType>> function) {
        this.function = function;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java
public class FlatMapFunctionAdapter<InputType, OutputType> implements FlatMapFunction<InputType, OutputType> {

    private java.util.function.Function<InputType, Iterable<OutputType>> function;

    public FlatMapFunctionAdapter(java.util.function.Function<InputType, Iterable<OutputType>> function) {
```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

        @Override
        public scala.Tuple2<K, T> call(T t) throws Exception {
            K key = this.impl.apply(t);
            return new scala.Tuple2<>(key, t);
```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
        public scala.Tuple2<K, T> call(T t) throws Exception {
            K key = this.impl.apply(t);
            return new scala.Tuple2<>(key, t);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkReduceByOperator.java`
#### Snippet
```java
     */
    private static class TupleConverter<InputType, KeyType>
            implements Function<scala.Tuple2<KeyType, InputType>, InputType> {

        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkReduceByOperator.java`
#### Snippet
```java

        @Override
        public InputType call(scala.Tuple2<KeyType, InputType> scalaTuple) throws Exception {
            return scalaTuple._2;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.wayang.basic.operators` is unnecessary and can be removed
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java

/**
 * Spark implementation of the {@link org.apache.wayang.basic.operators.MapOperator}.
 */
public class SparkMapOperator<InputType, OutputType>
```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary and can be removed
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMaterializedGroupByOperator.java`
#### Snippet
```java
        final Function<Type, KeyType> keyExtractor =
                sparkExecutor.getCompiler().compile(this.keyDescriptor, this, operatorContext, inputs);
        final Function<scala.Tuple2<KeyType, Iterable<Type>>, Iterable<Type>> projector = new GroupProjector<>();
        final JavaPairRDD<KeyType, Iterable<Type>> groupedKeyRdd = inputRdd.groupBy(keyExtractor, sparkExecutor.getNumDefaultPartitions());
        this.name(groupedKeyRdd);
```

### UnnecessaryFullyQualifiedName
Qualifier `scala` is unnecessary and can be removed
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMaterializedGroupByOperator.java`
#### Snippet
```java
    }

    private static class GroupProjector<Key, Type> implements Function<scala.Tuple2<Key, Iterable<Type>>, Iterable<Type>> {

        @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java

    @Override
    public List<V> apply(scala.collection.Iterator<V> iterator) {

        List<V> list = new ArrayList<>(end_id - start_id);
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
            Object samples = sparkContext.runJob(shuffledRDD.rdd(),
                    new TakeSampleFunction(tupleID, tupleID + sampleSize),
                    (scala.collection.Seq) JavaConversions.asScalaBuffer(pars), scala.reflect.ClassTag$.MODULE$.apply(List.class));

            tupleID += sampleSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.reflect` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
            Object samples = sparkContext.runJob(shuffledRDD.rdd(),
                    new TakeSampleFunction(tupleID, tupleID + sampleSize),
                    (scala.collection.Seq) JavaConversions.asScalaBuffer(pars), scala.reflect.ClassTag$.MODULE$.apply(List.class));

            tupleID += sampleSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
}

class TakeSampleFunction<V> extends AbstractFunction1<scala.collection.Iterator<V>, List<V>> implements Serializable {

    private int start_id;
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
            Object samples = sparkContext.runJob(inputRdd.rdd(),
                    new PartitionSampleFunction(tid, ((tid + sampleSize))),
                    (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                    scala.reflect.ClassTag$.MODULE$.apply(List.class));
            result = ((List<Type>[]) samples)[0];
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.reflect` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                    new PartitionSampleFunction(tid, ((tid + sampleSize))),
                    (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                    scala.reflect.ClassTag$.MODULE$.apply(List.class));
            result = ((List<Type>[]) samples)[0];
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.collection` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                        sparkContext.runJob(inputRdd.rdd(),
                                new PartitionSampleListFunction(list),
                                (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                                scala.reflect.ClassTag$.MODULE$.apply(List.class))));
            }
```

### UnnecessaryFullyQualifiedName
Qualifier `scala.reflect` is unnecessary, and can be replaced with an import
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                                new PartitionSampleListFunction(list),
                                (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                                scala.reflect.ClassTag$.MODULE$.apply(List.class))));
            }

```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
            this.monitor.updateProgress(partialProgress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessReceiver.java`
#### Snippet
```java

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
            System.out.println("Everything closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
                    pb.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/util/RrdAccessor.java`
#### Snippet
```java
            return convertToJavaTimestamp(this.rrdDb.getLastUpdateTime());
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/util/RrdAccessor.java`
#### Snippet
```java
                this.rrdDb.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/util/RrdAccessor.java`
#### Snippet
```java
            return fetchData.getAggregate(dsName, consolidationFunction);
        } catch (IOException e) {
            e.printStackTrace();
            return Double.NaN;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        } catch (IOException e) {
            System.err.println("Profile reading failed.");
            e.printStackTrace();
        }
        long endReadTime = System.nanoTime();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/hardware/DiskProfiler.java`
#### Snippet
```java
        } catch (IOException e) {
            System.err.println("Profile writing failed.");
            e.printStackTrace();
        }
        long endWriteTime = System.nanoTime();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/wordcount/Main.java`
#### Snippet
```java
        } catch (Exception e) {
            System.err.println("App failed.");
            e.printStackTrace();
            System.exit(4);
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
            object = (T) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
            result = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
                bos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
            writer.append(NullWritable.get(), bytesWritable);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
            writer = SequenceFile.createWriter(new org.apache.hadoop.conf.Configuration(true), fileOption, keyClassOption, valueClassOption);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLocalCallbackSink.java`
#### Snippet
```java
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ExecutionOperator.modelEagerExecution(inputs, outputs, operatorContext);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkGlobalReduceOperator.java`
#### Snippet
```java
            datasetOutput = dataSetInput.reduce(reduceFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java
            numPages = (int) pages.count();
        } catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new TextOutputFormat.TextFormatter() can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
    public <T> TextOutputFormat.TextFormatter<T> compileOutput(TransformationDescriptor<T, String> formattingDescriptor) {
        Function<T, String> format = formattingDescriptor.getJavaImplementation();
        return new TextOutputFormat.TextFormatter<T>(){

            @Override
```

### Anonymous2MethodRef
Anonymous new ReduceFunction() can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
        // This is a dummy method but shows the intention of having something compilable in the descriptors.
        BiFunction<T, T, T> reduce_function = descriptor.getJavaImplementation();
        return new ReduceFunction<T>() {
            @Override
            public T reduce(T t, T t1) throws Exception {
```

### Anonymous2MethodRef
Anonymous new JoinFunction\>() can be replaced with method reference
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkJoinOperator.java`
#### Snippet
```java
                fun1
            ).with(
                new JoinFunction<InputType0, InputType1, Tuple2<InputType0, InputType1>>() {
                    @Override
                    public Tuple2<InputType0, InputType1> join(InputType0 inputType0, InputType1 inputType1) throws Exception {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.getOrDefault' method call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/SimpleEstimationContext.java`
#### Snippet
```java
    @Override
    public double getDoubleProperty(String propertyKey, double fallback) {
        return this.doubleProperties.containsKey(propertyKey) ?
                this.doubleProperties.get(propertyKey) :
                fallback;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    metadata.setContentType("text/plain");
    AmazonS3 s3Client = this.getS3Client();
    new Thread(new Runnable() {
      public void run() {
        PutObjectResult result = s3Client.putObject(pair.getBucket(), pair.getKey(), in, metadata);
```

### Convert2Lambda
Anonymous new MapPartitionFunction() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
    public <I, O> MapPartitionFunction<I, O> compile(MapPartitionsDescriptor<I, O> descriptor){
        Function<Iterable<I>, Iterable<O>> function = descriptor.getJavaImplementation();
        return new MapPartitionFunction<I, O>() {
            @Override
            public void mapPartition(Iterable<I> iterable, Collector<O> collector) throws Exception {
```

### Convert2Lambda
Anonymous new ReduceFunction() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
        // This is a dummy method but shows the intention of having something compilable in the descriptors.
        BiFunction<T, T, T> reduce_function = descriptor.getJavaImplementation();
        return new ReduceFunction<T>() {
            @Override
            public T reduce(T t, T t1) throws Exception {
```

### Convert2Lambda
Anonymous new MapFunction, Tuple2\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java
        final DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];

        MapFunction<org.apache.wayang.basic.data.Tuple2<Long, Long>, Tuple2<Long,Long>> mapFunction = new MapFunction<org.apache.wayang.basic.data.Tuple2<Long, Long>, Tuple2<Long, Long>>() {
            @Override
            public Tuple2<Long, Long> map(org.apache.wayang.basic.data.Tuple2<Long, Long> longLongTuple2) throws Exception {
```

### Convert2Lambda
Anonymous new FlatMapFunction, Long\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java


        FlatMapFunction<Tuple2<Long, Long>, Long> flatMapFunction = new FlatMapFunction<Tuple2<Long, Long>, Long>() {
            @Override
            public void flatMap(Tuple2<Long, Long> longLongTuple2, Collector<Long> collector) throws Exception {
```

### Convert2Lambda
Anonymous new MapFunction, org.apache.wayang.basic.data.Tuple2\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkPageRankOperator.java`
#### Snippet
```java

        final DataSet<org.apache.wayang.basic.data.Tuple2<Long, Float>> dataSetOutput = finalPageRanks.map(
                new MapFunction<Tuple2<Long, Double>, org.apache.wayang.basic.data.Tuple2<Long, Float>>() {
                    @Override
                    public org.apache.wayang.basic.data.Tuple2<Long, Float> map(Tuple2<Long, Double> longDoubleTuple2) throws Exception {
```

### Convert2Lambda
Anonymous new MapFunction, Type\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkIntersectOperator.java`
#### Snippet
```java
                ).distinct()
                .map(
                        new MapFunction<Tuple2<Type, Type>, Type>() {
                            @Override
                            public Type map(Tuple2<Type, Type> typeTypeTuple2) throws Exception {
```

### Convert2Lambda
Anonymous new FlatMapFunction, Tuple2\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSource.java`
#### Snippet
```java
                        .fee.createInput(_file)
                        .setParallelism(flinkExecutor.getNumDefaultPartitions())
                        .flatMap(new FlatMapFunction<org.apache.flink.api.java.tuple.Tuple2<NullWritable,BytesWritable>, Tuple2>() {
                            @Override
                            public void flatMap(org.apache.flink.api.java.tuple.Tuple2<NullWritable, BytesWritable> value, Collector<Tuple2> out) throws Exception {
```

### Convert2Lambda
Anonymous new JoinFunction\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkJoinOperator.java`
#### Snippet
```java
                fun1
            ).with(
                new JoinFunction<InputType0, InputType1, Tuple2<InputType0, InputType1>>() {
                    @Override
                    public Tuple2<InputType0, InputType1> join(InputType0 inputType0, InputType1 inputType1) throws Exception {
```

### Convert2Lambda
Anonymous new CoGroupFunction, Iterable\>\>() can be replaced with lambda
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCoGroupOperator.java`
#### Snippet
```java
             function1
        ).with(
            new CoGroupFunction<InputType0, InputType1, Tuple2<Iterable<InputType0>, Iterable<InputType1>>>() {
                @Override
                public void coGroup (
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 8 fields
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
     * @param that the {@link OperatorBase} to be copied
     */
    protected OperatorBase(OperatorBase that) {
        this(that.getNumRegularInputs(), that.getNumOutputs(), that.isSupportingBroadcastInputs());
        System.arraycopy(that.cardinalityEstimators, 0, this.cardinalityEstimators, 0, this.getNumOutputs());
```

### CopyConstructorMissesField
Copy constructor does not copy field 'targetPlatforms'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanMatch.java`
#### Snippet
```java
     * Copy constructor.
     */
    public SubplanMatch(SubplanMatch that) {
        this.pattern = that.pattern;
        this.operatorMatches.putAll(that.operatorMatches);
```

### CopyConstructorMissesField
Copy constructor does not copy 5 fields
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * Copy constructor.
     */
    public PlanImplementation(PlanImplementation original) {
        this.planEnumeration = original.planEnumeration;
        this.junctions = new HashMap<>(original.junctions);
```

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/compiler/FunctionCompiler.java`
#### Snippet
```java
 * A compiler translates Wayang functions into executable Java functions.
 */
public class FunctionCompiler {

    private final Configuration configuration;
```

### ClassCanBeRecord
Class can be a record
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaReduceByOperator.java`
#### Snippet
```java
     * in each reduction.
     */
    private static class ReducingCollector<T> implements Collector<T, List<T>, T> {

        private final BinaryOperator<T> reduceFunction;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java
     * This class describes arguments of {@link JuelFunction}s.
     */
    private static final class Argument {

        private final int index;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
 * Iterates all combinations, i.e., the Cartesian product, of given {@link Iterable}s.
 */
public class CrossProductIterable<T> implements Iterable<List<T>> {

    public final List<? extends Iterable<T>> iterables;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/model/Constant.java`
#### Snippet
```java
 * A constant {@link Expression}.
 */
public class Constant implements Expression {

    final double value;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/OperatorMatch.java`
#### Snippet
```java
 * An operator match correlates an {@link OperatorPattern} to an actually matched {@link Operator}.
 */
public class OperatorMatch {

    private final OperatorPattern pattern;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
     * Edge in a {@link Tree}.
     */
    private static class TreeEdge {

        /**
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
     * Describes a reference to an input of an {@link Activator}.
     */
    private static class Activation {

        /**
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
     * Identifies an {@link Activator}.
     */
    private static final class ActivatorKey {

        private final ExecutionOperator executionOperator;
```

### ClassCanBeRecord
Class can be a record
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/OperatorProfiler.java`
#### Snippet
```java
     * The result of a single profiling run.
     */
    public static class Result {

        private final List<Long> inputCardinalities;
```

### ClassCanBeRecord
Class can be a record
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * {@link InputSlot}s. These {@link Slot}s are not stored in this class and must be clear from the context.
     */
    static class ConcatenationGroupDescriptor {

        /**
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
            };
            this.process = new Thread(run1);
            this.process.start();

            // Redirect worker stdout and stderr
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'estimator' to 'DynamicLoadProfileEstimator'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizer.java`
#### Snippet
```java
                final LoadProfileEstimator estimator = estimators.get(loadProfileEstimatorKey);
                if (estimator != null) {
                    for (Variable variable : ((DynamicLoadProfileEstimator) estimator).getEmployedVariables()) {
                        this.activatedGenes.set(variable.getIndex());
                    }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'estimator' to 'DynamicLoadProfileEstimator'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/GeneticOptimizerApp.java`
#### Snippet
```java
        for (LoadProfileEstimator estimator : estimators.values()) {
            if (estimator instanceof DynamicLoadProfileEstimator) {
                final DynamicLoadProfileEstimator dynamicLoadProfileEstimator = (DynamicLoadProfileEstimator) estimator;
                if (!optimizedVariables.containsAll(dynamicLoadProfileEstimator.getEmployedVariables())) continue;
                out.println(dynamicLoadProfileEstimator.toJsonConfig(individual));
```

