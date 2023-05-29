# marmaray 
 
# Bad smells
I found 679 bad smells with 42 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 125 | false |
| NullableProblems | 106 | false |
| JavadocDeclaration | 94 | false |
| OptionalGetWithoutIsPresent | 62 | false |
| UNCHECKED_WARNING | 56 | false |
| SimplifyStreamApiCallChains | 26 | false |
| UnnecessaryToStringCall | 19 | true |
| Deprecation | 17 | false |
| UnnecessaryLocalVariable | 15 | true |
| DanglingJavadoc | 14 | false |
| JavadocReference | 11 | false |
| PlaceholderCountMatchesArgumentCount | 10 | false |
| MalformedFormatString | 9 | false |
| ArraysAsListWithZeroOrOneArgument | 9 | false |
| Lombok | 8 | false |
| InnerClassMayBeStatic | 8 | true |
| AccessStaticViaInstance | 7 | false |
| UnusedAssignment | 7 | false |
| RedundantMethodOverride | 6 | false |
| StringOperationCanBeSimplified | 6 | false |
| WrapperTypeMayBePrimitive | 5 | false |
| DataFlowIssue | 5 | false |
| ConstantValue | 4 | false |
| FieldMayBeFinal | 4 | false |
| ManualMinMaxCalculation | 3 | false |
| CharsetObjectCanBeUsed | 3 | false |
| SimplifiableConditionalExpression | 2 | false |
| RedundantTypeArguments | 2 | false |
| FieldCanBeLocal | 2 | false |
| SlowListContainsAll | 2 | false |
| RedundantStringFormatCall | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| DuplicatedCode | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| TrivialIf | 2 | false |
| NotNullFieldNotInitialized | 1 | false |
| RegExpSimplifiable | 1 | false |
| BooleanConstructor | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| ReturnFromFinallyBlock | 1 | false |
| RedundantCompareToJavaTime | 1 | false |
| OptionalIsPresent | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| FinallyBlockCannotCompleteNormally | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| WrongPackageStatement | 1 | false |
| AutoCloseableResource | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryContinue | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| BusyWait | 1 | false |
| ThrowableNotThrown | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| UseBulkOperation | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        if (HoodieIndex.IndexType.HBASE.equals(getHoodieIndexType())) {
            final String quorum = getHoodieIndexZookeeperQuorum();
            final Integer port = getHoodieIndexZookeeperPort();
            final String zkZnodeParent  = getZkZnodeParent();
            createHbaseIndexTableIfNotExists(topicName, quorum, port.toString(), zkZnodeParent,
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    private void writeMetadataFile() {
        final Long currentTime = System.currentTimeMillis();

        final String fileLocation = new Path(this.baseMetadataPath, currentTime.toString()).toString();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            }

            final Long currentTime = System.currentTimeMillis();
            final String checkpoint = serializeMetadataMap();
            String cassandraCols = String.format("job, time_stamp, checkpoint");
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(DISPERSAL_TYPE).isPresent()) {
            final String dispersalType = this.conf.getProperty(DISPERSAL_TYPE).get().trim().toUpperCase();
            final Boolean isValid = EnumUtils.isValidEnum(DispersalType.class, dispersalType);
            if (isValid) {
                this.dispersalType = DispersalType.valueOf(dispersalType);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(FILE_SINK_TYPE).isPresent()) {
            final String sinkName = this.conf.getProperty(FILE_SINK_TYPE).get().trim().toUpperCase();
            final Boolean isValid = EnumUtils.isValidEnum(FileSinkType.class, sinkName);
            if (isValid) {
                this.sinkType = FileSinkType.valueOf(sinkName);
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
public class JobManagerMetadataTracker {

    @NonNull
    private IMetadataManager metadataManager;
    @Getter
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`//*` can be simplified to '/+'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

## RuleId[id=Deprecation]
### Deprecation
'Configuration()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
     */
    private Configuration getJsonConfiguration(@NotEmpty final String jsonConf) {
        final Configuration conf = new Configuration();
        conf.loadYamlStream(IOUtils.toInputStream(jsonConf), Optional.absent());
        return conf;
```

### Deprecation
'Configuration()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
     */
    private Configuration getFileConfiguration(@NotEmpty final String filePath) {
        final Configuration conf = new Configuration();
        try {
            final FileSystem fs = FSUtils.getFs(conf, Optional.absent());
```

### Deprecation
'Configuration()' is deprecated
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPruner.java`
#### Snippet
```java
                : false;

        final Configuration conf = new Configuration();
        final FileSystem fs = FSUtils.getFs(conf, Optional.absent());

```

### Deprecation
'Configuration()' is deprecated
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPrinter.java`
#### Snippet
```java
        log.info("Printing contents of metadata file: " + metadataFilePath);

        final Configuration conf = new Configuration();
        final FileSystem fs = FSUtils.getFs(conf, Optional.absent());
        try (final InputStream is = new BufferedInputStream(fs.open(new Path(metadataFilePath)))) {
```

### Deprecation
'Configuration()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/DummyHoodieSinkDataConverter.java`
#### Snippet
```java
public class DummyHoodieSinkDataConverter extends HoodieSinkDataConverter {
    public DummyHoodieSinkDataConverter() {
        super(new Configuration(), new ErrorExtractor());
    }

```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java
            while (fieldNamesOfResolvedNode.hasNext()) {
                final String fieldNameOfResolvedNode = fieldNamesOfResolvedNode.next();
                root.put(fieldNameOfResolvedNode, resolvedNode.get(fieldNameOfResolvedNode));
            }
        } else {
```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java
                    .orElse(overridingNode);
                log.info("Copying fieldName: {} value: {}", fieldName, nodeToPutAtFieldName);
                ((ObjectNode) parentDefaultNode).put(fieldName, nodeToPutAtFieldName);
                return;
            }
```

### Deprecation
'put(java.lang.String, com.fasterxml.jackson.databind.JsonNode)' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java
                log.info("Using value: {} of override node for fieldName: {}", overridingNode,
                    fieldName);
                ((ObjectNode) parentDefaultNode).put(fieldName, overridingNode);
            } else {
                // both are container nodes
```

### Deprecation
'Configuration()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java

    public static final class Builder<BT, BR> {
        private Configuration conf = new Configuration();
        @NonNull
        private final IFunctionThrowsException<BT, BR> func;
```

### Deprecation
'Configuration()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java

    public static Builder newBuilder(@NotEmpty final String tableKey) {
        return newBuilder(new Configuration(), tableKey);
    }

```

### Deprecation
'Date(int, int, int)' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                final long timestamp = (long) line.getField("Hadoop_timestamp");
                final Date msgDay = new Date(timestamp);
                final Date day = new Date(msgDay.getYear(),  msgDay.getMonth(), msgDay.getDate());
                dates.add(day);
            });
```

### Deprecation
'getYear()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                final long timestamp = (long) line.getField("Hadoop_timestamp");
                final Date msgDay = new Date(timestamp);
                final Date day = new Date(msgDay.getYear(),  msgDay.getMonth(), msgDay.getDate());
                dates.add(day);
            });
```

### Deprecation
'getMonth()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                final long timestamp = (long) line.getField("Hadoop_timestamp");
                final Date msgDay = new Date(timestamp);
                final Date day = new Date(msgDay.getYear(),  msgDay.getMonth(), msgDay.getDate());
                dates.add(day);
            });
```

### Deprecation
'getDate()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                final long timestamp = (long) line.getField("Hadoop_timestamp");
                final Date msgDay = new Date(timestamp);
                final Date day = new Date(msgDay.getYear(),  msgDay.getMonth(), msgDay.getDate());
                dates.add(day);
            });
```

### Deprecation
'getYear()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                objKey = String.format("%s/%s_%0" + this.digitNum + "d",
                        String.join("/", this.awsConf.getObjectKey(),
                                String.valueOf(date.getYear() + 1900),
                                String.valueOf(date.getMonth() + 1),
                                String.valueOf(date.getDate())),
```

### Deprecation
'getMonth()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                        String.join("/", this.awsConf.getObjectKey(),
                                String.valueOf(date.getYear() + 1900),
                                String.valueOf(date.getMonth() + 1),
                                String.valueOf(date.getDate())),
                        this.conf.getFileNamePrefix(), partNum);
```

### Deprecation
'getDate()' is deprecated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                                String.valueOf(date.getYear() + 1900),
                                String.valueOf(date.getMonth() + 1),
                                String.valueOf(date.getDate())),
                        this.conf.getFileNamePrefix(), partNum);
            } else {
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
         */
        final int readParallelism;
        if (workUnits.size() < this.conf.getReadParallelism()) {
            readParallelism = this.conf.getReadParallelism();
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
        final int partNum = getRepartitionNum(tmp);
        final int desiredDigit = (int) Math.floor(Math.log10(partNum) + 1);
        this.digitNum = desiredDigit > DEFAULT_DIGIT_NUM ? desiredDigit : DEFAULT_DIGIT_NUM;

        if (this.conf.getFileType().equals("csv")) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
            log.info("Write data with megabytes: {}", rddSize);
            final int suggestedNum = (int) Math.round(rddSize / this.conf.getFileSizeMegaBytes());
            parNum = suggestedNum < MIN_PARTITION_NUM ? MIN_PARTITION_NUM : suggestedNum;
        }
        log.info("Write data with repartition number: {} ", parNum);
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`cmd.hasOption(FAKE_DELETE_LONG_OPTION)
? Boolean.parseBoolean(cmd.getOptionValue(FAKE_DELETE_LONG_OPTION))
: false` can be simplified to 'cmd.hasOption(FAKE_DELETE_LONG_OPTION) \&\& Boolean.parseBoolean(cmd.getOptionValue(FAKE_DELETE_LONG_OPTION))'
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPruner.java`
#### Snippet
```java
        Preconditions.checkState(numFilesToRetain > 0, "Number of files to retain cannot be <= 0");

        final boolean fakeDelete = cmd.hasOption(FAKE_DELETE_LONG_OPTION)
                ? Boolean.parseBoolean(cmd.getOptionValue(FAKE_DELETE_LONG_OPTION))
                : false;
```

### SimplifiableConditionalExpression
`this.metadataManager.get(key).isPresent() ? true : false` can be simplified to 'this.metadataManager.get(key).isPresent()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     */
    public boolean contains(@NotEmpty final String key) {
        return this.metadataManager.get(key).isPresent() ? true : false;
    }

```

## RuleId[id=BooleanConstructor]
### BooleanConstructor
Boolean constructor call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
        } else {
            throw new IllegalArgumentException("Not supported :" + defaultValue.getClass());
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `marmaray/src/main/java/com/uber/marmaray/utilities/ScalaUtil.java`
#### Snippet
```java

    public static <K, V> scala.collection.immutable.Map<K, V> toScalaMap(@NonNull final Map<K, V> javaMap) {
        return JavaConverters.mapAsScalaMapConverter(javaMap).asScala().toMap(Predef.<Tuple2<K, V>>conforms());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `marmaray/src/main/java/com/uber/marmaray/utilities/ScalaUtil.java`
#### Snippet
```java

    public static <T> Set<T> toScalaSet(@NonNull final java.util.Set<T> javaSet) {
        return JavaConverters.asScalaSetConverter(javaSet).asScala().<T>toSet();
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
    void saveChanges() throws IOException;
    Set<String> getAllKeys();
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
    void saveChanges() throws IOException;
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
 */
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/IMetadataManager.java`
#### Snippet
```java
 */
public interface IMetadataManager<T extends AbstractValue> extends Serializable, IMetricable {
    void set(@NonNull final String key, @NonNull final T value);
    Optional<T> remove(@NonNull final String key);
    Optional<T> get(@NonNull final String key);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java
public class AvroPayload implements IPayload<GenericRecord>, IData, Serializable {

    @NonNull
    private IAvroPayloadInternal payloadInterval;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java
    private static class AvroPayloadInternal implements IAvroPayloadInternal {

        @NonNull
        private final GenericRecord record;

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/Reportable.java`
#### Snippet
```java
 */
public interface Reportable {
    void gaugeAll(@NonNull final IReporter reporter);
}

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/NoOpMetadataManager.java`
#### Snippet
```java

    @Override
    public Optional<StringValue> get(@NotEmpty final String key) {
        return Optional.absent();
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/NoOpMetadataManager.java`
#### Snippet
```java

    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        return Optional.absent();
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/NoOpMetadataManager.java`
#### Snippet
```java

    @Override
    public void set(@NotEmpty final String key, @NonNull final StringValue value) {
        // no-op
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
public class SparkFactory {

    @NonNull
    @Getter
    private final SparkArgs sparkArgs;
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
     * Returns given metadata key.
     */
    public Optional<StringValue> get(@NotEmpty final String key) {
        final String val = getMetadataMap().get(key);
        return val == null ? Optional.absent() : Optional.of(new StringValue(val));
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
     * Updates in-memory metadata map with given key-value pair.
     */
    public void set(@NotEmpty final String key, @NonNull final StringValue value) {
        if (!this.saveChanges.get()) {
            throw new JobRuntimeException(
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        final String val = getMetadataMap().remove(key);
        return val == null ? Optional.absent() : Optional.of(new StringValue(val));
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/IReporter.java`
#### Snippet
```java
 */
public interface IReporter<T extends Metric> {
    void gauge(@NonNull final T m);

    void finish();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final List<Schema> avroSchemas;
    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final Configuration configuration;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkArgs.java`
#### Snippet
```java
     */
    @Getter
    @NonNull
    private final List<Class> userSerializationClasses;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    @NonNull
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
    private final LockManagerConfiguration lockConf;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
@Slf4j
public class LockManager implements AutoCloseable {
    @NonNull
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/schema/ISchemaService.java`
#### Snippet
```java
     */
    interface ISchemaServiceReader {
        GenericRecord read(@NonNull final byte[] buffer) throws InvalidDataException;
    }

```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/schema/ISchemaService.java`
#### Snippet
```java
     */
    interface ISchemaServiceWriter {
        byte[] write(@NonNull final GenericRecord record) throws InvalidDataException;
    }
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaOffsetResetter.java`
#### Snippet
```java
    private final IKafkaOffsetSelector offsetSelector;

    @NonNull
    @Getter
    @Setter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaOffsetResetter.java`
#### Snippet
```java
 */
public class KafkaOffsetResetter {
    @NonNull
    @Getter
    private final IKafkaOffsetSelector offsetSelector;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/TSBasedHoodieSinkDataConverter.java`
#### Snippet
```java
    @NotEmpty
    private final String partitionFieldName;
    @NonNull
    private final TimeUnit timeUnit;

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        // ignored, no need to compute data feed level metrics for now.
        // Data is either dispersed or not and row count is tracked as job level metric
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    }

    @Override public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public Optional<StringValue> get(@NotEmpty final String key) throws MetadataException {
        return getMetadataMap().containsKey(key) ? Optional.of(getMetadataMap().get(key)) : Optional.absent();
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public void set(@NotEmpty final String key, @NonNull final StringValue value) throws MetadataException {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(key));
        this.metadataManagersList.forEach(metadataManager -> metadataManager.set(key, value));
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        this.metadataManagersList.forEach(metadataManager -> metadataManager.remove(key));
        return Optional.fromNullable(getMetadataMap().remove(key));
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java

        @Override
        public GenericRecord read(final byte[] buffer) throws InvalidDataException {
            final DatumReader<GenericRecord> datumReader = new SpecificDatumReader<>(getSchema());
            final ByteArrayInputStream stream = new ByteArrayInputStream(buffer);
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/IMetricable.java`
#### Snippet
```java
        Take a DataFeedMetrics to report metrics to, if present
     */
    void setDataFeedMetrics(@NonNull final DataFeedMetrics dataFeedMetrics);

    /*
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/IMetricable.java`
#### Snippet
```java
        Take a JobMetrics to report metrics to, if present
     */
    void setJobMetrics(@NonNull final JobMetrics jobMetrics);
}

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        this.dataFeedMetrics = Optional.of(dataFeedMetrics);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java

    @Getter
    @NonNull
    private final SinkStat currentStat = new SinkStat();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java

    @Getter
    @NonNull
    private final String tableName;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/SinkStatManager.java`
#### Snippet
```java
    private final String tableName;

    @NonNull
    private final IMetadataManager<StringValue> metadataManager;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @NonNull
    private final FileSystem fileSystem;

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        return Optional.fromNullable(getMetadataMap().remove(key));
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @Override
    public void set(@NotEmpty final String key, @NonNull final StringValue value) throws MetadataException {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(key));
        getMetadataMap().put(key, value);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @Override
    public Optional<StringValue> get(@NotEmpty final String key) throws MetadataException {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(key));
        return getMetadataMap().containsKey(key) ? Optional.of(getMetadataMap().get(key)) : Optional.absent();
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public void set(@NotEmpty final String key, @NonNull final StringValue value) throws MetadataException {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(key));
        getMetadataMap().put(key, value);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public Optional<StringValue> get(@NotEmpty final String key) throws MetadataException {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(key));
        return getMetadataMap().containsKey(key) ? Optional.of(getMetadataMap().get(key)) : Optional.absent();
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     */
    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        return Optional.fromNullable(getMetadataMap().remove(key));
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java
    private final long currentTime;

    @NonNull
    private final JobManagerMetadataTracker tracker;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
    protected final String rawDataRootPath;

    @NonNull
    protected final FileSystem fileSystem;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    private static Optional<ThreadPoolService> service = Optional.absent();

    @NonNull
    private final ExecutorService threadPool;

```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DataFeedMetrics.java`
#### Snippet
```java
    }

    public void gaugeAll(final IReporter reporter) {
        guageNonFailureMetric(reporter);
        gauageFailureMetric(reporter);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/Job.java`
#### Snippet
```java
public class Job {

    @NonNull
    private final JobDag jobDag;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/Job.java`
#### Snippet
```java
    @NonNull
    private final JobDag jobDag;
    @NonNull
    private final Configuration conf;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/data/RDDWrapper.java`
#### Snippet
```java

    @Getter
    @NonNull
    final JavaRDD<T> data;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/DagPayload.java`
#### Snippet
```java
public class DagPayload implements IPayload<JavaRDD<AvroPayload>> {

    @NonNull
    @Getter
    private final JavaRDD<AvroPayload> data;
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java
     * @param payload {@link AvroPayload}.
     */
    protected abstract String getPartitionPath(@NonNull final AvroPayload payload) throws Exception;

    protected HoodieRecordPayload getPayload(@NonNull final AvroPayload payload) {
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        //ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/HoodieSinkDataConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        @NonNull
        private final LockManager lockManager;
        @NonNull
        private final String jobFrequency;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
    private static final Object lock = new Object();

    @NonNull
    private final Queue<Dag> jobDags = new ConcurrentLinkedDeque<>();
    private final JobDagActions postJobManagerActions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        @NonNull
        private final TimerMetric managerTimerMetric;
        @NonNull
        private final HashMap<String, TimerMetric> dagTimerMetricMap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        private final String jobFrequency;

        @NonNull
        private final TimerMetric managerTimerMetric;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
        private static final String DATA_FEED_TAG = "data_feed_name";

        @NonNull
        private final LockManager lockManager;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final IMetadataManager<V> metadataManager;
    @NonNull
    private final IWorkUnitCalculator<T, R, K, V> workUnitCalculator;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final JobSubDag sinkDag;
    @NonNull
    private final IMetadataManager<V> metadataManager;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    public static final String LAST_RUNTIME_METADATA_KEY = "runtime";
    public static final String LAST_EXECUTION_METADATA_KEY = "last_execution";
    @NonNull
    private final ISource<K, R> source;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    private final JobDagActions postJobDagActions;

    @NonNull
    private final JobMetrics jobMetrics;
    @Getter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobDag.java`
#### Snippet
```java
    @NonNull
    private final ISource<K, R> source;
    @NonNull
    private final JobSubDag sinkDag;
    @NonNull
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/JSONFileSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        //ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/JSONFileSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java

    @Override
    public List<ConverterResult<AvroPayload, Statement>> convert(final AvroPayload avroPayload) throws Exception {
        final Insert insertStatement = QueryBuilder.insertInto(keyspaceName, tableName);
        final Set<String> requiredKeysToFind =  new HashSet<>(this.requiredFields);
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        this.dataFeedMetrics = Optional.of(dataFeedMetrics);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @return payload for child dag
     */
    protected Optional<IPayload> getDataForChild(@NonNull final JobSubDag childSubDag) {
        return Optional.absent();
    }
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @param data input payload
     */
    protected abstract void executeNode(@NonNull final Optional<IPayload> data);

    /**
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        this.converter.setDataFeedMetrics(dataFeedMetrics);
        this.dataFeedMetrics = Optional.of(dataFeedMetrics);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java
public class SingleSinkSubDag extends JobSubDag {

    @NonNull
    @Getter
    private final ISink sink;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
     * {@link #convert(Object)}.
     */
    @NonNull
    @Setter
    protected Optional<VoidFunction<ID>> failureRecordHandler = Optional.absent();
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    }

    public void setDataFeedMetrics(@NonNull final DataFeedMetrics topicMetrics) {
        this.topicMetrics = Optional.of(topicMetrics);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    private static final String CONVERTER_TAG_NAME = "CONVERTER_NAME";

    @Getter @NonNull
    protected Configuration conf;
    /**
```

### NullableProblems
Overridden method parameters are not annotated
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    }

    protected abstract List<ConverterResult<ID, OD>> convert(@NonNull ID data) throws Exception;

    private void reportMetrics(final long rddSize,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected ErrorExtractor errorExtractor;

    @NonNull
    protected Optional<DataFeedMetrics> topicMetrics = Optional.absent();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();

    @NonNull
    protected ErrorExtractor errorExtractor;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
     * with no exceptions from {@link #convert(Object)}.
     */
    @NonNull
    @Setter
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Setter
    @NonNull
    @Getter
    private HoodieSinkOperations hoodieSinkOperations = new HoodieSinkOperations();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @AllArgsConstructor
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Setter
    @NonNull
    @Getter
    // If set then it is used for creating new hoodie commit.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    @Setter
    @NonNull
    /**
     * If set then it is used for sorting records during {@link HoodieWriteClientWrapper#bulkInsert(JavaRDD, String)}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
public class ConverterResult<ID, OD> implements Serializable {

    @NonNull
    @Getter
    protected Optional<ValidData<OD>> successData;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    protected Optional<ValidData<OD>> successData;

    @NonNull
    @Getter
    protected Optional<ErrorData<ID>> errorData;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
 */
public class KafkaSourceDataConverter extends SourceDataConverter<Schema, byte[]> {
    @NonNull
    @Getter
    private final ISchemaServiceReader schemaServiceReader;
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setDataFeedMetrics(final DataFeedMetrics dataFeedMetrics) {
        //ignored
    }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java

    @Override
    public void setJobMetrics(final JobMetrics jobMetrics) {
        // ignored
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
     *  transferring to the ISource
     */
    @NonNull
    @Getter
    private final List<Function<GenericRecord, GenericRecord>> updateFunctions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
    @Getter
    private final ISchemaServiceReader schemaServiceReader;
    @NonNull
    @Getter
    private final List<String> fieldsToCache;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
public class RetryableFunction<T, R> {
    @NonNull protected final IRetryStrategy retryStrategy;
    @NonNull protected final IFunctionThrowsException<T, R> func;

    public RetryableFunction(@NonNull final IFunctionThrowsException<T, R> func,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
@Slf4j
public class RetryableFunction<T, R> {
    @NonNull protected final IRetryStrategy retryStrategy;
    @NonNull protected final IFunctionThrowsException<T, R> func;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/retry/RetryableFunction.java`
#### Snippet
```java
    public static final class Builder<BT, BR> {
        private Configuration conf = new Configuration();
        @NonNull
        private final IFunctionThrowsException<BT, BR> func;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
public class JobManagerMetadataTracker {

    @NonNull
    private IMetadataManager metadataManager;
    @Getter
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@lombok.NonNull'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private IKafkaOffsetSelector offsetSelector = new KafkaBootstrapOffsetSelector();

    @NonNull
    @Getter
    @Setter
```

### NullableProblems
Primitive type members cannot be annotated
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
     */
    private void uploadFileToS3(@NonNull final FileSystem fileSystem, @NonNull final Path path,
                                @NonNull final int partNum, final Date date) {
        byte[] contentBytes = new byte [0];
        log.info("Start upload file to S3 with partition num: {}", partNum);
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java

public class CassandraPayloadRDDSizeEstimator {
    private final int NO_OF_SAMPLE_ROWS = 1000;

    public long estimateTotalSize(final RDDWrapper<CassandraPayload> rdd) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java

    private final String scopeOverrideMappingKey;
    private Map<String, String> scopeOverrideMap;
    private final ObjectMapper mapper = new ObjectMapper();

```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.uber.marmaray.common.configuration.CassandraMetadataManagerConfiguration.getMandatoryProperties()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
    public CassandraMetadataManagerConfiguration(@NonNull final Configuration conf) {
        super(conf);
        ConfigUtil.checkMandatoryProperties(conf, this.getMandatoryProperties());

        this.username = conf.getProperty(USERNAME).get();
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.getTimedOut()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
                 * Once that is done we can remove this code block to report the metric.
                 */
                if (TimeoutManager.getInstance().getTimedOut()) {
                    final LongMetric runTimeError = new LongMetric(DataFeedMetricNames.MARMARAY_JOB_ERROR, 1);
                    runTimeError.addTags(metricTags);
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.common.metadata.CassandraBasedMetadataManager.fields' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        this.oldestTimestamp = Optional.absent();

        this.schema = new CassandraSchema(this.config.getKeyspace(), this.config.getTableName(), this.fields);
        this.schemaManager = new CassandraMetadataSchemaManager(
                this.schema,
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
        this.sc = sc;
        this.startTime = getCurrentTime();
        this.timedOut = false;
        log.info("Initializing TimeoutManager, job_timeout = {}ms, stage_timeout = {}ms",
                this.jobTimeoutMillis, this.stageTimeoutMillis);
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                    log.error("The spark job is taking longer than {} ms. Cancelling all jobs...",
                            this.jobTimeoutMillis);
                    this.timedOut = true;
                    this.sc.cancelAllJobs();
                    throw new TimeoutException("The spark job is timing out");
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.timedOut' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
                        log.error("Cancelling stage {}-{} and its related jobs due to inactivity... details: {}",
                                stage.id(), stage.name(), stage.details());
                        this.timedOut = true;
                        this.sc.cancelStage(stage.id());
                    }
```

### AccessStaticViaInstance
Static member 'com.uber.marmaray.utilities.listener.TimeoutManager.getTimedOut()' accessed via instance reference
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
                }
            );
            if (TimeoutManager.getInstance().getTimedOut()) {
                log.error("Time out error while running job.");
                isSuccess.set(false);
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
            return hasPartitionKey;
        } catch (IOException e) {
            throw new JobRuntimeException(String.format("Unable to read existing partitions in the HDFS Path {}",
                    this.rawDataRootPath));
        }
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
        if (!this.lockMap.containsKey(lockKey)) {
            log.error("This lock has not been acquired yet: {}", lockKey);
            throw new JobRuntimeException(String.format("Failed to unlock {}: not acquired.", lockKey));
        }
        final CustomizedInterProcessMutex lockValue = lockMap.get(lockKey);
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
            final Object field = data.first().getField(this.row_identifier);
            if (field == null) {
                final String errorMessage = String.format(
                        "specified row identifier field : {} does not exist", row_identifier);
                if (this.topicMetrics.isPresent()) {
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
        } else if (value == null) {
            // Always fail on null for non-nullable schemas
            throw new JobRuntimeException(String.format("value cannot be null :name {} : schema : {}",
                name, schema));
        } else {
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                    return new GenericData.EnumSymbol(nonOptionalSchema, value.toString());
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/LongAccumulator.java`
#### Snippet
```java
            this.max = Math.max(this.getMax(), ((LongAccumulator) other).getMax());
        } else {
            final String warnMsg = String.format("Cannot merge {} with {}",
                this.getClass().getName(), other.getClass().getName());
            throw new UnsupportedOperationException(warnMsg);
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        getTopicPartitions(kafkaConsumer, topicName).stream().forEach(p -> partitions.remove(p.partition()));
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
                partitions.toString(), topicName));
        }
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
                                        ModuleTagNames.SINK, ErrorCauseTagNames.COMPRESSION));
                    }
                    final String errorMessage = String.format("Compression codec {} not supported",
                            this.conf.getCompressionCodec());
                    throw new UnsupportedOperationException(errorMessage);
```

### MalformedFormatString
Too many arguments for format string (found: 1, expected: 0)
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
            } catch (ClassNotFoundException e) {
                final String errorStr =
                        String.format("error loading hoodie write status class :{}", writeStatusClassName);
                log.error(errorStr);
                throw new JobRuntimeException(errorStr, e);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaSourceConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaSourceConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

### RedundantMethodOverride
Method `getChangeLogColumns()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getChangeLogColumns(@NonNull final RawData rawdata) {
        return DEFAULT_CHANGELOG_COLUMNS;
    }
```

### RedundantMethodOverride
Method `getErrorException()` is identical to its super method
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkConverterErrorExtractor.java`
#### Snippet
```java

    @Override
    public String getErrorException(@NonNull final ErrorData errorData) {
        return errorData.getErrMessage();
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
(AWAIT_TERMINATION_ATTEMPTS - terminationChecks) \* AWAIT_TERMINATION_CHECK_INTERVAL_MS: integer multiplication implicitly cast to long
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                log.info("waiting for tasks to stop.");
                if (!this.threadPool.awaitTermination(
                        (AWAIT_TERMINATION_ATTEMPTS - terminationChecks) * AWAIT_TERMINATION_CHECK_INTERVAL_MS,
                        TimeUnit.MILLISECONDS)) {
                    this.threadPool.shutdownNow();
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

        try {
            Preconditions.checkState(fieldNames.containsAll(lowerCasePartitionKeys));
        } catch (Exception e) {
            log.error("One or more of your partition keys (%s) were not found in the available schema fields (%s)",
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
        if (!this.clusteringKeys.isEmpty()) {
            try {
                Preconditions.checkState(fieldNames.containsAll(clusterKeyNames));
            } catch (Exception e) {
                log.error("Clustering keys not found in field names to disperse");
```

## RuleId[id=Lombok]
### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ExceptionRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@ExceptionRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExceptionRecord extends UtilRecord {
```

### Lombok
Not generated 'toString()': A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java
@Slf4j
@Getter
@ToString
public class TimerMetric extends LongMetric {
    private final Instant startTime;
```

### Lombok
Not generated 'toString()': A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/LongMetric.java`
#### Snippet
```java
 */
@Getter
@ToString
public class LongMetric extends Metric<Long> {
    public LongMetric(final String metricName) {
```

### Lombok
Not generated 'toString()': A method with same name already exists
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DoubleMetric.java`
#### Snippet
```java
 */
@Getter
@ToString
public class DoubleMetric extends Metric<Double> {
    public DoubleMetric(final String metricName) {
```

### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ErrorRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@ErrorRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorRecord extends UtilRecord {
```

### Lombok
Lombok needs a default constructor in the base class
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/MetricRecord.java`
#### Snippet
```java
 * Simple Java Bean used to construct {@link UtilTable} of {@MetricRecord}
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MetricRecord extends UtilRecord {
```

### Lombok
Not generating setter for this field: Setters cannot be generated for final fields.
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @Getter
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
```

### Lombok
Not generating setter for this field: Setters cannot be generated for final fields.
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    @Getter
    @Setter
    @NonNull
    /**
```

## RuleId[id=ReturnFromFinallyBlock]
### ReturnFromFinallyBlock
'return' inside 'finally' block
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
                }
            }
            return isSuccess.get();
        }
    }
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            final Long currentTime = System.currentTimeMillis();
            final String checkpoint = serializeMetadataMap();
            String cassandraCols = String.format("job, time_stamp, checkpoint");
            String cassandraVals = String.format("'%s', '%s', '%s'",
                    this.job, currentTime.toString(), checkpoint);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java
                                ModuleTagNames.SOURCE, ErrorCauseTagNames.FILE_PATH));
            }
            log.error(String.format("Error reading from source path"), e);
            throw new JobRuntimeException(e);
        }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `jsc` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final HoodieConfiguration hoodieConf;
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

```

### UnusedAssignment
Variable `dataFeedMetrics` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

    @Getter
    protected transient Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### UnusedAssignment
Variable `metadata` initializer `new HashMap`() is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                        }
                    }
                    HashMap<String, StringValue> metadata = new HashMap<String, StringValue>();
                    final Row row = rows.get(0);
                    metadata = deserializeMetadata((String) row.getObject("checkpoint"));
```

### UnusedAssignment
Variable `currentService` initializer `null` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
     */
    public static void shutdown(final boolean forceShutdown) {
        ThreadPoolService currentService = null;
        synchronized (ThreadPoolService.class) {
            if (!service.isPresent()) {
```

### UnusedAssignment
Variable `jsc` initializer `Optional.absent()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceConfiguration conf;
    @Getter
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    @Getter
    private final KafkaSourceDataConverter dataConverter;
```

### UnusedAssignment
Variable `contentBytes` initializer `new byte [0]` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
    private void uploadFileToS3(@NonNull final FileSystem fileSystem, @NonNull final Path path,
                                @NonNull final int partNum, final Date date) {
        byte[] contentBytes = new byte [0];
        log.info("Start upload file to S3 with partition num: {}", partNum);
        log.info("Start calculating file bytes.");
```

### UnusedAssignment
Variable `objKey` initializer `""` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                , this.awsConf.getBucketName(), this.awsConf.getObjectKey());
        try (final InputStream inputStream = fileSystem.open(path)) {
            String objKey = "";
            if (this.conf.getDispersalLength().equals(DispersalLengthType.MULTIPLE_DAY)) {
                objKey = String.format("%s/%s_%0" + this.digitNum + "d",
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `value == null` is always `false`
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
            default:
                log.error("name:{}:value:{}:valueClass:{}:schema:{}", name, value,
                    value == null ? "" : value.getClass(), schema);
                throw new JobRuntimeException("unsupported data type :" + nonOptionalSchema.getType());
        }
```

### ConstantValue
Condition `this.fieldsToConvert.isPresent()` is always `true` when reached
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final Schema.Field field = this.inputSchema.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
                    || this.fieldsToConvert.isPresent()
                    && this.fieldsToConvert.get().contains(field.name().toLowerCase())) {
                final Object rawData = avroPayload.getData().get(field.name());
```

### ConstantValue
Condition `topicPartitions == null` is always `true`
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            if (topicPartitions == null) {
                synchronized (KafkaUtil.class) {
                    if (topicPartitions == null) {
                        topicPartitions = kafkaConsumer.listTopics();
                        KafkaUtil.topicPartitions = new ConcurrentHashMap<>(topicPartitions);
```

### ConstantValue
Condition `this.fieldsToConvert.isPresent()` is always `true` when reached
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final Schema.Field field = this.inputSchemaAvro.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
                    || this.fieldsToConvert.isPresent()
                    && this.fieldsToConvert.get().contains(field.name().toLowerCase())) {
                final Object rawData = genericRecord.get(field.name());
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
                this.schema.getTableName(),
                key,
                oldestTimestamp.get());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
                log.info("using hoodie instant for reading checkpoint info :{}", lastInstant.get().getTimestamp());
                final HoodieCommitMetadata commitMetadata =
                    HoodieCommitMetadata.fromBytes(hoodieActiveTimeline.getInstantDetails(lastInstant.get()).get());
                final String serCommitInfo = commitMetadata.getMetadata(HOODIE_METADATA_KEY);
                if (!Strings.isNullOrEmpty(serCommitInfo)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
        }
        final HoodieWriteClient<HoodieAvroPayload> writeClient =
            new HoodieWriteClient<>(jsc.get(), this.hoodieConf.getHoodieWriteConfig(), true);
        final String commitTime = writeClient.startCommit();
        log.info("Saving metadata info using hoodie-commit: {}", commitTime);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
            log.info("Acquiring a new lock for {}", lockKey);
            final CustomizedInterProcessMutex newLockValue = new CustomizedInterProcessMutex(
                    client.get(), lockKey, lockInfo);
            try {
                if (acquireLock(newLockValue)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSourceConfiguration.java`
#### Snippet
```java

    public String getType() {
        return this.conf.getProperty(TYPE).get().toLowerCase();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSourceConfiguration.java`
#### Snippet
```java

    public Path getDirectory() {
        return new Path(this.conf.getProperty(DIRECTORY).get());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java
        if (this.isEnabled()) {
            ConfigUtil.checkMandatoryProperties(conf, getMandatoryProperties());
            this.zkBasePath = cleanZkBasePath(this.getConf().getProperty(ZK_BASE_PATH).get());
        } else {
            this.zkBasePath = null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(conf, this.getMandatoryProperties());

        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java

        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.username = conf.getProperty(USERNAME).get();
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.password =  conf.getProperty(PASSWORD).get();
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraMetadataManagerConfiguration.java`
#### Snippet
```java
        this.keyspace = conf.getProperty(KEYSPACE).get();
        this.tableName = conf.getProperty(TABLE_NAME).get();
        this.cluster = conf.getProperty(CLUSTER).get();

        if (conf.getProperty(INITIAL_HOSTS).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getClusterName() {
        return this.getConf().getProperty(CLUSTER_NAME).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getTableName() {
        return this.getConf().getProperty(TABLE_NAME).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.conf, this.getMandatoryProperties());

        this.partitionKeys = this.splitString(this.conf.getProperty(PARTITION_KEYS).get());

        if (this.conf.getProperty(INITIAL_HOSTS).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    public String getKeyspace() {
        return this.getConf().getProperty(KEYSPACE).get().trim();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());

        this.dataPath = this.getConf().getProperty(HIVE_DATA_PATH).get();
        this.jobName = this.getConf().getProperty(JOB_NAME).get();
        this.partitionKeyName = this.getConf().getProperty(PARTITION_KEY_NAME);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

        this.dataPath = this.getConf().getProperty(HIVE_DATA_PATH).get();
        this.jobName = this.getConf().getProperty(JOB_NAME).get();
        this.partitionKeyName = this.getConf().getProperty(PARTITION_KEY_NAME);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java
        if (this.conf.getProperty(PARTITION_TYPE).isPresent()) {
            this.partitionType = PartitionType.valueOf(this.getConf().getProperty(PARTITION_TYPE)
                    .get().trim().toUpperCase());
        } else {
            this.partitionType = PartitionType.NONE;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
        }
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = convert(row).get(0).getSuccessData().get().getData();
                final String rowKey = this.row_identifier.isEmpty() ? key
                        : row.getData().get(this.row_identifier).toString();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
            return true;
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
            this.partitionManager = new HDFSDatePartitionManager(hiveConf.getJobName(),
                    hiveConf.getDataPath(),
                    hiveConf.getPartitionKeyName().get(),
                    getHiveConf().getStartDate(),
                    fs);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
                metadataManager.getAllKeys().forEach(key -> {
                        final Optional<StringValue> metadataManagerValue = metadataManager.get(key);
                        log.info("metadata: key: {}, value: {}", key, metadataManagerValue.get());
                        if (metadata.containsKey(key)) {
                            final StringValue currentValue = metadata.get(key);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/MetadataManagerConfiguration.java`
#### Snippet
```java
        this.conf = conf;
        ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());
        this.jobName = this.conf.getProperty(MetadataManagerConfiguration.JOB_NAME).get();
        if (this.conf.getProperty(MetadataManagerConfiguration.TYPE).isPresent()) {
            this.metadataType = MetadataManagerType.valueOf(this.conf.getProperty(MetadataManagerConfiguration.TYPE)
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileSource.java`
#### Snippet
```java
                .map(Path::toString)
                .collect(Collectors.joining(","));
            final RDD<String> fileRows = this.jsc.get().sc().textFile(filesToRead, 1);
            return this.converter.map(fileRows.toJavaRDD()).getData();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HDFSMetadataManagerConfiguration.java`
#### Snippet
```java
    public HDFSMetadataManagerConfiguration(@NonNull final Configuration conf) {
        super(conf);
        this.baseMetadataPath = this.getConf().getProperty(BASE_METADATA_PATH).get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
    public AwsConfiguration(@NonNull final FileSinkConfiguration conf) {
        ConfigUtil.checkMandatoryProperties(conf.getConf(), this.getMandatoryProperties());
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(conf.getConf(), this.getMandatoryProperties());
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.region = conf.getAwsRegion().get();
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.awsAccessKeyId = conf.getAwsAccessKeyId().get();
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
        this.sourcePath = conf.getFullPath();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/AwsConfiguration.java`
#### Snippet
```java
        this.awsSecretAccessKey = conf.getAwsSecretAccesskey().get();
        this.bucketName = conf.getBucketName().get();
        this.objectKey = conf.getObjectKey().get();
        this.sourcePath = conf.getFullPath();
        this.fileSystemPrefix = conf.getPathPrefix();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/TimeoutManager.java`
#### Snippet
```java
            stageTracker = Optional.fromNullable(lastActiveTime.get(stageId));
        }
        stageTracker.get().taskStarted();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
                    try {
                        final Optional<Pair<String, IStatus>> result = Optional.fromNullable(future.get());
                        IStatus.Status status = result.get().value().getStatus();
                        log.info("job dag, name: {}, status: {}",
                                 result.get().key(), status.name());
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ZookeeperConfiguration.java`
#### Snippet
```java
        ConfigUtil.checkMandatoryProperties(this.getConf(), getMandatoryProperties());

        this.zkQuorum = this.getConf().getProperty(ZK_QUORUM).get();
        this.zkPort = this.getConf().getProperty(ZK_PORT).get();
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ZookeeperConfiguration.java`
#### Snippet
```java

        this.zkQuorum = this.getConf().getProperty(ZK_QUORUM).get();
        this.zkPort = this.getConf().getProperty(ZK_PORT).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
        if (this.timestampInfo.hasTimestamp()) {
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            insertStatement.value(timestampInfo.getTimestampFieldName(), bb);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            insertStatement.value(timestampInfo.getTimestampFieldName(), bb);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        //File System Prefix
        this.pathPrefix = this.conf.getProperty(PATH_PREFIX).get();

        if (this.conf.getProperty(SEPARATOR).isPresent()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        //File Name and Path Configurations
        this.sourceNamePrefix = this.conf.getProperty(SOURCE_NAME_PREFIX).get();

        if (this.partitionType != PartitionType.NONE) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
        }

        this.writeTimestamp = this.conf.getProperty(TIMESTAMP).get();
        this.sourceType = this.conf.getProperty(SOURCE_TYPE).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java

        this.writeTimestamp = this.conf.getProperty(TIMESTAMP).get();
        this.sourceType = this.conf.getProperty(SOURCE_TYPE).get();

        if (this.conf.getProperty(DISPERSAL_LENGTH).isPresent()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HDFSSchemaServiceConfiguration.java`
#### Snippet
```java

    public Path getPath() {
        return new Path(this.conf.getProperty(PATH).get());
    }
    public static List<String> getMandatoryProperties() {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ErrorTableConfiguration.java`
#### Snippet
```java
        if (this.isEnabled()) {
            ConfigUtil.checkMandatoryProperties(this.conf, getMandatoryProperties());
            this.destPath = new Path(conf.getProperty(DESTINATION_PATH).get());
        }
        this.isDatePartitioned = conf.getBooleanProperty(IS_DATE_PARTITIONED, DEFAULT_IS_DATE_PARTITIONED);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
        final String rowKey = data.first().getData().getSchema().getName();
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = this.convert(row).get(0).getSuccessData().get().getData();
                log.debug("Line: {}", line);
                return new Tuple2<>(rowKey, line);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java
    public KafkaSourceConfiguration(@NonNull final Configuration conf) {
        super(conf);
        this.topicName = getConf().getProperty(KAFKA_TOPIC_NAME).get();
        this.clusterName = getConf().getProperty(KAFKA_CLUSTER_NAME).get();

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java
        super(conf);
        this.topicName = getConf().getProperty(KAFKA_TOPIC_NAME).get();
        this.clusterName = getConf().getProperty(KAFKA_CLUSTER_NAME).get();

        //Try to initialize the start time. "start_date" is legacy, please use start_time moving forward.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
                    jobSubDag.setDataFeedMetrics(this.dataFeedMetrics.get());
                }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
                    jobSubDag.setDataFeedMetrics(this.dataFeedMetrics.get());
                }
            ));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        }
        final LongAccumulator totalDataReadInBytes = new LongAccumulator("totalDataRead");
        getJsc().get().sc().register(totalDataReadInBytes);
        final int numPartitions = workUnits.stream().map(r -> r.partition()).collect(Collectors.toSet()).size();
        final Map<Integer, TreeMap<Long, Integer>> kafkaPartitionOffsetToSparkPartitionMap
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        Collections.shuffle(workUnits);
        final RDD<ConsumerRecord<byte[], byte[]>> kafkaRDD = new KafkaRDD<byte[], byte[]>(
            this.jsc.get().sc(),
            kafkaParams,
            workUnits.toArray(new OffsetRange[0]),
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java

        final GenericRecord genericRecord = avroPayload.getData();
        for (int i = 0; i < this.inputSchemaAvro.get().getFields().size(); i++) {
            final Schema.Field field = this.inputSchemaAvro.get().getFields().get(i);
            if (!this.fieldsToConvert.isPresent()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
        if (this.timestampInfo.hasTimestamp()) {
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            row.addField(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final ByteBuffer bb = this.timestampInfo.isSaveAsLongType()
                    ? LongType.instance.decompose(Long.parseLong(this.timestampInfo.getTimestamp().get()))
                    : ByteBufferUtil.wrap(this.timestampInfo.getTimestamp().get());
            row.addField(
                    new CassandraDataField(ByteBufferUtil.wrap(this.timestampInfo.getTimestampFieldName()), bb));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                                            @NonNull final Optional<DataFeedMetrics> metrics) {
        final ByteBuffer bb;
        final FieldInfo fieldInfo = fieldInfoMap.get().get(field);
        final Schema.Type type = fieldInfo.getNonNullType();
        if (fieldInfo.isTimestampField()) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java

    private void setupMetrics() {
        this.sink.setJobMetrics(getJobMetrics().get());
        this.sink.setDataFeedMetrics(getDataFeedMetrics().get());
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/job/SingleSinkSubDag.java`
#### Snippet
```java
    private void setupMetrics() {
        this.sink.setJobMetrics(getJobMetrics().get());
        this.sink.setDataFeedMetrics(getDataFeedMetrics().get());
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
                    throw new ForkOperationException("Using unregistered key :" + key);
                }
                this.registeredKeys.get(key).get().add(1);
            });
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
                    // this is my specific topic
                    metadata.put(Integer.parseInt(key.substring(topicSpecificName.length())),
                        Long.parseLong(metadataManager.get(key).get().getValue()));
                } else if (key.startsWith(KAFKA_METADATA_WITH_SEPARATOR)) {
                    // this is a specific topic, but not mine. ignore.
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
                    // this is unspecified topic
                    metadata.put(Integer.parseInt(key.substring(KAFKA_METADATA_PREFIX.length())),
                        Long.parseLong(metadataManager.get(key).get().getValue()));
                    // delete the old, unspecified metadata
                    toDelete.add(key);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
     * */
    public String getHoodieMetricsPrefix() {
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_METRICS_PREFIX, this.tableKey)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
    public String getBasePath() {
        // HOODIE_BASE_PATH is a mandatory property. Please check {#getMandatoryProperties()}.
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_BASE_PATH, this.tableKey)).get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
     */
    public String getTableName() {
        return this.getConf().getProperty(getTablePropertyKey(HOODIE_TABLE_NAME, this.tableKey)).get();
    }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuffer.append()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                while ((line = br.readLine()) != null) {
                    outputBuffer.append(line + "\n");
                }
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        this.props.entrySet().forEach(
            entry -> {
                sb.append(entry.getKey() + "<=>" + entry.getValue() + "\n");
            }
        );
```

## RuleId[id=RedundantCompareToJavaTime]
### RedundantCompareToJavaTime
Expression with 'java.time' `compareTo()` call can be simplified
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
                .stream()
                .map(dt -> DateUtil.convertToUTCDate(dt.replace(this.partitionKeyName, StringTypes.EMPTY)))
                .filter(dt -> dt.compareTo(startDate) >= 0)
                .collect(Collectors.toList());

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

            // Deserialize the map and load the checkpoint data
            return fs.isPresent() ? Optional.of(fs.get()) : Optional.absent();
        }
        return Optional.absent();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.hoodie.common.model.HoodieRecord' to 'com.uber.hoodie.common.model.HoodieRecord'
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java
    public String getErrorSourceData(@NonNull final ErrorData errorData) {
        try {
            HoodieRecord<HoodieRecordPayload> payload = (HoodieRecord) errorData.getRawData().getData();
            String data = String.format("%s. %s", payload.getKey().toString(),
                String.format("HoodieRecordPayload %s", payload.getData().toString()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedList' to 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java

    private List<Class> getDefaultSerializableClasses() {
        final List<Class> serializableClasses = new LinkedList(Arrays.<Class>asList(
            AbstractDataConverter.class,
            AbstractValue.class,
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedList(Collection)' as a member of raw type 'java.util.LinkedList'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java

    private List<Class> getDefaultSerializableClasses() {
        final List<Class> serializableClasses = new LinkedList(Arrays.<Class>asList(
            AbstractDataConverter.class,
            AbstractValue.class,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
            throws JobRuntimeException {

        final List<String> locked = new ArrayList();
        final AtomicBoolean isSuccess = new AtomicBoolean(true);
        try {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.ConcurrentHashMap' to 'java.util.concurrent.ConcurrentHashMap'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
        this.lockConf = new LockManagerConfiguration(conf);
        this.isEnabled = lockConf.isEnabled();
        this.lockMap = new ConcurrentHashMap();
        if (this.isEnabled) {
            final ZookeeperConfiguration zkConf = new ZookeeperConfiguration(conf);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
        this.clusteringKeys = this.conf.getProperty(CLUSTERING_KEYS).isPresent()
                ? initClusterKeys(this.splitString(this.conf.getProperty(CLUSTERING_KEYS).get()))
                : Collections.EMPTY_LIST;

        this.writtenTime = this.conf.getProperty(WRITTEN_TIME).isPresent()
```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/reporters/Reporters.java`
#### Snippet
```java
        }

        this.reporters.forEach(r -> r.gauge(m));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
        final HiveRunState nextRunState = new HiveRunState(this.nextPartition);
        final List<String> workUnits = this.nextPartition.isPresent()
                ? Collections.singletonList(this.nextPartition.get()) : Collections.EMPTY_LIST;
        return new ParquetWorkUnitCalculatorResult(workUnits, nextRunState);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'JobDag(ISource, ISink, IMetadataManager, IWorkUnitCalculator, String, String, JobMetrics, ...)' as a member of raw type 'com.uber.marmaray.common.job.JobDag'
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java

            log.info("Initializing job dag");
            final JobDag jobDag = new JobDag(hiveSource, cassandraSink, metadataManager, workUnitCalculator,
                    hiveSourceConf.getJobName(), hiveSourceConf.getJobName(), new JobMetrics("marmaray"),
                    dataFeedMetrics, reporters);
```

### UNCHECKED_WARNING
Unchecked call to 'RawData(T)' as a member of raw type 'com.uber.marmaray.common.data.RawData'
in `marmaray/src/main/java/com/uber/marmaray/common/data/RawDataHelper.java`
#### Snippet
```java
            return new BinaryRawData((byte[]) data);
        }
        return new RawData(data);
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Callable' to 'java.util.concurrent.Callable'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java

    private void submitFuture(@NonNull final ThreadPoolServiceFuture future) {
        future.addWrappedFuture(this.threadPool.submit(future.getWrappedCallable()));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.marmaray.common.job.ThreadPoolService.ThreadPoolServiceCallable' to 'java.util.concurrent.Callable'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            if (tier.equals(ThreadPoolServiceTier.JOB_DAG_TIER)) {
                if (service.canScheduleJobDag()) {
                    future.addWrappedFuture(service.scheduleJobDag(threadPoolServiceCallable));
                } else {
                    service.queueJobDag(future);
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.marmaray.common.job.ThreadPoolService.ThreadPoolServiceCallable' to 'java.util.concurrent.Callable'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            } else if (tier.equals(ThreadPoolServiceTier.ACTIONS_TIER)) {
                if (service.canScheduleAction()) {
                    future.addWrappedFuture(service.scheduleAction(threadPoolServiceCallable));
                } else {
                    service.queueAction(future);
```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DataFeedMetrics.java`
#### Snippet
```java

    public void guageNonFailureMetric(final IReporter reporter) {
        this.metricSet.forEach(reporter::gauge);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DataFeedMetrics.java`
#### Snippet
```java

    public void gauageFailureMetric(final IReporter reporter) {
        this.failureMetricSet.forEach(reporter::gauge);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
            case MAP:
                final Schema valueSchema = nonNullSchema.getValueType();
                final Map<String, Object> map1 = (Map<String, Object>) field1;
                final Map<String, Object> map2 = (Map<String, Object>) field2;
                if (map1.size() != map2.size()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                final Schema valueSchema = nonNullSchema.getValueType();
                final Map<String, Object> map1 = (Map<String, Object>) field1;
                final Map<String, Object> map2 = (Map<String, Object>) field2;
                if (map1.size() != map2.size()) {
                    return false;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                                    v.getClass().getCanonicalName(), elementSchema);
                                if (v instanceof Record && ((Record) v).get("array") != null) {
                                    listRes.add(fixEnumRecordField(((Record) v).get("array"), name, elementSchema));
                                } else {
                                    listRes.add(fixEnumRecordField(v, name, elementSchema));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                                    listRes.add(fixEnumRecordField(((Record) v).get("array"), name, elementSchema));
                                } else {
                                    listRes.add(fixEnumRecordField(v, name, elementSchema));
                                }
                                break;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                final Schema valueSchema = nonOptionalSchema.getValueType();
                Map<String, Object> ret = new HashMap<>();
                for (final Map.Entry<String, Object> v : ((Map<String, Object>) value).entrySet()) {
                    ret.put(v.getKey(), fixEnumRecordField(v.getValue(), name, valueSchema));
                }
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.marmaray.common.data.RDDWrapper' to 'com.uber.marmaray.common.data.RDDWrapper\>'
in `marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
            );

            RDDWrapper<HoodieRecord<HoodieRecordPayload>> hoodieErrorRecords = new RDDWrapper(hoodieRecords, numErrors);
            hoodieSink.write(hoodieErrorRecords);
        } catch (IOException ioe) {
```

### UNCHECKED_WARNING
Unchecked call to 'RDDWrapper(JavaRDD, long)' as a member of raw type 'com.uber.marmaray.common.data.RDDWrapper'
in `marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
            );

            RDDWrapper<HoodieRecord<HoodieRecordPayload>> hoodieErrorRecords = new RDDWrapper(hoodieRecords, numErrors);
            hoodieSink.write(hoodieErrorRecords);
        } catch (IOException ioe) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Future' to 'java.util.concurrent.Future\>'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java
            ThreadPoolService.init(this.conf);
            runtimeJobDagOrder.forEach(jobDag ->
                    futures.add(ThreadPoolService.submit(
                        () -> {
                            SparkJobTracker.setJobName(javaSparkContext.sc(), jobDag.getDataFeedName());
```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/JobMetrics.java`
#### Snippet
```java
    @Override
    public void gaugeAll(@NonNull final IReporter reporter) {
        metricSet.forEach(reporter::gauge);
    }
}
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Integer' to 'T'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
        @NonNull final T defaultValue) {
        if (defaultValue instanceof Integer) {
            return (T) new Integer(conf.getIntProperty(key, ((Integer) defaultValue).intValue()));
        } else if (defaultValue instanceof Long) {
            return (T) new Long(conf.getLongProperty(key, ((Long) defaultValue).longValue()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Long' to 'T'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Integer(conf.getIntProperty(key, ((Integer) defaultValue).intValue()));
        } else if (defaultValue instanceof Long) {
            return (T) new Long(conf.getLongProperty(key, ((Long) defaultValue).longValue()));
        } else if (defaultValue instanceof String) {
            return (T) conf.getProperty(key, (String) defaultValue);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.String' to 'T'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Long(conf.getLongProperty(key, ((Long) defaultValue).longValue()));
        } else if (defaultValue instanceof String) {
            return (T) conf.getProperty(key, (String) defaultValue);
        } else if (defaultValue instanceof Double) {
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'T'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) conf.getProperty(key, (String) defaultValue);
        } else if (defaultValue instanceof Double) {
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Boolean' to 'T'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
            return (T) new Double(conf.getDoubleProperty(key, ((Double) defaultValue).doubleValue()));
        } else if (defaultValue instanceof Boolean) {
            return (T) new Boolean(conf.getBooleanProperty(key, ((Boolean) defaultValue).booleanValue()));
        } else {
            throw new IllegalArgumentException("Not supported :" + defaultValue.getClass());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Future' to 'java.util.concurrent.Future'
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        final ConcurrentMap<Future<Boolean>, IJobDagAction> futures = new ConcurrentHashMap<>();
        this.actions.forEach(a ->
            futures.put(ThreadPoolService.submit(() -> {
                    final long startTime = System.currentTimeMillis();
                    final boolean success;
```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        timeMetric.addTags(action.getMetricTags());
        timeMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(timeMetric));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'gauge(T)' as a member of raw type 'com.uber.marmaray.common.reporters.IReporter'
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        resultMetric.addTags(action.getMetricTags());
        resultMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(resultMetric));
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'assign(Collection)' as a member of raw type 'org.apache.kafka.clients.consumer.KafkaConsumer'
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
    public static Map<TopicPartition, Long> getLatestLeaderOffsets(@NonNull final KafkaConsumer kafkaConsumer,
        @NotEmpty final String topicName, @NonNull final Set<TopicPartition> topicPartitions) {
        kafkaConsumer.assign(topicPartitions);
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> latestLeaderOffsets =
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'. Reason: 'kafkaConsumer' has raw type, so result of endOffsets is erased
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> latestLeaderOffsets =
            kafkaConsumer.endOffsets(topicPartitions);
        log.info("topic-partition latest offsets :{}", latestLeaderOffsets);
        return latestLeaderOffsets;
```

### UNCHECKED_WARNING
Unchecked call to 'endOffsets(Collection)' as a member of raw type 'org.apache.kafka.clients.consumer.KafkaConsumer'
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> latestLeaderOffsets =
            kafkaConsumer.endOffsets(topicPartitions);
        log.info("topic-partition latest offsets :{}", latestLeaderOffsets);
        return latestLeaderOffsets;
```

### UNCHECKED_WARNING
Unchecked call to 'KafkaConsumer(Map)' as a member of raw type 'org.apache.kafka.clients.consumer.KafkaConsumer'
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
     */
    public static KafkaConsumer getKafkaConsumer(final Map<String, String> kafkaPrams) {
        return new KafkaConsumer(kafkaPrams);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'. Reason: 'kafkaConsumer' has raw type, so result of listTopics is erased
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
                synchronized (KafkaUtil.class) {
                    if (topicPartitions == null) {
                        topicPartitions = kafkaConsumer.listTopics();
                        KafkaUtil.topicPartitions = new ConcurrentHashMap<>(topicPartitions);
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'assign(Collection)' as a member of raw type 'org.apache.kafka.clients.consumer.KafkaConsumer'
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
    public static Map<TopicPartition, Long> getEarliestLeaderOffsets(@NonNull final KafkaConsumer kafkaConsumer,
        @NotEmpty final String topicName, @NonNull final Set<TopicPartition> topicPartitions) {
        kafkaConsumer.assign(topicPartitions);
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> earliestLeaderOffsets =
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'. Reason: 'kafkaConsumer' has raw type, so result of beginningOffsets is erased
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> earliestLeaderOffsets =
            kafkaConsumer.beginningOffsets(topicPartitions);
        log.info("topic-partition earliest offsets :{}", earliestLeaderOffsets);
        return earliestLeaderOffsets;
```

### UNCHECKED_WARNING
Unchecked call to 'beginningOffsets(Collection)' as a member of raw type 'org.apache.kafka.clients.consumer.KafkaConsumer'
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        verifyTopicPartitions(kafkaConsumer, topicName, topicPartitions);
        final Map<TopicPartition, Long> earliestLeaderOffsets =
            kafkaConsumer.beginningOffsets(topicPartitions);
        log.info("topic-partition earliest offsets :{}", earliestLeaderOffsets);
        return earliestLeaderOffsets;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Future' to 'java.util.concurrent.Future'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
                            ThreadPoolService.submit(
                                () -> {
                                    childNode.commit();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.concurrent.Future' to 'java.util.concurrent.Future'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
                            ThreadPoolService.submit(
                                () -> {
                                    childNode.execute(getDataForChild(childNode));
```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.marmaray.common.data.IData' to 'com.uber.marmaray.common.data.ValidData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
            errorExtractor);

        return new RDDWrapper<>(converter.getRDD(VALID_RECORD).map(r -> ((ValidData<OD>) r).getData()),
                converter.getCount(VALID_RECORD));
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'com.uber.marmaray.common.data.IData' to 'com.uber.marmaray.common.data.RawData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
            }

            final RawData<ID> rawData = (RawData<ID>) record;

            List<ConverterResult<ID, OD>> results;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
    protected JavaRDD<String> addColumnHeader(@NonNull final String header, @NonNull final JavaRDD<String> data) {
        final JavaRDD<String> result = data.mapPartitions((lines) -> {
                final List<String> partitionList = IteratorUtils.toList(lines);
                partitionList.add(0, header);
                return partitionList.iterator();
```

### UNCHECKED_WARNING
Unchecked call to 'ErrorData(String, RawData)' as a member of raw type 'com.uber.marmaray.common.data.ErrorData'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

                    final JavaRDD<ErrorData> errorRDD = hoodieRecordAndErrorTupleRDD
                            .map(r -> new ErrorData(r._2, RawDataHelper.getRawData(r._1)));

                    ErrorTableUtil.writeErrorRecordsToErrorTable(this.jsc.sc(),
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.marmaray.common.metadata.IMetadataManager' to 'com.uber.marmaray.common.metadata.IMetadataManager'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        this.op = op;
        this.metadataMgr = metadataMgr;
        this.sinkStatMgr = new SinkStatManager(this.hoodieConf.getTableName(), this.metadataMgr);
        this.sinkStatMgr.init();
        this.shouldSaveChangesInFuture = shouldSaveChangesInFuture;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
            genericRecord = func.call(genericRecord);
        }
        return Collections.singletonList(new ConverterResult(new AvroPayload(genericRecord, this.fieldsToCache)));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.uber.marmaray.common.converters.converterresult.ConverterResult' to 'com.uber.marmaray.common.converters.converterresult.ConverterResult'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
            genericRecord = func.call(genericRecord);
        }
        return Collections.singletonList(new ConverterResult(new AvroPayload(genericRecord, this.fieldsToCache)));
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'ConverterResult(OD)' as a member of raw type 'com.uber.marmaray.common.converters.converterresult.ConverterResult'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
            genericRecord = func.call(genericRecord);
        }
        return Collections.singletonList(new ConverterResult(new AvroPayload(genericRecord, this.fieldsToCache)));
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java
            String.format("Value for scopePrecedence %s should be a map, got null or primitive: ",
                scopeOverrideDefinitionNodeVal));
        this.scopeOverrideMap = mapper.convertValue(scopeOverrideDefinitionNodeVal, Map.class);
        log.info("scopeOverrideMap is {} scope is {}", this.scopeOverrideMap, scope.get());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedList' to 'java.util.Deque'
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
        return new Iterator<FileStatus>() {
            private final Stack<String> pathsToProcess = new Stack<>();
            private final Deque<FileStatus> newFilesQ = new LinkedList();
            private String lastProcessedFile = toProcessAfter.toUri().getRawPath();
            private final String pathToStopProcessingAfter = toProcessBefore.toUri().getRawPath();
```

### UNCHECKED_WARNING
Unchecked assignment: 'com.google.common.base.Optional' to 'com.google.common.base.Optional'. Reason: 'this.metadataManager' has raw type, so result of get is erased
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     */
    public Optional<Map<String, String>> get(@NotEmpty final String key) throws IOException {
        final Optional<StringValue> metadataValues =  this.metadataManager.get(key);
        if (metadataValues.isPresent()) {
            return Optional.of(mapper.readValue(metadataValues.get().getValue(), typeRef));
```

### UNCHECKED_WARNING
Unchecked call to 'set(String, T)' as a member of raw type 'com.uber.marmaray.common.metadata.IMetadataManager'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
        try {
            if (!value.isEmpty()) {
                this.metadataManager.set(key, new StringValue(mapper.writeValueAsString(value)));
            }
        } catch (JsonProcessingException e) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class\>'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraSSTableSink.java`
#### Snippet
```java
                    // Due to type erasure of parameterized types just use List here
                    List.class,
                    outputFormatClass,
                    hadoopConf);
        } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
            try {
                builder.withWriteStatusClass(
                        (Class<? extends WriteStatus>) Class.forName(writeStatusClassName));
            } catch (ClassNotFoundException e) {
                final String errorStr =
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `getRecordKey(AvroPayload)` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/exceptions/InvalidDataException.java`
#### Snippet
```java
/**
 * It is a checked exception and should be thrown when there is either missing or invalid user defined field in
 * data. Check {@link HoodieSinkDataConverter#getRecordKey(AvroPayload)}
 * for an example.
 */
```

### JavadocReference
Symbol `dispersalType` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/HdfsFileSink.java`
#### Snippet
```java
    /**
     * This method overrides write method in {@link FileSink}
     * If the {@link FileSinkConfiguration#dispersalType} is OVERWRITE,
     * it will delete previous files in the destination path.
     * Then it will write new files to hdfs path: {@link FileSinkConfiguration #fullpath}
```

### JavadocReference
Symbol `fullPath` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/HdfsFileSink.java`
#### Snippet
```java
 * {@link HdfsFileSink} implements {@link FileSink} interface to build a FileSink
 * that first convert data to String with csv format
 * and then save to Hdfs path defined in {@link FileSinkConfiguration#fullPath}
 */
@Slf4j
```

### JavadocReference
Symbol `fullPath` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
     * Data first converted by {@link FileSinkDataConverter}
     * then repartition by {@link FileSink#getRepartitionNum(JavaRDD)}
     * Finally saved in destination {@link FileSinkConfiguration#fullPath}
     *
     * @param data data to write to sink
```

### JavadocReference
Symbol `fileSizeMegaBytes` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java

    /**
     * This method repartition data based on {@link FileSinkConfiguration#fileSizeMegaBytes}
     * 1) {@link FileSinkConfiguration#fileSizeMegaBytes} = OUTPUT_ONE_FILE_CONFIG
     * => repartition number is 1
```

### JavadocReference
Symbol `fileSizeMegaBytes` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
    /**
     * This method repartition data based on {@link FileSinkConfiguration#fileSizeMegaBytes}
     * 1) {@link FileSinkConfiguration#fileSizeMegaBytes} = OUTPUT_ONE_FILE_CONFIG
     * => repartition number is 1
     * 2) {@link FileSinkConfiguration#fileSizeMegaBytes} != OUTPUT_ONE_FILE_CONFIG
```

### JavadocReference
Symbol `fileSizeMegaBytes` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
     * 1) {@link FileSinkConfiguration#fileSizeMegaBytes} = OUTPUT_ONE_FILE_CONFIG
     * => repartition number is 1
     * 2) {@link FileSinkConfiguration#fileSizeMegaBytes} != OUTPUT_ONE_FILE_CONFIG
     * => each output file with size in megabytes around {@link FileSinkConfiguration#fileSizeMegaBytes}
     * => repartition number = total data size in megabytes {@link FileSink#getRddSizeInMegaByte(JavaRDD)} / required megabytes per file
```

### JavadocReference
Symbol `fileSizeMegaBytes` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
     * => repartition number is 1
     * 2) {@link FileSinkConfiguration#fileSizeMegaBytes} != OUTPUT_ONE_FILE_CONFIG
     * => each output file with size in megabytes around {@link FileSinkConfiguration#fileSizeMegaBytes}
     * => repartition number = total data size in megabytes {@link FileSink#getRddSizeInMegaByte(JavaRDD)} / required megabytes per file
     *
```

### JavadocReference
Symbol `inputRDD` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
     * record with set of registered keys.
     * @return  {@link ForkData} with set of fork keys which should be associated with the record.
     * @param record element from {@link ForkOperator#inputRDD}.
     * @throws Exception
     */
```

### JavadocReference
Symbol `dispersalType` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
    /**
     * This method overrides {@link FileSink#write(JavaRDD)}
     * If the {@link FileSinkConfiguration#dispersalType} is OVERWRITE,
     * it will overwrite existing files with prefix {@link AwsConfiguration #objectKey} in {@link AwsConfiguration #bucketName}
     * Then save converted and repartitioned data to temporary path {@link FileSinkConfiguration#fullPath}
```

### JavadocReference
Symbol `fullPath` is inaccessible from here
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
     * If the {@link FileSinkConfiguration#dispersalType} is OVERWRITE,
     * it will overwrite existing files with prefix {@link AwsConfiguration #objectKey} in {@link AwsConfiguration #bucketName}
     * Then save converted and repartitioned data to temporary path {@link FileSinkConfiguration#fullPath}
     * And finally upload each file in that path to aws s3 bucket with {@link AwsFileSink#uploadFileToS3(FileSystem, Path, int, Date)}
     *
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `this.jobDagQueue.poll()` might be null
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                } else {
                    // can now move a jobDag thread to an actions thread
                    submitFuture(this.jobDagQueue.poll());
                    this.currentActionsThreads.decrementAndGet();
                    this.currentJobDagThreads.incrementAndGet();
```

### DataFlowIssue
Argument `this.actionsQueue.poll()` might be null
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                } else {
                    // can now move an actions thread to a jobDag thread
                    submitFuture(this.actionsQueue.poll());
                    this.currentJobDagThreads.decrementAndGet();
                    this.currentActionsThreads.incrementAndGet();
```

### DataFlowIssue
Method invocation `limit` may produce `NullPointerException`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                }
                if (requiredKeysToFind.contains(field.name())
                      && bb.limit() != 0) {
                    requiredKeysToFind.remove(field.name());
                }
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
        switch (type) {
            case LONG:
                return Optional.fromNullable((Long) rawData);
            case STRING:
                return Optional.fromNullable(Long.parseLong(rawData.toString()));
```

### DataFlowIssue
Passing a non-null argument to `Optional`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                return Optional.fromNullable((Long) rawData);
            case STRING:
                return Optional.fromNullable(Long.parseLong(rawData.toString()));
            default:
                if (this.dataFeedMetrics.isPresent()) {
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaBootstrapOffsetSelector.java`
#### Snippet
```java
                                                  @NonNull final Map<TopicPartition, Long> latestLeaderOffsets) {
        final Map<Integer, Long> ret = new HashMap<>();
        latestLeaderOffsets.entrySet().stream().forEach(e -> ret.put(e.getKey().partition(), e.getValue()));
        return ret;
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

        log.info("Field names found: {}", fieldNames.size());
        fieldNames.stream().forEach(f -> log.info("Schema field: {}", f));

        try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/ConfigUtil.java`
#### Snippet
```java
            log.warn("mandatory properties are empty");
        }
        mandatoryProps.stream().forEach(
            prop -> {
                if (!conf.getProperty(prop).isPresent()) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'max()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
                    new Path(parentFolder, "*")))
                .filter(f -> !f.getPath().getName().endsWith(MetadataConstants.TEMP_FILE_EXTENSION))
                .sorted(byDateAsc.reversed()).findFirst();

            // Deserialize the map and load the checkpoint data
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        final Cluster.Builder builder = Cluster.builder().withClusterName(this.config.getCluster());
        builder.withCredentials(this.config.getUsername(), this.config.getPassword());
        this.config.getInitialHosts().stream().forEach(host -> builder.addContactPoint(host));
        if (this.config.getNativePort().isPresent()) {
            builder.withPort(Integer.parseInt(this.config.getNativePort().get()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray-tools/src/main/java/com/uber/marmaray/tools/HDFSMetadataPrinter.java`
#### Snippet
```java
                metadataMap.entrySet()
                    .stream()
                    .forEach(entry ->
                            log.info("Key: " + entry.getKey() + " Value: " + entry.getValue().getValue()));
            }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/ExecutionTimeJobExecutionStrategy.java`
#### Snippet
```java
        final AtomicInteger preTopicOrderingCounter = new AtomicInteger(0);
        final AtomicInteger postTopicOrderingCounter = new AtomicInteger(0);
        inputJobDags.stream().forEach(jobDag -> initialTopicOrdering.put(jobDag.getDataFeedName(),
            preTopicOrderingCounter.incrementAndGet()));
        final List<Dag> result = new ArrayList<>(inputJobDags.size());
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        log.info("Searching for partitions in path: {}", partitionFolderRegex);
        final FileStatus[] fileStatuses  = this.fileSystem.globStatus(new Path(partitionFolderRegex));
        final List<String> partitions = Arrays.asList(fileStatuses).stream()
                .map(fileStatus -> fileStatus.getPath().getName())
                // filter out hidden files/directories
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        try {
            final FileStatus[] fileStatuses = this.fileSystem.listStatus(new Path(baseDataPath));
            this.isSinglePartition = !Arrays.stream(fileStatuses).anyMatch(fs -> fs.isDirectory());
        } catch (final IOException e) {
            throw new JobRuntimeException("IOException encountered. Path:" + baseDataPath, e);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        timeMetric.addTags(action.getMetricTags());
        timeMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(timeMetric));
    }

```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/actions/JobDagActions.java`
#### Snippet
```java
        resultMetric.addTags(action.getMetricTags());
        resultMetric.addTag(ACTION_TARGET, this.getTarget());
        this.reporters.getReporters().stream().forEach(r -> r.gauge(resultMetric));
    }
}
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
                        attemptNumber.incrementAndGet()
                );
                topicPartitions.stream().forEach(
                    tp -> {
                        try {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            @NotEmpty final String topicName, @NonNull final Set<TopicPartition> topicPartitions) {
        final Set<Integer> partitions = new HashSet<>();
        topicPartitions.stream().forEach(
            tp -> {
                partitions.add(tp.partition());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
            }
        );
        getTopicPartitions(kafkaConsumer, topicName).stream().forEach(p -> partitions.remove(p.partition()));
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
    public static Map<String, Object> getKafkaParams(@NonNull final KafkaConfiguration kafkaConf) {
        final Map<String, Object> newKafkaParams = new HashMap<>();
        kafkaConf.getKafkaParams().entrySet().stream().forEach(
            entry -> {
                final String val = entry.getValue();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
    private void setupChildMetrics() {

        this.childNodes.entrySet().stream().forEach(
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

        this.childNodes.entrySet().stream().forEach(
            entry -> entry.getValue().stream().forEach(
                jobSubDag -> {
                    jobSubDag.setJobMetrics(this.jobMetrics.get());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
    public final void commit() {
        log.info("calling {}'s childNodes' commit", this.name);
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
            childNodesAtSamePriority -> {
                final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
                childNodesAtSamePriority.getValue().stream().forEach(
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

        final Queue<SubDagExecutionStatus> statuses = new LinkedList<>();
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                childNodesAtSamePriority.getValue().stream().forEach(
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
        this.childNodes.entrySet().stream().forEach(
            childNodesAtSamePriority -> {
                childNodesAtSamePriority.getValue().stream().forEach(
                    childNode -> statuses.add(
                        new SubDagExecutionStatus(childNode,
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
            final List<ForkData<IData>> forkData = new ArrayList<>();

            results.stream().forEach(t -> {
                    if (t.getErrorData().isPresent()) {
                        processRecordHandler(AbstractDataConverter.this.failureRecordHandler,
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/utilities/MapUtil.java`
#### Snippet
```java
    public static String serializeMap(@NonNull final Map<String, String> map) {
        final StringBuilder sb = new StringBuilder();
        map.entrySet().stream().forEach(
            entry -> {
                if (sb.length() > 0) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
    public final Iterator<ForkData<DI>> call(final DI di) {
        final List<ForkData<DI>> forkData = process(di);
        forkData.stream().forEach(fd -> verifyKeys(fd.getKeys(), di));
        return forkData.iterator();
    }
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java

    private void verifyKeys(final List<Integer> keys, final DI di) {
        keys.stream().forEach(key -> {
                if (!this.registeredKeys.containsKey(key)) {
                    log.error("Invalid key:{}: in keys:{}:for record:{}", key, keys, di);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java

    public void registerKeys(final List<Integer> keys) {
        keys.stream().forEach(key -> {
                if (this.registeredKeys.containsKey(key)) {
                    throw new ForkOperationException("Duplicate key found :" + key);
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/TimerMetric.java`
#### Snippet
```java

    public TimerMetric(@NotEmpty final String metricName, @NonNull final Map<String, String> tags) {
        this(metricName.toString());
        this.addTags(tags);
    }
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
    public HoodieIndex.IndexType getHoodieIndexType() {
        final String indexName = getProperty(HOODIE_INDEX_TYPE, DEFAULT_HOODIE_INDEX_TYPE);
        if (HOODIE_BLOOM_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.BLOOM;
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        if (HOODIE_BLOOM_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.BLOOM;
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.HBASE;
        } else if (HOODIE_IN_MEMORY_INDEX.equals(indexName.toLowerCase())) {
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieIndexConfiguration.java`
#### Snippet
```java
        } else if (HOODIE_HBASE_INDEX.equals(indexName.toLowerCase())) {
            return HoodieIndex.IndexType.HBASE;
        } else if (HOODIE_IN_MEMORY_INDEX.equals(indexName.toLowerCase())) {
            return IndexType.INMEMORY;
        } else {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

        final String fileLocation = new Path(this.baseMetadataPath, currentTime.toString()).toString();
        final String tmpFileLocation = fileLocation.toString() + MetadataConstants.TEMP_FILE_EXTENSION;

        try (final OutputStream os = new BufferedOutputStream(
```

### StringOperationCanBeSimplified
`toUpperCase()` call can be replaced with 'equalsIgnoreCase()'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
            throw new MissingPropertyException("Source information for the JobManager Metadata Tracker is missing.");
        }
        if (sourceType.get().toUpperCase().equals(MetadataConstants.JOBMANAGER_METADATA_SOURCE_HDFS)) {
            final Optional<String> basePath = config.getProperty(MetadataConstants.JOBMANAGER_METADATA_HDFS_BASEPATH);
            if (!basePath.isPresent()) {
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraClientSink.java`
#### Snippet
```java
                                                        ErrorCauseTagNames.EXEC_CASSANDRA_CMD));
                            }
                            log.error("Exception: {}", e);
                            throw new JobRuntimeException(e);
                        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `marmaray/src/main/java/com/uber/marmaray/utilities/CassandraSinkUtil.java`
#### Snippet
```java
                return Optional.of(epochTime);
            } catch (ParseException e) {
                log.error("Got exception in parse the date to microseconds. {}", e);
            }
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
            Preconditions.checkState(fieldNames.containsAll(lowerCasePartitionKeys));
        } catch (Exception e) {
            log.error("One or more of your partition keys (%s) were not found in the available schema fields (%s)",
                    lowerCasePartitionKeys, fieldNames);
            if (this.dataFeedMetrics.isPresent()) {
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                                        ErrorCauseTagNames.EXEC_CASSANDRA_CMD));
            }
            log.error("Exception: {}", e);
            throw new JobRuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                    status.getStatus().get();
                } catch (InterruptedException e) {
                    log.error("interrupted {} {}", status.getSubDag().getName(), e);
                    throw new JobRuntimeException("dag execution interrupted", e);
                } catch (ExecutionException e) {
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
                    throw new JobRuntimeException("dag execution interrupted", e);
                } catch (ExecutionException e) {
                    log.error("failed to execute subdag {} {}", status.getSubDag().getName(), e.getCause());
                    throw new JobRuntimeException("failed to execute subDag", e.getCause());
                }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (0) than placeholders specified (1)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/HdfsFileSink.java`
#### Snippet
```java
                                ModuleTagNames.SINK, ErrorCauseTagNames.WRITE_FILE));
            }
            log.error("Exception: {}", e);
            throw new JobRuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                                ModuleTagNames.SINK, ErrorCauseTagNames.UPLOAD));
            }
            log.error("Failed while reading bytes from source path with message %s", e.getMessage());
            throw new JobRuntimeException(e);
        }
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                                ModuleTagNames.SINK, ErrorCauseTagNames.UPLOAD));
            }
            log.error("Failed while putObject to bucket %s with message %s"
                    , this.awsConf.getBucketName(), e.getErrorMessage());
            throw new JobRuntimeException(e);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                                ModuleTagNames.SINK, ErrorCauseTagNames.UPLOAD));
            }
            log.error("Failed while open source path with %s", e.getMessage());
            throw new JobRuntimeException(e);
        }
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
        } catch (IOException | InterruptedException e) {
            throw new JobRuntimeException("Exception occurred while executing command: " + cmd
                    + " , timeout: " + String.valueOf(timeout) + ", unit: " + unit.name()
                    + " Error Message: " + e.getMessage(), e);
        }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java
        private static List<String> parse(final String details) {
            final List<String> stack = new ArrayList<>();
            for (String str: Arrays.asList(details.split("\n"))) {
                stack.add(str.replaceFirst("\\([a-zA-Z0-9:.\\s]*\\)", ""));
            }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/RetryStrategyConfiguration.java`
#### Snippet
```java
        final String strategy = conf.getProperty(DEFAULT_STRATEGY, SIMPLE_RETRY_STRATEGY);

        switch (strategy) {
            case SIMPLE_RETRY_STRATEGY:
                return new SimpleRetryStrategy(new SimpleRetryStrategyConfiguration(conf));
```

## RuleId[id=FinallyBlockCannotCompleteNormally]
### FinallyBlockCannotCompleteNormally
`finally` block can not complete normally
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
            isSuccess.set(false);
            new JobRuntimeException("Failed to lock all keys at once", e);
        } finally {
            if (!isSuccess.get()) {
                log.info("Failed to lock all keys at once, will release them.");
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
        if (!allFieldsToConvert.containsAll(requiredFields)) {
            final List<String> missingFields = requiredFields.
                    stream()
                    .filter(rf -> allFieldsToConvert.contains(this.requiredFields))
                    .collect(Collectors.toList());
            final Joiner joiner = Joiner.on(",");
            if (this.dataFeedMetrics.isPresent()) {
                this.dataFeedMetrics.get().createLongFailureMetric(DataFeedMetricNames.MARMARAY_JOB_ERROR, 1,
                        DataFeedMetricNames.getErrorModuleCauseTags(
                                ModuleTagNames.SINK_CONVERTER, ErrorCauseTagNames.MISSING_FIELD));
            }
            final String errMsg = String.format("Listed required fields are missing from the list of fields to convert."
                    + " Please check your job configuration.  Missing fields are: %s", joiner.join(missingFields));
            throw new JobRuntimeException(errMsg);
        }
```

### DuplicatedCode
Duplicated code
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraClientSink.java`
#### Snippet
```java
if (payloadWrapper.getCount() == 0) {
            /*
             * As a safeguard and precaution, we fail the job if no records are dispersed.  The root cause can be
             * something innocuous like an accidental empty dataset.  But this is to explicitly protect us against
             * any data converter bugs that can take valid data and not convert it correctly resulting in an
             * incorrect error record.
             *
             * For dispersal this is ok since we assume the data that existed in Hive has been ingested and conforms
             * to a schema.  The main trade-off here is if there really is an empty dataset we cannot proceed until
             * the customer has deleted that Hive partition.  We believe that is much more preferable than a silent
             * failure and thinking the dispersal job has succeeded when no data has actually been dispersed and
             * checkpoints have been persisted to indicate the partition was successfully dispersed.
             */
            if (this.tableMetrics.isPresent()) {
                this.tableMetrics.get()
                        .createLongFailureMetric(DataFeedMetricNames.MARMARAY_JOB_ERROR, 1, DataFeedMetricNames
                                .getErrorModuleCauseTags(ModuleTagNames.SINK, ErrorCauseTagNames.NO_DATA));
            }
            final String errMsg = String.join(""
                    , "No data was found to disperse.  As a safeguard, we are failing "
                    , "the job explicitly. Please check your data and ensure records are valid and "
                    , "partition and clustering keys are populated.  If your partition has empty data you will have to "
                    , "delete it to proceed.  Otherwise, please contact your support team for troubleshoooting");
            throw new JobRuntimeException(errMsg);
        }
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaSourceConfiguration.java`
#### Snippet
```java
    public List<String> getMandatoryProperties() {
        final List<String> ret = new LinkedList<>();
        ret.addAll(super.getMandatoryProperties());
        ret.add(KAFKA_TOPIC_NAME);
        ret.add(KAFKA_CLUSTER_NAME);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
     */
    public String generateInsertStmt(@NotEmpty final String key, @NonNull final String value) {
        final String ttlStr = this.ttl.isPresent() ? "USING TTL " + this.ttl.get().toString() : StringTypes.EMPTY;

        return String.format("INSERT INTO %s.%s ( %s ) VALUES ( %s ) %s",
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                .filter(field -> missingCols.contains(field.getFieldName()))
                .map(field -> String.format("ALTER TABLE %s.%s ADD %s",
                        this.schema.getKeySpace(), this.schema.getTableName(), field.toString()))
                .collect(Collectors.toList());
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                .collect(Collectors.joining(","));

        final String ttlStr = this.ttl.isPresent() ? "USING TTL " + this.ttl.get().toString() : StringTypes.EMPTY;

        if (this.orderRequired) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
        } else {
            final String timestampStr = this.timestamp.isPresent()
                    ? ((this.ttl.isPresent() ? " AND " : " USING ") + "TIMESTAMP " + this.timestamp.get().toString())
                    : StringTypes.EMPTY;

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
            final FileSystem fs = FSUtils.getFs(conf, Optional.absent());
            final Path dataFeedConfFile = new Path(filePath);
            log.info("Loading configuration from {}", dataFeedConfFile.toString());
            conf.loadYamlStream(fs.open(dataFeedConfFile), Optional.absent());
        } catch (IOException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            String cassandraCols = String.format("job, time_stamp, checkpoint");
            String cassandraVals = String.format("'%s', '%s', '%s'",
                    this.job, currentTime.toString(), checkpoint);

            final String insertCmd = this.schemaManager.generateInsertStmt(cassandraCols, cassandraVals);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                    .collect(Collectors.toMap(r -> r.getString("column_name"), r ->  r.getString("type")));

            log.info("Found columns: {}", columns.toString());
            if (columns.isEmpty()) {
                final String createTable = this.schemaManager.generateCreateTableStmt();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            }
        } else {
            throw new JobRuntimeException(String.format("Attempting to finish illegal tier %s", tier.toString()));
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not boolean :" + name + " : type :" + value.getClass().getCanonicalName()
                        + ": value :" + value.toString());
            case DOUBLE:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not double :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case FLOAT:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not float :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case INT:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not int :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case LONG:
                if (value instanceof Number) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                throw new JobRuntimeException(
                    "data type is not long :" + name + " : type :" + value.getClass().getCanonicalName() + ": value :"
                        + value.toString());
            case STRING:
                return value.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
                final Schema elementSchema = nonOptionalSchema.getElementType();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                }
                throw new JobRuntimeException(String.format("Invalid symbol - symbol :{} , schema :{}",
                    value.toString(), nonOptionalSchema.toString()));
            case ARRAY:
                final Schema elementSchema = nonOptionalSchema.getElementType();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/utilities/KafkaUtil.java`
#### Snippet
```java
        if (!partitions.isEmpty()) {
            throw new JobRuntimeException(String.format("invalid partitions :{} : topic : {}",
                partitions.toString(), topicName));
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
            });
        log.info("number of partitions based on dates: {}", dates.size());
        log.info("dates: {}", dates.toString());

        // group messages based on grouped dates
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
                        final boolean result = isSameDate(day, msgDay);
                        log.debug("\t filtering day: {}, message day: {}, \t filter result: {}",
                                day.toInstant(), msgDay.toString(), result);
                        return result;
                    });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(contentBytes.length);
        log.info("Uploading from {} to S3 bucket {}/{}", path.toString()
                , this.awsConf.getBucketName(), this.awsConf.getObjectKey());
        try (final InputStream inputStream = fileSystem.open(path)) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'List'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
            final List<String> missingFields = requiredFields.
                    stream()
                    .filter(rf -> allFieldsToConvert.contains(this.requiredFields))
                    .collect(Collectors.toList());
            final Joiner joiner = Joiner.on(",");
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'List'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
            final List<String> missingFields = requiredFields.
                    stream()
                    .filter(rf -> allFieldsToConvert.contains(this.requiredFields))
                    .collect(Collectors.toList());
            final Joiner joiner = Joiner.on(",");
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CustomizedInterProcessMutex` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    }

    private final class CustomizedInterProcessMutex extends InterProcessMutex {

        private final byte[] lockInfo;
```

### InnerClassMayBeStatic
Inner class `HDFSSchemaServiceWriter` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java
        }
    }
    public final class HDFSSchemaServiceWriter implements ISchemaService.ISchemaServiceWriter, Serializable {
        private final String schemaString;
        private transient Schema schema;
```

### InnerClassMayBeStatic
Inner class `HDFSSchemaServiceReader` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/HDFSSchemaService.java`
#### Snippet
```java
    }

    public final class HDFSSchemaServiceReader implements ISchemaService.ISchemaServiceReader, Serializable {

        private final String schemaString;
```

### InnerClassMayBeStatic
Inner class `FileWorkUnitCalculatorResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileWorkUnitCalculator.java/FileWorkUnitCalculator.java`
#### Snippet
```java
    }

    public final class FileWorkUnitCalculatorResult implements IWorkUnitCalculator.IWorkUnitCalculatorResult<
        LocatedFileStatus, FileRunState> {

```

### InnerClassMayBeStatic
Inner class `SubDagExecutionStatus` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     */
    @Data
    class SubDagExecutionStatus {

        private final JobSubDag subDag;
```

### InnerClassMayBeStatic
Inner class `FieldInfo` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    }

    private class FieldInfo {
        final Schema.Type nonNullType;
        final boolean isTimestampField;
```

### InnerClassMayBeStatic
Inner class `HoodieWriteResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    @AllArgsConstructor
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
```

### InnerClassMayBeStatic
Inner class `KafkaWorkUnitCalculatorResult` may be 'static'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
     * It holds current set of work units and also {@link KafkaRunState} for the next run.
     */
    public final class KafkaWorkUnitCalculatorResult implements
        IWorkUnitCalculator.IWorkUnitCalculatorResult<OffsetRange, KafkaRunState> {

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
     */
    public SparkConf createSparkConf() {
        /**
         * By custom registering classes the full class name of each object
         * is not stored during serialization which reduces storage space.
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    @Override
    public ParquetWorkUnitCalculatorResult computeWorkUnits() {
        /**
         * The logic for computing work units is pretty straightforward here.
         *
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java

@Slf4j
/**
 * {@link MultiMetadataManager} implements the {@link IMetadataManager} interface.
 * It is a cassandra based metadata manager for HDFS files.
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
        }

        /** update all children metadata managers with recent checkpoints*/
        getMetadataMap().forEach((key, value) -> {
                this.metadataManagersList.forEach(metadataManager -> metadataManager.set(key, value));
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
            });

        /** save checkpoints in all children metadata managers*/
        log.info("Save changes in all metadata managers");
        this.metadataManagersList.forEach(metadataManager -> {
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @VisibleForTesting
    /**
     * This method assumes that the path points explicitly to a metadata file and is not a directory
     * @param path
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            final Session session = cluster.connect()) {

            /**
             * oldest checkpoint is present only if maxTimestampCount checkpoints
             * are already present for current job
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java

@Slf4j
/**
 * {@link CassandraBasedMetadataManager} implements the {@link IMetadataManager} interface.
 * It is a cassandra based metadata manager for HDFS files.
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java
                "No work to process for: " + hiveConf.getDataPath());

        /**
         * Current implementation of HiveSource assumes that only a single work unit exists which
         * corresponds to the single partition that is processed per job.
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
        Preconditions.checkState(workUnitCalc.hasWorkUnits(), "no work to do :" + this.conf.getTopicName());
        final List<OffsetRange> workUnits = workUnitCalc.getWorkUnits();
        /**
         * Since we are not opening more than one connection per "topic+partition"; so single spark partition may end up
         * reading data more than spark's 2G partition limit. In order to avoid this and also to take advantage of all
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    public void write(@NonNull final RDDWrapper<HoodieRecord<HoodieRecordPayload>> hoodieRecords) {
        /**
         * 1) create new commit -> getOrCreate()
         * 2) insert records -> bulkInsert() / insert() / upsert()
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Setter
    @NonNull
    /**
     * If set then it is used for sorting records during {@link HoodieWriteClientWrapper#bulkInsert(JavaRDD, String)}
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java

@Slf4j
/**
 * {@link KafkaSourceDataConverter} extends {@link SourceDataConverter}
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
            HOODIE_COMMON_PROPERTY_PREFIX + "compaction_small_file_size_limit";
    public static final long DEFAULT_HOODIE_COMPACTION_SMALL_FILE_SIZE_LIMIT = 80 * FileUtils.ONE_MB;
    /**
     * Hoodie Storage file size.
     */
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'com.uber.marmaray.common.sources.file' does not correspond to the file path 'com.uber.marmaray.common.sources.file.FileWorkUnitCalculator.java'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileWorkUnitCalculator.java/FileWorkUnitCalculator.java`
#### Snippet
```java
 */

package com.uber.marmaray.common.sources.file;

import com.uber.marmaray.common.configuration.FileSourceConfiguration;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `marmaray/src/main/java/com/uber/marmaray/utilities/GenericRecordUtil.java`
#### Snippet
```java
                return compareRecords((GenericRecord) field1, (GenericRecord) field2);
            case ENUM:
                if (!field1.toString().equals(field2.toString())) {
                    return false;
                }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'oldestTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
     */
    public String generateDeleteOldestCheckpoint(@NotEmpty final String key,
                                         @NotEmpty final Optional<String> oldestTimestamp) {
        return String.format("DELETE FROM %s.%s WHERE job='%s' and time_stamp='%s'",
                this.schema.getKeySpace(),
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraMetadataSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl) {
        super(schema, partitionKeys, clusteringKeys, ttl, Optional.absent(), Optional.absent(), false);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    private final String partitionKeyName;
    private final boolean hasPartitionKeyInHDFSPartitionPath;
    private final Optional<Date> startDate;

    public HDFSDatePartitionManager(@NotEmpty  final String metadataKey,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
                                    @NotEmpty final String genericBaseDataPath,
                                    @NotEmpty final String partitionKeyName,
                                    @NonNull final Optional<Date> startDate,
                                    @NonNull final FileSystem fileSystem) throws IOException {
        super(metadataKey, genericBaseDataPath, fileSystem);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sparkSessionOptional'
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
    @Getter
    private final SparkArgs sparkArgs;
    private Optional<SparkSession> sparkSessionOptional = Optional.absent();
    /**
     * Uses {@link SparkSession} returned from {@link SparkFactory#getSparkSession}
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    private final HoodieConfiguration hoodieConf;
    private final AtomicBoolean saveChanges;
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    private Optional<Map<String, String>> metadataMap = Optional.absent();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'client'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
    private final ConcurrentHashMap<String, CustomizedInterProcessMutex> lockMap;
    @NonNull
    private Optional<CuratorFramework> client;
    @NonNull
    private final LockManagerConfiguration lockConf;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> timestamp) {
        super(schema, partitionKeys, clusteringKeys, Optional.absent(), Optional.absent(), timestamp, false);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<String> partitionKeys,
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final List<ClusterKey> clusteringKeys,
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
                                      final boolean orderRequired) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSinkSchemaManager.java`
#### Snippet
```java
                                      @NonNull final Optional<Long> ttl,
                                      @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                      @NonNull final Optional<Long> timestamp,
                                      final boolean orderRequired) {
        super(schema, partitionKeys, clusteringKeys, ttl, dataFeedMetrics, timestamp, orderRequired);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'partition'
in `marmaray/src/main/java/com/uber/marmaray/utilities/CassandraSinkUtil.java`
#### Snippet
```java
    public static final TimeZone TIME_ZONE_UTC = TimeZone.getTimeZone("UTC");

    public static Optional<Long> computeTimestamp(final Optional<String> partition) {
        if (partition.isPresent()) {
            try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> writtenTime;

    public CassandraSinkConfiguration(@NonNull final Configuration conf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writeTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> writeTimestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filteredColumns'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/CassandraSinkConfiguration.java`
#### Snippet
```java
     */
    @Getter
    private final Optional<Set<String>> filteredColumns;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partition'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveRunState.java`
#### Snippet
```java
public class HiveRunState implements IRunState<HiveRunState> {
    @Getter
    private Optional<String> partition;
}

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partitionKeyName'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<String> partitionKeyName;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'partition'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<StringValue> partition;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public ParquetWorkUnitCalculator(@NonNull final HiveSourceConfiguration hiveConf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nextPartition'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<String> nextPartition = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkPoint'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/ParquetWorkUnitCalculator.java`
#### Snippet
```java
    }

    private boolean checkpointGreaterThanNextPartition(@NonNull final Optional<StringValue> checkPoint) {
        if (checkPoint.isPresent()
                && checkPoint.get().getValue().compareTo(this.nextPartition.get()) > 0) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java

    private final List<IMetadataManager<StringValue>> metadataManagersList;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    final List<String> partitionKeys;
    final List<ClusterKey> clusteringKeys;
    final Optional<Long> ttl;
    final Optional<Long> timestamp;
    final Boolean orderRequired;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java

    @Getter
    protected transient Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
    final List<ClusterKey> clusteringKeys;
    final Optional<Long> ttl;
    final Optional<Long> timestamp;
    final Boolean orderRequired;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'ttl'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final List<String> partitionKeys,
                                  @NonNull final List<ClusterKey> clusteringKeys,
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final List<ClusterKey> clusteringKeys,
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
                                  final boolean orderRequired) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
                                  @NonNull final Optional<Long> ttl,
                                  @NonNull final Optional<DataFeedMetrics> dataFeedMetrics,
                                  @NonNull final Optional<Long> timestamp,
                                  final boolean orderRequired) {
        this.schema = schema;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'startDate'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HiveSourceConfiguration.java`
#### Snippet
```java

    @Getter
    private final Optional<Date> startDate;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'timestamp'
in `marmaray/src/main/java/com/uber/marmaray/utilities/TimestampInfo.java`
#### Snippet
```java
public class TimestampInfo implements Serializable {
    @Getter
    final Optional<String> timestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
    private Optional<Schema> outputSchema = Optional.absent();
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public SparkSourceDataConverter(@NonNull final StructType inputSchema,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'outputSchema'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
    private final StructField[] fields;
    private final Set<String> requiredKeys;
    private Optional<Schema> outputSchema = Optional.absent();
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/file/FileSource.java`
#### Snippet
```java

    private final FileSourceConfiguration conf;
    private final Optional<JavaSparkContext> jsc;
    private final FileSourceDataConverter converter;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
    // customers running jobs against the same metadata directory.  We eventually want to take locks on
    // a directory (possivly via ZooKeeper) so only one job can operate at a time per job name.
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'oldestTimestamp'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();
    private int numTimestamps;
    private Optional<String> oldestTimestamp;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'metadataMap'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    protected final CassandraSchema schema;
    protected final CassandraMetadataSchemaManager schemaManager;
    private Optional<Map<String, StringValue>> metadataMap = Optional.absent();
    private int numTimestamps;
    private Optional<String> oldestTimestamp;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'latestCheckpoint'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
     */
    public Optional<String> getNextPartition(
            @NotEmpty final Optional<StringValue> latestCheckpoint) throws IOException {
        if (this.isSinglePartition) {
            log.info("Next partition: {}", this.rawDataRootPath);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'checkpoint'
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
    }

    private List<String> listPartitionsAfterCheckpoint(final Optional<StringValue> checkpoint) throws IOException {
        final List<String> partitions = getExistingPartitions();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'service'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
    public static final long NO_TIMEOUT = -1;
    // Singleton service.
    private static Optional<ThreadPoolService> service = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'startTime'
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/DataFeedMetrics.java`
#### Snippet
```java
    public TimerMetric createTimerMetric(@NonNull final String metricName,
                                         @NonNull final Map<String, String> additionalTags,
                                         @NonNull final Optional<Instant> startTime) {
        final TimerMetric metric = startTime.isPresent()
                ? new TimerMetric(metricName, additionalTags, startTime.get())
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'rpcPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> rpcPort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sslStoragePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> sslStoragePort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'nativeApplicationPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> nativeApplicationPort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'listOfNodes'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> listOfNodes;

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'storagePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<String> storagePort;

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sslStoragePart'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    private Optional<String> listOfNodes;

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'rpcPort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java

    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
        this.sslStoragePort = sslStoragePart;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'storagePort'
in `marmaray/src/main/java/com/uber/marmaray/utilities/cluster/CassandraClusterInfo.java`
#### Snippet
```java
    public CassandraClusterInfo(@NonNull final Optional<String> sslStoragePart,
                                @NonNull final Optional<String> rpcPort,
                                @NonNull final Optional<String> storagePort) {
        this.sslStoragePort = sslStoragePart;
        this.rpcPort = rpcPort;
```

### OptionalUsedAsFieldOrParameterType
`Optional`>> used as type for field 'groupRDD'
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkOperator.java`
#### Snippet
```java
    private final JavaRDD<DI> inputRDD;
    private final ForkFunction<DI> forkFunction;
    private Optional<JavaRDD<ForkData<DI>>> groupRDD = Optional.absent();
    @Getter
    private final StorageLevel persistLevel;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tableName'
in `marmaray/src/main/java/com/uber/marmaray/utilities/ErrorTableUtil.java`
#### Snippet
```java
    public static void writeErrorRecordsToErrorTable(@NonNull final SparkContext sc,
                                                     @NonNull final Configuration conf,
                                                     @NonNull final Optional<String> tableName,
                                                     @NonNull final RDDWrapper<ErrorData> errorData,
                                                     @NonNull final ErrorExtractor errorExtractor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
    public CassandraSchemaConverter(@NotEmpty final String keySpace,
                                    @NotEmpty final String tableName,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this(keySpace, tableName, TimestampInfo.generateEmptyTimestampInfo(), filteredFields);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
     * and not all the available fields from the source data.
     */
    final Optional<Set<String>> filteredFields;

    public CassandraSchemaConverter(@NotEmpty final String keySpace,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filteredFields'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java
                                    @NotEmpty final String tableName,
                                    @NonNull final TimestampInfo timestampInfo,
                                    @NonNull final Optional<Set<String>> filteredFields) {
        this.keySpace = keySpace;
        this.tableName = tableName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jobExecutionStrategy'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobManager.java`
#### Snippet
```java

    @Setter
    private Optional<IJobExecutionStrategy> jobExecutionStrategy = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'inputSchema'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     */
    private final List<String> requiredFields;
    private Optional<Schema> inputSchema = Optional.absent();
    private final TimestampInfo timestampInfo;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
    public CassandraSinkCQLDataConverter(@NonNull final Schema inputSchema,
                                         @NonNull final Configuration conf,
                                         @NonNull final Optional<Set<String>> fieldsToConvert,
                                         @NonNull final List<String> requiredFields,
                                         @NonNull final TimestampInfo timestampInfo,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;

    /*
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsSecretAccesskey'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> awsAccessKeyId;
    @Getter
    private final Optional<String> awsSecretAccesskey;
    @Getter
    private final String awsLocal;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sourcePartitionPath'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final String writeTimestamp;
    @Getter
    private final Optional<String> sourcePartitionPath;
    @Getter
    private final DispersalType dispersalType;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'objectKey'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> bucketName;
    @Getter
    private final Optional<String> objectKey;
    @Getter
    private final Optional<String> awsAccessKeyId;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'bucketName'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> awsRegion;
    @Getter
    private final Optional<String> bucketName;
    @Getter
    private final Optional<String> objectKey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsAccessKeyId'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    private final Optional<String> objectKey;
    @Getter
    private final Optional<String> awsAccessKeyId;
    @Getter
    private final Optional<String> awsSecretAccesskey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    private JsonNode handleScopeOverriding(
        @NonNull final Optional<String> scope, @NonNull final JsonNode jsonNode) {
        return new ConfigScopeResolver(SCOPE_OVERRIDE_MAPPING_KEY)
            .projectOverrideScopeOverDefault(scope, jsonNode);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'awsRegion'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/FileSinkConfiguration.java`
#### Snippet
```java
    //aws s3 properties
    @Getter
    private final Optional<String> awsRegion;
    @Getter
    private final Optional<String> bucketName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    private void loadYamlFile(@NonNull final File yamlFile,
        final Optional<String> scope) {
        try {
            final FileSystem localFs = FileSystem.getLocal(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public void loadYamlStream(@NonNull final InputStream yamlStream,
        @NonNull final Optional<String> scope) {
        try {
            final ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public Configuration(@NonNull final File yamlFile,
        @NonNull final Optional<String> scope) {
        loadYamlFile(yamlFile, scope);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java

    public Configuration(@NonNull final InputStream inputStream,
        @NonNull final Optional<String> scope) {
        loadYamlStream(inputStream, scope);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
    public static StructType generateSchemaFromParquet(@NonNull final FileSystem fs,
                                                       @NotEmpty final String parquetDir,
                                                       @NonNull final Optional<DataFeedMetrics> dataFeedMetrics)
            throws IOException {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'data'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * #childNodes}'s {@link #execute(Optional)} method.
     */
    public final void execute(@NonNull final Optional<IPayload> data) {
        Preconditions.checkState(this.dataFeedMetrics.isPresent() && this.jobMetrics.isPresent(),
            "Missing dataFeed or job metrics");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'data'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
     * @param data input payload
     */
    protected abstract void executeNode(@NonNull final Optional<IPayload> data);

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jobMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java

    @Getter
    private Optional<JobMetrics> jobMetrics = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/hive/HiveSource.java`
#### Snippet
```java

    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    public HiveSource(@NonNull final HiveSourceConfiguration hiveConf,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java

    public KafkaSource(@NonNull final KafkaSourceConfiguration conf,
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'startDateFilterFunction'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final Optional<JavaSparkContext> jsc,
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'filterRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
                       @NonNull final KafkaSourceDataConverter dataConverter,
                       @NonNull final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction,
                       @NonNull final Optional<VoidFunction<AvroPayload>> filterRecordHandler) {
        this.conf = conf;
        this.jsc = jsc;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'startDateFilterFunction'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceDataConverter dataConverter;
    @Getter
    private final Optional<Function<AvroPayload, Boolean>> startDateFilterFunction;
    @Setter
    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    public KafkaSource(@NonNull final KafkaSourceConfiguration conf,
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'filterRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    @Setter
    @NonNull
    private final Optional<VoidFunction<AvroPayload>> filterRecordHandler;
    @NonNull
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'jsc'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
    private final KafkaSourceConfiguration conf;
    @Getter
    private transient Optional<JavaSparkContext> jsc = Optional.absent();
    @Getter
    private final KafkaSourceDataConverter dataConverter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaSource.java`
#### Snippet
```java
     * report read size metrics per partition and total along with individual record stats like average size
     */
    private static void reportReadMetrics(@NonNull final Optional<DataFeedMetrics> topicMetrics,
                                          @NonNull final LongAccumulator totalDataReadInBytes,
                                          final long totalPartitions) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    private final Optional<String> writtenTime;
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'metrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     */
    private ByteBuffer getByteBuffer(@NonNull final Schema.Field field, @NonNull final Object rawData,
                                            @NonNull final Optional<DataFeedMetrics> metrics) {
        final ByteBuffer bb;
        final FieldInfo fieldInfo = fieldInfoMap.get().get(field);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    public CassandraSinkDataConverter(@NonNull final Schema inputSchema,
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
                                      @NonNull final Configuration conf,
                                      @NonNull final Optional<Set<String>> fieldsToConvert,
                                      @NonNull final Optional<String> writtenTime,
                                      @NonNull final List<String> requiredFields,
                                      @NonNull final TimestampInfo timestampInfo,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'inputSchemaAvro'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     */
    private Optional<Map<Schema.Field, FieldInfo>> fieldInfoMap = Optional.absent();
    private Optional<Schema> inputSchemaAvro = Optional.absent();

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldInfoMap'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * This map caches per field information to avoid recalculations on each row.
     */
    private Optional<Map<Schema.Field, FieldInfo>> fieldInfoMap = Optional.absent();
    private Optional<Schema> inputSchemaAvro = Optional.absent();

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'fieldsToConvert'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * from the schema.
     */
    private final Optional<Set<String>> fieldsToConvert;
    /*
     * The required fields that must be populated in the schema.  These keys form the primary/partition/clustering
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'writtenTime'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    private final TimestampInfo timestampInfo;
    private final CassandraSinkConfiguration cassandraConf;
    private final Optional<String> writtenTime;
    @Getter
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'failureRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    @NonNull
    @Setter
    protected Optional<VoidFunction<ID>> failureRecordHandler = Optional.absent();
    /**
     * If defined then {@link #successRecordHandler} will be invoked with output record if record conversion succeeds
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'recordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
        }

        private <T> void processRecordHandler(@NonNull final Optional<VoidFunction<T>> recordHandler,
                                              @NonNull final T data, @NotEmpty final String recordHandlerType) {
            if (recordHandler.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java

    @NonNull
    protected Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    public AbstractDataConverter(@NonNull final Configuration conf, @NonNull final ErrorExtractor errorExtractor) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'successRecordHandler'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    @NonNull
    @Setter
    protected Optional<VoidFunction<OD>> successRecordHandler = Optional.absent();

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
    protected final FileSinkConfiguration conf;
    protected final FileSinkDataConverter converter;
    protected Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
    protected int digitNum;

```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    }

    private void logWriteMetrics(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent() && this.dataFeedMetrics.isPresent()) {
            final LongAccumulator totalCount = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### OptionalUsedAsFieldOrParameterType
`java.util.Optional`> used as type for parameter 'extraMetadata'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

        public boolean commit(@NotEmpty final String commitTime, @NonNull final JavaRDD<WriteStatus> writeStatuses,
            final java.util.Optional<HashMap<String, String>> extraMetadata) {
            return this.hoodieWriteClient.commit(commitTime, writeStatuses, extraMetadata);
        }
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public void commit(@NonNull final HoodieWriteClientWrapper hoodieWriteClient,
                          @NotEmpty final String commitTime,
                          @NonNull final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        this.commit(hoodieWriteClient, commitTime, writesStatuses, this.shouldSaveChangesInFuture);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'dataFeedMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    private final transient JavaSparkContext jsc;
    private final HoodieSinkOp op;
    private Optional<DataFeedMetrics> dataFeedMetrics = Optional.absent();
    private final Map<String, String> dataFeedMetricsTags = new HashMap<>();
    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'writeStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public class HoodieWriteResult {
        @NonNull
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
                      @NonNull final IMetadataManager metadataMgr,
                      final boolean shouldSaveChangesInFuture,
                      @NonNull final Optional<String> defaultDataPartitioner) {
        this.hoodieConf = hoodieConf;
        this.hoodieSinkDataConverter = hoodieSinkDataConverter;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
                      @NonNull final HoodieSinkOp op,
                      @NonNull final IMetadataManager metadataMgr,
                      @NonNull final Optional<String> defaultDataPartitioner) {
      this(hoodieConf, hoodieSinkDataConverter, jsc, op, metadataMgr, false, defaultDataPartitioner);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'commitTime'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    @Getter
    // If set then it is used for creating new hoodie commit.
    private Optional<String> commitTime = Optional.absent();

    @Setter
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
    public void commit(@NonNull final HoodieWriteClientWrapper hoodieWriteClient,
                          @NotEmpty final String commitTime,
                          @NonNull final Optional<JavaRDD<WriteStatus>> writesStatuses,
                          final boolean shouldSaveChangesInFuture) {
        updateSinkStat(writesStatuses);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'writesStatuses'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * @param writesStatuses
     */
    private void updateSinkStat(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
        if (writesStatuses.isPresent()) {
            final LongAccumulator avgRecordSizeCounter = writesStatuses.get().rdd().sparkContext().longAccumulator();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'defaultDataPartitioner'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     */
    public static UserDefinedBulkInsertPartitioner getDataPartitioner(@NonNull final HoodieConfiguration hoodieConf,
        @NonNull final Optional<String> defaultDataPartitioner) {
        try {
            return (UserDefinedBulkInsertPartitioner) Class.forName(hoodieConf.getHoodieDataPartitioner(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'exception'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
        private final Optional<JavaRDD<WriteStatus>> writeStatuses;
        @NonNull
        private final Optional<Exception> exception;
    }
}
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'successData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    @NonNull
    @Getter
    protected Optional<ValidData<OD>> successData;

    @NonNull
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'errorData'
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    @NonNull
    @Getter
    protected Optional<ErrorData<ID>> errorData;

    /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'scope'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ConfigScopeResolver.java`
#### Snippet
```java

    public JsonNode projectOverrideScopeOverDefault(
        @NonNull final Optional<String> scope, @NonNull final JsonNode rootJsonNode) {
        if (!scope.isPresent() || !rootJsonNode.isContainerNode()) {
            log.info("No scope overriding in effect. "
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'path'
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
     */
    public static FileSystem getFs(@NonNull final Configuration conf,
                                   @NonNull final Optional<String> path) throws IOException {
        return getFs(new HadoopConfiguration(conf).getHadoopConf(), path);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'path'
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
     */
    public static FileSystem getFs(@NonNull final org.apache.hadoop.conf.Configuration hadoopConf,
                                   @NonNull final Optional<String> path) throws IOException {
        final FileSystem fs = path.isPresent() ? new Path(path.get()).getFileSystem(hadoopConf)
                                               : FileSystem.get(hadoopConf);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tableMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraSink.java`
#### Snippet
```java
    protected final CassandraSinkConfiguration conf;
    protected final CassandraSinkSchemaManager schemaManager;
    protected transient Optional<DataFeedMetrics> tableMetrics = Optional.absent();

    public CassandraSink(@NonNull final CassandraSinkSchemaManager schemaManager,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'chargebackCalculator'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    private Optional<IChargebackCalculator> chargebackCalculator = Optional.absent();

    @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'previousRunState'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java

    @Getter
    private Optional<KafkaRunState> previousRunState = Optional.absent();

    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'topicMetrics'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    private Optional<KafkaRunState> previousRunState = Optional.absent();

    private Optional<DataFeedMetrics> topicMetrics = Optional.absent();

    private Optional<IChargebackCalculator> chargebackCalculator = Optional.absent();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'kafkaOffsetResetter'
in `marmaray/src/main/java/com/uber/marmaray/common/sources/kafka/KafkaWorkUnitCalculator.java`
#### Snippet
```java
    @Getter
    @Setter
    private Optional<KafkaOffsetResetter> kafkaOffsetResetter = Optional.absent();

    @Getter
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java

    public HoodieConfiguration(@NonNull final Configuration conf, @NotEmpty final String tableKey,
            @NonNull final Optional<String> version) {
        this.conf = conf;
        this.tableKey = tableKey;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
    private final String tableKey;
    @Getter
    private final Optional<String> version;

    public HoodieConfiguration(@NonNull final Configuration conf, @NotEmpty final String tableKey,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'version'
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/HoodieConfiguration.java`
#### Snippet
```java
        private final Configuration conf;
        private final String tableKey;
        private Optional<String> version = Optional.absent();

        private Builder(@NonNull final Configuration conf, @NotEmpty final String tableKey) {
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/utilities/ByteBufferUtil.java`
#### Snippet
```java

    public static String convertToString(final ByteBuffer bb) {
        return new String(bb.array(), Charset.forName(StandardCharsets.UTF_8.toString()));
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/utilities/ByteBufferUtil.java`
#### Snippet
```java
    public static ByteBuffer wrap(final String value) {
        try {
            return ByteBuffer.wrap(value.getBytes(StandardCharsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            // should never see this
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
                log.debug("Line to calculate: {}", row);
                final byte[] utf8Bytes;
                utf8Bytes = row.getBytes("UTF-8");
                log.debug("Row Size: {}", utf8Bytes.length);
                //Add 1 byte size for end of line '/n' for each sample row
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkOperator.java`
#### Snippet
```java
            return getRDD(new FilterFunction<>(filterKey));
        } else {
            return (new JavaSparkContext(inputRDD.rdd().sparkContext())).emptyRDD();
        }
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param localDate` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    /**
     * Returns the partitions in sorted ascending order which are after the date value
     * @param localDate
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
     * Returns the partitions in sorted ascending order which are after the date value
     * @param localDate
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
     * @param localDate
     * @return
     * @throws IOException
     */
    private List<LocalDate> listSortedPartitionsAfterDate(final LocalDate localDate) throws IOException {
```

### JavadocDeclaration
Illegal character
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    /**
     * This method will also be used by HoodieSink to retrieve and store metadata information.
     * It returns {@link HashMap<String, String>} with hoodie metadata information to be saved into commit file.
     * It returns {@link HashMap} instead of {@link Map} because hoodie needs it that way. Checkout
     * {@link HoodieWriteClient#commit(String, JavaRDD, java.util.Optional)} for more info.
```

### JavadocDeclaration
Illegal character
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HoodieBasedMetadataManager.java`
#### Snippet
```java
    /**
     * This method will also be used by HoodieSink to retrieve and store metadata information.
     * It returns {@link HashMap<String, String>} with hoodie metadata information to be saved into commit file.
     * It returns {@link HashMap} instead of {@link Map} because hoodie needs it that way. Checkout
     * {@link HoodieWriteClient#commit(String, JavaRDD, java.util.Optional)} for more info.
```

### JavadocDeclaration
Javadoc pointing to itself
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieWriteStatus.java`
#### Snippet
```java

    /**
     * Overriding {@link #markSuccess(HoodieRecord, Optional)} to avoid caching
     * {@link com.uber.hoodie.common.model.HoodieKey} for successfully written hoodie records.
     */
```

### JavadocDeclaration
Wrong tag `ExceptionRecord`
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ExceptionRecord.java`
#### Snippet
```java

/**
 * Simple Java Bean used to construct {@link UtilTable} of {@ExceptionRecord}
 */
@Data
```

### JavadocDeclaration
`@param data` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
    /**
     * This API generates RDDPair for saving different file format(sequence, json,...)
     * @param data
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
     * This API generates RDDPair for saving different file format(sequence, json,...)
     * @param data
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param data` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
    /**
     * No Column Header for json format
     * @param data
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
     * No Column Header for json format
     * @param data
     * @return
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieUtil.java`
#### Snippet
```java
     * @param fs {@link FileSystem}
     * @param hoodieConf {@link HoodieConfiguration}
     * @throws IOException
     */
    public static void initHoodieDataset(@NonNull final FileSystem fs,
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
    /**
     * get operation from map
     * @param key
     * @return
     * @throws MetadataException
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * get operation from map
     * @param key
     * @return
     * @throws MetadataException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * @param key
     * @return
     * @throws MetadataException
     */
    @Override
```

### JavadocDeclaration
Tag `return` is not allowed here
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
    /**
     * Upon a successful job, this method keeps the latest checkpoint.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * Upon a successful job, this method keeps the latest checkpoint.
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method saveChanges
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * Upon a successful job, this method keeps the latest checkpoint.
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * set operation applies on generated temporarily
     * map from Cassandra queries
     * @param key
     * @param value
     * @throws MetadataException
```

### JavadocDeclaration
`@param value` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * map from Cassandra queries
     * @param key
     * @param value
     * @throws MetadataException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * @param key
     * @param value
     * @throws MetadataException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
    /**
     * remove operation on map
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/MultiMetadataManager.java`
#### Snippet
```java
     * remove operation on map
     * @param key
     * @return
     */
    @Override
```

### JavadocDeclaration
`@param existingColumns` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
     * in the existing columns we need to alter that table and update the schema
     *
     * @param existingColumns
     * @return List of strings, one for each column that needs to be added
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/CassandraSchemaManager.java`
#### Snippet
```java
     * We assume that field names are case insensitive so we handle that accordingly
     *
     * @throws IllegalStateException
     */
    private Boolean validateSchema() {
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
     * Generic entry point
     * @param args arguments for the job, from the command line
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java
     * Main execution method for the job.
     * @param args command line arguments
     * @throws IOException
     */
    private void run(final String[] args) throws IOException {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
     * copy the file to it's permanent location without the temp extension.
     *
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method saveChanges
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSMetadataManager.java`
#### Snippet
```java
     *
     * @return Map of Metadata keys to values
     * @throws IOException
     */
    public Map<String, StringValue> loadMetadata() throws IOException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * set operation applies on generated temporarily
     * map from Cassandra queries
     * @param key
     * @param value
     * @throws MetadataException
```

### JavadocDeclaration
`@param value` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * map from Cassandra queries
     * @param key
     * @param value
     * @throws MetadataException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * @param key
     * @param value
     * @throws MetadataException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    /**
     * get operation from map
     * @param key
     * @return
     * @throws MetadataException
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * get operation from map
     * @param key
     * @return
     * @throws MetadataException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * @param key
     * @return
     * @throws MetadataException
     */
    @Override
```

### JavadocDeclaration
Tag `return` is not allowed here
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * the job.
     *
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
IOException is not declared to be thrown by method saveChanges
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
    /**
     * remove operation on map
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
     * remove operation on map
     * @param key
     * @return
     */
    @Override
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
     * under the file path under the metadata key.  There's no need at this time to have
     * more directories but that is subject to change in the future based on evolving requirements.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
     * more directories but that is subject to change in the future based on evolving requirements.
     * @return
     * @throws IOException
     */
    public Optional<String> getNextPartition(
```

### JavadocDeclaration
`@param metadataManager` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sources/IWorkUnitCalculator.java`
#### Snippet
```java
    /**
     * Initializes previous run state using the state stored in {@link IMetadataManager}
     * @param metadataManager
     */
    void initPreviousRunState(IMetadataManager<V> metadataManager);
```

### JavadocDeclaration
`@param metadataManager` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sources/IWorkUnitCalculator.java`
#### Snippet
```java
    /**
     * Saves next run state in {@link IMetadataManager}
     * @param metadataManager
     * @param nextRunState
     */
```

### JavadocDeclaration
`@param nextRunState` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sources/IWorkUnitCalculator.java`
#### Snippet
```java
     * Saves next run state in {@link IMetadataManager}
     * @param metadataManager
     * @param nextRunState
     */
    void saveNextRunState(IMetadataManager<V> metadataManager, S nextRunState);
```

### JavadocDeclaration
Wrong tag `AbstractSchemaConverter`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/CassandraSchemaConverter.java`
#### Snippet
```java

/**
 * {@link CassandraSchemaConverter} extends {@AbstractSchemaConverter} and converts {@link CassandraSchema}
 * to {@link Schema} and vice versa
 *
```

### JavadocDeclaration
Wrong tag `AbstractSchemaConverter`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/schema/DataFrameSchemaConverter.java`
#### Snippet
```java

/**
 * {@link DataFrameSchemaConverter} extends {@AbstractSchemaConverter} and converts {@link StructType}
 * to {@link Schema}
 *
```

### JavadocDeclaration
`@param inputSchema` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
    /**
     * This constructor gives the option to only convert certain fields from the schema
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
```

### JavadocDeclaration
`@param conf` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * This constructor gives the option to only convert certain fields from the schema
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
```

### JavadocDeclaration
`@param fieldsToConvert` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
     */
```

### JavadocDeclaration
`@param requiredFields` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
     */
    public CassandraSinkCQLDataConverter(@NonNull final Schema inputSchema,
```

### JavadocDeclaration
`@param allFieldsToConvert` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     *
     * All required fields listed, however, must exist in the fields to convert
     * @param allFieldsToConvert
     * @param requiredFields
     */
```

### JavadocDeclaration
`@param requiredFields` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkCQLDataConverter.java`
#### Snippet
```java
     * All required fields listed, however, must exist in the fields to convert
     * @param allFieldsToConvert
     * @param requiredFields
     */
    private void validate(final Set<String> allFieldsToConvert, final List<String> requiredFields) {
```

### JavadocDeclaration
Wrong tag `ErrorRecord`
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/ErrorRecord.java`
#### Snippet
```java

/**
 * Simple Java Bean used to construct {@link UtilTable} of {@ErrorRecord}
 */
@Data
```

### JavadocDeclaration
`@param prefix` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    /**
     * Returns properties with or without prefix.
     * @param prefix
     * @param removePrefix if true it will remove prefix from properties.
     * @return {@link Map} with properties.
```

### JavadocDeclaration
Wrong tag `MetricRecord`
in `marmaray/src/main/java/com/uber/marmaray/common/dataset/MetricRecord.java`
#### Snippet
```java

/**
 * Simple Java Bean used to construct {@link UtilTable} of {@MetricRecord}
 */
@Data
```

### JavadocDeclaration
`@param data` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     * This method converts RDD of AvroPayload data to RDD of String with specified file type.
     * Currently supports csv file only.
     * @param data
     * @return
     * @throws UnsupportedOperationException
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     * Currently supports csv file only.
     * @param data
     * @return
     * @throws UnsupportedOperationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     * @param data
     * @return
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@param data` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
     * This methods get the column header of data.
     * It specifically works for file type: csv.
     * @param data
     * @return String of column header separated by separator.
     */
```

### JavadocDeclaration
`@param parquetDir` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
     * This method is useful because it does not require reading in all the data into memory to determine the schema
     * and only reads in the required metadata located in the footer
     * @param parquetDir
     * @return StructType equivalent of the parquet schema
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
     * @param parquetDir
     * @return StructType equivalent of the parquet schema
     * @throws IOException
     */
    public static StructType generateSchemaFromParquet(@NonNull final FileSystem fs,
```

### JavadocDeclaration
Javadoc pointing to itself
in `marmaray/src/main/java/com/uber/marmaray/common/job/JobSubDag.java`
#### Snippet
```java
    /**
     * Will execute current node's {@link #executeNode(Optional)} followed by parallel execution of {@link
     * #childNodes}'s {@link #execute(Optional)} method.
     */
    public final void execute(@NonNull final Optional<IPayload> data) {
```

### JavadocDeclaration
`@param inputSchema` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
    /**
     * This constructor gives the option to only convert certain fields from the schema
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
```

### JavadocDeclaration
`@param conf` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * This constructor gives the option to only convert certain fields from the schema
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
```

### JavadocDeclaration
`@param fieldsToConvert` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * @param inputSchema
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
     */
```

### JavadocDeclaration
`@param requiredFields` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * @param conf
     * @param fieldsToConvert
     * @param requiredFields
     */
    public CassandraSinkDataConverter(@NonNull final Schema inputSchema,
```

### JavadocDeclaration
`@param allFieldsToConvert` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     *
     * All required fields listed, however, must exist in the fields to convert
     * @param allFieldsToConvert
     * @param requiredFields
     */
```

### JavadocDeclaration
`@param requiredFields` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/CassandraSinkDataConverter.java`
#### Snippet
```java
     * All required fields listed, however, must exist in the fields to convert
     * @param allFieldsToConvert
     * @param requiredFields
     */
    private void validate(@NonNull final Set<String> allFieldsToConvert, @NonNull final List<String> requiredFields) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected Configuration conf;
    /**
     * If defined then {@link #failureRecordHandler} will be invoked with input record in case of any exception from
     * {@link #convert(Object)}.
     */
```

### JavadocDeclaration
Javadoc pointing to itself
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
    protected Optional<VoidFunction<ID>> failureRecordHandler = Optional.absent();
    /**
     * If defined then {@link #successRecordHandler} will be invoked with output record if record conversion succeeds
     * with no exceptions from {@link #convert(Object)}.
     */
```

### JavadocDeclaration
Illegal character
in `marmaray/src/main/java/com/uber/marmaray/utilities/MapUtil.java`
#### Snippet
```java
     * @param serializedMap Example format is k1{@link #KEY_VALUE_SEPARATOR}v1{@link #KEYS_SEPARATOR}k2{@link
     * #KEY_VALUE_SEPARATOR}v2.
     * @return deserialized {@link Map<String, String>}.
     */
    public static Map<String, String> deserializeMap(@NotEmpty final String serializedMap) {
```

### JavadocDeclaration
Illegal character
in `marmaray/src/main/java/com/uber/marmaray/utilities/MapUtil.java`
#### Snippet
```java
     * @param serializedMap Example format is k1{@link #KEY_VALUE_SEPARATOR}v1{@link #KEYS_SEPARATOR}k2{@link
     * #KEY_VALUE_SEPARATOR}v2.
     * @return deserialized {@link Map<String, String>}.
     */
    public static Map<String, String> deserializeMap(@NotEmpty final String serializedMap) {
```

### JavadocDeclaration
`@param additionalTags` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/Metric.java`
#### Snippet
```java
    /**
     * Additional tag values with existing keys will replace old ones
     * @param additionalTags
     * @return
     */
```

### JavadocDeclaration
Tag `return` is not allowed here
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/Metric.java`
#### Snippet
```java
     * Additional tag values with existing keys will replace old ones
     * @param additionalTags
     * @return
     */
    public void addTags(@NonNull final Map<String, String> additionalTags) {
```

### JavadocDeclaration
`@param numRecords` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * {@link HoodieConfiguration#HOODIE_TARGET_FILE_SIZE} and {@link SinkStatManager#getAvgRecordSize()} to figure
     * out what should be the optimal insert parallelism.
     * @param numRecords
     */
    public boolean updateInsertParallelism(final long numRecords) {
```

### JavadocDeclaration
`@param numRecords` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * {@link HoodieConfiguration#HOODIE_TARGET_FILE_SIZE} and {@link SinkStatManager#getAvgRecordSize()} to figure
     * out what should be the optimal bulk insert parallelism.
     * @param numRecords
     */
    public boolean updateBulkInsertParallelism(final long numRecords) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java

    /**
     * {@link #updateSinkStat(Optional)} will compute {@link SinkStat} and persist changes into {@link IMetadataManager}.
     * As a part of {@link SinkStat} computation; it will compute avg record size for current run.
     * @param writesStatuses
```

### JavadocDeclaration
`@param writesStatuses` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/hoodie/HoodieSink.java`
#### Snippet
```java
     * {@link #updateSinkStat(Optional)} will compute {@link SinkStat} and persist changes into {@link IMetadataManager}.
     * As a part of {@link SinkStat} computation; it will compute avg record size for current run.
     * @param writesStatuses
     */
    private void updateSinkStat(final Optional<JavaRDD<WriteStatus>> writesStatuses) {
```

### JavadocDeclaration
`@param successData` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/converters/converterresult/ConverterResult.java`
#### Snippet
```java
    /**
     * Constructor for case that OD is schema conforming
     * @param successData
     */
    public ConverterResult(@NonNull final OD successData) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
     * @return  {@link ForkData} with set of fork keys which should be associated with the record.
     * @param record element from {@link ForkOperator#inputRDD}.
     * @throws Exception
     */
    protected abstract List<ForkData<DI>> process(final DI record);
```

### JavadocDeclaration
Exception is not declared to be thrown by method process
in `marmaray/src/main/java/com/uber/marmaray/common/forkoperator/ForkFunction.java`
#### Snippet
```java
     * @return  {@link ForkData} with set of fork keys which should be associated with the record.
     * @param record element from {@link ForkOperator#inputRDD}.
     * @throws Exception
     */
    protected abstract List<ForkData<DI>> process(final DI record);
```

### JavadocDeclaration
Wrong tag `Link`
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/KafkaSourceDataConverter.java`
#### Snippet
```java
    private final List<String> fieldsToCache;
    /**
     *  List of {@Link Function<GenericRecord, GenericRecord>} to apply to the record between reading from kafka and
     *  transferring to the ISource
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
    /***
     * Returns the metadata for the given DAG
     * @param key
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     * Returns the metadata for the given DAG
     * @param key
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     * @param key
     * @return
     * @throws IOException
     */
    public Optional<Map<String, String>> get(@NotEmpty final String key) throws IOException {
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
    /**
     * Set the metadata for this DAG, if not empty
     * @param key
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     * Set the metadata for this DAG, if not empty
     * @param key
     * @param value
     */
    public void set(@NotEmpty final String key, @NonNull final Map<String, String> value) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
    /***
     * Checks if metadata for a given DAG already exists
     * @param key
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/JobManagerMetadataTracker.java`
#### Snippet
```java
     * Checks if metadata for a given DAG already exists
     * @param key
     * @return
     */
    public boolean contains(@NotEmpty final String key) {
```

### JavadocDeclaration
`@param hadoopConf` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/cassandra/CassandraSink.java`
#### Snippet
```java
     * This method prepares the Cassandra table for the bulk load
     *
     * @param hadoopConf
     */
    void setupCassandraTable(@NonNull final Configuration hadoopConf) {
```

### JavadocDeclaration
`@param data` tag description is missing
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/AwsFileSink.java`
#### Snippet
```java
     * This API uses Heatpipe timestamp and split original RDD to multiple RDD
     * based on the message dates
     * @param data
     * @return map of date to RDD
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `payloadInterval` may be 'final'
in `marmaray/src/main/java/com/uber/marmaray/common/AvroPayload.java`
#### Snippet
```java

    @NonNull
    private IAvroPayloadInternal payloadInterval;

    public AvroPayload(@NonNull final GenericRecord record) {
```

### FieldMayBeFinal
Field `serializerInstance` may be 'final'
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
    public static final ClassTag<Object> OBJECT_CLASS_TAG = ClassManifestFactory.fromClass(Object.class);

    private static ThreadLocal<SerializerInstance> serializerInstance = new ThreadLocal<>();

    private SparkUtil() {
```

### FieldMayBeFinal
Field `wrappedFutureWaitQ` may be 'final'
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        private final Callable wrappedCallable;
        private Future wrappedFuture = null;
        private LinkedBlockingQueue<Future> wrappedFutureWaitQ = new LinkedBlockingQueue<>();
        private final long timeout;
        private final TimeUnit timeUnit;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `marmaray/src/main/java/com/uber/marmaray/utilities/LongAccumulator.java`
#### Snippet
```java
    private Long count;
    @Getter
    private String name;

    public LongAccumulator(@NonNull final String name) {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `marmaray/src/main/java/com/uber/marmaray/utilities/CommandLineUtil.java`
#### Snippet
```java
        try {
            cmd = parser.parse(options, args);
        } catch (final ParseException e) {
            throw e;
        }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/SparkSourceDataConverter.java`
#### Snippet
```java
            } catch (final IllegalArgumentException e) {
                // the fieldname did not exist in the row which is ok, skip it
                continue;
            }
        }
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `service`
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
                        TimeUnit.SECONDS);
        threadPoolServiceCallable.setFuture(future);
        synchronized (service) {
            if (tier.equals(ThreadPoolServiceTier.JOB_DAG_TIER)) {
                if (service.canScheduleJobDag()) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `data` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/HoodieSinkErrorExtractor.java`
#### Snippet
```java
        try {
            HoodieRecord<HoodieRecordPayload> payload = (HoodieRecord) errorData.getRawData().getData();
            String data = String.format("%s. %s", payload.getKey().toString(),
                String.format("HoodieRecordPayload %s", payload.getData().toString()));
            return data;
```

### UnnecessaryLocalVariable
Local variable `hasPartitionKey` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
    private boolean hasPartitionKeyNameInPartition()  {
        try {
            final boolean hasPartitionKey = getExistingPartitions()
                    .stream()
                    .anyMatch(partition -> partition.startsWith(this.partitionKeyName));
```

### UnnecessaryLocalVariable
Local variable `partitions` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSDatePartitionManager.java`
#### Snippet
```java
        final LocalDate startDate = localDate.plusDays(1);

        final List<LocalDate> partitions = getExistingPartitions()
                .stream()
                .map(dt -> DateUtil.convertToUTCDate(dt.replace(this.partitionKeyName, StringTypes.EMPTY)))
```

### UnnecessaryLocalVariable
Local variable `cleaned` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private String cleanZkBasePath(@NotEmpty final String orig) {
        final String cleaned = orig.replaceAll("//*", "/").replaceAll("^/", "").replaceAll("/$", "");
        return cleaned;
    }
```

### UnnecessaryLocalVariable
Local variable `lines` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataJSONConverter.java`
#### Snippet
```java
            }
        }
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = convert(row).get(0).getSuccessData().get().getData();
                final String rowKey = this.row_identifier.isEmpty() ? key
```

### UnnecessaryLocalVariable
Local variable `serializedData` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/SparkUtil.java`
#### Snippet
```java
            return null;
        }
        final byte[] serializedData = getSerializerInstance().serialize(record, classTag).array();
        return serializedData;
    }
```

### UnnecessaryLocalVariable
Local variable `checkpoints` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
            metadata.put(entry.getKey(), entry.getValue().getValue());
        }
        String checkpoints = MapUtil.serializeMap(metadata);
        return checkpoints;
    }
```

### UnnecessaryLocalVariable
Local variable `partitions` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/HDFSPartitionManager.java`
#### Snippet
```java
        log.info("Searching for partitions in path: {}", partitionFolderRegex);
        final FileStatus[] fileStatuses  = this.fileSystem.globStatus(new Path(partitionFolderRegex));
        final List<String> partitions = Arrays.asList(fileStatuses).stream()
                .map(fileStatus -> fileStatus.getPath().getName())
                // filter out hidden files/directories
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
        public Object call() throws Exception {
            try {
                final Object result = this.wrappedCallable.call();
                return result;
            } finally {
```

### UnnecessaryLocalVariable
Local variable `totalSize` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/metrics/CassandraPayloadRDDSizeEstimator.java`
#### Snippet
```java
                .orElse(0);

        final long totalSize = (long) (byteSize * (((totalRows) * 1.0) / (NO_OF_SAMPLE_ROWS)));

        return totalSize;
```

### UnnecessaryLocalVariable
Local variable `lines` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/FileSinkDataCSVConverter.java`
#### Snippet
```java
        }
        final String rowKey = data.first().getData().getSchema().getName();
        final JavaPairRDD<String, String> lines = data.mapToPair(row -> {
                final String line = this.convert(row).get(0).getSuccessData().get().getData();
                log.debug("Line: {}", line);
```

### UnnecessaryLocalVariable
Local variable `jobName` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/listener/SparkJobTracker.java`
#### Snippet
```java

    private static String getJobName(final int stageId) {
        final String jobName = stageIdNameMap.getOrDefault(stageId, UNKNOWN_JOB_NAME);
        return jobName;
    }
```

### UnnecessaryLocalVariable
Local variable `structType` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/SchemaUtil.java`
#### Snippet
```java
        final MessageType messageType = metadata.getFileMetaData().getSchema();
        final ParquetSchemaConverter converter = new ParquetSchemaConverter(new SQLConf());
        final StructType structType = converter.convert(messageType);
        return structType;
    }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `marmaray/src/main/java/com/uber/marmaray/common/sinks/file/FileSink.java`
#### Snippet
```java
     */
    protected JavaRDD<String> addColumnHeader(@NonNull final String header, @NonNull final JavaRDD<String> data) {
        final JavaRDD<String> result = data.mapPartitions((lines) -> {
                final List<String> partitionList = IteratorUtils.toList(lines);
                partitionList.add(0, header);
```

### UnnecessaryLocalVariable
Local variable `fs` is redundant
in `marmaray/src/main/java/com/uber/marmaray/utilities/FSUtils.java`
#### Snippet
```java
    public static FileSystem getFs(@NonNull final org.apache.hadoop.conf.Configuration hadoopConf,
                                   @NonNull final Optional<String> path) throws IOException {
        final FileSystem fs = path.isPresent() ? new Path(path.get()).getFileSystem(hadoopConf)
                                               : FileSystem.get(hadoopConf);
        return fs;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `marmaray/src/main/java/com/uber/marmaray/common/job/ThreadPoolService.java`
#### Snippet
```java
            log.info("waiting for tasks to clear out of queue.");
            try {
                Thread.sleep(AWAIT_TERMINATION_CHECK_INTERVAL_MS);
                terminationChecks += 1;
            } catch (InterruptedException e) {
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Runtime exception instance `new JobRuntimeException()` is not thrown
in `marmaray/src/main/java/com/uber/marmaray/utilities/LockManager.java`
#### Snippet
```java
        } catch (Exception e) {
            isSuccess.set(false);
            new JobRuntimeException("Failed to lock all keys at once", e);
        } finally {
            if (!isSuccess.get()) {
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/spark/SparkFactory.java`
#### Snippet
```java
     */
    protected List<SparkListener> getSparkEventListeners() {
        return Arrays.asList(new SparkEventListener());
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/LockManagerConfiguration.java`
#### Snippet
```java

    private static List<String> getMandatoryProperties() {
        return Collections.unmodifiableList(Arrays.asList(ZK_BASE_PATH));
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/examples/job/ParquetToCassandraJob.java`
#### Snippet
```java

        final SparkArgs sparkArgs = new SparkArgs(
            Arrays.asList(outputSchema),
            SparkUtil.getSerializationClasses(),
            conf);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
        this.schemaManager = new CassandraMetadataSchemaManager(
                this.schema,
                Arrays.asList("job"),
                Arrays.asList(new ClusterKey("time_stamp", ClusterKey.Order.DESC)),
                Optional.absent());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/metadata/CassandraBasedMetadataManager.java`
#### Snippet
```java
                this.schema,
                Arrays.asList("job"),
                Arrays.asList(new ClusterKey("time_stamp", ClusterKey.Order.DESC)),
                Optional.absent());
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/ErrorTableConfiguration.java`
#### Snippet
```java

    public static List<String> getMandatoryProperties() {
        return Arrays.asList(DESTINATION_PATH);
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/KafkaConfiguration.java`
#### Snippet
```java

    public List<String> getMandatoryProperties() {
        return Arrays.asList(KAFKA_BROKER_LIST);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
                                t.getErrorData().get().getRawData().getData(), FAILURE);

                        forkData.add(new ForkData<>(Arrays.asList(ERROR_RECORD), t.getErrorData().get()));
                    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `marmaray/src/main/java/com/uber/marmaray/common/converters/data/AbstractDataConverter.java`
#### Snippet
```java
                        processRecordHandler(AbstractDataConverter.this.successRecordHandler,
                                t.getSuccessData().get().getData(), SUCCESS);
                        forkData.add(new ForkData<>(Arrays.asList(VALID_RECORD), t.getSuccessData().get()));
                    }
                });
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`this.sum / this.count`: integer division in floating-point context
in `marmaray/src/main/java/com/uber/marmaray/utilities/LongAccumulator.java`
#### Snippet
```java

    public double getAvg() {
        return this.sum / this.count;
    }

```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `marmaray/src/main/java/com/uber/marmaray/common/configuration/Configuration.java`
#### Snippet
```java
    public Properties getProperties() {
        final Properties properties = new Properties();
        this.props.forEach((k, v) -> properties.put(k, v));
        return properties;
    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'splitToList(java.lang.CharSequence)' is marked unstable with @Beta
in `marmaray/src/main/java/com/uber/marmaray/common/schema/cassandra/ClusterKey.java`
#### Snippet
```java
     */
    public static ClusterKey parse(@NotEmpty final String value) {
        final List<String> tokens = splitter.splitToList(value);
        Preconditions.checkState(tokens.size() <= 2);

```

