# gora 
 
# Bad smells
I found 1880 bad smells with 156 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 876 | false |
| ReturnNull | 103 | false |
| AssignmentToMethodParameter | 91 | false |
| UnusedAssignment | 54 | false |
| BoundedWildcard | 47 | false |
| UnnecessaryModifier | 44 | true |
| DataFlowIssue | 38 | false |
| SizeReplaceableByIsEmpty | 34 | true |
| UNUSED_IMPORT | 34 | false |
| ConstantValue | 29 | false |
| UtilityClassWithoutPrivateConstructor | 28 | true |
| RedundantFieldInitialization | 26 | false |
| DynamicRegexReplaceableByCompiledPattern | 21 | false |
| DuplicateBranchesInSwitch | 20 | false |
| UnnecessaryBoxing | 20 | false |
| UnnecessaryLocalVariable | 19 | true |
| UnnecessarySuperQualifier | 19 | false |
| RedundantImplements | 19 | false |
| ZeroLengthArrayInitialization | 18 | false |
| StringConcatenationInsideStringBufferAppend | 17 | false |
| UnstableApiUsage | 16 | false |
| RedundantSuppression | 13 | false |
| EmptyMethod | 12 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 11 | false |
| RedundantMethodOverride | 10 | false |
| ReplaceAssignmentWithOperatorAssignment | 9 | false |
| EqualsAndHashcode | 9 | false |
| SwitchStatementWithConfusingDeclaration | 9 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| ToArrayCallWithZeroLengthArrayArgument | 8 | true |
| CommentedOutCode | 8 | false |
| UnnecessarySemicolon | 8 | false |
| CStyleArrayDeclaration | 7 | false |
| TypeParameterHidesVisibleType | 7 | false |
| AssignmentToStaticFieldFromInstanceMethod | 6 | false |
| StringOperationCanBeSimplified | 6 | false |
| Convert2MethodRef | 6 | false |
| EqualsWhichDoesntCheckParameterClass | 6 | false |
| StaticInitializerReferencesSubClass | 5 | false |
| ClassNameSameAsAncestorName | 5 | false |
| NestedAssignment | 5 | false |
| CallToStringConcatCanBeReplacedByOperator | 5 | false |
| DuplicateThrows | 5 | false |
| ExternalizableWithoutPublicNoArgConstructor | 5 | false |
| IfStatementWithIdenticalBranches | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| StringEqualsEmptyString | 5 | false |
| CopyConstructorMissesField | 5 | false |
| FinalStaticMethod | 4 | false |
| CharsetObjectCanBeUsed | 4 | false |
| WhileCanBeForeach | 3 | false |
| KeySetIterationMayUseEntrySet | 3 | false |
| PointlessBitwiseExpression | 3 | false |
| UnnecessaryCallToStringValueOf | 3 | false |
| PublicFieldAccessedInSynchronizedContext | 3 | false |
| ImplicitArrayToString | 3 | false |
| StaticCallOnSubclass | 3 | false |
| RefusedBequest | 3 | false |
| DuplicateExpressions | 3 | false |
| ManualMinMaxCalculation | 3 | false |
| UseOfPropertiesAsHashtable | 3 | false |
| NullArgumentToVariableArgMethod | 3 | false |
| CatchMayIgnoreException | 3 | false |
| Java8MapApi | 3 | false |
| Convert2Lambda | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| UtilityClassWithPublicConstructor | 2 | false |
| BusyWait | 2 | false |
| PointlessBooleanExpression | 2 | true |
| StringEquality | 2 | false |
| UnnecessaryStringEscape | 2 | true |
| ObsoleteCollection | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| MissortedModifiers | 2 | false |
| SlowListContainsAll | 2 | false |
| CodeBlock2Expr | 2 | true |
| InfiniteRecursion | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| IOResource | 2 | false |
| RedundantLengthCheck | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| Finalize | 1 | false |
| MismatchedArrayReadWrite | 1 | false |
| PointlessArithmeticExpression | 1 | false |
| EmptyStatementBody | 1 | false |
| RegExpRedundantEscape | 1 | false |
| FinalPrivateMethod | 1 | false |
| IgnoreResultOfCall | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| SynchronizeOnThis | 1 | false |
| DoubleBraceInitialization | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| UnnecessaryInitCause | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| EnumSwitchStatementWhichMissesCases | 1 | false |
| RedundantArrayCreation | 1 | true |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| UnnecessaryReturn | 1 | true |
| IfStatementMissingBreakInLoop | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| OptionalGetWithoutIsPresent | 1 | false |
| FieldMayBeStatic | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[documentToClass.keySet().size()\]'
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBMapping.java`
#### Snippet
```java
   */
  public String[] getDocumentFields() {
    return documentToClass.keySet().toArray(new String[documentToClass.keySet().size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[documentToClass.keySet().size()\]'
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBMapping.java`
#### Snippet
```java

  public String[] getDocumentFields() {
    return documentToClass.keySet().toArray(new String[documentToClass.keySet().size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[excludedFields.size()\]'
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
          }
          T newClonedObj = getPersistent(result.get(),
                  excludedFields.toArray(new String[excludedFields.size()]));
          if (delete(result.getKey())) {
            put(result.getKey(), newClonedObj);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[set.size()\]'
in `gora-core/src/main/java/org/apache/gora/util/StringUtils.java`
#### Snippet
```java
    Collections.addAll(set, arr2);

    return set.toArray(new String[set.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[excludedFields.size()\]'
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
            }
          }
          T newClonedObj = getPersistent(result.get(),excludedFields.toArray(new String[excludedFields.size()]));
          if (delete(result.getKey())) {
            put(result.getKey(),newClonedObj);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fieldMap.size()\]'
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    T persistent = newPersistent();
    if (fields == null) {
      fields = fieldMap.keySet().toArray(new String[fieldMap.size()]);
    }
    String pk = mapping.getPrimaryKey();
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new File\[changedFiles.size()\]'
in `gora-maven-plugin/src/main/java/org/apache/gora/maven/plugin/AbstractGoraMojo.java`
#### Snippet
```java
    if (!changedFiles.isEmpty()) {
      try {
        File[] schemaFile = changedFiles.toArray(new File[changedFiles.size()]);
        GoraCompiler.compileSchema(schemaFile, outputDirectory);
      } catch (SchemaParseException e) {
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[fieldMap.size()\]'
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    T persistent = newPersistent();
    if (fields == null) {
      fields = fieldMap.keySet().toArray(new String[fieldMap.size()]);
    }
    String pk = mapping.getPrimaryKey();
```

## RuleId[id=Finalize]
### Finalize
'finalize()' should not be overridden
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStoreMetadataAnalyzer.java`
#### Snippet
```java

    @Override
    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `objects` are written to, but never read
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
  static String getDeleteDataQuery(CassandraMapping mapping, List<String> fields) {
    String[] columnNames = getColumnNames(mapping, fields);
    String[] objects = new String[fields.size()];
    Arrays.fill(objects, "?");
    Delete delete = QueryBuilder.delete().from(mapping.getKeySpace().getName(), mapping.getCoreName());
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/Column.java`
#### Snippet
```java
   * https://apacheignite-sql.readme.io/docs/data-types
   */
  public static enum FieldType {
    BOOLEAN,
    INT,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMapping.java`
#### Snippet
```java
   * Accepted types of data to be mapped in mongo based on BSON types
   */
  public static enum DocumentFieldType {
    BINARY, // bytes
    BOOLEAN, // bytes
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBMapping.java`
#### Snippet
```java
   * Currently supporting data types from OrientDB data types  {@link OType}
   */
  public static enum DocumentFieldType {

    INTEGER(OType.INTEGER.name()),
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static final long serialVersionUID = 8278557845311856507L;
  /** Enum containing all data bean's fields. */
  public static enum Field {
    METRIC_DIMENSION(0, "metricDimension"),
    TIMESTAMP(1, "timestamp"),
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBMapping.java`
#### Snippet
```java
  }

  public static enum DocumentFieldType {

    BOOLEAN("boolean"),
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static final long serialVersionUID = -6136058768384995982L;
  /** Enum containing all data bean's fields. */
  public static enum Field {
    URL(0, "url"),
    TIMESTAMP(1, "timestamp"),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/query/Query.java`
#### Snippet
```java
   * @return The filter on this query, or <code>null</code> if none.
   */
  public Filter<K, T> getFilter();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/query/Query.java`
#### Snippet
```java
   * @param filter Set a filter on this query.
   */
  public void setFilter(Filter<K, T> filter);

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/filter/Filter.java`
#### Snippet
```java
   * <code>false</code> otherwise.
   */
  public boolean filter(K key, T persistent);
}

```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-core/src/main/java/org/apache/gora/filter/FilterList.java`
#### Snippet
```java
public class FilterList<K, T extends PersistentBase> implements Filter<K, T> {
  /** set operator */
  public static enum Operator {
    /** !AND */
    MUST_PASS_ALL,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
   * @throws CloneNotSupportedException
   */
  public Persistent clone() throws CloneNotSupportedException;
  
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
* @return a tombstone.
*/
  public abstract Tombstone getTombstone();

  /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
* @return a tombstone.
*/
  public abstract Tombstone getTombstone();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
* @return the unmanaged fields
*/
  public List<Field> getUnmanagedFields();

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
public interface Persistent extends Dirtyable, Cloneable {

  public static String DIRTY_BYTES_FIELD_NAME = "__g__dirty";

  /**
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
public interface Persistent extends Dirtyable, Cloneable {

  public static String DIRTY_BYTES_FIELD_NAME = "__g__dirty";

  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-core/src/main/java/org/apache/gora/persistency/Persistent.java`
#### Snippet
```java
   * @return the parsed schema definition
   */
  public Schema getSchema();
  
  /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeLong(long l) throws IOException;
  
  public byte[] encodeLong(long l, byte[] ret) throws IOException;
  
  public long decodeLong(byte[] a) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeShort(short s) throws IOException;
  
  public byte[] encodeShort(short s, byte[] ret) throws IOException;
  
  public short decodeShort(byte[] a) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
public interface Encoder {
  
  public byte[] encodeByte(byte b, byte[] ret);
  
  public byte[] encodeByte(byte b);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public boolean decodeBoolean(byte[] val) throws IOException;
  
  public byte[] encodeBoolean(boolean b) throws IOException;
  
  public byte[] encodeBoolean(boolean b, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeByte(byte b);
  
  public byte decodeByte(byte[] a);

  public byte[] encodeShort(short s) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeFloat(float f, byte[] ret) throws IOException;
  
  public float decodeFloat(byte[] a) throws IOException;
  
  public boolean decodeBoolean(byte[] val) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public short decodeShort(byte[] a) throws IOException;
  
  public byte[] encodeInt(int i) throws IOException;
  
  public byte[] encodeInt(int i, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeFloat(float d) throws IOException;
  
  public byte[] encodeFloat(float f, byte[] ret) throws IOException;
  
  public float decodeFloat(byte[] a) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public int decodeInt(byte[] a) throws IOException;
  
  public byte[] encodeLong(long l) throws IOException;
  
  public byte[] encodeLong(long l, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeByte(byte b, byte[] ret);
  
  public byte[] encodeByte(byte b);
  
  public byte decodeByte(byte[] a);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeBoolean(boolean b) throws IOException;
  
  public byte[] encodeBoolean(boolean b, byte[] ret) throws IOException;

  byte[] followingKey(int size, byte[] per);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public float decodeFloat(byte[] a) throws IOException;
  
  public boolean decodeBoolean(byte[] val) throws IOException;
  
  public byte[] encodeBoolean(boolean b) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeDouble(double d, byte[] ret) throws IOException;
  
  public double decodeDouble(byte[] a) throws IOException;
  
  public byte[] encodeFloat(float d) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public long decodeLong(byte[] a) throws IOException;
  
  public byte[] encodeDouble(double d) throws IOException;
  
  public byte[] encodeDouble(double d, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeLong(long l, byte[] ret) throws IOException;
  
  public long decodeLong(byte[] a) throws IOException;
  
  public byte[] encodeDouble(double d) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeInt(int i, byte[] ret) throws IOException;
  
  public int decodeInt(byte[] a) throws IOException;
  
  public byte[] encodeLong(long l) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public double decodeDouble(byte[] a) throws IOException;
  
  public byte[] encodeFloat(float d) throws IOException;
  
  public byte[] encodeFloat(float f, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeShort(short s, byte[] ret) throws IOException;
  
  public short decodeShort(byte[] a) throws IOException;
  
  public byte[] encodeInt(int i) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeInt(int i) throws IOException;
  
  public byte[] encodeInt(int i, byte[] ret) throws IOException;
  
  public int decodeInt(byte[] a) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte[] encodeDouble(double d) throws IOException;
  
  public byte[] encodeDouble(double d, byte[] ret) throws IOException;
  
  public double decodeDouble(byte[] a) throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Encoder.java`
#### Snippet
```java
  public byte decodeByte(byte[] a);

  public byte[] encodeShort(short s) throws IOException;
  
  public byte[] encodeShort(short s, byte[] ret) throws IOException;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
  }

  public static enum Counts {
    UNREFERENCED, UNDEFINED, REFERENCED, CORRUPT, IGNORED
  }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static final long serialVersionUID = -8888031915401438521L;
  /** Enum containing all data bean's fields. */
  public static enum Field {
    COUNT(0, "count"),
    ;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static final long serialVersionUID = 1014651356631895518L;
  /** Enum containing all data bean's fields. */
  public static enum Field {
    PREV(0, "prev"),
    CLIENT(1, "client"),
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static final long serialVersionUID = -7912162892761759126L;
  /** Enum containing all data bean's fields. */
  public static enum Field {
    USER_ID(0, "userId"),
    FIELD0(1, "field0"),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/IDynamoDB.java`
#### Snippet
```java
   * @param dynamoHandler handler to main DynamoDB
   */
  public abstract void setDynamoDBStoreHandler(DynamoDBStore<K, T> dynamoHandler);

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/IDynamoDB.java`
#### Snippet
```java
   * @param dynamoHandler handler to main DynamoDB
   */
  public abstract void setDynamoDBStoreHandler(DynamoDBStore<K, T> dynamoHandler);

}
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`Byte.SIZE/Byte.SIZE` can be replaced with '1'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
   * Size of boolean in bytes
   */
  public static final int SIZEOF_BOOLEAN = Byte.SIZE/Byte.SIZE;

  /**
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/KeyValueWritable.java`
#### Snippet
```java
  @Override
  public void readFields(DataInput in) throws IOException {
    if(key == null) {
      
    }
```

## RuleId[id=WhileCanBeForeach]
### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
    cacheEntryList = new ConcurrentSkipListSet<>();
    Iterator<Cache.Entry<K, T>> cacheEntryIterator = cache.iterator();
    while (cacheEntryIterator.hasNext()) {
      cacheEntryList.add(cacheEntryIterator.next().getKey());
    }
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
      Result<T> objects = mapper.map(results);
      Iterator iterator = objects.iterator();
      while (iterator.hasNext()) {
        T result = (T) iterator.next();
        K key = getKey(result);
```

### WhileCanBeForeach
`while` loop can be replaced with enhanced 'for'
in `gora-pig/src/main/java/org/apache/gora/pig/udf/MapDeleteElements.java`
#### Snippet
```java
          DataBag databag = (DataBag) input.get(i) ;
          Iterator<Tuple> bagIt = databag.iterator() ;
          while (bagIt.hasNext()) {
            Tuple t = bagIt.next() ;
            resultMap.remove((String)t.get(0)) ;
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass Tombstone from superclass MetricDatum initializer might lead to class loading deadlock
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends MetricDatum implements org.apache.gora.persistency.Tombstone {
```

### StaticInitializerReferencesSubClass
Referencing subclass Tombstone from superclass Pageview initializer might lead to class loading deadlock
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Pageview implements org.apache.gora.persistency.Tombstone {
```

### StaticInitializerReferencesSubClass
Referencing subclass Tombstone from superclass Flushed initializer might lead to class loading deadlock
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Flushed implements org.apache.gora.persistency.Tombstone {
```

### StaticInitializerReferencesSubClass
Referencing subclass Tombstone from superclass CINode initializer might lead to class loading deadlock
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends CINode implements org.apache.gora.persistency.Tombstone {
```

### StaticInitializerReferencesSubClass
Referencing subclass Tombstone from superclass User initializer might lead to class loading deadlock
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends User implements org.apache.gora.persistency.Tombstone {
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `JetEngine.dataOutStore` from instance context
in `gora-jet/src/main/java/org/apache/gora/jet/JetEngine.java`
#### Snippet
```java

  public Sink<JetInputOutputFormat<KeyOut, ValueOut>> createDataSink(DataStore<KeyOut, ValueOut> dataOutStore) {
    JetEngine.dataOutStore = dataOutStore;
    return Sinks.fromProcessor("gora-jet-sink", new JetSink<KeyOut, ValueOut>());
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `JetEngine.dataInStore` from instance context
in `gora-jet/src/main/java/org/apache/gora/jet/JetEngine.java`
#### Snippet
```java
  public BatchSource<JetInputOutputFormat<KeyIn, ValueIn>> createDataSource(DataStore<KeyIn, ValueIn> dataOutStore,
                                                                            Query<KeyIn, ValueIn> query) {
    JetEngine.dataInStore = dataOutStore;
    JetEngine.query = query;
    return Sources.batchFromProcessor("gora-jet-source", new JetSource<KeyIn, ValueIn>());
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `JetEngine.query` from instance context
in `gora-jet/src/main/java/org/apache/gora/jet/JetEngine.java`
#### Snippet
```java
                                                                            Query<KeyIn, ValueIn> query) {
    JetEngine.dataInStore = dataOutStore;
    JetEngine.query = query;
    return Sources.batchFromProcessor("gora-jet-source", new JetSource<KeyIn, ValueIn>());
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `totalFieldCount` from instance context
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
      synchronized (GoraBenchmarkClient.class) {
        prop = getProperties();
        totalFieldCount = Integer
            .parseInt(prop.getProperty(CoreWorkload.FIELD_COUNT_PROPERTY, CoreWorkload.FIELD_COUNT_PROPERTY_DEFAULT));
        Properties properties = DataStoreFactory.createProps();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `executed` from instance context
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
        Properties properties = DataStoreFactory.createProps();
        if (!executed) {
          executed = true;
          GoraBenchmarkUtils.generateAvroSchema(totalFieldCount);
          String dataStoreName = GoraBenchmarkUtils.getDataBase(properties);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `dataStore` from instance context
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
        String keyClass = prop.getProperty(Constants.KEY_CLASS_KEY, Constants.KEY_CLASS_VALUE);
        String persistentClass = prop.getProperty(Constants.PERSISTENCE_CLASS_KEY, Constants.PERSISTENCE_CLASS_VALUE);
        dataStore = DataStoreFactory.getDataStore(keyClass, persistentClass, properties, new Configuration());
      }
    } catch (GoraException e) {
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of parameter `out`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/util/FixedByteArrayOutputStream.java`
#### Snippet
```java
  byte out[];
  
  public FixedByteArrayOutputStream(byte out[]) {
    this.out = out;
  }
```

### CStyleArrayDeclaration
C-style array declaration of field `out`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/util/FixedByteArrayOutputStream.java`
#### Snippet
```java
  
  private int i;
  byte out[];
  
  public FixedByteArrayOutputStream(byte out[]) {
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/util/FixedByteArrayOutputStream.java`
#### Snippet
```java
  
  @Override
  public void write(byte b[], int off, int len) throws IOException {
    System.arraycopy(b, off, out, i, len);
    i += len;
```

### CStyleArrayDeclaration
C-style array declaration of field `FIELDS`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
public class GoraBenchmarkClient extends DB {
  private static final Logger LOG = LoggerFactory.getLogger(GoraBenchmarkClient.class);
  private static final String FIELDS[] = User._ALL_FIELDS;
  private static volatile boolean executed;
  private static int totalFieldCount;
```

### CStyleArrayDeclaration
C-style array declaration of parameter `b`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  private static byte[] copyIfNeeded(byte b[], int offset, int len) {
    if (len != b.length || offset != 0) {
      byte[] copy = new byte[len];
```

### CStyleArrayDeclaration
C-style array declaration of parameter `data`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  public static Object fromBytes(Encoder encoder, Schema schema, byte data[]) throws IOException {
    switch (schema.getType()) {
    case BOOLEAN:
```

### CStyleArrayDeclaration
C-style array declaration of field `supportedLicenses`
in `gora-compiler/src/main/java/org/apache/gora/compiler/utils/LicenseHeaders.java`
#### Snippet
```java
   * Licenses supported by Gora Compilers
   */
  private static final String supportedLicenses[] = {"ASLv2", "AGPLv3", "CDDLv1", "FDLv13", "GPLv1", "GPLv2", "GPLv3", "LGPLv21", "LGPLv3"}; 

  /**
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsSpark.java`
#### Snippet
```java

    //Print output for debug purpose
    /*
    Map<String, MetricDatum> metricDatumMap = reducedGoraRdd.collectAsMap();
    for (String key : metricDatumMap.keySet()) {
```

### CommentedOutCode
Commented out code (17 lines)
in `gora-core/src/main/java/org/apache/gora/query/Query.java`
#### Snippet
```java
  Result<K, T> execute() throws GoraException;
  
//  /**
//   * Compiles the query for performance and error checking. This 
//   * method is an optional optimization for DataStore implementations.
```

### CommentedOutCode
Commented out code (23 lines)
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java
      // Query execution for key ranges
      // ToDo: Implement Query execution for key ranges
      //    else if (query.getStartKey() != null && query.getEndKey() != null) {
      //
      //      // the key range filtering at the gora side, which is not a better solution
```

### CommentedOutCode
Commented out code (3 lines)
in `gora-pig/src/main/java/org/apache/gora/pig/StorageConfiguration.java`
#### Snippet
```java
  }

//  public void setKeyClass(String keyClass) {
//    this.keyClass = keyClass;
//  }
```

### CommentedOutCode
Commented out code (11 lines)
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
     * @param rangeKeyType
     */
    // public void setHashRangeKeySchema(String tableName, String rangeKeyName,
    // String rangeKeyType){
    // KeySchemaElement kSchema = tablesToKeySchemas.get(tableName);
```

### CommentedOutCode
Commented out code (15 lines)
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
     * @return
     */
    /*private HashMap<String, String> getOrCreateItemAttribs(
        Map<String, String> items) {
      HashMap<String, String> itemAttribs;
```

### CommentedOutCode
Commented out code (2 lines)
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
    // find whether all fields are queried, which means that complete
    // rows will be deleted
    // boolean isAllFields = Arrays.equals(fields
    // , getBeanFactory().getCachedPersistent().getFields());
    ArrayList<T> deletes = null ;
```

### CommentedOutCode
Commented out code (2 lines)
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
      LOG.info("Compiling: {}", src.getAbsolutePath());
      Schema originalSchema = parser.parse(src);
      //Map<Schema,Schema> queue = new HashMap<>();
      //Schema newSchema = getSchemaWithDirtySupport(originalSchema, queue);
      Schema newSchema = originalSchema;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java

  private static String getProperty(Properties properties, String key, String defaultValue) {
    String regex = "[a-z_\\.]*";
    if (properties == null) {
      return defaultValue;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `values.keySet()` may be replaced with 'entrySet()' iteration
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
      User user = dataStore.get(key);
      List<String> allFields = Arrays.asList(FIELDS);
      for (String field : values.keySet()) {
        if (GoraBenchmarkUtils.isFieldUpdatable(field, values)) {
          // Get the index of the field from the global fields array and call
```

### KeySetIterationMayUseEntrySet
Iteration over `pItems.keySet()` may be replaced with 'entrySet()' iteration
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
  private void setItems(Map<String, String> pItems, int pIden)
      throws IOException {
    for (String itemName : pItems.keySet()) {
      String itemType = "String";
      if (pItems.get(itemName).toString().equals("N"))
```

### KeySetIterationMayUseEntrySet
Iteration over `fieldMap.keySet()` may be replaced with 'entrySet()' iteration
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
      return null;
    }
    for (Object key : fieldMap.keySet()) {
      newMap.put(key.toString(), fieldMap.get(key).toString());
    }
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  }

  private static final String toDelimitedString(String[] arr, String sep) {
    if (arr == null || arr.length == 0) {
      return "";
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`dbFieldName.length() > 0` can be replaced with '!dbFieldName.isEmpty()'
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/query/OrientDBQuery.java`
#### Snippet
```java
      for (String k : fields) {
        String dbFieldName = orientDBMapping.getDocumentField(k);
        if (dbFieldName != null && dbFieldName.length() > 0) {
          selectQuery.select(dbFieldName);
        }
```

### SizeReplaceableByIsEmpty
`dbFieldName.length() > 0` can be replaced with '!dbFieldName.isEmpty()'
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/query/RethinkDBQuery.java`
#### Snippet
```java
      for (String k : fields) {
        String dbFieldName = rethinkDBMapping.getDocumentField(k);
        if (dbFieldName != null && dbFieldName.length() > 0) {
          projection[counter] = dbFieldName;
          counter++;
```

### SizeReplaceableByIsEmpty
`qUpdateSet.size() > 0` can be replaced with '!qUpdateSet.isEmpty()'
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java

    Document qUpdateSet = newUpdateSetInstance(obj);
    if (qUpdateSet.size() > 0) {
      qUpdate.put("$set", qUpdateSet);
    }
```

### SizeReplaceableByIsEmpty
`qUpdateUnset.size() > 0` can be replaced with '!qUpdateUnset.isEmpty()'
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java

    Document qUpdateUnset = newUpdateUnsetInstance(obj);
    if (qUpdateUnset.size() > 0) {
      qUpdate.put("$unset", qUpdateUnset);
    }
```

### SizeReplaceableByIsEmpty
`cacheKeySet.size() == 0` can be replaced with 'cacheKeySet.isEmpty()'
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java
  @Override
  public float getProgress() throws IOException {
    if (cacheKeySet.size() == 0) {
      return 1;
    }
```

### SizeReplaceableByIsEmpty
`dbFieldName.length() > 0` can be replaced with '!dbFieldName.isEmpty()'
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    for (String k : dbFields) {
      String dbFieldName = orientDBMapping.getDocumentField(k);
      if (dbFieldName != null && dbFieldName.length() > 0) {
        selectQuery.select(dbFieldName);
      }
```

### SizeReplaceableByIsEmpty
`nodes.size() > 0` can be replaced with '!nodes.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/util/NodeWalker.java`
#### Snippet
```java
   */
  public boolean hasNext() {
    return (nodes.size() > 0);
  }
}
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/util/StringUtils.java`
#### Snippet
```java
   */
  public static boolean is(String str) {
    return str != null && str.length() > 0;
  }

```

### SizeReplaceableByIsEmpty
`dbFieldName.length() > 0` can be replaced with '!dbFieldName.isEmpty()'
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      for (String k : query.getFields()) {
        String dbFieldName = rethinkDBMapping.getDocumentField(k);
        if (dbFieldName != null && dbFieldName.length() > 0) {
          projection[counter] = dbFieldName;
          counter++;
```

### SizeReplaceableByIsEmpty
`delegate.size() != 0` can be replaced with '!delegate.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java
  @Override
  public void clear() {
    if (delegate.size() != 0) {
      dirtyFlag.makeDirty(true);
    }
```

### SizeReplaceableByIsEmpty
`updateFields.size() == 0` can be replaced with 'updateFields.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/query/CassandraQuery.java`
#### Snippet
```java
  @Override
  public String[] getFields() {
    if (updateFields.size() == 0) {
      return super.getFields();
    } else {
```

### SizeReplaceableByIsEmpty
`properties.size() == 0` can be replaced with 'properties.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      , Class<K> keyClass, Class<T> persistent, Configuration conf, Properties properties) 
          throws GoraException {
    if (properties == null || properties.size() == 0) {
      properties = createProps();
    }
```

### SizeReplaceableByIsEmpty
`props.size() == 0` can be replaced with 'props.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      Class<K> k = (Class<K>) ClassLoadingUtils.loadClass(keyClass);
      Class<T> p = (Class<T>) ClassLoadingUtils.loadClass(persistentClass);
      if (props == null || props.size() == 0) {
        props = createProps();
      }
```

### SizeReplaceableByIsEmpty
`props.size() == 0` can be replaced with 'props.isEmpty()'
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      Class<K> k = (Class<K>) ClassLoadingUtils.loadClass(keyClass);
      Class<T> p = (Class<T>) ClassLoadingUtils.loadClass(persistentClass);
      if (props == null || props.size() == 0) {
        props = createProps();
      }
```

### SizeReplaceableByIsEmpty
`objectArrayList.size() == 0` can be replaced with 'objectArrayList.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
    ResultSet results;
    SimpleStatement statement;
    if (objectArrayList.size() == 0) {
      statement = new SimpleStatement(cqlQuery);
    } else {
```

### SizeReplaceableByIsEmpty
`objectArrayList.size() == 0` can be replaced with 'objectArrayList.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
      String cqlQuery = CassandraQueryFactory.getExecuteQuery(mapping, query, objectArrayList, fields);
      ResultSet results;
      if (objectArrayList.size() == 0) {
        results = client.getSession().execute(cqlQuery);
      } else {
```

### SizeReplaceableByIsEmpty
`objectArrayList.size() == 0` can be replaced with 'objectArrayList.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraSerializer.java`
#### Snippet
```java
        ResultSet results;
        SimpleStatement statement;
        if (objectArrayList.size() == 0) {
          statement = new SimpleStatement(cqlQuery);
        } else {
```

### SizeReplaceableByIsEmpty
`resultRecords.size() > 0` can be replaced with '!resultRecords.isEmpty()'
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/query/AerospikeQueryResult.java`
#### Snippet
```java
  @Override
  public float getProgress() throws IOException, InterruptedException {
    if (resultRecords != null && resultRecords.size() > 0) {
      return (float) offset / (float) resultRecords.size();
    } else {
```

### SizeReplaceableByIsEmpty
`objectArrayList.size() == 0` can be replaced with 'objectArrayList.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
    ResultSet results;
    SimpleStatement statement;
    if (objectArrayList.size() == 0) {
      statement = new SimpleStatement(cqlQuery);
    } else {
```

### SizeReplaceableByIsEmpty
`objectArrayList.size() == 0` can be replaced with 'objectArrayList.isEmpty()'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
      ResultSet results;
      SimpleStatement statement;
      if (objectArrayList.size() == 0) {
        statement = new SimpleStatement(cqlQuery);
      } else {
```

### SizeReplaceableByIsEmpty
`fields.size() == 0` can be replaced with 'fields.isEmpty()'
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
    try {
      // Check for null is necessary.
      User user = (fields == null || fields.size() == 0) ? dataStore.get(key)
          : dataStore.get(key, fields.toArray(DUMMY_ARRAY));
      for (int fieldCount = 0; fieldCount < totalFieldCount; fieldCount++) {
```

### SizeReplaceableByIsEmpty
`refs.size() > 0` can be replaced with '!refs.isEmpty()'
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
      // TODO check for more than one def, should not happen

      if (defCount == 0 && refs.size() > 0) {
        // this is bad, found a node that is referenced but not defined. It must have been lost, emit some info about this node for debugging purposes.
        
```

### SizeReplaceableByIsEmpty
`refs.size() == 0` can be replaced with 'refs.isEmpty()'
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
        context.getCounter(Counts.UNDEFINED).increment(1);
        
      } else if (defCount > 0 && refs.size() == 0) {
        // node is defined but not referenced
        context.getCounter(Counts.UNREFERENCED).increment(1);
```

### SizeReplaceableByIsEmpty
`tl.binRanges(new ClientContext(conn.getInstance(), credentials, AccumuloConfiguration.getTableConfig...` can be replaced with '!tl.binRanges(new ClientContext(conn.getInstance(), credentials, AccumuloConfiguration.getTableConfiguration(conn, Tables.getTableId(conn.getInstance(), mapping.tableName))), Collections.singletonList(createRange(query)), binnedRanges).isEmpty()'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java

      tl.invalidateCache();
      while (tl.binRanges(new ClientContext(conn.getInstance(), credentials, AccumuloConfiguration.getTableConfiguration(conn, Tables.getTableId(conn.getInstance(), mapping.tableName))), Collections.singletonList(createRange(query)), binnedRanges).size() > 0) {
        // TODO log?
        if (!Tables.exists(conn.getInstance(), Tables.getTableId(conn.getInstance(), mapping.tableName)))
```

### SizeReplaceableByIsEmpty
`put.size() > 0` can be replaced with '!put.isEmpty()'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseTableConnection.java`
#### Snippet
```java
    if (autoFlush) {
      Table tableInstance = getTable();
      if (put.size() > 0) {
        if (delete.size() > 0) {
          RowMutations update = new RowMutations(keyRaw);
```

### SizeReplaceableByIsEmpty
`delete.size() > 0` can be replaced with '!delete.isEmpty()'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseTableConnection.java`
#### Snippet
```java
      Table tableInstance = getTable();
      if (put.size() > 0) {
        if (delete.size() > 0) {
          RowMutations update = new RowMutations(keyRaw);
          update.add(delete);
```

### SizeReplaceableByIsEmpty
`delete.size() > 0` can be replaced with '!delete.isEmpty()'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseTableConnection.java`
#### Snippet
```java
        }
      } else {
        if (delete.size() > 0) {
          tableInstance.delete((Delete) delete);
        }
```

### SizeReplaceableByIsEmpty
`delete.size() > 0` can be replaced with '!delete.isEmpty()'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseTableConnection.java`
#### Snippet
```java
      }
    } else {
      if (delete.size() > 0) {
        buffer.add(delete);
      }
```

### SizeReplaceableByIsEmpty
`put.size() > 0` can be replaced with '!put.isEmpty()'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseTableConnection.java`
#### Snippet
```java
      }

      if (put.size() > 0) {
        buffer.add(put);
      }
```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `gora-solr/src/main/java/org/apache/gora/solr/query/SolrResult.java`
#### Snippet
```java
  @Override
  public float getProgress() throws IOException {
    if (list != null && list.size() > 0) {
      return (float)pos / (float)list.size();
    } else {
```

### SizeReplaceableByIsEmpty
`list.size()==0` can be replaced with 'list.isEmpty()'
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanResult.java`
#### Snippet
```java
  public float getProgress() throws IOException, InterruptedException {
    LOG.debug("getProgress()");
    if (list.size()==0) return 1;
    float progress = ((float)current/(float)list.size());
    LOG.trace("progress: "+progress);
```

### SizeReplaceableByIsEmpty
`batch.size() > 0` can be replaced with '!batch.isEmpty()'
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  public void flush() throws GoraException {
    try {
      if (batch.size() > 0) {
        add(batch, commitWithin);
        batch.clear();
```

### SizeReplaceableByIsEmpty
`persistentObjects.size() == 0` can be replaced with 'persistentObjects.isEmpty()'
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/query/ElasticsearchResult.java`
#### Snippet
```java
  @Override
  public float getProgress() {
    if (persistentObjects.size() == 0) {
      return 1;
    }
```

### SizeReplaceableByIsEmpty
`result.size() > 0` can be replaced with '!result.isEmpty()'
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/query/CouchDBResult.java`
#### Snippet
```java
  @Override
  public float getProgress() throws IOException, InterruptedException {
    if (result != null && result.size() > 0) {
      return (float) position / (float) result.size();
    } else {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `gora-core/src/main/java/org/apache/gora/util/WritableUtils.java`
#### Snippet
```java
  
  
  public static final void writeProperties(DataOutput out, Properties props) throws IOException {
    MapWritable propsWritable = new MapWritable();
    for (Entry<Object, Object> prop : props.entrySet()) {
```

### FinalStaticMethod
'static' method declared `final`
in `gora-core/src/main/java/org/apache/gora/util/WritableUtils.java`
#### Snippet
```java
  }
  
  public static final Properties readProperties(DataInput in) throws IOException {
    Properties props = new Properties();
    MapWritable propsWritable = new MapWritable();
```

### FinalStaticMethod
'static' method declared `final`
in `gora-core/src/main/java/org/apache/gora/persistency/Tombstones.java`
#### Snippet
```java
  public static final ListTombstone LIST_TOMBSTONE = new ListTombstone();

  public static final <T> ListTombstone<T> getListTombstone() {
    return LIST_TOMBSTONE;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  }

  private static final String toDelimitedString(String[] arr, String sep) {
    if (arr == null || arr.length == 0) {
      return "";
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `gora-maven-plugin/src/main/java/org/apache/gora/maven/plugin/AbstractGoraMojo.java`
#### Snippet
```java

    if (!outputDirectory.exists()) {
      outputDirectory.mkdirs();
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `close()` is identical to its super method
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java

  @Override
  public void close() throws IOException {

  }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `gora-core/src/main/java/org/apache/gora/avro/query/AvroResult.java`
#### Snippet
```java
  }

  public void close() throws IOException {
  }

```

### RedundantMethodOverride
Method `readFields()` only delegates to its super method
in `gora-core/src/main/java/org/apache/gora/avro/store/AvroStore.java`
#### Snippet
```java

  @Override
  public void readFields(DataInput in) throws IOException {
    super.readFields(in);
  }
```

### RedundantMethodOverride
Method `write()` only delegates to its super method
in `gora-core/src/main/java/org/apache/gora/avro/store/AvroStore.java`
#### Snippet
```java

  @Override
  public void write(DataOutput out) throws IOException {
    super.write(out);
  }
```

### RedundantMethodOverride
Method `readFields()` only delegates to its super method
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSBackedDataStoreBase.java`
#### Snippet
```java
   * Reads fields from an object
   */
  public void readFields(Object in) throws Exception {
    super.readFields(in);
  }
```

### RedundantMethodOverride
Method `initialize()` only delegates to its super method
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSBackedDataStoreBase.java`
#### Snippet
```java
   * @throws IOException
   */
  public void initialize(Class<K> keyClass, Class<T> persistentClass,
      Properties properties) throws GoraException {
    super.initialize(keyClass, persistentClass, properties);
```

### RedundantMethodOverride
Method `write()` only delegates to its super method
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSBackedDataStoreBase.java`
#### Snippet
```java
   * Writes an object into the data
   */
  public void write(Object out) throws Exception {
    super.write(out);
  }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/query/AccumuloResult.java`
#### Snippet
```java
  
  @Override
  public void close() throws IOException {
    
  }
```

### RedundantMethodOverride
Method `equals()` only delegates to its super method
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
   */
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
```

### RedundantMethodOverride
Method `close()` is identical to its super method
in `gora-hbase/src/main/java/org/apache/gora/hbase/query/HBaseGetResult.java`
#### Snippet
```java

  @Override
  public void close() throws IOException {
  }

```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Tombstone` is the same as one of its superclass' names
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends MetricDatum implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ClassNameSameAsAncestorName
Class name `Tombstone` is the same as one of its superclass' names
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Pageview implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ClassNameSameAsAncestorName
Class name `Tombstone` is the same as one of its superclass' names
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Flushed implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ClassNameSameAsAncestorName
Class name `Tombstone` is the same as one of its superclass' names
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends CINode implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ClassNameSameAsAncestorName
Class name `Tombstone` is the same as one of its superclass' names
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends User implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
i \* splitSize: integer multiplication implicitly cast to long
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
      for(int i=0; i<Math.ceil((double)splitLimit/(double)splitSize); i++) {
        InfinispanQuery<K, T> split = (InfinispanQuery<K, T>) ((InfinispanQuery<K, T>) location).clone();
        split.setOffset(i * splitSize);
        split.setLimit(splitSize);
        split.rebuild();
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.aerospike.client.AerospikeException;`
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Bin;
import com.aerospike.client.Key;
```

### UNUSED_IMPORT
Unused import `import org.apache.gora.cassandra.store.CassandraStore;`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
import org.apache.gora.cassandra.query.CassandraQuery;
import org.apache.gora.cassandra.store.CassandraMapping;
import org.apache.gora.cassandra.store.CassandraStore;
import org.apache.gora.query.Query;
import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import java.io.IOException;`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
package org.apache.gora.cassandra.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.JsonProperties;`
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
import java.util.Set;

import org.apache.avro.JsonProperties;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
```

### UNUSED_IMPORT
Unused import `import org.codehaus.jackson.JsonNode;`
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
import org.apache.avro.compiler.specific.SpecificCompiler;
import org.apache.gora.compiler.utils.LicenseHeaders;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.JsonNodeFactory;

```

### UNUSED_IMPORT
Unused import `import org.codehaus.jackson.node.JsonNodeFactory;`
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
import org.apache.gora.compiler.utils.LicenseHeaders;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.JsonNodeFactory;

import org.slf4j.Logger;
```

### UNUSED_IMPORT
Unused import `import java.io.ByteArrayOutputStream;`
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
package org.apache.gora.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.io.BinaryEncoder;`
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.io.Decoder;`
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
import org.apache.avro.Schema.Field;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.io.DecoderFactory;`
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectData;
```

### UNUSED_IMPORT
Unused import `import org.apache.avro.io.EncoderFactory;`
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.specific.SpecificDatumReader;
```

### UNUSED_IMPORT
Unused import `import java.io.FileNotFoundException;`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
package org.apache.gora.dynamodb.store;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
```

### UNUSED_IMPORT
Unused import `import java.util.Set;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.apache.gora.memory.store.MemStore;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.chef.config.ChefProperties;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.apache.gora.store.DataStoreFactory;
import org.jclouds.ContextBuilder;
import org.jclouds.chef.config.ChefProperties;
import org.jclouds.chef.domain.BootstrapConfig;
import org.jclouds.chef.domain.CookbookVersion;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.chef.domain.BootstrapConfig;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.ContextBuilder;
import org.jclouds.chef.config.ChefProperties;
import org.jclouds.chef.domain.BootstrapConfig;
import org.jclouds.chef.domain.CookbookVersion;
import org.jclouds.chef.predicates.CookbookVersionPredicates;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.chef.domain.CookbookVersion;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.chef.config.ChefProperties;
import org.jclouds.chef.domain.BootstrapConfig;
import org.jclouds.chef.domain.CookbookVersion;
import org.jclouds.chef.predicates.CookbookVersionPredicates;
import org.jclouds.chef.util.RunListBuilder;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.chef.predicates.CookbookVersionPredicates;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.chef.domain.BootstrapConfig;
import org.jclouds.chef.domain.CookbookVersion;
import org.jclouds.chef.predicates.CookbookVersionPredicates;
import org.jclouds.chef.util.RunListBuilder;
import org.jclouds.compute.ComputeServiceContext;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.chef.util.RunListBuilder;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.chef.domain.CookbookVersion;
import org.jclouds.chef.predicates.CookbookVersionPredicates;
import org.jclouds.chef.util.RunListBuilder;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.RunNodesException;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.compute.ComputeServiceContext;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.chef.predicates.CookbookVersionPredicates;
import org.jclouds.chef.util.RunListBuilder;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.RunNodesException;
import org.jclouds.compute.domain.NodeMetadata;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.compute.RunNodesException;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.chef.util.RunListBuilder;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.RunNodesException;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.TemplateBuilder;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.compute.domain.NodeMetadata;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.RunNodesException;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.TemplateBuilder;
import org.jclouds.domain.JsonBall;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.compute.domain.TemplateBuilder;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.compute.RunNodesException;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.TemplateBuilder;
import org.jclouds.domain.JsonBall;
import org.jclouds.openstack.nova.v2_0.NovaApi;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.domain.JsonBall;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.TemplateBuilder;
import org.jclouds.domain.JsonBall;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.nova.v2_0.domain.Flavor;
```

### UNUSED_IMPORT
Unused import `import org.jclouds.scriptbuilder.domain.Statement;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.openstack.nova.v2_0.options.CreateServerOptions;
import org.jclouds.openstack.nova.v2_0.predicates.ServerPredicates;
import org.jclouds.scriptbuilder.domain.Statement;
import org.jclouds.sshj.config.SshjSshClientModule;
import static org.jclouds.compute.options.TemplateOptions.Builder.runScript; 
```

### UNUSED_IMPORT
Unused import `import org.jclouds.sshj.config.SshjSshClientModule;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.openstack.nova.v2_0.predicates.ServerPredicates;
import org.jclouds.scriptbuilder.domain.Statement;
import org.jclouds.sshj.config.SshjSshClientModule;
import static org.jclouds.compute.options.TemplateOptions.Builder.runScript; 

```

### UNUSED_IMPORT
Unused import `import static org.jclouds.compute.options.TemplateOptions.Builder.runScript;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import org.jclouds.scriptbuilder.domain.Statement;
import org.jclouds.sshj.config.SshjSshClientModule;
import static org.jclouds.compute.options.TemplateOptions.Builder.runScript; 

import com.google.common.base.Charsets;
```

### UNUSED_IMPORT
Unused import `import com.google.common.collect.ImmutableSet;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Files;
import com.google.inject.Module;
```

### UNUSED_IMPORT
Unused import `import com.google.inject.Module;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Files;
import com.google.inject.Module;

import static com.google.common.collect.Iterables.any;
```

### UNUSED_IMPORT
Unused import `import static com.google.common.collect.Iterables.any;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
import com.google.inject.Module;

import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.concat;
import java.lang.reflect.InvocationTargetException;
```

### UNUSED_IMPORT
Unused import `import static com.google.common.collect.Iterables.concat;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.concat;
import java.lang.reflect.InvocationTargetException;

```

### UNUSED_IMPORT
Unused import `import java.sql.Statement;`
in `gora-ignite/src/main/java/org/apache/gora/ignite/query/IgniteResult.java`
#### Snippet
```java
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.gora.ignite.store.IgniteStore;
import org.apache.gora.persistency.impl.PersistentBase;
```

### UNUSED_IMPORT
Unused import `import java.io.FileInputStream;`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java
package org.apache.gora.mongodb.store;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
```

### UNUSED_IMPORT
Unused import `import org.apache.gora.store.DataStoreFactory;`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
import org.apache.gora.query.Result;
import org.apache.gora.query.impl.PartitionQueryImpl;
import org.apache.gora.store.DataStoreFactory;
import org.apache.gora.store.impl.DataStoreBase;
import org.apache.gora.util.AvroUtils;
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`i = i << 8` could be simplified to 'i \<\<= 8'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    for (int idx = 0; idx < len-1; idx++) {
      byte b = buffer[offset + 1 + idx];
      i = i << 8;
      i = i | (b & 0xFF);
    }
```

### ReplaceAssignmentWithOperatorAssignment
`i = i | (b & 0xFF)` could be simplified to 'i \|= (b \& 0xFF)'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      byte b = buffer[offset + 1 + idx];
      i = i << 8;
      i = i | (b & 0xFF);
    }
    return (WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
```

### ReplaceAssignmentWithOperatorAssignment
`tmp = tmp >> 8` could be simplified to 'tmp \>\>= 8'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    long tmp = i;
    while (tmp != 0) {
      tmp = tmp >> 8;
    len--;
    }
```

### ReplaceAssignmentWithOperatorAssignment
`i = i << 8` could be simplified to 'i \<\<= 8'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    for (int idx = 0; idx < len-1; idx++) {
      byte b = buffer[offset++];
      i = i << 8;
      i = i | (b & 0xFF);
    }
```

### ReplaceAssignmentWithOperatorAssignment
`i = i | (b & 0xFF)` could be simplified to 'i \|= (b \& 0xFF)'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      byte b = buffer[offset++];
      i = i << 8;
      i = i | (b & 0xFF);
    }
    return (WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
```

### ReplaceAssignmentWithOperatorAssignment
`i = i << 8` could be simplified to 'i \<\<= 8'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    for (int idx = 0; idx < len-1; idx++) {
      byte b = buffer[offset++];
      i = i << 8;
      i = i | (b & 0xFF);
    }
```

### ReplaceAssignmentWithOperatorAssignment
`i = i | (b & 0xFF)` could be simplified to 'i \|= (b \& 0xFF)'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      byte b = buffer[offset++];
      i = i << 8;
      i = i | (b & 0xFF);
    }
    return (int)(WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
```

### ReplaceAssignmentWithOperatorAssignment
`l = l >>> 4` could be simplified to 'l \>\>\>= 4'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/HexEncoder.java`
#### Snippet
```java
    for (int i = a.length - 1; i >= 0; i--) {
      a[i] = chars[(int) (l & 0x0f)];
      l = l >>> 4;
    }
  }
```

### ReplaceAssignmentWithOperatorAssignment
`b = b << 4` could be simplified to 'b \<\<= 4'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/HexEncoder.java`
#### Snippet
```java
    long b = 0;
    for (byte anA : a) {
      b = b << 4;
      b |= fromChar(anA);
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
      reader = new SpecificDatumReader(fieldSchema);// ignore dirty bits
      SpecificDatumReader localReader = null;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
      }
```

### NestedAssignment
Result of assignment expression used
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
        reader = new SpecificDatumReader(schema);// ignore dirty bits
        SpecificDatumReader localReader=null;
        if((localReader=readerMap.putIfAbsent(schema, reader))!=null) {
          reader = localReader;
        }
```

### NestedAssignment
Result of assignment expression used
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
      reader = new SpecificDatumReader(fieldSchema);// ignore dirty bits
      SpecificDatumReader localReader = null;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
      }
```

### NestedAssignment
Result of assignment expression used
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
      reader = new SpecificDatumReader(fieldSchema);// ignore dirty bits
      SpecificDatumReader localReader;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
      }
```

### NestedAssignment
Result of assignment expression used
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
      reader = new SpecificDatumReader(fieldSchema);
      SpecificDatumReader localReader;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
      }
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`(o instanceof DirtyMapWrapper && ((DirtyMapWrapper``)o).isDirty()) || !(o instanceof D...` can be simplified to '!(o instanceof DirtyMapWrapper)\|\|((DirtyMapWrapper)o).isDirty()'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      Object mapKey = ((Entry<?, ?>) entry).getKey();
      Object mapVal = ((Entry<?, ?>) entry).getValue();
      if ((o instanceof DirtyMapWrapper && ((DirtyMapWrapper<?, ?>)o).isDirty())
          || !(o instanceof DirtyMapWrapper)) {
        m.put(col.getFirst(), new Text(toBytes(mapKey)), new Value(toBytes(valueType, mapVal)));
        count++;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `uniqFields` are updated, but never queried
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
    fields = query.getFields();
    if (fields != null) {
      HashSet<String> uniqFields = new HashSet<>(Arrays.asList(fields));
      String keyFld = store.getMapping().getPrimaryKey();
      uniqFields.add(keyFld); // return also primary key
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `dataStore` is accessed in both synchronized and unsynchronized contexts
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
  /** This is only for set to array conversion in {@link read()} method */
  private String[] DUMMY_ARRAY = new String[0];
  private static DataStore<String, User> dataStore;
  private User user = new User();
  private Properties prop;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `totalFieldCount` is accessed in both synchronized and unsynchronized contexts
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
  private static final String FIELDS[] = User._ALL_FIELDS;
  private static volatile boolean executed;
  private static int totalFieldCount;
  /** This is only for set to array conversion in {@link read()} method */
  private String[] DUMMY_ARRAY = new String[0];
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `persistentClass` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java

  private Class<K> keyClass;
  private Class<T> persistentClass;
  private RemoteCacheManager cacheManager;
  private QueryFactory qf;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `cache` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java
  private QueryFactory qf;

  private RemoteCache<K, T> cache;
  private boolean cacheExists;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `qf` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java
  private Class<T> persistentClass;
  private RemoteCacheManager cacheManager;
  private QueryFactory qf;

  private RemoteCache<K, T> cache;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `toPut` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java
  private boolean cacheExists;

  private Map<K,T> toPut;

  public InfinispanClient() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `conf` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java
  public static final String ISPN_CONNECTION_STRING_DEFAULT = "127.0.0.1:11222";

  private Configuration conf;

  private Class<K> keyClass;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `splitSize` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
  private String primaryFieldName;
  private int primaryFieldPos;
  private int splitSize;

  /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `primaryFieldPos` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
  private InfinispanClient<K, T> infinispanClient;
  private String primaryFieldName;
  private int primaryFieldPos;
  private int splitSize;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `primaryFieldName` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java

  private InfinispanClient<K, T> infinispanClient;
  private String primaryFieldName;
  private int primaryFieldPos;
  private int splitSize;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `infinispanClient` is accessed in both synchronized and unsynchronized contexts
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
  public static final Logger LOG = LoggerFactory.getLogger(InfinispanStore.class);

  private InfinispanClient<K, T> infinispanClient;
  private String primaryFieldName;
  private int primaryFieldPos;
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheEntryListenerFactory.java`
#### Snippet
```java
 * cache entry events EG:- Creation, Removal, etc of keys on caches and trigger actions as specified.
 */
public class JCacheCacheEntryListenerFactory<K, T extends PersistentBase>
        implements Factory<JCacheCacheEntryListener<K, T>> {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/query/impl/FileSplitPartitionQuery.java`
#### Snippet
```java
 * FileSplitPartitionQuery is best used with existing {@link InputFormat}s.
 */
public class FileSplitPartitionQuery<K, T extends PersistentBase>
  extends PartitionQueryImpl<K,T> {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSDataStoreBase.java`
#### Snippet
```java
 * A Base class for persistent objects{@link DataStore}s.
 */
public abstract class WSDataStoreBase<K, T extends Persistent>
implements DataStore<K, T>{
	
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/store/impl/DataStoreBase.java`
#### Snippet
```java
 * A Base class for Avro persistent {@link DataStore}s.
 */
public abstract class DataStoreBase<K, T extends PersistentBase> 
    implements DataStore<K, T>, Configurable, Writable, Closeable {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/PartitionWSQueryImpl.java`
#### Snippet
```java
//TODO this class should be reviewed when a web service backed datastore has the
// ability to write partition queries
public class PartitionWSQueryImpl<K, T extends Persistent>
  extends QueryWSBase<K, T> implements PartitionQuery<K, T> {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/query/impl/PartitionQueryImpl.java`
#### Snippet
```java
 * Implementation for {@link PartitionQuery}.
 */
public class PartitionQueryImpl<K, T extends PersistentBase> extends QueryBase<K, T>
    implements PartitionQuery<K, T> {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraInputSplit.java`
#### Snippet
```java
 * InputSplit using {@link PartitionQuery}s. 
 */
public class GoraInputSplit extends InputSplit 
  implements Writable, Configurable {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
*/
@TypeInfo(PersistentTypeInfoFactory.class)
public abstract class PersistentBase extends SpecificRecordBase implements
        Persistent {

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
 * @param <T> persistent class
 */
public class CassandraStore<K, T extends Persistent> implements DataStore<K, T> {

  private static final String DEFAULT_MAPPING_FILE = "gora-cassandra-mapping.xml";
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`i ^ -1L` can be replaced with '\~i'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      i = i | (b & 0xFF);
    }
    return (WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
  }

```

### PointlessBitwiseExpression
`i ^ -1L` can be replaced with '\~i'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      i = i | (b & 0xFF);
    }
    return (WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
  }

```

### PointlessBitwiseExpression
`i ^ -1L` can be replaced with '\~i'
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      i = i | (b & 0xFF);
    }
    return (int)(WritableUtils.isNegativeVInt(firstByte) ? (i ^ -1L) : i);
  }

```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    try {
      orientDbStoreParams = OrientDBStoreParameters.load(properties);
      ROOT_URL = "remote:".concat(orientDbStoreParams.getServerHost()).concat(":")
              .concat(orientDbStoreParams.getServerPort());
      ROOT_DATABASE_URL = ROOT_URL.concat("/").concat(orientDbStoreParams.getDatabaseName());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    try {
      orientDbStoreParams = OrientDBStoreParameters.load(properties);
      ROOT_URL = "remote:".concat(orientDbStoreParams.getServerHost()).concat(":")
              .concat(orientDbStoreParams.getServerPort());
      ROOT_DATABASE_URL = ROOT_URL.concat("/").concat(orientDbStoreParams.getDatabaseName());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      orientDbStoreParams = OrientDBStoreParameters.load(properties);
      ROOT_URL = "remote:".concat(orientDbStoreParams.getServerHost()).concat(":")
              .concat(orientDbStoreParams.getServerPort());
      ROOT_DATABASE_URL = ROOT_URL.concat("/").concat(orientDbStoreParams.getDatabaseName());
      remoteServerAdmin = new OServerAdmin(ROOT_URL).connect(orientDbStoreParams.getUserName(),
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      ROOT_URL = "remote:".concat(orientDbStoreParams.getServerHost()).concat(":")
              .concat(orientDbStoreParams.getServerPort());
      ROOT_DATABASE_URL = ROOT_URL.concat("/").concat(orientDbStoreParams.getDatabaseName());
      remoteServerAdmin = new OServerAdmin(ROOT_URL).connect(orientDbStoreParams.getUserName(),
              orientDbStoreParams.getUserPassword());
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      ROOT_URL = "remote:".concat(orientDbStoreParams.getServerHost()).concat(":")
              .concat(orientDbStoreParams.getServerPort());
      ROOT_DATABASE_URL = ROOT_URL.concat("/").concat(orientDbStoreParams.getDatabaseName());
      remoteServerAdmin = new OServerAdmin(ROOT_URL).connect(orientDbStoreParams.getUserName(),
              orientDbStoreParams.getUserPassword());
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
  public void init() throws DBException {
    try {
      synchronized (GoraBenchmarkClient.class) {
        prop = getProperties();
        totalFieldCount = Integer
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
  }

  public T newInstance(ResultSet resultset, String[] fields) throws GoraException, SQLException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `gora-pig/src/main/java/org/apache/gora/pig/GoraDeleteStorage.java`
#### Snippet
```java
  public static final Logger LOG = LoggerFactory.getLogger(GoraDeleteStorage.class);
  
  public GoraDeleteStorage(String storageConfigurationString) throws InstantiationException, IllegalAccessException, JsonParseException, JsonMappingException, IOException {
    super(storageConfigurationString);
  }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `gora-pig/src/main/java/org/apache/gora/pig/GoraDeleteStorage.java`
#### Snippet
```java
  public static final Logger LOG = LoggerFactory.getLogger(GoraDeleteStorage.class);
  
  public GoraDeleteStorage(String storageConfigurationString) throws InstantiationException, IllegalAccessException, JsonParseException, JsonMappingException, IOException {
    super(storageConfigurationString);
  }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  }
  
  public T newInstanceFromHash(RMap<String, Object> map, String[] fields) throws GoraException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  }
  
  public T newInstanceFromString(K key, String[] fields) throws GoraException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
```

## RuleId[id=DoubleBraceInitialization]
### DoubleBraceInitialization
Double brace initialization
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/store/ElasticsearchStore.java`
#### Snippet
```java
    }
    // Special field for range query
    properties.put("gora_id", new HashMap<String, Object>() {{
      put("type", "keyword");
    }});
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'SpecificRecord' type conflicts with preceding 'instanceof Persistent' check
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
      return true;
    } else if (that instanceof Persistent) {
      return PersistentData.get().equals(this, (SpecificRecord) that);
    } else {
      return false;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `localReader` initializer `null` is redundant
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    if (reader == null) {
      reader = new SpecificDatumReader(fieldSchema);// ignore dirty bits
      SpecificDatumReader localReader = null;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
```

### UnusedAssignment
Variable `credential` initializer `null` is redundant
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
   */
  private static MongoCredential createCredential(String authenticationType, String username, String database, String password) {
    MongoCredential credential = null;
    if (PLAIN.getMechanismName().equals(authenticationType)) {
      credential = MongoCredential.createPlainCredential(username, database, password.toCharArray());
```

### UnusedAssignment
Variable `persistent` initializer `null` is redundant
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoader.java`
#### Snippet
```java
  @Override
  public T load(K key) throws CacheLoaderException {
    T persistent = null;
    try {
      persistent = dataStore.get(key);
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
                                            final ODocument doc) throws GoraException {
    Object result;
    Class<?> clazz = null;
    try {
      clazz = ClassLoadingUtils.loadClass(fieldSchema.getFullName());
```

### UnusedAssignment
Variable `dateTime` initializer `null` is redundant
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    if (storeType == OrientDBMapping.DocumentFieldType.DATETIME) {
      if (value != null) {
        Calendar dateTime = null;
        try {
          dateTime = DatatypeConverter.parseDateTime(value.toString());
```

### UnusedAssignment
Variable `date` initializer `null` is redundant
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      }
    } else if (storeType == OrientDBMapping.DocumentFieldType.DATE) {
      Calendar date = null;
      try {
        date = DatatypeConverter.parseDate(value.toString());
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `cacheEntrySubList` initializer `null` is redundant
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
    query.setFields(getFieldsToQuery(query.getFields()));
    
    NavigableSet<K> cacheEntrySubList = null;
    if (startKey != null && endKey != null) {
      try {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      return "";
    }
    String result = null;
    try {
      result = new String(b, off, len, "UTF-8");
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
      throw new IllegalArgumentException("string cannot be null");
    }
    byte [] result = null;
    try {
      result = s.getBytes("UTF-8");
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
                                               final MapObject<String, Object> doc) throws GoraException {
    Object result;
    Class<?> clazz = null;
    try {
      clazz = ClassLoadingUtils.loadClass(fieldSchema.getFullName());
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `results` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
  @Override
  public Result<K, T> execute(Query<K, T> query) throws GoraException {
    Result<K, T> results = null;
    try{
      if(query instanceof FileSplitPartitionQuery) {
```

### UnusedAssignment
Variable `splits` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
  @Override
  public List<PartitionQuery<K, T>> getPartitions(Query<K, T> query) throws IOException {
    List<InputSplit> splits = null;
    List<PartitionQuery<K, T>> queries = null;
    splits = GoraMapReduceUtils.getSplits(getConf(), inputPath);
```

### UnusedAssignment
Variable `queries` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
  public List<PartitionQuery<K, T>> getPartitions(Query<K, T> query) throws IOException {
    List<InputSplit> splits = null;
    List<PartitionQuery<K, T>> queries = null;
    splits = GoraMapReduceUtils.getSplits(getConf(), inputPath);
    queries = new ArrayList<>(splits.size());
```

### UnusedAssignment
The value changed at `arrIndex++` is never used
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
    }

    arr[arrIndex++] = b;
    out.writeFixed(arr);
  }
```

### UnusedAssignment
Variable `isKeyPersistent` initializer `false` is redundant
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/BeanFactoryWSImpl.java`
#### Snippet
```java
   * Flag to be used to determine if a key is persistent or not
   */
  private boolean isKeyPersistent = false;

  /**
```

### UnusedAssignment
Variable `submap` initializer `null` is redundant
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
    //check if query.fields is null
    query.setFields(getFieldsToQuery(query.getFields()));
    NavigableMap<K,T> submap = null;
    if (startKey != null && endKey != null) {
      try {
```

### UnusedAssignment
Variable `isKeyPersistent` initializer `false` is redundant
in `gora-core/src/main/java/org/apache/gora/persistency/impl/BeanFactoryImpl.java`
#### Snippet
```java
  
  /** Flag to be used to determine if a key is persistent or not */
  private boolean isKeyPersistent = false;

  /**
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `gora-jet/src/main/java/org/apache/gora/jet/JetSource.java`
#### Snippet
```java
      int partitionNo = globalIndex;
      while (partitionNo < partitionQueries.size()) {
        Result<KeyIn, ValueIn> result = null;
        result = partitionQueries.get(partitionNo).execute();
        while (result.next()) {
```

### UnusedAssignment
Variable `scoreDocs` initializer `null` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
        extends ResultBase<K, T> {

  private ScoreDoc[] scoreDocs = null;
  private final LuceneStore<K, T> store;
  private String[] fields;
```

### UnusedAssignment
The value `store.get(prev, PREV_FIELD)` assigned to `node` is never used
in `gora-goraci/src/main/java/org/apache/gora/goraci/Walker.java`
#### Snippet
```java

        long t1 = System.currentTimeMillis();
        node = store.get(prev, PREV_FIELD);
        long t2 = System.currentTimeMillis();
        LOG.info("CQ %d %016x \n {}", new Object [] {t2 - t1, prev});
```

### UnusedAssignment
Variable `keyPairFile` initializer `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
    KeyPairApi keyPairApi = novaApi.getKeyPairApi(rsRegion).get();

    File keyPairFile = null;
    String publicKey = null;
    //Use your own .pub key which should be on CP
```

### UnusedAssignment
Variable `publicKey` initializer `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

    File keyPairFile = null;
    String publicKey = null;
    //Use your own .pub key which should be on CP
    if (DataStoreFactory.findBooleanProperty(properties, MemStore.class.getDeclaredConstructor().newInstance(), RS_PUBKEY, "true")) {
```

### UnusedAssignment
The value `new File("~/.ssh/id_rsa.pub")` assigned to `keyPairFile` is never used
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
    //Use your own .pub key which should be on CP
    if (DataStoreFactory.findBooleanProperty(properties, MemStore.class.getDeclaredConstructor().newInstance(), RS_PUBKEY, "true")) {
      keyPairFile = new File("~/.ssh/id_rsa.pub");
      LOG.info("Uploading local public key from ~/.ssh/id_rsa.pub to Rackspace...");
    } else {
```

### UnusedAssignment
The value `keyPairApi.get("goraci-keypair").getPublicKey()` assigned to `publicKey` is never used
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
      //obtain existing key from Rackspace
      if (keyPairApi.get("goraci-keypair") != null) {
        publicKey = keyPairApi.get("goraci-keypair").getPublicKey();
        LOG.info("Obtained existing public key 'goraci-keypair' from Rackspace...");
      } else {
```

### UnusedAssignment
Variable `serverCreated` initializer `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
    ServerApi serverApi = novaApi.getServerApi(rsRegion);
    CreateServerOptions options = CreateServerOptions.Builder.keyPairName("goraci-keypair");
    ServerCreated serverCreated = null;
    for (int i = 0; i < numServers; i++) {
      if (serverName != null) {
```

### UnusedAssignment
Variable `localReader` initializer `null` is redundant
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
      if (reader == null) {
        reader = new SpecificDatumReader(schema);// ignore dirty bits
        SpecificDatumReader localReader=null;
        if((localReader=readerMap.putIfAbsent(schema, reader))!=null) {
          reader = localReader;
```

### UnusedAssignment
Variable `fromSchema` initializer `null` is redundant
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java

  public Object fromBytes(Schema schema, byte[] data) throws IOException {
    Schema fromSchema = null;
    if (schema.getType() == Type.UNION) {
      try {
```

### UnusedAssignment
Variable `unionIndex` initializer `0` is redundant
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      org.apache.avro.io.BinaryEncoder avroEncoder = EncoderFactory.get().binaryEncoder(baos, null);
      int unionIndex = 0;
      try {
        if (o == null) {
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `innerSchema` initializer `null` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    if (!type0.equals(type1)
            && (type0.equals(Schema.Type.NULL) || type1.equals(Schema.Type.NULL))) {
      Schema innerSchema = null;
      if (type0.equals(Schema.Type.NULL)) {
        innerSchema = fieldSchema.getTypes().get(1);
```

### UnusedAssignment
Variable `mappingFile` initializer `null` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    }

    String mappingFile = null;
    try {
      mappingFile = DataStoreFactory.getMappingFile(
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/query/SolrResult.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(SolrResult.class);
  
  SolrDocumentList list = null;
  SolrStore<K, T> store;
  String[] fields;
```

### UnusedAssignment
Variable `resourceFieldSchemas` initializer `null` is redundant
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java
   */
  public static ResourceSchema generatePigSchema(Schema persistentSchema, List<String> queryFields, Class<?> keyClass) throws IOException {
    ResourceFieldSchema[] resourceFieldSchemas = null ;
    
    int numFields = queryFields.size() + 1 ; // We count 'key' field here
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
    try {
      ((InfinispanQuery<K,T>)query).build();
      InfinispanResult<K,T> result = null;
      result = new InfinispanResult<>(this, (InfinispanQuery<K,T>)query);
      LOG.trace("query: " + query.toString());
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
      boolean isAllFields = Arrays.equals(fields, getFields());
  
      org.apache.gora.query.Result<K, T> result = null;
      result = query.execute();
      ArrayList<Delete> deletes = new ArrayList<>();
```

### UnusedAssignment
The value `(context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,this.endKey)` assigned to `context` is never used
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
    }else{
      if (this.startKey!=null && this.endKey!=null)
        context = (context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,this.endKey);
      else if (this.startKey!=null)
        context = (context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,null);
```

### UnusedAssignment
The value `(context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,null)` assigned to `context` is never used
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
        context = (context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,this.endKey);
      else if (this.startKey!=null)
        context = (context == null ? qb : context.and()).having(getPrimaryFieldName()).between(this.startKey,null);
      else if (this.endKey!=null)
        (context == null ? qb : context.and()).having(getPrimaryFieldName()).between(null,this.endKey);
```

### UnusedAssignment
Variable `awsCredentials` initializer `null` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
   */
  public static PropertiesCredentials getCredentials(Class<?> clazz) {
    PropertiesCredentials awsCredentials = null;
    try {
      InputStream awsCredInpStr = clazz.getClassLoader().getResourceAsStream(
```

### UnusedAssignment
The value `false` assigned to `rsl` is never used
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
        if (tablesToKeySchemas.get(tableName) == null) {
          LOG.error("No schema defined for DynamoDB table '" + tableName + '\'');
          rsl = false;
        }
        rsl = verifyKeySchema(tableName);
```

### UnusedAssignment
Variable `fieldValue` initializer `null` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  private Object deserializeFieldValue(Field field, Schema fieldSchema,
      Object solrValue, T persistent) throws IOException {
    Object fieldValue = null;
    switch (fieldSchema.getType()) {
    case MAP:
```

### UnusedAssignment
Variable `localReader` initializer `null` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    if (reader == null) {
      reader = new SpecificDatumReader(fieldSchema);// ignore dirty bits
      SpecificDatumReader localReader = null;
      if ((localReader = readerMap.putIfAbsent(fieldSchema, reader)) != null) {
        reader = localReader;
```

### UnusedAssignment
Variable `sf` initializer `null` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
      Field field = fieldMap.get(f);
      Schema fieldSchema = field.schema();
      String sf = null;
      if (pk.equals(f)) {
        sf = f;
```

### UnusedAssignment
Variable `exists` initializer `false` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  @Override
  public boolean schemaExists() throws GoraException {
    boolean exists = false;
    try {
      CoreAdminResponse rsp = CoreAdminRequest.getStatus(mapping.getCoreName(),
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
  public boolean delete(K key) throws GoraException {
    try {
      T object = null;
      Object rangeKey = null, hashKey = null;
      DynamoDBMapper mapper = new DynamoDBMapper(
```

### UnusedAssignment
The value `(T) mapper.load(persistentClass, key)` assigned to `object` is never used
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
      }
      if (hashKey == null)
        object = (T) mapper.load(persistentClass, key);
      if (rangeKey == null)
        object = (T) mapper.load(persistentClass, hashKey);
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
   */
  public T get(K key) throws GoraException {
    T object = null;
    try {
      Object rangeKey;
```

### UnusedAssignment
Variable `obj` initializer `null` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
  @Override
  public T newPersistent() throws GoraException {
    T obj = null;
    try {
      obj = persistentClass.getDeclaredConstructor().newInstance();
```

### UnusedAssignment
Variable `deletes` initializer `null` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
    // boolean isAllFields = Arrays.equals(fields
    // , getBeanFactory().getCachedPersistent().getFields());
    ArrayList<T> deletes = null ;
    try {
      Result<K, T> result = execute(query);
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
    }

    Class<?> clazz = null;
    try {
      clazz = ClassLoadingUtils.loadClass(fieldSchema.getFullName());
```

### UnusedAssignment
Variable `redisVal` initializer `null` is redundant
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
      String redisField = mapping.getFields().get(field.name());
      RedisType redisType = mapping.getTypes().get(field.name());
      Object redisVal = null;
      switch (redisType) {
        case STRING:
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      case STRING:
        result = new Utf8(obj.get(docf).toString());
        ;
        break;
      case ENUM:
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java
    }
    
  } ;
  
  private static RecursiveRecordSchema recursiveRecordSchema = new RecursiveRecordSchema() ;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
    for (Map.Entry<String, Object> e : map.entrySet()) {
      Schema innerSchema = fieldSchema.getValueType();
      ;
      Object o = fromDBObject(innerSchema, field, e.getKey(), e.getValue());
      rmap.put(new Utf8(e.getKey()), o);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
              .first()
              .stream()
              .anyMatch(db -> db.equals(databaseIdentifier))) {
        r.dbCreate(rethinkDBStoreParameters.getDatabaseName()).run(connection);
      }
```

### SimplifyStreamApiCallChains
Can be replaced with 'peek'
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
      }
    } else {
      range.stream().map((key) -> {
        secundaryIndex.removeAsync(key);
        return key;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
    String tableName = mapping.getCoreName();
    String packageName = fullQualifiedName.substring(0, fullQualifiedName.lastIndexOf("."));
    String className = fullQualifiedName.substring(packageName.length() + 1, fullQualifiedName.length());
    String keySpace = mapping.getKeySpace().getName();

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
  static String cap(String name) {
    return name.substring(0, 1).toUpperCase(Locale.getDefault())
            + name.substring(1, name.length());
  }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
  static String cap(String name) {
    return name.substring(0,1).toUpperCase(Locale.getDefault())
        + name.substring(1,name.length());
  }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
    for (String itemName : pItems.keySet()) {
      String itemType = "String";
      if (pItems.get(itemName).toString().equals("N"))
        itemType = "double";
      if (pItems.get(itemName).toString().equals("SS"))
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      if (pItems.get(itemName).toString().equals("N"))
        itemType = "double";
      if (pItems.get(itemName).toString().equals("SS"))
        itemType = "Set<String>";
      if (pItems.get(itemName).toString().equals("SN"))
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      if (pItems.get(itemName).toString().equals("SS"))
        itemType = "Set<String>";
      if (pItems.get(itemName).toString().equals("SN"))
        itemType = "Set<double>";
      line(pIden, "private " + itemType + " " + itemName + ";");
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @return a populated output {@link org.apache.hadoop.conf.Configuration} 
   */
    public <K, V extends Persistent> Configuration generateOutputConf(Job job,
        DataStore<K, V> dataStore) {
      return generateOutputConf(job, dataStore.getClass(), dataStore.getKeyClass(),
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @return a populated output {@link org.apache.hadoop.conf.Configuration} 
   */
    public <K, V extends Persistent> Configuration generateOutputConf(Job job,
        DataStore<K, V> dataStore) {
      return generateOutputConf(job, dataStore.getClass(), dataStore.getKeyClass(),
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @throws IOException if there is an error creating the configuration
   */
    public <K, V extends Persistent> Configuration generateOutputConf(DataStore<K, V> dataStore)
       throws IOException {
      Configuration hadoopConf;
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @throws IOException if there is an error creating the configuration
   */
    public <K, V extends Persistent> Configuration generateOutputConf(DataStore<K, V> dataStore)
       throws IOException {
      Configuration hadoopConf;
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   */
    @SuppressWarnings("rawtypes")
    public <K, V extends Persistent> Configuration generateOutputConf(Job job,
        Class<? extends DataStore> dataStoreClass,
        Class<K> keyClass, Class<V> persistentClass) {
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   */
    @SuppressWarnings("rawtypes")
    public <K, V extends Persistent> Configuration generateOutputConf(Job job,
        Class<? extends DataStore> dataStoreClass,
        Class<K> keyClass, Class<V> persistentClass) {
```

### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
  }

  private <K> Query inferType(String pk, K lower, K upper) {
    if (((lower != null && lower.getClass() == Integer.class)
            || (upper != null && upper.getClass() == Integer.class))) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsFlink.java`
#### Snippet
```java
      // create key for emitting tuple
      String key = metricDatum.getMetricDimension().toString();
      key += "_" + Long.toString(timestamp);
      metricDatum.setMetric(sum);

```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsSpark.java`
#### Snippet
```java

      String key = metricDatum.getMetricDimension().toString();
      key += "_" + Long.toString(timestamp);
      metricDatum.setMetric(tuple2LongTuple2._2());
      return new Tuple2<>(key, metricDatum);
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalytics.java`
#### Snippet
```java
      
      String key = metricDatum.getMetricDimension().toString();
      key += "_" + Long.toString(timestamp);
      metricDatum.setMetric(sum);
      
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `reader` declared in one 'switch' branch and used in another
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
      case ARRAY:
      case RECORD:
        @SuppressWarnings("rawtypes") SpecificDatumReader reader = getDatumReader(fieldSchema);
        fieldValue = IOUtils.deserialize((byte[]) igniteValue, reader,
            persistent.get(field.pos()));
```

### SwitchStatementWithConfusingDeclaration
Local variable `data` declared in one 'switch' branch and used in another
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
      case MAP:
      case RECORD:
        byte[] data = null;
        try {
          @SuppressWarnings("rawtypes")
```

### SwitchStatementWithConfusingDeclaration
Local variable `value` declared in one 'switch' branch and used in another
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
    case MAP:
    case ARRAY:
      Object value = get(field.pos());
      return !(value instanceof Dirtyable) || value==null ? false : ((Dirtyable) value).isDirty();
    case UNION:
```

### SwitchStatementWithConfusingDeclaration
Local variable `valueSchema` declared in one 'switch' branch and used in another
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
        break;
      case MAP:
        Schema valueSchema = fieldSchema.getValueType();
        Schema.Type valuetype = valueSchema.getType();
        Map<String, Object> map = new HashMap<>();
```

### SwitchStatementWithConfusingDeclaration
Local variable `valuetype` declared in one 'switch' branch and used in another
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
      case MAP:
        Schema valueSchema = fieldSchema.getValueType();
        Schema.Type valuetype = valueSchema.getType();
        Map<String, Object> map = new HashMap<>();
        for (Map.Entry<CharSequence, ?> e : ((Map<CharSequence, ?>) fieldValue).entrySet()) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `reader` declared in one 'switch' branch and used in another
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
      case ARRAY:
      case RECORD:
        @SuppressWarnings("rawtypes") SpecificDatumReader reader = getDatumReader(fieldSchema);
        fieldValue = IOUtils.deserialize((byte[]) kuduValue, reader,
            persistent.get(field.pos()));
```

### SwitchStatementWithConfusingDeclaration
Local variable `data` declared in one 'switch' branch and used in another
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
      case MAP:
      case RECORD:
        byte[] data = null;
        try {
          @SuppressWarnings("rawtypes")
```

### SwitchStatementWithConfusingDeclaration
Local variable `data` declared in one 'switch' branch and used in another
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
      case MAP:
      case RECORD:
        byte[] data = null;
        try {
          @SuppressWarnings("rawtypes")
```

### SwitchStatementWithConfusingDeclaration
Local variable `reader` declared in one 'switch' branch and used in another
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
      case ARRAY:
      case RECORD:
        @SuppressWarnings("rawtypes") SpecificDatumReader reader = getDatumReader(fieldSchema);
        fieldValue = IOUtils.deserialize((byte[]) redisValue, reader,
            persistent.get(field.pos()));
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `conf` accessed in synchronized context
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
      super.initialize(keyClass, persistentClass, properties);
      infinispanClient  = new InfinispanClient<>();
      infinispanClient.setConf(conf);

      LOG.info("key class: "
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `schema` accessed in synchronized context
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
          + ", persistent class: "
          + persistentClass.getCanonicalName());
      schema = persistentClass.getDeclaredConstructor().newInstance().getSchema();

      splitSize = Integer.parseInt(properties.getProperty(BUFFER_LIMIT_READ_NAME, getConf().get(BUFFER_LIMIT_READ_NAME, String.valueOf(BUFFER_LIMIT_READ_VALUE))));
```

### PublicFieldAccessedInSynchronizedContext
Non-private field `schema` accessed in synchronized context
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java

      primaryFieldPos = 0;
      primaryFieldName = schema.getFields().get(0).name();
      this.infinispanClient.initialize(keyClass, persistentClass, properties);

```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkUtils.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static void generateMappingFile(String dbName) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder;
```

### RedundantSuppression
Redundant suppression
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.userId = (java.lang.CharSequence)(value); break;
```

### RedundantSuppression
Redundant suppression
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  @Override
  public boolean exists(K key) {
    return map.containsKey(key);
  }
```

### RedundantSuppression
Redundant suppression
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.prev = (java.lang.Long)(value); break;
```

### RedundantSuppression
Redundant suppression
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.count = (java.lang.Long)(value); break;
```

### RedundantSuppression
Redundant suppression
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
  @Override
  @SuppressWarnings("unchecked")
  public void readFields(DataInput in) throws IOException {
    super.readFields(in);
    sortingField = WritableUtils.readString(in);
```

### RedundantSuppression
Redundant suppression
in `gora-pig/src/main/java/org/apache/gora/pig/GoraDeleteStorage.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  @Override
  public void prepareToRead(RecordReader reader, PigSplit split) throws IOException {
    throw new IOException(this.getClass().getName() + " can not be used to load data.") ;
  }
```

### RedundantSuppression
Redundant suppression
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({ "rawtypes" })
  public void prepareToRead(RecordReader reader, PigSplit split)
      throws IOException {
    this.reader = (GoraRecordReader<?, ?>) reader;
```

### RedundantSuppression
Redundant suppression
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void prepareToWrite(RecordWriter writer) throws IOException {
    // Get the schema of data to write from UDFContext (coming from frontend checkSchema())
    String strSchema = this.getUDFProperties().getProperty(GoraStorage.GORA_STORE_PIG_SCHEMA) ;
```

### RedundantSuppression
Redundant suppression
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public Object deserializeFieldMap(Schema.Field field, Schema fieldSchema,
      RMap<Object, Object> redisMap, T persistent) throws IOException {
    Map<Utf8, Object> fieldValue = new HashMap<>();
```

### RedundantSuppression
Redundant suppression
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public Object deserializeFieldList(Schema.Field field, Schema fieldSchema,
      RList<Object> redisList, T persistent) throws IOException {
    List<Object> fieldValue = new ArrayList<>();
```

### RedundantSuppression
Redundant suppression
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.metricDimension = (java.lang.CharSequence)(value); break;
```

### RedundantSuppression
Redundant suppression
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.url = (java.lang.CharSequence)(value); break;
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `gora-core/src/main/java/org/apache/gora/filter/FilterList.java`
#### Snippet
```java
        }
      } catch (Exception e) {
        throw (IOException)new IOException("Failed filter init").initCause(e);
      }
    }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `Null` has only 'static' members, and a 'public' constructor
in `gora-core/src/main/java/org/apache/gora/util/Null.java`
#### Snippet
```java
 * Placeholder for Null type arguments
 */
public class Null {

  private static final Null INSTANCE = new Null();
```

### UtilityClassWithPublicConstructor
Class `ChefSoftwareProvisioning` has only 'static' members, and a 'public' constructor
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
 *<code>gora.properties</code>.
 */
public class ChefSoftwareProvisioning {
  
  private static String CHEF_CLIENT = "chef.client";
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/query/CouchDBResult.java`
#### Snippet
```java
  @Override
  protected boolean nextInner() throws IOException {
    if (result == null || result.size() <= 0 || position >= result.size()) {
      return false;
    }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    String result = null;
    try {
      result = new String(b, off, len, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      LOG.error(e.getMessage());
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    byte [] result = null;
    try {
      result = s.getBytes("UTF-8");
    } catch (UnsupportedEncodingException e) {
      LOG.error(e.getMessage());
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
        return (K) Double.valueOf(encoder.decodeDouble(val));
      } else if (clazz.equals(String.class)) {
        return (K) new String(val, "UTF-8");
      } else if (clazz.equals(Utf8.class)) {
        return (K) new Utf8(val);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
    try {
      if (o instanceof String) {
        return ((String) o).getBytes("UTF-8");
      } else if (o instanceof Utf8) {
        return copyIfNeeded(((Utf8) o).getBytes(), 0, ((Utf8) o).getByteLength());
```

## RuleId[id=ImplicitArrayToString]
### ImplicitArrayToString
Call to 'toString()' on array
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java
    } catch (IOException ex) {
      MongoStore.LOG.error(ex.getMessage());
      MongoStore.LOG.error(ex.getStackTrace().toString());
      throw ex;
    } catch (Exception ex) {
```

### ImplicitArrayToString
Call to 'toString()' on array
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java
    } catch (Exception ex) {
      MongoStore.LOG.error(ex.getMessage());
      MongoStore.LOG.error(ex.getStackTrace().toString());
      throw new IOException(ex);
    }
```

### ImplicitArrayToString
Implicit call to 'toString()' on array `fields`
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
  @Override
  public T get(K key, String[] fields) throws GoraException {
    LOG.debug("get("+key+","+fields+")");
    try {
      if (fields==null)
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-ignite/src/main/java/org/apache/gora/ignite/utils/IgniteSQLBuilder.java`
#### Snippet
```java
    }
    return insertQuery.addCustomPreparedColumns(columns).validate().toString()
        .replaceFirst("INSERT", "MERGE");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
      return null;
    }
    return key.replace("\u00B7", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
      return null;
    }
    return key.replace(".", "\u00B7");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      return null;
    }
    return key.replace(".", "\u00B7")
            .replace(":", "\u00FF")
            .replace(";", "\u00FE")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    }
    return key.replace(".", "\u00B7")
            .replace(":", "\u00FF")
            .replace(";", "\u00FE")
            .replace(" ", "\u00FD")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    return key.replace(".", "\u00B7")
            .replace(":", "\u00FF")
            .replace(";", "\u00FE")
            .replace(" ", "\u00FD")
            .replace("%", "\u00FC")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace(":", "\u00FF")
            .replace(";", "\u00FE")
            .replace(" ", "\u00FD")
            .replace("%", "\u00FC")
            .replace("=", "\u00FB");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace(";", "\u00FE")
            .replace(" ", "\u00FD")
            .replace("%", "\u00FC")
            .replace("=", "\u00FB");
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace(" ", "\u00FD")
            .replace("%", "\u00FC")
            .replace("=", "\u00FB");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      return null;
    }
    return key.replace("\u00B7", ".")
            .replace("\u00FF", ":")
            .replace("\u00FE", ";")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    }
    return key.replace("\u00B7", ".")
            .replace("\u00FF", ":")
            .replace("\u00FE", ";")
            .replace("\u00FD", " ")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    return key.replace("\u00B7", ".")
            .replace("\u00FF", ":")
            .replace("\u00FE", ";")
            .replace("\u00FD", " ")
            .replace("\u00FC", "%")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace("\u00FF", ":")
            .replace("\u00FE", ";")
            .replace("\u00FD", " ")
            .replace("\u00FC", "%")
            .replace("\u00FB", "=");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace("\u00FE", ";")
            .replace("\u00FD", " ")
            .replace("\u00FC", "%")
            .replace("\u00FB", "=");
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
            .replace("\u00FD", " ")
            .replace("\u00FC", "%")
            .replace("\u00FB", "=");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("key", key);
    OCommandSQL query = new OCommandSQL(delete.toString().replace("DELETE", "DELETE FROM"));
    try (ODatabaseDocumentTx deleteTx = connectionPool.acquire()) {
      deleteTx.activateOnCurrentThread();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      }

      OCommandSQL dbQuery = new OCommandSQL(delete.toString().replace("DELETE", "DELETE FROM"));
      try (ODatabaseDocumentTx deleteTx = connectionPool.acquire()) {
        deleteTx.activateOnCurrentThread();
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMappingBuilder.java`
#### Snippet
```java
          // replace UDT into frozen
          if (attributeValue.contains("udt(")) {
            attributeValue = attributeValue.replace("udt(", "frozen(");
          }
          fieldKey.setType(attributeValue.replace("(", "<").replace(")", ">"));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMappingBuilder.java`
#### Snippet
```java
            attributeValue = attributeValue.replace("udt(", "frozen(");
          }
          fieldKey.setType(attributeValue.replace("(", "<").replace(")", ">"));
          if (fieldKey.getType().equalsIgnoreCase("udt")) {
            throw new RuntimeException("Invalid udt type, Please enter dataType for udt with a unique name for particular user define data type, like udt(metadata).");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMappingBuilder.java`
#### Snippet
```java
            attributeValue = attributeValue.replace("udt(", "frozen(");
          }
          fieldKey.setType(attributeValue.replace("(", "<").replace(")", ">"));
          if (fieldKey.getType().equalsIgnoreCase("udt")) {
            throw new RuntimeException("Invalid udt type, Please enter dataType for udt with a unique name for particular user define data type, like udt(metadata).");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gora-pig/src/main/java/org/apache/gora/pig/StorageConfiguration.java`
#### Snippet
```java
  
  public List<String> getFieldsAsList() {
    return Arrays.asList(this.fields.split("\\s*,\\s*")) ;
  }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ResultWSBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/ResultWSBase.java`
#### Snippet
```java
   * @param query
   */
  public ResultWSBase(DataStore<K,T> dataStore, Query<K,T> query) {
    this.dataStore = dataStore;
    this.query = query;
```

### NonProtectedConstructorInAbstractClass
Constructor `QueryWSBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/QueryWSBase.java`
#### Snippet
```java
   * @param dataStore
   */
  public QueryWSBase(DataStore<K,T> dataStore) {
    this.dataStore = dataStore;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ResultBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/query/impl/ResultBase.java`
#### Snippet
```java
  protected long offset = 0;

  public ResultBase(DataStore<K,T> dataStore, Query<K,T> query) {
    this.dataStore = dataStore;
    this.query = query;
```

### NonProtectedConstructorInAbstractClass
Constructor `QueryBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/query/impl/QueryBase.java`
#### Snippet
```java
  protected Configuration conf;

  public QueryBase(DataStore<K,T> dataStore) {
    this.dataStore = (DataStoreBase<K, T>)dataStore;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `WSDataStoreBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSDataStoreBase.java`
#### Snippet
```java
   * Default constructor
   */
  public WSDataStoreBase() {
  }

```

### NonProtectedConstructorInAbstractClass
Constructor `DataStoreBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/store/impl/DataStoreBase.java`
#### Snippet
```java
  public static final Logger LOG = LoggerFactory.getLogger(AvroStore.class);

  public DataStoreBase() {
  }

```

### NonProtectedConstructorInAbstractClass
Constructor `PersistentBase()` of an abstract class should not be declared 'public'
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
  private java.nio.ByteBuffer __g__dirty;

  public PersistentBase() {
    __g__dirty = java.nio.ByteBuffer.wrap(new byte[getFieldsCount()]);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `HBaseResult()` of an abstract class should not be declared 'public'
in `gora-hbase/src/main/java/org/apache/gora/hbase/query/HBaseResult.java`
#### Snippet
```java
  extends ResultBase<K, T> {

  public HBaseResult(HBaseStore<K,T> dataStore, Query<K, T> query) {
    super(dataStore, query);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractGoraMojo()` of an abstract class should not be declared 'public'
in `gora-maven-plugin/src/main/java/org/apache/gora/maven/plugin/AbstractGoraMojo.java`
#### Snippet
```java
  protected BuildContext context;

  public AbstractGoraMojo() {
    super();
  }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java

  public T newInstance(ResultSet resultset, String[] fields) throws GoraException, SQLException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
    for (String f : fields) {
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `gora-core/src/main/java/org/apache/gora/util/TimingUtil.java`
#### Snippet
```java
        for (int i = 0; i < TIME_FACTOR.length; i++) {
            elapsedTime[i] = start > end ? -1 : (end - start) / TIME_FACTOR[i];
            start += TIME_FACTOR[i] * elapsedTime[i];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    for(int i=7;i>0;i--) {
      b[i] = (byte)(val);
      val >>>= 8;
    }
    b[0] = (byte)(val);
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    byte[] b = new byte[SIZEOF_CHAR];
    b[1] = (byte) (val);
    val >>= 8;
    b[0] = (byte) (val);
    return b;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    byte[] b = new byte[SIZEOF_SHORT];
    b[1] = (byte)(val);
    val >>= 8;
    b[0] = (byte)(val);
    return b;
```

### AssignmentToMethodParameter
Assignment to method parameter `val`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    for(int i = 3; i > 0; i--) {
      b[i] = (byte)(val);
      val >>>= 8;
    }
    b[0] = (byte)(val);
```

### AssignmentToMethodParameter
Assignment to method parameter `persistent`
in `gora-core/src/main/java/org/apache/gora/mapreduce/PersistentDeserializer.java`
#### Snippet
```java
  @Override
  public PersistentBase deserialize(PersistentBase persistent) throws IOException {
    persistent = datumReader.read(reuseObjects ? persistent : null, decoder);
    byte[] __g__dirty = new byte[persistent.getFieldsCount()];
    decoder.readFixed(__g__dirty);
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/SignedBinaryEncoder.java`
#### Snippet
```java
  @Override
  public byte[] encodeLong(long l, byte[] ret) throws IOException{
    l = l ^ 0x8000000000000000L;
    return super.encodeLong(l, ret);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/SignedBinaryEncoder.java`
#### Snippet
```java
  @Override
  public byte[] encodeShort(short s, byte[] ret) throws IOException{
    s = (short)((s & 0xffff) ^ 0x8000);
    return super.encodeShort(s, ret);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/SignedBinaryEncoder.java`
#### Snippet
```java
  @Override
  public byte[] encodeInt(int i, byte[] ret) throws IOException{
    i = i ^ 0x80000000;
    return super.encodeInt(i, ret);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/HexEncoder.java`
#### Snippet
```java
    for (int i = a.length - 1; i >= 0; i--) {
      a[i] = chars[(int) (l & 0x0f)];
      l = l >>> 4;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      log.warn("Keys should be LOWERCASE. Please change that!");
      log.warn("Using lowecase for key " + key);
      key = key.toLowerCase(Locale.getDefault());
    }
    String result = properties.getProperty(key);
```

### AssignmentToMethodParameter
Assignment to method parameter `properties`
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
          throws GoraException {
    if (properties == null || properties.size() == 0) {
      properties = createProps();
    }
    return createDataStore(dataStoreClass, keyClass, persistent, conf, properties, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `props`
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      Class<T> p = (Class<T>) ClassLoadingUtils.loadClass(persistentClass);
      if (props == null || props.size() == 0) {
        props = createProps();
      }
      return createDataStore(c, k, p, conf, props, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `props`
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
      Class<T> p = (Class<T>) ClassLoadingUtils.loadClass(persistentClass);
      if (props == null || props.size() == 0) {
        props = createProps();
      }
      return createDataStore(c, k, p, conf, props, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
      if (!dir.mkdirs())
        throw new IOException("Unable to create " + dir);
    name = cap(name) + ".java";
    out = new OutputStreamWriter(new FileOutputStream(new File(dir, name)), Charset.defaultCharset());
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
  public Persistent get(Object key, String[] fields) {
    if (fields == null) {
      fields = getFields();
    }
    String cqlQuery = CassandraQueryFactory.getSelectObjectWithFieldsQuery(mapping, fields);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String[] servers = serversParam.split(",");
    for (String server : servers) {
      builder = builder.addContactPoint(server);
    }
    String portProp = properties.getProperty(CassandraStoreParameters.PORT);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String portProp = properties.getProperty(CassandraStoreParameters.PORT);
    if (portProp != null) {
      builder = builder.withPort(Integer.parseInt(portProp));
    }
    String clusterNameProp = properties.getProperty(CassandraStoreParameters.CLUSTER_NAME);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String clusterNameProp = properties.getProperty(CassandraStoreParameters.CLUSTER_NAME);
    if (clusterNameProp != null) {
      builder = builder.withClusterName(clusterNameProp);
    }
    String compressionProp = properties.getProperty(CassandraStoreParameters.COMPRESSION);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String compressionProp = properties.getProperty(CassandraStoreParameters.COMPRESSION);
    if (compressionProp != null) {
      builder = builder.withCompression(ProtocolOptions.Compression.valueOf(compressionProp));
    }
    builder = this.populateCredentials(properties, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      builder = builder.withCompression(ProtocolOptions.Compression.valueOf(compressionProp));
    }
    builder = this.populateCredentials(properties, builder);
    builder = this.populateLoadBalancingProp(properties, builder);
    String enableJMXProp = properties.getProperty(CassandraStoreParameters.ENABLE_JMX_REPORTING);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    }
    builder = this.populateCredentials(properties, builder);
    builder = this.populateLoadBalancingProp(properties, builder);
    String enableJMXProp = properties.getProperty(CassandraStoreParameters.ENABLE_JMX_REPORTING);
    if (!Boolean.parseBoolean(enableJMXProp)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String enableJMXProp = properties.getProperty(CassandraStoreParameters.ENABLE_JMX_REPORTING);
    if (!Boolean.parseBoolean(enableJMXProp)) {
      builder = builder.withoutJMXReporting();
    }
    String enableMetricsProp = properties.getProperty(CassandraStoreParameters.ENABLE_METRICS);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String enableMetricsProp = properties.getProperty(CassandraStoreParameters.ENABLE_METRICS);
    if (!Boolean.parseBoolean(enableMetricsProp)) {
      builder = builder.withoutMetrics();
    }
    builder = this.populatePoolingSettings(properties, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      builder = builder.withoutMetrics();
    }
    builder = this.populatePoolingSettings(properties, builder);
    String versionProp = properties.getProperty(CassandraStoreParameters.PROTOCOL_VERSION);
    if (versionProp != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String versionProp = properties.getProperty(CassandraStoreParameters.PROTOCOL_VERSION);
    if (versionProp != null) {
      builder = builder.withProtocolVersion(ProtocolVersion.fromInt(Integer.parseInt(versionProp)));
    }
    builder = this.populateQueryOptions(properties, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      builder = builder.withProtocolVersion(ProtocolVersion.fromInt(Integer.parseInt(versionProp)));
    }
    builder = this.populateQueryOptions(properties, builder);
    builder = this.populateReconnectPolicy(properties, builder);
    builder = this.populateRetrytPolicy(properties, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    }
    builder = this.populateQueryOptions(properties, builder);
    builder = this.populateReconnectPolicy(properties, builder);
    builder = this.populateRetrytPolicy(properties, builder);
    builder = this.populateSocketOptions(properties, builder);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    builder = this.populateQueryOptions(properties, builder);
    builder = this.populateReconnectPolicy(properties, builder);
    builder = this.populateRetrytPolicy(properties, builder);
    builder = this.populateSocketOptions(properties, builder);
    String enableSSLProp = properties.getProperty(CassandraStoreParameters.ENABLE_SSL);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    builder = this.populateReconnectPolicy(properties, builder);
    builder = this.populateRetrytPolicy(properties, builder);
    builder = this.populateSocketOptions(properties, builder);
    String enableSSLProp = properties.getProperty(CassandraStoreParameters.ENABLE_SSL);
    if (enableSSLProp != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    if (enableSSLProp != null) {
      if (Boolean.parseBoolean(enableSSLProp)) {
        builder = builder.withSSL();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      switch (loadBalancingProp) {
        case "LatencyAwareRoundRobinPolicy":
          builder = builder.withLoadBalancingPolicy(LatencyAwarePolicy.builder(new RoundRobinPolicy()).build());
          break;
        case "RoundRobinPolicy":
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          break;
        case "RoundRobinPolicy":
          builder = builder.withLoadBalancingPolicy(new RoundRobinPolicy());
          break;
        case "DCAwareRoundRobinPolicy": {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          String dataCenter = properties.getProperty(CassandraStoreParameters.DATA_CENTER);
          if (dataCenter != null && !dataCenter.isEmpty()) {
            builder = builder.withLoadBalancingPolicy(
                    DCAwareRoundRobinPolicy.builder().withLocalDc(dataCenter).build());
          } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
                    DCAwareRoundRobinPolicy.builder().withLocalDc(dataCenter).build());
          } else {
            builder = builder.withLoadBalancingPolicy(
                    (DCAwareRoundRobinPolicy.builder().build()));
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
        }
        case "TokenAwareRoundRobinPolicy":
          builder = builder.withLoadBalancingPolicy(new TokenAwarePolicy(new RoundRobinPolicy()));
          break;
        case "TokenAwareDCAwareRoundRobinPolicy": {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          String dataCenter = properties.getProperty(CassandraStoreParameters.DATA_CENTER);
          if (dataCenter != null && !dataCenter.isEmpty()) {
            builder = builder.withLoadBalancingPolicy(new TokenAwarePolicy(
                    DCAwareRoundRobinPolicy.builder().withLocalDc(dataCenter).build()));
          } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
                    DCAwareRoundRobinPolicy.builder().withLocalDc(dataCenter).build()));
          } else {
            builder = builder.withLoadBalancingPolicy(new TokenAwarePolicy(
                    DCAwareRoundRobinPolicy.builder().build()));
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          String constantReconnectionPolicyDelay = properties.getProperty(CassandraStoreParameters.CONSTANT_RECONNECTION_POLICY_DELAY);
          ConstantReconnectionPolicy policy = new ConstantReconnectionPolicy(Long.parseLong(constantReconnectionPolicyDelay));
          builder = builder.withReconnectionPolicy(policy);
          break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          ExponentialReconnectionPolicy policy = new ExponentialReconnectionPolicy(Long.parseLong(exponentialReconnectionPolicyBaseDelay),
                  Long.parseLong(exponentialReconnectionPolicyMaxDelay));
          builder = builder.withReconnectionPolicy(policy);
          break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      options.setMaxRequestsPerConnection(HostDistance.REMOTE, Integer.parseInt(remoteMaxRequestsPerConnection));
    }
    builder = builder.withPoolingOptions(options);
    return builder;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      switch (retryPolicy) {
        case "DefaultRetryPolicy":
          builder = builder.withRetryPolicy(DefaultRetryPolicy.INSTANCE);
          break;
        case "FallthroughRetryPolicy":
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          break;
        case "FallthroughRetryPolicy":
          builder = builder.withRetryPolicy(FallthroughRetryPolicy.INSTANCE);
          break;
        case "LoggingDefaultRetryPolicy":
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          break;
        case "LoggingDefaultRetryPolicy":
          builder = builder.withRetryPolicy(new LoggingRetryPolicy(DefaultRetryPolicy.INSTANCE));
          break;
        case "LoggingFallthroughRetryPolicy":
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
          break;
        case "LoggingFallthroughRetryPolicy":
          builder = builder.withRetryPolicy(new LoggingRetryPolicy(FallthroughRetryPolicy.INSTANCE));
          break;
        default:
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
    String passwordProp = properties.getProperty(CassandraStoreParameters.PASSWORD);
    if (usernameProp != null) {
      builder = builder.withCredentials(usernameProp, passwordProp);
    }
    return builder;
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
    try {
      if (fields == null) {
        fields = getFields();
      }
      ArrayList<String> cassandraKeys = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `query`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
    store = dataStore;
    if (query instanceof PartitionQueryImpl) {
      query = ((PartitionQueryImpl) query).getBaseQuery();
    }
    fields = query.getFields();
```

### AssignmentToMethodParameter
Assignment to method parameter `mappingClass`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkUtils.java`
#### Snippet
```java
      familyAttribute.setValue(Constants.INFO);
      familyName.setAttributeNode(familyAttribute);
      mappingClass = mappingDocument.createElement(Constants.CLASS);
      rootNode.appendChild(mappingClass);
      // setting attribute to element
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java
    try {
      Key recordKey = getAerospikeKey(key);
      fields = getFieldsToQuery(fields);
  
      Record record = aerospikeClient
```

### AssignmentToMethodParameter
Assignment to method parameter `isCommaNeeded`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
        stringBuilder.append("  PRIMARY KEY ");
      }
      isCommaNeeded = true;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
          try {
            byte[] serializedBytes = HBaseByteInterface.toBytes(fieldValue, fieldSchema);
            fieldValue = ByteBuffer.wrap(serializedBytes);
          } catch (IOException e) {
            LOG.error("Error occurred when serializing {} field. {}", new Object[]{field.getFieldName(), e.getMessage()});
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
          map.put(mapKey, mapValue);
        }
        fieldValue = map;
        break;
      case ARRAY:
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
          list.add(value);
        }
        fieldValue = list;
        break;
      case UNION:
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
          Schema unionSchema = fieldSchema.getTypes().get(schemaPos);
          Schema.Type unionType = unionSchema.getType();
          fieldValue = getFieldValueFromAvroBean(unionSchema, unionType, fieldValue, field);
        }
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
        break;
      case STRING:
        fieldValue = fieldValue.toString();
        break;
      default:
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java

          if (type0.equals(Schema.Type.NULL))
            schema = schema.getTypes().get(1) ;
          else 
            schema = schema.getTypes().get(0) ;
```

### AssignmentToMethodParameter
Assignment to method parameter `schema`
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
            schema = schema.getTypes().get(1) ;
          else 
            schema = schema.getTypes().get(0) ;
          
          return fromBytes(schema, val) ; // Deserialize as if schema was ["type"] 
```

### AssignmentToMethodParameter
Assignment to method parameter `data`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
          return null;
        } else {
          data = decoder.readBytes(null).array();
        }
      } catch (IOException e) {
```

### AssignmentToMethodParameter
Assignment to method parameter `key`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  Text pad(Text key, int bytes) {
    if (key.getLength() < bytes)
      key = new Text(key);

    while (key.getLength() < bytes) {
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      byte[] copy = new byte[len];
      System.arraycopy(b, offset, copy, 0, copy.length);
      b = copy;
    }
    return b;
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java

  private void setFetchColumns(Scanner scanner, String[] fields) {
    fields = getFieldsToQuery(fields);
    for (String field : fields) {
      Pair<Text,Text> col = mapping.fieldMap.get(field);
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
    for (Object item : array) {
      m.put(col.getFirst(), new Text(toBytes(j++)), new Value(toBytes(item)));
      count++;
    }
    return count;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
          || !(o instanceof DirtyMapWrapper)) {
        m.put(col.getFirst(), new Text(toBytes(mapKey)), new Value(toBytes(valueType, mapVal)));
        count++;
      }
      // TODO map value deletion
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    T persistent = newPersistent();
    if (fields == null) {
      fields = fieldMap.keySet().toArray(new String[fieldMap.size()]);
    }
    String pk = mapping.getPrimaryKey();
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `gora-compiler-cli/src/main/java/org/apache/gora/compiler/cli/GoraCompilerCLI.java`
#### Snippet
```java
        if (licenseHeader.isValidLicense(args[i + 1])) {
          licenseHeader.setLicenseName(args[i + 1]);
          args = (String[]) ArrayUtils.removeElement(args, args[i + 1]);
          args = (String[]) ArrayUtils.removeElement(args, args[i]);
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `args`
in `gora-compiler-cli/src/main/java/org/apache/gora/compiler/cli/GoraCompilerCLI.java`
#### Snippet
```java
          licenseHeader.setLicenseName(args[i + 1]);
          args = (String[]) ArrayUtils.removeElement(args, args[i + 1]);
          args = (String[]) ArrayUtils.removeElement(args, args[i]);
        } else {
          LOG.error("Must supply a valid license id.");
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
  public T get(K key, String[] fields) throws GoraException {
    if (fields == null || fields.length == 0) {
      fields = getFields();
    }
    DataSet dataSet = executeGetQuery(key, fields);
```

### AssignmentToMethodParameter
Assignment to method parameter `query`
in `gora-solr/src/main/java/org/apache/gora/solr/query/SolrResult.java`
#### Snippet
```java
    ModifiableSolrParams params = new ModifiableSolrParams();
    if (query instanceof PartitionQueryImpl) {
      query = ((PartitionQueryImpl<K, T>)query).getBaseQuery();
    }
    String q = ((SolrQuery<K, T>)query).toSolrQuery();
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveQueryBuilder.java`
#### Snippet
```java
      ((ByteBuffer) value).rewind();
      clone.flip();
      value = QUOTE_SYMBOL + Charset.defaultCharset().decode(clone).toString() + QUOTE_SYMBOL;
    }
    parameterList.add(value);
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
  public T get(K key, String[] fields) throws GoraException {
    try{
      fields = getFieldsToQuery(fields);
      Get get = new Get(toBytes(key));
      addFields(get, fields);
```

### AssignmentToMethodParameter
Assignment to method parameter `avroSchema`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
    if (avroSchema.getType() == Type.UNION) {
      if (avroSchema.getTypes().get(0).getType() == Schema.Type.NULL) {
        avroSchema = avroSchema.getTypes().get(1) ;        
      } else {
        avroSchema = avroSchema.getTypes().get(0) ;
```

### AssignmentToMethodParameter
Assignment to method parameter `avroSchema`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
        avroSchema = avroSchema.getTypes().get(1) ;        
      } else {
        avroSchema = avroSchema.getTypes().get(0) ;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldSchema`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
        if (!type0.equals(type1)) {
          if (type0.equals(Schema.Type.NULL))
            fieldSchema = fieldSchema.getTypes().get(1);
          else
            fieldSchema = fieldSchema.getTypes().get(0);
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldSchema`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
            fieldSchema = fieldSchema.getTypes().get(1);
          else
            fieldSchema = fieldSchema.getTypes().get(0);
        } else {
          fieldSchema = fieldSchema.getTypes().get(0);
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldSchema`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
            fieldSchema = fieldSchema.getTypes().get(0);
        } else {
          fieldSchema = fieldSchema.getTypes().get(0);
        }
        fieldValue = deserializeFieldValue(field, fieldSchema, solrValue,
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
        LOG.error(e.getMessage(), e);
      }
      fieldValue = data;
      break;
    case BYTES:
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
      break;
    case BYTES:
      fieldValue = ((ByteBuffer) fieldValue).array();
      break;
    case ENUM:
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    case ENUM:
    case STRING:
      fieldValue = fieldValue.toString();
      break;
    case UNION:
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
        int schemaPos = getUnionSchema(fieldValue, fieldSchema);
        Schema unionSchema = fieldSchema.getTypes().get(schemaPos);
        fieldValue = serializeFieldValue(unionSchema, fieldValue);
      } else {
        byte[] serilazeData = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `fieldValue`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
          LOG.error(e.getMessage(), e);
        }
        fieldValue = serilazeData;
      }
      break;
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    T persistent = newPersistent();
    if (fields == null) {
      fields = fieldMap.keySet().toArray(new String[fieldMap.size()]);
    }
    String pk = mapping.getPrimaryKey();
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      if (!dir.mkdirs())
        throw new IOException("Unable to create " + dir);
    name = cap(name) + ".java";
    out = new OutputStreamWriter(new FileOutputStream(new File(dir, name)), Charset.defaultCharset());

```

### AssignmentToMethodParameter
Assignment to method parameter `attType`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      int pIden) throws IOException {
    StringBuilder strBuilder = new StringBuilder();
    attType = attType.equals("S") ? "String" : "double";
    // hash key
    if (pKeySchema.getKeyType().equals(KeyType.HASH.toString())) {
```

### AssignmentToMethodParameter
Assignment to method parameter `attType`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      int pIden) throws IOException {
    StringBuilder strBuilder = new StringBuilder();
    attType = attType.equals("S") ? "String " : "double ";
    if (pKeySchema != null) {
      strBuilder.append("private " + attType);
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java

  public T newInstance(RowResult next, String[] fields) throws IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
    for (String objField : fields) {
```

### AssignmentToMethodParameter
Assignment to method parameter `templatesPath`
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java

    if (templatesPath == null) {
      templatesPath = DEFAULT_TEMPLATES_PATH ;
    }
    
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  
  public T newInstanceFromHash(RMap<String, Object> map, String[] fields) throws GoraException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
    for (String fieldName : fields) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  
  public T newInstanceFromString(K key, String[] fields) throws GoraException, IOException {
    fields = getFieldsToQuery(fields);
    T persistent = newPersistent();
    int countRetrieved = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `requestedFields`
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/store/ElasticsearchStore.java`
#### Snippet
```java
    T persistent = newPersistent();

    requestedFields = getFieldsToQuery(requestedFields);
    // Populate each field
    for (String objField : requestedFields) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Document parent = getFieldParent(fieldName);
    String value = parent.getString(getLeafName(fieldName));
    return (value != null) ? new Utf8(value) : null;
  }

```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Document parent = getFieldParent(fieldName);
    String lf = getLeafName(fieldName);
    return parent.containsKey(lf) ? parent.getBoolean(lf) : null;
  }

```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Document parent = getFieldParent(fieldName);
    String lf = getLeafName(fieldName);
    return parent.containsKey(lf) ? parent.getLong(lf) : null;
  }

```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Document parent = getFieldParent(fieldName);
    String lf = getLeafName(fieldName);
    return parent.containsKey(lf) ? parent.getDouble(lf) : null;
  }

```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Document parent = getFieldParent(fieldName);
    String lf = getLeafName(fieldName);
    return parent.containsKey(lf) && parent.get(lf) != null ? parent.getInteger(lf) : null;
  }

```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
    Object o = get(fieldName);
    if (o == null)
      return null;
    else if (o instanceof Binary)
      return ByteBuffer.wrap(((Binary) o).getData());
```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/filters/DefaultFactory.java`
#### Snippet
```java
      LOG.warn("MongoDB remote filter not yet implemented for "
          + filter.getClass().getCanonicalName());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
  public String decodeFieldKey(final String key) {
    if (key == null) {
      return null;
    }
    return key.replace("\u00B7", ".");
```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
  public T newInstance(final Document obj, final String[] fields) throws GoraException {
    if (obj == null)
      return null;
    BSONDecorator easybson = new BSONDecorator(obj);
    // Create new empty persistent bean instance
```

### ReturnNull
Return of `null`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
  public String encodeFieldKey(final String key) {
    if (key == null) {
      return null;
    }
    return key.replace(".", "\u00B7");
```

### ReturnNull
Return of `null`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoaderFactory.java`
#### Snippet
```java
      } catch (GoraException ex) {
        LOG.error("Couldn't initialize persistent dataStore for cache loader.", ex);
        return null;
      }
      return (JCacheCacheLoader<K, T>) this.instance;
```

### ReturnNull
Return of `null`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriterFactory.java`
#### Snippet
```java
      } catch (GoraException ex) {
        LOG.error("Couldn't initialize persistent dataStore for cache writer.", ex);
        return null;
      }
      return (JCacheCacheWriter<K, T>) this.instance;
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/util/TimingUtil.java`
#### Snippet
```java
    public static String elapsedTime(long start, long end){
        if (start > end) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
  private String encodeFieldKey(final String key) {
    if (key == null) {
      return null;
    }
    return key.replace(".", "\u00B7")
```

### ReturnNull
Return of `null`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
  private String decodeFieldKey(final String key) {
    if (key == null) {
      return null;
    }
    return key.replace("\u00B7", ".")
```

### ReturnNull
Return of `null`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
        return convertOrientDocToAvroBean(result.get(0), dbFields);
      } else {
        return null;
      }
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      return set;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/avro/store/AvroStore.java`
#### Snippet
```java
      return EncoderFactory.get().jsonEncoder(schema, getOrCreateOutputStream());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/avro/store/AvroStore.java`
#### Snippet
```java
      return DecoderFactory.get().jsonDecoder(schema, getOrCreateInputStream());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/util/NodeWalker.java`
#### Snippet
```java
    // if no next node return null
    if (!hasNext()) {
      return null;
    }
    
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/flink/PersistentTypeSerializer.java`
#### Snippet
```java

  public T createInstance() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      T persitent = (T) cache.get(key);
      if (persitent == null) {
        return null;
      }
      return getPersistent(persitent, fields);
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/QueryWSBase.java`
#### Snippet
```java
      return startKey; //address comparison
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
  public static String toString(final byte [] b, int off, int len) {
    if(b == null) {
      return null;
    }
    if(len == 0) {
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
  public static String toString(final byte [] b) {
    if (b == null) {
      return null;
    }
    return toString(b, 0, b.length);
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
    int max = offset + length;
    if (bytes == null || (max > bytes.length) || length %2 ==1) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/query/impl/QueryBase.java`
#### Snippet
```java
      return startKey; //address comparison
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
        return convertRethinkDBDocToAvroBean(document, dbFields);
      } else {
        return null;
      }
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      return list;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
  private MapObject<String, Object> decorateMapToODoc(Map<String, Object> map) {
    if (Objects.isNull(map)) {
      return null;
    }
    MapObject<String, Object> doc = new MapObject();
```

### ReturnNull
Return of `null`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      return new DirtyListWrapper<>(rlist);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraMapReduceUtils.java`
#### Snippet
```java
    public RecordReader<K, V> createRecordReader(InputSplit arg0,
        TaskAttemptContext arg1) throws IOException, InterruptedException {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
   */
  public Persistent clone() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
    T obj = (T) map.get(key);
    if (obj == null) {
      return null;
    }
    return getPersistent(obj, getFieldsToQuery(fields));
```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/bean/CassandraKey.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMapping.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMapping.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
    }
    LOG.debug("Object is not found for key : {}", key);
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraClient.java`
#### Snippet
```java
      return codecs;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java
  @Override
  public String getSchemaName() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java
      
      if (record == null) {
        return null;
      }
      return createPersistentInstance(record, fields);
```

### ReturnNull
Return of `null`
in `gora-goraci/src/main/java/org/apache/gora/goraci/Walker.java`
#### Snippet
```java
    LOG.info("FSR {}", new Object [] {(t2 - t1)});
    
    return null;
  }
  
```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
      }
    }
    return query != null ? query.getQueryString() : null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
      return select.getQueryString();
    }
    return query != null ? query.getQueryString() : null;
  }

```

### ReturnNull
Return of `null`
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/DefaultFactory.java`
#### Snippet
```java
        if (factory == null) {
          LOG.warn("HBase remote filter factory not yet implemented for " + rowFitler.getClass().getCanonicalName());
          return null;
        }
        org.apache.hadoop.hbase.filter.Filter hbaseRowFilter = factory.createFilter(rowFitler, store);
```

### ReturnNull
Return of `null`
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/DefaultFactory.java`
#### Snippet
```java
    } else {
      LOG.warn("HBase remote filter not yet implemented for " + filter.getClass().getCanonicalName());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
        if (effectiveSchema.getType() == Type.NULL) {
          decoder.readNull();
          return null;
        } else {
          data = decoder.readBytes(null).array();
```

### ReturnNull
Return of `null`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      ByteSequence row = populate(scanner.iterator(), persistent);
      if (row == null)
        return null;
      return persistent;
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
      LOG.error("Error in get: {}", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
      LOG.error(e.getMessage(), e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveResultParser.java`
#### Snippet
```java
  private Object parseMap(Object value, Schema schema) throws GoraException {
    if (value == null) {
      return null;
    }
    if(LOG.isDebugEnabled()) {
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveResultParser.java`
#### Snippet
```java
  private Object parseArray(Object value, Schema schema) throws GoraException {
    if (value == null) {
      return null;
    }
    if(LOG.isDebugEnabled()) {
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveResultParser.java`
#### Snippet
```java
    }
    if (primarySchema == null) {
      return null;
    } else {
      return parseSchema(primarySchema, value);
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveResultParser.java`
#### Snippet
```java
  public Object parseSchema(Schema schema, Object value) throws GoraException {
    if (value == null) {
      return null;
    }
    final Type type = schema.getType();
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveResultParser.java`
#### Snippet
```java
  private Object parseBytes(Object value) {
    if (value == null) {
      return null;
    }
    if(LOG.isDebugEnabled()) {
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
    } catch (MetaModelException e) {
      LOG.error("Refreshing schema failed", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
    } catch (MetaModelException e) {
      LOG.error("Initiating a query failed", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
    if (row == null || row.size() == 0) {
      LOG.error("Data set is empty");
      return null;
    }
    T persistent = newPersistent();
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
  private T newInstance(DataSet dataSet) throws GoraException {
    if (dataSet == null) {
      return null;
    }
    dataSet.next();
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
    if (row == null || row.size() == 0) {
      LOG.error("Data set is empty");
      return null;
    }
    Column keyColumn = getSchemaTable().getColumnByName(HiveMapping.DEFAULT_KEY_NAME);
```

### ReturnNull
Return of `null`
in `gora-pig/src/main/java/org/apache/gora/pig/util/PersistentUtils.java`
#### Snippet
```java

    switch (schemaType) {
      case NULL:    return null ;
      case BOOLEAN: return (Boolean)data ; 
      case ENUM:    return new Integer(((Enum<?>)data).ordinal()) ;
```

### ReturnNull
Return of `null`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveQueryBuilder.java`
#### Snippet
```java
        return serializeRecord(parameterList, schema, emptyRecord);
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBAvroStore.java`
#### Snippet
```java
  public T get(K arg0, String[] arg1) throws GoraException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBAvroStore.java`
#### Snippet
```java
  public Query<K, T> newQuery() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBAvroStore.java`
#### Snippet
```java
  public Result<K, T> execute(Query<K, T> arg0) throws GoraException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBAvroStore.java`
#### Snippet
```java
      throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBAvroStore.java`
#### Snippet
```java
  public String getSchemaName() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
  throws IOException {
    if(result == null || result.isEmpty())
      return null;

    T persistent = newPersistent();
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
    if (clientType.equals(ASYNC_CLIENT_PROP))
      return new AmazonDynamoDBAsyncClient(credentials);
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
      throws IOException {
    // TODO Not implemented
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
    try {
      if (!this.reader.nextKeyValue()) {
          return null;
      }
    } catch (Exception e) {
```

### ReturnNull
Return of `null`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
        throw new IOException("Tuple field " + pigField.getName() + " is null, but Avro Schema is not union nor null") ;
      } else {
        return null ;
      }
    }
```

### ReturnNull
Return of `null`
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
  public String[] getPartitionKeys(String location, Job job) throws IOException {
    // TODO Disabled by now
    return null ;
    //return new String[] {"key"} ;
  }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBQuery.java`
#### Snippet
```java
  public Filter<K, T> getFilter() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
  public Class<T> getPersistentClass() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
  public Class<K> getKeyClass() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
      throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
  public BeanFactory<K, T> getBeanFactory() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
      Object o = rsp.getResponse().get("doc");
      if (o == null) {
        return null;
      }
      return newInstance((SolrDocument) o, fields);
```

### ReturnNull
Return of `null`
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
  public static String escapeQueryKey(String key) {
    if (key == null) {
      return null;
    }
    StringBuilder sb = new StringBuilder();
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
  public BeanFactory<K, T> getBeanFactory() {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
     * result.get() : null;
     */
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
      throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
  public K newKey() throws GoraException {
    // TODO Auto-generated method stub
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java
    public Persistent newInstance() { return new Webpage(); }
    @Override
    public Schema getSchema() { return null; }
}

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java
    public void clearDirty() { }
    @Override
    public Tombstone getTombstone() { return null; }
    @Override
    public List<Field> getUnmanagedFields() { return null; }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java
    public void clear() { }
    @Override
    public Webpage clone() { return null; }
    @Override
    public boolean isDirty() { return false; }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java
    public Tombstone getTombstone() { return null; }
    @Override
    public List<Field> getUnmanagedFields() { return null; }
    @Override
    public Persistent newInstance() { return new Webpage(); }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java
    public Persistent newInstance() { return new Person(); }
    @Override
    public Schema getSchema() { return null; }
}

```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java
    public void clearDirty() { }
    @Override
    public Tombstone getTombstone() { return null; }
    @Override
    public List<Field> getUnmanagedFields() { return null; }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java
    public Tombstone getTombstone() { return null; }
    @Override
    public List<Field> getUnmanagedFields() { return null; }
    @Override
    public Persistent newInstance() { return new Person(); }
```

### ReturnNull
Return of `null`
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java
    public void clear() { }
    @Override
    public Person clone() { return null; }
    @Override
    public boolean isDirty() { return false; }
```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
    final Map<?, ?> fieldMap = (Map<?, ?>) fieldValue;
    if (fieldValue == null) {
      return null;
    }
    for (Object key : fieldMap.keySet()) {
```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
      return newMap;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
  public T newInstance(Map<String, Object> result, String[] fields) throws GoraException {
    if (result == null)
      return null;

    T persistent = newPersistent();
```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
    final Object innerValue = ((Map) value).get(docf);
    if (innerValue == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
      return newInstance(result, getFieldsToQuery(fields));
    } catch (DocumentNotFoundException e) {
      return null ;
    } catch (GoraException e) {
      throw e;
```

### ReturnNull
Return of `null`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
  private Object fromDBObject(final Schema fieldSchema, final Field field, final String docf, final Object value) throws GoraException {
    if (value == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
          return newInstanceFromHash(map, fields);
        } else {
          return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  @Override
  public String getSchemaName() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
      persistent.setDirty(field.pos());
    }
    return countRetrieved > 0 ? persistent : null;
  }
  
```

### ReturnNull
Return of `null`
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/store/ElasticsearchStore.java`
#### Snippet
```java
        return newInstance(fieldsAndValues, requestedFields);
      } else {
        return null;
      }
    } catch (IOException ex) {
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `igniteResult` is redundant
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
      ResultSet executeQuery = stmt.executeQuery();
      rowset.populate(executeQuery);
      IgniteResult<K, T> igniteResult = new IgniteResult<>(this, query, rowset);
      return igniteResult;
    } catch (SQLException ex) {
```

### UnnecessaryLocalVariable
Local variable `progress` is redundant
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java
      return 1;
    }
    float progress = ((float) current / (float) cacheKeySet.size());
    return progress;
  }
```

### UnnecessaryLocalVariable
Local variable `mapKey` is redundant
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java

      for (String fieldName : innerDoc.keySet()) {
        String mapKey = fieldName;
        Object o = convertDocFieldToAvroField(fieldSchema.getValueType(), storeType, f, mapKey,
                innerDoc);
```

### UnnecessaryLocalVariable
Local variable `isExists` is redundant
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
  @Override
  public boolean exists(K key) throws GoraException {
    boolean isExists = r.db(rethinkDBStoreParameters.getDatabaseName())
            .table(rethinkDBMapping.getDocumentClass())
            .getAll(key)
```

### UnnecessaryLocalVariable
Local variable `equals` is redundant
in `gora-core/src/main/java/org/apache/gora/filter/SingleFieldValueFilter.java`
#### Snippet
```java
      return !equals;
    } else if (filterOp.equals(FilterOp.NOT_EQUALS)) {
      boolean equals = operand.equals(fieldValue);
      return equals;
      //TODO Currently only EQUALS and NOT_EQUALS are implemented. 
```

### UnnecessaryLocalVariable
Local variable `equals` is redundant
in `gora-core/src/main/java/org/apache/gora/filter/MapFieldValueFilter.java`
#### Snippet
```java
      return !equals;
    } else if (filterOp.equals(FilterOp.NOT_EQUALS)) {
      boolean equals = value.equals(operand);
      return equals;
    } else {
```

### UnnecessaryLocalVariable
Local variable `obj` is redundant
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
      if(in instanceof InputStream) {
        ObjectInput objIn = new ObjectInputStream((InputStream)in);
        Object obj = objIn.readObject();
        return obj;
      }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    int result = 1;
    return result;
  }
```

### UnnecessaryLocalVariable
Local variable `bi` is redundant
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Utils.java`
#### Snippet
```java
    byte[] copy = new byte[er.length + 1];
    System.arraycopy(er, 0, copy, 1, er.length);
    BigInteger bi = new BigInteger(copy);
    return bi;
  }
```

### UnnecessaryLocalVariable
Local variable `mappings` is redundant
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java

  private static List<CassandraMapping> readMappingFile(File src) throws Exception {
    List<CassandraMapping> mappings = new CassandraMappingBuilder().readMappingFile(src);
    return mappings;
  }
```

### UnnecessaryLocalVariable
Local variable `query` is redundant
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
  @Override
  public Query<K, T> newQuery() {
    Query<K, T> query = new CassandraQuery(this);
    return query;
  }
```

### UnnecessaryLocalVariable
Local variable `resourceSchema` is redundant
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java
    }

    ResourceSchema resourceSchema = new ResourceSchema().setFields(resourceFieldSchemas) ;
    return resourceSchema ;
  }
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
        ResultScanner scanner = createScanner(query);
  
        org.apache.gora.query.Result<K,T> result
            = new HBaseScannerResult<>(this, query, scanner);
  
```

### UnnecessaryLocalVariable
Local variable `writer` is redundant
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
  @SuppressWarnings("rawtypes")
  private SpecificDatumWriter getDatumWriter(Schema fieldSchema) {
    SpecificDatumWriter writer = writerMap.computeIfAbsent(fieldSchema, (t) -> {
      return new SpecificDatumWriter(t);// ignore dirty bits
    });
```

### UnnecessaryLocalVariable
Local variable `query` is redundant
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
   */
  public Query<K, T> newQuery() {
    Query<K, T> query = new DynamoDBQuery<K, T>(this);
    // query.setFields(getFieldsToQuery(null));
    return query;
```

### UnnecessaryLocalVariable
Local variable `dirtyMethod` is redundant
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
     */
    String getMethod = generateGetMethod(schema, field);
    String dirtyMethod = "is" + getMethod.substring(3) + "Dirty";
    return dirtyMethod; 
  }
```

### UnnecessaryLocalVariable
Local variable `originalSchema` is redundant
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
    for (File src : srcFiles) {
      LOG.info("Compiling: {}", src.getAbsolutePath());
      Schema originalSchema = parser.parse(src);
      //Map<Schema,Schema> queue = new HashMap<>();
      //Schema newSchema = getSchemaWithDirtySupport(originalSchema, queue);
```

### UnnecessaryLocalVariable
Local variable `newSchema` is redundant
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
      //Map<Schema,Schema> queue = new HashMap<>();
      //Schema newSchema = getSchemaWithDirtySupport(originalSchema, queue);
      Schema newSchema = originalSchema;
      GoraCompiler compiler = new GoraCompiler(newSchema);
      compiler.setTemplateDir(DEFAULT_TEMPLATES_PATH);
```

### UnnecessaryLocalVariable
Local variable `couchDBResult` is redundant
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
          .endKey(query.getEndKey())
          .limit(Ints.checkedCast(query.getLimit())); //FIXME GORA have long value but ektorp client use integer
      CouchDBResult<K, T> couchDBResult = new CouchDBResult<>(this, query, db.queryView(viewQuery, Map.class));
      return couchDBResult;

```

## RuleId[id=BusyWait]
### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
    while (System.currentTimeMillis() < endTime) {
      try {
        Thread.sleep(SLEEP_TIME);
      } catch (Exception e) {
      }
```

### BusyWait
Call to `Thread.sleep()` in a loop, probably busy-waiting
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
    while (System.currentTimeMillis() < endTime) {
      try {
        Thread.sleep(SLEEP_DELETE_TIME);
      } catch (Exception e) {
      }
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException") == false` can be simplified to '!ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException")'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
          return;
      } catch (AmazonServiceException ase) {
        if (ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException") == false)
          throw ase;
      }
```

### PointlessBooleanExpression
`ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException") == true` can be simplified to 'ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException")'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
        LOG.debug(pTableName + " - current state: " + tableStatus);
      } catch (AmazonServiceException ase) {
        if (ase.getErrorCode().equalsIgnoreCase("ResourceNotFoundException") == true)
          return;
        LOG.error(ase.getMessage());
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' is marked unstable with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

    //Manage keypairs
    KeyPairApi keyPairApi = novaApi.getKeyPairApi(rsRegion).get();

    File keyPairFile = null;
```

### UnstableApiUsage
'getKeyPairApi(java.lang.String)' is unstable because its signature references unstable interface 'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

    //Manage keypairs
    KeyPairApi keyPairApi = novaApi.getKeyPairApi(rsRegion).get();

    File keyPairFile = null;
```

### UnstableApiUsage
'get(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
    } else {
      //obtain existing key from Rackspace
      if (keyPairApi.get("goraci-keypair") != null) {
        publicKey = keyPairApi.get("goraci-keypair").getPublicKey();
        LOG.info("Obtained existing public key 'goraci-keypair' from Rackspace...");
```

### UnstableApiUsage
'get(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
      //obtain existing key from Rackspace
      if (keyPairApi.get("goraci-keypair") != null) {
        publicKey = keyPairApi.get("goraci-keypair").getPublicKey();
        LOG.info("Obtained existing public key 'goraci-keypair' from Rackspace...");
      } else {
```

### UnstableApiUsage
'create(java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
        //have Rackspace generate us a key
        LOG.info("Generating local keypair 'goraci-keypair' and uploading to Rackspace...");
        KeyPair keyPair = keyPairApi.create("goraci-keypair");
        keyPairFile = new File("/target/goraci-keypair.pem");
        try {
```

### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
        keyPairFile = new File("/target/goraci-keypair.pem");
        try {
          Files.write(keyPair.getPrivateKey(), keyPairFile, Charsets.UTF_8);
        } catch (IOException e) {
          throw new IOException(e);
```

### UnstableApiUsage
'write(java.lang.CharSequence, java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
        keyPairFile = new File("/target/goraci-keypair.pem");
        try {
          Files.write(keyPair.getPrivateKey(), keyPairFile, Charsets.UTF_8);
        } catch (IOException e) {
          throw new IOException(e);
```

### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
        }
        try {
          publicKey = Files.toString(keyPairFile, Charsets.UTF_8);
        } catch (IOException e) {
          throw new IOException(e);
```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
        }
        try {
          publicKey = Files.toString(keyPairFile, Charsets.UTF_8);
        } catch (IOException e) {
          throw new IOException(e);
```

### UnstableApiUsage
'createWithPublicKey(java.lang.String, java.lang.String)' is declared in unstable interface 'org.jclouds.openstack.nova.v2_0.extensions.KeyPairApi' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
          throw new IOException(e);
        }
        keyPairApi.createWithPublicKey("goraci-keypair", publicKey);
      }
    }
```

### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    String organization = DataStoreFactory.findProperty(properties, MemStore.class.getDeclaredConstructor().newInstance(), CHEF_ORGANIZATION, null);
    String pemFile = System.getProperty("user.home") + "/.chef/" + client + ".pem";
    String credential = Files.toString(new File(pemFile), Charsets.UTF_8);

    // Provide the validator information to let the nodes to auto-register themselves
```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    String organization = DataStoreFactory.findProperty(properties, MemStore.class.getDeclaredConstructor().newInstance(), CHEF_ORGANIZATION, null);
    String pemFile = System.getProperty("user.home") + "/.chef/" + client + ".pem";
    String credential = Files.toString(new File(pemFile), Charsets.UTF_8);

    // Provide the validator information to let the nodes to auto-register themselves
```

### UnstableApiUsage
'com.google.common.io.Files' is marked unstable with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    String validator = organization + "-validator";
    String validatorPemFile = System.getProperty("user.home") + "/.chef/" + validator + ".pem";
    String validatorCredential = Files.toString(new File(validatorPemFile), Charsets.UTF_8);

    Properties chefConfig = new Properties();
```

### UnstableApiUsage
'toString(java.io.File, java.nio.charset.Charset)' is declared in unstable class 'com.google.common.io.Files' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    String validator = organization + "-validator";
    String validatorPemFile = System.getProperty("user.home") + "/.chef/" + validator + ".pem";
    String validatorCredential = Files.toString(new File(validatorPemFile), Charsets.UTF_8);

    Properties chefConfig = new Properties();
```

### UnstableApiUsage
'newBuilder(org.jclouds.apis.ApiMetadata)' is unstable because its signature references unstable interface 'org.jclouds.apis.ApiMetadata' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java

    // Create the connection to the Chef server
    ChefApi chefApi = ContextBuilder.newBuilder(new ChefApiMetadata())
        .endpoint("https://api.opscode.com/organizations/" + organization)
        .credentials(client, credential)
```

### UnstableApiUsage
'buildView(java.lang.Class)' is unstable because its signature references unstable interface 'org.jclouds.View' marked with @Beta
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
        .credentials(rsUser, rsApiKey)
        .modules(ImmutableSet.<Module> of(new SshjSshClientModule()))
        .buildView(ComputeServiceContext.class);

    // Group all nodes in both Chef and the compute provider by this group
```

## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (schema.getType()) { case INT: builder.append("int"); break; case...` statement on enum type 'org.apache.avro.Schema.Type' misses case 'NULL'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
switch (schema.getType()) {
      case INT:
        builder.append("int");
        break;
      case MAP:
        builder.append("map<text,");
        populateFieldsToQuery(schema.getValueType(), builder);
        builder.append(">");
        break;
      case ARRAY:
        builder.append("list<");
        populateFieldsToQuery(schema.getElementType(), builder);
        builder.append(">");
        break;
      case LONG:
        builder.append("bigint");
        break;
      case FLOAT:
        builder.append("float");
        break;
      case DOUBLE:
        builder.append("double");
        break;
      case BOOLEAN:
        builder.append("boolean");
        break;
      case BYTES:
        builder.append("blob");
        break;
      case RECORD:
        builder.append("frozen<").append(schema.getName()).append(">");
        break;
      case STRING:
      case FIXED:
      case ENUM:
        builder.append("text");
        break;
      case UNION:
        for (Schema unionElementSchema : schema.getTypes()) {
          if (unionElementSchema.getType().equals(Schema.Type.RECORD)) {
            String recordName = unionElementSchema.getName();
            if (!builder.toString().contains(recordName)) {
              builder.append("frozen<").append(recordName).append(">");
            } else {
              LOG.warn("Same Field Type can't be mapped recursively. This is not supported with Cassandra UDT types, Please use byte dataType for recursive mapping.");
              throw new Exception("Same Field Type has mapped recursively");
            }
            break;
          } else if (!unionElementSchema.getType().equals(Schema.Type.NULL)) {
            populateFieldsToQuery(unionElementSchema, builder);
            break;
          }
        }
        break;
    }
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkUtils.java`
#### Snippet
```java
    mappingClass.setAttributeNode(keyClass);
    // setting attribute to element
    if (dataStore == Constants.MONGODB) {
      Attr collection = mappingDocument.createAttribute(Constants.DOCUMENT);
      collection.setValue(Constants.USERS);
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkUtils.java`
#### Snippet
```java
      collection.setValue(Constants.USERS);
      mappingClass.setAttributeNode(collection);
    } else if (dataStore == Constants.COUCHDB) {
      Attr table = mappingDocument.createAttribute(Constants.TABLE);
      table.setValue(Constants.USERS);
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `compareBytes()` declared in class 'org.apache.hadoop.io.WritableComparator' but referenced via subclass 'org.apache.hadoop.io.Text.Comparator'
in `gora-core/src/main/java/org/apache/gora/mapreduce/StringComparator.java`
#### Snippet
```java
  @Override
  public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
    return Text.Comparator.compareBytes(b1, s1, l1, b2, s2, l2);
  }

```

### StaticCallOnSubclass
Static method `setOutputPath()` declared in class 'org.apache.hadoop.mapreduce.lib.output.FileOutputFormat' but referenced via subclass 'org.apache.hadoop.mapreduce.lib.output.TextOutputFormat'
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
    job.setReducerClass(VerifyReducer.class);
    job.setOutputFormatClass(TextOutputFormat.class);
    TextOutputFormat.setOutputPath(job, outputDir);

    store.close();
```

### StaticCallOnSubclass
Static method `compileSchema()` declared in class 'org.apache.avro.compiler.specific.SpecificCompiler' but referenced via subclass 'org.apache.gora.compiler.GoraCompiler'
in `gora-maven-plugin/src/main/java/org/apache/gora/maven/plugin/AbstractGoraMojo.java`
#### Snippet
```java
      try {
        File[] schemaFile = changedFiles.toArray(new File[changedFiles.size()]);
        GoraCompiler.compileSchema(schemaFile, outputDirectory);
      } catch (SchemaParseException e) {
        if (e.getCause() != null && e.getCause() instanceof JsonParseException) {
```

## RuleId[id=ExternalizableWithoutPublicNoArgConstructor]
### ExternalizableWithoutPublicNoArgConstructor
Externalizable class `Tombstone` has no 'public' no-arg constructor
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends MetricDatum implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ExternalizableWithoutPublicNoArgConstructor
Externalizable class `Tombstone` has no 'public' no-arg constructor
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Pageview implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ExternalizableWithoutPublicNoArgConstructor
Externalizable class `Tombstone` has no 'public' no-arg constructor
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends Flushed implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ExternalizableWithoutPublicNoArgConstructor
Externalizable class `Tombstone` has no 'public' no-arg constructor
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends CINode implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

### ExternalizableWithoutPublicNoArgConstructor
Externalizable class `Tombstone` has no 'public' no-arg constructor
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends User implements org.apache.gora.persistency.Tombstone {
  
    private Tombstone() { }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveMappingBuilder.java`
#### Snippet
```java
      for (String fieldName : fields) {
        if (HiveMapping.DEFAULT_KEY_NAME.equals(fieldName)) {
          LOG.error("\'{}\' is a reserved keyword and cannot be used as a field name",
              HiveMapping.DEFAULT_KEY_NAME);
          return false;
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveMappingBuilder.java`
#### Snippet
```java
      for (String fieldName : fields) {
        if (HiveMapping.DEFAULT_KEY_NAME.equals(fieldName)) {
          LOG.error("\'{}\' is a reserved keyword and cannot be used as a field name",
              HiveMapping.DEFAULT_KEY_NAME);
          return false;
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `gora-core/src/main/java/org/apache/gora/util/NodeWalker.java`
#### Snippet
```java
  private Node currentNode;
  private NodeList currentChildren;
  private Stack<Node> nodes;
  
  /**
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `gora-core/src/main/java/org/apache/gora/util/NodeWalker.java`
#### Snippet
```java
  public NodeWalker(Node rootNode) {

    nodes = new Stack<>();
    nodes.add(rootNode);
  }
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
   * Clones a persistent object
   */
  public Persistent clone() {
    return null;
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java
    public void clear() { }
    @Override
    public Webpage clone() { return null; }
    @Override
    public boolean isDirty() { return false; }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java
    public void clear() { }
    @Override
    public Person clone() { return null; }
    @Override
    public boolean isDirty() { return false; }
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
      } else {
        LOG.info("Ignored putting object {} in the store as it is neither "
                + "new, neither dirty.", new Object[]{obj});
      }
    } catch (Exception e) {
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    Iterable< ? extends CookbookVersion> cookbookVersions =
        chefApi.chefService().listCookbookVersions();
    if (any(cookbookVersions, CookbookVersionPredicates.containsRecipe(recipe))) {
      runlist = new RunListBuilder().addRecipe(recipe).build();
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
        break;
      case NULL:
        break;
      default:
        throw new AssertionError(fieldSchema.getType().name());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
      break;
    case FIXED:
      result = value;
      break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
        break;
      case FIXED:
        result = value;
        break;
      default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
    switch (columnType.getName()) {
      case ASCII:
        paramValue = row.getString(columnName);
        break;
      case BIGINT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case COUNTER:
        paramValue = row.isNull(columnName) ? null : row.getLong(columnName);
        break;
      case DECIMAL:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case TEXT:
        paramValue = row.getString(columnName);
        break;
      case TIMESTAMP:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case VARCHAR:
        paramValue = row.getString(columnName);
        break;
      case VARINT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case TIMEUUID:
        paramValue = row.isNull(columnName) ? null : row.getUUID(columnName);
        break;
      case LIST:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case SET:
        dataType = columnType.getTypeArguments().get(0).toString();
        paramValue = row.isNull(columnName) ? null : row.getList(columnName, AvroCassandraUtils.getRelevantClassForCassandraDataType(dataType));
        break;
      case MAP:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
        break;
      case CUSTOM:
        paramValue = row.isNull(columnName) ? null : row.getBytes(columnName);
        break;
      default:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      return AvroUtils.getEnumValue(schema, encoder.decodeInt(data));
    case ARRAY:
      break;
    case FIXED:
      break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      break;
    case FIXED:
      break;
    case MAP:
      break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      break;
    case MAP:
      break;
    case NULL:
      break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      break;
    case NULL:
      break;
    case RECORD:
      break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      break;
    case RECORD:
      break;
    case UNION:
      break;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      break;
    case UNION:
      break;
    default:
      break;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
        break;
      case BOOLEAN:
        result = new StringField(sf, o.toString(), Store.YES);
        break;
      case DOUBLE:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java
      case FLOAT:   return new ResourceFieldSchema().setType(DataType.FLOAT) ;
      case DOUBLE:  return new ResourceFieldSchema().setType(DataType.DOUBLE) ;
      case INT:     return new ResourceFieldSchema().setType(DataType.INTEGER) ;
      case LONG:    return new ResourceFieldSchema().setType(DataType.LONG) ;
  
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
      case BOOLEAN:
      case NULL:
        break;
      default:
        throw new AssertionError(fieldSchema.getType().name());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
        break;
      case NULL:
        break;
      default:
        throw new AssertionError(fieldSchema.getType().name());
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"))`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
      return "Date";
    } else if (dbType.startsWith("list")) {
      String innerType = dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"));
      return "List<" + getDataType(innerType, true) + ">";
    } else if (dbType.startsWith("set")) {
```

### DuplicateExpressions
Multiple occurrences of `dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"))`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
      return "List<" + getDataType(innerType, true) + ">";
    } else if (dbType.startsWith("set")) {
      String innerType = dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"));
      return "Set<" + getDataType(innerType, true) + ">";
    } else if (dbType.startsWith("map")) {
```

### DuplicateExpressions
Multiple occurrences of `dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"))`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/compiler/GoraCassandraNativeCompiler.java`
#### Snippet
```java
      return "Set<" + getDataType(innerType, true) + ">";
    } else if (dbType.startsWith("map")) {
      String innerTypes = dbType.substring(dbType.indexOf("<") + 1, dbType.indexOf(">"));
      String[] types = innerTypes.split(",");
      return "Map<" + getDataType(types[0], true) + "," + getDataType(types[1], true) + ">";
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
   */
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(super.toString());
    builder.append(" {\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBKey.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('[').append(hashKey != null? hashKey.toString():":");
    sb.append(rangeKey != null? ":" + rangeKey.toString():"");
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    } catch (Exception e) {
      if (e.getMessage().contains("No such core")) {
        return; // it's ok, the core is not there
      } else {
        throw new GoraException(e);
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
          deleteCount = deleteTx.command(dbQuery).execute(params);
        }
        if (deleteCount > 0) {
          return deleteCount;
        } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      MapObject<String, Object> document = reqlExpr.delete().run(connection, MapObject.class).first();
      int deleteCount = Integer.valueOf(document.get("deleted").toString());
      if (deleteCount > 0) {
        return deleteCount;
      } else {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
              .run(connection, MapObject.class).first();
      int replacedCount = Integer.valueOf(document.get("replaced").toString());
      if (replacedCount > 0) {
        return replacedCount;
      } else {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `WSBackedDataStoreBase` has no concrete subclass
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSBackedDataStoreBase.java`
#### Snippet
```java
 * Base implementations for {@link WebServiceBackedDataStore} methods.
 */
public abstract class WSBackedDataStoreBase<K, T extends Persistent>
  extends WSDataStoreBase<K, T> implements WebServiceBackedDataStore<K, T> {

```

### AbstractClassNeverImplemented
Abstract class `PersistentWSBase` has no concrete subclass
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
 * backed persistent classes.
 */
public abstract class PersistentWSBase implements Persistent  {

  /**
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Document`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/query/MongoDBResult.java`
#### Snippet
```java
  private long size;

  public MongoDBResult(DataStore<K, T> dataStore, Query<K, T> query, MongoCursor<Document> cursor, long size) {
    super(dataStore, query);
    this.cursor = cursor;
```

### BoundedWildcard
Can generalize to `? extends Pageview`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogManager.java`
#### Snippet
```java
  }
  
  private void printResult(Result<Long, Pageview> result) throws Exception {
    
    while(result.next()) { //advances the Result object and breaks if at end
```

### BoundedWildcard
Can generalize to `? super K`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriter.java`
#### Snippet
```java
  private DataStore<K, T> dataStore;

  public JCacheCacheWriter(DataStore<K, T> dataStore) {
    this.dataStore = dataStore;
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriter.java`
#### Snippet
```java
  private DataStore<K, T> dataStore;

  public JCacheCacheWriter(DataStore<K, T> dataStore) {
    this.dataStore = dataStore;
  }
```

### BoundedWildcard
Can generalize to `? super K`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoader.java`
#### Snippet
```java
  private DataStore<K, T> dataStore;

  public JCacheCacheLoader(DataStore<K, T> dataStore) {
    this.dataStore = dataStore;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoader.java`
#### Snippet
```java
  private DataStore<K, T> dataStore;

  public JCacheCacheLoader(DataStore<K, T> dataStore) {
    this.dataStore = dataStore;
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
   */
  @Override
  public long deleteByQuery(Query<K, T> query) throws GoraException {
    Delete delete = new Delete();
    delete.from(orientDBMapping.getDocumentClass());
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-core/src/main/java/org/apache/gora/flink/PersistentTypeSerializer.java`
#### Snippet
```java
  private Class<T> persistentClass;

  public PersistentTypeSerializer(Class<T> persistentClass) {
    this.persistentClass = persistentClass;
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
   */
  @Override
  public long deleteByQuery(Query<K, T> query) throws GoraException {
    if (query.getFields() == null || (query.getFields().length == getFields().length)) {
      String[] fields = getFieldsToQuery(query.getFields());
```

### BoundedWildcard
Can generalize to `? super K`
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraRecordWriter.java`
#### Snippet
```java
  private GoraRecordCounter counter = new GoraRecordCounter();

  public GoraRecordWriter(DataStore<K, Persistent> store, TaskAttemptContext context) {
    this.store = store;
    
```

### BoundedWildcard
Can generalize to `? super Persistent`
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraRecordWriter.java`
#### Snippet
```java
  private GoraRecordCounter counter = new GoraRecordCounter();

  public GoraRecordWriter(DataStore<K, Persistent> store, TaskAttemptContext context) {
    this.store = store;
    
```

### BoundedWildcard
Can generalize to `? extends ByteBuffer`
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
   */
  //TODO: not tested
  public static byte[] getAsBytes(List<ByteBuffer> buffers) {
    //find total size
    int size = 0;
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyIteratorWrapper.java`
#### Snippet
```java
  private Iterator<T> delegateIterator;

  DirtyIteratorWrapper(Iterator<T> delegateIterator,
      DirtyFlag dirtyFlag) {
    this.delegateIterator = delegateIterator;
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
    private Iterator<K> iterator;
    public MemResult(DataStore<K, T> dataStore, Query<K, T> query
        , NavigableMap<K, T> map) {
      super(dataStore, query);
      this.map = map;
```

### BoundedWildcard
Can generalize to `? extends V2`
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraReducer.java`
#### Snippet
```java
      Class<? extends DataStore<K2,V2>> dataStoreClass,
      Class<K2> keyClass, 
      Class<V2> persistentClass,
      Class<? extends GoraReducer<K1, V1, K2, V2>> reducerClass, 
      boolean reuseObjects) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java
    private DirtyFlag dirtyFlag;

    public DirtyEntryWrapper(Entry<K, V> delegate, DirtyFlag dirtyFlag) {
      this.entryDelegate = delegate;
      this.dirtyFlag = dirtyFlag;
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
   */
  @Override
  public void initialize(Class<K> keyClass, Class<T> persistentClass, Properties properties) throws GoraException {
    LOG.debug("Initializing Cassandra store");
    String serializationType;
```

### BoundedWildcard
Can generalize to `? extends AerospikeResultRecord`
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/query/AerospikeQueryResult.java`
#### Snippet
```java

  public AerospikeQueryResult(DataStore<K, T> dataStore, Query<K, T> query,
          List<AerospikeResultRecord> recordsList, String[] fields) {
    super(dataStore, query);
    this.resultRecords = recordsList;
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
  private Schema persistentSchema;

  AvroSerializer(CassandraClient cassandraClient, DataStore<K, T> dataStore, CassandraMapping mapping) throws GoraException {
    super(cassandraClient, dataStore.getKeyClass(), dataStore.getPersistentClass(), mapping);
    if (PersistentBase.class.isAssignableFrom(dataStore.getPersistentClass())) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroSerializer.java`
#### Snippet
```java
  private Schema persistentSchema;

  AvroSerializer(CassandraClient cassandraClient, DataStore<K, T> dataStore, CassandraMapping mapping) throws GoraException {
    super(cassandraClient, dataStore.getKeyClass(), dataStore.getPersistentClass(), mapping);
    if (PersistentBase.class.isAssignableFrom(dataStore.getPersistentClass())) {
```

### BoundedWildcard
Can generalize to `? extends Field`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
  }

  private static void processFieldsForCreateTableQuery(List<Field> fields, boolean isCommaNeeded, StringBuilder stringBuilder) {
    for (Field field : fields) {
      if (isCommaNeeded) {
```

### BoundedWildcard
Can generalize to `? extends Field`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
  }

  private static String getPKey(List<Field> fields) {
    for (Field field : fields) {
      boolean isPrimaryKey = Boolean.parseBoolean(field.getProperty("primarykey"));
```

### BoundedWildcard
Can generalize to `? super Long`
in `gora-goraci/src/main/java/org/apache/gora/goraci/Generator.java`
#### Snippet
```java
    }
    
    private static void updatePrev(DataStore<Long,CINode> store, long[] first, long[] current) throws IOException {
      for (int i = 0; i < current.length; i++) {
        CINode node = store.newPersistent();
```

### BoundedWildcard
Can generalize to `? super Long`
in `gora-goraci/src/main/java/org/apache/gora/goraci/Generator.java`
#### Snippet
```java
    }
    
    private static void persist(Context output, DataStore<Long,CINode> store, long count, long[] prev, long[] current, Utf8 id) throws IOException {
      for (int i = 0; i < current.length; i++) {
        CINode node = store.newPersistent();
```

### BoundedWildcard
Can generalize to `? super String`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(AvroCassandraUtils.class);

  static void processKeys(CassandraMapping cassandraMapping, Object key, List<String> keys, List<Object> values) {
    CassandraKey cassandraKey = cassandraMapping.getCassandraKey();
    if (cassandraKey != null) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  public K fromBytes(Class<K> clazz, byte[] val) {
    return fromBytes(encoder, clazz, val);
  }
```

### BoundedWildcard
Can generalize to `? extends Entry`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  public ByteSequence populate(Iterator<Entry<Key,Value>> iter, T persistent) throws IOException {
    ByteSequence row = null;

```

### BoundedWildcard
Can generalize to `? extends Key`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
   * @return String The field name
   */
  private String getFieldName(Entry<Key, Value> entry) {
    String fieldName = mapping.columnMap.get(new Pair<>(entry.getKey().getColumnFamily(),
        entry.getKey().getColumnQualifier()));
```

### BoundedWildcard
Can generalize to `? extends Text`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  private int putArray(Mutation m, int count, Object o, Pair<Text, Text> col, String fieldName) throws GoraException {

    // First of all we delete array field on accumulo store
```

### BoundedWildcard
Can generalize to `? extends Text`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  }

  private int putMap(Mutation m, int count, Schema valueType, Object o, Pair<Text, Text> col, String fieldName) throws GoraException {

    // First of all we delete map field on accumulo store
```

### BoundedWildcard
Can generalize to `? super String`
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseMapping.java`
#### Snippet
```java

    private ColumnFamilyDescriptor getOrCreateFamily(String familyName,
                                                     Map<String, ColumnFamilyDescriptor> families) {
      ColumnFamilyDescriptor columnDescriptor = families.get(familyName);
      if (columnDescriptor == null) {
```

### BoundedWildcard
Can generalize to `? extends Element`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveMappingBuilder.java`
#### Snippet
```java
  }

  private void parseFieldElements(HiveMapping hiveMapping, List<Element> fieldElments) {
    if (fieldElments != null) {
      List<String> fieldNames = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends Element`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveMappingBuilder.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private void parseClassElements(HiveMapping hiveMapping, Class<T> persistentClass,
      Class<K> keyClass, List<Element> classElements) {
    for (Element classElement : classElements) {
      String persistentClassName = classElement.getAttributeValue(NAME_ATTRIBUTE);
```

### BoundedWildcard
Can generalize to `? extends Field`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveQueryBuilder.java`
#### Snippet
```java
   * @throws GoraException throws if the schema generation is failed
   */
  private Schema createAvroSchema(Map<String, Field> fieldMap) throws GoraException {
    Class<?> persistentClass = hiveStore.getPersistentClass();
    Schema avroSchema = Schema.createRecord(persistentClass.getSimpleName(), null,
```

### BoundedWildcard
Can generalize to `? extends Field`
in `gora-hive/src/main/java/org/apache/gora/hive/util/HiveQueryBuilder.java`
#### Snippet
```java
   * @throws GoraException throw if the generation of the sql is failed
   */
  public String buildInsertQuery(Object key, PersistentBase value, Map<String, Field> fieldMap,
      List<Object> parameterList)
      throws GoraException {
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java
  }

  public synchronized void initialize(Class<K> keyClass, Class<T> persistentClass, Properties properties) throws Exception {

    if (cache!=null)
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBResult.java`
#### Snippet
```java
   * @param objList
   */
  public void setResultSet(List<T> objList) {
    this.dynamoDBResultSet = objList;
    this.limit = objList.size();
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java

  @Override
  public List<PartitionQuery<K, T>> getPartitions(Query<K, T> query)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? super T`
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java

  @Override
  public List<PartitionQuery<K, T>> getPartitions(Query<K, T> query)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? extends ArrayList`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
   */
  public DynamoDBMapping(Map<String, Map<String, String>> tablesToItems2,
      Map<String, ArrayList<KeySchemaElement>> tablesToKeySchemas,
      Map<String, ProvisionedThroughput> provisionedThroughput) {

```

### BoundedWildcard
Can generalize to `? extends ProvisionedThroughput`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
  public DynamoDBMapping(Map<String, Map<String, String>> tablesToItems2,
      Map<String, ArrayList<KeySchemaElement>> tablesToKeySchemas,
      Map<String, ProvisionedThroughput> provisionedThroughput) {

    this.tablesToItems = tablesToItems2;
```

### BoundedWildcard
Can generalize to `? extends KeySchemaElement`
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
   * @param map
   */
  private void compile(String pTableName, ArrayList<KeySchemaElement> arrayList, Map<String, String> map){
    try {
      startFile(pTableName, pTableName);
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/query/ElasticsearchResult.java`
#### Snippet
```java
  private List<K> persistentKeys;

  public ElasticsearchResult(DataStore<K, T> dataStore, Query<K, T> query, List<K> persistentKeys, List<T> persistentObjects) {
    super(dataStore, query);
    this.persistentKeys = persistentKeys;
```

### BoundedWildcard
Can generalize to `? extends T`
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/query/ElasticsearchResult.java`
#### Snippet
```java
  private List<K> persistentKeys;

  public ElasticsearchResult(DataStore<K, T> dataStore, Query<K, T> query, List<K> persistentKeys, List<T> persistentObjects) {
    super(dataStore, query);
    this.persistentKeys = persistentKeys;
```

### BoundedWildcard
Can generalize to `? extends KuduPredicate`
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
  }

  private KuduScanner createScanner(List<KuduPredicate> predicates, List<String> projColumns, long limit) {
    KuduScanner.KuduScannerBuilder scannerBuilder = client.newScannerBuilder(table);
    if (limit != -1) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
   */
  @Override
  public long deleteByQuery(Query<K, T> query) throws GoraException {

    final K key = query.getKey();
```

### BoundedWildcard
Can generalize to `? extends K`
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
  }
  
  private Collection<K> runQuery(Query<K, T> query) {
    Collection<K> range;
    if (isNumericKey()) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final private`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/utils/BSONDecorator.java`
#### Snippet
```java
public class BSONDecorator {

  final private Document myBson;

  public BSONDecorator(final Document obj) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
  protected static final String DEFAULT_MAPPING_FILE = "gora-accumulo-mapping.xml";

  private final static String UNKOWN = "Unknown type ";

  private Connector conn;
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `gora-core/src/main/java/org/apache/gora/util/ReflectionUtils.java`
#### Snippet
```java
    boolean found = false;
    for(Constructor<?> cons : consts) {
      if(cons.getParameterTypes().length == 0) {
        found = true;
      }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoaderFactory.java`
#### Snippet
```java

  public JCacheCacheLoader<K, T> create() {
    if (this.instance != null) {
      return (JCacheCacheLoader<K, T>) this.instance;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriterFactory.java`
#### Snippet
```java

  public JCacheCacheWriter<K, T> create() {
    if (this.instance != null) {
      return (JCacheCacheWriter<K, T>) this.instance;
    } else {
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
   */
  public boolean equals(Object o) {
    if (this == o) return true;
    // TODO we should check if the object has schema or not
    return true;
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMapping.java`
#### Snippet
```java
   */
  public Field getInlinedDefinedPartitionKey() {
    if (inlinedDefinedPartitionKey != null) {
      return inlinedDefinedPartitionKey;
    } else {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
          batch.add(inputDoc);
        }
        if (commitWithin == 0) {
          rsp = server.add(batch);
          server.commit(false, true, true);
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      OClass documentClass = schemaTx.getMetadata().getSchema().createClass(orientDBMapping.getDocumentClass());
      documentClass.createProperty("_id",
              OType.getTypeByClass(super.getKeyClass())).createIndex(OClass.INDEX_TYPE.UNIQUE);
      for (String docField : orientDBMapping.getDocumentFields()) {
        documentClass.createProperty(docField,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
  @Override
  public String getSchemaName() {
    return super.persistentClass.getSimpleName();
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
  public boolean schemaExists() throws GoraException {
    try {
      return (manager.getCache(super.getPersistentClass().getSimpleName(), keyClass, persistentClass) != null);
    } catch (Exception e) {
      throw new GoraException(e);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
  public void createSchema() throws GoraException {
    try {
      if (manager.getCache(super.getPersistentClass().getSimpleName(), keyClass, persistentClass) == null) {
        cacheEntryList.clear();
        cache = manager.createCache(persistentClass.getSimpleName(),
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      persistentDataStore.createSchema();
      LOG.info("Created schema on persistent store and initialized cache for persistent bean {}."
              , super.getPersistentClass().getSimpleName());
    } catch (GoraException e) {
      throw e;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
    try {
      cache.removeAll();
      manager.destroyCache(super.getPersistentClass().getSimpleName());
      persistentDataStore.deleteSchema();
      LOG.info("Deleted schema on persistent store and destroyed cache for persistent bean {}."
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      persistentDataStore.deleteSchema();
      LOG.info("Deleted schema on persistent store and destroyed cache for persistent bean {}."
              , super.getPersistentClass().getSimpleName());
    } catch (GoraException e) {
      throw e;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
    if (((properties.getProperty(JCACHE_AUTO_CREATE_CACHE_PROPERTY_KEY) != null) &&
            Boolean.valueOf(properties.getProperty(JCACHE_AUTO_CREATE_CACHE_PROPERTY_KEY)))
            || ((manager.getCache(super.getPersistentClass().getSimpleName(), keyClass, persistentClass) == null))) {
      cacheEntryList = new ConcurrentSkipListSet<>();
      MutableConfiguration mutableCacheConfig = new MutableConfiguration<>();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      cacheConfig = mutableCacheConfig;
    } else {
      cache = manager.getCache(super.getPersistentClass().getSimpleName(),
              keyClass, persistentClass);
      this.populateLocalCacheEntrySet(cache);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `gora-core/src/main/java/org/apache/gora/persistency/Tombstones.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public boolean containsAll(Collection c) {
      return DELEGATE.containsAll(c);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java

    // All fields are mandatory
    if (pigFieldSchemasNames.containsAll(queryFields)) {
      for (ResourceFieldSchema pigFieldSchema: pigFieldsSchemas) {
        if (queryFields.contains(pigFieldSchema.getName())) {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
      case ARRAY:
        List<?> rawdataList = (List<?>) fieldValue;
        rawdataList.stream().map((lsValue) -> serializeFieldValue(fieldSchema.getElementType(), lsValue)).forEachOrdered((lsValue_) -> {
          serializedList.add(lsValue_);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
        if (mode == StorageMode.SINGLEKEY) {
          RMapAsync<Object, Object> map = batchInstance.getMap(generateKeyHash(key));
          dbFields.forEach((field) -> {
            map.removeAsync(field);
          });
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `gora-core/src/main/java/org/apache/gora/util/WritableUtils.java`
#### Snippet
```java
      String key = prop.getKey().toString();
      String value = prop.getValue().toString();
      props.put(key,value);
    }
    return props;
```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java

    Properties chefConfig = new Properties();
    chefConfig.put(ChefProperties.CHEF_VALIDATOR_NAME, validator);
    chefConfig.put(ChefProperties.CHEF_VALIDATOR_CREDENTIAL, validatorCredential);

```

### UseOfPropertiesAsHashtable
Call to `Hashtable.put()` on properties object
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
    Properties chefConfig = new Properties();
    chefConfig.put(ChefProperties.CHEF_VALIDATOR_NAME, validator);
    chefConfig.put(ChefProperties.CHEF_VALIDATOR_CREDENTIAL, validatorCredential);

    // Create the connection to the Chef server
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Empty method overrides empty method
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/query/AccumuloResult.java`
#### Snippet
```java
  
  @Override
  public void close() throws IOException {
    
  }
```

### EmptyMethod
Method only calls its super
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/query/CassandraResultSet.java`
#### Snippet
```java
   */
  @Override
  public T get() {
    return super.get();
  }
```

### EmptyMethod
Method only calls its super
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/query/CassandraResultSet.java`
#### Snippet
```java
   */
  @Override
  public K getKey() {
    return super.getKey();
  }
```

### EmptyMethod
Empty method overrides empty method
in `gora-core/src/main/java/org/apache/gora/avro/query/AvroResult.java`
#### Snippet
```java
  }

  public void close() throws IOException {
  }

```

### EmptyMethod
Empty method overrides empty method
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
    }
    //@Override
    public void close() { }

    @Override
```

### EmptyMethod
The method is empty
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
  }

  private void clearReadable() {

  }
```

### EmptyMethod
The method is empty
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java


    public void setNew(boolean pNew){}
    public void setDirty(boolean pDirty){}
    @Override
```

### EmptyMethod
The method is empty
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Person.java`
#### Snippet
```java

    public void setNew(boolean pNew){}
    public void setDirty(boolean pDirty){}
    @Override
    public void clear() { }
```

### EmptyMethod
The method is empty
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java


    public void setNew(boolean pNew){}
    public void setDirty(boolean pDirty){}
    @Override
```

### EmptyMethod
The method is empty
in `gora-dynamodb/src/examples/java/org/apache/gora/dynamodb/example/generated/Webpage.java`
#### Snippet
```java

    public void setNew(boolean pNew){}
    public void setDirty(boolean pDirty){}
    @Override
    public void clear() { }
```

### EmptyMethod
Empty method overrides empty method
in `gora-hbase/src/main/java/org/apache/gora/hbase/query/HBaseGetResult.java`
#### Snippet
```java

  @Override
  public void close() throws IOException {
  }

```

### EmptyMethod
Empty method overrides empty method
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java

  @Override
  public void close() throws IOException {

  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/KeyValueWritable.java`
#### Snippet
```java
  implements WritableComparable<KeyValueWritable<K,V>> {

  protected K key = null;
  protected V value =  null;
  
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/KeyValueWritable.java`
#### Snippet
```java

  protected K key = null;
  protected V value =  null;
  
  public KeyValueWritable() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/ResultWSBase.java`
#### Snippet
```java
  
  /** How far we have proceeded*/
  protected long offset = 0;
  
  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-core/src/main/java/org/apache/gora/query/ws/impl/QueryWSBase.java`
#### Snippet
```java
   * Flag to determine whether a query is compiled or not
   */
  protected boolean isCompiled = false;

  /** Object that will hold user's authentication tokens for webservice database */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-core/src/main/java/org/apache/gora/query/impl/ResultBase.java`
#### Snippet
```java

  /** How far we have proceeded*/
  protected long offset = 0;

  public ResultBase(DataStore<K,T> dataStore, Query<K,T> query) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-core/src/main/java/org/apache/gora/filter/SingleFieldValueFilter.java`
#### Snippet
```java
  protected FilterOp filterOp;
  protected List<Object> operands = new ArrayList<>();
  protected boolean filterIfMissing = false;

  //just create empty conf needed for ObjectWritable
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-core/src/main/java/org/apache/gora/filter/MapFieldValueFilter.java`
#### Snippet
```java
  protected FilterOp filterOp;
  protected List<Object> operands = new ArrayList<>();
  protected boolean filterIfMissing = false;

  //just create empty conf needed for ObjectWritable
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraRecordCounter.java`
#### Snippet
```java
   * Count the number of records read from the datastore per system call.
   */
  private int recordsNumber = 0;
  
  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/BeanFactoryWSImpl.java`
#### Snippet
```java
   * Flag to be used to determine if a key is persistent or not
   */
  private boolean isKeyPersistent = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-core/src/main/java/org/apache/gora/persistency/impl/BeanFactoryImpl.java`
#### Snippet
```java
  
  /** Flag to be used to determine if a key is persistent or not */
  private boolean isKeyPersistent = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/query/CassandraResultSet.java`
#### Snippet
```java
  private List<K> persistentKey = new ArrayList<K>();

  private int size = 0;

  private int position = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/query/CassandraResultSet.java`
#### Snippet
```java
  private int size = 0;

  private int position = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
  private final LuceneStore<K, T> store;
  private String[] fields;
  private int pos = 0;
  private final SearcherManager searcherManager;
  private IndexSearcher searcher;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
        extends ResultBase<K, T> {

  private ScoreDoc[] scoreDocs = null;
  private final LuceneStore<K, T> store;
  private String[] fields;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
    private LongWritable ref = new LongWritable();
    private VLongWritable vrow = new VLongWritable();
    private Map<Utf8,Long> flushed = null;
    
    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
  private static String rsUser = null;
  
  private static String rsApiKey = null;
  
  private static String rsRegion = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
  private static NovaApi novaApi = null;
  
  private static String rsContinent = null;
  
  private static String rsUser = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
  private static String RS_PUBKEY = "rackspace.uploadpubkey";
  
  private static NovaApi novaApi = null;
  
  private static String rsContinent = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
  private static String rsContinent = null;
  
  private static String rsUser = null;
  
  private static String rsApiKey = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
  private static String rsApiKey = null;
  
  private static String rsRegion = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-hive/src/main/java/org/apache/gora/hive/query/HiveResult.java`
#### Snippet
```java

  private List<Row> results;
  private int currentRow= 0 ;

  public HiveResult(HiveStore<K, T> dataStore, Query<K, T> query) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/query/SolrResult.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(SolrResult.class);
  
  SolrDocumentList list = null;
  SolrStore<K, T> store;
  String[] fields;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-solr/src/main/java/org/apache/gora/solr/query/SolrResult.java`
#### Snippet
```java
  SolrStore<K, T> store;
  String[] fields;
  int pos = 0;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
   * Signature for each different GoraStore (based on configuration), that determines the UDFProperties to use
   */
  protected String udfcSignature = null ;
  
  /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/util/CouchDBObjectMapperFactory.java`
#### Snippet
```java

  private ObjectMapper instance;
  private boolean writeDatesAsTimestamps = false;

  /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/query/CouchDBResult.java`
#### Snippet
```java

  protected CouchDBStore dataStore;
  int position = 0;

  /**
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `org.apache.avro.specific.SpecificRecord`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
```

### RedundantImplements
Redundant interface declaration `org.apache.gora.persistency.Persistent`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.data.RecordBuilder`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MetricDatum>
    implements org.apache.avro.data.RecordBuilder<MetricDatum> {

    private java.lang.CharSequence metricDimension;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.specific.SpecificRecord`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
```

### RedundantImplements
Redundant interface declaration `org.apache.gora.persistency.Persistent`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.data.RecordBuilder`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pageview>
    implements org.apache.avro.data.RecordBuilder<Pageview> {

    private java.lang.CharSequence url;
```

### RedundantImplements
Redundant interface declaration `Configurable`
in `gora-core/src/main/java/org/apache/gora/avro/store/AvroStore.java`
#### Snippet
```java
 */
public class AvroStore<K, T extends PersistentBase> 
  extends FileBackedDataStoreBase<K, T> implements Configurable {

  /** The property key specifying avro encoder/decoder type to use. Can take values
```

### RedundantImplements
Redundant interface declaration `Dirtyable`
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyListWrapper.java`
#### Snippet
```java
 */
public class DirtyListWrapper<T> extends DirtyCollectionWrapper<T> implements
    Dirtyable, List<T> {

  /**
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.specific.SpecificRecord`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
```

### RedundantImplements
Redundant interface declaration `org.apache.gora.persistency.Persistent`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.data.RecordBuilder`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Flushed>
    implements org.apache.avro.data.RecordBuilder<Flushed> {

    private long count;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.data.RecordBuilder`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CINode>
    implements org.apache.avro.data.RecordBuilder<CINode> {

    private long prev;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.specific.SpecificRecord`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
```

### RedundantImplements
Redundant interface declaration `org.apache.gora.persistency.Persistent`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.specific.SpecificRecord`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
package org.apache.gora.benchmark.generated;  

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID
```

### RedundantImplements
Redundant interface declaration `org.apache.gora.persistency.Persistent`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
package org.apache.gora.benchmark.generated;  

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID
```

### RedundantImplements
Redundant interface declaration `org.apache.avro.data.RecordBuilder`
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence userId;
```

### RedundantImplements
Redundant interface declaration `Configurable`
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
 */
public class LuceneStore<K, T extends PersistentBase>
        extends FileBackedDataStoreBase<K, T> implements Configurable {

  private static final Logger LOG = LoggerFactory.getLogger(LuceneStore.class);
```

### RedundantImplements
Redundant interface declaration `DataContext`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
 * and methods to establish a HiveConnection and execute row hive sql strings on that connection
 */
public class HiveDataContext implements DataContext, UpdateableDataContext {

  private static final Logger LOG = LoggerFactory.getLogger((MethodHandles.lookup().lookupClass()));
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `gora-core/src/main/java/org/apache/gora/util/TimingUtil.java`
#### Snippet
```java
        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
        nf.setMinimumIntegerDigits(2);
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < elapsedTime.length; i++) {
            if (i > 0) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-core/src/main/java/org/apache/gora/util/ReflectionUtils.java`
#### Snippet
```java

  public static Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
  public static Object[] EMPTY_OBJECT_ARRAY = new Object[0];

  /**
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-core/src/main/java/org/apache/gora/util/ReflectionUtils.java`
#### Snippet
```java
public class ReflectionUtils {

  public static Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
  public static Object[] EMPTY_OBJECT_ARRAY = new Object[0];

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraSerializer.java`
#### Snippet
```java
      fields.add(field.getFieldName());
    }
    return fields.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkClient.java`
#### Snippet
```java
  private static int totalFieldCount;
  /** This is only for set to array conversion in {@link read()} method */
  private String[] DUMMY_ARRAY = new String[0];
  private static DataStore<String, User> dataStore;
  private User user = new User();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
    } else {
      Collection<String> c = store.getMapping().getLuceneFields();
      String[] a = {};
      fields = c.toArray(a);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java
    } else {
      Collection<String> c = store.getMapping().getLuceneFields();
      String[] a = {};
      fields = c.toArray(a);
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java
    }
    
    conf.setStrings("org.apache.gora.goraci.verify.flushed", flushedEntries.toArray(new String[] {}));
    
    flushedTable.close();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
      }
    }
    return columnNames.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-goraci/src/main/java/org/apache/gora/goraci/Generator.java`
#### Snippet
```java
      @Override
      public String[] getLocations() throws IOException, InterruptedException {
        return new String[0];
      }
      
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
    Field currentField = null;

    BinaryDecoder decoder = DecoderFactory.get().binaryDecoder(new byte[0], null);

    while (iter.hasNext()) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
        Document doc = s.doc(hits[0].doc, fields);
        LOG.debug("get:Document: {}", doc.toString());
        String[] a = {};
        return newInstance(doc, fields.toArray(a));
      }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
      case RECORD:
        // For now we'll just store the bytes
        byte[] data = new byte[0];
        try {
          SpecificDatumWriter writer = getDatumWriter(fieldSchema);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseMapping.java`
#### Snippet
```java
    strBuilder.append("\n");
    for (Entry<String, HBaseColumn> mappingEntry : this.columnMap.entrySet()) {
      byte[] familyBytes = mappingEntry.getValue().getFamily() == null ? new byte[0] : mappingEntry.getValue().getFamily() ;
      byte[] qualifierBytes = mappingEntry.getValue().getQualifier() == null ? new byte[0] : mappingEntry.getValue().getQualifier() ;
      strBuilder.append(mappingEntry.getKey() + " -> " + new String(familyBytes, StandardCharsets.UTF_8) + ":" + new String(qualifierBytes, StandardCharsets.UTF_8)) ;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseMapping.java`
#### Snippet
```java
    for (Entry<String, HBaseColumn> mappingEntry : this.columnMap.entrySet()) {
      byte[] familyBytes = mappingEntry.getValue().getFamily() == null ? new byte[0] : mappingEntry.getValue().getFamily() ;
      byte[] qualifierBytes = mappingEntry.getValue().getQualifier() == null ? new byte[0] : mappingEntry.getValue().getQualifier() ;
      strBuilder.append(mappingEntry.getKey() + " -> " + new String(familyBytes, StandardCharsets.UTF_8) + ":" + new String(qualifierBytes, StandardCharsets.UTF_8)) ;
      strBuilder.append("\n");
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
  protected String[] getFields() {
    List<String> fields = mapping.getFields();
    return fields.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
  public String[] getLocations() {
    if (location==null)
      return new String[0];
    String[] result = new String[1];
    result[0] = location.getHostString();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
        fieldsWithPrimary[fields.length] = getPrimaryFieldName();
      }else{
        fieldsWithPrimary = fieldsList.toArray(new String[]{});
      }
      qb.setProjection(fieldsWithPrimary);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
    Query query = this.getDataStore().newQuery() ;
    if (!this.storageConfiguration.isAllFieldsQuery()) {
      query.setFields(this.loadQueryFields.toArray(new String[0])) ;
    }
    this.inputFormat.setQuery(query);
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `columns`, unclear if a varargs or non-varargs call is desired
in `gora-ignite/src/main/java/org/apache/gora/ignite/utils/IgniteSQLBuilder.java`
#### Snippet
```java
      columns[i] = list.get(i).getKey().getName();
    }
    return insertQuery.addCustomPreparedColumns(columns).validate().toString()
        .replaceFirst("INSERT", "MERGE");
  }
```

### NullArgumentToVariableArgMethod
Confusing argument `projection`, unclear if a varargs or non-varargs call is desired
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/query/RethinkDBQuery.java`
#### Snippet
```java
      }
      projection[counter] = "id";
      dbQuery = dbQuery.pluck(projection);
    }

```

### NullArgumentToVariableArgMethod
Confusing argument `projection`, unclear if a varargs or non-varargs call is desired
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
        }
      }
      MapObject<String, Object> document = reqlExpr.replace(row -> row.without(projection))
              .run(connection, MapObject.class).first();
      int replacedCount = Integer.valueOf(document.get("replaced").toString());
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `hashCode()` recurses infinitely, and can only end by throwing an exception
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoaderFactory.java`
#### Snippet
```java
  }

  public int hashCode() {
    return this.hashCode();
  }
```

### InfiniteRecursion
Method `hashCode()` recurses infinitely, and can only end by throwing an exception
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriterFactory.java`
#### Snippet
```java
  }

  public int hashCode() {
    return this.hashCode();
  }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java

    //Manage keypairs
    KeyPairApi keyPairApi = novaApi.getKeyPairApi(rsRegion).get();

    File keyPairFile = null;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `pageview != null` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogManager.java`
#### Snippet
```java
          Pageview pageview = parseLine(line);

          if (pageview != null) {
            //store the pageview
            storePageview(lineCount++, pageview);
```

### ConstantValue
Condition `isValidValue(fields()[1], other.timestamp)` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
```

### ConstantValue
Condition `isValidValue(fields()[2], other.metric)` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.metric)) {
        this.metric = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.metric);
        fieldSetFlags()[2] = true;
```

### ConstantValue
Condition `isValidValue(fields()[1], other.timestamp)` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
```

### ConstantValue
Condition `isValidValue(fields()[4], other.httpStatusCode)` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.httpStatusCode)) {
        this.httpStatusCode = (java.lang.Integer) data().deepCopy(fields()[4].schema(), other.httpStatusCode);
        fieldSetFlags()[4] = true;
```

### ConstantValue
Condition `isValidValue(fields()[5], other.responseSize)` is always `true`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.responseSize)) {
        this.responseSize = (java.lang.Integer) data().deepCopy(fields()[5].schema(), other.responseSize);
        fieldSetFlags()[5] = true;
```

### ConstantValue
Condition `currentChildren != null` is always `true`
in `gora-core/src/main/java/org/apache/gora/util/NodeWalker.java`
#### Snippet
```java
    currentNode = nodes.pop();
    currentChildren = currentNode.getChildNodes();
    int childLen = (currentChildren != null) ? currentChildren.getLength() : 0;
    
    // put the children node on the stack in first to last order
```

### ConstantValue
Condition `operand instanceof Void` is always `false`
in `gora-core/src/main/java/org/apache/gora/filter/SingleFieldValueFilter.java`
#### Snippet
```java
      } else if (operand instanceof Double) {
        ObjectWritable.writeObject(out, operand, Double.TYPE, conf);
      } else if (operand instanceof Void) {
        ObjectWritable.writeObject(out, operand, Void.TYPE, conf);
      } else {
```

### ConstantValue
Condition `operand instanceof Void` is always `false`
in `gora-core/src/main/java/org/apache/gora/filter/MapFieldValueFilter.java`
#### Snippet
```java
      } else if (operand instanceof Double) {
        ObjectWritable.writeObject(out, operand, Double.TYPE, conf);
      } else if (operand instanceof Void) {
        ObjectWritable.writeObject(out, operand, Void.TYPE, conf);
      } else {
```

### ConstantValue
Condition `value==null` is always `false` when reached
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
    case ARRAY:
      Object value = get(field.pos());
      return !(value instanceof Dirtyable) || value==null ? false : ((Dirtyable) value).isDirty();
    case UNION:
      value = get(field.pos());
```

### ConstantValue
Condition `value==null` is always `false` when reached
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
    case UNION:
      value = get(field.pos());
      return !(value instanceof Dirtyable) || value==null ? false : ((Dirtyable) value).isDirty();
    default:
      break;
```

### ConstantValue
Condition `select instanceof Delete` is always `false`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
              if (select instanceof Select) {
                query = ((Select.Where) query).and(QueryBuilder.gte(columnKeys[i], "?"));
              } else if (select instanceof Delete) {
                       /*
                According to the JIRA https://issues.apache.org/jira/browse/CASSANDRA-7651 this has been fixed, but It seems this not fixed yet.
```

### ConstantValue
Condition `select instanceof Delete` is always `false`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
              if (select instanceof Select) {
                query = ((Select.Where) query).and(QueryBuilder.lte(columnKeys[i], "?"));
              } else if (select instanceof Delete) {
                               /*
                According to the JIRA https://issues.apache.org/jira/browse/CASSANDRA-7651 this has been fixed, but It seems this not fixed yet.
```

### ConstantValue
Condition `select instanceof Delete` is always `false`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
            if (select instanceof Select) {
              query = ((Select.Where) query).and(QueryBuilder.lte(primaryKey, "?"));
            } else if (select instanceof Delete) {
              /*
                According to the JIRA https://issues.apache.org/jira/browse/CASSANDRA-7651 this has been fixed, but It seems this not fixed yet.
```

### ConstantValue
Condition `isValidValue(fields()[0], other.count)` is always `true`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    private Builder(org.apache.gora.goraci.generated.Flushed other) {
            super(org.apache.gora.goraci.generated.Flushed.SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.count);
        fieldSetFlags()[0] = true;
```

### ConstantValue
Condition `isValidValue(fields()[0], other.prev)` is always `true`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    private Builder(org.apache.gora.goraci.generated.CINode other) {
            super(org.apache.gora.goraci.generated.CINode.SCHEMA$);
      if (isValidValue(fields()[0], other.prev)) {
        this.prev = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.prev);
        fieldSetFlags()[0] = true;
```

### ConstantValue
Condition `isValidValue(fields()[2], other.count)` is always `true`
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.count);
        fieldSetFlags()[2] = true;
```

### ConstantValue
Condition `clazz.equals(Enum.class)` is always `false`
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
  public static byte[] toBytes(Object o) {
    Class<?> clazz = o.getClass();
    if (clazz.equals(Enum.class)) {
      return new byte[] { (byte)((Enum<?>) o).ordinal() }; // yeah, yeah it's a hack
    } else if (clazz.equals(Byte.TYPE) || clazz.equals(Byte.class)) {
```

### ConstantValue
Value `hashPk` is always 'false'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
      if (kSchema == null) {
        LOG.error("No keys defined for '{}'. Please check your schema!", tableName);
        return hashPk;
      }
      for (KeySchemaElement ks : kSchema) {
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBQuery.java`
#### Snippet
```java
        if(met.getName().equals("getRangeKey")){
          Object [] params = null;
          rangeKey = met.invoke(key, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBQuery.java`
#### Snippet
```java
        if (met.getName().equals("getHashKey")) {
          Object[] params = null;
          hashKey = met.invoke(key, params);
          break;
        }
```

### ConstantValue
Value `tableDescription` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
    } catch (ResourceNotFoundException e) {
      LOG.error("Error while getting table schema: " + tableName);
      return tableDescription;
    }
    return tableDescription;
```

### ConstantValue
Condition `authenticationTypeProperty != null` is always `true`
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/utils/ElasticsearchParameters.java`
#### Snippet
```java
    AuthenticationType authenticationTypeProperty =
            AuthenticationType.valueOf(properties.getProperty(ElasticsearchConstants.PROP_AUTHENTICATIONTYPE));
    if (authenticationTypeProperty != null) {
      elasticsearchParameters.setAuthenticationType(authenticationTypeProperty);
    }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_HASH_KEY_METHOD)) {
          Object[] params = null;
          hashKey = met.invoke(obj, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_RANGE_KEY_METHOD)) {
          Object[] params = null;
          rangeKey = met.invoke(key, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_HASH_KEY_METHOD)) {
          Object[] params = null;
          hashKey = met.invoke(key, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_HASH_KEY_METHOD)) {
          Object[] params = null;
          hashKey = met.invoke(obj, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_RANGE_KEY_METHOD)) {
          Object[] params = null;
          rangeKey = met.invoke(obj, params);
          break;
        }
```

### ConstantValue
Value `params` is always 'null'
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBNativeStore.java`
#### Snippet
```java
        if (met.getName().equals(GET_RANGE_KEY_METHOD)) {
          Object[] params = null;
          rangeKey = met.invoke(obj, params);
          break;
        }
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `get()` tries to override a static method of a superclass
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
    private static final PersistentData INSTANCE = new PersistentData();

    public static PersistentData get() {
      return INSTANCE;
    }
```

### MethodOverridesStaticMethod
Method `fingerprint64()` tries to override a static method of a superclass
in `gora-compiler/src/main/java/org/apache/gora/compiler/GoraCompiler.java`
#### Snippet
```java
   * @return serialVersionUID for Serializable AVRO databeans.
   */
  public static long fingerprint64(Schema schema) {
    return SchemaNormalization.parsingFingerprint64(schema);
  }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    urlBuilder.append(igniteParameters.getHost());
    if (igniteParameters.getPort() != null) {
      urlBuilder.append(":" + igniteParameters.getPort());
    }
    if (igniteParameters.getSchema() != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    }
    if (igniteParameters.getSchema() != null) {
      urlBuilder.append("/" + igniteParameters.getSchema());
    }
    if (igniteParameters.getUser() != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    }
    if (igniteParameters.getUser() != null) {
      urlBuilder.append(";" + igniteParameters.getUser());
    }
    if (igniteParameters.getPassword() != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    }
    if (igniteParameters.getPassword() != null) {
      urlBuilder.append(";" + igniteParameters.getPassword());
    }
    if (igniteParameters.getAdditionalConfigurations() != null) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseMapping.java`
#### Snippet
```java
      byte[] familyBytes = mappingEntry.getValue().getFamily() == null ? new byte[0] : mappingEntry.getValue().getFamily() ;
      byte[] qualifierBytes = mappingEntry.getValue().getQualifier() == null ? new byte[0] : mappingEntry.getValue().getQualifier() ;
      strBuilder.append(mappingEntry.getKey() + " -> " + new String(familyBytes, StandardCharsets.UTF_8) + ":" + new String(qualifierBytes, StandardCharsets.UTF_8)) ;
      strBuilder.append("\n");
    }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
    // hash key
    if (pKeySchema.getKeyType().equals(KeyType.HASH.toString())) {
      strBuilder.append("@DynamoDBHashKey(attributeName=\""
          + pKeySchema.getAttributeName() + "\") \n");
      strBuilder.append("    public " + attType + " getHashKey() {  return "
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("@DynamoDBHashKey(attributeName=\""
          + pKeySchema.getAttributeName() + "\") \n");
      strBuilder.append("    public " + attType + " getHashKey() {  return "
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setHashKey(" + attType + " ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("    public " + attType + " getHashKey() {  return "
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setHashKey(" + attType + " ");
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setHashKey(" + attType + " ");
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
      strBuilder.append(" = p" + camelCasify(pKeySchema.getAttributeName())
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
      strBuilder.append(" = p" + camelCasify(pKeySchema.getAttributeName())
      + "; }");
      line(pIden, strBuilder.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
    // range key
    if (pKeySchema.getKeyType().equals(KeyType.RANGE.toString())) {
      strBuilder.append("@DynamoDBRangeKey(attributeName=\""
          + pKeySchema.getAttributeName() + "\") \n");
      strBuilder.append("    public " + attType + " getRangeKey() { return "
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("@DynamoDBRangeKey(attributeName=\""
          + pKeySchema.getAttributeName() + "\") \n");
      strBuilder.append("    public " + attType + " getRangeKey() { return "
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setRangeKey(" + attType + " ");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("    public " + attType + " getRangeKey() { return "
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setRangeKey(" + attType + " ");
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
          + pKeySchema.getAttributeName() + "; } \n");
      strBuilder.append("    public void setRangeKey(" + attType + " ");
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
      strBuilder.append(" = p" + camelCasify(pKeySchema.getAttributeName())
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
      strBuilder.append("p" + camelCasify(pKeySchema.getAttributeName())
      + "){  this." + pKeySchema.getAttributeName());
      strBuilder.append(" = p" + camelCasify(pKeySchema.getAttributeName())
      + "; }");
      line(pIden, strBuilder.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
    attType = attType.equals("S") ? "String " : "double ";
    if (pKeySchema != null) {
      strBuilder.append("private " + attType);
      strBuilder.append(pKeySchema.getAttributeName() + ";");
      line(pIden, strBuilder.toString());
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/compiler/GoraDynamoDBCompiler.java`
#### Snippet
```java
    if (pKeySchema != null) {
      strBuilder.append("private " + attType);
      strBuilder.append(pKeySchema.getAttributeName() + ";");
      line(pIden, strBuilder.toString());
    }
```

## RuleId[id=IOResource]
### IOResource
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
    } else {
      if(out instanceof OutputStream) {
        ObjectOutput objOut = new ObjectOutputStream((OutputStream)out);
        objOut.writeObject(obj);
      }
```

### IOResource
'ObjectInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
    } else {
      if(in instanceof InputStream) {
        ObjectInput objIn = new ObjectInputStream((InputStream)in);
        Object obj = objIn.readObject();
        return obj;
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `autoCreateSchema` may be 'static'
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
  private volatile HBaseTableConnection table;

  private final boolean autoCreateSchema = true;

  private volatile HBaseMapping mapping;
```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
        fields.addAll(mapping.getLuceneFields());
        IndexSearcher searcher = selectResult.getSearcher();
        if (scoreDocs.length > 0) {
          for (ScoreDoc scoreDoc : scoreDocs) {
            Document doc = searcher.doc(scoreDoc.doc, fields);
```

### RedundantLengthCheck
Redundant array length check
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
  private boolean isPrimaryKeyIncluded(String[] fields) {
    HashSet<String> luceneFields = new HashSet<>();
    if (fields.length > 0) {
      for (String field : fields) {
        luceneFields.add(getMapping().getLuceneField(field));
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `IgniteBackendConstants` has only 'static' members, and lacks a 'private' constructor
in `gora-ignite/src/main/java/org/apache/gora/ignite/utils/IgniteBackendConstants.java`
#### Snippet
```java
 * Constants file for Ignite.
 */
public class IgniteBackendConstants {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `IgniteSQLBuilder` has only 'static' members, and lacks a 'private' constructor
in `gora-ignite/src/main/java/org/apache/gora/ignite/utils/IgniteSQLBuilder.java`
#### Snippet
```java
 * SQL Builder utility for Ignite.
 */
public class IgniteSQLBuilder {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `LogAnalyticsJet` has only 'static' members, and lacks a 'private' constructor
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsJet.java`
#### Snippet
```java
 * web site</a>for more information.</p>
 */
public class LogAnalyticsJet {

  private static DataStore<Long, Pageview> inStore;
```

### UtilityClassWithoutPrivateConstructor
Class `JCacheCacheFactoryBuilder` has only 'static' members, and lacks a 'private' constructor
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheFactoryBuilder.java`
#### Snippet
```java
 * builder that creates Factory instances which extends {@link javax.cache.configuration.Factory}
 */
public class JCacheCacheFactoryBuilder {

  public static <K, T extends PersistentBase> Factory<JCacheCacheLoader<K, T>>
```

### UtilityClassWithoutPrivateConstructor
Class `Null` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/Null.java`
#### Snippet
```java
 * Placeholder for Null type arguments
 */
public class Null {

  private static final Null INSTANCE = new Null();
```

### UtilityClassWithoutPrivateConstructor
Class `VersionInfo` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/VersionInfo.java`
#### Snippet
```java
 * information.
 */
public class VersionInfo {

  private static final Logger LOG = LoggerFactory.getLogger(VersionInfo.class);
```

### UtilityClassWithoutPrivateConstructor
Class `TimingUtil` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/TimingUtil.java`
#### Snippet
```java
import java.util.Locale;

public class TimingUtil {

    private static long[] TIME_FACTOR = { 60 * 60 * 1000, 60 * 1000, 1000 };
```

### UtilityClassWithoutPrivateConstructor
Class `AvroUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/AvroUtils.java`
#### Snippet
```java
 * An utility class for Avro related tasks.
 */
public class AvroUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/ReflectionUtils.java`
#### Snippet
```java
 * Utility methods related to reflection
 */
public class ReflectionUtils {

  public static Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/StringUtils.java`
#### Snippet
```java
 * An utility class for String related functionality.
 */
public class StringUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `ByteUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
 *
 */
public class ByteUtils {

  private static final Logger LOG = LoggerFactory.getLogger(ByteUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `IOUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/util/IOUtils.java`
#### Snippet
```java
 * An utility class for I/O related functionality.
 */
public class IOUtils {

  public static final int BUFFER_SIZE = 8192;
```

### UtilityClassWithoutPrivateConstructor
Class `GoraMapReduceUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraMapReduceUtils.java`
#### Snippet
```java
 * MapReduce related utilities for Gora
 */
public class GoraMapReduceUtils {

  public static class HelperInputFormat<K,V> extends FileInputFormat<K, V> {
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/encoders/Utils.java`
#### Snippet
```java
 * 
 */
public class Utils {
  private static BigInteger newPositiveBigInteger(byte[] er) {
    byte[] copy = new byte[er.length + 1];
```

### UtilityClassWithoutPrivateConstructor
Class `CassandraStoreParameters` has only 'static' members, and lacks a 'private' constructor
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStoreParameters.java`
#### Snippet
```java
 * Configuration Properties.
 */
public class CassandraStoreParameters {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `AerospikePolicyConst` has only 'static' members, and lacks a 'private' constructor
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikePolicyConst.java`
#### Snippet
```java
 * Class containing the configurable policy names
 */
public class AerospikePolicyConst {

  public static final String WRITE_POLICY_NAME = "write";
```

### UtilityClassWithoutPrivateConstructor
Class `GoraBenchmarkUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/GoraBenchmarkUtils.java`
#### Snippet
```java
 * Mapping File b. Avro Files c. Data Beans
 */
public class GoraBenchmarkUtils {

  private static final Logger LOG = LoggerFactory.getLogger(GoraBenchmarkUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CassandraQueryFactory` has only 'static' members, and lacks a 'private' constructor
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/CassandraQueryFactory.java`
#### Snippet
```java
 * This class is used create Cassandra Queries.
 */
class CassandraQueryFactory {

  private static final Logger LOG = LoggerFactory.getLogger(CassandraQueryFactory.class);
```

### UtilityClassWithoutPrivateConstructor
Class `AvroCassandraUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java
 * This class is Utils class for Avro serialization.
 */
class AvroCassandraUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `RackspaceOrchestration` has only 'static' members, and lacks a 'private' constructor
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
 *
 */
public class RackspaceOrchestration<K> {

  private static final Logger LOG = LoggerFactory.getLogger(RackspaceOrchestration.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ChefSoftwareProvisioning` has only 'static' members, and lacks a 'private' constructor
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
 *<code>gora.properties</code>.
 */
public class ChefSoftwareProvisioning {
  
  private static String CHEF_CLIENT = "chef.client";
```

### UtilityClassWithoutPrivateConstructor
Class `HBaseByteInterface` has only 'static' members, and lacks a 'private' constructor
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
 * Contains utility methods for byte[] {@literal <->} field conversions.
 */
public class HBaseByteInterface {
  /**
   * Threadlocals maintaining reusable binary decoders and encoders.
```

### UtilityClassWithoutPrivateConstructor
Class `GoraCompilerCLI` has only 'static' members, and lacks a 'private' constructor
in `gora-compiler-cli/src/main/java/org/apache/gora/compiler/cli/GoraCompilerCLI.java`
#### Snippet
```java


public class GoraCompilerCLI {

  private static final Logger LOG = LoggerFactory.getLogger(GoraCompilerCLI.class);
```

### UtilityClassWithoutPrivateConstructor
Class `PersistentUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-pig/src/main/java/org/apache/gora/pig/util/PersistentUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class PersistentUtils {

  public static final Logger LOG = LoggerFactory.getLogger(PersistentUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SchemaUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-pig/src/main/java/org/apache/gora/pig/util/SchemaUtils.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class SchemaUtils {

  public static final Logger LOG = LoggerFactory.getLogger(SchemaUtils.class);
```

### UtilityClassWithoutPrivateConstructor
Class `DynamoDBFactory` has only 'static' members, and lacks a 'private' constructor
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBFactory.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class DynamoDBFactory {

  /** Helper to write useful information into the logs. */
```

### UtilityClassWithoutPrivateConstructor
Class `DynamoDBUtils` has only 'static' members, and lacks a 'private' constructor
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
import com.amazonaws.services.dynamodbv2.model.TableStatus;

public class DynamoDBUtils {

  public enum DynamoDBType {
```

### UtilityClassWithoutPrivateConstructor
Class `ElasticsearchConstants` has only 'static' members, and lacks a 'private' constructor
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/utils/ElasticsearchConstants.java`
#### Snippet
```java
 * Constants file for Elasticsearch.
 */
public class ElasticsearchConstants {
  /**
   * Property indicating if the hadoop configuration has priority or not.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStoreMetadataAnalyzer.java`
#### Snippet
```java
        MongoStoreCollectionMetadata collectionMetadata = new MongoStoreCollectionMetadata();
        Document document = mongoDatabase.getCollection(tableName).find().first();
        collectionMetadata.getDocumentKeys().addAll(document.keySet());
        Collection<BsonValue> values = document.toBsonDocument(null, codecRegistry).values();
        collectionMetadata.getDocumentTypes()
```

### DataFlowIssue
Method invocation `readFields` may produce `NullPointerException`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/KeyValueWritable.java`
#### Snippet
```java
      
    }
    key.readFields(in);
    value.readFields(in);
  }
```

### DataFlowIssue
Method invocation `getKey` may produce `NullPointerException`
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsFlink.java`
#### Snippet
```java
      // create value for emitting tuple
      MetricDatum metricDatum = new MetricDatum();
      String dimension = currentKey.getKey().toString();
      long timestamp = currentKey.getValue().get();

```

### DataFlowIssue
Argument `keyl` might be null
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    String selectQuery = IgniteSQLBuilder.createSelectQueryExists(igniteMapping);
    try (PreparedStatement stmt = connection.prepareStatement(selectQuery)) {
      IgniteSQLBuilder.fillSelectQuery(stmt, igniteMapping, keyl);
      ResultSet rs = stmt.executeQuery();
      rs.next();
```

### DataFlowIssue
Argument `keyl` might be null
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    String selectQuery = IgniteSQLBuilder.createSelectQueryGet(igniteMapping, dbFields);
    try (PreparedStatement stmt = connection.prepareStatement(selectQuery)) {
      IgniteSQLBuilder.fillSelectQuery(stmt, igniteMapping, keyl);
      ResultSet rs = stmt.executeQuery();
      boolean data = rs.next();
```

### DataFlowIssue
Argument `keyArray` might be null
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
    }
    try (PreparedStatement stmt = connection.prepareStatement(deleteQuery)) {
      IgniteSQLBuilder.fillDeleteQuery(stmt, igniteMapping, keyArray);
      stmt.executeUpdate();
      return true;
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-ignite/src/main/java/org/apache/gora/ignite/store/IgniteStore.java`
#### Snippet
```java
      case DOUBLE:
      case BOOLEAN:
        output = fieldValue;
        break;
      case NULL:
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
      Document rec = easybson.getDBObject(docf);
      if (rec == null) {
        result = null;
        break;
      }
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
      break;
    case NULL:
      result = null;
      break;
    case UNION:
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
        ODocument record = obj.field(docf);
        if (record == null) {
          result = null;
          break;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
      case FIXED:
        if (obj.field(docf) == null) {
          result = null;
          break;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
        break;
      case NULL:
        result = null;
        break;
      case UNION:
```

### DataFlowIssue
Dereference of `result` may produce `NullPointerException`
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
          return 0;
        } else {
          for (ODocument doc : result) {
            for (String docField : query.getFields()) {
              if (doc.containsField(orientDBMapping.getDocumentField(docField))) {
```

### DataFlowIssue
Unboxing of `r.db(rethinkDBStoreParameters.getDatabaseName()) .table(rethinkDBMapping.getDocumentCl...` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
  public T get(K key, String[] fields) throws GoraException {
    try {
      boolean isExists = r.db(rethinkDBStoreParameters.getDatabaseName())
              .table(rethinkDBMapping.getDocumentClass())
              .getAll(key)
              .count()
              .run(connection, Boolean.class)
              .first();
      if (isExists) {
        String[] dbFields = getFieldsToQuery(fields);
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      ReqlExpr reqlExpr = dataStoreQuery.getRethinkDBDbQuery();
      MapObject<String, Object> document = reqlExpr.delete().run(connection, MapObject.class).first();
      int deleteCount = Integer.valueOf(document.get("deleted").toString());
      if (deleteCount > 0) {
        return deleteCount;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      MapObject<String, Object> document = reqlExpr.replace(row -> row.without(projection))
              .run(connection, MapObject.class).first();
      int replacedCount = Integer.valueOf(document.get("replaced").toString());
      if (replacedCount > 0) {
        return replacedCount;
```

### DataFlowIssue
Unboxing of `r.db(rethinkDBStoreParameters.getDatabaseName()) .table(rethinkDBMapping.getDocument...` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
    if (val.isDirty()) {
      try {
        boolean isExists = r.db(rethinkDBStoreParameters.getDatabaseName())
                .table(rethinkDBMapping.getDocumentClass())
                .getAll(key)
                .count()
                .run(connection, Boolean.class)
                .first();
        if (!isExists) {
          MapObject<String, Object> document = convertAvroBeanToRethinkDBDocument(key, val);
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
              .run(connection, ArrayList.class)
              .first()
              .stream()
              .anyMatch(db -> db.equals(databaseIdentifier))) {
        r.dbCreate(rethinkDBStoreParameters.getDatabaseName()).run(connection);
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
                decorateMapToODoc((Map<String, Object>) obj.get(docf));
        if (record == null) {
          result = null;
          break;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      case FIXED:
        if (!obj.containsKey(docf)) {
          result = null;
          break;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
        break;
      case NULL:
        result = null;
        break;
      case UNION:
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
              .tableList()
              .run(connection, ArrayList.class).first()
              .stream()
              .anyMatch(db -> db.equals(collectionIdentifier));
    } catch (Exception e) {
```

### DataFlowIssue
Unboxing of `r.db(rethinkDBStoreParameters.getDatabaseName()) .table(rethinkDBMapping.getDocumentClas...` may produce `NullPointerException`
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
  @Override
  public boolean exists(K key) throws GoraException {
    boolean isExists = r.db(rethinkDBStoreParameters.getDatabaseName())
            .table(rethinkDBMapping.getDocumentClass())
            .getAll(key)
            .count()
            .run(connection, Boolean.class)
            .first();
    return isExists;
  }
```

### DataFlowIssue
Condition `that instanceof SpecificRecord` is redundant and can be replaced with a null check
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
      if (that == obj1)
        return true; // identical object
      if (!(that instanceof SpecificRecord))
        return false; // not a record
      if (obj1.getClass() != that.getClass())
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
        }
      }
      key = (K) keyMethod.invoke(object);
    } catch (Exception e) {
      try {
```

### DataFlowIssue
Argument `keyField` might be null
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/NativeSerializer.java`
#### Snippet
```java
    } catch (Exception e) {
      try {
        key = (K) this.persistentClass.getField(keyField).get(object);
      } catch (Exception e1) {
        throw new RuntimeException("Field" + keyField + " is not accessible in " + persistentClass + " : " + e1.getMessage());
```

### DataFlowIssue
Method invocation `getMapping` may produce `NullPointerException`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java

  public Query toLuceneQuery() {
    LuceneMapping mapping = store.getMapping();
    String pk = mapping.getPrimaryKey();
    Query q;
```

### DataFlowIssue
Casting `lower` to `Integer` may produce `ClassCastException`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
    if (((lower != null && lower.getClass() == Integer.class)
            || (upper != null && upper.getClass() == Integer.class))) {
      int ilower = lower == null ? Integer.MIN_VALUE : (Integer) lower;
      int iupper = upper == null ? Integer.MAX_VALUE : (Integer) upper;
      return IntPoint.newRangeQuery(pk, ilower, iupper);
```

### DataFlowIssue
Casting `lower` to `Long` may produce `ClassCastException`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
    } else if (((lower != null && lower.getClass() == Long.class)
            || (upper != null && upper.getClass() == Long.class))) {
      long llower = lower == null ? Long.MIN_VALUE : (Long) lower;
      long lupper = upper == null ? Long.MAX_VALUE : (Long) upper;
      return LongPoint.newRangeQuery(pk, llower, lupper);
```

### DataFlowIssue
Casting `lower` to `Float` may produce `ClassCastException`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
    } else if (((lower != null && lower.getClass() == Float.class)
            || (upper != null && upper.getClass() == Float.class))) {
      float flower = lower == null ? Float.MIN_VALUE : (Float) lower;
      float fupper = upper == null ? Float.MAX_VALUE : (Float) upper;
      return FloatPoint.newRangeQuery(pk, flower, fupper);
```

### DataFlowIssue
Casting `lower` to `Double` may produce `ClassCastException`
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
    } else if (((lower != null && lower.getClass() == Double.class)
            || (upper != null && upper.getClass() == Double.class))) {
      double dlower = lower == null ? Double.MIN_VALUE : (Double) lower;
      double dupper = upper == null ? Double.MAX_VALUE : (Double) upper;
      return DoublePoint.newRangeQuery(pk, dlower, dupper);
```

### DataFlowIssue
Method invocation `newPersistent` may produce `NullPointerException`
in `gora-goraci/src/main/java/org/apache/gora/goraci/Generator.java`
#### Snippet
```java
          if (concurrent) {
          // keep track of whats flushed in another table, verify can use this info to run concurrently
            Flushed flushed = flushedTable.newPersistent();
            flushed.setCount(count);
            flushedTable.put(id, flushed);
```

### DataFlowIssue
Method invocation `close` may produce `NullPointerException`
in `gora-goraci/src/main/java/org/apache/gora/goraci/Generator.java`
#### Snippet
```java
      store.close();
      if (concurrent)
        flushedTable.close();
      
    }
```

### DataFlowIssue
Method invocation `iterator` may produce `NullPointerException`
in `gora-goraci/src/main/java/org/apache/gora/goraci/chef/ChefSoftwareProvisioning.java`
#### Snippet
```java
      runlist = new RunListBuilder().addRecipe(recipe).build();
    }
    for (Iterator<String> iterator = runlist.iterator(); iterator.hasNext();) {
      String string = (String) iterator.next();
      LOG.info(string);
```

### DataFlowIssue
Argument `inputFiles` might be null
in `gora-compiler-cli/src/main/java/org/apache/gora/compiler/cli/GoraCompilerCLI.java`
#### Snippet
```java
    }
    try {
      GoraCompiler.compileSchema(inputFiles, outputDir, licenseHeader);
      LOG.info("Compiler executed SUCCESSFULL.");
    } catch (IOException e) {
```

### DataFlowIssue
Method invocation `setDataStore` may produce `NullPointerException`
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
      // not reachable.
    }
    query.setDataStore(this.getDataStore());
    query.setFilter(this.getFilter());
    query.setFields(this.getFields());
```

### DataFlowIssue
Condition `mfilter.getMapKey() instanceof Utf8` is redundant and can be replaced with a null check
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
    if (filter instanceof  MapFieldValueFilter){
      MapFieldValueFilter mfilter = (MapFieldValueFilter) filter;
      if (!(mfilter.getMapKey() instanceof Utf8))
        throw new IllegalAccessError("Invalid map key, must be a string.");
      if (mfilter.getOperands().size()>1)
```

### DataFlowIssue
Variable is already assigned to this value
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
      case DOUBLE:
      case BOOLEAN:
        output = fieldValue;
        break;
      case NULL:
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStoreMetadataAnalyzer.java`
#### Snippet
```java
            Admin hbaseAdmin = this.hbaseConnection.getAdmin();
            TableName[] tableNames = hbaseAdmin.listTableNames();
            List<String> names = Arrays.stream(tableNames).map(tableNameInfo -> tableNameInfo.getNameAsString()).collect(Collectors.toList()) ;
            hbaseAdmin.close();
            return names;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStoreMetadataAnalyzer.java`
#### Snippet
```java
            TableDescriptor tableDescriptor = hbaseAdmin.getDescriptor(hbaseTableName);
            HBaseTableMetadata tableMetadata = new HBaseTableMetadata() ;
            tableMetadata.getColumnFamilies().addAll(Arrays.stream(tableDescriptor.getColumnFamilies()).map(hcolumn -> hcolumn.getNameAsString()).collect(Collectors.toList())) ;
            hbaseAdmin.close();
            return tableMetadata;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-pig/src/main/java/org/apache/gora/pig/StorageConfiguration.java`
#### Snippet
```java
   */
  public void mergeConfiguration(Configuration hadoopConfiguration) {
    this.configuration.forEach((key,value) -> hadoopConfiguration.setIfUnset(key, value));
  }
  
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-kudu/src/main/java/org/apache/gora/kudu/store/KuduStore.java`
#### Snippet
```java
  private SpecificDatumWriter getDatumWriter(Schema fieldSchema) {
    SpecificDatumWriter writer = writerMap.computeIfAbsent(fieldSchema, (t) -> {
      return new SpecificDatumWriter(t);// ignore dirty bits
    });
    return writer;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
        List<?> rawdataList = (List<?>) fieldValue;
        rawdataList.stream().map((lsValue) -> serializeFieldValue(fieldSchema.getElementType(), lsValue)).forEachOrdered((lsValue_) -> {
          serializedList.add(lsValue_);
        });
        break;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
          RMapAsync<Object, Object> map = batchInstance.getMap(generateKeyHash(key));
          dbFields.forEach((field) -> {
            map.removeAsync(field);
          });
        } else {
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getFieldsCount()` during object construction
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java

  public PersistentBase() {
    __g__dirty = java.nio.ByteBuffer.wrap(new byte[getFieldsCount()]);
  }

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
    try {
      clazz = ClassLoadingUtils.loadClass(fieldSchema.getFullName());
    } catch (ClassNotFoundException e) {
    }
    PersistentBase record = (PersistentBase) new BeanFactoryImpl(keyClass, clazz).newPersistent();
```

### CatchMayIgnoreException
Empty `catch` block
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBUtils.java`
#### Snippet
```java
      try {
        Thread.sleep(SLEEP_TIME);
      } catch (Exception e) {
      }
      try {
```

### CatchMayIgnoreException
Empty `catch` block
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
      try {
        Thread.sleep(SLEEP_DELETE_TIME);
      } catch (Exception e) {
      }
      try {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
      return before - after;
    } catch (IOException e) {
      LOG.error("Unable to deleteByQuery: {}", query.toString(), e);
    }
    return 0;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
      return true;
    } catch (IOException e) {
      LOG.error("Unable to delete key: {}", key.toString(), e);
    }
    return false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/query/DynamoDBKey.java`
#### Snippet
```java
    StringBuilder sb = new StringBuilder();
    sb.append('[').append(hashKey != null? hashKey.toString():":");
    sb.append(rangeKey != null? ":" + rangeKey.toString():"");
    sb.append(']');
    return sb.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
      InfinispanResult<K,T> result = null;
      result = new InfinispanResult<>(this, (InfinispanQuery<K,T>)query);
      LOG.trace("query: " + query.toString());
      LOG.trace("result size: " + result.size());
      return result;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
    try {
      ((InfinispanQuery<K, T>) query).build();
      LOG.debug("deleteByQuery("+query.toString()+")");
      InfinispanQuery<K, T> q = (InfinispanQuery) query;
      q.build();
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'ConcurrentHashMap\>' may not contain keys of type 'String'
in `gora-hbase/src/main/java/org/apache/gora/hbase/util/HBaseByteInterface.java`
#### Snippet
```java
    case MAP:
    case RECORD:
      SpecificDatumWriter writer = writerMap.get(schema.getFullName());
      if (writer == null) {
        writer = new SpecificDatumWriter(schema);// ignore dirty bits
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
      mapping = readMapping(mappingFile);

      if (mapping.encoder == null || "".equals(mapping.encoder)) {
        encoder = new BinaryEncoder();
      } else {
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
            String family = fieldElement.getAttribute("family");
            String qualifier = fieldElement.getAttribute("qualifier");
            if ("".equals(qualifier))
              qualifier = null;

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
    isAscendant = in.readBoolean();
    String locationString = WritableUtils.readString(in);
    if (!locationString.equals(""))
      location = new InetSocketAddress(
          locationString.split(ADDR_DELIMITATOR)[0],
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java

    qb.orderBy(
        (getSortingField().equals("")) ? getPrimaryFieldName() : getSortingField(),
            isAscendant ? SortOrder.ASC : SortOrder.DESC);

```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
    }
    LOG.info("Using Solr server at " + SolrClientUrl);
    String solrJServerType = ((solrJServerImpl == null || solrJServerImpl.equals("")) ? "http" : solrJServerImpl);
    // HttpSolrClient - denoted by "http" in properties
    if (solrJServerType.toLowerCase(Locale.getDefault()).equals("http")) {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java

      if (orientDbStoreParams.getConnectionPoolSize() != null) {
        int connPoolSize = Integer.valueOf(orientDbStoreParams.getConnectionPoolSize());
        connectionPool = new OPartitionedDatabasePoolFactory(connPoolSize)
                .get(ROOT_DATABASE_URL, orientDbStoreParams.getUserName(),
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java

    if (((properties.getProperty(JCACHE_AUTO_CREATE_CACHE_PROPERTY_KEY) != null) &&
            Boolean.valueOf(properties.getProperty(JCACHE_AUTO_CREATE_CACHE_PROPERTY_KEY)))
            || ((manager.getCache(super.getPersistentClass().getSimpleName(), keyClass, persistentClass) == null))) {
      cacheEntryList = new ConcurrentSkipListSet<>();
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      mutableCacheConfig.setTypes(keyClass, persistentClass);
      if (properties.getProperty(JCACHE_READ_THROUGH_PROPERTY_KEY) != null) {
        mutableCacheConfig.setReadThrough(Boolean.valueOf(properties.getProperty(JCACHE_READ_THROUGH_PROPERTY_KEY)));
      } else {
        mutableCacheConfig.setReadThrough(true);
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      }
      if (properties.getProperty(JCACHE_WRITE_THROUGH_PROPERTY_KEY) != null) {
        mutableCacheConfig.setWriteThrough(Boolean.valueOf(properties.getProperty(JCACHE_WRITE_THROUGH_PROPERTY_KEY)));
      } else {
        mutableCacheConfig.setWriteThrough(true);
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      }
      if (properties.getProperty(JCACHE_STORE_BY_VALUE_PROPERTY_KEY) != null) {
        mutableCacheConfig.setStoreByValue(Boolean.valueOf(properties.getProperty(JCACHE_STORE_BY_VALUE_PROPERTY_KEY)));
      }
      if (properties.getProperty(JCACHE_STATISTICS_PROPERTY_KEY) != null) {
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      }
      if (properties.getProperty(JCACHE_STATISTICS_PROPERTY_KEY) != null) {
        mutableCacheConfig.setStatisticsEnabled(Boolean.valueOf(properties.getProperty(JCACHE_STATISTICS_PROPERTY_KEY)));
      }
      if (properties.getProperty(JCACHE_MANAGEMENT_PROPERTY_KEY) != null) {
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
      }
      if (properties.getProperty(JCACHE_MANAGEMENT_PROPERTY_KEY) != null) {
        mutableCacheConfig.setStatisticsEnabled(Boolean.valueOf(properties.getProperty(JCACHE_MANAGEMENT_PROPERTY_KEY)));
      }
      if (properties.getProperty(JCACHE_EXPIRE_POLICY_PROPERTY_KEY) != null) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
          mutableCacheConfig.setExpiryPolicyFactory(FactoryBuilder.factoryOf(
                  new AccessedExpiryPolicy(new Duration(TimeUnit.SECONDS,
                          Integer.valueOf(properties.getProperty(JCACHE_EXPIRE_POLICY_DURATION_PROPERTY_KEY))))
          ));
        } else if (expiryPolicyIdentifier.equals(JCACHE_CREATED_EXPIRY_IDENTIFIER)) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
          mutableCacheConfig.setExpiryPolicyFactory(FactoryBuilder.factoryOf(
                  new CreatedExpiryPolicy(new Duration(TimeUnit.SECONDS,
                          Integer.valueOf(properties.getProperty(JCACHE_EXPIRE_POLICY_DURATION_PROPERTY_KEY))))
          ));
        } else if (expiryPolicyIdentifier.equals(JCACHE_MODIFIED_EXPIRY_IDENTIFIER)) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
          mutableCacheConfig.setExpiryPolicyFactory(FactoryBuilder.factoryOf(
                  new ModifiedExpiryPolicy(new Duration(TimeUnit.SECONDS,
                          Integer.valueOf(properties.getProperty(JCACHE_EXPIRE_POLICY_DURATION_PROPERTY_KEY))))
          ));
        } else if (expiryPolicyIdentifier.equals(JCACHE_TOUCHED_EXPIRY_IDENTIFIER)) {
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
          mutableCacheConfig.setExpiryPolicyFactory(FactoryBuilder.factoryOf(
                  new TouchedExpiryPolicy(new Duration(TimeUnit.SECONDS,
                          Integer.valueOf(properties.getProperty(JCACHE_EXPIRE_POLICY_DURATION_PROPERTY_KEY))))
          ));
        }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      ReqlExpr reqlExpr = dataStoreQuery.getRethinkDBDbQuery();
      MapObject<String, Object> document = reqlExpr.delete().run(connection, MapObject.class).first();
      int deleteCount = Integer.valueOf(document.get("deleted").toString());
      if (deleteCount > 0) {
        return deleteCount;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/store/RethinkDBStore.java`
#### Snippet
```java
      MapObject<String, Object> document = reqlExpr.replace(row -> row.without(projection))
              .run(connection, MapObject.class).first();
      int replacedCount = Integer.valueOf(document.get("replaced").toString());
      if (replacedCount > 0) {
        return replacedCount;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeMappingBuilder.java`
#### Snippet
```java
    }
    try {
      maxRetriesInt = Integer.valueOf(retiesCount);
    } catch (NumberFormatException e) {
      LOG.warn("Invalid timeout value provided, using the default timeout value");
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeMappingBuilder.java`
#### Snippet
```java
    int timeDurationInt = 0;
    try {
      timeDurationInt = Integer.valueOf(timeDuration);
    } catch (NumberFormatException e) {
      LOG.warn("Invalid time duration value provided, using the default time duration value");
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    try {
      String xsdval = properties.getProperty(XSD_VALIDATION, "false");
      mapping = readMapping(mappingFile, Boolean.valueOf(xsdval));
    } catch (IOException ioe) {
      LOG.error(ioe.getMessage(), ioe);
```

### UnnecessaryBoxing
Unnecessary boxing
in `gora-pig/src/main/java/org/apache/gora/pig/util/PersistentUtils.java`
#### Snippet
```java
      case NULL:    return null ;
      case BOOLEAN: return (Boolean)data ; 
      case ENUM:    return new Integer(((Enum<?>)data).ordinal()) ;
      case BYTES:   return new DataByteArray(((ByteBuffer)data).array()) ;
      case STRING:  return data.toString() ;
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
    try {
      this.setScannerCaching(
          Integer.valueOf(DataStoreFactory.findProperty(this.properties, this,
              SCANNER_CACHING_PROPERTIES_KEY,
              String.valueOf(SCANNER_CACHING_PROPERTIES_DEFAULT)))) ;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java

    try{
      boolean autoflush = Boolean.valueOf(DataStoreFactory.findProperty(this.properties, this,
              HBASE_CLIENT_AUTO_FLUSH_PROPERTIES_KEY,
              String.valueOf(HBASE_CLIENT_AUTO_FLUSH_PROPERTIES_DEFAULT)));
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/query/InfinispanQuery.java`
#### Snippet
```java
      location = new InetSocketAddress(
          locationString.split(ADDR_DELIMITATOR)[0],
          Integer.valueOf(locationString.split(ADDR_DELIMITATOR)[1]));
  }

```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `isClosed`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
      }
    }
    synchronized (isClosed) {
      if ((jdbcDataContext == null || connectionClosed) && !isClosed) {
        jdbcDataContext = (JdbcDataContext) jdbcDataContextFactory
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `isClosed`
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
   */
  public void close() {
    synchronized (isClosed) {
      if (!isClosed) {
        for (JdbcDataContext jdbcDataContext : dataContextPool) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.mongodb.store` is unnecessary and can be removed
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java
/**
 * A builder for creating the mapper. This will allow building a thread safe
 * {@link org.apache.gora.mongodb.store.MongoMapping} using simple immutabilty.
 */
public class MongoMappingBuilder<K, T extends PersistentBase> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.mongodb.store` is unnecessary and can be removed
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java

  /**
   * Load the {@link org.apache.gora.mongodb.store.MongoMapping} from an input stream
   * passed in parameter.
   * 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoMappingBuilder.java`
#### Snippet
```java
   * @param is
   *          input stream holding the mapping
   * @throws java.io.IOException
   */
  protected void fromInputStream(InputStream is) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.mongodb.filters` is unnecessary and can be removed
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/filters/BaseFactory.java`
#### Snippet
```java
/**
 * Base implementation of a
 * {@link org.apache.gora.mongodb.filters.FilterFactory} which just manage back
 * reference to {@link MongoFilterUtil}.
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `com.orientechnologies.orient.core.record.impl` is unnecessary and can be removed
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBMapping.java`
#### Snippet
```java

  /**
   * Register mapping {@link com.orientechnologies.orient.core.record.impl.ODocument}
   * field name to it s data type {@link OType}
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Clears the value of the 'metricDimension' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearMetricDimension() {
      metricDimension = null;
      fieldSetFlags()[0] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing MetricDatum instance */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing MetricDatum instance */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  /** Creates a new MetricDatum RecordBuilder by copying an existing MetricDatum instance */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * Gets the value of the 'metric' field.
   */
  public java.lang.Long getMetric() {
    return metric;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  }

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     * Gets the value of the 'metric' field.
         */
    public java.lang.Long getMetric() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         */
    public java.lang.Long getMetric() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Gets the value of the 'metric' field */
    public java.lang.Long getMetric() {
      return metric;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing MetricDatum instance */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
            super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
      if (isValidValue(fields()[0], other.metricDimension)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    /** Creates a Builder by copying an existing MetricDatum instance */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum other) {
            super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
      if (isValidValue(fields()[0], other.metricDimension)) {
        this.metricDimension = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.metricDimension);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
            super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
      if (isValidValue(fields()[0], other.metricDimension)) {
        this.metricDimension = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.metricDimension);
        fieldSetFlags()[0] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[2], other.metric)) {
        this.metric = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.metric);
        fieldSetFlags()[2] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setMetricDimension(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public void setMetricDimension(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
      try {
        MetricDatum record = new MetricDatum();
        record.metricDimension = fieldSetFlags()[0] ? this.metricDimension : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.metric = fieldSetFlags()[2] ? this.metric : (java.lang.Long) defaultValue(fields()[2]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
        MetricDatum record = new MetricDatum();
        record.metricDimension = fieldSetFlags()[0] ? this.metricDimension : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.metric = fieldSetFlags()[2] ? this.metric : (java.lang.Long) defaultValue(fields()[2]);
        return record;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
        record.metricDimension = fieldSetFlags()[0] ? this.metricDimension : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.metric = fieldSetFlags()[2] ? this.metric : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public boolean isMetricDimensionDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setTimestamp(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public void setTimestamp(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public boolean isMetricDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public boolean isTimestampDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Clears the value of the 'metric' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearMetric() {
      fieldSetFlags()[2] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  @Override
  public org.apache.gora.tutorial.log.generated.MetricDatum clone() {
    return newBuilder(this).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    implements org.apache.avro.data.RecordBuilder<MetricDatum> {

    private java.lang.CharSequence metricDimension;
    private long timestamp;
    private long metric;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
    setDirty(1);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this.metricDimension;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    case 1: return this.timestamp;
    case 2: return this.metric;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
      super(other);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setMetricDimension(java.lang.CharSequence value) {
    this.metricDimension = value;
    setDirty(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   */
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.metricDimension = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.metricDimension = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.metric = (java.lang.Long)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    switch (field$) {
    case 0: this.metricDimension = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.metric = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    case 0: this.metricDimension = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.metric = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.metric = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  }

  private java.lang.CharSequence metricDimension;
  private long timestamp;
  private long metric;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   */
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * RecordBuilder for MetricDatum instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MetricDatum>
    implements org.apache.avro.data.RecordBuilder<MetricDatum> {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.data` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MetricDatum>
    implements org.apache.avro.data.RecordBuilder<MetricDatum> {

    private java.lang.CharSequence metricDimension;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Clears the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java

    /** Gets the value of the 'metricDimension' field */
    public java.lang.CharSequence getMetricDimension() {
      return metricDimension;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.tutorial.log.generated.MetricDatum.SCHEMA$);
    }
    
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  
  /** Creates a new MetricDatum RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  /** Creates a new MetricDatum RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java

public class MetricDatum extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetricDatum\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"metricDimension\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"metric\",\"type\":\"long\",\"default\":0}],\"default\":null}");
  private static final long serialVersionUID = 8278557845311856507L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setMetric(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     */
    public void setMetric(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Sets the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     * Gets the value of the 'timestamp' field.
         */
    public java.lang.Long getTimestamp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         */
    public java.lang.Long getTimestamp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private long timestamp;
  private long metric;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
     * Gets the value of the 'metricDimension' field.
         */
    public java.lang.CharSequence getMetricDimension() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getMetricDimension() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java

  /** Creates a new MetricDatum RecordBuilder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder() {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  /** Creates a new MetricDatum RecordBuilder */
  public static org.apache.gora.tutorial.log.generated.MetricDatum.Builder newBuilder() {
    return new org.apache.gora.tutorial.log.generated.MetricDatum.Builder();
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Sets the value of the 'metric' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setMetric(long value) {
      validate(fields()[2], value);
      this.metric = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * Gets the value of the 'metricDimension' field.
   */
  public java.lang.CharSequence getMetricDimension() {
    return metricDimension;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Sets the value of the 'metricDimension' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setMetricDimension(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.metricDimension = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Sets the value of the 'metricDimension' field */
    public org.apache.gora.tutorial.log.generated.MetricDatum.Builder setMetricDimension(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.metricDimension = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setMetric(java.lang.Long value) {
    this.metric = value;
    setDirty(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.query` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheQuery.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.query.JCacheQuery} is the primary class
 * responsible for representing a cache manipulation query.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setTimestamp(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setTimestamp(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `com.mongodb.client` is unnecessary, and can be replaced with an import
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
   * MongoDB client
   */
  private static ConcurrentHashMap<String, com.mongodb.client.MongoClient> mapsOfClients = new ConcurrentHashMap<>();

  private MongoDatabase mongoClientDB;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.mongodb.client` is unnecessary, and can be replaced with an import
in `gora-mongodb/src/main/java/org/apache/gora/mongodb/store/MongoStore.java`
#### Snippet
```java
   * @return a {@link com.mongodb.client.MongoClient} instance connected to the server
   */
  public static com.mongodb.client.MongoClient getClient(MongoStoreParameters params) {

    // Utf8 serialization!
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Pageview instance */
    private Builder(org.apache.gora.tutorial.log.generated.Pageview other) {
            super(org.apache.gora.tutorial.log.generated.Pageview.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    /** Creates a Builder by copying an existing Pageview instance */
    private Builder(org.apache.gora.tutorial.log.generated.Pageview other) {
            super(org.apache.gora.tutorial.log.generated.Pageview.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.url);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
            super(org.apache.gora.tutorial.log.generated.Pageview.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[2], other.ip)) {
        this.ip = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.ip);
        fieldSetFlags()[2] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[3], other.httpMethod)) {
        this.httpMethod = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.httpMethod);
        fieldSetFlags()[3] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[4], other.httpStatusCode)) {
        this.httpStatusCode = (java.lang.Integer) data().deepCopy(fields()[4].schema(), other.httpStatusCode);
        fieldSetFlags()[4] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[5], other.responseSize)) {
        this.responseSize = (java.lang.Integer) data().deepCopy(fields()[5].schema(), other.responseSize);
        fieldSetFlags()[5] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[6], other.referrer)) {
        this.referrer = (java.lang.CharSequence) data().deepCopy(fields()[6].schema(), other.referrer);
        fieldSetFlags()[6] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[7], other.userAgent)) {
        this.userAgent = (java.lang.CharSequence) data().deepCopy(fields()[7].schema(), other.userAgent);
        fieldSetFlags()[7] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  /** Creates a new Pageview RecordBuilder by copying an existing Pageview instance */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  /** Creates a new Pageview RecordBuilder by copying an existing Pageview instance */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  /** Creates a new Pageview RecordBuilder by copying an existing Pageview instance */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setHttpMethod(java.lang.CharSequence value) {
    this.httpMethod = value;
    setDirty(3);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'responseSize' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearResponseSize() {
      fieldSetFlags()[5] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   */
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isHttpStatusCodeDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'timestamp' field.
         */
    public java.lang.Long getTimestamp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.Long getTimestamp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'userAgent' field.
   */
  public java.lang.CharSequence getUserAgent() {
    return userAgent;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setResponseSize(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setResponseSize(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.url = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.url = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.ip = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    switch (field$) {
    case 0: this.url = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.ip = (java.lang.CharSequence)(value); break;
    case 3: this.httpMethod = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 0: this.url = (java.lang.CharSequence)(value); break;
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.ip = (java.lang.CharSequence)(value); break;
    case 3: this.httpMethod = (java.lang.CharSequence)(value); break;
    case 4: this.httpStatusCode = (java.lang.Integer)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 1: this.timestamp = (java.lang.Long)(value); break;
    case 2: this.ip = (java.lang.CharSequence)(value); break;
    case 3: this.httpMethod = (java.lang.CharSequence)(value); break;
    case 4: this.httpStatusCode = (java.lang.Integer)(value); break;
    case 5: this.responseSize = (java.lang.Integer)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 2: this.ip = (java.lang.CharSequence)(value); break;
    case 3: this.httpMethod = (java.lang.CharSequence)(value); break;
    case 4: this.httpStatusCode = (java.lang.Integer)(value); break;
    case 5: this.responseSize = (java.lang.Integer)(value); break;
    case 6: this.referrer = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 3: this.httpMethod = (java.lang.CharSequence)(value); break;
    case 4: this.httpStatusCode = (java.lang.Integer)(value); break;
    case 5: this.responseSize = (java.lang.Integer)(value); break;
    case 6: this.referrer = (java.lang.CharSequence)(value); break;
    case 7: this.userAgent = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 4: this.httpStatusCode = (java.lang.Integer)(value); break;
    case 5: this.responseSize = (java.lang.Integer)(value); break;
    case 6: this.referrer = (java.lang.CharSequence)(value); break;
    case 7: this.userAgent = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 5: this.responseSize = (java.lang.Integer)(value); break;
    case 6: this.referrer = (java.lang.CharSequence)(value); break;
    case 7: this.userAgent = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 6: this.referrer = (java.lang.CharSequence)(value); break;
    case 7: this.userAgent = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isTimestampDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isReferrerDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setHttpStatusCode(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setHttpStatusCode(java.lang.Integer value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'referrer' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearReferrer() {
      referrer = null;
      fieldSetFlags()[6] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
    setDirty(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'ip' field.
         */
    public java.lang.CharSequence getIp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getIp() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'userAgent' field */
    public java.lang.CharSequence getUserAgent() {
      return userAgent;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'ip' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setIp(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ip = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'ip' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setIp(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ip = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'referrer' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setReferrer(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.referrer = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'referrer' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setReferrer(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.referrer = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setHttpStatusCode(java.lang.Integer value) {
    this.httpStatusCode = value;
    setDirty(4);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'url' field.
         */
    public java.lang.CharSequence getUrl() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getUrl() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'httpStatusCode' field */
    public java.lang.Integer getHttpStatusCode() {
      return httpStatusCode;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setReferrer(java.lang.CharSequence value) {
    this.referrer = value;
    setDirty(6);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'httpStatusCode' field.
         */
    public java.lang.Integer getHttpStatusCode() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.Integer getHttpStatusCode() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    private long timestamp;
    private java.lang.CharSequence ip;
    private java.lang.CharSequence httpMethod;
    private int httpStatusCode;
    private int responseSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isIpDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setUserAgent(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setUserAgent(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'referrer' field.
   */
  public java.lang.CharSequence getReferrer() {
    return referrer;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private int responseSize;
  private java.lang.CharSequence referrer;
  private java.lang.CharSequence userAgent;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isHttpMethodDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'httpMethod' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setHttpMethod(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.httpMethod = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'httpMethod' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setHttpMethod(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.httpMethod = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'responseSize' field.
   */
  public java.lang.Integer getResponseSize() {
    return responseSize;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.tutorial.log.generated.Pageview.Builder other) {
      super(other);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isUrlDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.tutorial.log.generated.Pageview.SCHEMA$);
    }
    
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private long timestamp;
  private java.lang.CharSequence ip;
  private java.lang.CharSequence httpMethod;
  private int httpStatusCode;
  private int responseSize;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  }

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setResponseSize(java.lang.Integer value) {
    this.responseSize = value;
    setDirty(5);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'ip' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearIp() {
      ip = null;
      fieldSetFlags()[2] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'httpStatusCode' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearHttpStatusCode() {
      fieldSetFlags()[4] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'ip' field.
   */
  public java.lang.CharSequence getIp() {
    return ip;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    private int httpStatusCode;
    private int responseSize;
    private java.lang.CharSequence referrer;
    private java.lang.CharSequence userAgent;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'referrer' field */
    public java.lang.CharSequence getReferrer() {
      return referrer;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'responseSize' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setResponseSize(int value) {
      validate(fields()[5], value);
      this.responseSize = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'ip' field */
    public java.lang.CharSequence getIp() {
      return ip;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setUserAgent(java.lang.CharSequence value) {
    this.userAgent = value;
    setDirty(7);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'httpMethod' field.
         */
    public java.lang.CharSequence getHttpMethod() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getHttpMethod() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  @Override
  public org.apache.gora.tutorial.log.generated.Pageview clone() {
    return newBuilder(this).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'userAgent' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setUserAgent(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.userAgent = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'userAgent' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setUserAgent(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.userAgent = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'referrer' field.
         */
    public java.lang.CharSequence getReferrer() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getReferrer() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setHttpMethod(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setHttpMethod(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'userAgent' field.
         */
    public java.lang.CharSequence getUserAgent() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getUserAgent() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'httpMethod' field */
    public java.lang.CharSequence getHttpMethod() {
      return httpMethod;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setIp(java.lang.CharSequence value) {
    this.ip = value;
    setDirty(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isResponseSizeDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * RecordBuilder for Pageview instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pageview>
    implements org.apache.avro.data.RecordBuilder<Pageview> {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.data` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pageview>
    implements org.apache.avro.data.RecordBuilder<Pageview> {

    private java.lang.CharSequence url;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setUrl(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setUrl(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private java.lang.CharSequence referrer;
  private java.lang.CharSequence userAgent;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'url' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.url = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'url' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.url = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    implements org.apache.avro.data.RecordBuilder<Pageview> {

    private java.lang.CharSequence url;
    private long timestamp;
    private java.lang.CharSequence ip;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private int httpStatusCode;
  private int responseSize;
  private java.lang.CharSequence referrer;
  private java.lang.CharSequence userAgent;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setIp(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setIp(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'url' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    private java.lang.CharSequence url;
    private long timestamp;
    private java.lang.CharSequence ip;
    private java.lang.CharSequence httpMethod;
    private int httpStatusCode;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     * Gets the value of the 'responseSize' field.
         */
    public java.lang.Integer getResponseSize() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         */
    public java.lang.Integer getResponseSize() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    private int responseSize;
    private java.lang.CharSequence referrer;
    private java.lang.CharSequence userAgent;

    /** Creates a new Builder */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
    setDirty(1);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setReferrer(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public void setReferrer(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  /** Creates a new Pageview RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview.Builder other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  
  /** Creates a new Pageview RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview.Builder other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  /** Creates a new Pageview RecordBuilder by copying an existing Builder */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder(org.apache.gora.tutorial.log.generated.Pageview.Builder other) {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
     */
    public boolean isUserAgentDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'httpStatusCode' field.
   */
  public java.lang.Integer getHttpStatusCode() {
    return httpStatusCode;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
      try {
        Pageview record = new Pageview();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[2]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        Pageview record = new Pageview();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.httpMethod = fieldSetFlags()[3] ? this.httpMethod : (java.lang.CharSequence) defaultValue(fields()[3]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.httpMethod = fieldSetFlags()[3] ? this.httpMethod : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.httpStatusCode = fieldSetFlags()[4] ? this.httpStatusCode : (java.lang.Integer) defaultValue(fields()[4]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.httpMethod = fieldSetFlags()[3] ? this.httpMethod : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.httpStatusCode = fieldSetFlags()[4] ? this.httpStatusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.responseSize = fieldSetFlags()[5] ? this.responseSize : (java.lang.Integer) defaultValue(fields()[5]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.httpMethod = fieldSetFlags()[3] ? this.httpMethod : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.httpStatusCode = fieldSetFlags()[4] ? this.httpStatusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.responseSize = fieldSetFlags()[5] ? this.responseSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.referrer = fieldSetFlags()[6] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[6]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.httpMethod = fieldSetFlags()[3] ? this.httpMethod : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.httpStatusCode = fieldSetFlags()[4] ? this.httpStatusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.responseSize = fieldSetFlags()[5] ? this.responseSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.referrer = fieldSetFlags()[6] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.userAgent = fieldSetFlags()[7] ? this.userAgent : (java.lang.CharSequence) defaultValue(fields()[7]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.httpStatusCode = fieldSetFlags()[4] ? this.httpStatusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.responseSize = fieldSetFlags()[5] ? this.responseSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.referrer = fieldSetFlags()[6] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.userAgent = fieldSetFlags()[7] ? this.userAgent : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        record.responseSize = fieldSetFlags()[5] ? this.responseSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.referrer = fieldSetFlags()[6] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.userAgent = fieldSetFlags()[7] ? this.userAgent : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   * Gets the value of the 'httpMethod' field.
   */
  public java.lang.CharSequence getHttpMethod() {
    return httpMethod;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this.url;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    case 6: return this.referrer;
    case 7: return this.userAgent;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Sets the value of the 'httpStatusCode' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder setHttpStatusCode(int value) {
      validate(fields()[4], value);
      this.httpStatusCode = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'httpMethod' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearHttpMethod() {
      httpMethod = null;
      fieldSetFlags()[3] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'userAgent' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearUserAgent() {
      userAgent = null;
      fieldSetFlags()[7] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Clears the value of the 'timestamp' field */
    public org.apache.gora.tutorial.log.generated.Pageview.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
   */
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java

  /** Creates a new Pageview RecordBuilder */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder() {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.tutorial.log.generated` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  /** Creates a new Pageview RecordBuilder */
  public static org.apache.gora.tutorial.log.generated.Pageview.Builder newBuilder() {
    return new org.apache.gora.tutorial.log.generated.Pageview.Builder();
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  }

  private java.lang.CharSequence url;
  private long timestamp;
  private java.lang.CharSequence ip;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Gets the value of the 'responseSize' field */
    public java.lang.Integer getResponseSize() {
      return responseSize;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary, and can be replaced with an import
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
package org.apache.gora.tutorial.log.generated;  

public class Pageview extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pageview\",\"namespace\":\"org.apache.gora.tutorial.log.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ip\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpMethod\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"httpStatusCode\",\"type\":\"int\",\"default\":0},{\"name\":\"responseSize\",\"type\":\"int\",\"default\":0},{\"name\":\"referrer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",\"string\"],\"default\":null}],\"default\":null}");
  private static final long serialVersionUID = -6136058768384995982L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
  private java.lang.CharSequence url;
  private long timestamp;
  private java.lang.CharSequence ip;
  private java.lang.CharSequence httpMethod;
  private int httpStatusCode;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheEntryListenerFactory.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheEntryListenerFactory} is the primary class
 * responsible for creating cache entry listeners which listens on {@link javax.cache.event.CacheEntryEvent}
 * cache entry events EG:- Creation, Removal, etc of keys on caches and trigger actions as specified.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriter.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheWriter} is the primary class
 * responsible for writing data beans to persistency dataStore from in memory cache.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheEntryListener.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheEntryListener} is the primary class
 * responsible for listening on {@link javax.cache.event.CacheEntryEvent} cache entry events
 * EG:- Creation, Removal, Expiry etc of entries on caches and trigger actions as specified.
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.cache.event` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheEntryListener.java`
#### Snippet
```java
/**
 * {@link org.apache.gora.jcache.store.JCacheCacheEntryListener} is the primary class
 * responsible for listening on {@link javax.cache.event.CacheEntryEvent} cache entry events
 * EG:- Creation, Removal, Expiry etc of entries on caches and trigger actions as specified.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.rethinkdb.net` is unnecessary, and can be replaced with an import
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/query/RethinkDBResult.java`
#### Snippet
```java
  public RethinkDBResult(DataStore<K, T> dataStore,
                         Query<K, T> query,
                         com.rethinkdb.net.Result<MapObject> resultSet) {
    super(dataStore, query);
    this.resultSet = resultSet;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.rethinkdb.net` is unnecessary, and can be replaced with an import
in `gora-rethinkdb/src/main/java/org/apache/gora/rethinkdb/query/RethinkDBResult.java`
#### Snippet
```java
public class RethinkDBResult<K, T extends PersistentBase> extends ResultBase<K, T> {

  private com.rethinkdb.net.Result<MapObject> resultSet;
  private int size;
  private Iterator<MapObject> resultSetIterator;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheFactoryBuilder.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheFactoryBuilder} is a Generic Factory
 * builder that creates Factory instances which extends {@link javax.cache.configuration.Factory}
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.cache.configuration` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheFactoryBuilder.java`
#### Snippet
```java
/**
 * {@link org.apache.gora.jcache.store.JCacheCacheFactoryBuilder} is a Generic Factory
 * builder that creates Factory instances which extends {@link javax.cache.configuration.Factory}
 */
public class JCacheCacheFactoryBuilder {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoaderFactory.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheLoaderFactory} is the primary class
 * responsible for creating cache loader {@link javax.cache.integration.CacheLoader} instances which itself
 * loads data beans from persistency dataStore to in memory cache.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheLoader.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheLoader} is the primary class
 * responsible for loading data beans from persistency dataStore to in memory cache.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheCacheWriterFactory.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheCacheWriterFactory} is the primary class
 * responsible for creating cache writer {@link javax.cache.integration.CacheWriter} instances which itself
 * writes data beans to persistency dataStore from in memory cache.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.query` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.query.JCacheResult} is the primary class
 * responsible for representing result set of a cache manipulation query
 * {@link org.apache.gora.jcache.query.JCacheQuery}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.query` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/query/JCacheResult.java`
#### Snippet
```java
 * {@link org.apache.gora.jcache.query.JCacheResult} is the primary class
 * responsible for representing result set of a cache manipulation query
 * {@link org.apache.gora.jcache.query.JCacheQuery}
 */
public class JCacheResult<K, T extends PersistentBase> extends ResultBase<K, T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.orientdb.store` is unnecessary and can be removed
in `gora-orientdb/src/main/java/org/apache/gora/orientdb/store/OrientDBStore.java`
#### Snippet
```java
/**
 * {@inheritDoc}
 * {@link org.apache.gora.orientdb.store.OrientDBStore} is the primary class
 * responsible for facilitating GORA CRUD operations on OrientDB documents.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.filter` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/query/Query.java`
#### Snippet
```java
   * (for efficiency reasons) and therefore disable the local filter.
   *
   * @param enable true to enable local {@link org.apache.gora.filter.Filter}
   */
  void setLocalFilterEnabled(boolean enable);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.jcache.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.jcache.store.JCacheStore} is the primary class
 * responsible for GORA CRUD operations on Hazelcast Caches. This class can be think
 * of as caching layer that can is wrapped over any persistency dataStore implementations
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-jcache/src/main/java/org/apache/gora/jcache/store/JCacheStore.java`
#### Snippet
```java
 * responsible for GORA CRUD operations on Hazelcast Caches. This class can be think
 * of as caching layer that can is wrapped over any persistency dataStore implementations
 * which extends {@link org.apache.gora.store.DataStore}.  This class delegates
 * most operations to it s persistency dataStore. Hazelcast cache implementation is based on
 * JCache JSR 107 specification.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/util/ByteUtils.java`
#### Snippet
```java
   * @param buffer Binary input array.
   * @param offset Offset into array at which vint begins.
   * @throws java.io.IOException when read error occurs while extracting data from input stream.
   * @return deserialized long from stream.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.conf` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @param job the job to set the properties for
   * @param dataStore the datastore as the output
   * @return a populated output {@link org.apache.hadoop.conf.Configuration} 
   */
    public <K, V extends Persistent> Configuration generateOutputConf(Job job,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.conf` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   *
   * @param dataStore the datastore as the output
   * @return a populated output {@link org.apache.hadoop.conf.Configuration} 
   * @throws IOException if there is an error creating the configuration
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.hadoop.conf` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/spark/GoraSparkEngine.java`
#### Snippet
```java
   * @param keyClass        output key class
   * @param persistentClass output value class
   * @return a populated output {@link org.apache.hadoop.conf.Configuration} 
   */
    @SuppressWarnings("rawtypes")
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
  /** 
   * Opens an OutputStream for the output Hadoop path
   * @return an open {@link java.io.OutputStream}
   */
  protected OutputStream createOutputStream() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query.impl` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
   * Executes a PartitialQuery, reading the data between start and end.
   *
   * @param query the {@link org.apache.gora.query.impl.FileSplitPartitionQuery} to execute
   * @return a {@link org.apache.gora.query.Result}
   * @throws IOException if there is an error during query exeuction
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
   *
   * @param query the {@link org.apache.gora.query.impl.FileSplitPartitionQuery} to execute
   * @return a {@link org.apache.gora.query.Result}
   * @throws IOException if there is an error during query exeuction
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
  /** 
   * Opens an InputStream for the input Hadoop path
   * @return an open {@link java.io.InputStream}
   * @throws IOException if there is an error obtaining the FileSystem or/from 
   * the path
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
   * for non-PartitionQuery's.
   *
   * @param query the {@link org.apache.gora.query.Query} to execute
   * @return a {@link org.apache.gora.query.Result}
   * @throws IOException if there is an error during query exeuction
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/impl/FileBackedDataStoreBase.java`
#### Snippet
```java
   *
   * @param query the {@link org.apache.gora.query.Query} to execute
   * @return a {@link org.apache.gora.query.Result}
   * @throws IOException if there is an error during query exeuction
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraInputFormat.java`
#### Snippet
```java
   * @param query        the query to get the inputs from
   * @param reuseObjects whether to reuse objects in serialization
   * @param <K1> key class for {@link org.apache.gora.query.Query}
   * @param <V1> object value key class for {@link org.apache.gora.query.Query}
   * @throws IOException if there is an error configuring the input parameters for the job
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraInputFormat.java`
#### Snippet
```java
   * @param reuseObjects whether to reuse objects in serialization
   * @param <K1> key class for {@link org.apache.gora.query.Query}
   * @param <V1> object value key class for {@link org.apache.gora.query.Query}
   * @throws IOException if there is an error configuring the input parameters for the job
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraInputFormat.java`
#### Snippet
```java
   * @param inValueClass   Map input value class
   * @param reuseObjects   whether to reuse objects in serialization
   * @param <K1> key class for {@link org.apache.gora.query.Query}
   * @param <V1> object value key class for {@link org.apache.gora.query.Query}
   * @throws IOException if there is an error configuring the input parameters for the job
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.query` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraInputFormat.java`
#### Snippet
```java
   * @param reuseObjects   whether to reuse objects in serialization
   * @param <K1> key class for {@link org.apache.gora.query.Query}
   * @param <V1> object value key class for {@link org.apache.gora.query.Query}
   * @throws IOException if there is an error configuring the input parameters for the job
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraOutputFormat.java`
#### Snippet
```java
   * @param persistentClass output value class
   * @param reuseObjects    whether to reuse objects in serialization
   * @param <K> key class for the {@link org.apache.gora.store.DataStore}
   * @param <V> value class for the {@link org.apache.gora.store.DataStore}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraOutputFormat.java`
#### Snippet
```java
   * @param reuseObjects    whether to reuse objects in serialization
   * @param <K> key class for the {@link org.apache.gora.store.DataStore}
   * @param <V> value class for the {@link org.apache.gora.store.DataStore}
   */
  @SuppressWarnings("rawtypes")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraOutputFormat.java`
#### Snippet
```java
   * @param dataStore    the datastore as the output
   * @param reuseObjects whether to reuse objects in serialization
   * @param <K> key class for the {@link org.apache.gora.store.DataStore}
   * @param <V> value class for the {@link org.apache.gora.store.DataStore}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/mapreduce/GoraOutputFormat.java`
#### Snippet
```java
   * @param reuseObjects whether to reuse objects in serialization
   * @param <K> key class for the {@link org.apache.gora.store.DataStore}
   * @param <V> value class for the {@link org.apache.gora.store.DataStore}
   */
  public static <K, V extends Persistent> void setOutput(Job job,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-core/src/main/java/org/apache/gora/mapreduce/PersistentDeserializer.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[persistent.getFieldsCount()];
    decoder.readFixed(__g__dirty);
    persistent.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    return persistent;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
  /**
   * Gets a specific field from the fields map
   * @return a specific {@link java.lang.String} field
   */
  public String getField(int index) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
  /**
   * Gets fields using a specific class
   * @return a {@link java.util.Map} of fields to their own classes
   */
  public String[] getFields() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
  /**
   * Gets a field index based on the field name
   * @return a specific {@link java.lang.String} field
   */
  public int getFieldIndex(String field) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/memory/store/MemStore.java`
#### Snippet
```java
  /**
   * As MemStore is basically an implementation of
   * {@link java.util.concurrent.ConcurrentSkipListMap}
   * it has no concept of a schema.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/util/FixedByteArrayOutputStream.java`
#### Snippet
```java

/**
 * It is a implementation of {@link java.io.OutputStream} must always provide at least a method that writes one byte of output.
 */
public class FixedByteArrayOutputStream extends OutputStream {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java

  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty;

  public PersistentBase() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * Setter method for assign dirty bytes when deserializing AVRO bean from dirty bytes
   * preserved in serialized bytes form.
   * Since {@link org.apache.gora.persistency.impl.PersistentBase} implements {@link java.io.Externalizable}
   * and when actual deserialization happens for {@link org.apache.gora.persistency.impl.PersistentBase}
   * new instance, acquire byte stream from TCP wire, extracting specific byte[] from byte stream
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * preserved in serialized bytes form.
   * Since {@link org.apache.gora.persistency.impl.PersistentBase} implements {@link java.io.Externalizable}
   * and when actual deserialization happens for {@link org.apache.gora.persistency.impl.PersistentBase}
   * new instance, acquire byte stream from TCP wire, extracting specific byte[] from byte stream
   * and create {@link java.nio.ByteBuffer} instance and set using this public method.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * and when actual deserialization happens for {@link org.apache.gora.persistency.impl.PersistentBase}
   * new instance, acquire byte stream from TCP wire, extracting specific byte[] from byte stream
   * and create {@link java.nio.ByteBuffer} instance and set using this public method.
   * See {@link java.io.Externalizable#readExternal(ObjectInput)} abstract method implementation
   * on velocity template record.vm.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java

  public PersistentBase() {
    __g__dirty = java.nio.ByteBuffer.wrap(new byte[getFieldsCount()]);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * Exposing dirty bytes over public method. Purpose is to preserve dirty bytes content
   * while transporting AVRO data beans over TCP wire in serialized form.
   * Since {@link org.apache.gora.persistency.impl.PersistentBase} implements {@link java.io.Externalizable},
   * this method can be used to retrieve the dirty bytes as {@link java.nio.ByteBuffer} and and get the content
   * as bytes[] and write byte stream to the TCP wire.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * while transporting AVRO data beans over TCP wire in serialized form.
   * Since {@link org.apache.gora.persistency.impl.PersistentBase} implements {@link java.io.Externalizable},
   * this method can be used to retrieve the dirty bytes as {@link java.nio.ByteBuffer} and and get the content
   * as bytes[] and write byte stream to the TCP wire.
   * See {@link java.io.Externalizable#writeExternal(ObjectOutput)} abstract method implementation
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/PersistentBase.java`
#### Snippet
```java
   * on velocity template record.vm.
   * <p>
   * Note {@link java.nio.ByteBuffer} is not itself not in serializable form.
   *
   * @return __g__dirty dirty bytes
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary, and can be replaced with an import
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSDataStoreFactory.java`
#### Snippet
```java
    Class<?> clazz = store.getClass();
    while(true) {
      String fullKey = GORA + "." + org.apache.gora.util.StringUtils.getClassname(clazz) + "." + baseKey;
      String value = getProperty(properties, fullKey);
      if(value != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary, and can be replaced with an import
in `gora-core/src/main/java/org/apache/gora/store/ws/impl/WSDataStoreFactory.java`
#### Snippet
```java
  private static<D extends DataStore<K,T>, K, T extends Persistent>
  void setProperty(Properties properties, Class<D> dataStoreClass, String baseKey, String value) {
    properties.setProperty(GORA+"."+org.apache.gora.util.StringUtils.getClassname(dataStoreClass)+"."+baseKey, value);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java
        new Function<Entry<K, V>, DirtyEntryWrapper<K, V>>() {
          @Override
          public DirtyEntryWrapper<K, V> apply(java.util.Map.Entry<K, V> input) {
            return new DirtyEntryWrapper<>(input, dirtyFlag);
          }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public Set<java.util.Map.Entry<K, V>> entrySet() {
    Collection<DirtyEntryWrapper<K, V>> dirtyEntrySet = Collections2.transform(
        delegate.entrySet(),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
   *
   * @param properties Properties which hold keys from which we can obtain values for datastore mappings.
   * @param store Data store {@link org.apache.gora.store.DataStore} object to get default schema name.
   */
  public static String getDefaultSchemaName(Properties properties, DataStore<?,?> store) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary, and can be replaced with an import
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
  private static<D extends DataStore<K,T>, K, T extends Persistent>
  void setProperty(Properties properties, Class<D> dataStoreClass, String baseKey, String value) {
    properties.setProperty(GORA+"."+org.apache.gora.util.StringUtils.getClassname(dataStoreClass)+"."+baseKey, value);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
   * <code>gora.&lt;classname&gt;.mapping.file=</code>.
   * @param properties which hold keys from which we can obtain values for datastore mappings.
   * @param store {@link org.apache.gora.store.DataStore} object to get the mapping for.
   * @param defaultValue default value for the <code>gora-&lt;classname&gt;-mapping.xml</code>
   * @return mappingFilename if one is located.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary, and can be replaced with an import
in `gora-core/src/main/java/org/apache/gora/store/DataStoreFactory.java`
#### Snippet
```java
    Class<?> clazz = store.getClass();
    while(true) {
      String fullKey = GORA + "." + org.apache.gora.util.StringUtils.getClassname(clazz).toLowerCase(Locale.getDefault()) + "." + baseKey;
      String value = getProperty(properties, fullKey);
      if(value != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.cassandra.store` is unnecessary and can be removed
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraMappingBuilder.java`
#### Snippet
```java
/**
 * This Class reads the Cassandra Mapping file and create tha Cassandra Mapping object.
 * {@link org.apache.gora.cassandra.store.CassandraMapping}
 */
public class CassandraMappingBuilder<K, T extends Persistent> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary and can be removed
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/store/CassandraStore.java`
#### Snippet
```java
   *
   * @param persistentClass class of persistent objects
   *                        {@link  org.apache.gora.persistency.Persistent}
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.lucene.search` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneQuery.java`
#### Snippet
```java
/**
 * LuceneQuery hold in memory Gora representation for
 * {@link org.apache.lucene.search.Query}
 */
public class LuceneQuery<K, T extends PersistentBase> extends QueryBase<K, T> {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.lucene.query` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/query/LuceneResult.java`
#### Snippet
```java

/**
 * LuceneResult hold in memory result set once the query {@link org.apache.gora.lucene.query.LuceneQuery}
 * is executed.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/Verify.java`
#### Snippet
```java

/**
 * A Map Reduce job that verifies that the linked list generated by {@link org.apache.gora.goraci.Generator} do not have any holes.
 */
public class Verify extends Configured implements Tool {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.util` is unnecessary and can be removed
in `gora-aerospike/src/main/java/org/apache/gora/aerospike/store/AerospikeStore.java`
#### Snippet
```java

      case STRING:
        if (binValue instanceof org.apache.avro.util.Utf8)
          result = binValue;
        else
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   * Gets the value of the 'count' field.
   */
  public java.lang.Long getCount() {
    return count;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.goraci.generated.Flushed.SCHEMA$);
    }
    
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   */
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    
    /** Clears the value of the 'count' field */
    public org.apache.gora.goraci.generated.Flushed.Builder clearCount() {
      fieldSetFlags()[0] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

    /** Gets the value of the 'count' field */
    public java.lang.Long getCount() {
      return count;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.count = (java.lang.Long)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.count = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    switch (field$) {
    case 0: this.count = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

  private long count;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
      try {
        Flushed record = new Flushed();
        record.count = fieldSetFlags()[0] ? this.count : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

  /** Creates a new Flushed RecordBuilder */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder() {
    return new org.apache.gora.goraci.generated.Flushed.Builder();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  /** Creates a new Flushed RecordBuilder */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder() {
    return new org.apache.gora.goraci.generated.Flushed.Builder();
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this.count;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    switch (field$) {
    case 0: return this.count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   */
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setCount(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
     */
    public void setCount(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Flushed instance */
    private Builder(org.apache.gora.goraci.generated.Flushed other) {
            super(org.apache.gora.goraci.generated.Flushed.SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    /** Creates a Builder by copying an existing Flushed instance */
    private Builder(org.apache.gora.goraci.generated.Flushed other) {
            super(org.apache.gora.goraci.generated.Flushed.SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.count);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
            super(org.apache.gora.goraci.generated.Flushed.SCHEMA$);
      if (isValidValue(fields()[0], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.count);
        fieldSetFlags()[0] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   * RecordBuilder for Flushed instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Flushed>
    implements org.apache.avro.data.RecordBuilder<Flushed> {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.data` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Flushed>
    implements org.apache.avro.data.RecordBuilder<Flushed> {

    private long count;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.goraci.generated.Flushed.Builder other) {
      super(other);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setCount(java.lang.Long value) {
    this.count = value;
    setDirty(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    
    /** Sets the value of the 'count' field */
    public org.apache.gora.goraci.generated.Flushed.Builder setCount(long value) {
      validate(fields()[0], value);
      this.count = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  /** Creates a new Flushed RecordBuilder by copying an existing Flushed instance */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  /** Creates a new Flushed RecordBuilder by copying an existing Flushed instance */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  /** Creates a new Flushed RecordBuilder by copying an existing Flushed instance */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

public class Flushed extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flushed\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = -8888031915401438521L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  @Override
  public org.apache.gora.goraci.generated.Flushed clone() {
    return newBuilder(this).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  /** Creates a new Flushed RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed.Builder other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  
  /** Creates a new Flushed RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed.Builder other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  /** Creates a new Flushed RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.Flushed.Builder newBuilder(org.apache.gora.goraci.generated.Flushed.Builder other) {
    return new org.apache.gora.goraci.generated.Flushed.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
  }

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
     */
    public boolean isCountDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
     * Gets the value of the 'count' field.
         */
    public java.lang.Long getCount() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
         */
    public java.lang.Long getCount() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary, and can be replaced with an import
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java

      case ENUM:
        result = org.apache.gora.util.AvroUtils.getEnumValue(schema, (String) value);
        break;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.util` is unnecessary and can be removed
in `gora-cassandra/src/main/java/org/apache/gora/cassandra/serializers/AvroCassandraUtils.java`
#### Snippet
```java

      case STRING:
        if (value instanceof org.apache.avro.util.Utf8) {
          result = value;
        } else if (ByteBuffer.class.isAssignableFrom(value.getClass())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  }

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  @Override
  public org.apache.gora.goraci.generated.CINode clone() {
    return newBuilder(this).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.prev = (java.lang.Long)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.prev = (java.lang.Long)(value); break;
    case 1: this.client = (java.lang.CharSequence)(value); break;
    case 2: this.count = (java.lang.Long)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    switch (field$) {
    case 0: this.prev = (java.lang.Long)(value); break;
    case 1: this.client = (java.lang.CharSequence)(value); break;
    case 2: this.count = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    case 0: this.prev = (java.lang.Long)(value); break;
    case 1: this.client = (java.lang.CharSequence)(value); break;
    case 2: this.count = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    case 1: this.client = (java.lang.CharSequence)(value); break;
    case 2: this.count = (java.lang.Long)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Gets the value of the 'count' field */
    public java.lang.Long getCount() {
      return count;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.goraci.generated.CINode.Builder other) {
      super(other);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.goraci.generated.CINode.SCHEMA$);
    }
    
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this.prev;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    case 1: return this.client;
    case 2: return this.count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     * Gets the value of the 'client' field.
         */
    public java.lang.CharSequence getClient() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getClient() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Gets the value of the 'client' field */
    public java.lang.CharSequence getClient() {
      return client;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

    private long prev;
    private java.lang.CharSequence client;
    private long count;

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  /** Creates a new CINode RecordBuilder by copying an existing CINode instance */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  /** Creates a new CINode RecordBuilder by copying an existing CINode instance */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  /** Creates a new CINode RecordBuilder by copying an existing CINode instance */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private java.lang.CharSequence client;
  private long count;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

    /** Gets the value of the 'prev' field */
    public java.lang.Long getPrev() {
      return prev;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Clears the value of the 'count' field */
    public org.apache.gora.goraci.generated.CINode.Builder clearCount() {
      fieldSetFlags()[2] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setPrev(java.lang.Long value) {
    this.prev = value;
    setDirty(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Sets the value of the 'client' field */
    public org.apache.gora.goraci.generated.CINode.Builder setClient(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.client = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Sets the value of the 'client' field */
    public org.apache.gora.goraci.generated.CINode.Builder setClient(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.client = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  /** Creates a new CINode RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode.Builder other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  /** Creates a new CINode RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode.Builder other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  /** Creates a new CINode RecordBuilder by copying an existing Builder */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder(org.apache.gora.goraci.generated.CINode.Builder other) {
    return new org.apache.gora.goraci.generated.CINode.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * Gets the value of the 'count' field.
   */
  public java.lang.Long getCount() {
    return count;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public boolean isCountDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   */
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
  /** Enum containing all data bean's fields. */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public boolean isPrevDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     * Gets the value of the 'prev' field.
         */
    public java.lang.Long getPrev() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         */
    public java.lang.Long getPrev() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
package org.apache.gora.goraci.generated;  

public class CINode extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CINode\",\"namespace\":\"org.apache.gora.goraci.generated\",\"fields\":[{\"name\":\"prev\",\"type\":\"long\",\"default\":0},{\"name\":\"client\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"count\",\"type\":\"long\",\"default\":0}]}");
  private static final long serialVersionUID = 1014651356631895518L;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

  private long prev;
  private java.lang.CharSequence client;
  private long count;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
      try {
        CINode record = new CINode();
        record.prev = fieldSetFlags()[0] ? this.prev : (java.lang.Long) defaultValue(fields()[0]);
        record.client = fieldSetFlags()[1] ? this.client : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.count = fieldSetFlags()[2] ? this.count : (java.lang.Long) defaultValue(fields()[2]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
        CINode record = new CINode();
        record.prev = fieldSetFlags()[0] ? this.prev : (java.lang.Long) defaultValue(fields()[0]);
        record.client = fieldSetFlags()[1] ? this.client : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.count = fieldSetFlags()[2] ? this.count : (java.lang.Long) defaultValue(fields()[2]);
        return record;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
        record.prev = fieldSetFlags()[0] ? this.prev : (java.lang.Long) defaultValue(fields()[0]);
        record.client = fieldSetFlags()[1] ? this.client : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.count = fieldSetFlags()[2] ? this.count : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setCount(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public void setCount(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public boolean isClientDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * Gets the value of the 'prev' field.
   */
  public java.lang.Long getPrev() {
    return prev;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Sets the value of the 'prev' field */
    public org.apache.gora.goraci.generated.CINode.Builder setPrev(long value) {
      validate(fields()[0], value);
      this.prev = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Clears the value of the 'client' field */
    public org.apache.gora.goraci.generated.CINode.Builder clearClient() {
      client = null;
      fieldSetFlags()[1] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setClient(java.lang.CharSequence value) {
    this.client = value;
    setDirty(1);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setPrev(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public void setPrev(java.lang.Long value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setClient(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     */
    public void setClient(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * RecordBuilder for CINode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CINode>
    implements org.apache.avro.data.RecordBuilder<CINode> {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.data` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CINode>
    implements org.apache.avro.data.RecordBuilder<CINode> {

    private long prev;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * Gets the value of the 'client' field.
   */
  public java.lang.CharSequence getClient() {
    return client;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
     * Gets the value of the 'count' field.
         */
    public java.lang.Long getCount() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
         */
    public java.lang.Long getCount() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Sets the value of the 'count' field */
    public org.apache.gora.goraci.generated.CINode.Builder setCount(long value) {
      validate(fields()[2], value);
      this.count = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Clears the value of the 'prev' field */
    public org.apache.gora.goraci.generated.CINode.Builder clearPrev() {
      fieldSetFlags()[0] = false;
      return this;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java

  /** Creates a new CINode RecordBuilder */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder() {
    return new org.apache.gora.goraci.generated.CINode.Builder();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  /** Creates a new CINode RecordBuilder */
  public static org.apache.gora.goraci.generated.CINode.Builder newBuilder() {
    return new org.apache.gora.goraci.generated.CINode.Builder();
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing CINode instance */
    private Builder(org.apache.gora.goraci.generated.CINode other) {
            super(org.apache.gora.goraci.generated.CINode.SCHEMA$);
      if (isValidValue(fields()[0], other.prev)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.goraci.generated` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    /** Creates a Builder by copying an existing CINode instance */
    private Builder(org.apache.gora.goraci.generated.CINode other) {
            super(org.apache.gora.goraci.generated.CINode.SCHEMA$);
      if (isValidValue(fields()[0], other.prev)) {
        this.prev = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.prev);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
            super(org.apache.gora.goraci.generated.CINode.SCHEMA$);
      if (isValidValue(fields()[0], other.prev)) {
        this.prev = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.prev);
        fieldSetFlags()[0] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[1], other.client)) {
        this.client = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.client);
        fieldSetFlags()[1] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[2], other.count)) {
        this.count = (java.lang.Long) data().deepCopy(fields()[2].schema(), other.count);
        fieldSetFlags()[2] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setCount(java.lang.Long value) {
    this.count = value;
    setDirty(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
   */
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField8Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField5(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField5(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField15Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence userId;
    private java.lang.CharSequence field0;
    private java.lang.CharSequence field1;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField12(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField12(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField4(java.lang.CharSequence value) {
    this.field4 = value;
    setDirty(5);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field8;
  private java.lang.CharSequence field9;
  private java.lang.CharSequence field10;
  private java.lang.CharSequence field11;
  private java.lang.CharSequence field12;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence userId;
  private java.lang.CharSequence field0;
  private java.lang.CharSequence field1;
  private java.lang.CharSequence field2;
  private java.lang.CharSequence field3;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field0;
  private java.lang.CharSequence field1;
  private java.lang.CharSequence field2;
  private java.lang.CharSequence field3;
  private java.lang.CharSequence field4;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field12' field.
         */
    public java.lang.CharSequence getField12() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField12() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field0' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField0() {
      field0 = null;
      fieldSetFlags()[1] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField18(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField18(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field12' field */
    public java.lang.CharSequence getField12() {
      return field12;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField10(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField10(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField8(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField8(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field11' field.
         */
    public java.lang.CharSequence getField11() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField11() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field9;
  private java.lang.CharSequence field10;
  private java.lang.CharSequence field11;
  private java.lang.CharSequence field12;
  private java.lang.CharSequence field13;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this.userId;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 19: return this.field18;
    case 20: return this.field19;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'userId' field */
    public org.apache.gora.benchmark.generated.User.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[0] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field7;
    private java.lang.CharSequence field8;
    private java.lang.CharSequence field9;
    private java.lang.CharSequence field10;
    private java.lang.CharSequence field11;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field5;
  private java.lang.CharSequence field6;
  private java.lang.CharSequence field7;
  private java.lang.CharSequence field8;
  private java.lang.CharSequence field9;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField18Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'userId' field.
   */
  public java.lang.CharSequence getUserId() {
    return userId;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField19(java.lang.CharSequence value) {
    this.field19 = value;
    setDirty(20);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field2' field */
    public java.lang.CharSequence getField2() {
      return field2;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field7' field */
    public java.lang.CharSequence getField7() {
      return field7;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field2;
    private java.lang.CharSequence field3;
    private java.lang.CharSequence field4;
    private java.lang.CharSequence field5;
    private java.lang.CharSequence field6;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField2(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField2(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field1' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField1() {
      field1 = null;
      fieldSetFlags()[2] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field5;
    private java.lang.CharSequence field6;
    private java.lang.CharSequence field7;
    private java.lang.CharSequence field8;
    private java.lang.CharSequence field9;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.data` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence userId;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field17' field */
    public java.lang.CharSequence getField17() {
      return field17;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField15(java.lang.CharSequence value) {
    this.field15 = value;
    setDirty(16);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field10' field.
   */
  public java.lang.CharSequence getField10() {
    return field10;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField7(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField7(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  }

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField18(java.lang.CharSequence value) {
    this.field18 = value;
    setDirty(19);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  }

  private java.lang.CharSequence userId;
  private java.lang.CharSequence field0;
  private java.lang.CharSequence field1;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field19' field.
   */
  public java.lang.CharSequence getField19() {
    return field19;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field6;
  private java.lang.CharSequence field7;
  private java.lang.CharSequence field8;
  private java.lang.CharSequence field9;
  private java.lang.CharSequence field10;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'userId' field */
    public org.apache.gora.benchmark.generated.User.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userId = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'userId' field */
    public org.apache.gora.benchmark.generated.User.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userId = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field1;
    private java.lang.CharSequence field2;
    private java.lang.CharSequence field3;
    private java.lang.CharSequence field4;
    private java.lang.CharSequence field5;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field10;
  private java.lang.CharSequence field11;
  private java.lang.CharSequence field12;
  private java.lang.CharSequence field13;
  private java.lang.CharSequence field14;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field16' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField16() {
      field16 = null;
      fieldSetFlags()[17] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field6' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField6() {
      field6 = null;
      fieldSetFlags()[7] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field1;
  private java.lang.CharSequence field2;
  private java.lang.CharSequence field3;
  private java.lang.CharSequence field4;
  private java.lang.CharSequence field5;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field16' field */
    public org.apache.gora.benchmark.generated.User.Builder setField16(java.lang.CharSequence value) {
      validate(fields()[17], value);
      this.field16 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field16' field */
    public org.apache.gora.benchmark.generated.User.Builder setField16(java.lang.CharSequence value) {
      validate(fields()[17], value);
      this.field16 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field1' field */
    public java.lang.CharSequence getField1() {
      return field1;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      try {
        User record = new User();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.field0 = fieldSetFlags()[1] ? this.field0 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.field1 = fieldSetFlags()[2] ? this.field1 : (java.lang.CharSequence) defaultValue(fields()[2]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        User record = new User();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.field0 = fieldSetFlags()[1] ? this.field0 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.field1 = fieldSetFlags()[2] ? this.field1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.field2 = fieldSetFlags()[3] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[3]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.field0 = fieldSetFlags()[1] ? this.field0 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.field1 = fieldSetFlags()[2] ? this.field1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.field2 = fieldSetFlags()[3] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.CharSequence) defaultValue(fields()[4]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field0 = fieldSetFlags()[1] ? this.field0 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.field1 = fieldSetFlags()[2] ? this.field1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.field2 = fieldSetFlags()[3] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.field4 = fieldSetFlags()[5] ? this.field4 : (java.lang.CharSequence) defaultValue(fields()[5]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field1 = fieldSetFlags()[2] ? this.field1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.field2 = fieldSetFlags()[3] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.field4 = fieldSetFlags()[5] ? this.field4 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.field5 = fieldSetFlags()[6] ? this.field5 : (java.lang.CharSequence) defaultValue(fields()[6]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field2 = fieldSetFlags()[3] ? this.field2 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.field4 = fieldSetFlags()[5] ? this.field4 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.field5 = fieldSetFlags()[6] ? this.field5 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.field6 = fieldSetFlags()[7] ? this.field6 : (java.lang.CharSequence) defaultValue(fields()[7]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field3 = fieldSetFlags()[4] ? this.field3 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.field4 = fieldSetFlags()[5] ? this.field4 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.field5 = fieldSetFlags()[6] ? this.field5 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.field6 = fieldSetFlags()[7] ? this.field6 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.field7 = fieldSetFlags()[8] ? this.field7 : (java.lang.CharSequence) defaultValue(fields()[8]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field4 = fieldSetFlags()[5] ? this.field4 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.field5 = fieldSetFlags()[6] ? this.field5 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.field6 = fieldSetFlags()[7] ? this.field6 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.field7 = fieldSetFlags()[8] ? this.field7 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.field8 = fieldSetFlags()[9] ? this.field8 : (java.lang.CharSequence) defaultValue(fields()[9]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field5 = fieldSetFlags()[6] ? this.field5 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.field6 = fieldSetFlags()[7] ? this.field6 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.field7 = fieldSetFlags()[8] ? this.field7 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.field8 = fieldSetFlags()[9] ? this.field8 : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.field9 = fieldSetFlags()[10] ? this.field9 : (java.lang.CharSequence) defaultValue(fields()[10]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field6 = fieldSetFlags()[7] ? this.field6 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.field7 = fieldSetFlags()[8] ? this.field7 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.field8 = fieldSetFlags()[9] ? this.field8 : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.field9 = fieldSetFlags()[10] ? this.field9 : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.field10 = fieldSetFlags()[11] ? this.field10 : (java.lang.CharSequence) defaultValue(fields()[11]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field7 = fieldSetFlags()[8] ? this.field7 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.field8 = fieldSetFlags()[9] ? this.field8 : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.field9 = fieldSetFlags()[10] ? this.field9 : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.field10 = fieldSetFlags()[11] ? this.field10 : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.field11 = fieldSetFlags()[12] ? this.field11 : (java.lang.CharSequence) defaultValue(fields()[12]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field8 = fieldSetFlags()[9] ? this.field8 : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.field9 = fieldSetFlags()[10] ? this.field9 : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.field10 = fieldSetFlags()[11] ? this.field10 : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.field11 = fieldSetFlags()[12] ? this.field11 : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.field12 = fieldSetFlags()[13] ? this.field12 : (java.lang.CharSequence) defaultValue(fields()[13]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field9 = fieldSetFlags()[10] ? this.field9 : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.field10 = fieldSetFlags()[11] ? this.field10 : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.field11 = fieldSetFlags()[12] ? this.field11 : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.field12 = fieldSetFlags()[13] ? this.field12 : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.field13 = fieldSetFlags()[14] ? this.field13 : (java.lang.CharSequence) defaultValue(fields()[14]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field10 = fieldSetFlags()[11] ? this.field10 : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.field11 = fieldSetFlags()[12] ? this.field11 : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.field12 = fieldSetFlags()[13] ? this.field12 : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.field13 = fieldSetFlags()[14] ? this.field13 : (java.lang.CharSequence) defaultValue(fields()[14]);
        record.field14 = fieldSetFlags()[15] ? this.field14 : (java.lang.CharSequence) defaultValue(fields()[15]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field11 = fieldSetFlags()[12] ? this.field11 : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.field12 = fieldSetFlags()[13] ? this.field12 : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.field13 = fieldSetFlags()[14] ? this.field13 : (java.lang.CharSequence) defaultValue(fields()[14]);
        record.field14 = fieldSetFlags()[15] ? this.field14 : (java.lang.CharSequence) defaultValue(fields()[15]);
        record.field15 = fieldSetFlags()[16] ? this.field15 : (java.lang.CharSequence) defaultValue(fields()[16]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field12 = fieldSetFlags()[13] ? this.field12 : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.field13 = fieldSetFlags()[14] ? this.field13 : (java.lang.CharSequence) defaultValue(fields()[14]);
        record.field14 = fieldSetFlags()[15] ? this.field14 : (java.lang.CharSequence) defaultValue(fields()[15]);
        record.field15 = fieldSetFlags()[16] ? this.field15 : (java.lang.CharSequence) defaultValue(fields()[16]);
        record.field16 = fieldSetFlags()[17] ? this.field16 : (java.lang.CharSequence) defaultValue(fields()[17]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field13 = fieldSetFlags()[14] ? this.field13 : (java.lang.CharSequence) defaultValue(fields()[14]);
        record.field14 = fieldSetFlags()[15] ? this.field14 : (java.lang.CharSequence) defaultValue(fields()[15]);
        record.field15 = fieldSetFlags()[16] ? this.field15 : (java.lang.CharSequence) defaultValue(fields()[16]);
        record.field16 = fieldSetFlags()[17] ? this.field16 : (java.lang.CharSequence) defaultValue(fields()[17]);
        record.field17 = fieldSetFlags()[18] ? this.field17 : (java.lang.CharSequence) defaultValue(fields()[18]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field14 = fieldSetFlags()[15] ? this.field14 : (java.lang.CharSequence) defaultValue(fields()[15]);
        record.field15 = fieldSetFlags()[16] ? this.field15 : (java.lang.CharSequence) defaultValue(fields()[16]);
        record.field16 = fieldSetFlags()[17] ? this.field16 : (java.lang.CharSequence) defaultValue(fields()[17]);
        record.field17 = fieldSetFlags()[18] ? this.field17 : (java.lang.CharSequence) defaultValue(fields()[18]);
        record.field18 = fieldSetFlags()[19] ? this.field18 : (java.lang.CharSequence) defaultValue(fields()[19]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field15 = fieldSetFlags()[16] ? this.field15 : (java.lang.CharSequence) defaultValue(fields()[16]);
        record.field16 = fieldSetFlags()[17] ? this.field16 : (java.lang.CharSequence) defaultValue(fields()[17]);
        record.field17 = fieldSetFlags()[18] ? this.field17 : (java.lang.CharSequence) defaultValue(fields()[18]);
        record.field18 = fieldSetFlags()[19] ? this.field18 : (java.lang.CharSequence) defaultValue(fields()[19]);
        record.field19 = fieldSetFlags()[20] ? this.field19 : (java.lang.CharSequence) defaultValue(fields()[20]);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field16 = fieldSetFlags()[17] ? this.field16 : (java.lang.CharSequence) defaultValue(fields()[17]);
        record.field17 = fieldSetFlags()[18] ? this.field17 : (java.lang.CharSequence) defaultValue(fields()[18]);
        record.field18 = fieldSetFlags()[19] ? this.field18 : (java.lang.CharSequence) defaultValue(fields()[19]);
        record.field19 = fieldSetFlags()[20] ? this.field19 : (java.lang.CharSequence) defaultValue(fields()[20]);
        return record;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        record.field17 = fieldSetFlags()[18] ? this.field17 : (java.lang.CharSequence) defaultValue(fields()[18]);
        record.field18 = fieldSetFlags()[19] ? this.field18 : (java.lang.CharSequence) defaultValue(fields()[19]);
        record.field19 = fieldSetFlags()[20] ? this.field19 : (java.lang.CharSequence) defaultValue(fields()[20]);
        return record;
      } catch (Exception e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField9Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field14' field */
    public org.apache.gora.benchmark.generated.User.Builder setField14(java.lang.CharSequence value) {
      validate(fields()[15], value);
      this.field14 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field14' field */
    public org.apache.gora.benchmark.generated.User.Builder setField14(java.lang.CharSequence value) {
      validate(fields()[15], value);
      this.field14 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField16(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField16(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID = -7912162892761759126L;
  /** Enum containing
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID = -7912162892761759126L;
  /** Enum containing
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field3' field */
    public java.lang.CharSequence getField3() {
      return field3;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field2' field.
   */
  public java.lang.CharSequence getField2() {
    return field2;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field11' field.
   */
  public java.lang.CharSequence getField11() {
    return field11;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField13(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField13(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field1' field.
         */
    public java.lang.CharSequence getField1() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField1() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field6' field.
   */
  public java.lang.CharSequence getField6() {
    return field6;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField11(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField11(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field10' field */
    public java.lang.CharSequence getField10() {
      return field10;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field7' field */
    public org.apache.gora.benchmark.generated.User.Builder setField7(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.field7 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field7' field */
    public org.apache.gora.benchmark.generated.User.Builder setField7(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.field7 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField8(java.lang.CharSequence value) {
    this.field8 = value;
    setDirty(9);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field10' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField10() {
      field10 = null;
      fieldSetFlags()[11] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField13Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field3' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField3() {
      field3 = null;
      fieldSetFlags()[4] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field7;
  private java.lang.CharSequence field8;
  private java.lang.CharSequence field9;
  private java.lang.CharSequence field10;
  private java.lang.CharSequence field11;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field9' field */
    public java.lang.CharSequence getField9() {
      return field9;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field8' field.
         */
    public java.lang.CharSequence getField8() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField8() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.benchmark.generated.User.SCHEMA$);
    }
    
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field8;
    private java.lang.CharSequence field9;
    private java.lang.CharSequence field10;
    private java.lang.CharSequence field11;
    private java.lang.CharSequence field12;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField7(java.lang.CharSequence value) {
    this.field7 = value;
    setDirty(8);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field1' field */
    public org.apache.gora.benchmark.generated.User.Builder setField1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.field1 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field1' field */
    public org.apache.gora.benchmark.generated.User.Builder setField1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.field1 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.userId = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: this.userId = (java.lang.CharSequence)(value); break;
    case 1: this.field0 = (java.lang.CharSequence)(value); break;
    case 2: this.field1 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    switch (field$) {
    case 0: this.userId = (java.lang.CharSequence)(value); break;
    case 1: this.field0 = (java.lang.CharSequence)(value); break;
    case 2: this.field1 = (java.lang.CharSequence)(value); break;
    case 3: this.field2 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 0: this.userId = (java.lang.CharSequence)(value); break;
    case 1: this.field0 = (java.lang.CharSequence)(value); break;
    case 2: this.field1 = (java.lang.CharSequence)(value); break;
    case 3: this.field2 = (java.lang.CharSequence)(value); break;
    case 4: this.field3 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 1: this.field0 = (java.lang.CharSequence)(value); break;
    case 2: this.field1 = (java.lang.CharSequence)(value); break;
    case 3: this.field2 = (java.lang.CharSequence)(value); break;
    case 4: this.field3 = (java.lang.CharSequence)(value); break;
    case 5: this.field4 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 2: this.field1 = (java.lang.CharSequence)(value); break;
    case 3: this.field2 = (java.lang.CharSequence)(value); break;
    case 4: this.field3 = (java.lang.CharSequence)(value); break;
    case 5: this.field4 = (java.lang.CharSequence)(value); break;
    case 6: this.field5 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 3: this.field2 = (java.lang.CharSequence)(value); break;
    case 4: this.field3 = (java.lang.CharSequence)(value); break;
    case 5: this.field4 = (java.lang.CharSequence)(value); break;
    case 6: this.field5 = (java.lang.CharSequence)(value); break;
    case 7: this.field6 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 4: this.field3 = (java.lang.CharSequence)(value); break;
    case 5: this.field4 = (java.lang.CharSequence)(value); break;
    case 6: this.field5 = (java.lang.CharSequence)(value); break;
    case 7: this.field6 = (java.lang.CharSequence)(value); break;
    case 8: this.field7 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 5: this.field4 = (java.lang.CharSequence)(value); break;
    case 6: this.field5 = (java.lang.CharSequence)(value); break;
    case 7: this.field6 = (java.lang.CharSequence)(value); break;
    case 8: this.field7 = (java.lang.CharSequence)(value); break;
    case 9: this.field8 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 6: this.field5 = (java.lang.CharSequence)(value); break;
    case 7: this.field6 = (java.lang.CharSequence)(value); break;
    case 8: this.field7 = (java.lang.CharSequence)(value); break;
    case 9: this.field8 = (java.lang.CharSequence)(value); break;
    case 10: this.field9 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 7: this.field6 = (java.lang.CharSequence)(value); break;
    case 8: this.field7 = (java.lang.CharSequence)(value); break;
    case 9: this.field8 = (java.lang.CharSequence)(value); break;
    case 10: this.field9 = (java.lang.CharSequence)(value); break;
    case 11: this.field10 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 8: this.field7 = (java.lang.CharSequence)(value); break;
    case 9: this.field8 = (java.lang.CharSequence)(value); break;
    case 10: this.field9 = (java.lang.CharSequence)(value); break;
    case 11: this.field10 = (java.lang.CharSequence)(value); break;
    case 12: this.field11 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 9: this.field8 = (java.lang.CharSequence)(value); break;
    case 10: this.field9 = (java.lang.CharSequence)(value); break;
    case 11: this.field10 = (java.lang.CharSequence)(value); break;
    case 12: this.field11 = (java.lang.CharSequence)(value); break;
    case 13: this.field12 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 10: this.field9 = (java.lang.CharSequence)(value); break;
    case 11: this.field10 = (java.lang.CharSequence)(value); break;
    case 12: this.field11 = (java.lang.CharSequence)(value); break;
    case 13: this.field12 = (java.lang.CharSequence)(value); break;
    case 14: this.field13 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 11: this.field10 = (java.lang.CharSequence)(value); break;
    case 12: this.field11 = (java.lang.CharSequence)(value); break;
    case 13: this.field12 = (java.lang.CharSequence)(value); break;
    case 14: this.field13 = (java.lang.CharSequence)(value); break;
    case 15: this.field14 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 12: this.field11 = (java.lang.CharSequence)(value); break;
    case 13: this.field12 = (java.lang.CharSequence)(value); break;
    case 14: this.field13 = (java.lang.CharSequence)(value); break;
    case 15: this.field14 = (java.lang.CharSequence)(value); break;
    case 16: this.field15 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 13: this.field12 = (java.lang.CharSequence)(value); break;
    case 14: this.field13 = (java.lang.CharSequence)(value); break;
    case 15: this.field14 = (java.lang.CharSequence)(value); break;
    case 16: this.field15 = (java.lang.CharSequence)(value); break;
    case 17: this.field16 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 14: this.field13 = (java.lang.CharSequence)(value); break;
    case 15: this.field14 = (java.lang.CharSequence)(value); break;
    case 16: this.field15 = (java.lang.CharSequence)(value); break;
    case 17: this.field16 = (java.lang.CharSequence)(value); break;
    case 18: this.field17 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 15: this.field14 = (java.lang.CharSequence)(value); break;
    case 16: this.field15 = (java.lang.CharSequence)(value); break;
    case 17: this.field16 = (java.lang.CharSequence)(value); break;
    case 18: this.field17 = (java.lang.CharSequence)(value); break;
    case 19: this.field18 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 16: this.field15 = (java.lang.CharSequence)(value); break;
    case 17: this.field16 = (java.lang.CharSequence)(value); break;
    case 18: this.field17 = (java.lang.CharSequence)(value); break;
    case 19: this.field18 = (java.lang.CharSequence)(value); break;
    case 20: this.field19 = (java.lang.CharSequence)(value); break;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 17: this.field16 = (java.lang.CharSequence)(value); break;
    case 18: this.field17 = (java.lang.CharSequence)(value); break;
    case 19: this.field18 = (java.lang.CharSequence)(value); break;
    case 20: this.field19 = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 18: this.field17 = (java.lang.CharSequence)(value); break;
    case 19: this.field18 = (java.lang.CharSequence)(value); break;
    case 20: this.field19 = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    case 19: this.field18 = (java.lang.CharSequence)(value); break;
    case 20: this.field19 = (java.lang.CharSequence)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField0Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField19(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField19(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField4(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField4(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field5' field */
    public org.apache.gora.benchmark.generated.User.Builder setField5(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.field5 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field5' field */
    public org.apache.gora.benchmark.generated.User.Builder setField5(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.field5 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField6(java.lang.CharSequence value) {
    this.field6 = value;
    setDirty(7);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField10Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField1(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField1(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field18' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField18() {
      field18 = null;
      fieldSetFlags()[19] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField9(java.lang.CharSequence value) {
    this.field9 = value;
    setDirty(10);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field5' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField5() {
      field5 = null;
      fieldSetFlags()[6] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field19' field */
    public org.apache.gora.benchmark.generated.User.Builder setField19(java.lang.CharSequence value) {
      validate(fields()[20], value);
      this.field19 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field19' field */
    public org.apache.gora.benchmark.generated.User.Builder setField19(java.lang.CharSequence value) {
      validate(fields()[20], value);
      this.field19 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field15' field.
         */
    public java.lang.CharSequence getField15() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField15() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field15' field */
    public org.apache.gora.benchmark.generated.User.Builder setField15(java.lang.CharSequence value) {
      validate(fields()[16], value);
      this.field15 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field15' field */
    public org.apache.gora.benchmark.generated.User.Builder setField15(java.lang.CharSequence value) {
      validate(fields()[16], value);
      this.field15 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field17' field.
         */
    public java.lang.CharSequence getField17() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField17() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field12' field */
    public org.apache.gora.benchmark.generated.User.Builder setField12(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.field12 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field12' field */
    public org.apache.gora.benchmark.generated.User.Builder setField12(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.field12 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField16Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field5' field */
    public java.lang.CharSequence getField5() {
      return field5;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field0;
    private java.lang.CharSequence field1;
    private java.lang.CharSequence field2;
    private java.lang.CharSequence field3;
    private java.lang.CharSequence field4;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField11(java.lang.CharSequence value) {
    this.field11 = value;
    setDirty(12);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   */
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  @Override
  public void readExternal(java.io.ObjectInput in)
          throws java.io.IOException {
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    byte[] __g__dirty = new byte[getFieldsCount()];
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    in.read(__g__dirty);
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    super.setDirtyBytes(java.nio.ByteBuffer.wrap(__g__dirty));
    DATUM_READER$.read(this, org.apache.avro.io.DecoderFactory.get()
            .directBinaryDecoder((java.io.InputStream) in,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field8' field */
    public java.lang.CharSequence getField8() {
      return field8;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field4' field */
    public java.lang.CharSequence getField4() {
      return field4;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field3' field.
   */
  public java.lang.CharSequence getField3() {
    return field3;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field10' field.
         */
    public java.lang.CharSequence getField10() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField10() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field11;
  private java.lang.CharSequence field12;
  private java.lang.CharSequence field13;
  private java.lang.CharSequence field14;
  private java.lang.CharSequence field15;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private static final org.apache.avro.io.DatumWriter
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
            DATUM_WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
  private static final org.apache.avro.io.DatumReader
            DATUM_READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field7' field.
         */
    public java.lang.CharSequence getField7() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField7() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field17' field */
    public org.apache.gora.benchmark.generated.User.Builder setField17(java.lang.CharSequence value) {
      validate(fields()[18], value);
      this.field17 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field17' field */
    public org.apache.gora.benchmark.generated.User.Builder setField17(java.lang.CharSequence value) {
      validate(fields()[18], value);
      this.field17 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field4' field */
    public org.apache.gora.benchmark.generated.User.Builder setField4(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.field4 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field4' field */
    public org.apache.gora.benchmark.generated.User.Builder setField4(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.field4 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField0(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField0(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field3' field */
    public org.apache.gora.benchmark.generated.User.Builder setField3(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.field3 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field3' field */
    public org.apache.gora.benchmark.generated.User.Builder setField3(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.field3 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field6' field */
    public org.apache.gora.benchmark.generated.User.Builder setField6(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.field6 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field6' field */
    public org.apache.gora.benchmark.generated.User.Builder setField6(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.field6 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field11' field */
    public org.apache.gora.benchmark.generated.User.Builder setField11(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.field11 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field11' field */
    public org.apache.gora.benchmark.generated.User.Builder setField11(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.field11 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field4' field.
   */
  public java.lang.CharSequence getField4() {
    return field4;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
   * @throws InstantiationException 
   * @throws NoSuchElementException 
   * @throws java.io.IOException 
   * @throws java.lang.NoSuchMethodException 
   * @throws java.lang.reflect.InvocationTargetException 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
   * @throws NoSuchElementException 
   * @throws java.io.IOException 
   * @throws java.lang.NoSuchMethodException 
   * @throws java.lang.reflect.InvocationTargetException 
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `gora-goraci/src/main/java/org/apache/gora/goraci/rackspace/RackspaceOrchestration.java`
#### Snippet
```java
   * @throws java.io.IOException 
   * @throws java.lang.NoSuchMethodException 
   * @throws java.lang.reflect.InvocationTargetException 
   */
  public static void main(String[] args) throws NoSuchElementException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   */
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  @Override
  public void writeExternal(java.io.ObjectOutput out)
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
          throws java.io.IOException {
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    out.write(super.getDirtyBytes().array());
    DATUM_WRITER$.write(this, org.apache.avro.io.EncoderFactory.get()
            .directBinaryEncoder((java.io.OutputStream) out,
                    null));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

    private java.lang.CharSequence userId;
    private java.lang.CharSequence field0;
    private java.lang.CharSequence field1;
    private java.lang.CharSequence field2;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField3(java.lang.CharSequence value) {
    this.field3 = value;
    setDirty(4);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField1(java.lang.CharSequence value) {
    this.field1 = value;
    setDirty(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField16(java.lang.CharSequence value) {
    this.field16 = value;
    setDirty(17);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field9' field.
   */
  public java.lang.CharSequence getField9() {
    return field9;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field16' field.
   */
  public java.lang.CharSequence getField16() {
    return field16;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

  private java.lang.CharSequence userId;
  private java.lang.CharSequence field0;
  private java.lang.CharSequence field1;
  private java.lang.CharSequence field2;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field6;
    private java.lang.CharSequence field7;
    private java.lang.CharSequence field8;
    private java.lang.CharSequence field9;
    private java.lang.CharSequence field10;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field15;
  private java.lang.CharSequence field16;
  private java.lang.CharSequence field17;
  private java.lang.CharSequence field18;
  private java.lang.CharSequence field19;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field16' field */
    public java.lang.CharSequence getField16() {
      return field16;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField12(java.lang.CharSequence value) {
    this.field12 = value;
    setDirty(13);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField17(java.lang.CharSequence value) {
    this.field17 = value;
    setDirty(18);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field13' field.
         */
    public java.lang.CharSequence getField13() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField13() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field16' field.
         */
    public java.lang.CharSequence getField16() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField16() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField14(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField14(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField3(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField3(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field7' field.
   */
  public java.lang.CharSequence getField7() {
    return field7;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency.impl` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
package org.apache.gora.benchmark.generated;  

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro.specific` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
package org.apache.gora.benchmark.generated;  

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.persistency` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
package org.apache.gora.benchmark.generated;  

public class User extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.apache.gora.benchmark.generated\",\"fields\":[{\"name\":\"userId\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field0\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field1\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field2\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field3\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field4\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field5\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field6\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field7\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field8\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field9\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field10\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field11\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field12\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field13\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field14\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field15\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field16\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field17\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field18\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"field19\",\"type\":\"string\",\"default\":\"null\"}]}");
  private static final long serialVersionUID
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field18' field.
         */
    public java.lang.CharSequence getField18() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField18() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field14' field.
   */
  public java.lang.CharSequence getField14() {
    return field14;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field1' field.
   */
  public java.lang.CharSequence getField1() {
    return field1;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField11Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field15' field */
    public java.lang.CharSequence getField15() {
      return field15;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField5Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field0' field.
         */
    public java.lang.CharSequence getField0() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField0() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField14(java.lang.CharSequence value) {
    this.field14 = value;
    setDirty(15);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field15' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField15() {
      field15 = null;
      fieldSetFlags()[16] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field16;
    private java.lang.CharSequence field17;
    private java.lang.CharSequence field18;
    private java.lang.CharSequence field19;

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field12;
  private java.lang.CharSequence field13;
  private java.lang.CharSequence field14;
  private java.lang.CharSequence field15;
  private java.lang.CharSequence field16;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field13;
  private java.lang.CharSequence field14;
  private java.lang.CharSequence field15;
  private java.lang.CharSequence field16;
  private java.lang.CharSequence field17;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField9(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField9(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field2' field.
         */
    public java.lang.CharSequence getField2() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField2() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField10(java.lang.CharSequence value) {
    this.field10 = value;
    setDirty(11);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field11' field */
    public java.lang.CharSequence getField11() {
      return field11;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field17' field.
   */
  public java.lang.CharSequence getField17() {
    return field17;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field3;
  private java.lang.CharSequence field4;
  private java.lang.CharSequence field5;
  private java.lang.CharSequence field6;
  private java.lang.CharSequence field7;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field9' field.
         */
    public java.lang.CharSequence getField9() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField9() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField19Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field13;
    private java.lang.CharSequence field14;
    private java.lang.CharSequence field15;
    private java.lang.CharSequence field16;
    private java.lang.CharSequence field17;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field2' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField2() {
      field2 = null;
      fieldSetFlags()[3] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField7Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  @Override
  public org.apache.gora.benchmark.generated.User clone() {
    return newBuilder(this).build();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField0(java.lang.CharSequence value) {
    this.field0 = value;
    setDirty(1);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence userId;
    private java.lang.CharSequence field0;
    private java.lang.CharSequence field1;
    private java.lang.CharSequence field2;
    private java.lang.CharSequence field3;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary, and can be replaced with an import
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field18;
  private java.lang.CharSequence field19;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field10' field */
    public org.apache.gora.benchmark.generated.User.Builder setField10(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.field10 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field10' field */
    public org.apache.gora.benchmark.generated.User.Builder setField10(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.field10 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field11;
    private java.lang.CharSequence field12;
    private java.lang.CharSequence field13;
    private java.lang.CharSequence field14;
    private java.lang.CharSequence field15;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field3;
    private java.lang.CharSequence field4;
    private java.lang.CharSequence field5;
    private java.lang.CharSequence field6;
    private java.lang.CharSequence field7;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field2' field */
    public org.apache.gora.benchmark.generated.User.Builder setField2(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.field2 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field2' field */
    public org.apache.gora.benchmark.generated.User.Builder setField2(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.field2 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field13' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField13() {
      field13 = null;
      fieldSetFlags()[14] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field10;
    private java.lang.CharSequence field11;
    private java.lang.CharSequence field12;
    private java.lang.CharSequence field13;
    private java.lang.CharSequence field14;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field4' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField4() {
      field4 = null;
      fieldSetFlags()[5] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField1Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field8' field */
    public org.apache.gora.benchmark.generated.User.Builder setField8(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.field8 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field8' field */
    public org.apache.gora.benchmark.generated.User.Builder setField8(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.field8 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field17;
    private java.lang.CharSequence field18;
    private java.lang.CharSequence field19;

    /** Creates a new Builder */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field8' field.
   */
  public java.lang.CharSequence getField8() {
    return field8;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field9' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField9() {
      field9 = null;
      fieldSetFlags()[10] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField2(java.lang.CharSequence value) {
    this.field2 = value;
    setDirty(3);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField15(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField15(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field19' field */
    public java.lang.CharSequence getField19() {
      return field19;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field13' field */
    public java.lang.CharSequence getField13() {
      return field13;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field12;
    private java.lang.CharSequence field13;
    private java.lang.CharSequence field14;
    private java.lang.CharSequence field15;
    private java.lang.CharSequence field16;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField12Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field6' field.
         */
    public java.lang.CharSequence getField6() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField6() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField4Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

    /** Gets the value of the 'userId' field */
    public java.lang.CharSequence getUserId() {
      return userId;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field3' field.
         */
    public java.lang.CharSequence getField3() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField3() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field19' field.
         */
    public java.lang.CharSequence getField19() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField19() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field14' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField14() {
      field14 = null;
      fieldSetFlags()[15] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField13(java.lang.CharSequence value) {
    this.field13 = value;
    setDirty(14);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field18' field */
    public org.apache.gora.benchmark.generated.User.Builder setField18(java.lang.CharSequence value) {
      validate(fields()[19], value);
      this.field18 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field18' field */
    public org.apache.gora.benchmark.generated.User.Builder setField18(java.lang.CharSequence value) {
      validate(fields()[19], value);
      this.field18 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field0' field */
    public org.apache.gora.benchmark.generated.User.Builder setField0(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.field0 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field0' field */
    public org.apache.gora.benchmark.generated.User.Builder setField0(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.field0 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field4;
    private java.lang.CharSequence field5;
    private java.lang.CharSequence field6;
    private java.lang.CharSequence field7;
    private java.lang.CharSequence field8;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field9;
    private java.lang.CharSequence field10;
    private java.lang.CharSequence field11;
    private java.lang.CharSequence field12;
    private java.lang.CharSequence field13;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field17;
  private java.lang.CharSequence field18;
  private java.lang.CharSequence field19;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.userId = value;
    setDirty(0);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field15' field.
   */
  public java.lang.CharSequence getField15() {
    return field15;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field19' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField19() {
      field19 = null;
      fieldSetFlags()[20] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField17(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField17(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setField6(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setField6(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * @param value the value to set.
   */
  public void setField5(java.lang.CharSequence value) {
    this.field5 = value;
    setDirty(6);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field0' field.
   */
  public java.lang.CharSequence getField0() {
    return field0;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field14' field */
    public java.lang.CharSequence getField14() {
      return field14;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java

  /** Creates a new User RecordBuilder */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder() {
    return new org.apache.gora.benchmark.generated.User.Builder();
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  /** Creates a new User RecordBuilder */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder() {
    return new org.apache.gora.benchmark.generated.User.Builder();
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field4' field.
         */
    public java.lang.CharSequence getField4() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField4() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField6Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field0' field */
    public java.lang.CharSequence getField0() {
      return field0;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field8' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField8() {
      field8 = null;
      fieldSetFlags()[9] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(org.apache.gora.benchmark.generated.User other) {
            super(org.apache.gora.benchmark.generated.User.SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    /** Creates a Builder by copying an existing User instance */
    private Builder(org.apache.gora.benchmark.generated.User other) {
            super(org.apache.gora.benchmark.generated.User.SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.userId);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
            super(org.apache.gora.benchmark.generated.User.SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[1], other.field0)) {
        this.field0 = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.field0);
        fieldSetFlags()[1] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[2], other.field1)) {
        this.field1 = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.field1);
        fieldSetFlags()[2] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[3], other.field2)) {
        this.field2 = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.field2);
        fieldSetFlags()[3] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[4], other.field3)) {
        this.field3 = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.field3);
        fieldSetFlags()[4] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[5], other.field4)) {
        this.field4 = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.field4);
        fieldSetFlags()[5] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[6], other.field5)) {
        this.field5 = (java.lang.CharSequence) data().deepCopy(fields()[6].schema(), other.field5);
        fieldSetFlags()[6] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[7], other.field6)) {
        this.field6 = (java.lang.CharSequence) data().deepCopy(fields()[7].schema(), other.field6);
        fieldSetFlags()[7] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[8], other.field7)) {
        this.field7 = (java.lang.CharSequence) data().deepCopy(fields()[8].schema(), other.field7);
        fieldSetFlags()[8] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[9], other.field8)) {
        this.field8 = (java.lang.CharSequence) data().deepCopy(fields()[9].schema(), other.field8);
        fieldSetFlags()[9] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[10], other.field9)) {
        this.field9 = (java.lang.CharSequence) data().deepCopy(fields()[10].schema(), other.field9);
        fieldSetFlags()[10] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[11], other.field10)) {
        this.field10 = (java.lang.CharSequence) data().deepCopy(fields()[11].schema(), other.field10);
        fieldSetFlags()[11] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[12], other.field11)) {
        this.field11 = (java.lang.CharSequence) data().deepCopy(fields()[12].schema(), other.field11);
        fieldSetFlags()[12] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[13], other.field12)) {
        this.field12 = (java.lang.CharSequence) data().deepCopy(fields()[13].schema(), other.field12);
        fieldSetFlags()[13] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[14], other.field13)) {
        this.field13 = (java.lang.CharSequence) data().deepCopy(fields()[14].schema(), other.field13);
        fieldSetFlags()[14] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[15], other.field14)) {
        this.field14 = (java.lang.CharSequence) data().deepCopy(fields()[15].schema(), other.field14);
        fieldSetFlags()[15] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[16], other.field15)) {
        this.field15 = (java.lang.CharSequence) data().deepCopy(fields()[16].schema(), other.field15);
        fieldSetFlags()[16] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[17], other.field16)) {
        this.field16 = (java.lang.CharSequence) data().deepCopy(fields()[17].schema(), other.field16);
        fieldSetFlags()[17] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[18], other.field17)) {
        this.field17 = (java.lang.CharSequence) data().deepCopy(fields()[18].schema(), other.field17);
        fieldSetFlags()[18] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[19], other.field18)) {
        this.field18 = (java.lang.CharSequence) data().deepCopy(fields()[19].schema(), other.field18);
        fieldSetFlags()[19] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
      }
      if (isValidValue(fields()[20], other.field19)) {
        this.field19 = (java.lang.CharSequence) data().deepCopy(fields()[20].schema(), other.field19);
        fieldSetFlags()[20] = true;
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field13' field.
   */
  public java.lang.CharSequence getField13() {
    return field13;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField14Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField17Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field18' field.
   */
  public java.lang.CharSequence getField18() {
    return field18;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field12' field.
   */
  public java.lang.CharSequence getField12() {
    return field12;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field7' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField7() {
      field7 = null;
      fieldSetFlags()[8] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field4;
  private java.lang.CharSequence field5;
  private java.lang.CharSequence field6;
  private java.lang.CharSequence field7;
  private java.lang.CharSequence field8;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field17' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField17() {
      field17 = null;
      fieldSetFlags()[18] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field11' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField11() {
      field11 = null;
      fieldSetFlags()[12] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field6' field */
    public java.lang.CharSequence getField6() {
      return field6;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         * @param value the value to set.
     */
    public void setUserId(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public void setUserId(java.lang.CharSequence value) {
      throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
    }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User.Builder other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User.Builder other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static org.apache.gora.benchmark.generated.User.Builder newBuilder(org.apache.gora.benchmark.generated.User.Builder other) {
    return new org.apache.gora.benchmark.generated.User.Builder(other);
  }
  
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field15;
    private java.lang.CharSequence field16;
    private java.lang.CharSequence field17;
    private java.lang.CharSequence field18;
    private java.lang.CharSequence field19;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field13' field */
    public org.apache.gora.benchmark.generated.User.Builder setField13(java.lang.CharSequence value) {
      validate(fields()[14], value);
      this.field13 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field13' field */
    public org.apache.gora.benchmark.generated.User.Builder setField13(java.lang.CharSequence value) {
      validate(fields()[14], value);
      this.field13 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    private java.lang.CharSequence field14;
    private java.lang.CharSequence field15;
    private java.lang.CharSequence field16;
    private java.lang.CharSequence field17;
    private java.lang.CharSequence field18;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field9' field */
    public org.apache.gora.benchmark.generated.User.Builder setField9(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.field9 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Sets the value of the 'field9' field */
    public org.apache.gora.benchmark.generated.User.Builder setField9(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.field9 = value;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'userId' field.
         */
    public java.lang.CharSequence getUserId() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getUserId() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field14;
  private java.lang.CharSequence field15;
  private java.lang.CharSequence field16;
  private java.lang.CharSequence field17;
  private java.lang.CharSequence field18;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.benchmark.generated.User.Builder other) {
      super(other);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isUserIdDirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.benchmark.generated` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Clears the value of the 'field12' field */
    public org.apache.gora.benchmark.generated.User.Builder clearField12() {
      field12 = null;
      fieldSetFlags()[13] = false;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field14' field.
         */
    public java.lang.CharSequence getField14() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField14() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
   * Gets the value of the 'field5' field.
   */
  public java.lang.CharSequence getField5() {
    return field5;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Gets the value of the 'field18' field */
    public java.lang.CharSequence getField18() {
      return field18;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     * Gets the value of the 'field5' field.
         */
    public java.lang.CharSequence getField5() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
         */
    public java.lang.CharSequence getField5() {
      throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField3Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
     */
    public boolean isField2Dirty() {
      throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field16;
  private java.lang.CharSequence field17;
  private java.lang.CharSequence field18;
  private java.lang.CharSequence field19;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
  private java.lang.CharSequence field2;
  private java.lang.CharSequence field3;
  private java.lang.CharSequence field4;
  private java.lang.CharSequence field5;
  private java.lang.CharSequence field6;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-accumulo/src/main/java/org/apache/gora/accumulo/store/AccumuloStore.java`
#### Snippet
```java
   * Initialize the data store by reading the credentials, setting the client's properties up and
   * reading the mapping file. Initialize is called when then the call to
   * {@link org.apache.gora.store.DataStoreFactory#createDataStore} is made.
   *
   * @param keyClass
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java

    // populate the doc
    List<org.apache.avro.Schema.Field> fields = schema.getFields();
    for (org.apache.avro.Schema.Field field : fields) {
      if (!persistent.isDirty(field.name())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java
    // populate the doc
    List<org.apache.avro.Schema.Field> fields = schema.getFields();
    for (org.apache.avro.Schema.Field field : fields) {
      if (!persistent.isDirty(field.name())) {
        continue;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.lucene.store` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.lucene.store.LuceneStore} is the primary class
 * responsible for GORA CRUD operations on Lucene.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.avro` is unnecessary and can be removed
in `gora-lucene/src/main/java/org/apache/gora/lucene/store/LuceneStore.java`
#### Snippet
```java

    for (String f : fields) {
      org.apache.avro.Schema.Field field = fieldMap.get(f);
      String sf;
      if (pk.equals(f)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.hive.store` is unnecessary and can be removed
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveMappingBuilder.java`
#### Snippet
```java
   *
   * @param filename path of the mapping file
   * @return {@link org.apache.gora.hive.store.HiveMapping} hive mappings
   * @throws GoraException exception in reading mappings
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.metamodel.jdbc` is unnecessary and can be removed
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
   * Return jdbc data context assigned to the current thread.
   *
   * @return {@link org.apache.metamodel.jdbc.JdbcDataContext} Jdbc data context
   */
  public JdbcDataContext getDataContext() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.metamodel` is unnecessary and can be removed
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
/**
 * Thread safe implementation to query on hive data context This implements all methods of
 * {@link org.apache.metamodel.DataContext} and {@link org.apache.metamodel.UpdateableDataContext}
 * and methods to establish a HiveConnection and execute row hive sql strings on that connection
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.metamodel` is unnecessary and can be removed
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveDataContext.java`
#### Snippet
```java
/**
 * Thread safe implementation to query on hive data context This implements all methods of
 * {@link org.apache.metamodel.DataContext} and {@link org.apache.metamodel.UpdateableDataContext}
 * and methods to establish a HiveConnection and execute row hive sql strings on that connection
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.metamodel.data` is unnecessary and can be removed
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
   * Read a resulted row object and parse it to a persistent object
   *
   * @param row {@link org.apache.metamodel.data.Row} Resulted row object
   * @return Persistent object
   * @throws GoraException throws if reading of data is failed
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.metamodel.schema` is unnecessary, and can be replaced with an import
in `gora-hive/src/main/java/org/apache/gora/hive/store/HiveStore.java`
#### Snippet
```java
      return schemaTable;
    }
    org.apache.metamodel.schema.Schema schema = dataContext
        .getSchemaByName(hiveStoreParameters.getDatabaseName());
    if (schema == null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary and can be removed
in `gora-kudu/src/main/java/org/apache/gora/kudu/mapping/KuduMappingBuilder.java`
#### Snippet
```java
   *
   * @param inputStream Mapping input stream
   * @throws org.apache.gora.util.GoraException Error reading mapping file
   */
  public void readMappingFile(InputStream inputStream) throws GoraException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.infinispan.avro.hotrod` is unnecessary, and can be replaced with an import
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanClient.java`
#### Snippet
```java

    cache = cacheManager.getCache(persistentClass.getSimpleName());
    qf = org.infinispan.avro.hotrod.Search.getQueryFactory(cache);
    createSchema();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.infinispan.store` is unnecessary and can be removed
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java

/**
 * {@link org.apache.gora.infinispan.store.InfinispanStore} is the primary class
 * responsible for directing Gora CRUD operations to Infinispan.This class delegate
 * most operations, e.g., initialization, creation and deletion to (Infinispan caches),
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.infinispan.store` is unnecessary and can be removed
in `gora-infinispan/src/main/java/org/apache/gora/infinispan/store/InfinispanStore.java`
#### Snippet
```java
 * responsible for directing Gora CRUD operations to Infinispan.This class delegate
 * most operations, e.g., initialization, creation and deletion to (Infinispan caches),
 * via {@link org.apache.gora.infinispan.store.InfinispanClient}.
 *
 * To specify the Infinispan deployment, include parameter <i>infinispan.connectionstring</i>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseStore.java`
#### Snippet
```java
   * Initialize the data store by reading the credentials, setting the client's properties up and
   * reading the mapping file. Initialize is called when then the call to
   * {@link org.apache.gora.store.DataStoreFactory#createDataStore} is made.
   *
   * The mapping can be passed as a configuration parameter 'gora.mapping' or taken from
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/query/RedisResult.java`
#### Snippet
```java
   *
   * @return true if another result exists
   * @throws java.io.IOException if for some reason we reach a result which does
   * not exist
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/query/RedisResult.java`
#### Snippet
```java
   *
   * @return a float value representing progress of the job
   * @throws java.io.IOException if there is an error obtaining progress
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBStore.java`
#### Snippet
```java
   * Initialize the data store by reading the credentials, setting the client's properties up and
   * reading the mapping file. Initialize is called when then the call to
   * {@link org.apache.gora.store.DataStoreFactory#createDataStore} is made.
   *
   * @param keyClass
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java
   * Initialize the data store by reading the credentials, setting the client's properties up and
   * reading the mapping file. Initialize is called when then the call to
   * {@link org.apache.gora.store.DataStoreFactory#createDataStore} is made.
   *
   * @param keyClass
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.solr.store` is unnecessary and can be removed
in `gora-solr/src/main/java/org/apache/gora/solr/store/SolrStore.java`
#### Snippet
```java

  /** The maximum number of result to return when we make a call to 
   * {@link org.apache.gora.solr.store.SolrStore#execute(Query)}. This should be 
   * defined in <code>gora.properties</code>. This value must be of type <b>Integer</b>.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.ektorp.impl` is unnecessary and can be removed
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/util/CouchDBObjectMapperFactory.java`
#### Snippet
```java

/**
 * This class is implemantation of {@link org.ektorp.impl.ObjectMapperFactory}.
 * Created a object mapper instance.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.couchdb.store` is unnecessary and can be removed
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBMappingBuilder.java`
#### Snippet
```java

  /**
   * Load the {@link org.apache.gora.couchdb.store.CouchDBMapping} from a file
   * passed in parameter.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBMappingBuilder.java`
#### Snippet
```java
   *
   * @param filename path to the file holding the mapping
   * @throws java.io.IOException
   */
  protected void readMapping(String filename) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
   * @param persistent Persistent object
   * @return Deserialized object
   * @throws java.io.IOException Deserialization exception
   */
  @SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
   * @param persistent Persistent object
   * @return Deserialized object
   * @throws java.io.IOException Deserialization exception
   */
  @SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/util/DatumHandler.java`
#### Snippet
```java
   * @param persistent Persistent object
   * @return Deserialized object
   * @throws java.io.IOException Deserialization exception
   */
  @SuppressWarnings("unchecked")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.store` is unnecessary and can be removed
in `gora-couchdb/src/main/java/org/apache/gora/couchdb/store/CouchDBStore.java`
#### Snippet
```java
   * Initialize the data store by reading the credentials, setting the client's properties up and
   * reading the mapping file. Initialize is called when then the call to
   * {@link org.apache.gora.store.DataStoreFactory#createDataStore} is made.
   *
   * @param keyClass
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
   *
   * @return true
   * @throws org.apache.gora.util.GoraException Unexpected exception.
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
   * @param persistentClass Persistent class
   * @param properties Configurations for the data store
   * @throws org.apache.gora.util.GoraException Unexpected exception during initialization
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
   * on the fly. Thus, schema operations are unavailable in gora-redis module.
   *
   * @throws org.apache.gora.util.GoraException Unexpected exception.
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.gora.util` is unnecessary and can be removed
in `gora-redis/src/main/java/org/apache/gora/redis/store/RedisStore.java`
#### Snippet
```java
   * @param query Query sent to Redis
   * @return Query result
   * @throws org.apache.gora.util.GoraException  Unexpected exception in querying process.
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `gora-elasticsearch/src/main/java/org/apache/gora/elasticsearch/store/ElasticsearchStore.java`
#### Snippet
```java
          LOG.trace("{} = {}", XML_MAPPING_DEFINITION, properties.getProperty(XML_MAPPING_DEFINITION));
        }
        mappingStream = org.apache.commons.io.IOUtils.toInputStream(properties.getProperty(XML_MAPPING_DEFINITION), (Charset) null);
      } else {
        mappingStream = getClass().getClassLoader().getResourceAsStream(properties.getProperty(PARSE_MAPPING_FILE_KEY, DEFAULT_MAPPING_FILE));
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `gora-hbase/src/main/java/org/apache/gora/hbase/store/HBaseMapping.java`
#### Snippet
```java
      Map<String, ColumnFamilyDescriptor> families;
      families = tableToFamilies.get(tableName);
      if (families == null) {
        families = new HashMap<>();
        tableToFamilies.put(tableName, families);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
    private Map<String, String> getOrCreateTable(String tableName) {
      Map<String, String> items = tablesToItems.get(tableName);
      if (items == null) {
        items = new HashMap<String, String>();
        tablesToItems.put(tableName, items);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `gora-dynamodb/src/main/java/org/apache/gora/dynamodb/store/DynamoDBMapping.java`
#### Snippet
```java
    public void setKeySchema(String tableName, String keyName, String keyType) {
      ArrayList<KeySchemaElement> kSchema = tablesToKeySchemas.get(tableName);
      if (kSchema == null) {
        kSchema = new ArrayList<KeySchemaElement>();
        tablesToKeySchemas.put(tableName, kSchema);
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Function2() can be replaced with lambda
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsSpark.java`
#### Snippet
```java
     * reduce function used in calculation
     */
  private static Function2<Long, Long, Long> redFunc = new Function2<Long, Long, Long>() {
    @Override
    public Long call(Long aLong, Long aLong2) throws Exception {
```

### Convert2Lambda
Anonymous new Function, Long\>\>() can be replaced with lambda
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsSpark.java`
#### Snippet
```java
   * map function used in calculation
   */
  private static Function<Pageview, Tuple2<Tuple2<String, Long>, Long>> mapFunc = new Function<Pageview, Tuple2<Tuple2<String, Long>, Long>>() {
    @Override
    public Tuple2<Tuple2<String, Long>, Long> call(Pageview pageview)
```

### Convert2Lambda
Anonymous new PairFunction, Long\>, String, MetricDatum\>() can be replaced with lambda
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/LogAnalyticsSpark.java`
#### Snippet
```java
     * metric function used after map phase
     */
  private static PairFunction<Tuple2<Tuple2<String, Long>, Long>, String, MetricDatum> metricFunc = new PairFunction<Tuple2<Tuple2<String, Long>, Long>, String, MetricDatum>() {
    @Override
    public Tuple2<String, MetricDatum> call(
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'metricDimension', 'timestamp' and 'metric'
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/MetricDatum.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.tutorial.log.generated.MetricDatum.Builder other) {
      super(other);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy 8 fields
in `gora-tutorial/src/main/java/org/apache/gora/tutorial/log/generated/Pageview.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.tutorial.log.generated.Pageview.Builder other) {
      super(other);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'count'
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/Flushed.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.goraci.generated.Flushed.Builder other) {
      super(other);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy fields 'prev', 'client' and 'count'
in `gora-goraci/src/main/java/org/apache/gora/goraci/generated/CINode.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.goraci.generated.CINode.Builder other) {
      super(other);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy 21 fields
in `gora-benchmark/src/main/java/org/apache/gora/benchmark/generated/User.java`
#### Snippet
```java
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.benchmark.generated.User.Builder other) {
      super(other);
    }
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/ws/impl/PersistentWSBase.java`
#### Snippet
```java
   * Determines if an object is equal to this class
   */
  public boolean equals(Object o) {
    if (this == o) return true;
    // TODO we should check if the object has schema or not
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/Tombstones.java`
#### Snippet
```java
    }

    public boolean equals(Object o) {
      return DELEGATE.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/Tombstones.java`
#### Snippet
```java
    }

    public boolean equals(Object o) {
      return DELEGATE.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyCollectionWrapper.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    return delegate.equals(o);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java

  @Override
  public boolean equals(Object o) {
    return delegate.equals(o);
  }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `gora-core/src/main/java/org/apache/gora/persistency/impl/DirtyMapWrapper.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
      return entryDelegate.equals(o);
    }
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'pigArrayElement' to 'Tuple'
in `gora-pig/src/main/java/org/apache/gora/pig/GoraStorage.java`
#### Snippet
```java
          } else {
            // Every bag has a tuple as element type. Since this is not a record, that "tuple" container must be ignored
            persistentArray.add(this.writeField(avroSchema.getElementType(), pigField.getSchema().getFields()[0].getSchema().getFields()[0], ((Tuple)pigArrayElement).get(0))) ;
          }
        }
```

