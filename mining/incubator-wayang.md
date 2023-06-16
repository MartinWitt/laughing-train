# incubator-wayang 
 
# Bad smells
I found 1067 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 175 | false |
| Deprecation | 105 | false |
| FieldMayBeFinal | 104 | false |
| JavadocReference | 87 | false |
| DuplicatedCode | 71 | false |
| JavadocDeclaration | 68 | false |
| UNUSED_IMPORT | 51 | false |
| CommentedOutCode | 40 | false |
| UnusedAssignment | 27 | false |
| DataFlowIssue | 25 | false |
| FieldCanBeLocal | 22 | false |
| UnnecessaryLocalVariable | 18 | true |
| ConstantValue | 16 | false |
| SimplifyStreamApiCallChains | 13 | false |
| RedundantCast | 13 | false |
| SimplifyOptionalCallChains | 10 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| CharsetObjectCanBeUsed | 9 | false |
| InnerClassMayBeStatic | 8 | true |
| ArraysAsListWithZeroOrOneArgument | 8 | false |
| LongLiteralsEndingWithLowercaseL | 7 | false |
| NullableProblems | 7 | false |
| SwitchStatementWithTooFewBranches | 7 | false |
| SillyAssignment | 6 | false |
| IgnoreResultOfCall | 6 | false |
| AccessStaticViaInstance | 6 | false |
| UnnecessarySemicolon | 6 | false |
| MissingSerialAnnotation | 6 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| DuplicateBranchesInSwitch | 5 | false |
| RedundantTypeArguments | 5 | false |
| DeprecatedIsStillUsed | 5 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 5 | false |
| UseBulkOperation | 5 | false |
| ToArrayCallWithZeroLengthArrayArgument | 4 | true |
| WrapperTypeMayBePrimitive | 4 | false |
| FinalStaticMethod | 4 | false |
| ExplicitArrayFilling | 4 | false |
| OptionalAssignedToNull | 4 | false |
| DanglingJavadoc | 4 | false |
| RegExpDuplicateCharacterInClass | 3 | false |
| RedundantStringFormatCall | 3 | false |
| InfiniteRecursion | 3 | false |
| TypeParameterExtendsObject | 3 | false |
| OptionalIsPresent | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| AutoCloseableResource | 3 | false |
| CopyConstructorMissesField | 3 | false |
| PointlessArithmeticExpression | 2 | false |
| EmptyTryBlock | 2 | false |
| EmptyStatementBody | 2 | false |
| FinalPrivateMethod | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| ThrowablePrintedToSystemOut | 2 | false |
| RedundantMethodOverride | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| ListRemoveInLoop | 2 | false |
| AssignmentUsedAsCondition | 2 | false |
| ManualArrayToCollectionCopy | 2 | false |
| CatchMayIgnoreException | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| BusyWait | 2 | false |
| PointlessBooleanExpression | 2 | true |
| IntegerDivisionInFloatingPointContext | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| UnnecessaryModifier | 1 | true |
| MismatchedArrayReadWrite | 1 | false |
| MagicConstant | 1 | false |
| CStyleArrayDeclaration | 1 | false |
| CloneableImplementsClone | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| JavadocLinkAsPlainText | 1 | false |
| MalformedFormatString | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| SlowAbstractSetRemoveAll | 1 | false |
| StringConcatenationInLoops | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| ParameterCanBeLocal | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| TrivialIf | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| ArrayHashCode | 1 | false |
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

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/interfaces/Task.java`
#### Snippet
```java
     * @author [Adeel Aslam]
     */
    public enum TaskStatusForRunning {
        FAILED, SUCCESS, KILLED, SUCCESSFUL,RUNNING,FINISHED, SPECULATIVE;
    }
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
`1 * 1024` can be replaced with '1024'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessReceiver.java`
#### Snippet
```java
        try{
            //TODO use config buffer size
            int BUFFER_SIZE = 1 * 1024;

            DataInputStream stream = new DataInputStream(new BufferedInputStream(socket.getInputStream(), BUFFER_SIZE));
```

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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/InputSlot.java`
#### Snippet
```java
     */
    public void notifyDetached() {
        if (this.isBroadcast) {
            // TODO: Consider removing broadacast.
        }
```

### EmptyStatementBody
`if` statement has empty body
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java

    private void setNameTo(String operatorName, Operator targetOperator) {
        if (targetOperator instanceof Subplan || targetOperator instanceof OperatorAlternative) {
            // Minor: Propagate names to subplans.
        } else if (targetOperator instanceof ActualOperator && targetOperator instanceof OperatorBase) {
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

## RuleId[id=CommentedOutCode]
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
Commented out code (2 lines)
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java

        if(this.iteration_generate <= expanded){
            //final ExecutionLineageNode executionLineageNode = new ExecutionLineageNode(operatorContext);
            //executionLineageNode.addAtomicExecutionFromOperatorContext();

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

### CommentedOutCode
Commented out code (2 lines)
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        taskGettingResult.setDurationTime(taskInfo.duration());
       taskGettingResult.setGettingTime(taskInfo.gettingResultTime());
        //  this. taskGettingResult.setStageID(taskGettingResult.stageId());
       // this.taskGettingResult.setPartition(taskInfo.partitionId());
        if(taskInfo.failed()){
```

### CommentedOutCode
Commented out code (2 lines)
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        taskEnd.setDurationTime(taskInfo.duration());
        taskEnd.setGettingTime(taskInfo.gettingResultTime());
        //  this. taskGettingResult.setStageID(taskGettingResult.stageId());
        //this.taskEnd.setPartition(taskInfo.partitionId());
        if(taskInfo.failed()){
```

### CommentedOutCode
Commented out code (4 lines)
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
         applicationStart.setStartTime(applicationStartSpark.time());
        this.applicationObjects.add((SerializableObject) applicationStart);
        // this.jobObjects.add((SerializableObject) this.applicationStart);
        // this.stageObjects.add((SerializableObject) this.applicationStart);
        // this.taskObjects.add((SerializableObject) this.applicationStart);
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`Bitmask` is 'Cloneable' but does not define 'clone()' method
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Bitmask.java`
#### Snippet
```java
 * A mutable bit-mask.
 */
public class Bitmask implements Cloneable, Iterable<Integer> {

    /**
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

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcFilterOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return String.format("wayang.%s.filter.load", this.getPlatform().getPlatformId());
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcTableSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return String.format("wayang.%s.tablesource.load", this.getPlatform().getPlatformId());
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/operators/JdbcProjectionOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return String.format("wayang.%s.projection.load", this.getPlatform().getPlatformId());
    }
```

### Deprecation
'closeQuietly(java.io.InputStream)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
            throw new WayangException("Could not load configuration.", e);
        } finally {
            IOUtils.closeQuietly(configInputStream);
        }
    }
```

### Deprecation
'closeQuietly(java.io.Reader)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileUtils.java`
#### Snippet
```java
                } finally {
                    if (this.next == null) {
                        IOUtils.closeQuietly(reader);
                    }
                }
```

### Deprecation
'URL(java.lang.String)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
        if (!urlAsString.startsWith("file:")) return false;
        try {
            URL url = new URL(urlAsString);
            return url.getProtocol().equals("file") &&
                    (url.getHost().equals("") || url.getHost().equals("localhost"));
```

### Deprecation
'URL(java.lang.String)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/LocalFileSystem.java`
#### Snippet
```java
    private static File toFile(String fileUrl) throws URISyntaxException, MalformedURLException {
        if (fileUrl.startsWith("file:")) {
            return new File(new URL(fileUrl).toURI());
        } else {
            logger.warn("Expect URLs, but got {}. Converting it to file:{}...", fileUrl, fileUrl);
```

### Deprecation
'newInstance()' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
    public static <T> T instantiateDefault(Class<? extends T> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new WayangException("Could not instantiate class.", e);
```

### Deprecation
'newInstance()' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
            @SuppressWarnings("unchecked") // Will fail anyway, if incorrect.
                    Class<T> cls = (Class<T>) Class.forName(className);
            return cls.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new WayangException("Could not instantiate class.", e);
```

### Deprecation
'PlanTraversal(boolean, boolean)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
        if (subplan.isSink()) {
            final Collection<Operator> inputOperators = subplan.collectInputOperators();
            return new PlanTraversal(false, true)
                    .withCallback(callback)
                    .traverse(inputOperators);
```

### Deprecation
'PlanTraversal(boolean, boolean)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
        } else {
            final Collection<Operator> outputOperators = subplan.collectOutputOperators();
            return new PlanTraversal(true, false)
                    .withCallback(callback)
                    .traverse(outputOperators);
```

### Deprecation
'PlanTraversal(boolean, boolean)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
    public boolean checkFlatAlternatives() {
        AtomicBoolean testOutcome = new AtomicBoolean(true);
        new PlanTraversal(true, false)
                .withCallback(this.getFlatAlternativeCallback(testOutcome))
                .traverse(this.wayangPlan.getSinks());
```

### Deprecation
'newInstance()' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationUtils.java`
#### Snippet
```java
    public static <T extends PlanEnumerationPruningStrategy> T createPruningStrategy(Class<T> strategyClass, Configuration configuration) {
        try {
            final T strategy = strategyClass.newInstance();
            strategy.configure(configuration);
            return strategy;
```

### Deprecation
'closeQuietly(java.io.Writer)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
     */
    public Stream<PartialExecution> stream() throws IOException {
        IOUtils.closeQuietly(this.writer);
        this.writer = null;
        final PartialExecution.Serializer serializer = new PartialExecution.Serializer(this.configuration);
```

### Deprecation
'closeQuietly(java.io.Writer)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
    @Override
    public void close() throws Exception {
        IOUtils.closeQuietly(this.writer);
    }
}
```

### Deprecation
'closeQuietly(java.io.Writer)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/CardinalityRepository.java`
#### Snippet
```java
            writer.write('\n');
        } catch (IOException e) {
            IOUtils.closeQuietly(this.writer);
            throw new RuntimeException("Could not open cardinality repository file for writing.", e);
        }
```

### Deprecation
'closeQuietly(java.io.Writer)' is deprecated
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/CardinalityRepository.java`
#### Snippet
```java
     */
    public void sleep() {
        IOUtils.closeQuietly(this.writer);
        this.writer = null;
    }
```

### Deprecation
'createGroupedReduce(org.apache.wayang.core.function.ReduceDescriptor, org.apache.wayang.core.types.DataSetType\>, org.apache.wayang.core.types.DataSetType)' is deprecated
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/mapping/ReduceByMapping.java`
#### Snippet
```java
        final OperatorPattern reducePattern = new OperatorPattern(
                "reduce",
                ReduceOperator.createGroupedReduce(
                        null,
                        DataSetType.groupedNone(),
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaFilterOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.filter.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaGlobalReduceOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.globalreduce.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaReduceByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.reduceby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.tsvfilesink.load";
    }
```

### Deprecation
'closeQuietly(java.io.Closeable)' is deprecated
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
            } catch (IOException | ClassNotFoundException e) {
                this.nextElements = null;
                IOUtils.closeQuietly(this);
                throw new WayangException("Reading failed.", e);
            }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.objectfilesource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaUnionAllOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.union.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaSortOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.sort.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaFlatMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.flatmap.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.objectfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCountOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.count.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCollectOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.collect.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLocalCallbackSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.localcallbacksink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLoopOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.loop.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaMaterializedGroupByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.groupby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaGlobalMaterializedGroupOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.globalgroup.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCollectionSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.collectionsource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDoWhileOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.while.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTextFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.textfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaMapPartitionsOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.mappartitions.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRepeatOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.repeat.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.map.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDistinctOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.distinct.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.tsvfilesource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/graph/JavaPageRankOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.java.pagerank.load";
    }
```

### Deprecation
'exec(java.lang.String)' is deprecated
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java

    String command = "rm -r "+output;
    Process process = Runtime.getRuntime().exec(command);

    long pre = System.currentTimeMillis();
```

### Deprecation
'exec(java.lang.String)' is deprecated
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java
    switch (platform){
      case "so":
        Runtime.getRuntime().exec(
            String.format(
                "grep \"six\" %s > %s",
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFilterOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.filter.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkZipWithIdOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.zipwithid.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.flatmap.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.tsvfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.objectfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCollectionSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.collect.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLocalCallbackSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.localcallbacksink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.repeat.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDistinctOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.distinct.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.map.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkGlobalReduceOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.globalreduce.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkReduceByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.reduceby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCollectionSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.collectionsource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMaterializedGroupByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.groupby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkGlobalMaterializedGroupOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.globalgroup.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSortOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.sort.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCountOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.count.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDoWhileOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.while.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.repeat.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkIntersectOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.intersect.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapPartitionsOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.mappartitions.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCartesianOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.cartesian.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkGroupByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.groupby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
    }

    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.sample.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkJoinOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.join.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.loop.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkUnionAllOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.union.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.flink.objectfilesource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkBernoulliSampleOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.bernoulli-sample.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTsvFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.tsvfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkBroadcastOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.broadcast.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLocalCallbackSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.localcallbacksink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCountOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.count.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkUnionAllOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.union.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkFlatMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.flatmap.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkObjectFileSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.objectfilesource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTsvFileSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.tsvfilesource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLoopOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.loop.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTextFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.textfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkReduceByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.reduceby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkZipWithIdOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.zipwithid.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.map.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkFilterOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.filter.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCollectOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.collect.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCacheOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.cache.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMaterializedGroupByOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.groupby.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkIntersectOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.intersect.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkDoWhileOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.while.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapPartitionsOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.mappartitions.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkJoinOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.join.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkDistinctOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.distinct.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkSortOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.sort.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkGlobalReduceOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.globalreduce.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRepeatOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.repeat.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCartesianOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.cartesian.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCollectionSource.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.collectionsource.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkObjectFileSink.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.objectfilesink.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkGlobalMaterializedGroupOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.globalgroup.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCoGroupOperator.java`
#### Snippet
```java

    @Override
    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.cogroup.load";
    }
```

### Deprecation
Overrides deprecated method in 'org.apache.wayang.core.plan.wayangplan.ExecutionOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
    }

    public String getLoadProfileEstimatorConfigurationKey() {
        return "wayang.spark.random-partition-sample.load";
    }
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

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'time' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorRemoved.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

### SillyAssignment
Variable 'time' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorUpdated.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

### SillyAssignment
Variable 'status' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/StageSubmitted.java`
#### Snippet
```java
    @Override
    public void setStatus(String Status) {
        this.status=status;
    }

```

### SillyAssignment
Variable 'status' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/StageExecutorMetrics.java`
#### Snippet
```java
    @Override
    public void setStatus(String Status) {
        this.status=status;
    }

```

### SillyAssignment
Variable 'status' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/StageCompleted.java`
#### Snippet
```java
    @Override
    public void setStatus(String Status) {
        this.status=status;
    }

```

### SillyAssignment
Variable 'time' is assigned to itself
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorAdded.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            final Collection<InputType0> collection = ((CollectionChannel.Instance) inputs[0]).provideCollection();
            final Stream<InputType1> stream = ((JavaChannelInstance) inputs[1]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e1 -> collection.stream().map(
                            e0 -> new Tuple2<>(e0, e1)
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            final Stream<InputType0> stream = ((JavaChannelInstance) inputs[0]).provideStream();
            final Collection<InputType1> collection = ((CollectionChannel.Instance) inputs[1]).provideCollection();
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e0 -> collection.stream().map(
                            e1 -> new Tuple2<>(e0, e1)
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            final Collection<InputType0> collection = (Collection<InputType0>) ((JavaChannelInstance) inputs[0]).provideStream().collect(Collectors.toList());
            final Stream<InputType1> stream = ((JavaChannelInstance) inputs[1]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e1 -> collection.stream().map(
                            e0 -> new Tuple2<>(e0, e1)
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            final Collection<InputType1> collection = (Collection<InputType1>) ((JavaChannelInstance) inputs[1]).provideStream().collect(Collectors.toList());
            final Stream<InputType0> stream = ((JavaChannelInstance) inputs[0]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e0 -> collection.stream().map(
                            e1 -> new Tuple2<>(e0, e1)
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIESelfJoinOperator.java`
#### Snippet
```java
        }

        outputChannel.<org.apache.wayang.basic.data.Tuple2<Input, Input>>accept(result2.stream());

        return ExecutionOperator.modelEagerExecution(inputs, outputs, operatorContext);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/LimitedInputStream.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int trimmedLen = this.getMaxBytesToRead(len);
        if (trimmedLen == -1) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.entries.keySet().containsAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.removeAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException("#retainAll() is not implemented");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return this.entries.keySet().toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java

        @Override
        public void write(byte[] b, int off, int len) throws IOException {

            for (int remainingLength = len, offset = off; remainingLength > 0;) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java

        @Override
        public void write(byte[] b) throws IOException {
            this.write(b, 0, b.length);
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Random16.java`
#### Snippet
```java
 * sizes and good lattice structure", Mathematics of Computation, 68
 * pp. 249 - 260 (1999)
 * http://www.ams.org/mcom/1999-68-225/S0025-5718-99-00996-5/S0025-5718-99-00996-5.pdf
 * The constant "c" meets the simple suggestion by the same reference that
 * it be odd.
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rel/WayangTableScan.java`
#### Snippet
```java
public class WayangTableScan extends TableScan implements WayangRel {

    private final int[] fields;

    public WayangTableScan(RelOptCluster cluster,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/JuelUtils.java`
#### Snippet
```java
        private final Map<String, Argument> arguments = new HashMap<>();

        private final ExpressionFactoryImpl expressionFactory;

        private final SimpleContext context;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
         * The hosting {@link ExecutionStageLoopContext}.
         */
        private final ExecutionStageLoopContext loopContext;

        /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
public class ExecutionLog implements AutoCloseable {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java

    private Socket socket;
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> input;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
    private Configuration configuration;

    private Job job;

    private GiraphConfiguration giraphConfiguration;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
    private final GiraphPlatform platform;

    private Configuration configuration;

    private Job job;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaReservoirSampleOperator.java`
#### Snippet
```java
        implements JavaExecutionOperator {

    private Random rand;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java
        implements JavaExecutionOperator {

    private Random rand;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/execution/GraphChiExecutor.java`
#### Snippet
```java
    private final GraphChiPlatform platform;

    private final Configuration configuration;

    private final Job job;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/execution/GraphChiExecutor.java`
#### Snippet
```java
    private final Configuration configuration;

    private final Job job;

    public GraphChiExecutor(GraphChiPlatform platform, Job job) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/DummyMap.java`
#### Snippet
```java
    public final Class<InputType>  inputTypeClass;
    public final Class<OutputType> outputTypeClass;
    private final TypeInformation<InputType>  typeInformationInput;
    private final TypeInformation<OutputType> typeInformationOutput;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
public class FlinkExecutionContext implements ExecutionContext, Serializable {

    private transient FlinkExecutionOperator operator;

    private transient final ChannelInstance[] inputs;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
    private transient FlinkExecutionOperator operator;

    private transient final ChannelInstance[] inputs;

    private transient int iterationNumber;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java

    /** The block size to use. */
    private long blockSize = NATIVE_BLOCK_SIZE;

    private transient WayangFileOutputFormat.BlockBasedOutput blockBasedOutput;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java
        DataSet<String> map = input.<Type>provideDataSet()
                .map(new MapFunction<Type, String>() {
                    private Type dataQuantum;

                    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatOperator.java`
#### Snippet
```java
     * Keeps track of the current iteration number.
     */
    private int iterationCounter;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java
    private final SparkExecutionContext executionContext;

    private boolean isFirstRun = true;

    public ExtendedPredicateAdapater(PredicateDescriptor.ExtendedSerializablePredicate<Type> extendedFunction,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ApplicationEnd.java`
#### Snippet
```java
    private String id;
    private String sparkUser;
    private String eventName;
    private List<Job> listOfJobs;
    @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
        implements SparkExecutionOperator {

    private Random rand;

    private int partitionID = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/StageSubmitted.java`
#### Snippet
```java
    private String executorID;
    private List<Task> listOfTasks;
    private int stageAttemptID;
    private long stageSubmissionTime;
    public TaskMetric getTaskMetric() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
        implements SparkExecutionOperator {

    private Random rand;

    private int nb_partitions = 0;
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

## RuleId[id=IgnoreResultOfCall]
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
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/JDBCStorage.java`
#### Snippet
```java
    @Override
    public void save(Collection<Experiment> experiments) throws IOException {
        this.file.getAbsoluteFile().getParentFile().mkdirs();
        try (FileOutputStream fos = new FileOutputStream(this.file, false)) {
            this.save(experiments, fos);
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

## RuleId[id=SimplifyOptionalCallChains]
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
    public void load(String configurationUrl) {
        final Optional<FileSystem> fileSystem = FileSystems.getFileSystem(configurationUrl);
        if (!fileSystem.isPresent()) {
            throw new WayangException(String.format("Could not access %s.", configurationUrl));
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
Unused import `import org.apache.wayang.core.util.Tuple;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java
import org.apache.wayang.core.function.FunctionDescriptor;
import org.apache.wayang.core.plan.wayangplan.Operator;
import org.apache.wayang.core.util.Tuple;
import scala.Tuple1;

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
Unused import `import org.apache.wayang.api.sql.calcite.utils.ModelParser;`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rel/WayangTableScan.java`
#### Snippet
```java
import org.apache.calcite.schema.Table;
import org.apache.wayang.api.sql.calcite.convention.WayangConvention;
import org.apache.wayang.api.sql.calcite.utils.ModelParser;

import java.util.List;
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
Unused import `import org.apache.wayang.spark.monitoring.interfaces.Stage;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
import org.apache.spark.scheduler.*;
import org.apache.spark.scheduler.cluster.ExecutorInfo;
import org.apache.wayang.spark.monitoring.interfaces.Stage;
import org.apache.wayang.spark.monitoring.interfaces.Task;
import org.apache.wayang.spark.monitoring.interfaces.*;
```

### UNUSED_IMPORT
Unused import `import org.apache.wayang.spark.monitoring.interfaces.Task;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
import org.apache.spark.scheduler.cluster.ExecutorInfo;
import org.apache.wayang.spark.monitoring.interfaces.Stage;
import org.apache.wayang.spark.monitoring.interfaces.Task;
import org.apache.wayang.spark.monitoring.interfaces.*;
import scala.collection.Seq;
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

## RuleId[id=ListRemoveInLoop]
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

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
        // Bring the lingering and former siblings into a consistent state.
        for (Channel sibling : this.siblings) {
            sibling.siblings.removeAll(removedSiblings);
        }
        for (Channel removedSibling : removedSiblings) {
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/List2AttributesObjectSkinny.java`
#### Snippet
```java
        String output = "";
        for (int i = 0; i < list1.length; i++) {
            output = output + "(" + list1[i].toString() + "),";
        }
        return output;
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `convert()` recurses infinitely, and can only end by throwing an exception
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rules/WayangRules.java`
#### Snippet
```java
        }

        public RelNode convert(RelNode rel) {
            final LogicalProject project = (LogicalProject) rel;
            return new WayangProject(
```

### InfiniteRecursion
Method `convert()` recurses infinitely, and can only end by throwing an exception
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rules/WayangRules.java`
#### Snippet
```java

        @Override
        public RelNode convert(RelNode rel) {
            final LogicalFilter filter = (LogicalFilter) rel;
            return new WayangFilter(
```

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

## RuleId[id=UnusedAssignment]
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
Variable `numExpectedIterations` initializer `0` is redundant
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/LoopOperator.java`
#### Snippet
```java
    protected final PredicateDescriptor<Collection<ConvergenceType>> criterionDescriptor;

    private Integer numExpectedIterations = 0;

    private State state;
```

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
Variable `iteration_generate` initializer `0` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
    private int iterationCounter = 0;

    private int iteration_generate = 0;

    private int iteration_expanded = 0;
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
    }

    private <T extends Object> SparkCollectionSourceProfiler(ArrayList<T> collection,
                                                             Configuration configuration,
                                                             Supplier<T> dataQuantumGenerator,
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

## RuleId[id=ConstantValue]
### ConstantValue
Value `node` is always 'null'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangRelConverter.java`
#### Snippet
```java
        if(node instanceof WayangTableScan) {
            return new WayangTableScanVisitor(this).visit((WayangTableScan)node);
        } else if (node instanceof WayangProject) {
            return new WayangProjectVisitor(this).visit((WayangProject) node);
        } else if (node instanceof WayangFilter) {
```

### ConstantValue
Value `node` is always 'null'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangRelConverter.java`
#### Snippet
```java
        } else if (node instanceof WayangProject) {
            return new WayangProjectVisitor(this).visit((WayangProject) node);
        } else if (node instanceof WayangFilter) {
            return new WayangFilterVisitor(this).visit((WayangFilter) node);
        } else if (node instanceof WayangJoin) {
```

### ConstantValue
Value `node` is always 'null'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangRelConverter.java`
#### Snippet
```java
        } else if (node instanceof WayangFilter) {
            return new WayangFilterVisitor(this).visit((WayangFilter) node);
        } else if (node instanceof WayangJoin) {
            return new WayangJoinVisitor(this).visit((WayangJoin) node);
        }
```

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
`Optional.get()` without 'isPresent()' check
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java

    public boolean getBooleanProperty(String key) {
        return this.getOptionalBooleanProperty(key).get();
    }

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
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java
            final Map<String, OperatorMatch> operatorMatches = subplanMatch.getOperatorMatches();
            Validate.isTrue(operatorMatches.size() == 1);
            final OperatorMatch operatorMatch = operatorMatches.values().stream().findFirst().get();
            final Operator matchedOperator = operatorMatch.getOperator();

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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `completedThreads`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
            // Increment a global variable of completed threads
            // As long as the variable is volatile so there is no concern of race condition
            CrossPlatformExecutor.this.completedThreads++;

            // Notify thread ended
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
    public OptionalLong getOptionalLongProperty(String key) {
        final Optional<String> longValue = this.properties.optionallyProvideFor(key);
        if (longValue.isPresent()) {
            return OptionalLong.of(Long.valueOf(longValue.get()));
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.operators.MapOperator' to 'org.apache.wayang.basic.operators.MapOperator,org.apache.wayang.basic.data.Record\>'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java

        //TODO: create a map with specific dataset type
        MapOperator<Tuple2<Record, Record>, Record> projection = new MapOperator(
                new MapFunctionImpl(projects),
                Record.class,
```

### UNCHECKED_WARNING
Unchecked call to 'MapOperator(SerializableFunction, Class, Class)' as a member of raw type 'org.apache.wayang.basic.operators.MapOperator'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangProjectVisitor.java`
#### Snippet
```java

        //TODO: create a map with specific dataset type
        MapOperator<Tuple2<Record, Record>, Record> projection = new MapOperator(
                new MapFunctionImpl(projects),
                Record.class,
```

### UNCHECKED_WARNING
Unchecked call to 'JavaCSVTableSource(String, DataSetType, List)' as a member of raw type 'org.apache.wayang.api.sql.sources.fs.JavaCSVTableSource'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java

            if (Objects.equals(separator, "")) {
                return new JavaCSVTableSource(url,
                        DataSetType.createDefault(Record.class), fieldTypes);
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'JavaCSVTableSource(String, DataSetType, List, char)' as a member of raw type 'org.apache.wayang.api.sql.sources.fs.JavaCSVTableSource'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangTableScanVisitor.java`
#### Snippet
```java
                        DataSetType.createDefault(Record.class), fieldTypes);
            } else {
                return new JavaCSVTableSource(url,
                        DataSetType.createDefault(Record.class), fieldTypes, separator.charAt(0));
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.operators.MapOperator' to 'org.apache.wayang.basic.operators.MapOperator'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java

        // Join returns Tuple2 - map to a Record
        MapOperator<Tuple2, Record> mapOperator = new MapOperator(
                new MapFunctionImpl(),
                Tuple2.class,
```

### UNCHECKED_WARNING
Unchecked call to 'MapOperator(SerializableFunction, Class, Class)' as a member of raw type 'org.apache.wayang.basic.operators.MapOperator'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java

        // Join returns Tuple2 - map to a Record
        MapOperator<Tuple2, Record> mapOperator = new MapOperator(
                new MapFunctionImpl(),
                Tuple2.class,
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.operators.FilterOperator' to 'org.apache.wayang.basic.operators.FilterOperator'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        RexNode condition = ((Filter) wayangRelNode).getCondition();

        FilterOperator<Record> filter = new FilterOperator(
                new FilterPredicateImpl(condition),
                Record.class
```

### UNCHECKED_WARNING
Unchecked call to 'FilterOperator(SerializablePredicate, Class)' as a member of raw type 'org.apache.wayang.basic.operators.FilterOperator'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        RexNode condition = ((Filter) wayangRelNode).getCondition();

        FilterOperator<Record> filter = new FilterOperator(
                new FilterPredicateImpl(condition),
                Record.class
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java

        private boolean isLessThan(Object o, RexLiteral rexLiteral) {
            return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) < 0;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        private boolean isEqualTo(Object o, RexLiteral rexLiteral) {
            try {
                return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) == 0;
            } catch (Exception e) {
                throw new IllegalStateException("Predicate not supported yet");
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangFilterVisitor.java`
#### Snippet
```java
        private boolean isGreaterThan(Object o, RexLiteral rexLiteral) {
//            return rexLiteral.getValue().compareTo(o)< 0;
            return ((Comparable)o).compareTo(rexLiteral.getValueAs(o.getClass())) > 0;

        }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.basic.data.Record' to 'T'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
                objects[i] = CsvRowConverter.convert(fieldTypes.get(i), tokens[i]);
            }
            return (T) new Record(objects);
        } catch (IOException e) {
            System.out.println(e.getMessage());
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
     */
    public JavaCSVTableSource(String sourcePath, DataSetType type, List<RelDataType> fieldTypes, char separator) {
        super(type);
        this.sourcePath = sourcePath;
        this.fieldTypes = fieldTypes;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java

    public JavaCSVTableSource(String sourcePath, DataSetType type, List<RelDataType> fieldTypes) {
        super(type);
        this.sourcePath = sourcePath;
        this.fieldTypes = fieldTypes;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.api.configuration.CollectionProvider' to 'org.apache.wayang.core.api.configuration.CollectionProvider'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/CollectionProvider.java`
#### Snippet
```java
    public CollectionProvider(Configuration configuration, CollectionProvider parent) {
        this.configuration = configuration;
        this.parent = parent;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.core.plan.wayangplan.Slot\>' to 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java

    public <T> OutputSlot<T> resolveUpstream(OutputSlot<T> source) {
        return (OutputSlot<T>) this.upstreamMapping.get(source);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
            for (Entry<Slot<?>, Slot<?>> slotSlotEntry : this.upstreamMapping.entrySet()) {
                Object key = slotSlotEntry.getKey();
                map.computeIfAbsent(slotSlotEntry.getValue(), k -> new LinkedList<Object>())
                    .add(key);
            }
            this.downstreamMapping = map;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection' to 'java.util.Collection\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
            this.logger.warn("Trying to resolve (downstream) an OutputSlot with occupiers.");
        }
        return (Collection<OutputSlot<T>>) this.getOrCreateDownstreamMapping().getOrDefault(source, Collections.emptyList());
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.plan.wayangplan.OutputSlot' to 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
                    final OutputSlot allegedThisOuterOutputSlot = thatOuterInputSlot.getOccupant();
                    if (allegedThisOuterOutputSlot == null) return;
                    final OutputSlot thisInnerOutputSlot = this.resolveUpstream(allegedThisOuterOutputSlot);
                    if (thisInnerOutputSlot == null) return;
                    final InputSlot thatInnerInputSlot = (InputSlot) entry.getKey();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection' to 'java.util.Collection\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java

    public <T> Collection<InputSlot<T>> resolveDownstream(InputSlot<T> source) {
        return (Collection<InputSlot<T>>) this.getOrCreateDownstreamMapping().getOrDefault(source, Collections.emptyList());
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.core.plan.wayangplan.Slot\>' to 'org.apache.wayang.core.plan.wayangplan.InputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
            this.logger.warn("Trying to resolve (upstream) an InputSlot with an occupant.");
        }
        return (InputSlot<T>) this.upstreamMapping.get(source);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Queue' to 'java.util.Queue\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java
                final ActivatorType activator = activators.poll();
                // Without this double-cast, we run into a compiler bug: https://bugs.openjdk.java.net/browse/JDK-8131744
                activator.process((Queue<Activator<ActivationType>>) (Queue) activators);
            } while (!activators.isEmpty());
        } catch (AbortException e) {
```

### UNCHECKED_WARNING
Unchecked assignment: '? extends org.apache.wayang.core.plan.wayangplan.traversal.AbstractTopologicalTraversal.Activator' to 'org.apache.wayang.core.plan.wayangplan.traversal.AbstractTopologicalTraversal.Activator'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java

            for (TActivation activation : successorActivations) {
                final Activator<TActivation> activator = activation.getTargetActivator();
                activator.accept(activation);
                if (activator.isActivationComplete()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.core.plan.wayangplan.OutputSlot\>' to 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
        outputSlots
                .filter(this.outputFollowPredicate)
                .map(outputSlot -> ((OutputSlot<Object>) outputSlot).getOccupiedSlots())
                .flatMap(Collection::stream)
                .filter(inputSlot -> inputSlot != null)
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionPlan.java`
#### Snippet
```java

            // Better way to put sequence number ?
            stageMap.put("sequence_number", allStages.size());
            allStages.add(stageMap);
            for (ExecutionStage successor : stage.getSuccessors()) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        HashMap operator = new HashMap();
        HashMap<String, ArrayList<HashMap<String, Object>>>  jsonConnectsTo = new HashMap<>();
        operator.put("name", task.getOperator().getName());
        operator.put("is_terminal", this.terminalTasks.contains(task) ? 1:0);
        operator.put("is_start", this.startTasks.contains(task) ? 1:0);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        HashMap<String, ArrayList<HashMap<String, Object>>>  jsonConnectsTo = new HashMap<>();
        operator.put("name", task.getOperator().getName());
        operator.put("is_terminal", this.terminalTasks.contains(task) ? 1:0);
        operator.put("is_start", this.startTasks.contains(task) ? 1:0);
        operator.put("java_class", task.getOperator().getClass().getName());
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        operator.put("name", task.getOperator().getName());
        operator.put("is_terminal", this.terminalTasks.contains(task) ? 1:0);
        operator.put("is_start", this.startTasks.contains(task) ? 1:0);
        operator.put("java_class", task.getOperator().getClass().getName());

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
        operator.put("is_terminal", this.terminalTasks.contains(task) ? 1:0);
        operator.put("is_start", this.startTasks.contains(task) ? 1:0);
        operator.put("java_class", task.getOperator().getClass().getName());

        /*
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
            "connects_to": {"0": [{"via": "CollectionChannel", "javaFlatMapOperator": 0}]}
         */
        operator.put("connects_to", jsonConnectsTo);
        operators.add(operator);

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
         */
        operator.put("connects_to", jsonConnectsTo);
        operators.add(operator);

        for (Channel channel : task.getOutputChannels()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataUnitType' to 'org.apache.wayang.core.types.DataUnitType'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/types/DataUnitGroupType.java`
#### Snippet
```java

    protected DataUnitGroupType(DataUnitType baseType) {
        this.baseType = baseType;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.core.plan.wayangplan.Operator' to 'MatchedOperator'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/ReplacementSubplanFactory.java`
#### Snippet
```java

            // Create a replacement Operator and align the InputSlots.
            final Operator replacementOperator = this.replacementFactory.apply((MatchedOperator) matchedOperator, epoch);
            for (int inputIndex = matchedOperator.getNumRegularInputs(); inputIndex < matchedOperator.getNumInputs(); inputIndex++) {
                final InputSlot<?> broadcastInput = matchedOperator.getInput(inputIndex);
```

### UNCHECKED_WARNING
Unchecked call to 'disconnectFrom(InputSlot)' as a member of raw type 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
            final OutputSlot occupant = originalInputSlot.getOccupant();
            if (occupant != null) {
                occupant.disconnectFrom(originalInputSlot);
                occupant.connectTo(replacement.getInput(inputIndex));
            }
```

### UNCHECKED_WARNING
Unchecked call to 'connectTo(InputSlot)' as a member of raw type 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
            if (occupant != null) {
                occupant.disconnectFrom(originalInputSlot);
                occupant.connectTo(replacement.getInput(inputIndex));
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'. Reason: 'originalOutputSlot' has raw type, so result of getOccupiedSlots is erased
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
        for (int outputIndex = 0; outputIndex < originalOutputOperator.getNumOutputs(); outputIndex++) {
            final OutputSlot originalOutputSlot = originalOutputOperator.getOutput(outputIndex);
            for (InputSlot inputSlot : new ArrayList<InputSlot>(originalOutputSlot.getOccupiedSlots())) {
                originalOutputSlot.disconnectFrom(inputSlot);
                replacement.getOutput(outputIndex).connectTo(inputSlot);
```

### UNCHECKED_WARNING
Unchecked call to 'disconnectFrom(InputSlot)' as a member of raw type 'org.apache.wayang.core.plan.wayangplan.OutputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
            final OutputSlot originalOutputSlot = originalOutputOperator.getOutput(outputIndex);
            for (InputSlot inputSlot : new ArrayList<InputSlot>(originalOutputSlot.getOccupiedSlots())) {
                originalOutputSlot.disconnectFrom(inputSlot);
                replacement.getOutput(outputIndex).connectTo(inputSlot);
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.plan.wayangplan.InputSlot' to 'org.apache.wayang.core.plan.wayangplan.InputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/PlanTransformation.java`
#### Snippet
```java
            for (InputSlot inputSlot : new ArrayList<InputSlot>(originalOutputSlot.getOccupiedSlots())) {
                originalOutputSlot.disconnectFrom(inputSlot);
                replacement.getOutput(outputIndex).connectTo(inputSlot);
            }
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'. Reason: 'stage' has raw type, so result of get is erased
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/monitor/FileMonitor.java`
#### Snippet
```java
        HashMap<String, Integer> initialProgress = new HashMap<>();
        for (Map stage: initialExecutionPlan) {
            for (Map operator: (List<Map>)stage.get("operators")) {
                initialProgress.put((String)operator.get("name"), 0);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'Output'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
                stream.readFully(obj);
                String s = new String(obj, StandardCharsets.UTF_8);
                Output it = (Output) s;
                return it;
            } else if (length == END_OF_DATA_SECTION) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'outputSlot' has raw type, so result of getOccupiedSlots is erased
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
        for (OutputSlot outputSlot : outputOperator.getAllOutputs()) {
            if (outputSlotPredicate.test(outputSlot)) {
                List<InputSlot> inputSlots = outputSlot.getOccupiedSlots();
                if (inputSlots.isEmpty()) {
                    inputSlots = Collections.singletonList(null); // InputSlot is probably in a surrounding plan.
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,org.apache.wayang.core.plan.wayangplan.InputSlot\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                }
                for (InputSlot inputSlot : inputSlots) {
                    instance.servingOutputSlots.add(new Tuple<>(outputSlot, inputSlot));
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                }
                for (InputSlot inputSlot : inputSlots) {
                    instance.servingOutputSlots.add(new Tuple<>(outputSlot, inputSlot));
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.plan.wayangplan.InputSlot' to 'org.apache.wayang.core.plan.wayangplan.InputSlot'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
        // Escape the input slots.
        for (InputSlot inputSlot : this.requestedInputSlots) {
            final InputSlot escapedInput = alternative.getSlotMapping().resolveUpstream(inputSlot);
            if (escapedInput != null) {
                escapedInstance.requestedInputSlots.add(escapedInput);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'. Reason: 'escapedOutput' has raw type, so result of getOccupiedSlots is erased
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                    alternative.getSlotMapping().resolveDownstream(link.field0.unchecked());
            for (OutputSlot escapedOutput : resolvedOutputSlots) {
                final List<InputSlot<?>> occupiedInputs = escapedOutput.getOccupiedSlots();
                if (occupiedInputs.isEmpty()) {
                    escapedInstance.servingOutputSlots.add(new Tuple<>(escapedOutput, null));
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,org.apache.wayang.core.plan.wayangplan.InputSlot\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                final List<InputSlot<?>> occupiedInputs = escapedOutput.getOccupiedSlots();
                if (occupiedInputs.isEmpty()) {
                    escapedInstance.servingOutputSlots.add(new Tuple<>(escapedOutput, null));
                } else {
                    for (InputSlot inputSlot : occupiedInputs) {
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                final List<InputSlot<?>> occupiedInputs = escapedOutput.getOccupiedSlots();
                if (occupiedInputs.isEmpty()) {
                    escapedInstance.servingOutputSlots.add(new Tuple<>(escapedOutput, null));
                } else {
                    for (InputSlot inputSlot : occupiedInputs) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,org.apache.wayang.core.plan.wayangplan.InputSlot\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                } else {
                    for (InputSlot inputSlot : occupiedInputs) {
                        escapedInstance.servingOutputSlots.add(new Tuple<>(escapedOutput, inputSlot));
                    }
                }
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
                } else {
                    for (InputSlot inputSlot : occupiedInputs) {
                        escapedInstance.servingOutputSlots.add(new Tuple<>(escapedOutput, inputSlot));
                    }
                }
```

### UNCHECKED_WARNING
Unchecked call to 'MaterializedGroupByOperator(TransformationDescriptor, DataSetType, DataSetType\>)' as a member of raw type 'org.apache.wayang.basic.operators.MaterializedGroupByOperator'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/mapping/MaterializedGroupByMapping.java`
#### Snippet
```java
            final GroupByOperator groupBy = (GroupByOperator) subplanMatch.getMatch("groupBy").getOperator();

            return new MaterializedGroupByOperator<>(
                    groupBy.getKeyDescriptor(),
                    groupBy.getInputType(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.operators.CollectionSource' to 'org.apache.wayang.core.plan.wayangplan.UnarySource'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java
     */
    public CollectionSource(CollectionSource that) {
        super(that);
        this.collection = that.getCollection();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'. Reason: 'that' has raw type, so result of getCollection is erased
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/CollectionSource.java`
#### Snippet
```java
    public CollectionSource(CollectionSource that) {
        super(that);
        this.collection = that.getCollection();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'CardinalityEstimator(PredicateDescriptor, Configuration)' as a member of raw type 'org.apache.wayang.basic.operators.FilterOperator.CardinalityEstimator'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/FilterOperator.java`
#### Snippet
```java
            final Configuration configuration) {
        Validate.inclusiveBetween(0, this.getNumOutputs() - 1, outputIndex);
        return Optional.of(new FilterOperator.CardinalityEstimator(this.predicateDescriptor, configuration));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                squashedCost.add(this.optimizationContext.getOperatorContext(operator).getSquashedCostEstimate());
                squashedCost.add(.0);
                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                squashedCost.add(this.optimizationContext.getOperatorContext(operator).getSquashedCostEstimate());
                squashedCost.add(.0);
                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                squashedCost.add(.0);
                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            } else if (inputOperators.size() == 1) {
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                squashedCost.add(.0);
                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            } else if (inputOperators.size() == 1) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                        + this.getParallelOperatorJunctionAllCostEstimate(inputOperators.iterator().next()).field1.get(1));

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                        + this.getParallelOperatorJunctionAllCostEstimate(inputOperators.iterator().next()).field1.get(1));

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                        + maxJunctionSquash);

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
                        + maxJunctionSquash);

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.util.Tuple' to 'org.apache.wayang.core.util.Tuple,java.util.List\>\>'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            }
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(T0, T1)' as a member of raw type 'org.apache.wayang.core.util.Tuple'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java

                Tuple<List<ProbabilisticDoubleInterval>, List<Double>> returnedCost = new Tuple(probalisticCost, squashedCost);
                this.calculatedParallelOperatorCostCache.add(new Tuple(operator, returnedCost));
                return returnedCost;
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.operators.ObjectFileSource' to 'org.apache.wayang.core.plan.wayangplan.UnarySource'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
     */
    public ObjectFileSource(ObjectFileSource that) {
        super(that);
        this.inputUrl = that.getInputUrl();
        this.tClass = that.getTypeClass();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'. Reason: 'that' has raw type, so result of getTypeClass is erased
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
        super(that);
        this.inputUrl = that.getInputUrl();
        this.tClass = that.getTypeClass();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'JavaLocalCallbackSink(LocalCallbackSink)' as a member of raw type 'org.apache.wayang.java.operators.JavaLocalCallbackSink'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<LocalCallbackSink>(
                (matchedOperator, epoch) -> new JavaLocalCallbackSink<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sink", new LocalCallbackSink<>(null, DataSetType.none()), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/UnionAllMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "unionAll", new UnionAllOperator<>(DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'JavaUnionAllOperator(UnionAllOperator)' as a member of raw type 'org.apache.wayang.java.operators.JavaUnionAllOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/UnionAllMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<UnionAllOperator>(
                (matchedOperator, epoch) -> new JavaUnionAllOperator(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/TextFileSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new org.apache.wayang.basic.operators.TextFileSource((String) null), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/SortMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sort", new SortOperator<>(null, DataSetType.none()), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'JavaSortOperator(SortOperator)' as a member of raw type 'org.apache.wayang.java.operators.JavaSortOperator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/SortMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<SortOperator>(
                (matchedOperator, epoch) -> new JavaSortOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'JavaObjectFileSource(ObjectFileSource)' as a member of raw type 'org.apache.wayang.java.operators.JavaObjectFileSource'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<ObjectFileSource>(
                (matchedOperator, epoch) -> new JavaObjectFileSource(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
            "source",
            new ObjectFileSource(
```

### UNCHECKED_WARNING
Unchecked call to 'ObjectFileSource(String, Class)' as a member of raw type 'org.apache.wayang.basic.operators.ObjectFileSource'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
        final OperatorPattern operatorPattern = new OperatorPattern(
            "source",
            new ObjectFileSource(
                null,
                DataSetType.none().getDataUnitType().getTypeClass()
```

### UNCHECKED_WARNING
Unchecked call to 'JavaCollectionSource(CollectionSource)' as a member of raw type 'org.apache.wayang.java.operators.JavaCollectionSource'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/CollectionSourceMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<CollectionSource>(
                (matchedOperator, epoch) -> new JavaCollectionSource<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/CollectionSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new CollectionSource(Collections.emptyList(), DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'CollectionSource(Collection, DataSetType)' as a member of raw type 'org.apache.wayang.basic.operators.CollectionSource'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/CollectionSourceMapping.java`
#### Snippet
```java
    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new CollectionSource(Collections.emptyList(), DataSetType.none()), false
        );
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'. Reason: 'this.nextElements_cole' has raw type, so result of get is erased
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
            final T result;
            if(this.nextElements_cole != null){
                result = (T) this.nextElements_cole.get(this.nextIndex);
            }else if (this.nextElements != null) {
                result = (T) this.nextElements[this.nextIndex];
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
                result = (T) this.nextElements_cole.get(this.nextIndex);
            }else if (this.nextElements != null) {
                result = (T) this.nextElements[this.nextIndex];
            }else{
                result = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Spliterator' to 'java.util.Spliterator'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaObjectFileSource.java`
#### Snippet
```java
            sequenceFileIterator = new SequenceFileIterator<>(actualInputPath);
            Stream<?> sequenceFileStream =
                    StreamSupport.stream(Spliterators.spliteratorUnknownSize(sequenceFileIterator, 0), false);
            ((StreamChannel.Instance) outputs[0]).accept(sequenceFileStream);
        } catch (IOException e) {
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaSortOperator.java`
#### Snippet
```java

        ((StreamChannel.Instance) outputs[0]).accept(((JavaChannelInstance) inputs[0]).<Type>provideStream()
                .sorted((e1, e2) -> ((Comparable)keyExtractor.apply(e1)).compareTo(keyExtractor.apply(e2))));

        return ExecutionOperator.modelLazyExecution(inputs, outputs, operatorContext);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaLocalCallbackSink.java`
#### Snippet
```java
     */
    public JavaLocalCallbackSink(Consumer<T> callback, DataSetType type) {
        super(callback, type);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.core.types.DataSetType\>\>' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ReduceOperator.java`
#### Snippet
```java
            DataSetType<? extends Iterable<Type>> inputType,
            DataSetType<Type> outputType) {
        return new ReduceOperator<>(reduceDescriptor, (DataSetType<Type>) inputType, outputType);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java

    public JavaTsvFileSource(String sourcePath, DataSetType type) {
        super(type);
        this.sourcePath = sourcePath;
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Integer' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
        if (tabPos == -1) {
            if (typeClass == Integer.class) {
                return (T) Integer.valueOf(line);
            } else if (typeClass == Float.class) {
                return (T) Float.valueOf(line);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
                return (T) Integer.valueOf(line);
            } else if (typeClass == Float.class) {
                return (T) Float.valueOf(line);
            } else if (typeClass == String.class) {
                return (T) String.valueOf(line);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
                return (T) Float.valueOf(line);
            } else if (typeClass == String.class) {
                return (T) String.valueOf(line);
            } else throw new WayangException(String.format("Cannot parse TSV file line %s", line));
        } else if (typeClass == Record.class) {
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.basic.data.Record' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
        } else if (typeClass == Record.class) {
            // TODO: Fix Record parsing.
            return (T) new Record();
        } else if (typeClass == Tuple2.class) {
            // TODO: Fix Tuple2 parsing
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.basic.data.Tuple2' to 'T'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
        } else if (typeClass == Tuple2.class) {
            // TODO: Fix Tuple2 parsing
            return (T) new Tuple2(
                    Integer.valueOf(line.substring(0, tabPos)),
                    Float.valueOf(line.substring(tabPos + 1)));
        } else
            throw new WayangException(String.format("Cannot parse TSV file line %s", line));
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple2(T0, T1)' as a member of raw type 'org.apache.wayang.basic.data.Tuple2'
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaTsvFileSource.java`
#### Snippet
```java
        } else if (typeClass == Tuple2.class) {
            // TODO: Fix Tuple2 parsing
            return (T) new Tuple2(
                    Integer.valueOf(line.substring(0, tabPos)),
                    Float.valueOf(line.substring(tabPos + 1)));
```

### UNCHECKED_WARNING
Unchecked call to 'JavaCollectionSource(Collection, DataSetType)' as a member of raw type 'org.apache.wayang.java.operators.JavaCollectionSource'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/JavaCollectionSourceProfiler.java`
#### Snippet
```java
    private JavaCollectionSource createOperator() {
        final Object exampleDataQuantum = this.dataQuantumGenerators.get(0).get();
        return new JavaCollectionSource(this.sourceCollection, DataSetType.createDefault(exampleDataQuantum.getClass()));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.ArrayList' to 'java.util.ArrayList'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkCollectionSourceProfiler.java`
#### Snippet
```java
                                                             DataSetType<T> outputType) {
        super(() -> new SparkCollectionSource<>(collection, outputType), configuration, dataQuantumGenerator);
        this.collection = (ArrayList<Object>) collection;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'JavaIESelfJoinOperator(DataSetType, TransformationDescriptor, JoinCondition, TransformationDescriptor, JoinCondition)' as a member of raw type 'org.apache.wayang.iejoin.operators.JavaIESelfJoinOperator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/java/IESelfJoinMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<IESelfJoinOperator>(
                (matchedOperator, epoch) -> new JavaIESelfJoinOperator<>(
                        matchedOperator.getInputType(),
                        matchedOperator.getGet0Pivot(),
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/java/IESelfJoinMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "ieselfjoin", new IESelfJoinOperator<>(DataSetType.none(), null, IEJoinMasterOperator.JoinCondition.GreaterThan, null, IEJoinMasterOperator.JoinCondition.GreaterThan), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'JavaIEJoinOperator(DataSetType, DataSetType, TransformationDescriptor, TransformationDescriptor, JoinCondition, TransformationDescriptor, TransformationDescriptor, ...)' as a member of raw type 'org.apache.wayang.iejoin.operators.JavaIEJoinOperator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/java/IEJoinMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<IEJoinOperator>(
                (matchedOperator, epoch) -> new JavaIEJoinOperator<>(
                        matchedOperator.getInputType0(),
                        matchedOperator.getInputType1(), matchedOperator.getGet0Pivot(), matchedOperator.getGet1Pivot(), matchedOperator.getCond0(), matchedOperator.getGet1Pivot(), matchedOperator.getGet1Ref(), matchedOperator.getCond1()
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/java/IEJoinMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "iejoin", new IEJoinOperator<>(DataSetType.none(), DataSetType.none(), null, null, IEJoinMasterOperator.JoinCondition.GreaterThan, null, null, IEJoinMasterOperator.JoinCondition.GreaterThan), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/spark/IESelfJoinMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "ieselfjoin", new IESelfJoinOperator<>(DataSetType.none(), null, IEJoinMasterOperator.JoinCondition.GreaterThan, null, IEJoinMasterOperator.JoinCondition.GreaterThan), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'SparkIESelfJoinOperator(DataSetType, TransformationDescriptor, JoinCondition, TransformationDescriptor, JoinCondition)' as a member of raw type 'org.apache.wayang.iejoin.operators.SparkIESelfJoinOperator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/spark/IESelfJoinMapping.java`
#### Snippet
```java
        protected Operator translate(SubplanMatch subplanMatch, int epoch) {
            final IESelfJoinOperator<?, ?, ?> originalOperator = (IESelfJoinOperator<?, ?, ?>) subplanMatch.getMatch("ieselfjoin").getOperator();
            return new SparkIESelfJoinOperator(originalOperator.getInputType(), originalOperator.getGet0Pivot(), originalOperator.getCond0(), originalOperator.getGet0Ref(), originalOperator.getCond1()).at(epoch);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
            int dff = 0;
            if (asc1) {
                dff = o1.compareTo(o2);
            } else {
                dff = o2.compareTo(o1);
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
                dff = o1.compareTo(o2);
            } else {
                dff = o2.compareTo(o1);
            }
            // second level of sorting
```

### UNCHECKED_WARNING
Unchecked call to 'compareRank(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
                int dff2 = 0;
                if (asc2) {
                    dff2 = o1.compareRank(o2);
                } else {
                    dff2 = o2.compareRank(o1);
```

### UNCHECKED_WARNING
Unchecked call to 'compareRank(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
                    dff2 = o1.compareRank(o2);
                } else {
                    dff2 = o2.compareRank(o1);
                }
                // third level of sorting
```

### UNCHECKED_WARNING
Unchecked call to 'SparkIEJoinOperator(DataSetType, DataSetType, TransformationDescriptor, TransformationDescriptor, JoinCondition, TransformationDescriptor, TransformationDescriptor, ...)' as a member of raw type 'org.apache.wayang.iejoin.operators.SparkIEJoinOperator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/spark/IEJoinMapping.java`
#### Snippet
```java
        protected Operator translate(SubplanMatch subplanMatch, int epoch) {
            final IEJoinOperator<?, ?, ?> originalOperator = (IEJoinOperator<?, ?, ?>) subplanMatch.getMatch("iejoin").getOperator();
            return new SparkIEJoinOperator(originalOperator.getInputType0(),
                    originalOperator.getInputType1(), originalOperator.getGet0Pivot(), originalOperator.getGet1Pivot(), originalOperator.getCond0(), originalOperator.getGet0Ref(), originalOperator.getGet1Ref(), originalOperator.getCond1()).at(epoch);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/mapping/spark/IEJoinMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "iejoin", new IEJoinOperator<>(DataSetType.none(), DataSetType.none(), null, null, IEJoinMasterOperator.JoinCondition.GreaterThan, null, null, IEJoinMasterOperator.JoinCondition.GreaterThan), false);
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIEJoinOperator.java`
#### Snippet
```java

        for (int i = 0; i < stream0R.length; i++) {
            list0.add(new Tuple2<Data<Type0, Type1>, Input>(new extractData<Type0, Type1, Input>(get0Pivot_, get0Ref_).call((Input) stream0R[i]), (Input) stream0R[i]));
        }
        for (int i = 0; i < stream1R.length; i++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIEJoinOperator.java`
#### Snippet
```java

        for (int i = 0; i < stream0R.length; i++) {
            list0.add(new Tuple2<Data<Type0, Type1>, Input>(new extractData<Type0, Type1, Input>(get0Pivot_, get0Ref_).call((Input) stream0R[i]), (Input) stream0R[i]));
        }
        for (int i = 0; i < stream1R.length; i++) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIEJoinOperator.java`
#### Snippet
```java
        }
        for (int i = 0; i < stream1R.length; i++) {
            list1.add(new Tuple2<Data<Type0, Type1>, Input>(new extractData<Type0, Type1, Input>(get1Pivot_, get1Ref_).call((Input) stream1R[i]), (Input) stream1R[i]));
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIEJoinOperator.java`
#### Snippet
```java
        }
        for (int i = 0; i < stream1R.length; i++) {
            list1.add(new Tuple2<Data<Type0, Type1>, Input>(new extractData<Type0, Type1, Input>(get1Pivot_, get1Ref_).call((Input) stream1R[i]), (Input) stream1R[i]));
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIESelfJoinOperator.java`
#### Snippet
```java

        for (int i = 0; i < stream0R.length; i++) {
            list0.add(new Tuple2<>(new extractData<>(get0Pivot_, get0Ref_).call((Input) stream0R[i]), (Input) stream0R[i]));
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'Input'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/JavaIESelfJoinOperator.java`
#### Snippet
```java

        for (int i = 0; i < stream0R.length; i++) {
            list0.add(new Tuple2<>(new extractData<>(get0Pivot_, get0Ref_).call((Input) stream0R[i]), (Input) stream0R[i]));
        }

```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i = low; i < high; i++)
                for (int j = i; j > low && c.compare((Tuple2<Data<Type0, Type1>, Input>) dest.get(j - 1), (Tuple2<Data<Type0, Type1>, Input>) dest.get(j)) > 0; j--) {
                    //swap(dest, j, j - 1);
                    java.util.Collections.swap(dest, j, j - 1);
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        // If list is already sorted, just copy from src to dest. This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (c.compare(src.get(mid - 1)._1(), src.get(mid)._1()) <= 0) {
            //System.arraycopy(src, low, dest, destLow, length);
            int jjj = destLow;
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        // Merge sorted halves (now in src) into dest
        for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && c.compare((Tuple2<Data<Type0, Type1>, Input>) src.get(p), (Tuple2<Data<Type0, Type1>, Input>) src.get(q)) <= 0) {
                bDst[i] = bSrc[p];
                dest.set(i, src.get(p++));
```

### UNCHECKED_WARNING
Unchecked call to 'compareRank(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
        int dff = 0;
        if (asc1) {
            dff = o1.compareRank(o2);
        } else {
            dff = o2.compareRank(o1);
```

### UNCHECKED_WARNING
Unchecked call to 'compareRank(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
            dff = o1.compareRank(o2);
        } else {
            dff = o2.compareRank(o1);
        }
        if (dff == 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareTo(o2);
            } else {
                dff2 = o2.compareTo(o1);
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(Data)' as a member of raw type 'org.apache.wayang.iejoin.data.Data'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
                dff2 = o1.compareTo(o2);
            } else {
                dff2 = o2.compareTo(o1);
            }
            // third level of sorting
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i = low; i < high; i++)
                for (int j = i; j > low && c.compare(dest[j - 1], dest[j]) > 0; j--) {
                    swap(dest, j, j - 1);
                    swapp(bDst, j, j - 1);
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
        // If list is already sorted, just copy from src to dest. This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (c.compare(src[mid - 1], src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            System.arraycopy(bSrc, low, bDst, destLow, length);
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/myMergeSort.java`
#### Snippet
```java
        // Merge sorted halves (now in src) into dest
        for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && c.compare(src[p], src[q]) <= 0) {
                bDst[i] = bSrc[p];
                dest[i] = src[p++];
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.iejoin.data.Data\[\]' to 'org.apache.wayang.iejoin.data.Data\[\]'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/List2AttributesObjectSkinny.java`
#### Snippet
```java

    public List2AttributesObjectSkinny(Data[] list1, long partID) {
        this.list1 = list1;
        this.partitionID = partID;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.basic.data.Tuple2' to 'org.apache.wayang.basic.data.Tuple2'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
            normWeights += Math.abs(weights[j]);
        }
        return new Tuple2(normDiff, normWeights);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'Tuple2(T0, T1)' as a member of raw type 'org.apache.wayang.basic.data.Tuple2'
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
            normWeights += Math.abs(weights[j]);
        }
        return new Tuple2(normDiff, normWeights);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'FlinkLocalCallbackSink(LocalCallbackSink)' as a member of raw type 'org.apache.wayang.flink.operators.FlinkLocalCallbackSink'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<LocalCallbackSink>(
                (matchedOperator, epoch) -> new FlinkLocalCallbackSink<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sink", new LocalCallbackSink<>((FunctionDescriptor.SerializableConsumer) null, DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'LocalCallbackSink(SerializableConsumer, DataSetType)' as a member of raw type 'org.apache.wayang.basic.operators.LocalCallbackSink'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java
    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sink", new LocalCallbackSink<>((FunctionDescriptor.SerializableConsumer) null, DataSetType.none()), false
        );
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/PageRankMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "operator", new PageRankOperator(0), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'FlinkTextFileSink(TextFileSink)' as a member of raw type 'org.apache.wayang.flink.operators.FlinkTextFileSink'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/mapping/TextFileSinkMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<TextFileSink<?>>(
                (matchedOperator, epoch) -> new FlinkTextFileSink(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.basic.data.Tuple2,java.lang.Iterable\>' to 'OutputType'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FlinkCoGroupFunction.java`
#### Snippet
```java
    @Override
    public void coGroup(Iterable<InputType0> iterable, Iterable<InputType1> iterable1, Collector<OutputType> collector) throws Exception {
        collector.collect((OutputType) new Tuple2<Iterable<InputType0>, Iterable<InputType1>>(iterable, iterable1));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java
                    Collectors.toList()
        );
        return this.predicate.test(collection);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'WayangValue(T)' as a member of raw type 'org.apache.wayang.flink.compiler.criterion.WayangValue'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangAggregator.java`
#### Snippet
```java

    public void aggregate(Object t){
        this.elements.add(new WayangValue(t));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
        try {
            in = new ObjectInputStream(bis);
            object = (T) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction' to 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
    public <I, O> RichMapFunction<I, O> compile(TransformationDescriptor<I, O> mapDescriptor, FlinkExecutionContext fex ) {

        FunctionDescriptor.ExtendedSerializableFunction<I, O> map = (FunctionDescriptor.ExtendedSerializableFunction) mapDescriptor.getJavaImplementation();
        return new RichMapFunction<I, O>() {
            @Override
```

### UNCHECKED_WARNING
Unchecked call to 'WayangConvergenceCriterion(SerializablePredicate\>)' as a member of raw type 'org.apache.wayang.flink.compiler.criterion.WayangConvergenceCriterion'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FunctionCompiler.java`
#### Snippet
```java
    public <T> WayangConvergenceCriterion compile(PredicateDescriptor<Collection<T>> descriptor){
        FunctionDescriptor.SerializablePredicate<Collection<T>> predicate = descriptor.getJavaImplementation();
        return new WayangConvergenceCriterion(predicate);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction' to 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction\>'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
            RichFlatMapFunction<InputType, OutputType> richFunction = flinkExecutor.compiler
                    .compile(
                            (FunctionDescriptor.ExtendedSerializableFunction)
                                    this.functionDescriptor.getJavaImplementation(),
                            fex
                    );
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLocalCallbackSink.java`
#### Snippet
```java
     */
    public FlinkLocalCallbackSink(ConsumerDescriptor.SerializableConsumer<Type> callback, DataSetType type) {
        super(callback, type);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkIntersectOperator.java`
#### Snippet
```java
        TransformationDescriptor<Type, Type> descriptor = new TransformationDescriptor<Type, Type>(
                type -> type,
                type_class,
                type_class
        );
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkIntersectOperator.java`
#### Snippet
```java
                type -> type,
                type_class,
                type_class
        );

```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sink", new LocalCallbackSink<>(null, DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkLocalCallbackSink(LocalCallbackSink)' as a member of raw type 'org.apache.wayang.spark.operators.SparkLocalCallbackSink'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/LocalCallbackSinkMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<LocalCallbackSink>(
                (matchedOperator, epoch) -> new SparkLocalCallbackSink<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CountMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "count", new CountOperator<>(DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkCountOperator(CountOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkCountOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CountMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<CountOperator>(
                (matchedOperator, epoch) -> new SparkCountOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/TextFileSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new TextFileSource("", null), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkUnionAllOperator(UnionAllOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkUnionAllOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/UnionAllMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<UnionAllOperator>(
                (matchedOperator, epoch) -> new SparkUnionAllOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/MaterializedGroupByMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "operator", new MaterializedGroupByOperator<>(null, DataSetType.none(), DataSetType.groupedNone()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkMaterializedGroupByOperator(MaterializedGroupByOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkMaterializedGroupByOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/MaterializedGroupByMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<MaterializedGroupByOperator>(
                (matchedOperator, epoch) -> new SparkMaterializedGroupByOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/UnionAllMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "unionAll", new UnionAllOperator<>(DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkZipWithIdOperator(ZipWithIdOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkZipWithIdOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ZipWithIdMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<ZipWithIdOperator>(
                (matchedOperator, epoch) -> new SparkZipWithIdOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'SparkIntersectOperator(IntersectOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkIntersectOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/IntersectMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<IntersectOperator>(
                (matchedOperator, epoch) -> new SparkIntersectOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'SparkCartesianOperator(CartesianOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkCartesianOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CartesianMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<CartesianOperator>(
                (matchedOperator, epoch) -> new SparkCartesianOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CartesianMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "cartesian", new CartesianOperator<>(DataSetType.none(), DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkSortOperator(SortOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkSortOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/SortMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<SortOperator>(
                (matchedOperator, epoch) -> new SparkSortOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/SortMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "sort", new SortOperator<>(null, DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/DistinctMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "distinct", new DistinctOperator<>(DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'SparkDistinctOperator(DistinctOperator)' as a member of raw type 'org.apache.wayang.spark.operators.SparkDistinctOperator'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/DistinctMapping.java`
#### Snippet
```java
    private ReplacementSubplanFactory createReplacementSubplanFactory() {
        return new ReplacementSubplanFactory.OfSingleOperators<DistinctOperator>(
                (matchedOperator, epoch) -> new SparkDistinctOperator<>(matchedOperator).at(epoch)
        );
    }
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
            "source",
            new ObjectFileSource(
```

### UNCHECKED_WARNING
Unchecked call to 'ObjectFileSource(String, Class)' as a member of raw type 'org.apache.wayang.basic.operators.ObjectFileSource'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/ObjectFileSourceMapping.java`
#### Snippet
```java
        final OperatorPattern operatorPattern = new OperatorPattern(
            "source",
            new ObjectFileSource(
                null,
                DataSetType.none().getDataUnitType().getTypeClass()
```

### UNCHECKED_WARNING
Unchecked call to 'OperatorPattern(String, T, boolean)' as a member of raw type 'org.apache.wayang.core.mapping.OperatorPattern'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CollectionSourceMapping.java`
#### Snippet
```java

    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new CollectionSource(Collections.emptyList(), DataSetType.none()), false
        );
```

### UNCHECKED_WARNING
Unchecked call to 'CollectionSource(Collection, DataSetType)' as a member of raw type 'org.apache.wayang.basic.operators.CollectionSource'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/CollectionSourceMapping.java`
#### Snippet
```java
    private SubplanPattern createSubplanPattern() {
        final OperatorPattern operatorPattern = new OperatorPattern(
                "source", new CollectionSource(Collections.emptyList(), DataSetType.none()), false
        );
        return SubplanPattern.createSingleton(operatorPattern);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction' to 'org.apache.wayang.core.function.FunctionDescriptor.ExtendedSerializableFunction\>'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFlatMapFunctionAdapter.java`
#### Snippet
```java
    public ExtendedFlatMapFunctionAdapter(FunctionDescriptor.ExtendedSerializableFunction extendedFunction,
                                          SparkExecutionContext sparkExecutionContext) {
        this.impl = extendedFunction;
        this.executionContext = sparkExecutionContext;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkLocalCallbackSink.java`
#### Snippet
```java
     */
    public SparkLocalCallbackSink(Consumer<T> callback, DataSetType type) {
        super(callback, type);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkFlatMapOperator.java`
#### Snippet
```java
    public SparkFlatMapOperator(DataSetType inputType, DataSetType outputType,
                                FlatMapDescriptor<InputType, OutputType> functionDescriptor) {
        super(functionDescriptor, inputType, outputType);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkFlatMapOperator.java`
#### Snippet
```java
    public SparkFlatMapOperator(DataSetType inputType, DataSetType outputType,
                                FlatMapDescriptor<InputType, OutputType> functionDescriptor) {
        super(functionDescriptor, inputType, outputType);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.wayang.basic.data.Tuple2' to 'T'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTsvFileSource.java`
#### Snippet
```java
                    // TODO: Important. Enrich type informations to create the correct parser!
                    int tabPos = line.indexOf('\t');
                    return (T) new Tuple2<>(
                            Integer.valueOf(line.substring(0, tabPos)),
                            Float.valueOf(line.substring(tabPos + 1)));
                });
        this.name(dataQuantaRdd);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkTsvFileSource.java`
#### Snippet
```java

    public SparkTsvFileSource(DataSetType type) {
        this(null, type);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java
    public SparkMapOperator(DataSetType inputType, DataSetType outputType,
                            TransformationDescriptor<InputType, OutputType> functionDescriptor) {
        super(functionDescriptor, inputType, outputType);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.wayang.core.types.DataSetType' to 'org.apache.wayang.core.types.DataSetType'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java
    public SparkMapOperator(DataSetType inputType, DataSetType outputType,
                            TransformationDescriptor<InputType, OutputType> functionDescriptor) {
        super(functionDescriptor, inputType, outputType);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\[\]'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java

            tupleID += sampleSize;
            result.addAll(((List<Type>[]) samples)[0]);
            if (result.size() < sampleSize) { //we reached end of partition, start again
                miscalculated = true;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\[\]'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                    (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                    scala.reflect.ClassTag$.MODULE$.apply(List.class));
            result = ((List<Type>[]) samples)[0];
        } else {
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); //list should be ordered..
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                List<Integer> partitions = Collections.singletonList(pid);
                ArrayList list = map.get(pid);
                Collections.sort(list); // order list of tids

                // Start a thread
```

### UNCHECKED_WARNING
Unchecked call to 'PartitionSampleListFunction(ArrayList)' as a member of raw type 'org.apache.wayang.spark.operators.PartitionSampleListFunction'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
                results.add(executorService.submit(() ->
                        sparkContext.runJob(inputRdd.rdd(),
                                new PartitionSampleListFunction(list),
                                (scala.collection.Seq) JavaConversions.asScalaBuffer(partitions),
                                scala.reflect.ClassTag$.MODULE$.apply(List.class))));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List\[\]'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
            for (int i = 0; i < map.size(); i++)
                try {
                    allSamples.addAll(((List<Type>[]) results.get(i).get())[0]);
                } catch (InterruptedException e) {
                    this.logger.error("Random partition sampling failed due to threads.", e);
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `SqlIdentifier`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java

  /** Returns the table name, qualified with catalog and schema name if
   * applicable, as a parse tree node ({@link SqlIdentifier}). */
  public SqlIdentifier tableName() {
    final List<String> names = new ArrayList<>(3);
```

### JavadocReference
Cannot resolve symbol `Queryable`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
 * this as a building block for a query, by applying Queryable operators
 * such as
 * {@link Queryable#where(org.apache.calcite.linq4j.function.Predicate2)}.
 * The resulting queryable can then be converted to a SQL query, which can be
 * executed efficiently on the JDBC server.</p>
```

### JavadocReference
Cannot resolve symbol `where(org.apache.calcite.linq4j.function.Predicate2)`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
 * this as a building block for a query, by applying Queryable operators
 * such as
 * {@link Queryable#where(org.apache.calcite.linq4j.function.Predicate2)}.
 * The resulting queryable can then be converted to a SQL query, which can be
 * executed efficiently on the JDBC server.</p>
```

### JavadocReference
Cannot resolve symbol `org.apache.calcite.linq4j.function.Predicate2`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcTable.java`
#### Snippet
```java
 * this as a building block for a query, by applying Queryable operators
 * such as
 * {@link Queryable#where(org.apache.calcite.linq4j.function.Predicate2)}.
 * The resulting queryable can then be converted to a SQL query, which can be
 * executed efficiently on the JDBC server.</p>
```

### JavadocReference
Cannot resolve symbol `SqlDialect`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcUtils.java`
#### Snippet
```java
   *
   * <p>This in turn makes it easier to cache
   * {@link SqlDialect} objects. Otherwise, each time we
   * see a new data source, we have to open a connection to find out what
   * database product and version it is. */
```

### JavadocReference
Cannot resolve symbol `Schema`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java

/**
 * Implementation of {@link Schema} that is backed by a JDBC data source.
 *
 * <p>The tables in the JDBC data source appear to be tables in this schema;
```

### JavadocReference
Cannot resolve symbol `org.apache.calcite.adapter.jdbc.JdbcSchema`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java

  /** Schema factory that creates a
   * {@link org.apache.calcite.adapter.jdbc.JdbcSchema}.
   *
   * <p>This allows you to create a jdbc schema inside a model.json file, like
```

### JavadocReference
Cannot resolve symbol `SqlDialectFactory`
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
   * @param dataSource The data source
   *
   * @deprecated Use {@link #createDialect(SqlDialectFactory, DataSource)} instead
   */
  @Deprecated // to be removed before 2.0
```

### JavadocReference
Symbol `slotMapping` is inaccessible from here
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/LoopSubplan.java`
#### Snippet
```java
    /**
     * Creates a new instance with the given operators. Initializes the {@link InputSlot}s and {@link OutputSlot}s,
     * steals existing connections, initializes the {@link #slotMapping}, and sets as inner {@link Operator}s' parent.
     *
     * @see #wrap(Operator, Operator)
```

### JavadocReference
Symbol `slotMapping` is inaccessible from here
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/LoopSubplan.java`
#### Snippet
```java
    /**
     * Creates a new instance with the given operators. Initializes the {@link InputSlot}s and {@link OutputSlot}s,
     * steals existing connections, initializes the {@link #slotMapping}, and sets as inner {@link Operator}s' parent.
     */
    public static LoopSubplan wrap(LoopHeadOperator loopHead, List<InputSlot<?>> inputs, List<OutputSlot<?>> outputs) {
```

### JavadocReference
Cannot resolve symbol `Logger`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Logging.java`
#### Snippet
```java

    /**
     * Create a {@link Logger} for this instance.
     *
     * @return the {@link Logger}
```

### JavadocReference
Cannot resolve symbol `Logger`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Logging.java`
#### Snippet
```java
     * Create a {@link Logger} for this instance.
     *
     * @return the {@link Logger}
     */
    default Logger logger() {
```

### JavadocReference
Cannot resolve symbol `org.slf4j.Logger`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Logging.java`
#### Snippet
```java

/**
 * Provide logging via {@link org.slf4j.Logger}.
 */
public interface Logging {
```

### JavadocReference
Cannot resolve symbol `estimate(Configuration, CardinalityEstimate...)`
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
     *
     * @param inputActivations {@link Activation}s that will be satisfied by the parameters of
     *                         {@link CardinalityEstimator#estimate(Configuration, CardinalityEstimate...)} };
     *                         the indices of the {@link Activation}s match those
     *                         of the {@link CardinalityEstimate}s
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java

    /**
     * If a desired number of partitions for the input {@link JavaRDD}s is requested, enforce this.
     */
    protected <T> JavaRDD<T> partition(JavaRDD<T> rdd) {
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java

    /**
     * Helper method to generate data quanta and provide them as a cached {@link JavaRDD}.
     */
    protected <T> JavaRDD<T> prepareInputRddInDriver(long cardinality, int inputIndex) {
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java

    /**
     * Helper method to generate data quanta and provide them as a cached {@link JavaRDD}.
     */
    protected <T> JavaRDD<T> prepareInputRddInWorker(long cardinality, int inputIndex) {
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java

    /**
     * Helper method to generate data quanta and provide them as a cached {@link JavaRDD}. Uses an implementation
     * based on the {@code wayang.profiler.datagen.location} property.
     */
```

### JavadocReference
Cannot resolve symbol `DataSet`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/channels/DataSetChannel.java`
#### Snippet
```java

    /**
     * {@link ChannelInstance} implementation for {@link DataSet}s.
     */
    public class Instance extends AbstractChannelInstance {
```

### JavadocReference
Cannot resolve symbol `DataSet`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/channels/DataSetChannel.java`
#### Snippet
```java

/**
 * Describes the situation where one {@link DataSet} is operated on, producing a further {@link DataSet}.
 * <p><i>NB: We might be more specific: Distinguish between cached/uncached and pipelined/aggregated.</i></p>
 */
```

### JavadocReference
Cannot resolve symbol `DataSet`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/channels/DataSetChannel.java`
#### Snippet
```java

/**
 * Describes the situation where one {@link DataSet} is operated on, producing a further {@link DataSet}.
 * <p><i>NB: We might be more specific: Distinguish between cached/uncached and pipelined/aggregated.</i></p>
 */
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java

/**
 * Wraps and manages a Flink {@link ExecutionEnvironment} to avoid steady re-creation.
 */
public class FlinkContextReference extends ExecutionResourceTemplate {
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
public class FlinkContextReference extends ExecutionResourceTemplate {
    /**
     * The wrapped {@link ExecutionEnvironment}.
     */
    private ExecutionEnvironment flinkEnviroment;
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java

    /**
     * Provides the {@link ExecutionEnvironment}. This instance must not be disposed, yet.
     *
     * @return the wrapped {@link ExecutionEnvironment}
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
     * Provides the {@link ExecutionEnvironment}. This instance must not be disposed, yet.
     *
     * @return the wrapped {@link ExecutionEnvironment}
     */
    public ExecutionEnvironment get() {
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param flinkEnviroment the {@link ExecutionEnvironment} to be wrapped
     */
    public FlinkContextReference(CrossPlatformExecutor crossPlatformExecutor, ExecutionEnvironment flinkEnviroment, int parallelism) {
```

### JavadocReference
Cannot resolve symbol `Value`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangValue.java`
#### Snippet
```java
import java.io.ObjectOutputStream;
/**
 * Implementation of {@link Value} of flink for use in Wayang
 */
public class WayangValue<T> implements Value {
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java

    /**
     * <i>Lazy-initialized.</i> Maintains a reference to a {@link ExecutionEnvironment}. This instance's reference, however,
     * does not hold a counted reference, so it might be disposed.
     */
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java

    /**
     * Configures the single maintained {@link ExecutionEnvironment} according to the {@code job} and returns it.
     *
     * @return a {@link FlinkContextReference} wrapping the {@link ExecutionEnvironment}
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
     * Configures the single maintained {@link ExecutionEnvironment} according to the {@code job} and returns it.
     *
     * @return a {@link FlinkContextReference} wrapping the {@link ExecutionEnvironment}
     */
    public FlinkContextReference getFlinkContext(Job job) {
```

### JavadocReference
Cannot resolve symbol `FileOutputFormat`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java

/**
 * Wrapper for {@link FileOutputFormat}
 */
public class WayangFileOutputFormat<IT> extends FileOutputFormat<IT> implements InitializeOnMaster, CleanupWhenUnsuccessful {
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java

    /**
     * Reference to the {@link ExecutionEnvironment} that provides the FlinkContextReference.
     */
    private FlinkPlatform platform;
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
public class FlinkExecutor extends PushExecutorTemplate {
    /**
     * Reference to a {@link ExecutionEnvironment} to be used by this instance.
     */
    private FlinkContextReference flinkContextReference;
```

### JavadocReference
Cannot resolve symbol `ExecutionEnvironment`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java

    /**
     * The {@link ExecutionEnvironment} to be used by this instance.
     *
     */
```

### JavadocReference
Cannot resolve symbol `org.apache.spark.rdd.RDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/plugin/SparkConversionPlugin.java`
#### Snippet
```java

/**
 * This {@link Plugin} enables to create {@link org.apache.spark.rdd.RDD}s.
 */
public class SparkConversionPlugin implements Plugin {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/PredicateAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link Predicate} as a {@link Function}.
 */
public class PredicateAdapter<InputType> implements Function<InputType, Boolean> {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapFunctionAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link java.util.function.Function} as a {@link Function}.
 */
public class MapFunctionAdapter<InputType, OutputType> implements Function<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapPartitionsFunctionAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link Function} as a {@link FlatMapFunction}.
 */
public class ExtendedMapPartitionsFunctionAdapter<InputType, OutputType>
```

### JavadocReference
Cannot resolve symbol `Function2`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedBinaryOperatorAdapter.java`
#### Snippet
```java

/**
 * Implements a {@link Function2} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function2#call(Object, Object)}.
 */
```

### JavadocReference
Cannot resolve symbol `Function2`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedBinaryOperatorAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link Function2} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function2#call(Object, Object)}.
 */
public class ExtendedBinaryOperatorAdapter<Type> implements Function2<Type, Type, Type> {
```

### JavadocReference
Cannot resolve symbol `call(Object, Object)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedBinaryOperatorAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link Function2} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function2#call(Object, Object)}.
 */
public class ExtendedBinaryOperatorAdapter<Type> implements Function2<Type, Type, Type> {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java

/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedPredicateAdapater<Type> implements Function<Type, Boolean> {
```

### JavadocReference
Cannot resolve symbol `call(Object)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedPredicateAdapater<Type> implements Function<Type, Boolean> {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFunction.java`
#### Snippet
```java

/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFunction.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedFunction<InputType, OutputType> implements Function<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `call(Object)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFunction.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedFunction<InputType, OutputType> implements Function<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `Function2`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/BinaryOperatorAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link java.util.function.BinaryOperator} as a {@link Function2}.
 */
public class BinaryOperatorAdapter<Type> implements Function2<Type, Type, Type> {
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link java.util.function.Function} as a {@link FlatMapFunction}.
 */
public class FlatMapFunctionAdapter<InputType, OutputType> implements FlatMapFunction<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapPartitionsFunctionAdapter.java`
#### Snippet
```java

/**
 * Wraps a {@link Function} as a {@link FlatMapFunction}.
 */
public class MapPartitionsFunctionAdapter<InputType, OutputType> implements FlatMapFunction<Iterator<InputType>, OutputType> {
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFlatMapFunctionAdapter.java`
#### Snippet
```java

/**
 * Implements a {@link FlatMapFunction} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFlatMapFunctionAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link FlatMapFunction} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedFlatMapFunctionAdapter<InputType, OutputType> implements FlatMapFunction<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `call(Object)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedFlatMapFunctionAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link FlatMapFunction} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedFlatMapFunctionAdapter<InputType, OutputType> implements FlatMapFunction<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapFunctionAdapter.java`
#### Snippet
```java

/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapFunctionAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedMapFunctionAdapter<InputType, OutputType> implements Function<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `call(Object)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedMapFunctionAdapter.java`
#### Snippet
```java
/**
 * Implements a {@link Function} that calls {@link org.apache.wayang.core.function.ExtendedFunction#open(ExecutionContext)}
 * of its implementation before delegating the very first {@link Function#call(Object)}.
 */
public class ExtendedMapFunctionAdapter<InputType, OutputType> implements Function<InputType, OutputType> {
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkContextReference.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param sparkContext the {@link JavaSparkContext} to be wrapped
     */
    public SparkContextReference(CrossPlatformExecutor crossPlatformExecutor, JavaSparkContext sparkContext) {
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkContextReference.java`
#### Snippet
```java

/**
 * Wraps and manages a {@link JavaSparkContext} to avoid steady re-creation.
 */
public class SparkContextReference extends ExecutionResourceTemplate {
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkContextReference.java`
#### Snippet
```java

    /**
     * Provides the {@link JavaSparkContext}. This instance must not be disposed, yet.
     *
     * @return the wrapped {@link JavaSparkContext}
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkContextReference.java`
#### Snippet
```java
     * Provides the {@link JavaSparkContext}. This instance must not be disposed, yet.
     *
     * @return the wrapped {@link JavaSparkContext}
     */
    public JavaSparkContext get() {
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkContextReference.java`
#### Snippet
```java

    /**
     * The wrapped {@link JavaSparkContext}.
     */
    private final JavaSparkContext sparkContext;
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/RddChannel.java`
#### Snippet
```java

/**
 * Describes the situation where one {@link JavaRDD} is operated on, producing a further {@link JavaRDD}.
 * <p><i>NB: We might be more specific: Distinguish between cached/uncached and pipelined/aggregated.</i></p>
 */
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/RddChannel.java`
#### Snippet
```java

/**
 * Describes the situation where one {@link JavaRDD} is operated on, producing a further {@link JavaRDD}.
 * <p><i>NB: We might be more specific: Distinguish between cached/uncached and pipelined/aggregated.</i></p>
 */
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkExecutor.java`
#### Snippet
```java

    /**
     * The {@link JavaSparkContext} to be used by this instance.
     *
     * @see #sparkContextReference
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkExecutor.java`
#### Snippet
```java

    /**
     * Reference to a {@link JavaSparkContext} to be used by this instance.
     */
    private final SparkContextReference sparkContextReference;
```

### JavadocReference
Cannot resolve symbol `Broadcast`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkExecutionContext.java`
#### Snippet
```java

    /**
     * Mapping of broadcast name to {@link Broadcast} references.
     */
    private Map<String, Broadcast<?>> broadcasts;
```

### JavadocReference
Cannot resolve symbol `Broadcast`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkBroadcastOperator.java`
#### Snippet
```java

/**
 * Takes care of creating a {@link Broadcast} that can be used later on.
 */
public class SparkBroadcastOperator<Type> extends UnaryToUnaryOperator<Type, Type> implements SparkExecutionOperator {
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

    /**
     * Create an appropriate {@link Function} for deploying the given {@link MapPartitionsDescriptor}
     * on Apache Spark's {@link JavaRDD#mapPartitions(FlatMapFunction)}.
     *
```

### JavadocReference
Cannot resolve symbol `JavaRDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
    /**
     * Create an appropriate {@link Function} for deploying the given {@link MapPartitionsDescriptor}
     * on Apache Spark's {@link JavaRDD#mapPartitions(FlatMapFunction)}.
     *
     * @param descriptor      describes the function
```

### JavadocReference
Cannot resolve symbol `mapPartitions(FlatMapFunction)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
    /**
     * Create an appropriate {@link Function} for deploying the given {@link MapPartitionsDescriptor}
     * on Apache Spark's {@link JavaRDD#mapPartitions(FlatMapFunction)}.
     *
     * @param descriptor      describes the function
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
    /**
     * Create an appropriate {@link Function} for deploying the given {@link MapPartitionsDescriptor}
     * on Apache Spark's {@link JavaRDD#mapPartitions(FlatMapFunction)}.
     *
     * @param descriptor      describes the function
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
     *
     * @param descriptor      describes the function
     * @param operator        that executes the {@link Function}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
     * @param operatorContext contains optimization information for the {@code operator}
     * @param inputs          that feed the {@code operator}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

    /**
     * Create an appropriate {@link Function} for deploying the given {@link ReduceDescriptor}
     * on Apache Spark.
     */
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

    /**
     * Create an appropriate {@link Function} for deploying the given {@link TransformationDescriptor}
     * on Apache Spark.
     *
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
     *
     * @param descriptor      describes the transformation function
     * @param operator        that executes the {@link Function}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
     * @param operatorContext contains optimization information for the {@code operator}
     * @param inputs          that feed the {@code operator}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
```

### JavadocReference
Cannot resolve symbol `FlatMapFunction`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

    /**
     * Create an appropriate {@link FlatMapFunction} for deploying the given {@link FlatMapDescriptor}
     * on Apache Spark.
     *
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
     *
     * @param descriptor      describes the function
     * @param operator        that executes the {@link Function}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
     * @param operatorContext contains optimization information for the {@code operator}
     * @param inputs          that feed the {@code operator}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java

    /**
     * Create an appropriate {@link Function}-based predicate for deploying the given {@link PredicateDescriptor}
     * on Apache Spark.
     *
```

### JavadocReference
Cannot resolve symbol `Function`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FunctionCompiler.java`
#### Snippet
```java
     *
     * @param predicateDescriptor describes the function
     * @param operator            that executes the {@link Function}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
     * @param operatorContext     contains optimization information for the {@code operator}
     * @param inputs              that feed the {@code operator}; only required if the {@code descriptor} describes an {@link ExtendedFunction}
```

### JavadocReference
Cannot resolve symbol `scala.Tuple2`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkReduceByOperator.java`
#### Snippet
```java

    /**
     * Extracts the value from a {@link scala.Tuple2}.
     * <p><i>TODO: See, if we can somehow dodge all this conversion, which is likely to happen a lot.</i></p>
     */
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java

    /**
     * Configures the single maintained {@link JavaSparkContext} according to the {@code job} and returns it.
     *
     * @return a {@link SparkContextReference} wrapping the {@link JavaSparkContext}
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java
     * Configures the single maintained {@link JavaSparkContext} according to the {@code job} and returns it.
     *
     * @return a {@link SparkContextReference} wrapping the {@link JavaSparkContext}
     */
    public SparkContextReference getSparkContext(Job job) {
```

### JavadocReference
Cannot resolve symbol `JavaSparkContext`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java

    /**
     * <i>Lazy-initialized.</i> Maintains a reference to a {@link JavaSparkContext}. This instance's reference, however,
     * does not hold a counted reference, so it might be disposed.
     */
```

### JavadocReference
Cannot resolve symbol `scala.Tuple2`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkJoinOperator.java`
#### Snippet
```java

    /**
     * Migrates {@link scala.Tuple2} to {@link Tuple2}.
     * <p><i>TODO: See, if we can somehow dodge all this conversion, which is likely to happen a lot.</i></p>
     */
```

### JavadocReference
Cannot resolve symbol `JavaPairRDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCoGroupOperator.java`
#### Snippet
```java

    /**
     * Converts the output of {@link JavaPairRDD#cogroup(JavaPairRDD, int)} to what Wayang expects.
     * <p><i>TODO: See, if we can somehow dodge all this conversion, which is likely to happen a lot.</i></p>
     */
```

### JavadocReference
Cannot resolve symbol `cogroup(JavaPairRDD, int)`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCoGroupOperator.java`
#### Snippet
```java

    /**
     * Converts the output of {@link JavaPairRDD#cogroup(JavaPairRDD, int)} to what Wayang expects.
     * <p><i>TODO: See, if we can somehow dodge all this conversion, which is likely to happen a lot.</i></p>
     */
```

### JavadocReference
Cannot resolve symbol `JavaPairRDD`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCoGroupOperator.java`
#### Snippet
```java

    /**
     * Converts the output of {@link JavaPairRDD#cogroup(JavaPairRDD, int)} to what Wayang expects.
     * <p><i>TODO: See, if we can somehow dodge all this conversion, which is likely to happen a lot.</i></p>
     */
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
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkMapOperator.java`
#### Snippet
```java
                    );

            fex.setRichFunction(richFunction);;

            dataSetOutput = dataSetInput
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/interfaces/Task.java`
#### Snippet
```java
     */
    public enum TaskStatusForRunning {
        FAILED, SUCCESS, KILLED, SUCCESSFUL,RUNNING,FINISHED, SPECULATIVE;
    }
    /**
```

## RuleId[id=DataFlowIssue]
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

### DataFlowIssue
Variable is already assigned to this value
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorRemoved.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorUpdated.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/ExecutorAdded.java`
#### Snippet
```java
    @Override
    public void executorTime(long Time) {
        this.time=time;
    }

```

## RuleId[id=MissingSerialAnnotation]
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
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
            implements Serializable, java.util.Comparator<Data<Type0, Type1>> {

        private static final long serialVersionUID = 1L;

        boolean asc1;
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
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
public class revDataComparator implements Serializable, Comparator<Data> {

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

## RuleId[id=SimplifyStreamApiCallChains]
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
    public static List<Integer> asList(int... values) {
        return Arrays.stream(values).mapToObj(Integer::valueOf).collect(Collectors.toList());
    }

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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=UnnecessaryCallToStringValueOf]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/jdbc/JdbcSchema.java`
#### Snippet
```java
    final SqlTypeName sqlTypeName =
        Util.first(SqlTypeName.getNameForJdbcType(dataType), SqlTypeName.ANY);
    switch (sqlTypeName) {
    case ARRAY:
      RelDataType component = null;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Configuration.java`
#### Snippet
```java
     */
    private void handleConfigurationFileEntry(String key, String value) {
        switch (key) {
            case "wayang.core.optimizer.cost.squash":
                if (!(this.costSquasherProvider instanceof ConstantValueProvider)) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/PageRankOperator.java`
#### Snippet
```java
    @Override
    public Optional<CardinalityEstimator> createCardinalityEstimator(int outputIndex, Configuration configuration) {
        switch (outputIndex) {
            case 0:
                return Optional.of((optimizationContext, inputEstimates) -> {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static void setParameter(PageRankEnum name, Integer value){
        switch (name){
            case ITERATION:
                stack_iteration.add(value);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static int getParameter(PageRankEnum name){
        switch (name){
            case ITERATION:
                return stack_iteration.peek();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankParameters.java`
#### Snippet
```java

    public static boolean hasElement(PageRankEnum name){
        switch (name){
            case ITERATION:
                return !stack_iteration.isEmpty();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java

        WayangPlan wayangPlan;
        switch (Integer.parseInt(args[1])) {
            case 1:
                wayangPlan = createQ1(args[2], Integer.parseInt(args[3]));
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/optimizer/Optimizer.java`
#### Snippet
```java
        SqlOperatorTable operatorTable = new ChainedSqlOperatorTable(ImmutableList.of(SqlStdOperatorTable.instance()));

        SqlValidator.Config validatorConfig = SqlValidator.Config.DEFAULT
                .withLenientOperatorLookup(config.lenientOperatorLookup())
                .withSqlConformance(config.conformance())
                .withDefaultNullCollation(config.defaultNullCollation())
                .withIdentifierExpansion(true);

        SqlValidator validator = SqlValidatorUtil.newValidator(operatorTable, catalogReader, typeFactory, validatorConfig);

        VolcanoPlanner planner = new VolcanoPlanner(RelOptCostImpl.FACTORY, Contexts.of(config));
        planner.addRelTraitDef(ConventionTraitDef.INSTANCE);

        RelOptCluster cluster = RelOptCluster.create(planner, new RexBuilder(typeFactory));

        SqlToRelConverter.Config converterConfig = SqlToRelConverter.config()
                .withTrimUnusedFields(true)
                .withExpand(false);

        SqlToRelConverter converter = new SqlToRelConverter(
                null,
                validator,
                catalogReader,
                cluster,
                StandardConvertletTable.INSTANCE,
                converterConfig
        );

        return new Optimizer(config, validator, converter, planner);
```

### DuplicatedCode
Duplicated code
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
        assert outputs.length == this.getNumOutputs();

        final String path;
        if (this.sourcePath == null) {
            final FileChannel.Instance input = (FileChannel.Instance) inputs[0];
            path = input.getSinglePath();
        } else {
            assert inputs.length == 0;
            path = this.sourcePath;
        }
        final String actualInputPath = FileSystems.findActualSingleInputPath(path);
        Stream<T> stream = this.createStream(actualInputPath);
        ((StreamChannel.Instance) outputs[0]).accept(stream);

        return ExecutionOperator.modelLazyExecution(inputs, outputs, operatorContext);
```

### DuplicatedCode
Duplicated code
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
        final BufferedReader reader = new BufferedReader(new InputStreamReader(fileSystem.open(path), "UTF-8"));
        return new Iterator<String>() {

            String next;

            {
                this.advance();
            }

            private void advance() {
                try {
                    this.next = reader.readLine();
                } catch (IOException e) {
                    this.next = null;
                    throw new UncheckedIOException(e);
                } finally {
                    if (this.next == null) {
                        IOUtils.closeQuietly(reader);
                    }
                }
            }

            @Override
            public boolean hasNext() {
                return this.next != null;
            }

            @Override
            public String next() {
                assert this.hasNext();
                final String returnValue = this.next;
                this.advance();
                return returnValue;
            }
        };
```

### DuplicatedCode
Duplicated code
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java
        WayangContext wayangContext = new WayangContext(this.configuration);
        for (Plugin plugin : this.plugins) {
            wayangContext.withPlugin(plugin);
        }
        JavaPlanBuilder javaPlanBuilder = new JavaPlanBuilder(wayangContext);
        if (experiment != null) javaPlanBuilder.withExperiment(experiment);
        javaPlanBuilder.withUdfJarOf(this.getClass());

        // Create initial weights.
        List<double[]> weights = Arrays.asList(new double[features]);
        final DataQuantaBuilder<?, double[]> weightsBuilder = javaPlanBuilder
                .loadCollection(weights).withName("init weights");
```

### DuplicatedCode
Duplicated code
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/Main.java`
#### Snippet
```java
        WayangContext wayangContext = new WayangContext();
        for (String platform : args[0].split(",")) {
            switch (platform) {
                case "java":
                    wayangContext.register(Java.basicPlugin());
                    break;
                case "spark":
                    wayangContext.register(Spark.basicPlugin());
                    break;
                default:
                    System.err.format("Unknown platform: \"%s\"\n", platform);
                    System.exit(3);
                    return;
            }
        }

        wayangContext.execute(wayangPlan, ReflectionUtils.getDeclaringJar(Main.class), ReflectionUtils.getDeclaringJar(JavaPlatform.class));
```

### DuplicatedCode
Duplicated code
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/tpch/data/LineItemTuple.java`
#### Snippet
```java
            startPos = endPos + 1;
            endPos = startPos - 1;
            do {
                endPos++;
                endPos = line.indexOf(';', endPos);
            } while (line.charAt(endPos - 1) != '"' || line.charAt(endPos + 1) != '"');
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/DoWhileOperator.java`
#### Snippet
```java
        assert this.isOwnerOf(input);
        switch (input.getIndex()) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
                return Arrays.asList(this.getOutput(ITERATION_OUTPUT_INDEX), this.getOutput(FINAL_OUTPUT_INDEX));
            default:
                return super.getForwards(input);
        }
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java
            double numEstimatedLines = fileSize.getAsLong() / bytesPerLine.getAsDouble();
            double expectedDeviation = numEstimatedLines * EXPECTED_ESTIMATE_DEVIATION;
            cardinalityEstimate = new CardinalityEstimate(
                    (long) (numEstimatedLines - expectedDeviation),
                    (long) (numEstimatedLines + expectedDeviation),
                    CORRECTNESS_PROBABILITY
            );

            // Cache the result, so that it will not be recalculated again.
            optimizationContext.putIntoJobCache(jobCacheKey, cardinalityEstimate);

            timeMeasurement.stop();
            return cardinalityEstimate;
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/DefaultLoadEstimator.java`
#### Snippet
```java
        final CardinalityEstimate[] inputEstimates = context.getInputCardinalities();
        final CardinalityEstimate[] outputEstimates = context.getOutputCardinalities();
        Validate.isTrue(inputEstimates.length >= this.numInputs || this.numInputs == UNSPECIFIED_NUM_SLOTS,
                "Received %d input estimates, require %d.", inputEstimates.length, this.numInputs);
        Validate.isTrue(outputEstimates.length == this.numOutputs || this.numOutputs == UNSPECIFIED_NUM_SLOTS,
                "Received %d output estimates, require %d.", outputEstimates.length, this.numOutputs);

        long[][] inputEstimateCombinations = this.enumerateCombinations(inputEstimates);
        long[][] outputEstimateCombinations = this.enumerateCombinations(outputEstimates);

        long lowerEstimate = -1, upperEstimate = -1;
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
        int numInputs = spec.getInt("in");
        int numOutputs = spec.getInt("out");
        double correctnessProb = spec.getDouble("p");
        List<String> operatorProperties = spec.has("import") ?
                StreamSupport.stream(spec.optionalWayangJsonArray("import").spliterator(), false).map(Objects::toString).collect(Collectors.toList()) :
                Collections.emptyList();
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
                    int accu = 0;
                    int i;
                    for (i = 2; i < variableName.length(); i++) {
                        char c = variableName.charAt(i);
                        if (!Character.isDigit(c)) break;
                        accu = 10 * accu + (c - '0');
                    }
                    if (i == variableName.length()) return inputCardinalities[accu];
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/LoadProfileEstimators.java`
#### Snippet
```java
                    int accu = 0;
                    int i;
                    for (i = 3; i < variableName.length(); i++) {
                        char c = variableName.charAt(i);
                        if (!Character.isDigit(c)) break;
                        accu = 10 * accu + (c - '0');
                    }
                    if (i == variableName.length()) return outputCardinalities[accu];
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
        ProbabilisticDoubleInterval overheadCosts = this.getUtilizedPlatforms().stream()
                .map(platform -> {
                    Configuration configuraiton = this.optimizationContext.getConfiguration();
                    long startUpTime = configuraiton.getPlatformStartUpTimeProvider().provideFor(platform);
                    TimeToCostConverter timeToCostConverter = configuraiton.getTimeToCostConverterProvider().provideFor(platform);
                    return timeToCostConverter.convert(new TimeEstimate(startUpTime, startUpTime, 1d));
                })
                .reduce(ProbabilisticDoubleInterval.zero, ProbabilisticDoubleInterval::plus);
        costEstimateCache = costEstimateWithoutOverheadCache.plus(overheadCosts);
        return isIncludeOverhead ? costEstimateCache : costEstimateWithoutOverheadCache;
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
            double overheadCosts = this.getUtilizedPlatforms().stream()
                    .mapToDouble(platform -> {
                        Configuration configuration = this.optimizationContext.getConfiguration();

                        long startUpTime = configuration.getPlatformStartUpTimeProvider().provideFor(platform);

                        TimeToCostConverter timeToCostConverter = configuration.getTimeToCostConverterProvider().provideFor(platform);
                        ProbabilisticDoubleInterval costs = timeToCostConverter.convert(new TimeEstimate(startUpTime, startUpTime, 1d));

                        final ToDoubleFunction<ProbabilisticDoubleInterval> squasher = configuration.getCostSquasherProvider().provide();
                        return squasher.applyAsDouble(costs);
                    })
                    .sum();
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/SlotMapping.java`
#### Snippet
```java
        if (target == null) {
            this.upstreamMapping.remove(source);
            this.downstreamMapping = null;
            return;
        }

        if (!source.isCompatibleWith(target)) {
            throw new IllegalArgumentException(String.format("Incompatible slots given: %s -> %s", source, target));
        }

        this.upstreamMapping.put(source, target);
        this.downstreamMapping = null;
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
        while (iterator.hasNext()) {
            final Map.Entry<Channel, ChannelInstance> channelInstanceEntry = iterator.next();
            final ChannelInstance channelInstance = channelInstanceEntry.getValue();

            // If this is instance is the only one to still use this ChannelInstance, discard it.
            if (channelInstance.getNumReferences() == 1) {
                channelInstance.noteDiscardedReference(true);
                iterator.remove();
            }
        }
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionPlanMeasurement.java`
#### Snippet
```java
                if (inputChannel == null) continue;

                ChannelNode channelNode = channelNodeMap.get(inputChannel);
                if (channelNode == null) {
                    channelNode = new ChannelNode(
                            nextNodeId++,
                            inputChannel.getClass().getCanonicalName(),
                            inputChannel.getDataSetType().getDataUnitType().getTypeClass().getName()
                    );
                    channelNodeMap.put(inputChannel, channelNode);
                    instance.channels.add(channelNode);
                }

                instance.links.add(new Link(channelNode.getId(), operatorNode.getId()));
```

### DuplicatedCode
Duplicated code
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Formats.java`
#### Snippet
```java
        if (millis < 0) return "-" + formatDuration(-millis);
        long ms = millis % 1000;
        millis /= 1000;
        long s = millis % 60;
        millis /= 60;
        long m = millis % 60;
        millis /= 60;
        long h = millis % 60;
        return String.format("%d:%02d:%02d.%03d", h, m, s, ms);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
        final ChannelInstance[] outputChannelInstances = task.getOperator().createOutputChannelInstances(
                this, task, producerOperatorContext, inputChannelInstances
        );

        // Execute.
        final Collection<ExecutionLineageNode> executionLineageNodes;
        final Collection<ChannelInstance> producedChannelInstances;
        // TODO: Use proper progress estimator.
        this.job.reportProgress(task.getOperator().getName(), 50);

        long startTime = System.currentTimeMillis();
        try {
            final Tuple<Collection<ExecutionLineageNode>, Collection<ChannelInstance>> results =
                    cast(task.getOperator()).evaluate(
                            toArray(inputChannelInstances),
                            outputChannelInstances,
                            this,
                            producerOperatorContext
                    );
            executionLineageNodes = results.getField0();
            producedChannelInstances = results.getField1();
        } catch (Exception e) {
            throw new WayangException(String.format("Executing %s failed.", task), e);
        }
        long endTime = System.currentTimeMillis();
        long executionDuration = endTime - startTime;
        this.job.reportProgress(task.getOperator().getName(), 100);

        // Check how much we executed.
        PartialExecution partialExecution = this.createPartialExecution(executionLineageNodes, executionDuration);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCartesianOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final DataSetChannel.Instance input0 = (DataSetChannel.Instance) inputs[0];
        final DataSetChannel.Instance input1 = (DataSetChannel.Instance) inputs[1];
        final DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkDistinctOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final DataSetChannel.Instance input = (DataSetChannel.Instance) inputs[0];
        final DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];

        final DataSet<Type> dataSetInput = input.provideDataSet();
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final DataSetChannel.Instance input = (DataSetChannel.Instance) inputs[0];
        final DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];


        final DataSet<InputType>  dataSetInput  = input.provideDataSet();

        final DataSet<OutputType> dataSetOutput;
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
        for(int i = 0; i < this.inputSlots.length; i++){
            if( this.inputSlots[i].isBroadcast() ){
                DataSetChannel.Instance dataSetChannel = (DataSetChannel.Instance)inputs[inputSlots[i].getIndex()];
                return new Tuple<>(inputSlots[i].getName(), dataSetChannel.provideDataSet());
            }
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkLoopOperator.java`
#### Snippet
```java
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            case INITIAL_CONVERGENCE_INPUT_INDEX:
            case ITERATION_CONVERGENCE_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            default:
                throw new IllegalStateException(String.format("%s has no %d-th input.", this, index));
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkObjectFileSource.java`
#### Snippet
```java
        final String path;
        if (this.getInputUrl() == null) {
            final FileChannel.Instance input = (FileChannel.Instance) inputs[0];
            path = input.getSinglePath();
        } else {
            assert inputs.length == 0;
            path = this.getInputUrl();
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkReduceByOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        DataSetChannel.Instance input = (DataSetChannel.Instance) inputs[0];
        DataSetChannel.Instance output = (DataSetChannel.Instance) outputs[0];

        final DataSet<InputType> dataSetInput = input.provideDataSet();
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        assert inputs[INITIAL_INPUT_INDEX] != null;
        assert inputs[ITERATION_INPUT_INDEX] != null;

        assert outputs[ITERATION_OUTPUT_INDEX] != null;
        assert outputs[FINAL_OUTPUT_INDEX] != null;
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkRepeatExpandedOperator.java`
#### Snippet
```java
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        switch (index) {
            case INITIAL_INPUT_INDEX:
            case ITERATION_INPUT_INDEX:
                return Collections.singletonList(DataSetChannel.DESCRIPTOR);
            default:
                throw new IllegalStateException(String.format("%s has no %d-th input.", this, index));
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
        Queue<ExecutionTask> scheduledTasks = new LinkedList<>(stage.getStartTasks());
        Set<ExecutionTask> executedTasks = new HashSet<>();

        while (!scheduledTasks.isEmpty()) {
            final ExecutionTask task = scheduledTasks.poll();
            if (executedTasks.contains(task)) continue;
            this.execute(task, optimizationContext, executionState);
            executedTasks.add(task);
            Arrays.stream(task.getOutputChannels())
                    .flatMap(channel -> channel.getConsumers().stream())
                    .filter(consumer -> consumer.getStage() == stage)
                    .forEach(scheduledTasks::add);
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
        ChannelInstance[] inputChannelInstances = new ChannelInstance[task.getNumInputChannels()];
        for (int i = 0; i < inputChannelInstances.length; i++) {
            inputChannelInstances[i] = executionState.getChannelInstance(task.getInputChannel(i));
        }
        final OptimizationContext.OperatorContext operatorContext = optimizationContext.getOperatorContext(giraphExecutionOperator);
        ChannelInstance[] outputChannelInstances = new ChannelInstance[task.getNumOuputChannels()];
        for (int i = 0; i < outputChannelInstances.length; i++) {
            outputChannelInstances[i] = task.getOutputChannel(i).createInstance(this, operatorContext, i);
        }

        long startTime = System.currentTimeMillis();
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
        long endTime = System.currentTimeMillis();

        final Collection<ExecutionLineageNode> executionLineageNodes = results.getField0();
        final Collection<ChannelInstance> producedChannelInstances = results.getField1();

        for (ChannelInstance outputChannelInstance : outputChannelInstances) {
            if (outputChannelInstance != null) {
                executionState.register(outputChannelInstance);
            }
        }

        final PartialExecution partialExecution = this.createPartialExecution(executionLineageNodes, endTime - startTime);
        executionState.add(partialExecution);
        this.registerMeasuredCardinalities(producedChannelInstances);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/platform/GiraphPlatform.java`
#### Snippet
```java
        int cpuMhz = (int) configuration.getLongProperty(CPU_MHZ_PROPERTY);
        int numCores = (int) configuration.getLongProperty(CORES_PROPERTY);
        double hdfsMsPerMb = configuration.getDoubleProperty(HDFS_MS_PER_MB_PROPERTY);
        return LoadProfileToTimeConverter.createDefault(
                LoadToTimeConverter.createLinearCoverter(1 / (numCores * cpuMhz * 1000d)),
                LoadToTimeConverter.createLinearCoverter(hdfsMsPerMb / 1000000),
                LoadToTimeConverter.createLinearCoverter(0),
                (cpuEstimate, diskEstimate, networkEstimate) -> cpuEstimate.plus(diskEstimate).plus(networkEstimate)
        );
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/execution/SparkExecutor.java`
#### Snippet
```java
        if (partialExecution == null && executionDuration > 10) {
            this.logger.warn("Execution of {} took suspiciously long ({}).", task, Formats.formatDuration(executionDuration));
        }

        // Collect any cardinality updates.
        this.registerMeasuredCardinalities(producedChannelInstances);


        // Warn if requested eager execution did not take place.
        if (isRequestEagerExecution && partialExecution == null) {
            this.logger.info("{} was not executed eagerly as requested.", task);
        }

        return new Tuple<>(Arrays.asList(outputChannelInstances), partialExecution);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            final Stream<InputType1> stream = ((JavaChannelInstance) inputs[1]).provideStream();
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e1 -> collection.stream().map(
                            e0 -> new Tuple2<>(e0, e1)
                    ))
            );
            materializedInput = inputs[0];
            probingInput = inputs[1];
            probingExecutionLineageNode.addPredecessor(materializedInput.getLineage());
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCartesianOperator.java`
#### Snippet
```java
            output.<Tuple2<InputType0, InputType1>>accept(
                    stream.flatMap(e0 -> collection.stream().map(
                            e1 -> new Tuple2<>(e0, e1)
                    ))
            );
            materializedInput = inputs[1];
            probingInput = inputs[0];
            probingExecutionLineageNode.addPredecessor(materializedInput.getLineage());
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCoGroupOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final Function<InputType0, KeyType> keyExtractor0 = javaExecutor.getCompiler().compile(this.keyDescriptor0);
        final Function<InputType1, KeyType> keyExtractor1 = javaExecutor.getCompiler().compile(this.keyDescriptor1);

        // Group input 0.
        final CardinalityEstimate cardinalityEstimate0 = operatorContext.getInputCardinality(0);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCoGroupOperator.java`
#### Snippet
```java
        Map<KeyType, Collection<InputType0>> groups0 = new HashMap<>(expectedNumElements0);
        ((JavaChannelInstance) inputs[0]).<InputType0>provideStream().forEach(dataQuantum0 ->
                groups0.compute(keyExtractor0.apply(dataQuantum0),
                        (key, value) -> {
                            value = value == null ? new LinkedList<>() : value;
                            value.add(dataQuantum0);
                            return value;
                        }
                )
        );
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaCoGroupOperator.java`
#### Snippet
```java
        Map<KeyType, Collection<InputType1>> groups1 = new HashMap<>(expectedNumElements1);
        ((JavaChannelInstance) inputs[1]).<InputType1>provideStream().forEach(dataQuantum1 ->
                groups1.compute(keyExtractor1.apply(dataQuantum1),
                        (key, value) -> {
                            value = value == null ? new LinkedList<>() : value;
                            value.add(dataQuantum1);
                            return value;
                        }
                )
        );
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaDoWhileOperator.java`
#### Snippet
```java
        final Predicate<Collection<ConvergenceType>> stoppingCondition =
                javaExecutor.getCompiler().compile(this.criterionDescriptor);
        JavaExecutor.openFunction(this, stoppingCondition, inputs, operatorContext);

        boolean endloop = false;

        final Collection<ConvergenceType> convergenceCollection;
        final JavaChannelInstance input;
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        taskStart.setHostIP(taskInfo.host());
        taskStart.setStringExecutorID(taskInfo.executorId());
        taskStart.setTaskStatus(taskInfo.status());
        taskStart.setTaskID(taskInfo.taskId());
        taskStart.setIndex(taskInfo.index());
        taskStart.setLaunchTime(taskInfo.launchTime());
        taskStart.setFinishTime(taskInfo.finishTime());
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        if(taskInfo.failed()){
          taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.FAILED);
        }
        else if(taskInfo.finished()){
           taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.FINISHED);
        }
        else if(taskInfo.killed()){
           taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.KILLED);
        }
        else  if(taskInfo.running()){
           taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.RUNNING);
        }
        else if(taskInfo.successful()){
            taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.SUCCESSFUL);
        }
        else if(taskInfo.speculative()){
           taskStart.setTaskStatusForRunning(Task.TaskStatusForRunning.SPECULATIVE);
        }
        else {
           taskStart.setTaskStatusForRunning(null);
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        TaskInfo taskInfo= taskEndSpark.taskInfo();
        taskEnd.setID(taskInfo.id());
        taskEnd.setEventame("OnTaskGettingResult");
        taskEnd.setHostIP(taskInfo.host());
        taskEnd.setStringExecutorID(taskInfo.executorId());
        taskEnd.setTaskStatus(taskInfo.status());
        taskEnd.setTaskID(taskInfo.taskId());
        taskEnd.setIndex(taskInfo.index());
        taskEnd.setLaunchTime(taskInfo.launchTime());
        taskEnd.setFinishTime(taskInfo.finishTime());
        taskEnd.setDurationTime(taskInfo.duration());
        taskEnd.setGettingTime(taskInfo.gettingResultTime());
        //  this. taskGettingResult.setStageID(taskGettingResult.stageId());
        //this.taskEnd.setPartition(taskInfo.partitionId());
        if(taskInfo.failed()){
          taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.FAILED);
        }
        else if(taskInfo.finished()){
           taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.FINISHED);
        }
        else if(taskInfo.killed()){
          taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.KILLED);
        }
        else  if(taskInfo.running()){
           taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.RUNNING);
        }
        else if(taskInfo.successful()){
           taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.SUCCESSFUL);
        }
        else if(taskInfo.speculative()){
            taskEnd.setTaskStatusForRunning(Task.TaskStatusForRunning.SPECULATIVE);
        }
        else {
           taskEnd.setTaskStatusForRunning(null);
        }
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        TaskMetric taskMetric= new TaskMetric();
        taskMetric.setExecutorCPUTime(taskMetrics.executorCpuTime());
        taskMetric.setExecutorDeserializeCpuTime(taskMetrics.executorDeserializeCpuTime());
        taskMetric.setExecutorDeserializeTime(taskMetrics.executorDeserializeTime());
        taskMetric.setDiskBytesSpilled(taskMetrics.diskBytesSpilled());
        taskMetric.setExecutorRunTime(taskMetrics.executorRunTime());
        taskMetric.setjvmGCTime(taskMetrics.jvmGCTime());
        taskMetric.setPeakExecutionMemory(taskMetrics.peakExecutionMemory());
        taskMetric.setResultSize(taskMetrics.resultSize());
        taskMetric.setResultSerializationTime(taskMetrics.resultSerializationTime());
        taskEnd.setTaskMetric(taskMetric);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        StageInfo stageInfo=stageCompletedSpark.stageInfo();
        stageCompleted.setDetails(stageInfo.details());
        stageCompleted.setEventame("OnStageSubmitted");
        stageCompleted.setStageName(stageInfo.name());
         stageCompleted.setStatus(stageInfo.getStatusString());
         stageCompleted.setNumberOfTasks(stageInfo.numTasks());
         stageCompleted.setID(stageInfo.stageId());
         stageCompleted.setSubmissionTime((Long) stageInfo.submissionTime().get());
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
        TaskMetrics taskMetrics= stageCompletedSpark.stageInfo().taskMetrics();
        TaskMetric taskMetric= new TaskMetric();
        taskMetric.setExecutorCPUTime(taskMetrics.executorCpuTime());
        taskMetric.setExecutorDeserializeCpuTime(taskMetrics.executorDeserializeCpuTime());
        taskMetric.setExecutorDeserializeTime(taskMetrics.executorDeserializeTime());
        taskMetric.setDiskBytesSpilled(taskMetrics.diskBytesSpilled());
        taskMetric.setExecutorRunTime(taskMetrics.executorRunTime());
        taskMetric.setjvmGCTime(taskMetrics.jvmGCTime());
        taskMetric.setPeakExecutionMemory(taskMetrics.peakExecutionMemory());
        taskMetric.setResultSize(taskMetrics.resultSize());
        taskMetric.setResultSerializationTime(taskMetrics.resultSerializationTime());
        stageCompleted.setTaskMetric(taskMetric);
        this.listOfStages.add(stageCompleted);
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkBernoulliSampleOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final RddChannel.Instance input = (RddChannel.Instance) inputs[0];
        final RddChannel.Instance output = (RddChannel.Instance) outputs[0];


        final JavaRDD<Type> inputRdd = input.provideRdd();
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCartesianOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        final RddChannel.Instance input0 = (RddChannel.Instance) inputs[0];
        final RddChannel.Instance input1 = (RddChannel.Instance) inputs[1];
        final RddChannel.Instance output = (RddChannel.Instance) outputs[0];
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        RddChannel.Instance input = (RddChannel.Instance) inputs[0];
        RddChannel.Instance output = (RddChannel.Instance) outputs[0];

        final JavaRDD<InputType> inputRdd = input.provideRdd();
```

### DuplicatedCode
Duplicated code
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMaterializedGroupByOperator.java`
#### Snippet
```java
        assert inputs.length == this.getNumInputs();
        assert outputs.length == this.getNumOutputs();

        RddChannel.Instance input = (RddChannel.Instance) inputs[0];
        RddChannel.Instance output = (RddChannel.Instance) outputs[0];

        final JavaRDD<Type> inputRdd = input.provideRdd();
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/data/Data.java`
#### Snippet
```java
            int dff = 0;
            if (asc1) {
                dff = o1.compareTo(o2);
            } else {
                dff = o2.compareTo(o1);
            }
            // second level of sorting
            if (dff == 0) {
                int dff2 = 0;
                if (asc2) {
                    dff2 = o1.compareRank(o2);
                } else {
                    dff2 = o2.compareRank(o1);
                }
                // third level of sorting
                if (dff2 == 0) {
                    if ((o1.isPivot() && o2.isPivot())
                            || (!o1.isPivot() && !o2.isPivot())) {
                        return ((int) o1.getRowID() - (int) o2.getRowID());
                    } else if (o1.isPivot()) {
                        if (asc1) {
                            return -1;
                        } else {
                            return 1;
                        }
                    } else if (o2.isPivot()) {
                        if (!asc1) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
                return dff2;
            }
            return dff;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/DataComparator.java`
#### Snippet
```java
        if (asc1) {
            dff = o1.compareTo(o2);
        } else {
            dff = o2.compareTo(o1);
        }
        // second level of sorting
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareRank(o2);
            } else {
                dff2 = o2.compareRank(o1);
            }
            // third level of sorting
            if (dff2 == 0) {
                if ((o1.isPivot() && o2.isPivot())
                        || (!o1.isPivot() && !o2.isPivot())) {
                    return ((int) o1.getRowID() - (int) o2.getRowID());
                } else if (o1.isPivot()) {
                    if (asc1) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (o2.isPivot()) {
                    if (!asc1) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
            return dff2;
        }
        return dff;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/IEJoinOperator.java`
#### Snippet
```java
        Tuple5<Boolean, Boolean, Boolean, Boolean, Boolean> sortOrders = IEJoinMasterOperator.getSortOrders(this.cond0, this.cond1);
        list1ASC = sortOrders.getField0();
        list1ASCSec = sortOrders.getField1();
        list2ASC = sortOrders.getField2();
        list2ASCSec = sortOrders.getField3();
        equalReverse = sortOrders.getField4();
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        final JavaRDD<Input> rdd1 = rinput1.provideRdd();

        JavaPairRDD<List2AttributesObjectSkinny<Type0, Type1>, List2AttributesObjectSkinny<Type0, Type1>> listOfListObject = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r1RowIDS = null;
        JavaPairRDD<Long, Tuple2<Long, Input>> r2RowIDS = null;
        JavaRDD<org.apache.wayang.basic.data.Tuple2<Input, Input>> outRDD = null;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        int partCount = rdd0.mapPartitions(input -> {
                    Iterator<Input> it = input;
                    ArrayList<Integer> out = new ArrayList<Integer>(1);
                    int i = 0;
                    while (it.hasNext()) {
                        it.next();
                        i++;
                    }
                    out.add(i);
                    return out.iterator();
                }
                , true).reduce((input1, input2) -> Math.max(input1, input2));
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<Data<Type0, Type1>, Tuple2<Long, Input>> keyedDataRDD2 = inputRDD2UID
                .keyBy(new extractData<Type0, Type1, Input>(get1Pivot_, get1Ref_)).sortByKey(new Data.Comparator<Type0, Type1>(list2ASC, list2ASCSec));

        // convert each partition to List2AttributesObjectSkinny
        JavaRDD<List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD1 = keyedDataRDD1
                .values().mapPartitionsWithIndex(
                        new build2ListObject<Type0, Type1, Input>(list1ASC, list1ASCSec, get0Pivot_, get0Ref_), true);
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaRDD<List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD2 = keyedDataRDD2
                .values().mapPartitionsWithIndex(
                        new build2ListObject<Type0, Type1, Input>(list2ASC, list2ASCSec, get1Pivot_, get1Ref_), true);

        // get partition ID for each List2AttributesObjectSkinny object
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD1Indexd = listObjectDataRDD1
                .keyBy(in -> in.getPartitionID());
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<Long, List2AttributesObjectSkinny<Type0, Type1>> listObjectDataRDD2Indexd = listObjectDataRDD2
                .keyBy(in -> in.getPartitionID());

        // get information on each List2AttributesObjectSkinny object
        JavaRDD<Tuple5<Long, Type0, Type0, Type1, Type1>> rdd1TinyObjects = listObjectDataRDD1
                .map(in -> {
                    Tuple2<Type1, Type1> refMinMax = in.findMinMaxRank();
                    return new Tuple5<Long, Type0, Type0, Type1, Type1>(in.getPartitionID(),
                            in.getHeadTupleValue(), in.getTailTupleData().getValue(),
                            refMinMax._1(), refMinMax._2());
                }).repartition(1);
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaRDD<Tuple5<Long, Type0, Type0, Type1, Type1>> rdd2TinyObjects = listObjectDataRDD2
                .map(in -> {
                    Tuple2<Type1, Type1> refMinMax = in.findMinMaxRank();
                    return new Tuple5<Long, Type0, Type0, Type1, Type1>(in.getPartitionID(),
                            in.getHeadTupleValue(), in.getTailTupleData().getValue(),
                            refMinMax._1(), refMinMax._2());
                }).repartition(1);
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/SparkIEJoinOperator.java`
#### Snippet
```java
        JavaPairRDD<Long, Input> tmpOut2 = tmpOut1.join(r1RowIDS).mapToPair(
                in -> new Tuple2<Long, Input>(in._2()._1(), in._2()._2()._2()));

        outRDD = tmpOut2.join(r2RowIDS).map(in -> new org.apache.wayang.basic.data.Tuple2<Input, Input>(in._2()._1(), in._2()._2()._2()));

        output.accept(outRDD, sparkExecutor);

        return ExecutionOperator.modelLazyExecution(inputs, outputs, operatorContext);
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            int[] permutationArray = new int[lst1a.size()];
            for (int i = 0; i < permutationArray.length; i++) {
                permutationArray[i] = i;
            }
            ArrayList<Tuple2<Data<Type0, Type1>, Input>> list2 = new ArrayList<Tuple2<Data<Type0, Type1>, Input>>();//new Tuple2<Data<Type0,Type1>,Input>[lst1a.length];
            //Collections.copy(lst1a,list2);
            list2.addAll(lst1a);

            new myMergeSort<Type0, Type1, Input>().sort(list2, permutationArray, new revDataComparator<Type0, Type1, Input>(
                    list2ASC, list2ASCSec, equalReverse));
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
        ArrayList<Tuple2<Input, Input>> violation = new ArrayList<Tuple2<Input, Input>>(
                300000);
        long cnt = 0;
        int chunckSize = Math.min(permutationArray.length, 1024); // in bit

        BitSet bitArray = new BitSet(permutationArray.length);
        int indexSize = permutationArray.length / chunckSize;

        if (permutationArray.length % chunckSize != 0)
            ++indexSize;

        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }

        int max = 0;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        int destLow = low;
        int destHigh = high;
        low += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, bDst, bSrc, low, mid, -off, c);
        mergeSort(dest, src, bDst, bSrc, mid, high, -off, c);
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/revDataComparator.java`
#### Snippet
```java
        int dff = 0;
        if (asc1) {
            dff = o1.compareRank(o2);
        } else {
            dff = o2.compareRank(o1);
        }
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareTo(o2);
            } else {
                dff2 = o2.compareTo(o1);
            }
            // third level of sorting
            if (dff2 == 0) {
                if ((o1.isPivot() && o2.isPivot())
                        || (!o1.isPivot() && !o2.isPivot())) {
                    if (!revRowID) {
                        return ((int) o1.getRowID() - (int) o2.getRowID());
                    } else {
                        return ((int) o2.getRowID() - (int) o1.getRowID());
                    }
                } else if (o1.isPivot() && !revRowID) {
                    if (asc1) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (o2.isPivot() && !revRowID) {
                    if (!asc1) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    if (asc1) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            return dff2;
        }
        return dff;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/revDataComparator.java`
#### Snippet
```java
        if (asc1) {
            dff = o1.compareRank(o2);
        } else {
            dff = o2.compareRank(o1);
        }
        if (dff == 0) {
            int dff2 = 0;
            if (asc2) {
                dff2 = o1.compareTo(o2);
            } else {
                dff2 = o2.compareTo(o1);
            }
            // third level of sorting
            if (dff2 == 0) {
                if ((o1.isPivot() && o2.isPivot())
                        || (!o1.isPivot() && !o2.isPivot())) {
                    if (!revRowID) {
                        return ((int) o1.getRowID() - (int) o2.getRowID());
                    } else {
                        return ((int) o2.getRowID() - (int) o1.getRowID());
                    }
                } else if (o1.isPivot() && !revRowID) {
                    if (asc1) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (o2.isPivot() && !revRowID) {
                    if (!asc1) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    if (asc1) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            return dff2;
        }
        return dff;
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
            int[] permutationArray = new int[lst1a.length];
            for (int i = 0; i < permutationArray.length; i++) {
                permutationArray[i] = i;
            }
            Data[] list2 = new Data[lst1a.length];
            System.arraycopy(lst1a, 0, list2, 0, lst1a.length);

            myMergeSort.sort(list2, permutationArray, new revDataComparator(
                    list2ASC, list2ASCSec, equalReverse));
```

### DuplicatedCode
Duplicated code
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java
        ArrayList<Tuple2<Long, Long>> violation = new ArrayList<Tuple2<Long, Long>>(
                300000);
        long cnt = 0;
        int chunckSize = Math.min(permutationArray.length, 1024); // in bit

        BitSet bitArray = new BitSet(permutationArray.length);
        int indexSize = permutationArray.length / chunckSize;

        if (permutationArray.length % chunckSize != 0)
            ++indexSize;

        short[] bitIndex = new short[indexSize];

        for (int k = 0; k < bitIndex.length; k++) {
            bitIndex[k] = 0;
        }

        int max = 0;
```

### DuplicatedCode
Duplicated code
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/BinaryOperatorProfiler.java`
#### Snippet
```java
        Collection<Object> dataQuanta0 = new ArrayList<>(inputCardinality0);
        final Supplier<?> supplier0 = this.dataQuantumGenerators.get(0);
        for (int i = 0; i < inputCardinality0; i++) {
            dataQuanta0.add(supplier0.get());
        }
```

### DuplicatedCode
Duplicated code
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        System.out.println("Running garbage collector...");
        for (int i = 0; i < GC_RUNS; i++) {
            System.gc();
        }
        ProfilingUtils.sleep(1000);

        System.out.printf("Profiling %s with %d data quanta.\n", sourceProfiler, cardinality);
        final StopWatch stopWatch = createStopWatch();

        System.out.println("Prepare...");
        final TimeMeasurement preparation = stopWatch.start("Preparation");
        sourceProfiler.prepare(cardinality);
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = sourceProfiler.run();
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### DuplicatedCode
Duplicated code
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/Profiler.java`
#### Snippet
```java
        preparation.stop();

        System.out.println("Execute...");
        final TimeMeasurement execution = stopWatch.start("Execution");
        final OperatorProfiler.Result result = binaryOperatorProfiler.run();
        execution.stop();

        System.out.println("Measurement:");
        System.out.println(result);
        System.out.println(stopWatch.toPrettyString());
        System.out.println();

        return result;
```

### DuplicatedCode
Duplicated code
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/java/SinkProfiler.java`
#### Snippet
```java
        Validate.isTrue(inputCardinalities.length == 1);

        super.prepare(inputCardinalities);
        int inputCardinality = (int) inputCardinalities[0];

        // Create input data.
        Collection<Object> dataQuanta = new ArrayList<>(inputCardinality);
        final Supplier<?> supplier = this.dataQuantumGenerators.get(0);
        for (int i = 0; i < inputCardinality; i++) {
            dataQuanta.add(supplier.get());
        }
        this.inputChannelInstance = createChannelInstance(dataQuanta);
```

### DuplicatedCode
Duplicated code
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/BinaryOperatorProfiler.java`
#### Snippet
```java
        outputChannelInstance.provideRdd().foreach(dataQuantum -> {
        });
        final long endTime = System.currentTimeMillis();
        ProfilingUtils.sleep(this.executionPaddingTime); // Pad measurement with some idle time.

        // Yet another run to count the output cardinality.
        final long outputCardinality = outputChannelInstance.provideRdd().count();

        // Gather and assemble all result metrics.
        return new Result(
                this.inputCardinalities,
                outputCardinality,
                endTime - startTime,
                this.provideDiskBytes(startTime, endTime),
                this.provideNetworkBytes(startTime, endTime),
                this.provideCpuCycles(startTime, endTime),
                this.numMachines,
                this.numCoresPerMachine
        );
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/OptimizationUtils.java`
#### Snippet
```java
        final InputSlot<?> outerInput = input.getOwner().getOutermostInputSlot(input);
        Set<InputSlot<Object>> allInputs = outerInput.getOwner().collectMappedInputSlots(outerInput.unchecked());
        result.addAll(allInputs);

        final OutputSlot<?> outerOutput = outerInput.getOccupant();
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
            Set<Slot<?>> openSlots = new HashSet<>();
            // Add all the slots from the baseEnumeration.
            openSlots.addAll(this.baseEnumeration.getRequestedInputSlots());
            for (Tuple<OutputSlot<?>, InputSlot<?>> outputInput : this.baseEnumeration.getServingOutputSlots()) {
                openSlots.add(outputInput.getField0());
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/myMergeSort.java`
#### Snippet
```java
        //System.arraycopy(a, 0, aux, 0, a.size());
        //Collections.copy(a,aux);
        aux.addAll(a);
        int[] baux = b.clone();
        mergeSort(aux, a, baux, b, 0, a.size(), 0, c);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            ArrayList<Tuple2<Data<Type0, Type1>, Input>> list2 = new ArrayList<Tuple2<Data<Type0, Type1>, Input>>();//new Tuple2<Data<Type0,Type1>,Input>[lst1a.length];
            //Collections.copy(lst1a,list2);
            list2.addAll(lst1a);

            new myMergeSort<Type0, Type1, Input>().sort(list2, permutationArray, new revDataComparator<Type0, Type1, Input>(
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java
            //System.arraycopy(list1, 0, list2, 0, list1.size());
            //Collections.copy(list1,list2);
            list2.addAll(list1);
            new myMergeSort<Type0, Type1, Input>().sort(list2, permutationArray, new revDataComparator<Type0, Type1, Input>(
                    list2ASC, list2ASCSec, equalReverse));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/PrintUtils.java`
#### Snippet
```java
        operators.forEach(o -> sw.append(o.toString()));

        System.out.println(sw.toString());
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
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/execution/JdbcExecutor.java`
#### Snippet
```java

            } else {
                throw new WayangException(String.format("Unsupported JDBC execution task %s", nextTask.toString()));
            }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Canonicalizer.java`
#### Snippet
```java
    @Override
    public boolean contains(Object o) {
        return this.entries.containsKey(o);
    }

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
Inner class `KeyIndex` may be 'static'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java
     * Extracts key index from the call
     */
    private class KeyIndex extends RexVisitorImpl<Integer> {
        final Child child;

```

### InnerClassMayBeStatic
Inner class `MapFunctionImpl` may be 'static'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java
     * Flattens Tuple2<Record, Record> to Record
     */
    private class MapFunctionImpl implements FunctionDescriptor.SerializableFunction<Tuple2<Record, Record>, Record> {
        public MapFunctionImpl() {
            super();
```

### InnerClassMayBeStatic
Inner class `KeyExtractor` may be 'static'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/converter/WayangJoinVisitor.java`
#### Snippet
```java
     * Extracts the key
     */
    private class KeyExtractor implements FunctionDescriptor.SerializableFunction<Record, Object> {
        private final int index;

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

### InnerClassMayBeStatic
Inner class `PageRankVertexWriter` may be 'static'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
         * Simple VertexWriter that supports {@link PageRankAlgorithm}
         */
        public class PageRankVertexWriter extends TextVertexWriter {
            @Override
            public void writeVertex(
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/rules/WayangRules.java`
#### Snippet
```java
            final RelOptTable relOptTable = scan.getTable();

            /**
             * This is quick hack to prevent volcano from merging projects on to TableScans
             * TODO: a cleaner way to handle this
```

### DanglingJavadoc
Dangling Javadoc comment
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
                dataOut.writeInt(this.NULL);

            /**
             * Byte Array cases
             */
```

### DanglingJavadoc
Dangling Javadoc comment
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
                writeBytes(obj, dataOut);
            }
            /**
             * String case
             * */
```

### DanglingJavadoc
Dangling Javadoc comment
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
                writeUTF((String) obj, dataOut);

            /**
             * Key, Value case
             * */
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/S3FileSystem.java`
#### Snippet
```java
    String key = pair.getKey();
    long size = listChildren(pair).stream().filter(name -> ! name.equals(key)).count();
    if(size > 0){
      return true;
    }
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
        this.writer = null;
        final PartialExecution.Serializer serializer = new PartialExecution.Serializer(this.configuration);
        return Files.lines(Paths.get(this.repositoryPath), Charset.forName("UTF-8"))
                .map(line -> {
                    try {
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
    public void save(Collection<Experiment> experiments, OutputStream outputStream) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            this.save(experiments, writer);
        } catch (UnsupportedEncodingException e) {
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
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkTextFileSourceProfiler.java`
#### Snippet
```java
                new OutputStreamWriter(
                        fileSystem.create(this.fileUrl),
                        "UTF-8"
                )
        )) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
        this.writer = null;
        final PartialExecution.Serializer serializer = new PartialExecution.Serializer(this.configuration);
        return Files.lines(Paths.get(this.repositoryPath), Charset.forName("UTF-8"))
                .map(line -> {
                    try {
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/grep/Grep.java`
#### Snippet
```java

  public static void pureJava(String input, String output) throws IOException {
    Iterator<CharSequence> out = Files.lines(Paths.get(input))
        .filter(line -> line.contains("six"))
        .map(str -> (CharSequence) str)
```

### AutoCloseableResource
'ExecutorService' used without 'try'-with-resources statement
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
            List<Type> allSamples = new ArrayList<>();

            ExecutorService executorService = Executors.newFixedThreadPool(map.size());

            Iterator<Integer> parts = map.keySet().iterator();
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `activators` to `Queue` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/traversal/AbstractTopologicalTraversal.java`
#### Snippet
```java
                final ActivatorType activator = activators.poll();
                // Without this double-cast, we run into a compiler bug: https://bugs.openjdk.java.net/browse/JDK-8131744
                activator.process((Queue<Activator<ActivationType>>) (Queue) activators);
            } while (!activators.isEmpty());
        } catch (AbortException e) {
```

### RedundantCast
Casting `(nextReadPos - readPos)` to `long` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ConsumerIteratorAdapter.java`
#### Snippet
```java
        // Commit the updated read position.
        int nextReadPos = (readPos + 1) & this.stateBits;
        long delta = (long) (nextReadPos - readPos);
        this.state.addAndGet(delta);

```

### RedundantCast
Casting `v` to `TextNode` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
            return null;
          } else if(v instanceof TextNode){
            return ((TextNode)v).asText();
          }else if(v instanceof DoubleNode){
            return ((DoubleNode)v).asDouble();
```

### RedundantCast
Casting `v` to `DoubleNode` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
            return ((TextNode)v).asText();
          }else if(v instanceof DoubleNode){
            return ((DoubleNode)v).asDouble();
          }else if(v instanceof IntNode){
            return ((IntNode)v).asInt();
```

### RedundantCast
Casting `v` to `IntNode` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
            return ((DoubleNode)v).asDouble();
          }else if(v instanceof IntNode){
            return ((IntNode)v).asInt();
          }else if(v instanceof LongNode){
            return ((LongNode)v).asLong();
```

### RedundantCast
Casting `v` to `LongNode` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
            return ((IntNode)v).asInt();
          }else if(v instanceof LongNode){
            return ((LongNode)v).asLong();
          }

```

### RedundantCast
Casting `operator` to `T` is redundant
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/OperatorPattern.java`
#### Snippet
```java
     */
    private boolean matchAdditionalTests(T operator) {
        return this.additionalTests.stream().allMatch(test -> test.test((T) operator));
    }

```

### RedundantCast
Casting `broadcastChannelInstance.provideCollection()` to `Collection` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/execution/JavaExecutionContext.java`
#### Snippet
```java
            if (input.isBroadcast() && input.getName().equals(name)) {
                final CollectionChannel.Instance broadcastChannelInstance = (CollectionChannel.Instance) this.inputs[i];
                return (Collection<T>) broadcastChannelInstance.provideCollection();
            }
        }
```

### RedundantCast
Casting `this.getSampleSize(...)` to `Integer` is redundant
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaRandomSampleOperator.java`
#### Snippet
```java


        Integer sampleSize = (Integer) this.getSampleSize(operatorContext);
        Long datasetSize = this.isDataSetSizeKnown() ? this.getDatasetSize() :
                ((CollectionChannel.Instance) inputs[0]).provideCollection().size();
```

### RedundantCast
Casting `channel.createInstance(...)` to `RddChannel.Instance` is redundant
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/spark/SparkOperatorProfiler.java`
#### Snippet
```java
        final ChannelDescriptor channelDescriptor = RddChannel.CACHED_DESCRIPTOR;
        final RddChannel channel = (RddChannel) channelDescriptor.createChannel(null, sparkExecutor.getConfiguration());
        return (RddChannel.Instance) channel.createInstance(null, null, -1);
    }

```

### RedundantCast
Casting `this.dataSet` to `DataSet` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/channels/DataSetChannel.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        public <T> DataSet<T> provideDataSet() {
            return (DataSet<T>) this.dataSet;
        }

```

### RedundantCast
Casting `dataQuantum` to `Tuple2` is redundant
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java
                    public String map(Type dataQuantum) throws Exception {
                        this.dataQuantum = dataQuantum;
                        Tuple2 tuple2 = (Tuple2) dataQuantum;
                        return String.valueOf(tuple2.field0) + '\t' + String.valueOf(tuple2.field1);                    }
                }).setParallelism(flinkExecutor.getNumDefaultPartitions());
```

### RedundantCast
Casting `this.rdd` to `JavaRDD` is redundant
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/channels/RddChannel.java`
#### Snippet
```java
        @SuppressWarnings("unchecked")
        public <T> JavaRDD<T> provideRdd() {
            return (JavaRDD<T>) this.rdd;
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param s` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
    /**
     * Parse line with a separator
     * @param s
     * @param separator
     * @return
```

### JavadocDeclaration
`@param separator` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
     * Parse line with a separator
     * @param s
     * @param separator
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
     * @param s
     * @param separator
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/CsvRowConverter.java`
#### Snippet
```java
     * @param separator
     * @return
     * @throws IOException
     */
    public static String[] parseLine(String s, char separator) throws IOException {
```

### JavadocDeclaration
`@param sourcePath` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
    /**
     * Constructor with separator
     * @param sourcePath
     * @param type
     * @param fieldTypes
```

### JavadocDeclaration
`@param type` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
     * Constructor with separator
     * @param sourcePath
     * @param type
     * @param fieldTypes
     * @param separator
```

### JavadocDeclaration
`@param fieldTypes` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
     * @param sourcePath
     * @param type
     * @param fieldTypes
     * @param separator
     */
```

### JavadocDeclaration
`@param separator` tag description is missing
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/sources/fs/JavaCSVTableSource.java`
#### Snippet
```java
     * @param type
     * @param fieldTypes
     * @param separator
     */
    public JavaCSVTableSource(String sourcePath, DataSetType type, List<RelDataType> fieldTypes, char separator) {
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/ExecutionOperator.java`
#### Snippet
```java
     * @param producerOperatorContext the {@link OptimizationContext.OperatorContext} for this instance
     * @param inputChannelInstances   the input {@link ChannelInstance}s for the {@code task}
     * @return
     */
    default ChannelInstance[] createOutputChannelInstances(Executor executor,
```

### JavadocDeclaration
`@param operatorAlternative` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/TopDownPlanVisitor.java`
#### Snippet
```java
     * todo
     *
     * @param operatorAlternative
     */
    public abstract Return visit(OperatorAlternative operatorAlternative, OutputSlot<?> fromOutputSlot, Payload payload);
```

### JavadocDeclaration
Javadoc pointing to itself
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/Operator.java`
#### Snippet
```java

    /**
     * Convenience version of {@link Operator#propagateOutputCardinality(int, OptimizationContext.OperatorContext)},
     * where the adjacent {@link InputSlot}s reside in the same {@link OptimizationContext} as the {@code operatorContext}.
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/PlanTraversal.java`
#### Snippet
```java
     * @param fromInput  {@link InputSlot} via that the {@link Operator} should be entered
     * @param fromOutput {@link OutputSlot} via that the {@link Operator} should be entered
     * @return whether the {@link Operator} could be entered
     */
    private void enter(OperatorContainer container, InputSlot<?> fromInput, OutputSlot<?> fromOutput) {
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionPlan.java`
#### Snippet
```java
     * labels:documentation,todo
     *
     * @return
     */
    public List<Map> toJsonList() {
```

### JavadocDeclaration
`@param task` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionStage.java`
#### Snippet
```java
     * comprise the {@link LoopHeadOperator}.
     *
     * @param task
     */
    private void updateLoop(ExecutionTask task) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/AbstractReferenceCountable.java`
#### Snippet
```java
    /**
     * Dispose this instance, which is not referenced anymore. This method should always be invoked through
     * {@link #disposeUnreferenced()}
     */
    protected abstract void disposeUnreferenced();
```

### JavadocDeclaration
`@param ` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
     * @param className    the name of the {@link Class} that comprises the method
     * @param variableName the name of the method
     * @param <T>
     * @return the return value of the executed method
     */
```

### JavadocDeclaration
`@param ` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/ReflectionUtils.java`
#### Snippet
```java
     * @param className  the name of the {@link Class} that comprises the method
     * @param methodName the name of the method
     * @param <T>
     * @return the return value of the executed method
     */
```

### JavadocDeclaration
Tag `param` is not allowed here
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/mapping/SubplanPattern.java`
#### Snippet
```java

        /**
         * @param minEpoch the (inclusive) minimum epoch value for matched subplans
         */
        private final int minEpoch;
```

### JavadocDeclaration
`@param optimizationContext` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/Executor.java`
#### Snippet
```java
     *
     * @param stage          should be executed; must be executable by this instance, though
     * @param optimizationContext
     *@param executionState provides and accepts execution-related objects  @return collected metadata from instrumentation
     */
```

### JavadocDeclaration
`@param ` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/lineage/LazyExecutionLineageNode.java`
#### Snippet
```java
     * @param aggregator  visits the traversed instances
     * @param isMark      whether traversed instances should be marked
     * @param <T>
     * @return the {@code accumulator} in its final state
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
     * TODO: (Documentation) add SanityChecker.getFlatAlternativeCallback
     *   labels: documentation,todo
     * @return
     */
    private PlanTraversal.Callback getFlatAlternativeCallback(AtomicBoolean testOutcome) {
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/SanityChecker.java`
#### Snippet
```java
     * TODO: (Documentation) add SanityChecker.checkFlatAlternatives
     *   labels: documentation,todo
     * @return
     */
    public boolean checkFlatAlternatives() {
```

### JavadocDeclaration
`@param producerOperatorContext` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PushExecutorTemplate.java`
#### Snippet
```java
     * @param task                    that should be executed
     * @param inputChannelInstances   inputs into the {@code task}
     * @param producerOperatorContext
     * @param isRequestEagerExecution whether the {@link ExecutionTask} should be executed eagerly if possible
     * @return the {@link ChannelInstance}s created as output of {@code task}
```

### JavadocDeclaration
Tag `return` is not allowed here
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
     *
     * @param stageActivator that should be executed
     * @return whether the {@link ExecutionStage} was really executed
     */
    private void execute(StageActivator stageActivator) {
```

### JavadocDeclaration
`@param optimizationContext` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
         *
         * @param stage               that should be activated
         * @param optimizationContext
         */
        private StageActivator(ExecutionStage stage, OptimizationContext optimizationContext) {
```

### JavadocDeclaration
`@param operator` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
         * {@link Activation}, then these will be created, registered, and connected.
         *
         * @param operator
         */
        private void addAndRegisterActivator(Operator operator) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/profiling/ExecutionLog.java`
#### Snippet
```java
     *
     * @return a {@link Stream} of the contained {@link PartialExecution}s
     * @throws IOException
     */
    public Stream<PartialExecution> stream() throws IOException {
```

### JavadocDeclaration
`@param operator` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/ExecutionTaskFlowCompiler.java`
#### Snippet
```java
         * Convenience constructor for when we are not inside of a {@link LoopImplementation.IterationImplementation}.
         *
         * @param operator
         */
        public Activator(ExecutionOperator operator) {
```

### JavadocDeclaration
`@param optimizationContext` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
     *
     * @param executionOperator   will be wrapped in the new instance
     * @param optimizationContext
     * @return the new instance
     */
```

### JavadocDeclaration
`@param concatenationMeasurement` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumeration.java`
#### Snippet
```java
     * @param optimizationContext      provides concatenation information
     * @param concatenationEnumeration to which the {@link PlanImplementation}s should be added
     * @param concatenationMeasurement
     * @param isRequestBreakpoint      whether a breakpoint-capable {@link Channel} should be inserted
     * @return the concatenated {@link PlanImplementation}s
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * Checks whether this instance is enumerating a top-level plan and is not a recursively invoked enumeration.
     *
     * @return
     */
    public boolean isTopLevel() {
```

### JavadocDeclaration
`@param optimizationContext` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     *
     * @param alternative         an {@link OperatorAlternative.Alternative} to be enumerated recursively
     * @param optimizationContext
     * @return the new instance
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/TextFileSource.java`
#### Snippet
```java

        /**
         * We expect selectivities to be correct within a factor of {@value #EXPECTED_ESTIMATE_DEVIATION}.
         */
        public static final double EXPECTED_ESTIMATE_DEVIATION = 0.05;
```

### JavadocDeclaration
`@param producerOperatorContext` tag description is missing
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/channels/FileChannel.java`
#### Snippet
```java
        /**
         * Creates a new instance.
         * @param producerOperatorContext
         * @param producerOutputIndex
         */
```

### JavadocDeclaration
`@param producerOutputIndex` tag description is missing
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/channels/FileChannel.java`
#### Snippet
```java
         * Creates a new instance.
         * @param producerOperatorContext
         * @param producerOutputIndex
         */
        protected Instance(OptimizationContext.OperatorContext producerOperatorContext, int producerOutputIndex) {
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * @param alternative        contains this instance
     * @param newPlanEnumeration will host the new instance
     * @return
     */
    public PlanImplementation escape(OperatorAlternative.Alternative alternative, PlanEnumeration newPlanEnumeration) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/operators/ObjectFileSource.java`
#### Snippet
```java

        /**
         * We expect selectivities to be correct within a factor of {@value #EXPECTED_ESTIMATE_DEVIATION}.
         */
        public static final double EXPECTED_ESTIMATE_DEVIATION = 0.05;
```

### JavadocDeclaration
`@param functionDescriptor` tag description is missing
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/operators/JavaFlatMapOperator.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param functionDescriptor
     */
    public JavaFlatMapOperator(DataSetType<InputType> inputType, DataSetType<OutputType> outputType,
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     *
     * @return Collection of {@link Experiment}s
     * @throws IOException
     */
    public Collection<Experiment> load() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     *
     * @param experiments Array of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public void append(Experiment... experiments) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     *
     * @param experiments Collection of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public void save(Collection<Experiment> experiments) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     * @param experiments Collection of {@link Experiment}s to be persisted
     * @param outputStream Indicates where the data must to be written
     * @throws IOException
     */
    public void save(Collection<Experiment> experiments, OutputStream outputStream) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     *
     * @param experiments Collection of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public void append(Collection<Experiment> experiments) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     * @param inputStream Data to be read
     * @return Collection of {@link Experiment}s
     * @throws IOException
     */
    public Collection<Experiment> load(InputStream inputStream) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     *
     * @param experiments Array of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public void save(Experiment... experiments) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     *
     * @param experiments Collection of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public abstract void save(Collection<Experiment> experiments) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     *
     * @return Collection of {@link Experiment}s
     * @throws IOException
     */
    public abstract Collection<Experiment> load() throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     *
     * @param experiments Collection of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public abstract void append(Collection<Experiment> experiments) throws IOException ;
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     *
     * @param experiments Array of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public abstract void append(Experiment... experiments) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
     *
     * @param experiments Array of {@link Experiment}s to be persisted
     * @throws IOException
     */
    public abstract void save(Experiment... experiments) throws IOException;
```

### JavadocDeclaration
`@param uri` tag description is missing
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/storage/Storage.java`
#### Snippet
```java
    /**
     * Allows to change where future experiments will be persisted and loaded
     * @param uri
     */
    public void changeLocation(URI uri){
```

### JavadocDeclaration
`@param graphName` tag description is missing
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/operators/GraphChiPageRankOperator.java`
#### Snippet
```java
     * Initialize the sharder-program.
     *
     * @param graphName
     * @param numShards
     * @return
```

### JavadocDeclaration
`@param numShards` tag description is missing
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/operators/GraphChiPageRankOperator.java`
#### Snippet
```java
     *
     * @param graphName
     * @param numShards
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/operators/GraphChiPageRankOperator.java`
#### Snippet
```java
     * @param graphName
     * @param numShards
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-platforms/wayang-graphchi/src/main/java/org/apache/wayang/graphchi/operators/GraphChiPageRankOperator.java`
#### Snippet
```java
     * @param numShards
     * @return
     * @throws IOException
     */
    protected static FastSharder createSharder(String graphName, int numShards) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/terasort/Unsigned16.java`
#### Snippet
```java
   * @param ch the character
   * @return the digit from 0 to 15
   * @throws NumberFormatException
   */
  private static int getHexDigit(char ch) throws NumberFormatException {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/OutputFormatConsumer.java`
#### Snippet
```java

/**
 * Wrapper for {@Link OutputFormat}
 */
public class OutputFormatConsumer<T> implements OutputFormat<T>, Serializable {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/FlinkCoGroupFunction.java`
#### Snippet
```java

/**
 * Wrapper of {@Link CoGroupFunction} of Flink for use in Wayang
 */
public class FlinkCoGroupFunction<InputType0, InputType1, OutputType> implements CoGroupFunction<InputType0, InputType1, OutputType> {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/KeySelectorFunction.java`
#### Snippet
```java

/**
 * Wrapper for {@Link KeySelector}
 */
public class KeySelectorFunction<T, K> implements KeySelector<T, K>, ResultTypeQueryable<K>, Serializable {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/KeySelectorDistinct.java`
#### Snippet
```java

/**
 * Wrapper for {@Link KeySelector}
 */
public class KeySelectorDistinct<T> implements KeySelector<T, String>, Serializable {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/DummyMap.java`
#### Snippet
```java

/**
 * Class create a {@Link MapFunction} that genereta only null as convertion
 */
public class DummyMap<InputType, OutputType> implements MapFunction<InputType, OutputType>, ResultTypeQueryable<OutputType> {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/DummyFilter.java`
#### Snippet
```java

/**
 * Create a {@Link FilterFunction} that remove the elements null
 */
public class DummyFilter<InputType> implements FilterFunction<InputType>, ResultTypeQueryable<InputType> {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangFilterCriterion.java`
#### Snippet
```java

/**
 * Class create a {@Link FilterFunction} for use inside of the LoopOperators
 */
public class WayangFilterCriterion<T> extends AbstractRichFunction implements FilterFunction<T> {
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java

/**
 * Class create a {@Link ConvergenceCriterion} that generate aggregatorWrapper
 */
public class WayangConvergenceCriterion<T>
```

### JavadocDeclaration
Wrong tag `Link`
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangAggregator.java`
#### Snippet
```java

/**
 * Class create a {@Link Aggregator} that generate aggregatorWrapper
 */
public class WayangAggregator implements Aggregator<ListValue<WayangValue>> {
```

### JavadocDeclaration
`@param functionDescriptor` tag description is missing
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkFlatMapOperator.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param functionDescriptor
     */
    public FlinkFlatMapOperator(DataSetType<InputType> inputType, DataSetType<OutputType> outputType,
```

### JavadocDeclaration
`@param functionDescriptor` tag description is missing
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkFlatMapOperator.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param functionDescriptor
     */
    public SparkFlatMapOperator(DataSetType inputType, DataSetType outputType,
```

### JavadocDeclaration
`@param functionDescriptor` tag description is missing
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkMapOperator.java`
#### Snippet
```java
     * Creates a new instance.
     *
     * @param functionDescriptor
     */
    public SparkMapOperator(DataSetType inputType, DataSetType outputType,
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `json` may be 'final'
in `wayang-api/wayang-api-sql/src/main/java/org/apache/wayang/api/sql/calcite/utils/ModelParser.java`
#### Snippet
```java
public class ModelParser {
    private Configuration configuration;
    private JSONObject json;

    public ModelParser() throws IOException, ParseException {
```

### FieldMayBeFinal
Field `connection` may be 'final'
in `wayang-platforms/wayang-jdbc-template/src/main/java/org/apache/wayang/jdbc/platform/JdbcPlatformTemplate.java`
#### Snippet
```java
    }

    private Connection connection = null;

    protected JdbcPlatformTemplate(String platformName, String configName) {
```

### FieldMayBeFinal
Field `blacklist` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/ExplicitCollectionProvider.java`
#### Snippet
```java
    private Set<Value> whitelist = new LinkedHashSet<>();

    private Set<Value> blacklist = new HashSet<>();

    public ExplicitCollectionProvider(Configuration configuration) {
```

### FieldMayBeFinal
Field `whitelist` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/configuration/ExplicitCollectionProvider.java`
#### Snippet
```java
    private static final Logger logger = LogManager.getLogger(ExplicitCollectionProvider.class);

    private Set<Value> whitelist = new LinkedHashSet<>();

    private Set<Value> blacklist = new HashSet<>();
```

### FieldMayBeFinal
Field `alternatives` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorAlternative.java`
#### Snippet
```java
     * because this can be achieved with a {@link Subplan}.
     */
    private List<Alternative> alternatives = new LinkedList<>();

    public static OperatorAlternative wrap(Operator startOperator, Operator endOperator) {
```

### FieldMayBeFinal
Field `stages` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/PlatformExecution.java`
#### Snippet
```java
    private final int sequenceNumber;

    private Collection<ExecutionStage> stages = new LinkedList<>();

    private final Platform platform;
```

### FieldMayBeFinal
Field `costEstimates` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
     * Collects the cost estimates of all (partially) executed {@link PlanImplementation}s.
     */
    private List<ProbabilisticDoubleInterval> costEstimates = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `timeEstimates` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
     * Collects the {@link TimeEstimate}s of all (partially) executed {@link PlanImplementation}s.
     */
    private List<TimeEstimate> timeEstimates = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
     * General purpose cache.
     */
    private Map<String, Object> cache = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `monitor` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/api/Job.java`
#### Snippet
```java
    private final Set<String> udfJarPaths = new HashSet<>();

    private Monitor monitor;


```

### FieldMayBeFinal
Field `siblings` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/Channel.java`
#### Snippet
```java
     * {@link WayangPlan} and share properties such as {@link #getCardinalityEstimate(OptimizationContext)} and {@link #getDataSetType()}.
     */
    private Set<Channel> siblings = new HashSet<>(2);

    /**
```

### FieldMayBeFinal
Field `startingStages` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/executionplan/ExecutionPlan.java`
#### Snippet
```java
     * All {@link ExecutionStage}s without predecessors that need be executed at first.
     */
    private Collection<ExecutionStage> startingStages = new LinkedList<>();

    public void addStartingStage(ExecutionStage executionStage) {
```

### FieldMayBeFinal
Field `BITS_PER_WORD` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Bitmask.java`
#### Snippet
```java
    public static Bitmask EMPTY_BITMASK = new Bitmask(0);

    private static int BITS_PER_WORD = Long.BYTES * 8;

    private static int WORD_ADDRESS_BITS = 6;
```

### FieldMayBeFinal
Field `WORD_ADDRESS_BITS` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/Bitmask.java`
#### Snippet
```java
    private static int BITS_PER_WORD = Long.BYTES * 8;

    private static int WORD_ADDRESS_BITS = 6;

    /**
```

### FieldMayBeFinal
Field `vals` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/CrossProductIterable.java`
#### Snippet
```java
        private final List<java.util.Iterator<T>> partialIterators;

        private List<T> vals;

        private boolean hasEmptyIterator;
```

### FieldMayBeFinal
Field `registeredFileSystems` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/fs/FileSystems.java`
#### Snippet
```java
    private static final LruCache<String, Long> fileSizeCache = new LruCache<>(20);

    private static Collection<FileSystem> registeredFileSystems = Arrays.asList(
            new LocalFileSystem(),
            new HadoopFileSystem(),
```

### FieldMayBeFinal
Field `variableValues` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/DefaultContext.java`
#### Snippet
```java
    private Context parentContext;

    private Map<String, Double> variableValues = new HashMap<>();

    private Map<String, ToDoubleFunction<double[]>> functions = new HashMap<>();
```

### FieldMayBeFinal
Field `functions` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/mathex/DefaultContext.java`
#### Snippet
```java
    private Map<String, Double> variableValues = new HashMap<>();

    private Map<String, ToDoubleFunction<double[]>> functions = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `node` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonArray.java`
#### Snippet
```java
public class WayangJsonArray implements Iterable<Object>{

  private ArrayNode node;

  public WayangJsonArray(){
```

### FieldMayBeFinal
Field `node` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/util/json/WayangJsonObj.java`
#### Snippet
```java
  public static final NullNode NULL = NullNode.getInstance();

  private ObjectNode node;

  public WayangJsonObj(){
```

### FieldMayBeFinal
Field `selectivity` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/MapPartitionsDescriptor.java`
#### Snippet
```java
     * The selectivity ({code 0..*}) of this instance or {@code null} if unspecified.
     */
    private ProbabilisticDoubleInterval selectivity;

    public MapPartitionsDescriptor(SerializableFunction<Iterable<Input>, Iterable<Output>> javaImplementation,
```

### FieldMayBeFinal
Field `selectivity` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/FlatMapDescriptor.java`
#### Snippet
```java
     * The selectivity ({code 0..*}) of this instance or {@code null} if unspecified.
     */
    private ProbabilisticDoubleInterval selectivity;

    public FlatMapDescriptor(SerializableFunction<Input, Iterable<Output>> javaImplementation,
```

### FieldMayBeFinal
Field `selectivity` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/PredicateDescriptor.java`
#### Snippet
```java
     * The selectivity ({code 0..1}) of this instance or {@code null} if unspecified.
     */
    private ProbabilisticDoubleInterval selectivity;

    public PredicateDescriptor(SerializablePredicate<Input> javaImplementation,
```

### FieldMayBeFinal
Field `selectivity` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/function/ConsumerDescriptor.java`
#### Snippet
```java
     * The selectivity ({code 0..1}) of this instance or {@code null} if unspecified.
     */
    private ProbabilisticDoubleInterval selectivity;

    public ConsumerDescriptor(SerializableConsumer<T> javaImplementation, Class<T> inputTypeClass) {
```

### FieldMayBeFinal
Field `cardinalityEstimators` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/plan/wayangplan/OperatorBase.java`
#### Snippet
```java
     * Optional {@link CardinalityEstimator}s for this instance.
     */
    private CardinalityEstimator[] cardinalityEstimators;

    /**
```

### FieldMayBeFinal
Field `lineage` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AbstractChannelInstance.java`
#### Snippet
```java
    private final OptimizationContext.OperatorContext producerOperatorContext;

    private ChannelLineageNode lineage;

    /**
```

### FieldMayBeFinal
Field `atomicExecutions` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AtomicExecutionGroup.java`
#### Snippet
```java
     * The {@link AtomicExecution}s.
     */
    private Collection<AtomicExecution> atomicExecutions;

    /**
```

### FieldMayBeFinal
Field `estimationContext` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AtomicExecutionGroup.java`
#### Snippet
```java
     * The common {@link EstimationContext}.
     */
    private EstimationContext estimationContext;

    /**
```

### FieldMayBeFinal
Field `platform` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AtomicExecutionGroup.java`
#### Snippet
```java
     * The common {@link Platform} for all {@link #atomicExecutions}.
     */
    private Platform platform;

    /**
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/AtomicExecutionGroup.java`
#### Snippet
```java
     * The {@link Configuration} that provides estimation information.
     */
    private Configuration configuration;

    /**
```

### FieldMayBeFinal
Field `initializedPlatforms` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/PartialExecution.java`
#### Snippet
```java
     * Platforms initialized/involved this instance.
     */
    private Collection<Platform> initializedPlatforms = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `nestedEstimators` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/NestableLoadProfileEstimator.java`
#### Snippet
```java
     * {@code Artifact} from the {@code Artifact}s subject to this instance.
     */
    private Collection<LoadProfileEstimator> nestedEstimators = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `nestedEstimators` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/costs/ConstantLoadProfileEstimator.java`
#### Snippet
```java
     * {@code Artifact} from the {@code Artifact}s subject to this instance.
     */
    private Collection<LoadProfileEstimator> nestedEstimators = new LinkedList<>();

    public ConstantLoadProfileEstimator(LoadProfile loadProfile) {
```

### FieldMayBeFinal
Field `completedStages` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
     * Keeps track of {@link ExecutionStage}s that have actually been executed by this instance.
     */
    private Set<ExecutionStage> completedStages = new HashSet<>();

    /**
```

### FieldMayBeFinal
Field `thread_isBreakpointDisabled` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/platform/CrossPlatformExecutor.java`
#### Snippet
```java
         * Check if #breakpoint permits the execution of {@link ExecutionStage}
         */
        private boolean thread_isBreakpointDisabled;

        /**
```

### FieldMayBeFinal
Field `createdActivators` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/cardinality/CardinalityEstimationTraversal.java`
#### Snippet
```java
         * Keeps {@link Activator}s around that have already been created.
         */
        private Map<Operator, Activator> createdActivators = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `conversionCostCache` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
         * Caches cost estimates for {@link ChannelConversion}s.
         */
        private Map<ChannelConversion, Double> conversionCostCache = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `conversionFilterCache` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/channels/ChannelConversionGraph.java`
#### Snippet
```java
         * Caches whether {@link ChannelConversion}s should be filtered.
         */
        private Map<ChannelConversion, Boolean> conversionFilterCache = new HashMap<>();

        /**
```

### FieldMayBeFinal
Field `inputIterator` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonWorkerManager.java`
#### Snippet
```java
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> inputIterator;

    public PythonWorkerManager(
```

### FieldMayBeFinal
Field `udf` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonWorkerManager.java`
#### Snippet
```java
public class PythonWorkerManager<Input, Output> {

    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> inputIterator;
```

### FieldMayBeFinal
Field `serializedUDF` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonWorkerManager.java`
#### Snippet
```java

    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> inputIterator;

```

### FieldMayBeFinal
Field `fst` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ReaderIterator.java`
#### Snippet
```java
    private Output nextObj = null;
    private boolean eos = false;
    private boolean fst = false;
    private DataInputStream stream = null;

```

### FieldMayBeFinal
Field `code` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/function/PythonCode.java`
#### Snippet
```java
public class PythonCode implements Serializable {

  private byte[] code;
  public PythonCode(byte[] code){
    this.code = code;
```

### FieldMayBeFinal
Field `myUDF` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/function/PythonFunctionWrapper.java`
#### Snippet
```java
public class PythonFunctionWrapper<Input, Output>  implements FunctionDescriptor.SerializableFunction<Iterable<Input>, Iterable<Output>> {

  private PythonUDF<Input, Output> myUDF;
  private PythonCode serializedUDF;

```

### FieldMayBeFinal
Field `serializedUDF` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/function/PythonFunctionWrapper.java`
#### Snippet
```java

  private PythonUDF<Input, Output> myUDF;
  private PythonCode serializedUDF;

  public PythonFunctionWrapper(PythonUDF<Input, Output> myUDF, PythonCode serializedUDF){
```

### FieldMayBeFinal
Field `serializedUDF` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
    private Socket socket;
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> input;

```

### FieldMayBeFinal
Field `input` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> input;

    //TODO add to a config file
```

### FieldMayBeFinal
Field `udf` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java

    private Socket socket;
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
    private Iterable<Input> input;
```

### FieldMayBeFinal
Field `socket` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/ProcessFeeder.java`
#### Snippet
```java
public class ProcessFeeder<Input, Output> {

    private Socket socket;
    private PythonUDF<Input, Output> udf;
    private PythonCode serializedUDF;
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java

    //TODO How to get the config
    private Configuration configuration;

    public PythonProcessCaller(PythonCode serializedUDF){
```

### FieldMayBeFinal
Field `serverSocket` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
    private Thread process;
    private Socket socket;
    private ServerSocket serverSocket;
    private boolean ready;

```

### FieldMayBeFinal
Field `socket` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java

    private Thread process;
    private Socket socket;
    private ServerSocket serverSocket;
    private boolean ready;
```

### FieldMayBeFinal
Field `process` may be 'final'
in `wayang-api/wayang-api-python/src/main/java/org/apache/wayang/api/python/executor/PythonProcessCaller.java`
#### Snippet
```java
public class PythonProcessCaller {

    private Thread process;
    private Socket socket;
    private ServerSocket serverSocket;
```

### FieldMayBeFinal
Field `values` may be 'final'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/data/Record.java`
#### Snippet
```java
public class Record implements Serializable, Copyable<Record> {

    private Object[] values;

    public Record(Object... values) {
```

### FieldMayBeFinal
Field `fieldNames` may be 'final'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/types/RecordType.java`
#### Snippet
```java
     * Names of fields in the described {@link Record}s in order of appearance.
     */
    private String[] fieldNames;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * Logger.
     */
    private Logger logger = LogManager.getLogger(this.getClass());

    /**
```

### FieldMayBeFinal
Field `isEnumeratingBranchesFirst` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanEnumerator.java`
#### Snippet
```java
     * Tells whether branches should be enumerated first.
     */
    private boolean isEnumeratingBranchesFirst;

    /**
```

### FieldMayBeFinal
Field `stageLoops` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/StageAssignmentTraversal.java`
#### Snippet
```java
     * Maintains {@link ExecutionStageLoop}s that are being created.
     */
    private Map<LoopSubplan, ExecutionStageLoop> stageLoops = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `fieldNames` may be 'final'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/function/ProjectionDescriptor.java`
#### Snippet
```java
public class ProjectionDescriptor<Input, Output> extends TransformationDescriptor<Input, Output> {

    private List<String> fieldNames;

    /**
```

### FieldMayBeFinal
Field `paths` may be 'final'
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/channels/FileChannel.java`
#### Snippet
```java
    public class Instance extends AbstractChannelInstance {

        private Collection<String> paths = new LinkedList<>();

        /**
```

### FieldMayBeFinal
Field `calculatedParallelOperatorCostCache` may be 'final'
in `wayang-commons/wayang-core/src/main/java/org/apache/wayang/core/optimizer/enumeration/PlanImplementation.java`
#### Snippet
```java
     * This will be used to store the parallel cost of each operator.
     */
    private List<Tuple<Operator, Tuple<List<ProbabilisticDoubleInterval>, List<Double>>>> calculatedParallelOperatorCostCache = new ArrayList<>();

    /**
```

### FieldMayBeFinal
Field `job` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
    private Configuration configuration;

    private Job job;

    private GiraphConfiguration giraphConfiguration;
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
    private final GiraphPlatform platform;

    private Configuration configuration;

    private Job job;
```

### FieldMayBeFinal
Field `giraphConfiguration` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/execution/GiraphExecutor.java`
#### Snippet
```java
    private Job job;

    private GiraphConfiguration giraphConfiguration;

    public GiraphExecutor(GiraphPlatform platform, Job job) {
```

### FieldMayBeFinal
Field `SUM_AGG` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
     * Sum aggregator name
     */
    private static String SUM_AGG = "sum";
    /**
     * Min aggregator name
```

### FieldMayBeFinal
Field `MAX_AGG` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
     * Max aggregator name
     */
    private static String MAX_AGG = "max";

    public int maxSupersteps = -1;
```

### FieldMayBeFinal
Field `MIN_AGG` may be 'final'
in `wayang-platforms/wayang-giraph/src/main/java/org/apache/wayang/giraph/Algorithm/PageRankAlgorithm.java`
#### Snippet
```java
     * Min aggregator name
     */
    private static String MIN_AGG = "min";
    /**
     * Max aggregator name
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/Subject.java`
#### Snippet
```java
     * Configuration of this object.
     */
    private Map<String, Object> configuration = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `version` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/Subject.java`
#### Snippet
```java
     * Version of the subject.
     */
    private String version;

    /**
```

### FieldMayBeFinal
Field `id` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/Subject.java`
#### Snippet
```java
     * Identifier for the subject.
     */
    private String id;

    /**
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     * Controls how conducted experiments will be persisted and loaded
     */
    private Storage storage;

    /**
```

### FieldMayBeFinal
Field `gsonPreparationSteps` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     * Maintains actions to preparate {@link Gson}.
     */
    private List<Consumer<GsonBuilder>> gsonPreparationSteps = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `measurementClasses` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/ProfileDB.java`
#### Snippet
```java
     * Maintains the full list of {@link Class}es for {@link Measurement}s. Which are required for deserialization.
     */
    private List<Class<? extends Measurement>> measurementClasses = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `rounds` may be 'final'
in `wayang-commons/wayang-utils-profile-db/src/main/java/org/apache/wayang/commons/util/profiledb/model/measurement/TimeMeasurement.java`
#### Snippet
```java
     * Sub-{@link TimeMeasurement}s of this instance.
     */
    private Collection<TimeMeasurement> rounds = new LinkedList<>();

    /**
```

### FieldMayBeFinal
Field `minValue` may be 'final'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Variable.java`
#### Snippet
```java
    private final int index;

    private double minValue = 0d, maxValue = Double.POSITIVE_INFINITY;

    public Variable(int index, String id) {
```

### FieldMayBeFinal
Field `maxValue` may be 'final'
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Variable.java`
#### Snippet
```java
    private final int index;

    private double minValue = 0d, maxValue = Double.POSITIVE_INFINITY;

    public Variable(int index, String id) {
```

### FieldMayBeFinal
Field `tConsumer` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/OutputFormatConsumer.java`
#### Snippet
```java
public class OutputFormatConsumer<T> implements OutputFormat<T>, Serializable {

    private ConsumerDescriptor.SerializableConsumer<T> tConsumer;

    public OutputFormatConsumer(ConsumerDescriptor.SerializableConsumer<T> consumer) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangFilterCriterion.java`
#### Snippet
```java

    private WayangAggregator wayangAggregator;
    private String name;


```

### FieldMayBeFinal
Field `predicate` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangConvergenceCriterion.java`
#### Snippet
```java

    private boolean doWhile;
    private FunctionDescriptor.SerializablePredicate<Collection<T>> predicate;

    public WayangConvergenceCriterion(FunctionDescriptor.SerializablePredicate<Collection<T>> predicate){
```

### FieldMayBeFinal
Field `elements` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/criterion/WayangAggregator.java`
#### Snippet
```java
 */
public class WayangAggregator implements Aggregator<ListValue<WayangValue>> {
    private List<WayangValue> elements;

    public WayangAggregator(){
```

### FieldMayBeFinal
Field `operator` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
public class FlinkExecutionContext implements ExecutionContext, Serializable {

    private transient FlinkExecutionOperator operator;

    private transient final ChannelInstance[] inputs;
```

### FieldMayBeFinal
Field `iterationNumber` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutionContext.java`
#### Snippet
```java
    private transient final ChannelInstance[] inputs;

    private transient int iterationNumber;

    private RichFunction richFunction;
```

### FieldMayBeFinal
Field `flinkEnviroment` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkContextReference.java`
#### Snippet
```java
     * The wrapped {@link ExecutionEnvironment}.
     */
    private ExecutionEnvironment flinkEnviroment;

    /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/platform/FlinkPlatform.java`
#### Snippet
```java
    private FlinkContextReference flinkContextReference = null;

    private Logger logger = LogManager.getLogger(this.getClass());

    public static FlinkPlatform getInstance() {
```

### FieldMayBeFinal
Field `headerStream` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
        private BlockInfo blockInfo = WayangFileOutputFormat.this.createBlockInfo();

        private DataOutputView headerStream;

        public BlockBasedOutput(OutputStream out, int blockSize) {
```

### FieldMayBeFinal
Field `blockInfo` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/compiler/WayangFileOutputFormat.java`
#### Snippet
```java
        private long firstRecordStartPos = NO_RECORD;

        private BlockInfo blockInfo = WayangFileOutputFormat.this.createBlockInfo();

        private DataOutputView headerStream;
```

### FieldMayBeFinal
Field `platform` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
     * Reference to the {@link ExecutionEnvironment} that provides the FlinkContextReference.
     */
    private FlinkPlatform platform;

    /**
```

### FieldMayBeFinal
Field `flinkContextReference` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
     * Reference to a {@link ExecutionEnvironment} to be used by this instance.
     */
    private FlinkContextReference flinkContextReference;

    /**
```

### FieldMayBeFinal
Field `numDefaultPartitions` may be 'final'
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/execution/FlinkExecutor.java`
#### Snippet
```java
     * The requested number of partitions. Should be incorporated by {@link FlinkExecutionOperator}s.
     */
    private int numDefaultPartitions;


```

### FieldMayBeFinal
Field `predicate` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/PredicateAdapter.java`
#### Snippet
```java
public class PredicateAdapter<InputType> implements Function<InputType, Boolean> {

    private Predicate<InputType> predicate;

    public PredicateAdapter(Predicate<InputType> predicate) {
```

### FieldMayBeFinal
Field `function` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/MapFunctionAdapter.java`
#### Snippet
```java
public class MapFunctionAdapter<InputType, OutputType> implements Function<InputType, OutputType> {

    private java.util.function.Function<InputType, OutputType> function;

    public MapFunctionAdapter(java.util.function.Function<InputType, OutputType> function) {
```

### FieldMayBeFinal
Field `isFirstRun` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/ExtendedPredicateAdapater.java`
#### Snippet
```java
    private final SparkExecutionContext executionContext;

    private boolean isFirstRun = true;

    public ExtendedPredicateAdapater(PredicateDescriptor.ExtendedSerializablePredicate<Type> extendedFunction,
```

### FieldMayBeFinal
Field `binaryOperator` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/BinaryOperatorAdapter.java`
#### Snippet
```java
public class BinaryOperatorAdapter<Type> implements Function2<Type, Type, Type> {

    private BinaryOperator<Type> binaryOperator;

    public BinaryOperatorAdapter(BinaryOperator<Type> binaryOperator) {
```

### FieldMayBeFinal
Field `function` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/compiler/FlatMapFunctionAdapter.java`
#### Snippet
```java
public class FlatMapFunctionAdapter<InputType, OutputType> implements FlatMapFunction<InputType, OutputType> {

    private java.util.function.Function<InputType, Iterable<OutputType>> function;

    public FlatMapFunctionAdapter(java.util.function.Function<InputType, Iterable<OutputType>> function) {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/platform/SparkPlatform.java`
#### Snippet
```java
    private SparkContextReference sparkContextReference;

    private Logger logger = LogManager.getLogger(this.getClass());

    public static SparkPlatform getInstance() {
```

### FieldMayBeFinal
Field `partitionID` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
class ShufflePartition<V, T, R> implements Function2<V, T, R> {

    private int partitionID;
    private Random rand;

```

### FieldMayBeFinal
Field `end_id` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java

    private int start_id;
    private int end_id;

    TakeSampleFunction(int start_id, int end_id) {
```

### FieldMayBeFinal
Field `start_id` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java
class TakeSampleFunction<V> extends AbstractFunction1<scala.collection.Iterator<V>, List<V>> implements Serializable {

    private int start_id;
    private int end_id;

```

### FieldMayBeFinal
Field `rand` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkShufflePartitionSampleOperator.java`
#### Snippet
```java

    private int partitionID;
    private Random rand;

    ShufflePartition(int partitionID) {
```

### FieldMayBeFinal
Field `ids` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
class PartitionSampleListFunction<V> extends AbstractFunction1<scala.collection.Iterator<V>, List<V>> implements Serializable {

    private ArrayList<Integer> ids; //ids should be sorted

    PartitionSampleListFunction(ArrayList<Integer> ids) {
```

### FieldMayBeFinal
Field `start_id` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
class PartitionSampleFunction<V> extends AbstractFunction1<scala.collection.Iterator<V>, List<V>> implements Serializable {

    private int start_id;

    private int end_id;
```

### FieldMayBeFinal
Field `end_id` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkRandomPartitionSampleOperator.java`
#### Snippet
```java
    private int start_id;

    private int end_id;

    PartitionSampleFunction(int start_id, int end_id) {
```

### FieldMayBeFinal
Field `producer` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
    private List<SerializableObject> taskObjects;
    // Kafka producer to send data to Kafka topic
    private KafkaProducer<String, byte[]> producer;
    private final static String KAFKA_PROPERTIES = "/wayang-spark-kafka.properties";
    // Kafka topic name to which the data will be sent
```

### FieldMayBeFinal
Field `kafkaTopic` may be 'final'
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/monitoring/metrics/SparkListener.java`
#### Snippet
```java
    private final static String KAFKA_PROPERTIES = "/wayang-spark-kafka.properties";
    // Kafka topic name to which the data will be sent
    private String kafkaTopic;
    // Logger instance to log messages
    protected final Logger logger = LogManager.getLogger(this.getClass());
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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=CopyConstructorMissesField]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-commons/wayang-basic/src/main/java/org/apache/wayang/basic/mapping/Mappings.java`
#### Snippet
```java
    );

    public static Collection<Mapping> GRAPH_MAPPINGS = Arrays.asList(
            new PageRankMapping()
    );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-platforms/wayang-java/src/main/java/org/apache/wayang/java/mapping/Mappings.java`
#### Snippet
```java
    );

    public static Collection<Mapping> GRAPH_MAPPINGS = Arrays.asList(
            new PageRankMapping()
    );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImprovedImpl.java`
#### Snippet
```java

        // Create initial weights.
        List<double[]> weights = Arrays.asList(new double[features]);
        final DataQuantaBuilder<?, double[]> weightsBuilder = javaPlanBuilder
                .loadCollection(weights).withName("init weights");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-benchmark/code/main/java/org/apache/wayang/apps/sgd/SGDImpl.java`
#### Snippet
```java

        // Create initial weights.
        List<double[]> weights = Arrays.asList(new double[features]);
        final DataQuantaBuilder<?, double[]> weightsBuilder = javaPlanBuilder
                .loadCollection(weights).withName("init weights");
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkTsvFileSink.java`
#### Snippet
```java
    @Override
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        return Arrays.asList(DataSetChannel.DESCRIPTOR);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkCollectionSource.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        return Arrays.asList(CollectionChannel.DESCRIPTOR);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/mapping/Mappings.java`
#### Snippet
```java
    );

    public static Collection<Mapping> GRAPH_MAPPINGS = Arrays.asList(
            new PageRankMapping()
    );
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `wayang-platforms/wayang-spark/code/main/java/org/apache/wayang/spark/operators/SparkCollectionSource.java`
#### Snippet
```java
    public List<ChannelDescriptor> getSupportedInputChannels(int index) {
        assert index <= this.getNumInputs() || (index == 0 && this.getNumInputs() == 0);
        return Arrays.asList(CollectionChannel.DESCRIPTOR);
    }

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`equalReverse == true` can be simplified to 'equalReverse'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/java_helpers/BitSetJoin.java`
#### Snippet
```java

        int max = 0;
        int offset = (equalReverse == true ? 0 : 1);

        for (int k = 0; k < permutationArray.length; k++) {
```

### PointlessBooleanExpression
`equalReverse == true` can be simplified to 'equalReverse'
in `wayang-plugins/wayang-iejoin/code/main/java/org/apache/wayang/iejoin/operators/spark_helpers/BitSetJoin.java`
#### Snippet
```java

        int max = 0;
        int offset = (equalReverse == true ? 0 : 1);

        for (int k = 0; k < permutationArray.length; k++) {
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`1 / activatedGenes.cardinality()`: integer division in floating-point context
in `wayang-profiler/code/main/java/org/apache/wayang/profiler/log/Individual.java`
#### Snippet
```java

        // Make at least one mutation more likely.
        if (mutationProb > 0d) mutationProb = Math.max(mutationProb, 1 / activatedGenes.cardinality());

        final double smoothing = 1d;
```

### IntegerDivisionInFloatingPointContext
`size / sampleSize`: integer division in floating-point context
in `wayang-platforms/wayang-flink/code/main/java/org/apache/wayang/flink/operators/FlinkSampleOperator.java`
#### Snippet
```java
            dataSetOutput = dataSetInput;
        }else {
            double faction = (size / sampleSize) + 0.01d;
            switch (this.getSampleMethod()) {
                case RANDOM:
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

