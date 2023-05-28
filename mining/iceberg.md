# iceberg 
 
# Bad smells
I found 1718 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 432 | false |
| DataFlowIssue | 291 | false |
| AutoCloseableResource | 249 | false |
| DuplicatedCode | 110 | false |
| FieldMayBeFinal | 91 | false |
| DeprecatedIsStillUsed | 86 | false |
| JavadocLinkAsPlainText | 79 | false |
| IgnoreResultOfCall | 49 | false |
| NullableProblems | 43 | false |
| UNCHECKED_WARNING | 37 | false |
| JavadocReference | 19 | false |
| ConstantValue | 18 | false |
| FieldCanBeLocal | 17 | false |
| UnnecessaryToStringCall | 13 | true |
| TrivialIf | 12 | false |
| UnusedAssignment | 11 | false |
| RedundantMethodOverride | 10 | false |
| MarkedForRemoval | 9 | false |
| SwitchStatementWithTooFewBranches | 9 | false |
| DuplicateBranchesInSwitch | 8 | false |
| CommentedOutCode | 7 | false |
| TypeParameterHidesVisibleType | 7 | false |
| RedundantCast | 7 | false |
| RefusedBequest | 6 | false |
| OptionalUsedAsFieldOrParameterType | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| ArraysAsListWithZeroOrOneArgument | 6 | false |
| IOStreamConstructor | 5 | false |
| BusyWait | 5 | false |
| BigDecimalMethodWithoutRoundingCalled | 5 | false |
| DuplicateExpressions | 4 | false |
| SimplifiableConditionalExpression | 4 | false |
| SuspiciousMethodCalls | 4 | false |
| JavadocDeclaration | 4 | false |
| RegExpRedundantEscape | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 3 | false |
| OptionalGetWithoutIsPresent | 3 | false |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| SuspiciousSystemArraycopy | 2 | false |
| RedundantClassCall | 2 | false |
| RegExpSimplifiable | 2 | false |
| RedundantTypeArguments | 2 | false |
| PointlessBitwiseExpression | 2 | false |
| SlowAbstractSetRemoveAll | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| MismatchedJavadocCode | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| EqualsWhichDoesntCheckParameterClass | 2 | false |
| StringBufferReplaceableByString | 1 | false |
| ExplicitArrayFilling | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| DuplicateThrows | 1 | false |
| NonAtomicOperationOnVolatileField | 1 | false |
| JUnitMixedFramework | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| RedundantLengthCheck | 1 | false |
| UnnecessarySemicolon | 1 | false |
| RedundantCollectionOperation | 1 | false |
| DanglingJavadoc | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| CopyConstructorMissesField | 1 | false |
| UnstableApiUsage | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new DataType\[types.size()\]'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkParquetWriters.java`
#### Snippet
```java
    private InternalRowWriter(List<ParquetValueWriter<?>> writers, List<DataType> types) {
      super(writers);
      this.types = types.toArray(new DataType[types.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[elements.size()\]'
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieIcebergClient.java`
#### Snippet
```java
  private TableIdentifier toIdentifier(EntriesResponse.Entry entry) {
    List<String> elements = entry.getName().getElements();
    return TableIdentifier.of(elements.toArray(new String[elements.size()]));
  }

```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java
      try {
        Constructor<T> hidden = targetClass.getDeclaredConstructor(types);
        AccessController.doPrivileged(new MakeAccessible(hidden));
        ctor = new Ctor<T>(hidden, targetClass);
      } catch (SecurityException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java
      try {
        Constructor<T> hidden = targetClass.getDeclaredConstructor(types);
        AccessController.doPrivileged(new MakeAccessible(hidden));
        ctor = new Ctor<T>(hidden, targetClass);
      } catch (SecurityException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynMethods.java`
#### Snippet
```java
      try {
        Method hidden = targetClass.getDeclaredMethod(methodName, argClasses);
        AccessController.doPrivileged(new MakeAccessible(hidden));
        this.method = new UnboundMethod(hidden, name);
      } catch (SecurityException | NoSuchMethodException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynMethods.java`
#### Snippet
```java
      try {
        Method hidden = targetClass.getDeclaredMethod(methodName, argClasses);
        AccessController.doPrivileged(new MakeAccessible(hidden));
        this.method = new UnboundMethod(hidden, name);
      } catch (SecurityException | NoSuchMethodException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynMethods.java`
#### Snippet
```java
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynFields.java`
#### Snippet
```java
      try {
        Field hidden = targetClass.getDeclaredField(fieldName);
        AccessController.doPrivileged(new MakeFieldAccessible(hidden));
        this.field = new UnboundField(hidden, fieldName);
      } catch (SecurityException | NoSuchFieldException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynFields.java`
#### Snippet
```java
      try {
        Field hidden = targetClass.getDeclaredField(fieldName);
        AccessController.doPrivileged(new MakeFieldAccessible(hidden));
        this.field = new UnboundField(hidden, fieldName);
      } catch (SecurityException | NoSuchFieldException e) {
```

### MarkedForRemoval
'java.security.AccessController' is deprecated and marked for removal
in `common/src/main/java/org/apache/iceberg/common/DynFields.java`
#### Snippet
```java
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Set;
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`array` is not of an array type
in `core/src/main/java/org/apache/iceberg/util/ArrayUtil.java`
#### Snippet
```java
      final Object newArray =
          Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
      System.arraycopy(array, 0, newArray, 0, arrayLength);
      return newArray;
    }
```

### SuspiciousSystemArraycopy
`newArray` is not of an array type
in `core/src/main/java/org/apache/iceberg/util/ArrayUtil.java`
#### Snippet
```java
      final Object newArray =
          Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
      System.arraycopy(array, 0, newArray, 0, arrayLength);
      return newArray;
    }
```

## RuleId[id=RedundantClassCall]
### RedundantClassCall
Redundant call to `isInstance()`
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
          } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (Error.class.isInstance(cause)) {
              for (Throwable t : uncaught) {
                cause.addSuppressed(t);
```

### RedundantClassCall
Redundant call to `isInstance()`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/PruneColumnsWithReordering.java`
#### Snippet
```java
        map);
    Preconditions.checkArgument(
        StringType.class.isInstance(requestedMap.keyType()),
        "Invalid map key type (not string): %s",
        requestedMap.keyType());
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `api/src/main/java/org/apache/iceberg/transforms/ProjectionUtil.java`
#### Snippet
```java
      case STARTS_WITH:
        return predicate(Expression.Operation.STARTS_WITH, name, transform.apply(boundary));
        //        case IN: // TODO
        //          return Expressions.predicate(Operation.IN, name, transform.apply(boundary));
      default:
```

### CommentedOutCode
Commented out code (4 lines)
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
      // just allocate every time.
      return decoder.readBytes(null).array();
      //      int length = decoder.readInt();
      //      byte[] bytes = new byte[length];
      //      decoder.readFixed(bytes, 0, length);
```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
        return decoder.readString(null);
      }
      //      int length = decoder.readInt();
      //      byte[] bytes = new byte[length];
      //      decoder.readFixed(bytes, 0, length);
```

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
      this.reusedTempUtf8.set(decoder.readString(reusedTempUtf8.get()));
      return reusedTempUtf8.get().toString();
      //      int length = decoder.readInt();
      //      byte[] bytes = new byte[length];
      //      decoder.readFixed(bytes, 0, length);
```

### CommentedOutCode
Commented out code (4 lines)
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
        return decoder.readBytes(null);
      }
      //      int length = decoder.readInt();
      //      byte[] bytes = new byte[length];
      //      decoder.readFixed(bytes, 0, length);
```

### CommentedOutCode
Commented out code (5 lines)
in `parquet/src/main/java/org/apache/iceberg/parquet/PageIterator.java`
#### Snippet
```java
    }

    //    if (dataEncoding.usesDictionary() && converter.hasDictionarySupport()) {
    //      bindToDictionary(dictionary);
    //    } else {
```

### CommentedOutCode
Commented out code (13 lines)
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieCatalog.java`
#### Snippet
```java
      //     o.a.s.sql.connector.catalog.CatalogPlugin)
      // in the code block
      //    Pair<CatalogPlugin, Identifier> catalogIdentifier =
      // SparkUtil.catalogAndIdentifier(nameParts,
      //        catalogName ->  {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `api/src/main/java/org/apache/iceberg/types/Types.java`
#### Snippet
```java
          .buildOrThrow();

  private static final Pattern FIXED = Pattern.compile("fixed\\[\\s*(\\d+)\\s*\\]");
  private static final Pattern DECIMAL =
      Pattern.compile("decimal\\(\\s*(\\d+)\\s*,\\s*(\\d+)\\s*\\)");
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `api/src/main/java/org/apache/iceberg/transforms/Transforms.java`
#### Snippet
```java
  private Transforms() {}

  private static final Pattern HAS_WIDTH = Pattern.compile("(\\w+)\\[(\\d+)\\]");

  public static Transform<?, ?> fromString(String transform) {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
public class HadoopTableOperations implements TableOperations {
  private static final Logger LOG = LoggerFactory.getLogger(HadoopTableOperations.class);
  private static final Pattern VERSION_PATTERN = Pattern.compile("v([^\\.]*)\\..*");

  private final Configuration conf;
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/TableLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public TableLoader clone() {
      return new HadoopTableLoader(location, new Configuration(hadoopConf.get()));
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/TableLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public TableLoader clone() {
      return new CatalogTableLoader(catalogLoader.clone(), TableIdentifier.parse(identifier));
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/CatalogLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public CatalogLoader clone() {
      return new CustomCatalogLoader(name, properties, new Configuration(hadoopConf.get()), impl);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/CatalogLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public CatalogLoader clone() {
      return new RESTCatalogLoader(catalogName, new Configuration(hadoopConf.get()), properties);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/CatalogLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public CatalogLoader clone() {
      return new HadoopCatalogLoader(catalogName, new Configuration(hadoopConf.get()), properties);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/CatalogLoader.java`
#### Snippet
```java
    @Override
    @SuppressWarnings({"checkstyle:NoClone", "checkstyle:SuperClone"})
    public CatalogLoader clone() {
      return new HiveCatalogLoader(catalogName, new Configuration(hadoopConf.get()), properties);
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `pig/src/main/java/org/apache/iceberg/pig/SchemaUtil.java`
#### Snippet
```java
        return DataType.CHARARRAY;
      case DATE:
        return DataType.CHARARRAY;
      case STRING:
        return DataType.CHARARRAY;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `pig/src/main/java/org/apache/iceberg/pig/SchemaUtil.java`
#### Snippet
```java
        return DataType.CHARARRAY;
      case STRING:
        return DataType.CHARARRAY;
      case FIXED:
        return DataType.BYTEARRAY;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `pig/src/main/java/org/apache/iceberg/pig/SchemaUtil.java`
#### Snippet
```java
        return DataType.BYTEARRAY;
      case BINARY:
        return DataType.BYTEARRAY;
      case DECIMAL:
        return DataType.BIGDECIMAL;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/main/java/org/apache/iceberg/avro/GenericAvroWriter.java`
#### Snippet
```java

          case "timestamp-micros":
            return ValueWriters.longs();

          case "decimal":
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/main/java/org/apache/iceberg/avro/GenericAvroReader.java`
#### Snippet
```java
          case "timestamp-micros":
            // Spark uses the same representation
            return ValueReaders.longs();

          case "decimal":
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/TypeToSparkType.java`
#### Snippet
```java
      case UUID:
        // use String
        return StringType$.MODULE$;
      case FIXED:
        return BinaryType$.MODULE$;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/TypeToSparkType.java`
#### Snippet
```java
        return BinaryType$.MODULE$;
      case BINARY:
        return BinaryType$.MODULE$;
      case DECIMAL:
        Types.DecimalType decimal = (Types.DecimalType) primitive;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetDictionaryRowGroupFilter.java`
#### Snippet
```java
            break;
          case BINARY:
            dictSet.add((T) conversion.apply(dict.decodeToBinary(i)));
            break;
          case INT32:
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[!-~&&[^\"\\\\]]` can be simplified to '!-\~\&\&\[\^"\\\\\]'
in `core/src/main/java/org/apache/iceberg/rest/auth/OAuth2Util.java`
#### Snippet
```java

  // valid scope tokens are from ascii 0x21 to 0x7E, excluding 0x22 (") and 0x5C (\)
  private static final Pattern VALID_SCOPE_TOKEN = Pattern.compile("^[!-~&&[^\"\\\\]]+$");
  private static final Splitter SCOPE_DELIMITER = Splitter.on(" ");
  private static final Joiner SCOPE_JOINER = Joiner.on(" ");
```

### RegExpSimplifiable
``[`]`` can be simplified to '\`'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkFilters.java`
#### Snippet
```java
public class SparkFilters {

  private static final Pattern BACKTICKS_PATTERN = Pattern.compile("([`])(.|$)");

  private SparkFilters() {}
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(hadoopConfDir, "hdfs-site.xml")`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java
    if (!Strings.isNullOrEmpty(hadoopConfDir)) {
      Preconditions.checkState(
          Files.exists(Paths.get(hadoopConfDir, "hdfs-site.xml")),
          "Failed to load Hadoop configuration: missing %s",
          Paths.get(hadoopConfDir, "hdfs-site.xml"));
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(hadoopConfDir, "hdfs-site.xml")`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java
          Files.exists(Paths.get(hadoopConfDir, "hdfs-site.xml")),
          "Failed to load Hadoop configuration: missing %s",
          Paths.get(hadoopConfDir, "hdfs-site.xml"));
      newConf.addResource(new Path(hadoopConfDir, "hdfs-site.xml"));
      Preconditions.checkState(
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(hadoopConfDir, "core-site.xml")`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java
      newConf.addResource(new Path(hadoopConfDir, "hdfs-site.xml"));
      Preconditions.checkState(
          Files.exists(Paths.get(hadoopConfDir, "core-site.xml")),
          "Failed to load Hadoop configuration: missing %s",
          Paths.get(hadoopConfDir, "core-site.xml"));
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(hadoopConfDir, "core-site.xml")`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java
          Files.exists(Paths.get(hadoopConfDir, "core-site.xml")),
          "Failed to load Hadoop configuration: missing %s",
          Paths.get(hadoopConfDir, "core-site.xml"));
      newConf.addResource(new Path(hadoopConfDir, "core-site.xml"));
    }
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder partitionStringBuilder` can be replaced with 'String'
in `core/src/main/java/org/apache/iceberg/util/PartitionSet.java`
#### Snippet
```java
      for (StructLike s : e.getValue()) {
        for (int i = 0; i < structType.fields().size(); i++) {
          StringBuilder partitionStringBuilder = new StringBuilder();
          partitionStringBuilder.append(structType.fields().get(i).name());
          partitionStringBuilder.append("=");
```

## RuleId[id=Deprecation]
### Deprecation
'identity(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/SortOrder.java`
#### Snippet
```java
    private Transform<?, ?> toTransform(BoundTerm<?> term) {
      if (term instanceof BoundReference) {
        return Transforms.identity(term.type());
      } else if (term instanceof BoundTransform) {
        return ((BoundTransform<?, ?>) term).transform();
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java

      if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
        throw new RuntimeIOException(
            "Failed to create the file's directory at %s.", file.getParentFile().getAbsolutePath());
      }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java
      if (file.exists()) {
        if (!file.delete()) {
          throw new RuntimeIOException("Failed to delete: %s", file);
        }
      }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/OutputFile.java`
#### Snippet
```java
   * @return an output stream that can report its position
   * @throws AlreadyExistsException If the path already exists
   * @throws RuntimeIOException If the implementation throws an {@link IOException}
   */
  PositionOutputStream create();
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/OutputFile.java`
#### Snippet
```java
   *
   * @return an output stream that can report its position
   * @throws RuntimeIOException If the implementation throws an {@link IOException}
   * @throws SecurityException If staging directory creation fails due to missing JVM level
   *     permission
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/InputFile.java`
#### Snippet
```java
   * @return a seekable stream for reading the file
   * @throws NotFoundException If the file does not exist
   * @throws RuntimeIOException If the implementation throws an {@link IOException}
   */
  SeekableInputStream newStream();
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/InputFile.java`
#### Snippet
```java
   *
   * @return the total length of the file, in bytes
   * @throws RuntimeIOException If the implementation throws an {@link IOException}
   */
  long getLength();
```

### Deprecation
'day(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.day(sourceColumn.type()));
      checkForRedundantPartitions(field);
      fields.add(field);
```

### Deprecation
'year(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.year(sourceColumn.type()));
      checkForRedundantPartitions(field);
      fields.add(field);
```

### Deprecation
'bucket(org.apache.iceberg.types.Type, int)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.bucket(sourceColumn.type(), numBuckets)));
      return this;
    }
```

### Deprecation
'identity(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.identity(sourceColumn.type()));
      checkForRedundantPartitions(field);
      fields.add(field);
```

### Deprecation
'month(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.month(sourceColumn.type()));
      checkForRedundantPartitions(field);
      fields.add(field);
```

### Deprecation
'truncate(org.apache.iceberg.types.Type, int)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.truncate(sourceColumn.type(), width)));
      return this;
    }
```

### Deprecation
'hour(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
              nextFieldId(),
              targetName,
              Transforms.hour(sourceColumn.type()));
      checkForRedundantPartitions(field);
      fields.add(field);
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/types/Conversions.java`
#### Snippet
```java
          return ENCODER.get().encode(buffer);
        } catch (CharacterCodingException e) {
          throw new RuntimeIOException(e, "Failed to encode value as UTF-8: %s", value);
        }
      case UUID:
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/types/Conversions.java`
#### Snippet
```java
          return DECODER.get().decode(tmp);
        } catch (CharacterCodingException e) {
          throw new RuntimeIOException(e, "Failed to decode value as UTF-8: %s", buffer);
        }
      case UUID:
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.metrics.MetricsContext'
in `api/src/main/java/org/apache/iceberg/metrics/MetricsContext.java`
#### Snippet
```java
      @Override
      @SuppressWarnings("unchecked")
      public <T extends Number> Counter<T> counter(String name, Class<T> type, Unit unit) {
        if (Integer.class.equals(type)) {
          return (Counter<T>)
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.metrics.MetricsContext'
in `api/src/main/java/org/apache/iceberg/metrics/DefaultMetricsContext.java`
#### Snippet
```java
  @Deprecated
  @SuppressWarnings("unchecked")
  public <T extends Number> Counter<T> counter(String name, Class<T> type, Unit unit) {
    if (Integer.class.equals(type)) {
      return (Counter<T>) new DefaultCounter(unit).asIntCounter();
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
            }
          } catch (IOException e) {
            throw new RuntimeIOException(e, "Failed to close iterable");
          }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
          }
        } catch (IOException e) {
          throw new RuntimeIOException(e, "Failed to close iterable");
        }

```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
  }

  private class AsIntCounter implements MetricsContext.Counter<Integer> {

    @Override
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
  }

  MetricsContext.Counter<Integer> asIntCounter() {
    if (null == asIntCounter) {
      this.asIntCounter = new AsIntCounter();
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.metrics.MetricsContext.Counter'
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java

    @Override
    public Optional<Integer> count() {
      return Optional.of(value());
    }
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
  }

  private class AsLongCounter implements MetricsContext.Counter<Long> {

    @Override
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.metrics.MetricsContext.Counter'
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java

    @Override
    public Optional<Long> count() {
      return Optional.of(value());
    }
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
  }

  MetricsContext.Counter<Long> asLongCounter() {
    if (null == asLongCounter) {
      this.asLongCounter = new AsLongCounter();
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/UnknownTransform.java`
#### Snippet
```java

  @Override
  public T apply(S value) {
    throw new UnsupportedOperationException(
        String.format("Cannot apply unsupported transform: %s", transform));
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/VoidTransform.java`
#### Snippet
```java

  @Override
  public Void apply(Object value) {
    return null;
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/VoidTransform.java`
#### Snippet
```java

  @Override
  public String toHumanString(Void value) {
    return "null";
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Timestamps.java`
#### Snippet
```java

  @Override
  public Integer apply(Long timestampMicros) {
    return apply.apply(timestampMicros);
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Dates.java`
#### Snippet
```java

  @Override
  public Integer apply(Integer days) {
    return apply.apply(days);
  }
```

### Deprecation
'get(org.apache.iceberg.types.Type, int)' is deprecated
in `api/src/main/java/org/apache/iceberg/transforms/Transforms.java`
#### Snippet
```java
      int parsedWidth = Integer.parseInt(widthMatcher.group(2));
      if (name.equalsIgnoreCase("truncate")) {
        return (Transform<?, ?>) Truncate.get(type, parsedWidth);
      } else if (name.equalsIgnoreCase("bucket")) {
        return (Transform<?, ?>) Bucket.get(type, parsedWidth);
```

### Deprecation
'get(org.apache.iceberg.types.Type)' is deprecated
in `api/src/main/java/org/apache/iceberg/transforms/Transforms.java`
#### Snippet
```java

    if (transform.equalsIgnoreCase("identity")) {
      return Identity.get(type);
    }

```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Identity.java`
#### Snippet
```java
  @Deprecated
  @Override
  public String toHumanString(T value) {
    if (this.type != null) {
      return toHumanString(this.type, value);
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Identity.java`
#### Snippet
```java

  @Override
  public T apply(T value) {
    return value;
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Bucket.java`
#### Snippet
```java

  @Override
  public Integer apply(T value) {
    if (value == null) {
      return null;
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

    @Override
    public CharSequence apply(CharSequence value) {
      if (value == null) {
        return null;
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

    @Override
    public ByteBuffer apply(ByteBuffer value) {
      if (value == null) {
        return null;
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

    @Override
    public Long apply(Long value) {
      if (value == null) {
        return null;
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

    @Override
    public Integer apply(Integer value) {
      if (value == null) {
        return null;
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

  @Override
  public T apply(T value) {
    throw new UnsupportedOperationException(
        "apply(value) is deprecated, use bind(Type).apply(value)");
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.transforms.Transform'
in `api/src/main/java/org/apache/iceberg/transforms/Truncate.java`
#### Snippet
```java

    @Override
    public BigDecimal apply(BigDecimal value) {
      if (value == null) {
        return null;
```

### Deprecation
'HTTP_CLIENT_URLCONNECTION_CONNECTION_TIMEOUT_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/UrlConnectionHttpClientConfigurations.java`
#### Snippet
```java
    this.httpClientUrlConnectionConnectionTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_URLCONNECTION_CONNECTION_TIMEOUT_MS);
    this.httpClientUrlConnectionSocketTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
```

### Deprecation
'HTTP_CLIENT_URLCONNECTION_SOCKET_TIMEOUT_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/UrlConnectionHttpClientConfigurations.java`
#### Snippet
```java
    this.httpClientUrlConnectionSocketTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_URLCONNECTION_SOCKET_TIMEOUT_MS);
  }

```

### Deprecation
'HTTP_CLIENT_APACHE_CONNECTION_TIMEOUT_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.connectionTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_CONNECTION_TIMEOUT_MS);
    this.socketTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
```

### Deprecation
'HTTP_CLIENT_APACHE_SOCKET_TIMEOUT_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.socketTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_SOCKET_TIMEOUT_MS);
    this.acquisitionTimeoutMs =
        PropertyUtil.propertyAsNullableLong(
```

### Deprecation
'HTTP_CLIENT_APACHE_CONNECTION_ACQUISITION_TIMEOUT_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties,
            AwsProperties.HTTP_CLIENT_APACHE_CONNECTION_ACQUISITION_TIMEOUT_MS);
    this.connectionMaxIdleTimeMs =
        PropertyUtil.propertyAsNullableLong(
```

### Deprecation
'HTTP_CLIENT_APACHE_CONNECTION_MAX_IDLE_TIME_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.connectionMaxIdleTimeMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_CONNECTION_MAX_IDLE_TIME_MS);
    this.connectionTimeToLiveMs =
        PropertyUtil.propertyAsNullableLong(
```

### Deprecation
'HTTP_CLIENT_APACHE_CONNECTION_TIME_TO_LIVE_MS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.connectionTimeToLiveMs =
        PropertyUtil.propertyAsNullableLong(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_CONNECTION_TIME_TO_LIVE_MS);
    this.expectContinueEnabled =
        PropertyUtil.propertyAsNullableBoolean(
```

### Deprecation
'HTTP_CLIENT_APACHE_EXPECT_CONTINUE_ENABLED' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.expectContinueEnabled =
        PropertyUtil.propertyAsNullableBoolean(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_EXPECT_CONTINUE_ENABLED);
    this.maxConnections =
        PropertyUtil.propertyAsNullableInt(
```

### Deprecation
'HTTP_CLIENT_APACHE_MAX_CONNECTIONS' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.maxConnections =
        PropertyUtil.propertyAsNullableInt(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_MAX_CONNECTIONS);
    this.tcpKeepAliveEnabled =
        PropertyUtil.propertyAsNullableBoolean(
```

### Deprecation
'HTTP_CLIENT_APACHE_TCP_KEEP_ALIVE_ENABLED' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
    this.tcpKeepAliveEnabled =
        PropertyUtil.propertyAsNullableBoolean(
            httpClientProperties, AwsProperties.HTTP_CLIENT_APACHE_TCP_KEEP_ALIVE_ENABLED);
    this.useIdleConnectionReaperEnabled =
        PropertyUtil.propertyAsNullableBoolean(
```

### Deprecation
'HTTP_CLIENT_APACHE_USE_IDLE_CONNECTION_REAPER_ENABLED' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/ApacheHttpClientConfigurations.java`
#### Snippet
```java
        PropertyUtil.propertyAsNullableBoolean(
            httpClientProperties,
            AwsProperties.HTTP_CLIENT_APACHE_USE_IDLE_CONNECTION_REAPER_ENABLED);
  }

```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
    return GlueClient.builder()
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .build();
  }
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java

  private StsClient sts() {
    return StsClient.builder().applyMutation(awsProperties::applyHttpClientConfigurations).build();
  }

```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
    return DynamoDbClient.builder()
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .applyMutation(awsProperties::applyDynamoDbEndpointConfigurations)
        .build();
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
    return KmsClient.builder()
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .build();
  }
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
    return S3Client.builder()
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .applyMutation(awsProperties::applyS3EndpointConfigurations)
        .applyMutation(awsProperties::applyS3ServiceConfigurations)
```

### Deprecation
'applyS3EndpointConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .applyMutation(awsProperties::applyS3EndpointConfigurations)
        .applyMutation(awsProperties::applyS3ServiceConfigurations)
        .applyMutation(awsProperties::applyS3SignerConfiguration)
```

### Deprecation
'applyClientRegionConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
    public S3Client s3() {
      return S3Client.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyS3EndpointConfigurations)
```

### Deprecation
'applyS3ServiceConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
        .applyMutation(awsProperties::applyHttpClientConfigurations)
        .applyMutation(awsProperties::applyS3EndpointConfigurations)
        .applyMutation(awsProperties::applyS3ServiceConfigurations)
        .applyMutation(awsProperties::applyS3SignerConfiguration)
        .build();
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
      return S3Client.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyS3EndpointConfigurations)
          .applyMutation(awsProperties::applyS3ServiceConfigurations)
```

### Deprecation
'applyS3SignerConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AssumeRoleAwsClientFactory.java`
#### Snippet
```java
        .applyMutation(awsProperties::applyS3EndpointConfigurations)
        .applyMutation(awsProperties::applyS3ServiceConfigurations)
        .applyMutation(awsProperties::applyS3SignerConfiguration)
        .build();
  }
```

### Deprecation
'applyS3EndpointConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyS3EndpointConfigurations)
          .applyMutation(awsProperties::applyS3ServiceConfigurations)
          .applyMutation(awsProperties::applyS3CredentialConfigurations)
```

### Deprecation
'applyS3ServiceConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyS3EndpointConfigurations)
          .applyMutation(awsProperties::applyS3ServiceConfigurations)
          .applyMutation(awsProperties::applyS3CredentialConfigurations)
          .applyMutation(awsProperties::applyS3SignerConfiguration)
```

### Deprecation
'applyS3CredentialConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
          .applyMutation(awsProperties::applyS3EndpointConfigurations)
          .applyMutation(awsProperties::applyS3ServiceConfigurations)
          .applyMutation(awsProperties::applyS3CredentialConfigurations)
          .applyMutation(awsProperties::applyS3SignerConfiguration)
          .build();
```

### Deprecation
'applyS3SignerConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
          .applyMutation(awsProperties::applyS3ServiceConfigurations)
          .applyMutation(awsProperties::applyS3CredentialConfigurations)
          .applyMutation(awsProperties::applyS3SignerConfiguration)
          .build();
    }
```

### Deprecation
'applyClientRegionConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
    public DynamoDbClient dynamo() {
      return DynamoDbClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyClientCredentialConfigurations)
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
      return DynamoDbClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyClientCredentialConfigurations)
          .applyMutation(awsProperties::applyDynamoDbEndpointConfigurations)
```

### Deprecation
'applyClientRegionConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
    public KmsClient kms() {
      return KmsClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyClientCredentialConfigurations)
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
      return KmsClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyClientCredentialConfigurations)
          .build();
```

### Deprecation
'applyClientRegionConfiguration(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
    public GlueClient glue() {
      return GlueClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyGlueEndpointConfigurations)
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientFactories.java`
#### Snippet
```java
      return GlueClient.builder()
          .applyMutation(awsProperties::applyClientRegionConfiguration)
          .applyMutation(awsProperties::applyHttpClientConfigurations)
          .applyMutation(awsProperties::applyGlueEndpointConfigurations)
          .applyMutation(awsProperties::applyClientCredentialConfigurations)
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3InputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3InputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!isResourceClosed.get()) {
```

### Deprecation
'finalize()' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!isResourceClosed.get()) {
      close();
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning
```

### Deprecation
'com.fasterxml.jackson.databind.PropertyNamingStrategy.KebabCaseStrategy' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3ObjectMapper.java`
#### Snippet
```java
          // and PropertyNamingStrategies.KebabCaseStrategy.INSTANCE (introduced in jackson 2.14) is
          // recommended, we can't use it because Spark still relies on jackson 2.13.x stuff
          MAPPER.setPropertyNamingStrategy(new PropertyNamingStrategy.KebabCaseStrategy());
          MAPPER.registerModule(initModule());
          isInitialized = true;
```

### Deprecation
'OBJECT_STORE_PATH' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java`
#### Snippet
```java
          TableProperties.WRITE_DATA_LOCATION,
          TableProperties.WRITE_METADATA_LOCATION,
          TableProperties.OBJECT_STORE_PATH,
          TableProperties.WRITE_FOLDER_STORAGE_LOCATION);

```

### Deprecation
'WRITE_FOLDER_STORAGE_LOCATION' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java`
#### Snippet
```java
          TableProperties.WRITE_METADATA_LOCATION,
          TableProperties.OBJECT_STORE_PATH,
          TableProperties.WRITE_FOLDER_STORAGE_LOCATION);

  // Attempt to set additionalLocations if available on the given AWS SDK version
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
    if (isTableRegisteredWithLakeFormation()) {
      return S3Client.builder()
          .applyMutation(awsProperties()::applyHttpClientConfigurations)
          .applyMutation(awsProperties()::applyS3EndpointConfigurations)
          .applyMutation(awsProperties()::applyS3ServiceConfigurations)
```

### Deprecation
'applyS3EndpointConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
      return S3Client.builder()
          .applyMutation(awsProperties()::applyHttpClientConfigurations)
          .applyMutation(awsProperties()::applyS3EndpointConfigurations)
          .applyMutation(awsProperties()::applyS3ServiceConfigurations)
          .credentialsProvider(
```

### Deprecation
'applyS3ServiceConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
          .applyMutation(awsProperties()::applyHttpClientConfigurations)
          .applyMutation(awsProperties()::applyS3EndpointConfigurations)
          .applyMutation(awsProperties()::applyS3ServiceConfigurations)
          .credentialsProvider(
              new LakeFormationCredentialsProvider(lakeFormation(), buildTableArn()))
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
    if (isTableRegisteredWithLakeFormation()) {
      return KmsClient.builder()
          .applyMutation(awsProperties()::applyHttpClientConfigurations)
          .credentialsProvider(
              new LakeFormationCredentialsProvider(lakeFormation(), buildTableArn()))
```

### Deprecation
'applyHttpClientConfigurations(T)' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
    return LakeFormationClient.builder()
        .applyMutation(this::applyAssumeRoleConfigurations)
        .applyMutation(awsProperties()::applyHttpClientConfigurations)
        .build();
  }
```

### Deprecation
's3WriteTableTagEnabled()' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      boolean skipNameValidation = awsProperties.glueCatalogSkipNameValidation();

      if (awsProperties.s3WriteTableTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_TABLE),
```

### Deprecation
'S3_WRITE_TAGS_PREFIX' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      if (awsProperties.s3WriteTableTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_TABLE),
            IcebergToGlueConverter.getTableName(tableIdentifier, skipNameValidation));
      }
```

### Deprecation
'S3_TAG_ICEBERG_TABLE' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      if (awsProperties.s3WriteTableTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_TABLE),
            IcebergToGlueConverter.getTableName(tableIdentifier, skipNameValidation));
      }
```

### Deprecation
's3WriteNamespaceTagEnabled()' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      }

      if (awsProperties.s3WriteNamespaceTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_NAMESPACE),
```

### Deprecation
'S3_WRITE_TAGS_PREFIX' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      if (awsProperties.s3WriteNamespaceTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_NAMESPACE),
            IcebergToGlueConverter.getDatabaseName(tableIdentifier, skipNameValidation));
      }
```

### Deprecation
'S3_TAG_ICEBERG_NAMESPACE' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
      if (awsProperties.s3WriteNamespaceTagEnabled()) {
        tableSpecificCatalogPropertiesBuilder.put(
            AwsProperties.S3_WRITE_TAGS_PREFIX.concat(AwsProperties.S3_TAG_ICEBERG_NAMESPACE),
            IcebergToGlueConverter.getDatabaseName(tableIdentifier, skipNameValidation));
      }
```

### Deprecation
'S3_PRELOAD_CLIENT_ENABLED' is deprecated
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
                AwsProperties.LAKE_FORMATION_TABLE_NAME,
                IcebergToGlueConverter.getTableName(tableIdentifier, skipNameValidation))
            .put(AwsProperties.S3_PRELOAD_CLIENT_ENABLED, String.valueOf(true));
      }

```

### Deprecation
'S3FILEIO_ENDPOINT' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
  public void testS3FileIoEndpointOverride() {
    Map<String, String> properties = Maps.newHashMap();
    properties.put(AwsProperties.S3FILEIO_ENDPOINT, "https://unknown:1234");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'assertThrowsCause(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    GlueClient glueClient = factory.glue();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'assertThrowsCause(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    GlueClient glueClient = factory.glue();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'S3FILEIO_ACCESS_KEY_ID' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
  public void testS3FileIoCredentialsOverride() {
    Map<String, String> properties = Maps.newHashMap();
    properties.put(AwsProperties.S3FILEIO_ACCESS_KEY_ID, "unknown");
    properties.put(AwsProperties.S3FILEIO_SECRET_ACCESS_KEY, "unknown");
    AwsClientFactory factory = AwsClientFactories.from(properties);
```

### Deprecation
'S3FILEIO_SECRET_ACCESS_KEY' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    Map<String, String> properties = Maps.newHashMap();
    properties.put(AwsProperties.S3FILEIO_ACCESS_KEY_ID, "unknown");
    properties.put(AwsProperties.S3FILEIO_SECRET_ACCESS_KEY, "unknown");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrows(
        "Should fail request because of bad access key",
        S3Exception.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrows(
        "Should fail request because of bad access key",
        S3Exception.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    DynamoDbClient dynamoDbClient = factory.dynamo();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'assertThrowsCause(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    AwsClientFactory factory = AwsClientFactories.from(properties);
    DynamoDbClient dynamoDbClient = factory.dynamo();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
        SdkClientException.class,
```

### Deprecation
'WRITE_FOLDER_STORAGE_LOCATION' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/GlueTestBase.java`
#### Snippet
```java
          TableProperties.WRITE_DATA_LOCATION, "s3://" + testBucketName + "/writeDataLoc",
          TableProperties.WRITE_METADATA_LOCATION, "s3://" + testBucketName + "/writeMetaDataLoc",
          TableProperties.WRITE_FOLDER_STORAGE_LOCATION,
              "s3://" + testBucketName + "/writeFolderStorageLoc");

```

### Deprecation
'setS3FileIoDeleteBatchSize(int)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/GlueTestBase.java`
#### Snippet
```java
    glueCatalog = new GlueCatalog();
    AwsProperties properties = new AwsProperties();
    properties.setS3FileIoDeleteBatchSize(10);
    glueCatalog.initialize(
        catalogName, testBucketPath, properties, glue, null, fileIO, ImmutableMap.of());
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = createNamespace();
    createTable(namespace);
    AssertHelpers.assertThrows(
        "namespace should not be dropped when still has Iceberg table",
        NamespaceNotEmptyException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = createNamespace();
    createTable(namespace);
    AssertHelpers.assertThrows(
        "namespace should not be dropped when still has Iceberg table",
        NamespaceNotEmptyException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
  public void testCreateDuplicate() {
    String namespace = createNamespace();
    AssertHelpers.assertThrows(
        "should not create namespace with the same name",
        AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
  public void testCreateDuplicate() {
    String namespace = createNamespace();
    AssertHelpers.assertThrows(
        "should not create namespace with the same name",
        AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java

    for (Namespace namespace : invalidNamespaces) {
      AssertHelpers.assertThrows(
          "should not create namespace with invalid or nested names",
          ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java

    for (Namespace namespace : invalidNamespaces) {
      AssertHelpers.assertThrows(
          "should not create namespace with invalid or nested names",
          ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = createNamespace();
    glueCatalog.dropNamespace(Namespace.of(namespace));
    AssertHelpers.assertThrows(
        "namespace should not exist after deletion",
        EntityNotFoundException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = createNamespace();
    glueCatalog.dropNamespace(Namespace.of(namespace));
    AssertHelpers.assertThrows(
        "namespace should not exist after deletion",
        EntityNotFoundException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(UUID.randomUUID().toString()).build())
            .build());
    AssertHelpers.assertThrows(
        "namespace should not be dropped when still has non-Iceberg table",
        NamespaceNotEmptyException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(UUID.randomUUID().toString()).build())
            .build());
    AssertHelpers.assertThrows(
        "namespace should not be dropped when still has non-Iceberg table",
        NamespaceNotEmptyException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = getRandomName();
    namespaces.add(namespace);
    AssertHelpers.assertThrows(
        "namespace does not exist before create",
        EntityNotFoundException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogNamespace.java`
#### Snippet
```java
    String namespace = getRandomName();
    namespaces.add(namespace);
    AssertHelpers.assertThrows(
        "namespace does not exist before create",
        EntityNotFoundException.class,
```

### Deprecation
'HTTP_CLIENT_TYPE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestAssumeRoleAwsClientFactory.java`
#### Snippet
```java
    assumeRoleProperties.put(
        AwsProperties.CLIENT_FACTORY, AssumeRoleAwsClientFactory.class.getName());
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(
        AwsProperties.CLIENT_ASSUME_ROLE_REGION, AwsIntegTestUtil.testRegion());
```

### Deprecation
'HTTP_CLIENT_TYPE_APACHE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/TestAssumeRoleAwsClientFactory.java`
#### Snippet
```java
    assumeRoleProperties.put(
        AwsProperties.CLIENT_FACTORY, AssumeRoleAwsClientFactory.class.getName());
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(
        AwsProperties.CLIENT_ASSUME_ROLE_REGION, AwsIntegTestUtil.testRegion());
```

### Deprecation
'HTTP_CLIENT_TYPE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationAwsClientFactory.java`
#### Snippet
```java
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_REGION, "us-east-1");
    assumeRoleProperties.put(AwsProperties.GLUE_LAKEFORMATION_ENABLED, "true");
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_ARN, response.role().arn());
    assumeRoleProperties.put(
```

### Deprecation
'HTTP_CLIENT_TYPE_APACHE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationAwsClientFactory.java`
#### Snippet
```java
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_REGION, "us-east-1");
    assumeRoleProperties.put(AwsProperties.GLUE_LAKEFORMATION_ENABLED, "true");
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_ARN, response.role().arn());
    assumeRoleProperties.put(
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbLockManager.java`
#### Snippet
```java
        .when(dynamo2)
        .describeTable(Mockito.any(DescribeTableRequest.class));
    AssertHelpers.assertThrows(
        "should fail to initialize the lock manager",
        IllegalStateException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbLockManager.java`
#### Snippet
```java
        .when(dynamo2)
        .describeTable(Mockito.any(DescribeTableRequest.class));
    AssertHelpers.assertThrows(
        "should fail to initialize the lock manager",
        IllegalStateException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDataPathPrivileges(getTableLocation(testTableName));
    try {
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDataPathPrivileges(getTableLocation(testTableName));
    try {
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantTablePrivileges(testDbName, testTableName, Permission.SELECT);
    try {
      AssertHelpers.assertThrows(
          "attempt to drop a table without DROP permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantTablePrivileges(testDbName, testTableName, Permission.SELECT);
    try {
      AssertHelpers.assertThrows(
          "attempt to drop a table without DROP permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDatabasePrivileges(testDbName, Permission.CREATE_TABLE);
    try {
      AssertHelpers.assertThrows(
          "attempt to create a table without DATA_LOCATION_ACCESS permission should fail",
          ForbiddenException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDatabasePrivileges(testDbName, Permission.CREATE_TABLE);
    try {
      AssertHelpers.assertThrows(
          "attempt to create a table without DATA_LOCATION_ACCESS permission should fail",
          ForbiddenException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    lfRegisterPathRoleCreateTable(testDbName, testTableName);
    try {
      AssertHelpers.assertThrows(
          "attempt to show tables without any permissions should fail",
          AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    lfRegisterPathRoleCreateTable(testDbName, testTableName);
    try {
      AssertHelpers.assertThrows(
          "attempt to show tables without any permissions should fail",
          AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
      UpdateProperties updateProperties = table.updateProperties();
      properties.forEach(updateProperties::set);
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER privileges should fail",
          ForbiddenException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
      UpdateProperties updateProperties = table.updateProperties();
      properties.forEach(updateProperties::set);
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER privileges should fail",
          ForbiddenException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDataPathPrivileges(tableLocation);
    try {
      AssertHelpers.assertThrows(
          "attempt to create a table without CREATE_TABLE permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    grantDataPathPrivileges(tableLocation);
    try {
      AssertHelpers.assertThrows(
          "attempt to create a table without CREATE_TABLE permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
  public void testCreateDatabaseNoPrivileges() {
    String testDbName = getRandomDbName();
    AssertHelpers.assertThrows(
        "attempt to create a database without CREATE_DATABASE permission should fail",
        AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
  public void testCreateDatabaseNoPrivileges() {
    String testDbName = getRandomDbName();
    AssertHelpers.assertThrows(
        "attempt to create a database without CREATE_DATABASE permission should fail",
        AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
      UpdateProperties updateProperties = table.updateProperties();
      properties.forEach(updateProperties::set);
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER permission should fail",
          ForbiddenException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
      UpdateProperties updateProperties = table.updateProperties();
      properties.forEach(updateProperties::set);
      AssertHelpers.assertThrows(
          "attempt to alter a table without ALTER permission should fail",
          ForbiddenException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    lfRegisterPathRoleCreateDb(testDbName);
    try {
      AssertHelpers.assertThrows(
          "attempt to drop a database without DROP permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationMetadataOperations.java`
#### Snippet
```java
    lfRegisterPathRoleCreateDb(testDbName);
    try {
      AssertHelpers.assertThrows(
          "attempt to drop a database without DROP permission should fail",
          AccessDeniedException.class,
```

### Deprecation
'S3_USE_ARN_REGION_ENABLED' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
  @Test
  public void testDeleteFilesMultipleBatchesWithCrossRegionAccessPoints() throws Exception {
    clientFactory.initialize(ImmutableMap.of(AwsProperties.S3_USE_ARN_REGION_ENABLED, "true"));
    S3FileIO s3FileIO = new S3FileIO(clientFactory::s3, getDeletionTestProperties());
    s3FileIO.initialize(
```

### Deprecation
'S3_WRITE_TABLE_TAG_ENABLED' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    Map<String, String> properties =
        ImmutableMap.of(
            AwsProperties.S3_WRITE_TABLE_TAG_ENABLED,
            "true",
            AwsProperties.S3_WRITE_NAMESPACE_TAG_ENABLED,
```

### Deprecation
'S3_WRITE_NAMESPACE_TAG_ENABLED' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
            AwsProperties.S3_WRITE_TABLE_TAG_ENABLED,
            "true",
            AwsProperties.S3_WRITE_NAMESPACE_TAG_ENABLED,
            "true");
    glueCatalog.initialize(
```

### Deprecation
'S3_TAG_ICEBERG_TABLE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    Map<String, String> tagMap = tags.stream().collect(Collectors.toMap(Tag::key, Tag::value));

    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertEquals(tableName, tagMap.get(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
```

### Deprecation
'S3_TAG_ICEBERG_TABLE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java

    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertEquals(tableName, tagMap.get(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
    Assert.assertEquals(namespace, tagMap.get(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
```

### Deprecation
'S3_TAG_ICEBERG_NAMESPACE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertEquals(tableName, tagMap.get(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
    Assert.assertEquals(namespace, tagMap.get(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
  }
```

### Deprecation
'S3_TAG_ICEBERG_NAMESPACE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    Assert.assertEquals(tableName, tagMap.get(AwsProperties.S3_TAG_ICEBERG_TABLE));
    Assert.assertTrue(tagMap.containsKey(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
    Assert.assertEquals(namespace, tagMap.get(AwsProperties.S3_TAG_ICEBERG_NAMESPACE));
  }
}
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(newTableName).build())
            .build());
    AssertHelpers.assertThrows(
        "should fail to rename to an existing table",
        software.amazon.awssdk.services.glue.model.AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(newTableName).build())
            .build());
    AssertHelpers.assertThrows(
        "should fail to rename to an existing table",
        software.amazon.awssdk.services.glue.model.AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
  public void testCreateTableBadName() {
    String namespace = createNamespace();
    AssertHelpers.assertThrows(
        "should not create table with bad name",
        IllegalArgumentException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
  public void testCreateTableBadName() {
    String namespace = createNamespace();
    AssertHelpers.assertThrows(
        "should not create table with bad name",
        IllegalArgumentException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java

    glueCatalog.dropTable(TableIdentifier.of(namespace, tableName));
    AssertHelpers.assertThrows(
        "should not have table",
        NoSuchTableException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java

    glueCatalog.dropTable(TableIdentifier.of(namespace, tableName));
    AssertHelpers.assertThrows(
        "should not have table",
        NoSuchTableException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    String namespace = createNamespace();
    String tableName = createTable(namespace);
    AssertHelpers.assertThrows(
        "should not create table with the same name",
        AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    String namespace = createNamespace();
    String tableName = createTable(namespace);
    AssertHelpers.assertThrows(
        "should not create table with the same name",
        AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    String tableName = createTable(namespace);
    glueCatalog.dropTable(TableIdentifier.of(namespace, tableName), false);
    AssertHelpers.assertThrows(
        "should not have table",
        NoSuchTableException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    String tableName = createTable(namespace);
    glueCatalog.dropTable(TableIdentifier.of(namespace, tableName), false);
    AssertHelpers.assertThrows(
        "should not have table",
        NoSuchTableException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(tableName).parameters(Maps.newHashMap()).build())
            .build());
    AssertHelpers.assertThrows(
        "should fail to rename",
        ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
            .tableInput(TableInput.builder().name(tableName).parameters(Maps.newHashMap()).build())
            .build());
    AssertHelpers.assertThrows(
        "should fail to rename",
        ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
                TableIdentifier.of(namespace, tableName),
                TableIdentifier.of(namespace, newTableName)));
    AssertHelpers.assertThrows(
        "renamed table should be deleted",
        EntityNotFoundException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
                TableIdentifier.of(namespace, tableName),
                TableIdentifier.of(namespace, newTableName)));
    AssertHelpers.assertThrows(
        "renamed table should be deleted",
        EntityNotFoundException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
            .withRecordCount(1)
            .build();
    AssertHelpers.assertThrows(
        "attempt to insert to a table without INSERT permission should fail",
        S3Exception.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
            .withRecordCount(1)
            .build();
    AssertHelpers.assertThrows(
        "attempt to insert to a table without INSERT permission should fail",
        S3Exception.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
  @Test
  public void testLoadTableWithNoTableAccess() {
    AssertHelpers.assertThrows(
        "attempt to load a table without SELECT permission should fail",
        AccessDeniedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
  @Test
  public void testLoadTableWithNoTableAccess() {
    AssertHelpers.assertThrows(
        "attempt to load a table without SELECT permission should fail",
        AccessDeniedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
            .withRecordCount(1)
            .build();
    AssertHelpers.assertThrows(
        "attempt to delete without DATA_LOCATION_ACCESS permission should fail",
        ForbiddenException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
            .withRecordCount(1)
            .build();
    AssertHelpers.assertThrows(
        "attempt to delete without DATA_LOCATION_ACCESS permission should fail",
        ForbiddenException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        response.item().get("namespace").s());

    AssertHelpers.assertThrows(
        "should not create duplicated namespace",
        AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        response.item().get("namespace").s());

    AssertHelpers.assertThrows(
        "should not create duplicated namespace",
        AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
  @Test
  public void testCreateNamespaceBadName() {
    AssertHelpers.assertThrows(
        "should not create namespace with empty level",
        ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
  @Test
  public void testCreateNamespaceBadName() {
    AssertHelpers.assertThrows(
        "should not create namespace with empty level",
        ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.createNamespace(Namespace.of("a", "", "b")));

    AssertHelpers.assertThrows(
        "should not create namespace with dot in level",
        ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.createNamespace(Namespace.of("a", "", "b")));

    AssertHelpers.assertThrows(
        "should not create namespace with dot in level",
        ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        response.item().get("namespace").s());

    AssertHelpers.assertThrows(
        "should not create duplicated table",
        AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        response.item().get("namespace").s());

    AssertHelpers.assertThrows(
        "should not create duplicated table",
        AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
                    .build())
            .hasItem());
    AssertHelpers.assertThrows(
        "metadata location should be deleted",
        NoSuchKeyException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
                    .build())
            .hasItem());
    AssertHelpers.assertThrows(
        "metadata location should be deleted",
        NoSuchKeyException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
    TableIdentifier tableIdentifier2 = TableIdentifier.of(namespace2, genRandomName());

    AssertHelpers.assertThrows(
        "should not be able to rename a table not exist",
        NoSuchTableException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
    TableIdentifier tableIdentifier2 = TableIdentifier.of(namespace2, genRandomName());

    AssertHelpers.assertThrows(
        "should not be able to rename a table not exist",
        NoSuchTableException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.renameTable(TableIdentifier.of(namespace, "a"), tableIdentifier2));

    AssertHelpers.assertThrows(
        "should not be able to rename an existing table",
        AlreadyExistsException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.renameTable(TableIdentifier.of(namespace, "a"), tableIdentifier2));

    AssertHelpers.assertThrows(
        "should not be able to rename an existing table",
        AlreadyExistsException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
    Namespace namespace = Namespace.of(genRandomName());
    catalog.createNamespace(namespace);
    AssertHelpers.assertThrows(
        "should not create table name with empty namespace",
        ValidationException.class,
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSInputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSInputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
    Namespace namespace = Namespace.of(genRandomName());
    catalog.createNamespace(namespace);
    AssertHelpers.assertThrows(
        "should not create table name with empty namespace",
        ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.createTable(TableIdentifier.of(Namespace.empty(), "a"), SCHEMA));

    AssertHelpers.assertThrows(
        "should not create table name with dot",
        ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.util.concurrent.Callable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/dynamodb/TestDynamoDbCatalog.java`
#### Snippet
```java
        () -> catalog.createTable(TableIdentifier.of(Namespace.empty(), "a"), SCHEMA));

    AssertHelpers.assertThrows(
        "should not create table name with dot",
        ValidationException.class,
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSOutputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSOutputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    breakFallbackCatalogCommitCheck(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since the catalog check was blocked",
        CommitStateUnknownException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    breakFallbackCatalogCommitCheck(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since the catalog check was blocked",
        CommitStateUnknownException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, new CommitFailedException("Datacenter on fire"));

    AssertHelpers.assertThrows(
        "Commit failed exception should directly throw",
        CommitFailedException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, new CommitFailedException("Datacenter on fire"));

    AssertHelpers.assertThrows(
        "Commit failed exception should directly throw",
        CommitFailedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    breakFallbackCatalogCommitCheck(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since the catalog check was blocked",
        CommitStateUnknownException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    breakFallbackCatalogCommitCheck(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since the catalog check was blocked",
        CommitStateUnknownException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, AccessDeniedException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw forbidden exception",
        ForbiddenException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, AccessDeniedException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw forbidden exception",
        ForbiddenException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, ValidationException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw validation exception",
        org.apache.iceberg.exceptions.ValidationException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, ValidationException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw validation exception",
        org.apache.iceberg.exceptions.ValidationException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, ConcurrentModificationException.builder().build());

    AssertHelpers.assertThrowsWithCause(
        "GlueCatalog should fail on concurrent modifications",
        CommitFailedException.class,
```

### Deprecation
'assertThrowsWithCause(java.lang.String, java.lang.Class, java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, ConcurrentModificationException.builder().build());

    AssertHelpers.assertThrowsWithCause(
        "GlueCatalog should fail on concurrent modifications",
        CommitFailedException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, EntityNotFoundException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw not found exception",
        NotFoundException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, EntityNotFoundException.builder().build());

    AssertHelpers.assertThrows(
        "Should throw not found exception",
        NotFoundException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, S3Exception.builder().statusCode(300).build());

    AssertHelpers.assertThrows(
        null, S3Exception.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, S3Exception.builder().statusCode(300).build());

    AssertHelpers.assertThrows(
        null, S3Exception.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since exception is unexpected",
        CommitStateUnknownException.class,
```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.String, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps);

    AssertHelpers.assertThrows(
        "Should throw CommitStateUnknownException since exception is unexpected",
        CommitStateUnknownException.class,
```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, GlueException.builder().statusCode(500).build());

    AssertHelpers.assertThrows(
        null, CommitFailedException.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, GlueException.builder().statusCode(500).build());

    AssertHelpers.assertThrows(
        null, CommitFailedException.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'org.apache.iceberg.AssertHelpers' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, GlueException.builder().statusCode(300).build());

    AssertHelpers.assertThrows(
        null, GlueException.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'assertThrows(java.lang.String, java.lang.Class, java.lang.Runnable)' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    failCommitAndThrowException(spyOps, GlueException.builder().statusCode(300).build());

    AssertHelpers.assertThrows(
        null, GlueException.class, () -> spyOps.commit(metadataV2, metadataV1));

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/OrcIterable.java`
#### Snippet
```java
          file.location(), readerSchema, orcFileReader.rows(options), recordsPerBatch);
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to get ORC rows for file: %s", file);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/OrcFileAppender.java`
#### Snippet
```java
      return Collections.unmodifiableList(Lists.transform(stripes, StripeInformation::getOffset));
    } catch (IOException e) {
      throw new RuntimeIOException(
          e, "Failed to get stripe information from writer for: %s", file.location());
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/OrcMetrics.java`
#### Snippet
```java
          mapping);
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to open file: %s", file.location());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/OrcMetrics.java`
#### Snippet
```java
          null);
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to get statistics from writer");
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/VectorizedRowBatchIterator.java`
#### Snippet
```java
        rows.nextBatch(batch);
      } catch (IOException ioe) {
        throw new RuntimeIOException(ioe, "Problem reading ORC file %s", fileLocation);
      }
      advanced = true;
```

### Deprecation
'HTTP_CLIENT_TYPE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
    assumeRoleProperties.put(AwsProperties.GLUE_LAKEFORMATION_ENABLED, "true");
    assumeRoleProperties.put(AwsProperties.GLUE_ACCOUNT_ID, AwsIntegTestUtil.testAccountId());
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_ARN, lfPrivilegedRoleArn);
    assumeRoleProperties.put(
```

### Deprecation
'HTTP_CLIENT_TYPE_APACHE' is deprecated
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
    assumeRoleProperties.put(AwsProperties.GLUE_LAKEFORMATION_ENABLED, "true");
    assumeRoleProperties.put(AwsProperties.GLUE_ACCOUNT_ID, AwsIntegTestUtil.testAccountId());
    assumeRoleProperties.put(AwsProperties.HTTP_CLIENT_TYPE, AwsProperties.HTTP_CLIENT_TYPE_APACHE);
    assumeRoleProperties.put(AwsProperties.CLIENT_ASSUME_ROLE_ARN, lfPrivilegedRoleArn);
    assumeRoleProperties.put(
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/ORC.java`
#### Snippet
```java
      writer = OrcFile.createWriter(locPath, options);
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Can't create file %s", locPath);
    }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `orc/src/main/java/org/apache/iceberg/orc/ORC.java`
#### Snippet
```java
      return OrcFile.createReader(new Path(file.location()), readerOptions);
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to open file: %s", file.location());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/TableMetadataParser.java`
#### Snippet
```java
      return writer.toString();
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to write json for: %s", metadata);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/TableMetadataParser.java`
#### Snippet
```java
      generator.flush();
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to write json to file: %s", outputFile);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/TableMetadataParser.java`
#### Snippet
```java
      return fromJson(file, JsonUtil.mapper().readValue(is, JsonNode.class));
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to read file: %s", file);
    }
  }
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `core/src/main/java/org/apache/iceberg/PropertiesUpdate.java`
#### Snippet
```java
    // Validate the metrics
    if (base != null && base.schema() != null) {
      MetricsConfig.fromProperties(newProperties).validateReferencedColumns(base.schema());
    }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestLists.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(
          e, "Cannot read manifest list file: %s", manifestList.location());
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestReader.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      throw new RuntimeIOException(e);
    }
    return metadata;
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
              cachedNewDeleteManifests.add(writer.toManifestFile());
            } catch (IOException e) {
              throw new RuntimeIOException(e, "Failed to close manifest writer");
            }
          });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
        this.hasNewDataFiles = false;
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to close manifest writer");
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestListWriter.java`
#### Snippet
```java

      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create snapshot list writer for path: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestListWriter.java`
#### Snippet
```java

      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create snapshot list writer for path: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to write manifest list file");
    }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to read manifest: %s", manifest.path());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/BaseRewriteManifests.java`
#### Snippet
```java
          newManifests.add(writer.toManifestFile());
        } catch (IOException x) {
          throw new RuntimeIOException(x);
        }
      }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/BaseRewriteManifests.java`
#### Snippet
```java

                  } catch (IOException x) {
                    throw new RuntimeIOException(x);
                  }
                }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ScanSummary.java`
#### Snippet
```java

      } catch (IOException e) {
        throw new RuntimeIOException(e);
      }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/DeleteFileIndex.java`
#### Snippet
```java
                  }
                } catch (IOException e) {
                  throw new RuntimeIOException(e, "Failed to close");
                }
              });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestFiles.java`
#### Snippet
```java
          ManifestEntry.Status.EXISTING);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to close manifest: %s", toCopy.location());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestFiles.java`
#### Snippet
```java
          ManifestEntry.Status.ADDED);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to close manifest: %s", toCopy.location());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestFiles.java`
#### Snippet
```java
      } catch (IOException e) {
        if (!threw) {
          throw new RuntimeIOException(e, "Failed to close manifest: %s", outputFile);
        }
      }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ReachableFileCleanup.java`
#### Snippet
```java
                paths.forEach(filesToDelete::add);
              } catch (IOException e) {
                throw new RuntimeIOException(e, "Failed to read manifest file: %s", manifest);
              }
            });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ReachableFileCleanup.java`
#### Snippet
```java
                  paths.forEach(filesToDelete::remove);
                } catch (IOException e) {
                  throw new RuntimeIOException(e, "Failed to read manifest file: %s", manifest);
                }
              });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ReachableFileCleanup.java`
#### Snippet
```java
                }
              } catch (IOException e) {
                throw new RuntimeIOException(
                    e, "Failed to close manifest list: %s", snapshot.manifestListLocation());
              }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ReachableFileCleanup.java`
#### Snippet
```java
                }
              } catch (IOException e) {
                throw new RuntimeIOException(
                    e, "Failed to close manifest list: %s", snapshot.manifestListLocation());
              }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/CatalogUtil.java`
#### Snippet
```java
                deleteFiles(io, pathsToDelete, type, false);
              } catch (IOException e) {
                throw new RuntimeIOException(
                    e, "Failed to read manifest file: %s", manifest.path());
              }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestMergeManager.java`
#### Snippet
```java
          }
        } catch (IOException e) {
          throw new RuntimeIOException(e, "Failed to close manifest reader");
        }
      }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/AllManifestsTable.java`
#### Snippet
```java

      } catch (IOException e) {
        throw new RuntimeIOException(e, "Cannot read manifest list file: %s", manifestListLocation);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestWriter.java`
#### Snippet
```java
            .build();
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create manifest writer for path: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestWriter.java`
#### Snippet
```java
            .build();
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create manifest writer for path: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestWriter.java`
#### Snippet
```java
            .build();
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create manifest writer for path: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestFilterManager.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to close manifest: %s", manifest);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/ManifestFilterManager.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to close manifest writer");
    }
  }
```

### Deprecation
'OBJECT_STORE_PATH' is deprecated
in `core/src/main/java/org/apache/iceberg/LocationProviders.java`
#### Snippet
```java
      String dataLocation = properties.get(TableProperties.WRITE_DATA_LOCATION);
      if (dataLocation == null) {
        dataLocation = properties.get(TableProperties.OBJECT_STORE_PATH);
        if (dataLocation == null) {
          dataLocation = properties.get(TableProperties.WRITE_FOLDER_STORAGE_LOCATION);
```

### Deprecation
'WRITE_FOLDER_STORAGE_LOCATION' is deprecated
in `core/src/main/java/org/apache/iceberg/LocationProviders.java`
#### Snippet
```java
        dataLocation = properties.get(TableProperties.OBJECT_STORE_PATH);
        if (dataLocation == null) {
          dataLocation = properties.get(TableProperties.WRITE_FOLDER_STORAGE_LOCATION);
          if (dataLocation == null) {
            dataLocation = String.format("%s/data", tableLocation);
```

### Deprecation
'WRITE_FOLDER_STORAGE_LOCATION' is deprecated
in `core/src/main/java/org/apache/iceberg/LocationProviders.java`
#### Snippet
```java
      String dataLocation = properties.get(TableProperties.WRITE_DATA_LOCATION);
      if (dataLocation == null) {
        dataLocation = properties.get(TableProperties.WRITE_FOLDER_STORAGE_LOCATION);
        if (dataLocation == null) {
          dataLocation = String.format("%s/data", tableLocation);
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.TableScan'
in `core/src/main/java/org/apache/iceberg/BaseTableScan.java`
#### Snippet
```java

  @Override
  public TableScan appendsBetween(long fromSnapshotId, long toSnapshotId) {
    throw new UnsupportedOperationException("Incremental scan is not supported");
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.TableScan'
in `core/src/main/java/org/apache/iceberg/BaseTableScan.java`
#### Snippet
```java

  @Override
  public TableScan appendsAfter(long fromSnapshotId) {
    throw new UnsupportedOperationException("Incremental scan is not supported");
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/IncrementalFileCleanup.java`
#### Snippet
```java
                }
              } catch (IOException e) {
                throw new RuntimeIOException(e, "Failed to read manifest file: %s", manifest);
              }
            });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/IncrementalFileCleanup.java`
#### Snippet
```java
                }
              } catch (IOException e) {
                throw new RuntimeIOException(e, "Failed to read manifest file: %s", manifest);
              }
            });
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/IncrementalFileCleanup.java`
#### Snippet
```java

              } catch (IOException e) {
                throw new RuntimeIOException(
                    e, "Failed to close manifest list: %s", snapshot.manifestListLocation());
              }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/IncrementalFileCleanup.java`
#### Snippet
```java
                  }
                } catch (IOException e) {
                  throw new RuntimeIOException(
                      e, "Failed to close manifest list: %s", snapshot.manifestListLocation());
                }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/FastAppend.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to write manifest");
    }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/BaseSnapshot.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to close entries while caching changes");
    }

```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!isClosed.get()) {
```

### Deprecation
'finalize()' is deprecated
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!isClosed.get()) {
      close();
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `core/src/main/java/org/apache/iceberg/TableMetadata.java`
#### Snippet
```java
    // Validate the metrics configuration. Note: we only do this on new tables to we don't
    // break existing tables.
    MetricsConfig.fromProperties(properties).validateReferencedColumns(schema);

    return new Builder()
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

          if (!Arrays.equals(fileSync, blockSync)) {
            throw new RuntimeIOException("Invalid sync at %s", nextSyncPos);
          }
        }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to read stream while finding starting row position");
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
        return reader.next(reuse);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to read next record");
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
        return reused;
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to read next record");
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
        return reader.hasNext() && !reader.pastSync(end);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to check range end: %d", end);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
        reader.sync(start);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to find sync past position %d", start);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
          DataFileReader.openReader(AvroIO.stream(file.newStream(), file.getLength()), reader);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to open file: %s", file);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroIterable.java`
#### Snippet
```java
        initMetadata(reader);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to read metadata for file: %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
      writer.append(datum);
    } catch (IOException e) {
      throw new RuntimeIOException(e);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
        return stream.getPos();
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to get stream length");
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
      }
    }
    throw new RuntimeIOException("Failed to get stream length: no open stream");
  }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/data/avro/DecoderResolver.java`
#### Snippet
```java
      return DecoderFactory.get().resolvingDecoder(fileSchema, readSchema, null);
    } catch (IOException e) {
      throw new RuntimeIOException(e);
    }
  }
```

### Deprecation
'com.fasterxml.jackson.databind.PropertyNamingStrategy.KebabCaseStrategy' is deprecated
in `core/src/main/java/org/apache/iceberg/rest/RESTObjectMapper.java`
#### Snippet
```java
          MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
          MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
          MAPPER.setPropertyNamingStrategy(new PropertyNamingStrategy.KebabCaseStrategy());
          RESTSerializers.registerAll(MAPPER);
          isInitialized = true;
```

### Deprecation
'execute(org.apache.hc.core5.http.ClassicHttpRequest)' is deprecated
in `core/src/main/java/org/apache/iceberg/rest/HTTPClient.java`
#### Snippet
```java
    }

    try (CloseableHttpResponse response = httpClient.execute(request)) {
      Map<String, String> respHeaders = Maps.newHashMap();
      for (Header header : response.getHeaders()) {
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/util/ParallelIterable.java`
#### Snippet
```java
                              }
                            } catch (IOException e) {
                              throw new RuntimeIOException(e, "Failed to close iterable");
                            }
                          })
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/util/Exceptions.java`
#### Snippet
```java
    } catch (IOException e) {
      if (!suppressExceptions) {
        throw new RuntimeIOException(e, "Failed calling close");
      }
      // otherwise, ignore the exception
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopOutputFile.java`
#### Snippet
```java
      return HadoopStreams.wrap(fs.create(path, true /* createOrOverwrite */));
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to create file: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopOutputFile.java`
#### Snippet
```java
      throw new AlreadyExistsException(e, "Path already exists: %s", path);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to create file: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
  }

  private Counter<Integer> integerCounter(Consumer<Integer> consumer) {
    return new Counter<Integer>() {
      @Override
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
  }

  private Counter<Long> longCounter(Consumer<Long> consumer) {
    return new Counter<Long>() {
      @Override
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java

  private Counter<Long> longCounter(Consumer<Long> consumer) {
    return new Counter<Long>() {
      @Override
      public void increment() {
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java

  private Counter<Integer> integerCounter(Consumer<Integer> consumer) {
    return new Counter<Integer>() {
      @Override
      public void increment() {
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public <T extends Number> Counter<T> counter(String name, Class<T> type, Unit unit) {
    switch (name) {
      case READ_BYTES:
```

### Deprecation
Overrides deprecated method in 'org.apache.iceberg.metrics.MetricsContext'
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public <T extends Number> Counter<T> counter(String name, Class<T> type, Unit unit) {
    switch (name) {
      case READ_BYTES:
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
      case READ_BYTES:
        ValidationException.check(type == Long.class, "'%s' requires Long type", READ_BYTES);
        return (Counter<T>) longCounter(statistics()::incrementBytesRead);
      case READ_OPERATIONS:
        ValidationException.check(
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
        ValidationException.check(
            type == Integer.class, "'%s' requires Integer type", READ_OPERATIONS);
        return (Counter<T>) integerCounter(statistics()::incrementReadOps);
      case WRITE_BYTES:
        ValidationException.check(type == Long.class, "'%s' requires Long type", WRITE_BYTES);
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
      case WRITE_BYTES:
        ValidationException.check(type == Long.class, "'%s' requires Long type", WRITE_BYTES);
        return (Counter<T>) longCounter(statistics()::incrementBytesWritten);
      case WRITE_OPERATIONS:
        ValidationException.check(
```

### Deprecation
'org.apache.iceberg.metrics.MetricsContext.Counter' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopMetricsContext.java`
#### Snippet
```java
        ValidationException.check(
            type == Integer.class, "'%s' requires Integer type", WRITE_OPERATIONS);
        return (Counter<T>) integerCounter(statistics()::incrementWriteOps);
      default:
        throw new IllegalArgumentException(String.format("Unsupported counter: '%s'", name));
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopFileIO.java`
#### Snippet
```java
      fs.delete(toDelete, false /* not recursive */);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to delete file: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/Util.java`
#### Snippet
```java
      return path.getFileSystem(conf);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to get file system for path: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopInputFile.java`
#### Snippet
```java
        throw new NotFoundException(e, "File does not exist: %s", path);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to get status for file: %s", path);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopInputFile.java`
#### Snippet
```java
      throw new NotFoundException(e, "Failed to open input stream for file: %s", path);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to open input stream for file: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopInputFile.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to get block locations for path: %s", path);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
      return currentMetadata;
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to refresh the table");
    }
  }
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:NoFinalizer")
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      if (!closed) {
        close(); // releasing resources is more important than printing the warning
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:NoFinalizer")
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java
    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      if (!closed) {
        close(); // releasing resources is more important than printing the warning
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to delete file: %s", tablePath);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java

    } catch (IOException e) {
      throw new RuntimeIOException(e, "Create namespace failed: %s", namespace);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java
      return namespaces;
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to list namespace under: %s", namespace);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java
      }
    } catch (IOException ioe) {
      throw new RuntimeIOException(ioe, "Failed to list tables under: %s", namespace);
    }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java
      return fs.delete(nsPath, false /* recursive */);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Namespace delete failed: %s", namespace);
    }
  }
```

### Deprecation
'rewriteFiles(java.util.Set, java.util.Set, long)' is deprecated
in `core/src/main/java/org/apache/iceberg/actions/RewriteDataFilesCommitManager.java`
#### Snippet
```java
    if (useStartingSequenceNumber) {
      long sequenceNumber = table.snapshot(startingSnapshotId).sequenceNumber();
      rewrite.rewriteFiles(rewrittenDataFiles, addedDataFiles, sequenceNumber);
    } else {
      rewrite.rewriteFiles(rewrittenDataFiles, addedDataFiles);
```

### Deprecation
'rewriteFiles(java.util.Set, java.util.Set)' is deprecated
in `core/src/main/java/org/apache/iceberg/actions/RewriteDataFilesCommitManager.java`
#### Snippet
```java
      rewrite.rewriteFiles(rewrittenDataFiles, addedDataFiles, sequenceNumber);
    } else {
      rewrite.rewriteFiles(rewrittenDataFiles, addedDataFiles);
    }

```

### Deprecation
'add(long, long)' is deprecated
in `core/src/main/java/org/apache/iceberg/deletes/BitmapPositionDeleteIndex.java`
#### Snippet
```java
  @Override
  public void delete(long posStart, long posEnd) {
    roaring64Bitmap.add(posStart, posEnd);
  }

```

### Deprecation
'appendsAfter(long)' is deprecated
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/IcebergGenerics.java`
#### Snippet
```java

    public ScanBuilder appendsAfter(long fromSnapshotId) {
      this.tableScan = tableScan.appendsAfter(fromSnapshotId);
      return this;
    }
```

### Deprecation
'appendsBetween(long, long)' is deprecated
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/IcebergGenerics.java`
#### Snippet
```java

    public ScanBuilder appendsBetween(long fromSnapshotId, long toSnapshotId) {
      this.tableScan = tableScan.appendsBetween(fromSnapshotId, toSnapshotId);
      return this;
    }
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericAppenderFactory.java`
#### Snippet
```java
        "Equality delete row schema shouldn't be null when creating equality-delete writer");

    MetricsConfig metricsConfig = MetricsConfig.fromProperties(config);
    try {
      switch (format) {
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericAppenderFactory.java`
#### Snippet
```java
  public PositionDeleteWriter<Record> newPosDeleteWriter(
      EncryptedOutputFile file, FileFormat format, StructLike partition) {
    MetricsConfig metricsConfig = MetricsConfig.fromProperties(config);
    try {
      switch (format) {
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericAppenderFactory.java`
#### Snippet
```java
  @Override
  public FileAppender<Record> newAppender(OutputFile outputFile, FileFormat fileFormat) {
    MetricsConfig metricsConfig = MetricsConfig.fromProperties(config);
    try {
      switch (fileFormat) {
```

### Deprecation
'Decimal(int, int)' is deprecated
in `arrow/src/main/java/org/apache/iceberg/arrow/ArrowSchemaUtil.java`
#### Snippet
```java
      case DECIMAL:
        final Types.DecimalType decimalType = (Types.DecimalType) field.type();
        arrowType = new ArrowType.Decimal(decimalType.precision(), decimalType.scale());
        break;
      case STRING:
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
    PrimitiveType.PrimitiveTypeName typeName = primitive.getPrimitiveTypeName();
    Types.NestedField physicalType = logicalType;
    if (OriginalType.DECIMAL.equals(primitive.getOriginalType())) {
      org.apache.iceberg.types.Type type;
      if (PrimitiveType.PrimitiveTypeName.INT64.equals(typeName)) {
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java

  private static boolean isDecimal(PrimitiveType primitive) {
    return primitive != null && OriginalType.DECIMAL.equals(primitive.getOriginalType());
  }

```

### Deprecation
'org.apache.flink.table.api.constraints.UniqueConstraint' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/IcebergTableSink.java`
#### Snippet
```java

    List<String> equalityColumns =
        tableSchema.getPrimaryKey().map(UniqueConstraint::getColumns).orElseGet(ImmutableList::of);

    return new DataStreamSinkProvider() {
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/IcebergTableSink.java`
#### Snippet
```java
  public IcebergTableSink(
      TableLoader tableLoader,
      TableSchema tableSchema,
      ReadableConfig readableConfig,
      Map<String, String> writeProps) {
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/IcebergTableSink.java`
#### Snippet
```java
public class IcebergTableSink implements DynamicTableSink, SupportsPartitioning, SupportsOverwrite {
  private final TableLoader tableLoader;
  private final TableSchema tableSchema;
  private final ReadableConfig readableConfig;
  private final Map<String, String> writeProps;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java

  /**
   * Convert a Flink {@link TableSchema} to a {@link Schema} based on the given schema.
   *
   * <p>This conversion does not assign new ids; it uses ids from the base schema.
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   * @throws IllegalArgumentException if the type cannot be converted or there are missing ids
   */
  public static Schema convert(Schema baseSchema, TableSchema flinkSchema) {
    // convert to a type with fresh ids
    Types.StructType struct = convert(flinkSchema).asStruct();
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
  }

  private static Schema freshIdentifierFieldIds(Schema iSchema, TableSchema schema) {
    // Locate the identifier field id list.
    Set<Integer> identifierFieldIds = Sets.newHashSet();
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java

  /** Convert the flink table schema to apache iceberg schema. */
  public static Schema convert(TableSchema schema) {
    LogicalType schemaType = schema.toRowDataType().getLogicalType();
    Preconditions.checkArgument(
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java

  /**
   * Convert a {@link Schema} to a {@link TableSchema}.
   *
   * @param schema iceberg schema to convert.
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   * @return Flink TableSchema.
   */
  public static TableSchema toSchema(Schema schema) {
    TableSchema.Builder builder = TableSchema.builder();

```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   */
  public static TableSchema toSchema(Schema schema) {
    TableSchema.Builder builder = TableSchema.builder();

    // Add columns.
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   */
  public static TableSchema toSchema(Schema schema) {
    TableSchema.Builder builder = TableSchema.builder();

    // Add columns.
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java

  /**
   * Convert a {@link RowType} to a {@link TableSchema}.
   *
   * @param rowType a RowType
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   * @return Flink TableSchema
   */
  public static TableSchema toSchema(RowType rowType) {
    TableSchema.Builder builder = TableSchema.builder();
    for (RowType.RowField field : rowType.getFields()) {
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   */
  public static TableSchema toSchema(RowType rowType) {
    TableSchema.Builder builder = TableSchema.builder();
    for (RowType.RowField field : rowType.getFields()) {
      builder.field(field.getName(), TypeConversions.fromLogicalToDataType(field.getType()));
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
   */
  public static TableSchema toSchema(RowType rowType) {
    TableSchema.Builder builder = TableSchema.builder();
    for (RowType.RowField field : rowType.getFields()) {
      builder.field(field.getName(), TypeConversions.fromLogicalToDataType(field.getType()));
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkDynamicTableFactory.java`
#### Snippet
```java
    CatalogTable catalogTable = context.getCatalogTable();
    Map<String, String> tableProps = catalogTable.getOptions();
    TableSchema tableSchema = TableSchemaUtils.getPhysicalSchema(catalogTable.getSchema());

    TableLoader tableLoader;
```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkDynamicTableFactory.java`
#### Snippet
```java
    CatalogTable catalogTable = context.getCatalogTable();
    Map<String, String> tableProps = catalogTable.getOptions();
    TableSchema tableSchema = TableSchemaUtils.getPhysicalSchema(catalogTable.getSchema());

    TableLoader tableLoader;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkDynamicTableFactory.java`
#### Snippet
```java
    CatalogTable catalogTable = context.getCatalogTable();
    Map<String, String> writeProps = catalogTable.getOptions();
    TableSchema tableSchema = TableSchemaUtils.getPhysicalSchema(catalogTable.getSchema());

    TableLoader tableLoader;
```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkDynamicTableFactory.java`
#### Snippet
```java
    CatalogTable catalogTable = context.getCatalogTable();
    Map<String, String> writeProps = catalogTable.getOptions();
    TableSchema tableSchema = TableSchemaUtils.getPhysicalSchema(catalogTable.getSchema());

    TableLoader tableLoader;
```

### Deprecation
Overrides deprecated method in 'org.apache.flink.table.factories.CatalogFactory'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java

  @Override
  public List<String> supportedProperties() {
    return ImmutableList.of("*");
  }
```

### Deprecation
Overrides deprecated method in 'org.apache.flink.table.factories.CatalogFactory'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java

  @Override
  public Map<String, String> requiredContext() {
    Map<String, String> context = Maps.newHashMap();
    context.put(TYPE, "iceberg");
```

### Deprecation
Overrides deprecated method in 'org.apache.flink.table.factories.CatalogFactory'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalogFactory.java`
#### Snippet
```java

  @Override
  public Catalog createCatalog(String name, Map<String, String> properties) {
    return createCatalog(name, properties, clusterHadoopConf());
  }
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
        table instanceof CatalogTable, "The Table should be a CatalogTable.");

    TableSchema schema = table.getSchema();
    schema
        .getTableColumns()
```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
        table instanceof CatalogTable, "The Table should be a CatalogTable.");

    TableSchema schema = table.getSchema();
    schema
        .getTableColumns()
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java

  static CatalogTable toCatalogTable(Table table) {
    TableSchema schema = FlinkSchemaUtil.toSchema(table.schema());
    List<String> partitionKeys = toPartitionKeys(table.spec(), table.schema());

```

### Deprecation
'org.apache.flink.table.catalog.CatalogTableImpl' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
    // Let's re-loading table from Iceberg catalog when creating source/sink operators.
    // Iceberg does not have Table comment, so pass a null (Default comment value in Flink).
    return new CatalogTableImpl(schema, partitionKeys, table.properties(), null);
  }

```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java

  private static void validateTableSchemaAndPartition(CatalogTable ct1, CatalogTable ct2) {
    TableSchema ts1 = ct1.getSchema();
    TableSchema ts2 = ct2.getSchema();
    boolean equalsPrimary = false;
```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java

  private static void validateTableSchemaAndPartition(CatalogTable ct1, CatalogTable ct2) {
    TableSchema ts1 = ct1.getSchema();
    TableSchema ts2 = ct2.getSchema();
    boolean equalsPrimary = false;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
  private static void validateTableSchemaAndPartition(CatalogTable ct1, CatalogTable ct2) {
    TableSchema ts1 = ct1.getSchema();
    TableSchema ts2 = ct2.getSchema();
    boolean equalsPrimary = false;

```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
  private static void validateTableSchemaAndPartition(CatalogTable ct1, CatalogTable ct2) {
    TableSchema ts1 = ct1.getSchema();
    TableSchema ts2 = ct2.getSchema();
    boolean equalsPrimary = false;

```

### Deprecation
'getSchema()' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkCatalog.java`
#### Snippet
```java
    validateFlinkTable(table);

    Schema icebergSchema = FlinkSchemaUtil.convert(table.getSchema());
    PartitionSpec spec = toPartitionSpec(((CatalogTable) table).getPartitionKeys(), icebergSchema);

```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
      // if not a primitive, the typeId must be a group
      GroupType group = type.asGroupType();
      OriginalType annotation = group.getOriginalType();
      if (annotation != null) {
        switch (annotation) {
```

### Deprecation
'org.apache.flink.table.api.TableColumn' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/util/FlinkCompatibilityUtil.java`
#### Snippet
```java
  }

  public static boolean isPhysicalColumn(TableColumn column) {
    return column.isPhysical();
  }
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/FlinkSource.java`
#### Snippet
```java
    }

    public Builder project(TableSchema schema) {
      this.projectedSchema = schema;
      return this;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/FlinkSource.java`
#### Snippet
```java
    private Table table;
    private TableLoader tableLoader;
    private TableSchema projectedSchema;
    private ReadableConfig readableConfig = new Configuration();
    private final ScanContext.Builder contextBuilder = ScanContext.builder();
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
  }

  static RowType toFlinkRowType(Schema schema, TableSchema requestedSchema) {
    if (requestedSchema != null) {
      // Convert the flink schema to iceberg schema firstly, then reassign ids to match the existing
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
   * Initialize a {@link Builder} to export the data from input data stream with {@link Row}s into
   * iceberg table. We use {@link RowData} inside the sink connector, so users need to provide a
   * {@link TableSchema} for builder to convert those {@link Row}s to a {@link RowData} DataStream.
   *
   * @param input the source input data stream with {@link Row}s.
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
   * @return {@link Builder} to connect the iceberg table.
   */
  public static Builder forRow(DataStream<Row> input, TableSchema tableSchema) {
    RowType rowType = (RowType) tableSchema.toRowDataType().getLogicalType();
    DataType[] fieldDataTypes = tableSchema.getFieldDataTypes();
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
    private TableLoader tableLoader;
    private Table table;
    private TableSchema tableSchema;
    private List<String> equalityFieldColumns = null;
    private String uidPrefix = null;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
    }

    public Builder tableSchema(TableSchema newTableSchema) {
      this.tableSchema = newTableSchema;
      return this;
```

### Deprecation
'properties(java.util.Map)' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
            .tableLoader(loader)
            .assignerFactory(assignerType.factory())
            .properties(properties)
            .project(getProjectedSchema())
            .limit(limit)
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
  public IcebergTableSource(
      TableLoader loader,
      TableSchema schema,
      Map<String, String> properties,
      ReadableConfig readableConfig) {
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
  }

  private TableSchema getProjectedSchema() {
    if (projectedFields == null) {
      return schema;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
      String[] fullNames = schema.getFieldNames();
      DataType[] fullTypes = schema.getFieldDataTypes();
      return TableSchema.builder()
          .fields(
              Arrays.stream(projectedFields).mapToObj(i -> fullNames[i]).toArray(String[]::new),
```

### Deprecation
Overrides deprecated method in 'org.apache.flink.table.connector.source.abilities.SupportsProjectionPushDown'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java

  @Override
  public void applyProjection(int[][] projectFields) {
    this.projectedFields = new int[projectFields.length];
    for (int i = 0; i < projectFields.length; i++) {
```

### Deprecation
'properties(java.util.Map)' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
        .env(execEnv)
        .tableLoader(loader)
        .properties(properties)
        .project(getProjectedSchema())
        .limit(limit)
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java

  private final TableLoader loader;
  private final TableSchema schema;
  private final Map<String, String> properties;
  private final boolean isLimitPushDown;
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
  private IcebergTableSource(
      TableLoader loader,
      TableSchema schema,
      Map<String, String> properties,
      int[] projectedFields,
```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergSource.java`
#### Snippet
```java
    private ReadableConfig flinkConfig = new Configuration();
    private final ScanContext.Builder contextBuilder = ScanContext.builder();
    private TableSchema projectedFlinkSchema;
    private Boolean exposeLocality;

```

### Deprecation
'org.apache.flink.table.api.TableSchema' is deprecated
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergSource.java`
#### Snippet
```java
    }

    public Builder<T> project(TableSchema newProjectedFlinkSchema) {
      this.projectedFlinkSchema = newProjectedFlinkSchema;
      return this;
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("intCol", "intCol2")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("stringCol")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("stringCol", "intCol", "dateCol", "timestampCol", "doubleCol", "longCol")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("intCol")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("stringCol", "intCol", "dateCol", "doubleCol")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("intCol", "intCol2", "intCol3")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .zOrder("intCol", "intCol2", "intCol3", "intCol4")
        .execute();
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'org.apache.iceberg.actions.BinPackStrategy' is deprecated
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
    SparkActions.get()
        .rewriteDataFiles(table())
        .option(BinPackStrategy.REWRITE_ALL, "true")
        .sort(
            SortOrder.builderFor(table().schema())
```

### Deprecation
'schema()' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/RollbackStagedTable.java`
#### Snippet
```java
  @Override
  public StructType schema() {
    return table.schema();
  }

```

### Deprecation
'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
  public static void validateTimestampWithoutTimezoneConfig(
      RuntimeConfig conf, Map<String, String> options) {
    if (conf.contains(SparkSQLProperties.HANDLE_TIMESTAMP_WITHOUT_TIMEZONE)) {
      throw new UnsupportedOperationException(
          "Spark configuration "
```

### Deprecation
'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
      throw new UnsupportedOperationException(
          "Spark configuration "
              + SparkSQLProperties.HANDLE_TIMESTAMP_WITHOUT_TIMEZONE
              + " is not supported in Spark 3.4 due to the introduction of native support for timestamp without timezone.");
    }
```

### Deprecation
'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
    }

    if (options.containsKey(SparkReadOptions.HANDLE_TIMESTAMP_WITHOUT_TIMEZONE)) {
      throw new UnsupportedOperationException(
          "Option "
```

### Deprecation
'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
      throw new UnsupportedOperationException(
          "Option "
              + SparkReadOptions.HANDLE_TIMESTAMP_WITHOUT_TIMEZONE
              + " is not supported in Spark 3.4 due to the introduction of native support for timestamp without timezone.");
    }
```

### Deprecation
'USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
    }

    if (conf.contains(SparkSQLProperties.USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES)) {
      throw new UnsupportedOperationException(
          "Spark configuration "
```

### Deprecation
'USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkUtil.java`
#### Snippet
```java
      throw new UnsupportedOperationException(
          "Spark configuration "
              + SparkSQLProperties.USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES
              + " is not supported in Spark 3.4 due to the introduction of native support for timestamp without timezone.");
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkExceptionUtil.java`
#### Snippet
```java

    } else if (cause instanceof IOException) {
      return new RuntimeIOException((IOException) cause, message, args);

    } else {
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
      // if not a primitive, the typeId must be a group
      GroupType group = type.asGroupType();
      OriginalType annotation = group.getOriginalType();
      if (annotation != null) {
        switch (annotation) {
```

### Deprecation
'createTable(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
      // create the table with the session catalog, then wrap it in a staged table that will delete
      // to roll back
      Table table = catalog.createTable(ident, schema, partitions, properties);
      return new RollbackStagedTable(catalog, ident, table);

```

### Deprecation
'createTable(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
      // create the table with the session catalog, then wrap it in a staged table that will delete
      // to roll back
      Table sessionCatalogTable = catalog.createTable(ident, schema, partitions, properties);
      return new RollbackStagedTable(catalog, ident, sessionCatalogTable);

```

### Deprecation
'createTable(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    String provider = properties.get("provider");
    if (useIceberg(provider)) {
      return icebergCatalog.createTable(ident, schema, partitions, properties);
    } else {
      // delegate to the session catalog
```

### Deprecation
'createTable(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    } else {
      // delegate to the session catalog
      return getSessionCatalog().createTable(ident, schema, partitions, properties);
    }
  }
```

### Deprecation
'stageCreate(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    if (useIceberg(provider)) {
      if (asStagingCatalog != null) {
        return asStagingCatalog.stageCreate(ident, schema, partitions, properties);
      }
      catalog = icebergCatalog;
```

### Deprecation
'createTable(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    // create the table with the session catalog, then wrap it in a staged table that will delete to
    // roll back
    Table table = catalog.createTable(ident, schema, partitions, properties);
    return new RollbackStagedTable(catalog, ident, table);
  }
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
            partitions.size(), spark.sessionState().conf().parallelPartitionDiscoveryParallelism());
    int numShufflePartitions = spark.sessionState().conf().numShufflePartitions();
    MetricsConfig metricsConfig = MetricsConfig.fromProperties(targetTable.properties());
    String nameMappingString = targetTable.properties().get(TableProperties.DEFAULT_NAME_MAPPING);
    NameMapping nameMapping =
```

### Deprecation
'fromProperties(java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkAppenderFactory.java`
#### Snippet
```java
  @Override
  public FileAppender<InternalRow> newAppender(OutputFile file, FileFormat fileFormat) {
    MetricsConfig metricsConfig = MetricsConfig.fromProperties(properties);
    try {
      switch (fileFormat) {
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkAppenderFactory.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      throw new RuntimeIOException(e);
    }
  }
```

### Deprecation
'stageCreate(org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.types.StructType, org.apache.spark.sql.connector.expressions.Transform\[\], java.util.Map)' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/BaseTableCreationSparkAction.java`
#### Snippet
```java
      Transform[] partitioning = sourceTable.partitioning();
      return (StagedSparkTable)
          destCatalog().stageCreate(destTableIdent(), schema, partitioning, props);
    } catch (org.apache.spark.sql.catalyst.analysis.NoSuchNamespaceException e) {
      throw new NoSuchNamespaceException(
```

### Deprecation
'WRITE_FOLDER_STORAGE_LOCATION' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SnapshotTableSparkAction.java`
#### Snippet
```java
    properties.remove(LOCATION);
    properties.remove(TableProperties.WRITE_METADATA_LOCATION);
    properties.remove(TableProperties.WRITE_FOLDER_STORAGE_LOCATION);
    properties.remove(TableProperties.OBJECT_STORE_PATH);
    properties.remove(TableProperties.WRITE_DATA_LOCATION);
```

### Deprecation
'OBJECT_STORE_PATH' is deprecated
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SnapshotTableSparkAction.java`
#### Snippet
```java
    properties.remove(TableProperties.WRITE_METADATA_LOCATION);
    properties.remove(TableProperties.WRITE_FOLDER_STORAGE_LOCATION);
    properties.remove(TableProperties.OBJECT_STORE_PATH);
    properties.remove(TableProperties.WRITE_DATA_LOCATION);

```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSOutputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSOutputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning.
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSInputStream.java`
#### Snippet
```java
  @SuppressWarnings("checkstyle:NoFinalizer")
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
```

### Deprecation
'finalize()' is deprecated
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSInputStream.java`
#### Snippet
```java
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    if (!closed) {
      close(); // releasing resources is more important than printing the warning
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetTypeVisitor.java`
#### Snippet
```java
      // if not a primitive, the typeId must be a group
      GroupType group = type.asGroupType();
      OriginalType annotation = group.getOriginalType();
      if (annotation != null) {
        switch (annotation) {
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetIO.java`
#### Snippet
```java
            hfile.getStat(), hfile.getConf());
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create Parquet input file for %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetIO.java`
#### Snippet
```java
            hfile.getPath(), hfile.getConf());
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create Parquet output file for %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetIO.java`
#### Snippet
```java
        return org.apache.parquet.hadoop.util.HadoopOutputFile.fromPath(hfile.getPath(), conf);
      } catch (IOException e) {
        throw new RuntimeIOException(e, "Failed to create Parquet output file for %s", file);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetIterable.java`
#### Snippet
```java
        return nextRecord;
      } catch (IOException e) {
        throw new RuntimeIOException(e);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetIterable.java`
#### Snippet
```java
      return new ParquetIterator<>(reader);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to create Parquet reader");
    }
  }
```

### Deprecation
'of(org.projectnessie.model.ContentKey, org.projectnessie.model.Content, org.projectnessie.model.Content)' is deprecated
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieIcebergClient.java`
#### Snippet
```java
                    String.format("Iceberg rename table from '%s' to '%s'", from, to),
                    catalogOptions))
            .operation(Operation.Put.of(NessieUtil.toKey(to), existingFromTable, existingFromTable))
            .operation(Operation.Delete.of(NessieUtil.toKey(from)));

```

### Deprecation
'of(org.projectnessie.model.ContentKey, org.projectnessie.model.Content, org.projectnessie.model.Content)' is deprecated
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieIcebergClient.java`
#### Snippet
```java
        getApi()
            .commitMultipleOperations()
            .operation(Operation.Put.of(key, newTable, expectedContent))
            .commitMeta(NessieUtil.catalogOptions(builder, catalogOptions).build())
            .branch(expectedHead)
```

### Deprecation
'org.apache.parquet.hadoop.CodecFactory.BytesCompressor' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetWriter.java`
#### Snippet
```java
  private final Map<String, String> metadata;
  private final ParquetProperties props;
  private final CodecFactory.BytesCompressor compressor;
  private final MessageType parquetSchema;
  private final ParquetValueWriter<T> model;
```

### Deprecation
'org.apache.parquet.schema.OriginalType' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/TypeWithSchemaVisitor.java`
#### Snippet
```java
      // if not a primitive, the typeId must be a group
      GroupType group = type.asGroupType();
      OriginalType annotation = group.getOriginalType();
      if (annotation != null) {
        switch (annotation) {
```

### Deprecation
'org.apache.parquet.hadoop.CodecFactory.BytesDecompressor' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetCodecFactory.java`
#### Snippet
```java

  /** Copied and modified from CodecFactory.HeapBytesDecompressor */
  class HeapBytesDecompressor extends BytesDecompressor {

    private final CompressionCodec codec;
```

### Deprecation
'org.apache.parquet.hadoop.CodecFactory.BytesDecompressor' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetCodecFactory.java`
#### Snippet
```java

  @Override
  protected BytesDecompressor createDecompressor(CompressionCodecName codecName) {
    return new HeapBytesDecompressor(codecName);
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetUtil.java`
#### Snippet
```java
      return footerMetrics(reader.getFooter(), Stream.empty(), metricsConfig, nameMapping);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to read footer of file: %s", file);
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ReadConf.java`
#### Snippet
```java
      return ParquetFileReader.open(ParquetIO.file(file), options);
    } catch (IOException e) {
      throw new RuntimeIOException(e, "Failed to open Parquet file: %s", file.location());
    }
  }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetReader.java`
#### Snippet
```java
        pages = reader.readNextRowGroup();
      } catch (IOException e) {
        throw new RuntimeIOException(e);
      }

```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/VectorizedParquetReader.java`
#### Snippet
```java
        pages = reader.readNextRowGroup();
      } catch (IOException e) {
        throw new RuntimeIOException(e);
      }

```

### Deprecation
'withRowGroupSize(int)' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/Parquet.java`
#### Snippet
```java
                .withCompressionCodec(codec)
                .withWriteMode(writeMode)
                .withRowGroupSize(rowGroupSize)
                .withPageSize(pageSize)
                .withPageRowCountLimit(pageRowLimit)
```

### Deprecation
'org.apache.iceberg.parquet.ParquetWriteAdapter' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/Parquet.java`
#### Snippet
```java
        }

        return new ParquetWriteAdapter<>(parquetWriteBuilder.build(), metricsConfig);
      }
    }
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/Parquet.java`
#### Snippet
```java
          type = schemaReader.getFileMetaData().getSchema();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
        Schema fileSchema = ParquetSchemaUtil.convert(type);
```

### Deprecation
'org.apache.iceberg.exceptions.RuntimeIOException' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetDictionaryRowGroupFilter.java`
#### Snippet
```java
        dict = page.getEncoding().initDictionary(col, page);
      } catch (IOException e) {
        throw new RuntimeIOException("Failed to create reader for dictionary page");
      }

```

### Deprecation
'ParquetFileWriter(org.apache.parquet.io.OutputFile, org.apache.parquet.schema.MessageType, org.apache.parquet.hadoop.ParquetFileWriter.Mode, long, int)' is deprecated
in `parquet/src/main/java/org/apache/iceberg/parquet/Parquet.java`
#### Snippet
```java
    OutputFile file = Files.localOutput(outputFile);
    ParquetFileWriter writer =
        new ParquetFileWriter(
            ParquetIO.file(file),
            ParquetSchemaUtil.convert(schema, "table"),
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`summary.containsNaN() == null ? true : summary.containsNaN()` can be simplified to 'summary.containsNaN() == null \|\| summary.containsNaN()'
in `core/src/main/java/org/apache/iceberg/util/ManifestFileUtil.java`
#### Snippet
```java
      this.upperBound = Conversions.fromByteBuffer(primitive, summary.upperBound());
      this.containsNull = summary.containsNull();
      this.containsNaN = summary.containsNaN() == null ? true : summary.containsNaN();
    }

```

### SimplifiableConditionalExpression
`negate ? !value : value` can be simplified to 'negate != value'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkConfParser.java`
#### Snippet
```java
      Preconditions.checkArgument(defaultValue != null, "Default value cannot be null");
      boolean value = parse(Boolean::parseBoolean, defaultValue);
      return negate ? !value : value;
    }
  }
```

### SimplifiableConditionalExpression
`args.isNullAt(2) ? false : args.getBoolean(2)` can be simplified to '!args.isNullAt(2) \&\& args.getBoolean(2)'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/MigrateTableProcedure.java`
#### Snippet
```java
    }

    boolean dropBackup = args.isNullAt(2) ? false : args.getBoolean(2);

    MigrateTableSparkAction migrateTableSparkAction =
```

### SimplifiableConditionalExpression
`args.isNullAt(3) ? false : args.getBoolean(3)` can be simplified to '!args.isNullAt(3) \&\& args.getBoolean(3)'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/RemoveOrphanFilesProcedure.java`
#### Snippet
```java
    Long olderThanMillis = args.isNullAt(1) ? null : DateTimeUtil.microsToMillis(args.getLong(1));
    String location = args.isNullAt(2) ? null : args.getString(2);
    boolean dryRun = args.isNullAt(3) ? false : args.getBoolean(3);
    Integer maxConcurrentDeletes = args.isNullAt(4) ? null : args.getInt(4);
    String fileListView = args.isNullAt(5) ? null : args.getString(5);
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `spark/v3.4/spark/src/main/java/org/apache/spark/sql/catalyst/analysis/NoSuchProcedureException.java`
#### Snippet
```java
        Option.empty(),
        Option.empty(),
        Map$.MODULE$.<String, String>empty(),
        new QueryContext[0]);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
      if (partitionFilter != null && !partitionFilter.isEmpty()) {
        Builder<Tuple2<String, String>, scala.collection.immutable.Map<String, String>> builder =
            Map$.MODULE$.<String, String>newBuilder();
        partitionFilter.forEach((key, value) -> builder.$plus$eq(Tuple2.apply(key, value)));
        scalaPartitionFilter = Option.apply(builder.result());
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
      stream.write(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java

    @Override
    public int read(byte[] b) throws IOException {
      return stream.read(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
      return stream.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/Files.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
      stream.write(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java

  @Override
  public boolean addAll(Collection<? extends CharSequence> charSequences) {
    if (charSequences != null) {
      return Iterables.addAll(
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("CollectionUndefinedEquality")
  public boolean containsAll(Collection<?> objects) {
    if (objects != null) {
      return Iterables.all(objects, this::contains);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("CollectionUndefinedEquality")
  public boolean removeAll(Collection<?> objects) {
    if (objects != null) {
      return objects.stream().filter(this::remove).count() != 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java

  @Override
  public boolean retainAll(Collection<?> objects) {
    if (objects != null) {
      Set<CharSequenceWrapper> toRetain =
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3InputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    Preconditions.checkState(!closed, "Cannot read: already closed");
    positionStream();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    int remaining = len;
    int relativeOffset = off;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    Preconditions.checkState(!closed, "Cannot read: already closed");

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `gcp/src/main/java/org/apache/iceberg/gcp/gcs/GCSOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    stream.write(b, off, len);
    pos += len;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/SerializableByteBufferMap.java`
#### Snippet
```java

  @Override
  public void putAll(Map<? extends Integer, ? extends ByteBuffer> m) {
    wrapped.putAll(m);
  }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `core/src/main/java/org/apache/iceberg/CachingCatalog.java`
#### Snippet
```java
      implements RemovalListener<TableIdentifier, Table> {
    @Override
    public void onRemoval(TableIdentifier tableIdentifier, Table table, RemovalCause cause) {
      LOG.debug("Evicted {} from the table cache ({})", tableIdentifier, cause);
      if (RemovalCause.EXPIRED.equals(cause)) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/io/SingleBufferInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] bytes, int off, int len) throws IOException {
    if (len == 0) {
      return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/io/MultiBufferInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] bytes) {
    return read(bytes, 0, bytes.length);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/io/MultiBufferInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] bytes, int off, int len) {
    if (len <= 0) {
      if (len < 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
      return stream.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

    @Override
    public int read(byte[] b) throws IOException {
      return stream.read(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/SerializableMap.java`
#### Snippet
```java

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {
    copiedMap.putAll(m);
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/PartitionSet.java`
#### Snippet
```java

  @Override
  public boolean removeAll(Collection<?> objects) {
    boolean changed = false;
    if (objects != null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/PartitionSet.java`
#### Snippet
```java

  @Override
  public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException("retainAll is not supported");
  }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/PartitionSet.java`
#### Snippet
```java

  @Override
  public boolean containsAll(Collection<?> objects) {
    if (objects != null) {
      return Iterables.all(objects, this::contains);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/PartitionSet.java`
#### Snippet
```java

  @Override
  public boolean addAll(Collection<? extends Pair<Integer, StructLike>> pairs) {
    boolean changed = false;
    if (pairs != null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/StructLikeSet.java`
#### Snippet
```java

  @Override
  public boolean removeAll(Collection<?> objects) {
    boolean changed = false;
    if (objects != null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/StructLikeSet.java`
#### Snippet
```java

  @Override
  public boolean containsAll(Collection<?> objects) {
    if (objects != null) {
      return Iterables.all(objects, this::contains);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/StructLikeSet.java`
#### Snippet
```java

  @Override
  public boolean addAll(Collection<? extends StructLike> structs) {
    if (structs != null) {
      return Iterables.addAll(
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/util/StructLikeSet.java`
#### Snippet
```java

  @Override
  public boolean retainAll(Collection<?> objects) {
    throw new UnsupportedOperationException("retailAll is not supported");
  }
```

### NullableProblems
Not annotated parameter overrides @NonNull parameter
in `core/src/main/java/org/apache/iceberg/util/Pair.java`
#### Snippet
```java
                @Override
                @SuppressWarnings("deprecation")
                public Schema load(Pair<Class<?>, Class<?>> key) {
                  Schema xSchema = ReflectData.get().getSchema(key.first);
                  Schema ySchema = ReflectData.get().getSchema(key.second);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java

    @Override
    public Iterator<Integer> iterator() {
      return new Iterator<Integer>() {
        private int current = 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
      return inputStream.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
      stream.write(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
      return stream.read(b, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopStreams.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
      stream.write(b);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/inmemory/InMemoryInputFile.java`
#### Snippet
```java

    @Override
    public int read(byte[] b, int off, int len) {
      checkOpen();
      return delegate.read(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/inmemory/InMemoryInputFile.java`
#### Snippet
```java

    @Override
    public int read(byte[] b) throws IOException {
      checkOpen();
      return delegate.read(b);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/inmemory/InMemoryOutputFile.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) {
      checkOpen();
      delegate.write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `core/src/main/java/org/apache/iceberg/inmemory/InMemoryOutputFile.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
      checkOpen();
      delegate.write(b);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericReader.java`
#### Snippet
```java

    @Override
    public CloseableIterator<Record> iterator() {
      CloseableIterator<Record> iter =
          CloseableIterable.concat(Iterables.transform(task.files(), GenericReader.this::open))
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dell/src/main/java/org/apache/iceberg/dell/ecs/EcsAppendOutputStream.java`
#### Snippet
```java
   */
  @Override
  public void write(byte[] b, int off, int len) {
    if (!checkBuffer(len)) {
      flush();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dell/src/main/java/org/apache/iceberg/dell/ecs/EcsSeekableInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    checkAndUseNewPos();
    int delta = internalStream.read(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSOutputStream.java`
#### Snippet
```java

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    Preconditions.checkState(!closed, "Already closed.");
    stream.write(b, off, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSInputStream.java`
#### Snippet
```java

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    Preconditions.checkState(!closed, "Cannot read: already closed");
    positionStream();
```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3MultipartUpload.java`
#### Snippet
```java
  public void testContentsWriteWithBytes() throws IOException {
    byte[] bytes = new byte[S3FileIOProperties.MULTIPART_SIZE_MIN];
    for (int i = 0; i < S3FileIOProperties.MULTIPART_SIZE_MIN; i++) {
      bytes[i] = 6;
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `api/src/main/java/org/apache/iceberg/metrics/FixedReservoirHistogram.java`
#### Snippet
```java
  /**
   * Naive algorithm for calculating variance:
   * https://en.wikipedia.org/wiki/Algorithms_for_calculating_variance
   */
  @Override
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_MAX_CONNECTIONS = "http-client.apache.max-connections";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_EXPECT_CONTINUE_ENABLED =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_CONNECTION_TIME_TO_LIVE_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_CONNECTION_MAX_IDLE_TIME_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/urlconnection/UrlConnectionHttpClient.Builder.html
   */
  public static final String URLCONNECTION_SOCKET_TIMEOUT_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_CONNECTION_ACQUISITION_TIMEOUT_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/urlconnection/UrlConnectionHttpClient.Builder.html
   */
  public static final String URLCONNECTION_CONNECTION_TIMEOUT_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_TCP_KEEP_ALIVE_ENABLED =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_CONNECTION_TIMEOUT_MS =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_SOCKET_TIMEOUT_MS = "http-client.apache.socket-timeout-ms";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   */
  public static final String APACHE_USE_IDLE_CONNECTION_REAPER_ENABLED =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.table-tag-enabled=true
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details see:
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/s3/S3Configuration.html#useArnRegionEnabled--
   */
  public static final String USE_ARN_REGION_ENABLED = "s3.use-arn-region-enabled";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * S3 SSE-KMS encryption.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html
   */
  public static final String SSE_TYPE_KMS = "kms";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.namespace-tag-enabled=true
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html
   */
  public static final String SSE_TYPE_CUSTOM = "custom";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html
   */
  public static final String ACCELERATION_ENABLED = "s3.acceleration-enabled";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.tags.my_key=my_val
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * Default batch size used when deleting files.
   *
   * <p>Refer to https://github.com/apache/hadoop/commit/56dee667707926f3796c7757be1a133a362f05c9
   * for more details on why this value was chosen.
   */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/dual-stack-endpoints.html
   */
  public static final String DUALSTACK_ENABLED = "s3.dualstack-enabled";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * <p>The input must be one of {@link software.amazon.awssdk.services.s3.model.ObjectCannedACL},
   * such as 'public-read-write' For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html
   */
  public static final String ACL = "s3.acl";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * Type of S3 Server side encryption used, default to {@link S3FileIOProperties#SSE_TYPE_NONE}.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html
   */
  public static final String SSE_TYPE = "s3.sse.type";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * writer, the part size must be less than 2GB.
   *
   * <p>For more details, see https://docs.aws.amazon.com/AmazonS3/latest/dev/qfacts.html
   */
  public static final String MULTIPART_SIZE = "s3.multipart.part-size-bytes";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * pass a catalog property.
   *
   * <p>For more details, see https://aws.amazon.com/s3/features/access-points/
   *
   * <p>Example: s3.access-points.my-bucket=access-point
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   * will be used.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html
   */
  public static final String PATH_STYLE_ACCESS = "s3.path-style-access";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html
   */
  public static final String SSE_TYPE_S3 = "s3";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html
   *
   * <p>Example: s3.delete.tags.my_key=my_val
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  /**
   * Max possible batch size for deletion. Currently, a max of 1000 keys can be deleted in one
   * batch. https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjects.html
   */
  public static final int DELETE_BATCH_SIZE_MAX = 1000;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java`
#### Snippet
```java
   * A Glue database name cannot be longer than 252 characters. The only acceptable characters are
   * lowercase letters, numbers, and the underscore character. More details:
   * https://docs.aws.amazon.com/athena/latest/ug/glue-best-practices.html
   *
   * @param namespace namespace
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/glue/IcebergToGlueConverter.java`
#### Snippet
```java
   * A Glue table name cannot be longer than 255 characters. The only acceptable characters are
   * lowercase letters, numbers, and the underscore character. More details:
   * https://docs.aws.amazon.com/athena/latest/ug/glue-best-practices.html
   *
   * @param tableName table name
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
 * LakeFormation vended credentials, otherwise it uses AssumingRole credentials. For using
 * LakeFormation credential vending for a third-party query engine, see:
 * https://docs.aws.amazon.com/lake-formation/latest/dg/register-query-engine.html
 */
public class LakeFormationAwsClientFactory extends AssumeRoleAwsClientFactory {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  /**
   * Max possible batch size for deletion. Currently, a max of 1000 keys can be deleted in one
   * batch. https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjects.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * Default batch size used when deleting files.
   *
   * <p>Refer to https://github.com/apache/hadoop/commit/56dee667707926f3796c7757be1a133a362f05c9
   * for more details on why this value was chosen.
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.table-tag-enabled=true
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.namespace-tag-enabled=true
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * <p>The input must be one of {@link software.amazon.awssdk.services.s3.model.ObjectCannedACL},
   * such as 'public-read-write' For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/urlconnection/UrlConnectionHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>The value must be one of {@link software.amazon.awssdk.regions.Region}, such as 'us-east-1'.
   * For more details, see https://docs.aws.amazon.com/general/latest/gr/rande.html
   */
  public static final String CLIENT_ASSUME_ROLE_REGION = "client.assume-role.region";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html
   */
  public static final String CLIENT_ASSUME_ROLE_EXTERNAL_ID = "client.assume-role.external-id";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * writer, the part size must be less than 2GB.
   *
   * <p>For more details, see https://docs.aws.amazon.com/AmazonS3/latest/dev/qfacts.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/urlconnection/UrlConnectionHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/dual-stack-endpoints.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-databases.html
   */
  public static final String GLUE_CATALOG_ID = "glue.id";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  /**
   * If Glue should skip name validations It is recommended to stick to Glue best practice in
   * https://docs.aws.amazon.com/athena/latest/ug/glue-best-practices.html to make sure operations
   * are Hive compatible. This is only added for users that have existing conventions using
   * non-standard characters. When database name and table name validation are skipped, there is no
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  /**
   * If set, GlueCatalog will use Lake Formation for access control. For more credential vending
   * details, see: https://docs.aws.amazon.com/lake-formation/latest/dg/api-overview.html. If
   * enabled, the {@link AwsClientFactory} implementation must be {@link
   * LakeFormationAwsClientFactory} or any class that extends it.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * S3 SSE-KMS encryption.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_iam-condition-keys.html#ck_rolesessionname
   */
  public static final String CLIENT_ASSUME_ROLE_SESSION_NAME = "client.assume-role.session-name";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details:
   * https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * pass a catalog property.
   *
   * <p>For more details, see https://aws.amazon.com/s3/features/access-points/
   *
   * <p>Example: s3.access-points.my-bucket=access-point
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/http/apache/ApacheHttpClient.Builder.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.HttpClientProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html
   *
   * <p>Example: s3.delete.tags.my_key=my_val
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details, see
   * https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html
   *
   * <p>Example: s3.write.tags.my_key=my_val
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *
   * <p>For more details see:
   * https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/s3/S3Configuration.html#useArnRegionEnabled--
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * will be used.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   * AwsProperties#S3FILEIO_SSE_TYPE_NONE}.
   *
   * <p>For more details: https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html
   *
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/iceberg/util/ZOrderByteUtils.java`
#### Snippet
```java
 *
 * <p>Most of these techniques are derived from
 * https://aws.amazon.com/blogs/database/z-order-indexing-for-multifaceted-queries-in-amazon-dynamodb-part-2/
 *
 * <p>Some implementation is taken from
```

### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/org/apache/iceberg/util/ZOrderByteUtils.java`
#### Snippet
```java
 *
 * <p>Some implementation is taken from
 * https://github.com/apache/hbase/blob/master/hbase-common/src/main/java/org/apache/hadoop/hbase/util/OrderedBytes.java
 */
public class ZOrderByteUtils {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
 *   <li>Type promotion: In case of type promotion, the Arrow vector corresponding to the data type
 *       in the parquet file is returned instead of the data type in the latest schema. See
 *       https://github.com/apache/iceberg/issues/2483.
 *   <li>Columns with constant values are physically encoded as a dictionary. The Arrow vector type
 *       is int32 instead of the type as per the schema. See
```

### JavadocLinkAsPlainText
Link specified as plain text
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
 *   <li>Columns with constant values are physically encoded as a dictionary. The Arrow vector type
 *       is int32 instead of the type as per the schema. See
 *       https://github.com/apache/iceberg/issues/2484.
 *   <li>Data types: {@link Types.ListType}, {@link Types.MapType}, {@link Types.StructType}, {@link
 *       Types.FixedType} and {@link Types.DecimalType} See
```

### JavadocLinkAsPlainText
Link specified as plain text
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
 *   <li>Data types: {@link Types.ListType}, {@link Types.MapType}, {@link Types.StructType}, {@link
 *       Types.FixedType} and {@link Types.DecimalType} See
 *       https://github.com/apache/iceberg/issues/2485 and
 *       https://github.com/apache/iceberg/issues/2486.
 *   <li>Delete files are not supported. See https://github.com/apache/iceberg/issues/2487.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
 *       Types.FixedType} and {@link Types.DecimalType} See
 *       https://github.com/apache/iceberg/issues/2485 and
 *       https://github.com/apache/iceberg/issues/2486.
 *   <li>Delete files are not supported. See https://github.com/apache/iceberg/issues/2487.
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
 *       https://github.com/apache/iceberg/issues/2485 and
 *       https://github.com/apache/iceberg/issues/2486.
 *   <li>Delete files are not supported. See https://github.com/apache/iceberg/issues/2487.
 * </ul>
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
/**
 * Java version of the original SparkTableUtil.scala
 * https://github.com/apache/iceberg/blob/apache-iceberg-0.8.0-incubating/spark/src/main/scala/org/apache/iceberg/spark/SparkTableUtil.scala
 */
public class SparkTableUtil {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aliyun/src/main/java/org/apache/iceberg/aliyun/AliyunProperties.java`
#### Snippet
```java
   *
   * <p>For more information about how to obtain an AccessKey pair, see:
   * https://www.alibabacloud.com/help/doc-detail/53045.htm
   */
  public static final String CLIENT_ACCESS_KEY_ID = "client.access-key-id";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aliyun/src/main/java/org/apache/iceberg/aliyun/AliyunProperties.java`
#### Snippet
```java
   * regions are accessed by using different endpoints. For the same region, access over the
   * internal network or over the Internet also uses different endpoints. For more information, see:
   * https://www.alibabacloud.com/help/doc-detail/31837.htm
   */
  public static final String OSS_ENDPOINT = "oss.endpoint";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aliyun/src/main/java/org/apache/iceberg/aliyun/AliyunProperties.java`
#### Snippet
```java
   *
   * <p>For more information about how to obtain an AccessKey pair, see:
   * https://www.alibabacloud.com/help/doc-detail/53045.htm
   */
  public static final String CLIENT_ACCESS_KEY_SECRET = "client.access-key-secret";
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSURI.java`
#### Snippet
```java
   * <p>It specifies precisely which characters are permitted in the various components of a URI
   * reference in Aliyun OSS documentation as below: Bucket:
   * https://help.aliyun.com/document_detail/257087.html Object:
   * https://help.aliyun.com/document_detail/273129.html Scheme: https or oss
   *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSURI.java`
#### Snippet
```java
   * reference in Aliyun OSS documentation as below: Bucket:
   * https://help.aliyun.com/document_detail/257087.html Object:
   * https://help.aliyun.com/document_detail/273129.html Scheme: https or oss
   *
   * <p>Supported access styles are https and oss://... URIs.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `api/src/main/java/org/apache/iceberg/expressions/CountNonNull.java`
#### Snippet
```java
public class CountNonNull<T> extends CountAggregate<T> {
  private final int fieldId;
  private final Types.NestedField field;

  protected CountNonNull(BoundTerm<T> term) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
  private final boolean isChecksumEnabled;
  private final MessageDigest completeMessageDigest;
  private MessageDigest currentPartMessageDigest;

  private final Counter writeBytes;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
  private String warehousePath;
  private AwsProperties awsProperties;
  private FileIO fileIO;
  private LockManager lockManager;
  private CloseableGroup closeableGroup;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3MultipartUpload.java`
#### Snippet
```java
  private static String bucketName;
  private static String prefix;
  private static S3FileIOProperties properties;
  private static S3FileIO io;
  private String objectUri;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
  private static KmsClient kms;
  private static String bucketName;
  private static String crossRegionBucketName;
  private static String accessPointName;
  private static String crossRegionAccessPointName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `orc/src/main/java/org/apache/iceberg/orc/OrcFileAppender.java`
#### Snippet
```java
  private final OrcRowWriter<D> valueWriter;
  private boolean isClosed = false;
  private final Configuration conf;
  private final MetricsConfig metricsConfig;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
    private final ValueReader<K> keyReader;
    private final ValueReader<V> valueReader;
    private Map lastMap = null;

    private ArrayMapReader(ValueReader<K> keyReader, ValueReader<V> valueReader) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
    private final ValueReader<K> keyReader;
    private final ValueReader<V> valueReader;
    private Map lastMap = null;

    private MapReader(ValueReader<K> keyReader, ValueReader<V> valueReader) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dell/src/main/java/org/apache/iceberg/dell/ecs/EcsFileIO.java`
#### Snippet
```java
  private SerializableSupplier<S3Client> s3;
  private DellProperties dellProperties;
  private DellClientFactory dellClientFactory;
  private transient volatile S3Client client;
  private final AtomicBoolean isResourceClosed = new AtomicBoolean(false);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/RowDataRewriter.java`
#### Snippet
```java
    private final String nameMapping;
    private final FileIO io;
    private final boolean caseSensitive;
    private final EncryptionManager encryptionManager;
    private final TaskWriterFactory<RowData> taskWriterFactory;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/RowDataRewriter.java`
#### Snippet
```java
    private int attemptId;

    private final Schema schema;
    private final String nameMapping;
    private final FileIO io;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/RowDataRewriter.java`
#### Snippet
```java
  public static class RewriteMap extends RichMapFunction<CombinedScanTask, List<DataFile>> {

    private TaskWriter<RowData> writer;
    private int subTaskId;
    private int attemptId;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/RowDataRewriter.java`
#### Snippet
```java

    private final Schema schema;
    private final String nameMapping;
    private final FileIO io;
    private final boolean caseSensitive;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergSource.java`
#### Snippet
```java
    private final ScanContext.Builder contextBuilder = ScanContext.builder();
    private TableSchema projectedFlinkSchema;
    private Boolean exposeLocality;

    private final Map<String, String> readOptions = Maps.newHashMap();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/VectorizedSparkOrcReaders.java`
#### Snippet
```java
    private final org.apache.orc.storage.ql.exec.vector.ColumnVector vector;
    private final OrcValueReader<?> primitiveValueReader;
    private final long batchOffsetInFile;

    PrimitiveOrcColumnVector(
```

### FieldCanBeLocal
Field can be converted to a local variable
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkScanBuilder.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(SparkScanBuilder.class);
  private static final Filter[] NO_FILTERS = new Filter[0];
  private StructType pushedAggregateSchema;
  private Scan localScan;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieTableOperations.java`
#### Snippet
```java
  private IcebergTable table;
  private final FileIO fileIO;
  private final Map<String, String> catalogOptions;

  /** Create a nessie table operations given a table identifier. */
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Math.addExact()` is ignored
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
  @Override
  public void increment(long amount) {
    Math.addExact(counter.longValue(), amount);
    counter.add(amount);
  }
```

### IgnoreResultOfCall
Result of `Math.addExact()` is ignored
in `api/src/main/java/org/apache/iceberg/metrics/DefaultCounter.java`
#### Snippet
```java
    @Override
    public void increment(Integer amount) {
      Math.addExact(counter.intValue(), amount);
      DefaultCounter.this.increment(amount);
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
        .suppressFailureWhenFinished()
        .onFailure((file, thrown) -> LOG.warn("Failed to delete staging file: {}", file, thrown))
        .run(File::delete);
  }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetWritersFlatDataBenchmark.java`
#### Snippet
```java
    rows = RandomData.generateSpark(SCHEMA, NUM_RECORDS, 0L);
    dataFile = File.createTempFile("parquet-flat-data-benchmark", ".parquet");
    dataFile.delete();
  }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetWritersNestedDataBenchmark.java`
#### Snippet
```java
    rows = RandomData.generateSpark(SCHEMA, NUM_RECORDS, 0L);
    dataFile = File.createTempFile("parquet-nested-data-benchmark", ".parquet");
    dataFile.delete();
  }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetWritersNestedDataBenchmark.java`
#### Snippet
```java
  public void tearDownBenchmark() {
    if (dataFile != null) {
      dataFile.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetWritersFlatDataBenchmark.java`
#### Snippet
```java
  public void tearDownBenchmark() {
    if (dataFile != null) {
      dataFile.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersNestedDataBenchmark.java`
#### Snippet
```java
  public void tearDownBenchmark() {
    if (dataFile != null) {
      dataFile.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
  public void tearDownBenchmark() {
    if (dataFile != null) {
      dataFile.delete();
    }
  }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
  public void setupBenchmark() throws IOException {
    dataFile = File.createTempFile("parquet-flat-data-benchmark", ".parquet");
    dataFile.delete();
    List<GenericData.Record> records = RandomData.generateList(SCHEMA, NUM_RECORDS, 0L);
    try (FileAppender<GenericData.Record> writer =
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersNestedDataBenchmark.java`
#### Snippet
```java
  public void setupBenchmark() throws IOException {
    dataFile = File.createTempFile("parquet-nested-data-benchmark", ".parquet");
    dataFile.delete();
    List<GenericData.Record> records = RandomData.generateList(SCHEMA, NUM_RECORDS, 0L);
    try (FileAppender<GenericData.Record> writer =
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
   */
  static {
    VisibleForTesting.class.getName();
    Joiner.class.getName();
    MoreObjects.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
  static {
    VisibleForTesting.class.getName();
    Joiner.class.getName();
    MoreObjects.class.getName();
    Objects.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    VisibleForTesting.class.getName();
    Joiner.class.getName();
    MoreObjects.class.getName();
    Objects.class.getName();
    Preconditions.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Joiner.class.getName();
    MoreObjects.class.getName();
    Objects.class.getName();
    Preconditions.class.getName();
    Splitter.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    MoreObjects.class.getName();
    Objects.class.getName();
    Preconditions.class.getName();
    Splitter.class.getName();
    Throwables.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Objects.class.getName();
    Preconditions.class.getName();
    Splitter.class.getName();
    Throwables.class.getName();
    BiMap.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Preconditions.class.getName();
    Splitter.class.getName();
    Throwables.class.getName();
    BiMap.class.getName();
    FluentIterable.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Splitter.class.getName();
    Throwables.class.getName();
    BiMap.class.getName();
    FluentIterable.class.getName();
    ImmutableBiMap.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Throwables.class.getName();
    BiMap.class.getName();
    FluentIterable.class.getName();
    ImmutableBiMap.class.getName();
    ImmutableList.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    BiMap.class.getName();
    FluentIterable.class.getName();
    ImmutableBiMap.class.getName();
    ImmutableList.class.getName();
    ImmutableMap.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    FluentIterable.class.getName();
    ImmutableBiMap.class.getName();
    ImmutableList.class.getName();
    ImmutableMap.class.getName();
    ImmutableSet.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ImmutableBiMap.class.getName();
    ImmutableList.class.getName();
    ImmutableMap.class.getName();
    ImmutableSet.class.getName();
    Iterables.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ImmutableList.class.getName();
    ImmutableMap.class.getName();
    ImmutableSet.class.getName();
    Iterables.class.getName();
    Iterators.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ImmutableMap.class.getName();
    ImmutableSet.class.getName();
    Iterables.class.getName();
    Iterators.class.getName();
    ListMultimap.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ImmutableSet.class.getName();
    Iterables.class.getName();
    Iterators.class.getName();
    ListMultimap.class.getName();
    Lists.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Iterables.class.getName();
    Iterators.class.getName();
    ListMultimap.class.getName();
    Lists.class.getName();
    MapMaker.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Iterators.class.getName();
    ListMultimap.class.getName();
    Lists.class.getName();
    MapMaker.class.getName();
    Maps.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ListMultimap.class.getName();
    Lists.class.getName();
    MapMaker.class.getName();
    Maps.class.getName();
    Multimap.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Lists.class.getName();
    MapMaker.class.getName();
    Maps.class.getName();
    Multimap.class.getName();
    Multimaps.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    MapMaker.class.getName();
    Maps.class.getName();
    Multimap.class.getName();
    Multimaps.class.getName();
    Ordering.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Maps.class.getName();
    Multimap.class.getName();
    Multimaps.class.getName();
    Ordering.class.getName();
    Sets.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Multimap.class.getName();
    Multimaps.class.getName();
    Ordering.class.getName();
    Sets.class.getName();
    Streams.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Multimaps.class.getName();
    Ordering.class.getName();
    Sets.class.getName();
    Streams.class.getName();
    Hasher.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Ordering.class.getName();
    Sets.class.getName();
    Streams.class.getName();
    Hasher.class.getName();
    HashFunction.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Sets.class.getName();
    Streams.class.getName();
    Hasher.class.getName();
    HashFunction.class.getName();
    Hashing.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Streams.class.getName();
    Hasher.class.getName();
    HashFunction.class.getName();
    Hashing.class.getName();
    Files.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Hasher.class.getName();
    HashFunction.class.getName();
    Hashing.class.getName();
    Files.class.getName();
    Bytes.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    HashFunction.class.getName();
    Hashing.class.getName();
    Files.class.getName();
    Bytes.class.getName();
    Resources.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Hashing.class.getName();
    Files.class.getName();
    Bytes.class.getName();
    Resources.class.getName();
    MoreExecutors.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Files.class.getName();
    Bytes.class.getName();
    Resources.class.getName();
    MoreExecutors.class.getName();
    ThreadFactoryBuilder.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Bytes.class.getName();
    Resources.class.getName();
    MoreExecutors.class.getName();
    ThreadFactoryBuilder.class.getName();
    Iterables.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Resources.class.getName();
    MoreExecutors.class.getName();
    ThreadFactoryBuilder.class.getName();
    Iterables.class.getName();
    CountingOutputStream.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    MoreExecutors.class.getName();
    ThreadFactoryBuilder.class.getName();
    Iterables.class.getName();
    CountingOutputStream.class.getName();
    Suppliers.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    ThreadFactoryBuilder.class.getName();
    Iterables.class.getName();
    CountingOutputStream.class.getName();
    Suppliers.class.getName();
    Stopwatch.class.getName();
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Iterables.class.getName();
    CountingOutputStream.class.getName();
    Suppliers.class.getName();
    Stopwatch.class.getName();
  }
```

### IgnoreResultOfCall
Result of `Class.getName()` is ignored
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    CountingOutputStream.class.getName();
    Suppliers.class.getName();
    Stopwatch.class.getName();
  }
}
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `hive-metastore/src/main/java/org/apache/iceberg/hive/MetastoreLock.java`
#### Snippet
```java
                    }
                  } catch (InterruptedException e) {
                    Thread.interrupted(); // Clear the interrupt status flag
                    LOG.warn(
                        "Interrupted while waiting for lock on table {}.{}",
```

### IgnoreResultOfCall
Result of `Thread.interrupted()` is ignored
in `hive-metastore/src/main/java/org/apache/iceberg/hive/MetastoreLock.java`
#### Snippet
```java
        // Interrupted unlock. We try to unlock one more time if we have a lockId
        try {
          Thread.interrupted(); // Clear the interrupt status flag for now, so we can retry unlock
          LOG.warn("Interrupted unlock we try one more time {}.{}", databaseName, tableName, ie);
          doUnlock(id);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `primitive()` is identical to its super method
in `api/src/main/java/org/apache/iceberg/types/PruneColumns.java`
#### Snippet
```java

  @Override
  public Type primitive(Type.PrimitiveType primitive) {
    return null;
  }
```

### RedundantMethodOverride
Method `isValidIdentifier()` is identical to its super method
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopCatalog.java`
#### Snippet
```java

  @Override
  protected boolean isValidIdentifier(TableIdentifier identifier) {
    return true;
  }
```

### RedundantMethodOverride
Method `readLong()` is identical to its super method
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java

    @Override
    public long readLong() {
      return column.nextLong();
    }
```

### RedundantMethodOverride
Method `readLong()` is identical to its super method
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java

    @Override
    public long readLong() {
      return column.nextLong();
    }
```

### RedundantMethodOverride
Method `readLong()` is identical to its super method
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java

    @Override
    public long readLong() {
      return column.nextLong();
    }
```

### RedundantMethodOverride
Method `readLong()` is identical to its super method
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java

    @Override
    public long readLong() {
      return column.nextLong();
    }
```

### RedundantMethodOverride
Method `supportColumnarReads()` is identical to its super method
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkRowReaderFactory.java`
#### Snippet
```java

  @Override
  public boolean supportColumnarReads(InputPartition inputPartition) {
    return false;
  }
```

### RedundantMethodOverride
Method `keyMetadata()` is identical to its super method
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/ManifestFileBean.java`
#### Snippet
```java

  @Override
  public ByteBuffer keyMetadata() {
    return null;
  }
```

### RedundantMethodOverride
Method `distributionStrictlyRequired()` is identical to its super method
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SparkShufflingDataRewriter.java`
#### Snippet
```java

    @Override
    public boolean distributionStrictlyRequired() {
      return true;
    }
```

### RedundantMethodOverride
Method `primitive()` is identical to its super method
in `parquet/src/main/java/org/apache/iceberg/parquet/PruneColumns.java`
#### Snippet
```java

  @Override
  public Type primitive(PrimitiveType primitive) {
    return null;
  }
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `core/src/main/java/org/apache/iceberg/ManifestFiles.java`
#### Snippet
```java
      } catch (IOException e) {
        if (!threw) {
          throw new RuntimeIOException(e, "Failed to close manifest: %s", outputFile);
        }
      }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
Math.floorMod(microsFromEpoch, 1_000_000) \* 1_000: integer multiplication implicitly cast to long
in `orc/src/main/java/org/apache/iceberg/orc/ExpressionToSearchArgument.java`
#### Snippet
```java
            Instant.ofEpochSecond(
                Math.floorDiv(microsFromEpoch, 1_000_000),
                Math.floorMod(microsFromEpoch, 1_000_000) * 1_000));
      case DECIMAL:
        return new HiveDecimalWritable(HiveDecimal.create((BigDecimal) icebergLiteral, false));
```

### IntegerMultiplicationImplicitCastToLong
Math.floorMod(value, 1000_000) \* 1000: integer multiplication implicitly cast to long
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      return TimestampData.fromLocalDateTime(
          Instant.ofEpochSecond(
                  Math.floorDiv(value, 1000_000), Math.floorMod(value, 1000_000) * 1000)
              .atOffset(ZoneOffset.UTC)
              .toLocalDateTime());
```

### IntegerMultiplicationImplicitCastToLong
Math.floorMod(value, 1000_000) \* 1000: integer multiplication implicitly cast to long
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      return TimestampData.fromInstant(
          Instant.ofEpochSecond(
              Math.floorDiv(value, 1000_000), Math.floorMod(value, 1000_000) * 1000));
    }

```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`ch4 << 0` can be replaced with 'ch4'
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/parquet/BaseVectorizedParquetValuesReader.java`
#### Snippet
```java
    int ch2 = inputStream.read();
    int ch1 = inputStream.read();
    return (ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0);
  }

```

### PointlessBitwiseExpression
`ch3 << 0` can be replaced with 'ch3'
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/parquet/BaseVectorizedParquetValuesReader.java`
#### Snippet
```java
          int ch2 = inputStream.read();
          int ch1 = inputStream.read();
          return (ch1 << 16) + (ch2 << 8) + (ch3 << 0);
        }
      case 4:
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `core/src/main/java/org/apache/iceberg/BaseMetastoreTableOperations.java`
#### Snippet
```java
      // the log, thus we don't include metadata.previousFiles() for deletion - everything else can
      // be removed
      removedPreviousMetadataFiles.removeAll(metadata.previousFiles());
      Tasks.foreach(removedPreviousMetadataFiles)
          .noRetry()
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
      Set<TableMetadata.MetadataLogEntry> removedPreviousMetadataFiles =
          Sets.newHashSet(base.previousFiles());
      removedPreviousMetadataFiles.removeAll(metadata.previousFiles());
      Tasks.foreach(removedPreviousMetadataFiles)
          .executeWith(ThreadPools.getWorkerPool())
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `orc/src/main/java/org/apache/iceberg/orc/FileIOFSUtil.java`
#### Snippet
```java

    @Override
    public FileStatus[] listStatus(Path f) throws FileNotFoundException, IOException {
      throw new UnsupportedOperationException();
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `fromTable` initializer `null` is redundant
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
    }
    // keep metadata
    Table fromTable = null;
    String fromTableDbName =
        IcebergToGlueConverter.getDatabaseName(from, awsProperties.glueCatalogSkipNameValidation());
```

### UnusedAssignment
Variable `preferredLocations` initializer `null` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkInputPartition.java`
#### Snippet
```java

  private transient Schema expectedSchema = null;
  private transient String[] preferredLocations = null;

  SparkInputPartition(
```

### UnusedAssignment
Variable `schema` initializer `null` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkScanBuilder.java`
#### Snippet
```java
  private final List<String> metaColumns = Lists.newArrayList();

  private Schema schema = null;
  private boolean caseSensitive;
  private List<Expression> filterExpressions = null;
```

### UnusedAssignment
Variable `stagingLocation` initializer `null` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
  private PartitionSpec spec = null;
  private Predicate<ManifestFile> predicate = manifest -> true;
  private String stagingLocation = null;

  RewriteManifestsSparkAction(SparkSession spark, Table table) {
```

### UnusedAssignment
Variable `spec` initializer `null` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
  private final long targetManifestSizeBytes;

  private PartitionSpec spec = null;
  private Predicate<ManifestFile> predicate = manifest -> true;
  private String stagingLocation = null;
```

### UnusedAssignment
Variable `location` initializer `null` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
  private Map<String, String> equalAuthorities = Collections.emptyMap();
  private PrefixMismatchMode prefixMismatchMode = PrefixMismatchMode.ERROR;
  private String location = null;
  private long olderThanTimestamp = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(3);
  private Dataset<Row> compareToFileList;
```

### UnusedAssignment
Variable `table` initializer `getTable()` is redundant
in `spark/v3.4/spark-runtime/src/integration/java/org/apache/iceberg/spark/SmokeTest.java`
#### Snippet
```java
        "CREATE TABLE %s (category int, id bigint, data string, ts timestamp) USING iceberg",
        tableName);
    Table table = getTable();
    // Add examples
    sql("ALTER TABLE %s ADD PARTITION FIELD bucket(16, id)", tableName);
```

### UnusedAssignment
Variable `elementResult` initializer `null` is redundant
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetTypeVisitor.java`
#### Snippet
```java

  private static <T> T visitListElement(Type listElement, ParquetTypeVisitor<T> visitor) {
    T elementResult = null;

    visitor.beforeElementField(listElement);
```

### UnusedAssignment
Variable `hashValue` initializer `0` is redundant
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetBloomRowGroupFilter.java`
#### Snippet
```java
    private <T> boolean shouldRead(
        PrimitiveType primitiveType, T value, BloomFilter bloom, Type type) {
      long hashValue = 0;
      switch (primitiveType.getPrimitiveTypeName()) {
        case INT32:
```

### UnusedAssignment
Variable `results` initializer `null` is redundant
in `snowflake/src/main/java/org/apache/iceberg/snowflake/SnowflakeCatalog.java`
#### Snippet
```java
  public List<Namespace> listNamespaces(Namespace namespace) {
    SnowflakeIdentifier scope = NamespaceHelpers.toSnowflakeIdentifier(namespace);
    List<SnowflakeIdentifier> results = null;
    switch (scope.type()) {
      case ROOT:
```

### UnusedAssignment
The value `connectionPool.run(
conn ->
queryHarness.query(
conn, finalQuery, TABLE_RESULT_SET_HANDLER, schema.toIdentifierString()))` assigned to `tables` is never used
in `snowflake/src/main/java/org/apache/iceberg/snowflake/JdbcSnowflakeClient.java`
#### Snippet
```java
    List<SnowflakeIdentifier> tables;
    try {
      tables =
          connectionPool.run(
              conn ->
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `core/src/main/java/org/apache/iceberg/actions/RewritePositionDeletesGroup.java`
#### Snippet
```java
    this.tasks = tasks;
    this.maxRewrittenDataSequenceNumber =
        tasks.stream().mapToLong(t -> t.file().dataSequenceNumber()).max().getAsLong();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeltaWrite.java`
#### Snippet
```java
      this.dataFileFormat = writeConf.dataFileFormat();
      this.targetDataFileSize = writeConf.targetDataFileSize();
      this.deleteSparkType = info.rowIdSchema().get();
      this.deleteFileFormat = writeConf.deleteFileFormat();
      this.targetDeleteFileSize = writeConf.targetDeleteFileSize();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeltaWrite.java`
#### Snippet
```java
      this.deleteFileFormat = writeConf.deleteFileFormat();
      this.targetDeleteFileSize = writeConf.targetDeleteFileSize();
      this.metadataSparkType = info.metadataSchema().get();
      this.queryId = info.queryId();
      this.fanoutWriterEnabled = writeConf.fanoutWriterEnabled();
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `catalogType` is always 'null'
in `mr/src/main/java/org/apache/iceberg/mr/Catalogs.java`
#### Snippet
```java
      return CatalogUtil.ICEBERG_CATALOG_TYPE_HIVE.equalsIgnoreCase(catalogType);
    }
    return getCatalogProperties(conf, catalogName, catalogType).get(CatalogProperties.CATALOG_IMPL)
        == null;
  }
```

### ConstantValue
Condition `name != null` is always `true`
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
      }
      Preconditions.checkArgument(
          name != null && !name.isEmpty(), "Cannot use empty or null partition name: %s", name);
      Preconditions.checkArgument(
          !partitionNames.contains(name), "Cannot use partition name more than once: %s", name);
```

### ConstantValue
Value `projected` is always 'null'
in `api/src/main/java/org/apache/iceberg/transforms/ProjectionUtil.java`
#### Snippet
```java
  static UnboundPredicate<Integer> fixInclusiveTimeProjection(UnboundPredicate<Integer> projected) {
    if (projected == null) {
      return projected;
    }

```

### ConstantValue
Value `catalogProperties` is always 'null'
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueCatalog.java`
#### Snippet
```java
        catalogName,
        awsProperties,
        catalogProperties,
        hadoopConf,
        tableIdentifier);
```

### ConstantValue
Condition `structType != null` is always `true`
in `orc/src/main/java/org/apache/iceberg/data/orc/GenericOrcReaders.java`
#### Snippet
```java
        Map<Integer, ?> idToConstant) {
      super(readers, structType, idToConstant);
      this.template = structType != null ? GenericRecord.create(structType) : null;
    }

```

### ConstantValue
Value `recursive` is always 'true'
in `core/src/main/java/org/apache/iceberg/ReachableFileUtil.java`
#### Snippet
```java
        TableMetadata previousMetadata = findFirstExistentPreviousMetadata(metadataLogEntries, io);
        if (previousMetadata != null) {
          metadataFileLocations(previousMetadata, metadataFileLocations, io, recursive);
        }
      }
```

### ConstantValue
Result of `"org.apache.avro.file.SeekableInput".equals(SeekableInput.class.getName())` is always 'true'
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

  private static final boolean relocated =
      "org.apache.avro.file.SeekableInput".equals(SeekableInput.class.getName());

  private static final DynConstructors.Ctor<SeekableInput> avroFsInputCtor =
```

### ConstantValue
Condition `!relocated` is always `false`
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

  private static final DynConstructors.Ctor<SeekableInput> avroFsInputCtor =
      !relocated && fsDataInputStreamClass != null
          ? DynConstructors.builder(SeekableInput.class)
              .impl("org.apache.hadoop.fs.AvroFSInput", fsDataInputStreamClass, Long.TYPE)
```

### ConstantValue
Condition `!relocated && fsDataInputStreamClass != null` is always `false`
in `core/src/main/java/org/apache/iceberg/avro/AvroIO.java`
#### Snippet
```java

  private static final DynConstructors.Ctor<SeekableInput> avroFsInputCtor =
      !relocated && fsDataInputStreamClass != null
          ? DynConstructors.builder(SeekableInput.class)
              .impl("org.apache.hadoop.fs.AvroFSInput", fsDataInputStreamClass, Long.TYPE)
```

### ConstantValue
Value `iterable` is always 'null'
in `core/src/main/java/org/apache/iceberg/util/ParallelIterable.java`
#### Snippet
```java
                            try (Closeable ignored =
                                (iterable instanceof Closeable) ? (Closeable) iterable : () -> {}) {
                              for (T item : iterable) {
                                queue.add(item);
                              }
```

### ConstantValue
Condition `throwFailureWhenFinished && threw` is always `false`
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
      if (throwFailureWhenFinished && !exceptions.isEmpty()) {
        Tasks.throwOne(exceptions, exceptionClass);
      } else if (throwFailureWhenFinished && threw) {
        throw new RuntimeException("Task set failed with an uncaught throwable");
      }
```

### ConstantValue
Condition `threw` is always `false` when reached
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
      if (throwFailureWhenFinished && !exceptions.isEmpty()) {
        Tasks.throwOne(exceptions, exceptionClass);
      } else if (throwFailureWhenFinished && threw) {
        throw new RuntimeException("Task set failed with an uncaught throwable");
      }
```

### ConstantValue
Condition `!threw` is always `true`
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
      }

      return !threw;
    }

```

### ConstantValue
Value `task` is always 'null'
in `core/src/main/java/org/apache/iceberg/util/TableScanUtil.java`
#### Snippet
```java
                        return ((SplittableScanTask<? extends T>) task).split(splitSize);
                      } else {
                        return ImmutableList.of(task);
                      }
                    }),
```

### ConstantValue
Condition `lastPosition != null` is always `true`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/enumerator/ContinuousSplitPlannerImpl.java`
#### Snippet
```java
      return new ContinuousEnumerationResult(Collections.emptyList(), lastPosition, lastPosition);
    } else {
      Long lastConsumedSnapshotId = lastPosition != null ? lastPosition.snapshotId() : null;
      Snapshot toSnapshotInclusive =
          toSnapshotInclusive(
```

### ConstantValue
Condition `expected != null` is always `true`
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetReaders.java`
#### Snippet
```java
          return new FixedReader(desc);
        case BINARY:
          if (expected != null
              && expected.typeId() == org.apache.iceberg.types.Type.TypeID.STRING) {
            return new ParquetValueReaders.StringReader(desc);
```

### ConstantValue
Condition `expected != null` is always `true`
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetReaders.java`
#### Snippet
```java
          }
        case INT32:
          if (expected != null && expected.typeId() == org.apache.iceberg.types.Type.TypeID.LONG) {
            return new ParquetValueReaders.IntAsLongReader(desc);
          } else {
```

### ConstantValue
Condition `expected != null` is always `true`
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetReaders.java`
#### Snippet
```java
          }
        case FLOAT:
          if (expected != null
              && expected.typeId() == org.apache.iceberg.types.Type.TypeID.DOUBLE) {
            return new ParquetValueReaders.FloatAsDoubleReader(desc);
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `headers`
in `core/src/main/java/org/apache/iceberg/rest/auth/OAuth2Util.java`
#### Snippet
```java
        this.tokenType = response.issuedTokenType();
        this.expiresAtMillis = OAuth2Util.expiresAtMillis(token);
        this.headers = RESTUtil.merge(headers, authHeaders(token));

        if (response.expiresInSeconds() != null) {
```

## RuleId[id=JUnitMixedFramework]
### JUnitMixedFramework
Method `beforeEach()` annotated with '@BeforeEach' inside class extending JUnit 4 TestCase
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java

  @BeforeEach
  public void beforeEach() {
    clientFactory.initialize(Maps.newHashMap());
  }
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.anyMatch()'
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java
  public boolean removeAll(Collection<?> objects) {
    if (objects != null) {
      return objects.stream().filter(this::remove).count() != 0;
    }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/enumerator/IcebergEnumeratorStateSerializer.java`
#### Snippet
```java
      DataOutputSerializer out, int[] enumerationSplitCountHistory) throws IOException {
    out.writeInt(enumerationSplitCountHistory.length);
    if (enumerationSplitCountHistory.length > 0) {
      for (int enumerationSplitCount : enumerationSplitCountHistory) {
        out.writeInt(enumerationSplitCount);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'org.apache.hadoop.io.Writable' to 'org.apache.iceberg.mr.mapred.Container'
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergRecordWriter.java`
#### Snippet
```java
  @Override
  public void write(Writable row) throws IOException {
    super.write(((Container<Record>) row).get());
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.hadoop.mapred.RecordReader' to 'org.apache.hadoop.mapred.RecordReader\>'
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergInputFormat.java`
#### Snippet
```java
      IcebergSplit icebergSplit = ((IcebergSplitContainer) split).icebergSplit();
      // bogus cast for favouring code reuse over syntax
      return (RecordReader)
          HIVE_VECTORIZED_RECORDREADER_CTOR.newInstance(
              new IcebergInputFormat<>(), icebergSplit, job, reporter);
    } else {
      return super.getRecordReader(split, job, reporter);
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'T'
in `mr/src/main/java/org/apache/iceberg/mr/mapred/MapredIcebergInputFormat.java`
#### Snippet
```java
      try {
        if (innerReader.nextKeyValue()) {
          value.set((T) innerReader.getCurrentValue());
          return true;
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `api/src/main/java/org/apache/iceberg/Metrics.java`
#### Snippet
```java
  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    rowCount = (Long) in.readObject();
    columnSizes = (Map<Integer, Long>) in.readObject();
    valueCounts = (Map<Integer, Long>) in.readObject();
    nullValueCounts = (Map<Integer, Long>) in.readObject();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `api/src/main/java/org/apache/iceberg/Metrics.java`
#### Snippet
```java
    rowCount = (Long) in.readObject();
    columnSizes = (Map<Integer, Long>) in.readObject();
    valueCounts = (Map<Integer, Long>) in.readObject();
    nullValueCounts = (Map<Integer, Long>) in.readObject();
    nanValueCounts = (Map<Integer, Long>) in.readObject();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `api/src/main/java/org/apache/iceberg/Metrics.java`
#### Snippet
```java
    columnSizes = (Map<Integer, Long>) in.readObject();
    valueCounts = (Map<Integer, Long>) in.readObject();
    nullValueCounts = (Map<Integer, Long>) in.readObject();
    nanValueCounts = (Map<Integer, Long>) in.readObject();

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `api/src/main/java/org/apache/iceberg/Metrics.java`
#### Snippet
```java
    valueCounts = (Map<Integer, Long>) in.readObject();
    nullValueCounts = (Map<Integer, Long>) in.readObject();
    nanValueCounts = (Map<Integer, Long>) in.readObject();

    lowerBounds = readByteBufferMap(in);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `aws/src/main/java/org/apache/iceberg/aws/HttpClientProperties.java`
#### Snippet
```java
              .buildStaticChecked()
              .invoke(httpClientProperties);
      return (T) httpClientConfigurations;
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException(
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.iceberg.aws.s3.signer.S3SignResponse' to 'T'
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3ObjectMapper.java`
#### Snippet
```java
    public T deserialize(JsonParser p, DeserializationContext context) throws IOException {
      JsonNode jsonNode = p.getCodec().readTree(p);
      return (T) S3SignResponseParser.fromJson(jsonNode);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.iceberg.aws.s3.signer.S3SignRequest' to 'T'
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3ObjectMapper.java`
#### Snippet
```java
    public T deserialize(JsonParser p, DeserializationContext context) throws IOException {
      JsonNode jsonNode = p.getCodec().readTree(p);
      return (T) S3SignRequestParser.fromJson(jsonNode);
    }
  }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
              realOps.persistGlueTable(
                  i.getArgument(0, software.amazon.awssdk.services.glue.model.Table.class),
                  i.getArgument(1, Map.class),
                  i.getArgument(2, TableMetadata.class),
                  i.getArgument(3, RetryDetector.class));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    Mockito.doAnswer(
            i -> {
              Map<String, String> mapProperties = i.getArgument(1, Map.class);
              realOps.persistGlueTable(
                  i.getArgument(0, software.amazon.awssdk.services.glue.model.Table.class),
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof List, "Invalid default %s value: %s", type, defaultValue);
        List<Object> defaultList = (List<Object>) defaultValue;
        Type elementType = type.asListType().elementType();
        generator.writeStartArray();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Map, "Invalid default %s value: %s", type, defaultValue);
        Map<Object, Object> defaultMap = (Map<Object, Object>) defaultValue;
        Type keyType = type.asMapType().keyType();
        Type valueType = type.asMapType().valueType();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
              .buildStaticChecked()
              .invoke(httpClientProperties);
      return (T) httpClientConfigurations;
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException(
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.iceberg.rest.requests.ReportMetricsRequest' to 'T'
in `core/src/main/java/org/apache/iceberg/rest/RESTSerializers.java`
#### Snippet
```java
    public T deserialize(JsonParser p, DeserializationContext context) throws IOException {
      JsonNode jsonNode = p.getCodec().readTree(p);
      return (T) ReportMetricsRequestParser.fromJson(jsonNode);
    }
  }
```

### UNCHECKED_WARNING
Unchecked cast: 'T' to 'R'
in `core/src/main/java/org/apache/iceberg/deletes/PositionDelete.java`
#### Snippet
```java
        break;
      case 2:
        this.row = (R) value;
        break;
      default:
```

### UNCHECKED_WARNING
Unchecked call to 'ConstantVectorHolder(int, T)' as a member of raw type 'org.apache.iceberg.arrow.vectorized.VectorHolder.ConstantVectorHolder'
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorHolder.java`
#### Snippet
```java

  public static <T> VectorHolder constantHolder(int numRows, T constantValue) {
    return new ConstantVectorHolder(numRows, constantValue);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'copy(T)' as a member of raw type 'org.apache.flink.api.common.typeutils.TypeSerializer'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/RowDataUtil.java`
#### Snippet
```java
      if (!from.isNullAt(i)) {
        RowData.FieldGetter getter = RowData.createFieldGetter(rowType.getTypeAt(i), i);
        ret.setField(i, fieldSerializers[i].copy(getter.getFieldOrNull(from)));
      } else {
        ret.setField(i, null);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/StructRowData.java`
#### Snippet
```java
        return new StructRowData(elementType.asStructType(), (StructLike) value);
      case LIST:
        List<Object> list = (List<Object>) value;
        Object[] array = new Object[list.size()];

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.flink.runtime.operators.coordination.OperatorEvent' to 'org.apache.iceberg.flink.sink.shuffle.DataStatisticsEvent'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/shuffle/DataStatisticsOperator.java`
#### Snippet
```java
        event instanceof DataStatisticsEvent,
        "Received unexpected operator event " + event.getClass());
    DataStatisticsEvent<D, S> statisticsEvent = (DataStatisticsEvent<D, S>) event;
    globalStatistics = statisticsEvent.dataStatistics();
    output.collect(new StreamRecord<>(DataStatisticsOrRecord.fromDataStatistics(globalStatistics)));
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.iceberg.flink.source.DataIterator' to 'org.apache.iceberg.flink.source.DataIterator'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/FlinkInputFormat.java`
#### Snippet
```java
  @Override
  public void open(FlinkInputSplit split) {
    this.iterator = new DataIterator<>(rowDataReader, split.getTask(), io, encryption);
  }

```

### UNCHECKED_WARNING
Unchecked call to 'DataIterator(FileScanTaskReader, CombinedScanTask, FileIO, EncryptionManager)' as a member of raw type 'org.apache.iceberg.flink.source.DataIterator'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/FlinkInputFormat.java`
#### Snippet
```java
  @Override
  public void open(FlinkInputSplit split) {
    this.iterator = new DataIterator<>(rowDataReader, split.getTask(), io, encryption);
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.streaming.api.datastream.DataStreamSource' to 'org.apache.flink.streaming.api.datastream.DataStreamSource'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
            source.name(),
            TypeInformation.of(RowData.class));
    return stream;
  }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.flink.connector.base.source.reader.RecordsBySplits' to 'org.apache.flink.connector.base.source.reader.RecordsWithSplitIds\>'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/reader/IcebergSourceSplitReader.java`
#### Snippet
```java
        // return an empty result, which will lead to split fetch to be idle.
        // SplitFetcherManager will then close idle fetcher.
        return new RecordsBySplits(Collections.emptyMap(), Collections.emptySet());
      }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RecordsBySplits(Map\>, Set)' as a member of raw type 'org.apache.flink.connector.base.source.reader.RecordsBySplits'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/reader/IcebergSourceSplitReader.java`
#### Snippet
```java
        // return an empty result, which will lead to split fetch to be idle.
        // SplitFetcherManager will then close idle fetcher.
        return new RecordsBySplits(Collections.emptyMap(), Collections.emptySet());
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.iceberg.flink.source.reader.MetaDataReaderFunction' to 'org.apache.iceberg.flink.source.reader.ReaderFunction'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergSource.java`
#### Snippet
```java
              new MetaDataReaderFunction(
                  flinkConfig, table.schema(), context.project(), table.io(), table.encryption());
          this.readerFunction = (ReaderFunction<T>) rowDataReaderFunction;
        } else {
          RowDataReaderFunction rowDataReaderFunction =
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.iceberg.flink.source.reader.RowDataReaderFunction' to 'org.apache.iceberg.flink.source.reader.ReaderFunction'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergSource.java`
#### Snippet
```java
                  table.encryption(),
                  context.filters());
          this.readerFunction = (ReaderFunction<T>) rowDataReaderFunction;
        }
      }
```

### UNCHECKED_WARNING
Unchecked call to 'createTable(Identifier, StructType, Transform\[\], Map)' as a member of raw type 'org.apache.iceberg.spark.SparkSessionCatalog'
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
          (SparkSessionCatalog) Spark3Util.catalogAndIdentifier(spark(), "spark_catalog").catalog();
      catalog.dropTable(IDENT);
      catalog.createTable(
          IDENT, SparkSchemaUtil.convert(schema), new Transform[0], Collections.emptyMap());
    } catch (Exception e) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'C'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetFilters.java`
#### Snippet
```java
      case IS_NAN:
        if (col.getColumnType().equals(Double.class)) {
          return FilterApi.eq(col, (C) (Double) Double.NaN);
        } else if (col.getColumnType().equals(Float.class)) {
          return FilterApi.eq(col, (C) (Float) Float.NaN);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'C'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetFilters.java`
#### Snippet
```java
          return FilterApi.eq(col, (C) (Double) Double.NaN);
        } else if (col.getColumnType().equals(Float.class)) {
          return FilterApi.eq(col, (C) (Float) Float.NaN);
        } else {
          return AlwaysFalse.INSTANCE;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Double' to 'C'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetFilters.java`
#### Snippet
```java
      case NOT_NAN:
        if (col.getColumnType().equals(Double.class)) {
          return FilterApi.notEq(col, (C) (Double) Double.NaN);
        } else if (col.getColumnType().equals(Float.class)) {
          return FilterApi.notEq(col, (C) (Float) Float.NaN);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Float' to 'C'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetFilters.java`
#### Snippet
```java
          return FilterApi.notEq(col, (C) (Double) Double.NaN);
        } else if (col.getColumnType().equals(Float.class)) {
          return FilterApi.notEq(col, (C) (Float) Float.NaN);
        } else {
          return AlwaysTrue.INSTANCE;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.iceberg.parquet.VectorizedReader' to 'org.apache.iceberg.parquet.VectorizedReader'. Reason: 'conf' has raw type, so result of vectorizedModel is erased
in `parquet/src/main/java/org/apache/iceberg/parquet/VectorizedParquetReader.java`
#### Snippet
```java
      this.totalValues = conf.totalValues();
      this.reuseContainers = conf.reuseContainers();
      this.model = conf.vectorizedModel();
      this.batchSize = conf.batchSize();
      this.model.setBatchSize(this.batchSize);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'. Reason: 'conf' has raw type, so result of columnChunkMetadataForRowGroups is erased
in `parquet/src/main/java/org/apache/iceberg/parquet/VectorizedParquetReader.java`
#### Snippet
```java
      this.batchSize = conf.batchSize();
      this.model.setBatchSize(this.batchSize);
      this.columnChunkMetadata = conf.columnChunkMetadataForRowGroups();
      this.rowGroupsStartRowPos = conf.startRowPositions();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ReadConf(InputFile, ParquetReadOptions, Schema, Expression, Function\>, Function\>, NameMapping, ...)' as a member of raw type 'org.apache.iceberg.parquet.ReadConf'
in `parquet/src/main/java/org/apache/iceberg/parquet/VectorizedParquetReader.java`
#### Snippet
```java
    if (conf == null) {
      ReadConf readConf =
          new ReadConf(
              input,
              options,
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.iceberg.ClientPool' to 'org.apache.iceberg.ClientPool'
in `hive-metastore/src/main/java/org/apache/iceberg/hive/HiveTableOperations.java`
#### Snippet
```java
      String table) {
    this.conf = conf;
    this.metaClients = metaClients;
    this.fileIO = fileIO;
    this.fullName = catalogName + "." + database + "." + table;
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `org.apache.tez.mapreduce.output.MROutput` is inaccessible from here
in `mr/src/main/java/org/apache/iceberg/mr/hive/TezUtil.java`
#### Snippet
```java
   * a way to append an optional vertex id to the Job ID. This is needed because there is a
   * discrepancy between how the attempt ID is constructed in the {@link
   * org.apache.tez.mapreduce.output.MROutput} (with vertex ID appended to the end of the Job ID)
   * and how it's available in the mapper (without vertex ID) which creates and caches the
   * HiveIcebergRecordWriter object. 2. Redefine the equals/hashcode provided by TaskAttemptID so
```

### JavadocReference
Cannot resolve symbol `Stopwatch`
in `api/src/main/java/org/apache/iceberg/metrics/DefaultTimer.java`
#### Snippet
```java

/**
 * A default {@link Timer} implementation that uses a {@link Stopwatch} instance internally to
 * measure time.
 */
```

### JavadocReference
Cannot resolve symbol `ImmutableDeleteReachableFiles.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseDeleteReachableFilesActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableDeleteReachableFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseDeleteReachableFilesActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableDeleteReachableFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `ImmutableSnapshotTable.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseSnapshotTableActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableSnapshotTable.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseSnapshotTableActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableSnapshotTable.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `ImmutableRewriteDataFiles.FileGroupInfo`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteDataFilesFileGroupInfo.java`
#### Snippet
```java
/**
 * @deprecated will be removed in 1.4.0; use {@link
 *     ImmutableRewriteDataFiles.FileGroupInfo#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteDataFilesFileGroupInfo.java`
#### Snippet
```java
/**
 * @deprecated will be removed in 1.4.0; use {@link
 *     ImmutableRewriteDataFiles.FileGroupInfo#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ImmutableDeleteOrphanFiles.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseDeleteOrphanFilesActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableDeleteOrphanFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseDeleteOrphanFilesActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableDeleteOrphanFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `ImmutableRewriteDataFiles.FileGroupRewriteResult`
in `core/src/main/java/org/apache/iceberg/actions/BaseFileGroupRewriteResult.java`
#### Snippet
```java
/**
 * @deprecated will be removed in 1.4.0; use {@link
 *     ImmutableRewriteDataFiles.FileGroupRewriteResult#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseFileGroupRewriteResult.java`
#### Snippet
```java
/**
 * @deprecated will be removed in 1.4.0; use {@link
 *     ImmutableRewriteDataFiles.FileGroupRewriteResult#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ImmutableRewriteManifests.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteManifestsActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableRewriteManifests.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteManifestsActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableRewriteManifests.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `ImmutableMigrateTable.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseMigrateTableActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableMigrateTable.Result#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseMigrateTableActionResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableMigrateTable.Result#builder()} instead.
 */
@Deprecated
```

### JavadocReference
Cannot resolve symbol `ImmutableRewriteDataFiles.Result`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteDataFilesResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableRewriteDataFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Cannot resolve symbol `builder()`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteDataFilesResult.java`
#### Snippet
```java

/**
 * @deprecated will be removed in 1.4.0; use {@link ImmutableRewriteDataFiles.Result#builder()}
 *     instead.
 */
```

### JavadocReference
Symbol `copyRowData(RowData, RowData)` is inaccessible from here
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/RowDataUtil.java`
#### Snippet
```java

  /**
   * Similar to the private {@link RowDataSerializer#copyRowData(RowData, RowData)} method. This
   * skips the check the arity of rowType and from, because the from RowData may contains additional
   * column for position deletes. Using {@link RowDataSerializer#copy(RowData, RowData)} will fail
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `api/src/main/java/org/apache/iceberg/SortOrderBuilder.java`
#### Snippet
```java
    throw new UnsupportedOperationException(
        this.getClass().getName() + " doesn't implement caseSensitive");
  };
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `newInstance` may produce `NullPointerException`
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergInputFormat.java`
#### Snippet
```java
      // bogus cast for favouring code reuse over syntax
      return (RecordReader)
          HIVE_VECTORIZED_RECORDREADER_CTOR.newInstance(
              new IcebergInputFormat<>(), icebergSplit, job, reporter);
    } else {
```

### DataFlowIssue
Method invocation `getBoolean` may produce `NullPointerException`
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergSerDe.java`
#### Snippet
```java
      } catch (Exception e) {
        boolean autoConversion =
            configuration.getBoolean(InputFormatConfig.SCHEMA_AUTO_CONVERSION, false);
        // If we can not load the table try the provided hive schema
        this.tableSchema = hiveSchemaOrThrow(serDeProperties, e, autoConversion);
```

### DataFlowIssue
Method invocation `setBoolean` may produce `NullPointerException`
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergSerDe.java`
#### Snippet
```java
      projectedSchema = tableSchema;
    } else {
      configuration.setBoolean(InputFormatConfig.CASE_SENSITIVE, false);
      String[] selectedColumns = ColumnProjectionUtils.getReadColumnNames(configuration);
      // When same table is joined multiple times, it is possible some selected columns are
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/SnapshotRefType.java`
#### Snippet
```java
    Preconditions.checkArgument(null != snapshotRefType, "Invalid snapshot ref type: null");
    try {
      return SnapshotRefType.valueOf(snapshotRefType.toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/FileFormat.java`
#### Snippet
```java
    Preconditions.checkArgument(null != fileFormat, "Invalid file format: null");
    try {
      return FileFormat.valueOf(fileFormat.toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(String.format("Invalid file format: %s", fileFormat), e);
```

### DataFlowIssue
Casting `term` to `UnboundTerm` may produce `ClassCastException`
in `api/src/main/java/org/apache/iceberg/SortOrder.java`
#### Snippet
```java
      // ValidationException is thrown by bind if binding fails so we assume that boundTerm is
      // correct
      BoundTerm<?> boundTerm = ((UnboundTerm<?>) term).bind(schema.asStruct(), caseSensitive);
      int sourceId = boundTerm.ref().fieldId();
      SortField sortField = new SortField(toTransform(boundTerm), sourceId, direction, nullOrder);
```

### DataFlowIssue
Method invocation `replaceFirst` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/RewriteJobOrder.java`
#### Snippet
```java
    // bytes-asc to BYTES_ASC
    try {
      return RewriteJobOrder.valueOf(orderName.replaceFirst("-", "_").toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/SortDirection.java`
#### Snippet
```java
    Preconditions.checkArgument(null != directionAsString, "Invalid sort direction: null");
    try {
      return SortDirection.valueOf(directionAsString.toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/DistributionMode.java`
#### Snippet
```java
    Preconditions.checkArgument(null != modeName, "Invalid distribution mode: null");
    try {
      return DistributionMode.valueOf(modeName.toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(String.format("Invalid distribution mode: %s", modeName));
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `mr/src/main/java/org/apache/iceberg/mr/mapreduce/IcebergInputFormat.java`
#### Snippet
```java
          if (HiveVersion.min(HiveVersion.HIVE_3)) {
            orcIterator =
                HIVE_VECTORIZED_READER_BUILDER.invoke(inputFile, task, idToConstant, context);
          } else {
            throw new UnsupportedOperationException(
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `mr/src/main/java/org/apache/iceberg/mr/mapreduce/IcebergInputFormat.java`
#### Snippet
```java
          if (HiveVersion.min(HiveVersion.HIVE_3)) {
            parquetIterator =
                HIVE_VECTORIZED_READER_BUILDER.invoke(inputFile, task, idToConstant, context);
          } else {
            throw new UnsupportedOperationException(
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/PartitionKey.java`
#### Snippet
```java
          "Cannot build accessor for field: " + schema.findField(field.sourceId()));
      this.accessors[i] = accessor;
      this.transforms[i] = field.transform().bind(accessor.type());
    }
  }
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/Schema.java`
#### Snippet
```java
        fieldId);
    Preconditions.checkArgument(
        field.type().isPrimitiveType(),
        "Cannot add field %s as an identifier field: not a primitive type field",
        field.name());
```

### DataFlowIssue
Casting `type` to `Types.DecimalType` may produce `ClassCastException`
in `api/src/main/java/org/apache/iceberg/types/Conversions.java`
#### Snippet
```java
        return tmp;
      case DECIMAL:
        Types.DecimalType decimal = (Types.DecimalType) type;
        byte[] unscaledBytes = new byte[buffer.remaining()];
        tmp.get(unscaledBytes);
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/actions/DeleteOrphanFiles.java`
#### Snippet
```java
      Preconditions.checkArgument(modeAsString != null, "Invalid mode: null");
      try {
        return PrefixMismatchMode.valueOf(modeAsString.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Invalid mode: %s", modeAsString), e);
```

### DataFlowIssue
Dereference of `levels` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/catalog/Namespace.java`
#### Snippet
```java
  public static Namespace of(String... levels) {
    Preconditions.checkArgument(null != levels, "Cannot create Namespace from null array");
    if (levels.length == 0) {
      return empty();
    }
```

### DataFlowIssue
Dereference of `names` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/catalog/TableIdentifier.java`
#### Snippet
```java
    Preconditions.checkArgument(names != null, "Cannot create table identifier from null array");
    Preconditions.checkArgument(
        names.length > 0, "Cannot create table identifier without a table name");
    return new TableIdentifier(
        Namespace.of(Arrays.copyOf(names, names.length - 1)), names[names.length - 1]);
```

### DataFlowIssue
Method invocation `stop` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/metrics/DefaultTimer.java`
#### Snippet
```java
      Stopwatch stopwatch = stopwatchRef.getAndSet(null);
      Preconditions.checkState(null != stopwatch, "stop() called multiple times");
      timer.record(stopwatch.stop().elapsed(defaultTimeUnit), defaultTimeUnit);
    }
  }
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/metrics/MetricsContext.java`
#### Snippet
```java
      Preconditions.checkArgument(null != displayName, "Invalid unit: null");
      try {
        return Unit.valueOf(displayName.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Invalid unit: %s", displayName), e);
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
    return combine(
        () ->
            new FilterIterator<E>(iterable.iterator()) {
              @Override
              protected boolean shouldKeep(E item) {
```

### DataFlowIssue
Method invocation `test` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
              @Override
              protected boolean shouldKeep(E item) {
                boolean matches = pred.test(item);
                if (!matches) {
                  skipCounter.increment();
```

### DataFlowIssue
Method invocation `increment` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
                boolean matches = pred.test(item);
                if (!matches) {
                  skipCounter.increment();
                }
                return matches;
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
      @Override
      public void close() throws IOException {
        iterable.close();
      }
    };
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/io/CloseableIterable.java`
#### Snippet
```java
      @Override
      public CloseableIterator<T> iterator() {
        return CloseableIterator.count(counter, iterable.iterator());
      }

```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `api/src/main/java/org/apache/iceberg/expressions/Expression.java`
#### Snippet
```java
      Preconditions.checkArgument(null != operationType, "Invalid operation type: null");
      try {
        return Expression.Operation.valueOf(operationType.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3SignResponseParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse s3 sign response from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse s3 sign response from non-object: %s", json);

    java.net.URI uri = java.net.URI.create(JsonUtil.getString(URI, json));
```

### DataFlowIssue
Method invocation `uri` may produce `NullPointerException`
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3SignResponseParser.java`
#### Snippet
```java
    gen.writeStartObject();

    gen.writeStringField(URI, response.uri().toString());
    S3SignRequestParser.headersToJson(HEADERS, response.headers(), gen);

```

### DataFlowIssue
Method invocation `region` may produce `NullPointerException`
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3SignRequestParser.java`
#### Snippet
```java
    gen.writeStartObject();

    gen.writeStringField(REGION, request.region());
    gen.writeStringField(METHOD, request.method());
    gen.writeStringField(URI, request.uri().toString());
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3SignRequestParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse s3 sign request from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse s3 sign request from non-object: %s", json);

    String region = JsonUtil.getString(REGION, json);
```

### DataFlowIssue
Argument `credential()` might be null
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3V4RestSignerClient.java`
#### Snippet
```java
      return authSessionCache()
          .get(
              credential(),
              id -> {
                AuthSession session =
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3V4RestSignerClient.java`
#### Snippet
```java

  private boolean credentialProvided() {
    return null != credential() && !credential().isEmpty();
  }

```

### DataFlowIssue
Argument `vector` might be null
in `orc/src/main/java/org/apache/iceberg/orc/OrcValueReaders.java`
#### Snippet
```java
          vectorIndex++;
        }
        set(struct, c, reader(c).read(vector, row));
      }
      return struct;
```

### DataFlowIssue
Argument `element` might be null
in `orc/src/main/java/org/apache/iceberg/orc/ApplyNameMapping.java`
#### Snippet
```java

    MappedField field = nameMapping.find(currentPath());
    TypeDescription listType = TypeDescription.createList(element);
    return setId(listType, field);
  }
```

### DataFlowIssue
Argument `key` might be null
in `orc/src/main/java/org/apache/iceberg/orc/ApplyNameMapping.java`
#### Snippet
```java

    MappedField field = nameMapping.find(currentPath());
    TypeDescription mapType = TypeDescription.createMap(key, value);
    return setId(mapType, field);
  }
```

### DataFlowIssue
Argument `value` might be null
in `orc/src/main/java/org/apache/iceberg/orc/ApplyNameMapping.java`
#### Snippet
```java

    MappedField field = nameMapping.find(currentPath());
    TypeDescription mapType = TypeDescription.createMap(key, value);
    return setId(mapType, field);
  }
```

### DataFlowIssue
Method invocation `row` may produce `NullPointerException`
in `orc/src/main/java/org/apache/iceberg/data/orc/GenericOrcWriters.java`
#### Snippet
```java
      Preconditions.checkArgument(row != null, "value must not be null");
      Preconditions.checkArgument(
          writers().size() == 2 || row.row() != null,
          "The row in PositionDelete must not be null because it was set row schema in position delete.");
      writeRow(row, output);
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SetSnapshotOperation.java`
#### Snippet
```java
        snapshot != null, "Cannot roll back, no valid snapshot older than: %s", timestampMillis);

    this.targetSnapshotId = snapshot.snapshotId();
    this.isRollback = true;

```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/DataTableScan.java`
#### Snippet
```java
        "Cannot scan appends after %s, there is no current snapshot",
        fromSnapshotId);
    return appendsBetween(fromSnapshotId, currentSnapshot.snapshotId());
  }

```

### DataFlowIssue
Unboxing of `lastSnapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/FindFiles.java`
#### Snippet
```java
          "Cannot find a snapshot older than %s",
          DateTimeUtil.formatTimestampMillis(timestampMillis));
      return inSnapshot(lastSnapshotId);
    }

```

### DataFlowIssue
Method invocation `isTag` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.get(name);
    Preconditions.checkArgument(ref != null, "Tag does not exist: %s", name);
    Preconditions.checkArgument(ref.isTag(), "Ref %s is a branch not a tag", name);
    SnapshotRef updatedRef = SnapshotRef.builderFrom(ref, snapshotId).build();
    updatedRefs.put(name, updatedRef);
```

### DataFlowIssue
Method invocation `isTag` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.remove(name);
    Preconditions.checkArgument(ref != null, "Tag does not exist: %s", name);
    Preconditions.checkArgument(ref.isTag(), "Ref %s is a branch not a tag", name);
    return this;
  }
```

### DataFlowIssue
Method invocation `isBranch` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.get(name);
    Preconditions.checkArgument(ref != null, "Branch does not exist: %s", name);
    Preconditions.checkArgument(ref.isBranch(), "Ref %s is a tag not a branch", name);
    SnapshotRef existing = updatedRefs.put(newName, ref);
    Preconditions.checkArgument(existing == null, "Ref %s already exists", newName);
```

### DataFlowIssue
Argument `ref` might be null
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.get(name);
    Preconditions.checkArgument(ref != null, "Ref does not exist: %s", name);
    SnapshotRef updatedRef = SnapshotRef.builderFrom(ref).maxRefAgeMs(maxRefAgeMs).build();
    updatedRefs.put(name, updatedRef);
    return this;
```

### DataFlowIssue
Method invocation `isBranch` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.remove(name);
    Preconditions.checkArgument(ref != null, "Branch does not exist: %s", name);
    Preconditions.checkArgument(ref.isBranch(), "Ref %s is a tag not a branch", name);
    return this;
  }
```

### DataFlowIssue
Argument `ref` might be null
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    Preconditions.checkArgument(ref != null, "Branch does not exist: %s", name);
    SnapshotRef updateBranch =
        SnapshotRef.builderFrom(ref).maxSnapshotAgeMs(maxSnapshotAgeMs).build();
    updatedRefs.put(name, updateBranch);
    return this;
```

### DataFlowIssue
Method invocation `isBranch` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    Preconditions.checkArgument(refToUpdate != null, "Target branch does not exist: %s", name);
    Preconditions.checkArgument(sourceRef != null, "Ref does not exist: %s", source);
    Preconditions.checkArgument(refToUpdate.isBranch(), "Ref %s is a tag not a branch", name);

    // Nothing to replace
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java

    // Nothing to replace
    if (sourceRef.snapshotId() == refToUpdate.snapshotId()) {
      return this;
    }
```

### DataFlowIssue
Argument `ref` might be null
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    Preconditions.checkArgument(ref != null, "Branch does not exist: %s", name);
    SnapshotRef updateBranch =
        SnapshotRef.builderFrom(ref).minSnapshotsToKeep(minSnapshotsToKeep).build();
    updatedRefs.put(name, updateBranch);
    return this;
```

### DataFlowIssue
Method invocation `isBranch` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
    SnapshotRef ref = updatedRefs.get(name);
    Preconditions.checkArgument(ref != null, "Branch does not exist: %s", name);
    Preconditions.checkArgument(ref.isBranch(), "Ref %s is a tag not a branch", name);
    SnapshotRef updatedRef = SnapshotRef.builderFrom(ref, snapshotId).build();
    updatedRefs.put(name, updatedRef);
```

### DataFlowIssue
Method invocation `fieldNames` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SnapshotParser.java`
#### Snippet
```java

      ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
      Iterator<String> fields = sNode.fieldNames();
      while (fields.hasNext()) {
        String field = fields.next();
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/TableMetadataParser.java`
#### Snippet
```java
      Preconditions.checkArgument(codecName != null, "Codec name is null");
      try {
        return Codec.valueOf(codecName.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Invalid codec name: %s", codecName), e);
```

### DataFlowIssue
Unboxing of `context().toSnapshotId()` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseIncrementalScan.java`
#### Snippet
```java
  private long toSnapshotIdInclusive() {
    if (context().toSnapshotId() != null) {
      return context().toSnapshotId();
    } else {
      Snapshot currentSnapshot = table().currentSnapshot();
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseIncrementalScan.java`
#### Snippet
```java
      Preconditions.checkArgument(
          currentSnapshot != null, "End snapshot is not set and table has no current snapshot");
      return currentSnapshot.snapshotId();
    }
  }
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/ManifestGroup.java`
#### Snippet
```java
                scanMetrics.skippedDataManifests(),
                closeableDataManifests,
                manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));

    if (ignoreDeleted) {
```

### DataFlowIssue
Method invocation `isArray` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SortOrderParser.java`
#### Snippet
```java
    Preconditions.checkArgument(json != null, "Cannot parse null sort order fields");
    Preconditions.checkArgument(
        json.isArray(), "Cannot parse sort order fields, not an array: %s", json);

    Iterator<JsonNode> elements = json.elements();
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(newName != null, "Cannot rename a column to null");
    Preconditions.checkArgument(
        !deletes.contains(field.fieldId()),
        "Cannot rename a column that will be deleted: %s",
        field.name());
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot update missing column: %s", name);
    Preconditions.checkArgument(
        !deletes.contains(field.fieldId()),
        "Cannot update a column that will be deleted: %s",
        field.name());
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(
        beforeId != null, "Cannot move %s before missing column: %s", name, beforeName);
    Preconditions.checkArgument(!fieldId.equals(beforeId), "Cannot move %s before itself", name);
    internalMove(name, Move.before(fieldId, beforeId));
    return this;
```

### DataFlowIssue
Unboxing of `beforeId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
        beforeId != null, "Cannot move %s before missing column: %s", name, beforeName);
    Preconditions.checkArgument(!fieldId.equals(beforeId), "Cannot move %s before itself", name);
    internalMove(name, Move.before(fieldId, beforeId));
    return this;
  }
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot update missing column: %s", name);
    Preconditions.checkArgument(
        !deletes.contains(field.fieldId()),
        "Cannot update a column that will be deleted: %s",
        field.name());
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(
        afterId != null, "Cannot move %s after missing column: %s", name, afterName);
    Preconditions.checkArgument(!fieldId.equals(afterId), "Cannot move %s after itself", name);
    internalMove(name, Move.after(fieldId, afterId));
    return this;
```

### DataFlowIssue
Unboxing of `afterId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
        afterId != null, "Cannot move %s after missing column: %s", name, afterName);
    Preconditions.checkArgument(!fieldId.equals(afterId), "Cannot move %s after itself", name);
    internalMove(name, Move.after(fieldId, afterId));
    return this;
  }
```

### DataFlowIssue
Method invocation `isRequired` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot update missing column: %s", name);

    if ((!isOptional && field.isRequired()) || (isOptional && field.isOptional())) {
      // if the change is a noop, allow it even if allowIncompatibleChanges is false
      return;
```

### DataFlowIssue
Method invocation `isOptional` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot update missing column: %s", name);

    if ((!isOptional && field.isRequired()) || (isOptional && field.isOptional())) {
      // if the change is a noop, allow it even if allowIncompatibleChanges is false
      return;
```

### DataFlowIssue
Unboxing of `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Integer fieldId = findForMove(name);
    Preconditions.checkArgument(fieldId != null, "Cannot move missing column: %s", name);
    internalMove(name, Move.first(fieldId));
    return this;
  }
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot delete missing column: %s", name);
    Preconditions.checkArgument(
        !adds.containsKey(field.fieldId()), "Cannot delete a column that has additions: %s", name);
    Preconditions.checkArgument(
        !updates.containsKey(field.fieldId()), "Cannot delete a column that has updates: %s", name);
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
      Types.NestedField parentField = findField(parent);
      Preconditions.checkArgument(parentField != null, "Cannot find parent struct: %s", parent);
      Type parentType = parentField.type();
      if (parentType.isNestedType()) {
        Type.NestedType nested = parentType.asNestedType();
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/SnapshotScan.java`
#### Snippet
```java
    Snapshot snapshot = table().snapshot(name);
    Preconditions.checkArgument(snapshot != null, "Cannot find ref %s", name);
    TableScanContext newContext = context().useSnapshotId(snapshot.snapshotId());
    return newRefinedScan(table(), SnapshotUtil.schemaFor(table(), name), newContext);
  }
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
        "Cannot scan appends after %s, there is no current snapshot",
        newFromSnapshotId);
    return appendsBetween(newFromSnapshotId, currentSnapshot.snapshotId());
  }

```

### DataFlowIssue
Unboxing of `fromSnapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
    Long toSnapshotId = context().toSnapshotId();

    List<Snapshot> snapshots = snapshotsWithin(table(), fromSnapshotId, toSnapshotId);
    Set<Long> snapshotIds = Sets.newHashSet(Iterables.transform(snapshots, Snapshot::snapshotId));
    Set<ManifestFile> manifests =
```

### DataFlowIssue
Unboxing of `toSnapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
    Long toSnapshotId = context().toSnapshotId();

    List<Snapshot> snapshots = snapshotsWithin(table(), fromSnapshotId, toSnapshotId);
    Set<Long> snapshotIds = Sets.newHashSet(Iterables.transform(snapshots, Snapshot::snapshotId));
    Set<ManifestFile> manifests =
```

### DataFlowIssue
Unboxing of `context.fromSnapshotId()` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
  IncrementalDataTableScan(Table table, Schema schema, TableScanContext context) {
    super(table, schema, context.useSnapshotId(null));
    validateSnapshotIds(table, context.fromSnapshotId(), context.toSnapshotId());
  }

```

### DataFlowIssue
Unboxing of `context.toSnapshotId()` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
  IncrementalDataTableScan(Table table, Schema schema, TableScanContext context) {
    super(table, schema, context.useSnapshotId(null));
    validateSnapshotIds(table, context.fromSnapshotId(), context.toSnapshotId());
  }

```

### DataFlowIssue
Unboxing of `context().toSnapshotId()` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IncrementalDataTableScan.java`
#### Snippet
```java
        Sets.newHashSet(
            SnapshotUtil.ancestorIdsBetween(
                context().toSnapshotId(), context().fromSnapshotId(), table()::snapshot));
    // since snapshotIdsBetween return ids in range (fromSnapshotId, toSnapshotId]
    snapshotIdsRange.add(context().fromSnapshotId());
```

### DataFlowIssue
Dereference of `format` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/ManifestReader.java`
#### Snippet
```java
    fields.add(MetadataColumns.ROW_POSITION);

    switch (format) {
      case AVRO:
        AvroIterable<ManifestEntry<F>> reader =
```

### DataFlowIssue
Method invocation `hasNonNull` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/MetadataUpdateParser.java`
#### Snippet
```java
        jsonNode);
    Preconditions.checkArgument(
        jsonNode.hasNonNull(ACTION), "Cannot parse metadata update. Missing field: action");
    String action = JsonUtil.getString(ACTION, jsonNode).toLowerCase(Locale.ROOT);

```

### DataFlowIssue
Dereference of `updateAction` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/MetadataUpdateParser.java`
#### Snippet
```java
    generator.writeStringField(ACTION, updateAction);

    switch (updateAction) {
      case ASSIGN_UUID:
        writeAssignUUID((MetadataUpdate.AssignUUID) metadataUpdate, generator);
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseFilesTable.java`
#### Snippet
```java
    CloseableIterable<ManifestFile> filteredManifests =
        CloseableIterable.filter(
            manifests, manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));

    String schemaString = SchemaParser.toJson(projectedSchema);
```

### DataFlowIssue
Dereference of `blobsJson` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/StatisticsFileParser.java`
#### Snippet
```java
        "Cannot parse blob metadata from non-array: %s",
        blobsJson);
    for (JsonNode blobJson : blobsJson) {
      blobMetadata.add(blobMetadataFromJson(blobJson));
    }
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseEntriesTable.java`
#### Snippet
```java
    CloseableIterable<ManifestFile> filteredManifests =
        CloseableIterable.filter(
            manifests, manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));

    String schemaString = SchemaParser.toJson(projectedSchema);
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/PartitionsTable.java`
#### Snippet
```java

    return CloseableIterable.filter(
        manifestFiles, manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));
  }

```

### DataFlowIssue
Casting `defaultValue` to `Boolean` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Boolean, "Invalid default %s value: %s", type, defaultValue);
        generator.writeBoolean((Boolean) defaultValue);
        break;
      case INTEGER:
```

### DataFlowIssue
Casting `defaultValue` to `Integer` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Integer, "Invalid default %s value: %s", type, defaultValue);
        generator.writeNumber((Integer) defaultValue);
        break;
      case LONG:
```

### DataFlowIssue
Casting `defaultValue` to `Long` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Long, "Invalid default %s value: %s", type, defaultValue);
        generator.writeNumber((Long) defaultValue);
        break;
      case FLOAT:
```

### DataFlowIssue
Casting `defaultValue` to `Float` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Float, "Invalid default %s value: %s", type, defaultValue);
        generator.writeNumber((Float) defaultValue);
        break;
      case DOUBLE:
```

### DataFlowIssue
Casting `defaultValue` to `Double` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Double, "Invalid default %s value: %s", type, defaultValue);
        generator.writeNumber((Double) defaultValue);
        break;
      case DATE:
```

### DataFlowIssue
Casting `defaultValue` to `Integer` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Integer, "Invalid default %s value: %s", type, defaultValue);
        generator.writeString(DateTimeUtil.daysToIsoDate((Integer) defaultValue));
        break;
      case TIME:
```

### DataFlowIssue
Casting `defaultValue` to `Long` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Long, "Invalid default %s value: %s", type, defaultValue);
        generator.writeString(DateTimeUtil.microsToIsoTime((Long) defaultValue));
        break;
      case TIMESTAMP:
```

### DataFlowIssue
Casting `defaultValue` to `Long` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
            defaultValue instanceof Long, "Invalid default %s value: %s", type, defaultValue);
        if (((Types.TimestampType) type).shouldAdjustToUTC()) {
          generator.writeString(DateTimeUtil.microsToIsoTimestamptz((Long) defaultValue));
        } else {
          generator.writeString(DateTimeUtil.microsToIsoTimestamp((Long) defaultValue));
```

### DataFlowIssue
Casting `defaultValue` to `Long` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
          generator.writeString(DateTimeUtil.microsToIsoTimestamptz((Long) defaultValue));
        } else {
          generator.writeString(DateTimeUtil.microsToIsoTimestamp((Long) defaultValue));
        }
        break;
```

### DataFlowIssue
Casting `defaultValue` to `CharSequence` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
            type,
            defaultValue);
        generator.writeString(((CharSequence) defaultValue).toString());
        break;
      case UUID:
```

### DataFlowIssue
Casting `defaultValue` to `ByteBuffer` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof ByteBuffer, "Invalid default %s value: %s", type, defaultValue);
        ByteBuffer byteBufferValue = (ByteBuffer) defaultValue;
        int expectedLength = ((Types.FixedType) type).length();
        Preconditions.checkArgument(
```

### DataFlowIssue
Casting `defaultValue` to `ByteBuffer` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
            defaultValue instanceof ByteBuffer, "Invalid default %s value: %s", type, defaultValue);
        generator.writeString(
            BaseEncoding.base16().encode(ByteBuffers.toByteArray((ByteBuffer) defaultValue)));
        break;
      case DECIMAL:
```

### DataFlowIssue
Casting `defaultValue` to `BigDecimal` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
            type,
            defaultValue);
        BigDecimal decimalValue = (BigDecimal) defaultValue;
        if (decimalValue.scale() >= 0) {
          generator.writeString(decimalValue.toPlainString());
```

### DataFlowIssue
Casting `defaultValue` to `List` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof List, "Invalid default %s value: %s", type, defaultValue);
        List<Object> defaultList = (List<Object>) defaultValue;
        Type elementType = type.asListType().elementType();
        generator.writeStartArray();
```

### DataFlowIssue
Casting `defaultValue` to `Map` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Preconditions.checkArgument(
            defaultValue instanceof Map, "Invalid default %s value: %s", type, defaultValue);
        Map<Object, Object> defaultMap = (Map<Object, Object>) defaultValue;
        Type keyType = type.asMapType().keyType();
        Type valueType = type.asMapType().valueType();
```

### DataFlowIssue
Casting `defaultValue` to `StructLike` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/SingleValueParser.java`
#### Snippet
```java
        Types.StructType structType = type.asStructType();
        List<Types.NestedField> fields = structType.fields();
        StructLike defaultStruct = (StructLike) defaultValue;

        generator.writeStartObject();
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/DeleteFileIndex.java`
#### Snippet
```java
                      manifest.content() == ManifestContent.DELETES
                          && (manifest.hasAddedFiles() || manifest.hasExistingFiles())
                          && evalCache.get(manifest.partitionSpecId()).eval(manifest));

      matchingManifests =
```

### DataFlowIssue
Method invocation `eval` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/PositionDeletesTable.java`
#### Snippet
```java
              scanMetrics().skippedDeleteManifests(),
              CloseableIterable.withNoopClose(manifests),
              manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));

      matchingManifests =
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/CatalogUtil.java`
#### Snippet
```java
    // try to use Hadoop's Configurable interface dynamically
    // use the classloader of the object that may be configurable
    ClassLoader maybeConfigurableLoader = maybeConfigurable.getClass().getClassLoader();

    Class<?> configurableInterface;
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseUpdatePartitionSpec.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot find partition field to remove: %s", name);

    deletes.add(field.fieldId());

    return this;
```

### DataFlowIssue
Casting `term` to `UnboundTerm` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/BaseUpdatePartitionSpec.java`
#### Snippet
```java
    Preconditions.checkArgument(term instanceof UnboundTerm, "Term must be unbound");

    BoundTerm<?> boundTerm = ((UnboundTerm<?>) term).bind(schema.asStruct(), caseSensitive);
    int sourceId = boundTerm.ref().fieldId();
    Transform<?, ?> transform = toTransform(boundTerm);
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseUpdatePartitionSpec.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot find partition field to rename: %s", name);
    Preconditions.checkArgument(
        !deletes.contains(field.fieldId()), "Cannot delete and rename partition field: %s", name);

    renames.put(name, newName);
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/BaseUpdatePartitionSpec.java`
#### Snippet
```java
    Preconditions.checkArgument(field != null, "Cannot find partition field to remove: %s", term);
    Preconditions.checkArgument(
        renames.get(field.name()) == null,
        "Cannot rename and delete partition field: %s",
        field.name());
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/IsolationLevel.java`
#### Snippet
```java
    Preconditions.checkArgument(levelName != null, "Invalid isolation level: null");
    try {
      return IsolationLevel.valueOf(levelName.toUpperCase(Locale.ENGLISH));
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(
```

### DataFlowIssue
Casting `table` to `BaseTable` may produce `ClassCastException`
in `core/src/main/java/org/apache/iceberg/BaseMetadataTable.java`
#### Snippet
```java
    Preconditions.checkArgument(
        table instanceof BaseTable, "Cannot create metadata table for non-data table: %s", table);
    this.table = (BaseTable) table;
    this.name = name;
  }
```

### DataFlowIssue
Argument `properties` might be null
in `core/src/main/java/org/apache/iceberg/io/FileIOParser.java`
#### Snippet
```java

    generator.writeStringField(FILE_IO_IMPL, impl);
    JsonUtil.writeStringMap(PROPERTIES, properties, generator);

    generator.writeEndObject();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/TableMetadata.java`
#### Snippet
```java
      Preconditions.checkArgument(newUuid != null, "Cannot set uuid to null");

      if (!newUuid.equals(uuid)) {
        this.uuid = newUuid;
        changes.add(new MetadataUpdate.AssignUUID(uuid));
```

### DataFlowIssue
Argument `specs` might be null
in `core/src/main/java/org/apache/iceberg/TableMetadata.java`
#### Snippet
```java
    this.snapshotsById = indexAndValidateSnapshots(snapshots, lastSequenceNumber);
    this.schemasById = indexSchemas();
    this.specsById = indexSpecs(specs);
    this.sortOrdersById = indexSortOrders(sortOrders);
    this.refs = validateRefs(currentSnapshotId, refs, snapshotsById);
```

### DataFlowIssue
Argument `sortOrders` might be null
in `core/src/main/java/org/apache/iceberg/TableMetadata.java`
#### Snippet
```java
    this.schemasById = indexSchemas();
    this.specsById = indexSpecs(specs);
    this.sortOrdersById = indexSortOrders(sortOrders);
    this.refs = validateRefs(currentSnapshotId, refs, snapshotsById);
    this.statisticsFiles = ImmutableList.copyOf(statisticsFiles);
```

### DataFlowIssue
Unboxing of `pos` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/data/GenericRecord.java`
#### Snippet
```java
    Integer pos = nameToPos.get(name);
    Preconditions.checkArgument(pos != null, "Cannot set unknown field named: %s", name);
    values[pos] = value;
  }

```

### DataFlowIssue
Unboxing of `id` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaUtil.java`
#### Snippet
```java
    Integer id = getFieldId(field, null, null);
    Preconditions.checkNotNull(id, "Missing expected '%s' property", FIELD_ID_PROP);
    return id;
  }

```

### DataFlowIssue
Method invocation `levels` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/RESTUtil.java`
#### Snippet
```java
  public static String encodeNamespace(Namespace ns) {
    Preconditions.checkArgument(ns != null, "Invalid namespace: null");
    String[] levels = ns.levels();
    String[] encodedLevels = new String[levels.length];

```

### DataFlowIssue
Argument `encoded` might be null
in `core/src/main/java/org/apache/iceberg/rest/RESTUtil.java`
#### Snippet
```java
    Preconditions.checkArgument(encoded != null, "Invalid string to decode: null");
    try {
      return URLDecoder.decode(encoded, StandardCharsets.UTF_8.name());
    } catch (UnsupportedEncodingException e) {
      throw new UncheckedIOException(
```

### DataFlowIssue
Argument `toEncode` might be null
in `core/src/main/java/org/apache/iceberg/rest/RESTUtil.java`
#### Snippet
```java
    Preconditions.checkArgument(toEncode != null, "Invalid string to encode: null");
    try {
      return URLEncoder.encode(toEncode, StandardCharsets.UTF_8.name());
    } catch (UnsupportedEncodingException e) {
      throw new UncheckedIOException(
```

### DataFlowIssue
Method invocation `toUpperCase` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/requests/ReportMetricsRequest.java`
#### Snippet
```java
      Preconditions.checkArgument(null != reportType, "Invalid report type: null");
      try {
        return ReportType.valueOf(reportType.toUpperCase(Locale.ENGLISH));
      } catch (IllegalArgumentException e) {
        return UNKNOWN;
```

### DataFlowIssue
Method invocation `hasNonNull` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/requests/UpdateRequirementParser.java`
#### Snippet
```java
        jsonNode);
    Preconditions.checkArgument(
        jsonNode.hasNonNull(TYPE), "Cannot parse update requirement. Missing field: type");
    String type = JsonUtil.getString(TYPE, jsonNode).toLowerCase(Locale.ROOT);

```

### DataFlowIssue
Method invocation `has` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/responses/ErrorResponseParser.java`
#### Snippet
```java
        "Cannot parse error response from non-object value: %s",
        jsonNode);
    Preconditions.checkArgument(jsonNode.has(ERROR), "Cannot parse missing field: error");
    JsonNode error = JsonUtil.get(ERROR, jsonNode);
    String message = JsonUtil.getStringOrNull(MESSAGE, error);
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/requests/ReportMetricsRequestParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse metrics request from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse metrics request from non-object: %s", json);

    ReportType type = toReportType(JsonUtil.getString(REPORT_TYPE, json));
```

### DataFlowIssue
Method invocation `reportType` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/requests/ReportMetricsRequestParser.java`
#### Snippet
```java
    gen.writeStartObject();

    gen.writeStringField(REPORT_TYPE, fromReportType(request.reportType()));

    if (ReportType.SCAN_REPORT == request.reportType()) {
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/HTTPClient.java`
#### Snippet
```java
        throw new RESTException(
            "Invalid (null) response body for request (expected %s): method=%s, path=%s, status=%d",
            responseType.getSimpleName(), method.name(), path, response.getCode());
      }

```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/HTTPClient.java`
#### Snippet
```java
            "Received a success response code of %d, but failed to parse response body into %s",
            response.getCode(),
            responseType.getSimpleName());
      }
    } catch (IOException e) {
```

### DataFlowIssue
Argument `jsonNode` might be null
in `core/src/main/java/org/apache/iceberg/rest/responses/OAuthErrorResponseParser.java`
#### Snippet
```java
        "Cannot parse error response from non-object value: %s",
        jsonNode);
    String error = JsonUtil.getString(ERROR, jsonNode);
    String errorDescription = JsonUtil.getStringOrNull(ERROR_DESCRIPTION, jsonNode);
    return ErrorResponse.builder()
```

### DataFlowIssue
Dereference of `iterable` will produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/ParallelIterable.java`
#### Snippet
```java
                            try (Closeable ignored =
                                (iterable instanceof Closeable) ? (Closeable) iterable : () -> {}) {
                              for (T item : iterable) {
                                queue.add(item);
                              }
```

### DataFlowIssue
Method invocation `stopRefreshing` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/rest/RESTSessionCatalog.java`
#### Snippet
```java
        .expireAfterAccess(Duration.ofMillis(expirationIntervalMs))
        .removalListener(
            (RemovalListener<String, AuthSession>) (id, auth, cause) -> auth.stopRefreshing())
        .build();
  }
```

### DataFlowIssue
Argument `prefix` might be null
in `core/src/main/java/org/apache/iceberg/util/PropertyUtil.java`
#### Snippet
```java

    return properties.entrySet().stream()
        .filter(e -> e.getKey().startsWith(prefix))
        .collect(Collectors.toMap(e -> e.getKey().replaceFirst(prefix, ""), Map.Entry::getValue));
  }
```

### DataFlowIssue
Method invocation `test` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/PropertyUtil.java`
#### Snippet
```java

    return properties.entrySet().stream()
        .filter(e -> keyPredicate.test(e.getKey()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }
```

### DataFlowIssue
Unboxing of `snapshotId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/SnapshotUtil.java`
#### Snippet
```java
        "Cannot find a snapshot older than %s",
        DateTimeUtil.formatTimestampMillis(timestampMillis));
    return snapshotId;
  }

```

### DataFlowIssue
Method invocation `schemaId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/SnapshotUtil.java`
#### Snippet
```java
    Snapshot snapshot = table.snapshot(snapshotId);
    Preconditions.checkArgument(snapshot != null, "Cannot find snapshot with ID %s", snapshotId);
    Integer schemaId = snapshot.schemaId();

    // schemaId could be null, if snapshot was created before Iceberg added schema id to snapshot
```

### DataFlowIssue
Method invocation `parentId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/SnapshotUtil.java`
#### Snippet
```java

    ValidationException.check(
        Objects.equals(lastSnapshot.parentId(), baseSnapshotId),
        "Cannot determine history between read snapshot %s and the last known ancestor %s",
        baseSnapshotId,
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewHistoryEntryParser.java`
#### Snippet
```java
    Preconditions.checkArgument(node != null, "Cannot parse view history entry from null object");
    Preconditions.checkArgument(
        node.isObject(), "Cannot parse view history entry from non-object: %s", node);
    return ImmutableViewHistoryEntry.builder()
        .versionId(JsonUtil.getInt(VERSION_ID, node))
```

### DataFlowIssue
Method invocation `timestampMillis` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewHistoryEntryParser.java`
#### Snippet
```java
    Preconditions.checkArgument(entry != null, "Invalid view history entry: null");
    generator.writeStartObject();
    generator.writeNumberField(TIMESTAMP_MS, entry.timestampMillis());
    generator.writeNumberField(VERSION_ID, entry.versionId());
    generator.writeEndObject();
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewRepresentationParser.java`
#### Snippet
```java
      throws IOException {
    Preconditions.checkArgument(representation != null, "Invalid view representation: null");
    switch (representation.type().toLowerCase(Locale.ENGLISH)) {
      case ViewRepresentation.Type.SQL:
        SQLViewRepresentationParser.toJson((SQLViewRepresentation) representation, generator);
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewRepresentationParser.java`
#### Snippet
```java
    Preconditions.checkArgument(node != null, "Cannot parse view representation from null object");
    Preconditions.checkArgument(
        node.isObject(), "Cannot parse view representation from non-object: %s", node);
    String type = JsonUtil.getString(TYPE, node).toLowerCase(Locale.ENGLISH);
    switch (type) {
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/SQLViewRepresentationParser.java`
#### Snippet
```java
    Preconditions.checkArgument(view != null, "Invalid SQL view representation: null");
    generator.writeStartObject();
    generator.writeStringField(ViewRepresentationParser.TYPE, view.type());
    generator.writeStringField(SQL, view.sql());
    generator.writeStringField(DIALECT, view.dialect());
```

### DataFlowIssue
Method invocation `levels` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/SQLViewRepresentationParser.java`
#### Snippet
```java
    if (view.defaultNamespace() != null) {
      JsonUtil.writeStringArray(
          DEFAULT_NAMESPACE, Arrays.asList(view.defaultNamespace().levels()), generator);
    }

```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/SQLViewRepresentationParser.java`
#### Snippet
```java
        node != null, "Cannot parse SQL view representation from null object");
    Preconditions.checkArgument(
        node.isObject(), "Cannot parse SQL view representation from non-object: %s", node);
    ImmutableSQLViewRepresentation.Builder builder =
        ImmutableSQLViewRepresentation.builder()
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewVersionParser.java`
#### Snippet
```java
    Preconditions.checkArgument(node != null, "Cannot parse view version from null object");
    Preconditions.checkArgument(
        node.isObject(), "Cannot parse view version from a non-object: %s", node);

    int versionId = JsonUtil.getInt(VERSION_ID, node);
```

### DataFlowIssue
Method invocation `versionId` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/view/ViewVersionParser.java`
#### Snippet
```java
    generator.writeStartObject();

    generator.writeNumberField(VERSION_ID, version.versionId());
    generator.writeNumberField(TIMESTAMP_MS, version.timestampMillis());
    generator.writeNumberField(SCHEMA_ID, version.schemaId());
```

### DataFlowIssue
Method invocation `asLong` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java
        property,
        pNode);
    return pNode.asLong();
  }

```

### DataFlowIssue
Method invocation `fieldNames` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java

    ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
    Iterator<String> fields = pNode.fieldNames();
    while (fields.hasNext()) {
      String field = fields.next();
```

### DataFlowIssue
Method invocation `elements` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java
          property,
          pNode);
      this.elements = pNode.elements();
    }

```

### DataFlowIssue
Method invocation `asText` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java
        property,
        pNode);
    return pNode.asText();
  }

```

### DataFlowIssue
Method invocation `asBoolean` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java
        property,
        pNode);
    return pNode.asBoolean();
  }

```

### DataFlowIssue
Method invocation `asInt` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/util/JsonUtil.java`
#### Snippet
```java
        property,
        pNode);
    return pNode.asInt();
  }

```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/catalog/TableIdentifierParser.java`
#### Snippet
```java
        json != null, "Cannot parse table identifier from invalid JSON: null");
    Preconditions.checkArgument(
        !json.isEmpty(), "Cannot parse table identifier from invalid JSON: ''");
    return JsonUtil.parse(json, TableIdentifierParser::fromJson);
  }
```

### DataFlowIssue
Argument `node` might be null
in `core/src/main/java/org/apache/iceberg/catalog/TableIdentifierParser.java`
#### Snippet
```java
        "Cannot parse missing or non-object table identifier: %s",
        node);
    List<String> levels = JsonUtil.getStringListOrNull(NAMESPACE, node);
    String tableName = JsonUtil.getString(NAME, node);
    Namespace namespace =
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/actions/BaseRewriteDataFilesAction.java`
#### Snippet
```java

    Map<StructLikeWrapper, Collection<FileScanTask>> groupedTasks =
        groupTasksByPartition(fileScanTasks.iterator());
    Map<StructLikeWrapper, Collection<FileScanTask>> filteredGroupedTasks =
        groupedTasks.entrySet().stream()
```

### DataFlowIssue
Argument `node` might be null
in `core/src/main/java/org/apache/iceberg/mapping/NameMappingParser.java`
#### Snippet
```java
        node);

    Integer id = JsonUtil.getIntOrNull(FIELD_ID, node);

    Set<String> names;
```

### DataFlowIssue
Method invocation `isNoop` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/TimerResult.java`
#### Snippet
```java
  static TimerResult fromTimer(Timer timer) {
    Preconditions.checkArgument(null != timer, "Invalid timer: null");
    if (timer.isNoop()) {
      return null;
    }
```

### DataFlowIssue
Method invocation `tableName` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/ScanReportParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != scanReport, "Invalid scan report: null");

    gen.writeStringField(TABLE_NAME, scanReport.tableName());
    gen.writeNumberField(SNAPSHOT_ID, scanReport.snapshotId());

```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/ScanReportParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse scan report from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse scan report from non-object: %s", json);

    String tableName = JsonUtil.getString(TABLE_NAME, json);
```

### DataFlowIssue
Argument `scanReport` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanReportParser.java`
#### Snippet
```java

    gen.writeStartObject();
    toJsonWithoutStartEnd(scanReport, gen);
    gen.writeEndObject();
  }
```

### DataFlowIssue
Method invocation `attempts` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResult.java`
#### Snippet
```java
    Preconditions.checkArgument(null != snapshotSummary, "Invalid snapshot summary: null");
    return ImmutableCommitMetricsResult.builder()
        .attempts(CounterResult.fromCounter(commitMetrics.attempts()))
        .totalDuration(TimerResult.fromTimer(commitMetrics.totalDuration()))
        .addedDataFiles(counterFrom(snapshotSummary, SnapshotSummary.ADDED_FILES_PROP))
```

### DataFlowIssue
Argument `snapshotSummary` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResult.java`
#### Snippet
```java
        .totalRecords(counterFrom(snapshotSummary, SnapshotSummary.TOTAL_RECORDS_PROP))
        .addedFilesSizeInBytes(
            counterFrom(snapshotSummary, SnapshotSummary.ADDED_FILE_SIZE_PROP, Unit.BYTES))
        .removedFilesSizeInBytes(
            counterFrom(snapshotSummary, SnapshotSummary.REMOVED_FILE_SIZE_PROP, Unit.BYTES))
```

### DataFlowIssue
Method invocation `unit` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CounterResultParser.java`
#### Snippet
```java

    gen.writeStartObject();
    gen.writeStringField(UNIT, counter.unit().displayName());
    gen.writeNumberField(VALUE, counter.value());
    gen.writeEndObject();
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CounterResultParser.java`
#### Snippet
```java
  static CounterResult fromJson(JsonNode json) {
    Preconditions.checkArgument(null != json, "Cannot parse counter from null object");
    Preconditions.checkArgument(json.isObject(), "Cannot parse counter from non-object: %s", json);

    String unit = JsonUtil.getString(UNIT, json);
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CounterResultParser.java`
#### Snippet
```java
  static CounterResult fromJson(String counterName, JsonNode json) {
    Preconditions.checkArgument(null != json, "Cannot parse counter from null object");
    Preconditions.checkArgument(json.isObject(), "Cannot parse counter from non-object: %s", json);

    if (!json.has(counterName)) {
```

### DataFlowIssue
Method invocation `isNoop` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CounterResult.java`
#### Snippet
```java
  static CounterResult fromCounter(Counter counter) {
    Preconditions.checkArgument(null != counter, "Invalid counter: null");
    if (counter.isNoop()) {
      return null;
    }
```

### DataFlowIssue
Method invocation `totalPlanningDuration` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResult.java`
#### Snippet
```java
    Preconditions.checkArgument(null != scanMetrics, "Invalid scan metrics: null");
    return ImmutableScanMetricsResult.builder()
        .totalPlanningDuration(TimerResult.fromTimer(scanMetrics.totalPlanningDuration()))
        .resultDataFiles(CounterResult.fromCounter(scanMetrics.resultDataFiles()))
        .resultDeleteFiles(CounterResult.fromCounter(scanMetrics.resultDeleteFiles()))
```

### DataFlowIssue
Method invocation `count` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/TimerResultParser.java`
#### Snippet
```java

    gen.writeStartObject();
    gen.writeNumberField(COUNT, timer.count());
    gen.writeStringField(TIME_UNIT, timer.timeUnit().name().toLowerCase(Locale.ENGLISH));
    gen.writeNumberField(TOTAL_DURATION, fromDuration(timer.totalDuration(), timer.timeUnit()));
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/TimerResultParser.java`
#### Snippet
```java
  static TimerResult fromJson(String timerName, JsonNode json) {
    Preconditions.checkArgument(null != json, "Cannot parse timer from null object");
    Preconditions.checkArgument(json.isObject(), "Cannot parse timer from non-object: %s", json);

    if (!json.has(timerName)) {
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/TimerResultParser.java`
#### Snippet
```java
  static TimerResult fromJson(JsonNode json) {
    Preconditions.checkArgument(null != json, "Cannot parse timer from null object");
    Preconditions.checkArgument(json.isObject(), "Cannot parse timer from non-object: %s", json);

    long count = JsonUtil.getLong(COUNT, json);
```

### DataFlowIssue
Method invocation `tableName` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CommitReportParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != commitReport, "Invalid commit report: null");

    gen.writeStringField(TABLE_NAME, commitReport.tableName());
    gen.writeNumberField(SNAPSHOT_ID, commitReport.snapshotId());
    gen.writeNumberField(SEQUENCE_NUMBER, commitReport.sequenceNumber());
```

### DataFlowIssue
Argument `commitReport` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitReportParser.java`
#### Snippet
```java

    gen.writeStartObject();
    toJsonWithoutStartEnd(commitReport, gen);
    gen.writeEndObject();
  }
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CommitReportParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse commit report from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse commit report from non-object: %s", json);

    ImmutableCommitReport.Builder builder =
```

### DataFlowIssue
Method invocation `totalPlanningDuration` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    gen.writeStartObject();

    if (null != metrics.totalPlanningDuration()) {
      gen.writeFieldName(ScanMetrics.TOTAL_PLANNING_DURATION);
      TimerResultParser.toJson(metrics.totalPlanningDuration(), gen);
```

### DataFlowIssue
Argument `metrics.totalPlanningDuration()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalPlanningDuration()) {
      gen.writeFieldName(ScanMetrics.TOTAL_PLANNING_DURATION);
      TimerResultParser.toJson(metrics.totalPlanningDuration(), gen);
    }

```

### DataFlowIssue
Argument `metrics.resultDataFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.resultDataFiles()) {
      gen.writeFieldName(ScanMetrics.RESULT_DATA_FILES);
      CounterResultParser.toJson(metrics.resultDataFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.resultDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.resultDeleteFiles()) {
      gen.writeFieldName(ScanMetrics.RESULT_DELETE_FILES);
      CounterResultParser.toJson(metrics.resultDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalDataManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDataManifests()) {
      gen.writeFieldName(ScanMetrics.TOTAL_DATA_MANIFESTS);
      CounterResultParser.toJson(metrics.totalDataManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalDeleteManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDeleteManifests()) {
      gen.writeFieldName(ScanMetrics.TOTAL_DELETE_MANIFESTS);
      CounterResultParser.toJson(metrics.totalDeleteManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.scannedDataManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.scannedDataManifests()) {
      gen.writeFieldName(ScanMetrics.SCANNED_DATA_MANIFESTS);
      CounterResultParser.toJson(metrics.scannedDataManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.skippedDataManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.skippedDataManifests()) {
      gen.writeFieldName(ScanMetrics.SKIPPED_DATA_MANIFESTS);
      CounterResultParser.toJson(metrics.skippedDataManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalFileSizeInBytes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalFileSizeInBytes()) {
      gen.writeFieldName(ScanMetrics.TOTAL_FILE_SIZE_IN_BYTES);
      CounterResultParser.toJson(metrics.totalFileSizeInBytes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalDeleteFileSizeInBytes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDeleteFileSizeInBytes()) {
      gen.writeFieldName(ScanMetrics.TOTAL_DELETE_FILE_SIZE_IN_BYTES);
      CounterResultParser.toJson(metrics.totalDeleteFileSizeInBytes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.skippedDataFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.skippedDataFiles()) {
      gen.writeFieldName(ScanMetrics.SKIPPED_DATA_FILES);
      CounterResultParser.toJson(metrics.skippedDataFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.skippedDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.skippedDeleteFiles()) {
      gen.writeFieldName(ScanMetrics.SKIPPED_DELETE_FILES);
      CounterResultParser.toJson(metrics.skippedDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.scannedDeleteManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.scannedDeleteManifests()) {
      gen.writeFieldName(ScanMetrics.SCANNED_DELETE_MANIFESTS);
      CounterResultParser.toJson(metrics.scannedDeleteManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.skippedDeleteManifests()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.skippedDeleteManifests()) {
      gen.writeFieldName(ScanMetrics.SKIPPED_DELETE_MANIFESTS);
      CounterResultParser.toJson(metrics.skippedDeleteManifests(), gen);
    }

```

### DataFlowIssue
Argument `metrics.indexedDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.indexedDeleteFiles()) {
      gen.writeFieldName(ScanMetrics.INDEXED_DELETE_FILES);
      CounterResultParser.toJson(metrics.indexedDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.equalityDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.equalityDeleteFiles()) {
      gen.writeFieldName(ScanMetrics.EQUALITY_DELETE_FILES);
      CounterResultParser.toJson(metrics.equalityDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.positionalDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.positionalDeleteFiles()) {
      gen.writeFieldName(ScanMetrics.POSITIONAL_DELETE_FILES);
      CounterResultParser.toJson(metrics.positionalDeleteFiles(), gen);
    }

```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/ScanMetricsResultParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse scan metrics from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse scan metrics from non-object: %s", json);

    return ImmutableScanMetricsResult.builder()
```

### DataFlowIssue
Method invocation `isObject` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse commit metrics from null object");
    Preconditions.checkArgument(
        json.isObject(), "Cannot parse commit metrics from non-object: %s", json);

    return ImmutableCommitMetricsResult.builder()
```

### DataFlowIssue
Method invocation `totalDuration` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    gen.writeStartObject();

    if (null != metrics.totalDuration()) {
      gen.writeFieldName(CommitMetrics.TOTAL_DURATION);
      TimerResultParser.toJson(metrics.totalDuration(), gen);
```

### DataFlowIssue
Argument `metrics.totalDuration()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDuration()) {
      gen.writeFieldName(CommitMetrics.TOTAL_DURATION);
      TimerResultParser.toJson(metrics.totalDuration(), gen);
    }

```

### DataFlowIssue
Argument `metrics.attempts()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.attempts()) {
      gen.writeFieldName(CommitMetrics.ATTEMPTS);
      CounterResultParser.toJson(metrics.attempts(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedDataFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedDataFiles()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_DATA_FILES);
      CounterResultParser.toJson(metrics.addedDataFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedDataFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedDataFiles()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_DATA_FILES);
      CounterResultParser.toJson(metrics.removedDataFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalDataFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDataFiles()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_DATA_FILES);
      CounterResultParser.toJson(metrics.totalDataFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_DELETE_FILES);
      CounterResultParser.toJson(metrics.addedDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedEqualityDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedEqualityDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_EQ_DELETE_FILES);
      CounterResultParser.toJson(metrics.addedEqualityDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedPositionalDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedPositionalDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_POS_DELETE_FILES);
      CounterResultParser.toJson(metrics.addedPositionalDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_DELETE_FILES);
      CounterResultParser.toJson(metrics.removedDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedPositionalDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedPositionalDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_POS_DELETE_FILES);
      CounterResultParser.toJson(metrics.removedPositionalDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedEqualityDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedEqualityDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_EQ_DELETE_FILES);
      CounterResultParser.toJson(metrics.removedEqualityDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalDeleteFiles()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalDeleteFiles()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_DELETE_FILES);
      CounterResultParser.toJson(metrics.totalDeleteFiles(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedRecords()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedRecords()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_RECORDS);
      CounterResultParser.toJson(metrics.addedRecords(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedRecords()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedRecords()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_RECORDS);
      CounterResultParser.toJson(metrics.removedRecords(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalRecords()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalRecords()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_RECORDS);
      CounterResultParser.toJson(metrics.totalRecords(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedFilesSizeInBytes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedFilesSizeInBytes()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_FILE_SIZE_BYTES);
      CounterResultParser.toJson(metrics.addedFilesSizeInBytes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedFilesSizeInBytes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedFilesSizeInBytes()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_FILE_SIZE_BYTES);
      CounterResultParser.toJson(metrics.removedFilesSizeInBytes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalFilesSizeInBytes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalFilesSizeInBytes()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_FILE_SIZE_BYTES);
      CounterResultParser.toJson(metrics.totalFilesSizeInBytes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedPositionalDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedPositionalDeletes()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_POS_DELETES);
      CounterResultParser.toJson(metrics.addedPositionalDeletes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedPositionalDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedPositionalDeletes()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_POS_DELETES);
      CounterResultParser.toJson(metrics.removedPositionalDeletes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalPositionalDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalPositionalDeletes()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_POS_DELETES);
      CounterResultParser.toJson(metrics.totalPositionalDeletes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.addedEqualityDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.addedEqualityDeletes()) {
      gen.writeFieldName(CommitMetricsResult.ADDED_EQ_DELETES);
      CounterResultParser.toJson(metrics.addedEqualityDeletes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.removedEqualityDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.removedEqualityDeletes()) {
      gen.writeFieldName(CommitMetricsResult.REMOVED_EQ_DELETES);
      CounterResultParser.toJson(metrics.removedEqualityDeletes(), gen);
    }

```

### DataFlowIssue
Argument `metrics.totalEqualityDeletes()` might be null
in `core/src/main/java/org/apache/iceberg/metrics/CommitMetricsResultParser.java`
#### Snippet
```java
    if (null != metrics.totalEqualityDeletes()) {
      gen.writeFieldName(CommitMetricsResult.TOTAL_EQ_DELETES);
      CounterResultParser.toJson(metrics.totalEqualityDeletes(), gen);
    }

```

### DataFlowIssue
Dereference of `keyBytes` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/encryption/Ciphers.java`
#### Snippet
```java
    public AesGcmDecryptor(byte[] keyBytes) {
      Preconditions.checkArgument(keyBytes != null, "Key can't be null");
      int keyLength = keyBytes.length;
      Preconditions.checkArgument(
          (keyLength == 16 || keyLength == 24 || keyLength == 32),
```

### DataFlowIssue
Dereference of `keyBytes` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/encryption/Ciphers.java`
#### Snippet
```java
    public AesGcmEncryptor(byte[] keyBytes) {
      Preconditions.checkArgument(keyBytes != null, "Key can't be null");
      int keyLength = keyBytes.length;
      Preconditions.checkArgument(
          (keyLength == 16 || keyLength == 24 || keyLength == 32),
```

### DataFlowIssue
Method invocation `isBoolean` may produce `NullPointerException`
in `core/src/main/java/org/apache/iceberg/expressions/ExpressionParser.java`
#### Snippet
```java
    Preconditions.checkArgument(null != json, "Cannot parse expression from null object");
    // check for constant expressions
    if (json.isBoolean()) {
      if (json.asBoolean()) {
        return Expressions.alwaysTrue();
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
      case FIXED_LEN_BYTE_ARRAY:
        int len;
        if (icebergField.type() instanceof Types.UUIDType) {
          len = 16;
          this.readType = ReadType.UUID;
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
        Field intField =
            new Field(
                icebergField.name(),
                new FieldType(
                    icebergField.isOptional(), new ArrowType.Int(Integer.SIZE, true), null, null),
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
        Field floatField =
            new Field(
                icebergField.name(),
                new FieldType(
                    icebergField.isOptional(),
```

### DataFlowIssue
Argument `columnDescriptor` might be null
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
      allocateDictEncodedVector();
    } else {
      Field arrowField = ArrowSchemaUtil.convert(getPhysicalType(columnDescriptor, icebergField));
      if (columnDescriptor.getPrimitiveType().getOriginalType() != null) {
        allocateVectorBasedOnOriginalType(columnDescriptor.getPrimitiveType(), arrowField);
```

### DataFlowIssue
Method invocation `producesDictionaryEncodedVector` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
  @Override
  public VectorHolder read(VectorHolder reuse, int numValsToRead) {
    boolean dictEncoded = vectorizedColumnIterator.producesDictionaryEncodedVector();
    if (reuse == null
        || (!dictEncoded && readType == ReadType.DICTIONARY)
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
    Field field =
        new Field(
            icebergField.name(),
            new FieldType(
                icebergField.isOptional(), new ArrowType.Int(Integer.SIZE, true), null, null),
```

### DataFlowIssue
Method invocation `setBatchSize` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
  public void setBatchSize(int batchSize) {
    this.batchSize = (batchSize == 0) ? DEFAULT_BATCH_SIZE : batchSize;
    this.vectorizedColumnIterator.setBatchSize(batchSize);
  }

```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
  public void setRowGroupInfo(
      PageReadStore source, Map<ColumnPath, ColumnChunkMetaData> metadata, long rowPosition) {
    ColumnChunkMetaData chunkMetaData = metadata.get(ColumnPath.get(columnDescriptor.getPath()));
    this.dictionary =
        vectorizedColumnIterator.setRowGroupInfo(
```

### DataFlowIssue
Method invocation `setRowGroupInfo` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
    ColumnChunkMetaData chunkMetaData = metadata.get(ColumnPath.get(columnDescriptor.getPath()));
    this.dictionary =
        vectorizedColumnIterator.setRowGroupInfo(
            source.getPageReader(columnDescriptor),
            !ParquetUtil.hasNonDictionaryPages(chunkMetaData));
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
  @Override
  public String toString() {
    return columnDescriptor.toString();
  }

```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedArrowReader.java`
#### Snippet
```java
      case TIMESTAMP_MICROS:
        this.vec = arrowField.createVector(rootAlloc);
        if (((Types.TimestampType) icebergField.type()).shouldAdjustToUTC()) {
          ((TimeStampMicroTZVector) vec).allocateNew(batchSize);
        } else {
```

### DataFlowIssue
Method invocation `isDictionaryEncoded` may produce `NullPointerException`
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    Preconditions.checkArgument(null != accessor, "Invalid arrow vector accessor: null");

    if (vectorHolder.isDictionaryEncoded()) {
      if (Type.TypeID.DECIMAL.equals(vectorHolder.icebergType().typeId())) {
        return toDecimalVector(vectorHolder, accessor);
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
        case BSON:
          return new DictionaryStringAccessor<>(
              (IntVector) vector, dictionary, stringFactorySupplier.get());
        case INT_64:
        case TIME_MICROS:
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
        case TIMESTAMP_MILLIS:
        case TIMESTAMP_MICROS:
          return new DictionaryLongAccessor<>((IntVector) vector, dictionary);
        case DECIMAL:
          switch (primitive.getPrimitiveTypeName()) {
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
            case FIXED_LEN_BYTE_ARRAY:
              return new DictionaryDecimalBinaryAccessor<>(
                  (IntVector) vector, dictionary, decimalFactorySupplier.get());
            case INT64:
              return new DictionaryDecimalLongAccessor<>(
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
            case INT64:
              return new DictionaryDecimalLongAccessor<>(
                  (IntVector) vector, dictionary, decimalFactorySupplier.get());
            case INT32:
              return new DictionaryDecimalIntAccessor<>(
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
            case INT32:
              return new DictionaryDecimalIntAccessor<>(
                  (IntVector) vector, dictionary, decimalFactorySupplier.get());
            default:
              throw new UnsupportedOperationException(
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
        case FIXED_LEN_BYTE_ARRAY:
        case BINARY:
          return new DictionaryBinaryAccessor<>((IntVector) vector, dictionary);
        case FLOAT:
          return new DictionaryFloatAccessor<>((IntVector) vector, dictionary);
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
          return new DictionaryBinaryAccessor<>((IntVector) vector, dictionary);
        case FLOAT:
          return new DictionaryFloatAccessor<>((IntVector) vector, dictionary);
        case INT64:
          return new DictionaryLongAccessor<>((IntVector) vector, dictionary);
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
          return new DictionaryFloatAccessor<>((IntVector) vector, dictionary);
        case INT64:
          return new DictionaryLongAccessor<>((IntVector) vector, dictionary);
        case INT96:
          // Impala & Spark used to write timestamps as INT96 by default. For backwards
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
          // compatibility we try to read INT96 as timestamps. But INT96 is not recommended
          // and deprecated (see https://issues.apache.org/jira/browse/PARQUET-323)
          return new DictionaryTimestampInt96Accessor<>((IntVector) vector, dictionary);
        case DOUBLE:
          return new DictionaryDoubleAccessor<>((IntVector) vector, dictionary);
```

### DataFlowIssue
Casting `vector` to `IntVector` may produce `ClassCastException`
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
          return new DictionaryTimestampInt96Accessor<>((IntVector) vector, dictionary);
        case DOUBLE:
          return new DictionaryDoubleAccessor<>((IntVector) vector, dictionary);
        default:
          throw new UnsupportedOperationException("Unsupported type: " + primitive);
```

### DataFlowIssue
Argument `primitive` might be null
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/GenericArrowVectorAccessorFactory.java`
#### Snippet
```java
    PrimitiveType primitive = desc == null ? null : desc.getPrimitiveType();
    if (isVectorDictEncoded) {
      return getDictionaryVectorAccessor(dictionary, desc, vector, primitive);
    } else {
      return getPlainVectorAccessor(vector, primitive);
```

### DataFlowIssue
Casting `schemaType` to `RowType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java
        schemaType instanceof RowType, "Schema logical type should be RowType.");

    RowType root = (RowType) schemaType;
    Type converted = root.accept(new FlinkTypeToType(root));

```

### DataFlowIssue
Method invocation `accept` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkSchemaUtil.java`
#### Snippet
```java

    RowType root = (RowType) schemaType;
    Type converted = root.accept(new FlinkTypeToType(root));

    Schema iSchema = new Schema(converted.asStructType().fields());
```

### DataFlowIssue
Casting `flinkType` to `RowType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkSchemaVisitor.java`
#### Snippet
```java
      LogicalType flinkType, Types.StructType struct, FlinkSchemaVisitor<T> visitor) {
    Preconditions.checkArgument(flinkType instanceof RowType, "%s is not a RowType.", flinkType);
    RowType rowType = (RowType) flinkType;

    int fieldSize = struct.fields().size();
```

### DataFlowIssue
Method invocation `getFieldIndex` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkSchemaVisitor.java`
#### Snippet
```java
    for (int i = 0; i < fieldSize; i++) {
      Types.NestedField iField = nestedFields.get(i);
      int fieldIndex = rowType.getFieldIndex(iField.name());
      Preconditions.checkArgument(
          fieldIndex >= 0, "NestedField: %s is not found in flink RowType: %s", iField, rowType);
```

### DataFlowIssue
Casting `sType` to `RowType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
      Preconditions.checkArgument(
          sType instanceof RowType, "Invalid struct: %s is not a struct", sType);
      RowType struct = (RowType) sType;
      return visitor.message(
          struct, (MessageType) type, visitFields(struct, type.asGroupType(), visitor));
```

### DataFlowIssue
Argument `struct` might be null
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
      RowType struct = (RowType) sType;
      return visitor.message(
          struct, (MessageType) type, visitFields(struct, type.asGroupType(), visitor));
    } else if (type.isPrimitive()) {
      return visitor.primitive(sType, type.asPrimitiveType());
```

### DataFlowIssue
Casting `sType` to `ArrayType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
            Preconditions.checkArgument(
                sType instanceof ArrayType, "Invalid list: %s is not an array", sType);
            ArrayType array = (ArrayType) sType;
            RowType.RowField element =
                new RowField(
```

### DataFlowIssue
Method invocation `getElementType` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
            RowType.RowField element =
                new RowField(
                    "element", array.getElementType(), "element of " + array.asSummaryString());

            visitor.fieldNames.push(repeatedElement.getName());
```

### DataFlowIssue
Casting `sType` to `MapType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
            Preconditions.checkArgument(
                sType instanceof MapType, "Invalid map: %s is not a map", sType);
            MapType map = (MapType) sType;
            RowField keyField =
                new RowField("key", map.getKeyType(), "key of " + map.asSummaryString());
```

### DataFlowIssue
Method invocation `getKeyType` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
            MapType map = (MapType) sType;
            RowField keyField =
                new RowField("key", map.getKeyType(), "key of " + map.asSummaryString());
            RowField valueField =
                new RowField("value", map.getValueType(), "value of " + map.asSummaryString());
```

### DataFlowIssue
Casting `sType` to `RowType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
      Preconditions.checkArgument(
          sType instanceof RowType, "Invalid struct: %s is not a struct", sType);
      RowType struct = (RowType) sType;
      return visitor.struct(struct, group, visitFields(struct, group, visitor));
    }
```

### DataFlowIssue
Argument `struct` might be null
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
          sType instanceof RowType, "Invalid struct: %s is not a struct", sType);
      RowType struct = (RowType) sType;
      return visitor.struct(struct, group, visitFields(struct, group, visitor));
    }
  }
```

### DataFlowIssue
Casting `structType` to `RowType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/AvroWithFlinkSchemaVisitor.java`
#### Snippet
```java
    Preconditions.checkArgument(
        structType instanceof RowType, "Invalid struct: %s is not a struct", structType);
    RowType.RowField field = ((RowType) structType).getFields().get(pos);
    return Pair.of(field.getName(), field.getType());
  }
```

### DataFlowIssue
Casting `arrayType` to `ArrayType` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/AvroWithFlinkSchemaVisitor.java`
#### Snippet
```java
    Preconditions.checkArgument(
        arrayType instanceof ArrayType, "Invalid array: %s is not an array", arrayType);
    return ((ArrayType) arrayType).getElementType();
  }

```

### DataFlowIssue
Unboxing of `fieldIds.peek()` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkOrcWriter.java`
#### Snippet
```java
                      + "information is not properly pushed during schema visiting.",
                  iPrimitive));
          return GenericOrcWriters.floats(fieldIds.peek());
        case DOUBLE:
          Preconditions.checkArgument(
```

### DataFlowIssue
Unboxing of `fieldIds.peek()` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkOrcWriter.java`
#### Snippet
```java
                      + "information is not properly pushed during schema visiting.",
                  iPrimitive));
          return GenericOrcWriters.doubles(fieldIds.peek());
        case DATE:
          return FlinkOrcWriters.dates();
```

### DataFlowIssue
Casting `event` to `DataStatisticsEvent` may produce `ClassCastException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/shuffle/DataStatisticsOperator.java`
#### Snippet
```java
        event instanceof DataStatisticsEvent,
        "Received unexpected operator event " + event.getClass());
    DataStatisticsEvent<D, S> statisticsEvent = (DataStatisticsEvent<D, S>) event;
    globalStatistics = statisticsEvent.dataStatistics();
    output.collect(new StreamRecord<>(DataStatisticsOrRecord.fromDataStatistics(globalStatistics)));
```

### DataFlowIssue
Argument `table` might be null
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkSink.java`
#### Snippet
```java
            flinkWriteConf.targetDataFileSize(),
            format,
            writeProperties(table, format, flinkWriteConf),
            equalityFieldIds,
            flinkWriteConf.upsertMode());
```

### DataFlowIssue
Array access `records[position]` may produce `NullPointerException`
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/reader/ArrayBatchRecords.java`
#### Snippet
```java
  public RecordAndPosition<T> nextRecordFromSplit() {
    if (position < numberOfRecords) {
      recordAndPosition.record(records[position]);
      position++;
      return recordAndPosition;
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCachedTableCatalog.java`
#### Snippet
```java
      Preconditions.checkArgument(
          branchSnapshot != null, "Cannot find snapshot associated with branch name: %s", branch);
      return Pair.of(table, branchSnapshot.snapshotId());
    } else if (tag != null) {
      Snapshot tagSnapshot = table.snapshot(tag);
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCachedTableCatalog.java`
#### Snippet
```java
      Preconditions.checkArgument(
          tagSnapshot != null, "Cannot find snapshot associated with tag name: %s", tag);
      return Pair.of(table, tagSnapshot.snapshotId());
    } else {
      return Pair.of(table, null);
```

### DataFlowIssue
Method invocation `snapshotId` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCatalog.java`
#### Snippet
```java
      Preconditions.checkArgument(
          tagSnapshot != null, "Cannot find snapshot associated with tag name: %s", tag);
      return new SparkTable(table, tagSnapshot.snapshotId(), !cacheEnabled);

    } else {
```

### DataFlowIssue
Casting `sType` to `StructType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
      Preconditions.checkArgument(
          sType instanceof StructType, "Invalid struct: %s is not a struct", sType);
      StructType struct = (StructType) sType;
      return visitor.message(
          struct, (MessageType) type, visitFields(struct, type.asGroupType(), visitor));
```

### DataFlowIssue
Argument `struct` might be null
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
      StructType struct = (StructType) sType;
      return visitor.message(
          struct, (MessageType) type, visitFields(struct, type.asGroupType(), visitor));

    } else if (type.isPrimitive()) {
```

### DataFlowIssue
Casting `sType` to `ArrayType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
            Preconditions.checkArgument(
                sType instanceof ArrayType, "Invalid list: %s is not an array", sType);
            ArrayType array = (ArrayType) sType;
            StructField element =
                new StructField(
```

### DataFlowIssue
Method invocation `elementType` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
            StructField element =
                new StructField(
                    "element", array.elementType(), array.containsNull(), Metadata.empty());

            visitor.fieldNames.push(repeatedElement.getName());
```

### DataFlowIssue
Casting `sType` to `MapType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
            Preconditions.checkArgument(
                sType instanceof MapType, "Invalid map: %s is not a map", sType);
            MapType map = (MapType) sType;
            StructField keyField = new StructField("key", map.keyType(), false, Metadata.empty());
            StructField valueField =
```

### DataFlowIssue
Method invocation `keyType` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
                sType instanceof MapType, "Invalid map: %s is not a map", sType);
            MapType map = (MapType) sType;
            StructField keyField = new StructField("key", map.keyType(), false, Metadata.empty());
            StructField valueField =
                new StructField(
```

### DataFlowIssue
Casting `sType` to `StructType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
      Preconditions.checkArgument(
          sType instanceof StructType, "Invalid struct: %s is not a struct", sType);
      StructType struct = (StructType) sType;
      return visitor.struct(struct, group, visitFields(struct, group, visitor));
    }
```

### DataFlowIssue
Argument `struct` might be null
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/ParquetWithSparkSchemaVisitor.java`
#### Snippet
```java
          sType instanceof StructType, "Invalid struct: %s is not a struct", sType);
      StructType struct = (StructType) sType;
      return visitor.struct(struct, group, visitFields(struct, group, visitor));
    }
  }
```

### DataFlowIssue
Casting `structType` to `StructType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/AvroWithSparkSchemaVisitor.java`
#### Snippet
```java
    Preconditions.checkArgument(
        structType instanceof StructType, "Invalid struct: %s is not a struct", structType);
    StructField field = ((StructType) structType).apply(pos);
    return Pair.of(field.name(), field.dataType());
  }
```

### DataFlowIssue
Casting `arrayType` to `ArrayType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/AvroWithSparkSchemaVisitor.java`
#### Snippet
```java
    Preconditions.checkArgument(
        arrayType instanceof ArrayType, "Invalid array: %s is not an array", arrayType);
    return ((ArrayType) arrayType).elementType();
  }

```

### DataFlowIssue
Casting `catalogPlugin` to `HasIcebergCatalog` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/Spark3Util.java`
#### Snippet
```java
                + "Actual Class: %s",
            catalogName, catalogPlugin.getClass().getName()));
    return ((HasIcebergCatalog) catalogPlugin).icebergCatalog();
  }

```

### DataFlowIssue
Casting `table` to `SparkTable` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/Spark3Util.java`
#### Snippet
```java
    Preconditions.checkArgument(
        table instanceof SparkTable, "Table %s is not an Iceberg table", table);
    SparkTable sparkTable = (SparkTable) table;
    return sparkTable.table();
  }
```

### DataFlowIssue
Method invocation `table` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/Spark3Util.java`
#### Snippet
```java
        table instanceof SparkTable, "Table %s is not an Iceberg table", table);
    SparkTable sparkTable = (SparkTable) table;
    return sparkTable.table();
  }

```

### DataFlowIssue
Casting `inputPartition` to `SparkInputPartition` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkRowReaderFactory.java`
#### Snippet
```java
        inputPartition.getClass().getName());

    SparkInputPartition partition = (SparkInputPartition) inputPartition;

    if (partition.allTasksOfType(FileScanTask.class)) {
```

### DataFlowIssue
Casting `inputPartition` to `SparkInputPartition` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkColumnarReaderFactory.java`
#### Snippet
```java
        inputPartition.getClass().getName());

    SparkInputPartition partition = (SparkInputPartition) inputPartition;

    if (partition.allTasksOfType(FileScanTask.class)) {
```

### DataFlowIssue
Argument `tasks` might be null
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeletesRewriteBuilder.java`
#### Snippet
```java
        tasks != null && tasks.size() > 0, "No scan tasks found for %s", fileSetId);

    int specId = specId(fileSetId, tasks);
    StructLike partition = partition(fileSetId, tasks);

```

### DataFlowIssue
Casting `startOffset` to `StreamingOffset` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkMicroBatchStream.java`
#### Snippet
```java

    // end offset can expand to multiple snapshots
    StreamingOffset startingOffset = (StreamingOffset) startOffset;

    if (startOffset.equals(StreamingOffset.START_OFFSET)) {
```

### DataFlowIssue
Casting `end` to `StreamingOffset` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkMicroBatchStream.java`
#### Snippet
```java
    }

    StreamingOffset endOffset = (StreamingOffset) end;
    StreamingOffset startOffset = (StreamingOffset) start;

```

### DataFlowIssue
Casting `start` to `StreamingOffset` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkMicroBatchStream.java`
#### Snippet
```java

    StreamingOffset endOffset = (StreamingOffset) end;
    StreamingOffset startOffset = (StreamingOffset) start;

    List<FileScanTask> fileScanTasks = planFiles(startOffset, endOffset);
```

### DataFlowIssue
Method invocation `timestampMillis` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkScanBuilder.java`
#### Snippet
```java
        table.name());

    if (oldestSnapshotAfter.timestampMillis() == startTimestamp) {
      return oldestSnapshotAfter.snapshotId();
    } else {
```

### DataFlowIssue
Casting `type` to `StructType` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeletesRewrite.java`
#### Snippet
```java
      Preconditions.checkArgument(
          type instanceof StructType, "Expected row as struct type but was %s", type);
      this.rowSize = ((StructType) type).size();
    }

```

### DataFlowIssue
Casting `catalog` to `TableCatalog` may produce `ClassCastException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SnapshotTableSparkAction.java`
#### Snippet
```java
        catalog.getClass().getName());

    return (TableCatalog) catalog;
  }

```

### DataFlowIssue
Dereference of `inputZOrderColNames` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SparkZOrderDataRewriter.java`
#### Snippet
```java
    List<String> validZOrderColNames = Lists.newArrayList();

    for (String colName : inputZOrderColNames) {
      Types.NestedField field =
          caseSensitive ? schema.findField(colName) : schema.caseInsensitiveFindField(colName);
```

### DataFlowIssue
Method invocation `fieldId` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SparkZOrderDataRewriter.java`
#### Snippet
```java
          schema.asStruct());

      if (identityPartitionFieldIds.contains(field.fieldId())) {
        LOG.warn("Ignoring '{}' as such values are constant within a partition", colName);
      } else {
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/SnapshotTableProcedure.java`
#### Snippet
```java

    Preconditions.checkArgument(
        !source.equals(dest),
        "Cannot create a snapshot with the same name as the source of the snapshot.");
    SnapshotTable action = SparkActions.get().snapshotTable(source).as(dest);
```

### DataFlowIssue
Unboxing of `value` may produce `NullPointerException`
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/ProcedureInput.java`
#### Snippet
```java
    Long value = asLong(param, null);
    Preconditions.checkArgument(value != null, "Parameter '%s' is not set", param.name());
    return value;
  }

```

### DataFlowIssue
Argument `catalogOptions` might be null
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieUtil.java`
#### Snippet
```java
      ImmutableCommitMeta.Builder commitMetaBuilder, Map<String, String> catalogOptions) {
    Preconditions.checkArgument(null != catalogOptions, "catalogOptions must not be null");
    commitMetaBuilder.author(NessieUtil.commitAuthor(catalogOptions));
    commitMetaBuilder.putProperties(APPLICATION_TYPE, "iceberg");
    if (catalogOptions.containsKey(CatalogProperties.APP_ID)) {
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieCatalog.java`
#### Snippet
```java
            : client.getRef().getName();
    Preconditions.checkArgument(
        fromReference.equalsIgnoreCase(toReference),
        "from: %s and to: %s reference name must be same",
        fromReference,
```

### DataFlowIssue
Argument `expectedContent.getId()` might be null
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieIcebergClient.java`
#### Snippet
```java
    ImmutableIcebergTable.Builder newTableBuilder = ImmutableIcebergTable.builder();
    if (expectedContent != null) {
      newTableBuilder.id(expectedContent.getId());
    }
    Snapshot snapshot = metadata.currentSnapshot();
```

### DataFlowIssue
Method invocation `operation` may produce `NullPointerException`
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieIcebergClient.java`
#### Snippet
```java
    builder.message(buildCommitMsg(base, metadata, key.toString()));
    if (isSnapshotOperation(base, metadata)) {
      builder.putProperties("iceberg.operation", snapshot.operation());
    }
    Branch branch =
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `hive-metastore/src/main/java/org/apache/iceberg/hive/CachedClientPool.java`
#### Snippet
```java
          Caffeine.newBuilder()
              .expireAfterAccess(evictionInterval, TimeUnit.MILLISECONDS)
              .removalListener((ignored, value, cause) -> ((HiveClientPool) value).close())
              .scheduler(
                  Scheduler.forScheduledExecutorService(
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `delta-lake/src/main/java/org/apache/iceberg/delta/BaseSnapshotDeltaLakeTableAction.java`
#### Snippet
```java
        spec.fields().stream()
            .map(PartitionField::name)
            .map(name -> String.format("%s=%s", name, partitionValues.get(name)))
            .collect(Collectors.joining("/"));

```

### DataFlowIssue
Method invocation `lock` may produce `NullPointerException`
in `hive-metastore/src/main/java/org/apache/iceberg/hive/MetastoreLock.java`
#### Snippet
```java

    jvmLock = commitLockCache.get(fullName, t -> new ReentrantLock(true));
    jvmLock.lock();
  }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/AvroGenericRecordToRowDataMapper.java`
#### Snippet
```java
    DataType dataType = AvroSchemaConverter.convertToDataType(avroSchema.toString());
    LogicalType logicalType = TypeConversions.fromDataToLogicalType(dataType);
    RowType rowType = RowType.of(logicalType.getChildren().stream().toArray(LogicalType[]::new));
    return new AvroGenericRecordToRowDataMapper(rowType);
  }
```

### SimplifyStreamApiCallChains
Can be replaced with 'collection.toArray()'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/RowDataToAvroGenericRecordConverter.java`
#### Snippet
```java
    DataType dataType = AvroSchemaConverter.convertToDataType(avroSchema.toString());
    LogicalType logicalType = TypeConversions.fromDataToLogicalType(dataType);
    RowType rowType = RowType.of(logicalType.getChildren().stream().toArray(LogicalType[]::new));
    return new RowDataToAvroGenericRecordConverter(rowType, avroSchema);
  }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `pig/src/main/java/org/apache/iceberg/pig/IcebergPigInputFormat.java`
#### Snippet
```java
  }

  public class IcebergRecordReader<T> extends RecordReader<Void, T> {
    private TaskAttemptContext context;

```

### TypeParameterHidesVisibleType
Type parameter `E` hides type parameter 'E'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetWriters.java`
#### Snippet
```java
    }

    private class ElementIterator<E> implements Iterator<E> {
      private final int size;
      private final ArrayData list;
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetWriters.java`
#### Snippet
```java
    }

    private class EntryIterator<K, V> implements Iterator<Map.Entry<K, V>> {
      private final int size;
      private final ArrayData keys;
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetWriters.java`
#### Snippet
```java
    }

    private class EntryIterator<K, V> implements Iterator<Map.Entry<K, V>> {
      private final int size;
      private final ArrayData keys;
```

### TypeParameterHidesVisibleType
Type parameter `E` hides type parameter 'E'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkParquetWriters.java`
#### Snippet
```java
    }

    private class ElementIterator<E> implements Iterator<E> {
      private final int size;
      private final ArrayData list;
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkParquetWriters.java`
#### Snippet
```java
    }

    private class EntryIterator<K, V> implements Iterator<Map.Entry<K, V>> {
      private final int size;
      private final ArrayData keys;
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkParquetWriters.java`
#### Snippet
```java
    }

    private class EntryIterator<K, V> implements Iterator<Map.Entry<K, V>> {
      private final int size;
      private final ArrayData keys;
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'VECTOR_ROW_BATCH_SIZE' is still used
in `orc/src/main/java/org/apache/iceberg/orc/ORC.java`
#### Snippet
```java

  /** @deprecated use {@link TableProperties#ORC_WRITE_BATCH_SIZE} instead */
  @Deprecated private static final String VECTOR_ROW_BATCH_SIZE = "iceberg.orc.vectorbatch.size";

  private ORC() {}
```

### DeprecatedIsStillUsed
Deprecated member 'MANIFEST_LISTS_ENABLED' is still used
in `core/src/main/java/org/apache/iceberg/TableProperties.java`
#### Snippet
```java

  /** @deprecated will be removed in 2.0.0, writing manifest lists is always enabled */
  @Deprecated public static final String MANIFEST_LISTS_ENABLED = "write.manifest-lists.enabled";

  /** @deprecated will be removed in 2.0.0, writing manifest lists is always enabled */
```

### DeprecatedIsStillUsed
Deprecated member 'WRITE_FOLDER_STORAGE_LOCATION' is still used
in `core/src/main/java/org/apache/iceberg/TableProperties.java`
#### Snippet
```java
  /** @deprecated Use {@link #WRITE_DATA_LOCATION} instead. */
  @Deprecated
  public static final String WRITE_FOLDER_STORAGE_LOCATION = "write.folder-storage.path";

  // This only applies to files written after this property is set. Files previously written aren't
```

### DeprecatedIsStillUsed
Deprecated member 'OBJECT_STORE_PATH' is still used
in `core/src/main/java/org/apache/iceberg/TableProperties.java`
#### Snippet
```java

  /** @deprecated Use {@link #WRITE_DATA_LOCATION} instead. */
  @Deprecated public static final String OBJECT_STORE_PATH = "write.object-storage.path";

  public static final String WRITE_LOCATION_PROVIDER_IMPL = "write.location-provider.impl";
```

### DeprecatedIsStillUsed
Deprecated member 'S3_ACCELERATION_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_ACCELERATION_ENABLED = "s3.acceleration-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_CONNECTION_MAX_IDLE_TIME_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_CONNECTION_MAX_IDLE_TIME_MS =
      "http-client.apache.connection-max-idle-time-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'S3_CHECKSUM_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_CHECKSUM_ENABLED = "s3.checksum-enabled";
  /**
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_DELETE_BATCH_SIZE_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final int S3FILEIO_DELETE_BATCH_SIZE_DEFAULT = 250;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_THRESHOLD_FACTOR_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final double S3FILEIO_MULTIPART_THRESHOLD_FACTOR_DEFAULT = 1.5;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_WRITE_NAMESPACE_TAG_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String S3_WRITE_NAMESPACE_TAG_ENABLED = "s3.write.namespace-tag-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_ACL' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_ACL = "s3.acl";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SSE_TYPE_NONE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SSE_TYPE_NONE = "none";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_USE_ARN_REGION_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_USE_ARN_REGION_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'CLIENT_CREDENTIALS_PROVIDER' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String CLIENT_CREDENTIALS_PROVIDER = "client.credentials-provider";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_SIZE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_MULTIPART_SIZE = "s3.multipart.part-size-bytes";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SECRET_ACCESS_KEY' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SECRET_ACCESS_KEY = "s3.secret-access-key";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_ACCESS_KEY_ID' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_ACCESS_KEY_ID = "s3.access-key-id";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_EXPECT_CONTINUE_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_EXPECT_CONTINUE_ENABLED =
      "http-client.apache.expect-continue-enabled";

```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_TYPE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String HTTP_CLIENT_TYPE = "http-client.type";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_URLCONNECTION_SOCKET_TIMEOUT_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_URLCONNECTION_SOCKET_TIMEOUT_MS =
      "http-client.urlconnection.socket-timeout-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'S3_TAG_ICEBERG_NAMESPACE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_TAG_ICEBERG_NAMESPACE = "iceberg.namespace";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_CONNECTION_TIME_TO_LIVE_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_CONNECTION_TIME_TO_LIVE_MS =
      "http-client.apache.connection-time-to-live-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SESSION_TOKEN' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SESSION_TOKEN = "s3.session-token";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_DELETE_THREADS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_DELETE_THREADS = "s3.delete.num-threads";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_SOCKET_TIMEOUT_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_SOCKET_TIMEOUT_MS =
      "http-client.apache.socket-timeout-ms";

```

### DeprecatedIsStillUsed
Deprecated member 's3BucketToAccessPointMapping' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public Map<String, String> s3BucketToAccessPointMapping() {
    return s3BucketToAccessPointMapping;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'setS3FileIoDeleteBatchSize' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public void setS3FileIoDeleteBatchSize(int deleteBatchSize) {
    this.s3FileIoDeleteBatchSize = deleteBatchSize;
  }
```

### DeprecatedIsStillUsed
Deprecated member 's3WriteNamespaceTagEnabled' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public boolean s3WriteNamespaceTagEnabled() {
    return s3WriteNamespaceTagEnabled;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_PATH_STYLE_ACCESS_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3FILEIO_PATH_STYLE_ACCESS_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_CONNECTION_TIMEOUT_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_CONNECTION_TIMEOUT_MS =
      "http-client.apache.connection-timeout-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SSE_KEY' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SSE_KEY = "s3.sse.key";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SSE_TYPE_CUSTOM' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SSE_TYPE_CUSTOM = "custom";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_DELETE_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_DELETE_ENABLED = "s3.delete-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_MAX_CONNECTIONS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_MAX_CONNECTIONS =
      "http-client.apache.max-connections";

```

### DeprecatedIsStillUsed
Deprecated member 'S3_DUALSTACK_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_DUALSTACK_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_DELETE_BATCH_SIZE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_DELETE_BATCH_SIZE = "s3.delete.batch-size";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_STAGING_DIRECTORY' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_STAGING_DIRECTORY = "s3.staging-dir";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_TYPE_APACHE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String HTTP_CLIENT_TYPE_APACHE = "apache";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_REMOTE_SIGNING_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_REMOTE_SIGNING_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_TAG_ICEBERG_TABLE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_TAG_ICEBERG_TABLE = "iceberg.table";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_PRELOAD_CLIENT_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_PRELOAD_CLIENT_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_DELETE_TAGS_PREFIX' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_DELETE_TAGS_PREFIX = "s3.delete.tags.";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_UPLOAD_THREADS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String S3FILEIO_MULTIPART_UPLOAD_THREADS = "s3.multipart.num-threads";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_USE_ARN_REGION_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_USE_ARN_REGION_ENABLED = "s3.use-arn-region-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_THRESHOLD_FACTOR' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String S3FILEIO_MULTIPART_THRESHOLD_FACTOR = "s3.multipart.threshold";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'applyS3SignerConfiguration' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends S3ClientBuilder> void applyS3SignerConfiguration(T builder) {
    if (s3RemoteSigningEnabled) {
      builder.overrideConfiguration(
```

### DeprecatedIsStillUsed
Deprecated member 's3FileIoAcl' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public ObjectCannedACL s3FileIoAcl() {
    return this.s3FileIoAcl;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SSE_TYPE' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SSE_TYPE = "s3.sse.type";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_SIZE_MIN' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final int S3FILEIO_MULTIPART_SIZE_MIN = 5 * 1024 * 1024;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'applyS3ServiceConfigurations' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends S3ClientBuilder> void applyS3ServiceConfigurations(T builder) {
    builder
        .dualstackEnabled(s3DualStackEnabled)
```

### DeprecatedIsStillUsed
Deprecated member 's3WriteTableTagEnabled' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public boolean s3WriteTableTagEnabled() {
    return s3WriteTableTagEnabled;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_DELETE_BATCH_SIZE_MAX' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final int S3FILEIO_DELETE_BATCH_SIZE_MAX = 1000;

  /** Configure an alternative endpoint of the DynamoDB service to access. */
```

### DeprecatedIsStillUsed
Deprecated member 'S3_DELETE_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_DELETE_ENABLED_DEFAULT = true;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_WRITE_TABLE_TAG_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_WRITE_TABLE_TAG_ENABLED = "s3.write.table-tag-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_URLCONNECTION_CONNECTION_TIMEOUT_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_URLCONNECTION_CONNECTION_TIMEOUT_MS =
      "http-client.urlconnection.connection-timeout-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'applyClientRegionConfiguration' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends AwsClientBuilder> void applyClientRegionConfiguration(T builder) {
    if (clientRegion != null) {
      builder.region(Region.of(clientRegion));
```

### DeprecatedIsStillUsed
Deprecated member 'CLIENT_CREDENTIAL_PROVIDER_PREFIX' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  private static final String CLIENT_CREDENTIAL_PROVIDER_PREFIX = "client.credentials-provider.";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_WRITE_TABLE_TAG_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_WRITE_TABLE_TAG_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_REMOTE_SIGNING_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_REMOTE_SIGNING_ENABLED = "s3.remote-signing-enabled";
  /**
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### DeprecatedIsStillUsed
Deprecated member 'S3_DUALSTACK_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_DUALSTACK_ENABLED = "s3.dualstack-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'applyS3CredentialConfigurations' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends S3ClientBuilder> void applyS3CredentialConfigurations(T builder) {
    builder.credentialsProvider(
        s3RemoteSigningEnabled
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_MULTIPART_SIZE_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final int S3FILEIO_MULTIPART_SIZE_DEFAULT = 32 * 1024 * 1024;
  /**
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_TCP_KEEP_ALIVE_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_TCP_KEEP_ALIVE_ENABLED =
      "http-client.apache.tcp-keep-alive-enabled";

```

### DeprecatedIsStillUsed
Deprecated member 'CLIENT_REGION' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String CLIENT_REGION = "client.region";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_CHECKSUM_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_CHECKSUM_ENABLED_DEFAULT = false;
  /**
   * @deprecated will be removed in 1.4.0, use {@link org.apache.iceberg.aws.s3.S3FileIOProperties}
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_SSE_MD5' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_SSE_MD5 = "s3.sse.md5";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_CONNECTION_ACQUISITION_TIMEOUT_MS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_CONNECTION_ACQUISITION_TIMEOUT_MS =
      "http-client.apache.connection-acquisition-timeout-ms";

```

### DeprecatedIsStillUsed
Deprecated member 'S3_ACCESS_POINTS_PREFIX' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_ACCESS_POINTS_PREFIX = "s3.access-points.";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_APACHE_USE_IDLE_CONNECTION_REAPER_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String HTTP_CLIENT_APACHE_USE_IDLE_CONNECTION_REAPER_ENABLED =
      "http-client.apache.use-idle-connection-reaper-enabled";
  /**
```

### DeprecatedIsStillUsed
Deprecated member 'HTTP_CLIENT_TYPE_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String HTTP_CLIENT_TYPE_DEFAULT = HTTP_CLIENT_TYPE_APACHE;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_PRELOAD_CLIENT_ENABLED' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_PRELOAD_CLIENT_ENABLED = "s3.preload-client-enabled";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_ACCELERATION_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_ACCELERATION_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3_WRITE_TAGS_PREFIX' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3_WRITE_TAGS_PREFIX = "s3.write.tags.";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'applyS3EndpointConfigurations' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends S3ClientBuilder> void applyS3EndpointConfigurations(T builder) {
    configureEndpoint(builder, s3Endpoint);
  }
```

### DeprecatedIsStillUsed
Deprecated member 'applyHttpClientConfigurations' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   */
  @Deprecated
  public <T extends AwsSyncClientBuilder> void applyHttpClientConfigurations(T builder) {
    if (Strings.isNullOrEmpty(httpClientType)) {
      httpClientType = HTTP_CLIENT_TYPE_DEFAULT;
```

### DeprecatedIsStillUsed
Deprecated member 'S3_WRITE_NAMESPACE_TAG_ENABLED_DEFAULT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final boolean S3_WRITE_NAMESPACE_TAG_ENABLED_DEFAULT = false;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_ENDPOINT' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_ENDPOINT = "s3.endpoint";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'S3FILEIO_PATH_STYLE_ACCESS' is still used
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
   *     instead
   */
  @Deprecated public static final String S3FILEIO_PATH_STYLE_ACCESS = "s3.path-style-access";

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'SortStrategy' is still used
in `core/src/main/java/org/apache/iceberg/actions/SortStrategy.java`
#### Snippet
```java
 */
@Deprecated
public abstract class SortStrategy extends BinPackStrategy {

  private SortOrder sortOrder;
```

### DeprecatedIsStillUsed
Deprecated member 'BinPackStrategy' is still used
in `core/src/main/java/org/apache/iceberg/actions/BinPackStrategy.java`
#### Snippet
```java
 */
@Deprecated
public abstract class BinPackStrategy implements RewriteStrategy {

  private static final Logger LOG = LoggerFactory.getLogger(BinPackStrategy.class);
```

### DeprecatedIsStillUsed
Deprecated member 'RewriteStrategy' is still used
in `core/src/main/java/org/apache/iceberg/actions/RewriteStrategy.java`
#### Snippet
```java
 */
@Deprecated
public interface RewriteStrategy extends Serializable {
  /** Returns the name of this rewrite strategy */
  String name();
```

### DeprecatedIsStillUsed
Deprecated member 'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is still used
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkWriteOptions.java`
#### Snippet
```java
  // Controls whether to allow writing timestamps without zone info
  @Deprecated
  public static final String HANDLE_TIMESTAMP_WITHOUT_TIMEZONE =
      "handle-timestamp-without-timezone";

```

### DeprecatedIsStillUsed
Deprecated member 'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is still used
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkReadOptions.java`
#### Snippet
```java
  // Controls whether to allow reading timestamps without zone info
  @Deprecated
  public static final String HANDLE_TIMESTAMP_WITHOUT_TIMEZONE =
      "handle-timestamp-without-timezone";

```

### DeprecatedIsStillUsed
Deprecated member 'HANDLE_TIMESTAMP_WITHOUT_TIMEZONE' is still used
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSQLProperties.java`
#### Snippet
```java
  // Controls whether reading/writing timestamps without timezones is allowed
  @Deprecated
  public static final String HANDLE_TIMESTAMP_WITHOUT_TIMEZONE =
      "spark.sql.iceberg.handle-timestamp-without-timezone";

```

### DeprecatedIsStillUsed
Deprecated member 'USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES' is still used
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSQLProperties.java`
#### Snippet
```java
  // Controls whether timestamp types for new tables should be stored with timezone info
  @Deprecated
  public static final String USE_TIMESTAMP_WITHOUT_TIME_ZONE_IN_NEW_TABLES =
      "spark.sql.iceberg.use-timestamp-without-timezone-in-new-tables";

```

### DeprecatedIsStillUsed
Deprecated member 'ParquetWriteAdapter' is still used
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetWriteAdapter.java`
#### Snippet
```java
 */
@Deprecated
public class ParquetWriteAdapter<D> implements FileAppender<D> {
  private ParquetWriter<D> writer;
  private MetricsConfig metricsConfig;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/iceberg/util/Pair.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "(" + String.valueOf(first) + ", " + String.valueOf(second) + ")";
  }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `core/src/main/java/org/apache/iceberg/util/Pair.java`
#### Snippet
```java
  @Override
  public String toString() {
    return "(" + String.valueOf(first) + ", " + String.valueOf(second) + ")";
  }

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `core/src/main/java/org/apache/iceberg/PropertiesUpdate.java`
#### Snippet
```java
    Preconditions.checkNotNull(key, "Key cannot be null");
    Preconditions.checkArgument(
        !updates.keySet().contains(key), "Cannot remove and update the same key: %s", key);

    removals.add(key);
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `api/src/main/java/org/apache/iceberg/expressions/Literals.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public <T> Literal<T> to(Type type) {
      switch (type.typeId()) {
        case DECIMAL:
          // do not change decimal scale
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `pig/src/main/java/org/apache/iceberg/pig/IcebergPigInputFormat.java`
#### Snippet
```java
      boolean hasJoinedPartitionColumns = !idColumns.isEmpty();

      switch (file.format()) {
        case PARQUET:
          Map<Integer, Object> partitionValueMap = Maps.newHashMap();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/org/apache/iceberg/ManifestReader.java`
#### Snippet
```java
    fields.add(MetadataColumns.ROW_POSITION);

    switch (format) {
      case AVRO:
        AvroIterable<ManifestEntry<F>> reader =
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/org/apache/iceberg/view/ViewRepresentationParser.java`
#### Snippet
```java
      throws IOException {
    Preconditions.checkArgument(representation != null, "Invalid view representation: null");
    switch (representation.type().toLowerCase(Locale.ENGLISH)) {
      case ViewRepresentation.Type.SQL:
        SQLViewRepresentationParser.toJson((SQLViewRepresentation) representation, generator);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/org/apache/iceberg/view/ViewRepresentationParser.java`
#### Snippet
```java
        node.isObject(), "Cannot parse view representation from non-object: %s", node);
    String type = JsonUtil.getString(TYPE, node).toLowerCase(Locale.ENGLISH);
    switch (type) {
      case ViewRepresentation.Type.SQL:
        return SQLViewRepresentationParser.fromJson(node);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/org/apache/iceberg/puffin/PuffinReader.java`
#### Snippet
```java
      PuffinCompressionCodec footerCompression = PuffinCompressionCodec.NONE;
      for (Flag flag : decodeFlags(footer, footerStructOffset)) {
        switch (flag) {
          case FOOTER_PAYLOAD_COMPRESSED:
            footerCompression = PuffinFormat.FOOTER_COMPRESSION_CODEC;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/split/IcebergSourceSplitSerializer.java`
#### Snippet
```java
  @Override
  public IcebergSourceSplit deserialize(int version, byte[] serialized) throws IOException {
    switch (version) {
      case 1:
        return IcebergSourceSplit.deserializeV1(serialized);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/enumerator/IcebergEnumeratorPositionSerializer.java`
#### Snippet
```java
  @Override
  public IcebergEnumeratorPosition deserialize(int version, byte[] serialized) throws IOException {
    switch (version) {
      case 1:
        return deserializeV1(serialized);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/PruneColumnsWithoutReordering.java`
#### Snippet
```java

    // additional checks based on type
    switch (primitive.typeId()) {
      case DECIMAL:
        Types.DecimalType decimal = (Types.DecimalType) primitive;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSInputStream.java`
#### Snippet
```java
    Preconditions.checkState(!closed, "Cannot read: already closed");
    positionStream();

    int bytesRead = stream.read(b, off, len);
    pos += bytesRead;
    next += bytesRead;
    readBytes.increment(bytesRead);
    readOperations.increment();

    return bytesRead;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/ExpressionVisitors.java`
#### Snippet
```java
if (pred.isLiteralPredicate()) {
        BoundLiteralPredicate<T> literalPred = pred.asLiteralPredicate();
        switch (pred.op()) {
          case LT:
            return lt(pred.term(), literalPred.literal());
          case LT_EQ:
            return ltEq(pred.term(), literalPred.literal());
          case GT:
            return gt(pred.term(), literalPred.literal());
          case GT_EQ:
            return gtEq(pred.term(), literalPred.literal());
          case EQ:
            return eq(pred.term(), literalPred.literal());
          case NOT_EQ:
            return notEq(pred.term(), literalPred.literal());
          case STARTS_WITH:
            return startsWith(pred.term(), literalPred.literal());
          case NOT_STARTS_WITH:
            return notStartsWith(pred.term(), literalPred.literal());
          default:
            throw new IllegalStateException(
                "Invalid operation for BoundLiteralPredicate: " + pred.op());
        }

      } else if (pred.isUnaryPredicate()) {
        switch (pred.op()) {
          case IS_NULL:
            return isNull(pred.term());
          case NOT_NULL:
            return notNull(pred.term());
          case IS_NAN:
            return isNaN(pred.term());
          case NOT_NAN:
            return notNaN(pred.term());
          default:
            throw new IllegalStateException(
                "Invalid operation for BoundUnaryPredicate: " + pred.op());
        }

      } else if (pred.isSetPredicate()) {
        switch (pred.op()) {
          case IN:
            return in(pred.term(), pred.asSetPredicate().literalSet());
          case NOT_IN:
            return notIn(pred.term(), pred.asSetPredicate().literalSet());
          default:
            throw new IllegalStateException(
                "Invalid operation for BoundSetPredicate: " + pred.op());
        }
      }

      throw new IllegalStateException("Unsupported bound predicate: " + pred.getClass().getName());
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/InclusiveMetricsEvaluator.java`
#### Snippet
```java
      if (lowerBounds != null && lowerBounds.containsKey(id)) {
        T lower = Conversions.fromByteBuffer(ref.type(), lowerBounds.get(id));

        if (NaNUtil.isNaN(lower)) {
          // NaN indicates unreliable bounds. See the InclusiveMetricsEvaluator docs for more.
          return ROWS_MIGHT_MATCH;
        }

        int cmp = lit.comparator().compare(lower, lit.value());
        if (cmp >= 0) {
          return ROWS_CANNOT_MATCH;
        }
      }

      return ROWS_MIGHT_MATCH;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/InclusiveMetricsEvaluator.java`
#### Snippet
```java
      Integer id = ref.fieldId();

      if (containsNullsOnly(id) || containsNaNsOnly(id)) {
        return ROWS_CANNOT_MATCH;
      }

      if (lowerBounds != null && lowerBounds.containsKey(id)) {
        T lower = Conversions.fromByteBuffer(ref.type(), lowerBounds.get(id));

        if (NaNUtil.isNaN(lower)) {
          // NaN indicates unreliable bounds. See the InclusiveMetricsEvaluator docs for more.
          return ROWS_MIGHT_MATCH;
        }

        int cmp = lit.comparator().compare(lower, lit.value());
        if (cmp > 0) {
          return ROWS_CANNOT_MATCH;
        }
      }
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/StrictMetricsEvaluator.java`
#### Snippet
```java
      if (lowerBounds != null && lowerBounds.containsKey(id)) {
        T lower = Conversions.fromByteBuffer(field.type(), lowerBounds.get(id));

        if (NaNUtil.isNaN(lower)) {
          // NaN indicates unreliable bounds. See the StrictMetricsEvaluator docs for more.
          return ROWS_MIGHT_NOT_MATCH;
        }

        int cmp = lit.comparator().compare(lower, lit.value());
        if (cmp > 0) {
          return ROWS_MUST_MATCH;
        }
      }

      return ROWS_MIGHT_NOT_MATCH;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/InclusiveMetricsEvaluator.java`
#### Snippet
```java
      if (upperBounds != null && upperBounds.containsKey(id)) {
        T upper = Conversions.fromByteBuffer(ref.type(), upperBounds.get(id));

        int cmp = lit.comparator().compare(upper, lit.value());
        if (cmp <= 0) {
          return ROWS_CANNOT_MATCH;
        }
      }

      return ROWS_MIGHT_MATCH;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/InclusiveMetricsEvaluator.java`
#### Snippet
```java
      if (upperBounds != null && upperBounds.containsKey(id)) {
        T upper = Conversions.fromByteBuffer(ref.type(), upperBounds.get(id));

        int cmp = lit.comparator().compare(upper, lit.value());
        if (cmp < 0) {
          return ROWS_CANNOT_MATCH;
        }
      }

      return ROWS_MIGHT_MATCH;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/InclusiveMetricsEvaluator.java`
#### Snippet
```java
      if (upperBounds != null && upperBounds.containsKey(id)) {
        T upper = Conversions.fromByteBuffer(ref.type(), upperBounds.get(id));
        literals =
            literals.stream()
                .filter(v -> ref.comparator().compare(upper, v) >= 0)
                .collect(Collectors.toList());
        if (literals
            .isEmpty()) { // if all remaining values are greater than upper bound, rows cannot
          // match.
          return ROWS_CANNOT_MATCH;
        }
      }

      return ROWS_MIGHT_MATCH;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/ManifestEvaluator.java`
#### Snippet
```java
      int pos = Accessors.toPosition(ref.accessor());
      ByteBuffer lowerBound = stats.get(pos).lowerBound();
      if (lowerBound == null) {
        return ROWS_CANNOT_MATCH; // values are all null
      }

      T lower = Conversions.fromByteBuffer(ref.type(), lowerBound);

      int cmp = lit.comparator().compare(lower, lit.value());
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/ManifestEvaluator.java`
#### Snippet
```java
      int pos = Accessors.toPosition(ref.accessor());
      ByteBuffer upperBound = stats.get(pos).upperBound();
      if (upperBound == null) {
        return ROWS_CANNOT_MATCH; // values are all null
      }

      T upper = Conversions.fromByteBuffer(ref.type(), upperBound);

      int cmp = lit.comparator().compare(upper, lit.value());
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/MaxAggregate.java`
#### Snippet
```java
    Long valueCount = safeGet(file.valueCounts(), fieldId);
    Long nullCount = safeGet(file.nullValueCounts(), fieldId);
    boolean boundAllNull =
        valueCount != null
            && valueCount > 0
            && nullCount != null
            && nullCount.longValue() == valueCount.longValue();
    return hasBound || boundAllNull;
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/ResidualEvaluator.java`
#### Snippet
```java
        Expression strictResult = null;

        if (strictProjection != null) {
          Expression bound = strictProjection.bind(spec.partitionType(), caseSensitive);
          if (bound instanceof BoundPredicate) {
            strictResult = super.predicate((BoundPredicate<?>) bound);
          } else {
            // if the result is not a predicate, then it must be a constant like alwaysTrue or
            // alwaysFalse
            strictResult = bound;
          }
        }
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/expressions/UnboundPredicate.java`
#### Snippet
```java
      switch (op()) {
        case LT:
        case LT_EQ:
        case NOT_EQ:
          return Expressions.alwaysTrue();
        case GT:
        case GT_EQ:
        case EQ:
          return Expressions.alwaysFalse();
      }
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/types/ReassignDoc.java`
#### Snippet
```java
    Type elementType = elementTypeFuture.get();
    if (list.elementType() == elementType) {
      return list;
    }

    if (list.isElementOptional()) {
      return Types.ListType.ofOptional(list.elementId(), elementType);
    } else {
      return Types.ListType.ofRequired(list.elementId(), elementType);
    }
```

### DuplicatedCode
Duplicated code
in `api/src/main/java/org/apache/iceberg/util/CharSequenceSet.java`
#### Snippet
```java
    int ind = 0;
    while (iter.hasNext()) {
      destArray[ind] = (T) iter.next();
      ind += 1;
    }

    if (destArray.length > size) {
      destArray[size] = null;
    }

    return destArray;
```

### DuplicatedCode
Duplicated code
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/parquet/VectorizedParquetDefinitionLevelReader.java`
#### Snippet
```java
      int idx = startOffset;
      int left = numValsToRead;
      while (left > 0) {
        if (currentCount == 0) {
          readNextGroup();
        }
        int numValues = Math.min(left, currentCount);
        ArrowBuf validityBuffer = vector.getValidityBuffer();
        switch (mode) {
          case RLE:
            if (currentValue == maxDefLevel) {
              nextDictEncodedVal(
                  vector,
                  idx,
                  dictionaryEncodedValuesReader,
                  dict,
                  mode,
                  numValues,
                  nullabilityHolder,
                  typeWidth);
            } else {
              setNulls(nullabilityHolder, idx, numValues, validityBuffer);
            }
            idx += numValues;
            break;
          case PACKED:
            for (int i = 0; i < numValues; i++) {
              if (packedValuesBuffer[packedValuesBufferIdx++] == maxDefLevel) {
                nextDictEncodedVal(
                    vector,
                    idx,
                    dictionaryEncodedValuesReader,
                    dict,
                    mode,
                    numValues,
                    nullabilityHolder,
                    typeWidth);
                nullabilityHolder.setNotNull(idx);
                if (setArrowValidityVector) {
                  BitVectorHelper.setBit(vector.getValidityBuffer(), idx);
                }
              } else {
                setNull(nullabilityHolder, idx, validityBuffer);
              }
              idx++;
            }
            break;
        }
        left -= numValues;
        currentCount -= numValues;
      }
```

### DuplicatedCode
Duplicated code
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogCommitFailure.java`
#### Snippet
```java
    String namespace = createNamespace();
    String tableName = createTable(namespace);
    TableIdentifier tableId = TableIdentifier.of(namespace, tableName);

    GlueTableOperations spyOps =
        Mockito.spy((GlueTableOperations) glueCatalog.newTableOps(tableId));
    GlueCatalog spyCatalog = Mockito.spy(glueCatalog);
    Mockito.doReturn(spyOps).when(spyCatalog).newTableOps(Mockito.eq(tableId));
    Table table = spyCatalog.loadTable(tableId);
```

### DuplicatedCode
Duplicated code
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
    String namespace = createNamespace();
    String tableName = getRandomName();
    createTable(namespace, tableName);
    TableIdentifier identifier = TableIdentifier.of(namespace, tableName);
    Table table = glueCatalog.loadTable(identifier);
    String metadataLocation = ((BaseTable) table).operations().current().metadataFileLocation();
```

### DuplicatedCode
Duplicated code
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/TestLakeFormationDataOperations.java`
#### Snippet
```java
    grantTablePrivileges(
        testDbName, testTableName, Permission.SELECT, Permission.ALTER, Permission.INSERT);
    grantDataPathPrivileges(getTableLocation(testTableName));
    Table table =
        glueCatalogPrivilegedRole.loadTable(
            TableIdentifier.of(Namespace.of(testDbName), testTableName));
    DataFile dataFile =
        DataFiles.builder(partitionSpec)
            .withPath(getTableLocation(testTableName) + "/path/to/data-a.parquet")
            .withFileSizeInBytes(10)
            .withRecordCount(1)
            .build();
```

### DuplicatedCode
Duplicated code
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
    s3.putObject(
        PutObjectRequest.builder().bucket(bucketName).key(objectKey).build(),
        RequestBody.fromBytes(contentBytes));
    S3FileIO s3FileIO = new S3FileIO();
    Map<String, String> properties = Maps.newHashMap();
    properties.put(
        S3FileIOProperties.CLIENT_FACTORY,
        "org.apache.iceberg.aws.s3.DefaultS3FileIOAwsClientFactory");
    s3FileIO.initialize(properties);
    validateRead(s3FileIO);
```

### DuplicatedCode
Duplicated code
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
    S3FileIO s3FileIO = new S3FileIO(clientFactory::s3, properties);
    write(s3FileIO);
    validateRead(s3FileIO);
    GetObjectResponse response =
        s3.getObject(GetObjectRequest.builder().bucket(bucketName).key(objectKey).build())
            .response();
    Assert.assertEquals(ServerSideEncryption.AWS_KMS, response.serverSideEncryption());
```

### DuplicatedCode
Duplicated code
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientProperties.java`
#### Snippet
```java
    Class<?> providerClass;
    try {
      providerClass = DynClasses.builder().impl(credentialsProviderClass).buildChecked();
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException(
          String.format(
              "Cannot load class %s, it does not exist in the classpath", credentialsProviderClass),
          e);
    }

    Preconditions.checkArgument(
        AwsCredentialsProvider.class.isAssignableFrom(providerClass),
        String.format(
            "Cannot initialize %s, it does not implement %s.",
            credentialsProviderClass, AwsCredentialsProvider.class.getName()));
```

### DuplicatedCode
Duplicated code
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
    if (Strings.isNullOrEmpty(httpClientType)) {
      httpClientType = HTTP_CLIENT_TYPE_DEFAULT;
    }
    switch (httpClientType) {
      case HTTP_CLIENT_TYPE_URLCONNECTION:
        UrlConnectionHttpClientConfigurations urlConnectionHttpClientConfigurations =
            loadHttpClientConfigurations(UrlConnectionHttpClientConfigurations.class.getName());
        urlConnectionHttpClientConfigurations.configureHttpClientBuilder(builder);
        break;
      case HTTP_CLIENT_TYPE_APACHE:
        ApacheHttpClientConfigurations apacheHttpClientConfigurations =
            loadHttpClientConfigurations(ApacheHttpClientConfigurations.class.getName());
        apacheHttpClientConfigurations.configureHttpClientBuilder(builder);
        break;
      default:
        throw new IllegalArgumentException("Unrecognized HTTP client type " + httpClientType);
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/BaseEntriesTable.java`
#### Snippet
```java
    Expression rowFilter = context.rowFilter();
    boolean caseSensitive = context.caseSensitive();
    boolean ignoreResiduals = context.ignoreResiduals();

    LoadingCache<Integer, ManifestEvaluator> evalCache =
        Caffeine.newBuilder()
            .build(
                specId -> {
                  PartitionSpec spec = table.specs().get(specId);
                  PartitionSpec transformedSpec = BaseFilesTable.transformSpec(tableSchema, spec);
                  return ManifestEvaluator.forRowFilter(rowFilter, transformedSpec, caseSensitive);
                });

    CloseableIterable<ManifestFile> filteredManifests =
        CloseableIterable.filter(
            manifests, manifest -> evalCache.get(manifest.partitionSpecId()).eval(manifest));

    String schemaString = SchemaParser.toJson(projectedSchema);
    String specString = PartitionSpecParser.toJson(PartitionSpec.unpartitioned());
    Expression filter = ignoreResiduals ? Expressions.alwaysTrue() : rowFilter;
    ResidualEvaluator residuals = ResidualEvaluator.unpartitioned(filter);

    return CloseableIterable.transform(
        filteredManifests,
        manifest ->
            new ManifestReadTask(
                table, manifest, projectedSchema, schemaString, specString, residuals));
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/BaseIncrementalAppendScan.java`
#### Snippet
```java
    Set<Long> snapshotIds = Sets.newHashSet(Iterables.transform(snapshots, Snapshot::snapshotId));
    Set<ManifestFile> manifests =
        FluentIterable.from(snapshots)
            .transformAndConcat(snapshot -> snapshot.dataManifests(table().io()))
            .filter(manifestFile -> snapshotIds.contains(manifestFile.snapshotId()))
            .toSet();

    ManifestGroup manifestGroup =
        new ManifestGroup(table().io(), manifests)
            .caseSensitive(isCaseSensitive())
            .select(scanColumns())
            .filterData(filter())
            .filterManifestEntries(
                manifestEntry ->
                    snapshotIds.contains(manifestEntry.snapshotId())
                        && manifestEntry.status() == ManifestEntry.Status.ADDED)
            .specsById(table().specs())
            .ignoreDeleted();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/BaseMetastoreCatalog.java`
#### Snippet
```java
      TableOperations ops = newTableOps(identifier);
      if (ops.current() != null) {
        throw new AlreadyExistsException("Table already exists: %s", identifier);
      }

      String baseLocation = location != null ? location : defaultWarehouseLocation(identifier);
      tableProperties.putAll(tableOverrideProperties());
      TableMetadata metadata =
          TableMetadata.newTableMetadata(schema, spec, sortOrder, baseLocation, tableProperties);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/DataFiles.java`
#### Snippet
```java
      if (isPartitioned) {
        partitionData.clear();
      }
      this.filePath = null;
      this.format = null;
      this.recordCount = -1L;
      this.fileSizeInBytes = -1L;
      this.columnSizes = null;
      this.valueCounts = null;
      this.nullValueCounts = null;
      this.nanValueCounts = null;
      this.lowerBounds = null;
      this.upperBounds = null;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/DataFiles.java`
#### Snippet
```java
      this.filePath = toCopy.path().toString();
      this.format = toCopy.format();
      this.recordCount = toCopy.recordCount();
      this.fileSizeInBytes = toCopy.fileSizeInBytes();
      this.columnSizes = toCopy.columnSizes();
      this.valueCounts = toCopy.valueCounts();
      this.nullValueCounts = toCopy.nullValueCounts();
      this.nanValueCounts = toCopy.nanValueCounts();
      this.lowerBounds = toCopy.lowerBounds();
      this.upperBounds = toCopy.upperBounds();
      this.keyMetadata =
          toCopy.keyMetadata() == null ? null : ByteBuffers.copy(toCopy.keyMetadata());
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/DataFiles.java`
#### Snippet
```java
      this.recordCount = metrics.recordCount() == null ? -1 : metrics.recordCount();
      this.columnSizes = metrics.columnSizes();
      this.valueCounts = metrics.valueCounts();
      this.nullValueCounts = metrics.nullValueCounts();
      this.nanValueCounts = metrics.nanValueCounts();
      this.lowerBounds = metrics.lowerBounds();
      this.upperBounds = metrics.upperBounds();
      return this;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
    if (parent == null) {
      return CloseableIterable.empty();
    }

    Pair<List<ManifestFile>, Set<Long>> history =
        validationHistory(
            base,
            startingSnapshotId,
            VALIDATE_ADDED_FILES_OPERATIONS,
            ManifestContent.DATA,
            parent);
    List<ManifestFile> manifests = history.first();
    Set<Long> newSnapshots = history.second();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/SnapshotRefParser.java`
#### Snippet
```java
    long snapshotId = JsonUtil.getLong(SNAPSHOT_ID, node);
    SnapshotRefType type = SnapshotRefType.fromString(JsonUtil.getString(TYPE, node));
    Integer minSnapshotsToKeep = JsonUtil.getIntOrNull(MIN_SNAPSHOTS_TO_KEEP, node);
    Long maxSnapshotAgeMs = JsonUtil.getLongOrNull(MAX_SNAPSHOT_AGE_MS, node);
    Long maxRefAgeMs = JsonUtil.getLongOrNull(MAX_REF_AGE_MS, node);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/SnapshotSummary.java`
#### Snippet
```java
      setIf(addedFiles > 0, builder, ADDED_FILES_PROP, addedFiles);
      setIf(removedFiles > 0, builder, DELETED_FILES_PROP, removedFiles);
      setIf(addedEqDeleteFiles > 0, builder, ADD_EQ_DELETE_FILES_PROP, addedEqDeleteFiles);
      setIf(removedEqDeleteFiles > 0, builder, REMOVED_EQ_DELETE_FILES_PROP, removedEqDeleteFiles);
      setIf(addedPosDeleteFiles > 0, builder, ADD_POS_DELETE_FILES_PROP, addedPosDeleteFiles);
      setIf(
          removedPosDeleteFiles > 0, builder, REMOVED_POS_DELETE_FILES_PROP, removedPosDeleteFiles);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/actions/RewriteFileGroup.java`
#### Snippet
```java
    switch (rewriteJobOrder) {
      case BYTES_ASC:
        return Comparator.comparing(RewriteFileGroup::sizeInBytes);
      case BYTES_DESC:
        return Comparator.comparing(RewriteFileGroup::sizeInBytes, Comparator.reverseOrder());
      case FILES_ASC:
        return Comparator.comparing(RewriteFileGroup::numFiles);
      case FILES_DESC:
        return Comparator.comparing(RewriteFileGroup::numFiles, Comparator.reverseOrder());
      default:
        return (fileGroupOne, fileGroupTwo) -> 0;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/Avro.java`
#### Snippet
```java
      Preconditions.checkState(
          rowSchema != null, "Cannot create equality delete file without a schema");
      Preconditions.checkState(
          equalityFieldIds != null, "Cannot create equality delete file without delete field ids");
      Preconditions.checkState(
          createWriterFunc != null,
          "Cannot create equality delete file unless createWriterFunc is set");
      Preconditions.checkArgument(
          spec != null, "Spec must not be null when creating equality delete writer");
      Preconditions.checkArgument(
          spec.isUnpartitioned() || partition != null,
          "Partition must not be null for partitioned writes");

      meta("delete-type", "equality");
      meta(
          "delete-field-ids",
          IntStream.of(equalityFieldIds)
              .mapToObj(Objects::toString)
              .collect(Collectors.joining(", ")));

      // the appender uses the row schema without extra columns
      appenderBuilder.schema(rowSchema);
      appenderBuilder.createWriterFunc(createWriterFunc);
      appenderBuilder.createContextFunc(WriteBuilder.Context::deleteContext);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/Avro.java`
#### Snippet
```java
      Preconditions.checkState(
          equalityFieldIds == null, "Cannot create position delete file using delete field ids");
      Preconditions.checkArgument(
          spec != null, "Spec must not be null when creating position delete writer");
      Preconditions.checkArgument(
          spec.isUnpartitioned() || partition != null,
          "Partition must not be null for partitioned writes");
      Preconditions.checkArgument(
          rowSchema == null || createWriterFunc != null,
          "Create function should be provided if we write row data");

      meta("delete-type", "position");
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/GenericAvroWriter.java`
#### Snippet
```java
      Preconditions.checkArgument(
          options.contains(ValueWriters.nulls()),
          "Cannot create writer for non-option union: %s",
          union);
      Preconditions.checkArgument(
          options.size() == 2, "Cannot create writer for non-option union: %s", union);
      if (union.getTypes().get(0).getType() == Schema.Type.NULL) {
        return ValueWriters.option(0, options.get(1));
      } else {
        return ValueWriters.option(1, options.get(0));
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/PruneColumns.java`
#### Snippet
```java
    Schema copy =
        Schema.createRecord(
            record.getName(), record.getDoc(), record.getNamespace(), record.isError(), newFields);

    for (Map.Entry<String, Object> prop : record.getObjectProps().entrySet()) {
      copy.addProp(prop.getKey(), prop.getValue());
    }

    return copy;
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
      if (reuse instanceof Map) {
        this.lastMap = (Map<?, ?>) reuse;
      } else {
        this.lastMap = null;
      }

      Map<K, V> resultMap;
      if (lastMap != null) {
        lastMap.clear();
        resultMap = (Map<K, V>) lastMap;
      } else {
        resultMap = Maps.newLinkedHashMap();
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/ValueReaders.java`
#### Snippet
```java
        for (long i = 0; i < chunkLength; i += 1) {
          K key;
          V value;
          if (kvIter.hasNext()) {
            Map.Entry<?, ?> last = kvIter.next();
            key = keyReader.read(decoder, last.getKey());
            value = valueReader.read(decoder, last.getValue());
          } else {
            key = keyReader.read(decoder, null);
            value = valueReader.read(decoder, null);
          }
          resultMap.put(key, value);
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/avro/ValueWriters.java`
#### Snippet
```java
      Iterator<Map.Entry<K, V>> iter = map.entrySet().iterator();
      for (int i = 0; i < numElements; i += 1) {
        encoder.startItem();
        Map.Entry<K, V> entry = iter.next();
        keyWriter.write(entry.getKey(), encoder);
        valueWriter.write(entry.getValue(), encoder);
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/encryption/Ciphers.java`
#### Snippet
```java
      Preconditions.checkArgument(keyBytes != null, "Key can't be null");
      int keyLength = keyBytes.length;
      Preconditions.checkArgument(
          (keyLength == 16 || keyLength == 24 || keyLength == 32),
          "Cannot use a key of length "
              + keyLength
              + " because AES only allows 16, 24 or 32 bytes");
      this.aesKey = new SecretKeySpec(keyBytes, "AES");

      try {
        this.cipher = Cipher.getInstance("AES/GCM/NoPadding");
      } catch (GeneralSecurityException e) {
        throw new RuntimeException("Failed to create GCM cipher", e);
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/io/MultiBufferInputStream.java`
#### Snippet
```java
        int bytesToCopy;
        ByteBuffer copyBuffer;
        if (current.remaining() <= out.remaining()) {
          // copy all of the current buffer
          bytesToCopy = current.remaining();
          copyBuffer = current;
        } else {
          // copy a slice of the current buffer
          bytesToCopy = out.remaining();
          copyBuffer = current.duplicate();
          copyBuffer.limit(copyBuffer.position() + bytesToCopy);
          current.position(copyBuffer.position() + bytesToCopy);
        }

        out.put(copyBuffer);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/org/apache/iceberg/rest/requests/CreateNamespaceRequest.java`
#### Snippet
```java
      Preconditions.checkNotNull(props, "Invalid collection of properties: null");
      Preconditions.checkArgument(!props.containsKey(null), "Invalid property: null");
      Preconditions.checkArgument(
          !props.containsValue(null),
          "Invalid value for properties %s: null",
          Maps.filterValues(props, Objects::isNull).keySet());
      properties.putAll(props);
      return this;
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/FlinkFilters.java`
#### Snippet
```java
    List<ResolvedExpression> args = call.getResolvedChildren();
    if (args.size() != 2) {
      return Optional.empty();
    }

    org.apache.flink.table.expressions.Expression left = args.get(0);
    org.apache.flink.table.expressions.Expression right = args.get(1);
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      Map<Integer, ParquetValueReader<?>> readersById = Maps.newHashMap();
      Map<Integer, Type> typesById = Maps.newHashMap();
      Map<Integer, Integer> maxDefinitionLevelsById = Maps.newHashMap();
      List<Type> fields = struct.getFields();
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
          int fieldD = type.getMaxDefinitionLevel(path(fieldType.getName())) - 1;
          if (fieldType.getId() != null) {
            int id = fieldType.getId().intValue();
            readersById.put(id, ParquetValueReaders.option(fieldType, fieldD, fieldReaders.get(i)));
            typesById.put(id, fieldType);
            if (idToConstant.containsKey(id)) {
              maxDefinitionLevelsById.put(id, fieldD);
            }
          }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkParquetReaders.java`
#### Snippet
```java
        if (fieldType.getId() != null) {
          int id = fieldType.getId().intValue();
          readersById.put(id, ParquetValueReaders.option(fieldType, fieldD, fieldReaders.get(i)));
          typesById.put(id, fieldType);
          if (idToConstant.containsKey(id)) {
            maxDefinitionLevelsById.put(id, fieldD);
          }
        }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      List<Types.NestedField> expectedFields =
          expected != null ? expected.fields() : ImmutableList.of();
      List<ParquetValueReader<?>> reorderedFields =
          Lists.newArrayListWithExpectedSize(expectedFields.size());
      List<Type> types = Lists.newArrayListWithExpectedSize(expectedFields.size());
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvroValueReaders.java`
#### Snippet
```java
        ParquetValueReader<?> reader = readersById.get(id);
        if (reader != null) {
          reorderedFields.add(reader);
          types.add(typesById.get(id));
        } else {
          reorderedFields.add(ParquetValueReaders.nulls());
          types.add(null);
        }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      if (expectedList == null) {
        return null;
      }

      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath) - 1;
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath) - 1;

      Type elementType = ParquetSchemaUtil.determineListElementType(array);
      int elementD = type.getMaxDefinitionLevel(path(elementType.getName())) - 1;
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvroValueReaders.java`
#### Snippet
```java
      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath) - 1;
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath) - 1;

      Type elementType = ParquetSchemaUtil.determineListElementType(array);
      int elementD = type.getMaxDefinitionLevel(path(elementType.getName())) - 1;
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      if (expectedMap == null) {
        return null;
      }

      GroupType repeatedKeyValue = map.getFields().get(0).asGroupType();
      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath) - 1;
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath) - 1;

      Type keyType = repeatedKeyValue.getType(0);
      int keyD = type.getMaxDefinitionLevel(path(keyType.getName())) - 1;
      Type valueType = repeatedKeyValue.getType(1);
      int valueD = type.getMaxDefinitionLevel(path(valueType.getName())) - 1;
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvroValueReaders.java`
#### Snippet
```java
      GroupType repeatedKeyValue = map.getFields().get(0).asGroupType();
      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath) - 1;
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath) - 1;

      Type keyType = repeatedKeyValue.getType(0);
      int keyD = type.getMaxDefinitionLevel(path(keyType.getName())) - 1;
      Type valueType = repeatedKeyValue.getType(1);
      int valueD = type.getMaxDefinitionLevel(path(valueType.getName())) - 1;

      return new MapReader<>(
          repeatedD,
          repeatedR,
          ParquetValueReaders.option(keyType, keyD, keyReader),
          ParquetValueReaders.option(valueType, valueD, valueReader));
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetReaders.java`
#### Snippet
```java
      Map.Entry<K, V> kv = nullEntry;
      if (readPos < map.capacity()) {
        entry.set((K) map.keys.values[readPos], (V) map.values.values[readPos]);
        kv = entry;
      }

      readPos += 1;

      return kv;
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkParquetWriters.java`
#### Snippet
```java
            switch (primitive.getPrimitiveTypeName()) {
              case INT32:
                return decimalAsInteger(desc, decimal.getPrecision(), decimal.getScale());
              case INT64:
                return decimalAsLong(desc, decimal.getPrecision(), decimal.getScale());
              case BINARY:
              case FIXED_LEN_BYTE_ARRAY:
                return decimalAsFixed(desc, decimal.getPrecision(), decimal.getScale());
              default:
                throw new UnsupportedOperationException(
                    "Unsupported base type for decimal: " + primitive.getPrimitiveTypeName());
            }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkValueReaders.java`
#### Snippet
```java
      reusedList.clear();
      long chunkLength = decoder.readArrayStart();

      while (chunkLength > 0) {
        for (int i = 0; i < chunkLength; i += 1) {
          reusedList.add(elementReader.read(decoder, null));
        }

        chunkLength = decoder.arrayNext();
      }

      // this will convert the list to an array so it is okay to reuse the list
      return new GenericArrayData(reusedList.toArray());
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkValueReaders.java`
#### Snippet
```java
      reusedKeyList.clear();
      reusedValueList.clear();

      long chunkLength = decoder.readArrayStart();

      while (chunkLength > 0) {
        for (int i = 0; i < chunkLength; i += 1) {
          reusedKeyList.add(keyReader.read(decoder, null));
          reusedValueList.add(valueReader.read(decoder, null));
        }

        chunkLength = decoder.arrayNext();
      }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkValueReaders.java`
#### Snippet
```java
      reusedKeyList.clear();
      reusedValueList.clear();

      long chunkLength = decoder.readMapStart();

      while (chunkLength > 0) {
        for (int i = 0; i < chunkLength; i += 1) {
          reusedKeyList.add(keyReader.read(decoder, null));
          reusedValueList.add(valueReader.read(decoder, null));
        }

        chunkLength = decoder.mapNext();
      }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/FlinkValueWriters.java`
#### Snippet
```java
      ArrayData keyArray = map.keyArray();
      ArrayData valueArray = map.valueArray();
      for (int i = 0; i < numElements; i += 1) {
        encoder.startItem();
        keyWriter.write((K) keyGetter.getElementOrNull(keyArray, i), encoder);
        valueWriter.write((V) valueGetter.getElementOrNull(valueArray, i), encoder);
      }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/data/ParquetWithFlinkSchemaVisitor.java`
#### Snippet
```java
            try {
              T keyResult = null;
              T valueResult = null;
              switch (repeatedKeyValue.getFieldCount()) {
                case 2:
                  // if there are 2 fields, both key and value are projected
                  keyResult = visitField(keyField, repeatedKeyValue.getType(0), visitor);
                  valueResult = visitField(valueField, repeatedKeyValue.getType(1), visitor);
                  break;
                case 1:
                  // if there is just one, use the name to determine what it is
                  Type keyOrValue = repeatedKeyValue.getType(0);
                  if (keyOrValue.getName().equalsIgnoreCase("key")) {
                    keyResult = visitField(keyField, keyOrValue, visitor);
                    // value result remains null
                  } else {
                    valueResult = visitField(valueField, keyOrValue, visitor);
                    // key result remains null
                  }
                  break;
                default:
                  // both results will remain null
              }

              return visitor.map(map, group, keyResult, valueResult);

            } finally {
              visitor.fieldNames.pop();
            }
```

### DuplicatedCode
Duplicated code
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/FlinkFileWriterFactory.java`
#### Snippet
```java
      this.table = table;

      Map<String, String> properties = table.properties();

      String dataFileFormatName =
          properties.getOrDefault(DEFAULT_FILE_FORMAT, DEFAULT_FILE_FORMAT_DEFAULT);
      this.dataFileFormat = FileFormat.fromString(dataFileFormatName);

      String deleteFileFormatName =
          properties.getOrDefault(DELETE_DEFAULT_FILE_FORMAT, dataFileFormatName);
      this.deleteFileFormat = FileFormat.fromString(deleteFileFormatName);
```

### DuplicatedCode
Duplicated code
in `orc/src/main/java/org/apache/iceberg/data/orc/GenericOrcReaders.java`
#### Snippet
```java
      ListColumnVector listVector = (ListColumnVector) vector;
      int offset = (int) listVector.offsets[row];
      int length = (int) listVector.lengths[row];
      List<Object> elements = Lists.newArrayListWithExpectedSize(length);
      for (int c = 0; c < length; ++c) {
        elements.add(elementReader.read(listVector.child, offset + c));
      }
```

### DuplicatedCode
Duplicated code
in `orc/src/main/java/org/apache/iceberg/data/orc/GenericOrcWriters.java`
#### Snippet
```java
      switch (index) {
        case 0:
          return pathTransformFunc.apply(delete.path());
        case 1:
          return delete.pos();
        case 2:
          return delete.row();
      }
      throw new IllegalArgumentException("Cannot get value for invalid index: " + index);
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetWriter.java`
#### Snippet
```java
      List<Type> fields = struct.getFields();
      List<ParquetValueWriter<?>> writers = Lists.newArrayListWithExpectedSize(fieldWriters.size());
      for (int i = 0; i < fields.size(); i += 1) {
        Type fieldType = struct.getType(i);
        int fieldD = type.getMaxDefinitionLevel(path(fieldType.getName()));
        writers.add(ParquetValueWriters.option(fieldType, fieldD, fieldWriters.get(i)));
      }
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetWriter.java`
#### Snippet
```java
      GroupType repeated = array.getFields().get(0).asGroupType();
      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath);
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath);

      Type elementType = repeated.getType(0);
      int elementD = type.getMaxDefinitionLevel(path(elementType.getName()));

      return ParquetValueWriters.collections(
          repeatedD, repeatedR, ParquetValueWriters.option(elementType, elementD, elementWriter));
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetWriter.java`
#### Snippet
```java
      GroupType repeatedKeyValue = map.getFields().get(0).asGroupType();
      String[] repeatedPath = currentPath();

      int repeatedD = type.getMaxDefinitionLevel(repeatedPath);
      int repeatedR = type.getMaxRepetitionLevel(repeatedPath);

      Type keyType = repeatedKeyValue.getType(0);
      int keyD = type.getMaxDefinitionLevel(path(keyType.getName()));
      Type valueType = repeatedKeyValue.getType(1);
      int valueD = type.getMaxDefinitionLevel(path(valueType.getName()));

      return ParquetValueWriters.maps(
          repeatedD,
          repeatedR,
          ParquetValueWriters.option(keyType, keyD, keyWriter),
          ParquetValueWriters.option(valueType, valueD, valueWriter));
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/data/parquet/BaseParquetWriter.java`
#### Snippet
```java
      switch (primitive.getPrimitiveTypeName()) {
        case FIXED_LEN_BYTE_ARRAY:
          return new FixedWriter(desc);
        case BINARY:
          return ParquetValueWriters.byteBuffers(desc);
        case BOOLEAN:
          return ParquetValueWriters.booleans(desc);
        case INT32:
          return ParquetValueWriters.ints(desc);
        case INT64:
          return ParquetValueWriters.longs(desc);
        case FLOAT:
          return ParquetValueWriters.floats(desc);
        case DOUBLE:
          return ParquetValueWriters.doubles(desc);
        default:
          throw new UnsupportedOperationException("Unsupported type: " + primitive);
      }
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/Parquet.java`
#### Snippet
```java
        Preconditions.checkArgument(
            rowGroupCheckMaxRecordCount > 0, "Row group check maximum record count must be > 0");
        Preconditions.checkArgument(
            rowGroupCheckMaxRecordCount >= rowGroupCheckMinRecordCount,
            "Row group check maximum record count must be >= minimal record count");

        int bloomFilterMaxBytes =
            PropertyUtil.propertyAsInt(
                config, PARQUET_BLOOM_FILTER_MAX_BYTES, PARQUET_BLOOM_FILTER_MAX_BYTES_DEFAULT);
        Preconditions.checkArgument(bloomFilterMaxBytes > 0, "bloom Filter Max Bytes must be > 0");

        Map<String, String> columnBloomFilterEnabled =
            PropertyUtil.propertiesWithPrefix(config, PARQUET_BLOOM_FILTER_COLUMN_ENABLED_PREFIX);

        boolean dictionaryEnabled =
            PropertyUtil.propertyAsBoolean(config, ParquetOutputFormat.ENABLE_DICTIONARY, true);

        return new Context(
            rowGroupSize,
            pageSize,
            pageRowLimit,
            dictionaryPageSize,
            codec,
            compressionLevel,
            rowGroupCheckMinRecordCount,
            rowGroupCheckMaxRecordCount,
            bloomFilterMaxBytes,
            columnBloomFilterEnabled,
            dictionaryEnabled);
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvroValueReaders.java`
#### Snippet
```java
        Type fieldType = fields.get(i);
        int fieldD = type.getMaxDefinitionLevel(path(fieldType.getName())) - 1;
        int id = fieldType.getId().intValue();
        readersById.put(id, ParquetValueReaders.option(fieldType, fieldD, fieldReaders.get(i)));
        typesById.put(id, fieldType);
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetMetricsRowGroupFilter.java`
#### Snippet
```java
      int id = ref.fieldId();

      // When filtering nested types notNull() is implicit filter passed even though complex
      // filters aren't pushed down in Parquet. Leave all nested column type filters to be
      // evaluated post scan.
      if (schema.findType(id) instanceof Type.NestedType) {
        return ROWS_MIGHT_MATCH;
      }

      Long valueCount = valueCounts.get(id);
      if (valueCount == null) {
        // the column is not present and is all nulls
        return ROWS_CANNOT_MATCH;
      }

      Statistics<?> colStats = stats.get(id);
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetMetricsRowGroupFilter.java`
#### Snippet
```java
        if (allNulls(colStats, valueCount)) {
          return ROWS_CANNOT_MATCH;
        }

        if (minMaxUndefined(colStats)) {
          return ROWS_MIGHT_MATCH;
        }

        T lower = min(colStats, id);
        int cmp = lit.comparator().compare(lower, lit.value());
        if (cmp > 0) {
          return ROWS_CANNOT_MATCH;
        }
```

### DuplicatedCode
Duplicated code
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetReader.java`
#### Snippet
```java
      while (shouldSkip[nextRowGroup]) {
        nextRowGroup += 1;
        reader.skipNextRowGroup();
      }

      PageReadStore pages;
      try {
        pages = reader.readNextRowGroup();
      } catch (IOException e) {
        throw new RuntimeIOException(e);
      }

      long rowPosition = rowGroupsStartRowPos[nextRowGroup];
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark-extensions/src/jmh/java/org/apache/iceberg/spark/MergeCardinalityCheckBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
      Dataset<Row> inputDF =
          spark
              .range(NUM_ROWS_PER_FILE)
              .withColumn("intCol", expr("CAST(id AS INT)"))
              .withColumn("floatCol", expr("CAST(id AS FLOAT)"))
              .withColumn("doubleCol", expr("CAST(id AS DOUBLE)"))
              .withColumn("decimalCol", expr("CAST(id AS DECIMAL(20, 5))"))
              .withColumn("dateCol", date_add(current_date(), fileNum))
              .withColumn("timestampCol", expr("TO_TIMESTAMP(dateCol)"))
              .withColumn("stringCol", expr("CAST(dateCol AS STRING)"));
      appendAsFile(inputDF);
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
    dataFile.delete();
    List<GenericData.Record> records = RandomData.generateList(SCHEMA, NUM_RECORDS, 0L);
    try (FileAppender<GenericData.Record> writer =
        Parquet.write(Files.localOutput(dataFile)).schema(SCHEMA).named("benchmark").build()) {
      writer.addAll(records);
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
    try (CloseableIterable<InternalRow> rows =
        Parquet.read(Files.localInput(dataFile))
            .project(SCHEMA)
            .createReaderFunc(type -> SparkParquetReaders.buildReader(SCHEMA, type))
            .build()) {

      Iterable<InternalRow> unsafeRows =
          Iterables.transform(
              rows, APPLY_PROJECTION.bind(SparkBenchmarkUtil.projection(SCHEMA, SCHEMA))::invoke);

      for (InternalRow row : unsafeRows) {
        blackhole.consume(row);
      }
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
    StructType sparkSchema = SparkSchemaUtil.convert(SCHEMA);
    try (CloseableIterable<InternalRow> rows =
        Parquet.read(Files.localInput(dataFile))
            .project(SCHEMA)
            .readSupport(new ParquetReadSupport())
            .set("org.apache.spark.sql.parquet.row.requested_schema", sparkSchema.json())
            .set("spark.sql.parquet.binaryAsString", "false")
            .set("spark.sql.parquet.int96AsTimestamp", "false")
            .set("spark.sql.caseSensitive", "false")
            .set("spark.sql.parquet.fieldId.write.enabled", "false")
            .set("spark.sql.parquet.inferTimestampNTZ.enabled", "false")
            .set("spark.sql.legacy.parquet.nanosAsLong", "false")
            .callInit()
            .build()) {

      for (InternalRow row : rows) {
        blackhole.consume(row);
      }
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetReadersFlatDataBenchmark.java`
#### Snippet
```java
    StructType sparkSchema = SparkSchemaUtil.convert(PROJECTED_SCHEMA);
    try (CloseableIterable<InternalRow> rows =
        Parquet.read(Files.localInput(dataFile))
            .project(PROJECTED_SCHEMA)
            .readSupport(new ParquetReadSupport())
            .set("org.apache.spark.sql.parquet.row.requested_schema", sparkSchema.json())
            .set("spark.sql.parquet.binaryAsString", "false")
            .set("spark.sql.parquet.int96AsTimestamp", "false")
            .set("spark.sql.caseSensitive", "false")
            .set("spark.sql.parquet.inferTimestampNTZ.enabled", "false")
            .set("spark.sql.legacy.parquet.nanosAsLong", "false")
            .callInit()
            .build()) {

      for (InternalRow row : rows) {
        blackhole.consume(row);
      }
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/data/parquet/SparkParquetWritersFlatDataBenchmark.java`
#### Snippet
```java
    StructType sparkSchema = SparkSchemaUtil.convert(SCHEMA);
    try (FileAppender<InternalRow> writer =
        Parquet.write(Files.localOutput(dataFile))
            .writeSupport(new ParquetWriteSupport())
            .set("org.apache.spark.sql.parquet.row.attributes", sparkSchema.json())
            .set("spark.sql.parquet.writeLegacyFormat", "false")
            .set("spark.sql.parquet.binaryAsString", "false")
            .set("spark.sql.parquet.int96AsTimestamp", "false")
            .set("spark.sql.parquet.outputTimestampType", "TIMESTAMP_MICROS")
            .set("spark.sql.caseSensitive", "false")
            .set("spark.sql.parquet.fieldId.write.enabled", "false")
            .schema(SCHEMA)
            .build()) {

      writer.addAll(rows);
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/WritersBenchmark.java`
#### Snippet
```java
    FileIO io = table().io();

    OutputFileFactory fileFactory = newFileFactory();
    SparkFileWriterFactory writerFactory =
        SparkFileWriterFactory.builderFor(table()).dataFileFormat(fileFormat()).build();

    FanoutPositionOnlyDeleteWriter<InternalRow> writer =
        new FanoutPositionOnlyDeleteWriter<>(
            writerFactory, fileFactory, io, TARGET_FILE_SIZE_IN_BYTES);

    PositionDelete<InternalRow> positionDelete = PositionDelete.create();
    try (FanoutPositionOnlyDeleteWriter<InternalRow> closeableWriter = writer) {
      for (InternalRow row : positionDeleteRows) {
        String path = row.getString(0);
        long pos = row.getLong(1);
        positionDelete.set(path, pos, null);
        closeableWriter.write(positionDelete, unpartitionedSpec, null);
      }
    }

    blackhole.consume(writer);
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> tableProperties = Maps.newHashMap();
    tableProperties.put(SPLIT_OPEN_FILE_COST, Integer.toString(128 * 1024 * 1024));
    withTableProperties(
        tableProperties,
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().format("avro").load(dataLocation());
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> tableProperties = Maps.newHashMap();
    tableProperties.put(SPLIT_OPEN_FILE_COST, Integer.toString(128 * 1024 * 1024));
    withTableProperties(
        tableProperties,
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("longCol");
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
          for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
            Dataset<Row> df =
                spark()
                    .range(NUM_ROWS)
                    .withColumnRenamed("id", "longCol")
                    .withColumn("intCol", expr("CAST(longCol AS INT)"))
                    .withColumn("floatCol", expr("CAST(longCol AS FLOAT)"))
                    .withColumn("doubleCol", expr("CAST(longCol AS DOUBLE)"))
                    .withColumn("decimalCol", expr("CAST(longCol AS DECIMAL(20, 5))"))
                    .withColumn("dateCol", date_add(current_date(), fileNum))
                    .withColumn("timestampCol", expr("TO_TIMESTAMP(dateCol)"))
                    .withColumn("stringCol", expr("CAST(dateCol AS STRING)"));
            appendAsFile(df);
          }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS)
              .withColumnRenamed("id", "longCol")
              .withColumn("intCol", expr("CAST(longCol AS INT)"))
              .withColumn("floatCol", expr("CAST(longCol AS FLOAT)"))
              .withColumn("doubleCol", expr("CAST(longCol AS DOUBLE)"))
              .withColumn("decimalCol", expr("CAST(longCol AS DECIMAL(20, 5))"))
              .withColumn("dateCol", date_add(current_date(), fileNum))
              .withColumn("timestampCol", expr("TO_TIMESTAMP(dateCol)"))
              .withColumn("stringCol", expr("CAST(dateCol AS STRING)"));
      appendAsFile(df);
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> tableProperties = Maps.newHashMap();
    tableProperties.put(SPLIT_OPEN_FILE_COST, Integer.toString(128 * 1024 * 1024));
    withTableProperties(
        tableProperties,
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df =
              spark()
                  .read()
                  .option(SparkReadOptions.VECTORIZATION_ENABLED, "true")
                  .format("iceberg")
                  .load(tableLocation);
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.ORC_VECTORIZED_READER_ENABLED().key(), "false");
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation());
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> tableProperties = Maps.newHashMap();
    tableProperties.put(SPLIT_OPEN_FILE_COST, Integer.toString(128 * 1024 * 1024));
    withTableProperties(
        tableProperties,
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).selectExpr("nested.col3");
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
    Map<String, String> tableProperties = Maps.newHashMap();
    tableProperties.put(SPLIT_OPEN_FILE_COST, Integer.toString(128 * 1024 * 1024));
    withTableProperties(
        tableProperties,
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter(FILTER_COND);
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.PARQUET_VECTORIZED_READER_ENABLED().key(), "true");
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.PARQUET_VECTORIZED_READER_ENABLED().key(), "false");
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.PARQUET_VECTORIZED_READER_ENABLED().key(), "true");
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
    Map<String, String> conf = Maps.newHashMap();
    conf.put(SQLConf.PARQUET_VECTORIZED_READER_ENABLED().key(), "false");
    conf.put(SQLConf.FILES_OPEN_COST_IN_BYTES().key(), Integer.toString(128 * 1024 * 1024));
    withSQLConf(
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/PruneColumnsWithReordering.java`
#### Snippet
```java
    Preconditions.checkArgument(current instanceof StructType, "Not a struct: %s", current);
    StructType requestedStruct = (StructType) current;

    // fields are resolved by name because Spark only sees the current table schema.
    if (requestedStruct.getFieldIndex(field.name()).isEmpty()) {
      // make sure that filter fields are projected even if they aren't in the requested schema.
      if (filterRefs.contains(field.fieldId())) {
        return field.type();
      }
      return null;
    }

    int fieldIndex = requestedStruct.fieldIndex(field.name());
    StructField requestedField = requestedStruct.fields()[fieldIndex];

    Preconditions.checkArgument(
        requestedField.nullable() || field.isRequired(),
        "Cannot project an optional field as non-null: %s",
        field.name());

    this.current = requestedField.dataType();
    try {
      return fieldResult.get();
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException(
          "Invalid projection for field " + field.name() + ": " + e.getMessage(), e);
    } finally {
      this.current = requestedStruct;
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/PruneColumnsWithReordering.java`
#### Snippet
```java
    Preconditions.checkArgument(current instanceof ArrayType, "Not an array: %s", current);
    ArrayType requestedArray = (ArrayType) current;

    Preconditions.checkArgument(
        requestedArray.containsNull() || !list.isElementOptional(),
        "Cannot project an array of optional elements as required elements: %s",
        requestedArray);

    this.current = requestedArray.elementType();
    try {
      Type elementType = elementResult.get();
      if (list.elementType() == elementType) {
        return list;
      }

      // must be a projected element type, create a new list
      if (list.isElementOptional()) {
        return Types.ListType.ofOptional(list.elementId(), elementType);
      } else {
        return Types.ListType.ofRequired(list.elementId(), elementType);
      }
    } finally {
      this.current = requestedArray;
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/PruneColumnsWithReordering.java`
#### Snippet
```java
    this.current = requestedMap.valueType();
    try {
      Type valueType = valueResult.get();
      if (map.valueType() == valueType) {
        return map;
      }

      if (map.isValueOptional()) {
        return Types.MapType.ofOptional(map.keyId(), map.valueId(), map.keyType(), valueType);
      } else {
        return Types.MapType.ofRequired(map.keyId(), map.valueId(), map.keyType(), valueType);
      }
    } finally {
      this.current = requestedMap;
    }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCachedTableCatalog.java`
#### Snippet
```java
      Matcher timeBasedMatcher = AT_TIMESTAMP.matcher(meta);
      if (timeBasedMatcher.matches()) {
        asOfTimestamp = Long.parseLong(timeBasedMatcher.group(1));
        continue;
      }

      Matcher snapshotBasedMatcher = SNAPSHOT_ID.matcher(meta);
      if (snapshotBasedMatcher.matches()) {
        snapshotId = Long.parseLong(snapshotBasedMatcher.group(1));
        continue;
      }

      Matcher branchBasedMatcher = BRANCH.matcher(meta);
      if (branchBasedMatcher.matches()) {
        branch = branchBasedMatcher.group(1);
        continue;
      }

      Matcher tagBasedMatcher = TAG.matcher(meta);
      if (tagBasedMatcher.matches()) {
        tag = tagBasedMatcher.group(1);
      }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkFilters.java`
#### Snippet
```java
            And andFilter = (And) filter;
            Expression left = convert(andFilter.left());
            Expression right = convert(andFilter.right());
            if (left != null && right != null) {
              return and(left, right);
            }
            return null;
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkFilters.java`
#### Snippet
```java
            Or orFilter = (Or) filter;
            Expression left = convert(orFilter.left());
            Expression right = convert(orFilter.right());
            if (left != null && right != null) {
              return or(left, right);
            }
            return null;
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkFilters.java`
#### Snippet
```java
    if (op != null) {
      switch (op) {
        case AND:
          And andFilter = (And) filter;
          return hasNoInFilter(andFilter.left()) && hasNoInFilter(andFilter.right());
        case OR:
          Or orFilter = (Or) filter;
          return hasNoInFilter(orFilter.left()) && hasNoInFilter(orFilter.right());
        case NOT:
          Not notFilter = (Not) filter;
          return hasNoInFilter(notFilter.child());
        case IN:
          return false;
        default:
          return true;
      }
    }

    return false;
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
        Dataset<Row> existingFiles =
            loadMetadataTable(spark, targetTable, MetadataTableType.ENTRIES).filter("status != 2");
        Column joinCond =
            existingFiles.col("data_file.file_path").equalTo(importedFiles.col("file_path"));
        Dataset<String> duplicates =
            importedFiles.join(existingFiles, joinCond).select("file_path").as(Encoders.STRING());
        Preconditions.checkState(
            duplicates.isEmpty(),
            String.format(
                DUPLICATE_FILE_MESSAGE, Joiner.on(",").join((String[]) duplicates.take(10))));
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkV2Filters.java`
#### Snippet
```java
          if (isRef(leftChild(predicate)) && isLiteral(rightChild(predicate))) {
            String columnName = SparkUtil.toColumnName(leftChild(predicate));
            return lessThan(columnName, convertLiteral(rightChild(predicate)));
          } else if (isRef(rightChild(predicate)) && isLiteral(leftChild(predicate))) {
            String columnName = SparkUtil.toColumnName(rightChild(predicate));
            return greaterThan(columnName, convertLiteral(leftChild(predicate)));
          } else {
            return null;
          }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkV2Filters.java`
#### Snippet
```java
          if (isRef(leftChild(predicate)) && isLiteral(rightChild(predicate))) {
            String columnName = SparkUtil.toColumnName(leftChild(predicate));
            return lessThanOrEqual(columnName, convertLiteral(rightChild(predicate)));
          } else if (isRef(rightChild(predicate)) && isLiteral(leftChild(predicate))) {
            String columnName = SparkUtil.toColumnName(rightChild(predicate));
            return greaterThanOrEqual(columnName, convertLiteral(leftChild(predicate)));
          } else {
            return null;
          }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteDataFilesSparkAction.java`
#### Snippet
```java
    try {
      commitManager.commitOrClean(Sets.newHashSet(rewrittenGroups));
    } catch (ValidationException | CommitFailedException e) {
      String errorMessage =
          String.format(
              "Cannot commit rewrite because of a ValidationException or CommitFailedException. This usually means that "
                  + "this rewrite has conflicted with another concurrent Iceberg operation. To reduce the likelihood of "
                  + "conflicts, set %s which will break up the rewrite into multiple smaller commits controlled by %s. "
                  + "Separate smaller rewrite commits can succeed independently while any commits that conflict with "
                  + "another Iceberg operation will be ignored. This mode will create additional snapshots in the table "
                  + "history, one for each commit.",
              PARTIAL_PROGRESS_ENABLED, PARTIAL_PROGRESS_MAX_COMMITS);
      throw new RuntimeException(errorMessage, e);
    }

    List<FileGroupRewriteResult> rewriteResults =
        rewrittenGroups.stream().map(RewriteFileGroup::asResult).collect(Collectors.toList());
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteDataFilesSparkAction.java`
#### Snippet
```java
    Set<String> validOptions = Sets.newHashSet(rewriter.validOptions());
    validOptions.addAll(VALID_OPTIONS);

    Set<String> invalidKeys = Sets.newHashSet(options().keySet());
    invalidKeys.removeAll(validOptions);

    Preconditions.checkArgument(
        invalidKeys.isEmpty(),
        "Cannot use options %s, they are not supported by the action or the rewriter %s",
        invalidKeys,
        rewriter.description());

    rewriter.init(options());
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkValueWriters.java`
#### Snippet
```java
      int numElements = map.numElements();
      encoder.setItemCount(numElements);
      ArrayData keyArray = map.keyArray();
      ArrayData valueArray = map.valueArray();
      for (int i = 0; i < numElements; i += 1) {
        encoder.startItem();
        keyWriter.write((K) keyArray.get(i, keyType), encoder);
        valueWriter.write((V) valueArray.get(i, valueType), encoder);
      }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkValueWriters.java`
#### Snippet
```java
      ArrayData keyArray = map.keyArray();
      ArrayData valueArray = map.valueArray();
      for (int i = 0; i < numElements; i += 1) {
        encoder.startItem();
        keyWriter.write((K) keyArray.get(i, keyType), encoder);
        valueWriter.write((V) valueArray.get(i, valueType), encoder);
      }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkBatch.java`
#### Snippet
```java
    InputPartition[] partitions = new InputPartition[taskGroups.size()];

    Tasks.range(partitions.length)
        .stopOnFailure()
        .executeWith(localityEnabled ? ThreadPools.getWorkerPool() : null)
        .run(
            index ->
                partitions[index] =
                    new SparkInputPartition(
                        groupingKeyType,
                        taskGroups.get(index),
                        tableBroadcast,
                        branch,
                        expectedSchemaString,
                        caseSensitive,
                        localityEnabled));

    return partitions;
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeltaWrite.java`
#### Snippet
```java
      if (wapEnabled && wapId != null) {
        // write-audit-publish is enabled for this table and job
        // stage the changes without changing the current snapshot
        operation.set(SnapshotSummary.STAGED_WAP_ID_PROP, wapId);
        operation.stageOnly();
      }

      if (branch != null) {
        operation.toBranch(branch);
      }

      try {
        long start = System.currentTimeMillis();
        operation.commit(); // abort is automatically called if this fails
        long duration = System.currentTimeMillis() - start;
        LOG.info("Committed in {} ms", duration);
      } catch (CommitStateUnknownException commitStateUnknownException) {
        cleanupOnAbort = false;
        throw commitStateUnknownException;
      }
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeltaWrite.java`
#### Snippet
```java
      int specId = metadata.getInt(specIdOrdinal);
      PartitionSpec spec = specs.get(specId);

      InternalRow partition = metadata.getStruct(partitionOrdinal, partitionRowWrapper.size());
      StructProjection partitionProjection = partitionProjections.get(specId);
      partitionProjection.wrap(partitionRowWrapper.wrap(partition));

      String file = id.getString(fileOrdinal);
      long position = id.getLong(positionOrdinal);
```

### DuplicatedCode
Duplicated code
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkRowLevelOperationBuilder.java`
#### Snippet
```java
    String modeName;

    switch (command) {
      case DELETE:
        modeName = properties.getOrDefault(DELETE_MODE, DELETE_MODE_DEFAULT);
        break;
      case UPDATE:
        modeName = properties.getOrDefault(UPDATE_MODE, UPDATE_MODE_DEFAULT);
        break;
      case MERGE:
        modeName = properties.getOrDefault(MERGE_MODE, MERGE_MODE_DEFAULT);
        break;
      default:
        throw new IllegalArgumentException("Unsupported command: " + command);
    }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return array but the return type is list
in `core/src/main/java/org/apache/iceberg/ManifestFilterManager.java`
#### Snippet
```java
   * @param tableSchema the current table schema
   * @param manifests a list of manifests to be filtered
   * @return an array of filtered manifests
   */
  List<ManifestFile> filterManifests(Schema tableSchema, List<ManifestFile> manifests) {
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `core/src/main/java/org/apache/iceberg/util/SnapshotUtil.java`
#### Snippet
```java
   *
   * @param table a {@link Table}
   * @return a set of snapshot IDs of the known ancestor snapshots, including the current ID
   */
  public static List<Long> currentAncestorIds(Table table) {
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
  private static InputStream uncheckedInputStream(File file) {
    try {
      return new FileInputStream(file);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
        digestOutputStream =
            new DigestOutputStream(
                new BufferedOutputStream(new FileOutputStream(currentStagingFile)),
                currentPartMessageDigest);
      } else {
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
            new DigestOutputStream(
                new DigestOutputStream(
                    new BufferedOutputStream(new FileOutputStream(currentStagingFile)),
                    currentPartMessageDigest),
                completeMessageDigest);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3OutputStream.java`
#### Snippet
```java
      stream =
          new CountingOutputStream(
              new BufferedOutputStream(new FileOutputStream(currentStagingFile)));
    }
  }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/OSSOutputStream.java`
#### Snippet
```java
  private static InputStream uncheckedInputStream(File file) {
    try {
      return new FileInputStream(file);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3MultipartUpload.java`
#### Snippet
```java
  @Before
  public void before() {
    String objectKey = String.format("%s/%s", prefix, UUID.randomUUID().toString());
    objectUri = String.format("s3://%s/%s", bucketName, objectKey);
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
  @Before
  public void before() {
    objectKey = String.format("%s/%s", prefix, UUID.randomUUID().toString());
    objectUri = String.format("s3://%s/%s", bucketName, objectKey);
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `orc/src/main/java/org/apache/iceberg/orc/ORCSchemaUtil.java`
#### Snippet
```java
                String.format(
                    "Field %d of type %s is required and was not found.",
                    fieldId, type.toString()));
          }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
  @BeforeClass
  public static void beforeClass() throws Exception {
    lfRegisterPathRoleName = LF_REGISTER_PATH_ROLE_PREFIX + UUID.randomUUID().toString();
    lfPrivilegedRoleName = LF_PRIVILEGED_ROLE_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleS3PolicyName =
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
  public static void beforeClass() throws Exception {
    lfRegisterPathRoleName = LF_REGISTER_PATH_ROLE_PREFIX + UUID.randomUUID().toString();
    lfPrivilegedRoleName = LF_PRIVILEGED_ROLE_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleS3PolicyName =
        LF_REGISTER_PATH_ROLE_S3_POLICY_PREFIX + UUID.randomUUID().toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
    lfPrivilegedRoleName = LF_PRIVILEGED_ROLE_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleS3PolicyName =
        LF_REGISTER_PATH_ROLE_S3_POLICY_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleLfPolicyName =
        LF_REGISTER_PATH_ROLE_LF_POLICY_PREFIX + UUID.randomUUID().toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
        LF_REGISTER_PATH_ROLE_S3_POLICY_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleLfPolicyName =
        LF_REGISTER_PATH_ROLE_LF_POLICY_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleIamPolicyName =
        LF_REGISTER_PATH_ROLE_IAM_POLICY_PREFIX + UUID.randomUUID().toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
        LF_REGISTER_PATH_ROLE_LF_POLICY_PREFIX + UUID.randomUUID().toString();
    lfRegisterPathRoleIamPolicyName =
        LF_REGISTER_PATH_ROLE_IAM_POLICY_PREFIX + UUID.randomUUID().toString();
    lfPrivilegedRolePolicyName = LF_PRIVILEGED_ROLE_POLICY_PREFIX + UUID.randomUUID().toString();

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `aws/src/integration/java/org/apache/iceberg/aws/lakeformation/LakeFormationTestBase.java`
#### Snippet
```java
    lfRegisterPathRoleIamPolicyName =
        LF_REGISTER_PATH_ROLE_IAM_POLICY_PREFIX + UUID.randomUUID().toString();
    lfPrivilegedRolePolicyName = LF_PRIVILEGED_ROLE_POLICY_PREFIX + UUID.randomUUID().toString();

    iam =
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/org/apache/iceberg/avro/ValueWriters.java`
#### Snippet
```java
      } else {
        throw new IllegalArgumentException(
            "Cannot write unknown string type: " + s.getClass().getName() + ": " + s.toString());
      }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
    TableMetadataParser.Codec codec = TableMetadataParser.Codec.fromName(codecName);
    String fileExtension = TableMetadataParser.getFileExtension(codec);
    Path tempMetadataFile = metadataPath(UUID.randomUUID().toString() + fileExtension);
    TableMetadataParser.write(metadata, io().newOutputFile(tempMetadataFile.toString()));

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java

    try {
      Path tempVersionHintFile = metadataPath(UUID.randomUUID().toString() + "-version-hint.temp");
      writeVersionToPath(fs, tempVersionHintFile, versionToWrite);
      fs.delete(versionHintFile, false /* recursive delete */);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `snowflake/src/main/java/org/apache/iceberg/snowflake/SnowflakeTableMetadata.java`
#### Snippet
```java

  public String toDebugString() {
    return String.format("%s, rawJsonVal: %s", toString(), rawJsonVal);
  }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `api/src/main/java/org/apache/iceberg/encryption/KmsClient.java`
#### Snippet
```java
import java.util.Map;

/** A minimum client interface to connect to a key management service (KMS). */
/** @deprecated the API will be removed in v2.0.0 (replaced with KeyManagementClient interface). */
@Deprecated
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `mr/src/main/java/org/apache/iceberg/mr/Catalogs.java`
#### Snippet
```java
    Map<String, String> map = Maps.newHashMapWithExpectedSize(props.size());
    for (Object key : props.keySet()) {
      if (!PROPERTIES_TO_REMOVE.contains(key)) {
        map.put(key.toString(), props.get(key).toString());
      }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/org/apache/iceberg/AllManifestsTable.java`
#### Snippet
```java
      public <T> Boolean in(BoundReference<T> ref, Set<T> literalSet) {
        if (isSnapshotRef(ref)) {
          if (!literalSet.contains(snapshotId)) {
            return ROWS_CANNOT_MATCH;
          }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/org/apache/iceberg/AllManifestsTable.java`
#### Snippet
```java
      public <T> Boolean notIn(BoundReference<T> ref, Set<T> literalSet) {
        if (isSnapshotRef(ref)) {
          if (literalSet.contains(snapshotId)) {
            return ROWS_CANNOT_MATCH;
          }
```

### SuspiciousMethodCalls
'CharSequenceSet' may not contain objects of type ''
in `core/src/main/java/org/apache/iceberg/ManifestFilterManager.java`
#### Snippet
```java
          deletedFiles.containsAll(deletePaths),
          "Missing required files to delete: %s",
          COMMA.join(Iterables.filter(deletePaths, path -> !deletedFiles.contains(path))));
    }
  }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/types/PruneColumns.java`
#### Snippet
```java
        return field.type();
      }
    } else if (fieldResult != null) {
      // This field wasn't selected but a subfield was so include that
      return fieldResult;
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/transforms/Years.java`
#### Snippet
```java
    } else if (other instanceof Dates) {
      return Dates.YEAR.satisfiesOrderOf(other);
    } else if (other instanceof Years) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/transforms/Months.java`
#### Snippet
```java
    } else if (other instanceof Dates) {
      return Dates.MONTH.satisfiesOrderOf(other);
    } else if (other instanceof Months || other instanceof Years) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/transforms/Days.java`
#### Snippet
```java
    } else if (other instanceof Dates) {
      return Dates.DAY.satisfiesOrderOf(other);
    } else if (other instanceof Days || other instanceof Months || other instanceof Years) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/transforms/Hours.java`
#### Snippet
```java
    if (other instanceof Timestamps) {
      return other == Timestamps.HOUR;
    } else if (other instanceof Hours
        || other instanceof Days
        || other instanceof Months
```

### TrivialIf
`if` statement can be simplified
in `api/src/main/java/org/apache/iceberg/transforms/Identity.java`
#### Snippet
```java
    if (this == o) {
      return true;
    } else if (o instanceof Identity) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/apache/iceberg/DeleteFileIndex.java`
#### Snippet
```java

    ByteBuffer upper = uppers.get(pathId);
    if (upper != null
        && comparator.compare(dataFile.path(), Conversions.fromByteBuffer(pathType, upper)) > 0) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaUtil.java`
#### Snippet
```java
      if (schema.getTypes().get(0).getType() == Schema.Type.NULL) {
        return true;
      } else if (schema.getTypes().get(1).getType() == Schema.Type.NULL) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/apache/iceberg/jdbc/JdbcUtil.java`
#### Snippet
```java
    }

    if (exists(
        connections,
        JdbcUtil.GET_NAMESPACE_PROPERTIES_SQL,
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/org/apache/iceberg/util/ManifestFileUtil.java`
#### Snippet
```java
      }

      if (comparator.compare(typedValue, upperBound) > 0) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    } else if (createAvroAsIceberg && "avro".equalsIgnoreCase(provider)) {
      return true;
    } else if (createOrcAsIceberg && "orc".equalsIgnoreCase(provider)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvro.java`
#### Snippet
```java

      boolean hasChange = false;
      if (length != types.size()) {
        hasChange = true;
      }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'footerSize'
in `core/src/main/java/org/apache/iceberg/puffin/PuffinWriter.java`
#### Snippet
```java
  private boolean headerWritten;
  private boolean finished;
  private Optional<Integer> footerSize = Optional.empty();
  private Optional<Long> fileSize = Optional.empty();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fileSize'
in `core/src/main/java/org/apache/iceberg/puffin/PuffinWriter.java`
#### Snippet
```java
  private boolean finished;
  private Optional<Integer> footerSize = Optional.empty();
  private Optional<Long> fileSize = Optional.empty();

  PuffinWriter(
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'numRows'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/Stats.java`
#### Snippet
```java
class Stats implements Statistics {
  private final OptionalLong sizeInBytes;
  private final OptionalLong numRows;

  Stats(long sizeInBytes, long numRows) {
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'sizeInBytes'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/Stats.java`
#### Snippet
```java

class Stats implements Statistics {
  private final OptionalLong sizeInBytes;
  private final OptionalLong numRows;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'lockId'
in `hive-metastore/src/main/java/org/apache/iceberg/hive/MetastoreLock.java`
#### Snippet
```java
  }

  private void unlock(Optional<Long> lockId) {
    Long id = null;
    try {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'hmsLockId'
in `hive-metastore/src/main/java/org/apache/iceberg/hive/MetastoreLock.java`
#### Snippet
```java
  private final String agentInfo;

  private Optional<Long> hmsLockId = Optional.empty();
  private ReentrantLock jvmLock = null;
  private Heartbeat heartbeat = null;
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `core/src/main/java/org/apache/iceberg/BaseReplacePartitions.java`
#### Snippet
```java
  @Override
  public List<ManifestFile> apply(TableMetadata base, Snapshot snapshot) {
    if (dataSpec().fields().size() <= 0) {
      // replace all data in an unpartitioned table
      deleteByRowFilter(Expressions.alwaysTrue());
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergStorageHandler.java`
#### Snippet
```java
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED,
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED_DEFAULT)
        && table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io())
          .serializeConfWith(conf -> new NonSerializingConfig(config)::get);
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergStorageHandler.java`
#### Snippet
```java
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED_DEFAULT)
        && table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io())
          .serializeConfWith(conf -> new NonSerializingConfig(config)::get);
    }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergStorageHandler.java`
#### Snippet
```java
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED,
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED_DEFAULT)
        && table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io()).setConf(config);
    }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergStorageHandler.java`
#### Snippet
```java
            InputFormatConfig.CONFIG_SERIALIZATION_DISABLED_DEFAULT)
        && table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io()).setConf(config);
    }
  }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergOutputCommitter.java`
#### Snippet
```java
                              LOG.warn(
                                  "Failed to remove data file {} on abort job", file.path(), exc))
                      .run(file -> table.io().deleteFile(file.path().toString()));
                }
              });
```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/mapreduce/IcebergInputFormat.java`
#### Snippet
```java
          conf.getEnum(
              InputFormatConfig.IN_MEMORY_DATA_MODEL, InputFormatConfig.InMemoryDataModel.GENERIC);
      this.currentIterator = open(tasks.next(), expectedSchema).iterator();
    }

```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `mr/src/main/java/org/apache/iceberg/mr/mapreduce/IcebergInputFormat.java`
#### Snippet
```java
        } else if (tasks.hasNext()) {
          currentIterator.close();
          currentIterator = open(tasks.next(), expectedSchema).iterator();
        } else {
          currentIterator.close();
```

### AutoCloseableResource
'Timed' used without 'try'-with-resources statement
in `api/src/main/java/org/apache/iceberg/metrics/DefaultTimer.java`
#### Snippet
```java
  @Override
  public <T> T time(Supplier<T> supplier) {
    Timed timed = start();
    try {
      return supplier.get();
```

### AutoCloseableResource
'Timed' used without 'try'-with-resources statement
in `api/src/main/java/org/apache/iceberg/metrics/DefaultTimer.java`
#### Snippet
```java
  @Override
  public void time(Runnable runnable) {
    Timed timed = start();
    try {
      runnable.run();
```

### AutoCloseableResource
'Timed' used without 'try'-with-resources statement
in `api/src/main/java/org/apache/iceberg/metrics/DefaultTimer.java`
#### Snippet
```java
  @Override
  public <T> T timeCallable(Callable<T> callable) throws Exception {
    Timed timed = start();
    try {
      return callable.call();
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/BaseS3File.java`
#### Snippet
```java
          HeadObjectRequest.builder().bucket(uri().bucket()).key(uri().key());
      S3RequestUtil.configureEncryption(s3FileIOProperties, requestBuilder);
      metadata = client().headObject(requestBuilder.build());
    }

```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
      }
      if (s3FileIOProperties.isPreloadClientEnabled()) {
        client();
      }
    }
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
        GetObjectTaggingRequest.builder().bucket(bucket).key(objectKey).build();
    GetObjectTaggingResponse getObjectTaggingResponse =
        client().getObjectTagging(getObjectTaggingRequest);
    // Get existing tags, if any and then add the delete tags
    Set<Tag> tags = Sets.newHashSet();
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
            .tagging(Tagging.builder().tagSet(tags).build())
            .build();
    client().putObjectTagging(putObjectTaggingRequest);
  }

```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java

    return () ->
        client().listObjectsV2Paginator(request).stream()
            .flatMap(r -> r.contents().stream())
            .map(
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
    List<String> failures = Lists.newArrayList();
    try {
      DeleteObjectsResponse response = client().deleteObjects(request);
      if (response.hasErrors()) {
        failures.addAll(
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIO.java`
#### Snippet
```java
        DeleteObjectRequest.builder().bucket(location.bucket()).key(location.key()).build();

    client().deleteObject(deleteRequest);
  }

```

### AutoCloseableResource
'RESTClient' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/s3/signer/S3V4RestSignerClient.java`
#### Snippet
```java
      Consumer<Map<String, String>> responseHeadersConsumer = responseHeaders::putAll;
      S3SignResponse s3SignResponse =
          httpClient()
              .post(
                  endpoint(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/glue/GlueTableOperations.java`
#### Snippet
```java
          && !metadataLocation.isEmpty()) {
        // if anything went wrong, clean up the uncommitted metadata file
        io().deleteFile(metadataLocation);
      }
    } catch (RuntimeException e) {
```

### AutoCloseableResource
'GlueClient' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java

    GetTableResponse response =
        glue()
            .getTable(
                GetTableRequest.builder()
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `aws/src/main/java/org/apache/iceberg/aws/dynamodb/DynamoDbTableOperations.java`
#### Snippet
```java
        if (commitStatus == CommitStatus.FAILURE) {
          // if anything went wrong, clean up the uncommitted metadata file
          io().deleteFile(newMetadataLocation);
        }
      } catch (RuntimeException e) {
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    properties.put(AwsProperties.S3FILEIO_ENDPOINT, "https://unknown:1234");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
```

### AutoCloseableResource
'GlueClient' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    properties.put(AwsProperties.GLUE_CATALOG_ENDPOINT, "https://unknown:1234");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    GlueClient glueClient = factory.glue();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    properties.put(AwsProperties.S3FILEIO_SECRET_ACCESS_KEY, "unknown");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    S3Client s3Client = factory.s3();
    AssertHelpers.assertThrows(
        "Should fail request because of bad access key",
```

### AutoCloseableResource
'DynamoDbClient' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestDefaultAwsClientFactory.java`
#### Snippet
```java
    properties.put(AwsProperties.DYNAMODB_ENDPOINT, "https://unknown:1234");
    AwsClientFactory factory = AwsClientFactories.from(properties);
    DynamoDbClient dynamoDbClient = factory.dynamo();
    AssertHelpers.assertThrowsCause(
        "Should refuse connection to unknown endpoint",
```

### AutoCloseableResource
'S3FileIO' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestAssumeRoleAwsClientFactory.java`
#### Snippet
```java
    waitForIamConsistency();

    S3FileIO s3FileIO = new S3FileIO();
    s3FileIO.initialize(assumeRoleProperties);
    Assertions.assertThatThrownBy(
```

### AutoCloseableResource
'GlueCatalog' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/TestAssumeRoleAwsClientFactory.java`
#### Snippet
```java
    waitForIamConsistency();

    GlueCatalog glueCatalog = new GlueCatalog();
    assumeRoleProperties.put("warehouse", "s3://path");
    glueCatalog.initialize("test", assumeRoleProperties);
```

### AutoCloseableResource
'S3FileIO' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
    S3FileIOProperties properties = new S3FileIOProperties();
    properties.setDeleteBatchSize(100);
    S3FileIO s3FileIO = new S3FileIO(clientFactory::s3, properties);
    String deletePrefix = String.format("s3://%s/%s/%s", bucketName, prefix, "prefix-delete-test");

```

### AutoCloseableResource
'S3Client' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
  public void testNewInputStreamWithCrossRegionAccessPoint() throws Exception {
    clientFactory.initialize(ImmutableMap.of(S3FileIOProperties.USE_ARN_REGION_ENABLED, "true"));
    S3Client s3Client = clientFactory.s3();
    s3Client.putObject(
        PutObjectRequest.builder().bucket(bucketName).key(objectKey).build(),
```

### AutoCloseableResource
'S3FileIO' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/s3/TestS3FileIOIntegration.java`
#### Snippet
```java
  @Test
  public void testPrefixList() {
    S3FileIO s3FileIO = new S3FileIO(clientFactory::s3);
    List<Integer> scaleSizes = Lists.newArrayList(1, 1000, 2500);
    String listPrefix = String.format("s3://%s/%s/%s", bucketName, prefix, "prefix-list-test");
```

### AutoCloseableResource
'GlueCatalog' used without 'try'-with-resources statement
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogTable.java`
#### Snippet
```java
  @Test
  public void testCreateAndLoadTableWithoutWarehouseLocation() {
    GlueCatalog glueCatalogWithoutWarehouse = new GlueCatalog();
    glueCatalogWithoutWarehouse.initialize(
        catalogName,
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SerializableTable.java`
#### Snippet
```java

  private FileIO fileIO(Table table) {
    if (table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io()).serializeConfWith(SerializableConfSupplier::new);
    }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SerializableTable.java`
#### Snippet
```java
  private FileIO fileIO(Table table) {
    if (table.io() instanceof HadoopConfigurable) {
      ((HadoopConfigurable) table.io()).serializeConfWith(SerializableConfSupplier::new);
    }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MetadataLogEntriesTable.java`
#### Snippet
```java
            current.lastUpdatedMillis(), current.metadataFileLocation()));
    return StaticDataTask.of(
        table().io().newInputFile(current.metadataFileLocation()),
        schema(),
        scan.schema(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseMetastoreTableOperations.java`
#### Snippet
```java
  protected String writeNewMetadata(TableMetadata metadata, int newVersion) {
    String newTableMetadataFilePath = newTableMetadataFilePath(metadata, newVersion);
    OutputFile newMetadataLocation = io().newOutputFile(newTableMetadataFilePath);

    // write the new metadata
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseMetastoreTableOperations.java`
#### Snippet
```java
                  LOG.warn(
                      "Delete failed for previous metadata file: {}", previousMetadataFile, exc))
          .run(previousMetadataFile -> io().deleteFile(previousMetadataFile.file()));
    }
  }
```

### AutoCloseableResource
'Timed' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotScan.java`
#### Snippet
```java
        projectedFieldIds.stream().map(schema()::findColumnName).collect(Collectors.toList());

    Timer.Timed planningDuration = scanMetrics().totalPlanningDuration().start();

    return CloseableIterable.whenComplete(
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/RefsTable.java`
#### Snippet
```java
    Collection<String> refNames = table().refs().keySet();
    return StaticDataTask.of(
        table().io().newInputFile(table().operations().current().metadataFileLocation()),
        schema(),
        scan.schema(),
```

### AutoCloseableResource
'CloseableIterable\>' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
      TableMetadata base, Long startingSnapshotId, Expression dataFilter, Snapshot parent) {
    CloseableIterable<ManifestEntry<DataFile>> conflictEntries =
        deletedDataFiles(base, startingSnapshotId, dataFilter, null, parent);

    try (CloseableIterator<ManifestEntry<DataFile>> conflicts = conflictEntries.iterator()) {
```

### AutoCloseableResource
'CloseableIterable\>' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
      TableMetadata base, Long startingSnapshotId, PartitionSet partitionSet, Snapshot parent) {
    CloseableIterable<ManifestEntry<DataFile>> conflictEntries =
        addedDataFiles(base, startingSnapshotId, null, partitionSet, parent);

    try (CloseableIterator<ManifestEntry<DataFile>> conflicts = conflictEntries.iterator()) {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
  private ManifestFile copyManifest(ManifestFile manifest) {
    TableMetadata current = ops.current();
    InputFile toCopy = ops.io().newInputFile(manifest.path());
    OutputFile newManifestPath = newManifestOutput();
    return ManifestFiles.copyAppendManifest(
```

### AutoCloseableResource
'CloseableIterable\>' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
      TableMetadata base, Long startingSnapshotId, PartitionSet partitionSet, Snapshot parent) {
    CloseableIterable<ManifestEntry<DataFile>> conflictEntries =
        deletedDataFiles(base, startingSnapshotId, null, partitionSet, parent);

    try (CloseableIterator<ManifestEntry<DataFile>> conflicts = conflictEntries.iterator()) {
```

### AutoCloseableResource
'CloseableIterable\>' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java

    try (CloseableIterator<ManifestEntry<DataFile>> deletes =
        matchingDeletesGroup.entries().iterator()) {
      if (deletes.hasNext()) {
        throw new ValidationException(
```

### AutoCloseableResource
'CloseableIterable\>' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/MergingSnapshotProducer.java`
#### Snippet
```java
      Snapshot parent) {
    CloseableIterable<ManifestEntry<DataFile>> conflictEntries =
        addedDataFiles(base, startingSnapshotId, conflictDetectionFilter, null, parent);

    try (CloseableIterator<ManifestEntry<DataFile>> conflicts = conflictEntries.iterator()) {
```

### AutoCloseableResource
'Timed' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java
    // this is always set to the latest commit attempt's snapshot id.
    AtomicLong newSnapshotId = new AtomicLong(-1L);
    Timed totalDuration = commitMetrics().totalDuration().start();
    try {
      Tasks.foreach(ops)
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java

  protected OutputFile manifestListPath() {
    return ops.io()
        .newOutputFile(
            ops.metadataFileLocation(
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java
        @Override
        public void accept(String file) {
          ops.io().deleteFile(file);
        }
      };
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotProducer.java`
#### Snippet
```java

  protected OutputFile newManifestOutput() {
    return ops.io()
        .newOutputFile(
            ops.metadataFileLocation(
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseRewriteManifests.java`
#### Snippet
```java
  private ManifestFile copyManifest(ManifestFile manifest) {
    TableMetadata current = ops.current();
    InputFile toCopy = ops.io().newInputFile(manifest.path());
    OutputFile newFile = newManifestOutput();
    return ManifestFiles.copyRewriteManifest(
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/SnapshotsTable.java`
#### Snippet
```java
  private DataTask task(BaseTableScan scan) {
    return StaticDataTask.of(
        table().io().newInputFile(table().operations().current().metadataFileLocation()),
        schema(),
        scan.schema(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseMetastoreCatalog.java`
#### Snippet
```java

    TableOperations ops = newTableOps(identifier);
    InputFile metadataFile = ops.io().newInputFile(metadataFileLocation);
    TableMetadata metadata = TableMetadataParser.read(ops.io(), metadataFile);
    ops.commit(null, metadata);
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseTransaction.java`
#### Snippet
```java
          .suppressFailureWhenFinished()
          .onFailure((file, exc) -> LOG.warn("Failed to delete uncommitted file: {}", file, exc))
          .run(ops.io()::deleteFile);
    }
  }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseTransaction.java`
#### Snippet
```java
        .suppressFailureWhenFinished()
        .onFailure((file, exc) -> LOG.warn("Failed to delete uncommitted file: {}", file, exc))
        .run(ops.io()::deleteFile);
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseTransaction.java`
#### Snippet
```java
                path -> {
                  if (!committedFiles.contains(path)) {
                    ops.io().deleteFile(path);
                  }
                });
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/BaseTransaction.java`
#### Snippet
```java
          .suppressFailureWhenFinished()
          .onFailure((file, exc) -> LOG.warn("Failed to delete uncommitted file: {}", file, exc))
          .run(ops.io()::deleteFile);
    }
  }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/PartitionsTable.java`
#### Snippet
```java
      // the table is unpartitioned, partitions contains only the root partition
      return StaticDataTask.of(
          io().newInputFile(table().operations().current().metadataFileLocation()),
          schema(),
          scan.schema(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/PartitionsTable.java`
#### Snippet
```java
    } else {
      return StaticDataTask.of(
          io().newInputFile(table().operations().current().metadataFileLocation()),
          schema(),
          scan.schema(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/RemoveSnapshots.java`
#### Snippet
```java
        @Override
        public void accept(String file) {
          ops.io().deleteFile(file);
        }
      };
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/HistoryTable.java`
#### Snippet
```java
  private DataTask task(TableScan scan) {
    return StaticDataTask.of(
        table().io().newInputFile(table().operations().current().metadataFileLocation()),
        schema(),
        scan.schema(),
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/FastAppend.java`
#### Snippet
```java
  private ManifestFile copyManifest(ManifestFile manifest) {
    TableMetadata current = ops.current();
    InputFile toCopy = ops.io().newInputFile(manifest.path());
    OutputFile newManifestPath = newManifestOutput();
    return ManifestFiles.copyAppendManifest(
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @Override
  public InputFile newInputFile(String location, long length) {
    return io(location).newInputFile(location, length);
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @Override
  public OutputFile newOutputFile(String location) {
    return io(location).newOutputFile(location);
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @Override
  public InputFile newInputFile(String location) {
    return io(location).newInputFile(location);
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/io/ResolvingFileIO.java`
#### Snippet
```java
  @Override
  public void deleteFile(String location) {
    io(location).deleteFile(location);
  }

```

### AutoCloseableResource
'FileWriter' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/io/FanoutWriter.java`
#### Snippet
```java
  @Override
  public void write(T row, PartitionSpec spec, StructLike partition) {
    FileWriter<T, R> writer = writer(spec, partition);
    writer.write(row);
  }
```

### AutoCloseableResource
'DataFileWriter' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
      Map<String, String> metadata)
      throws IOException {
    DataFileWriter<D> writer = new DataFileWriter<>((DatumWriter<D>) metricsAwareDatumWriter);

    writer.setCodec(codec);
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/rest/RESTSessionCatalog.java`
#### Snippet
```java

  private void trackFileIO(RESTTableOperations ops) {
    if (io != ops.io()) {
      fileIOCloser.put(ops, ops.io());
    }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
                  LOG.warn(
                      "Delete failed for previous metadata file: {}", previousMetadataFile, exc))
          .run(previousMetadataFile -> io().deleteFile(previousMetadataFile.file()));
    }
  }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
  private RuntimeException tryDelete(Path path) {
    try {
      io().deleteFile(path.toString());
      return null;
    } catch (RuntimeException re) {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/hadoop/HadoopTableOperations.java`
#### Snippet
```java
    String fileExtension = TableMetadataParser.getFileExtension(codec);
    Path tempMetadataFile = metadataPath(UUID.randomUUID().toString() + fileExtension);
    TableMetadataParser.write(metadata, io().newOutputFile(tempMetadataFile.toString()));

    int nextVersion = (current.first() != null ? current.first() : 0) + 1;
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `core/src/main/java/org/apache/iceberg/actions/RewriteDataFilesCommitManager.java`
#### Snippet
```java
        .suppressFailureWhenFinished()
        .onFailure((dataFile, exc) -> LOG.warn("Failed to delete: {}", dataFile.path(), exc))
        .run(dataFile -> table.io().deleteFile(dataFile.path().toString()));
  }

```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericReader.java`
#### Snippet
```java
    public CloseableIterator<Record> iterator() {
      CloseableIterator<Record> iter =
          CloseableIterable.concat(Iterables.transform(task.files(), GenericReader.this::open))
              .iterator();
      addCloseable(iter);
```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `file://$PROJECT_DIR$$PROJECT_DIR$/../src/main/java/org/apache/iceberg/data/GenericReader.java`
#### Snippet
```java
    Iterable<FileScanTask> fileTasks =
        Iterables.concat(Iterables.transform(tasks, CombinedScanTask::files));
    return CloseableIterable.concat(Iterables.transform(fileTasks, this::open)).iterator();
  }

```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/BaseBatchReader.java`
#### Snippet
```java
      if (vectorHolders[i] != null) {
        // Release any resources used by the vector
        if (vectorHolders[i].vector() != null) {
          vectorHolders[i].vector().close();
        }
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowBatchReader.java`
#### Snippet
```java
          numRowsToRead);
      // Handle null vector for constant case
      columnVectors[i] = new ColumnVector(vectorHolders[i]);
    }
    return new ColumnarBatch(numRowsToRead, columnVectors);
```

### AutoCloseableResource
'RootAllocator' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/VectorizedReaderBuilder.java`
#### Snippet
```java
    this.icebergSchema = expectedSchema;
    this.rootAllocator =
        ArrowAllocation.rootAllocator()
            .newChildAllocator("VectorizedReadBuilder", 0, Long.MAX_VALUE);
    this.setArrowValidityVector = setArrowValidityVector;
```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/vectorized/ArrowReader.java`
#### Snippet
```java
        }

        iter = builder.build();
      } else {
        throw new UnsupportedOperationException(
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    VarCharVector vector =
        new VarCharVector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    BigIntVector vector =
        new BigIntVector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(vector, vectorHolder, idx -> vector.set(idx, accessor.getLong(idx)));
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    VarBinaryVector vector =
        new VarBinaryVector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(vector, vectorHolder, idx -> vector.setSafe(idx, accessor.getBinary(idx)));
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
  private static void initVector(
      BaseVariableWidthVector vector, VectorHolder vectorHolder, IntConsumer consumer) {
    vector.allocateNew(vectorHolder.vector().getValueCount());
    init(vector, vectorHolder, consumer, vectorHolder.vector().getValueCount());
  }
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
      BaseVariableWidthVector vector, VectorHolder vectorHolder, IntConsumer consumer) {
    vector.allocateNew(vectorHolder.vector().getValueCount());
    init(vector, vectorHolder, consumer, vectorHolder.vector().getValueCount());
  }

```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    Float4Vector vector =
        new Float4Vector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(vector, vectorHolder, idx -> vector.set(idx, accessor.getFloat(idx)));
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
      vector =
          new TimeStampMicroTZVector(
              vectorHolder.vector().getName(),
              ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
              vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
              vectorHolder.vector().getName(),
              ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
              vectorHolder.vector().getAllocator());
    } else {
      vector =
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
      vector =
          new TimeStampMicroVector(
              vectorHolder.vector().getName(),
              ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
              vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
              vectorHolder.vector().getName(),
              ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
              vectorHolder.vector().getAllocator());
    }

```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    TimeMicroVector vector =
        new TimeMicroVector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(vector, vectorHolder, idx -> vector.set(idx, accessor.getLong(idx)));
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    Float8Vector vector =
        new Float8Vector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(vector, vectorHolder, idx -> vector.set(idx, accessor.getDouble(idx)));
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
  private static void initVector(
      BaseFixedWidthVector vector, VectorHolder vectorHolder, IntConsumer consumer) {
    vector.allocateNew(vectorHolder.vector().getValueCount());
    init(vector, vectorHolder, consumer, vectorHolder.vector().getValueCount());
  }
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
      BaseFixedWidthVector vector, VectorHolder vectorHolder, IntConsumer consumer) {
    vector.allocateNew(vectorHolder.vector().getValueCount());
    init(vector, vectorHolder, consumer, vectorHolder.vector().getValueCount());
  }

```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
    DecimalVector vector =
        new DecimalVector(
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());
```

### AutoCloseableResource
'FieldVector' used without 'try'-with-resources statement
in `arrow/src/main/java/org/apache/iceberg/arrow/DictEncodedArrowConverter.java`
#### Snippet
```java
            vectorHolder.vector().getName(),
            ArrowSchemaUtil.convert(vectorHolder.icebergField()).getFieldType(),
            vectorHolder.vector().getAllocator());

    initVector(
```

### AutoCloseableResource
'RowDataDeltaWriter' used without 'try'-with-resources statement
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/BaseDeltaTaskWriter.java`
#### Snippet
```java
  @Override
  public void write(RowData row) throws IOException {
    RowDataDeltaWriter writer = route(row);

    switch (row.getRowKind()) {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/sink/IcebergFilesCommitter.java`
#### Snippet
```java
    for (ManifestFile manifest : manifests) {
      try {
        table.io().deleteFile(manifest.path());
      } catch (Exception e) {
        // The flink manifests cleaning failure shouldn't abort the completed checkpoint.
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedListORCDataWriteBenchmark.java`
#### Snippet
```java

  private Dataset<Row> benchmarkData() {
    return spark()
        .range(numRows)
        .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().format("avro").load(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().format("avro").load(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
          for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
            Dataset<Row> df =
                spark()
                    .range(NUM_ROWS)
                    .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceFlatAvroDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation()).selectExpr("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark()
                  .read()
                  .option(SparkReadOptions.VECTORIZATION_ENABLED, "true")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
          for (int fileNum = 0; fileNum < NUM_FILES; fileNum++) {
            Dataset<Row> df =
                spark()
                    .range(NUM_ROWS)
                    .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).selectExpr("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceNestedORCDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark()
                  .read()
                  .option(SparkReadOptions.VECTORIZATION_ENABLED, "true")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
          for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
            Dataset<Row> df =
                spark()
                    .range(NUM_ROWS)
                    .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark()
                  .read()
                  .option(SparkReadOptions.VECTORIZATION_ENABLED, "true")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark()
                  .read()
                  .option(SparkReadOptions.VECTORIZATION_ENABLED, "true")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().orc(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/orc/IcebergSourceFlatORCDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataFilterBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataFilterBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS)
              .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataFilterBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataFilterBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceNestedAvroDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceNestedAvroDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().format("avro").load(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceNestedAvroDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          Dataset<Row> df =
              spark().read().format("avro").load(dataLocation()).select("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceNestedAvroDataReadBenchmark.java`
#### Snippet
```java
          for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
            Dataset<Row> df =
                spark()
                    .range(NUM_ROWS)
                    .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/avro/IcebergSourceNestedAvroDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
  protected void writeData(int fileNum) {
    Dataset<Row> df =
        spark()
            .range(NUM_ROWS)
            .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter("_deleted = true");
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter("_deleted = false");
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter("_deleted = false");
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/IcebergSourceDeleteBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter("_deleted = true");
          materialize(df, blackhole);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataWriteBenchmark.java`
#### Snippet
```java

  private Dataset<Row> benchmarkData() {
    return spark()
        .range(NUM_ROWS)
        .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).selectExpr("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).selectExpr("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
    for (int fileNum = 0; fileNum < NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS)
              .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedParquetDataReadBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).selectExpr("nested.col3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceNestedListParquetDataWriteBenchmark.java`
#### Snippet
```java

  private Dataset<Row> benchmarkData() {
    return spark()
        .range(numRows)
        .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataWriteBenchmark.java`
#### Snippet
```java

  private Dataset<Row> benchmarkData() {
    return spark()
        .range(NUM_ROWS)
        .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum < NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS)
              .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataFilterBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).filter(FILTER_COND);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java
  private void appendData() {
    Dataset<Row> df =
        spark()
            .range(0, NUM_ROWS * NUM_FILES, 1, NUM_FILES)
            .drop("id")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS)
              .withColumnRenamed("id", "longCol")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        conf,
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation());
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/IcebergSourceFlatParquetDataReadBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation);
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadDictionaryEncodedFlatParquetDataBenchmark.java`
#### Snippet
```java

  private Dataset<Row> idDF() {
    return spark().range(0, NUM_ROWS_PER_FILE * NUM_FILES, 1, NUM_FILES).toDF();
  }

```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("decimalCol1");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("decimalCol1");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("decimalCol2");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("decimalCol2");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS_PER_FILE)
              .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("decimalCol3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadParquetDecimalBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("decimalCol3");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("decimalCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("bigDecimalCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("intCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("decimalCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("intCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("stringCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("floatCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
    for (int fileNum = 1; fileNum <= NUM_FILES; fileNum++) {
      Dataset<Row> df =
          spark()
              .range(NUM_ROWS_PER_FILE)
              .withColumn(
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("dateCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("floatCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("doubleCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("stringCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("bigDecimalCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
          String tableLocation = table().location();
          Dataset<Row> df =
              spark().read().format("iceberg").load(tableLocation).select("timestampCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        () -> {
          String tableLocation = table().location();
          Dataset<Row> df = spark().read().format("iceberg").load(tableLocation).select("dateCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("doubleCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("timestampCol");
          materialize(df);
        });
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/source/parquet/vectorized/VectorizedReadFlatParquetDataBenchmark.java`
#### Snippet
```java
        sparkConfWithVectorizationEnabled(5000),
        () -> {
          Dataset<Row> df = spark().read().parquet(dataLocation()).select("longCol");
          materialize(df);
        });
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCatalog.java`
#### Snippet
```java
        // check whether the metadata file exists because HadoopCatalog/HadoopTables
        // will drop the warehouse directly and ignore the `purge` argument
        boolean metadataFileExists = table.io().newInputFile(metadataFileLocation).exists();

        if (metadataFileExists) {
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCatalog.java`
#### Snippet
```java
    Map<String, String> optionsMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    optionsMap.putAll(options.asCaseSensitiveMap());
    optionsMap.put(CatalogProperties.APP_ID, SparkSession.active().sparkContext().applicationId());
    optionsMap.put(CatalogProperties.USER, SparkSession.active().sparkContext().sparkUser());
    return CatalogUtil.buildIcebergCatalog(name, optionsMap, conf);
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCatalog.java`
#### Snippet
```java
    optionsMap.putAll(options.asCaseSensitiveMap());
    optionsMap.put(CatalogProperties.APP_ID, SparkSession.active().sparkContext().applicationId());
    optionsMap.put(CatalogProperties.USER, SparkSession.active().sparkContext().sparkUser());
    return CatalogUtil.buildIcebergCatalog(name, optionsMap, conf);
  }
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkCatalog.java`
#### Snippet
```java

    this.catalogName = name;
    SparkSession sparkSession = SparkSession.active();
    this.tables =
        new HadoopTables(SparkUtil.hadoopConfCatalogOverrides(SparkSession.active(), name));
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkSessionCatalog.java`
#### Snippet
```java
    }

    Configuration conf = SparkSession.active().sessionState().newHadoopConf();
    String envHmsUri = conf.get(HiveConf.ConfVars.METASTOREURIS.varname, null);
    if (envHmsUri == null) {
```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
  @Override
  public boolean getBoolean(int rowId) {
    return accessor().getBoolean(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
      return null;
    }
    return accessor().getBinary(rowIdMapping[rowId]);
  }
}
```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
      return null;
    }
    return accessor().getUTF8String(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
      return null;
    }
    return accessor().getDecimal(rowIdMapping[rowId], precision, scale);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
  @Override
  public float getFloat(int rowId) {
    return accessor().getFloat(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
  @Override
  public int getInt(int rowId) {
    return accessor().getInt(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
  @Override
  public double getDouble(int rowId) {
    return accessor().getDouble(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
  @Override
  public long getLong(int rowId) {
    return accessor().getLong(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'ArrowVectorAccessor' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnVectorWithFilter.java`
#### Snippet
```java
      return null;
    }
    return accessor().getArray(rowIdMapping[rowId]);
  }

```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
        nameMappingString != null ? NameMappingParser.fromJson(nameMappingString) : null;

    JavaSparkContext sparkContext = JavaSparkContext.fromSparkContext(spark.sparkContext());
    JavaRDD<SparkPartition> partitionRDD = sparkContext.parallelize(partitions, parallelism);

```

### AutoCloseableResource
'HadoopFileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/SparkTableUtil.java`
#### Snippet
```java
      Iterator<Tuple2<String, DataFile>> fileTuples) {
    if (fileTuples.hasNext()) {
      FileIO io = new HadoopFileIO(conf.get());
      TaskContext ctx = TaskContext.get();
      String suffix =
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/ColumnarBatchReader.java`
#### Snippet
```java
            columnVectorBuilder
                .withDeletedRows(rowIdMapping, isDeleted)
                .build(vectorHolders[i], numRowsInVector);
      }
      return arrowColumnVectors;
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/VectorizedSparkOrcReaders.java`
#### Snippet
```java
      ListColumnVector listVector = (ListColumnVector) vector;
      ColumnVector elementVector =
          elementConverter.convert(listVector.child, batchSize, batchOffsetInFile, false, null);

      return new BaseOrcColumnVector(listType, batchSize, vector, isSelectedInUse, selected) {
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/VectorizedSparkOrcReaders.java`
#### Snippet
```java
      MapColumnVector mapVector = (MapColumnVector) vector;
      ColumnVector keyVector =
          keyConverter.convert(mapVector.keys, batchSize, batchOffsetInFile, false, null);
      ColumnVector valueVector =
          valueConverter.convert(mapVector.values, batchSize, batchOffsetInFile, false, null);
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/VectorizedSparkOrcReaders.java`
#### Snippet
```java
          keyConverter.convert(mapVector.keys, batchSize, batchOffsetInFile, false, null);
      ColumnVector valueVector =
          valueConverter.convert(mapVector.values, batchSize, batchOffsetInFile, false, null);

      return new BaseOrcColumnVector(mapType, batchSize, vector, isSelectedInUse, selected) {
```

### AutoCloseableResource
'ColumnVector' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/vectorized/VectorizedSparkOrcReaders.java`
#### Snippet
```java
        BaseOrcColumnVector cv =
            (BaseOrcColumnVector)
                converter.convert(
                    new StructColumnVector(batch.size, batch.cols),
                    batch.size,
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkTable.java`
#### Snippet
```java
        icebergTable
            .newDelete()
            .set("spark.app.id", sparkSession().sparkContext().applicationId())
            .deleteFromRowFilter(deleteExpr);

```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/BatchDataReader.java`
#### Snippet
```java
            : new SparkDeleteFilter(filePath, task.deletes(), counter());

    return newBatchIterable(
            inputFile,
            task.file().format(),
```

### AutoCloseableResource
'ClusteredPositionDeleteWriter' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeletesRewrite.java`
#### Snippet
```java
      if (row != null) {
        positionDelete.set(file, position, row);
        lazyWriterWithRow().write(positionDelete, spec, partition);
      } else {
        positionDelete.set(file, position, null);
```

### AutoCloseableResource
'ClusteredPositionDeleteWriter' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/SparkPositionDeletesRewrite.java`
#### Snippet
```java
      } else {
        positionDelete.set(file, position, null);
        lazyWriterWithoutRow().write(positionDelete, spec, partition);
      }
    }
```

### AutoCloseableResource
'CloseableIterable' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/PositionDeletesRowReader.java`
#### Snippet
```java
            task.residual(), expectedSchema(), caseSensitive(), Ints.toArray(nonConstantFieldIds));

    return newIterable(
            inputFile,
            task.file().format(),
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SparkShufflingDataRewriter.java`
#### Snippet
```java
  public void doRewrite(String groupId, List<FileScanTask> group) {
    Dataset<Row> scanDF =
        spark()
            .read()
            .format("iceberg")
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/source/BaseReader.java`
#### Snippet
```java

  private EncryptedInputFile toEncryptedInputFile(ContentFile<?> file) {
    InputFile inputFile = table.io().newInputFile(file.path().toString());
    return EncryptedFiles.encryptedInput(inputFile, file.keyMetadata());
  }
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SparkBinPackDataRewriter.java`
#### Snippet
```java
    // read the files packing them into splits of the required size
    Dataset<Row> scanDF =
        spark()
            .read()
            .format("iceberg")
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/SnapshotTableSparkAction.java`
#### Snippet
```java
  public SnapshotTableSparkAction as(String ident) {
    String ctx = "snapshot destination";
    CatalogPlugin defaultCatalog = spark().sessionState().catalogManager().currentCatalog();
    CatalogAndIdentifier catalogAndIdent =
        Spark3Util.catalogAndIdentifier(ctx, spark(), ident, defaultCatalog);
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteReachableFilesSparkAction.java`
#### Snippet
```java
  private Consumer<String> deleteFunc = null;
  private ExecutorService deleteExecutorService = null;
  private FileIO io = new HadoopFileIO(spark().sessionState().newHadoopConf());

  DeleteReachableFilesSparkAction(SparkSession spark, String metadataFileLocation) {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/ExpireSnapshotsSparkAction.java`
#### Snippet
```java
  private ExpireSnapshots.Result deleteFiles(Iterator<FileInfo> files) {
    DeleteSummary summary;
    if (deleteFunc == null && table.io() instanceof SupportsBulkOperations) {
      summary = deleteFiles((SupportsBulkOperations) table.io(), files);
    } else {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/ExpireSnapshotsSparkAction.java`
#### Snippet
```java
        LOG.info(
            "Table IO {} does not support bulk operations. Using non-bulk deletes.",
            table.io().getClass().getName());
        summary = deleteFiles(deleteExecutorService, table.io()::deleteFile, files);
      } else {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/ExpireSnapshotsSparkAction.java`
#### Snippet
```java
            "Table IO {} does not support bulk operations. Using non-bulk deletes.",
            table.io().getClass().getName());
        summary = deleteFiles(deleteExecutorService, table.io()::deleteFile, files);
      } else {
        LOG.info("Custom delete function provided. Using non-bulk deletes");
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteDataFilesSparkAction.java`
#### Snippet
```java
    super(spark.cloneSession());
    // Disable Adaptive Query Execution as this may change the output partitioning of our write
    spark().conf().set(SQLConf.ADAPTIVE_EXECUTION_ENABLED().key(), false);
    this.table = table;
  }
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
        .suppressFailureWhenFinished()
        .onFailure((location, exc) -> LOG.warn("Failed to delete: {}", location, exc))
        .run(location -> table.io().deleteFile(location));
  }

```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
  private List<ManifestFile> writeManifestsForUnpartitionedTable(
      Dataset<Row> manifestEntryDF, int numManifests) {
    Broadcast<Table> tableBroadcast = sparkContext().broadcast(SerializableTable.copyOf(table));
    StructType sparkType = (StructType) manifestEntryDF.schema().apply("data_file").dataType();
    Types.StructType combinedPartitionType = Partitioning.partitionType(table);
```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
      Dataset<Row> manifestEntryDF, int numManifests, int targetNumManifestEntries) {

    Broadcast<Table> tableBroadcast = sparkContext().broadcast(SerializableTable.copyOf(table));
    StructType sparkType = (StructType) manifestEntryDF.schema().apply("data_file").dataType();
    Types.StructType combinedPartitionType = Partitioning.partitionType(table);
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
  private Dataset<Row> buildManifestEntryDF(List<ManifestFile> manifests) {
    Dataset<Row> manifestDF =
        spark()
            .createDataset(Lists.transform(manifests, ManifestFile::path), Encoders.STRING())
            .toDF("manifest");
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/RewriteManifestsSparkAction.java`
#### Snippet
```java
        tableBroadcast
            .value()
            .io()
            .newOutputFile(FileFormat.AVRO.addExtension(manifestPath.toString()));

```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/BaseSparkAction.java`
#### Snippet
```java

  protected <T> T withJobGroupInfo(JobGroupInfo info, Supplier<T> supplier) {
    SparkContext context = spark().sparkContext();
    JobGroupInfo previousInfo = JobGroupUtils.getJobGroupInfo(context);
    try {
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/AddFilesProcedure.java`
#### Snippet
```java
    Identifier tableIdent = input.ident(TABLE_PARAM);

    CatalogPlugin sessionCat = spark().sessionState().catalogManager().v2SessionCatalog();
    Identifier sourceIdent = input.ident(SOURCE_TABLE_PARAM, sessionCat);

```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/BaseProcedure.java`
#### Snippet
```java
  protected Dataset<Row> loadRows(Identifier tableIdent, Map<String, String> options) {
    String tableName = Spark3Util.quotedFullIdentifier(tableCatalog().name(), tableIdent);
    return spark().read().options(options).table(tableName);
  }

```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
        matchingFiles);

    JavaRDD<String> matchingFileRDD = sparkContext().parallelize(matchingFiles, 1);

    if (subDirs.isEmpty()) {
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java

    if (subDirs.isEmpty()) {
      return spark().createDataset(matchingFileRDD.rdd(), Encoders.STRING());
    }

```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java

    int parallelism = Math.min(subDirs.size(), listingParallelism);
    JavaRDD<String> subDirRDD = sparkContext().parallelize(subDirs, parallelism);

    Broadcast<SerializableConfiguration> conf = sparkContext().broadcast(hadoopConf);
```

### AutoCloseableResource
'JavaSparkContext' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
    JavaRDD<String> subDirRDD = sparkContext().parallelize(subDirs, parallelism);

    Broadcast<SerializableConfiguration> conf = sparkContext().broadcast(hadoopConf);
    ListDirsRecursively listDirs = new ListDirsRecursively(conf, olderThanTimestamp, pathFilter);
    JavaRDD<String> matchingLeafFileRDD = subDirRDD.mapPartitions(listDirs);
```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java

    JavaRDD<String> completeMatchingFileRDD = matchingFileRDD.union(matchingLeafFileRDD);
    return spark().createDataset(completeMatchingFileRDD.rdd(), Encoders.STRING());
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
        findOrphanFiles(spark(), actualFileIdentDS, validFileIdentDS, prefixMismatchMode);

    if (deleteFunc == null && table.io() instanceof SupportsBulkOperations) {
      deleteFiles((SupportsBulkOperations) table.io(), orphanFiles);
    } else {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
        LOG.info(
            "Table IO {} does not support bulk operations. Using non-bulk deletes.",
            table.io().getClass().getName());
        deleteTasks.run(table.io()::deleteFile);
      } else {
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/actions/DeleteOrphanFilesSparkAction.java`
#### Snippet
```java
            "Table IO {} does not support bulk operations. Using non-bulk deletes.",
            table.io().getClass().getName());
        deleteTasks.run(table.io()::deleteFile);
      } else {
        LOG.info("Custom delete function provided. Using non-bulk deletes");
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/ExpireSnapshotsProcedure.java`
#### Snippet
```java

          if (maxConcurrentDeletes != null) {
            if (table.io() instanceof SupportsBulkOperations) {
              LOG.warn(
                  "max_concurrent_deletes only works with FileIOs that do not support bulk deletes. This"
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/ExpireSnapshotsProcedure.java`
#### Snippet
```java
                      + "See that IO's documentation to learn how to adjust parallelism for that particular "
                      + "IO's bulk delete.",
                  table.io().getClass().getName());
            } else {

```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/RemoveOrphanFilesProcedure.java`
#### Snippet
```java

          if (olderThanMillis != null) {
            boolean isTesting = Boolean.parseBoolean(spark().conf().get("spark.testing", "false"));
            if (!isTesting) {
              validateInterval(olderThanMillis);
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/RemoveOrphanFilesProcedure.java`
#### Snippet
```java

          if (maxConcurrentDeletes != null) {
            if (table.io() instanceof SupportsBulkOperations) {
              LOG.warn(
                  "max_concurrent_deletes only works with FileIOs that do not support bulk deletes. This"
```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/RemoveOrphanFilesProcedure.java`
#### Snippet
```java
                      + "See that IO's documentation to learn how to adjust parallelism for that particular "
                      + "IO's bulk delete.",
                  table.io().getClass().getName());
            } else {

```

### AutoCloseableResource
'SparkSession' used without 'try'-with-resources statement
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/procedures/RemoveOrphanFilesProcedure.java`
#### Snippet
```java

          if (fileListView != null) {
            action.compareToFileList(spark().table(fileListView));
          }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `nessie/src/main/java/org/apache/iceberg/nessie/NessieTableOperations.java`
#### Snippet
```java
    } finally {
      if (delete) {
        io().deleteFile(newMetadataLocation);
      }
    }
```

### AutoCloseableResource
'HiveClientPool' used without 'try'-with-resources statement
in `hive-metastore/src/main/java/org/apache/iceberg/hive/CachedClientPool.java`
#### Snippet
```java
  public <R> R run(Action<R, IMetaStoreClient, TException> action, boolean retry)
      throws TException, InterruptedException {
    return clientPool().run(action, retry);
  }

```

### AutoCloseableResource
'HiveClientPool' used without 'try'-with-resources statement
in `hive-metastore/src/main/java/org/apache/iceberg/hive/CachedClientPool.java`
#### Snippet
```java
  public <R> R run(Action<R, IMetaStoreClient, TException> action)
      throws TException, InterruptedException {
    return clientPool().run(action);
  }

```

### AutoCloseableResource
'FileIO' used without 'try'-with-resources statement
in `hive-metastore/src/main/java/org/apache/iceberg/hive/HiveTableOperations.java`
#### Snippet
```java
      if (commitStatus == CommitStatus.FAILURE) {
        // If we are sure the commit failed, clean up the uncommitted metadata file
        io().deleteFile(metadataLocation);
      }
    } catch (RuntimeException e) {
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'logicalType != null' covered by subsequent condition 'logicalType instanceof LogicalTypes.Decimal'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetAvro.java`
#### Snippet
```java
    public Schema primitive(Schema primitive) {
      LogicalType logicalType = primitive.getLogicalType();
      if (logicalType != null && logicalType instanceof LogicalTypes.Decimal) {
        LogicalTypes.Decimal decimal = (LogicalTypes.Decimal) logicalType;
        if (decimal.getPrecision() <= 9) {
```

### ConditionCoveredByFurtherCondition
Condition 'e != null' covered by subsequent condition 'e instanceof MetaException'
in `hive-metastore/src/main/java/org/apache/iceberg/hive/HiveClientPool.java`
#### Snippet
```java
  protected boolean isConnectionException(Exception e) {
    return super.isConnectionException(e)
        || (e != null
            && e instanceof MetaException
            && e.getMessage()
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `api/src/main/java/org/apache/iceberg/actions/RewriteDataFiles.java`
#### Snippet
```java
   * partitions based on size into groups. These sub-units of the rewrite are referred to as file
   * groups. The largest amount of data that should be compacted in a single group is controlled by
   * {@link #MAX_FILE_GROUP_SIZE_BYTES}. This helps with breaking down the rewriting of very large
   * partitions which may not be rewritable otherwise due to the resource constraints of the
   * cluster. For example a sort based rewrite may not scale to terabyte sized partitions, those
```

### JavadocDeclaration
Javadoc pointing to itself
in `api/src/main/java/org/apache/iceberg/metrics/MetricsReporter.java`
#### Snippet
```java
  /**
   * A custom MetricsReporter implementation must have a no-arg constructor, which will be called
   * first. {@link MetricsReporter#initialize(Map properties)} is called to complete the
   * initialization.
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `core/src/main/java/org/apache/iceberg/actions/BinPackStrategy.java`
#### Snippet
```java

  /**
   * Adjusts files which will be considered for rewriting. Files larger than {@link
   * #MAX_FILE_SIZE_BYTES} will be considered for rewriting. This functions independently of {@link
   * #MIN_FILE_SIZE_BYTES}.
```

### JavadocDeclaration
Javadoc pointing to itself
in `core/src/main/java/org/apache/iceberg/actions/BinPackStrategy.java`
#### Snippet
```java

  /**
   * Adjusts files which will be considered for rewriting. Files smaller than {@link
   * #MIN_FILE_SIZE_BYTES} will be considered for rewriting. This functions independently of {@link
   * #MAX_FILE_SIZE_BYTES}.
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `value` to `double` is redundant
in `api/src/main/java/org/apache/iceberg/util/BucketUtil.java`
#### Snippet
```java

  public static int hash(float value) {
    return MURMUR3.hashLong(doubleToLongBits((double) value)).asInt();
  }

```

### RedundantCast
Casting `null` to `Object` is redundant
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaUtil.java`
#### Snippet
```java
    String keyValueName = "k" + keyId + "_v" + valueId;

    Schema.Field keyField = new Schema.Field("key", keySchema, null, (Object) null);
    if (!"key".equals(keyName)) {
      keyField.addAlias(keyName);
```

### RedundantCast
Casting `null` to `Object` is redundant
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaUtil.java`
#### Snippet
```java
    String keyValueName = "k" + keyId + "_v" + valueId;

    Schema.Field keyField = new Schema.Field("key", keySchema, null, (Object) null);
    keyField.addProp(FIELD_ID_PROP, keyId);

```

### RedundantCast
Casting `null` to `Object` is redundant
in `core/src/main/java/org/apache/iceberg/util/Pair.java`
#### Snippet
```java
                      false,
                      Lists.newArrayList(
                          new Schema.Field("x", xSchema, null, (Object) null),
                          new Schema.Field("y", ySchema, null, (Object) null)));
                }
```

### RedundantCast
Casting `null` to `Object` is redundant
in `core/src/main/java/org/apache/iceberg/util/Pair.java`
#### Snippet
```java
                      Lists.newArrayList(
                          new Schema.Field("x", xSchema, null, (Object) null),
                          new Schema.Field("y", ySchema, null, (Object) null)));
                }
              });
```

### RedundantCast
Casting `RandomUtil.generatePrimitive(...)` to `String` is redundant
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/RandomGeneratingUDF.java`
#### Snippet
```java
  UserDefinedFunction randomString() {
    return udf(
            () -> (String) RandomUtil.generatePrimitive(Types.StringType.get(), rand),
            DataTypes.StringType)
        .asNondeterministic()
```

### RedundantCast
Casting `Math.floorMod(...)` to `int` is redundant
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/data/SparkOrcValueWriters.java`
#### Snippet
```java
      TimestampColumnVector cv = (TimestampColumnVector) output;
      cv.time[rowId] = Math.floorDiv(micros, 1_000); // millis
      cv.nanos[rowId] = (int) Math.floorMod(micros, 1_000_000) * 1_000; // nanos
    }
  }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `row` may be 'final'
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergSerDe.java`
#### Snippet
```java
  private Schema tableSchema;
  private Map<ObjectInspector, Deserializer> deserializers = Maps.newHashMapWithExpectedSize(1);
  private Container<Record> row = new Container<>();

  @Override
```

### FieldMayBeFinal
Field `deserializers` may be 'final'
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergSerDe.java`
#### Snippet
```java
  private ObjectInspector inspector;
  private Schema tableSchema;
  private Map<ObjectInspector, Deserializer> deserializers = Maps.newHashMapWithExpectedSize(1);
  private Container<Record> row = new Container<>();

```

### FieldMayBeFinal
Field `fieldDeserializer` may be 'final'
in `mr/src/main/java/org/apache/iceberg/mr/hive/Deserializer.java`
#### Snippet
```java

class Deserializer {
  private FieldDeserializer fieldDeserializer;

  /**
```

### FieldMayBeFinal
Field `writerInspector` may be 'final'
in `mr/src/main/java/org/apache/iceberg/mr/hive/Deserializer.java`
#### Snippet
```java
   */
  private static class ObjectInspectorPair {
    private ObjectInspector writerInspector;
    private ObjectInspector sourceInspector;

```

### FieldMayBeFinal
Field `sourceInspector` may be 'final'
in `mr/src/main/java/org/apache/iceberg/mr/hive/Deserializer.java`
#### Snippet
```java
  private static class ObjectInspectorPair {
    private ObjectInspector writerInspector;
    private ObjectInspector sourceInspector;

    ObjectInspectorPair(ObjectInspector writerInspector, ObjectInspector sourceInspector) {
```

### FieldMayBeFinal
Field `dedupFields` may be 'final'
in `api/src/main/java/org/apache/iceberg/PartitionSpec.java`
#### Snippet
```java
    private final List<PartitionField> fields = Lists.newArrayList();
    private final Set<String> partitionNames = Sets.newHashSet();
    private Map<Map.Entry<Integer, String>, PartitionField> dedupFields = Maps.newHashMap();
    private int specId = 0;
    private final AtomicInteger lastAssignedFieldId =
```

### FieldMayBeFinal
Field `clientCredentialsProvider` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsClientProperties.java`
#### Snippet
```java

  private String clientRegion;
  private String clientCredentialsProvider;
  private final Map<String, String> clientCredentialsProviderProperties;

```

### FieldMayBeFinal
Field `endpoint` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private boolean isUseArnRegionEnabled;
  private boolean isAccelerationEnabled;
  private String endpoint;
  private final boolean isRemoteSigningEnabled;
  private final Map<String, String> allProperties;
```

### FieldMayBeFinal
Field `isAccelerationEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private boolean isPathStyleAccess;
  private boolean isUseArnRegionEnabled;
  private boolean isAccelerationEnabled;
  private String endpoint;
  private final boolean isRemoteSigningEnabled;
```

### FieldMayBeFinal
Field `secretAccessKey` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private String sseMd5;
  private String accessKeyId;
  private String secretAccessKey;
  private String sessionToken;
  private int multipartUploadThreads;
```

### FieldMayBeFinal
Field `isUseArnRegionEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private boolean isDualStackEnabled;
  private boolean isPathStyleAccess;
  private boolean isUseArnRegionEnabled;
  private boolean isAccelerationEnabled;
  private String endpoint;
```

### FieldMayBeFinal
Field `isDualStackEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private final Map<String, String> bucketToAccessPointMapping;
  private boolean isPreloadClientEnabled;
  private boolean isDualStackEnabled;
  private boolean isPathStyleAccess;
  private boolean isUseArnRegionEnabled;
```

### FieldMayBeFinal
Field `sessionToken` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private String accessKeyId;
  private String secretAccessKey;
  private String sessionToken;
  private int multipartUploadThreads;
  private int multiPartSize;
```

### FieldMayBeFinal
Field `isPathStyleAccess` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private boolean isPreloadClientEnabled;
  private boolean isDualStackEnabled;
  private boolean isPathStyleAccess;
  private boolean isUseArnRegionEnabled;
  private boolean isAccelerationEnabled;
```

### FieldMayBeFinal
Field `accessKeyId` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/s3/S3FileIOProperties.java`
#### Snippet
```java
  private String sseKey;
  private String sseMd5;
  private String accessKeyId;
  private String secretAccessKey;
  private String sessionToken;
```

### FieldMayBeFinal
Field `client` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java

  static class LakeFormationCredentialsProvider implements AwsCredentialsProvider {
    private LakeFormationClient client;
    private String tableArn;

```

### FieldMayBeFinal
Field `tableArn` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/lakeformation/LakeFormationAwsClientFactory.java`
#### Snippet
```java
  static class LakeFormationCredentialsProvider implements AwsCredentialsProvider {
    private LakeFormationClient client;
    private String tableArn;

    LakeFormationCredentialsProvider(LakeFormationClient lakeFormationClient, String tableArn) {
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `orc/src/main/java/org/apache/iceberg/orc/ExpressionToSearchArgument.java`
#### Snippet
```java
          TypeID.BINARY, TypeID.FIXED, TypeID.UUID, TypeID.STRUCT, TypeID.MAP, TypeID.LIST);

  private SearchArgument.Builder builder;
  private Map<Integer, String> idToColumnName;

```

### FieldMayBeFinal
Field `idToColumnName` may be 'final'
in `orc/src/main/java/org/apache/iceberg/orc/ExpressionToSearchArgument.java`
#### Snippet
```java

  private SearchArgument.Builder builder;
  private Map<Integer, String> idToColumnName;

  private ExpressionToSearchArgument(
```

### FieldMayBeFinal
Field `metadata` may be 'final'
in `orc/src/main/java/org/apache/iceberg/orc/ORC.java`
#### Snippet
```java
    private Schema schema = null;
    private BiFunction<Schema, TypeDescription, OrcRowWriter<?>> createWriterFunc;
    private Map<String, byte[]> metadata = Maps.newHashMap();
    private MetricsConfig metricsConfig;
    private Function<Map<String, String>, Context> createContextFunc = Context::dataContext;
```

### FieldMayBeFinal
Field `locations` may be 'final'
in `pig/src/main/java/org/apache/iceberg/pig/IcebergStorage.java`
#### Snippet
```java
  private static Tables iceberg;
  private static Map<String, Table> tables = Maps.newConcurrentMap();
  private static Map<String, String> locations = Maps.newConcurrentMap();

  private String signature;
```

### FieldMayBeFinal
Field `tables` may be 'final'
in `pig/src/main/java/org/apache/iceberg/pig/IcebergStorage.java`
#### Snippet
```java
  public static final String PIG_ICEBERG_TABLES_IMPL = "pig.iceberg.tables.impl";
  private static Tables iceberg;
  private static Map<String, Table> tables = Maps.newConcurrentMap();
  private static Map<String, String> locations = Maps.newConcurrentMap();

```

### FieldMayBeFinal
Field `base` may be 'final'
in `core/src/main/java/org/apache/iceberg/UpdateSnapshotReferencesOperation.java`
#### Snippet
```java
  private final TableOperations ops;
  private final Map<String, SnapshotRef> updatedRefs;
  private TableMetadata base;

  UpdateSnapshotReferencesOperation(TableOperations ops) {
```

### FieldMayBeFinal
Field `modeAsString` may be 'final'
in `core/src/main/java/org/apache/iceberg/MetricsModes.java`
#### Snippet
```java

  private static class MetricsModeProxy implements Serializable {
    private String modeAsString;

    MetricsModeProxy(String modeAsString) {
```

### FieldMayBeFinal
Field `maxSnapshotAgeMs` may be 'final'
in `core/src/main/java/org/apache/iceberg/MetadataUpdate.java`
#### Snippet
```java
    private final SnapshotRefType type;
    private Integer minSnapshotsToKeep;
    private Long maxSnapshotAgeMs;
    private Long maxRefAgeMs;

```

### FieldMayBeFinal
Field `maxRefAgeMs` may be 'final'
in `core/src/main/java/org/apache/iceberg/MetadataUpdate.java`
#### Snippet
```java
    private Integer minSnapshotsToKeep;
    private Long maxSnapshotAgeMs;
    private Long maxRefAgeMs;

    public SetSnapshotRef(
```

### FieldMayBeFinal
Field `minSnapshotsToKeep` may be 'final'
in `core/src/main/java/org/apache/iceberg/MetadataUpdate.java`
#### Snippet
```java
    private final Long snapshotId;
    private final SnapshotRefType type;
    private Integer minSnapshotsToKeep;
    private Long maxSnapshotAgeMs;
    private Long maxRefAgeMs;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `core/src/main/java/org/apache/iceberg/BaseTransaction.java`
#### Snippet
```java
      Sets.newHashSet(); // keep track of files deleted in the most recent commit
  private final Consumer<String> enqueueDelete = deletedFiles::add;
  private TransactionType type;
  private TableMetadata base;
  private TableMetadata current;
```

### FieldMayBeFinal
Field `s3UseArnRegionEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private boolean s3DualStackEnabled;
  private boolean s3PathStyleAccess;
  private boolean s3UseArnRegionEnabled;
  private boolean s3AccelerationEnabled;
  private String s3Endpoint;
```

### FieldMayBeFinal
Field `s3AccessKeyId` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String s3FileIoSseKey;
  private String s3FileIoSseMd5;
  private String s3AccessKeyId;
  private String s3SecretAccessKey;
  private String s3SessionToken;
```

### FieldMayBeFinal
Field `clientAssumeRoleExternalId` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java

  private String clientAssumeRoleArn;
  private String clientAssumeRoleExternalId;
  private int clientAssumeRoleTimeoutSec;
  private String clientAssumeRoleRegion;
```

### FieldMayBeFinal
Field `dynamoDbEndpoint` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java

  private String dynamoDbTableName;
  private String dynamoDbEndpoint;

  private final boolean s3RemoteSigningEnabled;
```

### FieldMayBeFinal
Field `glueEndpoint` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String s3Endpoint;

  private String glueEndpoint;
  private String glueCatalogId;
  private boolean glueCatalogSkipArchive;
```

### FieldMayBeFinal
Field `s3DualStackEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private final Map<String, String> s3BucketToAccessPointMapping;
  private boolean s3PreloadClientEnabled;
  private boolean s3DualStackEnabled;
  private boolean s3PathStyleAccess;
  private boolean s3UseArnRegionEnabled;
```

### FieldMayBeFinal
Field `s3SecretAccessKey` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String s3FileIoSseMd5;
  private String s3AccessKeyId;
  private String s3SecretAccessKey;
  private String s3SessionToken;
  private int s3FileIoMultipartUploadThreads;
```

### FieldMayBeFinal
Field `clientAssumeRoleTimeoutSec` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String clientAssumeRoleArn;
  private String clientAssumeRoleExternalId;
  private int clientAssumeRoleTimeoutSec;
  private String clientAssumeRoleRegion;
  private String clientAssumeRoleSessionName;
```

### FieldMayBeFinal
Field `s3PathStyleAccess` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private boolean s3PreloadClientEnabled;
  private boolean s3DualStackEnabled;
  private boolean s3PathStyleAccess;
  private boolean s3UseArnRegionEnabled;
  private boolean s3AccelerationEnabled;
```

### FieldMayBeFinal
Field `clientAssumeRoleSessionName` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private int clientAssumeRoleTimeoutSec;
  private String clientAssumeRoleRegion;
  private String clientAssumeRoleSessionName;
  private String clientRegion;
  private String clientCredentialsProvider;
```

### FieldMayBeFinal
Field `s3AccelerationEnabled` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private boolean s3PathStyleAccess;
  private boolean s3UseArnRegionEnabled;
  private boolean s3AccelerationEnabled;
  private String s3Endpoint;

```

### FieldMayBeFinal
Field `s3Endpoint` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private boolean s3UseArnRegionEnabled;
  private boolean s3AccelerationEnabled;
  private String s3Endpoint;

  private String glueEndpoint;
```

### FieldMayBeFinal
Field `clientAssumeRoleArn` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private final Set<software.amazon.awssdk.services.sts.model.Tag> stsClientAssumeRoleTags;

  private String clientAssumeRoleArn;
  private String clientAssumeRoleExternalId;
  private int clientAssumeRoleTimeoutSec;
```

### FieldMayBeFinal
Field `s3SessionToken` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String s3AccessKeyId;
  private String s3SecretAccessKey;
  private String s3SessionToken;
  private int s3FileIoMultipartUploadThreads;
  private int s3FileIoMultiPartSize;
```

### FieldMayBeFinal
Field `clientAssumeRoleRegion` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String clientAssumeRoleExternalId;
  private int clientAssumeRoleTimeoutSec;
  private String clientAssumeRoleRegion;
  private String clientAssumeRoleSessionName;
  private String clientRegion;
```

### FieldMayBeFinal
Field `restSigningName` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java

  private String restSigningRegion;
  private String restSigningName;
  private String restAccessKeyId;
  private String restSecretAccessKey;
```

### FieldMayBeFinal
Field `clientCredentialsProvider` may be 'final'
in `aws/src/main/java/org/apache/iceberg/aws/AwsProperties.java`
#### Snippet
```java
  private String clientAssumeRoleSessionName;
  private String clientRegion;
  private String clientCredentialsProvider;
  private final Map<String, String> clientCredentialsProviderProperties;

```

### FieldMayBeFinal
Field `deleteFiles` may be 'final'
in `core/src/main/java/org/apache/iceberg/io/WriteResult.java`
#### Snippet
```java
public class WriteResult implements Serializable {
  private DataFile[] dataFiles;
  private DeleteFile[] deleteFiles;
  private CharSequence[] referencedDataFiles;

```

### FieldMayBeFinal
Field `referencedDataFiles` may be 'final'
in `core/src/main/java/org/apache/iceberg/io/WriteResult.java`
#### Snippet
```java
  private DataFile[] dataFiles;
  private DeleteFile[] deleteFiles;
  private CharSequence[] referencedDataFiles;

  private WriteResult(
```

### FieldMayBeFinal
Field `dataFiles` may be 'final'
in `core/src/main/java/org/apache/iceberg/io/WriteResult.java`
#### Snippet
```java

public class WriteResult implements Serializable {
  private DataFile[] dataFiles;
  private DeleteFile[] deleteFiles;
  private CharSequence[] referencedDataFiles;
```

### FieldMayBeFinal
Field `recordLevels` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaWithTypeVisitor.java`
#### Snippet
```java
  }

  private Deque<String> recordLevels = Lists.newLinkedList();

  public T record(Types.StructType iStruct, Schema record, List<String> names, List<T> fields) {
```

### FieldMayBeFinal
Field `recordLevels` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroWithPartnerByStructureVisitor.java`
#### Snippet
```java

  /** Just for checking state. */
  private Deque<String> recordLevels = Lists.newLinkedList();

  // ---------------------------------- Partner type methods
```

### FieldMayBeFinal
Field `fieldNames` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaVisitor.java`
#### Snippet
```java

  private Deque<String> recordLevels = Lists.newLinkedList();
  private Deque<String> fieldNames = Lists.newLinkedList();

  protected Deque<String> fieldNames() {
```

### FieldMayBeFinal
Field `recordLevels` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroSchemaVisitor.java`
#### Snippet
```java
  }

  private Deque<String> recordLevels = Lists.newLinkedList();
  private Deque<String> fieldNames = Lists.newLinkedList();

```

### FieldMayBeFinal
Field `datumWriter` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
  private PositionOutputStream stream;
  private DataFileWriter<D> writer;
  private DatumWriter<?> datumWriter;
  private org.apache.iceberg.Schema icebergSchema;
  private MetricsConfig metricsConfig;
```

### FieldMayBeFinal
Field `stream` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java

class AvroFileAppender<D> implements FileAppender<D> {
  private PositionOutputStream stream;
  private DataFileWriter<D> writer;
  private DatumWriter<?> datumWriter;
```

### FieldMayBeFinal
Field `icebergSchema` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
  private DataFileWriter<D> writer;
  private DatumWriter<?> datumWriter;
  private org.apache.iceberg.Schema icebergSchema;
  private MetricsConfig metricsConfig;
  private long numRecords = 0L;
```

### FieldMayBeFinal
Field `metricsConfig` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroFileAppender.java`
#### Snippet
```java
  private DatumWriter<?> datumWriter;
  private org.apache.iceberg.Schema icebergSchema;
  private MetricsConfig metricsConfig;
  private long numRecords = 0L;
  private boolean isClosed = false;
```

### FieldMayBeFinal
Field `recordLevels` may be 'final'
in `core/src/main/java/org/apache/iceberg/avro/AvroCustomOrderSchemaVisitor.java`
#### Snippet
```java
  }

  private Deque<String> recordLevels = Lists.newLinkedList();

  public T record(Schema record, List<String> names, Iterable<F> fields) {
```

### FieldMayBeFinal
Field `config` may be 'final'
in `core/src/main/java/org/apache/iceberg/rest/responses/LoadTableResponse.java`
#### Snippet
```java
    private String metadataLocation;
    private TableMetadata metadata;
    private Map<String, String> config = Maps.newHashMap();

    private Builder() {}
```

### FieldMayBeFinal
Field `code` may be 'final'
in `core/src/main/java/org/apache/iceberg/rest/responses/ErrorResponse.java`
#### Snippet
```java
  private String message;
  private String type;
  private int code;
  private List<String> stack;

```

### FieldMayBeFinal
Field `stack` may be 'final'
in `core/src/main/java/org/apache/iceberg/rest/responses/ErrorResponse.java`
#### Snippet
```java
  private String type;
  private int code;
  private List<String> stack;

  private ErrorResponse(String message, String type, int code, List<String> stack) {
```

### FieldMayBeFinal
Field `message` may be 'final'
in `core/src/main/java/org/apache/iceberg/rest/responses/ErrorResponse.java`
#### Snippet
```java
public class ErrorResponse implements RESTResponse {

  private String message;
  private String type;
  private int code;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `core/src/main/java/org/apache/iceberg/rest/responses/ErrorResponse.java`
#### Snippet
```java

  private String message;
  private String type;
  private int code;
  private List<String> stack;
```

### FieldMayBeFinal
Field `inner` may be 'final'
in `core/src/main/java/org/apache/iceberg/util/StructLikeMap.java`
#### Snippet
```java
  private static class StructLikeEntry<R> implements Entry<StructLike, R> {

    private Map.Entry<StructLikeWrapper, R> inner;

    private StructLikeEntry(Map.Entry<StructLikeWrapper, R> inner) {
```

### FieldMayBeFinal
Field `stopRetryExceptions` may be 'final'
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java

    // retry settings
    private List<Class<? extends Exception>> stopRetryExceptions =
        Lists.newArrayList(UnrecoverableException.class);
    private List<Class<? extends Exception>> onlyRetryExceptions = null;
```

### FieldMayBeFinal
Field `size` may be 'final'
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
  /** A range, [ 0, size ) */
  private static class Range implements Iterable<Integer> {
    private int size;

    Range(int size) {
```

### FieldMayBeFinal
Field `addedDataFiles` may be 'final'
in `core/src/main/java/org/apache/iceberg/actions/RewriteDataFilesActionResult.java`
#### Snippet
```java

  private List<DataFile> deletedDataFiles;
  private List<DataFile> addedDataFiles;

  public RewriteDataFilesActionResult(
```

### FieldMayBeFinal
Field `deletedDataFiles` may be 'final'
in `core/src/main/java/org/apache/iceberg/actions/RewriteDataFilesActionResult.java`
#### Snippet
```java
      new RewriteDataFilesActionResult(ImmutableList.of(), ImmutableList.of());

  private List<DataFile> deletedDataFiles;
  private List<DataFile> addedDataFiles;

```

### FieldMayBeFinal
Field `caseSensitive` may be 'final'
in `core/src/main/java/org/apache/iceberg/schema/UnionByNameVisitor.java`
#### Snippet
```java
  private final UpdateSchema api;
  private final Schema partnerSchema;
  private boolean caseSensitive;

  private UnionByNameVisitor(UpdateSchema api, Schema partnerSchema, boolean caseSensitive) {
```

### FieldMayBeFinal
Field `nestedMapping` may be 'final'
in `core/src/main/java/org/apache/iceberg/mapping/MappedField.java`
#### Snippet
```java
  private final Set<String> names;
  private Integer id;
  private MappedFields nestedMapping;

  private MappedField(Integer id, Iterable<String> names, MappedFields nested) {
```

### FieldMayBeFinal
Field `id` may be 'final'
in `core/src/main/java/org/apache/iceberg/mapping/MappedField.java`
#### Snippet
```java

  private final Set<String> names;
  private Integer id;
  private MappedFields nestedMapping;

```

### FieldMayBeFinal
Field `fileEncryptionAlgorithm` may be 'final'
in `core/src/main/java/org/apache/iceberg/encryption/NativeFileCryptoParameters.java`
#### Snippet
```java
public class NativeFileCryptoParameters {
  private ByteBuffer fileKey;
  private EncryptionAlgorithm fileEncryptionAlgorithm;

  private NativeFileCryptoParameters(
```

### FieldMayBeFinal
Field `fileKey` may be 'final'
in `core/src/main/java/org/apache/iceberg/encryption/NativeFileCryptoParameters.java`
#### Snippet
```java
 */
public class NativeFileCryptoParameters {
  private ByteBuffer fileKey;
  private EncryptionAlgorithm fileEncryptionAlgorithm;

```

### FieldMayBeFinal
Field `fileKey` may be 'final'
in `core/src/main/java/org/apache/iceberg/encryption/NativeFileCryptoParameters.java`
#### Snippet
```java

  public static class Builder {
    private ByteBuffer fileKey;
    private EncryptionAlgorithm fileEncryptionAlgorithm;

```

### FieldMayBeFinal
Field `enumerationSplitCountHistory` may be 'final'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/enumerator/IcebergEnumeratorState.java`
#### Snippet
```java
  @Nullable private final IcebergEnumeratorPosition lastEnumeratedPosition;
  private final Collection<IcebergSourceSplitState> pendingSplits;
  private int[] enumerationSplitCountHistory;

  public IcebergEnumeratorState(Collection<IcebergSourceSplitState> pendingSplits) {
```

### FieldMayBeFinal
Field `env` may be 'final'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/actions/RewriteDataFilesAction.java`
#### Snippet
```java
public class RewriteDataFilesAction extends BaseRewriteDataFilesAction<RewriteDataFilesAction> {

  private StreamExecutionEnvironment env;
  private int maxParallelism;

```

### FieldMayBeFinal
Field `table` may be 'final'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/actions/Actions.java`
#### Snippet
```java

  private StreamExecutionEnvironment env;
  private Table table;

  private Actions(StreamExecutionEnvironment env, Table table) {
```

### FieldMayBeFinal
Field `env` may be 'final'
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/actions/Actions.java`
#### Snippet
```java
          .set(CoreOptions.CHECK_LEAKED_CLASSLOADER, false);

  private StreamExecutionEnvironment env;
  private Table table;

```

### FieldMayBeFinal
Field `rand` may be 'final'
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/RandomGeneratingUDF.java`
#### Snippet
```java
class RandomGeneratingUDF implements Serializable {
  private final long uniqueValues;
  private Random rand = new Random();

  RandomGeneratingUDF(long uniqueValues) {
```

### FieldMayBeFinal
Field `description` may be 'final'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/JobGroupInfo.java`
#### Snippet
```java
public class JobGroupInfo {
  private String groupId;
  private String description;
  private boolean interruptOnCancel;

```

### FieldMayBeFinal
Field `interruptOnCancel` may be 'final'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/JobGroupInfo.java`
#### Snippet
```java
  private String groupId;
  private String description;
  private boolean interruptOnCancel;

  public JobGroupInfo(String groupId, String desc, boolean interruptOnCancel) {
```

### FieldMayBeFinal
Field `groupId` may be 'final'
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/JobGroupInfo.java`
#### Snippet
```java
/** Captures information about the current job which is used for displaying on the UI */
public class JobGroupInfo {
  private String groupId;
  private String description;
  private boolean interruptOnCancel;
```

### FieldMayBeFinal
Field `aliyunProperties` may be 'final'
in `aliyun/src/main/java/org/apache/iceberg/aliyun/oss/BaseOSSFile.java`
#### Snippet
```java
  private final OSS client;
  private final OSSURI uri;
  private AliyunProperties aliyunProperties;
  private SimplifiedObjectMeta metadata;
  private final MetricsContext metrics;
```

### FieldMayBeFinal
Field `classNames` may be 'final'
in `common/src/main/java/org/apache/iceberg/common/DynClasses.java`
#### Snippet
```java
    private Class<?> foundClass = null;
    private boolean nullOk = false;
    private Set<String> classNames = Sets.newLinkedHashSet();

    private Builder() {}
```

### FieldMayBeFinal
Field `hidden` may be 'final'
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java

  private static class MakeAccessible implements PrivilegedAction<Void> {
    private Constructor<?> hidden;

    MakeAccessible(Constructor<?> hidden) {
```

### FieldMayBeFinal
Field `problems` may be 'final'
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java
    private ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private Ctor ctor = null;
    private Map<String, Throwable> problems = Maps.newHashMap();

    public Builder(Class<?> baseClass) {
```

### FieldMayBeFinal
Field `hidden` may be 'final'
in `common/src/main/java/org/apache/iceberg/common/DynMethods.java`
#### Snippet
```java

  private static class MakeAccessible implements PrivilegedAction<Void> {
    private Method hidden;

    MakeAccessible(Method hidden) {
```

### FieldMayBeFinal
Field `hidden` may be 'final'
in `common/src/main/java/org/apache/iceberg/common/DynFields.java`
#### Snippet
```java

  private static class MakeFieldAccessible implements PrivilegedAction<Void> {
    private Field hidden;

    MakeFieldAccessible(Field hidden) {
```

### FieldMayBeFinal
Field `scale` may be 'final'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetValueReaders.java`
#### Snippet
```java

  public static class BinaryAsDecimalReader extends PrimitiveReader<BigDecimal> {
    private int scale;

    public BinaryAsDecimalReader(ColumnDescriptor desc, int scale) {
```

### FieldMayBeFinal
Field `metricsConfig` may be 'final'
in `parquet/src/main/java/org/apache/iceberg/parquet/ParquetWriteAdapter.java`
#### Snippet
```java
public class ParquetWriteAdapter<D> implements FileAppender<D> {
  private ParquetWriter<D> writer;
  private MetricsConfig metricsConfig;
  private ParquetMetadata footer;

```

### FieldMayBeFinal
Field `reuseContainers` may be 'final'
in `parquet/src/main/java/org/apache/iceberg/parquet/VectorizedParquetReader.java`
#### Snippet
```java
  private final Function<MessageType, VectorizedReader<?>> batchReaderFunc;
  private final Expression filter;
  private boolean reuseContainers;
  private final boolean caseSensitive;
  private final int batchSize;
```

### FieldMayBeFinal
Field `autoConvert` may be 'final'
in `hive-metastore/src/main/java/org/apache/iceberg/hive/HiveSchemaConverter.java`
#### Snippet
```java

  private int id;
  private boolean autoConvert;

  private HiveSchemaConverter(boolean autoConvert) {
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `common/src/main/java/org/apache/iceberg/common/DynConstructors.java`
#### Snippet
```java
          return ctor.newInstance(args);
        }
      } catch (InstantiationException | IllegalAccessException e) {
        throw e;
      } catch (InvocationTargetException e) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFC00` can be replaced with 'ﰀ'
in `api/src/main/java/org/apache/iceberg/util/UnicodeUtil.java`
#### Snippet
```java
   */
  public static boolean isCharHighSurrogate(char ch) {
    return (ch & '\uFC00') == '\uD800'; // 0xDC00 - 0xDFFF shouldn't match
  }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `copy` is redundant
in `mr/src/main/java/org/apache/iceberg/mr/hive/serde/objectinspector/IcebergBinaryObjectInspector.java`
#### Snippet
```java
      return Arrays.copyOf(bytes, bytes.length);
    } else if (o instanceof ByteBuffer) {
      ByteBuffer copy =
          ByteBuffer.wrap(
              ((ByteBuffer) o).array(), ((ByteBuffer) o).arrayOffset(), ((ByteBuffer) o).limit());
```

### UnnecessaryLocalVariable
Local variable `copy` is redundant
in `mr/src/main/java/org/apache/iceberg/mr/hive/serde/objectinspector/IcebergDecimalObjectInspector.java`
#### Snippet
```java
      return HiveDecimal.create(decimal.bigDecimalValue());
    } else if (o instanceof BigDecimal) {
      BigDecimal copy = new BigDecimal(o.toString());
      return copy;
    } else {
```

### UnnecessaryLocalVariable
Local variable `newSchema` is redundant
in `core/src/main/java/org/apache/iceberg/SchemaUpdate.java`
#### Snippet
```java
  @Override
  public Schema apply() {
    Schema newSchema =
        applyChanges(schema, deletes, updates, adds, moves, identifierFieldNames, caseSensitive);

```

### UnnecessaryLocalVariable
Local variable `snapshotIds` is redundant
in `core/src/main/java/org/apache/iceberg/util/SnapshotUtil.java`
#### Snippet
```java
   */
  public static List<Long> snapshotIdsBetween(Table table, long fromSnapshotId, long toSnapshotId) {
    List<Long> snapshotIds =
        Lists.newArrayList(
            ancestorIds(
```

### UnnecessaryLocalVariable
Local variable `stream` is redundant
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/IcebergTableSource.java`
#### Snippet
```java
            .flinkConfig(readableConfig)
            .build();
    DataStreamSource stream =
        env.fromSource(
            source,
```

### UnnecessaryLocalVariable
Local variable `location` is redundant
in `spark/v3.4/spark/src/jmh/java/org/apache/iceberg/spark/action/IcebergSortCompactionBenchmark.java`
#### Snippet
```java

  protected String getCatalogWarehouse() {
    String location = Files.createTempDir().getAbsolutePath() + "/" + UUID.randomUUID() + "/";
    return location;
  }
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'file'
in `core/src/main/java/org/apache/iceberg/GenericManifestFile.java`
#### Snippet
```java
   * @param toCopy a generic manifest file to copy.
   */
  private GenericManifestFile(GenericManifestFile toCopy) {
    this.avroSchema = toCopy.avroSchema;
    this.manifestPath = toCopy.manifestPath;
```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `aws/src/integration/java/org/apache/iceberg/aws/glue/TestGlueCatalogLock.java`
#### Snippet
```java
                while (barrier.get() < numCommittedFiles * 2) {
                  try {
                    Thread.sleep(10);
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/org/apache/iceberg/util/ParallelIterable.java`
#### Snippet
```java

        try {
          Thread.sleep(10);

        } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/org/apache/iceberg/util/Tasks.java`
#### Snippet
```java
      } else {
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          LOG.warn("Interrupted while waiting for tasks to finish", e);
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `core/src/main/java/org/apache/iceberg/actions/BaseCommitService.java`
#### Snippet
```java
              if (completedRewrites.size() == 0 && inProgressCommits.size() == 0) {
                // give other threads a chance to make progress
                Thread.sleep(100);
              }
            } catch (InterruptedException e) {
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `flink/v1.17/flink/src/main/java/org/apache/iceberg/flink/source/StreamingMonitorFunction.java`
#### Snippet
```java
    while (isRunning) {
      monitorAndForwardSplits();
      Thread.sleep(scanContext.monitorInterval().toMillis());
    }
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/iceberg/BaseRewriteManifests.java`
#### Snippet
```java
                  try (ManifestReader<DataFile> reader =
                      ManifestFiles.read(manifest, ops.io(), ops.current().specsById())
                          .select(Arrays.asList("*"))) {
                    reader
                        .liveEntries()
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/iceberg/DeleteFileIndex.java`
#### Snippet
```java

    if (globalDeletes != null) {
      deleteFiles = Iterables.concat(deleteFiles, Arrays.asList(globalDeletes));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/iceberg/DeleteFileIndex.java`
#### Snippet
```java

    for (Pair<long[], DeleteFile[]> partitionDeletes : sortedDeletesByPartition.values()) {
      deleteFiles = Iterables.concat(deleteFiles, Arrays.asList(partitionDeletes.second()));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/iceberg/StaticDataTask.java`
#### Snippet
```java
  public CloseableIterable<StructLike> rows() {
    StructProjection projection = StructProjection.create(tableSchema, projectedSchema);
    Iterable<StructLike> projectedRows = Iterables.transform(Arrays.asList(rows), projection::wrap);
    return CloseableIterable.withNoopClose(projectedRows);
  }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `core/src/main/java/org/apache/iceberg/BaseSnapshot.java`
#### Snippet
```java
      allManifests =
          Lists.transform(
              Arrays.asList(v1ManifestLocations),
              location -> new GenericManifestFile(fileIO.newInputFile(location), 0));
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `spark/v3.4/spark/src/main/java/org/apache/iceberg/spark/Spark3Util.java`
#### Snippet
```java
        ImmutableList.<String>builder()
            .add(catalogName)
            .addAll(Arrays.asList(identifier.namespace()))
            .add(identifier.name())
            .build();
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `core/src/main/java/org/apache/iceberg/SerializableByteBufferMap.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    return wrapped.equals(o);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `core/src/main/java/org/apache/iceberg/util/SerializableMap.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    return copiedMap.equals(o);
  }
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `mr/src/main/java/org/apache/iceberg/mr/hive/HiveIcebergFilterFactory.java`
#### Snippet
```java
        .getHiveDecimal()
        .bigDecimalValue()
        .setScale(hiveDecimalWritable.scale());
  }

```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `mr/src/main/java/org/apache/iceberg/mr/hive/serde/objectinspector/IcebergDecimalObjectInspector.java`
#### Snippet
```java
    BigDecimal result = ((HiveDecimal) o).bigDecimalValue();
    // during the HiveDecimal to BigDecimal conversion the scale is lost, when the value is 0
    result = result.setScale(scale());
    return result;
  }
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `orc/src/main/java/org/apache/iceberg/orc/OrcMetrics.java`
#### Snippet
```java
              .map(
                  minStats ->
                      minStats.bigDecimalValue().setScale(((Types.DecimalType) type).scale()))
              .orElse(null);
    } else if (columnStats instanceof DateColumnStatistics) {
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `orc/src/main/java/org/apache/iceberg/orc/OrcMetrics.java`
#### Snippet
```java
              .map(
                  maxStats ->
                      maxStats.bigDecimalValue().setScale(((Types.DecimalType) type).scale()))
              .orElse(null);
    } else if (columnStats instanceof DateColumnStatistics) {
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.setScale()' called without a rounding mode argument
in `orc/src/main/java/org/apache/iceberg/data/orc/GenericOrcReaders.java`
#### Snippet
```java
    public BigDecimal nonNullRead(ColumnVector vector, int row) {
      DecimalColumnVector cv = (DecimalColumnVector) vector;
      return cv.vector[row].getHiveDecimal().bigDecimalValue().setScale(cv.scale);
    }
  }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.hash.Hasher' is marked unstable with @Beta
in `bundled-guava/src/main/java/org/apache/iceberg/GuavaClasses.java`
#### Snippet
```java
    Sets.class.getName();
    Streams.class.getName();
    Hasher.class.getName();
    HashFunction.class.getName();
    Hashing.class.getName();
```

