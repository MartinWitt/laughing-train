# flink-ml 
 
# Bad smells
I found 571 bad smells with 107 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 89 | false |
| UtilityClassWithoutPrivateConstructor | 79 | true |
| BoundedWildcard | 73 | false |
| SystemOutErr | 63 | false |
| NonSerializableFieldInSerializableClass | 42 | false |
| AssignmentToMethodParameter | 23 | false |
| ZeroLengthArrayInitialization | 21 | false |
| NullableProblems | 17 | false |
| RedundantSuppression | 16 | false |
| SizeReplaceableByIsEmpty | 14 | true |
| RedundantFieldInitialization | 13 | false |
| ReturnNull | 13 | false |
| MissortedModifiers | 12 | false |
| Convert2Lambda | 11 | false |
| UnnecessaryFullyQualifiedName | 8 | false |
| OptionalGetWithoutIsPresent | 8 | false |
| NonProtectedConstructorInAbstractClass | 7 | true |
| KeySetIterationMayUseEntrySet | 6 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| RedundantImplements | 5 | false |
| NestedAssignment | 4 | false |
| RefusedBequest | 3 | false |
| MismatchedJavadocCode | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| UnnecessarySemicolon | 2 | false |
| TrivialStringConcatenation | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| CodeBlock2Expr | 2 | true |
| HtmlWrongAttributeValue | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| DoubleBraceInitialization | 2 | false |
| ConstantValue | 2 | false |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| IOResource | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| RedundantMethodOverride | 1 | false |
| RedundantStreamOptionalCall | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| SlowListContainsAll | 1 | false |
| UnnecessaryContinue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
| BusyWait | 1 | false |
| NumericOverflow | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (iterationRecord.getValue().getType()) { case RECORD: headOperato...` statement on enum type 'org.apache.flink.iteration.IterationRecord.Type' misses case 'BARRIER'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/headprocessor/RegularHeadOperatorRecordProcessor.java`
#### Snippet
```java
(StreamRecord<IterationRecord<?>> iterationRecord) {
        switch (iterationRecord.getValue().getType()) {
            case RECORD:
                headOperatorContext.output(iterationRecord);
                break;
            case EPOCH_WATERMARK:
                LOG.info("Head Received epoch watermark {}", iterationRecord.getValue().getEpoch());

                boolean needNotifyCoordinator = false;
                if (iterationRecord.getValue().getEpoch() == 0) {
                    if (latestRoundAligned <= 0) {
                        needNotifyCoordinator = true;
                    }
                } else {
                    checkState(
                            iterationRecord.getValue().getEpoch() > latestRoundAligned,
                            String.format(
                                    "Unexpected epoch watermark: latest = %d, this one = %d",
                                    latestRoundAligned, iterationRecord.getValue().getEpoch()));
                    headOperatorContext.updateEpochToCoordinator(
                            iterationRecord.getValue().getEpoch(),
                            numFeedbackRecordsPerEpoch.getOrDefault(
                                    iterationRecord.getValue().getEpoch(), 0L));
                }

                if (needNotifyCoordinator) {
                    headOperatorContext.updateEpochToCoordinator(
                            iterationRecord.getValue().getEpoch(),
                            numFeedbackRecordsPerEpoch.getOrDefault(
                                    iterationRecord.getValue().getEpoch(), 0L));
                }

                latestRoundAligned =
                        Math.max(iterationRecord.getValue().getEpoch(), latestRoundAligned);
                break;
        }
    }
}
```

## RuleId[id=IOResource]
### IOResource
'Output' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModelData.java`
#### Snippet
```java
        @Override
        public void encode(Tuple2<Integer, Integer> modelData, OutputStream outputStream) {
            Output output = new Output(outputStream);
            output.writeInt(modelData.f0);
            output.writeInt(modelData.f1);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Bits` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/Bits.java`
#### Snippet
```java
 * byte ordering. Referenced from java.io.Bits.
 */
public class Bits {

    /*
```

### UtilityClassWithoutPrivateConstructor
Class `ParamValidators` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/ParamValidators.java`
#### Snippet
```java

/** Factory methods for common validation functions on numerical values. */
public class ParamValidators {

    // Always return true.
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/FileUtils.java`
#### Snippet
```java

/** Utility methods for file operations. */
public class FileUtils {

    /** Saves a given string to the specified file. */
```

### UtilityClassWithoutPrivateConstructor
Class `JsonUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/JsonUtils.java`
#### Snippet
```java
 * runtime.
 */
public class JsonUtils {
    public static final ObjectMapper OBJECT_MAPPER =
            new ObjectMapper().enable(JsonParser.Feature.ALLOW_COMMENTS);
```

### UtilityClassWithoutPrivateConstructor
Class `MLMetrics` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/common/metrics/MLMetrics.java`
#### Snippet
```java
 */
@Experimental
public class MLMetrics {
    public static final String ML_GROUP = "ml";
    public static final String ML_MODEL_GROUP = "model";
```

### UtilityClassWithoutPrivateConstructor
Class `ServableReadWriteUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ServableReadWriteUtils.java`
#### Snippet
```java

/** Utility methods for loading Servables. */
public class ServableReadWriteUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Vectors` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/Vectors.java`
#### Snippet
```java
/** Utility methods for instantiating Vector. */
@PublicEvolving
public class Vectors {

    /** Creates a dense vector from its values. */
```

### UtilityClassWithoutPrivateConstructor
Class `ParamUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ParamUtils.java`
#### Snippet
```java

/** Utility methods for reading and writing stages. */
public class ParamUtils {
    /**
     * Updates the paramMap with default values of all public final Param-typed fields of the given
```

### UtilityClassWithoutPrivateConstructor
Class `DataTypes` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/servable/types/DataTypes.java`
#### Snippet
```java

/** This class gives access to the most common types that are used to define DataFrames. */
public class DataTypes {

    public static final ScalarType BOOLEAN = new ScalarType(BasicType.BOOLEAN);
```

### UtilityClassWithoutPrivateConstructor
Class `BLAS` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/BLAS.java`
#### Snippet
```java

/** A utility class that provides BLAS routines over matrices and vectors. */
public class BLAS {
    /** For level-1 function dspmv, use javaBLAS for better performance. */
    private static final dev.ludovic.netlib.BLAS JAVA_BLAS =
```

### UtilityClassWithoutPrivateConstructor
Class `BroadcastContext` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastContext.java`
#### Snippet
```java
 * broadcast variables.
 */
public class BroadcastContext {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `BroadcastUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java

/** Utility class to support withBroadcast in DataStream. */
public class BroadcastUtils {
    /**
     * Supports withBroadcastStream in DataStream API. Broadcast data streams are available at all
```

### UtilityClassWithoutPrivateConstructor
Class `ReadWriteUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/util/ReadWriteUtils.java`
#### Snippet
```java

/** Utility methods for reading and writing stages. */
public class ReadWriteUtils {
    public static final ObjectMapper OBJECT_MAPPER =
            new ObjectMapper().enable(JsonParser.Feature.ALLOW_COMMENTS);
```

### UtilityClassWithoutPrivateConstructor
Class `AllReduceImpl` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/AllReduceImpl.java`
#### Snippet
```java
 */
@Internal
class AllReduceImpl {

    @VisibleForTesting static final int CHUNK_SIZE = 1024 * 4;
```

### UtilityClassWithoutPrivateConstructor
Class `TableUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/TableUtils.java`
#### Snippet
```java

/** Utility class for operations related to Table API. */
public class TableUtils {

    // Logical type roots that may cause wrong type conversion between Table and DataStream.
```

### UtilityClassWithoutPrivateConstructor
Class `VectorToArrayExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/VectorToArrayExample.java`
#### Snippet
```java

/** Simple program that converts a column of dense/sparse vectors into a column of double arrays. */
public class VectorToArrayExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `VectorSlicerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorSlicerExample.java`
#### Snippet
```java

/** Simple program that creates a VectorSlicer instance and uses it for feature engineering. */
public class VectorSlicerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `SQLTransformerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/SQLTransformerExample.java`
#### Snippet
```java

/** Simple program that creates a SQLTransformer instance and uses it for feature engineering. */
public class SQLTransformerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayToVectorExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/ArrayToVectorExample.java`
#### Snippet
```java

/** Simple program that converts a column of double arrays into a column of dense vectors. */
public class ArrayToVectorExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `IDFExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IDFExample.java`
#### Snippet
```java

/** Simple program that trains an IDF model and uses it for feature engineering. */
public class IDFExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `ChiSqTestExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/stats/ChiSqTestExample.java`
#### Snippet
```java

/** Simple program that creates a ChiSqTest instance and uses it for statistics. */
public class ChiSqTestExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `ImputerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ImputerExample.java`
#### Snippet
```java

/** Simple program that trains a {@link Imputer} model and uses it for feature engineering. */
public class ImputerExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `VarianceThresholdSelectorExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VarianceThresholdSelectorExample.java`
#### Snippet
```java
 * selection.
 */
public class VarianceThresholdSelectorExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `MinMaxScalerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinMaxScalerExample.java`
#### Snippet
```java

/** Simple program that trains a MinMaxScaler model and uses it for feature engineering. */
public class MinMaxScalerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `NGramExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/NGramExample.java`
#### Snippet
```java

/** Simple program that creates an NGram instance and uses it for feature engineering. */
public class NGramExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `HashingTFExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/HashingTFExample.java`
#### Snippet
```java

/** Simple program that creates a HashingTF instance and uses it for feature engineering. */
public class HashingTFExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `VectorIndexerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorIndexerExample.java`
#### Snippet
```java

/** Simple program that creates a VectorIndexer instance and uses it for feature engineering. */
public class VectorIndexerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `BinarizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BinarizerExample.java`
#### Snippet
```java

/** Simple program that creates a Binarizer instance and uses it for feature engineering. */
public class BinarizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `OnlineStandardScalerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/OnlineStandardScalerExample.java`
#### Snippet
```java

/** Simple program that trains a OnlineStandardScaler model and uses it for feature engineering. */
public class OnlineStandardScalerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `PolynomialExpansionExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/PolynomialExpansionExample.java`
#### Snippet
```java
 * Simple program that creates a PolynomialExpansion instance and uses it for feature engineering.
 */
public class PolynomialExpansionExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `NormalizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/NormalizerExample.java`
#### Snippet
```java

/** Simple program that creates a Normalizer instance and uses it for feature engineering. */
public class NormalizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `CountVectorizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/CountVectorizerExample.java`
#### Snippet
```java
 * Simple program that trains a {@link CountVectorizer} model and uses it for feature engineering.
 */
public class CountVectorizerExample {

    public static void main(String[] args) {
```

### UtilityClassWithoutPrivateConstructor
Class `StopWordsRemoverExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StopWordsRemoverExample.java`
#### Snippet
```java

/** Simple program that creates a StopWordsRemover instance and uses it for feature engineering. */
public class StopWordsRemoverExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `IndexToStringModelExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IndexToStringModelExample.java`
#### Snippet
```java
 * engineering.
 */
public class IndexToStringModelExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `RegexTokenizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RegexTokenizerExample.java`
#### Snippet
```java

/** Simple program that creates a RegexTokenizer instance and uses it for feature engineering. */
public class RegexTokenizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `TokenizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/TokenizerExample.java`
#### Snippet
```java

/** Simple program that creates a Tokenizer instance and uses it for feature engineering. */
public class TokenizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `InteractionExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/InteractionExample.java`
#### Snippet
```java

/** Simple program that creates an Interaction instance and uses it for feature engineering. */
public class InteractionExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `BucketizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BucketizerExample.java`
#### Snippet
```java

/** Simple program that creates a Bucketizer instance and uses it for feature engineering. */
public class BucketizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `FeatureHasherExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/FeatureHasherExample.java`
#### Snippet
```java

/** Simple program that creates a FeatureHasher instance and uses it for feature engineering. */
public class FeatureHasherExample {
    public static void main(String[] args) {

```

### UtilityClassWithoutPrivateConstructor
Class `StandardScalerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StandardScalerExample.java`
#### Snippet
```java

/** Simple program that trains a StandardScaler model and uses it for feature engineering. */
public class StandardScalerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `VectorAssemblerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorAssemblerExample.java`
#### Snippet
```java

/** Simple program that creates a VectorAssembler instance and uses it for feature engineering. */
public class VectorAssemblerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `MaxAbsScalerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MaxAbsScalerExample.java`
#### Snippet
```java

/** Simple program that trains a MaxAbsScaler model and uses it for feature engineering. */
public class MaxAbsScalerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `StringIndexerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StringIndexerExample.java`
#### Snippet
```java

/** Simple program that trains a StringIndexer model and uses it for feature engineering. */
public class StringIndexerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `DCTExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/DCTExample.java`
#### Snippet
```java

/** Simple program that creates a DCT instance and uses it for feature engineering. */
public class DCTExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `KBinsDiscretizerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/KBinsDiscretizerExample.java`
#### Snippet
```java

/** Simple program that trains a KBinsDiscretizer model and uses it for feature engineering. */
public class KBinsDiscretizerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `RobustScalerExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RobustScalerExample.java`
#### Snippet
```java

/** Simple program that trains a {@link RobustScaler} model and uses it for feature selection. */
public class RobustScalerExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `ElementwiseProductExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ElementwiseProductExample.java`
#### Snippet
```java
 * Simple program that creates a ElementwiseProduct instance and uses it for feature engineering.
 */
public class ElementwiseProductExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `UnivariateFeatureSelectorExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/UnivariateFeatureSelectorExample.java`
#### Snippet
```java
 * selection.
 */
public class UnivariateFeatureSelectorExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `MinHashLSHExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
 * similarity join.
 */
public class MinHashLSHExample {
    public static void main(String[] args) throws Exception {

```

### UtilityClassWithoutPrivateConstructor
Class `RandomSplitterExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RandomSplitterExample.java`
#### Snippet
```java

/** Simple program that creates a RandomSplitter instance and uses it for data splitting. */
public class RandomSplitterExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `LinearRegressionExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/regression/LinearRegressionExample.java`
#### Snippet
```java

/** Simple program that trains a LinearRegression model and uses it for regression. */
public class LinearRegressionExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `OneHotEncoderExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/OneHotEncoderExample.java`
#### Snippet
```java

/** Simple program that trains a OneHotEncoder model and uses it for feature engineering. */
public class OneHotEncoderExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `AgglomerativeClusteringExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/AgglomerativeClusteringExample.java`
#### Snippet
```java

/** Simple program that creates an AgglomerativeClustering instance and uses it for clustering. */
public class AgglomerativeClusteringExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `BinaryClassificationEvaluatorExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/evaluation/BinaryClassificationEvaluatorExample.java`
#### Snippet
```java
 * Simple program that creates a BinaryClassificationEvaluator instance and uses it for evaluation.
 */
public class BinaryClassificationEvaluatorExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `OnlineKMeansExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/OnlineKMeansExample.java`
#### Snippet
```java

/** Simple program that trains an OnlineKMeans model and uses it for clustering. */
public class OnlineKMeansExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `KMeansExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/KMeansExample.java`
#### Snippet
```java

/** Simple program that trains a KMeans model and uses it for clustering. */
public class KMeansExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `LinearSVCExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java

/** Simple program that trains a LinearSVC model and uses it for classification. */
public class LinearSVCExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `OnlineLogisticRegressionExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/OnlineLogisticRegressionExample.java`
#### Snippet
```java

/** Simple program that trains an OnlineLogisticRegression model and uses it for classification. */
public class OnlineLogisticRegressionExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `SwingExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/recommendation/SwingExample.java`
#### Snippet
```java
 * Simple program that creates a Swing instance and uses it to generate recommendations for items.
 */
public class SwingExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `LogisticRegressionExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LogisticRegressionExample.java`
#### Snippet
```java

/** Simple program that trains a LogisticRegression model and uses it for classification. */
public class LogisticRegressionExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `KnnExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/KnnExample.java`
#### Snippet
```java

/** Simple program that trains a Knn model and uses it for classification. */
public class KnnExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `NaiveBayesExample` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/NaiveBayesExample.java`
#### Snippet
```java

/** Simple program that trains a NaiveBayes model and uses it for classification. */
public class NaiveBayesExample {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
```

### UtilityClassWithoutPrivateConstructor
Class `Benchmark` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java

/** Entry class for benchmark execution. */
public class Benchmark {
    static final String VERSION_KEY = "version";

```

### UtilityClassWithoutPrivateConstructor
Class `BenchmarkUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java

/** Utility methods for benchmarks. */
public class BenchmarkUtils {
    /** Loads benchmark configuration maps from the provided json file. */
    @SuppressWarnings("unchecked")
```

### UtilityClassWithoutPrivateConstructor
Class `Functions` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/Functions.java`
#### Snippet
```java
/** Built-in table functions for data transformations. */
@SuppressWarnings("unused")
public class Functions {
    /** Converts a column of {@link Vector}s into a column of double arrays. */
    public static ApiExpression vectorToArray(Object... arguments) {
```

### UtilityClassWithoutPrivateConstructor
Class `VectorUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/VectorUtils.java`
#### Snippet
```java

/** Provides utility functions for {@link Vector}. */
public class VectorUtils {
    /**
     * Selects a subset of the vector base on the indices. Note that the input indices must be
```

### UtilityClassWithoutPrivateConstructor
Class `RegularizationUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/RegularizationUtils.java`
#### Snippet
```java
 */
@Internal
class RegularizationUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `OneHotEncoderModelData` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModelData.java`
#### Snippet
```java
 * to save/load model data.
 */
public class OneHotEncoderModelData {
    /**
     * Converts the table model to a data stream.
```

### UtilityClassWithoutPrivateConstructor
Class `StopWordsRemoverUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stopwordsremover/StopWordsRemoverUtils.java`
#### Snippet
```java

/** Utility methods used by {@link StopWordsRemover} and {@link StopWordsRemoverParams}. */
class StopWordsRemoverUtils {

    private static final Set<String> SUPPORTED_LANGUAGES =
```

### UtilityClassWithoutPrivateConstructor
Class `LogisticRegressionModelDataUtil` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/LogisticRegressionModelDataUtil.java`
#### Snippet
```java
 * classes to save/load model data.
 */
public class LogisticRegressionModelDataUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PythonBridgeUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-python/src/main/java/org/apache/flink/ml/python/PythonBridgeUtils.java`
#### Snippet
```java
// TODO: Remove this class after Flink ML depends on a Flink version with FLINK-30168 and
// FLINK-29477 fixed.
public class PythonBridgeUtils {
    public static Object getPickledBytesFromJavaObject(Object obj, TypeInformation<?> dataType)
            throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `IterationOptions` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/config/IterationOptions.java`
#### Snippet
```java

/** The options for the iteration. */
public class IterationOptions {

    public static final ConfigOption<String> DATA_CACHE_PATH =
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/utils/ReflectionUtils.java`
#### Snippet
```java

/** Utility class to provide some reflection tools. */
public class ReflectionUtils {

    public static Field getClassField(Class<?> declaredClass, String fieldName) {
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorStateUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/OperatorStateUtils.java`
#### Snippet
```java

/** Utility to deal with the states inside the operator. */
public class OperatorStateUtils {

    public static <T> Optional<T> getUniqueElement(ListState<T> listState, String stateName)
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java

/** Utility class for operators. */
public class OperatorUtils {

    /** Returns the unique id for the specified operator. */
```

### UtilityClassWithoutPrivateConstructor
Class `BroadcastOutputFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/BroadcastOutputFactory.java`
#### Snippet
```java

/** Factory that creates the corresponding {@link BroadcastOutput} from the {@link Output}. */
public class BroadcastOutputFactory {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Iterations` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
 */
@Experimental
public class Iterations {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `OperatorEpochWatermarkTrackerFactory` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/progresstrack/OperatorEpochWatermarkTrackerFactory.java`
#### Snippet
```java
 * create the corresponding progress tracker.
 */
public class OperatorEpochWatermarkTrackerFactory {

    public static OperatorEpochWatermarkTracker create(
```

### UtilityClassWithoutPrivateConstructor
Class `DataStreamUtils` has only 'static' members, and lacks a 'private' constructor
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
/** Provides utility functions for {@link DataStream}. */
@Internal
public class DataStreamUtils {
    /**
     * Applies allReduceSum on the input data stream. The input data stream is supposed to contain
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Variable is already assigned to this value
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/KeyAndValueSerializer.java`
#### Snippet
```java
        reuseRecord.replace(value, timestamp);
        reuse.f0 = bytes;
        reuse.f1 = reuseRecord;
        return reuse;
    }
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
Unboxing of `row.getField(imputer.getInputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ImputerExample.java`
#### Snippet
```java
            double[] outputValues = new double[imputer.getInputCols().length];
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (double) row.getField(imputer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(imputer.getOutputCols()[i]);
            }
```

### DataFlowIssue
Unboxing of `row.getField(imputer.getOutputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ImputerExample.java`
#### Snippet
```java
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (double) row.getField(imputer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(imputer.getOutputCols()[i]);
            }
            System.out.printf(
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/HashingTFExample.java`
#### Snippet
```java
            System.out.printf(
                    "Input Value: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValue.stream().toArray()), outputValue);
        }
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/CountVectorizerExample.java`
#### Snippet
```java
            System.out.printf(
                    "Input Value: %-15s \tOutput Value: %s\n",
                    Arrays.toString(inputValue), outputValue.toString());
        }
    }
```

### DataFlowIssue
Unboxing of `row.getField(indexToStringModel.getInputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IndexToStringModelExample.java`
#### Snippet
```java
            String[] outputValues = new String[indexToStringModel.getInputCols().length];
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (int) row.getField(indexToStringModel.getInputCols()[i]);
                outputValues[i] = (String) row.getField(indexToStringModel.getOutputCols()[i]);
            }
```

### DataFlowIssue
Unboxing of `row.getField(bucketizer.getInputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BucketizerExample.java`
#### Snippet
```java
            double[] outputValues = new double[bucketizer.getInputCols().length];
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (double) row.getField(bucketizer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(bucketizer.getOutputCols()[i]);
            }
```

### DataFlowIssue
Unboxing of `row.getField(bucketizer.getOutputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BucketizerExample.java`
#### Snippet
```java
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = (double) row.getField(bucketizer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(bucketizer.getOutputCols()[i]);
            }

```

### DataFlowIssue
Unboxing of `row.getField(stringIndexer.getOutputCols()[i])` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StringIndexerExample.java`
#### Snippet
```java
            for (int i = 0; i < inputValues.length; i++) {
                inputValues[i] = row.getField(stringIndexer.getInputCols()[i]);
                outputValues[i] = (double) row.getField(stringIndexer.getOutputCols()[i]);
            }

```

### DataFlowIssue
Unboxing of `row.getField(lr.getLabelCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/regression/LinearRegressionExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(lr.getFeaturesCol());
            double expectedResult = (Double) row.getField(lr.getLabelCol());
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            System.out.printf(
```

### DataFlowIssue
Unboxing of `row.getField(lr.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/regression/LinearRegressionExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(lr.getFeaturesCol());
            double expectedResult = (Double) row.getField(lr.getLabelCol());
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            System.out.printf(
                    "Features: %s \tExpected Result: %s \tPrediction Result: %s\n",
```

### DataFlowIssue
Unboxing of `row.getField(agglomerativeClustering.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/AgglomerativeClusteringExample.java`
#### Snippet
```java
            DenseVector features =
                    (DenseVector) row.getField(agglomerativeClustering.getFeaturesCol());
            int clusterId = (Integer) row.getField(agglomerativeClustering.getPredictionCol());
            System.out.printf("Features: %s \tCluster ID: %s\n", features, clusterId);
        }
```

### DataFlowIssue
Unboxing of `row.getField(kmeans.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/KMeansExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(kmeans.getFeaturesCol());
            int clusterId = (Integer) row.getField(kmeans.getPredictionCol());
            System.out.printf("Features: %s \tCluster ID: %s\n", features, clusterId);
        }
```

### DataFlowIssue
Unboxing of `row.getField(linearSVC.getLabelCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(linearSVC.getFeaturesCol());
            double expectedResult = (Double) row.getField(linearSVC.getLabelCol());
            double predictionResult = (Double) row.getField(linearSVC.getPredictionCol());
            DenseVector rawPredictionResult =
```

### DataFlowIssue
Unboxing of `row.getField(linearSVC.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(linearSVC.getFeaturesCol());
            double expectedResult = (Double) row.getField(linearSVC.getLabelCol());
            double predictionResult = (Double) row.getField(linearSVC.getPredictionCol());
            DenseVector rawPredictionResult =
                    (DenseVector) row.getField(linearSVC.getRawPredictionCol());
```

### DataFlowIssue
Unboxing of `row.getField(lr.getLabelCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LogisticRegressionExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(lr.getFeaturesCol());
            double expectedResult = (Double) row.getField(lr.getLabelCol());
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            DenseVector rawPredictionResult = (DenseVector) row.getField(lr.getRawPredictionCol());
```

### DataFlowIssue
Unboxing of `row.getField(lr.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LogisticRegressionExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(lr.getFeaturesCol());
            double expectedResult = (Double) row.getField(lr.getLabelCol());
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            DenseVector rawPredictionResult = (DenseVector) row.getField(lr.getRawPredictionCol());
            System.out.printf(
```

### DataFlowIssue
Unboxing of `row.getField(knn.getLabelCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/KnnExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(knn.getFeaturesCol());
            double expectedResult = (Double) row.getField(knn.getLabelCol());
            double predictionResult = (Double) row.getField(knn.getPredictionCol());
            System.out.printf(
```

### DataFlowIssue
Unboxing of `row.getField(knn.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/KnnExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(knn.getFeaturesCol());
            double expectedResult = (Double) row.getField(knn.getLabelCol());
            double predictionResult = (Double) row.getField(knn.getPredictionCol());
            System.out.printf(
                    "Features: %-15s \tExpected Result: %s \tPrediction Result: %s\n",
```

### DataFlowIssue
Unboxing of `row.getField(naiveBayes.getPredictionCol())` may produce `NullPointerException`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/NaiveBayesExample.java`
#### Snippet
```java
            Row row = it.next();
            DenseVector features = (DenseVector) row.getField(naiveBayes.getFeaturesCol());
            double predictionResult = (Double) row.getField(naiveBayes.getPredictionCol());
            System.out.printf("Features: %s \tPrediction Result: %s\n", features, predictionResult);
        }
```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
                                            return new Tuple2<>(
                                                    ((Vector) row.getField(featuresCol)),
                                                    number.doubleValue());
                                        },
                                Types.TUPLE(VectorTypeInfo.INSTANCE, Types.DOUBLE));
```

### DataFlowIssue
Unboxing of `row.getField(1)` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
                                    for (int i = 0; i < numOfFeatures; i++) {
                                        Row row = rows.get(i);
                                        pValues.set(i, (double) row.getField(1));
                                        degrees[i] = (long) row.getField(2);
                                        fValues.set(i, (double) row.getField(3));
```

### DataFlowIssue
Unboxing of `row.getField(2)` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
                                        Row row = rows.get(i);
                                        pValues.set(i, (double) row.getField(1));
                                        degrees[i] = (long) row.getField(2);
                                        fValues.set(i, (double) row.getField(3));
                                    }
```

### DataFlowIssue
Unboxing of `row.getField(3)` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
                                        pValues.set(i, (double) row.getField(1));
                                        degrees[i] = (long) row.getField(2);
                                        fValues.set(i, (double) row.getField(3));
                                    }
                                    return Tuple3.of(pValues, degrees, fValues);
```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/fvaluetest/FValueTest.java`
#### Snippet
```java
                                            return new Tuple2<>(
                                                    ((Vector) row.getField(featuresCol)),
                                                    number.doubleValue());
                                        })
                        .returns(Types.TUPLE(VectorTypeInfo.INSTANCE, Types.DOUBLE));
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/hashingtf/HashingTF.java`
#### Snippet
```java

            Iterable<Object> inputList;
            if (inputObj.getClass().isArray()) {
                inputList = Arrays.asList((Object[]) inputObj);
            } else if (inputObj instanceof Iterable) {
```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/bucketizer/Bucketizer.java`
#### Snippet
```java

            for (int i = 0; i < inputCols.length; i++) {
                double feature = ((Number) value.getField(inputCols[i])).doubleValue();
                Double[] splits = splitsArray[i];
                boolean isInvalid = false;
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScaler.java`
#### Snippet
```java
                        .map(
                                (MapFunction<Row, DenseVector>)
                                        value -> ((Vector) value.getField(inputCol)).toDense());
        DataStream<DenseVector> minMaxValues =
                inputData
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScalerModel.java`
#### Snippet
```java
                }
            }
            DenseVector inputVec = ((Vector) row.getField(inputCol)).toDense();
            DenseVector outputVec = new DenseVector(scaleVector.size());
            for (int i = 0; i < scaleVector.size(); ++i) {
```

### DataFlowIssue
Method invocation `clone` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/robustscaler/RobustScalerModel.java`
#### Snippet
```java
                                        .toArray());
            }
            DenseVector outputVec = ((Vector) row.getField(inputCol)).clone().toDense();
            Preconditions.checkState(
                    medians.size() == outputVec.size(),
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/robustscaler/RobustScaler.java`
#### Snippet
```java
                        .map(
                                (MapFunction<Row, DenseVector>)
                                        value -> ((Vector) value.getField(inputCol)).toDense());
        DataStream<RobustScalerModelData> modelData =
                DataStreamUtils.aggregate(
```

### DataFlowIssue
Unboxing of `row.getField("f0")` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModelData.java`
#### Snippet
```java
                            public Tuple2<Integer, Integer> map(Row row) {
                                return new Tuple2<>(
                                        (int) row.getField("f0"), (int) row.getField("f1"));
                            }
                        });
```

### DataFlowIssue
Unboxing of `row.getField("f1")` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModelData.java`
#### Snippet
```java
                            public Tuple2<Integer, Integer> map(Row row) {
                                return new Tuple2<>(
                                        (int) row.getField("f0"), (int) row.getField("f1"));
                            }
                        });
```

### DataFlowIssue
Method invocation `intValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
                Number number = (Number) row.getField(inputCols[i]);
                Preconditions.checkArgument(
                        number.intValue() == number.doubleValue(),
                        String.format("Value %s cannot be parsed as indexed integer.", number));
                int idx = number.intValue();
```

### DataFlowIssue
Method invocation `intValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoder.java`
#### Snippet
```java
            for (int i = 0; i < inputCols.length; i++) {
                Number number = (Number) row.getField(inputCols[i]);
                int value = number.intValue();

                if (value != number.doubleValue()) {
```

### DataFlowIssue
Unboxing of `input.getField(inputCols[i])` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stringindexer/IndexToStringModel.java`
#### Snippet
```java
            Row outputStrings = new Row(inputCols.length);
            for (int i = 0; i < inputCols.length; i++) {
                int stringId = (Integer) input.getField(inputCols[i]);
                if (stringId < stringArrays[i].length && stringId >= 0) {
                    outputStrings.setField(i, stringArrays[i][stringId]);
```

### DataFlowIssue
Method invocation `clone` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexerModel.java`
#### Snippet
```java
            }

            Vector outputVector = ((Vector) input.getField(inputCol)).clone();
            for (Map.Entry<Integer, Map<Double, Integer>> entry : categoryMaps.entrySet()) {
                int columnId = entry.getKey();
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexer.java`
#### Snippet
```java
                // First record.
                Vector vector = (Vector) element.getValue().getField(inputCol);
                doublesByColumn = new HashSet[vector.size()];
                for (int i = 0; i < doublesByColumn.length; i++) {
                    doublesByColumn[i] = new HashSet<>();
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexer.java`
#### Snippet
```java
            Vector vector = (Vector) element.getValue().getField(inputCol);
            Preconditions.checkState(
                    vector.size() == doublesByColumn.length,
                    "The size of the all input vectors should be the same.");
            double[] values = vector.toDense().values;
```

### DataFlowIssue
Method invocation `clone` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/StandardScalerModel.java`
#### Snippet
```java
            }

            Vector outputVec = ((Vector) (dataPoint.getField(inputCol))).clone();
            if (withMean) {
                outputVec = outputVec.toDense();
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
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/StandardScaler.java`
#### Snippet
```java
            Vector inputVec = (Vector) element.getValue().getField(inputCol);
            if (numElements == 0) {
                sum = new DenseVector(inputVec.size());
                squaredSum = new DenseVector(inputVec.size());
            }
```

### DataFlowIssue
Argument `inputVec` might be null
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/StandardScaler.java`
#### Snippet
```java
                squaredSum = new DenseVector(inputVec.size());
            }
            BLAS.axpy(1, inputVec, sum);
            BLAS.hDot(inputVec, inputVec);
            BLAS.axpy(1, inputVec, squaredSum);
```

### DataFlowIssue
Dereference of `document` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/countvectorizer/CountVectorizerModel.java`
#### Snippet
```java
            String[] document = (String[]) row.getField(inputCol);
            double[] termCounts = new double[vocabulary.size()];
            for (String word : document) {
                if (vocabulary.containsKey(word)) {
                    termCounts[vocabulary.get(word)] += 1;
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizerModel.java`
#### Snippet
```java
                binEdges = modelData.binEdges;
            }
            DenseVector inputVec = ((Vector) row.getField(inputCol)).toDense();
            DenseVector outputVec = inputVec.clone();
            for (int i = 0; i < inputVec.size(); i++) {
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
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorassembler/VectorAssembler.java`
#### Snippet
```java
            } else {
                DenseVector denseVector = (DenseVector) object;
                for (int i = 0; i < denseVector.size(); ++i) {
                    indices[currentOffset + i] = i + currentIndex;
                }
```

### DataFlowIssue
Dereference of `denseVector` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorassembler/VectorAssembler.java`
#### Snippet
```java
            } else {
                DenseVector denseVector = (DenseVector) object;
                System.arraycopy(denseVector.values, 0, values, currentOffset, denseVector.size());

                currentOffset += denseVector.size();
```

### DataFlowIssue
Unboxing of `x.getField(0)` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/variancethresholdselector/VarianceThresholdSelectorModelData.java`
#### Snippet
```java
                        x ->
                                new VarianceThresholdSelectorModelData(
                                        (int) x.getField(0), (int[]) x.getField(1)));
    }

```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/univariatefeatureselector/UnivariateFeatureSelectorModel.java`
#### Snippet
```java
                Vector inputVec = ((Vector) row.getField(inputCol));
                Preconditions.checkArgument(
                        inputVec.size() > indices[indices.length - 1],
                        "Input %s features, but UnivariateFeatureSelector is "
                                + "expecting at least %s features as input.",
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/variancethresholdselector/VarianceThresholdSelectorModel.java`
#### Snippet
```java
            Vector inputVec = ((Vector) row.getField(inputCol));
            Preconditions.checkArgument(
                    inputVec.size() == expectedNumOfFeatures,
                    "%s has %s features, but VarianceThresholdSelector is expecting %s features as input.",
                    inputCol,
```

### DataFlowIssue
Unboxing of `row.getField("pValue")` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/univariatefeatureselector/UnivariateFeatureSelector.java`
#### Snippet
```java
        public void processElement(StreamRecord<Row> record) {
            Row row = record.getValue();
            double pValue = (double) row.getField("pValue");
            int featureIndex = (int) row.getField("featureIndex");
            pValuesAndIndices.add(Tuple2.of(pValue, featureIndex));
```

### DataFlowIssue
Unboxing of `row.getField("featureIndex")` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/univariatefeatureselector/UnivariateFeatureSelector.java`
#### Snippet
```java
            Row row = record.getValue();
            double pValue = (double) row.getField("pValue");
            int featureIndex = (int) row.getField("featureIndex");
            pValuesAndIndices.add(Tuple2.of(pValue, featureIndex));
        }
```

### DataFlowIssue
Argument `x.getField(0)` might be null
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModelData.java`
#### Snippet
```java
                        x ->
                                new KMeansModelData(
                                        Arrays.stream(((Vector[]) x.getField(0)))
                                                .map(Vector::toDense)
                                                .toArray(DenseVector[]::new),
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModelData.java`
#### Snippet
```java
                                                .map(Vector::toDense)
                                                .toArray(DenseVector[]::new),
                                        ((Vector) x.getField(1)).toDense()));
    }

```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeansModel.java`
#### Snippet
```java
                return;
            }
            DenseVector point = ((Vector) dataPoint.getField(featuresCol)).toDense();
            int closestCentroidId =
                    distanceMeasure.findClosest(centroids, new VectorWithNorm(point));
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
                        .map(
                                (MapFunction<Row, DenseVector>)
                                        value -> ((Vector) value.getField(inputCol)).toDense());

        DataStream<DenseVector> preprocessedData;
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModel.java`
#### Snippet
```java
                }
            }
            DenseVector point = ((Vector) dataPoint.getField(featuresCol)).toDense();
            int closestCentroidId =
                    distanceMeasure.findClosest(centroids, new VectorWithNorm(point));
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeans.java`
#### Snippet
```java
        @Override
        public DenseVector map(Row row) {
            return ((Vector) row.getField(featuresCol)).toDense();
        }
    }
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeans.java`
#### Snippet
```java
        DataStream<DenseVector> points =
                tEnv.toDataStream(inputs[0])
                        .map(row -> ((Vector) row.getField(getFeaturesCol())).toDense());

        DataStream<DenseVector[]> initCentroids = selectRandomCentroids(points, getK(), getSeed());
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/regression/linearregression/LinearRegressionModel.java`
#### Snippet
```java
                coefficient = modelData.coefficient;
            }
            DenseVector features = ((Vector) dataPoint.getField(featuresCol)).toDense();
            Row predictionResult = predictOneDataPoint(features, coefficient);
            return Row.join(dataPoint, predictionResult);
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModelData.java`
#### Snippet
```java
                        x ->
                                new KnnModelData(
                                        ((Matrix) x.getField(0)).toDense(),
                                        ((Vector) x.getField(1)).toDense(),
                                        ((Vector) x.getField(2)).toDense()));
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModelData.java`
#### Snippet
```java
                                new KnnModelData(
                                        ((Matrix) x.getField(0)).toDense(),
                                        ((Vector) x.getField(1)).toDense(),
                                        ((Vector) x.getField(2)).toDense()));
    }
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModelData.java`
#### Snippet
```java
                                        ((Matrix) x.getField(0)).toDense(),
                                        ((Vector) x.getField(1)).toDense(),
                                        ((Vector) x.getField(2)).toDense()));
    }

```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVCModelData.java`
#### Snippet
```java
                (StreamTableEnvironment) ((TableImpl) modelData).getTableEnvironment();
        return tEnv.toDataStream(modelData)
                .map(x -> new LinearSVCModelData(((Vector) x.getField(0)).toDense()));
    }

```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/Knn.java`
#### Snippet
```java
                    @Override
                    public Tuple3<DenseVector, Double, Double> map(Row value) {
                        Double label = ((Number) value.getField(getLabelCol())).doubleValue();
                        DenseVector feature = ((Vector) value.getField(getFeaturesCol())).toDense();
                        return Tuple3.of(feature, label, Math.pow(BLAS.norm2(feature), 2));
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/Knn.java`
#### Snippet
```java
                    public Tuple3<DenseVector, Double, Double> map(Row value) {
                        Double label = ((Number) value.getField(getLabelCol())).doubleValue();
                        DenseVector feature = ((Vector) value.getField(getFeaturesCol())).toDense();
                        return Tuple3.of(feature, label, Math.pow(BLAS.norm2(feature), 2));
                    }
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVCModel.java`
#### Snippet
```java
                coefficient = modelData.coefficient;
            }
            DenseVector features = ((Vector) dataPoint.getField(featuresCol)).toDense();
            Row predictionResult = predictOneDataPoint(features, coefficient, threshold);
            return Row.join(dataPoint, predictionResult);
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModel.java`
#### Snippet
```java
                distanceVector = new DenseVector(knnModelData.labels.size());
            }
            DenseVector feature = ((Vector) row.getField(featureCol)).toDense();
            double prediction = predictLabel(feature);
            return Row.join(row, Row.of(prediction));
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

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayesModelData.java`
#### Snippet
```java
                                        new NaiveBayesModelData(
                                                (Map<Double, Double>[][]) row.getField(0),
                                                ((Vector) row.getField(1)).toDense(),
                                                ((Vector) row.getField(2)).toDense()),
                        TYPE_INFO);
```

### DataFlowIssue
Method invocation `toDense` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayesModelData.java`
#### Snippet
```java
                                                (Map<Double, Double>[][]) row.getField(0),
                                                ((Vector) row.getField(1)).toDense(),
                                                ((Vector) row.getField(2)).toDense()),
                        TYPE_INFO);
    }
```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
                    probOrigin instanceof Vector
                            ? ((Vector) probOrigin).get(1)
                            : ((Number) probOrigin).doubleValue();
            double weight =
                    weightCol == null ? 1.0 : ((Number) value.getField(weightCol)).doubleValue();
```

### DataFlowIssue
Method invocation `doubleValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
                            : ((Number) probOrigin).doubleValue();
            double weight =
                    weightCol == null ? 1.0 : ((Number) value.getField(weightCol)).doubleValue();
            return Tuple3.of(prob, label == 1.0, weight);
        }
```

### DataFlowIssue
Method invocation `intValue` may produce `NullPointerException`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java
                                                    "Input data should contain label value.");
                                            Preconditions.checkArgument(
                                                    number.intValue() == number.doubleValue(),
                                                    "Label value should be indexed number.");
                                            return new Tuple2<>(
```

### DataFlowIssue
Argument `b` might be null
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentWriter.java`
#### Snippet
```java
            while (len > 0) {
                int currentLen = Math.min(len, pageSize - segmentOffset);
                segments.get(segmentIndex).put(segmentOffset, b, off, currentLen);
                segmentOffset += currentLen;
                globalOffset += currentLen;
```

### DataFlowIssue
Method invocation `next` may produce `NullPointerException`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheReader.java`
#### Snippet
```java
    public T next() {
        try {
            T record = currentSegmentReader.next();

            currentSegmentCount++;
```

### DataFlowIssue
Method invocation `addRecord` may produce `NullPointerException`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    public void addRecord(T record) throws IOException {
        if (!currentSegmentWriter.addRecord(record)) {
            currentSegmentWriter.finish().ifPresent(finishedSegments::add);
            currentSegmentWriter = new FileSegmentWriter<>(serializer, pathGenerator.get());
```

### DataFlowIssue
Method invocation `returnAll` may produce `NullPointerException`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
            }
            if (!segment.getCache().isEmpty()) {
                segmentPool.returnAll(segment.getCache());
            }
        }
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

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
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

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/IterationRecord.java`
#### Snippet
```java

    @Override
    public IterationRecord<T> clone() {
        switch (type) {
            case RECORD:
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `bcStreams.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
        int idx = 0;
        final String broadcastId = new AbstractID().toHexString();
        for (String name : bcStreams.keySet()) {
            broadcastNames[idx] = broadcastId + "-" + name;
            broadcastInputs[idx] = bcStreams.get(name);
```

### KeySetIterationMayUseEntrySet
Iteration over `cntMap.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
        @Override
        public void endInput() {
            for (Tuple3<Integer, Double, Double> key : cntMap.keySet()) {
                Long count = cntMap.get(key);
                output.collect(new StreamRecord<>(new Tuple4<>(key.f0, key.f1, key.f2, count)));
```

### KeySetIterationMayUseEntrySet
Iteration over `categoricalMarginsMap.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
        @Override
        public void endInput() {
            for (Tuple2<Integer, Double> key : categoricalMarginsMap.keySet()) {
                Long categoricalMargin = categoricalMarginsMap.get(key);
                output.collect(new StreamRecord<>(new Tuple3<>(key.f0, key.f1, categoricalMargin)));
```

### KeySetIterationMayUseEntrySet
Iteration over `labelMarginsMap.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
        public void endInput() {

            for (Tuple2<Integer, Double> key : labelMarginsMap.keySet()) {
                Long labelMargin = labelMarginsMap.get(key);
                output.collect(new StreamRecord<>(new Tuple3<>(key.f0, key.f1, labelMargin)));
```

### KeySetIterationMayUseEntrySet
Iteration over `featureWeightMap.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayes.java`
#### Snippet
```java
                }

                for (double key : featureWeightMap.keySet()) {
                    collector.collect(
                            new Tuple3<>(key, numMap.get(key), featureWeightMap.get(key)));
```

### KeySetIterationMayUseEntrySet
Iteration over `itemAndPurchasers.keySet()` may be replaced with 'entrySet()' iteration
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java

            long[] interaction = new long[maxUserBehavior];
            for (long mainItem : itemAndPurchasers.keySet()) {
                List<Long> userList = itemAndPurchasers.get(mainItem);
                HashMap<Long, Double> id2swing = new HashMap<>();
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'outputModelDataIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

    public Graph(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'outputIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] estimatorInputIds;
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'modelInputIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final List<GraphNode> nodes;
    private final TableId[] estimatorInputIds;
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'estimatorInputIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final Map<Param<?>, Object> paramMap = new HashMap<>();
    private final List<GraphNode> nodes;
    private final TableId[] estimatorInputIds;
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'inputModelDataIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'inputIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final Map<Param<?>, Object> paramMap = new HashMap<>();
    private final List<GraphNode> nodes;
    private final TableId[] inputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'outputModelDataIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'inputModelDataIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] inputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'executionHelper' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;

    public GraphModel(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'outputIds' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final List<GraphNode> nodes;
    private final TableId[] inputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dataOutputSerializer' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/CoGroupOperator.java`
#### Snippet
```java
    private TypeSerializer<Tuple2<byte[], StreamRecord<IN2>>> keyAndValueSerializerB;
    private TypeSerializer<KEY> keySerializer;
    private DataOutputSerializer dataOutputSerializer;
    private long lastWatermarkTimestamp = Long.MIN_VALUE;
    private int remainingInputNum = 2;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parameters' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            LoggerFactory.getLogger(AbstractBroadcastWrapperOperator.class);

    protected final StreamOperatorParameters<T> parameters;

    protected final StreamConfig streamConfig;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'wrappedOperatorRuntimeContext' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java

    /** RuntimeContext of the rich function in wrapped operator. */
    private BroadcastStreamingRuntimeContext wrappedOperatorRuntimeContext;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dataCacheWriters' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
    /** DataCacheWriter for each input. */
    @SuppressWarnings("rawtypes")
    private DataCacheWriter[] dataCacheWriters;

    /** Whether each input has pending elements. */
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'modelData' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScalerModel.java`
#### Snippet
```java

        /** Model data for inference. */
        private StandardScalerModelData modelData;

        private DenseVector mean;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'centroids' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeansModel.java`
#### Snippet
```java
        private final int k;

        private VectorWithNorm[] centroids;

        // TODO: replace this with a complete solution of reading first model data from unbounded
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'centroids' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeansModel.java`
#### Snippet
```java
        private final int k;

        private VectorWithNorm[] centroids;

        public PredictLabelFunction(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'points' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeans.java`
#### Snippet
```java
        private ListState<DenseVector[]> centroids;

        private ListStateWithCache<VectorWithNorm> points;

        public CentroidsUpdateAccumulator(DistanceMeasure distanceMeasure) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'knnModelData' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/KnnModel.java`
#### Snippet
```java
    private static class PredictLabelFunction extends RichMapFunction<Row, Row> {
        private final String featureCol;
        private KnnModelData knnModelData;
        private final int k;
        private final String broadcastKey;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'modelData' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayesModel.java`
#### Snippet
```java
        private final String featuresCol;
        private final String broadcastModelKey;
        private NaiveBayesModelData modelData = null;

        public PredictLabelFunction(String featuresCol, String broadcastModelKey) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'servable' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegressionModel.java`
#### Snippet
```java
        private DenseVector coefficient;
        private long modelDataVersion = 0L;
        private LogisticRegressionModelServable servable;

        public PredictLabelOperator(RowTypeInfo inputTypeInfo, Map<Param<?>, Object> params) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'servable' in a Serializable class
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/LogisticRegressionModel.java`
#### Snippet
```java
        private final Map<Param<?>, Object> params;

        private LogisticRegressionModelServable servable;

        public PredictLabelFunction(String broadcastModelKey, Map<Param<?>, Object> params) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'currentDataCacheReader' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
    private DataCacheWriter<T> dataCacheWriter;

    @Nullable private DataCacheReader<T> currentDataCacheReader;

    private int currentEpoch;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'progressTracker' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
                BoundedMultiInput {

    private OperatorEpochWatermarkTracker progressTracker;

    private Path basePath;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'dataCacheWriter' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
    private MailboxExecutor mailboxExecutor;

    private DataCacheWriter<T> dataCacheWriter;

    @Nullable private DataCacheReader<T> currentDataCacheReader;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'epochWatermarkTracker' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    // ------------- Iteration Related --------------------

    protected final OperatorEpochWatermarkTracker epochWatermarkTracker;

    protected final String uniqueSenderId;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'epochWatermarkSupplier' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    protected final ProxyOutput<T> proxyOutput;

    protected final EpochSupplier epochWatermarkSupplier;

    // --------------- Metrics ---------------------------
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'iterationContext' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    protected final StreamOperatorFactory<T> operatorFactory;

    protected final IterationContext iterationContext;

    // --------------- proxy ---------------------------
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'parameters' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    private static final Logger LOG = LoggerFactory.getLogger(AbstractWrapperOperator.class);

    protected final StreamOperatorParameters<IterationRecord<T>> parameters;

    protected final StreamConfig streamConfig;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'metrics' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java

    /** Metric group for the operator. */
    protected final InternalOperatorMetricGroup metrics;

    // ------------- Iteration Related --------------------
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'proxyOutput' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    // --------------- proxy ---------------------------

    protected final ProxyOutput<T> proxyOutput;

    protected final EpochSupplier epochWatermarkSupplier;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/OneInputAllRoundWrapperOperator.java`
#### Snippet
```java
                BoundedOneInput {

    private final StreamRecord<IN> reusedInput;

    public OneInputAllRoundWrapperOperator(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput2' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
    private final StreamRecord<IN1> reusedInput1;

    private final StreamRecord<IN2> reusedInput2;

    public TwoInputAllRoundWrapperOperator(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput1' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
                BoundedMultiInput {

    private final StreamRecord<IN1> reusedInput1;

    private final StreamRecord<IN2> reusedInput2;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/OneInputPerRoundWrapperOperator.java`
#### Snippet
```java
            LoggerFactory.getLogger(OneInputPerRoundWrapperOperator.class);

    private final StreamRecord<IN> reusedInput;

    public OneInputPerRoundWrapperOperator(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput2' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/TwoInputPerRoundWrapperOperator.java`
#### Snippet
```java
    private final StreamRecord<IN1> reusedInput1;

    private final StreamRecord<IN2> reusedInput2;

    public TwoInputPerRoundWrapperOperator(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'reusedInput1' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/TwoInputPerRoundWrapperOperator.java`
#### Snippet
```java
                IterationRecord<IN1>, IterationRecord<IN2>, IterationRecord<OUT>> {

    private final StreamRecord<IN1> reusedInput1;

    private final StreamRecord<IN2> reusedInput2;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'checkpointAligner' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
    private HeadOperatorRecordProcessor recordProcessor;

    private HeadOperatorCheckpointAligner checkpointAligner;

    // ------------- states -------------------
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'checkpoints' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
    private ListState<HeadOperatorState> processorState;

    private Checkpoints<IterationRecord<?>> checkpoints;

    public HeadOperator(
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mailboxExecutor' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/HeadOperator.java`
#### Snippet
```java
    private final OperatorEventGateway operatorEventGateway;

    private final MailboxExecutorWithYieldTimeout mailboxExecutor;

    private transient BroadcastOutput<?> eventBroadcastOutput;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'latencyStats' in a Serializable class
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    private final Map<Integer, S> wrappedOperators;

    protected final LatencyStats latencyStats;

    private transient StreamOperatorStateContext streamOperatorStateContext;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'valuesState' in a Serializable class
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
            implements OneInputStreamOperator<IN, OUT>, BoundedOneInput {

        private ListStateWithCache<IN> valuesState;

        public MapPartitionOperator(MapPartitionFunction<IN, OUT> mapPartitionFunc) {
```

## RuleId[id=MismatchedJavadocCode]
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
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/PipelineModel.java`
#### Snippet
```java
     *
     * @param inputs a list of tables
     * @return a list of tables
     */
    @Override
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`inputList.size() > 0` can be replaced with '!inputList.isEmpty()'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
            Map<String, DataStream<?>> bcStreams,
            Function<List<DataStream<?>>, DataStream<OUT>> userDefinedFunction) {
        Preconditions.checkArgument(inputList.size() > 0);

        StreamExecutionEnvironment env = inputList.get(0).getExecutionEnvironment();
```

### SizeReplaceableByIsEmpty
`inputs.size() == 0` can be replaced with 'inputs.isEmpty()'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            return;
        }
        if (inputs.size() == 0) {
            for (int i = 0; i < numInputs; i++) {
                dataCacheWriters[i] =
```

### SizeReplaceableByIsEmpty
`pendingSegments.size() != 0` can be replaced with '!pendingSegments.isEmpty()'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            throws Exception {
        List<Segment> pendingSegments = dataCacheWriters[inputIndex].getSegments();
        if (pendingSegments.size() != 0) {
            DataCacheReader dataCacheReader =
                    new DataCacheReader<>(
```

### SizeReplaceableByIsEmpty
`trainData.size() > 0` can be replaced with '!trainData.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java

            // TODO: supports efficient shuffle of training set on each partition.
            if (trainData.size() > 0) {
                List<LabeledPointWithWeight> miniBatchData =
                        trainData.subList(
```

### SizeReplaceableByIsEmpty
`x.getValue().size() > 0` can be replaced with '!x.getValue().isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/imputer/Imputer.java`
#### Snippet
```java
        public ImputerModelData getResult(Map<String, Map<Double, Long>> map) {
            long validColumns =
                    map.entrySet().stream().filter(x -> x.getValue().size() > 0).count();
            Preconditions.checkState(
                    validColumns > 0, "The training set is empty or does not contains valid data.");
```

### SizeReplaceableByIsEmpty
`set.size() != 0` can be replaced with '!set.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorslicer/VectorSlicerParams.java`
#### Snippet
```java
                return false;
            }
            return set.size() != 0;
        };
    }
```

### SizeReplaceableByIsEmpty
`unprocessedElements.size() > 0` can be replaced with '!unprocessedElements.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/standardscaler/OnlineStandardScalerModel.java`
#### Snippet
```java
            if (predictedCachedData) {
                bufferedPointsState.clear();
                if (unprocessedElements.size() > 0) {
                    bufferedPointsState.update(unprocessedElements);
                }
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
                                iterable.iterator().forEachRemaining(list::add);

                                if (list.size() == 0) {
                                    throw new RuntimeException("The training set is empty.");
                                }
```

### SizeReplaceableByIsEmpty
`itemAndScore.size() == 0` can be replaced with 'itemAndScore.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java
                itemAndScore.sort((o1, o2) -> Double.compare(o2.f1, o1.f1));

                if (itemAndScore.size() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`purchasers.size() == 0` can be replaced with 'purchasers.isEmpty()'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java
            // See https://en.wikipedia.org/wiki/Reservoir_sampling for more information on
            // Reservoir Sampling.
            if (purchasers.size() == 0) {
                purchasers.add(0L);
            }
```

### SizeReplaceableByIsEmpty
`rawStateInputs.size() > 0` can be replaced with '!rawStateInputs.isEmpty()'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
            List<StatePartitionStreamProvider> rawStateInputs =
                    IteratorUtils.toList(context.getRawOperatorStateInputs().iterator());
            if (rawStateInputs.size() > 0) {
                checkState(
                        rawStateInputs.size() == 1,
```

### SizeReplaceableByIsEmpty
`wrappedOperators.size() == 0` can be replaced with 'wrappedOperators.isEmpty()'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    public void finish() throws Exception {
        checkState(
                wrappedOperators.size() == 0,
                "Some wrapped operators are still not closed yet: " + wrappedOperators.keySet());
    }
```

### SizeReplaceableByIsEmpty
`replayedDataStreamIndices.size() > 0` can be replaced with '!replayedDataStreamIndices.isEmpty()'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java

        DataStreamList dataStreamInputs = addInputs(dataStreams);
        if (replayedDataStreamIndices.size() > 0) {
            dataStreamInputs =
                    addReplayer(
```

### SizeReplaceableByIsEmpty
`inputs.size() > 0` can be replaced with '!inputs.isEmpty()'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/ListStateWithCache.java`
#### Snippet
```java

        List<Segment> priorFinishedSegments = new ArrayList<>();
        if (inputs.size() > 0) {
            DataCacheSnapshot dataCacheSnapshot =
                    DataCacheSnapshot.recover(
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
                                fileTypeName,
                                operatorId,
                                UUID.randomUUID().toString()));
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
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
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
                    String.format(
                            "Unexpected raw state indices %s and epochs %s",
                            rawStateEpochs.toString(), pendingEpochs.toString()));
            // Let's find how much entries this epoch has.
            int numberOfStateEntries = 0;
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/Swing.java`
#### Snippet
```java
                                .sequential()
                                .limit(itemNums)
                                .map(tuple2 -> "" + tuple2.f0 + commaDelimiter + tuple2.f1)
                                .collect(Collectors.joining("" + semicolonDelimiter));
                output.collect(new StreamRecord<>(Row.of(mainItem, itemList)));
```

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

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/TableUtils.java`
#### Snippet
```java
    // Logical type roots that may cause wrong type conversion between Table and DataStream.
    private static final Set<LogicalTypeRoot> LOGICAL_TYPE_ROOTS_USING_EXTERNAL_TYPE_INFO =
            new HashSet<>();

    static {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `EpochAwareCoProcessFunction` has no concrete subclass
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/functions/EpochAwareCoProcessFunction.java`
#### Snippet
```java
 */
@Internal
public abstract class EpochAwareCoProcessFunction<I1, I2, O> extends CoProcessFunction<I1, I2, O>
        implements EpochAware {

```

### AbstractClassNeverImplemented
Abstract class `EpochAwareAllRoundProcessFunction` has no concrete subclass
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/functions/EpochAwareAllRoundProcessFunction.java`
#### Snippet
```java
 */
@Internal
public abstract class EpochAwareAllRoundProcessFunction<I, O> extends ProcessFunction<I, O>
        implements EpochAware {

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super V`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/param/WithParams.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    default <V> V get(Param<V> param) {
        Map<Param<?>, Object> paramMap = getParamMap();
        V value = (V) paramMap.get(param);
```

### BoundedWildcard
Can generalize to `? super Param`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/ParamUtils.java`
#### Snippet
```java
     */
    public static void initializeMapWithDefaultValues(
            Map<Param<?>, Object> paramMap, WithParams<?> instance) {
        List<Param<?>> defaultParams = getPublicFinalParamFields(instance);
        for (Param<?> param : defaultParams) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastContext.java`
#### Snippet
```java

    @VisibleForTesting
    public static void putBroadcastVariable(String key, Tuple2<Boolean, List<?>> variable) {
        BROADCAST_VARIABLES.compute(
                key,
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/iteration/TerminateOnMaxIterOrTol.java`
#### Snippet
```java
    @Override
    public void onEpochWatermarkIncremented(
            int epochWatermark, Context context, Collector<Integer> collector) {
        if ((epochWatermark + 1) < maxIter && loss > tol) {
            collector.collect(0);
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/iteration/TerminateOnMaxIter.java`
#### Snippet
```java
    @Override
    public void onEpochWatermarkIncremented(
            int epochWatermark, Context context, Collector<Integer> out) {
        if (epochWatermark + 1 < maxIter) {
            out.collect(0);
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/iteration/ForwardInputsOfLastRound.java`
#### Snippet
```java

    @Override
    public void onIterationTerminated(Context context, Collector<T> out) {
        for (T value : valuesInLastEpoch) {
            out.collect(value);
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
    private static <OUT> DataStream<OUT> getResultStream(
            StreamExecutionEnvironment env,
            List<DataStream<?>> inputList,
            String[] broadcastStreamNames,
            Function<List<DataStream<?>>, DataStream<OUT>> graphBuilder) {
```

### BoundedWildcard
Can generalize to `? super List`>
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
            List<DataStream<?>> inputList,
            String[] broadcastStreamNames,
            Function<List<DataStream<?>>, DataStream<OUT>> graphBuilder) {
        DraftExecutionEnvironment draftEnv =
                new DraftExecutionEnvironment(env, new BroadcastWrapper<>(broadcastStreamNames));
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
            List<DataStream<?>> inputList,
            String[] broadcastStreamNames,
            Function<List<DataStream<?>>, DataStream<OUT>> graphBuilder) {
        DraftExecutionEnvironment draftEnv =
                new DraftExecutionEnvironment(env, new BroadcastWrapper<>(broadcastStreamNames));
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/BroadcastUtils.java`
#### Snippet
```java
    public static <OUT> DataStream<OUT> withBroadcastStream(
            List<DataStream<?>> inputList,
            Map<String, DataStream<?>> bcStreams,
            Function<List<DataStream<?>>, DataStream<OUT>> userDefinedFunction) {
        Preconditions.checkArgument(inputList.size() > 0);
```

### BoundedWildcard
Can generalize to `? extends Stage`
in `flink-ml-core/src/main/java/org/apache/flink/ml/util/ReadWriteUtils.java`
#### Snippet
```java
     * @param path The parent directory to save the pipeline metadata and its stages.
     */
    public static void savePipeline(Stage<?> pipeline, List<Stage<?>> stages, String path)
            throws IOException {
        // Creates parent directories if not already created.
```

### BoundedWildcard
Can generalize to `? extends GraphNode`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphExecutionHelper.java`
#### Snippet
```java
    private final Deque<GraphNode> unFetchedReadyNodes = new LinkedList<>();

    public GraphExecutionHelper(List<GraphNode> nodes) {
        // Initializes dependentNodes and numUnConstructedInputs.
        for (GraphNode node : nodes) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/util/PeriodicSourceFunction.java`
#### Snippet
```java
     *     between two adjacent intervals.
     */
    public PeriodicSourceFunction(long interval, List<List<Row>> data) {
        this.interval = interval;
        this.data = data;
```

### BoundedWildcard
Can generalize to `? extends Tuple2`>
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/CoGroupOperator.java`
#### Snippet
```java
        private boolean iteratorAvailable;

        public void set(Iterator<Tuple2<K, StreamRecord<T>>> iterator) {
            this.iterator = iterator;
            this.iteratorAvailable = true;
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
    private void processPendingElementsAndWatermarks(
            int inputIndex,
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
    private void processPendingElementsAndWatermarks(
            int inputIndex,
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
```

### BoundedWildcard
Can generalize to `? super Watermark`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
            throws Exception {
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
            throws Exception {
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
            throws Exception {
        List<Segment> pendingSegments = dataCacheWriters[inputIndex].getSegments();
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/AbstractBroadcastWrapperOperator.java`
#### Snippet
```java
            ThrowingConsumer<StreamRecord, Exception> elementConsumer,
            ThrowingConsumer<Watermark, Exception> watermarkConsumer,
            ThrowingConsumer<StreamRecord, Exception> keyContextSetter)
            throws Exception {
        List<Segment> pendingSegments = dataCacheWriters[inputIndex].getSegments();
```

### BoundedWildcard
Can generalize to `? extends Map`
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
            StreamTableEnvironment tEnv,
            String name,
            Map<String, Map<String, ?>> params,
            boolean dryRun)
            throws Exception {
```

### BoundedWildcard
Can generalize to `? extends Tuple2`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java

        private Tuple3<Double, Long, Double> computeANOVA(
                double sum, double sumOfSq, HashMap<Double, Tuple2<Double, Long>> summary) {
            long numOfClasses = summary.size();

```

### BoundedWildcard
Can generalize to `? extends StatsTuple`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java

    private List<StatsTuple> compressInternal(
            List<StatsTuple> currentSamples, double mergeThreshold) {
        if (currentSamples.isEmpty()) {
            return Collections.emptyList();
```

### BoundedWildcard
Can generalize to `? extends DenseVector`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java
    @Override
    public DataStream<DenseVector> optimize(
            DataStream<DenseVector> initModelData,
            DataStream<LabeledPointWithWeight> trainData,
            LossFunc lossFunc) {
```

### BoundedWildcard
Can generalize to `? super DenseVector`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java

        private CacheDataAndDoTrain(
                LossFunc lossFunc, SGDParams params, OutputTag<DenseVector> modelDataOutputTag) {
            this.lossFunc = lossFunc;
            this.params = params;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/featurehasher/FeatureHasher.java`
#### Snippet
```java
     */
    private static void updateMap(
            String s, double value, TreeMap<Integer, Double> feature, int numFeature) {
        int hashValue = Math.abs(HASH.hashUnencodedChars(s).asInt());

```

### BoundedWildcard
Can generalize to `? extends DenseVector`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java

    private static double[][] findBinEdgesWithQuantileStrategy(
            List<DenseVector> input, int numBins) {
        int numColumns = input.get(0).size();
        int numData = input.size();
```

### BoundedWildcard
Can generalize to `? extends DenseVector`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
    }

    private static double[][] findBinEdgesWithKMeansStrategy(List<DenseVector> input, int numBins) {
        int numColumns = input.get(0).size();
        int numData = input.size();
```

### BoundedWildcard
Can generalize to `? extends DenseVector`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java

    private static double[][] findBinEdgesWithUniformStrategy(
            List<DenseVector> input, int numBins) {
        DenseVector minVector = input.get(0);
        DenseVector maxVector = input.get(1);
```

### BoundedWildcard
Can generalize to `? extends BinarySummary`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
     * @return [curTrue, curFalse, TotalTrue, TotalFalse]
     */
    private static long[] reduceBinarySummary(List<BinarySummary> values, int taskId) {
        List<BinarySummary> list = new ArrayList<>(values);
        list.sort(Comparator.comparingDouble(t -> -t.maxScore));
```

### BoundedWildcard
Can generalize to `? extends Tuple4`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/agglomerativeclustering/AgglomerativeClustering.java`
#### Snippet
```java

        /** Reorders the nearest-neighbor-chain. */
        private void reOrderNnChain(List<Tuple4<Integer, Integer, Integer, Double>> nnChain) {
            int nextClusterId = nnChain.size() + 1;
            HashMap<Integer, Integer> nodeMapping = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends Tuple4`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/agglomerativeclustering/AgglomerativeClustering.java`
#### Snippet
```java
        /** Converts the cluster Ids for each input data point. */
        private int[] label(
                List<Tuple4<Integer, Integer, Integer, Double>> nnChains, int numDataPoints) {
            UnionFind unionFind = new UnionFind(numDataPoints);
            for (Tuple4<Integer, Integer, Integer, Double> t : nnChains) {
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/ReplayableDataStreamList.java`
#### Snippet
```java

    private ReplayableDataStreamList(
            List<DataStream<?>> replayedDataStreams, List<DataStream<?>> nonReplayedStreams) {
        this.replayedDataStreams = replayedDataStreams;
        this.nonReplayedStreams = nonReplayedStreams;
```

### BoundedWildcard
Can generalize to `? extends DataStream`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/ReplayableDataStreamList.java`
#### Snippet
```java

    private ReplayableDataStreamList(
            List<DataStream<?>> replayedDataStreams, List<DataStream<?>> nonReplayedStreams) {
        this.replayedDataStreams = replayedDataStreams;
        this.nonReplayedStreams = nonReplayedStreams;
```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/TailOperator.java`
#### Snippet
```java
    }

    private void processIfObjectReuseEnabled(StreamRecord<IterationRecord<?>> record) {
        // Since the record would be reused, we have to clone a new one
        IterationRecord<?> cloned = record.getValue().clone();
```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/TailOperator.java`
#### Snippet
```java
    }

    private void processIfObjectReuseNotEnabled(StreamRecord<IterationRecord<?>> record) {
        // Since the record would not be reused, we could modify it in place.
        record.getValue().incrementEpoch();
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
    }

    private void replayRecords(DataCacheReader<T> dataCacheReader, int epoch) {
        StreamRecord<IterationRecord<T>> reusable =
                new StreamRecord<>(IterationRecord.newRecord(null, epoch));
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
            StreamOperator<?> operator,
            Class<T> targetInterface,
            ThrowingConsumer<T, Exception> action) {
        try {
            if (targetInterface.isAssignableFrom(operator.getClass())) {
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/OperatorUtils.java`
#### Snippet
```java
            StreamOperator<?> operator,
            Class<T> targetInterface,
            ThrowingConsumer<T, Exception> action) {
        try {
            if (targetInterface.isAssignableFrom(operator.getClass())) {
```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java

    private <IN> void processElement(
            StreamRecord<IterationRecord<IN>> element,
            int inputIndex,
            StreamRecord<IN> reusedInput,
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            StreamRecord<IN> reusedInput,
            ThrowingConsumer<StreamRecord<IN>, Exception> processor)
            throws Exception {

```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            StreamRecord<IN> reusedInput,
            ThrowingConsumer<StreamRecord<IN>, Exception> processor)
            throws Exception {

```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/MultipleInputAllRoundWrapperOperator.java`
#### Snippet
```java
            Input<IN> input,
            StreamRecord<IN> reusedInput,
            StreamRecord<IterationRecord<IN>> element)
            throws Exception {
        switch (element.getValue().getType()) {
```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/TwoInputPerRoundWrapperOperator.java`
#### Snippet
```java

    private <IN> void processElement(
            StreamRecord<IterationRecord<IN>> element,
            int inputIndex,
            StreamRecord<IN> reusedInput,
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/TwoInputPerRoundWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            StreamRecord<IN> reusedInput,
            ThrowingConsumer<StreamRecord<IN>, Exception> processor)
            throws Exception {

```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/TwoInputPerRoundWrapperOperator.java`
#### Snippet
```java
            int inputIndex,
            StreamRecord<IN> reusedInput,
            ThrowingConsumer<StreamRecord<IN>, Exception> processor)
            throws Exception {

```

### BoundedWildcard
Can generalize to `? extends IterationRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/headprocessor/TerminatingHeadOperatorRecordProcessor.java`
#### Snippet
```java

    @Override
    public boolean processFeedbackElement(StreamRecord<IterationRecord<?>> record) {
        if (record.getValue().getType() == IterationRecord.Type.EPOCH_WATERMARK) {
            return record.getValue().getEpoch() == Integer.MAX_VALUE + 1;
```

### BoundedWildcard
Can generalize to `? extends BroadcastOutput`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/CountingBroadcastOutput.java`
#### Snippet
```java

    public CountingBroadcastOutput(
            Counter numRecordsOut, List<BroadcastOutput<OUT>> internalOutputs) {
        this.numRecordsOut = numRecordsOut;
        this.internalOutputs = internalOutputs;
```

### BoundedWildcard
Can generalize to `? super StreamRecord`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/ChainingBroadcastOutput.java`
#### Snippet
```java
    private final OutputTag outputTag;

    ChainingBroadcastOutput(Output<StreamRecord<OUT>> rawOutput, OutputTag outputTag) {
        this.rawOutput = rawOutput;
        this.outputTag = outputTag;
```

### BoundedWildcard
Can generalize to `? super SerializationDelegate`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/RecordWriterBroadcastOutput.java`
#### Snippet
```java

    public RecordWriterBroadcastOutput(
            RecordWriter<SerializationDelegate<StreamElement>> recordWriter,
            TypeSerializer<StreamElement> typeSerializer) {

```

### BoundedWildcard
Can generalize to `? extends Executor`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/coordinator/SharedProgressAligner.java`
#### Snippet
```java
            int totalHeadParallelism,
            OperatorCoordinator.Context context,
            Supplier<Executor> executorFactory) {
        return instances.computeIfAbsent(
                iterationId,
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/FileSegmentWriter.java`
#### Snippet
```java
    private int count;

    FileSegmentWriter(TypeSerializer<T> serializer, Path path) throws IOException {
        this.serializer = serializer;
        this.path = path;
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/FileSegmentReader.java`
#### Snippet
```java
    private int count;

    FileSegmentReader(TypeSerializer<T> serializer, Segment segment, int startOffset)
            throws IOException {
        this.serializer = serializer;
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentReader.java`
#### Snippet
```java
    private int count;

    MemorySegmentReader(TypeSerializer<T> serializer, Segment segment, int startOffset)
            throws IOException {
        ManagedMemoryInputStream inputStream = new ManagedMemoryInputStream(segment.getCache());
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java

    protected void processForEachWrappedOperator(
            BiConsumerWithException<Integer, S, Exception> consumer) throws Exception {
        for (Map.Entry<Integer, S> entry : wrappedOperators.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? super S`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java

    protected void processForEachWrappedOperator(
            BiConsumerWithException<Integer, S, Exception> consumer) throws Exception {
        for (Map.Entry<Integer, S> entry : wrappedOperators.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends Exception`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java

    protected void processForEachWrappedOperator(
            BiConsumerWithException<Integer, S, Exception> consumer) throws Exception {
        for (Map.Entry<Integer, S> entry : wrappedOperators.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
```

### BoundedWildcard
Can generalize to `? extends T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    }

    private <T> void setKeyContextElement(StreamRecord<T> record, KeySelector<T, ?> selector)
            throws Exception {
        if (selector != null
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    }

    private <T> void setKeyContextElement(StreamRecord<T> record, KeySelector<T, ?> selector)
            throws Exception {
        if (selector != null
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentWriter.java`
#### Snippet
```java

    MemorySegmentWriter(
            TypeSerializer<T> serializer,
            Path path,
            MemorySegmentPool segmentPool,
```

### BoundedWildcard
Can generalize to `? extends TypeInformation`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
            DataStreamList dataStreams,
            DraftExecutionEnvironment draftEnv,
            List<TypeInformation<?>> typeInfos) {

        return new DataStreamList(
```

### BoundedWildcard
Can generalize to `? super Integer`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java

    private static <R> List<R> map(
            DataStreamList dataStreams, BiFunction<Integer, DataStream<?>, R> mapper) {
        List<R> results = new ArrayList<>(dataStreams.size());
        for (int i = 0; i < dataStreams.size(); ++i) {
```

### BoundedWildcard
Can generalize to `? super DataStream`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java

    private static <R> List<R> map(
            DataStreamList dataStreams, BiFunction<Integer, DataStream<?>, R> mapper) {
        List<R> results = new ArrayList<>(dataStreams.size());
        for (int i = 0; i < dataStreams.size(); ++i) {
```

### BoundedWildcard
Can generalize to `? extends R`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java

    private static <R> List<R> map(
            DataStreamList dataStreams, BiFunction<Integer, DataStream<?>, R> mapper) {
        List<R> results = new ArrayList<>(dataStreams.size());
        for (int i = 0; i < dataStreams.size(); ++i) {
```

### BoundedWildcard
Can generalize to `? super DataStream`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
    }

    private static <R> List<R> map(DataStreamList dataStreams, Function<DataStream<?>, R> mapper) {
        return map(dataStreams, (i, dataStream) -> mapper.apply(dataStream));
    }
```

### BoundedWildcard
Can generalize to `? extends R`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
    }

    private static <R> List<R> map(DataStreamList dataStreams, Function<DataStream<?>, R> mapper) {
        return map(dataStreams, (i, dataStream) -> mapper.apply(dataStream));
    }
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheReader.java`
#### Snippet
```java
    public DataCacheReader(
            TypeSerializer<T> serializer,
            List<Segment> segments,
            Tuple2<Integer, Integer> readerPosition) {
        this.serializer = serializer;
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
    }

    private static void serializeSegments(List<Segment> segments, DataOutputStream dataOutputStream)
            throws IOException {
        dataOutputStream.writeInt(segments.size());
```

### BoundedWildcard
Can generalize to `? extends Path`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
            InputStream checkpointInputStream,
            FileSystem fileSystem,
            SupplierWithException<Path, IOException> pathGenerator)
            throws IOException {
        try (DataInputStream dis =
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
            InputStream checkpointInputStream,
            FileSystem fileSystem,
            SupplierWithException<Path, IOException> pathGenerator)
            throws IOException {
        try (DataInputStream dis =
```

### BoundedWildcard
Can generalize to `? super T`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
            InputStream checkpointInputStream,
            TypeSerializer<T> serializer,
            FeedbackConsumer<T> feedbackConsumer)
            throws Exception {
        try (DataInputStream dis =
```

### BoundedWildcard
Can generalize to `? extends Path`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
            TypeSerializer<T> serializer,
            FileSystem fileSystem,
            SupplierWithException<Path, IOException> pathGenerator,
            @Nullable MemorySegmentPool segmentPool,
            List<Segment> priorFinishedSegments)
```

### BoundedWildcard
Can generalize to `? extends IOException`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
            TypeSerializer<T> serializer,
            FileSystem fileSystem,
            SupplierWithException<Path, IOException> pathGenerator,
            @Nullable MemorySegmentPool segmentPool,
            List<Segment> priorFinishedSegments)
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

    public Graph(
```

### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
    private final TableId[] modelInputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;

```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
    public final TableId[] outputIds;
    public final @Nullable TableId[] inputModelDataIds;
    public final @Nullable TableId[] outputModelDataIds;

    public GraphData(
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
public class GraphData {
    public final List<GraphNode> nodes;
    public final @Nullable TableId[] estimatorInputIds;
    public final TableId[] modelInputIds;
    public final TableId[] outputIds;
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphData.java`
#### Snippet
```java
    public final TableId[] modelInputIds;
    public final TableId[] outputIds;
    public final @Nullable TableId[] inputModelDataIds;
    public final @Nullable TableId[] outputModelDataIds;

```

### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;

```

### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
    private final TableId[] inputIds;
    private final TableId[] outputIds;
    private final @Nullable TableId[] inputModelDataIds;
    private final @Nullable TableId[] outputModelDataIds;
    private final GraphExecutionHelper executionHelper;
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public final TableId[] algoOpInputIds;
    public final TableId[] outputIds;
    public @Nullable TableId[] inputModelDataIds;
    public @Nullable TableId[] outputModelDataIds;

```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public @Nullable Stage<?> stage;
    public final StageType stageType;
    public final @Nullable TableId[] estimatorInputIds;
    public final TableId[] algoOpInputIds;
    public final TableId[] outputIds;
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java
    public final TableId[] outputIds;
    public @Nullable TableId[] inputModelDataIds;
    public @Nullable TableId[] outputModelDataIds;

    public GraphNode(
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphNode.java`
#### Snippet
```java

    public final int nodeId;
    public @Nullable Stage<?> stage;
    public final StageType stageType;
    public final @Nullable TableId[] estimatorInputIds;
```

### MissortedModifiers
Missorted modifiers `private final @Nullable`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/IterationBodyResult.java`
#### Snippet
```java
     * with the feedback variable streams to determine when the iteration should terminate.
     */
    private final @Nullable DataStream<?> terminationCriteria;

    public IterationBodyResult(
```

## RuleId[id=NullableProblems]
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
public class GraphData {
    public final List<GraphNode> nodes;
    public final @Nullable TableId[] estimatorInputIds;
    public final TableId[] modelInputIds;
    public final TableId[] outputIds;
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
    public final TableId[] outputIds;
    public @Nullable TableId[] inputModelDataIds;
    public @Nullable TableId[] outputModelDataIds;

    public GraphNode(
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
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/IterationBodyResult.java`
#### Snippet
```java
     * with the feedback variable streams to determine when the iteration should terminate.
     */
    private final @Nullable DataStream<?> terminationCriteria;

    public IterationBodyResult(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/ReplayOperator.java`
#### Snippet
```java
    private DataCacheWriter<T> dataCacheWriter;

    @Nullable private DataCacheReader<T> currentDataCacheReader;

    private int currentEpoch;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheReader.java`
#### Snippet
```java

    /** The current reader for next records. */
    @Nullable private SegmentReader<T> currentSegmentReader;

    /** The index of the segment that current reader reads from. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
#### Snippet
```java
     * segments from the beginning.
     */
    @Nullable private final Tuple2<Integer, Integer> readerPosition;

    /** The segments to be snapshot or recovered from. */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    /** The current writer for new records. */
    @Nullable private SegmentWriter<T> currentSegmentWriter;

    public DataCacheWriter(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java

    /** An optional pool that provide memory segments to hold cached records in memory. */
    @Nullable private final MemorySegmentPool segmentPool;

    /** The segments that contain previously added records. */
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static DataStreamList createIteration(
            DataStreamList initVariableStreams,
            DataStreamList dataStreams,
```

### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/OutputReflectionContext.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public RecordWriter<SerializationDelegate<StreamElement>> getRecordWriter(Object output) {
        return ReflectionUtils.getFieldValue(output, recordWriterField);
    }
```

### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/broadcast/OutputReflectionContext.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    public TypeSerializer<StreamElement> getRecordWriterTypeSerializer(Object output) {
        SerializationDelegate<StreamElement> serializationDelegate =
                ReflectionUtils.getFieldValue(output, recordWriterSerializationDelegateField);
```

### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/MultipleInputAllRoundWrapperOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public List<Input> getInputs() {
        List<Input> proxyInputs = new ArrayList<>();
        for (int i = 0; i < wrappedOperator.getInputs().size(); ++i) {
```

### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void setKeyContextElement1(StreamRecord record) throws Exception {
        setKeyContextElement(record, stateKeySelector1);
    }
```

### RedundantSuppression
Redundant suppression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void setKeyContextElement2(StreamRecord record) throws Exception {
        setKeyContextElement(record, stateKeySelector2);
    }
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/linearsvc/LinearSVC.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"rawTypes", "ConstantConditions"})
    public LinearSVCModel fit(Table... inputs) {
        Preconditions.checkArgument(inputs.length == 1);
        StreamTableEnvironment tEnv =
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/LogisticRegression.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"rawTypes", "ConstantConditions"})
    public LogisticRegressionModel fit(Table... inputs) {
        Preconditions.checkArgument(inputs.length == 1);
        String classificationType = getMultiClass();
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void initializeState(StateInitializationContext context) throws Exception {
            super.initializeState(context);
            accValueState =
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void snapshotState(StateSnapshotContext context) throws Exception {
            super.snapshotState(context);
            accValueState.clear();
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void initializeState(StateInitializationContext context) throws Exception {
            super.initializeState(context);
            summaryState =
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void snapshotState(StateSnapshotContext context) throws Exception {
            super.snapshotState(context);
            summaryState.clear();
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScaler.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void initializeState(StateInitializationContext context) throws Exception {
            super.initializeState(context);
            minState =
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/minmaxscaler/MinMaxScaler.java`
#### Snippet
```java
        @Override
        @SuppressWarnings("unchecked")
        public void snapshotState(StateSnapshotContext context) throws Exception {
            super.snapshotState(context);
            minState.clear();
```

### RedundantSuppression
Redundant suppression
in `flink-ml-lib/src/main/java/org/apache/flink/ml/regression/linearregression/LinearRegression.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"rawTypes", "ConstantConditions"})
    public LinearRegressionModel fit(Table... inputs) {
        Preconditions.checkArgument(inputs.length == 1);
        StreamTableEnvironment tEnv =
```

### RedundantSuppression
Redundant suppression
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/typeinfo/DenseMatrixTypeInfo.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public TypeSerializer<DenseMatrix> createSerializer(ExecutionConfig executionConfig) {
        return new DenseMatrixSerializer();
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/VectorToArrayExample.java`
#### Snippet
```java
            Vector vector = row.getFieldAs("vector");
            Double[] doubleArray = row.getFieldAs("array");
            System.out.printf(
                    "Input vector: %s\tOutput double array: %s\n",
                    vector, Arrays.toString(doubleArray));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorSlicerExample.java`
#### Snippet
```java
            Vector outputValue = (Vector) row.getField(vectorSlicer.getOutputCol());

            System.out.printf("Input Value: %s \tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/ArrayToVectorExample.java`
#### Snippet
```java
            Double[] doubleArray = row.getFieldAs("array");
            Vector vector = row.getFieldAs("vector");
            System.out.printf(
                    "Input double array: %s\tOutput vector: %s\n",
                    Arrays.toString(doubleArray), vector);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IDFExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(idf.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(idf.getOutputCol());
            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/stats/ChiSqTestExample.java`
#### Snippet
```java
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            System.out.printf(
                    "Feature Index: %s\tP Value: %s\tDegree of Freedom: %s\tStatistics: %s\n",
                    row.getField("featureIndex"),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ImputerExample.java`
#### Snippet
```java
                outputValues[i] = (double) row.getField(imputer.getOutputCols()[i]);
            }
            System.out.printf(
                    "Input Values: %s\tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VarianceThresholdSelectorExample.java`
#### Snippet
```java

        // Extracts and displays the results.
        System.out.printf("Variance Threshold: %s\n", threshold);
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VarianceThresholdSelectorExample.java`
#### Snippet
```java
            DenseVector outputValue =
                    (DenseVector) row.getField(varianceThresholdSelector.getOutputCol());
            System.out.printf("Input Values: %-15s\tOutput Values: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinMaxScalerExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(minMaxScaler.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(minMaxScaler.getOutputCol());
            System.out.printf("Input Value: %-15s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/NGramExample.java`
#### Snippet
```java
            String[] outputValue = (String[]) row.getField(nGram.getOutputCol());

            System.out.printf(
                    "Input Value: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValue), Arrays.toString(outputValue));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/HashingTFExample.java`
#### Snippet
```java
            SparseVector outputValue = (SparseVector) row.getField(hashingTF.getOutputCol());

            System.out.printf(
                    "Input Value: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValue.stream().toArray()), outputValue);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorIndexerExample.java`
#### Snippet
```java
        for (CloseableIterator<Row> it = outputTable.execute().collect(); it.hasNext(); ) {
            Row row = it.next();
            System.out.printf(
                    "Input Value: %s \tOutput Value: %s\n",
                    row.getField(vectorIndexer.getInputCol()),
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BinarizerExample.java`
#### Snippet
```java
            }

            System.out.printf(
                    "Input Values: %s\tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/OnlineStandardScalerExample.java`
#### Snippet
```java
                    (DenseVector) row.getField(onlineStandardScaler.getOutputCol());
            long modelVersion = row.getFieldAs(onlineStandardScaler.getModelVersionCol());
            System.out.printf(
                    "Input Value: %s\tOutput Value: %-65s\tModel Version: %s\n",
                    inputValue, outputValue, modelVersion);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/PolynomialExpansionExample.java`
#### Snippet
```java
            Vector outputValue = (Vector) row.getField(polynomialExpansion.getOutputCol());

            System.out.printf("Input Value: %s \tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/CountVectorizerExample.java`
#### Snippet
```java
            String[] inputValue = (String[]) row.getField(countVectorizer.getInputCol());
            SparseVector outputValue = (SparseVector) row.getField(countVectorizer.getOutputCol());
            System.out.printf(
                    "Input Value: %-15s \tOutput Value: %s\n",
                    Arrays.toString(inputValue), outputValue.toString());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/NormalizerExample.java`
#### Snippet
```java
            Vector outputValue = (Vector) row.getField(normalizer.getOutputCol());

            System.out.printf("Input Value: %s \tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StopWordsRemoverExample.java`
#### Snippet
```java
            String[] outputValues = row.getFieldAs("output");

            System.out.printf(
                    "Input Values: %s\tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/IndexToStringModelExample.java`
#### Snippet
```java
            }

            System.out.printf(
                    "Input Values: %s \tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RegexTokenizerExample.java`
#### Snippet
```java
            String[] outputValues = (String[]) row.getField(regexTokenizer.getOutputCol());

            System.out.printf(
                    "Input Value: %s \tOutput Values: %s\n",
                    inputValue, Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/TokenizerExample.java`
#### Snippet
```java
            String[] outputValues = (String[]) row.getField(tokenizer.getOutputCol());

            System.out.printf(
                    "Input Value: %s \tOutput Values: %s\n",
                    inputValue, Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/InteractionExample.java`
#### Snippet
```java
            }
            Vector outputValue = (Vector) row.getField(interaction.getOutputCol());
            System.out.printf(
                    "Input Values: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValues), outputValue);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/BucketizerExample.java`
#### Snippet
```java
            }

            System.out.printf(
                    "Input Values: %s\tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/FeatureHasherExample.java`
#### Snippet
```java
            Vector outputValue = (Vector) row.getField(featureHash.getOutputCol());

            System.out.printf(
                    "Input Values: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValues), outputValue);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StandardScalerExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(standardScaler.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(standardScaler.getOutputCol());
            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/VectorAssemblerExample.java`
#### Snippet
```java
            Vector outputValue = (Vector) row.getField(vectorAssembler.getOutputCol());

            System.out.printf(
                    "Input Values: %s \tOutput Value: %s\n",
                    Arrays.toString(inputValues), outputValue);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MaxAbsScalerExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(maxAbsScaler.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(maxAbsScaler.getOutputCol());
            System.out.printf("Input Value: %-15s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StringIndexerExample.java`
#### Snippet
```java
            }

            System.out.printf(
                    "Input Values: %s \tOutput Values: %s\n",
                    Arrays.toString(inputValues), Arrays.toString(outputValues));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/DCTExample.java`
#### Snippet
```java
            Vector outputValue = row.getFieldAs(dct.getOutputCol());

            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/KBinsDiscretizerExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(kBinsDiscretizer.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(kBinsDiscretizer.getOutputCol());
            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RobustScalerExample.java`
#### Snippet
```java
            DenseVector inputValue = (DenseVector) row.getField(robustScaler.getInputCol());
            DenseVector outputValue = (DenseVector) row.getField(robustScaler.getOutputCol());
            System.out.printf("Input Value: %-15s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/ElementwiseProductExample.java`
#### Snippet
```java
            Vector inputValue = (Vector) row.getField(elementwiseProduct.getInputCol());
            Vector outputValue = (Vector) row.getField(elementwiseProduct.getOutputCol());
            System.out.printf("Input Value: %s \tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/UnivariateFeatureSelectorExample.java`
#### Snippet
```java
            DenseVector outputValue =
                    (DenseVector) row.getField(univariateFeatureSelector.getOutputCol());
            System.out.printf("Input Value: %-15s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
            Vector inputValue = result.getFieldAs(fieldNames.indexOf(lsh.getInputCol()));
            DenseVector[] outputValue = result.getFieldAs(fieldNames.indexOf(lsh.getOutputCol()));
            System.out.printf(
                    "Vector: %s \tHash values: %s\n", inputValue, Arrays.toString(outputValue));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
            int idValue = result.getFieldAs(fieldNames.indexOf("id"));
            double distValue = result.getFieldAs(result.getArity() - 1);
            System.out.printf("ID: %d \tDistance: %f\n", idValue, distValue);
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/MinHashLSHExample.java`
#### Snippet
```java
            int idBValue = result.getFieldAs(1);
            double distValue = result.getFieldAs(2);
            System.out.printf(
                    "ID from left: %d \tID from right: %d \t Distance: %f\n",
                    idAValue, idBValue, distValue);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RandomSplitterExample.java`
#### Snippet
```java

        // Extracts and displays the results.
        System.out.println("Split Result 1 (40%)");
        for (CloseableIterator<Row> it = outputTable[0].execute().collect(); it.hasNext(); ) {
            System.out.printf("%s\n", it.next());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RandomSplitterExample.java`
#### Snippet
```java
        System.out.println("Split Result 1 (40%)");
        for (CloseableIterator<Row> it = outputTable[0].execute().collect(); it.hasNext(); ) {
            System.out.printf("%s\n", it.next());
        }
        System.out.println("Split Result 2 (60%)");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RandomSplitterExample.java`
#### Snippet
```java
            System.out.printf("%s\n", it.next());
        }
        System.out.println("Split Result 2 (60%)");
        for (CloseableIterator<Row> it = outputTable[1].execute().collect(); it.hasNext(); ) {
            System.out.printf("%s\n", it.next());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/RandomSplitterExample.java`
#### Snippet
```java
        System.out.println("Split Result 2 (60%)");
        for (CloseableIterator<Row> it = outputTable[1].execute().collect(); it.hasNext(); ) {
            System.out.printf("%s\n", it.next());
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/regression/LinearRegressionExample.java`
#### Snippet
```java
            double expectedResult = (Double) row.getField(lr.getLabelCol());
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            System.out.printf(
                    "Features: %s \tExpected Result: %s \tPrediction Result: %s\n",
                    features, expectedResult, predictionResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/OneHotEncoderExample.java`
#### Snippet
```java
            SparseVector outputValue =
                    (SparseVector) row.getField(oneHotEncoder.getOutputCols()[0]);
            System.out.printf("Input Value: %s\tOutput Value: %s\n", inputValue, outputValue);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/AgglomerativeClusteringExample.java`
#### Snippet
```java
                    (DenseVector) row.getField(agglomerativeClustering.getFeaturesCol());
            int clusterId = (Integer) row.getField(agglomerativeClustering.getPredictionCol());
            System.out.printf("Features: %s \tCluster ID: %s\n", features, clusterId);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/evaluation/BinaryClassificationEvaluatorExample.java`
#### Snippet
```java
        // Extracts and displays the results.
        Row evaluationResult = outputTable.execute().collect().next();
        System.out.printf(
                "Area under the precision-recall curve: %s\n",
                evaluationResult.getField(BinaryClassificationEvaluatorParams.AREA_UNDER_PR));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/evaluation/BinaryClassificationEvaluatorExample.java`
#### Snippet
```java
                "Area under the precision-recall curve: %s\n",
                evaluationResult.getField(BinaryClassificationEvaluatorParams.AREA_UNDER_PR));
        System.out.printf(
                "Area under the receiver operating characteristic curve: %s\n",
                evaluationResult.getField(BinaryClassificationEvaluatorParams.AREA_UNDER_ROC));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/evaluation/BinaryClassificationEvaluatorExample.java`
#### Snippet
```java
                "Area under the receiver operating characteristic curve: %s\n",
                evaluationResult.getField(BinaryClassificationEvaluatorParams.AREA_UNDER_ROC));
        System.out.printf(
                "Kolmogorov-Smirnov value: %s\n",
                evaluationResult.getField(BinaryClassificationEvaluatorParams.KS));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/OnlineKMeansExample.java`
#### Snippet
```java
            Integer clusterId2 = (Integer) row2.getField(onlineKMeans.getPredictionCol());
            if (Objects.equals(clusterId1, clusterId2)) {
                System.out.printf("%s and %s are now in the same cluster.\n", features1, features2);
            } else {
                System.out.printf(
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/OnlineKMeansExample.java`
#### Snippet
```java
                System.out.printf("%s and %s are now in the same cluster.\n", features1, features2);
            } else {
                System.out.printf(
                        "%s and %s are now in different clusters.\n", features1, features2);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/clustering/KMeansExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(kmeans.getFeaturesCol());
            int clusterId = (Integer) row.getField(kmeans.getPredictionCol());
            System.out.printf("Features: %s \tCluster ID: %s\n", features, clusterId);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LinearSVCExample.java`
#### Snippet
```java
            DenseVector rawPredictionResult =
                    (DenseVector) row.getField(linearSVC.getRawPredictionCol());
            System.out.printf(
                    "Features: %-25s \tExpected Result: %s \tPrediction Result: %s \tRaw Prediction Result: %s\n",
                    features, expectedResult, predictionResult, rawPredictionResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/OnlineLogisticRegressionExample.java`
#### Snippet
```java
            Double predictionResult = (Double) row.getField(olr.getPredictionCol());
            DenseVector rawPredictionResult = (DenseVector) row.getField(olr.getRawPredictionCol());
            System.out.printf(
                    "Features: %-25s \tExpected Result: %s \tPrediction Result: %s \tRaw Prediction Result: %s\n",
                    features, expectedResult, predictionResult, rawPredictionResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/recommendation/SwingExample.java`
#### Snippet
```java
            String itemRankScore = row.getFieldAs(1);

            System.out.printf("item: %d, top-k similar items: %s\n", mainItem, itemRankScore);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/LogisticRegressionExample.java`
#### Snippet
```java
            double predictionResult = (Double) row.getField(lr.getPredictionCol());
            DenseVector rawPredictionResult = (DenseVector) row.getField(lr.getRawPredictionCol());
            System.out.printf(
                    "Features: %-25s \tExpected Result: %s \tPrediction Result: %s \tRaw Prediction Result: %s\n",
                    features, expectedResult, predictionResult, rawPredictionResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/KnnExample.java`
#### Snippet
```java
            double expectedResult = (Double) row.getField(knn.getLabelCol());
            double predictionResult = (Double) row.getField(knn.getPredictionCol());
            System.out.printf(
                    "Features: %-15s \tExpected Result: %s \tPrediction Result: %s\n",
                    features, expectedResult, predictionResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/classification/NaiveBayesExample.java`
#### Snippet
```java
            DenseVector features = (DenseVector) row.getField(naiveBayes.getFeaturesCol());
            double predictionResult = (Double) row.getField(naiveBayes.getPredictionCol());
            System.out.printf("Features: %s \tPrediction Result: %s\n", features, predictionResult);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
            executeBenchmarks(commandLine);
        } else {
            System.out.printf("Invalid command line arguments %s\n\n", Arrays.toString(args));
            System.out.println(
                    "Specify the help option (-h or --help) to get help on the command.");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
        } else {
            System.out.printf("Invalid command line arguments %s\n\n", Arrays.toString(args));
            System.out.println(
                    "Specify the help option (-h or --help) to get help on the command.");
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
        Map<String, Map<String, Map<String, ?>>> benchmarks =
                BenchmarkUtils.parseJsonFile(configFile);
        System.out.printf("Found %d benchmarks.\n", benchmarks.keySet().size());
        String saveFile = commandLine.getOptionValue(OUTPUT_FILE_OPTION.getLongOpt());

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
            }
        }
        System.out.println("Benchmarks execution completed.");

        String benchmarkResultsJson =
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
        if (commandLine.hasOption(OUTPUT_FILE_OPTION.getLongOpt())) {
            FileUtils.saveToFile(saveFile, benchmarkResultsJson, true);
            System.out.printf("Benchmark results saved as json in %s.\n", saveFile);
        } else {
            System.out.printf("Benchmark results summary:\n%s\n", benchmarkResultsJson);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
            System.out.printf("Benchmark results saved as json in %s.\n", saveFile);
        } else {
            System.out.printf("Benchmark results summary:\n%s\n", benchmarkResultsJson);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
        formatter.setWidth(80);

        System.out.println("./benchmark-run.sh <config-file-path> [OPTIONS]\n");
        formatter.setSyntaxPrefix("The following options are available:");
        formatter.printHelp(" ", OPTIONS);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/Benchmark.java`
#### Snippet
```java
        formatter.printHelp(" ", OPTIONS);

        System.out.println();
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `setup()` only delegates to its super method
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/TailOperator.java`
#### Snippet
```java

    @Override
    public void setup(
            StreamTask<?, ?> containingTask,
            StreamConfig config,
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

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/util/PeriodicSourceFunction.java`
#### Snippet
```java
    @Override
    public void run(SourceFunction.SourceContext<Row> sourceContext) throws Exception {
        while (isRunning) {
            for (Row data : this.data.get(index)) {
                sourceContext.collect(data);
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/tokenizer/Tokenizer.java`
#### Snippet
```java
    public static class TokenizerUdf extends ScalarFunction {
        public String[] eval(String input) {
            return input.toLowerCase().split("\\s");
        }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/sqltransformer/SQLTransformer.java`
#### Snippet
```java
        StreamTableEnvironment tEnv =
                (StreamTableEnvironment) ((TableImpl) inputs[0]).getTableEnvironment();
        String statement = getStatement().replace(TABLE_IDENTIFIER, inputs[0].toString());

        Table outputTable = tEnv.sqlQuery(statement);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/sqltransformer/SQLTransformer.java`
#### Snippet
```java
            if (e instanceof TableException
                    && e.getMessage() != null
                    && e.getMessage().matches(INSERT_ONLY_EXCEPTION_PATTERN)) {
                return false;
            }
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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `dev.ludovic.netlib` is unnecessary, and can be replaced with an import
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/linalg/BLAS.java`
#### Snippet
```java
    /** For level-1 function dspmv, use javaBLAS for better performance. */
    private static final dev.ludovic.netlib.BLAS JAVA_BLAS =
            dev.ludovic.netlib.JavaBLAS.getInstance();

    /** \sum_i |x_i| . */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/CoGroupOperator.java`
#### Snippet
```java

    private static class TupleUnwrappingIterator<T, K>
            implements Iterator<T>, Iterable<T>, java.io.Serializable {

        private static final long serialVersionUID = 1L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common` is unnecessary and can be removed
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java
     * {@link org.apache.flink.api.common.accumulators.Accumulator} specified by {@link
     * #COUNTER_NAME} and can be acquired by {@link
     * org.apache.flink.api.common.JobExecutionResult#getAccumulatorResult(String)}.
     *
     * @param <T> The type of elements received by the sink.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueTypeInfo.java`
#### Snippet
```java

/**
 * TypeInformation for {@link java.util.PriorityQueue}.
 *
 * @param <T> The type of elements in the PriorityQueue.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/typeinfo/PriorityQueueSerializer.java`
#### Snippet
```java

/**
 * TypeSerializer for {@link java.util.PriorityQueue}.
 *
 * @param <T> The type of elements in the PriorityQueue.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java
    /**
     * Checks whether the QuantileSummary has inserted rows. Running query on an empty
     * QuantileSummary would cause {@link java.lang.IllegalStateException}.
     *
     * @return True if the QuantileSummary is empty, otherwise false.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.shaded.guava30.com.google.common.hash` is unnecessary, and can be replaced with an import
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/hashingtf/HashingTF.java`
#### Snippet
```java
    private final Map<Param<?>, Object> paramMap = new HashMap<>();

    private static final org.apache.flink.shaded.guava30.com.google.common.hash.HashFunction
            HASH_FUNC = murmur3_32(0);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.flink.api.common.functions` is unnecessary and can be removed
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
     * DataStream. It groups each DataStream individually on a key and gives groups of both
     * DataStreams with equal keys together into a {@link
     * org.apache.flink.api.common.functions.CoGroupFunction}. If a DataStream has a group with no
     * matching key in the other DataStream, the CoGroupFunction is called with an empty group for
     * the non-existing group.
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`nextSample.delta = nextSample.delta + additionalDelta` could be simplified to 'nextSample.delta += additionalDelta'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java
                }
                nextSample = nextSample.shallowCopy();
                nextSample.delta = nextSample.delta + additionalDelta;
                mergedSampled.add(nextSample);
            }
```

### ReplaceAssignmentWithOperatorAssignment
`head.g = head.g + tuple.g` could be simplified to 'head.g += tuple.g'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java
            if (tuple.g + head.g + head.delta < mergeThreshold) {
                head = head.shallowCopy();
                head.g = head.g + tuple.g;
            } else {
                result.addFirst(head);
```

### ReplaceAssignmentWithOperatorAssignment
`targetError = targetError / 2` could be simplified to 'targetError /= 2'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/util/QuantileSummary.java`
#### Snippet
```java
            targetError = Math.max(targetError, (tuple.delta + tuple.g));
        }
        targetError = targetError / 2;
        Map<Double, Integer> zipWithIndex = new HashMap<>(percentiles.length);
        IntStream.range(0, percentiles.length).forEach(i -> zipWithIndex.put(percentiles[i], i));
```

### ReplaceAssignmentWithOperatorAssignment
`weights.values[i] = weights.values[i] + counts[i]` could be simplified to 'weights.values\[i\] += counts\[i\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeans.java`
#### Snippet
```java

                DenseVector centroid = centroids[i];
                weights.values[i] = weights.values[i] + counts[i];
                double lambda = counts[i] / weights.values[i];

```

### ReplaceAssignmentWithOperatorAssignment
`g[i] = g[i] / gradientInfo[1].values[i]` could be simplified to 'g\[i\] /= gradientInfo\[1\].values\[i\]'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegression.java`
#### Snippet
```java
            for (int i = 0; i < g.length; ++i) {
                if (gradientInfo[1].values[i] != 0.0) {
                    g[i] = g[i] / gradientInfo[1].values[i];
                }
            }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/util/FileUtils.java`
#### Snippet
```java
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(metadataPath)))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.startsWith("#")) {
                    buffer.append(line);
```

### NestedAssignment
Result of assignment expression used
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/Graph.java`
#### Snippet
```java
        // Iterates until we have executed all ready nodes.
        GraphNode node;
        while ((node = executionHelper.pollNextReadyNode()) != null) {
            Stage<?> stage = node.stage;
            // Invokes fit(...) if stageType == ESTIMATOR.
```

### NestedAssignment
Result of assignment expression used
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphModel.java`
#### Snippet
```java
        // Iterates until we have executed all ready nodes.
        GraphNode node;
        while ((node = executionHelper.pollNextReadyNode()) != null) {
            Stage<?> stage = node.stage;
            // Invokes fit(...) if stageType == ESTIMATOR.
```

### NestedAssignment
Result of assignment expression used
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java

        byte next;
        while ((next = source.readByte()) < 0) {
            value |= (((long) (next & 0x7f)) << offset);
            offset += 7;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
        public void processWatermark(Watermark mark) throws Exception {
            processForEachWrappedOperator(
                    (round, wrappedOperator) -> {
                        operatorInputsByEpoch.get(round).get(inputIndex).processWatermark(mark);
                    });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/MultipleInputPerRoundWrapperOperator.java`
#### Snippet
```java
        public void processWatermarkStatus(WatermarkStatus watermarkStatus) throws Exception {
            processForEachWrappedOperator(
                    (round, wrappedOperator) -> {
                        operatorInputsByEpoch
                                .get(round)
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `InputTableGenerator()` of an abstract class should not be declared 'public'
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/datagenerator/common/InputTableGenerator.java`
#### Snippet
```java
    protected final Map<Param<?>, Object> paramMap = new HashMap<>();

    public InputTableGenerator() {
        ParamUtils.initializeMapWithDefaultValues(paramMap, this);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `RowGenerator()` of an abstract class should not be declared 'public'
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/datagenerator/common/RowGenerator.java`
#### Snippet
```java
    private Row[] preGeneratedRows;

    public RowGenerator(long numValues, long initSeed) {
        this.numValues = numValues;
        this.initSeed = initSeed;
```

### NonProtectedConstructorInAbstractClass
Constructor `LSH()` of an abstract class should not be declared 'public'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSH.java`
#### Snippet
```java
    private final Map<Param<?>, Object> paramMap = new HashMap<>();

    public LSH() {
        ParamUtils.initializeMapWithDefaultValues(paramMap, this);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `LSHModel()` of an abstract class should not be declared 'public'
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
    protected Table modelDataTable;

    public LSHModel(Class<? extends LSHModelData> modelDataClass) {
        this.modelDataClass = modelDataClass;
        ParamUtils.initializeMapWithDefaultValues(paramMap, this);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWrapperOperator()` of an abstract class should not be declared 'public'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/AbstractWrapperOperator.java`
#### Snippet
```java
    protected final BroadcastOutput<IterationRecord<T>> eventBroadcastOutput;

    public AbstractWrapperOperator(
            StreamOperatorParameters<IterationRecord<T>> parameters,
            StreamOperatorFactory<T> operatorFactory) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractAllRoundWrapperOperator()` of an abstract class should not be declared 'public'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/AbstractAllRoundWrapperOperator.java`
#### Snippet
```java

    @SuppressWarnings({"unchecked", "rawtypes"})
    public AbstractAllRoundWrapperOperator(
            StreamOperatorParameters<IterationRecord<T>> parameters,
            StreamOperatorFactory<T> operatorFactory) {
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractPerRoundWrapperOperator()` of an abstract class should not be declared 'public'
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    private ListState<Integer> rawStateEpochState;

    public AbstractPerRoundWrapperOperator(
            StreamOperatorParameters<IterationRecord<T>> parameters,
            StreamOperatorFactory<T> operatorFactory) {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new MapFunction, Tuple3\>() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
            DataStream<Tuple3<DenseVector, long[], DenseVector>> output =
                    datastream.map(
                            new MapFunction<List<Row>, Tuple3<DenseVector, long[], DenseVector>>() {
                                @Override
                                public Tuple3<DenseVector, long[], DenseVector> map(
```

### Convert2Lambda
Anonymous new MapPartitionFunction\< Tuple4,... can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/fvaluetest/FValueTest.java`
#### Snippet
```java
                    DataStreamUtils.mapPartition(
                            dataStream,
                            new MapPartitionFunction<
                                    Tuple4<Integer, Double, Long, Double>,
                                    Tuple3<DenseVector, long[], DenseVector>>() {
                                @Override
                                public void mapPartition(
```

### Convert2Lambda
Anonymous new KeySelector\>() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                DataStreamUtils.reduce(
                        sameBucketPairs.keyBy(
                                new KeySelector<Row, Tuple2<Integer, Integer>>() {
                                    @Override
                                    public Tuple2<Integer, Integer> getKey(Row r) {
```

### Convert2Lambda
Anonymous new MapFunction\>() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModelData.java`
#### Snippet
```java
        return tEnv.toDataStream(modelData)
                .map(
                        new MapFunction<Row, Tuple2<Integer, Integer>>() {
                            @Override
                            public Tuple2<Integer, Integer> map(Row row) {
```

### Convert2Lambda
Anonymous new MapPartitionFunction() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/kbinsdiscretizer/KBinsDiscretizer.java`
#### Snippet
```java
                DataStreamUtils.mapPartition(
                        preprocessedData,
                        new MapPartitionFunction<DenseVector, KBinsDiscretizerModelData>() {
                            @Override
                            public void mapPartition(
```

### Convert2Lambda
Anonymous new MapPartitionFunction() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeans.java`
#### Snippet
```java
                DataStreamUtils.mapPartition(
                        DataStreamUtils.sample(data, k, seed),
                        new MapPartitionFunction<DenseVector, DenseVector[]>() {
                            @Override
                            public void mapPartition(
```

### Convert2Lambda
Anonymous new MapFunction\>() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/knn/Knn.java`
#### Snippet
```java
            DataStream<Row> inputData) {
        return inputData.map(
                new MapFunction<Row, Tuple3<DenseVector, Double, Double>>() {
                    @Override
                    public Tuple3<DenseVector, Double, Double> map(Row value) {
```

### Convert2Lambda
Anonymous new MapPartitionFunction, double\[\]\>() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
                DataStreamUtils.mapPartition(
                        evalData,
                        new MapPartitionFunction<Tuple3<Double, Boolean, Double>, double[]>() {
                            @Override
                            public void mapPartition(
```

### Convert2Lambda
Anonymous new MapPartitionFunction() can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
                DataStreamUtils.mapPartition(
                        sampleScoreStream,
                        new MapPartitionFunction<double[], double[]>() {
                            @Override
                            public void mapPartition(
```

### Convert2Lambda
Anonymous new MapPartitionFunction\< Tuple4, ... can be replaced with lambda
in `flink-ml-lib/src/main/java/org/apache/flink/ml/evaluation/binaryclassification/BinaryClassificationEvaluator.java`
#### Snippet
```java
                DataStreamUtils.mapPartition(
                        evalDataWithTaskId,
                        new MapPartitionFunction<
                                Tuple4<Double, Boolean, Double, Integer>,
                                Tuple3<Double, Boolean, Double>>() {
                            @Override
                            public void mapPartition(
```

### Convert2Lambda
Anonymous new MapFunction, T\[\]\>() can be replaced with lambda
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
                .partitionCustom((chunkId, numPartitions) -> chunkId, x -> x.f0)
                .map(
                        new MapFunction<Tuple2<Integer, T[]>, T[]>() {
                            @Override
                            public T[] map(Tuple2<Integer, T[]> integerTuple2) throws Exception {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/AllReduceImpl.java`
#### Snippet
```java
            extends RichFlatMapFunction<double[], Tuple3<Integer, Integer, double[]>> {

        private boolean hasReceivedOneRecord = false;

        private double[] transferBuffer = new double[CHUNK_SIZE];
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphBuilder.java`
#### Snippet
```java
    private int nextTableId = 0;

    private int nextNodeId = 0;

    /** An ordered list of nodes in the graph. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/GraphBuilder.java`
#### Snippet
```java
    private int maxOutputLength = 20;

    private int nextTableId = 0;

    private int nextNodeId = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/util/PeriodicSourceFunction.java`
#### Snippet
```java
    private final List<List<Row>> data;

    private int index = 0;

    private boolean isRunning = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/common/optimizer/SGD.java`
#### Snippet
```java

        /** The start index (offset) of the next mini-batch data for training. */
        private int nextBatchOffset = 0;

        private ListState<Integer> nextBatchOffsetState;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java

        double sampleSize = 0;
        int numLabels = 0;
        HashMap<Integer, Integer> index2NumCategories = new HashMap<>();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java
        private final Map<Tuple2<Integer, Double>, Long> labelMargins = new HashMap<>();

        double sampleSize = 0;
        int numLabels = 0;
        HashMap<Integer, Integer> index2NumCategories = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
        private final boolean dropLast;
        private final String broadcastModelKey;
        private List<Tuple2<Integer, Integer>> model = null;

        public GenerateOutputsFunction(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/variancethresholdselector/VarianceThresholdSelectorModel.java`
#### Snippet
```java
        private final String broadcastKey;
        private int expectedNumOfFeatures;
        private int[] indices = null;

        public PredictOutputFunction(String inputCol, String broadcastKey) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/OnlineKMeansModel.java`
#### Snippet
```java
        // TODO: replace this simple implementation of model data version with the formal API to
        // track model version after its design is settled.
        private int modelDataVersion = 0;

        public PredictLabelOperator(
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/naivebayes/NaiveBayesModel.java`
#### Snippet
```java
        private final String featuresCol;
        private final String broadcastModelKey;
        private NaiveBayesModelData modelData = null;

        public PredictLabelFunction(String featuresCol, String broadcastModelKey) {
```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-ml-lib/src/main/java/org/apache/flink/ml/classification/logisticregression/OnlineLogisticRegressionModel.java`
#### Snippet
```java
        private ListState<Row> bufferedPointsState;
        private DenseVector coefficient;
        private long modelDataVersion = 0L;
        private LogisticRegressionModelServable servable;

```

### RedundantFieldInitialization
Field initialization to `0L` is redundant
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/Segment.java`
#### Snippet
```java
     * not been written to the given path.
     */
    private long fsSize = 0L;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `input`
in `flink-ml-servable-core/src/main/java/org/apache/flink/ml/servable/builder/PipelineModelServable.java`
#### Snippet
```java
    public DataFrame transform(DataFrame input) {
        for (TransformerServable<?> servable : servables) {
            input = servable.transform(input);
        }
        return input;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/BytesKeyNormalizationUtil.java`
#### Snippet
```java
            putBytesArray(target, offset, dataLength, data);
            int lastOffset = offset + numBytes;
            offset += dataLength;
            long valueOfTimestamp = record.f1.asRecord().getTimestamp() - Long.MIN_VALUE;
            if (dataLength + FixedLengthByteKeyComparator.TIMESTAMP_BYTE_SIZE <= numBytes) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/BytesKeyNormalizationUtil.java`
#### Snippet
```java
                // whole timestamp fits into the normalized key
                target.putLong(offset, valueOfTimestamp);
                offset += FixedLengthByteKeyComparator.TIMESTAMP_BYTE_SIZE;
                // fill in the remaining space with zeros
                while (offset < lastOffset) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/BytesKeyNormalizationUtil.java`
#### Snippet
```java
                // fill in the remaining space with zeros
                while (offset < lastOffset) {
                    target.put(offset++, (byte) 0);
                }
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/BytesKeyNormalizationUtil.java`
#### Snippet
```java
            } else {
                // only part of the timestamp fits into normalized key
                for (int i = 0; offset < lastOffset; offset++, i++) {
                    target.put(offset, (byte) (valueOfTimestamp >>> ((7 - i) << 3)));
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `inputs`
in `flink-ml-core/src/main/java/org/apache/flink/ml/builder/PipelineModel.java`
#### Snippet
```java
    public Table[] transform(Table... inputs) {
        for (Stage<?> stage : stages) {
            inputs = ((AlgoOperator<?>) stage).transform(inputs);
        }
        return inputs;
```

### AssignmentToMethodParameter
Assignment to method parameter `acc`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
            int numOfFeatures = features.size();
            if (acc.length == 0) {
                acc = new Tuple3[features.size()];
                for (int i = 0; i < numOfFeatures; i++) {
                    acc[i] = Tuple3.of(0.0, 0.0, new HashMap<>());
```

### AssignmentToMethodParameter
Assignment to method parameter `dataTable`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/lsh/LSHModel.java`
#### Snippet
```java
                (StreamTableEnvironment) ((TableImpl) dataTable).getTableEnvironment();

        dataTable =
                (dataTable.getResolvedSchema().getColumnNames().contains(getOutputCol()))
                        ? dataTable
```

### AssignmentToMethodParameter
Assignment to method parameter `quantileSummaries`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/robustscaler/RobustScaler.java`
#### Snippet
```java
        public QuantileSummary[] add(DenseVector denseVector, QuantileSummary[] quantileSummaries) {
            if (quantileSummaries.length == 0) {
                quantileSummaries = new QuantileSummary[denseVector.size()];
                for (int i = 0; i < denseVector.size(); i++) {
                    quantileSummaries[i] = new QuantileSummary(relativeError);
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/regextokenizer/RegexTokenizer.java`
#### Snippet
```java
                int minTokenLength) {
            Pattern regPattern = Pattern.compile(pattern);
            input = toLowercase ? input.toLowerCase() : input;

            List<String> tokens = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/agglomerativeclustering/AgglomerativeClustering.java`
#### Snippet
```java
                int p = n;
                while (parent[n] != -1) {
                    n = parent[n];
                }
                while (parent[p] != n && parent[p] != -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java
            while (value > 0x7F) {
                target.writeByte((byte) ((value & 0x7F) | 0x80));
                value >>>= 7;
            }
            target.writeByte((byte) (value & 0x7F));
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentReader.java`
#### Snippet
```java

                readLen += currentLen;
                off += currentLen;
                len -= currentLen;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentReader.java`
#### Snippet
```java
                readLen += currentLen;
                off += currentLen;
                len -= currentLen;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentWriter.java`
#### Snippet
```java
                    segmentOffset = 0;
                }
                off += currentLen;
                len -= currentLen;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/MemorySegmentWriter.java`
#### Snippet
```java
                }
                off += currentLen;
                len -= currentLen;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `function`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    public static <IN, OUT, W extends Window> SingleOutputStreamOperator<OUT> windowAllAndProcess(
            DataStream<IN> input, Windows windows, ProcessAllWindowFunction<IN, OUT, W> function) {
        function = input.getExecutionEnvironment().clean(function);
        AllWindowedStream<IN, W> allWindowedStream = getAllWindowedStream(input, windows);
        return allWindowedStream.process(function);
```

### AssignmentToMethodParameter
Assignment to method parameter `func`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    public static <T> DataStream<T> reduce(
            DataStream<T> input, ReduceFunction<T> func, TypeInformation<T> outType) {
        func = input.getExecutionEnvironment().clean(func);
        DataStream<T> partialReducedStream =
                input.transform("reduce", outType, new ReduceOperator<>(func))
```

### AssignmentToMethodParameter
Assignment to method parameter `function`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
            ProcessAllWindowFunction<IN, OUT, W> function,
            TypeInformation<OUT> outType) {
        function = input.getExecutionEnvironment().clean(function);
        AllWindowedStream<IN, W> allWindowedStream = getAllWindowedStream(input, windows);
        return allWindowedStream.process(function, outType);
```

### AssignmentToMethodParameter
Assignment to method parameter `func`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
            TypeInformation<OUT> outTypeInformation,
            CoGroupFunction<IN1, IN2, OUT> func) {
        func = input1.getExecutionEnvironment().clean(func);
        DataStream<OUT> result =
                input1.connect(input2)
```

### AssignmentToMethodParameter
Assignment to method parameter `func`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
            TypeInformation<ACC> accType,
            TypeInformation<OUT> outType) {
        func = input.getExecutionEnvironment().clean(func);
        DataStream<ACC> partialAggregatedStream =
                input.transform(
```

### AssignmentToMethodParameter
Assignment to method parameter `func`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
            MapPartitionFunction<IN, OUT> func,
            TypeInformation<OUT> outType) {
        func = input.getExecutionEnvironment().clean(func);
        return input.transform("mapPartition", outType, new MapPartitionOperator<>(func))
                .setParallelism(input.getParallelism());
```

### AssignmentToMethodParameter
Assignment to method parameter `func`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
    public static <T, K> DataStream<T> reduce(
            KeyedStream<T, K> input, ReduceFunction<T> func, TypeInformation<T> outType) {
        func = input.getExecutionEnvironment().clean(func);
        return input.transform(
                        "Keyed Reduce",
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

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/BroadcastVariableReceiverOperatorFactory.java`
#### Snippet
```java
/** Factory class for {@link BroadcastVariableReceiverOperator}. */
public class BroadcastVariableReceiverOperatorFactory<OUT>
        extends AbstractStreamOperatorFactory<OUT> implements Serializable {

    /** Names of the broadcast data streams. */
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/operator/BroadcastVariableReceiverOperator.java`
#### Snippet
```java
/** The operator that process all broadcast inputs and stores them in {@link BroadcastContext}. */
public class BroadcastVariableReceiverOperator<OUT> extends AbstractStreamOperatorV2<OUT>
        implements MultipleInputStreamOperator<OUT>, BoundedMultiInput, Serializable {

    /** Names of the broadcast data streams. */
```

### RedundantImplements
Redundant interface declaration `WithParams`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/recommendation/swing/SwingParams.java`
#### Snippet
```java
 * @param <T> The class type of this instance.
 */
public interface SwingParams<T> extends WithParams<T>, HasOutputCol<T>, HasSeed<T> {
    Param<String> USER_COL =
            new StringParam("userCol", "User column name.", "user", ParamValidators.notNull());
```

### RedundantImplements
Redundant interface declaration `BoundedMultiInput`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/TwoInputAllRoundWrapperOperator.java`
#### Snippet
```java
        implements TwoInputStreamOperator<
                        IterationRecord<IN1>, IterationRecord<IN2>, IterationRecord<OUT>>,
                BoundedMultiInput {

    private final StreamRecord<IN1> reusedInput1;
```

### RedundantImplements
Redundant interface declaration `BoundedMultiInput`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/allround/MultipleInputAllRoundWrapperOperator.java`
#### Snippet
```java
public class MultipleInputAllRoundWrapperOperator<OUT>
        extends AbstractAllRoundWrapperOperator<OUT, MultipleInputStreamOperator<OUT>>
        implements MultipleInputStreamOperator<IterationRecord<OUT>>, BoundedMultiInput {

    public MultipleInputAllRoundWrapperOperator(
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `docs/layouts/_default/baseof.html`
#### Snippet
```java
-->
<!DOCTYPE html>
<html lang="{{ .Site.Language.Lang }}" dir={{ .Site.Language.LanguageDirection }}>

<head>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `docs/layouts/_default/baseof.html`
#### Snippet
```java
</head>

<body dir={{ .Site.Language.LanguageDirection }}>
  <input type="checkbox" class="hidden toggle" id="menu-control" />
  <input type="checkbox" class="hidden toggle" id="toc-control" />
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/sqltransformer/SQLTransformer.java`
#### Snippet
```java
            return true;
        } catch (Exception e) {
            if (e instanceof TableException
                    && e.getMessage() != null
                    && e.getMessage().matches(INSERT_ONLY_EXCEPTION_PATTERN)) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/broadcast/typeinfo/CacheElementSerializer.java`
#### Snippet
```java
    @Override
    public CacheElement<T> createInstance() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/TableUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkUtils.java`
#### Snippet
```java

        if (dryRun) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/binarizer/Binarizer.java`
#### Snippet
```java
        public Row map(Row input) {
            if (null == input) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/vectorindexer/VectorIndexerModel.java`
#### Snippet
```java
            switch (handleInValid) {
                case SKIP_INVALID:
                    return null;
                case ERROR_INVALID:
                    throw new RuntimeException(
```

### ReturnNull
Return of `null`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stopwordsremover/StopWordsRemover.java`
#### Snippet
```java
                this.stopWords =
                        stopWords.stream()
                                .map(x -> x == null ? null : x.toLowerCase(locale))
                                .collect(Collectors.toSet());
            }
```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/proxy/state/ProxyStreamOperatorStateContext.java`
#### Snippet
```java
    public CheckpointableKeyedStateBackend<?> keyedStateBackend() {
        return wrapped.keyedStateBackend() == null
                ? null
                : new ProxyKeyedStateBackend<>(wrapped.keyedStateBackend(), stateNamePrefix);
    }
```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/proxy/state/ProxyStreamOperatorStateContext.java`
#### Snippet
```java
    public OperatorStateBackend operatorStateBackend() {
        return wrapped.operatorStateBackend() == null
                ? null
                : new ProxyOperatorStateBackend(wrapped.operatorStateBackend(), stateNamePrefix);
    }
```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/proxy/state/ProxyStreamOperatorStateContext.java`
#### Snippet
```java
    public InternalTimeServiceManager<?> internalTimerServiceManager() {
        return wrapped.internalTimerServiceManager() == null
                ? null
                : new ProxyInternalTimeServiceManager<>(
                        wrapped.internalTimerServiceManager(), stateNamePrefix);
```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/typeinfo/IterationRecordSerializer.java`
#### Snippet
```java
    @Override
    public IterationRecord<T> createInstance() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/perround/AbstractPerRoundWrapperOperator.java`
#### Snippet
```java
    public Object getCurrentKey() {
        if (stateHandler == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                                            .getOperatorFactory())
                            .setCriteriaStreamParallelism(criteriaParallelism);
                    return null;
                });
    }
```

### ReturnNull
Return of `null`
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                dataStream -> {
                    draftEnv.addOperatorIfNotExists(dataStream.getTransformation());
                    return null;
                });
    }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `x`
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/stopwordsremover/StopWordsRemover.java`
#### Snippet
```java
                        x -> {
                            if (x != null) {
                                x = x.toLowerCase(locale);
                            }
                            return !stopWords.contains(x);
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/sort/KeyAndValueSerializer.java`
#### Snippet
```java
    @Override
    public Tuple2<byte[], StreamRecord<IN>> createInstance() {
        return Tuple2.of(new byte[0], new StreamRecord<>(valueSerializer.createInstance()));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/NGramExample.java`
#### Snippet
```java
        DataStream<Row> inputStream =
                env.fromElements(
                        Row.of((Object) new String[0]),
                        Row.of((Object) new String[] {"a", "b", "c"}),
                        Row.of((Object) new String[] {"a", "b", "c", "d"}));
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-examples/src/main/java/org/apache/flink/ml/examples/feature/StopWordsRemoverExample.java`
#### Snippet
```java
                        Row.of((Object) new String[] {"A", "The", "AN"}),
                        Row.of((Object) new String[] {null}),
                        Row.of((Object) new String[] {}));
        Table inputTable = tEnv.fromDataStream(inputStream).as("input");

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/anovatest/ANOVATest.java`
#### Snippet
```java
        @Override
        public Tuple3<Double, Double, HashMap<Double, Tuple2<Double, Long>>>[] createAccumulator() {
            return new Tuple3[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/fvaluetest/FValueTest.java`
#### Snippet
```java
        public Tuple5<Long, Double, Double, DenseVector, DenseVector> createAccumulator() {
            return Tuple5.of(
                    0L, 0.0, 0.0, new DenseVector(new double[0]), new DenseVector(new double[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/fvaluetest/FValueTest.java`
#### Snippet
```java
        public Tuple5<Long, Double, Double, DenseVector, DenseVector> createAccumulator() {
            return Tuple5.of(
                    0L, 0.0, 0.0, new DenseVector(new double[0]), new DenseVector(new double[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/idf/IDF.java`
#### Snippet
```java
        @Override
        public Tuple2<Long, DenseVector> createAccumulator() {
            return Tuple2.of(0L, new DenseVector(new double[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/ngram/NGram.java`
#### Snippet
```java
            int numItems = items.length;
            if (n > numItems) {
                return new String[0];
            } else {
                String[] output = new String[numItems - n + 1];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/robustscaler/RobustScaler.java`
#### Snippet
```java
        @Override
        public QuantileSummary[] createAccumulator() {
            return new QuantileSummary[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/featurehasher/FeatureHasher.java`
#### Snippet
```java
            }
        }
        return resultColList.toArray(new String[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
                int idx = number.intValue();
                if (idx == categorySizes[i]) {
                    result.setField(i, Vectors.sparse(categorySizes[i], new int[0], new double[0]));
                } else {
                    result.setField(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
                int idx = number.intValue();
                if (idx == categorySizes[i]) {
                    result.setField(i, Vectors.sparse(categorySizes[i], new int[0], new double[0]));
                } else {
                    result.setField(
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/onehotencoder/OneHotEncoderModel.java`
#### Snippet
```java
                                Collections.nCopies(
                                                outputCols.length, SparseVectorTypeInfo.INSTANCE)
                                        .toArray(new TypeInformation[0])),
                        ArrayUtils.addAll(inputTypeInfo.getFieldNames(), outputCols));

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/regextokenizer/RegexTokenizer.java`
#### Snippet
```java
            }

            return tokens.toArray(new String[0]);
        }
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/countvectorizer/CountVectorizer.java`
#### Snippet
```java
                    vocabulary
                            .subList(0, Math.min(vocabulary.size(), vocabularySize))
                            .toArray(new String[0]);
            return new CountVectorizerModelData(topTerms);
        }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/variancethresholdselector/VarianceThresholdSelector.java`
#### Snippet
```java
        @Override
        public Tuple3<Long, DenseVector, DenseVector> createAccumulator() {
            return Tuple3.of(0L, new DenseVector(new double[0]), new DenseVector(new double[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/feature/variancethresholdselector/VarianceThresholdSelector.java`
#### Snippet
```java
        @Override
        public Tuple3<Long, DenseVector, DenseVector> createAccumulator() {
            return Tuple3.of(0L, new DenseVector(new double[0]), new DenseVector(new double[0]));
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-lib/src/main/java/org/apache/flink/ml/clustering/kmeans/KMeans.java`
#### Snippet
```java
                                List<DenseVector> list = new ArrayList<>();
                                iterable.iterator().forEachRemaining(list::add);
                                collector.collect(list.toArray(new DenseVector[0]));
                            }
                        });
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/utils/ReflectionUtils.java`
#### Snippet
```java
            Method method =
                    declaredClass.getDeclaredMethod(
                            methodName, parameterClass.toArray(new Class[0]));
            method.setAccessible(true);
            return (T) method.invoke(targetObject, parameters.toArray());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/coordinator/SharedProgressAligner.java`
#### Snippet
```java
                        for (CompletableFuture<byte[]> stateFuture :
                                checkpointStatus.getStateFutures()) {
                            stateFuture.complete(new byte[0]);
                        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/DataStreamUtils.java`
#### Snippet
```java
        public void apply(GlobalWindow timeWindow, Iterable<T> iterable, Collector<T[]> collector) {
            List<T> points = IteratorUtils.toList(iterable.iterator());
            collector.collect(points.toArray((T[]) new Object[0]));
        }
    }
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `flink-ml-benchmark/src/main/java/org/apache/flink/ml/benchmark/BenchmarkResult.java`
#### Snippet
```java

    public Map<String, ?> toMap() {
        return new LinkedHashMap<String, Object>() {
            {
                put("totalTimeMs", totalTimeMs);
```

### DoubleBraceInitialization
Double brace initialization
in `flink-ml-lib/src/main/java/org/apache/flink/ml/stats/chisqtest/ChiSqTest.java`
#### Snippet
```java

        HashMap<String, DataStream<?>> bcMap =
                new HashMap<String, DataStream<?>>() {
                    {
                        put(bcCategoricalMarginsKey, categoricalMargins);
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

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/TableUtils.java`
#### Snippet
```java

        for (int i = 0; i < schema.getColumnCount(); i++) {
            Column column = schema.getColumn(i).get();
            nameToIndex.put(column.getName(), i);
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-core/src/main/java/org/apache/flink/ml/common/datastream/TableUtils.java`
#### Snippet
```java

        for (int i = 0; i < schema.getColumnCount(); i++) {
            Column column = schema.getColumn(i).get();
            types[i] = getTypeInformationFromDataType(column.getDataType());
            names[i] = column.getName();
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/Iterations.java`
#### Snippet
```java
                .stream()
                .reduce(DataStream::union)
                .get();
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheSnapshot.java`
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
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/datacache/nonkeyed/DataCacheWriter.java`
#### Snippet
```java
                writer.addRecord(reader.next());
            }
            segment.setFsSize(writer.finish().get().getFsSize());
        }
    }
```

## RuleId[id=ConstantValue]
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

## RuleId[id=NumericOverflow]
### NumericOverflow
Numeric overflow in expression
in `flink-ml-iteration/src/main/java/org/apache/flink/iteration/operator/headprocessor/TerminatingHeadOperatorRecordProcessor.java`
#### Snippet
```java
    public boolean processFeedbackElement(StreamRecord<IterationRecord<?>> record) {
        if (record.getValue().getType() == IterationRecord.Type.EPOCH_WATERMARK) {
            return record.getValue().getEpoch() == Integer.MAX_VALUE + 1;
        }

```

